package com.tt.miniapp.dec;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import java.io.InputStream;

final class Decode {
    static final int[] BLOCK_LENGTH_N_BITS = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    static final int[] BLOCK_LENGTH_OFFSET = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, SmEvents.EVENT_RE, SmEvents.EVENT_UA_ERROR, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    private static final int[] CODE_LENGTH_CODE_ORDER = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    static final int[] COPY_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    static final int[] COPY_LENGTH_OFFSET = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, 2118};
    static final int[] COPY_RANGE_LUT = {0, 8, 0, 8, 16, 0, 16, 8, 16};
    static final int[] DICTIONARY_OFFSETS_BY_LENGTH = {0, 0, 0, 0, 0, 4096, 9216, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};
    static final int[] DICTIONARY_SIZE_BITS_BY_LENGTH = {0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};
    private static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] FIXED_TABLE = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};
    static final int[] INSERT_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    static final int[] INSERT_LENGTH_OFFSET = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594};
    static final int[] INSERT_RANGE_LUT = {0, 0, 8, 8, 0, 16, 8, 16, 16};

    Decode() {
    }

    private static int calculateFence(State state) {
        int i = state.ringBufferSize;
        if (state.isEager != 0) {
            return Math.min(i, (state.ringBufferBytesWritten + state.outputLength) - state.outputUsed);
        }
        return i;
    }

    private static void decodeCommandBlockSwitch(State state) {
        state.commandBlockLength = decodeBlockTypeAndLength(state, 1, state.numCommandBlockTypes);
        state.treeCommandOffset = state.hGroup1[state.rings[7]];
    }

    private static void decodeDistanceBlockSwitch(State state) {
        state.distanceBlockLength = decodeBlockTypeAndLength(state, 2, state.numDistanceBlockTypes);
        state.distContextMapSlice = state.rings[9] << 2;
    }

    private static int decodeVarLenUnsignedByte(State state) {
        BitReader.fillBitWindow(state);
        if (BitReader.readFewBits(state, 1) == 0) {
            return 0;
        }
        int readFewBits = BitReader.readFewBits(state, 3);
        if (readFewBits == 0) {
            return 1;
        }
        return BitReader.readFewBits(state, readFewBits) + (1 << readFewBits);
    }

    static void close(State state) throws IOException {
        if (state.runningState == 0) {
            throw new IllegalStateException("State MUST be initialized");
        } else if (state.runningState != 10) {
            state.runningState = 10;
            if (state.input != null) {
                Utils.closeInput(state.input);
                state.input = null;
            }
        }
    }

    private static void copyUncompressedData(State state) {
        byte[] bArr = state.ringBuffer;
        if (state.metaBlockLength <= 0) {
            BitReader.reload(state);
            state.runningState = 1;
            return;
        }
        int min = Math.min(state.ringBufferSize - state.pos, state.metaBlockLength);
        BitReader.copyBytes(state, bArr, state.pos, min);
        state.metaBlockLength -= min;
        state.pos += min;
        if (state.pos == state.ringBufferSize) {
            state.nextRunningState = 5;
            state.runningState = 11;
            return;
        }
        BitReader.reload(state);
        state.runningState = 1;
    }

    private static void decodeLiteralBlockSwitch(State state) {
        state.literalBlockLength = decodeBlockTypeAndLength(state, 0, state.numLiteralBlockTypes);
        int i = state.rings[5];
        state.contextMapSlice = i << 6;
        state.literalTreeIndex = state.contextMap[state.contextMapSlice] & 255;
        state.literalTree = state.hGroup0[state.literalTreeIndex];
        state.contextLookupOffset1 = state.contextModes[i] << 9;
        state.contextLookupOffset2 = state.contextLookupOffset1 + DynamicModule.f58006b;
    }

    private static int decodeWindowBits(State state) {
        BitReader.fillBitWindow(state);
        if (BitReader.readFewBits(state, 1) == 0) {
            return 16;
        }
        int readFewBits = BitReader.readFewBits(state, 3);
        if (readFewBits != 0) {
            return readFewBits + 17;
        }
        int readFewBits2 = BitReader.readFewBits(state, 3);
        if (readFewBits2 != 0) {
            return readFewBits2 + 8;
        }
        return 17;
    }

    private static void maybeReallocateRingBuffer(State state) {
        int i = state.maxRingBufferSize;
        if (i > state.expectedTotalSize) {
            while (true) {
                int i2 = i >> 1;
                if (i2 <= state.expectedTotalSize) {
                    break;
                }
                i = i2;
            }
            if (state.inputEnd == 0 && i < 16384 && state.maxRingBufferSize >= 16384) {
                i = 16384;
            }
        }
        if (i > state.ringBufferSize) {
            byte[] bArr = new byte[(i + 37)];
            if (state.ringBuffer.length != 0) {
                System.arraycopy(state.ringBuffer, 0, bArr, 0, state.ringBufferSize);
            }
            state.ringBuffer = bArr;
            state.ringBufferSize = i;
        }
    }

    private static int writeRingBuffer(State state) {
        int min = Math.min(state.outputLength - state.outputUsed, state.ringBufferBytesReady - state.ringBufferBytesWritten);
        if (min != 0) {
            System.arraycopy(state.ringBuffer, state.ringBufferBytesWritten, state.output, state.outputOffset + state.outputUsed, min);
            state.outputUsed += min;
            state.ringBufferBytesWritten += min;
        }
        if (state.outputUsed < state.outputLength) {
            return 1;
        }
        return 0;
    }

    private static void readNextMetablockHeader(State state) {
        int i;
        if (state.inputEnd != 0) {
            state.nextRunningState = 9;
            state.runningState = 11;
            return;
        }
        state.hGroup0 = new int[0];
        state.hGroup1 = new int[0];
        state.hGroup2 = new int[0];
        BitReader.readMoreInput(state);
        decodeMetaBlockLength(state);
        if (state.metaBlockLength != 0 || state.isMetadata != 0) {
            if (state.isUncompressed == 0 && state.isMetadata == 0) {
                state.runningState = 2;
            } else {
                BitReader.jumpToByteBoundary(state);
                if (state.isMetadata != 0) {
                    i = 4;
                } else {
                    i = 5;
                }
                state.runningState = i;
            }
            if (state.isMetadata == 0) {
                state.expectedTotalSize += state.metaBlockLength;
                if (state.expectedTotalSize > 1073741824) {
                    state.expectedTotalSize = 1073741824;
                }
                if (state.ringBufferSize < state.maxRingBufferSize) {
                    maybeReallocateRingBuffer(state);
                }
            }
        }
    }

    private static void decodeMetaBlockLength(State state) {
        BitReader.fillBitWindow(state);
        state.inputEnd = BitReader.readFewBits(state, 1);
        int i = 0;
        state.metaBlockLength = 0;
        state.isUncompressed = 0;
        state.isMetadata = 0;
        if (state.inputEnd == 0 || BitReader.readFewBits(state, 1) == 0) {
            int readFewBits = BitReader.readFewBits(state, 2) + 4;
            if (readFewBits == 7) {
                state.isMetadata = 1;
                if (BitReader.readFewBits(state, 1) == 0) {
                    int readFewBits2 = BitReader.readFewBits(state, 2);
                    if (readFewBits2 != 0) {
                        while (i < readFewBits2) {
                            BitReader.fillBitWindow(state);
                            int readFewBits3 = BitReader.readFewBits(state, 8);
                            if (readFewBits3 == 0 && i + 1 == readFewBits2 && readFewBits2 > 1) {
                                throw new BrotliRuntimeException("Exuberant nibble");
                            }
                            state.metaBlockLength = (readFewBits3 << (i * 8)) | state.metaBlockLength;
                            i++;
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new BrotliRuntimeException("Corrupted reserved bit");
                }
            } else {
                while (i < readFewBits) {
                    BitReader.fillBitWindow(state);
                    int readFewBits4 = BitReader.readFewBits(state, 4);
                    if (readFewBits4 == 0 && i + 1 == readFewBits && readFewBits > 4) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    state.metaBlockLength = (readFewBits4 << (i * 4)) | state.metaBlockLength;
                    i++;
                }
            }
            state.metaBlockLength++;
            if (state.inputEnd == 0) {
                state.isUncompressed = BitReader.readFewBits(state, 1);
            }
        }
    }

    private static void readMetablockHuffmanCodesAndContextMaps(State state) {
        state.numLiteralBlockTypes = decodeVarLenUnsignedByte(state) + 1;
        state.literalBlockLength = readMetablockPartition(state, 0, state.numLiteralBlockTypes);
        state.numCommandBlockTypes = decodeVarLenUnsignedByte(state) + 1;
        state.commandBlockLength = readMetablockPartition(state, 1, state.numCommandBlockTypes);
        state.numDistanceBlockTypes = decodeVarLenUnsignedByte(state) + 1;
        state.distanceBlockLength = readMetablockPartition(state, 2, state.numDistanceBlockTypes);
        BitReader.readMoreInput(state);
        BitReader.fillBitWindow(state);
        state.distancePostfixBits = BitReader.readFewBits(state, 2);
        state.numDirectDistanceCodes = (BitReader.readFewBits(state, 4) << state.distancePostfixBits) + 16;
        state.distancePostfixMask = (1 << state.distancePostfixBits) - 1;
        int i = state.numDirectDistanceCodes + (48 << state.distancePostfixBits);
        state.contextModes = new byte[state.numLiteralBlockTypes];
        int i2 = 0;
        while (i2 < state.numLiteralBlockTypes) {
            int min = Math.min(i2 + 96, state.numLiteralBlockTypes);
            while (i2 < min) {
                BitReader.fillBitWindow(state);
                state.contextModes[i2] = (byte) BitReader.readFewBits(state, 2);
                i2++;
            }
            BitReader.readMoreInput(state);
        }
        state.contextMap = new byte[(state.numLiteralBlockTypes << 6)];
        int decodeContextMap = decodeContextMap(state.numLiteralBlockTypes << 6, state.contextMap, state);
        state.trivialLiteralContext = 1;
        int i3 = 0;
        while (true) {
            if (i3 >= (state.numLiteralBlockTypes << 6)) {
                break;
            } else if (state.contextMap[i3] != (i3 >> 6)) {
                state.trivialLiteralContext = 0;
                break;
            } else {
                i3++;
            }
        }
        state.distContextMap = new byte[(state.numDistanceBlockTypes << 2)];
        int decodeContextMap2 = decodeContextMap(state.numDistanceBlockTypes << 2, state.distContextMap, state);
        state.hGroup0 = decodeHuffmanTreeGroup(DynamicModule.f58006b, decodeContextMap, state);
        state.hGroup1 = decodeHuffmanTreeGroup(704, state.numCommandBlockTypes, state);
        state.hGroup2 = decodeHuffmanTreeGroup(i, decodeContextMap2, state);
        state.contextMapSlice = 0;
        state.distContextMapSlice = 0;
        state.contextLookupOffset1 = state.contextModes[0] << 9;
        state.contextLookupOffset2 = state.contextLookupOffset1 + DynamicModule.f58006b;
        state.literalTreeIndex = 0;
        state.literalTree = state.hGroup0[0];
        state.treeCommandOffset = state.hGroup1[0];
        state.rings[4] = 1;
        state.rings[5] = 0;
        state.rings[6] = 1;
        state.rings[7] = 0;
        state.rings[8] = 1;
        state.rings[9] = 0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x005c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0017 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0017 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0351 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0171 A[LOOP:2: B:58:0x0171->B:64:0x01a2, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void decompress(com.tt.miniapp.dec.State r18) {
        /*
        // Method dump skipped, instructions count: 962
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.dec.Decode.decompress(com.tt.miniapp.dec.State):void");
    }

    static int checkDupes(int[] iArr, int i) {
        int i2 = 0;
        while (i2 < i - 1) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < i; i4++) {
                if (iArr[i2] == iArr[i4]) {
                    return 0;
                }
            }
            i2 = i3;
        }
        return 1;
    }

    private static void moveToFront(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    static void initState(State state, InputStream inputStream) {
        if (state.runningState == 0) {
            state.blockTrees = new int[6480];
            state.input = inputStream;
            BitReader.initBitReader(state);
            int decodeWindowBits = decodeWindowBits(state);
            if (decodeWindowBits != 9) {
                state.maxRingBufferSize = 1 << decodeWindowBits;
                state.maxBackwardDistance = state.maxRingBufferSize - 16;
                state.runningState = 1;
                return;
            }
            throw new BrotliRuntimeException("Invalid 'windowBits' code");
        }
        throw new IllegalStateException("State MUST be uninitialized");
    }

    private static void inverseMoveToFrontTransform(byte[] bArr, int i) {
        int[] iArr = new int[DynamicModule.f58006b];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                moveToFront(iArr, i4);
            }
        }
    }

    private static int[] decodeHuffmanTreeGroup(int i, int i2, State state) {
        int[] iArr = new int[((i2 * 1080) + i2)];
        int i3 = i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            readHuffmanCode(i, iArr, i3, state);
            i3 += 1080;
        }
        return iArr;
    }

    private static int readBlockLength(int[] iArr, int i, State state) {
        BitReader.fillBitWindow(state);
        int readSymbol = readSymbol(iArr, i, state);
        int i2 = BLOCK_LENGTH_N_BITS[readSymbol];
        BitReader.fillBitWindow(state);
        return BLOCK_LENGTH_OFFSET[readSymbol] + BitReader.readBits(state, i2);
    }

    private static int translateShortCodes(int i, int[] iArr, int i2) {
        if (i < 16) {
            return iArr[(i2 + DISTANCE_SHORT_CODE_INDEX_OFFSET[i]) & 3] + DISTANCE_SHORT_CODE_VALUE_OFFSET[i];
        }
        return (i - 16) + 1;
    }

    private static int decodeBlockTypeAndLength(State state, int i, int i2) {
        int i3;
        int[] iArr = state.rings;
        int i4 = (i * 2) + 4;
        BitReader.fillBitWindow(state);
        int readSymbol = readSymbol(state.blockTrees, i * 1080, state);
        int readBlockLength = readBlockLength(state.blockTrees, (i + 3) * 1080, state);
        if (readSymbol == 1) {
            i3 = iArr[i4 + 1] + 1;
        } else if (readSymbol == 0) {
            i3 = iArr[i4];
        } else {
            i3 = readSymbol - 2;
        }
        if (i3 >= i2) {
            i3 -= i2;
        }
        int i5 = i4 + 1;
        iArr[i4] = iArr[i5];
        iArr[i5] = i3;
        return readBlockLength;
    }

    private static int readMetablockPartition(State state, int i, int i2) {
        if (i2 <= 1) {
            return 268435456;
        }
        readHuffmanCode(i2 + 2, state.blockTrees, i * 1080, state);
        int i3 = (i + 3) * 1080;
        readHuffmanCode(26, state.blockTrees, i3, state);
        return readBlockLength(state.blockTrees, i3, state);
    }

    private static int readSymbol(int[] iArr, int i, State state) {
        int peekBits = BitReader.peekBits(state);
        int i2 = i + (peekBits & 255);
        int i3 = iArr[i2] >> 16;
        int i4 = iArr[i2] & 65535;
        if (i3 <= 8) {
            state.bitOffset += i3;
            return i4;
        }
        int i5 = i2 + i4 + ((peekBits & ((1 << i3) - 1)) >>> 8);
        state.bitOffset += (iArr[i5] >> 16) + 8;
        return iArr[i5] & 65535;
    }

    private static int decodeContextMap(int i, byte[] bArr, State state) {
        int i2;
        BitReader.readMoreInput(state);
        int decodeVarLenUnsignedByte = decodeVarLenUnsignedByte(state) + 1;
        if (decodeVarLenUnsignedByte == 1) {
            Utils.fillBytesWithZeroes(bArr, 0, i);
            return decodeVarLenUnsignedByte;
        }
        BitReader.fillBitWindow(state);
        if (BitReader.readFewBits(state, 1) != 0) {
            i2 = BitReader.readFewBits(state, 4) + 1;
        } else {
            i2 = 0;
        }
        int[] iArr = new int[1080];
        readHuffmanCode(decodeVarLenUnsignedByte + i2, iArr, 0, state);
        int i3 = 0;
        while (i3 < i) {
            BitReader.readMoreInput(state);
            BitReader.fillBitWindow(state);
            int readSymbol = readSymbol(iArr, 0, state);
            if (readSymbol == 0) {
                bArr[i3] = 0;
            } else if (readSymbol <= i2) {
                BitReader.fillBitWindow(state);
                for (int readFewBits = (1 << readSymbol) + BitReader.readFewBits(state, readSymbol); readFewBits != 0; readFewBits--) {
                    if (i3 < i) {
                        bArr[i3] = 0;
                        i3++;
                    } else {
                        throw new BrotliRuntimeException("Corrupted context map");
                    }
                }
                continue;
            } else {
                bArr[i3] = (byte) (readSymbol - i2);
            }
            i3++;
        }
        BitReader.fillBitWindow(state);
        if (BitReader.readFewBits(state, 1) == 1) {
            inverseMoveToFrontTransform(bArr, i);
        }
        return decodeVarLenUnsignedByte;
    }

    static void readHuffmanCode(int i, int[] iArr, int i2, State state) {
        int i3;
        BitReader.readMoreInput(state);
        int[] iArr2 = new int[i];
        BitReader.fillBitWindow(state);
        int readFewBits = BitReader.readFewBits(state, 2);
        int i4 = 0;
        if (readFewBits == 1) {
            int i5 = i - 1;
            int[] iArr3 = new int[4];
            int readFewBits2 = BitReader.readFewBits(state, 2) + 1;
            int i6 = 0;
            while (i5 != 0) {
                i5 >>= 1;
                i6++;
            }
            for (int i7 = 0; i7 < readFewBits2; i7++) {
                BitReader.fillBitWindow(state);
                iArr3[i7] = BitReader.readFewBits(state, i6) % i;
                iArr2[iArr3[i7]] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (readFewBits2 == 2) {
                iArr2[iArr3[1]] = 1;
            } else if (readFewBits2 == 4) {
                if (BitReader.readFewBits(state, 1) == 1) {
                    iArr2[iArr3[2]] = 3;
                    iArr2[iArr3[3]] = 3;
                } else {
                    iArr2[iArr3[0]] = 2;
                }
            }
            i3 = checkDupes(iArr3, readFewBits2);
        } else {
            int[] iArr4 = new int[18];
            int i8 = 32;
            int i9 = 0;
            while (readFewBits < 18 && i8 > 0) {
                int i10 = CODE_LENGTH_CODE_ORDER[readFewBits];
                BitReader.fillBitWindow(state);
                int peekBits = BitReader.peekBits(state) & 15;
                int i11 = state.bitOffset;
                int[] iArr5 = FIXED_TABLE;
                state.bitOffset = i11 + (iArr5[peekBits] >> 16);
                int i12 = iArr5[peekBits] & 65535;
                iArr4[i10] = i12;
                if (i12 != 0) {
                    i8 -= 32 >> i12;
                    i9++;
                }
                readFewBits++;
            }
            if (i8 == 0 || i9 == 1) {
                i4 = 1;
            }
            readHuffmanCodeLengths(iArr4, i, iArr2, state);
            i3 = i4;
        }
        if (i3 != 0) {
            Huffman.buildHuffmanTable(iArr, i2, 8, iArr2, i);
            return;
        }
        throw new BrotliRuntimeException("Can't readHuffmanCode");
    }

    private static void readHuffmanCodeLengths(int[] iArr, int i, int[] iArr2, State state) {
        int i2;
        int i3;
        int[] iArr3 = new int[32];
        Huffman.buildHuffmanTable(iArr3, 0, 5, iArr, 18);
        int i4 = 8;
        int i5 = 0;
        int i6 = 32768;
        int i7 = 0;
        loop0:
        while (true) {
            int i8 = 0;
            while (i5 < i && i6 > 0) {
                BitReader.readMoreInput(state);
                BitReader.fillBitWindow(state);
                int peekBits = BitReader.peekBits(state) & 31;
                state.bitOffset += iArr3[peekBits] >> 16;
                int i9 = iArr3[peekBits] & 65535;
                if (i9 < 16) {
                    int i10 = i5 + 1;
                    iArr2[i5] = i9;
                    if (i9 != 0) {
                        i6 -= 32768 >> i9;
                        i5 = i10;
                        i4 = i9;
                    } else {
                        i5 = i10;
                    }
                } else {
                    int i11 = i9 - 14;
                    if (i9 == 16) {
                        i2 = i4;
                    } else {
                        i2 = 0;
                    }
                    if (i7 != i2) {
                        i7 = i2;
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        i3 = (i8 - 2) << i11;
                    } else {
                        i3 = i8;
                    }
                    BitReader.fillBitWindow(state);
                    int readFewBits = i3 + BitReader.readFewBits(state, i11) + 3;
                    int i12 = readFewBits - i8;
                    if (i5 + i12 <= i) {
                        int i13 = 0;
                        while (i13 < i12) {
                            iArr2[i5] = i7;
                            i13++;
                            i5++;
                        }
                        if (i7 != 0) {
                            i6 -= i12 << (15 - i7);
                        }
                        i8 = readFewBits;
                    } else {
                        throw new BrotliRuntimeException("symbol + repeatDelta > numSymbols");
                    }
                }
            }
        }
        if (i6 == 0) {
            Utils.fillIntsWithZeroes(iArr2, i5, i);
            return;
        }
        throw new BrotliRuntimeException("Unused space");
    }
}

package com.tt.miniapp.dec;

final class BitReader {
    BitReader() {
    }

    static int peekBits(State state) {
        return (int) (state.accumulator64 >>> state.bitOffset);
    }

    private static void prepare(State state) {
        readMoreInput(state);
        checkHealth(state, 0);
        doFillBitWindow(state);
        doFillBitWindow(state);
    }

    static void readMoreInput(State state) {
        if (state.halfOffset > 1015) {
            doReadMoreInput(state);
        }
    }

    static void reload(State state) {
        if (state.bitOffset == 64) {
            prepare(state);
        }
    }

    private static void doFillBitWindow(State state) {
        int[] iArr = state.intBuffer;
        int i = state.halfOffset;
        state.halfOffset = i + 1;
        state.accumulator64 = (((long) iArr[i]) << 32) | (state.accumulator64 >>> 32);
        state.bitOffset -= 32;
    }

    static void fillBitWindow(State state) {
        if (state.bitOffset >= 32) {
            int[] iArr = state.intBuffer;
            int i = state.halfOffset;
            state.halfOffset = i + 1;
            state.accumulator64 = (((long) iArr[i]) << 32) | (state.accumulator64 >>> 32);
            state.bitOffset -= 32;
        }
    }

    static int halfAvailable(State state) {
        int i;
        if (state.endOfStreamReached != 0) {
            i = (state.tailBytes + 3) >> 2;
        } else {
            i = 1024;
        }
        return i - state.halfOffset;
    }

    static void initBitReader(State state) {
        state.byteBuffer = new byte[4160];
        state.accumulator64 = 0;
        state.intBuffer = new int[1040];
        state.bitOffset = 64;
        state.halfOffset = 1024;
        state.endOfStreamReached = 0;
        prepare(state);
    }

    static void jumpToByteBoundary(State state) {
        int i = (64 - state.bitOffset) & 7;
        if (i != 0 && readFewBits(state, i) != 0) {
            throw new BrotliRuntimeException("Corrupted padding bits");
        }
    }

    static void doReadMoreInput(State state) {
        if (state.endOfStreamReached == 0) {
            int i = state.halfOffset << 2;
            int i2 = 4096 - i;
            Utils.copyBytesWithin(state.byteBuffer, 0, i, 4096);
            state.halfOffset = 0;
            while (true) {
                if (i2 >= 4096) {
                    break;
                }
                int readInput = Utils.readInput(state.input, state.byteBuffer, i2, 4096 - i2);
                if (readInput <= 0) {
                    state.endOfStreamReached = 1;
                    state.tailBytes = i2;
                    i2 += 3;
                    break;
                }
                i2 += readInput;
            }
            bytesToNibbles(state, i2);
        } else if (halfAvailable(state) < -2) {
            throw new BrotliRuntimeException("No more input");
        }
    }

    static int readBits(State state, int i) {
        return readFewBits(state, i);
    }

    static int readFewBits(State state, int i) {
        int peekBits = peekBits(state) & ((1 << i) - 1);
        state.bitOffset += i;
        return peekBits;
    }

    private static int readManyBits(State state, int i) {
        int readFewBits = readFewBits(state, 16);
        doFillBitWindow(state);
        return (readFewBits(state, i - 16) << 16) | readFewBits;
    }

    static void bytesToNibbles(State state, int i) {
        byte[] bArr = state.byteBuffer;
        int i2 = i >> 2;
        int[] iArr = state.intBuffer;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 4;
            iArr[i3] = ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }
    }

    static void checkHealth(State state, int i) {
        if (state.endOfStreamReached != 0) {
            int i2 = ((state.halfOffset << 2) + ((state.bitOffset + 7) >> 3)) - 8;
            if (i2 > state.tailBytes) {
                throw new BrotliRuntimeException("Read after end");
            } else if (i != 0 && i2 != state.tailBytes) {
                throw new BrotliRuntimeException("Unused bytes after end");
            }
        }
    }

    static void copyBytes(State state, byte[] bArr, int i, int i2) {
        if ((state.bitOffset & 7) == 0) {
            while (state.bitOffset != 64 && i2 != 0) {
                bArr[i] = (byte) peekBits(state);
                state.bitOffset += 8;
                i2--;
                i++;
            }
            if (i2 != 0) {
                int min = Math.min(halfAvailable(state), i2 >> 2);
                if (min > 0) {
                    int i3 = min << 2;
                    System.arraycopy(state.byteBuffer, state.halfOffset << 2, bArr, i, i3);
                    i += i3;
                    i2 -= i3;
                    state.halfOffset += min;
                }
                if (i2 != 0) {
                    if (halfAvailable(state) > 0) {
                        fillBitWindow(state);
                        while (i2 != 0) {
                            bArr[i] = (byte) peekBits(state);
                            state.bitOffset += 8;
                            i2--;
                            i++;
                        }
                        checkHealth(state, 0);
                        return;
                    }
                    while (i2 > 0) {
                        int readInput = Utils.readInput(state.input, bArr, i, i2);
                        if (readInput != -1) {
                            i += readInput;
                            i2 -= readInput;
                        } else {
                            throw new BrotliRuntimeException("Unexpected end of input");
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new BrotliRuntimeException("Unaligned copyBytes");
    }
}

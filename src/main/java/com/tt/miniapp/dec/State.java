package com.tt.miniapp.dec;

import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class State {
    int accumulator32;
    long accumulator64;
    int bitOffset;
    int[] blockTrees;
    byte[] byteBuffer;
    int commandBlockLength;
    int contextLookupOffset1;
    int contextLookupOffset2;
    byte[] contextMap;
    int contextMapSlice;
    byte[] contextModes;
    int copyLength;
    byte[] distContextMap;
    int distContextMapSlice;
    int distRbIdx;
    int distance;
    int distanceBlockLength;
    int distanceCode;
    int distancePostfixBits;
    int distancePostfixMask;
    int endOfStreamReached;
    int expectedTotalSize;
    int[] hGroup0;
    int[] hGroup1;
    int[] hGroup2;
    int halfOffset;
    InputStream input;
    int inputEnd;
    int insertLength;
    int[] intBuffer;
    int isEager;
    int isMetadata;
    int isUncompressed;

    /* renamed from: j */
    int f166578j;
    int literalBlockLength;
    int literalTree;
    int literalTreeIndex;
    int maxBackwardDistance;
    int maxDistance;
    int maxRingBufferSize;
    int metaBlockLength;
    int nextRunningState;
    int numCommandBlockTypes;
    int numDirectDistanceCodes;
    int numDistanceBlockTypes;
    int numLiteralBlockTypes;
    byte[] output;
    int outputLength;
    int outputOffset;
    int outputUsed;
    int pos;
    byte[] ringBuffer = new byte[0];
    int ringBufferBytesReady;
    int ringBufferBytesWritten;
    int ringBufferSize;
    int[] rings;
    int runningState;
    short[] shortBuffer;
    int tailBytes;
    int treeCommandOffset;
    int trivialLiteralContext;

    State() {
        int[] iArr = new int[10];
        this.rings = iArr;
        iArr[0] = 16;
        iArr[1] = 15;
        iArr[2] = 11;
        iArr[3] = 4;
    }
}

package com.bytedance.common.jato.boost;

import java.util.LinkedList;
import java.util.TreeMap;

public class CpuFreqFetcher {
    private static int[] bigCoreNum = null;
    private static TreeMap<Long, LinkedList<Integer>> coreMap = new TreeMap<>();
    private static volatile boolean sIsFetched = false;
    private static volatile boolean sIsWorked = false;
    private static long sMaxFreq = -1;
    private static int[] smallCoreNum;

    public static int[] getBigCoreNum() {
        return bigCoreNum;
    }

    public static int[] getSmallCoreNum() {
        return smallCoreNum;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:33|32|35|36|37|109|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00f5 */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean fetch() {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.boost.CpuFreqFetcher.fetch():boolean");
    }
}

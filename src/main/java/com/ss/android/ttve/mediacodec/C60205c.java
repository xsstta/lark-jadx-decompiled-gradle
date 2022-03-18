package com.ss.android.ttve.mediacodec;

import com.ss.android.vesdk.C63929ab;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.mediacodec.c */
public class C60205c {

    /* renamed from: a */
    private static int f150271a;

    /* renamed from: b */
    private static int f150272b;

    /* renamed from: c */
    private static List<Integer> f150273c = new ArrayList();

    /* renamed from: d */
    private static int f150274d = 2304000;

    /* renamed from: a */
    public static synchronized int m233985a() {
        int i;
        synchronized (C60205c.class) {
            i = f150272b;
        }
        return i;
    }

    /* renamed from: b */
    public static synchronized int m233988b() {
        int i;
        synchronized (C60205c.class) {
            i = f150271a;
        }
        return i;
    }

    /* renamed from: b */
    public static synchronized void m233989b(int i, int i2) {
        synchronized (C60205c.class) {
            if (f150273c.contains(Integer.valueOf(i2))) {
                f150271a -= i;
                f150273c.remove(Integer.valueOf(i2));
                C63929ab.m250976b("TEMediaCodecResourceManager", "freeCodecBlocksSize blocksSize: " + i + ", sUsedCodecBlocksSize: " + f150271a + ", " + i2);
                if (f150271a < 0) {
                    C63929ab.m250978c("TEMediaCodecResourceManager", "freeCodecBlocksSize sUsedCodecBlocksSize < 0");
                    f150271a = 0;
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m233986a(int i, int i2) {
        synchronized (C60205c.class) {
            if (f150272b == 0) {
                f150272b = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                C63929ab.m250974a("TEMediaCodecResourceManager", "sMaxCodecBlocksSize: " + f150272b);
            }
            if (f150272b == -1) {
                return true;
            }
            if (f150273c.contains(Integer.valueOf(i2))) {
                return true;
            }
            int i3 = f150271a;
            if (i3 + i > f150272b) {
                C63929ab.m250978c("TEMediaCodecResourceManager", "sUsedCodecBlocksSize + blocksSize > sMaxCodecBlocksSize, sUsedCodecBlocksSize: " + f150271a + ", blocksSize:" + i);
                return false;
            }
            f150271a = i3 + i;
            f150273c.add(Integer.valueOf(i2));
            C63929ab.m250976b("TEMediaCodecResourceManager", "tryUseCodecBlocksSize success blocksSize: " + i + ", sUsedCodecBlocksSize: " + f150271a + ", " + i2);
            return true;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m233987a(int i, int i2, int i3) {
        synchronized (C60205c.class) {
            if (f150272b == 0) {
                f150272b = TEMediaCodecDecoder.getMaxBlocksSizePerSecond();
                C63929ab.m250974a("TEMediaCodecResourceManager", "sMaxCodecBlocksSize: " + f150272b);
            }
            int i4 = f150272b;
            if (i4 == -1) {
                return true;
            }
            int i5 = f150271a;
            int i6 = i * i2 * i3;
            if (i5 + i6 > i4) {
                C63929ab.m250974a("TEMediaCodecResourceManager", "checkCanFastImport is false, sUsedCodecBlocksSize: " + f150271a + ", width: " + i + ", height: " + i2 + ", fps: " + i3);
                return false;
            }
            if (i5 > 0) {
                int i7 = f150274d;
                if (i4 - i7 > 0 && i5 + i6 > i4 - i7) {
                    C63929ab.m250974a("TEMediaCodecResourceManager", "checkCanFastImport is false, sUsedCodecBlocksSize: " + f150271a + ", width: " + i + ", height: " + i2 + ", fps: " + i3);
                    return false;
                }
            }
            C63929ab.m250974a("TEMediaCodecResourceManager", "checkCanFastImport is true");
            return true;
        }
    }
}

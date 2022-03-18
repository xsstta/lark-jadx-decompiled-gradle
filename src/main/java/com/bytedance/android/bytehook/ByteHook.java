package com.bytedance.android.bytehook;

import com.C1711a;

public class ByteHook {
    public static final AbstractC2620a defaultLibLoader = null;
    public static final int defaultMode = Mode.AUTOMATIC.getValue();
    private static int initStatus = 1;
    private static boolean inited;

    private static native String nativeGetRecords();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebug(boolean z);

    public enum Mode {
        AUTOMATIC(0),
        MANUAL(1);
        
        private final int value;

        /* access modifiers changed from: package-private */
        public int getValue() {
            return this.value;
        }

        private Mode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.android.bytehook.ByteHook$a */
    public static class C2618a {

        /* renamed from: a */
        private AbstractC2620a f8354a;

        /* renamed from: b */
        private int f8355b;

        /* renamed from: c */
        private boolean f8356c;

        /* renamed from: a */
        public AbstractC2620a mo11331a() {
            return this.f8354a;
        }

        /* renamed from: b */
        public int mo11335b() {
            return this.f8355b;
        }

        /* renamed from: c */
        public boolean mo11336c() {
            return this.f8356c;
        }

        /* renamed from: a */
        public void mo11332a(int i) {
            this.f8355b = i;
        }

        /* renamed from: a */
        public void mo11333a(AbstractC2620a aVar) {
            this.f8354a = aVar;
        }

        /* renamed from: a */
        public void mo11334a(boolean z) {
            this.f8356c = z;
        }
    }

    public static String getRecords() {
        if (initStatus == 0) {
            return nativeGetRecords();
        }
        return null;
    }

    /* renamed from: com.bytedance.android.bytehook.ByteHook$b */
    public static class C2619b {

        /* renamed from: a */
        private AbstractC2620a f8357a = ByteHook.defaultLibLoader;

        /* renamed from: b */
        private int f8358b = ByteHook.defaultMode;

        /* renamed from: c */
        private boolean f8359c;

        /* renamed from: a */
        public C2618a mo11337a() {
            C2618a aVar = new C2618a();
            aVar.mo11333a(this.f8357a);
            aVar.mo11332a(this.f8358b);
            aVar.mo11334a(this.f8359c);
            return aVar;
        }
    }

    public static int init() {
        if (inited) {
            return initStatus;
        }
        return init(new C2619b().mo11337a());
    }

    public static void setDebug(boolean z) {
        if (initStatus == 0) {
            nativeSetDebug(z);
        }
    }

    public static synchronized int init(C2618a aVar) {
        synchronized (ByteHook.class) {
            if (inited) {
                return initStatus;
            }
            inited = true;
            try {
                if (aVar.mo11331a() == null) {
                    C1711a.m7628a("bytehook");
                } else {
                    aVar.mo11331a().mo11338a("bytehook");
                }
                try {
                    initStatus = nativeInit(aVar.mo11335b(), aVar.mo11336c());
                } catch (Throwable unused) {
                    initStatus = 101;
                }
                return initStatus;
            } catch (Throwable unused2) {
                initStatus = 100;
                return 100;
            }
        }
    }
}

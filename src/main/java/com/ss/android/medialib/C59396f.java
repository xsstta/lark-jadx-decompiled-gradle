package com.ss.android.medialib;

/* renamed from: com.ss.android.medialib.f */
public class C59396f {

    /* renamed from: a */
    private static final String f147459a = "f";

    /* renamed from: b */
    private static volatile C59396f f147460b;

    /* renamed from: c */
    private RecordInvoker f147461c;

    /* renamed from: a */
    public static C59396f m230557a() {
        synchronized (C59396f.class) {
            if (f147460b == null) {
                synchronized (C59396f.class) {
                    if (f147460b == null) {
                        f147460b = new C59396f();
                    }
                }
            }
        }
        return f147460b;
    }

    /* renamed from: a */
    public void mo202251a(RecordInvoker recordInvoker) {
        this.f147461c = recordInvoker;
    }
}

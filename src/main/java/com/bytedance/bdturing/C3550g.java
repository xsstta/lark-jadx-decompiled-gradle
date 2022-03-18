package com.bytedance.bdturing;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.bdturing.g */
class C3550g {

    /* renamed from: c */
    private static int f11225c = 6000;

    /* renamed from: a */
    public List<C3552a> f11226a = new ArrayList();

    /* renamed from: b */
    public volatile boolean f11227b = false;

    /* renamed from: d */
    private int f11228d;

    /* renamed from: a */
    private void m14994a() {
        try {
            C3567l.m15030a().mo14386a(new Runnable() {
                /* class com.bytedance.bdturing.C3550g.RunnableC35511 */

                public void run() {
                    try {
                        int size = C3550g.this.f11226a.size() - 1;
                        double d = (double) C3550g.this.f11226a.get(size).f11234e;
                        while (size >= 0) {
                            C3552a aVar = C3550g.this.f11226a.get(size);
                            if (d >= ((double) aVar.f11234e) || size == 0) {
                                C3558j.m15008a(aVar.f11234e, aVar.f11230a, aVar.f11231b, aVar.f11235f, aVar.f11232c, aVar.f11233d);
                                d -= 33.3333d;
                                LogUtil.m14895a("onTouch", "uploadEvent use " + aVar.f11234e + " " + aVar.f11235f);
                            } else {
                                LogUtil.m14895a("onTouch", "uploadEvent abandon " + aVar.f11234e + " " + aVar.f11235f);
                            }
                            size--;
                        }
                        C3550g.this.f11226a.clear();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        C3550g.this.f11227b = false;
                        throw th;
                    }
                    C3550g.this.f11227b = false;
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.bytedance.bdturing.g$a */
    class C3552a {

        /* renamed from: a */
        float f11230a;

        /* renamed from: b */
        float f11231b;

        /* renamed from: c */
        float f11232c;

        /* renamed from: d */
        float f11233d;

        /* renamed from: e */
        long f11234e;

        /* renamed from: f */
        int f11235f;

        C3552a() {
        }
    }

    public C3550g(int i) {
        int i2 = f11225c;
        this.f11228d = i2;
        if (i > i2) {
            this.f11228d = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14358a(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.C3550g.mo14358a(android.view.MotionEvent):void");
    }
}

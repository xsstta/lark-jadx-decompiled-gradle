package com.bytedance.apm.block.p136a;

import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.trace.p155a.C3065a;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.apm.trace.p155a.C3078c;
import com.bytedance.apm.util.C3118f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.a.b */
public class C2835b extends AbstractC2834a {

    /* renamed from: a */
    public final ArrayList<C3078c> f9050a = new ArrayList<>();

    /* renamed from: b */
    public C2839a f9051b = new C2839a();

    /* renamed from: c */
    private final long f9052c = 10000;

    /* renamed from: d */
    private HashMap<String, C2840b> f9053d = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.block.a.b$b */
    public class C2840b {

        /* renamed from: a */
        String f9064a;

        /* renamed from: b */
        long f9065b;

        /* renamed from: c */
        int f9066c;

        /* renamed from: d */
        int f9067d;

        /* renamed from: e */
        int[] f9068e;

        /* renamed from: f */
        int f9069f;

        public String toString() {
            return "visibleScene=" + this.f9064a + ", sumFrame=" + this.f9066c + ", sumDroppedFrames=" + this.f9067d + ", sumFrameCost=" + this.f9065b + ", dropLevel=" + Arrays.toString(this.f9068e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12229a() {
            try {
                float a = C3118f.m12988a();
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i <= this.f9069f; i++) {
                    if (this.f9068e[i] > 0) {
                        jSONObject.put(String.valueOf(i), this.f9068e[i]);
                    }
                }
                C3065a.m12801a().mo12918a(this.f9064a, (float) (((double) (((this.f9066c * 100) * C3118f.m12991b()) / (this.f9066c + this.f9067d))) / 100.0d));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scene", this.f9064a);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("total_scroll_time", this.f9065b);
                jSONObject3.put("drop_time_rate", (double) (1.0f - ((((float) this.f9066c) * 1.0f) / ((float) ((int) (((float) this.f9065b) / a))))));
                jSONObject3.put("refresh_rate", this.f9069f + 1);
                C2741a.m11630c().mo11785a(new C2753f("fps_drop", this.f9064a, jSONObject, jSONObject2, jSONObject3));
            } catch (Throwable unused) {
            }
            this.f9066c = 0;
            this.f9067d = 0;
            this.f9065b = 0;
        }

        C2840b(String str) {
            this.f9064a = str;
            int b = C3118f.m12991b() - 1;
            this.f9069f = b;
            this.f9068e = new int[(b + 0 + 1)];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12230a(long j, long j2) {
            float a = C3118f.m12988a();
            long j3 = j2 - j;
            this.f9065b += j3;
            int min = Math.min(Math.max((int) (((float) j3) / a), 0), this.f9069f);
            int[] iArr = this.f9068e;
            iArr[min] = iArr[min] + 1;
            this.f9067d += min;
            this.f9066c++;
        }
    }

    public C2835b() {
        C2848f.m12008a().mo12246a(true);
        C3069b.m12808a(true);
    }

    /* renamed from: b */
    public void mo12224b(final C3078c cVar) {
        C2848f.m12008a().f9090j.mo12901a(new Runnable() {
            /* class com.bytedance.apm.block.p136a.C2835b.RunnableC28383 */

            public void run() {
                C2835b.this.f9050a.remove(cVar);
            }
        });
    }

    /* renamed from: a */
    public void mo12223a(final C3078c cVar) {
        C2848f.m12008a().f9090j.mo12901a(new Runnable() {
            /* class com.bytedance.apm.block.p136a.C2835b.RunnableC28372 */

            public void run() {
                C2835b.this.f9050a.add(cVar);
            }
        });
    }

    /* renamed from: a */
    public void mo12222a(final long j, final boolean z) {
        C2848f.m12008a().f9090j.mo12901a(new Runnable() {
            /* class com.bytedance.apm.block.p136a.C2835b.RunnableC28361 */

            public void run() {
                C2835b.this.f9051b.mo12228a(j, z);
                for (int i = 0; i < C2835b.this.f9050a.size(); i++) {
                    C2835b.this.f9050a.get(i).mo12940a(j, z);
                }
            }
        });
    }

    /* renamed from: com.bytedance.apm.block.a.b$a */
    public static class C2839a {

        /* renamed from: a */
        public int f9061a;

        /* renamed from: b */
        public int f9062b;

        /* renamed from: c */
        public long f9063c;

        /* renamed from: a */
        public void mo12228a(long j, boolean z) {
            if (z) {
                this.f9061a++;
            }
            this.f9062b++;
            this.f9063c += j;
        }
    }

    /* renamed from: b */
    private void m11989b(String str, long j, long j2) {
        if (((int) (j2 - j)) > 0) {
            C2840b bVar = this.f9053d.get(str);
            if (bVar == null) {
                bVar = new C2840b(str);
                this.f9053d.put(str, bVar);
            }
            bVar.mo12230a(j, j2);
            if (bVar.f9065b >= 10000) {
                this.f9053d.remove(str);
                bVar.mo12229a();
            }
        }
    }

    @Override // com.bytedance.apm.block.AbstractC2833a
    /* renamed from: a */
    public void mo12215a(String str, long j, long j2) {
        super.mo12215a(str, j, j2);
        m11989b(str, j, j2);
        for (int i = 0; i < this.f9050a.size(); i++) {
            this.f9050a.get(i).mo12939a(j, j2);
        }
    }
}

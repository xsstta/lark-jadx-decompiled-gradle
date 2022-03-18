package com.lynx.tasm.behavior.shadow;

import android.os.Handler;
import com.lynx.tasm.common.C26874b;

/* renamed from: com.lynx.tasm.behavior.shadow.b */
public class C26700b implements AbstractC26702c {

    /* renamed from: a */
    public boolean f66098a;

    /* renamed from: b */
    private Runnable f66099b;

    /* renamed from: c */
    private Handler f66100c;

    /* renamed from: d */
    private C26874b f66101d;

    /* renamed from: a */
    public void mo94818a() {
        Runnable runnable = this.f66099b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC26702c
    /* renamed from: a */
    public void mo94816a(Runnable runnable) {
        if (this.f66100c == null) {
            this.f66100c = new Handler();
            this.f66101d = new C26874b();
        }
        this.f66101d.mo95656a();
        if (!this.f66098a) {
            this.f66099b = runnable;
            this.f66100c.postDelayed(new Runnable() {
                /* class com.lynx.tasm.behavior.shadow.C26700b.RunnableC267011 */

                public void run() {
                    C26700b.this.mo94818a();
                    C26700b.this.f66098a = false;
                }
            }, 16);
            this.f66098a = true;
        }
    }
}

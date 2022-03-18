package com.tt.miniapp.feedback;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3323q.C66689h;
import com.tt.miniapp.p3323q.HandlerC66687g;
import com.tt.miniapphost.AppbrandContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.tt.miniapp.feedback.h */
public class C66159h implements AbstractC66158g {

    /* renamed from: b */
    public static final String f167015b = (C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()) + "/TT/feedback/performance.txt");

    /* renamed from: a */
    public BufferedWriter f167016a;

    /* renamed from: c */
    private long f167017c;

    /* renamed from: d */
    private IAppContext f167018d;

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: b */
    public void mo231254b() {
        boolean z;
        if (C66094d.m258853a(this.f167018d) == null || !C66094d.m258853a(this.f167018d).mo231264g()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f167016a != null) {
            HandlerC66687g.m260442a(1000, this.f167018d);
            C66689h.m260451a(new C66689h.AbstractC66691b() {
                /* class com.tt.miniapp.feedback.C66159h.C661601 */

                @Override // com.tt.miniapp.p3323q.C66689h.AbstractC66691b
                /* renamed from: a */
                public void mo231458a(String str) {
                    try {
                        C66159h.this.f167016a.write(C66157f.m259066a(str));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_PerformanceLogger", e.getStackTrace());
                    }
                }
            }, this.f167018d);
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: c */
    public void mo231255c() {
        try {
            HandlerC66687g.m260442a(this.f167017c, this.f167018d);
            C66689h.m260449a(this.f167018d);
            BufferedWriter bufferedWriter = this.f167016a;
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                this.f167016a.close();
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_PerformanceLogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: a */
    public void mo231253a() {
        this.f167017c = HandlerC66687g.m260441a(this.f167018d);
        try {
            File file = new File(f167015b);
            if (file.exists()) {
                this.f167016a = new BufferedWriter(new FileWriter(file));
            } else if (file.createNewFile()) {
                this.f167016a = new BufferedWriter(new FileWriter(file));
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_PerformanceLogger", e.getStackTrace());
        }
    }

    public C66159h(IAppContext iAppContext) {
        this.f167018d = iAppContext;
    }
}

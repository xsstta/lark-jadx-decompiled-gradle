package com.tt.miniapp.feedback;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapphost.AppbrandContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.feedback.b */
public class C66090b implements AbstractC66158g {

    /* renamed from: a */
    public static final String f166826a = (C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()) + "/TT/feedback/eventLog.txt");

    /* renamed from: b */
    public BufferedWriter f166827b;

    /* renamed from: c */
    private IAppContext f166828c;

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: c */
    public void mo231255c() {
        try {
            C66020b.m258532a();
            BufferedWriter bufferedWriter = this.f166827b;
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                this.f166827b.close();
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_EventLogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: a */
    public void mo231253a() {
        try {
            File file = new File(f166826a);
            if (file.exists()) {
                this.f166827b = new BufferedWriter(new FileWriter(file));
            } else if (file.createNewFile()) {
                this.f166827b = new BufferedWriter(new FileWriter(file));
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_EventLogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: b */
    public void mo231254b() {
        boolean z;
        if (C66094d.m258853a(this.f166828c) == null || !C66094d.m258853a(this.f166828c).mo231264g()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f166827b != null) {
            C66020b.m258533a(new C66020b.AbstractC66022b() {
                /* class com.tt.miniapp.feedback.C66090b.C660911 */

                @Override // com.tt.miniapp.event.C66020b.AbstractC66022b
                /* renamed from: a */
                public void mo231093a(String str, JSONObject jSONObject) {
                    try {
                        C66090b.this.f166827b.write(C66157f.m259066a(str, jSONObject.toString()));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_EventLogger", e.getStackTrace());
                    }
                }
            });
        }
    }

    public C66090b(IAppContext iAppContext) {
        this.f166828c = iAppContext;
    }
}

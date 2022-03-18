package com.tt.miniapp.feedback;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.AppbrandContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.tt.miniapp.feedback.a */
public class C66088a implements AbstractC66158g {

    /* renamed from: a */
    public static final String f166821a = (C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()) + "/TT/feedback/appVConsole.txt");

    /* renamed from: b */
    public BufferedWriter f166822b;

    /* renamed from: c */
    private RenderViewManager f166823c;

    /* renamed from: d */
    private IAppContext f166824d;

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: c */
    public void mo231255c() {
        try {
            RenderViewManager renderViewManager = this.f166823c;
            if (renderViewManager != null) {
                renderViewManager.unRegisterFeedback();
            }
            BufferedWriter bufferedWriter = this.f166822b;
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                this.f166822b.close();
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_AppVConsoleLogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: a */
    public void mo231253a() {
        try {
            File file = new File(f166821a);
            if (file.exists()) {
                this.f166822b = new BufferedWriter(new FileWriter(file));
            } else if (file.createNewFile()) {
                this.f166822b = new BufferedWriter(new FileWriter(file));
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_AppVConsoleLogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: b */
    public void mo231254b() {
        boolean z;
        if (C66094d.m258853a(this.f166824d) == null || !C66094d.m258853a(this.f166824d).mo231264g()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f166822b != null) {
            RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f166824d).getRenderViewManager();
            this.f166823c = renderViewManager;
            if (renderViewManager != null) {
                renderViewManager.registerFeedback(new RenderViewManager.AbstractC65714a() {
                    /* class com.tt.miniapp.feedback.C66088a.C660891 */

                    @Override // com.tt.miniapp.RenderViewManager.AbstractC65714a
                    /* renamed from: a */
                    public void mo230302a(int i, String str, String str2) {
                        try {
                            C66088a.this.f166822b.write(C66157f.m259066a(Integer.valueOf(i), str, str2));
                        } catch (IOException e) {
                            AppBrandLogger.stacktrace(6, "tma_AppVConsoleLogger", e.getStackTrace());
                        }
                    }
                });
            }
        }
    }

    public C66088a(IAppContext iAppContext) {
        this.f166824d = iAppContext;
    }
}

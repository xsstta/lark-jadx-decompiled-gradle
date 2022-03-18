package com.tt.miniapp.feedback;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.AppbrandContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.tt.miniapp.feedback.c */
public class C66092c implements AbstractC66158g {

    /* renamed from: a */
    public static final String f166830a = (C12791h.m52861a(AppbrandContext.getInst().getApplicationContext()) + "/TT/feedback/feedbackALogger.txt");

    /* renamed from: b */
    public BufferedWriter f166831b;

    /* renamed from: c */
    private IAppContext f166832c;

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: c */
    public void mo231255c() {
        try {
            AppBrandLogger.registerFeedbackLogger(null);
            BufferedWriter bufferedWriter = this.f166831b;
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                this.f166831b.close();
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: a */
    public void mo231253a() {
        try {
            File file = new File(f166830a);
            if (file.exists()) {
                this.f166831b = new BufferedWriter(new FileWriter(file));
            } else if (file.createNewFile()) {
                this.f166831b = new BufferedWriter(new FileWriter(file));
            }
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
        }
    }

    @Override // com.tt.miniapp.feedback.AbstractC66158g
    /* renamed from: b */
    public void mo231254b() {
        boolean z;
        if (C66094d.m258853a(this.f166832c) == null || !C66094d.m258853a(this.f166832c).mo231264g()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f166831b != null) {
            AppBrandLogger.registerFeedbackLogger(new AppBrandLogger.ILogger() {
                /* class com.tt.miniapp.feedback.C66092c.C660931 */

                @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
                public void flush() {
                }

                @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
                public void logD(String str, String str2) {
                    try {
                        C66092c.this.f166831b.write(C66157f.m259066a("debug: ", str, str2));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
                    }
                }

                @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
                public void logE(String str, String str2) {
                    try {
                        C66092c.this.f166831b.write(C66157f.m259066a("error: ", str, str2));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
                    }
                }

                @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
                public void logI(String str, String str2) {
                    try {
                        C66092c.this.f166831b.write(C66157f.m259066a("info: ", str, str2));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
                    }
                }

                @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
                public void logW(String str, String str2) {
                    try {
                        C66092c.this.f166831b.write(C66157f.m259066a("warn: ", str, str2));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
                    }
                }

                @Override // com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.ILogger
                public void logE(String str, String str2, Throwable th) {
                    try {
                        C66092c.this.f166831b.write(C66157f.m259066a("error: ", str, str2, th.getStackTrace()));
                    } catch (IOException e) {
                        AppBrandLogger.stacktrace(6, "tma_FeedbackALogger", e.getStackTrace());
                    }
                }
            });
        }
    }

    public C66092c(IAppContext iAppContext) {
        this.f166832c = iAppContext;
    }
}

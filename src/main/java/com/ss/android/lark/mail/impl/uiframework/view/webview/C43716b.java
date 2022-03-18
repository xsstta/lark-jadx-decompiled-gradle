package com.ss.android.lark.mail.impl.uiframework.view.webview;

import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import com.ss.android.lark.mail.impl.p2168g.C42150b;
import com.ss.android.lark.mail.impl.p2168g.p2170b.C42154a;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.b */
public class C43716b extends WebResourceResponse {

    /* renamed from: a */
    public Long f110940a;

    /* renamed from: b */
    private String f110941b;

    /* renamed from: c */
    private C43721e f110942c;

    public InputStream getData() {
        return new C43717a(this.f110941b, this.f110942c);
    }

    /* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.b$a */
    class C43717a extends InputStream {

        /* renamed from: b */
        private String f110944b;

        /* renamed from: c */
        private boolean f110945c;

        /* renamed from: d */
        private InputStream f110946d;

        /* renamed from: e */
        private C43721e f110947e;

        /* renamed from: a */
        private void m173333a() {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f110947e.mo155841a(this.f110944b, new C43721e.AbstractC43724a() {
                /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43716b.C43717a.C437181 */

                @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                /* renamed from: b */
                public void mo155837b() {
                }

                @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                /* renamed from: a */
                public void mo155835a() {
                    countDownLatch.countDown();
                }

                @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43721e.AbstractC43724a
                /* renamed from: a */
                public void mo155836a(String str, int i) {
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (!this.f110945c) {
                try {
                    m173333a();
                    C42154a.C42160c a = C42150b.m168218a().mo152116b().mo152120a(this.f110947e.mo155838a());
                    if (a != null) {
                        this.f110946d = a.mo152144a(0);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f110945c = true;
                if (C43716b.this.f110940a != null) {
                    C42187a.m168473a(SystemClock.uptimeMillis() - C43716b.this.f110940a.longValue(), false);
                }
            }
            InputStream inputStream = this.f110946d;
            if (inputStream != null) {
                return inputStream.read();
            }
            return -1;
        }

        public C43717a(String str, C43721e eVar) {
            this.f110944b = str;
            this.f110947e = eVar;
        }
    }

    public C43716b(String str, C43721e eVar, Long l) {
        super("*/*", "utf-8", null);
        this.f110941b = str;
        this.f110942c = eVar;
        this.f110940a = l;
    }
}

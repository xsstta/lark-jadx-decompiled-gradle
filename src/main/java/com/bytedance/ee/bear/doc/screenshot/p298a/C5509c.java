package com.bytedance.ee.bear.doc.screenshot.p298a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.ReturnResult;
import com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5504a;
import com.bytedance.ee.bear.screenshot.FastPngEncoder;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.screenshot.a.c */
public class C5509c {

    /* renamed from: a */
    public View f15674a;

    /* renamed from: b */
    public final String f15675b;

    /* renamed from: c */
    public final int f15676c;

    /* renamed from: d */
    public final int f15677d;

    /* renamed from: e */
    public final int f15678e;

    /* renamed from: f */
    public final AbstractC5504a f15679f;

    /* renamed from: g */
    public float f15680g = 1.0f;

    /* renamed from: h */
    final C1177w<Boolean> f15681h;

    /* renamed from: i */
    public final BlockingQueue<C5516b> f15682i = new ArrayBlockingQueue(5);

    /* renamed from: j */
    private Future<?> f15683j;

    /* renamed from: k */
    private Future<?> f15684k;

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.a.c$b */
    private static class C5516b {

        /* renamed from: a */
        public boolean f15696a;

        /* renamed from: b */
        public Bitmap f15697b;

        /* renamed from: c */
        public int f15698c;

        /* renamed from: d */
        public int f15699d;

        private C5516b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.screenshot.a.c$c */
    public static class C5517c implements IAttachToBitmapCallback {

        /* renamed from: a */
        private volatile Bitmap f15700a;

        /* renamed from: b */
        private volatile String f15701b;

        /* renamed from: c */
        private final CountDownLatch f15702c;

        /* renamed from: a */
        public String mo22024a() {
            return this.f15701b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Bitmap mo22025b() {
            return this.f15700a;
        }

        public C5517c(CountDownLatch countDownLatch) {
            this.f15702c = countDownLatch;
        }

        @Override // com.ss.android.lark.watermark.core.IAttachToBitmapCallback
        public void onAttachSuccess(Bitmap bitmap) {
            this.f15700a = bitmap;
            this.f15702c.countDown();
        }

        @Override // com.ss.android.lark.watermark.core.IAttachToBitmapCallback
        public void onAttachFailed(Bitmap bitmap, String str) {
            this.f15700a = null;
            this.f15701b = str;
            this.f15702c.countDown();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.screenshot.a.c$a */
    public static class RunnableC5515a implements Runnable {

        /* renamed from: a */
        public Bitmap f15693a;

        /* renamed from: b */
        private CountDownLatch f15694b;

        /* renamed from: c */
        private View f15695c;

        public void run() {
            this.f15693a = C5508b.m22411a(this.f15695c);
            this.f15694b.countDown();
        }

        public RunnableC5515a(CountDownLatch countDownLatch, View view) {
            this.f15694b = countDownLatch;
            this.f15695c = view;
        }
    }

    /* renamed from: b */
    public void mo22014b() {
        C13479a.m54764b("Screenshot", "stopScreenShot()...");
        mo22017e();
    }

    /* renamed from: c */
    public void mo22015c() {
        BearExecutors.m48468c().execute(new Runnable() {
            /* class com.bytedance.ee.bear.doc.screenshot.p298a.C5509c.RunnableC55123 */

            public void run() {
                C5509c.this.mo22017e();
                File file = new File(C5509c.this.f15675b);
                if (file.exists()) {
                    C5509c.this.f15679f.mo21957a(file, C5509c.this.f15680g);
                } else {
                    C5509c.this.f15679f.mo21956a(-1, "File not exists!");
                }
            }
        });
    }

    /* renamed from: e */
    public void mo22017e() {
        this.f15683j.cancel(true);
        this.f15684k.cancel(true);
    }

    /* renamed from: a */
    public void mo22010a() {
        if (this.f15674a != null) {
            C13479a.m54764b("Screenshot", "start()...");
            this.f15679f.mo21955a();
            this.f15683j = BearExecutors.m48470e().submit(new Runnable() {
                /* class com.bytedance.ee.bear.doc.screenshot.p298a.C5509c.RunnableC55101 */

                public void run() {
                    for (int i = 0; i < C5509c.this.f15676c; i++) {
                        try {
                            C5509c.this.mo22011a(i);
                            Thread.sleep(500);
                            ReturnResult<Bitmap> d = C5509c.this.mo22016d();
                            if (d.mo30068a()) {
                                C5509c.this.mo22012a(d.mo30069b());
                                return;
                            }
                            C5516b bVar = new C5516b();
                            boolean z = true;
                            if (i < C5509c.this.f15676c - 1) {
                                z = false;
                            }
                            bVar.f15696a = z;
                            bVar.f15697b = d.mo30070c();
                            bVar.f15698c = 0;
                            if (bVar.f15696a && C5509c.this.f15678e > 0) {
                                bVar.f15698c = bVar.f15697b.getHeight() - C5509c.this.f15678e;
                            }
                            bVar.f15699d = bVar.f15697b.getHeight();
                            C5509c.this.f15682i.put(bVar);
                        } catch (InterruptedException unused) {
                            C13479a.m54775e("Screenshot", "Bitmap generate task is interrupted!");
                            return;
                        }
                    }
                }
            });
            this.f15684k = BearExecutors.m48470e().submit(new Runnable() {
                /* class com.bytedance.ee.bear.doc.screenshot.p298a.C5509c.RunnableC55112 */

                public void run() {
                    int i;
                    FastPngEncoder fastPngEncoder = null;
                    while (true) {
                        try {
                            C5516b take = C5509c.this.f15682i.take();
                            Bitmap bitmap = take.f15697b;
                            if (fastPngEncoder == null) {
                                if (C5509c.this.f15678e > 0) {
                                    i = ((C5509c.this.f15676c - 1) * bitmap.getHeight()) + C5509c.this.f15678e;
                                } else {
                                    i = C5509c.this.f15676c * bitmap.getHeight();
                                }
                                fastPngEncoder = new FastPngEncoder(C5509c.this.f15675b, bitmap.getWidth(), i);
                            }
                            ReturnResult<Bitmap> a = C5509c.this.mo22009a(bitmap);
                            if (a.mo30068a()) {
                                C5509c.this.mo22012a(a.mo30069b());
                                break;
                            }
                            Bitmap c = a.mo30070c();
                            if (take.f15696a) {
                                fastPngEncoder.mo40676a(c, take.f15698c, take.f15699d);
                                C5509c.this.mo22015c();
                                break;
                            }
                            fastPngEncoder.mo40675a(c);
                        } catch (InterruptedException e) {
                            C13479a.m54773d("Screenshot", "Png encode task is interrupted!", e);
                        }
                    }
                    if (fastPngEncoder != null) {
                        fastPngEncoder.mo40674a();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public ReturnResult<Bitmap> mo22016d() throws InterruptedException {
        long j;
        if (this.f15674a == null) {
            return ReturnResult.m30668a((Throwable) new NullPointerException("mView is null!"));
        }
        Bitmap bitmap = null;
        for (int i = 0; i < 8; i++) {
            if (i == 0) {
                j = 0;
            } else {
                j = 200;
            }
            bitmap = m22413a(j);
            if (!(bitmap == null || FastPngEncoder.m44576b(bitmap))) {
                return ReturnResult.m30667a(bitmap);
            }
        }
        if (bitmap == null) {
            return ReturnResult.m30668a(new Throwable("bitmap is null"));
        }
        C13479a.m54758a("Screenshot", "isBitmapAnyLineBlackOrWhite fail");
        return ReturnResult.m30667a(bitmap);
    }

    /* renamed from: a */
    public void mo22012a(final Throwable th) {
        BearExecutors.m48468c().execute(new Runnable() {
            /* class com.bytedance.ee.bear.doc.screenshot.p298a.C5509c.RunnableC55134 */

            public void run() {
                C13479a.m54761a("Screenshot", th);
                C5509c.this.mo22017e();
                C5509c.this.f15679f.mo21956a(-1, C5509c.this.mo22013b(th));
            }
        });
    }

    /* renamed from: a */
    private Bitmap m22413a(long j) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RunnableC5515a aVar = new RunnableC5515a(countDownLatch, this.f15674a);
        C13742g.m55706a(aVar, j);
        countDownLatch.await();
        return aVar.f15693a;
    }

    /* renamed from: b */
    public String mo22013b(Throwable th) {
        String message = th.getMessage();
        if (!TextUtils.isEmpty(message)) {
            return message;
        }
        String str = th.toString() + " ";
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length <= 0) {
            return str;
        }
        return str + stackTrace[0];
    }

    /* renamed from: a */
    public ReturnResult<Bitmap> mo22009a(Bitmap bitmap) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C5517c cVar = new C5517c(countDownLatch);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40645a(bitmap, cVar);
        countDownLatch.await();
        Bitmap b = cVar.mo22025b();
        if (b != null) {
            return ReturnResult.m30667a(b);
        }
        return ReturnResult.m30668a((Throwable) new RuntimeException("addWatermark fail: " + cVar.mo22024a()));
    }

    /* renamed from: a */
    public void mo22011a(final int i) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        BearExecutors.m48468c().execute(new Runnable() {
            /* class com.bytedance.ee.bear.doc.screenshot.p298a.C5509c.RunnableC55145 */

            public void run() {
                if (C5509c.this.f15674a != null) {
                    C5509c.this.f15674a.scrollTo(0, i * C5509c.this.f15677d);
                }
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
    }

    public C5509c(WebView webView, String str, AbstractC5504a aVar, int i, int i2, int i3, C1177w<Boolean> wVar) {
        Objects.requireNonNull(str);
        this.f15675b = str;
        Objects.requireNonNull(aVar);
        this.f15679f = aVar;
        int i4 = i2 % i3;
        this.f15678e = i4;
        if (i4 != 0) {
            this.f15676c = (i2 / i3) + 1;
        } else {
            this.f15676c = i2 / i3;
        }
        this.f15677d = i3;
        if (webView == null) {
            mo22012a(new Throwable("Webview in IWebview is null!"));
        } else {
            this.f15674a = webView;
            this.f15680g = ((float) (i - (webView.getResources().getDimensionPixelSize(R.dimen.doc_shot_padding) * 2))) / ((float) i);
        }
        Objects.requireNonNull(wVar);
        this.f15681h = wVar;
    }
}

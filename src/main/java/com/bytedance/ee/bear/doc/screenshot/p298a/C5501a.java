package com.bytedance.ee.bear.doc.screenshot.p298a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.doc.screenshot.p298a.C5501a;
import com.bytedance.ee.bear.doc.screenshot.p298a.p299a.AbstractC5504a;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.screenshot.a.a */
public class C5501a implements Handler.Callback {

    /* renamed from: a */
    public int f15637a;

    /* renamed from: b */
    public Bitmap f15638b;

    /* renamed from: c */
    public Handler f15639c;

    /* renamed from: d */
    C1177w<Boolean> f15640d;

    /* renamed from: e */
    private Context f15641e;

    /* renamed from: f */
    private WebView f15642f;

    /* renamed from: g */
    private String f15643g;

    /* renamed from: h */
    private int f15644h;

    /* renamed from: i */
    private int f15645i;

    /* renamed from: j */
    private int f15646j;

    /* renamed from: k */
    private int f15647k;

    /* renamed from: l */
    private AbstractC5504a f15648l;

    /* renamed from: m */
    private float f15649m;

    /* renamed from: n */
    private Disposable f15650n;

    /* renamed from: a */
    public void m22376b(Throwable th) {
        C13479a.m54761a("Screenshot", th);
        m22380d();
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = th.toString() + " ";
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                message = message + stackTrace[0];
            }
        }
        AbstractC5504a aVar = this.f15648l;
        if (aVar != null) {
            aVar.mo21956a(-1, message);
        }
    }

    /* renamed from: d */
    private void m22380d() {
        Bitmap bitmap = this.f15638b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f15638b.recycle();
        }
    }

    /* renamed from: b */
    public void mo21986b() {
        C13479a.m54764b("Screenshot", "stopScreenShot()...");
        m22380d();
        this.f15639c.removeCallbacksAndMessages(null);
        Disposable disposable = this.f15650n;
        if (disposable != null && !disposable.isDisposed()) {
            this.f15650n.dispose();
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.screenshot.a.a$a */
    public static class C5503a {

        /* renamed from: a */
        public Context f15654a;

        /* renamed from: b */
        public WebView f15655b;

        /* renamed from: c */
        public String f15656c;

        /* renamed from: d */
        public AbstractC5504a f15657d;

        /* renamed from: e */
        public C1177w<Boolean> f15658e;

        /* renamed from: f */
        public int f15659f;

        /* renamed from: g */
        public int f15660g;

        /* renamed from: h */
        public int f15661h;

        /* renamed from: a */
        public C5501a mo21995a() {
            return new C5501a(this);
        }

        /* renamed from: a */
        public C5503a mo21990a(int i) {
            this.f15659f = i;
            return this;
        }

        /* renamed from: b */
        public C5503a mo21996b(int i) {
            this.f15660g = i;
            return this;
        }

        /* renamed from: c */
        public C5503a mo21997c(int i) {
            this.f15661h = i;
            return this;
        }

        public C5503a(Context context) {
            this.f15654a = context;
        }

        /* renamed from: a */
        public C5503a mo21991a(WebView webView) {
            this.f15655b = webView;
            return this;
        }

        /* renamed from: a */
        public C5503a mo21992a(C1177w<Boolean> wVar) {
            this.f15658e = wVar;
            return this;
        }

        /* renamed from: a */
        public C5503a mo21993a(AbstractC5504a aVar) {
            this.f15657d = aVar;
            return this;
        }

        /* renamed from: a */
        public C5503a mo21994a(String str) {
            this.f15656c = str;
            return this;
        }
    }

    /* renamed from: c */
    private void m22378c() {
        int i;
        if (this.f15637a > 0) {
            i = this.f15647k + 1;
        } else {
            i = this.f15647k;
        }
        this.f15649m = ((((float) this.f15645i) * 1.0f) - ((float) (this.f15641e.getResources().getDimensionPixelSize(R.dimen.doc_shot_padding) * 2))) / ((float) this.f15645i);
        AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$hnMUREfZorb0KVaIoZhO9LG1MAI */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5501a.this.m22377c((C5501a) ((Integer) obj));
            }
        }).mo238001b($$Lambda$a$q4JMziCjdT_vRrUi35nfcMMrmQ.INSTANCE, $$Lambda$a$8J_quZvdmG5B7U5wAI4DjZBqXRc.INSTANCE);
    }

    /* renamed from: a */
    public void mo21983a() {
        long j;
        long j2;
        int i = this.f15644h;
        int i2 = this.f15646j;
        int i3 = i / i2;
        this.f15647k = i3;
        this.f15637a = i - (i3 * i2);
        if (Build.VERSION.SDK_INT < 26) {
            j2 = C13653a.m55405i();
            j = 50;
        } else {
            j2 = C13653a.m55406j();
            j = 100;
        }
        long j3 = (long) ((((this.f15645i * this.f15644h) * 2) / 1024) / 1024);
        C13479a.m54764b("Screenshot", "start() contentHeight = " + this.f15644h + ", height = " + this.f15646j + ", width = " + this.f15645i + ", totalScrollCount = " + this.f15647k + ", size = " + j3 + ", remindMemory = " + j2);
        if (j2 <= 0 || j3 < j2 - j) {
            try {
                this.f15638b = Bitmap.createBitmap(this.f15645i, this.f15644h, Bitmap.Config.RGB_565);
                m22378c();
            } catch (Throwable th) {
                C13479a.m54761a("Screenshot", th);
                m22376b(th);
            }
        } else {
            m22376b(new Throwable("img too large, return failed, remind memory:" + j2));
        }
    }

    /* renamed from: a */
    private File m22370a(Bitmap bitmap) {
        if (!TextUtils.isEmpty(this.f15643g)) {
            return C5627ab.m22835a(this.f15641e, bitmap, new File(this.f15643g), false, Bitmap.CompressFormat.PNG);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m22375b(Integer num) throws Exception {
        C13479a.m54764b("Screenshot", "longScreenshot()... count = " + num);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ Integer m22377c(Integer num) throws Exception {
        AbstractC5504a aVar = this.f15648l;
        if (aVar != null) {
            aVar.mo21955a();
        }
        m22374a(false);
        mo21984a(0, num.intValue());
        return num;
    }

    private C5501a(C5503a aVar) {
        this.f15643g = "";
        this.f15641e = aVar.f15654a;
        this.f15642f = aVar.f15655b;
        this.f15643g = aVar.f15656c;
        this.f15648l = aVar.f15657d;
        this.f15645i = aVar.f15659f;
        this.f15644h = aVar.f15660g;
        this.f15646j = aVar.f15661h;
        this.f15640d = aVar.f15658e;
        this.f15639c = new Handler(Looper.getMainLooper(), this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ File m22371a(Integer num) throws Exception {
        File a = m22370a(this.f15638b);
        m22380d();
        C13479a.m54772d("Screenshot", "longScreenshot()... success");
        return a;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            final int i2 = message.arg1;
            final int i3 = message.arg2;
            WebView webView = this.f15642f;
            if (webView != null) {
                Bitmap a = C5508b.m22411a(webView);
                if (a == null) {
                    m22376b(new Throwable("drawing cache is null"));
                    return false;
                }
                ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40645a(a, new IAttachToBitmapCallback() {
                    /* class com.bytedance.ee.bear.doc.screenshot.p298a.C5501a.C55021 */

                    /* access modifiers changed from: private */
                    /* access modifiers changed from: public */
                    /* renamed from: a */
                    private /* synthetic */ void m22386a(String str) {
                        C5501a aVar = C5501a.this;
                        aVar.m22376b(new RuntimeException("addWatermark fail" + str));
                    }

                    @Override // com.ss.android.lark.watermark.core.IAttachToBitmapCallback
                    public void onAttachSuccess(Bitmap bitmap) {
                        if (C5501a.this.f15640d != null && C5501a.this.f15640d.mo5927b() != null && C5501a.this.f15640d.mo5927b().booleanValue()) {
                            C5508b.m22412a(C5501a.this.f15638b, bitmap, i3, i2, C5501a.this.f15637a);
                            int i = i2;
                            int i2 = i3;
                            if (i >= i2 - 1) {
                                Handler handler = C5501a.this.f15639c;
                                int i3 = i3;
                                handler.obtainMessage(2, i3, i3).sendToTarget();
                                return;
                            }
                            C13742g.m55711d(new Runnable(i, i2) {
                                /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$1$7pQuqblaTs20JUrMzXhZcwoz9E */
                                public final /* synthetic */ int f$1;
                                public final /* synthetic */ int f$2;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                public final void run() {
                                    C5501a.C55021.this.m22385a(this.f$1, this.f$2);
                                }
                            });
                        }
                    }

                    /* access modifiers changed from: private */
                    /* access modifiers changed from: public */
                    /* renamed from: a */
                    private /* synthetic */ void m22385a(int i, int i2) {
                        C5501a.this.mo21984a(i + 1, i2);
                    }

                    @Override // com.ss.android.lark.watermark.core.IAttachToBitmapCallback
                    public void onAttachFailed(Bitmap bitmap, String str) {
                        C13742g.m55711d(new Runnable(str) {
                            /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$1$cMRN6fZhfR2xyeUf28dOkSEN5Xw */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C5501a.C55021.this.m22386a(this.f$1);
                            }
                        });
                    }
                });
            } else {
                m22376b(new IllegalStateException("web view null"));
            }
        } else if (i == 2) {
            m22374a(true);
            this.f15650n = AbstractC68307f.m265083a(Integer.valueOf(message.arg1)).mo237985a(C11678b.m48480d()).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$OhiYFquh2qTbALRI9n2SQhqi3eM */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C5501a.this.m22371a((C5501a) ((Integer) obj));
                }
            }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$ZF6IsLwIZUPP1NA2cSKljt4ScCQ */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5501a.this.m22373a((C5501a) ((File) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$etckQ_5aDwwQyz7AMB5Zc40jck */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5501a.this.m22376b((C5501a) ((Throwable) obj));
                }
            });
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22373a(File file) throws Exception {
        if (this.f15648l == null) {
            return;
        }
        if (file == null || !file.exists()) {
            this.f15648l.mo21956a(-1, "file not exists");
        } else {
            this.f15648l.mo21957a(file, this.f15649m);
        }
    }

    /* renamed from: a */
    private void m22374a(boolean z) {
        boolean isVerticalScrollBarEnabled = this.f15642f.isVerticalScrollBarEnabled();
        if (!z || !isVerticalScrollBarEnabled) {
            this.f15642f.setVerticalScrollBarEnabled(false);
        } else {
            this.f15642f.setVerticalScrollBarEnabled(true);
        }
    }

    /* renamed from: a */
    public void mo21984a(int i, int i2) {
        C13479a.m54764b("Screenshot", "captureCurrentPage()... index = " + i + ", count = " + i2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) 0);
        jSONObject.put("y", (Object) Integer.valueOf((int) ((((float) (this.f15646j * i)) / this.f15642f.getScale()) + 0.5f)));
        C11755a.m48726a(this.f15642f, "window.scrollToXY", jSONObject, new ValueCallback(i, i2) {
            /* class com.bytedance.ee.bear.doc.screenshot.p298a.$$Lambda$a$Wwb7EeP5m9vTBSH4V6fLnw29cdI */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C5501a.this.m22372a(this.f$1, this.f$2, (String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m22372a(int i, int i2, String str) {
        C13479a.m54764b("Screenshot", "captureCurrentPage().onReceiveValue()...index = " + i + ", totalCount = " + i2 + ", s = " + str);
        this.f15639c.sendMessageDelayed(this.f15639c.obtainMessage(1, i, i2), 200);
    }
}

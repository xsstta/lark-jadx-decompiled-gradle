package com.bytedance.ee.bear.slide.common.export.p551a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.slide.common.export.a.c */
public class C11398c implements Handler.Callback {

    /* renamed from: a */
    public Map<Integer, Bitmap> f30619a;

    /* renamed from: b */
    public Handler f30620b;

    /* renamed from: c */
    private Context f30621c;

    /* renamed from: d */
    private WebView f30622d;

    /* renamed from: e */
    private String f30623e;

    /* renamed from: f */
    private int f30624f;

    /* renamed from: g */
    private int f30625g;

    /* renamed from: h */
    private int f30626h;

    /* renamed from: i */
    private int f30627i;

    /* renamed from: j */
    private int f30628j;

    /* renamed from: k */
    private int f30629k;

    /* renamed from: l */
    private AbstractC11401d f30630l;

    /* renamed from: m */
    private boolean f30631m;

    /* renamed from: n */
    private C68289a f30632n;

    /* renamed from: a */
    public void mo43648a(Throwable th) {
        C13479a.m54759a("SlideScreenshot", "onShotFail()...", th);
        m47338e();
        AbstractC11401d dVar = this.f30630l;
        if (dVar != null) {
            dVar.mo43661b();
        }
        m47337d();
    }

    /* renamed from: a */
    public void mo43647a(int i, int i2) {
        C13479a.m54764b("SlideScreenshot", "captureCurrentPage()... index = " + i + ", count = " + i2);
        $$Lambda$c$iRTQDGjOza7keA7bT98FJx2QSuc r1 = new ValueCallback(i, i2) {
            /* class com.bytedance.ee.bear.slide.common.export.p551a.$$Lambda$c$iRTQDGjOza7keA7bT98FJx2QSuc */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C11398c.this.m47330a(this.f$1, this.f$2, (String) obj);
            }
        };
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) 0);
        jSONObject.put("y", (Object) Integer.valueOf((int) ((((float) (this.f30626h * i)) / this.f30622d.getScale()) + 0.5f)));
        C11755a.m48726a(this.f30622d, "javascript:window.scrollToXY", jSONObject, r1);
    }

    /* renamed from: d */
    private void m47337d() {
        WebView webView = this.f30622d;
        if (webView != null) {
            webView.setScrollY(this.f30627i);
        }
    }

    /* renamed from: com.bytedance.ee.bear.slide.common.export.a.c$a */
    public static class C11400a {

        /* renamed from: a */
        public Context f30636a;

        /* renamed from: b */
        public WebView f30637b;

        /* renamed from: c */
        public String f30638c;

        /* renamed from: d */
        public AbstractC11401d f30639d;

        /* renamed from: e */
        public int f30640e;

        /* renamed from: f */
        public int f30641f;

        /* renamed from: g */
        public int f30642g;

        /* renamed from: h */
        public int f30643h;

        /* renamed from: a */
        public C11398c mo43655a() {
            return new C11398c(this);
        }

        /* renamed from: a */
        public C11400a mo43651a(int i) {
            this.f30640e = i;
            return this;
        }

        /* renamed from: b */
        public C11400a mo43656b(int i) {
            this.f30641f = i;
            return this;
        }

        /* renamed from: c */
        public C11400a mo43657c(int i) {
            this.f30642g = i;
            return this;
        }

        /* renamed from: d */
        public C11400a mo43658d(int i) {
            this.f30643h = i;
            return this;
        }

        public C11400a(Context context) {
            this.f30636a = context;
        }

        /* renamed from: a */
        public C11400a mo43652a(WebView webView) {
            this.f30637b = webView;
            return this;
        }

        /* renamed from: a */
        public C11400a mo43653a(AbstractC11401d dVar) {
            this.f30639d = dVar;
            return this;
        }

        /* renamed from: a */
        public C11400a mo43654a(String str) {
            this.f30638c = str;
            return this;
        }
    }

    /* renamed from: c */
    private void m47336c() {
        int i = this.f30628j;
        if (this.f30629k > 0) {
            i++;
        }
        this.f30632n.mo237937a(AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.slide.common.export.p551a.$$Lambda$c$cLRyoKYzfcKbsrPJZiH8sWVfgJE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C11398c.this.m47334b((Integer) obj);
            }
        }).mo238001b($$Lambda$c$e8f5hiU8uBpozUCxVnXvQ_BuNM.INSTANCE, $$Lambda$c$fMs_UimaYUYfcuueoTR1nmsfz0.INSTANCE));
    }

    /* renamed from: e */
    private void m47338e() {
        C13479a.m54764b("SlideScreenshot", "clearBitmapCache()...");
        for (Map.Entry<Integer, Bitmap> entry : this.f30619a.entrySet()) {
            Bitmap value = entry.getValue();
            if (value != null && !value.isRecycled()) {
                value.recycle();
            }
        }
        this.f30619a.clear();
    }

    /* renamed from: b */
    public void mo43649b() {
        C13479a.m54764b("SlideScreenshot", "stopScreenShot()...");
        this.f30631m = true;
        this.f30632n.mo237935a();
        m47338e();
        this.f30620b.removeCallbacksAndMessages(null);
        m47337d();
    }

    /* renamed from: a */
    public void mo43646a() {
        int i = this.f30624f;
        int i2 = this.f30626h;
        int i3 = i / i2;
        this.f30628j = i3;
        this.f30629k = i - (i3 * i2);
        C13479a.m54764b("SlideScreenshot", "start() mContentHeight" + this.f30624f + ", mHeight = " + this.f30626h + ", mTotalScrollCount = " + this.f30628j + ", mTotalScrollCount = " + this.f30628j);
        m47336c();
    }

    /* renamed from: a */
    private File m47328a(Bitmap bitmap) {
        if (!TextUtils.isEmpty(this.f30623e)) {
            return C5627ab.m22834a(this.f30621c, bitmap, new File(this.f30623e), false);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ Integer m47334b(Integer num) throws Exception {
        AbstractC11401d dVar = this.f30630l;
        if (dVar != null) {
            dVar.mo43659a();
        }
        this.f30619a.clear();
        m47333a(false);
        mo43647a(0, num.intValue());
        return num;
    }

    private C11398c(C11400a aVar) {
        this.f30621c = aVar.f30636a;
        this.f30622d = aVar.f30637b;
        this.f30623e = aVar.f30638c;
        this.f30630l = aVar.f30639d;
        this.f30625g = aVar.f30640e;
        this.f30624f = aVar.f30641f;
        this.f30626h = aVar.f30642g;
        this.f30627i = aVar.f30643h;
        this.f30619a = new TreeMap($$Lambda$fHoLnO9UkUnjJx5OtFsyItKQHwA.INSTANCE);
        this.f30620b = new Handler(Looper.getMainLooper(), this);
        this.f30632n = new C68289a();
        this.f30631m = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m47331a(Integer num) throws Exception {
        C13479a.m54764b("SlideScreenshot", "longScreenshot()... count = " + num);
    }

    public boolean handleMessage(Message message) {
        if (this.f30631m) {
            m47337d();
            return false;
        }
        int i = message.what;
        if (i == 1) {
            final int i2 = message.arg1;
            final int i3 = message.arg2;
            WebView webView = this.f30622d;
            if (webView != null) {
                try {
                    ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40645a(C11402e.m47354a(webView), new IAttachToBitmapCallback() {
                        /* class com.bytedance.ee.bear.slide.common.export.p551a.C11398c.C113991 */

                        @Override // com.ss.android.lark.watermark.core.IAttachToBitmapCallback
                        public void onAttachSuccess(Bitmap bitmap) {
                            C11398c.this.f30619a.put(Integer.valueOf(i2), bitmap);
                            int i = i2;
                            int i2 = i3;
                            if (i == i2 - 1) {
                                Handler handler = C11398c.this.f30620b;
                                int i3 = i3;
                                handler.obtainMessage(2, i3, i3).sendToTarget();
                                return;
                            }
                            C11398c.this.mo43647a(i + 1, i2);
                        }

                        @Override // com.ss.android.lark.watermark.core.IAttachToBitmapCallback
                        public void onAttachFailed(Bitmap bitmap, String str) {
                            C11398c cVar = C11398c.this;
                            cVar.mo43648a(new RuntimeException("addWatermark fail" + str));
                        }
                    });
                } catch (OutOfMemoryError e) {
                    mo43648a(e);
                }
            } else {
                mo43648a(new IllegalStateException("WebView is null"));
            }
        } else if (i == 2) {
            m47333a(true);
            int i4 = message.arg1;
            ArrayList arrayList = new ArrayList();
            AbstractC68307f.m265083a(Integer.valueOf(i4)).mo237985a(C11678b.m48480d()).mo238020d(new Function(arrayList) {
                /* class com.bytedance.ee.bear.slide.common.export.p551a.$$Lambda$c$eYAYb2Jw5BNsOxx5FVyifNT8rA */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C11398c.this.m47329a(this.f$1, (Integer) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(arrayList) {
                /* class com.bytedance.ee.bear.slide.common.export.p551a.$$Lambda$c$sd7mRCjuEXd8MKwPuhOQgSeIvjk */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11398c.this.m47332a((C11398c) this.f$1, (List) ((File) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.slide.common.export.p551a.$$Lambda$kMICj8R2fPH9UxmQdAojzBSovg */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11398c.this.mo43648a((Throwable) obj);
                }
            });
        }
        return false;
    }

    /* renamed from: a */
    private void m47333a(boolean z) {
        boolean isVerticalScrollBarEnabled = this.f30622d.isVerticalScrollBarEnabled();
        if (!z || !isVerticalScrollBarEnabled) {
            this.f30622d.setVerticalScrollBarEnabled(false);
        } else {
            this.f30622d.setVerticalScrollBarEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ File m47329a(List list, Integer num) throws Exception {
        for (Map.Entry<Integer, Bitmap> entry : this.f30619a.entrySet()) {
            list.add(entry.getValue());
        }
        Bitmap a = C11402e.m47355a(list, this.f30624f, this.f30629k);
        if (this.f30629k > 0) {
            Bitmap bitmap = (Bitmap) list.get(list.size() - 1);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), this.f30629k, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, new Rect(0, bitmap.getHeight() - this.f30629k, bitmap.getWidth(), bitmap.getHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) this.f30629k), paint);
            list.remove(list.get(list.size() - 1));
            list.add(createBitmap);
        }
        C13479a.m54772d("SlideScreenshot", "longScreenshot()... success");
        File a2 = m47328a(a);
        if (a != null && !a.isRecycled()) {
            a.recycle();
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47332a(List list, File file) throws Exception {
        if (this.f30630l != null) {
            if (file == null || !file.exists()) {
                this.f30630l.mo43661b();
            } else {
                this.f30630l.mo43660a(file, list);
            }
        }
        m47337d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47330a(int i, int i2, String str) {
        C13479a.m54764b("SlideScreenshot", "captureCurrentPage().onReceiveValue()...index = " + i + ", totalCount = " + i2 + ", s = " + str);
        this.f30620b.sendMessageDelayed(this.f30620b.obtainMessage(1, i, i2), 200);
    }
}

package com.ss.android.lark.browser.biz.basic.jsapi.p1414a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.biz.basic.jsapi.p1414a.p1415a.AbstractC29655a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.a.a */
public class C29645a implements Handler.Callback {

    /* renamed from: a */
    public int f74316a;

    /* renamed from: b */
    public int f74317b;

    /* renamed from: c */
    public AbstractC29655a f74318c;

    /* renamed from: d */
    public Map<Integer, Bitmap> f74319d;

    /* renamed from: e */
    public Handler f74320e;

    /* renamed from: f */
    public float f74321f;

    /* renamed from: g */
    private Context f74322g;

    /* renamed from: h */
    private WebView f74323h;

    /* renamed from: i */
    private String f74324i;

    /* renamed from: j */
    private int f74325j;

    /* renamed from: k */
    private int f74326k;

    /* renamed from: l */
    private int f74327l;

    /* renamed from: m */
    private int f74328m;

    /* renamed from: n */
    private LKUIStatus f74329n;

    /* renamed from: b */
    public void mo106878b() {
        this.f74329n.mo89849f();
        this.f74323h.scrollTo(0, this.f74328m);
    }

    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.a.a$a */
    public static class C29654a {

        /* renamed from: a */
        public Context f74340a;

        /* renamed from: b */
        public WebView f74341b;

        /* renamed from: c */
        public String f74342c;

        /* renamed from: d */
        public AbstractC29655a f74343d;

        /* renamed from: e */
        public int f74344e;

        /* renamed from: f */
        public int f74345f;

        /* renamed from: g */
        public int f74346g;

        /* renamed from: a */
        public C29645a mo106894a() {
            return new C29645a(this);
        }

        /* renamed from: a */
        public C29654a mo106890a(int i) {
            this.f74344e = i;
            return this;
        }

        /* renamed from: b */
        public C29654a mo106895b(int i) {
            this.f74345f = i;
            return this;
        }

        /* renamed from: c */
        public C29654a mo106896c(int i) {
            this.f74346g = i;
            return this;
        }

        public C29654a(Context context) {
            this.f74340a = context;
        }

        /* renamed from: a */
        public C29654a mo106891a(WebView webView) {
            this.f74341b = webView;
            return this;
        }

        /* renamed from: a */
        public C29654a mo106892a(AbstractC29655a aVar) {
            this.f74343d = aVar;
            return this;
        }

        /* renamed from: a */
        public C29654a mo106893a(String str) {
            this.f74342c = str;
            return this;
        }
    }

    /* renamed from: c */
    private void m109720c() {
        int i = this.f74327l;
        if (this.f74317b > 0) {
            i++;
        }
        this.f74321f = ((((float) this.f74325j) * 1.0f) - ((float) (this.f74322g.getResources().getDimensionPixelSize(R.dimen.shot_padding) * 2))) / ((float) this.f74325j);
        AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(LarkRxSchedulers.mainThread()).mo238020d(new Function<Integer, Integer>() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296494 */

            /* renamed from: a */
            public Integer apply(Integer num) throws Exception {
                if (C29645a.this.f74318c != null) {
                    C29645a.this.f74318c.mo106897a();
                }
                C29645a.this.f74319d.clear();
                C29645a.this.mo106877a(false);
                C29645a.this.mo106875a(0, num.intValue());
                return num;
            }
        }).mo238001b(new Consumer<Integer>() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296472 */

            /* renamed from: a */
            public void accept(Integer num) throws Exception {
                Log.m165389i("Screenshot", "longScreenshot()... count = " + num);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296483 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                Log.m165386e("Screenshot", th);
            }
        });
    }

    /* renamed from: a */
    public void mo106874a() {
        int i = this.f74316a;
        int i2 = this.f74326k;
        int i3 = i / i2;
        this.f74327l = i3;
        this.f74317b = i - (i3 * i2);
        this.f74328m = this.f74323h.getScrollY();
        Log.m165389i("Screenshot", "start() mContentHeight" + this.f74316a + ", mHeight = " + this.f74326k + ", mTotalScrollCount = " + this.f74327l + ", mTotalScrollCount = " + this.f74327l);
        LKUIStatus a = new LKUIStatus.C25680a((ViewGroup) this.f74323h.getParent()).mo89859a();
        this.f74329n = a;
        a.mo89837a();
        m109720c();
    }

    /* renamed from: a */
    public void mo106876a(Throwable th) {
        mo106878b();
        this.f74319d.clear();
        AbstractC29655a aVar = this.f74318c;
        if (aVar != null) {
            aVar.mo106898a(-1, th.getMessage());
        }
    }

    private C29645a(C29654a aVar) {
        this.f74324i = "";
        this.f74322g = aVar.f74340a;
        this.f74323h = aVar.f74341b;
        this.f74324i = aVar.f74342c;
        this.f74318c = aVar.f74343d;
        this.f74325j = aVar.f74344e;
        this.f74316a = aVar.f74345f;
        this.f74326k = aVar.f74346g;
        this.f74319d = new TreeMap(new Comparator<Integer>() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296461 */

            /* renamed from: a */
            public int compare(Integer num, Integer num2) {
                return num.compareTo(num2);
            }
        });
        this.f74320e = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public void mo106877a(boolean z) {
        boolean isVerticalScrollBarEnabled = this.f74323h.isVerticalScrollBarEnabled();
        if (!z || !isVerticalScrollBarEnabled) {
            this.f74323h.setVerticalScrollBarEnabled(false);
        } else {
            this.f74323h.setVerticalScrollBarEnabled(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC, Splitter:B:18:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo106873a(android.graphics.Bitmap r6) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.mo106873a(android.graphics.Bitmap):java.io.File");
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            WebView webView = this.f74323h;
            if (webView != null) {
                this.f74319d.put(Integer.valueOf(message.arg1), C29656b.m109745a(webView));
                if (i2 == i3 - 1) {
                    this.f74320e.obtainMessage(2, i3, i3).sendToTarget();
                } else {
                    mo106875a(message.arg1 + 1, message.arg2);
                }
            } else {
                mo106876a(new IllegalStateException("web view null"));
            }
        } else if (i == 2) {
            mo106877a(true);
            AbstractC68307f.m265083a(Integer.valueOf(message.arg1)).mo237985a(LarkRxSchedulers.computation()).mo238020d(new Function<Integer, File>() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296527 */

                /* renamed from: a */
                public File apply(Integer num) throws Exception {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<Integer, Bitmap> entry : C29645a.this.f74319d.entrySet()) {
                        arrayList.add(entry.getValue());
                    }
                    Bitmap a = C29656b.m109746a(arrayList, C29645a.this.f74316a, C29645a.this.f74317b, C29645a.this.f74321f);
                    Log.m165379d("Screenshot", "longScreenshot()... success");
                    return C29645a.this.mo106873a(a);
                }
            }).mo237985a(LarkRxSchedulers.mainThread()).mo238001b(new Consumer<File>() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296505 */

                /* renamed from: a */
                public void accept(File file) throws Exception {
                    C29645a.this.mo106878b();
                    if (C29645a.this.f74318c == null) {
                        return;
                    }
                    if (file == null || !file.exists()) {
                        C29645a.this.f74318c.mo106898a(-1, "");
                    } else {
                        C29645a.this.f74318c.mo106899a(file);
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296516 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C29645a.this.mo106876a(th);
                }
            });
        } else if (i == 3) {
            mo106878b();
        }
        return true;
    }

    /* renamed from: a */
    public void mo106875a(final int i, final int i2) {
        Log.m165389i("Screenshot", "captureCurrentPage()... index = " + i + ", count = " + i2);
        String format = String.format("javascript:window.scrollTo(%d, %d)", 0, Integer.valueOf((int) ((((float) (this.f74326k * i)) / this.f74323h.getScale()) + 0.5f)));
        if (Build.VERSION.SDK_INT >= 19) {
            this.f74323h.evaluateJavascript(format, new ValueCallback<String>() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29645a.C296538 */

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    Log.m165383e("Screenshot", "captureCurrentPage().onReceiveValue()...index = " + i + ", totalCount = " + i2 + ", s = " + str);
                    C29645a.this.f74320e.sendMessageDelayed(C29645a.this.f74320e.obtainMessage(1, i, i2), 200);
                }
            });
            return;
        }
        this.f74323h.loadUrl(format);
        this.f74320e.sendMessageDelayed(this.f74320e.obtainMessage(1, i, i2), 200);
    }
}

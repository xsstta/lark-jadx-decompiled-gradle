package com.ss.android.lark.apihandler.basic.jsapi.p1350a;

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
import com.ss.android.lark.apihandler.basic.jsapi.p1350a.p1351a.AbstractC28720a;
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

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.a.a */
public class C28710a implements Handler.Callback {

    /* renamed from: a */
    public int f72248a;

    /* renamed from: b */
    public int f72249b;

    /* renamed from: c */
    public AbstractC28720a f72250c;

    /* renamed from: d */
    public Map<Integer, Bitmap> f72251d;

    /* renamed from: e */
    public Handler f72252e;

    /* renamed from: f */
    public float f72253f;

    /* renamed from: g */
    private Context f72254g;

    /* renamed from: h */
    private WebView f72255h;

    /* renamed from: i */
    private String f72256i;

    /* renamed from: j */
    private int f72257j;

    /* renamed from: k */
    private int f72258k;

    /* renamed from: l */
    private int f72259l;

    /* renamed from: m */
    private int f72260m;

    /* renamed from: n */
    private LKUIStatus f72261n;

    /* renamed from: b */
    public void mo102115b() {
        this.f72261n.mo89849f();
        this.f72255h.scrollTo(0, this.f72260m);
    }

    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.a.a$a */
    public static class C28719a {

        /* renamed from: a */
        public Context f72272a;

        /* renamed from: b */
        public WebView f72273b;

        /* renamed from: c */
        public String f72274c;

        /* renamed from: d */
        public AbstractC28720a f72275d;

        /* renamed from: e */
        public int f72276e;

        /* renamed from: f */
        public int f72277f;

        /* renamed from: g */
        public int f72278g;

        /* renamed from: a */
        public C28710a mo102131a() {
            return new C28710a(this);
        }

        /* renamed from: a */
        public C28719a mo102127a(int i) {
            this.f72276e = i;
            return this;
        }

        /* renamed from: b */
        public C28719a mo102132b(int i) {
            this.f72277f = i;
            return this;
        }

        /* renamed from: c */
        public C28719a mo102133c(int i) {
            this.f72278g = i;
            return this;
        }

        public C28719a(Context context) {
            this.f72272a = context;
        }

        /* renamed from: a */
        public C28719a mo102128a(WebView webView) {
            this.f72273b = webView;
            return this;
        }

        /* renamed from: a */
        public C28719a mo102129a(AbstractC28720a aVar) {
            this.f72275d = aVar;
            return this;
        }

        /* renamed from: a */
        public C28719a mo102130a(String str) {
            this.f72274c = str;
            return this;
        }
    }

    /* renamed from: c */
    private void m105270c() {
        int i = this.f72259l;
        if (this.f72249b > 0) {
            i++;
        }
        this.f72253f = ((((float) this.f72257j) * 1.0f) - ((float) (this.f72254g.getResources().getDimensionPixelSize(R.dimen.shot_padding) * 2))) / ((float) this.f72257j);
        AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(LarkRxSchedulers.mainThread()).mo238020d(new Function<Integer, Integer>() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287144 */

            /* renamed from: a */
            public Integer apply(Integer num) throws Exception {
                if (C28710a.this.f72250c != null) {
                    C28710a.this.f72250c.mo102134a();
                }
                C28710a.this.f72251d.clear();
                C28710a.this.mo102114a(false);
                C28710a.this.mo102112a(0, num.intValue());
                return num;
            }
        }).mo238001b(new Consumer<Integer>() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287122 */

            /* renamed from: a */
            public void accept(Integer num) throws Exception {
                Log.m165389i("Screenshot", "longScreenshot()... count = " + num);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287133 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                Log.m165386e("Screenshot", th);
            }
        });
    }

    /* renamed from: a */
    public void mo102111a() {
        int i = this.f72248a;
        int i2 = this.f72258k;
        int i3 = i / i2;
        this.f72259l = i3;
        this.f72249b = i - (i3 * i2);
        this.f72260m = this.f72255h.getScrollY();
        Log.m165389i("Screenshot", "start() mContentHeight" + this.f72248a + ", mHeight = " + this.f72258k + ", mTotalScrollCount = " + this.f72259l + ", mTotalScrollCount = " + this.f72259l);
        LKUIStatus a = new LKUIStatus.C25680a((ViewGroup) this.f72255h.getParent()).mo89859a();
        this.f72261n = a;
        a.mo89837a();
        m105270c();
    }

    /* renamed from: a */
    public void mo102113a(Throwable th) {
        mo102115b();
        this.f72251d.clear();
        AbstractC28720a aVar = this.f72250c;
        if (aVar != null) {
            aVar.mo102135a(-1, th.getMessage());
        }
    }

    private C28710a(C28719a aVar) {
        this.f72256i = "";
        this.f72254g = aVar.f72272a;
        this.f72255h = aVar.f72273b;
        this.f72256i = aVar.f72274c;
        this.f72250c = aVar.f72275d;
        this.f72257j = aVar.f72276e;
        this.f72248a = aVar.f72277f;
        this.f72258k = aVar.f72278g;
        this.f72251d = new TreeMap(new Comparator<Integer>() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287111 */

            /* renamed from: a */
            public int compare(Integer num, Integer num2) {
                return num.compareTo(num2);
            }
        });
        this.f72252e = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public void mo102114a(boolean z) {
        boolean isVerticalScrollBarEnabled = this.f72255h.isVerticalScrollBarEnabled();
        if (!z || !isVerticalScrollBarEnabled) {
            this.f72255h.setVerticalScrollBarEnabled(false);
        } else {
            this.f72255h.setVerticalScrollBarEnabled(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[SYNTHETIC, Splitter:B:18:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo102110a(android.graphics.Bitmap r6) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.mo102110a(android.graphics.Bitmap):java.io.File");
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            WebView webView = this.f72255h;
            if (webView != null) {
                this.f72251d.put(Integer.valueOf(message.arg1), C28721b.m105295a(webView));
                if (i2 == i3 - 1) {
                    this.f72252e.obtainMessage(2, i3, i3).sendToTarget();
                } else {
                    mo102112a(message.arg1 + 1, message.arg2);
                }
            } else {
                mo102113a(new IllegalStateException("web view null"));
            }
        } else if (i == 2) {
            mo102114a(true);
            AbstractC68307f.m265083a(Integer.valueOf(message.arg1)).mo237985a(LarkRxSchedulers.computation()).mo238020d(new Function<Integer, File>() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287177 */

                /* renamed from: a */
                public File apply(Integer num) throws Exception {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<Integer, Bitmap> entry : C28710a.this.f72251d.entrySet()) {
                        arrayList.add(entry.getValue());
                    }
                    Bitmap a = C28721b.m105296a(arrayList, C28710a.this.f72248a, C28710a.this.f72249b, C28710a.this.f72253f);
                    Log.m165379d("Screenshot", "longScreenshot()... success");
                    return C28710a.this.mo102110a(a);
                }
            }).mo237985a(LarkRxSchedulers.mainThread()).mo238001b(new Consumer<File>() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287155 */

                /* renamed from: a */
                public void accept(File file) throws Exception {
                    C28710a.this.mo102115b();
                    if (C28710a.this.f72250c == null) {
                        return;
                    }
                    if (file == null || !file.exists()) {
                        C28710a.this.f72250c.mo102135a(-1, "");
                    } else {
                        C28710a.this.f72250c.mo102136a(file);
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287166 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C28710a.this.mo102113a(th);
                }
            });
        } else if (i == 3) {
            mo102115b();
        }
        return true;
    }

    /* renamed from: a */
    public void mo102112a(final int i, final int i2) {
        Log.m165389i("Screenshot", "captureCurrentPage()... index = " + i + ", count = " + i2);
        String format = String.format("javascript:window.scrollTo(%d, %d)", 0, Integer.valueOf((int) ((((float) (this.f72258k * i)) / this.f72255h.getScale()) + 0.5f)));
        if (Build.VERSION.SDK_INT >= 19) {
            this.f72255h.evaluateJavascript(format, new ValueCallback<String>() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28710a.C287188 */

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    Log.m165383e("Screenshot", "captureCurrentPage().onReceiveValue()...index = " + i + ", totalCount = " + i2 + ", s = " + str);
                    C28710a.this.f72252e.sendMessageDelayed(C28710a.this.f72252e.obtainMessage(1, i, i2), 200);
                }
            });
            return;
        }
        this.f72255h.loadUrl(format);
        this.f72252e.sendMessageDelayed(this.f72252e.obtainMessage(1, i, i2), 200);
    }
}

package com.tt.miniapp.component.nativeview.picker.wheel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ee.larkbrand.utils.C13344e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.component.nativeview.picker.wheel.entity.WheelItem;
import com.tt.miniapphost.util.C67590h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WheelView extends View {

    /* renamed from: a */
    public static final int text_title = 2131101846;

    /* renamed from: b */
    public static final int text_placeholder = 2131101845;

    /* renamed from: c */
    public static final int line_divider_default = 2131100365;

    /* renamed from: A */
    private Typeface f166386A;

    /* renamed from: B */
    private int f166387B;

    /* renamed from: C */
    private int f166388C;

    /* renamed from: D */
    private C65932a f166389D;

    /* renamed from: E */
    private float f166390E;

    /* renamed from: F */
    private int f166391F;

    /* renamed from: G */
    private float f166392G;

    /* renamed from: H */
    private float f166393H;

    /* renamed from: I */
    private int f166394I;

    /* renamed from: J */
    private int f166395J;

    /* renamed from: K */
    private int f166396K;

    /* renamed from: L */
    private int f166397L;

    /* renamed from: M */
    private int f166398M;

    /* renamed from: N */
    private int f166399N;

    /* renamed from: O */
    private float f166400O;

    /* renamed from: P */
    private long f166401P;

    /* renamed from: Q */
    private int f166402Q;

    /* renamed from: R */
    private int f166403R;

    /* renamed from: S */
    private int f166404S;

    /* renamed from: T */
    private int f166405T;

    /* renamed from: U */
    private float f166406U;

    /* renamed from: V */
    private boolean f166407V;

    /* renamed from: W */
    private boolean f166408W;

    /* renamed from: d */
    public HandlerC65934c f166409d;

    /* renamed from: e */
    public AbstractC65935d f166410e;

    /* renamed from: f */
    public AbstractC65936e f166411f;

    /* renamed from: g */
    public List<WheelItem> f166412g;

    /* renamed from: h */
    public float f166413h;

    /* renamed from: i */
    public boolean f166414i;

    /* renamed from: j */
    public float f166415j;

    /* renamed from: k */
    public int f166416k;

    /* renamed from: l */
    public int f166417l;

    /* renamed from: m */
    private GestureDetector f166418m;

    /* renamed from: n */
    private boolean f166419n;

    /* renamed from: o */
    private ScheduledFuture<?> f166420o;

    /* renamed from: p */
    private Paint f166421p;

    /* renamed from: q */
    private Paint f166422q;

    /* renamed from: r */
    private Paint f166423r;

    /* renamed from: s */
    private Paint f166424s;

    /* renamed from: t */
    private String f166425t;

    /* renamed from: u */
    private int f166426u;

    /* renamed from: v */
    private int f166427v;

    /* renamed from: w */
    private int f166428w;

    /* renamed from: x */
    private int f166429x;

    /* renamed from: y */
    private int f166430y;

    /* renamed from: z */
    private int f166431z;

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$d */
    public interface AbstractC65935d {
        /* renamed from: a */
        void mo230831a(int i);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$e */
    public interface AbstractC65936e {
        /* renamed from: a */
        void mo230887a(boolean z, int i, String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$g */
    public static class C65938g implements WheelItem {
        private String name;

        @Override // com.tt.miniapp.component.nativeview.picker.wheel.entity.WheelItem
        public String getName() {
            return this.name;
        }

        private C65938g(String str) {
            this.name = str;
        }
    }

    public final int getSelectedIndex() {
        return this.f166417l;
    }

    /* renamed from: a */
    public final void mo230847a(List<?> list, int i) {
        setItems(list);
        setSelectedIndex(i);
    }

    /* renamed from: a */
    public final void mo230848a(List<String> list, String str) {
        int indexOf = list.indexOf(str);
        if (indexOf == -1) {
            indexOf = 0;
        }
        mo230847a(list, indexOf);
    }

    /* renamed from: a */
    public void mo230845a(int i, int i2) {
        this.f166387B = i;
        this.f166388C = i2;
        this.f166421p.setColor(i);
        this.f166422q.setColor(i2);
    }

    /* renamed from: a */
    public void mo230844a(int i) {
        mo230842a();
        if (i == 2 || i == 3) {
            float f = this.f166415j;
            float f2 = this.f166413h;
            int i2 = (int) (((f % f2) + f2) % f2);
            this.f166399N = i2;
            if (((float) i2) > f2 / 2.0f) {
                this.f166399N = (int) (f2 - ((float) i2));
            } else {
                this.f166399N = -i2;
            }
        }
        this.f166420o = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new C65937f(this, this.f166399N), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public void mo230850c() {
        mo230842a();
        AbstractC65935d dVar = this.f166410e;
        if (dVar != null) {
            dVar.mo230831a(this.f166417l);
        }
    }

    /* access modifiers changed from: protected */
    public int getItemCount() {
        List<WheelItem> list = this.f166412g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: d */
    private void m258269d() {
        float f = this.f166390E;
        if (f < 1.5f) {
            this.f166390E = 1.5f;
        } else if (f > 4.0f) {
            this.f166390E = 4.0f;
        }
    }

    /* renamed from: f */
    private void m258271f() {
        if (isInEditMode()) {
            setItems(new String[]{"李玉江", "男", "贵州", "穿青人"});
        }
    }

    /* renamed from: b */
    public void mo230849b() {
        if (this.f166410e != null || this.f166411f != null) {
            postDelayed(new Runnable() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.WheelView.RunnableC659312 */

                public void run() {
                    if (WheelView.this.f166410e != null) {
                        WheelView.this.f166410e.mo230831a(WheelView.this.f166417l);
                    }
                    if (WheelView.this.f166411f != null) {
                        WheelView.this.f166411f.mo230887a(true, WheelView.this.f166417l, WheelView.this.f166412g.get(WheelView.this.f166417l).getName());
                    }
                }
            }, 200);
        }
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$a */
    public static class C65932a {

        /* renamed from: a */
        protected boolean f166434a = true;

        /* renamed from: b */
        protected boolean f166435b;

        /* renamed from: c */
        protected int f166436c = WheelView.line_divider_default;

        /* renamed from: d */
        protected int f166437d = WheelView.text_placeholder;

        /* renamed from: e */
        protected int f166438e = 100;

        /* renamed from: f */
        protected int f166439f = 220;

        /* renamed from: g */
        protected float f166440g;

        /* renamed from: h */
        protected float f166441h = 2.0f;

        public String toString() {
            return "visible=" + this.f166434a + ",color=" + this.f166436c + ",alpha=" + this.f166439f + ",thick=" + this.f166441h;
        }

        /* renamed from: a */
        public C65932a mo230881a(int i) {
            this.f166436c = i;
            return this;
        }

        /* renamed from: a */
        public C65932a mo230882a(boolean z) {
            this.f166434a = z;
            return this;
        }

        /* renamed from: b */
        public C65932a mo230883b(boolean z) {
            this.f166435b = z;
            if (z && this.f166436c == WheelView.line_divider_default) {
                this.f166436c = this.f166437d;
                this.f166439f = 255;
            }
            return this;
        }
    }

    /* renamed from: h */
    private void m258273h() {
        Rect rect = new Rect();
        for (int i = 0; i < this.f166412g.size(); i++) {
            String a = m258262a(this.f166412g.get(i));
            this.f166422q.getTextBounds(a, 0, a.length(), rect);
            int width = rect.width();
            if (width > this.f166426u) {
                this.f166426u = width;
            }
        }
        this.f166422q.getTextBounds("测试", 0, 2, rect);
        this.f166427v = rect.height() + 2;
        this.f166413h = (float) ((int) C67590h.m263065a(getContext(), 48.0f));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$b */
    public static class C65933b extends TimerTask {

        /* renamed from: a */
        float f166442a = 2.14748365E9f;

        /* renamed from: b */
        final float f166443b;

        /* renamed from: c */
        final WheelView f166444c;

        public final void run() {
            if (this.f166442a == 2.14748365E9f) {
                if (Math.abs(this.f166443b) <= 2000.0f) {
                    this.f166442a = this.f166443b;
                } else if (this.f166443b > BitmapDescriptorFactory.HUE_RED) {
                    this.f166442a = 2000.0f;
                } else {
                    this.f166442a = -2000.0f;
                }
            }
            if (Math.abs(this.f166442a) < BitmapDescriptorFactory.HUE_RED || Math.abs(this.f166442a) > 20.0f) {
                WheelView wheelView = this.f166444c;
                float f = (float) ((int) ((this.f166442a * 10.0f) / 1000.0f));
                wheelView.f166415j -= f;
                if (!this.f166444c.f166414i) {
                    float f2 = this.f166444c.f166413h;
                    float f3 = ((float) (-this.f166444c.f166416k)) * f2;
                    float itemCount = ((float) ((this.f166444c.getItemCount() - 1) - this.f166444c.f166416k)) * f2;
                    double d = ((double) f2) * 0.25d;
                    if (((double) this.f166444c.f166415j) - d < ((double) f3)) {
                        f3 = this.f166444c.f166415j + f;
                    } else if (((double) this.f166444c.f166415j) + d > ((double) itemCount)) {
                        itemCount = this.f166444c.f166415j + f;
                    }
                    if (this.f166444c.f166415j <= f3) {
                        this.f166442a = 40.0f;
                        this.f166444c.f166415j = (float) ((int) f3);
                    } else if (this.f166444c.f166415j >= itemCount) {
                        this.f166444c.f166415j = (float) ((int) itemCount);
                        this.f166442a = -40.0f;
                    }
                }
                float f4 = this.f166442a;
                if (f4 < BitmapDescriptorFactory.HUE_RED) {
                    this.f166442a = f4 + 20.0f;
                } else {
                    this.f166442a = f4 - 20.0f;
                }
                this.f166444c.f166409d.sendEmptyMessage(1000);
                return;
            }
            this.f166444c.mo230842a();
            this.f166444c.f166409d.sendEmptyMessage(2000);
        }

        C65933b(WheelView wheelView, float f) {
            this.f166444c = wheelView;
            this.f166443b = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$f */
    public static class C65937f extends TimerTask {

        /* renamed from: a */
        int f166446a = Integer.MAX_VALUE;

        /* renamed from: b */
        int f166447b;

        /* renamed from: c */
        int f166448c;

        /* renamed from: d */
        final WheelView f166449d;

        public void run() {
            if (this.f166446a == Integer.MAX_VALUE) {
                this.f166446a = this.f166448c;
            }
            int i = this.f166446a;
            int i2 = (int) (((float) i) * 0.1f);
            this.f166447b = i2;
            if (i2 == 0) {
                if (i < 0) {
                    this.f166447b = -1;
                } else {
                    this.f166447b = 1;
                }
            }
            if (Math.abs(i) <= 1) {
                this.f166449d.mo230842a();
                this.f166449d.f166409d.sendEmptyMessage(3000);
                return;
            }
            this.f166449d.f166415j += (float) this.f166447b;
            if (!this.f166449d.f166414i) {
                float f = this.f166449d.f166413h;
                float f2 = ((float) (-this.f166449d.f166416k)) * f;
                float itemCount = ((float) ((this.f166449d.getItemCount() - 1) - this.f166449d.f166416k)) * f;
                if (this.f166449d.f166415j <= f2 || this.f166449d.f166415j >= itemCount) {
                    this.f166449d.f166415j -= (float) this.f166447b;
                    this.f166449d.mo230842a();
                    this.f166449d.f166409d.sendEmptyMessage(3000);
                    return;
                }
            }
            this.f166449d.f166409d.sendEmptyMessage(1000);
            this.f166446a -= this.f166447b;
        }

        C65937f(WheelView wheelView, int i) {
            this.f166449d = wheelView;
            this.f166448c = i;
        }
    }

    /* renamed from: e */
    private void m258270e() {
        Paint paint = new Paint();
        this.f166421p = paint;
        paint.setAntiAlias(true);
        this.f166421p.setColor(C13344e.m54321a(this.f166387B, getContext()));
        this.f166421p.setTypeface(this.f166386A);
        this.f166421p.setTextSize((float) this.f166431z);
        Paint paint2 = new Paint();
        this.f166422q = paint2;
        paint2.setAntiAlias(true);
        this.f166422q.setColor(C13344e.m54321a(this.f166388C, getContext()));
        this.f166422q.setTextScaleX(1.0f);
        this.f166422q.setTypeface(this.f166386A);
        this.f166422q.setTextSize((float) this.f166430y);
        Paint paint3 = new Paint();
        this.f166423r = paint3;
        paint3.setAntiAlias(true);
        this.f166423r.setColor(C13344e.m54321a(this.f166389D.f166436c, getContext()));
        this.f166423r.setStrokeWidth(this.f166389D.f166441h);
        this.f166423r.setAlpha(this.f166389D.f166439f);
        Paint paint4 = new Paint();
        this.f166424s = paint4;
        paint4.setAntiAlias(true);
        this.f166424s.setColor(C13344e.m54321a(this.f166389D.f166437d, getContext()));
        this.f166424s.setAlpha(this.f166389D.f166438e);
        setLayerType(1, null);
    }

    /* renamed from: g */
    private void m258272g() {
        if (this.f166412g != null) {
            m258273h();
            int i = (int) (this.f166413h * ((float) (this.f166395J - 1)));
            this.f166396K = (int) (((double) (i * 2)) / 3.141592653589793d);
            this.f166398M = (int) (((double) i) / 3.141592653589793d);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (this.f166407V) {
                this.f166397L = View.MeasureSpec.getSize(this.f166402Q);
            } else if (layoutParams == null || layoutParams.width <= 0) {
                this.f166397L = this.f166426u;
                if (this.f166391F < 0) {
                    this.f166391F = (int) C67590h.m263065a(getContext(), 13.0f);
                }
                this.f166397L += this.f166391F * 2;
                if (!TextUtils.isEmpty(this.f166425t)) {
                    this.f166397L += m258261a(this.f166422q, this.f166425t);
                }
            } else {
                this.f166397L = layoutParams.width;
            }
            int i2 = this.f166396K;
            float f = this.f166413h;
            this.f166392G = (((float) i2) - f) / 2.0f;
            this.f166393H = (((float) i2) + f) / 2.0f;
            if (this.f166416k == -1) {
                if (this.f166414i) {
                    this.f166416k = (this.f166412g.size() + 1) / 2;
                } else {
                    this.f166416k = 0;
                }
            }
            this.f166394I = this.f166416k;
            this.f166429x = C67590h.m263087c(getContext(), 8.0f);
        }
    }

    /* renamed from: a */
    public void mo230842a() {
        ScheduledFuture<?> scheduledFuture = this.f166420o;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f166420o.cancel(true);
            this.f166420o = null;
        }
    }

    public final void setGravity(int i) {
        this.f166403R = i;
    }

    public void setLineConfig(C65932a aVar) {
        setDividerConfig(aVar);
    }

    public final void setOnItemSelectListener(AbstractC65935d dVar) {
        this.f166410e = dVar;
    }

    public final void setOnWheelListener(AbstractC65936e eVar) {
        this.f166411f = eVar;
    }

    public void setPadding(int i) {
        setTextPadding(i);
    }

    public void setTextSizeAutoFit(boolean z) {
        this.f166408W = z;
    }

    public void setUseWeight(boolean z) {
        this.f166407V = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.WheelView$c */
    public static class HandlerC65934c extends Handler {

        /* renamed from: a */
        final WheelView f166445a;

        HandlerC65934c(WheelView wheelView) {
            this.f166445a = wheelView;
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1000) {
                this.f166445a.invalidate();
            } else if (i == 2000) {
                this.f166445a.mo230844a(2);
            } else if (i == 3000) {
                this.f166445a.mo230849b();
            }
        }
    }

    public WheelView(Context context) {
        this(context, null);
    }

    public final void setCycleDisable(boolean z) {
        this.f166414i = !z;
    }

    public final void setItems(String[] strArr) {
        setItems(Arrays.asList(strArr));
    }

    public final void setLabel(String str) {
        mo230846a(str, true);
    }

    public final void setLineSpaceMultiplier(float f) {
        this.f166390E = f;
        m258269d();
    }

    public void setDividerColor(int i) {
        this.f166389D.mo230881a(i);
        this.f166423r.setColor(i);
    }

    public void setTextColor(int i) {
        this.f166387B = i;
        this.f166388C = i;
        this.f166421p.setColor(i);
        this.f166422q.setColor(i);
    }

    public void setTextPadding(int i) {
        this.f166391F = (int) C67590h.m263065a(getContext(), (float) i);
    }

    public void setTextSkewXOffset(int i) {
        this.f166428w = i;
        if (i != 0) {
            this.f166422q.setTextScaleX(1.0f);
        }
    }

    public final void setTypeface(Typeface typeface) {
        this.f166386A = typeface;
        this.f166421p.setTypeface(typeface);
        this.f166422q.setTypeface(this.f166386A);
    }

    /* renamed from: a */
    private void m258264a(Context context) {
        this.f166409d = new HandlerC65934c(this);
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            /* class com.tt.miniapp.component.nativeview.picker.wheel.WheelView.C659301 */

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                WheelView.this.mo230843a(f2);
                return true;
            }
        });
        this.f166418m = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        m258270e();
        m258271f();
    }

    public final void setOffset(int i) {
        if (i < 1 || i > 5) {
            throw new IllegalArgumentException("must between 1 and 5");
        }
        int i2 = (i * 2) + 1;
        if (i % 2 != 0) {
            i--;
        }
        setVisibleItemCount(i2 + i);
    }

    public final void setOutTextSize(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (getContext().getResources().getDisplayMetrics().density * f);
            this.f166431z = i;
            this.f166421p.setTextSize((float) i);
        }
    }

    public final void setTextSize(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (getContext().getResources().getDisplayMetrics().density * f);
            this.f166430y = i;
            this.f166422q.setTextSize((float) i);
        }
    }

    public final void setVisibleItemCount(int i) {
        if (i % 2 == 0) {
            throw new IllegalArgumentException("must be odd");
        } else if (i != this.f166395J) {
            this.f166395J = i;
        }
    }

    /* renamed from: b */
    private int m258266b(int i) {
        if (i < 0) {
            return m258266b(i + this.f166412g.size());
        }
        if (i > this.f166412g.size() - 1) {
            return m258266b(i - this.f166412g.size());
        }
        return i;
    }

    public void setDividerConfig(C65932a aVar) {
        if (aVar == null) {
            this.f166389D.mo230882a(false);
            this.f166389D.mo230883b(false);
            return;
        }
        this.f166389D = aVar;
        this.f166423r.setColor(C13344e.m54321a(aVar.f166436c, getContext()));
        this.f166423r.setStrokeWidth(aVar.f166441h);
        this.f166424s.setColor(C13344e.m54321a(aVar.f166437d, getContext()));
        this.f166424s.setAlpha(aVar.f166438e);
    }

    public final void setSelectedIndex(int i) {
        List<WheelItem> list = this.f166412g;
        if (list != null && !list.isEmpty()) {
            int size = this.f166412g.size();
            if (i == 0 || (i > 0 && i < size && i != this.f166417l)) {
                this.f166416k = i;
                this.f166415j = BitmapDescriptorFactory.HUE_RED;
                this.f166399N = 0;
                invalidate();
            }
        }
    }

    /* renamed from: a */
    private String m258262a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof WheelItem) {
            return ((WheelItem) obj).getName();
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        return String.format(Locale.getDefault(), "%02d", Integer.valueOf(((Integer) obj).intValue()));
    }

    /* renamed from: b */
    private void m258267b(String str) {
        Rect rect = new Rect();
        this.f166422q.getTextBounds(str, 0, str.length(), rect);
        int i = this.f166403R;
        if (i == 3) {
            this.f166404S = (int) C67590h.m263065a(getContext(), 8.0f);
        } else if (i == 5) {
            this.f166404S = (this.f166397L - rect.width()) - ((int) this.f166406U);
        } else if (i == 17) {
            this.f166404S = (int) (((double) (this.f166397L - rect.width())) * 0.5d);
        }
    }

    /* renamed from: c */
    private void m258268c(String str) {
        Rect rect = new Rect();
        this.f166421p.getTextBounds(str, 0, str.length(), rect);
        int i = this.f166403R;
        if (i == 3) {
            this.f166405T = (int) C67590h.m263065a(getContext(), 8.0f);
        } else if (i == 5) {
            this.f166405T = (this.f166397L - rect.width()) - ((int) this.f166406U);
        } else if (i == 17) {
            this.f166405T = (int) (((double) (this.f166397L - rect.width())) * 0.5d);
        }
    }

    public final void setItems(List<?> list) {
        this.f166412g.clear();
        for (Object obj : list) {
            if (obj instanceof WheelItem) {
                this.f166412g.add((WheelItem) obj);
            } else if ((obj instanceof CharSequence) || (obj instanceof Number)) {
                this.f166412g.add(new C65938g(obj.toString()));
            } else {
                throw new IllegalArgumentException("please implements " + WheelItem.class.getName());
            }
        }
        m258272g();
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f166418m.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f166401P = System.currentTimeMillis();
            mo230842a();
            this.f166400O = motionEvent.getRawY();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action != 2) {
            if (!onTouchEvent) {
                float y = motionEvent.getY();
                int i = this.f166398M;
                float f = this.f166413h;
                this.f166399N = (int) ((((float) (((int) (((Math.acos((double) ((((float) i) - y) / ((float) i))) * ((double) this.f166398M)) + ((double) (f / 2.0f))) / ((double) f))) - (this.f166395J / 2))) * f) - (((this.f166415j % f) + f) % f));
                if (System.currentTimeMillis() - this.f166401P > 120) {
                    mo230844a(3);
                } else {
                    mo230844a(1);
                }
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            float rawY = this.f166400O - motionEvent.getRawY();
            this.f166400O = motionEvent.getRawY();
            this.f166415j += rawY;
            if (!this.f166414i) {
                float f2 = ((float) (-this.f166416k)) * this.f166413h;
                float f3 = this.f166413h;
                float size = ((float) ((this.f166412g.size() - 1) - this.f166416k)) * f3;
                float f4 = this.f166415j;
                if (((double) f4) - (((double) f3) * 0.25d) < ((double) f2)) {
                    f2 = f4 - rawY;
                } else if (((double) f4) + (((double) f3) * 0.25d) > ((double) size)) {
                    size = f4 - rawY;
                }
                if (f4 < f2) {
                    this.f166415j = (float) ((int) f2);
                } else if (f4 > size) {
                    this.f166415j = (float) ((int) size);
                }
            }
        }
        invalidate();
        return true;
    }

    /* renamed from: a */
    private boolean m258265a(String str) {
        Rect rect = new Rect();
        this.f166422q.getTextBounds(str, 0, str.length(), rect);
        float a = m258260a(str, (float) this.f166430y);
        int i = this.f166430y;
        if (a <= ((float) this.f166397L)) {
            return true;
        }
        this.f166421p.setTextSize((float) this.f166431z);
        this.f166422q.setTextSize((float) i);
        this.f166422q.getTextBounds(str, 0, str.length(), rect);
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        String str;
        List<WheelItem> list = this.f166412g;
        if (list != null && list.size() != 0) {
            String[] strArr = new String[this.f166395J];
            int size = this.f166416k + (((int) (this.f166415j / this.f166413h)) % this.f166412g.size());
            this.f166394I = size;
            if (!this.f166414i) {
                if (size < 0) {
                    this.f166394I = 0;
                }
                if (this.f166394I > this.f166412g.size() - 1) {
                    this.f166394I = this.f166412g.size() - 1;
                }
            } else {
                if (size < 0) {
                    this.f166394I = this.f166412g.size() + this.f166394I;
                }
                if (this.f166394I > this.f166412g.size() - 1) {
                    this.f166394I -= this.f166412g.size();
                }
            }
            float f2 = this.f166415j % this.f166413h;
            int i = 0;
            while (true) {
                int i2 = this.f166395J;
                if (i >= i2) {
                    break;
                }
                int i3 = this.f166394I - ((i2 / 2) - i);
                if (this.f166414i) {
                    strArr[i] = this.f166412g.get(m258266b(i3)).getName();
                } else if (i3 < 0) {
                    strArr[i] = "";
                } else if (i3 > this.f166412g.size() - 1) {
                    strArr[i] = "";
                } else {
                    strArr[i] = this.f166412g.get(i3).getName();
                }
                i++;
            }
            if (this.f166389D.f166434a) {
                float f3 = this.f166389D.f166440g;
                int i4 = this.f166397L;
                float f4 = this.f166392G;
                float f5 = 1.0f - f3;
                canvas.drawLine(((float) i4) * f3, f4, ((float) i4) * f5, f4, this.f166423r);
                int i5 = this.f166397L;
                float f6 = this.f166393H;
                canvas.drawLine(((float) i5) * f3, f6, ((float) i5) * f5, f6, this.f166423r);
            }
            if (this.f166389D.f166435b) {
                this.f166424s.setColor(C13344e.m54321a(this.f166389D.f166437d, getContext()));
                this.f166424s.setAlpha(this.f166389D.f166438e);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, this.f166392G, (float) this.f166397L, this.f166393H, this.f166424s);
            }
            int i6 = 0;
            while (i6 < this.f166395J) {
                canvas.save();
                double d = (double) (((this.f166413h * ((float) i6)) - f2) / ((float) this.f166398M));
                float f7 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f7 >= 90.0f || f7 <= -90.0f) {
                    f = f2;
                    canvas.restore();
                } else {
                    String a = m258262a((Object) strArr[i6]);
                    if (this.f166419n || TextUtils.isEmpty(this.f166425t) || TextUtils.isEmpty(a)) {
                        str = a;
                    } else {
                        str = a + this.f166425t;
                    }
                    if (this.f166408W) {
                        if (!m258265a(str)) {
                            str = m258263a(str, C67590h.m263090d(getContext()) / canvas.getWidth());
                        }
                        this.f166403R = 17;
                    } else {
                        this.f166403R = 3;
                    }
                    m258267b(str);
                    m258268c(str);
                    f = f2;
                    float cos = (float) ((((double) this.f166398M) - (Math.cos(d) * ((double) this.f166398M))) - ((Math.sin(d) * ((double) this.f166427v)) / 2.0d));
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, cos);
                    float f8 = this.f166392G;
                    if (cos > f8 || ((float) this.f166427v) + cos < f8) {
                        float f9 = this.f166393H;
                        if (cos > f9 || ((float) this.f166427v) + cos < f9) {
                            if (cos >= f8) {
                                int i7 = this.f166427v;
                                if (((float) i7) + cos <= f9) {
                                    canvas.clipRect(0, 0, this.f166397L, i7 + 5);
                                    float f10 = ((float) this.f166427v) - this.f166406U;
                                    Iterator<WheelItem> it = this.f166412g.iterator();
                                    int i8 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        } else if (it.next().getName().equals(a)) {
                                            this.f166417l = i8;
                                            break;
                                        } else {
                                            i8++;
                                        }
                                    }
                                    if (this.f166419n && !TextUtils.isEmpty(this.f166425t)) {
                                        str = str + this.f166425t;
                                    }
                                    canvas.drawText(str, (float) this.f166404S, f10, this.f166422q);
                                    canvas.restore();
                                    this.f166422q.setTextSize((float) this.f166430y);
                                }
                            }
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f166397L, this.f166413h);
                            canvas.drawText(str, (float) this.f166405T, (float) this.f166427v, this.f166421p);
                            canvas.restore();
                            canvas.restore();
                            this.f166422q.setTextSize((float) this.f166430y);
                        } else {
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f166397L, this.f166393H - cos);
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(str, (float) this.f166404S, ((float) this.f166427v) - this.f166406U, this.f166422q);
                            canvas.restore();
                            canvas.save();
                            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f166393H - cos, (float) this.f166397L, (float) ((int) this.f166413h));
                            canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas.drawText(str, (float) this.f166405T, (float) this.f166427v, this.f166421p);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f166397L, this.f166392G - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(str, (float) this.f166405T, (float) this.f166427v, this.f166421p);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, this.f166392G - cos, (float) this.f166397L, (float) ((int) this.f166413h));
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(str, (float) this.f166404S, ((float) this.f166427v) - this.f166406U, this.f166422q);
                        canvas.restore();
                    }
                    canvas.restore();
                    this.f166422q.setTextSize((float) this.f166430y);
                }
                i6++;
                this.f166421p.setTextSize((float) this.f166431z);
                f2 = f;
            }
        }
    }

    /* renamed from: a */
    public void mo230843a(float f) {
        mo230842a();
        this.f166420o = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new C65933b(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo230846a(String str, boolean z) {
        this.f166425t = str;
        this.f166419n = z;
    }

    /* renamed from: a */
    public static float m258260a(String str, float f) {
        Paint paint = new Paint();
        paint.setTextSize(f);
        return paint.measureText(str);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f166402Q = i;
        m258272g();
        setMeasuredDimension(this.f166397L, this.f166396K);
    }

    /* renamed from: a */
    private int m258261a(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (int) Math.ceil((double) fArr[i2]);
        }
        return i;
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166419n = true;
        this.f166412g = new ArrayList();
        this.f166428w = 0;
        this.f166429x = -1;
        this.f166430y = 17;
        this.f166431z = 15;
        this.f166386A = Typeface.DEFAULT;
        this.f166387B = text_placeholder;
        this.f166388C = text_title;
        this.f166389D = new C65932a();
        this.f166390E = 3.0f;
        this.f166391F = -1;
        this.f166414i = true;
        this.f166415j = BitmapDescriptorFactory.HUE_RED;
        this.f166416k = -1;
        this.f166395J = 11;
        this.f166399N = 0;
        this.f166400O = BitmapDescriptorFactory.HUE_RED;
        this.f166401P = 0;
        this.f166403R = 17;
        this.f166404S = 0;
        this.f166405T = 0;
        this.f166407V = false;
        this.f166408W = true;
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.f166406U = 2.4f;
        } else {
            int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
            if (i <= 0 && f < 2.0f) {
                this.f166406U = 3.6f;
            } else if (i <= 0 && f < 2.0f) {
                this.f166406U = 4.5f;
            } else if (2.0f <= f && f < 3.0f) {
                this.f166406U = 6.0f;
            } else if (f >= 3.0f) {
                this.f166406U = f * 2.5f;
            }
        }
        m258269d();
        m258264a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m258263a(java.lang.String r3, int r4) {
        /*
            r0 = 1
            java.lang.String r1 = "..."
            r2 = 0
            if (r4 == r0) goto L_0x000d
            r0 = 2
            if (r4 == r0) goto L_0x0029
            r0 = 3
            if (r4 == r0) goto L_0x0044
            goto L_0x005e
        L_0x000d:
            int r4 = r3.length()
            r0 = 15
            if (r4 <= r0) goto L_0x0029
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.substring(r2, r0)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L_0x0029:
            int r4 = r3.length()
            r0 = 7
            if (r4 <= r0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.substring(r2, r0)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L_0x0044:
            int r4 = r3.length()
            r0 = 5
            if (r4 <= r0) goto L_0x005e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.substring(r2, r0)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
        L_0x005e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.component.nativeview.picker.wheel.WheelView.m258263a(java.lang.String, int):java.lang.String");
    }
}

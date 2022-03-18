package com.ss.android.vc.meeting.module.subtitle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.subtitle.widget.C63206a;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.a */
public class C63206a {

    /* renamed from: a */
    public Context f159346a;

    /* renamed from: b */
    public C63208a f159347b;

    /* renamed from: c */
    public TextView f159348c;

    /* renamed from: d */
    public Spannable f159349d;

    /* renamed from: e */
    public C63211d f159350e;

    /* renamed from: f */
    public boolean f159351f;

    /* renamed from: g */
    public C63212b f159352g;

    /* renamed from: h */
    public AbstractC63210c f159353h;

    /* renamed from: i */
    private BackgroundColorSpan f159354i;

    /* renamed from: j */
    private C63209b f159355j;

    /* renamed from: k */
    private C63209b f159356k;

    /* renamed from: l */
    private ViewTreeObserver.OnPreDrawListener f159357l;

    /* renamed from: m */
    private ViewTreeObserver.OnScrollChangedListener f159358m;

    /* renamed from: n */
    private final Runnable f159359n;

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.a$c */
    public interface AbstractC63210c {
        void onTextSelected(C63212b bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.a$b */
    public class C63209b extends View {

        /* renamed from: a */
        public boolean f159365a;

        /* renamed from: c */
        private BasePopupWindow f159367c;

        /* renamed from: d */
        private Paint f159368d;

        /* renamed from: e */
        private int f159369e;

        /* renamed from: f */
        private int f159370f;

        /* renamed from: g */
        private int f159371g;

        /* renamed from: h */
        private int f159372h = 25;

        /* renamed from: i */
        private int f159373i;

        /* renamed from: j */
        private int f159374j;

        /* renamed from: k */
        private int f159375k;

        /* renamed from: l */
        private int f159376l;

        /* renamed from: m */
        private int[] f159377m = new int[2];

        public boolean performClick() {
            return super.performClick();
        }

        /* renamed from: e */
        private void m247546e() {
            this.f159365a = !this.f159365a;
            invalidate();
        }

        /* renamed from: d */
        public int mo218794d() {
            return this.f159377m[1] + C63206a.this.f159348c.getPaddingTop();
        }

        /* renamed from: c */
        public int mo218793c() {
            return (this.f159377m[0] - this.f159372h) + C63206a.this.f159348c.getPaddingLeft();
        }

        /* renamed from: a */
        public void mo218789a() {
            try {
                this.f159367c.dismiss();
            } catch (Exception e) {
                C60700b.m235851b("SelectableTextHelper", "[dismiss]", "cursorHandleView dismiss fail. " + e.getMessage());
            }
        }

        /* renamed from: b */
        public void mo218791b() {
            int i;
            Layout layout = C63206a.this.f159348c.getLayout();
            if (layout != null) {
                if (this.f159365a) {
                    i = C63206a.this.f159352g.f159383a;
                } else {
                    i = C63206a.this.f159352g.f159384b;
                }
                mo218792b((int) layout.getPrimaryHorizontal(i), layout.getLineBottom(layout.getLineForOffset(i)));
            }
        }

        /* renamed from: f */
        private void m247547f() {
            int i;
            int i2;
            C63206a.this.f159348c.getLocationInWindow(this.f159377m);
            CharSequence text = C63206a.this.f159348c.getText();
            Layout layout = C63206a.this.f159348c.getLayout();
            if (layout != null) {
                if (this.f159365a) {
                    int i3 = C63206a.this.f159352g.f159383a;
                    i = (((int) layout.getPrimaryHorizontal(i3)) - this.f159370f) + mo218793c();
                    i2 = layout.getLineBottom(layout.getLineForOffset(i3)) + mo218794d();
                } else {
                    int i4 = C63206a.this.f159352g.f159384b;
                    while (i4 >= 1 && '\n' == text.charAt(i4 - 1)) {
                        i4--;
                    }
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    C63206a.this.f159352g.f159384b = i4;
                    int lineBottom = layout.getLineBottom(layout.getLineForOffset(i4)) + mo218794d();
                    i = ((int) layout.getPrimaryHorizontal(i4)) + mo218793c();
                    i2 = lineBottom;
                }
                try {
                    this.f159367c.update(i, i2, -1, -1);
                } catch (Exception e) {
                    C60700b.m235851b("SelectableTextHelper", "[updateCursorHandle]", "cursorHandleView update fail. " + e.getMessage());
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            int i = this.f159369e;
            canvas.drawCircle((float) (this.f159372h + i), (float) i, (float) i, this.f159368d);
            if (this.f159365a) {
                int i2 = this.f159369e;
                int i3 = this.f159372h;
                canvas.drawRect((float) (i2 + i3), BitmapDescriptorFactory.HUE_RED, (float) ((i2 * 2) + i3), (float) i2, this.f159368d);
                return;
            }
            int i4 = this.f159372h;
            int i5 = this.f159369e;
            canvas.drawRect((float) i4, BitmapDescriptorFactory.HUE_RED, (float) (i4 + i5), (float) i5, this.f159368d);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f159375k = C63206a.this.f159352g.f159383a;
                this.f159376l = C63206a.this.f159352g.f159384b;
                this.f159373i = (int) motionEvent.getX();
                this.f159374j = (int) motionEvent.getY();
            } else if (action == 1) {
                performClick();
                C63206a.this.f159350e.mo218798a();
            } else if (action == 2) {
                C63206a.this.f159350e.mo218799b();
                mo218790a((((int) motionEvent.getRawX()) + this.f159373i) - this.f159370f, (((int) motionEvent.getRawY()) + this.f159374j) - this.f159371g);
            } else if (action == 3) {
                C63206a.this.f159350e.mo218798a();
            }
            return true;
        }

        public C63209b(boolean z) {
            super(C63206a.this.f159346a);
            int i = (int) (C63206a.this.f159347b.f159364d / 2.0f);
            this.f159369e = i;
            this.f159370f = i * 2;
            this.f159371g = i * 2;
            this.f159365a = z;
            Paint paint = new Paint(1);
            this.f159368d = paint;
            paint.setColor(C63206a.this.f159347b.f159362b);
            BasePopupWindow basePopupWindow = new BasePopupWindow(this);
            this.f159367c = basePopupWindow;
            basePopupWindow.setClippingEnabled(false);
            this.f159367c.setWidth(this.f159370f + (this.f159372h * 2));
            this.f159367c.setHeight(this.f159371g + (this.f159372h / 2));
            invalidate();
        }

        /* renamed from: b */
        public void mo218792b(int i, int i2) {
            int i3;
            C63206a.this.f159348c.getLocationInWindow(this.f159377m);
            if (this.f159365a) {
                i3 = this.f159370f;
            } else {
                i3 = 0;
            }
            try {
                this.f159367c.showAtLocation(C63206a.this.f159348c, 0, (i - i3) + mo218793c(), i2 + mo218794d());
            } catch (Exception e) {
                C60700b.m235851b("SelectableTextHelper", "[show]", "cursorHandleView update fail. " + e.getMessage());
            }
        }

        /* renamed from: a */
        public void mo218790a(int i, int i2) {
            int i3;
            C63206a.this.f159348c.getLocationInWindow(this.f159377m);
            if (this.f159365a) {
                i3 = C63206a.this.f159352g.f159383a;
            } else {
                i3 = C63206a.this.f159352g.f159384b;
            }
            int[] iArr = this.f159377m;
            int lineHeight = (i2 - iArr[1]) - C63206a.this.f159348c.getLineHeight();
            int a = C63216f.m247568a(C63206a.this.f159348c, i - iArr[0], lineHeight, i3);
            if (a != i3) {
                C63206a.this.mo218779b();
                if (this.f159365a) {
                    if (a > this.f159376l) {
                        C63209b a2 = C63206a.this.mo218775a(false);
                        m247546e();
                        a2.m247546e();
                        int i4 = this.f159376l;
                        this.f159375k = i4;
                        C63206a.this.mo218780b(i4, a);
                        a2.m247547f();
                    } else {
                        C63206a.this.mo218780b(a, -1);
                    }
                    m247547f();
                    return;
                }
                int i5 = this.f159375k;
                if (a < i5) {
                    C63209b a3 = C63206a.this.mo218775a(true);
                    a3.m247546e();
                    m247546e();
                    int i6 = this.f159375k;
                    this.f159376l = i6;
                    C63206a.this.mo218780b(a, i6);
                    a3.m247547f();
                } else {
                    C63206a.this.mo218780b(i5, a);
                }
                m247547f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ void m247531k() {
        if (this.f159351f) {
            m247529i();
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.a$a */
    public static class C63208a {

        /* renamed from: a */
        public TextView f159361a;

        /* renamed from: b */
        int f159362b;

        /* renamed from: c */
        int f159363c;

        /* renamed from: d */
        public float f159364d;

        /* renamed from: a */
        public C63206a mo218787a() {
            return new C63206a(this);
        }

        /* renamed from: a */
        public C63208a mo218785a(float f) {
            this.f159364d = f;
            return this;
        }

        /* renamed from: b */
        public C63208a mo218788b(int i) {
            this.f159363c = i;
            return this;
        }

        public C63208a(TextView textView) {
            this.f159361a = textView;
        }

        /* renamed from: a */
        public C63208a mo218786a(int i) {
            this.f159362b = i;
            return this;
        }
    }

    /* renamed from: e */
    private void m247525e() {
        m247526f();
        m247527g();
        m247528h();
    }

    /* renamed from: i */
    private void m247529i() {
        this.f159355j.mo218791b();
        this.f159356k.mo218791b();
        this.f159350e.mo218798a();
    }

    /* renamed from: j */
    private void m247530j() {
        this.f159355j.mo218789a();
        this.f159356k.mo218789a();
        this.f159350e.mo218799b();
    }

    /* renamed from: d */
    public TextView mo218782d() {
        C63208a aVar = this.f159347b;
        if (aVar != null) {
            return aVar.f159361a;
        }
        return null;
    }

    /* renamed from: f */
    private void m247526f() {
        TextView textView = this.f159347b.f159361a;
        this.f159348c = textView;
        textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
        this.f159348c.setTextIsSelectable(false);
        this.f159346a = this.f159348c.getContext();
    }

    /* renamed from: g */
    private void m247527g() {
        this.f159355j = new C63209b(true);
        this.f159356k = new C63209b(false);
        this.f159350e = new C63211d(this.f159346a);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ boolean m247532l() {
        if (!this.f159351f) {
            return true;
        }
        this.f159348c.removeCallbacks(this.f159359n);
        this.f159348c.postDelayed(this.f159359n, 100);
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ void m247533m() {
        if (this.f159351f) {
            this.f159350e.mo218799b();
            this.f159355j.mo218789a();
            this.f159356k.mo218789a();
        }
    }

    /* renamed from: a */
    public void mo218776a() {
        this.f159351f = false;
        mo218779b();
        m247530j();
    }

    /* renamed from: b */
    public void mo218779b() {
        BackgroundColorSpan backgroundColorSpan;
        this.f159352g.f159385c = null;
        Spannable spannable = this.f159349d;
        if (spannable != null && (backgroundColorSpan = this.f159354i) != null) {
            spannable.removeSpan(backgroundColorSpan);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.a$d */
    public class C63211d {

        /* renamed from: b */
        private BasePopupWindow f159379b;

        /* renamed from: c */
        private int[] f159380c;

        /* renamed from: d */
        private int f159381d;

        /* renamed from: e */
        private int f159382e;

        /* renamed from: b */
        public void mo218799b() {
            try {
                this.f159379b.dismiss();
            } catch (Exception e) {
                C60700b.m235851b("SelectableTextHelper", "[operateWindow2]", "dismiss fail. " + e.getMessage());
            }
        }

        /* renamed from: a */
        public void mo218798a() {
            C63206a.this.f159348c.getLocationInWindow(this.f159380c);
            Layout layout = C63206a.this.f159348c.getLayout();
            if (layout != null) {
                int primaryHorizontal = ((int) layout.getPrimaryHorizontal(C63206a.this.f159352g.f159383a)) + this.f159380c[0];
                if (primaryHorizontal <= 0) {
                    primaryHorizontal = 16;
                }
                if (this.f159381d + primaryHorizontal > DeviceUtils.getScreenWidth(C63206a.this.f159346a)) {
                    primaryHorizontal = (DeviceUtils.getScreenWidth(C63206a.this.f159346a) - this.f159381d) - 16;
                }
                int lineTop = layout.getLineTop(layout.getLineForOffset(C63206a.this.f159352g.f159383a)) + this.f159380c[1];
                int i = this.f159382e;
                int i2 = (lineTop - i) - 16;
                if (i2 < 0) {
                    i2 = 16;
                }
                if (i + i2 > DeviceUtils.getScreenHeight(C63206a.this.f159346a)) {
                    i2 = (DeviceUtils.getScreenHeight(C63206a.this.f159346a) - this.f159382e) - 16;
                }
                this.f159379b.setElevation(8.0f);
                try {
                    this.f159379b.showAtLocation(C63206a.this.f159348c, 0, primaryHorizontal, i2);
                } catch (Exception e) {
                    C60700b.m235851b("SelectableTextHelper", "[operateWindow]", "show fail. " + e.getMessage());
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m247554a(View view) {
            C63206a.this.mo218776a();
            if (C63206a.this.f159353h != null) {
                C63206a.this.f159352g.f159385c = C63206a.this.f159349d.subSequence(C63206a.this.f159352g.f159383a, C63206a.this.f159352g.f159384b).toString();
                C63206a.this.f159353h.onTextSelected(C63206a.this.f159352g);
            }
        }

        private C63211d(Context context) {
            this.f159380c = new int[2];
            View inflate = LayoutInflater.from(context).inflate(R.layout.subtitle_history_menu, (ViewGroup) null);
            inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f159381d = inflate.getMeasuredWidth();
            this.f159382e = inflate.getMeasuredHeight();
            BasePopupWindow basePopupWindow = new BasePopupWindow(inflate, -2, -2, false);
            this.f159379b = basePopupWindow;
            basePopupWindow.setClippingEnabled(false);
            inflate.findViewById(R.id.copy).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.widget.$$Lambda$a$d$QSa3puYA9BS6IDm56OQE9Pi29Io */

                public final void onClick(View view) {
                    C63206a.C63211d.this.m247554a(view);
                }
            });
        }
    }

    /* renamed from: h */
    private void m247528h() {
        this.f159348c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.C63206a.View$OnAttachStateChangeListenerC632071 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C63206a.this.mo218781c();
            }
        });
        this.f159358m = new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.$$Lambda$a$2Hi798J6GeWhNu8uO6AqOcRLfls */

            public final void onScrollChanged() {
                C63206a.this.m247533m();
            }
        };
        this.f159348c.getViewTreeObserver().addOnScrollChangedListener(this.f159358m);
        this.f159357l = new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.$$Lambda$a$FxjqlnTuueVstcGfnuatXLBejoc */

            public final boolean onPreDraw() {
                return C63206a.this.m247532l();
            }
        };
        this.f159348c.getViewTreeObserver().addOnPreDrawListener(this.f159357l);
    }

    /* renamed from: c */
    public void mo218781c() {
        this.f159348c.removeCallbacks(this.f159359n);
        this.f159348c.getViewTreeObserver().removeOnScrollChangedListener(this.f159358m);
        this.f159348c.getViewTreeObserver().removeOnPreDrawListener(this.f159357l);
        mo218776a();
    }

    /* renamed from: a */
    public void mo218778a(AbstractC63210c cVar) {
        this.f159353h = cVar;
    }

    /* renamed from: a */
    public C63209b mo218775a(boolean z) {
        if (this.f159355j.f159365a == z) {
            return this.f159355j;
        }
        return this.f159356k;
    }

    private C63206a(C63208a aVar) {
        this.f159352g = new C63212b();
        this.f159359n = new Runnable() {
            /* class com.ss.android.vc.meeting.module.subtitle.widget.$$Lambda$a$U03PX1tpLZI0s2lLXGGsWDDIc */

            public final void run() {
                C63206a.this.m247531k();
            }
        };
        this.f159347b = aVar;
        m247525e();
    }

    /* renamed from: a */
    public void mo218777a(int i, int i2) {
        mo218776a();
        this.f159351f = true;
        mo218780b(i, i2);
        m247529i();
    }

    /* renamed from: b */
    public void mo218780b(int i, int i2) {
        if (this.f159348c.getText() instanceof Spannable) {
            this.f159349d = (Spannable) this.f159348c.getText();
        }
        if (this.f159349d != null && i < this.f159348c.getText().length() && i2 <= this.f159348c.getText().length()) {
            if (i != -1) {
                this.f159352g.f159383a = i;
            }
            if (i2 != -1) {
                this.f159352g.f159384b = i2;
            }
            if (this.f159352g.f159383a > this.f159352g.f159384b) {
                int i3 = this.f159352g.f159383a;
                C63212b bVar = this.f159352g;
                bVar.f159383a = bVar.f159384b;
                this.f159352g.f159384b = i3;
            }
            if (this.f159349d != null) {
                if (this.f159354i == null) {
                    this.f159354i = new BackgroundColorSpan(this.f159347b.f159363c);
                }
                this.f159349d.setSpan(this.f159354i, this.f159352g.f159383a, this.f159352g.f159384b, 17);
            }
        }
    }
}

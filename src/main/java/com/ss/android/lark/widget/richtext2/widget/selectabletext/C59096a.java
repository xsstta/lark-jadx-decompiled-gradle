package com.ss.android.lark.widget.richtext2.widget.selectabletext;

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
import android.widget.PopupWindow;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext2.widget.selectabletext.C59096a;

/* renamed from: com.ss.android.lark.widget.richtext2.widget.selectabletext.a */
public class C59096a {

    /* renamed from: a */
    public Context f146513a;

    /* renamed from: b */
    public C59098a f146514b;

    /* renamed from: c */
    public TextView f146515c;

    /* renamed from: d */
    public Spannable f146516d;

    /* renamed from: e */
    public C59101d f146517e;

    /* renamed from: f */
    public boolean f146518f;

    /* renamed from: g */
    public C59102b f146519g;

    /* renamed from: h */
    public AbstractC59100c f146520h;

    /* renamed from: i */
    private BackgroundColorSpan f146521i;

    /* renamed from: j */
    private C59099b f146522j;

    /* renamed from: k */
    private C59099b f146523k;

    /* renamed from: l */
    private int f146524l;

    /* renamed from: m */
    private int f146525m;

    /* renamed from: n */
    private ViewTreeObserver.OnPreDrawListener f146526n;

    /* renamed from: o */
    private ViewTreeObserver.OnScrollChangedListener f146527o;

    /* renamed from: p */
    private final Runnable f146528p;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.selectabletext.a$c */
    public interface AbstractC59100c {
        void onTextSelected(C59102b bVar);
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.selectabletext.a$b */
    public class C59099b extends View {

        /* renamed from: a */
        public boolean f146534a;

        /* renamed from: c */
        private PopupWindow f146536c;

        /* renamed from: d */
        private Paint f146537d;

        /* renamed from: e */
        private int f146538e;

        /* renamed from: f */
        private int f146539f;

        /* renamed from: g */
        private int f146540g;

        /* renamed from: h */
        private int f146541h = 25;

        /* renamed from: i */
        private int f146542i;

        /* renamed from: j */
        private int f146543j;

        /* renamed from: k */
        private int f146544k;

        /* renamed from: l */
        private int f146545l;

        /* renamed from: m */
        private int[] f146546m = new int[2];

        /* renamed from: a */
        public void mo200789a() {
            this.f146536c.dismiss();
        }

        public boolean performClick() {
            return super.performClick();
        }

        /* renamed from: e */
        private void m229569e() {
            this.f146534a = !this.f146534a;
            invalidate();
        }

        /* renamed from: d */
        public int mo200794d() {
            return this.f146546m[1] + C59096a.this.f146515c.getPaddingTop();
        }

        /* renamed from: c */
        public int mo200793c() {
            return (this.f146546m[0] - this.f146541h) + C59096a.this.f146515c.getPaddingLeft();
        }

        /* renamed from: b */
        public void mo200791b() {
            int i;
            Layout layout = C59096a.this.f146515c.getLayout();
            if (layout != null) {
                if (this.f146534a) {
                    i = C59096a.this.f146519g.f146552a;
                } else {
                    i = C59096a.this.f146519g.f146553b;
                }
                mo200792b((int) layout.getPrimaryHorizontal(i), layout.getLineBottom(layout.getLineForOffset(i)));
            }
        }

        /* renamed from: f */
        private void m229570f() {
            int i;
            int i2;
            C59096a.this.f146515c.getLocationInWindow(this.f146546m);
            CharSequence text = C59096a.this.f146515c.getText();
            Layout layout = C59096a.this.f146515c.getLayout();
            if (layout != null) {
                if (this.f146534a) {
                    int i3 = C59096a.this.f146519g.f146552a;
                    i = (((int) layout.getPrimaryHorizontal(i3)) - this.f146539f) + mo200793c();
                    i2 = layout.getLineBottom(layout.getLineForOffset(i3)) + mo200794d();
                } else {
                    int i4 = C59096a.this.f146519g.f146553b;
                    while ('\n' == text.charAt(i4 - 1)) {
                        i4--;
                    }
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    C59096a.this.f146519g.f146553b = i4;
                    int lineBottom = layout.getLineBottom(layout.getLineForOffset(i4)) + mo200794d();
                    i = ((int) layout.getPrimaryHorizontal(i4)) + mo200793c();
                    i2 = lineBottom;
                }
                this.f146536c.update(i, i2, -1, -1);
            }
        }

        public void onDraw(Canvas canvas) {
            int i = this.f146538e;
            canvas.drawCircle((float) (this.f146541h + i), (float) i, (float) i, this.f146537d);
            if (this.f146534a) {
                int i2 = this.f146538e;
                int i3 = this.f146541h;
                canvas.drawRect((float) (i2 + i3), BitmapDescriptorFactory.HUE_RED, (float) ((i2 * 2) + i3), (float) i2, this.f146537d);
                return;
            }
            int i4 = this.f146541h;
            int i5 = this.f146538e;
            canvas.drawRect((float) i4, BitmapDescriptorFactory.HUE_RED, (float) (i4 + i5), (float) i5, this.f146537d);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f146544k = C59096a.this.f146519g.f146552a;
                this.f146545l = C59096a.this.f146519g.f146553b;
                this.f146542i = (int) motionEvent.getX();
                this.f146543j = (int) motionEvent.getY();
            } else if (action == 1) {
                performClick();
                C59096a.this.f146517e.mo200798a();
            } else if (action == 2) {
                C59096a.this.f146517e.mo200799b();
                mo200790a((((int) motionEvent.getRawX()) + this.f146542i) - this.f146539f, (((int) motionEvent.getRawY()) + this.f146543j) - this.f146540g);
            } else if (action == 3) {
                C59096a.this.f146517e.mo200798a();
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59099b(boolean z) {
            super(r3.f146513a);
            C59096a.this = r3;
            int i = (int) (r3.f146514b.f146533d / 2.0f);
            this.f146538e = i;
            this.f146539f = i * 2;
            this.f146540g = i * 2;
            this.f146534a = z;
            Paint paint = new Paint(1);
            this.f146537d = paint;
            paint.setColor(r3.f146514b.f146531b);
            PopupWindow popupWindow = new PopupWindow(this);
            this.f146536c = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f146536c.setWidth(this.f146539f + (this.f146541h * 2));
            this.f146536c.setHeight(this.f146540g + (this.f146541h / 2));
            invalidate();
        }

        /* renamed from: b */
        public void mo200792b(int i, int i2) {
            int i3;
            C59096a.this.f146515c.getLocationInWindow(this.f146546m);
            if (this.f146534a) {
                i3 = this.f146539f;
            } else {
                i3 = 0;
            }
            this.f146536c.showAtLocation(C59096a.this.f146515c, 0, (i - i3) + mo200793c(), i2 + mo200794d());
        }

        /* renamed from: a */
        public void mo200790a(int i, int i2) {
            int i3;
            C59096a.this.f146515c.getLocationInWindow(this.f146546m);
            if (this.f146534a) {
                i3 = C59096a.this.f146519g.f146552a;
            } else {
                i3 = C59096a.this.f146519g.f146553b;
            }
            int[] iArr = this.f146546m;
            int lineHeight = (i2 - iArr[1]) - C59096a.this.f146515c.getLineHeight();
            int a = C59103c.m229582a(C59096a.this.f146515c, i - iArr[0], lineHeight, i3);
            if (a != i3) {
                C59096a.this.mo200780b();
                if (this.f146534a) {
                    if (a > this.f146545l) {
                        C59099b a2 = C59096a.this.mo200775a(false);
                        m229569e();
                        a2.m229569e();
                        int i4 = this.f146545l;
                        this.f146544k = i4;
                        C59096a.this.mo200781b(i4, a);
                        a2.m229570f();
                    } else {
                        C59096a.this.mo200781b(a, -1);
                    }
                    m229570f();
                    return;
                }
                int i5 = this.f146544k;
                if (a < i5) {
                    C59099b a3 = C59096a.this.mo200775a(true);
                    a3.m229569e();
                    m229569e();
                    int i6 = this.f146544k;
                    this.f146545l = i6;
                    C59096a.this.mo200781b(a, i6);
                    a3.m229570f();
                } else {
                    C59096a.this.mo200781b(i5, a);
                }
                m229570f();
            }
        }
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.selectabletext.a$d */
    public class C59101d {

        /* renamed from: b */
        private PopupWindow f146548b;

        /* renamed from: c */
        private int[] f146549c;

        /* renamed from: d */
        private int f146550d;

        /* renamed from: e */
        private int f146551e;

        /* renamed from: b */
        public void mo200799b() {
            this.f146548b.dismiss();
        }

        /* renamed from: a */
        public void mo200798a() {
            C59096a.this.f146515c.getLocationInWindow(this.f146549c);
            Layout layout = C59096a.this.f146515c.getLayout();
            if (layout != null) {
                int primaryHorizontal = ((int) layout.getPrimaryHorizontal(C59096a.this.f146519g.f146552a)) + this.f146549c[0];
                if (primaryHorizontal <= 0) {
                    primaryHorizontal = 16;
                }
                if (this.f146550d + primaryHorizontal > DeviceUtils.getScreenWidth(C59096a.this.f146513a)) {
                    primaryHorizontal = (DeviceUtils.getScreenWidth(C59096a.this.f146513a) - this.f146550d) - 16;
                }
                int lineTop = layout.getLineTop(layout.getLineForOffset(C59096a.this.f146519g.f146552a)) + this.f146549c[1];
                int i = this.f146551e;
                int i2 = (lineTop - i) - 16;
                if (i2 < 0) {
                    i2 = 16;
                }
                if (i + i2 > DeviceUtils.getScreenHeight(C59096a.this.f146513a)) {
                    i2 = (DeviceUtils.getScreenHeight(C59096a.this.f146513a) - this.f146551e) - 16;
                }
                this.f146548b.setElevation(8.0f);
                this.f146548b.showAtLocation(C59096a.this.f146515c, 0, primaryHorizontal, i2);
            }
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m229577a(View view) {
            C59096a.this.mo200777a(0, C59096a.this.f146515c.getText().length());
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m229578b(View view) {
            C59096a.this.mo200776a();
            if (C59096a.this.f146520h != null) {
                C59096a.this.f146519g.f146554c = C59096a.this.f146516d.subSequence(C59096a.this.f146519g.f146552a, C59096a.this.f146519g.f146553b).toString();
                C59096a.this.f146520h.onTextSelected(C59096a.this.f146519g);
            }
        }

        private C59101d(Context context) {
            C59096a.this = r3;
            this.f146549c = new int[2];
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_selection_operate_windows, (ViewGroup) null);
            inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f146550d = inflate.getMeasuredWidth();
            this.f146551e = inflate.getMeasuredHeight();
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
            this.f146548b = popupWindow;
            popupWindow.setClippingEnabled(false);
            inflate.findViewById(R.id.operate_tv_copy).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$a$d$39KiIem61Twz4oUeuWzRMda3Uo */

                public final void onClick(View view) {
                    C59096a.C59101d.m271104lambda$39KiIem61Twz4oUeuWzRMda3Uo(C59096a.C59101d.this, view);
                }
            });
            inflate.findViewById(R.id.operate_tv_select_all).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$a$d$6XifsykoZci9sDUyjId_I4IVAA */

                public final void onClick(View view) {
                    C59096a.C59101d.m271105lambda$6XifsykoZci9sDUyjId_I4IVAA(C59096a.C59101d.this, view);
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m229554j() {
        if (this.f146518f) {
            m229552h();
        }
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.selectabletext.a$a */
    public static class C59098a {

        /* renamed from: a */
        public TextView f146530a;

        /* renamed from: b */
        int f146531b;

        /* renamed from: c */
        int f146532c;

        /* renamed from: d */
        public float f146533d;

        /* renamed from: a */
        public C59096a mo200787a() {
            return new C59096a(this);
        }

        /* renamed from: a */
        public C59098a mo200785a(float f) {
            this.f146533d = f;
            return this;
        }

        /* renamed from: b */
        public C59098a mo200788b(int i) {
            this.f146532c = i;
            return this;
        }

        public C59098a(TextView textView) {
            this.f146530a = textView;
        }

        /* renamed from: a */
        public C59098a mo200786a(int i) {
            this.f146531b = i;
            return this;
        }
    }

    /* renamed from: d */
    private void m229547d() {
        m229549e();
        m229550f();
        m229551g();
    }

    /* renamed from: h */
    private void m229552h() {
        this.f146522j.mo200791b();
        this.f146523k.mo200791b();
        this.f146517e.mo200798a();
    }

    /* renamed from: i */
    private void m229553i() {
        this.f146522j.mo200789a();
        this.f146523k.mo200789a();
        this.f146517e.mo200799b();
    }

    /* renamed from: e */
    private void m229549e() {
        TextView textView = this.f146514b.f146530a;
        this.f146515c = textView;
        textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
        this.f146515c.setTextIsSelectable(false);
        this.f146513a = this.f146515c.getContext();
    }

    /* renamed from: f */
    private void m229550f() {
        this.f146522j = new C59099b(true);
        this.f146523k = new C59099b(false);
        this.f146517e = new C59101d(this.f146513a);
    }

    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ boolean m229555k() {
        if (!this.f146518f) {
            return true;
        }
        this.f146515c.removeCallbacks(this.f146528p);
        this.f146515c.postDelayed(this.f146528p, 100);
        return true;
    }

    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ void m229556l() {
        if (this.f146518f) {
            this.f146517e.mo200799b();
            this.f146522j.mo200789a();
            this.f146523k.mo200789a();
        }
    }

    /* renamed from: b */
    public void mo200780b() {
        BackgroundColorSpan backgroundColorSpan;
        this.f146519g.f146554c = null;
        Spannable spannable = this.f146516d;
        if (spannable != null && (backgroundColorSpan = this.f146521i) != null) {
            spannable.removeSpan(backgroundColorSpan);
        }
    }

    /* renamed from: g */
    private void m229551g() {
        this.f146515c.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$a$Gi71nZujeegPK88ZvmshNqIhwP8 */

            public final boolean onLongClick(View view) {
                return C59096a.lambda$Gi71nZujeegPK88ZvmshNqIhwP8(C59096a.this, view);
            }
        });
        this.f146515c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.C59096a.View$OnAttachStateChangeListenerC590971 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C59096a.this.mo200782c();
            }
        });
        this.f146527o = new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$a$1sCioB4yp2Nvvg6kd0znW0oMMzc */

            public final void onScrollChanged() {
                C59096a.lambda$1sCioB4yp2Nvvg6kd0znW0oMMzc(C59096a.this);
            }
        };
        this.f146515c.getViewTreeObserver().addOnScrollChangedListener(this.f146527o);
        this.f146526n = new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$a$4dds2FTQe4i8qsmsz1zczrNcwM */

            public final boolean onPreDraw() {
                return C59096a.m271103lambda$4dds2FTQe4i8qsmsz1zczrNcwM(C59096a.this);
            }
        };
        this.f146515c.getViewTreeObserver().addOnPreDrawListener(this.f146526n);
    }

    /* renamed from: a */
    public void mo200776a() {
        this.f146518f = false;
        mo200780b();
        m229553i();
    }

    /* renamed from: c */
    public void mo200782c() {
        this.f146515c.removeCallbacks(this.f146528p);
        this.f146515c.getViewTreeObserver().removeOnScrollChangedListener(this.f146527o);
        this.f146515c.getViewTreeObserver().removeOnPreDrawListener(this.f146526n);
        mo200776a();
    }

    /* renamed from: a */
    public void mo200779a(AbstractC59100c cVar) {
        this.f146520h = cVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m229545a(View view) {
        m229546c(this.f146524l, this.f146525m);
        return true;
    }

    private C59096a(C59098a aVar) {
        this.f146519g = new C59102b();
        this.f146528p = new Runnable() {
            /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$a$PJpnog7eFLW50jf2p8e295b91kY */

            public final void run() {
                C59096a.lambda$PJpnog7eFLW50jf2p8e295b91kY(C59096a.this);
            }
        };
        this.f146514b = aVar;
        m229547d();
    }

    /* renamed from: a */
    public C59099b mo200775a(boolean z) {
        if (this.f146522j.f146534a == z) {
            return this.f146522j;
        }
        return this.f146523k;
    }

    /* renamed from: a */
    public void mo200778a(MotionEvent motionEvent) {
        this.f146524l = (int) motionEvent.getX();
        this.f146525m = (int) motionEvent.getY();
    }

    /* renamed from: c */
    private void m229546c(int i, int i2) {
        mo200776a();
        this.f146518f = true;
        m229548d(i, i2);
        m229552h();
    }

    /* renamed from: d */
    private void m229548d(int i, int i2) {
        int a = C59103c.m229581a(this.f146515c, i, i2);
        int i3 = a + 1;
        if (this.f146515c.getText() instanceof Spannable) {
            this.f146516d = (Spannable) this.f146515c.getText();
        }
        if (this.f146516d != null && a < this.f146515c.getText().length()) {
            mo200781b(a, i3);
        }
    }

    /* renamed from: a */
    public void mo200777a(int i, int i2) {
        mo200776a();
        this.f146518f = true;
        mo200781b(i, i2);
        m229552h();
    }

    /* renamed from: b */
    public void mo200781b(int i, int i2) {
        if (i != -1) {
            this.f146519g.f146552a = i;
        }
        if (i2 != -1) {
            this.f146519g.f146553b = i2;
        }
        if (this.f146519g.f146552a > this.f146519g.f146553b) {
            int i3 = this.f146519g.f146552a;
            C59102b bVar = this.f146519g;
            bVar.f146552a = bVar.f146553b;
            this.f146519g.f146553b = i3;
        }
        if (this.f146516d != null) {
            if (this.f146521i == null) {
                this.f146521i = new BackgroundColorSpan(this.f146514b.f146532c);
            }
            this.f146516d.setSpan(this.f146521i, this.f146519g.f146552a, this.f146519g.f146553b, 17);
        }
    }
}

package com.ss.android.lark.widget.select;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.select.SelectableView;

/* renamed from: com.ss.android.lark.widget.select.d */
public class C59119d {

    /* renamed from: a */
    public Context f146636a;

    /* renamed from: b */
    public C59121a f146637b;

    /* renamed from: c */
    public SelectableView f146638c;

    /* renamed from: d */
    public boolean f146639d;

    /* renamed from: e */
    public C59117b f146640e;

    /* renamed from: f */
    private Spannable f146641f;

    /* renamed from: g */
    private int f146642g;

    /* renamed from: h */
    private int f146643h;

    /* renamed from: i */
    private C59122b f146644i;

    /* renamed from: j */
    private C59122b f146645j;

    /* renamed from: k */
    private AbstractC59123c f146646k;

    /* renamed from: l */
    private ViewTreeObserver.OnScrollChangedListener f146647l;

    /* renamed from: m */
    private final Runnable f146648m;

    /* renamed from: com.ss.android.lark.widget.select.d$c */
    public interface AbstractC59123c {
        void onTextSelected(SelectedTextInfo aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.select.d$b */
    public class C59122b extends View {

        /* renamed from: a */
        public boolean f146653a;

        /* renamed from: c */
        private PopupWindow f146655c;

        /* renamed from: d */
        private Paint f146656d;

        /* renamed from: e */
        private int f146657e;

        /* renamed from: f */
        private int f146658f;

        /* renamed from: g */
        private int f146659g;

        /* renamed from: h */
        private int f146660h = UIHelper.dp2px(20.0f);

        /* renamed from: i */
        private int f146661i;

        /* renamed from: j */
        private int f146662j;

        /* renamed from: k */
        private int f146663k;

        /* renamed from: l */
        private int f146664l;

        /* renamed from: m */
        private boolean f146665m;

        /* renamed from: n */
        private int[] f146666n = new int[2];

        /* renamed from: a */
        public boolean mo200878a() {
            return this.f146665m;
        }

        /* renamed from: b */
        public void mo200879b() {
            this.f146655c.dismiss();
        }

        public boolean performClick() {
            return super.performClick();
        }

        /* renamed from: f */
        private void m229665f() {
            this.f146653a = !this.f146653a;
            invalidate();
        }

        /* renamed from: e */
        public int mo200883e() {
            return this.f146666n[1] + C59119d.this.f146638c.getPaddingTop();
        }

        /* renamed from: d */
        public int mo200882d() {
            return (this.f146666n[0] - this.f146660h) + C59119d.this.f146638c.getPaddingLeft();
        }

        /* renamed from: c */
        public void mo200881c() {
            int i;
            Layout layout = C59119d.this.f146638c.getLayout();
            if (layout != null) {
                if (this.f146653a) {
                    i = C59119d.this.f146640e.f146633a;
                } else {
                    i = C59119d.this.f146640e.f146634b;
                }
                int lineForOffset = layout.getLineForOffset(i);
                mo200880b((int) layout.getPrimaryHorizontal(i), ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2) - this.f146660h);
            }
        }

        /* renamed from: g */
        private void m229666g() {
            int i;
            int i2;
            C59119d.this.f146638c.getLocationInWindow(this.f146666n);
            CharSequence content = C59119d.this.f146638c.getContent();
            Layout layout = C59119d.this.f146638c.getLayout();
            if (layout != null) {
                if (this.f146653a) {
                    int i3 = C59119d.this.f146640e.f146633a;
                    i2 = (((int) layout.getPrimaryHorizontal(i3)) - this.f146658f) + mo200882d();
                    int lineForOffset = layout.getLineForOffset(i3);
                    i = (((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2) + mo200883e()) - this.f146660h;
                } else {
                    int i4 = C59119d.this.f146640e.f146634b;
                    while (i4 > 0 && '\n' == content.charAt(i4 - 1)) {
                        i4--;
                    }
                    if (i4 <= 0) {
                        i4 = 0;
                    }
                    C59119d.this.f146640e.f146634b = i4;
                    int primaryHorizontal = ((int) layout.getPrimaryHorizontal(i4)) + mo200882d();
                    int lineForOffset2 = layout.getLineForOffset(i4);
                    i = (((layout.getLineTop(lineForOffset2) + layout.getLineBottom(lineForOffset2)) / 2) + mo200883e()) - this.f146660h;
                    i2 = primaryHorizontal;
                }
                this.f146655c.update(i2, i, -1, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            int i = this.f146657e;
            int i2 = this.f146660h;
            canvas.drawCircle((float) (i + i2), (float) (i2 + i), (float) i, this.f146656d);
            if (this.f146653a) {
                int i3 = this.f146657e;
                int i4 = this.f146660h;
                canvas.drawRect((float) (i3 + i4), (float) i4, (float) ((i3 * 2) + i4), (float) (i3 + i4), this.f146656d);
                return;
            }
            int i5 = this.f146660h;
            int i6 = this.f146657e;
            canvas.drawRect((float) i5, (float) i5, (float) (i6 + i5), (float) (i6 + i5), this.f146656d);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f146663k = C59119d.this.f146640e.f146633a;
                this.f146664l = C59119d.this.f146640e.f146634b;
                this.f146661i = (int) motionEvent.getX();
                this.f146662j = (int) motionEvent.getY();
                this.f146665m = true;
            } else if (action == 1) {
                performClick();
                this.f146665m = false;
                C59119d.this.mo200870e();
            } else if (action == 2) {
                mo200877a((((int) motionEvent.getRawX()) + this.f146661i) - this.f146658f, (((int) motionEvent.getRawY()) + this.f146662j) - this.f146659g);
            } else if (action == 3) {
                this.f146665m = false;
                C59119d.this.mo200870e();
            }
            return true;
        }

        /* renamed from: b */
        public void mo200880b(int i, int i2) {
            int i3;
            C59119d.this.f146638c.getLocationInWindow(this.f146666n);
            if (this.f146653a) {
                i3 = this.f146658f;
            } else {
                i3 = 0;
            }
            this.f146655c.showAtLocation(C59119d.this.f146638c, 0, (i - i3) + mo200882d(), i2 + mo200883e());
        }

        public C59122b(boolean z) {
            super(C59119d.this.f146636a);
            int i = (int) (C59119d.this.f146637b.f146652c / 2.0f);
            this.f146657e = i;
            this.f146658f = i * 2;
            this.f146659g = i * 2;
            this.f146653a = z;
            Paint paint = new Paint(1);
            this.f146656d = paint;
            paint.setColor(C59119d.this.f146637b.f146651b);
            PopupWindow popupWindow = new PopupWindow(this);
            this.f146655c = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f146655c.setWidth(this.f146658f + (this.f146660h * 2));
            this.f146655c.setHeight(this.f146659g + (this.f146660h * 2));
            invalidate();
        }

        /* renamed from: a */
        public void mo200877a(int i, int i2) {
            int i3;
            C59119d.this.f146638c.getLocationInWindow(this.f146666n);
            if (this.f146653a) {
                i3 = C59119d.this.f146640e.f146633a;
            } else {
                i3 = C59119d.this.f146640e.f146634b;
            }
            int[] iArr = this.f146666n;
            int i4 = i2 - iArr[1];
            Layout layout = C59119d.this.f146638c.getLayout();
            int lineForVertical = layout.getLineForVertical(i4);
            int a = C59118c.m229639a(C59119d.this.f146638c, i - iArr[0], i4 - (layout.getLineBottom(lineForVertical) - layout.getLineTop(lineForVertical)), i3);
            if (a != i3) {
                C59119d.this.mo200869d();
                if (this.f146653a) {
                    if (a > this.f146664l) {
                        C59122b a2 = C59119d.this.mo200863a(false);
                        m229665f();
                        a2.m229665f();
                        int i5 = this.f146664l;
                        this.f146663k = i5;
                        C59119d.this.mo200865a(i5, a);
                        a2.m229666g();
                    } else {
                        C59119d.this.mo200865a(a, -1);
                    }
                    m229666g();
                    return;
                }
                int i6 = this.f146663k;
                if (a < i6) {
                    C59122b a3 = C59119d.this.mo200863a(true);
                    a3.m229665f();
                    m229665f();
                    int i7 = this.f146663k;
                    this.f146664l = i7;
                    C59119d.this.mo200865a(a, i7);
                    a3.m229666g();
                } else {
                    C59119d.this.mo200865a(i6, a);
                }
                m229666g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m229651p() {
        if (this.f146639d) {
            m229646k();
        }
    }

    /* renamed from: com.ss.android.lark.widget.select.d$a */
    public static class C59121a {

        /* renamed from: a */
        public SelectableView f146650a;

        /* renamed from: b */
        int f146651b;

        /* renamed from: c */
        public float f146652c;

        /* renamed from: a */
        public C59119d mo200876a() {
            return new C59119d(this);
        }

        /* renamed from: a */
        public C59121a mo200874a(float f) {
            this.f146652c = f;
            return this;
        }

        public C59121a(SelectableView selectableView) {
            this.f146650a = selectableView;
        }

        /* renamed from: a */
        public C59121a mo200875a(int i) {
            this.f146651b = i;
            return this;
        }
    }

    /* renamed from: g */
    private void m229642g() {
        m229643h();
        m229644i();
        m229645j();
    }

    /* renamed from: h */
    private void m229643h() {
        SelectableView selectableView = this.f146637b.f146650a;
        this.f146638c = selectableView;
        this.f146636a = selectableView.getContext();
    }

    /* renamed from: k */
    private void m229646k() {
        this.f146644i.mo200881c();
        this.f146645j.mo200881c();
    }

    /* renamed from: l */
    private void m229647l() {
        this.f146644i.mo200879b();
        this.f146645j.mo200879b();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m229652q() {
        Log.m165379d("TextSelectHelper", "onScroll dismiss");
        mo200868c();
    }

    /* renamed from: c */
    public void mo200868c() {
        this.f146639d = false;
        mo200869d();
        m229647l();
    }

    /* renamed from: f */
    public void mo200871f() {
        this.f146638c.getViewTreeObserver().removeOnScrollChangedListener(this.f146647l);
        mo200868c();
    }

    /* renamed from: i */
    private void m229644i() {
        this.f146644i = new C59122b(true);
        this.f146645j = new C59122b(false);
    }

    /* renamed from: j */
    private void m229645j() {
        this.f146638c.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.widget.select.C59119d.View$OnAttachStateChangeListenerC591201 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C59119d.this.mo200871f();
            }
        });
        this.f146647l = new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.ss.android.lark.widget.select.$$Lambda$d$qpLmOTUrxuk4FcmzeDT63dOlQ4 */

            public final void onScrollChanged() {
                C59119d.this.m229652q();
            }
        };
        this.f146638c.getViewTreeObserver().addOnScrollChangedListener(this.f146647l);
    }

    /* renamed from: m */
    private int m229648m() {
        int i = this.f146640e.f146633a;
        Layout layout = this.f146638c.getLayout();
        if (layout == null) {
            return -1;
        }
        return (int) layout.getPrimaryHorizontal(i);
    }

    /* renamed from: b */
    public void mo200867b() {
        boolean z;
        if (this.f146644i.mo200878a() || this.f146645j.mo200878a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo200868c();
        }
    }

    /* renamed from: d */
    public void mo200869d() {
        this.f146640e.f146635c = null;
        Spannable spannable = this.f146641f;
        if (spannable != null) {
            Selection.removeSelection(spannable);
            this.f146638c.mo200853a(SelectableView.State.NORMAL);
        }
    }

    /* renamed from: n */
    private int m229649n() {
        int[] iArr = new int[2];
        this.f146638c.getLocationInWindow(iArr);
        Layout layout = this.f146638c.getLayout();
        if (layout == null) {
            return -1;
        }
        return layout.getLineTop(layout.getLineForOffset(this.f146640e.f146633a)) + iArr[1];
    }

    /* renamed from: o */
    private int m229650o() {
        int[] iArr = new int[2];
        this.f146638c.getLocationInWindow(iArr);
        Layout layout = this.f146638c.getLayout();
        if (layout == null) {
            return -1;
        }
        return layout.getLineBottom(layout.getLineForOffset(this.f146640e.f146634b)) + iArr[1];
    }

    /* renamed from: a */
    public void mo200864a() {
        this.f146642g = 0;
        this.f146643h = this.f146638c.getContent().length();
        if (this.f146638c.getContent() instanceof Spannable) {
            this.f146641f = (Spannable) this.f146638c.getContent();
        }
        try {
            m229641b(this.f146642g, this.f146643h);
            mo200870e();
        } catch (Exception e) {
            Log.m165386e("TextSelectHelper", e);
        }
    }

    /* renamed from: e */
    public void mo200870e() {
        boolean z;
        try {
            if (this.f146646k != null && this.f146640e.f146633a >= 0 && this.f146640e.f146634b <= this.f146641f.length()) {
                CharSequence subSequence = this.f146641f.subSequence(this.f146640e.f146633a, this.f146640e.f146634b);
                int n = m229649n();
                int o = m229650o();
                int m = m229648m();
                if (this.f146642g >= this.f146640e.f146633a) {
                    if (this.f146640e.f146634b >= this.f146643h) {
                        z = false;
                        this.f146646k.onTextSelected(new SelectedTextInfo(subSequence, n, o, m, z));
                    }
                }
                z = true;
                this.f146646k.onTextSelected(new SelectedTextInfo(subSequence, n, o, m, z));
            }
        } catch (Exception e) {
            Log.m165386e("TextSelectHelper", e);
        }
    }

    /* renamed from: a */
    public void mo200866a(AbstractC59123c cVar) {
        this.f146646k = cVar;
    }

    /* renamed from: a */
    public C59122b mo200863a(boolean z) {
        if (this.f146644i.f146653a == z) {
            return this.f146644i;
        }
        return this.f146645j;
    }

    private C59119d(C59121a aVar) {
        this.f146640e = new C59117b();
        this.f146648m = new Runnable() {
            /* class com.ss.android.lark.widget.select.$$Lambda$d$_VSVhMaz6dwPsrDTS6J6J5WlAB4 */

            public final void run() {
                C59119d.this.m229651p();
            }
        };
        this.f146637b = aVar;
        m229642g();
    }

    /* renamed from: b */
    private void m229641b(int i, int i2) {
        mo200868c();
        this.f146639d = true;
        mo200865a(i, i2);
        m229646k();
    }

    /* renamed from: a */
    public void mo200865a(int i, int i2) {
        if (i != -1) {
            this.f146640e.f146633a = i;
        }
        if (i2 != -1) {
            this.f146640e.f146634b = i2;
        }
        if (this.f146640e.f146633a > this.f146640e.f146634b) {
            int i3 = this.f146640e.f146633a;
            C59117b bVar = this.f146640e;
            bVar.f146633a = bVar.f146634b;
            this.f146640e.f146634b = i3;
        }
        Spannable spannable = this.f146641f;
        if (spannable != null) {
            Selection.setSelection(spannable, this.f146640e.f146633a, this.f146640e.f146634b);
            this.f146638c.mo200853a(SelectableView.State.SELECTED);
        }
    }
}

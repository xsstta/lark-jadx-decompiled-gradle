package com.ss.android.vc.meeting.utils.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.core.widget.C0945h;
import com.larksuite.framework.ui.BasePopupWindow;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;

/* renamed from: com.ss.android.vc.meeting.utils.popup.a */
public abstract class AbstractC63524a<T extends AbstractC63524a> implements PopupWindow.OnDismissListener {

    /* renamed from: A */
    private int f160491A;

    /* renamed from: B */
    private int f160492B = 1;

    /* renamed from: a */
    private BasePopupWindow f160493a;

    /* renamed from: b */
    private Context f160494b;

    /* renamed from: c */
    private View f160495c;

    /* renamed from: d */
    private int f160496d;

    /* renamed from: e */
    public int f160497e = -2;

    /* renamed from: f */
    public int f160498f = -2;

    /* renamed from: g */
    public View f160499g;

    /* renamed from: h */
    public int f160500h = 2;

    /* renamed from: i */
    public int f160501i = 1;

    /* renamed from: j */
    public int f160502j;

    /* renamed from: k */
    public int f160503k;

    /* renamed from: l */
    public boolean f160504l;

    /* renamed from: m */
    public boolean f160505m;

    /* renamed from: n */
    public boolean f160506n;

    /* renamed from: o */
    public AbstractC63528a f160507o;

    /* renamed from: p */
    private boolean f160508p = true;

    /* renamed from: q */
    private boolean f160509q = true;

    /* renamed from: r */
    private int f160510r;

    /* renamed from: s */
    private PopupWindow.OnDismissListener f160511s;

    /* renamed from: t */
    private boolean f160512t;

    /* renamed from: u */
    private float f160513u = 0.7f;

    /* renamed from: v */
    private int f160514v = -16777216;

    /* renamed from: w */
    private ViewGroup f160515w;

    /* renamed from: x */
    private Transition f160516x;

    /* renamed from: y */
    private Transition f160517y;

    /* renamed from: z */
    private boolean f160518z = true;

    /* renamed from: com.ss.android.vc.meeting.utils.popup.a$a */
    public interface AbstractC63528a {
        /* renamed from: a */
        void mo219708a(AbstractC63524a aVar, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo211394a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo211396a(View view, T t);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public T mo219698f() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo219701i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo219700h() {
        mo211394a();
    }

    public void onDismiss() {
        m248944o();
    }

    /* renamed from: k */
    public View mo219703k() {
        BasePopupWindow basePopupWindow = this.f160493a;
        if (basePopupWindow != null) {
            return basePopupWindow.getContentView();
        }
        return null;
    }

    /* renamed from: l */
    public boolean mo219704l() {
        BasePopupWindow basePopupWindow = this.f160493a;
        if (basePopupWindow == null || !basePopupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void mo215682e() {
        mo219703k().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.vc.meeting.utils.popup.AbstractC63524a.ViewTreeObserver$OnGlobalLayoutListenerC635273 */

            public void onGlobalLayout() {
                int i;
                int i2;
                AbstractC63524a.this.mo219703k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                AbstractC63524a aVar = AbstractC63524a.this;
                aVar.f160497e = aVar.mo219703k().getWidth();
                AbstractC63524a aVar2 = AbstractC63524a.this;
                aVar2.f160498f = aVar2.mo219703k().getHeight();
                AbstractC63524a.this.f160505m = true;
                AbstractC63524a.this.f160504l = false;
                if (AbstractC63524a.this.f160507o != null) {
                    AbstractC63528a aVar3 = AbstractC63524a.this.f160507o;
                    AbstractC63524a aVar4 = AbstractC63524a.this;
                    int i3 = aVar4.f160497e;
                    int i4 = AbstractC63524a.this.f160498f;
                    if (AbstractC63524a.this.f160499g == null) {
                        i = 0;
                    } else {
                        i = AbstractC63524a.this.f160499g.getWidth();
                    }
                    if (AbstractC63524a.this.f160499g == null) {
                        i2 = 0;
                    } else {
                        i2 = AbstractC63524a.this.f160499g.getHeight();
                    }
                    aVar3.mo219708a(aVar4, i3, i4, i, i2);
                }
                if (AbstractC63524a.this.mo219704l() && AbstractC63524a.this.f160506n) {
                    AbstractC63524a aVar5 = AbstractC63524a.this;
                    aVar5.mo219689a(aVar5.f160497e, AbstractC63524a.this.f160498f, AbstractC63524a.this.f160499g, AbstractC63524a.this.f160500h, AbstractC63524a.this.f160501i, AbstractC63524a.this.f160502j, AbstractC63524a.this.f160503k);
                }
            }
        });
    }

    /* renamed from: o */
    private void m248944o() {
        PopupWindow.OnDismissListener onDismissListener = this.f160511s;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        m248943n();
        BasePopupWindow basePopupWindow = this.f160493a;
        if (basePopupWindow != null && basePopupWindow.isShowing()) {
            mo211398c();
        }
        mo219701i();
    }

    /* renamed from: c */
    public void mo211398c() {
        try {
            BasePopupWindow basePopupWindow = this.f160493a;
            if (basePopupWindow != null) {
                basePopupWindow.dismiss();
            }
        } catch (Exception e) {
            C60700b.m235864f("VCEasyPopup", "[dismiss]", e.getMessage());
        }
    }

    /* renamed from: m */
    private void m248942m() {
        if (Build.VERSION.SDK_INT >= 18 && this.f160512t) {
            ViewGroup viewGroup = this.f160515w;
            if (viewGroup != null) {
                m248933a(viewGroup);
            } else if (mo219703k() != null && mo219703k().getContext() != null && (mo219703k().getContext() instanceof Activity)) {
                m248932a((Activity) mo219703k().getContext());
            }
        }
    }

    /* renamed from: n */
    private void m248943n() {
        Activity activity;
        if (Build.VERSION.SDK_INT >= 18 && this.f160512t) {
            ViewGroup viewGroup = this.f160515w;
            if (viewGroup != null) {
                m248936b(viewGroup);
            } else if (mo219703k() != null && (activity = (Activity) mo219703k().getContext()) != null) {
                m248935b(activity);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo219702j() {
        View k = mo219703k();
        if (this.f160497e <= 0 || this.f160498f <= 0) {
            k.measure(0, 0);
            if (this.f160497e <= 0) {
                this.f160497e = k.getMeasuredWidth();
            }
            if (this.f160498f <= 0) {
                this.f160498f = k.getMeasuredHeight();
            }
        }
    }

    /* renamed from: b */
    private void mo211397b() {
        Context context;
        if (this.f160495c == null) {
            if (this.f160496d == 0 || (context = this.f160494b) == null) {
                throw new IllegalArgumentException("The content view is null,the layoutId=" + this.f160496d + ",context=" + this.f160494b);
            }
            this.f160495c = LayoutInflater.from(context).inflate(this.f160496d, (ViewGroup) null);
        }
        this.f160493a.setContentView(this.f160495c);
        int i = this.f160497e;
        if (i > 0 || i == -2 || i == -1) {
            this.f160493a.setWidth(i);
        } else {
            this.f160493a.setWidth(-2);
        }
        int i2 = this.f160498f;
        if (i2 > 0 || i2 == -2 || i2 == -1) {
            this.f160493a.setHeight(i2);
        } else {
            this.f160493a.setHeight(-2);
        }
        mo215682e();
        this.f160493a.setInputMethodMode(this.f160491A);
        this.f160493a.setSoftInputMode(this.f160492B);
    }

    /* renamed from: d */
    private void mo213204d() {
        if (!this.f160518z) {
            this.f160493a.setFocusable(true);
            this.f160493a.setOutsideTouchable(false);
            this.f160493a.setBackgroundDrawable(null);
            this.f160493a.getContentView().setFocusable(true);
            this.f160493a.getContentView().setFocusableInTouchMode(true);
            this.f160493a.getContentView().setOnKeyListener(new View.OnKeyListener() {
                /* class com.ss.android.vc.meeting.utils.popup.AbstractC63524a.View$OnKeyListenerC635251 */

                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    AbstractC63524a.this.mo211398c();
                    return true;
                }
            });
            this.f160493a.setTouchInterceptor(new View.OnTouchListener() {
                /* class com.ss.android.vc.meeting.utils.popup.AbstractC63524a.View$OnTouchListenerC635262 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if ((motionEvent.getAction() != 0 || (x >= 0 && x < AbstractC63524a.this.f160497e && y >= 0 && y < AbstractC63524a.this.f160498f)) && motionEvent.getAction() != 4) {
                        return false;
                    }
                    return true;
                }
            });
            return;
        }
        this.f160493a.setFocusable(this.f160508p);
        this.f160493a.setOutsideTouchable(this.f160509q);
        this.f160493a.setBackgroundDrawable(new ColorDrawable(0));
    }

    /* renamed from: g */
    public T mo219699g() {
        if (this.f160493a == null) {
            this.f160493a = new BasePopupWindow();
        }
        mo219700h();
        mo211397b();
        mo219696b(this.f160495c);
        int i = this.f160510r;
        if (i != 0) {
            this.f160493a.setAnimationStyle(i);
        }
        mo213204d();
        this.f160493a.setOnDismissListener(this);
        if (Build.VERSION.SDK_INT >= 23) {
            Transition transition = this.f160516x;
            if (transition != null) {
                this.f160493a.setEnterTransition(transition);
            }
            Transition transition2 = this.f160517y;
            if (transition2 != null) {
                this.f160493a.setExitTransition(transition2);
            }
        }
        return mo219698f();
    }

    /* renamed from: b */
    private void m248936b(ViewGroup viewGroup) {
        viewGroup.getOverlay().clear();
    }

    /* renamed from: a */
    public T mo219685a(float f) {
        this.f160513u = f;
        return mo219698f();
    }

    /* renamed from: c */
    private void m248938c(boolean z) {
        if (this.f160506n != z) {
            this.f160506n = z;
        }
        if (this.f160493a == null) {
            mo219699g();
        }
    }

    /* renamed from: a */
    public T mo219686a(int i) {
        this.f160495c = null;
        this.f160496d = i;
        return mo219698f();
    }

    /* renamed from: b */
    public T mo219694b(Context context) {
        this.f160494b = context;
        return mo219698f();
    }

    /* renamed from: b */
    private void m248935b(Activity activity) {
        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
    }

    /* renamed from: a */
    private void m248932a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.f160514v);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f160513u * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* renamed from: b */
    public <T extends View> T mo219693b(int i) {
        if (mo219703k() != null) {
            return (T) mo219703k().findViewById(i);
        }
        return null;
    }

    /* renamed from: a */
    private void m248933a(ViewGroup viewGroup) {
        ColorDrawable colorDrawable = new ColorDrawable(this.f160514v);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f160513u * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* renamed from: a */
    public T mo219688a(boolean z) {
        this.f160518z = z;
        return mo219698f();
    }

    /* renamed from: b */
    public T mo219695b(boolean z) {
        this.f160512t = z;
        return mo219698f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo219696b(View view) {
        mo211396a(view, mo219698f());
    }

    /* renamed from: a */
    public T mo219687a(int i, int i2, int i3) {
        this.f160495c = null;
        this.f160496d = i;
        this.f160497e = i2;
        this.f160498f = i3;
        return mo219698f();
    }

    /* renamed from: a */
    public void mo219690a(View view, int i, int i2) {
        mo219692a(view, i, i2, 0, 0);
    }

    /* renamed from: c */
    private int m248937c(View view, int i, int i2, int i3) {
        int i4;
        if (i != 0) {
            if (i == 1) {
                i2 += view.getHeight();
            } else if (i == 3) {
                i4 = view.getHeight();
            } else if (i != 4) {
                return i3;
            }
            return i3 - i2;
        }
        i4 = (view.getHeight() / 2) + (i2 / 2);
        return i3 - i4;
    }

    /* renamed from: d */
    private int m248939d(View view, int i, int i2, int i3) {
        int i4;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    i4 = view.getWidth();
                } else if (i != 4) {
                    return i3;
                } else {
                    i2 -= view.getWidth();
                }
            }
            return i3 - i2;
        }
        i4 = (view.getWidth() / 2) - (i2 / 2);
        return i3 + i4;
    }

    /* renamed from: b */
    public void mo219697b(View view, int i, int i2, int i3) {
        m248938c(false);
        m248942m();
        this.f160499g = view;
        this.f160502j = i2;
        this.f160503k = i3;
        if (this.f160504l) {
            mo215682e();
        }
        try {
            this.f160493a.showAtLocation(view, i, this.f160502j, this.f160503k);
        } catch (Exception e) {
            C60700b.m235864f("VCEasyPopup", "[showAtLocation]", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo219691a(View view, int i, int i2, int i3) {
        m248938c(false);
        m248942m();
        this.f160499g = view;
        this.f160502j = i;
        this.f160503k = i2;
        if (this.f160504l) {
            mo215682e();
        }
        try {
            C0945h.m4560a(this.f160493a, view, this.f160502j, this.f160503k, i3);
        } catch (Exception e) {
            C60700b.m235864f("VCEasyPopup", "[showAsDropDown3]", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo219692a(View view, int i, int i2, int i3, int i4) {
        m248938c(true);
        mo219702j();
        this.f160499g = view;
        this.f160502j = i3;
        this.f160503k = i4;
        this.f160500h = i;
        this.f160501i = i2;
        m248942m();
        int d = m248939d(view, i2, this.f160497e, this.f160502j);
        int c = m248937c(view, i, this.f160498f, this.f160503k);
        if (this.f160504l) {
            mo215682e();
        }
        try {
            C0945h.m4560a(this.f160493a, view, d, c, 0);
        } catch (Exception e) {
            C60700b.m235864f("VCEasyPopup", "[showAtAnchorView]", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo219689a(int i, int i2, View view, int i3, int i4, int i5, int i6) {
        if (this.f160493a != null) {
            try {
                this.f160493a.update(view, m248939d(view, i4, i, i5), m248937c(view, i3, i2, i6), i, i2);
            } catch (Exception e) {
                C60700b.m235864f("VCEasyPopup", "[updateLocation]", e.getMessage());
            }
        }
    }
}

package com.larksuite.framework.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.framework.ui.p1197a.AbstractC26178b;
import com.larksuite.framework.ui.p1197a.C26179c;

public class BasePopupWindow extends PopupWindow {

    /* renamed from: a */
    private final String f64641a = "BasePopupWindow";

    /* renamed from: b */
    private Context f64642b;

    /* renamed from: c */
    private boolean f64643c;

    /* renamed from: d */
    private AbstractC26178b f64644d;

    public BasePopupWindow() {
    }

    /* renamed from: b */
    private void mo99355b() {
        if (this.f64643c) {
            AbstractC26178b a = C26179c.m94706a(this.f64642b);
            this.f64644d = a;
            a.mo93159b();
        }
    }

    /* renamed from: c */
    private void m94681c() {
        AbstractC26178b bVar = this.f64644d;
        if (bVar != null) {
            bVar.mo93160c();
        }
    }

    /* renamed from: a */
    private boolean mo99354a() {
        Context context = this.f64642b;
        if (context == null || !(context instanceof Activity) || C26182b.m94713a((Activity) context)) {
            return true;
        }
        return false;
    }

    public void dismiss() {
        if (mo99354a()) {
            Log.i("BasePopupWindow", "popupWindow dismiss successed! ");
            m94681c();
            super.dismiss();
            return;
        }
        Log.e("BasePopupWindow", "popupWindow dismiss fail! Activity not running");
    }

    /* renamed from: a */
    public void mo93124a(boolean z) {
        this.f64643c = z;
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (view != null) {
            this.f64642b = view.getContext();
        }
    }

    public void showAsDropDown(View view) {
        if (mo100027a(view)) {
            mo99355b();
            super.showAsDropDown(view);
        }
    }

    public BasePopupWindow(Context context) {
        super(context);
        this.f64642b = context;
    }

    /* renamed from: a */
    private boolean mo100027a(View view) {
        Context context;
        if (view == null || view.getWindowToken() == null || (context = view.getContext()) == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            View findViewById = view.findViewById(16908290);
            if (findViewById == null) {
                return true;
            }
            context = findViewById.getContext();
            if (context == null) {
                return false;
            }
        }
        if (!(context instanceof Activity) || C26182b.m94713a((Activity) context)) {
            return true;
        }
        return false;
    }

    public BasePopupWindow(View view) {
        super(view);
        this.f64642b = view.getContext();
    }

    public BasePopupWindow(int i, int i2) {
        super(i, i2);
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64642b = context;
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (mo100027a(view)) {
            mo99355b();
            super.showAsDropDown(view, i, i2);
        }
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f64642b = context;
    }

    public BasePopupWindow(View view, int i, int i2) {
        super(view, i, i2);
        this.f64642b = view.getContext();
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        if (mo100027a(view)) {
            mo99355b();
            super.showAtLocation(view, i, i2, i3);
        }
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (mo100027a(view)) {
            mo99355b();
            super.showAsDropDown(view, i, i2, i3);
        }
    }

    public BasePopupWindow(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        this.f64642b = view.getContext();
    }
}

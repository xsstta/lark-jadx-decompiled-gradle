package com.ss.android.lark.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;

public class BasePopupWindow extends PopupWindow {

    /* renamed from: a */
    private final String f141847a = "BasePopupWindow";

    /* renamed from: b */
    private Context f141848b;

    public BasePopupWindow() {
    }

    /* renamed from: a */
    private boolean mo114214a() {
        Context context = this.f141848b;
        if (context == null || !(context instanceof Activity) || C57582a.m223607a((Activity) context)) {
            return true;
        }
        return false;
    }

    public void dismiss() {
        if (mo114214a()) {
            Log.m165389i("BasePopupWindow", "popupWindow dismiss successed! ");
            super.dismiss();
            return;
        }
        Log.m165383e("BasePopupWindow", "popupWindow dismiss fail! Activity not running");
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (view != null) {
            this.f141848b = view.getContext();
        }
    }

    public void showAsDropDown(View view) {
        if (mo147656a(view)) {
            super.showAsDropDown(view);
        }
    }

    /* renamed from: a */
    private boolean mo147656a(View view) {
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
        if (!(context instanceof Activity) || C57582a.m223607a((Activity) context)) {
            return true;
        }
        return false;
    }

    public BasePopupWindow(int i, int i2) {
        super(i, i2);
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141848b = context;
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (mo147656a(view)) {
            super.showAsDropDown(view, i, i2);
        }
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f141848b = context;
    }

    public BasePopupWindow(View view, int i, int i2) {
        super(view, i, i2);
        this.f141848b = view.getContext();
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        if (mo147656a(view)) {
            super.showAtLocation(view, i, i2, i3);
        }
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (mo147656a(view)) {
            super.showAsDropDown(view, i, i2, i3);
        }
    }
}

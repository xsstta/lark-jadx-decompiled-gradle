package com.ss.android.lark.reaction.widget.panel;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;

/* access modifiers changed from: package-private */
public class BasePopupWindow extends PopupWindow {

    /* renamed from: a */
    private final String f131180a = "BasePopupWindow";

    /* renamed from: b */
    private Context f131181b;

    public BasePopupWindow() {
    }

    /* renamed from: a */
    private boolean m205441a() {
        Context context = this.f131181b;
        if (context == null || !(context instanceof Activity) || C52990a.m205232a((Activity) context)) {
            return true;
        }
        return false;
    }

    public void dismiss() {
        if (m205441a()) {
            Log.m165389i("BasePopupWindow", "popupWindow dismiss successed! ");
            super.dismiss();
            return;
        }
        Log.m165383e("BasePopupWindow", "popupWindow dismiss fail! Activity not running");
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (view != null) {
            this.f131181b = view.getContext();
        }
    }

    public void showAsDropDown(View view) {
        if (m205442a(view)) {
            super.showAsDropDown(view);
        }
    }

    /* renamed from: a */
    private boolean m205442a(View view) {
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
        if (!(context instanceof Activity) || C52990a.m205232a((Activity) context)) {
            return true;
        }
        return false;
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131181b = context;
    }

    public BasePopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f131181b = context;
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (m205442a(view)) {
            super.showAsDropDown(view, i, i2);
        }
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        if (m205442a(view)) {
            super.showAtLocation(view, i, i2, i3);
        }
    }

    public BasePopupWindow(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        this.f131181b = view.getContext();
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (m205442a(view)) {
            super.showAsDropDown(view, i, i2, i3);
        }
    }
}

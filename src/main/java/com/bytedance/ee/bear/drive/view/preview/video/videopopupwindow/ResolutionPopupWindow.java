package com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;

public class ResolutionPopupWindow extends PopupWindow {

    /* renamed from: a */
    private Context f20285a;

    public ResolutionPopupWindow() {
    }

    /* renamed from: a */
    private boolean m30064a() {
        Context context = this.f20285a;
        if (context == null || !(context instanceof Activity) || C13726a.m55676b((Activity) context)) {
            return true;
        }
        return false;
    }

    public void dismiss() {
        if (m30064a()) {
            C13479a.m54764b("DRIVE_VideoPlayer", "popupWindow dismiss successed! ");
            super.dismiss();
            return;
        }
        C13479a.m54758a("DRIVE_VideoPlayer", "popupWindow dismiss fail! Activity not running");
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (view != null) {
            this.f20285a = view.getContext();
        }
    }

    public void showAsDropDown(View view) {
        if (m30065a(view)) {
            super.showAsDropDown(view);
        }
    }

    /* renamed from: a */
    private boolean m30065a(View view) {
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
        if (!(context instanceof Activity) || C13726a.m55676b((Activity) context)) {
            return true;
        }
        return false;
    }

    public ResolutionPopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20285a = context;
    }

    public ResolutionPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20285a = context;
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (m30065a(view)) {
            super.showAsDropDown(view, i, i2);
        }
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        if (m30065a(view)) {
            super.showAtLocation(view, i, i2, i3);
        }
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (m30065a(view)) {
            super.showAsDropDown(view, i, i2, i3);
        }
    }
}

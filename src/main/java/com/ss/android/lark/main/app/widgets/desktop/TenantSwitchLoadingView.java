package com.ss.android.lark.main.app.widgets.desktop;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.utils.p1797c.C36585b;
import com.ss.android.lark.utils.UIHelper;

public class TenantSwitchLoadingView extends FrameLayout {

    /* renamed from: a */
    LKUIStatus f112753a;

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b */
    public void mo157820b() {
        LKUIStatus lKUIStatus = this.f112753a;
        if (lKUIStatus != null) {
            lKUIStatus.mo89847d();
        }
    }

    /* renamed from: a */
    public void mo157819a() {
        float f;
        LKUIStatus.C25680a a = new LKUIStatus.C25680a(this).mo89858a(UIHelper.getString(R.string.Lark_Legacy_SwitchTenateLoadingText));
        if (DesktopUtil.m144307b()) {
            f = m176340a(getContext());
        } else {
            f = -1.0f;
        }
        LKUIStatus a2 = a.mo89856a(f).mo89859a();
        this.f112753a = a2;
        a2.mo89837a();
    }

    public TenantSwitchLoadingView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private float m176340a(Context context) {
        Rect a;
        if ((context instanceof Activity) && (a = C36585b.m144332a().mo134976a((Activity) context)) != null) {
            return ((float) a.height()) / 3.0f;
        }
        return -1.0f;
    }

    public TenantSwitchLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TenantSwitchLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

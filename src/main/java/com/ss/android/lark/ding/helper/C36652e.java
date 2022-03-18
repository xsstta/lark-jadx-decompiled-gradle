package com.ss.android.lark.ding.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.ding.helper.e */
public class C36652e implements AbstractC36654g {

    /* renamed from: a */
    private Context f94261a;

    /* renamed from: b */
    private View f94262b;

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: c */
    public int mo135200c() {
        return 0;
    }

    /* renamed from: d */
    public int mo135230d() {
        return 4;
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: b */
    public int mo135199b() {
        return UIUtils.dp2px(this.f94261a, 24.0f);
    }

    /* renamed from: e */
    private Activity m144647e() {
        if (DesktopUtil.m144301a(this.f94261a)) {
            return C36519d.m144080a().mo134826h();
        }
        return C37030f.m146093a().mo103028b();
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135195a() {
        Activity e;
        if (this.f94262b != null && (e = m144647e()) != null) {
            Log.m165389i("FloatDialogTopPagePlan", "dismissDialog topActivity > " + e.getClass().getSimpleName());
            if (UIUtils.isActivityRunning(e)) {
                m144646b(e, this.f94262b);
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135197a(View view) {
        this.f94262b = view;
    }

    public C36652e(Context context) {
        this.f94261a = context;
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135196a(Activity activity) {
        ViewParent parent;
        Log.m165389i("FloatDialogTopPagePlan", "releaseAnchorActivity if need");
        View view = this.f94262b;
        if (view != null && (parent = view.getParent()) != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getContext() == activity) {
                Log.m165389i("FloatDialogTopPagePlan", "releaseAnchorActivity: " + activity);
                viewGroup.removeViewInLayout(this.f94262b);
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135198a(boolean z) {
        Activity e = m144647e();
        if (e != null) {
            Log.m165389i("FloatDialogTopPagePlan", "showFloatDialog topActivity > " + e.getClass().getSimpleName());
            if (UIUtils.isActivityRunning(e)) {
                m144645a(e, this.f94262b);
            }
        }
    }

    /* renamed from: b */
    private void m144646b(Activity activity, View view) {
        ViewGroup viewGroup;
        Log.m165389i("FloatDialogTopPagePlan", "hideDingCardOnTopPage");
        if (!(view == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null)) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) == view) {
                    Log.m165389i("FloatDialogTopPagePlan", "hideDingCardOnTopPage removeViewAt > " + i);
                    viewGroup.removeViewAt(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m144645a(Activity activity, View view) {
        ViewGroup viewGroup;
        Log.m165389i("FloatDialogTopPagePlan", "showDingCardOnTopPage");
        if (view != null && (viewGroup = (ViewGroup) activity.findViewById(16908290)) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= viewGroup.getChildCount()) {
                    break;
                } else if (viewGroup.getChildAt(i) == view) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            Log.m165389i("FloatDialogTopPagePlan", "showDingCardOnTopPage isContains > " + z);
            if (!z) {
                if (view.getParent() != null) {
                    Log.m165389i("FloatDialogTopPagePlan", "showDingCardOnTopPage removeView");
                    ((ViewGroup) view.getParent()).removeViewInLayout(view);
                }
                Log.m165389i("FloatDialogTopPagePlan", "showDingCardOnTopPage addView");
                viewGroup.addView(view);
            }
        }
    }
}

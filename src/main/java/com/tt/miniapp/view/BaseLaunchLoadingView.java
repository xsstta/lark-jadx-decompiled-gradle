package com.tt.miniapp.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.TimeMeter;

public abstract class BaseLaunchLoadingView extends RelativeLayout {
    /* renamed from: a */
    public void mo49124a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo49125a(Activity activity) {
    }

    /* renamed from: a */
    public void mo49126a(AppInfoEntity appInfoEntity) {
    }

    /* renamed from: a */
    public void mo49127a(String str, boolean z, String str2) {
    }

    /* renamed from: b */
    public void mo49128b() {
    }

    /* renamed from: c */
    public abstract void mo49129c();

    public void setLoadStartTime(TimeMeter timeMeter) {
    }

    public BaseLaunchLoadingView(Context context) {
        super(context);
    }

    public BaseLaunchLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseLaunchLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

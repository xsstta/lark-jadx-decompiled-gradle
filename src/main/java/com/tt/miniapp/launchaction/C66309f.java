package com.tt.miniapp.launchaction;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.larksuite.suite.R;

/* renamed from: com.tt.miniapp.launchaction.f */
public class C66309f extends PopupWindow {

    /* renamed from: a */
    private View f167349a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m259428a(View view) {
        if (isShowing()) {
            dismiss();
        }
    }

    public C66309f(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.microapp_m_app_notification_toast, (ViewGroup) null);
        this.f167349a = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-1);
        setFocusable(false);
        setOutsideTouchable(true);
        this.f167349a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.launchaction.$$Lambda$f$tA5i7LHpebh3LRgz7aTovdTShQ */

            public final void onClick(View view) {
                C66309f.this.m259428a(view);
            }
        });
    }
}

package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;

/* renamed from: com.ss.android.lark.mm.widget.e */
public class C47150e {

    /* renamed from: a */
    private View.OnClickListener f118856a;

    /* renamed from: b */
    private long f118857b;

    /* renamed from: c */
    private ViewGroup f118858c;

    /* renamed from: d */
    private View f118859d;

    /* renamed from: e */
    private final Handler f118860e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public void mo165766a() {
        ViewGroup viewGroup;
        View view = this.f118859d;
        if (view != null && (viewGroup = this.f118858c) != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: a */
    public void mo165768a(View.OnClickListener onClickListener) {
        this.f118856a = onClickListener;
    }

    /* renamed from: a */
    private void m186794a(Context context) {
        new ClickButtonEvent(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, null, null, null, null, null, "modified_tip").mo165434a(context).mo165437a();
    }

    /* renamed from: a */
    public void mo165767a(Context context, ViewGroup viewGroup) {
        this.f118858c = viewGroup;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > this.f118857b + 180000) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.mm_update_layout, viewGroup, false);
            this.f118859d = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            viewGroup.addView(inflate, -1, layoutParams);
            m186794a(context);
            C47083e.m186423a(context, "vc_minutes_popup_view", C47086i.m186432a().mo165427i("modified_tip").mo165421c());
            inflate.setOnClickListener(this.f118856a);
            this.f118860e.postDelayed(new Runnable(viewGroup, inflate) {
                /* class com.ss.android.lark.mm.widget.$$Lambda$e$j1h7FnHZPCHIfx5UQpHrUYSrvw */
                public final /* synthetic */ ViewGroup f$0;
                public final /* synthetic */ View f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    this.f$0.removeView(this.f$1);
                }
            }, 10000);
            this.f118857b = currentTimeMillis;
        }
    }
}

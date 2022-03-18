package com.bytedance.ee.bear.widgets;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.widgets.c */
public class C11824c {

    /* renamed from: a */
    private LottieAnimationView f31861a;

    /* renamed from: b */
    private Context f31862b;

    /* renamed from: c */
    private Dialog f31863c;

    /* renamed from: d */
    private boolean f31864d;

    /* renamed from: e */
    private View f31865e;

    /* renamed from: f */
    private Runnable f31866f = new Runnable() {
        /* class com.bytedance.ee.bear.widgets.$$Lambda$c$RGWbHoxagQc0atoBoQ1RvT222M */

        public final void run() {
            C11824c.this.m49046e();
        }
    };

    /* renamed from: g */
    private final Handler f31867g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public boolean mo45302b() {
        if (this.f31864d || this.f31863c.isShowing()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo45304d() {
        this.f31867g.removeCallbacks(this.f31866f);
        this.f31867g.postDelayed(this.f31866f, 300);
        this.f31864d = true;
    }

    /* renamed from: a */
    public void m49046e() {
        if (this.f31863c.getWindow() != null) {
            C11789c.m48867a(this.f31863c.getWindow(), this.f31862b.getResources().getColor(R.color.bg_base), true);
        }
        Context context = this.f31862b;
        if (!(context instanceof Activity) || ((Activity) context).isDestroyed()) {
            C13479a.m54764b("LoadingDialog", "show()... activity is finishing");
            return;
        }
        this.f31863c.show();
        this.f31861a.playAnimation();
    }

    /* renamed from: c */
    public void mo45303c() {
        this.f31867g.removeCallbacks(this.f31866f);
        Context context = this.f31862b;
        if ((context instanceof Activity) && !((Activity) context).isDestroyed() && mo45302b()) {
            this.f31861a.cancelAnimation();
            this.f31863c.dismiss();
        }
        this.f31864d = false;
    }

    /* renamed from: a */
    public void mo45301a(int i) {
        View view = this.f31865e;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49045a(DialogInterface dialogInterface) {
        this.f31867g.removeCallbacks(this.f31866f);
        this.f31864d = false;
    }

    public C11824c(Context context) {
        this.f31862b = context;
        m49044a(context, BitmapDescriptorFactory.HUE_RED, false);
    }

    public C11824c(Context context, boolean z) {
        this.f31862b = context;
        m49044a(context, BitmapDescriptorFactory.HUE_RED, z);
    }

    /* renamed from: a */
    private void m49044a(Context context, float f, boolean z) {
        this.f31865e = LayoutInflater.from(context).inflate(R.layout.widget_net_loading, (ViewGroup) null);
        Dialog dialog = new Dialog(context, R.style.loading_dialog);
        this.f31863c = dialog;
        dialog.setCanceledOnTouchOutside(true);
        this.f31863c.setContentView(this.f31865e);
        this.f31861a = (LottieAnimationView) this.f31865e.findViewById(R.id.loading);
        Window window = this.f31863c.getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 48;
        if (!z) {
            attributes.y = C13746i.m55722a(context);
        }
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.spacekit_dialog_background_dim_amount, typedValue, true);
        window.setDimAmount(typedValue.getFloat());
        this.f31863c.setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.bytedance.ee.bear.widgets.$$Lambda$c$8KT4HiLhqiEnXmeFhBedZSWyJQ */

            public final void onDismiss(DialogInterface dialogInterface) {
                C11824c.this.m49045a((C11824c) dialogInterface);
            }
        });
    }
}

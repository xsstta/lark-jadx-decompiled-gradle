package com.ss.android.vc.common.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;

/* renamed from: com.ss.android.vc.common.widget.d */
public class DialogC60856d extends Dialog {

    /* renamed from: a */
    private static DialogC60856d f152350a;

    /* renamed from: b */
    private View f152351b;

    /* renamed from: c */
    private ImageView f152352c;

    /* renamed from: d */
    private TextView f152353d;

    /* renamed from: a */
    public static void m236548a() {
        C26171w.m94675a($$Lambda$d$KOSmsfigd6XicRBDA2BN7mGUAU.INSTANCE);
    }

    /* renamed from: c */
    private void m236552c() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.y = (int) (((double) C60776r.m236144b()) / 4.0d);
        window.setAttributes(attributes);
    }

    /* renamed from: b */
    private void m236550b() {
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1200);
        this.f152352c.startAnimation(rotateAnimation);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m236553d() {
        DialogC60856d dVar = f152350a;
        if (dVar == null || dVar.getContext() == null) {
            f152350a = null;
            return;
        }
        Context baseContext = ((ContextWrapper) f152350a.getContext()).getBaseContext();
        if (baseContext == null) {
            f152350a = null;
        } else if (!(baseContext instanceof Activity) || C60773o.m236120a((Activity) baseContext)) {
            DialogC60856d dVar2 = f152350a;
            if (dVar2 == null || !dVar2.isShowing()) {
                f152350a = null;
                return;
            }
            f152350a.dismiss();
            f152350a = null;
        } else {
            f152350a = null;
        }
    }

    private DialogC60856d(Context context) {
        this(context, R.style.LoadingTheme);
    }

    /* renamed from: a */
    public void mo208665a(String str) {
        this.f152353d.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f152351b);
        getWindow().setLayout(-2, -2);
        m236550b();
        m236552c();
    }

    /* renamed from: a */
    public static void m236549a(Context context, String str) {
        C26171w.m94675a(new Runnable(context, str) {
            /* class com.ss.android.vc.common.widget.$$Lambda$d$fiVs3pBFHjQcRwLMdhqE16g4Kp4 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                DialogC60856d.m236551b(this.f$0, this.f$1);
            }
        });
    }

    public DialogC60856d(Context context, int i) {
        super(context, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_videochat_loading_dialog, (ViewGroup) null);
        this.f152351b = inflate;
        this.f152352c = (ImageView) inflate.findViewById(R.id.confirm_loading_image);
        this.f152353d = (TextView) this.f152351b.findViewById(R.id.loading_text);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m236551b(Context context, String str) {
        if (context != null && f152350a == null) {
            DialogC60856d dVar = new DialogC60856d(context);
            f152350a = dVar;
            dVar.setCancelable(false);
            f152350a.mo208665a(str);
            try {
                f152350a.show();
            } catch (Exception unused) {
            }
            f152350a.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.ss.android.vc.common.widget.DialogC60856d.DialogInterface$OnKeyListenerC608571 */

                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    DialogC60856d.m236548a();
                    return true;
                }
            });
        }
    }
}

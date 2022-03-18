package com.ss.android.lark.mail.impl.view.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;

/* renamed from: com.ss.android.lark.mail.impl.view.dialog.a */
public class DialogC43910a extends Dialog {

    /* renamed from: g */
    private static int f111400g;

    /* renamed from: a */
    public AbstractC43914a f111401a;

    /* renamed from: b */
    public ImageView f111402b;

    /* renamed from: c */
    public RotateAnimation f111403c;

    /* renamed from: d */
    private final String f111404d = "LoadingDialog";

    /* renamed from: e */
    private Context f111405e;

    /* renamed from: f */
    private TextView f111406f;

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.a$a */
    public interface AbstractC43914a {
        /* renamed from: i */
        void mo152566i();
    }

    public void dismiss() {
        Log.m165389i("LoadingDialog", "dismiss");
        if (m174030b()) {
            super.dismiss();
        }
    }

    /* renamed from: b */
    private boolean m174030b() {
        Context context = this.f111405e;
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        if (!((Activity) context).isDestroyed() && !((Activity) this.f111405e).isFinishing()) {
            return true;
        }
        Log.m165383e("LoadingDialog", "checkAvailability, activity not available");
        return false;
    }

    /* renamed from: c */
    private void m174031c() {
        if (f111400g == 0) {
            Context b = C41816b.m166115a().mo150132b();
            int b2 = ((int) (((double) C25655d.m91902a(b).mo89314b()) * 0.191904047976012d)) - C25655d.m91903b(b);
            f111400g = b2;
            if (b2 <= 0) {
                f111400g = getContext().getResources().getDimensionPixelSize(R.dimen.mail_bottom_hint_margin);
            }
        }
    }

    /* renamed from: a */
    private void m174029a() {
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            m174031c();
            attributes.y = f111400g;
            window.setAttributes(attributes);
        }
        setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.DialogC43910a.DialogInterface$OnShowListenerC439111 */

            public void onShow(DialogInterface dialogInterface) {
                if (DialogC43910a.this.f111403c == null) {
                    DialogC43910a.this.f111403c = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
                    DialogC43910a.this.f111403c.setDuration(1000);
                    DialogC43910a.this.f111403c.setRepeatCount(-1);
                    DialogC43910a.this.f111403c.setFillAfter(true);
                    DialogC43910a.this.f111403c.setInterpolator(new LinearInterpolator());
                }
                DialogC43910a.this.f111402b.startAnimation(DialogC43910a.this.f111403c);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.DialogC43910a.DialogInterface$OnDismissListenerC439122 */

            public void onDismiss(DialogInterface dialogInterface) {
                DialogC43910a.this.f111402b.clearAnimation();
            }
        });
        setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.DialogC43910a.DialogInterface$OnKeyListenerC439133 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                DialogC43910a.this.dismiss();
                if (DialogC43910a.this.f111401a == null) {
                    return true;
                }
                DialogC43910a.this.f111401a.mo152566i();
                return true;
            }
        });
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mail_loading_dialog_layout, (ViewGroup) null);
        setContentView(inflate, new ViewGroup.LayoutParams(-2, getContext().getResources().getDimensionPixelSize(R.dimen.mail_loading_dialog_height)));
        this.f111402b = (ImageView) inflate.findViewById(R.id.mail_loading_dialog_icon);
        this.f111406f = (TextView) inflate.findViewById(R.id.mail_loading_dialog_text);
    }

    /* renamed from: a */
    public void mo156330a(AbstractC43914a aVar) {
        this.f111401a = aVar;
    }

    public DialogC43910a(Context context) {
        super(context, R.style.TransparentDialog);
        this.f111405e = context;
        m174029a();
    }

    /* renamed from: a */
    public void mo156331a(String str) {
        Log.m165389i("LoadingDialog", "show");
        if (m174030b()) {
            this.f111406f.setText(str);
            show();
        }
    }
}

package com.ss.android.lark.searchcommon.view.feedback;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.feedback.DialogC54026b;

/* renamed from: com.ss.android.lark.searchcommon.view.feedback.b */
public class DialogC54026b extends Dialog {

    /* renamed from: a */
    private final View f133758a;

    public void show() {
        super.show();
        m209667a();
    }

    /* renamed from: b */
    private void m209668b() {
        this.f133758a.post(new Runnable() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54026b.RunnableC540271 */

            public void run() {
                ImageView imageView = (ImageView) DialogC54026b.this.findViewById(R.id.iv_close);
                imageView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.searchcommon.view.feedback.$$Lambda$b$1$crCdP9U8hrFvDIM3z7K3ZB91TI0 */

                    public final void onClick(View view) {
                        DialogC54026b.RunnableC540271.this.m209669a(view);
                    }
                });
                Rect rect = new Rect();
                imageView.getHitRect(rect);
                rect.right += 100;
                rect.left -= 100;
                rect.top = 0;
                rect.bottom = LocationRequest.PRIORITY_HD_ACCURACY;
                TouchDelegate touchDelegate = new TouchDelegate(rect, imageView);
                if (imageView.getParent().getParent() instanceof View) {
                    ((View) imageView.getParent().getParent()).setTouchDelegate(touchDelegate);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m209669a(View view) {
                DialogC54026b.this.dismiss();
            }
        });
        final Button button = (Button) findViewById(R.id.confirm_btn);
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54026b.View$OnClickListenerC540282 */

            public void onClick(View view) {
                button.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.searchcommon.view.feedback.DialogC54026b.View$OnClickListenerC540282.RunnableC540291 */

                    public void run() {
                        DialogC54026b.this.dismiss();
                    }
                }, 100);
            }
        });
    }

    /* renamed from: a */
    private void m209667a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = DeviceUtils.getScreenWidth(getContext());
            attributes.height = -2;
            attributes.softInputMode = 16;
            window.setAttributes(attributes);
            window.setDimAmount(0.3f);
            window.setWindowAnimations(R.style.AniBottomInBottomOut);
        }
    }

    public DialogC54026b(Context context) {
        super(context, R.style.CommonDialog);
        View inflate = LayoutInflater.from(context).inflate(R.layout.search_feedback_tks_popup_window_layout, (ViewGroup) null);
        this.f133758a = inflate;
        setContentView(inflate);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        setCanceledOnTouchOutside(true);
        m209668b();
    }
}

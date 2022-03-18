package com.ss.android.lark.utils.p2905b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
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
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.DialogC57586c;

/* renamed from: com.ss.android.lark.utils.b.b */
public class C57811b {
    /* renamed from: a */
    public static Dialog m224341a(Context context, View view) {
        return m224343a(context, view, true);
    }

    /* renamed from: a */
    public static Dialog m224343a(Context context, View view, boolean z) {
        BaseDialog baseDialog = new BaseDialog(context, R.style.UtilsPopDialog);
        baseDialog.setContentView(view);
        baseDialog.setCanceledOnTouchOutside(z);
        return baseDialog;
    }

    /* renamed from: a */
    public static Dialog m224342a(Context context, View view, int i, boolean z) {
        BaseDialog baseDialog = new BaseDialog(context, i);
        baseDialog.setContentView(view);
        baseDialog.setCanceledOnTouchOutside(z);
        return baseDialog;
    }

    /* renamed from: a */
    public static Dialog m224340a(Context context, int i, String str, boolean z) {
        Activity activity = (Activity) context;
        Dialog a = m224343a(activity, LayoutInflater.from(activity).inflate(R.layout.custom_popupwindow_layout, (ViewGroup) null), false);
        m224345a(i, str, z, (ImageView) a.findViewById(R.id.popup_icon_iv), (TextView) a.findViewById(R.id.popup_text_tv), context);
        Window window = a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = context.getResources().getDisplayMetrics().widthPixels;
        attributes.gravity = 17;
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.UtilsAnimBottom);
        return a;
    }

    /* renamed from: a */
    private static void m224345a(int i, String str, boolean z, ImageView imageView, TextView textView, Context context) {
        if (imageView != null && textView != null) {
            textView.setText(str);
            if (i == -1) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setImageDrawable(UIUtils.getDrawable(context, i));
            imageView.setVisibility(0);
            if (z) {
                RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setDuration(1200);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setRepeatMode(1);
                imageView.startAnimation(rotateAnimation);
            }
        }
    }

    /* renamed from: a */
    public static DialogC57586c m224344a(Context context, String str, String str2, String str3, String str4, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        final DialogC57586c cVar = new DialogC57586c(context);
        cVar.mo195559a(str);
        cVar.mo195563b(str2);
        if (TextUtils.isEmpty(str)) {
            cVar.mo195566c(1);
            cVar.mo195562b(17);
            cVar.mo195568d(UIUtils.getColor(context, R.color.lkui_N900));
        }
        cVar.mo195560a(str4, new View.OnClickListener() {
            /* class com.ss.android.lark.utils.p2905b.C57811b.View$OnClickListenerC578121 */

            public void onClick(View view) {
                DialogInterface.OnClickListener onClickListener = onClickListener2;
                if (onClickListener != null) {
                    onClickListener.onClick(cVar, 0);
                }
            }
        });
        cVar.mo195564b(str3, new View.OnClickListener() {
            /* class com.ss.android.lark.utils.p2905b.C57811b.View$OnClickListenerC578132 */

            public void onClick(View view) {
                DialogInterface.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(cVar, 0);
                }
            }
        });
        if (cVar.getWindow() != null) {
            cVar.getWindow().setDimAmount(0.3f);
        }
        cVar.show();
        return cVar;
    }
}

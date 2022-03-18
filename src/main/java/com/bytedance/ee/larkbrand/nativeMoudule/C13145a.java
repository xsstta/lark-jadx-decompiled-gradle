package com.bytedance.ee.larkbrand.nativeMoudule;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.tt.miniapphost.AbstractC67550j;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.a */
public class C13145a {
    /* renamed from: a */
    public static void m53754a(AbstractC67550j.AbstractC67551a<Integer> aVar, int i) {
        if (aVar != null) {
            aVar.onNativeModuleCall(Integer.valueOf(i));
            return;
        }
        AppBrandLogger.m52829e("LarkModalDialog", "nativeModuleCallback is null");
    }

    /* renamed from: a */
    public static void m53753a(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, boolean z2, final AbstractC67550j.AbstractC67551a<Integer> aVar) {
        UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).cancelOnTouchOutside(z2)).autoDismiss(true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ud_dialog_default_content, (ViewGroup) null);
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(inflate);
        eVar.contentLayout(scrollView);
        if (!TextUtils.isEmpty(str2)) {
            eVar.title(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            eVar.message(str3);
        }
        if (TextUtils.isEmpty(str6)) {
            str6 = context.getResources().getString(R.string.lark_brand_confirm);
        }
        eVar.addActionButton(R.id.ud_dialog_btn_primary, str6, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.C13145a.DialogInterface$OnClickListenerC131461 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C13145a.m53754a(aVar, 1);
            }
        });
        if (z) {
            if (TextUtils.isEmpty(str4)) {
                str4 = context.getResources().getString(R.string.lark_brand_cancel);
            }
            eVar.addActionButton(R.id.ud_dialog_btn_secondary, str4, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.C13145a.DialogInterface$OnClickListenerC131472 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C13145a.m53754a(aVar, 0);
                }
            });
            eVar.onCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.C13145a.DialogInterface$OnCancelListenerC131483 */

                public void onCancel(DialogInterface dialogInterface) {
                    C13145a.m53754a(aVar, 0);
                }
            });
        }
        eVar.build().show();
    }
}

package com.ss.android.lark.mail.impl.utils;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mail.impl.utils.m */
public class C43771m {
    /* renamed from: a */
    public static C25639g m173504a(Context context, int i, int i2, int i3, final DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89253l(3).mo89245d(0.3f);
        gVar.mo89256o(R.color.text_title).mo89242c(context.getResources().getString(i)).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89268a(context.getResources().getString(i2));
        aVar.mo89272e(context.getResources().getColor(i3));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437743 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        gVar.mo89229a(aVar);
        return gVar;
    }

    /* renamed from: a */
    public static C25639g m173503a(Context context, int i, int i2, int i3, int i4, int i5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m173505a(context, context.getResources().getString(i), context.getResources().getString(i2), i3, context.getResources().getString(i4), i5, onClickListener, onClickListener2);
    }

    /* renamed from: a */
    public static C25639g m173505a(Context context, String str, String str2, int i, String str3, int i2, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        C25639g gVar = new C25639g(context);
        gVar.mo89253l(3).mo89245d(0.3f);
        gVar.mo89256o(R.color.text_title).mo89242c(str).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89268a(str2);
        aVar.mo89272e(context.getResources().getColor(i));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437721 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right);
        aVar2.mo89268a(str3);
        aVar2.mo89272e(context.getResources().getColor(i2));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437732 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener2;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        return gVar;
    }

    /* renamed from: a */
    public static C25639g m173502a(Context context, int i, int i2, int i3, int i4, int i5, int i6, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        C25639g gVar = new C25639g(context);
        gVar.mo89248g(i).mo89250i(R.color.text_title).mo89252k(3).mo89249h(17).mo89253l(3).mo89245d(0.3f).mo89256o(R.color.text_title).mo89254m(i2).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89269b(i3);
        aVar.mo89272e(context.getResources().getColor(i4));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437754 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right);
        aVar2.mo89269b(i5);
        aVar2.mo89272e(context.getResources().getColor(i6));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437765 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener2;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        return gVar;
    }

    /* renamed from: a */
    public static C25639g m173506a(Context context, String str, String str2, String str3, int i, String str4, int i2, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        C25639g gVar = new C25639g(context);
        gVar.mo89237b(str).mo89250i(R.color.text_title).mo89252k(3).mo89249h(17).mo89253l(3).mo89245d(0.3f).mo89256o(R.color.text_title).mo89242c(str2).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_left);
        aVar.mo89268a(str3);
        aVar.mo89272e(context.getResources().getColor(i));
        aVar.mo89270c(17);
        aVar.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437776 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_right);
        aVar2.mo89268a(str4);
        aVar2.mo89272e(context.getResources().getColor(i2));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.utils.C43771m.DialogInterface$OnClickListenerC437787 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                DialogInterface.OnClickListener onClickListener = onClickListener2;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        return gVar;
    }
}

package com.bytedance.ee.larkbrand.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.larkbrand.utils.i */
public class C13351i {

    /* renamed from: com.bytedance.ee.larkbrand.utils.i$a */
    public interface AbstractC13357a {
        /* renamed from: a */
        void mo49040a(View view);

        /* renamed from: b */
        void mo49041b(View view);
    }

    /* renamed from: com.bytedance.ee.larkbrand.utils.i$b */
    public interface AbstractC13358b {
        /* renamed from: a */
        void mo49660a(boolean z, String str);
    }

    /* renamed from: a */
    public static void m54347a(Context context, final ArrayList<AbstractC13234b> arrayList) {
        if (context != null && arrayList != null) {
            UDActionPanelBuilder aVar = (UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).cancelOnTouchOutside(true)).cancelable(true)).autoDismiss(true);
            ArrayList arrayList2 = new ArrayList();
            Iterator<AbstractC13234b> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().mo49299a());
            }
            aVar.mo90870a(arrayList2);
            aVar.mo90869a(new UDListDialogController.OnItemClickListener() {
                /* class com.bytedance.ee.larkbrand.utils.C13351i.C133521 */

                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                public void onItemClick(int i) {
                    ((AbstractC13234b) arrayList.get(i)).mo49300b();
                }
            });
            aVar.build().show();
        }
    }

    /* renamed from: a */
    public static UDDialog m54345a(Activity activity, String str, String str2, String str3, String str4, final AbstractC13357a aVar) {
        UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).title(str)).cancelable(false)).addActionButton(R.id.ud_dialog_btn_primary, str4, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.utils.C13351i.DialogInterface$OnClickListenerC133532 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                AbstractC13357a aVar = aVar;
                if (aVar != null) {
                    aVar.mo49040a(null);
                }
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            eVar.message(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            eVar.addActionButton(R.id.ud_dialog_btn_secondary, str3, new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.larkbrand.utils.C13351i.DialogInterface$OnClickListenerC133543 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    AbstractC13357a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo49041b(null);
                    }
                }
            });
        }
        UDDialog build = eVar.build();
        if (!activity.isDestroyed()) {
            build.show();
        }
        return build;
    }

    /* renamed from: a */
    public static void m54346a(Activity activity, String str, String str2, int i, String str3, String str4, final AbstractC13358b bVar) {
        final Dialog dialog = new Dialog(activity, R.style.microapp_i_pickerdialog);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.lark_brand_dialog_promt, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        final EditText editText = (EditText) viewGroup.findViewById(R.id.edit);
        if (!TextUtils.isEmpty(str2)) {
            editText.setHint(str2);
        }
        if (i > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.cancel);
        textView2.setText(str4);
        textView2.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.utils.C13351i.View$OnClickListenerC133554 */

            public void onClick(View view) {
                dialog.dismiss();
                bVar.mo49660a(true, editText.getText().toString());
            }
        });
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.sure);
        textView3.setText(str3);
        textView3.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.utils.C13351i.View$OnClickListenerC133565 */

            public void onClick(View view) {
                dialog.dismiss();
                bVar.mo49660a(false, editText.getText().toString());
            }
        });
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(viewGroup);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(C57582a.m223601a((Context) activity, 303.0f), -2);
            window.setGravity(17);
            window.setWindowAnimations(R.style.microapp_i_BottomDialogAnimation);
        }
        dialog.show();
    }
}

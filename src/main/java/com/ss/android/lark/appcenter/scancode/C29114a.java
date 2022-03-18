package com.ss.android.lark.appcenter.scancode;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.appcenter.scancode.a */
public class C29114a {

    /* renamed from: com.ss.android.lark.appcenter.scancode.a$a */
    public interface AbstractC29117a {
        /* renamed from: a */
        void mo103265a(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m107034b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* renamed from: a */
    public static void m107033a(View view) {
        if (view != null && view.getContext() != null) {
            view.postDelayed(new Runnable(view) {
                /* class com.ss.android.lark.appcenter.scancode.$$Lambda$a$vAw_nNJRbhDfsv45f4RrhnSXwM */
                public final /* synthetic */ View f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C29114a.m107034b(this.f$0);
                }
            }, 50);
        }
    }

    /* renamed from: a */
    public static void m107032a(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context != null && view != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static DialogC25637f m107031a(final Context context, String str, String str2, String str3, final AbstractC29117a aVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.scancode_dialog_layout, (ViewGroup) null, false);
        final ScanCodeEditText scanCodeEditText = (ScanCodeEditText) inflate.findViewById(R.id.edit_text);
        scanCodeEditText.setHint(str);
        DialogC25637f b = new C25639g(context).mo89236b(inflate).mo89246d(false).mo89248g(R.string.OpenPlatform_AppCenter_PleaseEnterBarcode).mo89252k(1).mo89243c(true).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89268a(str2).mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.appcenter.scancode.C29114a.DialogInterface$OnClickListenerC291162 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C29114a.m107032a(context, scanCodeEditText.getFocusView());
            }
        })).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89268a(str3).mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.appcenter.scancode.C29114a.DialogInterface$OnClickListenerC291151 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C29114a.m107032a(context, scanCodeEditText.getFocusView());
                AbstractC29117a aVar = aVar;
                if (aVar != null) {
                    aVar.mo103265a(scanCodeEditText.getEditContent());
                }
            }
        })).mo89233b();
        if (b.getWindow() != null) {
            b.getWindow().setDimAmount(0.3f);
        }
        b.show();
        m107033a(scanCodeEditText.getFocusView());
        return b;
    }
}

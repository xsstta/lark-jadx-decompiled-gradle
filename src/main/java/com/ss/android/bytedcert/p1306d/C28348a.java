package com.ss.android.bytedcert.p1306d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0257a;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.p1305c.DialogC28323c;

/* renamed from: com.ss.android.bytedcert.d.a */
public class C28348a {
    /* renamed from: a */
    public static void m103981a(Activity activity) {
        if (activity != null) {
            new DialogC28323c(activity).show();
        }
    }

    /* renamed from: b */
    private static DialogInterfaceC0257a m103983b(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if (context == null) {
            return null;
        }
        DialogInterfaceC0257a.C0258a aVar = new DialogInterfaceC0257a.C0258a(context, R.style.byted_alert_dialog);
        aVar.mo925a(false);
        if (!TextUtils.isEmpty(str)) {
            aVar.mo924a(str, onClickListener);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo928b(str2, onClickListener2);
        }
        return aVar.mo929b();
    }

    /* renamed from: a */
    public static void m103982a(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        DialogInterfaceC0257a b;
        if (context != null && (b = m103983b(context, str, str2, str3, str4, onClickListener, onClickListener2)) != null) {
            TextView textView = new TextView(context);
            textView.setText(str3);
            textView.setPadding(0, 30, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(2, 17.0f);
            textView.setTextColor(-16777216);
            b.mo910a(textView);
            TextView textView2 = new TextView(context);
            textView2.setVisibility(0);
            textView2.setText(str4);
            textView2.setTextColor(-16777216);
            textView2.setGravity(17);
            textView2.setPadding(40, 20, 40, 0);
            textView2.setTextSize(2, 15.0f);
            b.mo911b(textView2);
            b.show();
            Button a = b.mo908a(-1);
            a.setTextColor(-13987625);
            a.setTextSize(2, 17.0f);
            Button a2 = b.mo908a(-2);
            if (a2 != null) {
                a2.setTextColor(-13987625);
                a2.setTextSize(2, 17.0f);
            }
        }
    }
}

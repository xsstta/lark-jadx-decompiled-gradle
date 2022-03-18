package com.bytedance.ee.larkbrand.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.larkbrand.utils.h */
public class C13346h {

    /* renamed from: com.bytedance.ee.larkbrand.utils.h$a */
    public interface AbstractC13350a {
        /* renamed from: a */
        void mo48814a(String str);
    }

    /* renamed from: a */
    public static void m54343a(final Context context, String str, String str2, String str3, String str4, final String str5, final AbstractC13350a aVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.lark_brand_edit_dialog, (ViewGroup) null);
        final EditText editText = (EditText) viewGroup.findViewById(R.id.content);
        TextView textView = (TextView) viewGroup.findViewById(R.id.confirm);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.cancel);
        builder.setView(viewGroup);
        editText.setText(str2);
        ((TextView) viewGroup.findViewById(R.id.title)).setText(str);
        textView.setText(str3);
        textView2.setText(str4);
        final AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(true);
        editText.addTextChangedListener(new TextWatcher() {
            /* class com.bytedance.ee.larkbrand.utils.C13346h.C133471 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                context.getSharedPreferences("about_debug", 0).edit().putString(str5, editText.getText().toString()).apply();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.utils.C13346h.View$OnClickListenerC133482 */

            public void onClick(View view) {
                create.dismiss();
                aVar.mo48814a(editText.getText().toString());
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.utils.C13346h.View$OnClickListenerC133493 */

            public void onClick(View view) {
                create.dismiss();
            }
        });
        create.show();
    }
}

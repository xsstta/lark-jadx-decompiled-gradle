package com.ss.android.lark.ui.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.ui.dialog.a */
public class C57596a {

    /* renamed from: com.ss.android.lark.ui.dialog.a$b */
    public interface AbstractC57602b {
        /* renamed from: a */
        void mo107354a(int i);
    }

    /* renamed from: com.ss.android.lark.ui.dialog.a$1 */
    static class View$OnClickListenerC575971 implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC57602b f141963a;

        /* renamed from: b */
        final /* synthetic */ TextView f141964b;

        public void onClick(View view) {
            if (this.f141963a != null) {
                this.f141963a.mo107354a(((Integer) this.f141964b.getTag()).intValue());
            }
        }
    }

    /* renamed from: com.ss.android.lark.ui.dialog.a$a */
    public static class C57600a {
        /* renamed from: a */
        public static C57601a m223645a(int i, int i2, CharSequence charSequence) {
            return new C57601a(i, i2, charSequence, null);
        }

        /* renamed from: com.ss.android.lark.ui.dialog.a$a$a */
        public static class C57601a {

            /* renamed from: a */
            int f141969a;

            /* renamed from: b */
            int f141970b;

            /* renamed from: c */
            CharSequence f141971c;

            private C57601a(int i, int i2, CharSequence charSequence) {
                this.f141969a = i;
                this.f141970b = i2;
                this.f141971c = charSequence;
            }

            /* synthetic */ C57601a(int i, int i2, CharSequence charSequence, View$OnClickListenerC575971 r4) {
                this(i, i2, charSequence);
            }
        }
    }

    /* renamed from: a */
    public static View m223644a(final C57600a.C57601a[] aVarArr, Context context, final AbstractC57602b bVar) {
        if (aVarArr.length >= 2) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.common_dialog_button_double, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.btn_left);
            textView.setText(aVarArr[0].f141971c);
            textView.setTextColor(aVarArr[0].f141970b);
            textView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.ui.dialog.C57596a.View$OnClickListenerC575982 */

                public void onClick(View view) {
                    AbstractC57602b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo107354a(aVarArr[0].f141969a);
                    }
                }
            });
            TextView textView2 = (TextView) inflate.findViewById(R.id.btn_right);
            textView2.setText(aVarArr[1].f141971c);
            textView2.setTextColor(aVarArr[1].f141970b);
            textView2.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.ui.dialog.C57596a.View$OnClickListenerC575993 */

                public void onClick(View view) {
                    AbstractC57602b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo107354a(aVarArr[1].f141969a);
                    }
                }
            });
            return inflate;
        }
        throw new RuntimeException("buttonContents's length mustn't less than 2");
    }
}

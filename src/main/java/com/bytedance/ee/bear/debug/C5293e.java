package com.bytedance.ee.bear.debug;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.debug.e */
public class C5293e {

    /* renamed from: a */
    LoadingView f15161a;

    /* renamed from: b */
    Dialog f15162b;

    /* renamed from: c */
    private TextView f15163c;

    /* renamed from: a */
    public void mo21276a() {
        this.f15162b.show();
        this.f15161a.mo21156a();
    }

    /* renamed from: b */
    public void mo21279b() {
        try {
            if (this.f15162b != null) {
                this.f15161a.mo21157b();
                this.f15162b.dismiss();
                this.f15162b = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo21278a(boolean z) {
        Dialog dialog = this.f15162b;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: a */
    public void mo21277a(String str) {
        Dialog dialog = this.f15162b;
        if (dialog != null && dialog.isShowing()) {
            this.f15163c.setText(str);
        }
    }

    public C5293e(Context context, String str) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.loading_dialog_view, (ViewGroup) null);
        this.f15161a = (LoadingView) inflate.findViewById(R.id.loading_view);
        TextView textView = (TextView) inflate.findViewById(R.id.loading_text);
        this.f15163c = textView;
        textView.setText(str);
        Dialog dialog = new Dialog(context, R.style.loading_dialog);
        this.f15162b = dialog;
        dialog.setContentView((LinearLayout) inflate.findViewById(R.id.dialog_view), new LinearLayout.LayoutParams(-1, -1));
    }
}

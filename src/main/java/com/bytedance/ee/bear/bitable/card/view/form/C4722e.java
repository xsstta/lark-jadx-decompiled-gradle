package com.bytedance.ee.bear.bitable.card.view.form;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.e */
public class C4722e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final TextView f13936a;

    /* renamed from: a */
    public void mo18437a(String str) {
        this.f13936a.setText(str);
    }

    public C4722e(View view) {
        super(view);
        this.f13936a = (TextView) view.findViewById(R.id.form_header_title);
    }
}

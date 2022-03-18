package com.ss.android.lark.mail.impl.search.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mail.impl.search.view.b */
class C43261b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private Context f110071a;

    /* renamed from: b */
    private TextView f110072b;

    /* renamed from: a */
    private void m171873a() {
        this.f110072b = (TextView) this.itemView.findViewById(R.id.mail_search_history_item_text);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154874a(String str) {
        this.f110072b.setText(str);
    }

    C43261b(View view, Context context) {
        super(view);
        this.f110071a = context;
        m171873a();
    }
}

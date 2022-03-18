package com.ss.android.lark.mail.impl.view.dialog.action;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.f */
public class C43936f extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public ActionDialog.AbstractC43928c f111486a;

    /* renamed from: b */
    private Context f111487b;

    /* renamed from: c */
    private ImageView f111488c;

    /* renamed from: d */
    private TextView f111489d;

    /* renamed from: a */
    private void m174075a() {
        this.f111488c = (ImageView) this.itemView.findViewById(R.id.quick_access_item_icon);
        this.f111489d = (TextView) this.itemView.findViewById(R.id.quick_access_item_text);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156378a(ActionDialog.AbstractC43928c cVar) {
        this.f111486a = cVar;
        if (cVar == null) {
            this.f111488c.setImageDrawable(null);
            this.f111489d.setText("");
        } else {
            this.f111488c.setImageResource(cVar.f111464a);
            this.f111489d.setText(this.f111486a.f111465b);
        }
        this.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.C43936f.View$OnClickListenerC439371 */

            public void onClick(View view) {
                if (C43936f.this.f111486a != null) {
                    C43936f.this.f111486a.mo156373a();
                }
            }
        });
    }

    C43936f(Context context, View view) {
        super(view);
        this.f111487b = context;
        m174075a();
    }
}

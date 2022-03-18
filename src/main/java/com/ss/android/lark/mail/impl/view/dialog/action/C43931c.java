package com.ss.android.lark.mail.impl.view.dialog.action;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.dialog.action.ActionDialog;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.view.dialog.action.c */
public class C43931c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public ActionDialog.ActionItem f111466a;

    /* renamed from: b */
    public ActionDialog f111467b;

    /* renamed from: c */
    private Context f111468c;

    /* renamed from: d */
    private ImageView f111469d;

    /* renamed from: e */
    private TextView f111470e;

    /* renamed from: f */
    private View f111471f;

    /* renamed from: a */
    private void m174067a() {
        this.f111469d = (ImageView) this.itemView.findViewById(R.id.action_item_icon);
        this.f111470e = (TextView) this.itemView.findViewById(R.id.action_item_text);
        this.f111471f = this.itemView.findViewById(R.id.action_item_borderline);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156374a(ActionDialog.ActionItem actionItem, boolean z) {
        int i;
        this.f111466a = actionItem;
        if (actionItem == null) {
            this.f111469d.setImageDrawable(null);
            this.f111470e.setText("");
        } else {
            actionItem.setImageResourceWithTint(this.f111468c, this.f111469d);
            this.f111470e.setText(this.f111466a.text);
        }
        this.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.action.C43931c.View$OnClickListenerC439321 */

            public void onClick(View view) {
                AbstractC43930b a;
                if (C43931c.this.f111466a == null) {
                    return;
                }
                if (C43931c.this.f111467b == null || (a = C43931c.this.f111467b.mo156336a()) == null || !C43929a.m174056a(C43931c.this.f111467b, a, view, C43931c.this.f111466a)) {
                    C43931c.this.f111466a.onClick(view, C43931c.this.f111467b);
                }
            }
        });
        View view = this.f111471f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    C43931c(Context context, View view, ActionDialog actionDialog) {
        super(view);
        this.f111468c = context;
        this.f111467b = actionDialog;
        m174067a();
    }
}

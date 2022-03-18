package com.ss.android.lark.calendar.impl.features.preempt.widget;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnConfirmDialogClickListener;
import com.ss.android.lark.ui.DialogC57584b;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.widget.a */
public class DialogC32259a extends DialogC57584b {

    /* renamed from: a */
    public CheckBox f82528a;

    /* renamed from: b */
    public OnConfirmDialogClickListener f82529b;

    /* renamed from: d */
    private LinearLayout f82530d;

    /* renamed from: e */
    private TextView f82531e;

    /* renamed from: f */
    private Context f82532f;

    /* renamed from: a */
    private void m123025a() {
        this.f82530d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.preempt.widget.DialogC32259a.View$OnClickListenerC322601 */

            public void onClick(View view) {
                DialogC32259a.this.f82528a.setChecked(!DialogC32259a.this.f82528a.isChecked());
            }
        });
        this.f82531e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.preempt.widget.DialogC32259a.View$OnClickListenerC322612 */

            public void onClick(View view) {
                if (DialogC32259a.this.f82529b != null) {
                    DialogC32259a.this.f82529b.mo117846a(DialogC32259a.this.f82528a.isChecked());
                }
            }
        });
    }

    @Override // com.ss.android.lark.ui.DialogC57584b
    public void show() {
        this.f82528a.setChecked(true);
        getWindow().getAttributes().width = C57582a.m223601a(this.f82532f, 300.0f);
        super.show();
    }

    /* renamed from: a */
    public void mo117914a(OnConfirmDialogClickListener aVar) {
        this.f82529b = aVar;
    }

    /* renamed from: a */
    private void m123026a(Context context) {
        m123027b(context);
        m123025a();
    }

    public DialogC32259a(Context context) {
        super(context, 2131886424);
        setContentView(R.layout.calendar_preempt_confirm_dialog);
        m123026a(context);
    }

    /* renamed from: b */
    private void m123027b(Context context) {
        this.f82532f = context;
        this.f82530d = (LinearLayout) findViewById(R.id.checkboxContainer);
        this.f82528a = (CheckBox) findViewById(R.id.dialogCheckbox);
        this.f82531e = (TextView) findViewById(R.id.dialogBtn);
        this.f82528a.setChecked(true);
    }
}

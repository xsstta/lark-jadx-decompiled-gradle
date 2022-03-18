package com.ss.android.lark.ding.service.impl.reminder;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.ding.service.impl.reminder.UrgentReminderView;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;

/* renamed from: com.ss.android.lark.ding.service.impl.reminder.a */
public class C36780a implements AbstractC58451a<UrgentReminderData> {

    /* renamed from: a */
    private UrgentReminderData f94499a;

    /* renamed from: b */
    private UrgentReminderView f94500b;

    /* renamed from: c */
    private UrgentReminderView.AbstractC36779a f94501c;

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    public /* synthetic */ boolean aB_() {
        return AbstractC58451a.CC.$default$aB_(this);
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: b */
    public int mo117932b() {
        return R.id.reminder_handler_type_urgent;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: c */
    public boolean mo117933c() {
        return true;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: d */
    public boolean mo117934d() {
        return false;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: e */
    public long mo117935e() {
        return 0;
    }

    /* renamed from: f */
    public UrgentReminderData mo135488f() {
        return this.f94499a;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public String mo117929a() {
        if (this.f94499a.getMessage() == null) {
            return "";
        }
        return this.f94499a.getMessage().getId() + this.f94499a.getAckId();
    }

    /* renamed from: a */
    public void mo135487a(UrgentReminderData urgentReminderData) {
        this.f94499a = urgentReminderData;
    }

    public C36780a(UrgentReminderView.AbstractC36779a aVar) {
        this.f94501c = aVar;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public View mo117928a(Context context) {
        UrgentReminderView urgentReminderView = new UrgentReminderView(context);
        this.f94500b = urgentReminderView;
        urgentReminderView.setData(this.f94499a);
        this.f94500b.setClickListener(this.f94501c);
        return this.f94500b;
    }
}

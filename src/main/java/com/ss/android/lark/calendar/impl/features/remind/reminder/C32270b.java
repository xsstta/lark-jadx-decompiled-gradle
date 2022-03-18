package com.ss.android.lark.calendar.impl.features.remind.reminder;

import android.content.Context;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.impl.utils.C32663p;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;

/* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.b */
public class C32270b implements AbstractC58451a<OverallReminderData> {

    /* renamed from: a */
    private OverallReminderData f82552a;

    /* renamed from: b */
    private OverallReminderView f82553b;

    /* renamed from: c */
    private OverallReminderView.AbstractC32265a f82554c;

    /* renamed from: d */
    private long f82555d;

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    public /* synthetic */ boolean aB_() {
        return AbstractC58451a.CC.$default$aB_(this);
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: b */
    public int mo117932b() {
        return R.id.reminder_handler_type_overall;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: d */
    public boolean mo117934d() {
        return true;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: c */
    public boolean mo117933c() {
        if (C32663p.m125352a(this.f82552a)) {
            if (System.currentTimeMillis() < this.f82552a.getEndTime() * 1000) {
                return true;
            }
            return false;
        } else if (System.currentTimeMillis() - (this.f82552a.getStartTime() * 1000) < 1800000) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: e */
    public long mo117935e() {
        if (C32663p.m125352a(this.f82552a)) {
            this.f82555d = (this.f82552a.getEndTime() * 1000) - System.currentTimeMillis();
        } else {
            this.f82555d = ((this.f82552a.getStartTime() * 1000) + 1800000) - System.currentTimeMillis();
        }
        return this.f82555d;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public String mo117929a() {
        return this.f82552a.getCalendarId() + "_" + this.f82552a.getKey() + "_" + this.f82552a.getOriginalTime() + "_" + this.f82552a.getStartTime() + "_" + this.f82552a.getMinutes();
    }

    /* renamed from: a */
    public void mo117930a(OverallReminderData overallReminderData) {
        this.f82552a = overallReminderData;
    }

    public C32270b(OverallReminderView.AbstractC32265a aVar) {
        this.f82554c = aVar;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public View mo117928a(Context context) {
        OverallReminderView overallReminderView = new OverallReminderView(context);
        this.f82553b = overallReminderView;
        overallReminderView.setData(this.f82552a);
        this.f82553b.setReminderClickListener(this.f82554c);
        return this.f82553b;
    }
}

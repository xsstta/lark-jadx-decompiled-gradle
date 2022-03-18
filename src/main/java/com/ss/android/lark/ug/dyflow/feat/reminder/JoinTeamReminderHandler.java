package com.ss.android.lark.ug.dyflow.feat.reminder;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.ug.dyflow.feat.reminder.JoinTeamReminderView;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderHandler;", "Lcom/ss/android/lark/widget/floatwindow/BaseHandler;", "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderData;", "viewListener", "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView$OnReminderClickListener;", "(Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView$OnReminderClickListener;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "view", "Lcom/ss/android/lark/ug/dyflow/feat/reminder/JoinTeamReminderView;", "getId", "", "getShowTime", "", "getType", "", "isStrongConsume", "", "isValid", "needAutoClose", "onCreateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "setData", "", "updateViewData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.feat.a.b */
public final class JoinTeamReminderHandler implements AbstractC58451a<JoinTeamReminderData> {

    /* renamed from: a */
    private JoinTeamReminderData f141514a;

    /* renamed from: b */
    private JoinTeamReminderView f141515b;

    /* renamed from: c */
    private final JoinTeamReminderView.OnReminderClickListener f141516c;

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    public boolean aB_() {
        return true;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: b */
    public int mo117932b() {
        return R.id.reminder_handler_type_join_team_guide;
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

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public String mo117929a() {
        return String.valueOf((int) R.id.reminder_handler_type_join_team_guide);
    }

    /* renamed from: a */
    public void mo194962a(JoinTeamReminderData aVar) {
        this.f141514a = aVar;
    }

    public JoinTeamReminderHandler(JoinTeamReminderView.OnReminderClickListener aVar) {
        this.f141516c = aVar;
    }

    @Override // com.ss.android.lark.widget.floatwindow.AbstractC58451a
    /* renamed from: a */
    public View mo117928a(Context context) {
        JoinTeamReminderView cVar = new JoinTeamReminderView(context, this.f141516c);
        JoinTeamReminderData aVar = this.f141514a;
        if (aVar != null) {
            cVar.setData(aVar);
        }
        this.f141515b = cVar;
        return cVar;
    }
}

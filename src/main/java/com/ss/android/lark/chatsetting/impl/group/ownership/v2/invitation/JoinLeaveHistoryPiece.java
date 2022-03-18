package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import android.content.Intent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryActivity;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\bH\u0014¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/JoinLeaveHistoryPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "isContentViewVisible", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemType", "", "onClick", "", "sendClickHitPoint", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class JoinLeaveHistoryPiece extends ChatSettingNavigationPiece {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 31;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_GroupManagement_ViewJoinAndLeaveHistory;
    }

    /* renamed from: o */
    private final void m135700o() {
        String str;
        ChatSettingHitPointNew.m136625a(ChatSettingHitPointNew.GroupManageParam.MEMBER_INOUT_HISTORY, null, 2, null);
        OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
        Chat n = mo127670n();
        if (n == null || (str = n.getId()) == null) {
            str = "";
        }
        aVar.mo129291b(str);
        GroupHitPoint.f90519a.mo129256l();
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        String str;
        Boolean bool;
        m135700o();
        Chat n = mo127670n();
        Intent intent = new Intent(mo177180C(), JoinLeaveHistoryActivity.class);
        if (n == null || (str = n.getId()) == null) {
            str = "";
        }
        intent.putExtra("param_chat_id", str);
        if (n != null) {
            bool = Boolean.valueOf(n.isThread());
        } else {
            bool = null;
        }
        intent.putExtra("param_is_thread", bool);
        mo177186a(intent);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        return a.mo127284n().mo127297a("chat.enterLeaveGroupHistory");
    }
}

package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import android.content.Intent;
import android.os.Bundle;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryActivity;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/ShareHistoryPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "mIsTeamEnable", "", "isContentViewVisible", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemType", "", "onClick", "", "sendHitPoint", "startSharingHistoryActivity", "chatId", "", "isThread", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareHistoryPiece extends ChatSettingNavigationPiece {

    /* renamed from: a */
    private final boolean f90063a = C34501a.m133933a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 32;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Group_SharingHistoryDescription;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        Chat n = mo127670n();
        if (n != null) {
            m135723d(n);
            String id = n.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            m135722a(id, n.isThread());
        }
    }

    /* renamed from: d */
    private final void m135723d(Chat chat) {
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        OwnershipHitPoint.f90525a.mo129294c(id);
        GroupHitPoint.f90519a.mo129253k();
        ChatSettingHitPointNew.m136625a(ChatSettingHitPointNew.GroupManageParam.GROUP_SHARE_HISTORY, null, 2, null);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isPublic()) {
            return false;
        }
        if (chat.isTeam() && this.f90063a) {
            return false;
        }
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        return a.mo127284n().mo127297a("chat.groupShareHistory");
    }

    /* renamed from: a */
    private final void m135722a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("key_params_chat_id", str);
        bundle.putBoolean("key_params_is_thread", z);
        Intent intent = new Intent(mo177180C(), SharingHistoryActivity.class);
        intent.putExtras(bundle);
        mo177186a(intent);
    }
}

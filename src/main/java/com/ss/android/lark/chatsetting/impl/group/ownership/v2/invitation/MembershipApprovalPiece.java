package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import android.content.Intent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListActivity;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/MembershipApprovalPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "isContentViewVisible", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "itemType", "", "onChatChanged", "", "onClick", "statusRes", "subtitleRes", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MembershipApprovalPiece extends ChatSettingNavigationPiece {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 25;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Group_ApproveInvitation;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: k */
    public int mo127645k() {
        return R.string.Lark_Group_ApproveInvitationDescription;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: l */
    public int mo127646l() {
        return R.string.Lark_Legacy_OpenNow;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        String str;
        boolean z;
        Chat n = mo127670n();
        Intent intent = new Intent(mo177180C(), ApplicantListActivity.class);
        if (n == null || (str = n.getId()) == null) {
            str = "";
        }
        intent.putExtra("key_params_chat_id", str);
        if (n != null) {
            z = n.isThread();
        } else {
            z = false;
        }
        intent.putExtra("key_params_is_thread", z);
        mo177186a(intent);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!C34501a.m133933a() || !chat.isTeam()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (chat.getAddMemberApply() == Chat.AddMemberApply.NEED_APPLY) {
            i = R.string.Lark_Legacy_OpenNow;
        } else {
            i = R.string.Lark_Legacy_MineMessageSettingClose;
        }
        if (chat.getPutChatterApplyCount() > 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        SettingNavigationPiece.m134140a(this, null, null, C51468a.m199493c(i, mo177180C()), i2, 3, null);
    }
}

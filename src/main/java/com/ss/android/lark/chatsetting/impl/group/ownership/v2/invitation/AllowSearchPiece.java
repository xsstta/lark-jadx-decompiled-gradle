package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import android.content.Intent;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableActivity;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPointNew;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/AllowSearchPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "isGroupSearchEnable", "", "isContentViewEnable", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isContentViewVisible", "itemType", "", "onChatChanged", "", "onClick", "sendClickHitPoint", "statusRes", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AllowSearchPiece extends ChatSettingNavigationPiece {

    /* renamed from: a */
    private final boolean f90050a = ChatSettingModule.m133639a().mo127268a("im.chat.searchable.group");

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 26;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Group_FindGroupViaSearchTitle;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: l */
    public int mo127646l() {
        return R.string.Lark_Legacy_OpenNow;
    }

    /* renamed from: o */
    private final void m135692o() {
        Chat n = mo127670n();
        if (n != null) {
            OwnershipHitPointNew.Companion.m136786a(OwnershipHitPointNew.f90531b, n, "allow_to_be_searched", "im_chat_allow_to_be_searched_view", null, 8, null);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        String str;
        Boolean bool;
        if (mo127632c()) {
            m135692o();
            Chat n = mo127670n();
            Intent intent = new Intent(mo177180C(), GroupSearchEnableActivity.class);
            if (n == null || (str = n.getId()) == null) {
                str = "";
            }
            intent.putExtra("chat_id", str);
            if (n != null) {
                bool = Boolean.valueOf(n.isThread());
            } else {
                bool = null;
            }
            intent.putExtra("is_thread", bool);
            mo177186a(intent);
            return;
        }
        UDToast.show(mo177180C(), (int) R.string.Lark_Group_FeatureUnsupportedToast);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!this.f90050a) {
            return false;
        }
        if (!C34501a.m133933a() || !chat.isTeam()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        int i;
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (chat.isPublic()) {
            i = R.string.Lark_Legacy_OpenNow;
        } else {
            i = R.string.Lark_Legacy_MineMessageSettingClose;
        }
        SettingNavigationPiece.m134140a(this, null, null, C51468a.m199493c(i, mo177180C()), 0, 11, null);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: c */
    public boolean mo127668c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isCrossTenant() || chat.isCrossWithKa() || chat.is_department() || chat.isTenant() || chat.isEdu() || chat.isMeeting() || chat.isSecret() || chat.isOnCall() || chat.isCustomerService()) {
            return false;
        }
        return true;
    }
}

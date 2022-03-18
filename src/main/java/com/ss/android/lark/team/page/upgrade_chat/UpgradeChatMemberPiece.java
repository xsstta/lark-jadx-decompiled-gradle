package com.ss.android.lark.team.page.upgrade_chat;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.piece.TeamMemberPiece;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberPiece;", "Lcom/ss/android/lark/team/common/piece/TeamMemberPiece;", "Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel;", "()V", "getItemName", "", "getViewModel", "Ljava/lang/Class;", "onClickViewMember", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UpgradeChatMemberPiece extends TeamMemberPiece<UpgradeChatMemberPiece, UpgradeChatMemberViewModel> {
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: b */
    public Class<UpgradeChatMemberViewModel> mo189023b() {
        return UpgradeChatMemberViewModel.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: d */
    public String mo189026d() {
        String str;
        Chat defaultTeamChat;
        UpgradeChatMemberViewModel aVar = (UpgradeChatMemberViewModel) mo189019a();
        if (aVar == null || (defaultTeamChat = aVar.getDefaultTeamChat()) == null || (str = defaultTeamChat.getName()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "viewModel?.defaultTeamChat?.getName() ?: \"\"");
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.TeamMemberPiece
    /* renamed from: c */
    public void mo189025c(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        UpgradeChatMemberViewModel aVar = (UpgradeChatMemberViewModel) mo189019a();
        if (aVar != null) {
            Context context = view.getContext();
            SearchChatInfo searchChatInfo = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                Object obj = mo177203q().mo177165a().get("intent_search_info");
                if (obj != null) {
                    Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                    if (obj instanceof SearchChatInfo) {
                        searchChatInfo = obj;
                    }
                }
                SearchChatInfo searchChatInfo2 = searchChatInfo;
                if (searchChatInfo2 != null) {
                    ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
                    String id = searchChatInfo2.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "searchInfo.id");
                    c.mo144137a(activity, id, !aVar.isConversionType());
                }
            }
        }
    }
}

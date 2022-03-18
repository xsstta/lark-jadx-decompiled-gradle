package com.ss.android.lark.team.picker.add_group;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.picker.TeamPickerConfirmActivity;
import com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/team/picker/add_group/AddGroupPickerPiece;", "Lcom/ss/android/lark/team/picker/upgrade_group/UpgradeGroupPickerPiece;", "()V", "getCustomizeView", "Landroid/view/View;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "getErrorTitleResId", "", "getSearchHintResId", "handleDataInner", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isCheckOwner", "", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "openConfirmActivity", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddGroupPickerPiece extends UpgradeGroupPickerPiece {

    /* renamed from: a */
    public static final Companion f137273a = new Companion(null);

    @Override // com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece
    /* renamed from: a */
    public int mo189634a() {
        return R.string.Project_MV_UnableToAddTeamTittle;
    }

    @Override // com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece, com.ss.android.lark.team.picker.base.BaseTeamPickerPiece
    /* renamed from: b */
    public int mo189636b() {
        return R.string.Project_MV_SearchGroupsManage;
    }

    @Override // com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece
    public boolean bo_() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/picker/add_group/AddGroupPickerPiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_group.AddGroupPickerPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece
    /* renamed from: a */
    public void mo189635a(SearchChatInfo searchChatInfo, Chat chat) {
        Intrinsics.checkParameterIsNotNull(searchChatInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        m215610b(searchChatInfo, chat);
    }

    /* renamed from: b */
    private final void m215610b(SearchChatInfo searchChatInfo, Chat chat) {
        Object obj = mo177203q().mo177165a().get("intent_team");
        Team team = null;
        if (obj != null) {
            Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
            if (!(obj instanceof Team)) {
                obj = null;
            }
            team = obj;
        }
        Team team2 = team;
        if (team2 == null) {
            Log.m165383e("AddGroupPickerPiece", "team=null");
            return;
        }
        Intent intent = new Intent(mo177180C(), TeamPickerConfirmActivity.class);
        intent.putExtra("intent_team", team2);
        intent.putExtra("intent_search_info", searchChatInfo);
        intent.putExtra("intent_team_chat_type", chat.getTeamChatType());
        mo177187a(intent, 17);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        if (17 != i || -1 != i2) {
            return super.mo128689a(i, i2, intent);
        }
        mo177212z();
        return true;
    }
}

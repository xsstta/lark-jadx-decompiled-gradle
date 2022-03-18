package com.ss.android.lark.team.page.upgrade_chat;

import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.api.entity.UpgradeToTeamResponse;
import com.ss.android.lark.team.common.piece.CreateItemTitlePiece;
import com.ss.android.lark.team.common.piece.TeamNameInputExport;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.TeamNameCheckType;
import com.ss.android.lark.team.service.TeamService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeToTeamTitlePiece;", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/api/entity/UpgradeToTeamResponse;", "()V", "chatId", "", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "onClickCreateButton", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "startCheckName", "name", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UpgradeToTeamTitlePiece extends CreateItemTitlePiece implements IGetDataCallback<UpgradeToTeamResponse> {

    /* renamed from: i */
    public String f137262i = "";

    /* renamed from: j */
    public Chat.ChatMode f137263j = Chat.ChatMode.DEFAULT;

    public UpgradeToTeamTitlePiece() {
        super(R.string.Project_MV_ExistingGroupsToSelect);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/team/page/upgrade_chat/UpgradeToTeamTitlePiece$onSuccess$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.UpgradeToTeamTitlePiece$a */
    public static final class C55641a extends Lambda implements Function0<Unit> {
        final /* synthetic */ UpgradeToTeamResponse $it;
        final /* synthetic */ UpgradeToTeamTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55641a(UpgradeToTeamResponse upgradeToTeamResponse, UpgradeToTeamTitlePiece upgradeToTeamTitlePiece) {
            super(0);
            this.$it = upgradeToTeamResponse;
            this.this$0 = upgradeToTeamTitlePiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            String str;
            Item chatItem = this.$it.getChatItem();
            if (chatItem == null || (str = chatItem.getEntityId()) == null) {
                str = this.this$0.f137262i;
            }
            C55356a.m214819a().mo144124c().mo144138a(this.this$0.mo177180C(), str, this.this$0.f137263j);
            UDToast.show(this.this$0.mo177180C(), (int) R.string.Project_T_TeamCreatedSuccessfully);
            C55356a.m214819a().mo144126e().mo144150a();
        }
    }

    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: f */
    public void mo188983f() {
        IPieceExport aVar;
        String str;
        Chat.ChatMode chatMode;
        LiveData<String> a;
        PieceContext r = mo177204r();
        SearchChatInfo searchChatInfo = null;
        if (r != null) {
            aVar = r.mo177222a(TeamNameInputExport.class);
        } else {
            aVar = null;
        }
        TeamNameInputExport hVar = (TeamNameInputExport) aVar;
        if (hVar == null || (a = hVar.mo189033a()) == null || (str = a.mo5927b()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "getPieceExport<TeamNameI…ntLiveData()?.value ?: \"\"");
        Object obj = mo177203q().mo177165a().get("intent_search_info");
        if (obj != null) {
            Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
            if (obj instanceof SearchChatInfo) {
                searchChatInfo = obj;
            }
        }
        SearchChatInfo searchChatInfo2 = searchChatInfo;
        if (searchChatInfo2 != null) {
            String id = searchChatInfo2.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "it.id");
            this.f137262i = id;
            if (searchChatInfo2.isThread()) {
                chatMode = Chat.ChatMode.THREAD_V2;
            } else {
                chatMode = Chat.ChatMode.DEFAULT;
            }
            this.f137263j = chatMode;
        }
        mo188976a(true);
        UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(this);
        TeamService bVar = TeamService.f136826a;
        String str2 = this.f137262i;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189072a(str, str2, wrapAndAddGetDataCallback);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        super.mo188974a(R.string.Project_MV_UnableToCreateTeamTittle, errorResult);
    }

    /* renamed from: a */
    public void onSuccess(UpgradeToTeamResponse upgradeToTeamResponse) {
        mo188976a(false);
        if (upgradeToTeamResponse != null) {
            mo177192a(new C55641a(upgradeToTeamResponse, this));
        }
        mo177212z();
    }

    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: a */
    public void mo188975a(String str, UIGetDataCallback<Boolean> uIGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(uIGetDataCallback, "callback");
        TeamService.f136826a.mo189071a(str, (Long) null, TeamNameCheckType.TEAM, uIGetDataCallback);
    }
}

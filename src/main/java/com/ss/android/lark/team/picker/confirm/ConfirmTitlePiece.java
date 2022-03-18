package com.ss.android.lark.team.picker.confirm;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.api.entity.BindTeamChatPreCheckResponse;
import com.ss.android.lark.team.api.entity.BindTeamChatResponse;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0006\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\tH\u0016J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"J*\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006'"}, d2 = {"Lcom/ss/android/lark/team/picker/confirm/ConfirmTitlePiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "mActionView", "Landroid/view/View;", "mObserver", "com/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$mObserver$1", "Lcom/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$mObserver$1;", "bindChatToTeam", "", "teamId", "", "teamChatType", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "searchChatInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "getDialogMessage", "", "response", "Lcom/ss/android/lark/team/api/entity/BindTeamChatPreCheckResponse;", "groupName", "getErrorTitleResId", "", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "handleDataInner", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCreate", "showErrorDialog", "tipResId", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "showOperationDialog", "team", "Lcom/ss/android/lark/team/entity/Team;", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ConfirmTitlePiece extends Piece<ConfirmTitlePiece> {

    /* renamed from: b */
    public static final Companion f137310b = new Companion(null);

    /* renamed from: a */
    public View f137311a;

    /* renamed from: g */
    private final C55664e f137312g = new C55664e(this, true);

    /* renamed from: a */
    private final int m215660a() {
        return R.string.Project_MV_UnableToAddTeamTittle;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo189679a(Team team, TeamChatType teamChatType, SearchChatInfo searchChatInfo, BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse) {
        UDDialogBuilder eVar = (UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_MV_ButtonsAddHere, new DialogInterface$OnClickListenerC55666g(this, team, teamChatType, searchChatInfo))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Project_MV_CancelButton, DialogInterface$OnClickListenerC55667h.f137329a);
        String title = searchChatInfo.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, "searchChatInfo.title");
        eVar.message(m215661a(bindTeamChatPreCheckResponse, teamChatType, title));
        eVar.show();
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team_chat_type", this.f137312g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$handleDataInner$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/api/entity/BindTeamChatPreCheckResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$d */
    public static final class C55663d implements IGetDataCallback<BindTeamChatPreCheckResponse> {

        /* renamed from: a */
        final /* synthetic */ ConfirmTitlePiece f137319a;

        /* renamed from: b */
        final /* synthetic */ Team f137320b;

        /* renamed from: c */
        final /* synthetic */ TeamChatType f137321c;

        /* renamed from: d */
        final /* synthetic */ SearchChatInfo f137322d;

        /* renamed from: a */
        public void onSuccess(BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse) {
            this.f137319a.mo189679a(this.f137320b, this.f137321c, this.f137322d, bindTeamChatPreCheckResponse);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ConfirmTitlePiece", "preCheck err=" + errorResult.getDebugMsg() + ",teamId=" + this.f137320b.getId() + ",chatId=" + this.f137322d.getId());
            this.f137319a.mo189676a(R.string.Project_MV_UnableToAddTeamTittle, errorResult);
        }

        C55663d(ConfirmTitlePiece confirmTitlePiece, Team team, TeamChatType teamChatType, SearchChatInfo searchChatInfo) {
            this.f137319a = confirmTitlePiece;
            this.f137320b = team;
            this.f137321c = teamChatType;
            this.f137322d = searchChatInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$mObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$e */
    public static final class C55664e extends DataObserver<TeamChatType> {

        /* renamed from: a */
        final /* synthetic */ ConfirmTitlePiece f137323a;

        /* renamed from: a */
        public void mo127664a(TeamChatType teamChatType) {
            boolean z;
            if (TeamChatType.TEAM_CHAT_TYPE_PUBLIC == teamChatType || TeamChatType.TEAM_CHAT_TYPE_PRIVATE == teamChatType) {
                z = true;
            } else {
                z = false;
            }
            View view = this.f137323a.f137311a;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55664e(ConfirmTitlePiece confirmTitlePiece, boolean z) {
            super(z);
            this.f137323a = confirmTitlePiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$bindChatToTeam$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/api/entity/BindTeamChatResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$b */
    public static final class C55661b implements IGetDataCallback<BindTeamChatResponse> {

        /* renamed from: a */
        final /* synthetic */ ConfirmTitlePiece f137313a;

        /* renamed from: b */
        final /* synthetic */ String f137314b;

        /* renamed from: c */
        final /* synthetic */ SearchChatInfo f137315c;

        /* renamed from: d */
        final /* synthetic */ long f137316d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ConfirmTitlePiece", "bindChat err=" + errorResult.getDebugMsg() + ",teamId=" + this.f137316d + ",chatId=" + this.f137314b);
            this.f137313a.mo189676a(R.string.Project_MV_UnableToAddTeamTittle, errorResult);
        }

        /* renamed from: a */
        public void onSuccess(BindTeamChatResponse bindTeamChatResponse) {
            String str;
            Chat.ChatMode chatMode;
            Chat chat;
            Log.m165389i("ConfirmTitlePiece", "bindChat success");
            if (bindTeamChatResponse == null || (chat = bindTeamChatResponse.getChat()) == null || (str = chat.getId()) == null) {
                str = this.f137314b;
            }
            if (this.f137315c.isThread()) {
                chatMode = Chat.ChatMode.THREAD_V2;
            } else {
                chatMode = Chat.ChatMode.DEFAULT;
            }
            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
            Context C = this.f137313a.mo177180C();
            Intrinsics.checkExpressionValueIsNotNull(str, "curChatId");
            c.mo144138a(C, str, chatMode);
            UDToast.show(this.f137313a.mo177180C(), (int) R.string.Project_MV_AddedSuccessfully);
            this.f137313a.mo177202g(-1);
            this.f137313a.mo177212z();
        }

        C55661b(ConfirmTitlePiece confirmTitlePiece, String str, SearchChatInfo searchChatInfo, long j) {
            this.f137313a = confirmTitlePiece;
            this.f137314b = str;
            this.f137315c = searchChatInfo;
            this.f137316d = j;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/picker/confirm/ConfirmTitlePiece$getView$1$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$c */
    public static final class C55662c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ ConfirmTitlePiece f137317a;

        /* renamed from: b */
        final /* synthetic */ String f137318b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            super.performAction(view);
            Object obj = this.f137317a.mo177203q().mo177165a().get("intent_search_info");
            SearchChatInfo searchChatInfo = null;
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                if (!(obj instanceof SearchChatInfo)) {
                    obj = null;
                }
                searchChatInfo = obj;
            }
            SearchChatInfo searchChatInfo2 = searchChatInfo;
            if (searchChatInfo2 == null) {
                Log.m165383e("ConfirmTitlePiece", "SearchChatInfo=null");
            } else {
                this.f137317a.mo189678a(searchChatInfo2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55662c(String str, int i, int i2, ConfirmTitlePiece confirmTitlePiece, String str2) {
            super(str, i, i2);
            this.f137317a = confirmTitlePiece;
            this.f137318b = str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189678a(com.ss.android.lark.searchcommon.dto.info.SearchChatInfo r6) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece.mo189678a(com.ss.android.lark.searchcommon.dto.info.SearchChatInfo):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$f */
    public static final class DialogInterface$OnClickListenerC55665f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55665f f137324a = new DialogInterface$OnClickListenerC55665f();

        DialogInterface$OnClickListenerC55665f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$h */
    public static final class DialogInterface$OnClickListenerC55667h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55667h f137329a = new DialogInterface$OnClickListenerC55667h();

        DialogInterface$OnClickListenerC55667h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece$g */
    public static final class DialogInterface$OnClickListenerC55666g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConfirmTitlePiece f137325a;

        /* renamed from: b */
        final /* synthetic */ Team f137326b;

        /* renamed from: c */
        final /* synthetic */ TeamChatType f137327c;

        /* renamed from: d */
        final /* synthetic */ SearchChatInfo f137328d;

        DialogInterface$OnClickListenerC55666g(ConfirmTitlePiece confirmTitlePiece, Team team, TeamChatType teamChatType, SearchChatInfo searchChatInfo) {
            this.f137325a = confirmTitlePiece;
            this.f137326b = team;
            this.f137327c = teamChatType;
            this.f137328d = searchChatInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f137325a.mo189677a(this.f137326b.getId(), this.f137327c, this.f137328d);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        String c = C51468a.m199493c(R.string.Project_MV_ButtonsAddHere, context);
        CommonTitleBar commonTitleBar = new CommonTitleBar(context);
        commonTitleBar.setTitle(R.string.Project_MV_AddGroupsTitle);
        commonTitleBar.setMainTitleSize(17.0f);
        commonTitleBar.setLeftText(R.string.Project_MV_PreviousStep);
        commonTitleBar.setLeftTextSize(16.0f);
        commonTitleBar.setLeftImageDrawable(null);
        this.f137311a = commonTitleBar.addAction(new C55662c(c, R.color.team_confirm_action_text_color, 16, this, c));
        return commonTitleBar;
    }

    /* renamed from: a */
    public final void mo189676a(int i, ErrorResult errorResult) {
        String str;
        if (errorResult == null || (str = errorResult.getDisplayMsg()) == null) {
            str = C51468a.m199493c(i, mo177180C());
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "errorResult?.displayMsg …tString(requireContext())");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).title(m215660a())).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_T_OkGotIt, DialogInterface$OnClickListenerC55665f.f137324a)).show();
    }

    /* renamed from: a */
    private final String m215661a(BindTeamChatPreCheckResponse bindTeamChatPreCheckResponse, TeamChatType teamChatType, String str) {
        if (bindTeamChatPreCheckResponse == null) {
            Log.m165397w("ConfirmTitlePiece", "invalid response");
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Project_MV_ConfirmThisMany, "GroupName", str);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…, groupName\n            )");
            return mustacheFormat;
        } else if (TeamChatType.TEAM_CHAT_TYPE_PRIVATE == teamChatType) {
            if (bindTeamChatPreCheckResponse.getToAddTeamMemberCount() > 0) {
                String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Project_MV_TeamNewlyAddedThisMany, "number", String.valueOf(bindTeamChatPreCheckResponse.getToAddTeamMemberCount()));
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…tring()\n                )");
                return mustacheFormat2;
            }
            String mustacheFormat3 = UIHelper.mustacheFormat((int) R.string.Project_MV_ConfirmThisMany, "GroupName", str);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat3, "UIHelper.mustacheFormat(…, \"GroupName\", groupName)");
            return mustacheFormat3;
        } else if (bindTeamChatPreCheckResponse.getToAddTeamMemberCount() > 0 && bindTeamChatPreCheckResponse.getToAddChatChatterCount() > 0) {
            String mustacheFormat4 = UIHelper.mustacheFormat((int) R.string.Project_MV_TeamAddNumberMembersNow, MapsKt.mapOf(TuplesKt.to("GroupNumber", String.valueOf(bindTeamChatPreCheckResponse.getToAddTeamMemberCount())), TuplesKt.to("TeamNumber", String.valueOf(bindTeamChatPreCheckResponse.getToAddChatChatterCount()))));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat4, "UIHelper.mustacheFormat(…          )\n            )");
            return mustacheFormat4;
        } else if (bindTeamChatPreCheckResponse.getToAddTeamMemberCount() > 0 && bindTeamChatPreCheckResponse.getToAddChatChatterCount() <= 0) {
            String mustacheFormat5 = UIHelper.mustacheFormat((int) R.string.Project_MV_TeamNewlyAddedThisMany, "number", String.valueOf(bindTeamChatPreCheckResponse.getToAddTeamMemberCount()));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat5, "UIHelper.mustacheFormat(….toString()\n            )");
            return mustacheFormat5;
        } else if (bindTeamChatPreCheckResponse.getToAddTeamMemberCount() > 0 || bindTeamChatPreCheckResponse.getToAddChatChatterCount() <= 0) {
            String mustacheFormat6 = UIHelper.mustacheFormat((int) R.string.Project_MV_ConfirmThisMany, "GroupName", str);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat6, "UIHelper.mustacheFormat(…ame\", groupName\n        )");
            return mustacheFormat6;
        } else {
            String mustacheFormat7 = UIHelper.mustacheFormat((int) R.string.Project_MV_GroupThisManyNow, "number", String.valueOf(bindTeamChatPreCheckResponse.getToAddChatChatterCount()));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat7, "UIHelper.mustacheFormat(….toString()\n            )");
            return mustacheFormat7;
        }
    }

    /* renamed from: a */
    public final void mo189677a(long j, TeamChatType teamChatType, SearchChatInfo searchChatInfo) {
        String id = searchChatInfo.getId();
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C55661b(this, id, searchChatInfo, j));
        Log.m165389i("ConfirmTitlePiece", "bindChat teamId=" + j + ",chatId=" + id + ",type=" + teamChatType.name());
        TeamService bVar = TeamService.f136826a;
        Intrinsics.checkExpressionValueIsNotNull(id, "chatId");
        ICallback wrapAndAddCallback = mo177209w().wrapAndAddCallback(uIGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndAddCallback(callback)");
        bVar.mo189067a(j, id, teamChatType, (IGetDataCallback) wrapAndAddCallback);
    }
}

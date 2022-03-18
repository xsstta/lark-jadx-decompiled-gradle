package com.ss.android.lark.team.page.create_chat;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.api.entity.CreateTeamChatResponse;
import com.ss.android.lark.team.common.piece.CreateItemTitlePiece;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import com.ss.android.lark.team.page.create_team.CreateItemDescriptionExport;
import com.ss.android.lark.team.page.create_team.CreateTeamNameExport;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0014J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0003H\u0016J\u001e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110$H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/team/page/create_chat/CreateTeamChatTitlePiece;", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/api/entity/CreateTeamChatResponse;", "()V", "createItemDescriptionExport", "Lcom/ss/android/lark/team/page/create_team/CreateItemDescriptionExport;", "createTeamNameExport", "Lcom/ss/android/lark/team/page/create_team/CreateTeamNameExport;", "selectedChatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "teamChatType", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "getLoadingDialogText", "", "getName", "handleBackPressed", "", "context", "Landroid/content/Context;", "hasInput", "navigateToMemberSelection", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onClickCreateButton", "onCreate", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onNameDuplicated", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "startCheckName", "name", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamChatTitlePiece extends CreateItemTitlePiece implements IGetDataCallback<CreateTeamChatResponse> {

    /* renamed from: i */
    public CreateItemDescriptionExport f136953i;

    /* renamed from: j */
    private CreateTeamNameExport f136954j;

    /* renamed from: k */
    private Chat.ChatMode f136955k = Chat.ChatMode.THREAD_V2;

    /* renamed from: l */
    private TeamChatType f136956l = TeamChatType.TEAM_CHAT_TYPE_PUBLIC;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$a */
    public static final class RunnableC55475a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CreateTeamChatTitlePiece f136957a;

        /* renamed from: b */
        final /* synthetic */ Chat f136958b;

        RunnableC55475a(CreateTeamChatTitlePiece createTeamChatTitlePiece, Chat chat) {
            this.f136957a = createTeamChatTitlePiece;
            this.f136958b = chat;
        }

        public final void run() {
            this.f136957a.mo177192a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece.RunnableC55475a.C554761 */
                final /* synthetic */ RunnableC55475a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
                    if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0020;
                 */
                @Override // kotlin.jvm.functions.Function0
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void invoke() {
                    /*
                        r5 = this;
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$a r0 = r5.this$0
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece r0 = r0.f136957a
                        com.ss.android.lark.piece.a.c r0 = r0.mo177203q()
                        java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
                        java.lang.String r1 = "intent_team"
                        java.lang.Object r0 = r0.get(r1)
                        r2 = 0
                        if (r0 == 0) goto L_0x001f
                        java.lang.String r3 = "dataMap[key] ?: return null"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                        boolean r3 = r0 instanceof com.ss.android.lark.team.entity.Team
                        if (r3 == 0) goto L_0x001f
                        goto L_0x0020
                    L_0x001f:
                        r0 = r2
                    L_0x0020:
                        com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
                        if (r0 == 0) goto L_0x0060
                        android.content.Intent r2 = new android.content.Intent
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$a r3 = r5.this$0
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece r3 = r3.f136957a
                        android.content.Context r3 = r3.mo177180C()
                        java.lang.Class<com.ss.android.lark.team.page.member.TeamMemberActivity> r4 = com.ss.android.lark.team.page.member.TeamMemberActivity.class
                        r2.<init>(r3, r4)
                        java.io.Serializable r0 = (java.io.Serializable) r0
                        r2.putExtra(r1, r0)
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$a r0 = r5.this$0
                        com.ss.android.lark.chat.entity.chat.Chat r0 = r0.f136958b
                        java.io.Serializable r0 = (java.io.Serializable) r0
                        java.lang.String r1 = "intent_chat"
                        r2.putExtra(r1, r0)
                        com.ss.android.lark.team.entity.MemberActionType r0 = com.ss.android.lark.team.entity.MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT
                        java.io.Serializable r0 = (java.io.Serializable) r0
                        java.lang.String r1 = "intent_team_members_action"
                        r2.putExtra(r1, r0)
                        r0 = 1
                        java.lang.String r1 = "intent_add_member_after_create_chat"
                        r2.putExtra(r1, r0)
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$a r0 = r5.this$0
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece r0 = r0.f136957a
                        r0.mo177186a(r2)
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$a r0 = r5.this$0
                        com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece r0 = r0.f136957a
                        r0.mo177212z()
                    L_0x0060:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece.RunnableC55475a.C554761.invoke():void");
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/team/page/create_chat/CreateTeamChatTitlePiece$onCreate$1", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$CreateButtonEnableInterceptor;", "canClick", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$c */
    public static final class C55478c implements CreateItemTitlePiece.CreateButtonEnableInterceptor {

        /* renamed from: a */
        final /* synthetic */ CreateTeamChatTitlePiece f136960a;

        @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece.CreateButtonEnableInterceptor
        /* renamed from: a */
        public boolean mo188988a() {
            CreateItemDescriptionExport aVar = this.f136960a.f136953i;
            if (aVar == null || !aVar.mo189294b()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55478c(CreateTeamChatTitlePiece createTeamChatTitlePiece) {
            this.f136960a = createTeamChatTitlePiece;
        }
    }

    public CreateTeamChatTitlePiece() {
        super(R.string.Project_MV_TitleCreateGroups);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: h */
    public boolean mo188985h() {
        if (mo188984g().length() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: i */
    public void mo188986i() {
        super.mo188986i();
        CreateTeamNameExport cVar = this.f136954j;
        if (cVar != null) {
            cVar.bn_();
        }
    }

    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: j */
    public String mo188987j() {
        String string = UIHelper.getString(R.string.Lark_Legacy_CreatingGroup);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ark_Legacy_CreatingGroup)");
        return string;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: g */
    public String mo188984g() {
        String str;
        LiveData<String> a;
        CreateTeamNameExport cVar = this.f136954j;
        if (cVar == null || (a = cVar.mo189313a()) == null || (str = a.mo5927b()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "createTeamNameExport?.in…ntLiveData()?.value ?: \"\"");
        return str;
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.team.common.piece.CreateItemTitlePiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        IPieceExport aVar;
        IPieceExport aVar2;
        super.onCreate();
        mo188972a().add(new C55478c(this));
        CreateTeamChatTitlePiece createTeamChatTitlePiece = this;
        PieceContext r = createTeamChatTitlePiece.mo177204r();
        CreateItemDescriptionExport aVar3 = null;
        if (r != null) {
            aVar = r.mo177222a(CreateTeamNameExport.class);
        } else {
            aVar = null;
        }
        CreateTeamNameExport cVar = (CreateTeamNameExport) aVar;
        if (cVar != null) {
            CreateTeamChatTitlePiece createTeamChatTitlePiece2 = this;
            cVar.mo189314b().mo5923a(createTeamChatTitlePiece2, mo188981d());
            cVar.mo189313a().mo5923a(createTeamChatTitlePiece2, mo188978b());
        } else {
            cVar = null;
        }
        this.f136954j = cVar;
        PieceContext r2 = createTeamChatTitlePiece.mo177204r();
        if (r2 != null) {
            aVar2 = r2.mo177222a(CreateItemDescriptionExport.class);
        } else {
            aVar2 = null;
        }
        CreateItemDescriptionExport aVar4 = (CreateItemDescriptionExport) aVar2;
        if (aVar4 != null) {
            aVar4.mo189295c().mo5923a(this, new C55477b(this));
            aVar3 = aVar4;
        }
        this.f136953i = aVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo188983f() {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece.mo188983f():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/team/page/create_chat/CreateTeamChatTitlePiece$onCreate$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece$b */
    static final class C55477b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamChatTitlePiece f136959a;

        C55477b(CreateTeamChatTitlePiece createTeamChatTitlePiece) {
            this.f136959a = createTeamChatTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f136959a.mo188982e();
        }
    }

    /* renamed from: a */
    private final void m215220a(Chat chat) {
        mo177191a(new RunnableC55475a(this, chat));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: c */
    public boolean mo188980c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        TeamHitPoint.m215091i();
        return super.mo188980c(context);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        mo188974a(R.string.Project_MV_UnableToCreateGroupTittle, errorResult);
    }

    /* renamed from: a */
    public void onSuccess(CreateTeamChatResponse createTeamChatResponse) {
        Intrinsics.checkParameterIsNotNull(createTeamChatResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        boolean z = false;
        mo188976a(false);
        if (this.f136956l == TeamChatType.TEAM_CHAT_TYPE_PRIVATE) {
            z = true;
        }
        Context C = mo177180C();
        Chat chat = createTeamChatResponse.getChat();
        if (chat != null) {
            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
            c.mo144138a(C, id, this.f136955k);
            UDToast.show(C, (int) R.string.Project_MV_CreatedSuccessfullyToast);
            if (z) {
                m215220a(chat);
            }
        }
        if (!z) {
            mo177212z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0026;
     */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo188975a(java.lang.String r7, com.larksuite.framework.callback.UIGetDataCallback<java.lang.Boolean> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            com.ss.android.lark.piece.a.c r0 = r6.mo177203q()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0032
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0032:
            if (r1 == 0) goto L_0x0048
            long r2 = r1.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            com.ss.android.lark.team.d.b r0 = com.ss.android.lark.team.service.TeamService.f136826a
            com.ss.android.lark.team.entity.TeamNameCheckType r2 = com.ss.android.lark.team.entity.TeamNameCheckType.CHAT
            com.larksuite.framework.callback.IGetDataCallback r8 = (com.larksuite.framework.callback.IGetDataCallback) r8
            r0.mo189071a(r7, r1, r2, r8)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.create_chat.CreateTeamChatTitlePiece.mo188975a(java.lang.String, com.larksuite.framework.callback.UIGetDataCallback):void");
    }
}

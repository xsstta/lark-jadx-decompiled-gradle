package com.ss.android.lark.team.page.create_team;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.piece.CreateItemTitlePiece;
import com.ss.android.lark.team.entity.CreateTeamResponse;
import com.ss.android.lark.team.entity.PickEntities;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamNameCheckType;
import com.ss.android.lark.team.picker.TeamPickerActivity;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u001e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateTeamTitlePiece;", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/CreateTeamResponse;", "()V", "createTeamNameExport", "Lcom/ss/android/lark/team/page/create_team/CreateTeamNameExport;", "descriptionExport", "Lcom/ss/android/lark/team/page/create_team/CreateItemDescriptionExport;", "getLoadingDialogText", "", "getName", "handleBackPressed", "", "context", "Landroid/content/Context;", "hasInput", "onClickCreateButton", "", "onCreate", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onNameDuplicated", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "startCheckName", "name", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamTitlePiece extends CreateItemTitlePiece implements IGetDataCallback<CreateTeamResponse> {

    /* renamed from: j */
    public static final Companion f137002j = new Companion(null);

    /* renamed from: i */
    public CreateItemDescriptionExport f137003i;

    /* renamed from: k */
    private CreateTeamNameExport f137004k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateTeamTitlePiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamTitlePiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CreateTeamTitlePiece() {
        super(R.string.Project_MV_CustomizeYourTeam);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: i */
    public void mo188986i() {
        super.mo188986i();
        CreateTeamNameExport cVar = this.f137004k;
        if (cVar != null) {
            cVar.bn_();
        }
    }

    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: j */
    public String mo188987j() {
        String string = UIHelper.getString(R.string.Project_T_CreatingATeamNow);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…oject_T_CreatingATeamNow)");
        return string;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: g */
    public String mo188984g() {
        String str;
        LiveData<String> a;
        CreateTeamNameExport cVar = this.f137004k;
        if (cVar == null || (a = cVar.mo189313a()) == null || (str = a.mo5927b()) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "createTeamNameExport?.in…ntLiveData()?.value ?: \"\"");
        return str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/team/page/create_team/CreateTeamTitlePiece$onCreate$1", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$CreateButtonEnableInterceptor;", "canClick", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamTitlePiece$c */
    public static final class C55488c implements CreateItemTitlePiece.CreateButtonEnableInterceptor {

        /* renamed from: a */
        final /* synthetic */ CreateTeamTitlePiece f137006a;

        @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece.CreateButtonEnableInterceptor
        /* renamed from: a */
        public boolean mo188988a() {
            String a;
            boolean z;
            CreateItemDescriptionExport aVar = this.f137006a.f137003i;
            if (!(aVar == null || (a = aVar.mo189292a()) == null)) {
                if (a.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
            }
            CreateItemDescriptionExport aVar2 = this.f137006a.f137003i;
            if (aVar2 == null || !aVar2.mo189294b()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55488c(CreateTeamTitlePiece createTeamTitlePiece) {
            this.f137006a = createTeamTitlePiece;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: h */
    public boolean mo188985h() {
        boolean z;
        String str;
        boolean z2;
        if (mo188984g().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        CreateItemDescriptionExport aVar = this.f137003i;
        if (aVar == null || (str = aVar.mo189292a()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamTitlePiece$d */
    public static final class C55489d extends Lambda implements Function0<Unit> {
        final /* synthetic */ CreateTeamResponse $data;
        final /* synthetic */ CreateTeamTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55489d(CreateTeamTitlePiece createTeamTitlePiece, CreateTeamResponse createTeamResponse) {
            super(0);
            this.this$0 = createTeamTitlePiece;
            this.$data = createTeamResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            final Team team = this.$data.getTeam();
            if (team != null) {
                Intrinsics.checkExpressionValueIsNotNull(team, "data.team ?: return@runSafely");
                Log.m165383e("CreateTeamTitlePiece", "onSuccess team id:" + team.getId());
                UDToast.show(this.this$0.mo177180C(), (int) R.string.Project_T_TeamCreatedSuccessfully);
                C55356a.m214819a().mo144126e().mo144150a();
                C55356a.m214819a().mo144124c().mo144138a(this.this$0.mo177180C(), String.valueOf(team.getDefaultChatId()), Chat.ChatMode.THREAD_V2);
                this.this$0.mo177191a(new Runnable(this) {
                    /* class com.ss.android.lark.team.page.create_team.CreateTeamTitlePiece.C55489d.RunnableC554901 */

                    /* renamed from: a */
                    final /* synthetic */ C55489d f137007a;

                    {
                        this.f137007a = r1;
                    }

                    public final void run() {
                        this.f137007a.this$0.mo177192a(new Function0<Unit>(this) {
                            /* class com.ss.android.lark.team.page.create_team.CreateTeamTitlePiece.C55489d.RunnableC554901.C554911 */
                            final /* synthetic */ RunnableC554901 this$0;

                            {
                                this.this$0 = r1;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final void invoke() {
                                Intent intent = new Intent(this.this$0.f137007a.this$0.mo177180C(), TeamPickerActivity.class);
                                intent.putExtra("intent_team", team);
                                this.this$0.f137007a.this$0.mo177186a(intent);
                                this.this$0.f137007a.this$0.mo177212z();
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.team.common.piece.CreateItemTitlePiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        IPieceExport aVar;
        IPieceExport aVar2;
        super.onCreate();
        mo188972a().add(new C55488c(this));
        CreateTeamTitlePiece createTeamTitlePiece = this;
        PieceContext r = createTeamTitlePiece.mo177204r();
        CreateItemDescriptionExport aVar3 = null;
        if (r != null) {
            aVar = r.mo177222a(CreateTeamNameExport.class);
        } else {
            aVar = null;
        }
        CreateTeamNameExport cVar = (CreateTeamNameExport) aVar;
        if (cVar != null) {
            CreateTeamTitlePiece createTeamTitlePiece2 = this;
            cVar.mo189314b().mo5923a(createTeamTitlePiece2, mo188981d());
            cVar.mo189313a().mo5923a(createTeamTitlePiece2, mo188978b());
        } else {
            cVar = null;
        }
        this.f137004k = cVar;
        PieceContext r2 = createTeamTitlePiece.mo177204r();
        if (r2 != null) {
            aVar2 = r2.mo177222a(CreateItemDescriptionExport.class);
        } else {
            aVar2 = null;
        }
        CreateItemDescriptionExport aVar4 = (CreateItemDescriptionExport) aVar2;
        if (aVar4 != null) {
            aVar4.mo189295c().mo5923a(this, new C55487b(this));
            aVar3 = aVar4;
        }
        this.f137003i = aVar3;
    }

    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: f */
    public void mo188983f() {
        IPieceExport aVar;
        String str;
        IPieceExport aVar2;
        String str2;
        IPieceExport aVar3;
        String str3;
        IPieceExport aVar4;
        String a;
        String a2;
        LiveData<String> a3;
        String b;
        CreateTeamTitlePiece createTeamTitlePiece = this;
        PieceContext r = createTeamTitlePiece.mo177204r();
        AvatarMeta avatarMeta = null;
        if (r != null) {
            aVar = r.mo177222a(CreateTeamNameExport.class);
        } else {
            aVar = null;
        }
        CreateTeamNameExport cVar = (CreateTeamNameExport) aVar;
        if (cVar == null || (a3 = cVar.mo189313a()) == null || (b = a3.mo5927b()) == null) {
            str = "";
        } else {
            str = b;
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "getPieceExport<CreateTea…ntLiveData()?.value ?: \"\"");
        PieceContext r2 = createTeamTitlePiece.mo177204r();
        if (r2 != null) {
            aVar2 = r2.mo177222a(CreateItemDescriptionExport.class);
        } else {
            aVar2 = null;
        }
        CreateItemDescriptionExport aVar5 = (CreateItemDescriptionExport) aVar2;
        if (aVar5 == null || (a2 = aVar5.mo189292a()) == null) {
            str2 = "";
        } else {
            str2 = a2;
        }
        PieceContext r3 = createTeamTitlePiece.mo177204r();
        if (r3 != null) {
            aVar3 = r3.mo177222a(CreateTeamAvatarExport.class);
        } else {
            aVar3 = null;
        }
        CreateTeamAvatarExport bVar = (CreateTeamAvatarExport) aVar3;
        if (bVar == null || (a = bVar.mo189307a()) == null) {
            str3 = "";
        } else {
            str3 = a;
        }
        PieceContext r4 = createTeamTitlePiece.mo177204r();
        if (r4 != null) {
            aVar4 = r4.mo177222a(CreateTeamAvatarExport.class);
        } else {
            aVar4 = null;
        }
        CreateTeamAvatarExport bVar2 = (CreateTeamAvatarExport) aVar4;
        if (bVar2 != null) {
            avatarMeta = bVar2.mo189308b();
        }
        PickEntities pickEntities = new PickEntities();
        pickEntities.setPickType(PickEntities.PickType.USER);
        pickEntities.setPickIds(CollectionsKt.listOf(C55356a.m214819a().mo144123b().mo144130a()));
        List<? extends PickEntities> listOf = CollectionsKt.listOf(pickEntities);
        mo188976a(true);
        UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(this);
        Log.m165383e("CreateTeamTitlePiece", "create team name:" + str + ", desc:" + str2 + ", avatarKey:" + str3 + ", avatarMeta:" + avatarMeta);
        TeamService bVar3 = TeamService.f136826a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar3.mo189073a(str, str2, str3, avatarMeta, listOf, wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/team/page/create_team/CreateTeamTitlePiece$onCreate$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.create_team.CreateTeamTitlePiece$b */
    static final class C55487b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamTitlePiece f137005a;

        C55487b(CreateTeamTitlePiece createTeamTitlePiece) {
            this.f137005a = createTeamTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f137005a.mo188982e();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: c */
    public boolean mo188980c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        TeamHitPoint.m215080b();
        return super.mo188980c(context);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        super.mo188974a(R.string.Project_MV_UnableToCreateTeamTittle, errorResult);
        TeamHitPoint.m215076a(false);
    }

    /* renamed from: a */
    public void onSuccess(CreateTeamResponse createTeamResponse) {
        Intrinsics.checkParameterIsNotNull(createTeamResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Log.m165383e("CreateTeamTitlePiece", "onSuccess");
        mo188976a(false);
        mo177192a(new C55489d(this, createTeamResponse));
        TeamHitPoint.m215076a(true);
    }

    @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece
    /* renamed from: a */
    public void mo188975a(String str, UIGetDataCallback<Boolean> uIGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(uIGetDataCallback, "callback");
        TeamService.f136826a.mo189071a(str, (Long) null, TeamNameCheckType.TEAM, uIGetDataCallback);
    }
}

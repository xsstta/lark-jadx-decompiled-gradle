package com.ss.android.lark.team.page.authority;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006 "}, d2 = {"Lcom/ss/android/lark/team/page/authority/TransferOwnerPiece;", "Lcom/ss/android/lark/team/common/piece/SettingJumpPiece;", "()V", "commonLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "teamUpdateObserver", "com/ss/android/lark/team/page/authority/TransferOwnerPiece$teamUpdateObserver$1", "Lcom/ss/android/lark/team/page/authority/TransferOwnerPiece$teamUpdateObserver$1;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "", "onDestroy", "showErrorDialog", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "transferTeam", "teamId", "", "newOwnerId", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TransferOwnerPiece extends SettingJumpPiece {

    /* renamed from: h */
    public static final Companion f136943h = new Companion(null);

    /* renamed from: g */
    public CommonLoadingDialog f136944g = new CommonLoadingDialog();

    /* renamed from: i */
    private final C55470d f136945i = new C55470d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/authority/TransferOwnerPiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team", this.f136945i);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        this.f136944g.dismiss();
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/authority/TransferOwnerPiece$transferTeam$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$e */
    public static final class C55471e implements IGetDataCallback<PatchTeamResponse> {

        /* renamed from: a */
        final /* synthetic */ TransferOwnerPiece f136949a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$e$a */
        public static final class C55472a extends Lambda implements Function0<Unit> {
            final /* synthetic */ ErrorResult $err;
            final /* synthetic */ C55471e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55472a(C55471e eVar, ErrorResult errorResult) {
                super(0);
                this.this$0 = eVar;
                this.$err = errorResult;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f136949a.f136944g.dismiss();
                this.this$0.f136949a.mo189275a(this.$err);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$e$b */
        public static final class C55473b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C55471e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55473b(C55471e eVar) {
                super(0);
                this.this$0 = eVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f136949a.f136944g.dismiss();
                UDToast.show(this.this$0.f136949a.mo177180C(), (int) R.string.Lark_Legacy_ChangeOwnerSuccess);
                this.this$0.f136949a.mo177212z();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55471e(TransferOwnerPiece transferOwnerPiece) {
            this.f136949a = transferOwnerPiece;
        }

        /* renamed from: a */
        public void onSuccess(PatchTeamResponse patchTeamResponse) {
            this.f136949a.mo177197b(new C55473b(this));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("TransferOwnerPiece", "transferTeam err", errorResult);
            this.f136949a.mo177197b(new C55472a(this, errorResult));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/authority/TransferOwnerPiece$teamUpdateObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$d */
    public static final class C55470d extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ TransferOwnerPiece f136948a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55470d(TransferOwnerPiece transferOwnerPiece) {
            super(false, 1, null);
            this.f136948a = transferOwnerPiece;
        }

        /* renamed from: a */
        public void mo127664a(Team team) {
            boolean z;
            if (team != null) {
                int i = 0;
                if (team.getOwnerId() <= 0 || !Intrinsics.areEqual(String.valueOf(team.getOwnerId()), C55356a.m214819a().mo144123b().mo144130a())) {
                    z = false;
                } else {
                    z = true;
                }
                TransferOwnerPiece transferOwnerPiece = this.f136948a;
                if (!z) {
                    i = 8;
                }
                transferOwnerPiece.mo177194b(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$b */
    static final class View$OnClickListenerC55468b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TransferOwnerPiece f136946a;

        View$OnClickListenerC55468b(TransferOwnerPiece transferOwnerPiece) {
            this.f136946a = transferOwnerPiece;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
            if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.ss.android.lark.team.page.authority.TransferOwnerPiece r0 = r4.f136946a
                com.ss.android.lark.piece.a.c r0 = r0.mo177203q()
                java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
                java.lang.String r1 = "intent_team"
                java.lang.Object r0 = r0.get(r1)
                r2 = 0
                if (r0 == 0) goto L_0x001d
                java.lang.String r3 = "dataMap[key] ?: return null"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                boolean r3 = r0 instanceof com.ss.android.lark.team.entity.Team
                if (r3 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r0 = r2
            L_0x001e:
                com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
                if (r0 == 0) goto L_0x0049
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r3)
                android.content.Context r5 = r5.getContext()
                java.lang.Class<com.ss.android.lark.team.page.member.TeamMemberActivity> r3 = com.ss.android.lark.team.page.member.TeamMemberActivity.class
                r2.<init>(r5, r3)
                java.io.Serializable r0 = (java.io.Serializable) r0
                r2.putExtra(r1, r0)
                com.ss.android.lark.team.entity.MemberActionType r5 = com.ss.android.lark.team.entity.MemberActionType.CHANGE_OWNER
                java.io.Serializable r5 = (java.io.Serializable) r5
                java.lang.String r0 = "intent_team_members_action"
                r2.putExtra(r0, r5)
                com.ss.android.lark.team.page.authority.TransferOwnerPiece r5 = r4.f136946a
                r0 = 5
                r5.mo177187a(r2, r0)
                com.ss.android.lark.team.stastics.TeamHitPoint.m215089g()
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.authority.TransferOwnerPiece.View$OnClickListenerC55468b.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    public final void mo189275a(ErrorResult errorResult) {
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C57582a.m223604a(mo177180C(), (int) R.string.Lark_Legacy_NetworkErrorRetry);
        }
        UDDialogBuilder eVar = new UDDialogBuilder(mo177180C());
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC55469c.f136947a)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.authority.TransferOwnerPiece$c */
    public static final class DialogInterface$OnClickListenerC55469c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55469c f136947a = new DialogInterface$OnClickListenerC55469c();

        DialogInterface$OnClickListenerC55469c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    private final void m215203a(long j, long j2) {
        this.f136944g.show(mo177180C());
        UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(new C55471e(this));
        TeamService bVar = TeamService.f136826a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189060a(j, j2, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece, com.ss.android.lark.team.common.piece.SettingJumpPiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        mo189003a(DividerType.FULL_WIDTH);
        mo189005b(DividerType.FULL_WIDTH);
        mo189002a(new View$OnClickListenerC55468b(this));
        return super.mo127619a(context, marginLayoutParams);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Serializable serializable;
        String id;
        Long longOrNull;
        if (i != 5) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        Team team = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("key_new_team_owner");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof Chatter)) {
            serializable = null;
        }
        Chatter chatter = (Chatter) serializable;
        if (chatter == null || (id = chatter.getId()) == null || (longOrNull = StringsKt.toLongOrNull(id)) == null) {
            return true;
        }
        long longValue = longOrNull.longValue();
        Object obj = mo177203q().mo177165a().get("intent_team");
        if (obj != null) {
            Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
            if (obj instanceof Team) {
                team = obj;
            }
        }
        Team team2 = team;
        if (team2 == null) {
            return true;
        }
        m215203a(team2.getId(), longValue);
        return true;
    }
}

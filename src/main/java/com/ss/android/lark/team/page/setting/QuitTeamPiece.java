package com.ss.android.lark.team.page.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.common.piece.SettingDangerActionPiece;
import com.ss.android.lark.team.entity.DeleteTeamMemberResponse;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.page.member.TeamMemberActivity;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/team/page/setting/QuitTeamPiece;", "Lcom/ss/android/lark/team/common/piece/SettingDangerActionPiece;", "()V", "commonLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "isRequesting", "", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "isTeamOwner", "team", "Lcom/ss/android/lark/team/entity/Team;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onDestroy", "", "quitTeam", "teamId", "", "showErrorDialog", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "showQuiteTeamDialog", "transferTeam", "newOwnerId", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class QuitTeamPiece extends SettingDangerActionPiece {

    /* renamed from: h */
    public static final Companion f137174h = new Companion(null);

    /* renamed from: b */
    public boolean f137175b;

    /* renamed from: g */
    public CommonLoadingDialog f137176g = new CommonLoadingDialog();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/setting/QuitTeamPiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        String id;
        Long longOrNull;
        if (i != 5) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        Team team = null;
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key_new_team_owner") : null;
        if (!(serializableExtra instanceof Chatter)) {
            serializableExtra = null;
        }
        Chatter chatter = (Chatter) serializableExtra;
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
        m215492a(team2.getId(), longValue);
        return true;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        this.f137176g.dismiss();
        super.onDestroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189533a() {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.QuitTeamPiece.mo189533a():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/QuitTeamPiece$quitTeam$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/DeleteTeamMemberResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$c */
    public static final class C55603c implements IGetDataCallback<DeleteTeamMemberResponse> {

        /* renamed from: a */
        final /* synthetic */ QuitTeamPiece f137178a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55603c(QuitTeamPiece quitTeamPiece) {
            this.f137178a = quitTeamPiece;
        }

        /* renamed from: a */
        public void onSuccess(DeleteTeamMemberResponse deleteTeamMemberResponse) {
            Log.m165389i("QuitTeamPiece", "quitTeam success");
            this.f137178a.f137176g.dismiss();
            this.f137178a.f137175b = false;
            this.f137178a.mo177212z();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("QuitTeamPiece", "quitTeam err", errorResult);
            this.f137178a.f137176g.dismiss();
            this.f137178a.f137175b = false;
            this.f137178a.mo189535a(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/QuitTeamPiece$transferTeam$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$k */
    public static final class C55611k implements IGetDataCallback<PatchTeamResponse> {

        /* renamed from: a */
        final /* synthetic */ QuitTeamPiece f137189a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55611k(QuitTeamPiece quitTeamPiece) {
            this.f137189a = quitTeamPiece;
        }

        /* renamed from: a */
        public void onSuccess(PatchTeamResponse patchTeamResponse) {
            Team team;
            this.f137189a.f137175b = false;
            if (patchTeamResponse != null && (team = patchTeamResponse.getTeam()) != null) {
                this.f137189a.mo177203q().mo177168a("intent_team", team);
                QuitTeamPiece quitTeamPiece = this.f137189a;
                Intrinsics.checkExpressionValueIsNotNull(team, "it");
                quitTeamPiece.mo189534a(team.getId());
                Unit unit = Unit.INSTANCE;
                this.f137189a.f137176g.dismiss();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("QuitTeamPiece", "transferTeam err", errorResult);
            this.f137189a.f137176g.dismiss();
            this.f137189a.f137175b = false;
            this.f137189a.mo189535a(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$b */
    static final class View$OnClickListenerC55602b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuitTeamPiece f137177a;

        View$OnClickListenerC55602b(QuitTeamPiece quitTeamPiece) {
            this.f137177a = quitTeamPiece;
        }

        public final void onClick(View view) {
            TeamHitPoint.m215081b("exit_team", "im_team_exit_view");
            this.f137177a.mo189533a();
        }
    }

    /* renamed from: a */
    private final boolean m215493a(Team team) {
        if (team.getOwnerId() <= 0 || !Intrinsics.areEqual(String.valueOf(team.getOwnerId()), C55356a.m214819a().mo144123b().mo144130a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo189534a(long j) {
        if (this.f137175b) {
            Log.m165389i("QuitTeamPiece", "quitTeam requesting");
            return;
        }
        this.f137175b = true;
        UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(new C55603c(this));
        String a = C55356a.m214819a().mo144123b().mo144130a();
        Log.m165389i("QuitTeamPiece", "quitTeam");
        TeamService bVar = TeamService.f136826a;
        List<String> listOf = CollectionsKt.listOf(a);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189069a(j, listOf, wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    public final void mo189535a(ErrorResult errorResult) {
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C57582a.m223604a(mo177180C(), (int) R.string.Lark_Legacy_NetworkErrorRetry);
        }
        UDDialogBuilder eVar = new UDDialogBuilder(mo177180C());
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC55604d.f137179a)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$d */
    public static final class DialogInterface$OnClickListenerC55604d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55604d f137179a = new DialogInterface$OnClickListenerC55604d();

        DialogInterface$OnClickListenerC55604d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$f */
    public static final class DialogInterface$OnClickListenerC55606f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55606f f137182a = new DialogInterface$OnClickListenerC55606f();

        DialogInterface$OnClickListenerC55606f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            TeamHitPoint.m215075a("cancel", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$h */
    public static final class DialogInterface$OnClickListenerC55608h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55608h f137185a = new DialogInterface$OnClickListenerC55608h();

        DialogInterface$OnClickListenerC55608h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            TeamHitPoint.m215075a("cancel", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$j */
    public static final class DialogInterface$OnClickListenerC55610j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55610j f137188a = new DialogInterface$OnClickListenerC55610j();

        DialogInterface$OnClickListenerC55610j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            TeamHitPoint.m215075a("cancel", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$e */
    public static final class DialogInterface$OnClickListenerC55605e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuitTeamPiece f137180a;

        /* renamed from: b */
        final /* synthetic */ Team f137181b;

        DialogInterface$OnClickListenerC55605e(QuitTeamPiece quitTeamPiece, Team team) {
            this.f137180a = quitTeamPiece;
            this.f137181b = team;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f137180a.mo189534a(this.f137181b.getId());
            dialogInterface.dismiss();
            TeamHitPoint.m215075a("delete_and_exit", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$i */
    public static final class DialogInterface$OnClickListenerC55609i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuitTeamPiece f137186a;

        /* renamed from: b */
        final /* synthetic */ Team f137187b;

        DialogInterface$OnClickListenerC55609i(QuitTeamPiece quitTeamPiece, Team team) {
            this.f137186a = quitTeamPiece;
            this.f137187b = team;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f137186a.mo189534a(this.f137187b.getId());
            dialogInterface.dismiss();
            TeamHitPoint.m215075a("exit", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.QuitTeamPiece$g */
    public static final class DialogInterface$OnClickListenerC55607g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuitTeamPiece f137183a;

        /* renamed from: b */
        final /* synthetic */ Team f137184b;

        DialogInterface$OnClickListenerC55607g(QuitTeamPiece quitTeamPiece, Team team) {
            this.f137183a = quitTeamPiece;
            this.f137184b = team;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f137183a.mo177180C(), TeamMemberActivity.class);
            intent.putExtra("intent_team", this.f137184b);
            intent.putExtra("intent_team_members_action", MemberActionType.CHANGE_OWNER);
            intent.putExtra("intent_will_quit_team", true);
            this.f137183a.mo177187a(intent, 5);
            dialogInterface.dismiss();
            TeamHitPoint.m215074a("transfer_team_owner_and_exit", "feed_transfer_team_owner_view");
        }
    }

    /* renamed from: a */
    private final void m215492a(long j, long j2) {
        if (this.f137175b) {
            Log.m165389i("QuitTeamPiece", "transferTeam requesting");
            return;
        }
        this.f137175b = true;
        this.f137176g.show(mo177180C());
        UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(new C55611k(this));
        TeamService bVar = TeamService.f136826a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189060a(j, j2, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.team.common.piece.SettingDangerActionPiece, com.ss.android.lark.piece.core.Piece, com.ss.android.lark.team.common.piece.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        mo189007a(C51468a.m199493c(R.string.Project_T_LeaveTeamButton, context));
        mo177196b(context, 0, 8, 0, 0);
        mo189003a(DividerType.FULL_WIDTH);
        mo189005b(DividerType.FULL_WIDTH);
        mo189002a(new View$OnClickListenerC55602b(this));
        return super.mo127619a(context, marginLayoutParams);
    }
}

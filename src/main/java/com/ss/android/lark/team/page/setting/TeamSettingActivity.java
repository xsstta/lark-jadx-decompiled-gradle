package com.ss.android.lark.team.page.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.common.piece.SettingBasePiece;
import com.ss.android.lark.team.common.piece.SettingDangerActionPiece;
import com.ss.android.lark.team.common.piece.SettingDividerPiece;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.common.piece.TitleBarPiece;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import com.ss.android.lark.team.p2737f.C55443e;
import com.ss.android.lark.team.page.TeamInfoActivity;
import com.ss.android.lark.team.service.TeamPushService;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\u001c\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "authorityManageClickListener", "Landroid/view/View$OnClickListener;", "disbandTeamClickListener", "initTeam", "Lcom/ss/android/lark/team/entity/Team;", "isRequesting", "", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "pushTeamsChangeListener", "Lcom/ss/android/lark/team/listener/IPushTeamsChangeListener;", "teamId", "", "teamMemberChanged", "teamNameClickListener", "disbandTeam", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "runWithTeam", "block", "Lkotlin/Function1;", "showDisbandTeamDialog", "showErrorDialog", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamSettingActivity extends BaseFragmentActivity {

    /* renamed from: f */
    public static final Companion f137232f = new Companion(null);

    /* renamed from: a */
    public LinearPieceGroup f137233a;

    /* renamed from: b */
    public Team f137234b;

    /* renamed from: c */
    public boolean f137235c;

    /* renamed from: d */
    public long f137236d;

    /* renamed from: e */
    public boolean f137237e;

    /* renamed from: g */
    private PieceManager f137238g;

    /* renamed from: h */
    private final View.OnClickListener f137239h = new View$OnClickListenerC55633h(this);

    /* renamed from: i */
    private final View.OnClickListener f137240i = new View$OnClickListenerC55624b(this);

    /* renamed from: j */
    private final View.OnClickListener f137241j = new View$OnClickListenerC55627d(this);

    /* renamed from: k */
    private final AbstractC55360c f137242k = new C55628e(this);

    /* renamed from: a */
    public Context mo189577a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo189580a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215539a(this, context);
    }

    /* renamed from: b */
    public Resources mo189583b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo189584c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215537a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo189586d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m215542d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215540b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215541c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamSettingActivity$Companion;", "", "()V", "LOG_TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((r1 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0030;
     */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r4 = this;
            com.ss.android.lark.team.d.a r0 = com.ss.android.lark.team.service.TeamPushService.f136810a
            com.ss.android.lark.team.b.c r1 = r4.f137242k
            r0.mo188936b(r1)
            com.ss.android.lark.team.entity.Team r0 = r4.f137234b
            if (r0 == 0) goto L_0x0039
            com.ss.android.lark.piece.layout.LinearPieceGroup r1 = r4.f137233a
            if (r1 != 0) goto L_0x0014
            java.lang.String r2 = "pieceGroup"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0014:
            com.ss.android.lark.piece.a.c r1 = r1.mo177203q()
            java.util.concurrent.ConcurrentHashMap r1 = r1.mo177165a()
            java.lang.String r2 = "intent_team"
            java.lang.Object r1 = r1.get(r2)
            r2 = 0
            if (r1 == 0) goto L_0x002f
            java.lang.String r3 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            boolean r3 = r1 instanceof com.ss.android.lark.team.entity.Team
            if (r3 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            com.ss.android.lark.team.entity.Team r1 = (com.ss.android.lark.team.entity.Team) r1
            if (r1 == 0) goto L_0x0039
            boolean r2 = r4.f137235c
            com.ss.android.lark.team.stastics.TeamHitPoint.m215077a(r2, r0, r1)
        L_0x0039:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingActivity.onDestroy():void");
    }

    /* renamed from: a */
    public final void mo189578a() {
        mo189582a(new C55629f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/TeamSettingActivity$disbandTeam$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$c */
    public static final class C55626c implements IGetDataCallback<PatchTeamResponse> {

        /* renamed from: a */
        final /* synthetic */ TeamSettingActivity f137244a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55626c(TeamSettingActivity teamSettingActivity) {
            this.f137244a = teamSettingActivity;
        }

        /* renamed from: a */
        public void onSuccess(PatchTeamResponse patchTeamResponse) {
            Log.m165389i("TeamSettingActivity", "disbandTeam success");
            this.f137244a.f137237e = false;
            this.f137244a.finish();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("TeamSettingActivity", "disbandTeam err", errorResult);
            this.f137244a.f137237e = false;
            this.f137244a.mo189581a(errorResult);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/team/entity/Team;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$f */
    public static final class C55629f extends Lambda implements Function1<Team, Unit> {
        final /* synthetic */ TeamSettingActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55629f(TeamSettingActivity teamSettingActivity) {
            super(1);
            this.this$0 = teamSettingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Team team) {
            invoke(team);
            return Unit.INSTANCE;
        }

        public final void invoke(final Team team) {
            Intrinsics.checkParameterIsNotNull(team, "it");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.this$0).title(R.string.Project_T_QuestionDisbandThisTeam)).message(R.string.Project_T_OnceTeamIsDisbanded)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_T_DisbandTeamButton, new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.lark.team.page.setting.TeamSettingActivity.C55629f.DialogInterface$OnClickListenerC556301 */

                /* renamed from: a */
                final /* synthetic */ C55629f f137247a;

                {
                    this.f137247a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f137247a.this$0.mo189579a(team.getId());
                    dialogInterface.dismiss();
                    TeamHitPoint.m215085c(true);
                }
            })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC556312.f137249a)).show();
            TeamHitPoint.m215086d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$b */
    public static final class View$OnClickListenerC55624b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamSettingActivity f137243a;

        View$OnClickListenerC55624b(TeamSettingActivity teamSettingActivity) {
            this.f137243a = teamSettingActivity;
        }

        public final void onClick(View view) {
            this.f137243a.mo189582a(new Function1<Team, Unit>(this) {
                /* class com.ss.android.lark.team.page.setting.TeamSettingActivity.View$OnClickListenerC55624b.C556251 */
                final /* synthetic */ View$OnClickListenerC55624b this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Team team) {
                    invoke(team);
                    return Unit.INSTANCE;
                }

                public final void invoke(Team team) {
                    Intrinsics.checkParameterIsNotNull(team, "it");
                    if (C55443e.m215116a(team)) {
                        Intent intent = new Intent(this.this$0.f137243a, TeamAuthorityManageActivity.class);
                        intent.putExtra("intent_team", team);
                        this.this$0.f137243a.startActivity(intent);
                        TeamHitPoint.m215081b("authority_management", "im_team_authority_management_view");
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$d */
    static final class View$OnClickListenerC55627d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamSettingActivity f137245a;

        View$OnClickListenerC55627d(TeamSettingActivity teamSettingActivity) {
            this.f137245a = teamSettingActivity;
        }

        public final void onClick(View view) {
            TeamHitPoint.m215081b("delete", "im_team_delete_view");
            this.f137245a.mo189578a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$h */
    public static final class View$OnClickListenerC55633h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamSettingActivity f137251a;

        View$OnClickListenerC55633h(TeamSettingActivity teamSettingActivity) {
            this.f137251a = teamSettingActivity;
        }

        public final void onClick(View view) {
            this.f137251a.mo189582a(new Function1<Team, Unit>(this) {
                /* class com.ss.android.lark.team.page.setting.TeamSettingActivity.View$OnClickListenerC55633h.C556341 */
                final /* synthetic */ View$OnClickListenerC55633h this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Team team) {
                    invoke(team);
                    return Unit.INSTANCE;
                }

                public final void invoke(Team team) {
                    Intrinsics.checkParameterIsNotNull(team, "it");
                    Intent intent = new Intent(this.this$0.f137251a, TeamInfoActivity.class);
                    intent.putExtra("intent_team", team);
                    this.this$0.f137251a.startActivityForResult(intent, 6);
                    TeamHitPoint.m215081b("edit", "im_team_info_edit_view");
                }
            });
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearPieceGroup m215538a(TeamSettingActivity teamSettingActivity) {
        LinearPieceGroup linearPieceGroup = teamSettingActivity.f137233a;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        return linearPieceGroup;
    }

    /* renamed from: b */
    public static Resources m215540b(TeamSettingActivity teamSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamSettingActivity);
        }
        return teamSettingActivity.mo189583b();
    }

    /* renamed from: d */
    public static AssetManager m215542d(TeamSettingActivity teamSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamSettingActivity);
        }
        return teamSettingActivity.mo189586d();
    }

    /* renamed from: c */
    public static void m215541c(TeamSettingActivity teamSettingActivity) {
        teamSettingActivity.mo189584c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamSettingActivity teamSettingActivity2 = teamSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo189579a(long j) {
        if (this.f137237e) {
            Log.m165389i("TeamSettingActivity", "disbandTeam requesting");
            return;
        }
        this.f137237e = true;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C55626c(this));
        Log.m165389i("TeamSettingActivity", "disbandTeam");
        TeamService bVar = TeamService.f136826a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189061a(j, wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012D\u0010\u0002\u001a@\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/team/entity/Team;", "", "onTeamsChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$e */
    static final class C55628e implements AbstractC55360c {

        /* renamed from: a */
        final /* synthetic */ TeamSettingActivity f137246a;

        C55628e(TeamSettingActivity teamSettingActivity) {
            this.f137246a = teamSettingActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
            if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0037;
         */
        @Override // com.ss.android.lark.team.p2732b.AbstractC55360c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo138689a(java.util.Map<java.lang.Long, com.ss.android.lark.team.entity.Team> r9) {
            /*
            // Method dump skipped, instructions count: 310
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingActivity.C55628e.mo138689a(java.util.Map):void");
        }
    }

    /* renamed from: a */
    public final void mo189581a(ErrorResult errorResult) {
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C57582a.m223604a((Context) this, (int) R.string.Lark_Legacy_NetworkErrorRetry);
        }
        UDDialogBuilder eVar = new UDDialogBuilder(this);
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC55632g.f137250a)).show();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("intent_team");
        if (!(serializableExtra instanceof Team)) {
            serializableExtra = null;
        }
        Team team = (Team) serializableExtra;
        if (team != null) {
            this.f137234b = team;
            this.f137236d = team.getId();
            TeamSettingActivity teamSettingActivity = this;
            LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new LinearPieceGroup(1).mo177184a(-1, -1)).mo177200e(C57582a.m223616d(teamSettingActivity, R.color.bg_base)), new TitleBarPiece(R.string.Project_T_TitleSettings, TitleBarPiece.LeftIconType.BACK), false, 2, null), ((TeamInfoPiece) ((TeamInfoPiece) new TeamInfoPiece().mo177198c(R.id.piece_team_name)).mo177195b(teamSettingActivity, BitmapDescriptorFactory.HUE_RED, 8.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)).mo189570a(C55443e.m215116a(team)).mo189569a(DividerType.FULL_WIDTH).mo189572b(DividerType.MARGIN_START).mo189568a(this.f137239h), false, 2, null), new TeamSettingMemberPiece(), false, 2, null), new SettingDividerPiece(), false, 2, null);
            SettingJumpPiece a = ((SettingJumpPiece) ((SettingJumpPiece) ((SettingJumpPiece) ((SettingJumpPiece) new SettingJumpPiece().mo177198c(R.id.piece_team_setting_permission)).mo177195b(teamSettingActivity, BitmapDescriptorFactory.HUE_RED, 8.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)).mo189003a(DividerType.FULL_WIDTH)).mo189005b(DividerType.FULL_WIDTH)).mo189009a(C51468a.m199493c(R.string.Project_T_PermissionSettings, teamSettingActivity));
            if (C55443e.m215116a(team)) {
                i = 0;
            } else {
                i = 8;
            }
            LinearPieceGroup linearPieceGroup2 = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a(linearPieceGroup, ((SettingJumpPiece) a.mo177194b(i)).mo189002a(this.f137240i), false, 2, null), (Piece) ((SettingDangerActionPiece) ((SettingDangerActionPiece) new QuitTeamPiece().mo177195b(teamSettingActivity, BitmapDescriptorFactory.HUE_RED, 8.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)).mo189003a(DividerType.FULL_WIDTH)).mo189005b(DividerType.FULL_WIDTH), false, 2, null);
            SettingBasePiece a2 = ((SettingDangerActionPiece) ((SettingDangerActionPiece) new SettingDangerActionPiece().mo177198c(R.id.piece_team_setting_disband)).mo189007a(C51468a.m199493c(R.string.Project_T_DisbandTeamButton, teamSettingActivity)).mo189005b(DividerType.FULL_WIDTH)).mo189002a(this.f137241j);
            if (C55443e.m215116a(team)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            LinearPieceGroup linearPieceGroup3 = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a(linearPieceGroup2, (Piece) a2.mo177194b(i2), false, 2, null), (Piece) ((ReportTeamPiece) new ReportTeamPiece().mo177195b(teamSettingActivity, BitmapDescriptorFactory.HUE_RED, 20.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)).mo177194b(8), false, 2, null);
            setContentView(linearPieceGroup3.mo177214a(teamSettingActivity));
            this.f137233a = linearPieceGroup3;
            if (linearPieceGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
            }
            PieceManager.Builder a3 = new PieceManager.Builder(linearPieceGroup3, teamSettingActivity).mo177234a(this);
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            this.f137238g = a3.mo177233a(intent.getExtras()).mo177238e();
            TeamPushService.f136810a.mo188933a(this.f137242k);
            TeamHitPoint.m215087e();
            return;
        }
        Log.m165397w("TeamSettingActivity", "team null");
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189582a(kotlin.jvm.functions.Function1<? super com.ss.android.lark.team.entity.Team, kotlin.Unit> r4) {
        /*
            r3 = this;
            com.ss.android.lark.piece.core.c r0 = r3.f137238g
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "pieceManager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            com.ss.android.lark.piece.a.c r0 = r0.mo177229a()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x002c
            r4.invoke(r0)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingActivity.mo189582a(kotlin.jvm.functions.Function1):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamSettingActivity$g */
    public static final class DialogInterface$OnClickListenerC55632g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55632g f137250a = new DialogInterface$OnClickListenerC55632g();

        DialogInterface$OnClickListenerC55632g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static void m215539a(TeamSettingActivity teamSettingActivity, Context context) {
        teamSettingActivity.mo189580a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m215537a(TeamSettingActivity teamSettingActivity, Configuration configuration) {
        Context a = teamSettingActivity.mo189577a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

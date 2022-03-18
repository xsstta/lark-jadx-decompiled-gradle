package com.ss.android.lark.team.page.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.CompoundButton;
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
import com.ss.android.lark.team.common.piece.MetadataPiece;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.common.piece.SettingSwitchPiece;
import com.ss.android.lark.team.common.piece.TitleBarPiece;
import com.ss.android.lark.team.entity.PatchTeamSettingResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.entity.TeamSetting;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import com.ss.android.lark.team.p2737f.C55443e;
import com.ss.android.lark.team.page.authority.BindChatPermissionPiece;
import com.ss.android.lark.team.page.authority.TransferOwnerPiece;
import com.ss.android.lark.team.service.TeamPushService;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamAuthorityManageActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "isUpdatingAddMemberPermission", "", "isUpdatingBindTeamChatPermission", "isUpdatingCreateChatPermission", "onAddMemberPermissionChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "onBindTeamChatPermissionChangeListener", "onCreateChatPermissionChangeListener", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "pushTeamsChangeListener", "Lcom/ss/android/lark/team/listener/IPushTeamsChangeListener;", "teamId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onUpdatePermissionFailed", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "resetSwitchStatus", "id", "", "isChecked", "listener", "updateAddMemberPermission", "updateBindChatPermissionPieceState", "isAddMemberChecked", "updateBindTeamChatPermission", "updateCreateChatPermission", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamAuthorityManageActivity extends BaseFragmentActivity {

    /* renamed from: i */
    public static final Companion f137193i = new Companion(null);

    /* renamed from: a */
    public LinearPieceGroup f137194a;

    /* renamed from: b */
    public PieceManager f137195b;

    /* renamed from: c */
    public long f137196c;

    /* renamed from: d */
    public boolean f137197d;

    /* renamed from: e */
    public boolean f137198e;

    /* renamed from: f */
    public boolean f137199f;

    /* renamed from: g */
    public final CompoundButton.OnCheckedChangeListener f137200g = new C55613b(this);

    /* renamed from: h */
    public final CompoundButton.OnCheckedChangeListener f137201h = new C55615d(this);

    /* renamed from: j */
    private final CompoundButton.OnCheckedChangeListener f137202j = new C55614c(this);

    /* renamed from: k */
    private final AbstractC55360c f137203k = new C55617f(this);

    /* renamed from: a */
    public Context mo189548a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189549a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189551a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215505a(this, context);
    }

    /* renamed from: b */
    public void mo189554b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189556c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215503a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215509e(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215507c(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215508d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamAuthorityManageActivity$Companion;", "", "()V", "LOG_TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        TeamPushService.f136810a.mo188936b(this.f137203k);
        TeamHitPoint.m215088f();
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/TeamAuthorityManageActivity$updateAddMemberPermission$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$g */
    public static final class C55618g implements IGetDataCallback<PatchTeamSettingResponse> {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137209a;

        /* renamed from: b */
        final /* synthetic */ boolean f137210b;

        /* renamed from: a */
        public void onSuccess(PatchTeamSettingResponse patchTeamSettingResponse) {
            this.f137209a.f137197d = false;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("TeamAuthorityManageActivity", "updateAddMemberPermission err", errorResult);
            this.f137209a.f137197d = false;
            this.f137209a.mo189552a(errorResult);
            TeamAuthorityManageActivity teamAuthorityManageActivity = this.f137209a;
            teamAuthorityManageActivity.mo189550a(R.id.piece_add_member_permission, !this.f137210b, teamAuthorityManageActivity.f137200g);
            this.f137209a.mo189559d(!this.f137210b);
        }

        C55618g(TeamAuthorityManageActivity teamAuthorityManageActivity, boolean z) {
            this.f137209a = teamAuthorityManageActivity;
            this.f137210b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/TeamAuthorityManageActivity$updateCreateChatPermission$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$i */
    public static final class C55620i implements IGetDataCallback<PatchTeamSettingResponse> {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137213a;

        /* renamed from: b */
        final /* synthetic */ boolean f137214b;

        /* renamed from: a */
        public void onSuccess(PatchTeamSettingResponse patchTeamSettingResponse) {
            this.f137213a.f137199f = false;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("TeamAuthorityManageActivity", "updateCreateChatPermission err", errorResult);
            this.f137213a.f137199f = false;
            this.f137213a.mo189552a(errorResult);
            TeamAuthorityManageActivity teamAuthorityManageActivity = this.f137213a;
            teamAuthorityManageActivity.mo189550a(R.id.piece_create_chat_permission, !this.f137214b, teamAuthorityManageActivity.f137201h);
        }

        C55620i(TeamAuthorityManageActivity teamAuthorityManageActivity, boolean z) {
            this.f137213a = teamAuthorityManageActivity;
            this.f137214b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/page/setting/TeamAuthorityManageActivity$updateBindTeamChatPermission$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamSettingResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$h */
    public static final class C55619h implements IGetDataCallback<PatchTeamSettingResponse> {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137211a;

        /* renamed from: b */
        final /* synthetic */ boolean f137212b;

        /* renamed from: a */
        public void onSuccess(PatchTeamSettingResponse patchTeamSettingResponse) {
            this.f137211a.f137198e = false;
            Log.m165383e("TeamAuthorityManageActivity", "updateBindTeamChatPermission success");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            BindChatPermissionPiece bindChatPermissionPiece;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            try {
                Log.m165383e("TeamAuthorityManageActivity", "updateBindTeamChatPermission err=" + errorResult.getDebugMsg());
                boolean z = false;
                this.f137211a.f137198e = false;
                this.f137211a.mo189552a(errorResult);
                Iterator<Piece<?>> it = TeamAuthorityManageActivity.m215504a(this.f137211a).mo177219d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bindChatPermissionPiece = null;
                        break;
                    }
                    Piece<?> next = it.next();
                    if (next.mo177207u() == -1 || next.mo177207u() != R.id.piece_bind_team_chat_permission || !Intrinsics.areEqual(next.getClass(), BindChatPermissionPiece.class)) {
                        if ((next instanceof PieceGroup) && (bindChatPermissionPiece = ((PieceGroup) next).mo177215a(R.id.piece_bind_team_chat_permission, BindChatPermissionPiece.class)) != null) {
                            break;
                        }
                    } else if (next != null) {
                        bindChatPermissionPiece = (BindChatPermissionPiece) next;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.team.page.authority.BindChatPermissionPiece");
                    }
                }
                BindChatPermissionPiece bindChatPermissionPiece2 = (BindChatPermissionPiece) bindChatPermissionPiece;
                if (bindChatPermissionPiece2 != null) {
                    if (!this.f137212b) {
                        z = true;
                    }
                    bindChatPermissionPiece2.mo189271b(z);
                }
            } catch (Throwable th) {
                Log.m165384e("TeamAuthorityManageActivity", "updateBindTeamChatPermission thr", th);
            }
        }

        C55619h(TeamAuthorityManageActivity teamAuthorityManageActivity, boolean z) {
            this.f137211a = teamAuthorityManageActivity;
            this.f137212b = z;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearPieceGroup m215504a(TeamAuthorityManageActivity teamAuthorityManageActivity) {
        LinearPieceGroup linearPieceGroup = teamAuthorityManageActivity.f137194a;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        return linearPieceGroup;
    }

    /* renamed from: b */
    public static final /* synthetic */ PieceManager m215506b(TeamAuthorityManageActivity teamAuthorityManageActivity) {
        PieceManager cVar = teamAuthorityManageActivity.f137195b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceManager");
        }
        return cVar;
    }

    /* renamed from: c */
    public static Resources m215507c(TeamAuthorityManageActivity teamAuthorityManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamAuthorityManageActivity);
        }
        return teamAuthorityManageActivity.mo189549a();
    }

    /* renamed from: e */
    public static AssetManager m215509e(TeamAuthorityManageActivity teamAuthorityManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamAuthorityManageActivity);
        }
        return teamAuthorityManageActivity.mo189556c();
    }

    /* renamed from: d */
    public static void m215508d(TeamAuthorityManageActivity teamAuthorityManageActivity) {
        teamAuthorityManageActivity.mo189554b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamAuthorityManageActivity teamAuthorityManageActivity2 = teamAuthorityManageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamAuthorityManageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo189555b(boolean z) {
        TeamSetting.BindTeamChatPermission bindTeamChatPermission;
        if (this.f137198e) {
            Log.m165389i("TeamAuthorityManageActivity", "updateBindTeamChatPermission updating");
            return;
        }
        this.f137198e = true;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C55619h(this, z));
        if (z) {
            bindTeamChatPermission = TeamSetting.BindTeamChatPermission.ALL_MEMBERS;
        } else {
            bindTeamChatPermission = TeamSetting.BindTeamChatPermission.ONLY_OWNER;
        }
        Log.m165389i("TeamAuthorityManageActivity", "updateBindTeamChatPermission:" + bindTeamChatPermission);
        TeamService bVar = TeamService.f136826a;
        long j = this.f137196c;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189063a(j, bindTeamChatPermission, wrapAndAddGetDataCallback);
    }

    /* renamed from: c */
    public final void mo189557c(boolean z) {
        TeamSetting.CreateTeamChatPermission createTeamChatPermission;
        if (this.f137199f) {
            Log.m165389i("TeamAuthorityManageActivity", "updateCreateChatPermission updating");
            return;
        }
        this.f137199f = true;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C55620i(this, z));
        if (z) {
            createTeamChatPermission = TeamSetting.CreateTeamChatPermission.ALL_MEMBERS;
        } else {
            createTeamChatPermission = TeamSetting.CreateTeamChatPermission.ONLY_OWNER;
        }
        Log.m165389i("TeamAuthorityManageActivity", "updateCreateChatPermission: " + createTeamChatPermission);
        TeamService bVar = TeamService.f136826a;
        long j = this.f137196c;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189064a(j, createTeamChatPermission, wrapAndAddGetDataCallback);
    }

    /* renamed from: d */
    public final void mo189559d(boolean z) {
        BindChatPermissionPiece bindChatPermissionPiece;
        LinearPieceGroup linearPieceGroup = this.f137194a;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        Iterator<Piece<?>> it = linearPieceGroup.mo177219d().iterator();
        while (true) {
            if (!it.hasNext()) {
                bindChatPermissionPiece = null;
                break;
            }
            Piece<?> next = it.next();
            if (next.mo177207u() == -1 || next.mo177207u() != R.id.piece_bind_team_chat_permission || !Intrinsics.areEqual(next.getClass(), BindChatPermissionPiece.class)) {
                if ((next instanceof PieceGroup) && (bindChatPermissionPiece = ((PieceGroup) next).mo177215a(R.id.piece_bind_team_chat_permission, BindChatPermissionPiece.class)) != null) {
                    break;
                }
            } else if (next != null) {
                bindChatPermissionPiece = (BindChatPermissionPiece) next;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.team.page.authority.BindChatPermissionPiece");
            }
        }
        BindChatPermissionPiece bindChatPermissionPiece2 = (BindChatPermissionPiece) bindChatPermissionPiece;
        if (bindChatPermissionPiece2 != null) {
            bindChatPermissionPiece2.mo189269a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012D\u0010\u0002\u001a@\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/team/entity/Team;", "", "onTeamsChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$f */
    static final class C55617f implements AbstractC55360c {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137208a;

        C55617f(TeamAuthorityManageActivity teamAuthorityManageActivity) {
            this.f137208a = teamAuthorityManageActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
            if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x0037;
         */
        @Override // com.ss.android.lark.team.p2732b.AbstractC55360c
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo138689a(java.util.Map<java.lang.Long, com.ss.android.lark.team.entity.Team> r12) {
            /*
            // Method dump skipped, instructions count: 321
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity.C55617f.mo138689a(java.util.Map):void");
        }
    }

    /* renamed from: a */
    public final void mo189552a(ErrorResult errorResult) {
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C57582a.m223604a((Context) this, (int) R.string.Lark_Legacy_NetworkErrorRetry);
        }
        UDDialogBuilder eVar = new UDDialogBuilder(this);
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC55616e.f137207a)).show();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        TeamSetting.AddMemberPermission addMemberPermission;
        boolean z;
        TeamSetting.CreateTeamChatPermission createTeamChatPermission;
        int i;
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("intent_team");
        if (!(serializableExtra instanceof Team)) {
            serializableExtra = null;
        }
        Team team = (Team) serializableExtra;
        if (team != null) {
            this.f137196c = team.getId();
            boolean z2 = true;
            TeamAuthorityManageActivity teamAuthorityManageActivity = this;
            LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new LinearPieceGroup(1).mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) teamAuthorityManageActivity)), new TitleBarPiece(R.string.Project_T_PermissionSettings, TitleBarPiece.LeftIconType.BACK), false, 2, null), (Piece) new MetadataPiece(R.string.Project_T_MemberPermissionSet).mo177196b((Context) teamAuthorityManageActivity, 16, 14, 0, 3), false, 2, null);
            SettingSwitchPiece a = ((SettingSwitchPiece) ((SettingSwitchPiece) new SettingSwitchPiece().mo177198c(R.id.piece_add_member_permission)).mo189003a(DividerType.FULL_WIDTH)).mo189013a(C51468a.m199493c(R.string.Project_MV_TeamMembersAddMembers, teamAuthorityManageActivity));
            TeamSetting teamSetting = team.getTeamSetting();
            if (teamSetting != null) {
                addMemberPermission = teamSetting.getAddMemberPermission();
            } else {
                addMemberPermission = null;
            }
            if (addMemberPermission == TeamSetting.AddMemberPermission.ALL_MEMBERS) {
                z = true;
            } else {
                z = false;
            }
            LinearPieceGroup linearPieceGroup2 = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a(linearPieceGroup, a.mo189014a(z).mo189012a(this.f137200g), false, 2, null), ((BindChatPermissionPiece) new BindChatPermissionPiece().mo177198c(R.id.piece_bind_team_chat_permission)).mo189268a(this.f137202j), false, 2, null);
            SettingSwitchPiece a2 = ((SettingSwitchPiece) ((SettingSwitchPiece) ((SettingSwitchPiece) new SettingSwitchPiece().mo177198c(R.id.piece_create_chat_permission)).mo189003a(DividerType.HIDDEN)).mo189005b(DividerType.FULL_WIDTH)).mo189013a(C51468a.m199493c(R.string.Project_MV_MembersCreateNewGroups, teamAuthorityManageActivity));
            TeamSetting teamSetting2 = team.getTeamSetting();
            if (teamSetting2 != null) {
                createTeamChatPermission = teamSetting2.getCreateTeamChatPermission();
            } else {
                createTeamChatPermission = null;
            }
            if (createTeamChatPermission != TeamSetting.CreateTeamChatPermission.ALL_MEMBERS) {
                z2 = false;
            }
            LinearPieceGroup linearPieceGroup3 = (LinearPieceGroup) PieceGroup.m199535a(linearPieceGroup2, a2.mo189014a(z2).mo189012a(this.f137201h), false, 2, null);
            SettingJumpPiece settingJumpPiece = (SettingJumpPiece) new TransferOwnerPiece().mo189009a(C51468a.m199493c(R.string.Project_MV_TransferTeamOwner, teamAuthorityManageActivity)).mo177195b(teamAuthorityManageActivity, BitmapDescriptorFactory.HUE_RED, 8.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            if (C55443e.m215116a(team)) {
                i = 0;
            } else {
                i = 8;
            }
            LinearPieceGroup linearPieceGroup4 = (LinearPieceGroup) PieceGroup.m199535a(linearPieceGroup3, (Piece) settingJumpPiece.mo177194b(i), false, 2, null);
            setContentView(linearPieceGroup4.mo177214a(teamAuthorityManageActivity));
            this.f137194a = linearPieceGroup4;
            if (linearPieceGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
            }
            PieceManager.Builder a3 = new PieceManager.Builder(linearPieceGroup4, teamAuthorityManageActivity).mo177234a(this);
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            this.f137195b = a3.mo177233a(intent.getExtras()).mo177238e();
            TeamPushService.f136810a.mo188933a(this.f137203k);
            TeamHitPoint.m215073a(team);
            return;
        }
        finish();
    }

    /* renamed from: a */
    public final void mo189553a(boolean z) {
        TeamSetting.AddMemberPermission addMemberPermission;
        if (this.f137197d) {
            Log.m165389i("TeamAuthorityManageActivity", "updateAddMemberPermission updating");
            return;
        }
        this.f137197d = true;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C55618g(this, z));
        if (z) {
            addMemberPermission = TeamSetting.AddMemberPermission.ALL_MEMBERS;
        } else {
            addMemberPermission = TeamSetting.AddMemberPermission.ONLY_OWNER;
        }
        Log.m165389i("TeamAuthorityManageActivity", "updateAddMemberPermission:" + addMemberPermission);
        TeamService bVar = TeamService.f136826a;
        long j = this.f137196c;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        bVar.mo189062a(j, addMemberPermission, wrapAndAddGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$e */
    public static final class DialogInterface$OnClickListenerC55616e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55616e f137207a = new DialogInterface$OnClickListenerC55616e();

        DialogInterface$OnClickListenerC55616e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$c */
    static final class C55614c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137205a;

        C55614c(TeamAuthorityManageActivity teamAuthorityManageActivity) {
            this.f137205a = teamAuthorityManageActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f137205a.mo189555b(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$d */
    static final class C55615d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137206a;

        C55615d(TeamAuthorityManageActivity teamAuthorityManageActivity) {
            this.f137206a = teamAuthorityManageActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f137206a.mo189557c(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.TeamAuthorityManageActivity$b */
    static final class C55613b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamAuthorityManageActivity f137204a;

        C55613b(TeamAuthorityManageActivity teamAuthorityManageActivity) {
            this.f137204a = teamAuthorityManageActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f137204a.mo189559d(z);
            this.f137204a.mo189553a(z);
        }
    }

    /* renamed from: a */
    public static void m215505a(TeamAuthorityManageActivity teamAuthorityManageActivity, Context context) {
        teamAuthorityManageActivity.mo189551a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamAuthorityManageActivity);
        }
    }

    /* renamed from: a */
    public static Context m215503a(TeamAuthorityManageActivity teamAuthorityManageActivity, Configuration configuration) {
        Context a = teamAuthorityManageActivity.mo189548a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo189550a(int i, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        SettingSwitchPiece settingSwitchPiece;
        LinearPieceGroup linearPieceGroup = this.f137194a;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        Iterator<Piece<?>> it = linearPieceGroup.mo177219d().iterator();
        while (true) {
            if (!it.hasNext()) {
                settingSwitchPiece = null;
                break;
            }
            Piece<?> next = it.next();
            if (next.mo177207u() == -1 || next.mo177207u() != i || !Intrinsics.areEqual(next.getClass(), SettingSwitchPiece.class)) {
                if ((next instanceof PieceGroup) && (settingSwitchPiece = ((PieceGroup) next).mo177215a(i, SettingSwitchPiece.class)) != null) {
                    break;
                }
            } else if (next != null) {
                settingSwitchPiece = (SettingSwitchPiece) next;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.team.common.piece.SettingSwitchPiece");
            }
        }
        SettingSwitchPiece settingSwitchPiece2 = (SettingSwitchPiece) settingSwitchPiece;
        if (settingSwitchPiece2 != null) {
            settingSwitchPiece2.mo189012a((CompoundButton.OnCheckedChangeListener) null);
            settingSwitchPiece2.mo189015b(z);
            settingSwitchPiece2.mo189012a(onCheckedChangeListener);
        }
    }
}

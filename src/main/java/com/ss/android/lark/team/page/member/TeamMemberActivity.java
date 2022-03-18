package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.layout.ConstraintPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "memberListScene", "Lcom/ss/android/lark/team/page/member/TeamMemberActivity$MemberListScene;", "getMemberListScene", "()Lcom/ss/android/lark/team/page/member/TeamMemberActivity$MemberListScene;", "memberListScene$delegate", "Lkotlin/Lazy;", "pieceGroup", "Lcom/ss/android/lark/piece/layout/ConstraintPieceGroup;", "getPieceGroup", "()Lcom/ss/android/lark/piece/layout/ConstraintPieceGroup;", "pieceGroup$delegate", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "getPieceManager", "()Lcom/ss/android/lark/piece/core/PieceManager;", "pieceManager$delegate", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "getMemberListPiece", "Lcom/ss/android/lark/team/page/member/BaseMemberListPiece;", "getPreviewPiece", "Lcom/ss/android/lark/team/page/member/TeamMemberPreviewPiece;", "getSearchListPiece", "Lcom/ss/android/lark/team/page/member/TeamMemberSearchListPiece;", "getTitlePiece", "Lcom/ss/android/lark/team/page/member/BaseMemberTitlePiece;", "logWhenPageShow", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "MemberListScene", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private final Lazy f137080a = LazyKt.lazy(new C55539b(this));

    /* renamed from: b */
    private final Lazy f137081b = LazyKt.lazy(new C55540c(this));

    /* renamed from: c */
    private final Lazy f137082c = LazyKt.lazy(new C55538a(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberActivity$MemberListScene;", "", "(Ljava/lang/String;I)V", "TEAM_MEMBER", "TEAM_CHAT_MEMBER", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum MemberListScene {
        TEAM_MEMBER,
        TEAM_CHAT_MEMBER
    }

    /* renamed from: e */
    private final PieceManager m215374e() {
        return (PieceManager) this.f137081b.getValue();
    }

    /* renamed from: f */
    private final MemberListScene m215375f() {
        return (MemberListScene) this.f137082c.getValue();
    }

    /* renamed from: a */
    public Context mo189421a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final ConstraintPieceGroup mo189422a() {
        return (ConstraintPieceGroup) this.f137080a.getValue();
    }

    /* renamed from: a */
    public void mo189423a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215371a(this, context);
    }

    /* renamed from: b */
    public Resources mo189424b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo189425c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215369a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo189427d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m215373c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215370a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215372b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/piece/layout/ConstraintPieceGroup;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberActivity$b */
    static final class C55539b extends Lambda implements Function0<ConstraintPieceGroup> {
        final /* synthetic */ TeamMemberActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55539b(TeamMemberActivity teamMemberActivity) {
            super(0);
            this.this$0 = teamMemberActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConstraintPieceGroup invoke() {
            return (ConstraintPieceGroup) ((ConstraintPieceGroup) new ConstraintPieceGroup().mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_body, (Context) this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/page/member/TeamMemberActivity$MemberListScene;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberActivity$a */
    static final class C55538a extends Lambda implements Function0<MemberListScene> {
        final /* synthetic */ TeamMemberActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55538a(TeamMemberActivity teamMemberActivity) {
            super(0);
            this.this$0 = teamMemberActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MemberListScene invoke() {
            Serializable serializable;
            Bundle extras;
            Intent intent = this.this$0.getIntent();
            Chat chat = null;
            if (intent == null || (extras = intent.getExtras()) == null) {
                serializable = null;
            } else {
                serializable = extras.getSerializable("intent_chat");
            }
            if (serializable instanceof Chat) {
                chat = serializable;
            }
            if (chat != null) {
                return MemberListScene.TEAM_CHAT_MEMBER;
            }
            return MemberListScene.TEAM_MEMBER;
        }
    }

    /* renamed from: h */
    private final BaseMemberTitlePiece m215377h() {
        int i = C55592k.f137148c[m215375f().ordinal()];
        if (i == 1) {
            return new TeamMemberTitlePiece();
        }
        if (i == 2) {
            return new TeamChatMemberTitlePiece();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: i */
    private final TeamMemberPreviewPiece m215378i() {
        int i = C55592k.f137149d[m215375f().ordinal()];
        if (i == 1) {
            return new TeamMemberPreviewPiece();
        }
        if (i == 2) {
            return new TeamChatMemberPreviewPiece();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    private final BaseMemberListPiece m215379j() {
        int i = C55592k.f137150e[m215375f().ordinal()];
        if (i == 1) {
            return new TeamMemberListPiece();
        }
        if (i == 2) {
            return new TeamChatMemberListPiece();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    private final TeamMemberSearchListPiece m215380k() {
        int i = C55592k.f137151f[m215375f().ordinal()];
        if (i == 1) {
            return new TeamMemberSearchListPiece();
        }
        if (i == 2) {
            return new TeamChatMemberSearchListPiece();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        MemberActionType memberActionType;
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (memberActionType = extras.getSerializable("intent_team_members_action")) == null) {
            memberActionType = MemberActionType.BROWSE_LIST;
        }
        Intrinsics.checkExpressionValueIsNotNull(memberActionType, "intent?.extras?.getSeria…berActionType.BROWSE_LIST");
        if (memberActionType == MemberActionType.REMOVE_MEMBER || memberActionType == MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        ActivityAnimationManager.AnimationConfig enterAnimationConfig = super.getEnterAnimationConfig();
        Intrinsics.checkExpressionValueIsNotNull(enterAnimationConfig, "super.getEnterAnimationConfig()");
        return enterAnimationConfig;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        MemberActionType memberActionType;
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (memberActionType = extras.getSerializable("intent_team_members_action")) == null) {
            memberActionType = MemberActionType.BROWSE_LIST;
        }
        Intrinsics.checkExpressionValueIsNotNull(memberActionType, "intent?.extras?.getSeria…berActionType.BROWSE_LIST");
        if (memberActionType == MemberActionType.REMOVE_MEMBER || memberActionType == MemberActionType.SELECT_MEMBER_FOR_PRIVATE_CHAT) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
        }
        ActivityAnimationManager.AnimationConfig exitAnimationConfig = super.getExitAnimationConfig();
        Intrinsics.checkExpressionValueIsNotNull(exitAnimationConfig, "super.getExitAnimationConfig()");
        return exitAnimationConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.MemberActionType) != false) goto L_0x0020;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m215376g() {
        /*
            r3 = this;
            com.ss.android.lark.piece.core.c r0 = r3.m215374e()
            com.ss.android.lark.piece.a.c r0 = r0.mo177229a()
            java.lang.Class<com.ss.android.lark.team.entity.MemberActionType> r1 = com.ss.android.lark.team.entity.MemberActionType.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.MemberActionType
            if (r2 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            com.ss.android.lark.team.entity.MemberActionType r0 = (com.ss.android.lark.team.entity.MemberActionType) r0
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            com.ss.android.lark.team.entity.MemberActionType r0 = com.ss.android.lark.team.entity.MemberActionType.BROWSE_LIST
        L_0x0027:
            com.ss.android.lark.team.page.member.TeamMemberActivity$MemberListScene r1 = r3.m215375f()
            int[] r2 = com.ss.android.lark.team.page.member.C55592k.f137147b
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0037
            goto L_0x0045
        L_0x0037:
            int[] r1 = com.ss.android.lark.team.page.member.C55592k.f137146a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            com.ss.android.lark.team.stastics.TeamMemberHitPoint.m215092a()
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamMemberActivity.m215376g():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/piece/core/PieceManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.TeamMemberActivity$c */
    static final class C55540c extends Lambda implements Function0<PieceManager> {
        final /* synthetic */ TeamMemberActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55540c(TeamMemberActivity teamMemberActivity) {
            super(0);
            this.this$0 = teamMemberActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PieceManager invoke() {
            Bundle bundle;
            Serializable serializable;
            Serializable serializable2;
            Bundle extras;
            Serializable serializable3;
            Bundle extras2;
            Bundle extras3;
            PieceManager.Builder a = new PieceManager.Builder(this.this$0.mo189422a(), this.this$0).mo177234a(this.this$0);
            Intent intent = this.this$0.getIntent();
            Chat chat = null;
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            PieceManager d = a.mo177233a(bundle).mo177237d();
            Intent intent2 = this.this$0.getIntent();
            if (intent2 == null || (extras3 = intent2.getExtras()) == null) {
                serializable = null;
            } else {
                serializable = extras3.getSerializable("intent_team");
            }
            if (!(serializable instanceof Team)) {
                serializable = null;
            }
            Team team = (Team) serializable;
            if (team != null) {
                d.mo177229a().mo177168a(Team.class, team);
            }
            Intent intent3 = this.this$0.getIntent();
            if (intent3 == null || (extras2 = intent3.getExtras()) == null) {
                serializable2 = null;
            } else {
                serializable2 = extras2.getSerializable("intent_chat");
            }
            if (serializable2 instanceof Chat) {
                chat = serializable2;
            }
            Chat chat2 = chat;
            if (chat2 != null) {
                d.mo177229a().mo177168a(Chat.class, chat2);
                d.mo177229a().mo177168a("intent_private_chat_id", chat2.getId());
            }
            Intent intent4 = this.this$0.getIntent();
            if (!(intent4 == null || (extras = intent4.getExtras()) == null || (serializable3 = extras.getSerializable("intent_team_members_action")) == null)) {
                d.mo177229a().mo177168a(MemberActionType.class, serializable3);
            }
            return d;
        }
    }

    /* renamed from: a */
    public static Resources m215370a(TeamMemberActivity teamMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamMemberActivity);
        }
        return teamMemberActivity.mo189424b();
    }

    /* renamed from: c */
    public static AssetManager m215373c(TeamMemberActivity teamMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamMemberActivity);
        }
        return teamMemberActivity.mo189427d();
    }

    /* renamed from: b */
    public static void m215372b(TeamMemberActivity teamMemberActivity) {
        teamMemberActivity.mo189425c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamMemberActivity teamMemberActivity2 = teamMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintPieceGroup a = mo189422a();
        Piece piece = (Piece) m215377h().mo177198c(R.id.team_members_title);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f2816h = 0;
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        ConstraintPieceGroup constraintPieceGroup = (ConstraintPieceGroup) PieceGroup.m199534a(a, piece, layoutParams, false, 4, null);
        Piece piece2 = (Piece) new TeamMemberSearchBarPiece().mo177198c(R.id.team_members_search);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams2.f2817i = R.id.team_members_title;
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        ConstraintPieceGroup constraintPieceGroup2 = (ConstraintPieceGroup) PieceGroup.m199534a(constraintPieceGroup, piece2, layoutParams2, false, 4, null);
        Piece piece3 = (Piece) ((TeamMemberPreviewPiece) m215378i().mo177198c(R.id.team_members_selection)).mo177194b(8);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams3.f2817i = R.id.team_members_search;
        layoutParams3.f2825q = 0;
        layoutParams3.f2827s = 0;
        ConstraintPieceGroup constraintPieceGroup3 = (ConstraintPieceGroup) PieceGroup.m199534a(constraintPieceGroup2, piece3, layoutParams3, false, 4, null);
        Piece piece4 = (Piece) m215379j().mo177198c(R.id.team_members_list);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams4.f2817i = R.id.team_members_selection;
        layoutParams4.f2819k = 0;
        layoutParams4.f2825q = 0;
        layoutParams4.f2827s = 0;
        ConstraintPieceGroup constraintPieceGroup4 = (ConstraintPieceGroup) PieceGroup.m199534a(constraintPieceGroup3, piece4, layoutParams4, false, 4, null);
        Piece piece5 = (Piece) m215380k().mo177194b(8);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams5.f2816h = R.id.team_members_list;
        layoutParams5.f2819k = R.id.team_members_list;
        layoutParams5.f2825q = R.id.team_members_list;
        layoutParams5.f2827s = R.id.team_members_list;
        ConstraintPieceGroup constraintPieceGroup5 = (ConstraintPieceGroup) PieceGroup.m199534a(constraintPieceGroup4, piece5, layoutParams5, false, 4, null);
        Piece piece6 = (Piece) new TeamMemberFailedPiece().mo177194b(8);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams6.f2816h = R.id.team_members_list;
        layoutParams6.f2819k = R.id.team_members_list;
        layoutParams6.f2825q = R.id.team_members_list;
        layoutParams6.f2827s = R.id.team_members_list;
        setContentView(((ConstraintPieceGroup) PieceGroup.m199534a(constraintPieceGroup5, piece6, layoutParams6, false, 4, null)).mo177214a(this));
        m215374e().mo177230b();
        m215376g();
    }

    /* renamed from: a */
    public static void m215371a(TeamMemberActivity teamMemberActivity, Context context) {
        teamMemberActivity.mo189423a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m215369a(TeamMemberActivity teamMemberActivity, Configuration configuration) {
        Context a = teamMemberActivity.mo189421a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

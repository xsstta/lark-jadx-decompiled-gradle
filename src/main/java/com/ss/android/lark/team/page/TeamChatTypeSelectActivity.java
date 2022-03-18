package com.ss.android.lark.team.page;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0016H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR#\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R#\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/team/page/TeamChatTypeSelectActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "privateIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getPrivateIcon", "()Landroid/widget/ImageView;", "privateIcon$delegate", "Lkotlin/Lazy;", "privateView", "Landroid/widget/TextView;", "getPrivateView", "()Landroid/widget/TextView;", "privateView$delegate", "publicIcon", "getPublicIcon", "publicIcon$delegate", "publicView", "getPublicView", "publicView$delegate", "teamChatType", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setActivityResult", ShareHitPoint.f121869d, "updateTeamChatType", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamChatTypeSelectActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private TeamChatType f136894a = TeamChatType.TEAM_CHAT_TYPE_PUBLIC;

    /* renamed from: b */
    private final Lazy f136895b = LazyKt.lazy(new C55454f(this));

    /* renamed from: c */
    private final Lazy f136896c = LazyKt.lazy(new C55452d(this));

    /* renamed from: d */
    private final Lazy f136897d = LazyKt.lazy(new C55453e(this));

    /* renamed from: e */
    private final Lazy f136898e = LazyKt.lazy(new C55451c(this));

    /* renamed from: d */
    private final TextView m215138d() {
        return (TextView) this.f136895b.getValue();
    }

    /* renamed from: e */
    private final TextView m215139e() {
        return (TextView) this.f136896c.getValue();
    }

    /* renamed from: f */
    private final ImageView m215140f() {
        return (ImageView) this.f136897d.getValue();
    }

    /* renamed from: g */
    private final ImageView m215141g() {
        return (ImageView) this.f136898e.getValue();
    }

    /* renamed from: a */
    public Context mo189223a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189224a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189225a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215135a(this, context);
    }

    /* renamed from: b */
    public void mo189227b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189229c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215133a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215137c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215134a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215136b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamChatTypeSelectActivity$c */
    static final class C55451c extends Lambda implements Function0<ImageView> {
        final /* synthetic */ TeamChatTypeSelectActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55451c(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
            super(0);
            this.this$0 = teamChatTypeSelectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return (ImageView) this.this$0.findViewById(R.id.type_private_icon);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamChatTypeSelectActivity$d */
    static final class C55452d extends Lambda implements Function0<TextView> {
        final /* synthetic */ TeamChatTypeSelectActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55452d(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
            super(0);
            this.this$0 = teamChatTypeSelectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.findViewById(R.id.type_private);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamChatTypeSelectActivity$e */
    static final class C55453e extends Lambda implements Function0<ImageView> {
        final /* synthetic */ TeamChatTypeSelectActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55453e(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
            super(0);
            this.this$0 = teamChatTypeSelectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return (ImageView) this.this$0.findViewById(R.id.type_public_icon);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamChatTypeSelectActivity$f */
    static final class C55454f extends Lambda implements Function0<TextView> {
        final /* synthetic */ TeamChatTypeSelectActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55454f(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
            super(0);
            this.this$0 = teamChatTypeSelectActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.findViewById(R.id.type_public);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamChatTypeSelectActivity$a */
    static final class View$OnClickListenerC55449a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamChatTypeSelectActivity f136899a;

        View$OnClickListenerC55449a(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
            this.f136899a = teamChatTypeSelectActivity;
        }

        public final void onClick(View view) {
            this.f136899a.mo189226a(TeamChatType.TEAM_CHAT_TYPE_PUBLIC);
            this.f136899a.mo189228b(TeamChatType.TEAM_CHAT_TYPE_PUBLIC);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamChatTypeSelectActivity$b */
    static final class View$OnClickListenerC55450b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamChatTypeSelectActivity f136900a;

        View$OnClickListenerC55450b(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
            this.f136900a = teamChatTypeSelectActivity;
        }

        public final void onClick(View view) {
            this.f136900a.mo189226a(TeamChatType.TEAM_CHAT_TYPE_PRIVATE);
            this.f136900a.mo189228b(TeamChatType.TEAM_CHAT_TYPE_PRIVATE);
        }
    }

    /* renamed from: a */
    public static Resources m215134a(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamChatTypeSelectActivity);
        }
        return teamChatTypeSelectActivity.mo189224a();
    }

    /* renamed from: c */
    public static AssetManager m215137c(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamChatTypeSelectActivity);
        }
        return teamChatTypeSelectActivity.mo189229c();
    }

    /* renamed from: b */
    public final void mo189228b(TeamChatType teamChatType) {
        this.f136894a = teamChatType;
        Intent intent = new Intent();
        intent.putExtra("result_team_chat_type", teamChatType);
        setResult(-1, intent);
    }

    /* renamed from: b */
    public static void m215136b(TeamChatTypeSelectActivity teamChatTypeSelectActivity) {
        teamChatTypeSelectActivity.mo189227b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamChatTypeSelectActivity teamChatTypeSelectActivity2 = teamChatTypeSelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamChatTypeSelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.activity_team_chat_type_select);
        Intent intent = getIntent();
        TeamChatType teamChatType = null;
        if (intent == null || (extras = intent.getExtras()) == null) {
            serializable = null;
        } else {
            serializable = extras.getSerializable("intent_team_chat_type");
        }
        if (serializable instanceof TeamChatType) {
            teamChatType = serializable;
        }
        TeamChatType teamChatType2 = teamChatType;
        if (teamChatType2 != null) {
            this.f136894a = teamChatType2;
        }
        m215138d().setOnClickListener(new View$OnClickListenerC55449a(this));
        m215139e().setOnClickListener(new View$OnClickListenerC55450b(this));
        mo189226a(this.f136894a);
    }

    /* renamed from: a */
    public final void mo189226a(TeamChatType teamChatType) {
        int i = C55474b.f136950a[teamChatType.ordinal()];
        if (i == 1) {
            ImageView f = m215140f();
            Intrinsics.checkExpressionValueIsNotNull(f, "publicIcon");
            f.setVisibility(4);
            ImageView g = m215141g();
            Intrinsics.checkExpressionValueIsNotNull(g, "privateIcon");
            g.setVisibility(0);
        } else if (i != 2) {
            ImageView f2 = m215140f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "publicIcon");
            f2.setVisibility(4);
            ImageView g2 = m215141g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "privateIcon");
            g2.setVisibility(4);
        } else {
            ImageView f3 = m215140f();
            Intrinsics.checkExpressionValueIsNotNull(f3, "publicIcon");
            f3.setVisibility(0);
            ImageView g3 = m215141g();
            Intrinsics.checkExpressionValueIsNotNull(g3, "privateIcon");
            g3.setVisibility(4);
        }
    }

    /* renamed from: a */
    public static void m215135a(TeamChatTypeSelectActivity teamChatTypeSelectActivity, Context context) {
        teamChatTypeSelectActivity.mo189225a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamChatTypeSelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m215133a(TeamChatTypeSelectActivity teamChatTypeSelectActivity, Configuration configuration) {
        Context a = teamChatTypeSelectActivity.mo189223a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

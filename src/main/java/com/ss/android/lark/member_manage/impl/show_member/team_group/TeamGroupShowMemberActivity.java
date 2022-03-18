package com.ss.android.lark.member_manage.impl.show_member.team_group;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberLauncher;
import com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mDependency", "com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberActivity$mDependency$1", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberActivity$mDependency$1;", "mPresenter", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberPresenter;", "checkInitData", "", "bundle", "Landroid/os/Bundle;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "onDestroy", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamGroupShowMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f114481a = new Companion(null);

    /* renamed from: b */
    private TeamGroupShowMemberPresenter f114482b;

    /* renamed from: c */
    private final C45234b f114483c = new C45234b(this);

    /* renamed from: d */
    private HashMap f114484d;

    /* renamed from: a */
    public Context mo159821a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159822a() {
        return super.getResources();
    }

    /* renamed from: a */
    public View mo159823a(int i) {
        if (this.f114484d == null) {
            this.f114484d = new HashMap();
        }
        View view = (View) this.f114484d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f114484d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo159824a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179518a(this, context);
    }

    /* renamed from: b */
    public void mo159825b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159826c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179516a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179521c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179517a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179520b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberActivity$Companion;", "", "()V", "REQUEST_CODE_ADD_MEMBER", "", "REQUEST_CODE_OPEN_SHARE", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberActivity$mDependency$1", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/TeamGroupShowMemberView$Dependency;", "addGroupMemberForResult", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isEdu", "", ShareHitPoint.f121868c, "", "finishActivity", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "goGroupShareFromAddContact", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberActivity$b */
    public static final class C45234b implements TeamGroupShowMemberView.Dependency {

        /* renamed from: a */
        final /* synthetic */ TeamGroupShowMemberActivity f114485a;

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView.Dependency
        /* renamed from: a */
        public void mo159829a() {
            this.f114485a.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView.Dependency
        /* renamed from: b */
        public FragmentManager mo159832b() {
            FragmentManager supportFragmentManager = this.f114485a.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "this@TeamGroupShowMember…ty.supportFragmentManager");
            return supportFragmentManager;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45234b(TeamGroupShowMemberActivity teamGroupShowMemberActivity) {
            this.f114485a = teamGroupShowMemberActivity;
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView.Dependency
        /* renamed from: a */
        public void mo159830a(Chat chat, String str) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            a.getChatSettingDependency().mo143810a(this.f114485a, chat, str, 10007);
        }

        @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.TeamGroupShowMemberView.Dependency
        /* renamed from: a */
        public void mo159831a(Chat chat, boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
            AddGroupMemberLauncher.f113807a.mo159062a(this.f114485a, chat, z, 10006, str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        TeamGroupShowMemberPresenter dVar = this.f114482b;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public static Resources m179517a(TeamGroupShowMemberActivity teamGroupShowMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamGroupShowMemberActivity);
        }
        return teamGroupShowMemberActivity.mo159822a();
    }

    /* renamed from: c */
    public static AssetManager m179521c(TeamGroupShowMemberActivity teamGroupShowMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamGroupShowMemberActivity);
        }
        return teamGroupShowMemberActivity.mo159826c();
    }

    /* renamed from: b */
    public static void m179520b(TeamGroupShowMemberActivity teamGroupShowMemberActivity) {
        teamGroupShowMemberActivity.mo159825b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamGroupShowMemberActivity teamGroupShowMemberActivity2 = teamGroupShowMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamGroupShowMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m179519a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return !TextUtils.isEmpty(bundle.getString("key_chat_id"));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_team_group_show_member);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (!m179519a(intent.getExtras())) {
            finish();
            return;
        }
        TeamGroupShowMemberActivity teamGroupShowMemberActivity = this;
        Intent intent2 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
        Bundle extras = intent2.getExtras();
        String str = "";
        if (!(extras == null || (string = extras.getString("key_chat_id", str)) == null)) {
            str = string;
        }
        Intent intent3 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent3, "intent");
        Bundle extras2 = intent3.getExtras();
        if (extras2 != null) {
            z = extras2.getBoolean("key_is_thread", false);
        } else {
            z = false;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo159823a(R.id.mRootView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "mRootView");
        ConstraintLayout constraintLayout2 = constraintLayout;
        C45234b bVar = this.f114483c;
        Intent intent4 = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent4, "intent");
        Bundle extras3 = intent4.getExtras();
        if (extras3 != null) {
            z2 = extras3.getBoolean("keu.is.remove", false);
        } else {
            z2 = false;
        }
        TeamGroupShowMemberPresenter dVar = new TeamGroupShowMemberPresenter(teamGroupShowMemberActivity, str, z, constraintLayout2, bVar, z2);
        this.f114482b = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    /* renamed from: a */
    public static void m179518a(TeamGroupShowMemberActivity teamGroupShowMemberActivity, Context context) {
        teamGroupShowMemberActivity.mo159824a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamGroupShowMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m179516a(TeamGroupShowMemberActivity teamGroupShowMemberActivity, Configuration configuration) {
        Context a = teamGroupShowMemberActivity.mo159821a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        TeamGroupShowMemberPresenter dVar;
        super.onActivityResult(i, i2, intent);
        if ((i == 10006 || i == 10007) && (dVar = this.f114482b) != null) {
            dVar.mo159862b();
        }
    }
}

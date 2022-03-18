package com.ss.android.lark.chatsetting.impl.group.ownership.group_search;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.C34456a;
import com.ss.android.lark.chatsetting.impl.group.avatar.AvatarEditActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView;
import com.ss.android.lark.chatsetting.impl.group.ownership.group_search.IGroupSearchEnableContract;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mPresenter", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnablePresenter;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "ViewDependency", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupSearchEnableActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f89622a = new Companion(null);

    /* renamed from: b */
    private GroupSearchEnablePresenter f89623b;

    /* renamed from: a */
    public Context mo128153a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128154a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128155a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134919a(this, context);
    }

    /* renamed from: b */
    public void mo128156b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128157c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134917a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134921c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134918a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134920b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableActivity$Companion;", "", "()V", "PARAMS_CHAT_ID", "", "PARAMS_IS_THREAD", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableActivity$ViewDependency;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableView$IViewDependency;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/GroupSearchEnableActivity;)V", "enterCustomizeAvatarPage", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "gotoEditInfoActivity", "chatId", "", ShareHitPoint.f121869d, "", "gotoLastPage", "injectView", "view", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/group_search/IGroupSearchEnableContract$IView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableActivity$b */
    public final class ViewDependency implements GroupSearchEnableView.IViewDependency {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView.IViewDependency
        /* renamed from: a */
        public void mo128160a() {
            GroupSearchEnableActivity.this.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDependency() {
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView.IViewDependency
        /* renamed from: a */
        public void mo128162a(IGroupSearchEnableContract.IView bVar) {
            if (bVar != null) {
                ButterKnife.bind(bVar, GroupSearchEnableActivity.this);
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView.IViewDependency
        /* renamed from: a */
        public void mo128161a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            Intent intent = new Intent(GroupSearchEnableActivity.this, AvatarEditActivity.class);
            intent.putExtra("current_chat", chat);
            GroupSearchEnableActivity.this.startActivityForResult(intent, 1017);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.group_search.GroupSearchEnableView.IViewDependency
        /* renamed from: a */
        public void mo128163a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            C34456a.m133677a(GroupSearchEnableActivity.this, (C36516a) null, str, i, (String) null);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        GroupSearchEnablePresenter bVar = this.f89623b;
        if (bVar != null) {
            bVar.mo128188c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        GroupSearchEnablePresenter bVar = this.f89623b;
        if (bVar != null) {
            bVar.destroy();
        }
        super.onDestroy();
    }

    /* renamed from: d */
    private final void m134922d() {
        String stringExtra = getIntent().getStringExtra("chat_id");
        if (stringExtra != null) {
            GroupSearchEnablePresenter bVar = new GroupSearchEnablePresenter(this, new ViewDependency(), stringExtra, getIntent().getBooleanExtra("is_thread", false));
            this.f89623b = bVar;
            if (bVar != null) {
                bVar.create();
                return;
            }
            return;
        }
        finish();
    }

    /* renamed from: a */
    public static Resources m134918a(GroupSearchEnableActivity groupSearchEnableActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupSearchEnableActivity);
        }
        return groupSearchEnableActivity.mo128154a();
    }

    /* renamed from: c */
    public static AssetManager m134921c(GroupSearchEnableActivity groupSearchEnableActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupSearchEnableActivity);
        }
        return groupSearchEnableActivity.mo128157c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        setContentView(R.layout.activity_group_search_enable);
        m134922d();
    }

    /* renamed from: b */
    public static void m134920b(GroupSearchEnableActivity groupSearchEnableActivity) {
        groupSearchEnableActivity.mo128156b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupSearchEnableActivity groupSearchEnableActivity2 = groupSearchEnableActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupSearchEnableActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m134919a(GroupSearchEnableActivity groupSearchEnableActivity, Context context) {
        groupSearchEnableActivity.mo128155a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupSearchEnableActivity);
        }
    }

    /* renamed from: a */
    public static Context m134917a(GroupSearchEnableActivity groupSearchEnableActivity, Configuration configuration) {
        Context a = groupSearchEnableActivity.mo128153a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        GroupSearchEnablePresenter bVar = this.f89623b;
        if (bVar != null) {
            bVar.mo128186a();
        }
    }
}

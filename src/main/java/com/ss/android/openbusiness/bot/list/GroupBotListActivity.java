package com.ss.android.openbusiness.bot.list;

import android.app.Activity;
import android.app.Application;
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
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2048a;
import com.p078b.p079a.C2052c;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.activity.BaseActivity;
import com.ss.android.openbusiness.bot.GroupBotConfig;
import com.ss.android.openbusiness.bot.addsearch.GroupBotAddSearchActivity;
import com.ss.android.openbusiness.bot.net.data.Bot;
import com.ss.android.openbusiness.p3006c.C59539a;
import com.ss.android.openbusiness.ui.StatusController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/openbusiness/bot/list/GroupBotListActivity;", "Lcom/ss/android/openbusiness/activity/BaseActivity;", "()V", "mBotList", "", "Lcom/ss/android/openbusiness/bot/BotViewItem;", "mBotListAdapter", "Lcom/ss/android/openbusiness/bot/list/GroupBotListAdapter;", "mChatId", "", "mIsExternal", "", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mSkeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "mStatusController", "Lcom/ss/android/openbusiness/ui/StatusController;", "mViewModel", "Lcom/ss/android/openbusiness/bot/list/GroupBotListViewModel;", "initData", "", "initStatus", "initView", "initViewModel", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showContent", "showContentEmpty", "showError", "showLoading", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupBotListActivity extends BaseActivity {

    /* renamed from: g */
    public static final Companion f147758g = new Companion(null);

    /* renamed from: b */
    public RecyclerView f147759b;

    /* renamed from: c */
    public GroupBotListAdapter f147760c;

    /* renamed from: d */
    public String f147761d = "";

    /* renamed from: e */
    public GroupBotListViewModel f147762e;

    /* renamed from: f */
    public C2048a f147763f;

    /* renamed from: h */
    private StatusController f147764h;

    /* renamed from: i */
    private boolean f147765i;

    /* renamed from: a */
    public Context mo202860a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo202861a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m230949a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m230947a(this, configuration);
    }

    /* renamed from: f */
    public Resources mo202866f() {
        return super.getResources();
    }

    /* renamed from: g */
    public void mo202867g() {
        super.onStop();
    }

    public AssetManager getAssets() {
        return m230954f(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m230952d(this);
    }

    /* renamed from: h */
    public AssetManager mo202869h() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m230953e(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/openbusiness/bot/list/GroupBotListActivity$Companion;", "", "()V", "DATA_KEY_BOTS", "", "DATA_KEY_CHAT_ID", "DATA_KEY_EXTERNAL", "startActivity", "", "context", "Landroid/content/Context;", "bots", "Ljava/util/ArrayList;", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "Lkotlin/collections/ArrayList;", "chatId", "isExternal", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo202870a(Context context, ArrayList<Bot> arrayList, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(arrayList, "bots");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intent intent = new Intent(context, GroupBotListActivity.class);
            intent.putParcelableArrayListExtra("bots", arrayList);
            intent.putExtra("external", z);
            intent.putExtra("chatId", str);
            boolean z2 = context instanceof Activity;
            if (!z2) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
            if (z2) {
                ((Activity) context).overridePendingTransition(R.anim.slide_right_in, R.anim.hold);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/openbusiness/bot/list/GroupBotListActivity$initStatus$1", "Lcom/ss/android/openbusiness/ui/StatusController$IStatusSwitch;", "switchOff", "", "switchOn", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$b */
    public static final class C59525b implements StatusController.AbstractC59600b {

        /* renamed from: a */
        final /* synthetic */ GroupBotListActivity f147766a;

        @Override // com.ss.android.openbusiness.ui.StatusController.AbstractC59600b
        /* renamed from: b */
        public void mo202787b() {
            C2048a aVar = this.f147766a.f147763f;
            if (aVar != null) {
                aVar.mo10130b();
            }
        }

        @Override // com.ss.android.openbusiness.ui.StatusController.AbstractC59600b
        /* renamed from: a */
        public void mo202786a() {
            GroupBotListActivity groupBotListActivity = this.f147766a;
            groupBotListActivity.f147763f = C2052c.m8960a(GroupBotListActivity.m230948a(groupBotListActivity)).mo10132a(GroupBotListActivity.m230950b(this.f147766a)).mo10139e(R.layout.openplatform_bot_skeleton_item).mo10131a(3).mo10133a(UIUtils.canShowSkeleton()).mo10134a();
            GroupBotListActivity.m230948a(this.f147766a).setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59525b(GroupBotListActivity groupBotListActivity) {
            this.f147766a = groupBotListActivity;
        }
    }

    public GroupBotListActivity() {
        this.f147658a = "GroupBotListActivity";
    }

    /* renamed from: d */
    public final void mo202864d() {
        StatusController statusController = this.f147764h;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.ERROR);
        }
    }

    /* renamed from: e */
    public final void mo202865e() {
        StatusController statusController = this.f147764h;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.LOADING);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.hold, R.anim.slide_right_out);
    }

    /* renamed from: b */
    public final void mo202776b() {
        StatusController statusController = this.f147764h;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.CONTENT);
        }
    }

    /* renamed from: c */
    public final void mo202862c() {
        StatusController statusController = this.f147764h;
        if (statusController != null) {
            statusController.mo203016a(StatusController.Status.EMPTY);
        }
    }

    /* renamed from: j */
    private final void m230956j() {
        StatusController statusController = new StatusController(findViewById(R.id.rv_content), findViewById(R.id.cl_error_wrapper), new C59525b(this));
        this.f147764h = statusController;
        if (statusController != null) {
            statusController.mo203015a(findViewById(R.id.cl_empty_wrapper), StatusController.Status.EMPTY);
        }
        StatusController statusController2 = this.f147764h;
        if (statusController2 != null) {
            statusController2.mo203019a(true);
        }
    }

    /* renamed from: l */
    private final void m230958l() {
        mo202865e();
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        GroupBotListViewModel bVar = new GroupBotListViewModel(application);
        this.f147762e = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        bVar.getMBotList().mo5923a(this, new C59530g(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        boolean z;
        super.onResume();
        Log.m165389i(this.f147658a, "resume, triggerReload");
        if (this.f147761d.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            GroupBotListViewModel bVar = this.f147762e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            bVar.triggerReload(this.f147761d);
        }
    }

    /* renamed from: i */
    private final void m230955i() {
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("chatId")) {
            String stringExtra = getIntent().getStringExtra("chatId");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f147761d = stringExtra;
        }
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.hasExtra("external")) {
            this.f147765i = getIntent().getBooleanExtra("external", false);
        }
        String str = this.f147658a;
        Log.m165389i(str, "mChatId is : " + this.f147761d);
    }

    /* renamed from: k */
    private final void m230957k() {
        GroupBotListActivity groupBotListActivity = this;
        this.f147760c = new GroupBotListAdapter(groupBotListActivity, this.f147761d);
        View findViewById = findViewById(R.id.rv_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.rv_content)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f147759b = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(groupBotListActivity));
        RecyclerView recyclerView2 = this.f147759b;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        GroupBotListAdapter aVar = this.f147760c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBotListAdapter");
        }
        recyclerView2.setAdapter(aVar);
        findViewById(R.id.tv_retry).setOnClickListener(new View$OnClickListenerC59526c(this));
        ((ImageView) findViewById(R.id.iv_back)).setOnClickListener(new View$OnClickListenerC59527d(this));
        if (this.f147765i) {
            View findViewById2 = findViewById(R.id.tv_add);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById<TextView>(R.id.tv_add)");
            ((TextView) findViewById2).setVisibility(8);
            View findViewById3 = findViewById(R.id.empty_tip_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById<TextView>(R.id.empty_tip_text)");
            ((TextView) findViewById3).setText(UIUtils.getString(groupBotListActivity, R.string.Lark_GroupBot_ExtnlGroupNoBotMsg));
        } else {
            ((TextView) findViewById(R.id.tv_add)).setOnClickListener(new View$OnClickListenerC59528e(this));
        }
        ((TextView) findViewById(R.id.empty_tip_help)).setOnClickListener(new View$OnClickListenerC59529f(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$d */
    public static final class View$OnClickListenerC59527d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotListActivity f147768a;

        View$OnClickListenerC59527d(GroupBotListActivity groupBotListActivity) {
            this.f147768a = groupBotListActivity;
        }

        public final void onClick(View view) {
            this.f147768a.onBackPressed();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m230948a(GroupBotListActivity groupBotListActivity) {
        RecyclerView recyclerView = groupBotListActivity.f147759b;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: b */
    public static final /* synthetic */ GroupBotListAdapter m230950b(GroupBotListActivity groupBotListActivity) {
        GroupBotListAdapter aVar = groupBotListActivity.f147760c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBotListAdapter");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ GroupBotListViewModel m230951c(GroupBotListActivity groupBotListActivity) {
        GroupBotListViewModel bVar = groupBotListActivity.f147762e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$c */
    public static final class View$OnClickListenerC59526c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotListActivity f147767a;

        View$OnClickListenerC59526c(GroupBotListActivity groupBotListActivity) {
            this.f147767a = groupBotListActivity;
        }

        public final void onClick(View view) {
            Log.m165389i(this.f147767a.f147658a, "triggerReload");
            this.f147767a.mo202865e();
            GroupBotListActivity.m230951c(this.f147767a).triggerReload(this.f147767a.f147761d);
        }
    }

    /* renamed from: d */
    public static Resources m230952d(GroupBotListActivity groupBotListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupBotListActivity);
        }
        return groupBotListActivity.mo202866f();
    }

    /* renamed from: f */
    public static AssetManager m230954f(GroupBotListActivity groupBotListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupBotListActivity);
        }
        return groupBotListActivity.mo202869h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.openbusiness.activity.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.open_platform_bot_liist);
        m230955i();
        m230957k();
        m230956j();
        m230958l();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$e */
    public static final class View$OnClickListenerC59528e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotListActivity f147769a;

        View$OnClickListenerC59528e(GroupBotListActivity groupBotListActivity) {
            this.f147769a = groupBotListActivity;
        }

        public final void onClick(View view) {
            String str = this.f147769a.f147658a;
            Log.m165389i(str, "start search add page, chatId is: " + this.f147769a.f147761d);
            GroupBotAddSearchActivity.Companion aVar = GroupBotAddSearchActivity.f147722l;
            GroupBotListActivity groupBotListActivity = this.f147769a;
            aVar.mo202834a(groupBotListActivity, groupBotListActivity.f147761d);
        }
    }

    /* renamed from: e */
    public static void m230953e(GroupBotListActivity groupBotListActivity) {
        groupBotListActivity.mo202867g();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupBotListActivity groupBotListActivity2 = groupBotListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupBotListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$f */
    public static final class View$OnClickListenerC59529f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupBotListActivity f147770a;

        View$OnClickListenerC59529f(GroupBotListActivity groupBotListActivity) {
            this.f147770a = groupBotListActivity;
        }

        public final void onClick(View view) {
            String str;
            GroupBotConfig groupBotConfig = (GroupBotConfig) SettingManager.getInstance().get(GroupBotConfig.class);
            if (groupBotConfig != null) {
                String str2 = this.f147770a.f147658a;
                StringBuilder sb = new StringBuilder();
                sb.append("empty tip click");
                if (groupBotConfig.f147720a != null) {
                    str = groupBotConfig.f147720a;
                } else {
                    str = " url is null";
                }
                sb.append(str);
                Log.m165389i(str2, sb.toString());
                AbstractC59446a a = C59480b.m230865a();
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                a.mo144873a(view.getContext(), groupBotConfig.f147720a, null, false, null, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.GroupBotListActivity$g */
    public static final class C59530g<T> implements AbstractC1178x<List<Bot>> {

        /* renamed from: a */
        final /* synthetic */ GroupBotListActivity f147771a;

        C59530g(GroupBotListActivity groupBotListActivity) {
            this.f147771a = groupBotListActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<Bot> list) {
            if (list == null) {
                Log.m165389i(this.f147771a.f147658a, "receive data change, but data is null, show error");
                this.f147771a.mo202864d();
            } else if (list.size() != 0) {
                Log.m165389i(this.f147771a.f147658a, "receive data change, show data");
                this.f147771a.mo202776b();
                C59539a.m231021a(list.size());
                GroupBotListActivity.m230950b(this.f147771a).resetAll(list);
            } else {
                Log.m165389i(this.f147771a.f147658a, "receive data change, data empty, show empty");
                this.f147771a.mo202862c();
            }
        }
    }

    /* renamed from: a */
    public static void m230949a(GroupBotListActivity groupBotListActivity, Context context) {
        groupBotListActivity.mo202861a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupBotListActivity);
        }
    }

    /* renamed from: a */
    public static Context m230947a(GroupBotListActivity groupBotListActivity, Configuration configuration) {
        Context a = groupBotListActivity.mo202860a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

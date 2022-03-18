package com.ss.android.lark.mm.module.list.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar;
import com.ss.android.lark.mm.module.tab.MmMainTabFragment;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableListTracker;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u0014\u001a\u00020\fH\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bJ>\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f\u0018\u00010\u001fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/MinutesListActivity;", "Lcom/ss/android/lark/mm/base/MmBaseActivity;", "()V", "fragment", "Lcom/ss/android/lark/mm/module/tab/MmMainTabFragment;", ShareHitPoint.f121868c, "", "url", "", "getTitleBar", "Lcom/ss/android/lark/mm/module/share/invite/MmInviteTitleBar;", "initView", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "showOnBoarding", "guideKey", "guideContent", "updateTitleBar", "titleRes", "leftAction", "Lkotlin/Function0;", "rightActionResId", "onRightAction", "Lkotlin/Function1;", "Landroid/view/View;", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesListActivity extends MmBaseActivity {

    /* renamed from: b */
    public static final Companion f116750b = new Companion(null);

    /* renamed from: c */
    private String f116751c = "";

    /* renamed from: d */
    private int f116752d;

    /* renamed from: e */
    private MmMainTabFragment f116753e;

    /* renamed from: f */
    private HashMap f116754f;

    @JvmStatic
    /* renamed from: a */
    public static final void m183512a(Context context, String str, int i, String str2) {
        f116750b.mo162920a(context, str, i, str2);
    }

    /* renamed from: a */
    public Context mo162912a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.mm.base.MmBaseActivity
    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f116754f == null) {
            this.f116754f = new HashMap();
        }
        View view = (View) this.f116754f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116754f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo162914a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m183515a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m183511a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo162917d() {
        return super.getResources();
    }

    /* renamed from: e */
    public AssetManager mo162918e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m183517c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m183516b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m183513a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/MinutesListActivity$Companion;", "", "()V", "startActivity", "", "context", "Landroid/content/Context;", "url", "", ShareHitPoint.f121868c, "", "targetTab", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.MinutesListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo162920a(Context context, String str, int i, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "url");
            MmAppreciableListTracker.f118526a.mo165387a(str2);
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
            Intrinsics.checkExpressionValueIsNotNull(hostDepend, "MmDepend.impl().hostDepend");
            if (!hostDepend.mo144644l() || i == 16 || !Intrinsics.areEqual(str2, "home")) {
                Intent intent = new Intent(context, MinutesListActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra("mm_url_extra", str);
                intent.putExtra("mm_source_extra", i);
                intent.putExtra("mm_target_tab_extra", str2);
                context.startActivity(intent);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("mm_url_extra", str);
            bundle.putInt("mm_source_extra", i);
            bundle.putString("mm_target_tab_extra", str2);
            IMmDepend a2 = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
            a2.getHostDepend().mo144632a(context, bundle);
        }

        /* renamed from: a */
        public static /* synthetic */ void m183527a(Companion aVar, Context context, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                str2 = null;
            }
            aVar.mo162920a(context, str, i, str2);
        }
    }

    /* renamed from: a */
    public final void mo162915a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        Intrinsics.checkParameterIsNotNull(str2, "guideContent");
        ((MmInviteTitleBar) mo161162a(R.id.titleBar)).mo165000a(str, str2);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        MmMainTabFragment aVar = this.f116753e;
        if (aVar != null) {
            aVar.mo165267f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.MinutesListActivity$b */
    public static final class C46350b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function0 $leftAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46350b(Function0 function0) {
            super(0);
            this.$leftAction = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$leftAction.invoke();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C45855f.m181664c("MinutesListActivity", "onDestroy");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onPause() {
        super.onPause();
        C45855f.m181664c("MinutesListActivity", "onPause");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onResume() {
        super.onResume();
        C45855f.m181664c("MinutesListActivity", "onResume");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        C45855f.m181664c("MinutesListActivity", "onStart");
    }

    /* renamed from: f */
    private final void m183518f() {
        ((MmInviteTitleBar) mo161162a(R.id.titleBar)).setTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_MinutesNameShort));
        MinutesListActivity minutesListActivity = this;
        ((MmInviteTitleBar) mo161162a(R.id.titleBar)).setTitleColor(UIUtils.getColor(minutesListActivity, R.color.text_title));
        MmMainTabFragment aVar = new MmMainTabFragment(this.f116751c, Integer.valueOf(this.f116752d), UIUtils.dp2px(minutesListActivity, 64.0f));
        Bundle bundle = new Bundle();
        bundle.putString("mm_url_extra", this.f116751c);
        bundle.putInt("mm_source_extra", this.f116752d);
        bundle.putString("mm_target_tab_extra", getIntent().getStringExtra("mm_target_tab_extra"));
        aVar.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.container, aVar).commit();
        this.f116753e = aVar;
    }

    /* renamed from: a */
    public void mo161315a() {
        super.onStop();
        C45855f.m181664c("MinutesListActivity", "onStop");
    }

    /* renamed from: b */
    public static Resources m183516b(MinutesListActivity minutesListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(minutesListActivity);
        }
        return minutesListActivity.mo162917d();
    }

    /* renamed from: c */
    public static AssetManager m183517c(MinutesListActivity minutesListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(minutesListActivity);
        }
        return minutesListActivity.mo162918e();
    }

    /* renamed from: a */
    public static void m183513a(MinutesListActivity minutesListActivity) {
        minutesListActivity.mo161315a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MinutesListActivity minutesListActivity2 = minutesListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    minutesListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45855f.m181664c("MinutesListActivity", "onCreate");
        setContentView(R.layout.mm_activity_list);
        bd_();
        RelativeLayout relativeLayout = (RelativeLayout) mo161162a(R.id.rootView);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView");
        mo161163a(relativeLayout);
        String stringExtra = getIntent().getStringExtra("mm_url_extra");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f116751c = stringExtra;
        this.f116752d = getIntent().getIntExtra("mm_source_extra", 0);
        m183518f();
    }

    /* renamed from: a */
    public static void m183515a(MinutesListActivity minutesListActivity, Context context) {
        minutesListActivity.mo162914a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(minutesListActivity);
        }
    }

    /* renamed from: a */
    public static Context m183511a(MinutesListActivity minutesListActivity, Configuration configuration) {
        Context a = minutesListActivity.mo162912a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo162913a(int i, Function0<Unit> function0, int i2, Function1<? super View, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "leftAction");
        MmInviteTitleBar.m186074a((MmInviteTitleBar) mo161162a(R.id.titleBar), (int) R.drawable.ud_icon_left_outlined, 0, new C46350b(function0), 2, (Object) null);
        String string = getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(titleRes)");
        ((MmInviteTitleBar) mo161162a(R.id.titleBar)).setTitle(string);
        MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161162a(R.id.titleBar), i2, 0, function1, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.list.base.MinutesListActivity */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m183514a(MinutesListActivity minutesListActivity, int i, Function0 function0, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        minutesListActivity.mo162913a(i, function0, i2, function1);
    }
}

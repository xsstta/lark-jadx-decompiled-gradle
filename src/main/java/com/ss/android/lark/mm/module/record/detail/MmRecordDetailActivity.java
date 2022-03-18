package com.ss.android.lark.mm.module.record.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.floatwindow.api.ForbiddenMini;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.record.DisplayMode;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleControl;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControl;
import com.ss.android.lark.mm.module.record.detail.subtitle.MmRecordSubtitleViewControlAdapter;
import com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsControl;
import com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsViewControl;
import com.ss.android.lark.mm.module.record.detail.tips.MmRecordTipsViewControlAdapter;
import com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBarControl;
import com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBarViewControl;
import com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBarViewControlAdapter;
import com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarControl;
import com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControl;
import com.ss.android.lark.mm.module.record.detail.toolbar.MmRecordToolbarViewControlAdapter;
import com.ss.android.lark.mm.module.record.detail.translate.MmRecordTranslateViewControlAdapter;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.module.translate.MmTranslateViewControl;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableRecordTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68294a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@ForbiddenMini
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u0017H\u0016J\u0012\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020\u0017H\u0014J\u0012\u0010*\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010+\u001a\u00020\u0017H\u0014J\b\u0010,\u001a\u00020\u0017H\u0014J\b\u0010-\u001a\u00020\u0017H\u0014J\b\u0010.\u001a\u00020\u0017H\u0014J\b\u0010/\u001a\u00020\u0017H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00150\u0014X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/MmRecordDetailActivity;", "Lcom/ss/android/lark/mm/base/MmBaseActivity;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "()V", "hitPointContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "isFinishActivity", "", "objectToken", "", "recordManager", "Lcom/ss/android/lark/mm/module/record/MmRecordManager;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "getViewControlRegister", "()Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "viewControlRegister$delegate", "Lkotlin/Lazy;", "viewControls", "", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "finish", "", "generateHitPointContext", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getMContext", "Landroid/content/Context;", "getMmHitPointContext", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRootView", "Landroid/view/View;", "init", "intent", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "onPause", "onResume", "onStart", "onStop", "subscribeRecordingState", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmRecordDetailActivity extends MmBaseActivity implements IMmViewControlContext, MmHitPointContextProvider {

    /* renamed from: b */
    public static final Companion f118026b = new Companion(null);

    /* renamed from: c */
    private boolean f118027c;

    /* renamed from: d */
    private String f118028d = "";

    /* renamed from: e */
    private final List<MmBaseViewControl<?, ?>> f118029e = new ArrayList();

    /* renamed from: f */
    private final Lazy f118030f = LazyKt.lazy(C46876d.INSTANCE);

    /* renamed from: g */
    private MmRecordManager f118031g;

    /* renamed from: h */
    private C47084f f118032h;

    /* renamed from: i */
    private HashMap f118033i;

    /* renamed from: g */
    private final MmViewControlRegister m185703g() {
        return (MmViewControlRegister) this.f118030f.getValue();
    }

    /* renamed from: a */
    public Context mo164646a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.mm.base.MmBaseActivity
    /* renamed from: a */
    public View mo161162a(int i) {
        if (this.f118033i == null) {
            this.f118033i = new HashMap();
        }
        View view = (View) this.f118033i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118033i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo164647a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m185700a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m185696a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo164649d() {
        return super.getResources();
    }

    /* renamed from: f */
    public AssetManager mo164650f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m185702c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m185701b(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: n */
    public Context mo161232n() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m185699a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/MmRecordDetailActivity$Companion;", "", "()V", "OBJECT_TOKEN_EXTRA", "", "start", "", "context", "Landroid/content/Context;", "objectToken", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.MmRecordDetailActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo164653a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "objectToken");
            Intent intent = new Intent(context, MmRecordDetailActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("object_token_extra", str);
            context.startActivity(intent);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext, com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        return this.f118032h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.MmRecordDetailActivity$d */
    static final class C46876d extends Lambda implements Function0<MmViewControlRegister> {
        public static final C46876d INSTANCE = new C46876d();

        C46876d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MmViewControlRegister invoke() {
            return new MmViewControlRegister();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: p */
    public C47096b mo161234p() {
        return mo161164b();
    }

    public void finish() {
        C45855f.m181664c("MmRecordDetailActivity", "finish");
        this.f118027c = true;
        super.finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onPause() {
        super.onPause();
        C45855f.m181664c("MmRecordDetailActivity", "onPause");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity
    public void onResume() {
        super.onResume();
        C45855f.m181664c("MmRecordDetailActivity", "onResume");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        super.onStart();
        C45855f.m181664c("MmRecordDetailActivity", "onStart");
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: o */
    public View mo161233o() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo161162a(R.id.recordRootView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "recordRootView");
        return constraintLayout;
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C45855f.m181664c("MmRecordDetailActivity", "onBackPressed");
        MmRecordManager mmRecordManager = this.f118031g;
        if (mmRecordManager == null || mmRecordManager.mo164531j()) {
            MmRecordManager mmRecordManager2 = this.f118031g;
            if (mmRecordManager2 != null) {
                mmRecordManager2.mo164522a(true);
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: h */
    private final void m185704h() {
        C68294a<DisplayMode> g;
        Disposable subscribe;
        C68294a<Pair<String, MmRecordManager.RecordState>> b;
        Disposable subscribe2;
        MmRecordManager mmRecordManager = this.f118031g;
        if (!(mmRecordManager == null || (b = mmRecordManager.mo164524b()) == null || (subscribe2 = b.subscribe(new C46874b(this))) == null)) {
            C47108b.m186568a(subscribe2, (FragmentActivity) this);
        }
        MmRecordManager mmRecordManager2 = this.f118031g;
        if (mmRecordManager2 != null && (g = mmRecordManager2.mo164528g()) != null && (subscribe = g.subscribe(new C46875c(this))) != null) {
            C47108b.m186568a(subscribe, (FragmentActivity) this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        MmRecordManager mmRecordManager;
        super.onDestroy();
        C45855f.m181664c("MmRecordDetailActivity", "onDestroy");
        Iterator<T> it = this.f118029e.iterator();
        while (it.hasNext()) {
            it.next().mo161245h();
        }
        if (!this.f118027c && (mmRecordManager = this.f118031g) != null) {
            mmRecordManager.mo164522a(true);
        }
        if (MmRecordManager.f117918g.mo164546a(this.f118028d) == MmRecordManager.RecordState.UNKNOWN) {
            C45855f.m181664c("MmRecordDetailActivity", "clearRecordManager");
            C45852d.m181651a().mo161152b(this.f118028d);
        }
    }

    /* renamed from: a */
    public void mo161315a() {
        super.onStop();
        C45855f.m181664c("MmRecordDetailActivity", "onStop");
        MmRecordManager mmRecordManager = this.f118031g;
        if (mmRecordManager != null) {
            mmRecordManager.mo164530i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C45855f.m181664c("MmRecordDetailActivity", "onNewIntent");
        m185697a(intent);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.MmRecordDetailActivity$b */
    public static final class C46874b<T> implements Consumer<Pair<? extends String, ? extends MmRecordManager.RecordState>> {

        /* renamed from: a */
        final /* synthetic */ MmRecordDetailActivity f118034a;

        C46874b(MmRecordDetailActivity mmRecordDetailActivity) {
            this.f118034a = mmRecordDetailActivity;
        }

        /* renamed from: a */
        public final void accept(Pair<String, ? extends MmRecordManager.RecordState> pair) {
            if (((MmRecordManager.RecordState) pair.getSecond()) == MmRecordManager.RecordState.STOPPED) {
                C45855f.m181664c("MmRecordDetailActivity", "[subscribeRecordingState] onStopped");
                this.f118034a.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/record/DisplayMode;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.MmRecordDetailActivity$c */
    public static final class C46875c<T> implements Consumer<DisplayMode> {

        /* renamed from: a */
        final /* synthetic */ MmRecordDetailActivity f118035a;

        C46875c(MmRecordDetailActivity mmRecordDetailActivity) {
            this.f118035a = mmRecordDetailActivity;
        }

        /* renamed from: a */
        public final void accept(DisplayMode displayMode) {
            if (displayMode == DisplayMode.FLOAT_WINDOW) {
                C45855f.m181664c("MmRecordDetailActivity", "floatWindow showing, finish Activity");
                this.f118035a.finish();
            }
        }
    }

    /* renamed from: a */
    private final void m185698a(MmBaseInfo mmBaseInfo) {
        if (mmBaseInfo != null) {
            this.f118032h = new C47084f(mmBaseInfo.getMeetingId(), mmBaseInfo.isOwner(), mmBaseInfo.getObjectToken(), mmBaseInfo.getObjectType(), mmBaseInfo.isCanModify());
        }
    }

    /* renamed from: b */
    public static Resources m185701b(MmRecordDetailActivity mmRecordDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmRecordDetailActivity);
        }
        return mmRecordDetailActivity.mo164649d();
    }

    /* renamed from: c */
    public static AssetManager m185702c(MmRecordDetailActivity mmRecordDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmRecordDetailActivity);
        }
        return mmRecordDetailActivity.mo164650f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mm.base.MmBaseActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45855f.m181664c("MmRecordDetailActivity", "onCreate");
        setContentView(R.layout.mm_record_detail_activity);
        getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
        bd_();
        ConstraintLayout constraintLayout = (ConstraintLayout) mo161162a(R.id.recordRootView);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "recordRootView");
        mo161163a(constraintLayout);
        m185697a(getIntent());
    }

    /* renamed from: a */
    public static void m185699a(MmRecordDetailActivity mmRecordDetailActivity) {
        mmRecordDetailActivity.mo161315a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MmRecordDetailActivity mmRecordDetailActivity2 = mmRecordDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mmRecordDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m185697a(Intent intent) {
        String str;
        MmControlRegister eVar;
        if (intent == null || (str = intent.getStringExtra("object_token_extra")) == null) {
            str = "";
        }
        this.f118028d = str;
        C45855f.m181663b("MmRecordDetailActivity", "[onCreate] objectToken: " + this.f118028d);
        if (StringsKt.isBlank(this.f118028d)) {
            finish();
            return;
        }
        MmRecordManager a = C45852d.m181651a().mo161150a(this.f118028d);
        this.f118031g = a;
        if (a == null) {
            finish();
            return;
        }
        MmBaseInfo mmBaseInfo = null;
        if (a != null) {
            eVar = a.mo164534m();
        } else {
            eVar = null;
        }
        if (eVar == null || eVar.mo161919c()) {
            finish();
            return;
        }
        MmRecordManager mmRecordManager = this.f118031g;
        if (mmRecordManager != null) {
            mmBaseInfo = mmRecordManager.mo164515a();
        }
        m185698a(mmBaseInfo);
        C47083e.m186425a(this.f118032h, "vc_mm_recording_page", C47086i.m186432a().mo165409a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION).mo165421c());
        m185704h();
        C47083e.m186424a(this.f118032h, "vc_minutes_recording_view");
        this.f118029e.clear();
        MmRecordTitleBarControl dVar = (MmRecordTitleBarControl) eVar.mo161912a(MmRecordTitleBarControl.class);
        if (dVar != null) {
            MmRecordDetailActivity mmRecordDetailActivity = this;
            this.f118029e.add(new MmRecordTitleBarViewControl(mmRecordDetailActivity, new MmRecordTitleBarViewControlAdapter(m185703g(), eVar, dVar)));
            MmRecordTipsControl dVar2 = (MmRecordTipsControl) eVar.mo161912a(MmRecordTipsControl.class);
            if (dVar2 != null) {
                this.f118029e.add(new MmRecordTipsViewControl(mmRecordDetailActivity, new MmRecordTipsViewControlAdapter(m185703g(), eVar, dVar2)));
                MmRecordSubtitleControl eVar2 = (MmRecordSubtitleControl) eVar.mo161912a(MmRecordSubtitleControl.class);
                if (eVar2 != null) {
                    this.f118029e.add(new MmRecordSubtitleViewControl(mmRecordDetailActivity, new MmRecordSubtitleViewControlAdapter(m185703g(), eVar, eVar2)));
                    MmRecordToolbarControl dVar3 = (MmRecordToolbarControl) eVar.mo161912a(MmRecordToolbarControl.class);
                    if (dVar3 != null) {
                        this.f118029e.add(new MmRecordToolbarViewControl(mmRecordDetailActivity, new MmRecordToolbarViewControlAdapter(m185703g(), eVar, dVar3)));
                        MmTranslateControl dVar4 = (MmTranslateControl) eVar.mo161912a(MmTranslateControl.class);
                        if (dVar4 != null) {
                            this.f118029e.add(new MmTranslateViewControl(mmRecordDetailActivity, new MmRecordTranslateViewControlAdapter(m185703g(), eVar, dVar4)));
                            Iterator<T> it = this.f118029e.iterator();
                            while (it.hasNext()) {
                                it.next().be_();
                            }
                            MmAppreciableRecordTracker.TrackDetailInitTime.f118539a.mo165400e();
                            MmAppreciableRecordTracker.TrackDetailInitTime.m186408f();
                            MmRecordManager mmRecordManager2 = this.f118031g;
                            if (mmRecordManager2 != null) {
                                mmRecordManager2.mo164535q();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m185700a(MmRecordDetailActivity mmRecordDetailActivity, Context context) {
        mmRecordDetailActivity.mo164647a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mmRecordDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m185696a(MmRecordDetailActivity mmRecordDetailActivity, Configuration configuration) {
        Context a = mmRecordDetailActivity.mo164646a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

package com.bytedance.ee.bear.list.route.compat;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.offline.route.parcelable.FolderRouteBean;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.C8377p;
import com.bytedance.ee.bear.list.ownertype.OwnerTypeFetcher;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.AbstractC68307f;
import io.reactivex.Observable;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "loading", "Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity$Loading;", "getLoading", "()Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity$Loading;", "loading$delegate", "Lkotlin/Lazy;", "objToken", "", "url", "bindListener", "", "fetchShareVersion", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "finish", "navigateToFolderDetail", "ownerType", "", "onDestroy", "onDoCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "openUnSupport", "parseArgs", "", "route", "routeWithOwnerType", "Companion", "Loading", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FolderRouteActivity extends BaseActivity {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f23524a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FolderRouteActivity.class), "loading", "getLoading()Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity$Loading;"))};

    /* renamed from: b */
    public static final Companion f23525b = new Companion(null);

    /* renamed from: c */
    private String f23526c;

    /* renamed from: d */
    private String f23527d;

    /* renamed from: e */
    private C68289a f23528e = new C68289a();

    /* renamed from: f */
    private final Lazy f23529f = LazyKt.lazy(new C8699d(this));

    /* renamed from: g */
    private HashMap f23530g;

    /* renamed from: a */
    public Context mo33721a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final Loading mo33722a() {
        Lazy lazy = this.f23529f;
        KProperty kProperty = f23524a[0];
        return (Loading) lazy.getValue();
    }

    /* renamed from: a */
    public void mo33724a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m36403a(this, context);
    }

    /* renamed from: c */
    public Resources mo33726c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m36401a(this, configuration);
    }

    /* renamed from: d */
    public View mo33729d(int i) {
        if (this.f23530g == null) {
            this.f23530g = new HashMap();
        }
        View view = (View) this.f23530g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f23530g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public void mo33730d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo33731e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m36405c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m36402a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m36404b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity$Companion;", "", "()V", "TAG", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity$Loading;", "", "loadingView", "Landroid/widget/LinearLayout;", "(Landroid/widget/LinearLayout;)V", "dispose", "Lio/reactivex/disposables/CompositeDisposable;", "ref", "Ljava/lang/ref/WeakReference;", "hide", "", "show", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$b */
    public static final class Loading {

        /* renamed from: a */
        public final WeakReference<LinearLayout> f23531a;

        /* renamed from: b */
        private final C68289a f23532b = new C68289a();

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$b$a */
        public static final class C8697a implements AbstractC68309a {

            /* renamed from: a */
            final /* synthetic */ Loading f23533a;

            C8697a(Loading bVar) {
                this.f23533a = bVar;
            }

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                LinearLayout linearLayout = this.f23533a.f23531a.get();
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            }
        }

        /* renamed from: b */
        public final void mo33735b() {
            this.f23532b.mo237935a();
            LinearLayout linearLayout = this.f23531a.get();
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }

        /* renamed from: a */
        public final void mo33734a() {
            this.f23532b.mo237937a(Observable.timer(300, TimeUnit.MILLISECONDS).observeOn(C11678b.m48481e()).doOnComplete(new C8697a(this)).subscribe());
        }

        public Loading(LinearLayout linearLayout) {
            this.f23531a = new WeakReference<>(linearLayout);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/list/route/compat/FolderRouteActivity$Loading;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$d */
    static final class C8699d extends Lambda implements Function0<Loading> {
        final /* synthetic */ FolderRouteActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8699d(FolderRouteActivity folderRouteActivity) {
            super(0);
            this.this$0 = folderRouteActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Loading invoke() {
            return new Loading((LinearLayout) this.this$0.mo33729d(R.id.common_loading));
        }
    }

    /* renamed from: f */
    private final void m36406f() {
        ((LinearLayout) mo33729d(R.id.common_error_tip)).setOnClickListener(new C8698c(this));
    }

    /* renamed from: i */
    private final void m36409i() {
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17287a();
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        C13479a.m54764b("FolderRouteActivity", "onDestroy()...");
        super.onDestroy();
        mo33722a().mo33735b();
        this.f23528e.mo237935a();
    }

    /* renamed from: g */
    private final boolean m36407g() {
        String str;
        String stringExtra;
        Intent intent = getIntent();
        String str2 = "";
        if (intent == null || (str = intent.getStringExtra("token")) == null) {
            str = str2;
        }
        this.f23526c = str;
        Intent intent2 = getIntent();
        if (!(intent2 == null || (stringExtra = intent2.getStringExtra("url")) == null)) {
            str2 = stringExtra;
        }
        this.f23527d = str2;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        if (!TextUtils.isEmpty(str2)) {
            String str3 = this.f23526c;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("objToken");
            }
            if (TextUtils.isEmpty(str3)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final AbstractC68307f<DocumentListInfo> m36408h() {
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/folder/children/");
        String str = this.f23526c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("objToken");
        }
        fVar.mo20145a("token", str);
        fVar.mo20145a("need_path", "1");
        NetService netService = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        String str2 = this.f23526c;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("objToken");
        }
        NetService.AbstractC5075d a = netService.mo20117a(new C8377p(str2));
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…lderListParser(objToken))");
        AbstractC68307f<DocumentListInfo> a2 = a.mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a2, "puller.pull(request)");
        return a2;
    }

    /* renamed from: b */
    public final void mo33725b() {
        C13479a.m54763b("route()...");
        this.f23528e.mo237935a();
        LinearLayout linearLayout = (LinearLayout) mo33729d(R.id.common_error_tip);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "common_error_tip");
        linearLayout.setVisibility(8);
        mo33722a().mo33734a();
        String str = this.f23526c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("objToken");
        }
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        this.f23528e.mo237937a(OwnerTypeFetcher.m36178a(str, aVar.mo32555b(), 0, true).mo238001b(new C8700e(this), new C8701f(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/list/route/compat/FolderRouteActivity$bindListener$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$c */
    public static final class C8698c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ FolderRouteActivity f23534a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8698c(FolderRouteActivity folderRouteActivity) {
            this.f23534a = folderRouteActivity;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f23534a.mo33725b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo33725b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$h */
    public static final class C8703h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FolderRouteActivity f23539a;

        /* renamed from: b */
        final /* synthetic */ int f23540b;

        C8703h(FolderRouteActivity folderRouteActivity, int i) {
            this.f23539a = folderRouteActivity;
            this.f23540b = i;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54758a("FolderRouteActivity", "fetchShareVersion()...error = " + th);
            this.f23539a.mo33727c(this.f23540b);
        }
    }

    /* renamed from: a */
    public static Resources m36402a(FolderRouteActivity folderRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderRouteActivity);
        }
        return folderRouteActivity.mo33726c();
    }

    /* renamed from: c */
    public static AssetManager m36405c(FolderRouteActivity folderRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderRouteActivity);
        }
        return folderRouteActivity.mo33731e();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$e */
    public static final class C8700e<T> implements Consumer<FolderVersion> {

        /* renamed from: a */
        final /* synthetic */ FolderRouteActivity f23535a;

        C8700e(FolderRouteActivity folderRouteActivity) {
            this.f23535a = folderRouteActivity;
        }

        /* renamed from: a */
        public final void accept(FolderVersion folderVersion) {
            C13479a.m54764b("FolderRouteActivity", "fetchOwnerType()...success, ownerType = " + folderVersion.getOwnerType());
            this.f23535a.mo33723a(folderVersion.getOwnerType());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$f */
    public static final class C8701f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FolderRouteActivity f23536a;

        C8701f(FolderRouteActivity folderRouteActivity) {
            this.f23536a = folderRouteActivity;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54758a("FolderRouteActivity", "route()...error = " + th);
            this.f23536a.mo33722a().mo33735b();
            LinearLayout linearLayout = (LinearLayout) this.f23536a.mo33729d(R.id.common_error_tip);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "common_error_tip");
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: b */
    public static void m36404b(FolderRouteActivity folderRouteActivity) {
        folderRouteActivity.mo33730d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderRouteActivity folderRouteActivity2 = folderRouteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderRouteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.route.compat.FolderRouteActivity$g */
    public static final class C8702g<T> implements Consumer<DocumentListInfo> {

        /* renamed from: a */
        final /* synthetic */ FolderRouteActivity f23537a;

        /* renamed from: b */
        final /* synthetic */ int f23538b;

        C8702g(FolderRouteActivity folderRouteActivity, int i) {
            this.f23537a = folderRouteActivity;
            this.f23538b = i;
        }

        /* renamed from: a */
        public final void accept(DocumentListInfo documentListInfo) {
            Document parent;
            Integer num;
            if (documentListInfo == null || (parent = documentListInfo.getParent()) == null || parent.mo32397M() != 1) {
                this.f23537a.mo33727c(this.f23538b);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fetchShareVersion()...shareVersion = ");
            Document parent2 = documentListInfo.getParent();
            if (parent2 != null) {
                num = Integer.valueOf(parent2.mo32397M());
            } else {
                num = null;
            }
            sb.append(num);
            C13479a.m54764b("FolderRouteActivity", sb.toString());
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17287a();
            this.f23537a.finish();
        }
    }

    /* renamed from: c */
    public final void mo33727c(int i) {
        C13479a.m54764b("FolderRouteActivity", "navigateToFolderDetail()...ownerType = " + i);
        FolderRouteBean folderRouteBean = new FolderRouteBean();
        folderRouteBean.mo20914d(i);
        String str = this.f23527d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        folderRouteBean.mo40622h(str);
        AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null);
        String str2 = this.f23527d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        fVar.mo17293a(str2, folderRouteBean);
        finish();
    }

    /* renamed from: a */
    public final void mo33723a(int i) {
        C13479a.m54764b("FolderRouteActivity", "routeWithOwnerType()...ownerType = " + i);
        if (!FolderVersion.Companion.mo32534e(i)) {
            m36409i();
        } else if (FolderVersion.Companion.mo32526a(i)) {
            this.f23528e.mo237937a(m36408h().mo238001b(new C8702g(this, i), new C8703h(this, i)));
        } else {
            mo33727c(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        C13479a.m54764b("FolderRouteActivity", "onDoCreate()...");
        super.mo16851a(bundle);
        setContentView(R.layout.list_folder_route_activity);
        if (bundle != null || m36407g()) {
            C13479a.m54764b("FolderRouteActivity", "onDoCreate()...parse bundle illegal");
            finish();
            return;
        }
        m36406f();
        mo33725b();
    }

    /* renamed from: a */
    public static void m36403a(FolderRouteActivity folderRouteActivity, Context context) {
        folderRouteActivity.mo33724a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderRouteActivity);
        }
    }

    /* renamed from: a */
    public static Context m36401a(FolderRouteActivity folderRouteActivity, Configuration configuration) {
        Context a = folderRouteActivity.mo33721a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}

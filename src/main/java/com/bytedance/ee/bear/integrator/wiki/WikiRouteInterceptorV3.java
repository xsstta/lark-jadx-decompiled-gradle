package com.bytedance.ee.bear.integrator.wiki;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.p578c.C11928b;
import com.bytedance.ee.bear.wikiv2.route.C12340b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.universe_design.loading.UDLoadingToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
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
import org.p3511d.AbstractC70022d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u0018H\u0002J\u001a\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010%\u001a\u00020\u0018H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/integrator/wiki/WikiRouteInterceptorV3;", "Lcom/bytedance/ee/bear/route/AbsRoutePriorityInterceptor;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "highPriorityInterceptors", "", "Lcom/bytedance/ee/bear/route/IRouteInterceptor;", "(Lcom/bytedance/ee/bear/service/ServiceContext;[Lcom/bytedance/ee/bear/route/IRouteInterceptor;)V", "loadingRunnable", "Ljava/lang/Runnable;", "loadingToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "v1Router", "Lcom/bytedance/ee/bear/wiki/route/WikiRouteInterceptor;", "getV1Router", "()Lcom/bytedance/ee/bear/wiki/route/WikiRouteInterceptor;", "v1Router$delegate", "Lkotlin/Lazy;", "v2Router", "Lcom/bytedance/ee/bear/wikiv2/route/WikiRouteInterceptorV2;", "getV2Router", "()Lcom/bytedance/ee/bear/wikiv2/route/WikiRouteInterceptorV2;", "v2Router$delegate", "doRoute", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "bean", "Lcom/bytedance/ee/bear/route/RouteBean;", "getRouteUrl", "hideLoading", "onIntercept", "", "routeBean", "route", "showLoading", "Companion", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.wiki.b */
public final class WikiRouteInterceptorV3 extends AbstractC10737b {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f21328a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiRouteInterceptorV3.class), "v1Router", "getV1Router()Lcom/bytedance/ee/bear/wiki/route/WikiRouteInterceptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiRouteInterceptorV3.class), "v2Router", "getV2Router()Lcom/bytedance/ee/bear/wikiv2/route/WikiRouteInterceptorV2;"))};

    /* renamed from: c */
    public static final Companion f21329c = new Companion(null);

    /* renamed from: b */
    public UDToastImpl f21330b;

    /* renamed from: e */
    private final Lazy f21331e;

    /* renamed from: f */
    private final Lazy f21332f;

    /* renamed from: g */
    private Runnable f21333g;

    /* renamed from: c */
    private final C11928b m31681c() {
        Lazy lazy = this.f21331e;
        KProperty kProperty = f21328a[0];
        return (C11928b) lazy.getValue();
    }

    /* renamed from: d */
    private final C12340b m31682d() {
        Lazy lazy = this.f21332f;
        KProperty kProperty = f21328a[1];
        return (C12340b) lazy.getValue();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        Intrinsics.checkParameterIsNotNull(bearUrl, "bearUrl");
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/integrator/wiki/WikiRouteInterceptorV3$Companion;", "", "()V", "TAG", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$c */
    public static final class C7929c implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ WikiRouteInterceptorV3 f21335a;

        C7929c(WikiRouteInterceptorV3 bVar) {
            this.f21335a = bVar;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            this.f21335a.mo30791b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wiki/route/WikiRouteInterceptor;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$g */
    static final class C7933g extends Lambda implements Function0<C11928b> {
        final /* synthetic */ C10917c $serviceContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7933g(C10917c cVar) {
            super(0);
            this.$serviceContext = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11928b invoke() {
            return new C11928b(this.$serviceContext);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/route/WikiRouteInterceptorV2;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$h */
    static final class C7934h extends Lambda implements Function0<C12340b> {
        final /* synthetic */ C10917c $serviceContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7934h(C10917c cVar) {
            super(0);
            this.$serviceContext = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C12340b invoke() {
            return new C12340b(this.$serviceContext, new AbstractC10738c[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/bear/integrator/wiki/WikiRouteInterceptorV3$showLoading$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$f */
    public static final class RunnableC7932f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f21342a;

        /* renamed from: b */
        final /* synthetic */ WikiRouteInterceptorV3 f21343b;

        RunnableC7932f(Activity activity, WikiRouteInterceptorV3 bVar) {
            this.f21342a = activity;
            this.f21343b = bVar;
        }

        public final void run() {
            this.f21343b.f21330b = UDLoadingToast.m92577a(this.f21342a, R.string.Doc_Facade_Loading);
            UDToastImpl dVar = this.f21343b.f21330b;
            if (dVar != null) {
                dVar.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo30789a() {
        Activity b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17294b();
        if (b != null) {
            RunnableC7932f fVar = new RunnableC7932f(b, this);
            this.f21333g = fVar;
            C13748k.m55733a(fVar, 400);
        }
    }

    /* renamed from: b */
    public final void mo30791b() {
        C13748k.m55735c(this.f21333g);
        UDToastImpl dVar = this.f21330b;
        if (dVar != null) {
            dVar.cancel();
        }
        this.f21333g = null;
        this.f21330b = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$b */
    public static final class C7928b<T> implements Consumer<AbstractC70022d> {

        /* renamed from: a */
        final /* synthetic */ WikiRouteInterceptorV3 f21334a;

        C7928b(WikiRouteInterceptorV3 bVar) {
            this.f21334a = bVar;
        }

        /* renamed from: a */
        public final void accept(AbstractC70022d dVar) {
            this.f21334a.mo30789a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "ver", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$d */
    public static final class C7930d<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ WikiRouteInterceptorV3 f21336a;

        /* renamed from: b */
        final /* synthetic */ BearUrl f21337b;

        /* renamed from: c */
        final /* synthetic */ RouteBean f21338c;

        C7930d(WikiRouteInterceptorV3 bVar, BearUrl bearUrl, RouteBean routeBean) {
            this.f21336a = bVar;
            this.f21337b = bearUrl;
            this.f21338c = routeBean;
        }

        /* renamed from: a */
        public final void accept(String str) {
            WikiRouteInterceptorV3 bVar = this.f21336a;
            Intrinsics.checkExpressionValueIsNotNull(str, "ver");
            bVar.mo30790a(str, this.f21337b, this.f21338c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.wiki.b$e */
    public static final class C7931e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiRouteInterceptorV3 f21339a;

        /* renamed from: b */
        final /* synthetic */ BearUrl f21340b;

        /* renamed from: c */
        final /* synthetic */ RouteBean f21341c;

        C7931e(WikiRouteInterceptorV3 bVar, BearUrl bearUrl, RouteBean routeBean) {
            this.f21339a = bVar;
            this.f21340b = bearUrl;
            this.f21341c = routeBean;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("WikiRouteInterceptorV3", "getWikiVersion err. ", th);
            this.f21339a.mo30790a("0", this.f21340b, this.f21341c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiRouteInterceptorV3(C10917c cVar, AbstractC10738c... cVarArr) {
        super(cVar, (AbstractC10738c[]) Arrays.copyOf(cVarArr, cVarArr.length));
        Intrinsics.checkParameterIsNotNull(cVarArr, "highPriorityInterceptors");
        this.f21331e = LazyKt.lazy(new C7933g(cVar));
        this.f21332f = LazyKt.lazy(new C7934h(cVar));
    }

    /* renamed from: b */
    public void mo30792b(BearUrl bearUrl, RouteBean routeBean) {
        String str;
        Bundle t;
        Intrinsics.checkParameterIsNotNull(bearUrl, "bearUrl");
        if (!TextUtils.isEmpty(bearUrl.f17447b)) {
            if (routeBean == null || (t = routeBean.mo40634t()) == null) {
                str = null;
            } else {
                str = t.getString("wiki_version");
            }
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                mo30790a(str, bearUrl, routeBean);
                return;
            }
            C13479a.m54764b("WikiRouteInterceptorV3", "Empty input version, pull WikiVersion. ");
            IWiki aVar = (IWiki) KoinJavaComponent.m268613a(IWiki.class, null, null, 6, null);
            String str2 = bearUrl.f17447b;
            if (str2 == null) {
                str2 = "";
            }
            aVar.mo21064a("", str2).mo238013c(new C7928b(this)).mo237995a(new C7929c(this)).mo238001b(new C7930d(this, bearUrl, routeBean), new C7931e(this, bearUrl, routeBean));
        }
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        Intrinsics.checkParameterIsNotNull(bearUrl, "bearUrl");
        if (!((IWiki) KoinJavaComponent.m268613a(IWiki.class, null, null, 6, null)).mo21072d()) {
            C13479a.m54775e("WikiRouteInterceptorV3", "WikiV3 disabled, return. ");
            return false;
        } else if (!C5171a.m21156e(bearUrl)) {
            return false;
        } else {
            C13479a.m54764b("WikiRouteInterceptorV3", "WikiV3 enabled, dispatch url. " + bearUrl.f17446a);
            if (mo40642c(bearUrl, routeBean)) {
                return true;
            }
            mo30792b(bearUrl, routeBean);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo30790a(String str, BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("WikiRouteInterceptorV3", "doRoute, version: " + str);
        if (routeBean == null) {
            routeBean = new RouteBean();
        }
        Bundle t = routeBean.mo40634t();
        if (t == null) {
            t = new Bundle();
        }
        t.putString("wiki_version", str);
        routeBean.mo40613b(t);
        int hashCode = str.hashCode();
        if (hashCode != 49) {
            if (hashCode == 50 && str.equals("2")) {
                m31682d().mo47036b(bearUrl, routeBean);
                return;
            }
        } else if (str.equals("1")) {
            m31681c().mo45835b(bearUrl, routeBean);
            return;
        }
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17287a();
    }
}

package com.bytedance.ee.bear.templates.preview.announce;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.AbstractC11437a;
import com.bytedance.ee.bear.thread.C11678b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
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
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u0000 k2\u00020\u0001:\u0003klmB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\n\u0010Q\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0RH\u0016J\n\u0010S\u001a\u0004\u0018\u00010'H\u0016J\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0RJ\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VH\u0002J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u00142\u0006\u0010[\u001a\u00020\u001bJ\u0006\u0010\\\u001a\u00020YJ\u0006\u0010]\u001a\u00020YJ\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020_0V2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u0004H\u0002J\u0010\u0010b\u001a\u00020Y2\u0006\u0010c\u001a\u00020dH\u0002J\u0006\u0010e\u001a\u00020YJ\u0006\u0010f\u001a\u00020YJ\u0010\u0010g\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0014H\u0002J\u0015\u0010h\u001a\u00020Y2\b\u0010i\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010jR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0013X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001b\u00103\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b7\u0010\u0011\u001a\u0004\b5\u00106R\u001c\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R0\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020@0?j\b\u0012\u0004\u0012\u00020@`A0\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR\u001a\u0010D\u001a\u00020EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010KX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006n"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel;", "Lcom/bytedance/ee/bear/templates/BaseAnnounceTemplateViewModel;", "()V", "announceToken", "", "getAnnounceToken", "()Ljava/lang/String;", "setAnnounceToken", "(Ljava/lang/String;)V", "announceUrl", "getAnnounceUrl", "setAnnounceUrl", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "currTemplatePos", "Landroidx/lifecycle/MutableLiveData;", "", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "netService$delegate", "panelActive", "", "getPanelActive", "()Landroidx/lifecycle/MutableLiveData;", "setPanelActive", "(Landroidx/lifecycle/MutableLiveData;)V", "panelDelegate", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$PanelDelegate;", "getPanelDelegate", "()Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$PanelDelegate;", "setPanelDelegate", "(Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$PanelDelegate;)V", "panelLocOnScreen", "", "getPanelLocOnScreen", "()[I", "setPanelLocOnScreen", "([I)V", "previewActive", "previewTemplateView", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnouncePreviewTemplateView;", "getPreviewTemplateView", "()Lcom/bytedance/ee/bear/templates/preview/announce/AnnouncePreviewTemplateView;", "setPreviewTemplateView", "(Lcom/bytedance/ee/bear/templates/preview/announce/AnnouncePreviewTemplateView;)V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "templateData", "Lcom/bytedance/ee/bear/templates/preview/announce/TemplateData;", "getTemplateData", "()Lcom/bytedance/ee/bear/templates/preview/announce/TemplateData;", "setTemplateData", "(Lcom/bytedance/ee/bear/templates/preview/announce/TemplateData;)V", "templates", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "Lkotlin/collections/ArrayList;", "getTemplates", "setTemplates", "titleBarHeight", "", "getTitleBarHeight", "()F", "setTitleBarHeight", "(F)V", "viewDelegate", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$ViewDelegate;)V", "getCurrTemplatePos", "getCurrTemplateToken", "Landroidx/lifecycle/LiveData;", "getPanelLocOnScreenS", "getPreviewActive", "loadAnnounceTemplates", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults;", "loadAnnounceUrl", "", "pos", "addToTask", "loadCardData", "loadTemplateDataFromNet", "loadUseTemplateDataFromNet", "Lcom/bytedance/ee/bear/templates/preview/announce/UsedTemplateResult;", "docToken", "templateToken", "notifyFailed", "throwable", "", "onClickHidePanel", "onRefreshUI", "setCurrTemplatePos", "setPreviewActive", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "Companion", "PanelDelegate", "ViewDelegate", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.announce.c */
public final class AnnounceTemplateViewModel extends AbstractC11437a {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnnounceTemplateViewModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnnounceTemplateViewModel.class), "netService", "getNetService()Lcom/bytedance/ee/bear/contract/NetService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnnounceTemplateViewModel.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};
    public static final Companion Companion = new Companion(null);
    private String announceToken;
    private String announceUrl;
    private final Lazy compositeDisposable$delegate = LazyKt.lazy(C11552d.INSTANCE);
    private C1177w<Integer> currTemplatePos = new C1177w<>(-1);
    private final Lazy netService$delegate = LazyKt.lazy(C11561m.INSTANCE);
    private C1177w<Boolean> panelActive = new C1177w<>();
    private PanelDelegate panelDelegate;
    private int[] panelLocOnScreen;
    private C1177w<Boolean> previewActive = new C1177w<>();
    private AnnouncePreviewTemplateView previewTemplateView;
    private final Lazy serviceContext$delegate = LazyKt.lazy(C11562n.INSTANCE);
    private TemplateData templateData;
    private C1177w<ArrayList<AnnounceTemplate>> templates = new C1177w<>();
    private float titleBarHeight;
    private ViewDelegate viewDelegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$PanelDelegate;", "", "onClickHidePanel", "", "onRefreshUI", "onRemoveFragment", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$b */
    public interface PanelDelegate {
        /* renamed from: a */
        void mo44315a();

        /* renamed from: b */
        void mo44316b();

        /* renamed from: c */
        void mo44317c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$ViewDelegate;", "", "onStartAnimator", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$c */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo44408a();
    }

    private final C68289a getCompositeDisposable() {
        Lazy lazy = this.compositeDisposable$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (C68289a) lazy.getValue();
    }

    private final NetService getNetService() {
        Lazy lazy = this.netService$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (NetService) lazy.getValue();
    }

    private final C10917c getServiceContext() {
        Lazy lazy = this.serviceContext$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C10917c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel$Companion;", "", "()V", "ANNOUNCE_RECOMMEND_TEMPLATE_API_PATH", "", "BACK_STACK_MARK", "SELECTED_USED_TEMPLATE_API_PATH", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getAnnounceToken() {
        return this.announceToken;
    }

    public final String getAnnounceUrl() {
        return this.announceUrl;
    }

    public final C1177w<Integer> getCurrTemplatePos() {
        return this.currTemplatePos;
    }

    @Override // com.bytedance.ee.bear.templates.AbstractC11437a
    /* renamed from: getPanelActive  reason: collision with other method in class */
    public final C1177w<Boolean> m269993getPanelActive() {
        return this.panelActive;
    }

    public final PanelDelegate getPanelDelegate() {
        return this.panelDelegate;
    }

    public final int[] getPanelLocOnScreen() {
        return this.panelLocOnScreen;
    }

    @Override // com.bytedance.ee.bear.templates.AbstractC11437a
    public int[] getPanelLocOnScreenS() {
        return this.panelLocOnScreen;
    }

    public final AnnouncePreviewTemplateView getPreviewTemplateView() {
        return this.previewTemplateView;
    }

    public final TemplateData getTemplateData() {
        return this.templateData;
    }

    public final C1177w<ArrayList<AnnounceTemplate>> getTemplates() {
        return this.templates;
    }

    public final float getTitleBarHeight() {
        return this.titleBarHeight;
    }

    public final ViewDelegate getViewDelegate() {
        return this.viewDelegate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$d */
    static final class C11552d extends Lambda implements Function0<C68289a> {
        public static final C11552d INSTANCE = new C11552d();

        C11552d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    @Override // com.bytedance.ee.bear.templates.AbstractC11437a
    public LiveData<Boolean> getPanelActive() {
        return this.panelActive;
    }

    public final LiveData<Boolean> getPreviewActive() {
        return this.previewActive;
    }

    public final void onClickHidePanel() {
        PanelDelegate bVar = this.panelDelegate;
        if (bVar != null) {
            bVar.mo44317c();
        }
    }

    public final void onRefreshUI() {
        PanelDelegate bVar = this.panelDelegate;
        if (bVar != null) {
            bVar.mo44315a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$m */
    static final class C11561m extends Lambda implements Function0<NetService> {
        public static final C11561m INSTANCE = new C11561m();

        C11561m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetService invoke() {
            return (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$n */
    static final class C11562n extends Lambda implements Function0<C10917c> {
        public static final C11562n INSTANCE = new C11562n();

        C11562n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    public final void loadCardData() {
        getCompositeDisposable().mo237937a(loadAnnounceTemplates().mo238001b(new C11555g(this), new C11556h(this)));
    }

    private final String getCurrTemplateToken() {
        int i;
        ArrayList<AnnounceTemplate> b;
        ArrayList<AnnounceTemplate> b2 = this.templates.mo5927b();
        if (b2 != null) {
            i = b2.size();
        } else {
            i = 0;
        }
        if (i <= 0 || (b = this.templates.mo5927b()) == null) {
            return null;
        }
        Integer b3 = this.currTemplatePos.mo5927b();
        if (b3 == null) {
            b3 = 0;
        }
        AnnounceTemplate announceTemplate = b.get(b3.intValue());
        if (announceTemplate != null) {
            return announceTemplate.getObjToken();
        }
        return null;
    }

    private final AbstractC68307f<AnnounceTemplateResults> loadAnnounceTemplates() {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/recommend_bottom/");
        fVar.mo20145a("platform", "group_announcement");
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        fVar.mo20145a("obj_type", String.valueOf(aVar.mo32555b()));
        fVar.mo20145a("obj_token", this.announceToken);
        fVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "4");
        fVar.mo20145a("scene", "");
        fVar.mo20145a("num", "0");
        fVar.mo20143a(2);
        AbstractC68307f<AnnounceTemplateResults> a = getNetService().mo20117a(C11553e.f31130a).mo20141a(fVar).mo238029f(C11554f.f31131a).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "netService.createPuller<…rSchedulers.mainThread())");
        return a;
    }

    public final void loadTemplateDataFromNet() {
        String currTemplateToken = getCurrTemplateToken();
        if (!TextUtils.isEmpty(currTemplateToken) && !TextUtils.isEmpty(this.announceToken)) {
            String str = this.announceToken;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (currTemplateToken == null) {
                Intrinsics.throwNpe();
            }
            getCompositeDisposable().mo237937a(loadUseTemplateDataFromNet(str, currTemplateToken).mo238001b(new C11557i(this), new C11558j(this)));
        }
    }

    public final void setAnnounceToken(String str) {
        this.announceToken = str;
    }

    public final void setAnnounceUrl(String str) {
        this.announceUrl = str;
    }

    public final void setPanelDelegate(PanelDelegate bVar) {
        this.panelDelegate = bVar;
    }

    public final void setPanelLocOnScreen(int[] iArr) {
        this.panelLocOnScreen = iArr;
    }

    public final void setPreviewTemplateView(AnnouncePreviewTemplateView aVar) {
        this.previewTemplateView = aVar;
    }

    public final void setTemplateData(TemplateData templateData2) {
        this.templateData = templateData2;
    }

    public final void setTitleBarHeight(float f) {
        this.titleBarHeight = f;
    }

    public final void setViewDelegate(ViewDelegate cVar) {
        this.viewDelegate = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$e */
    public static final class C11553e<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<AnnounceTemplateResults> {

        /* renamed from: a */
        public static final C11553e f31130a = new C11553e();

        C11553e() {
        }

        /* renamed from: a */
        public final AnnounceTemplateResults parse(String str) {
            return AnnounceTemplateResults.Companion.mo44332a(str);
        }
    }

    public final void notifyFailed(Throwable th) {
        this.templates.mo5929b((ArrayList<AnnounceTemplate>) null);
    }

    public final void setPanelActive(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.panelActive = wVar;
    }

    public final void setPreviewActive(Boolean bool) {
        this.previewActive.mo5929b(bool);
    }

    public final void setTemplates(C1177w<ArrayList<AnnounceTemplate>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.templates = wVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$f */
    public static final class C11554f<T, R> implements Function<Throwable, AnnounceTemplateResults> {

        /* renamed from: a */
        public static final C11554f f31131a = new C11554f();

        C11554f() {
        }

        /* renamed from: a */
        public final AnnounceTemplateResults apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            return new AnnounceTemplateResults(new ArrayList(), th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$h */
    public static final class C11556h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AnnounceTemplateViewModel f31133a;

        C11556h(AnnounceTemplateViewModel cVar) {
            this.f31133a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "t");
            this.f31133a.notifyFailed(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "t", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$j */
    static final class C11558j<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AnnounceTemplateViewModel f31135a;

        C11558j(AnnounceTemplateViewModel cVar) {
            this.f31135a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "t");
            this.f31135a.notifyFailed(th);
        }
    }

    private final void setCurrTemplatePos(int i) {
        getCurrTemplatePos().mo5929b(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateResults;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$g */
    public static final class C11555g<T> implements Consumer<AnnounceTemplateResults> {

        /* renamed from: a */
        final /* synthetic */ AnnounceTemplateViewModel f31132a;

        C11555g(AnnounceTemplateViewModel cVar) {
            this.f31132a = cVar;
        }

        /* renamed from: a */
        public final void accept(AnnounceTemplateResults announceTemplateResults) {
            if (announceTemplateResults.getErr() != null) {
                this.f31132a.notifyFailed(announceTemplateResults.getErr());
            } else {
                this.f31132a.getTemplates().mo5929b(announceTemplateResults.getTemplates());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/preview/announce/UsedTemplateResult;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$l */
    public static final class C11560l<T, R> implements Function<Throwable, UsedTemplateResult> {

        /* renamed from: a */
        public static final C11560l f31137a = new C11560l();

        C11560l() {
        }

        /* renamed from: a */
        public final UsedTemplateResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            Log.e("AnnounceTemplateViewModel", "loadUseTemplateDataFromNet: ", th);
            return new UsedTemplateResult(null, -1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/preview/announce/UsedTemplateResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$i */
    static final class C11557i<T> implements Consumer<UsedTemplateResult> {

        /* renamed from: a */
        final /* synthetic */ AnnounceTemplateViewModel f31134a;

        C11557i(AnnounceTemplateViewModel cVar) {
            this.f31134a = cVar;
        }

        /* renamed from: a */
        public final void accept(UsedTemplateResult usedTemplateResult) {
            if (usedTemplateResult.code != 0) {
                AnnounceTemplateViewModel cVar = this.f31134a;
                cVar.notifyFailed(new Throwable("result  data error! code = " + usedTemplateResult.code + " message = " + usedTemplateResult.msg));
                return;
            }
            this.f31134a.setPreviewActive(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/preview/announce/UsedTemplateResult;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.c$k */
    public static final class C11559k<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<UsedTemplateResult> {

        /* renamed from: a */
        public static final C11559k f31136a = new C11559k();

        C11559k() {
        }

        /* renamed from: a */
        public final UsedTemplateResult parse(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.e("AnnounceTemplateViewModel", "loadUseTemplateDataFromNet: result data null!");
                return new UsedTemplateResult(null, -1);
            }
            JSONObject jSONObject = new JSONObject(str);
            return new UsedTemplateResult(jSONObject.optString("ObjToken"), jSONObject.optInt("NewRev"));
        }
    }

    private final AbstractC68307f<UsedTemplateResult> loadUseTemplateDataFromNet(String str, String str2) {
        Integer num;
        Integer num2;
        NetService.C5077f fVar = new NetService.C5077f("/space/api/obj_template/template_insert/");
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str);
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        hashMap.put("obj_type", String.valueOf(aVar.mo32555b()));
        hashMap.put("template_obj_token", str2);
        hashMap.put("base_rev", "0");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        int i = 0;
        TemplateData templateData2 = this.templateData;
        if (templateData2 != null) {
            Integer num3 = null;
            if (templateData2 != null) {
                num2 = Integer.valueOf(templateData2.getPosition());
            } else {
                num2 = null;
            }
            TemplateData templateData3 = this.templateData;
            if (templateData3 != null) {
                num3 = Integer.valueOf(templateData3.getBaseRev());
            }
            num = num3;
            i = num2;
        } else {
            num = 0;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "position", (Object) i);
        jSONObject2.put((Object) "bese_rev", (Object) num);
        String jSONString = JSON.toJSONString(jSONObject);
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(extra)");
        hashMap.put("extra", jSONString);
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        AbstractC68307f<UsedTemplateResult> f = getNetService().mo20117a(C11559k.f31136a).mo20141a(fVar).mo238029f(C11560l.f31137a);
        Intrinsics.checkExpressionValueIsNotNull(f, "netService.createPuller<…esult(null, -1)\n        }");
        return f;
    }

    public final void loadAnnounceUrl(int i, boolean z) {
        AnnounceTemplate announceTemplate;
        String str;
        if (this.templates.mo5927b() != null && i >= 0) {
            ArrayList<AnnounceTemplate> b = this.templates.mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            if (i < b.size()) {
                setCurrTemplatePos(i);
                ArrayList<AnnounceTemplate> b2 = this.templates.mo5927b();
                if (b2 != null) {
                    announceTemplate = b2.get(i);
                } else {
                    announceTemplate = null;
                }
                if (announceTemplate == null || announceTemplate.getEnable()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("addToBackStack", z);
                    RouteBean routeBean = new RouteBean();
                    routeBean.mo40613b(bundle);
                    C6313i a = C6313i.m25327a();
                    C8275a aVar = C8275a.f22371d;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
                    String a2 = aVar.mo32553a();
                    if (announceTemplate != null) {
                        str = announceTemplate.getObjToken();
                    } else {
                        str = null;
                    }
                    ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(a.mo25382a(a2, str, "template_preview") + "&template_preview_source=announce", routeBean);
                }
            }
        }
    }
}

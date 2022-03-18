package com.bytedance.ee.bear.templates.preview.single;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.preview.data.CommonPreviewTemplateData;
import com.bytedance.ee.bear.templates.preview.data.Item;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u0004\u0018\u00010\u001dJ\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150+J\u0010\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010#J\u0006\u0010/\u001a\u00020-J\u0016\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\u001dH\u0002J\u0006\u00104\u001a\u00020-J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u0013H\u0002J\u0015\u00107\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020-2\u0006\u00106\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006="}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplateViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "commonPreviewTemplateData", "Lcom/bytedance/ee/bear/templates/preview/data/CommonPreviewTemplateData;", "commonPreviewTemplateView", "Lcom/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView;", "getCommonPreviewTemplateView", "()Lcom/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView;", "setCommonPreviewTemplateView", "(Lcom/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "currTemplatePos", "Landroidx/lifecycle/MutableLiveData;", "", "previewActive", "", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "templates", "", "Lcom/bytedance/ee/bear/templates/preview/data/Item;", "getTemplates", "()Ljava/util/List;", "setTemplates", "(Ljava/util/List;)V", ShareHitPoint.f121869d, "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getCurrTemplate", "getCurrTemplatePos", "getPreviewActive", "Landroidx/lifecycle/LiveData;", "initTemplates", "", "json", "loadTemplateDataFromNet", "loadUseTemplateDataFromNet", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "onBackPressed", "setCurrTemplatePos", "pos", "setPreviewActive", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "showOtherTemplate", "last", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.single.c */
public final class CommonTemplateViewModel extends AbstractC1142af {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommonTemplateViewModel.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommonTemplateViewModel.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};
    public static final Companion Companion = new Companion(null);
    public CommonPreviewTemplateData commonPreviewTemplateData;
    private CommonPreviewTemplateView commonPreviewTemplateView;
    private final Lazy compositeDisposable$delegate = LazyKt.lazy(C11587b.INSTANCE);
    private C1177w<Integer> currTemplatePos = new C1177w<>(-1);
    private C1177w<Boolean> previewActive = new C1177w<>();
    private final Lazy serviceContext$delegate = LazyKt.lazy(C11590e.INSTANCE);
    private List<Item> templates = new ArrayList();
    private String type;

    private final C68289a getCompositeDisposable() {
        Lazy lazy = this.compositeDisposable$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (C68289a) lazy.getValue();
    }

    private final C10917c getServiceContext() {
        Lazy lazy = this.serviceContext$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C10917c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplateViewModel$Companion;", "", "()V", "BACK_STACK_MARK", "", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final CommonPreviewTemplateView getCommonPreviewTemplateView() {
        return this.commonPreviewTemplateView;
    }

    public final C1177w<Integer> getCurrTemplatePos() {
        return this.currTemplatePos;
    }

    public final List<Item> getTemplates() {
        return this.templates;
    }

    public final String getType() {
        return this.type;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/disposables/CompositeDisposable;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.c$b */
    static final class C11587b extends Lambda implements Function0<C68289a> {
        public static final C11587b INSTANCE = new C11587b();

        C11587b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C68289a invoke() {
            return new C68289a();
        }
    }

    public final LiveData<Boolean> getPreviewActive() {
        return this.previewActive;
    }

    public final void onBackPressed() {
        getCompositeDisposable().dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.c$e */
    static final class C11590e extends Lambda implements Function0<C10917c> {
        public static final C11590e INSTANCE = new C11590e();

        C11590e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    public final Item getCurrTemplate() {
        if (this.templates.size() <= 0) {
            return null;
        }
        List<Item> list = this.templates;
        Integer b = this.currTemplatePos.mo5927b();
        if (b == null) {
            b = 0;
        }
        return list.get(b.intValue());
    }

    public final void loadTemplateDataFromNet() {
        Item currTemplate = getCurrTemplate();
        if (currTemplate == null) {
            Log.i("CommonTemplateViewModel", "template == null");
            return;
        }
        getCompositeDisposable().mo237937a(loadUseTemplateDataFromNet(currTemplate).mo238001b(new C11588c(this, currTemplate), C11589d.f31211a));
        CommonTemplatePreviewAnalytic.f31207b.mo44510a(currTemplate, this.commonPreviewTemplateData);
    }

    public final void setCommonPreviewTemplateView(CommonPreviewTemplateView aVar) {
        this.commonPreviewTemplateView = aVar;
    }

    public final void setType(String str) {
        this.type = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.c$d */
    public static final class C11589d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C11589d f31211a = new C11589d();

        C11589d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Log.e("CommonTemplateViewModel", "loadTemplateDataFromNet: ", th);
        }
    }

    public final void setPreviewActive(Boolean bool) {
        this.previewActive.mo5929b(bool);
    }

    public final void setTemplates(List<Item> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.templates = list;
    }

    private final void setCurrTemplatePos(int i) {
        getCurrTemplatePos().mo5929b(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.c$c */
    public static final class C11588c<T> implements Consumer<DocumentCreateInfo> {

        /* renamed from: a */
        final /* synthetic */ CommonTemplateViewModel f31209a;

        /* renamed from: b */
        final /* synthetic */ Item f31210b;

        C11588c(CommonTemplateViewModel cVar, Item item) {
            this.f31209a = cVar;
            this.f31210b = item;
        }

        /* renamed from: a */
        public final void accept(DocumentCreateInfo documentCreateInfo) {
            this.f31209a.setPreviewActive(false);
            Bundle bundle = new Bundle();
            bundle.putBoolean("addToBackStack", false);
            RouteBean routeBean = new RouteBean();
            routeBean.mo40613b(bundle);
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(documentCreateInfo.f14845d, routeBean);
            CommonTemplatePreviewAnalytic.f31207b.mo44511a(this.f31210b, documentCreateInfo.f14843b, this.f31209a.commonPreviewTemplateData);
        }
    }

    public final void initTemplates(String str) {
        if (str != null) {
            CommonPreviewTemplateData commonPreviewTemplateData2 = (CommonPreviewTemplateData) JSON.parseObject(str, CommonPreviewTemplateData.class);
            this.commonPreviewTemplateData = commonPreviewTemplateData2;
            if (commonPreviewTemplateData2 != null) {
                this.templates.addAll(commonPreviewTemplateData2.getList());
                setCurrTemplatePos(commonPreviewTemplateData2.getInitIndex());
            }
        }
    }

    private final AbstractC68307f<DocumentCreateInfo> loadUseTemplateDataFromNet(Item item) {
        String str;
        String str2;
        boolean z;
        DocumentCreateHelper documentCreateHelper = new DocumentCreateHelper(getServiceContext());
        String objToken = item.getObjToken();
        int objType = item.getObjType();
        CommonPreviewTemplateData commonPreviewTemplateData2 = this.commonPreviewTemplateData;
        if (commonPreviewTemplateData2 == null || (str = commonPreviewTemplateData2.getParentToken()) == null) {
            str = "";
        }
        CommonPreviewTemplateData commonPreviewTemplateData3 = this.commonPreviewTemplateData;
        if (commonPreviewTemplateData3 == null || (str2 = commonPreviewTemplateData3.getModule()) == null) {
            str2 = "";
        }
        if (item.getSource() == 1) {
            z = true;
        } else {
            z = false;
        }
        AbstractC68307f<DocumentCreateInfo> a = documentCreateHelper.mo31351a(objToken, objType, str, true, str2, z, "preview_create");
        Intrinsics.checkExpressionValueIsNotNull(a, "DocumentCreateHelper(ser…e == 1, \"preview_create\")");
        return a;
    }

    public final void showOtherTemplate(int i, boolean z) {
        if (i < 0 || i >= this.templates.size()) {
            Log.i("CommonTemplateViewModel", "showOtherTemplate pos is illegal");
            return;
        }
        setCurrTemplatePos(i);
        Item item = this.templates.get(i);
        Bundle bundle = new Bundle();
        bundle.putBoolean("addToBackStack", false);
        RouteBean routeBean = new RouteBean();
        routeBean.mo40613b(bundle);
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(C6313i.m25327a().mo25382a(C8275a.m34050a(item.getObjType()), item.getObjToken(), "template_preview") + "&template_preview_source=" + this.type, routeBean);
        if (z) {
            CommonTemplatePreviewAnalytic.f31207b.mo44515d(item);
        } else {
            CommonTemplatePreviewAnalytic.f31207b.mo44514c(item);
        }
    }
}

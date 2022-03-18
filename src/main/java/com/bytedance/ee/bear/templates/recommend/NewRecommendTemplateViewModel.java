package com.bytedance.ee.bear.templates.recommend;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.templates.TemplateV4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/templates/recommend/NewRecommendTemplateViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "selectedTemplate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "getSelectedTemplate", "()Landroidx/lifecycle/MutableLiveData;", "selectedTemplate$delegate", "Lkotlin/Lazy;", "Landroidx/lifecycle/LiveData;", "setSelectedTemplate", "", "template", "fromRecommend", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.recommend.f */
public final class NewRecommendTemplateViewModel extends AbstractC1142af {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NewRecommendTemplateViewModel.class), "selectedTemplate", "getSelectedTemplate()Landroidx/lifecycle/MutableLiveData;"))};
    private final Lazy selectedTemplate$delegate = LazyKt.lazy(C11609a.INSTANCE);

    private final C1177w<TemplateV4> getSelectedTemplate() {
        Lazy lazy = this.selectedTemplate$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C1177w) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.recommend.f$a */
    static final class C11609a extends Lambda implements Function0<C1177w<TemplateV4>> {
        public static final C11609a INSTANCE = new C11609a();

        C11609a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<TemplateV4> invoke() {
            return new C1177w<>();
        }
    }

    /* renamed from: getSelectedTemplate  reason: collision with other method in class */
    public final LiveData<TemplateV4> m269994getSelectedTemplate() {
        return getSelectedTemplate();
    }

    public final void setSelectedTemplate(TemplateV4 templateV4, boolean z) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        getSelectedTemplate().mo5929b(templateV4);
    }
}

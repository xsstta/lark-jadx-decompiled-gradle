package com.bytedance.ee.bear.templates.search.system;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.search.base.BaseSearchModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/system/SystemModel;", "Lcom/bytedance/ee/bear/templates/search/base/BaseSearchModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "templateCenViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "getTemplateCenViewModel", "()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "templateCenViewModel$delegate", "Lkotlin/Lazy;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "offset", "", "searchKey", "", "buffer", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.d.b */
public final class SystemModel extends BaseSearchModel {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f31382b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SystemModel.class), "templateCenViewModel", "getTemplateCenViewModel()Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;"))};

    /* renamed from: c */
    private final Lazy f31383c = LazyKt.lazy(new C11653a(this));

    /* renamed from: d */
    private final FragmentActivity f31384d;

    /* renamed from: c */
    private final TemplateCenterViewModel m48379c() {
        Lazy lazy = this.f31383c;
        KProperty kProperty = f31382b[0];
        return (TemplateCenterViewModel) lazy.getValue();
    }

    /* renamed from: b */
    public final FragmentActivity mo44686b() {
        return this.f31384d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.d.b$a */
    static final class C11653a extends Lambda implements Function0<TemplateCenterViewModel> {
        final /* synthetic */ SystemModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11653a(SystemModel bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TemplateCenterViewModel invoke() {
            return (TemplateCenterViewModel) aj.m5366a(this.this$0.mo44686b()).mo6005a(TemplateCenterViewModel.class);
        }
    }

    public SystemModel(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f31384d = fragmentActivity;
    }

    @Override // com.bytedance.ee.bear.templates.search.base.ISearchListModel, com.bytedance.ee.bear.templates.search.base.BaseSearchModel
    /* renamed from: a */
    public NetService.C5076e mo44654a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        Intrinsics.checkParameterIsNotNull(str2, "buffer");
        NetService.C5076e a = super.mo44654a(i, str, str2);
        a.mo20145a(ShareHitPoint.f121868c, "1");
        a.mo20145a("template_collection", "1");
        if (m48379c().entryFormCreateNew()) {
            a.mo20145a("user_recommend", "1");
        }
        return a;
    }
}

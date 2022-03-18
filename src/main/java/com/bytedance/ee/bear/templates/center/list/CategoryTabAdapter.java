package com.bytedance.ee.bear.templates.center.list;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.LayoutType;
import com.bytedance.ee.bear.templates.TemplateAdapter;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter$TempGroupViewHolder;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "itemClickListener", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "form", "", ShareHitPoint.f121869d, "", "(Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;Ljava/lang/String;I)V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "convert", "", "helper", "item", "TempGroupViewHolder", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.c */
public final class CategoryTabAdapter extends BaseQuickAdapter<Category, TempGroupViewHolder> {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30946a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CategoryTabAdapter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    private final Lazy f30947b;

    /* renamed from: c */
    private final LifecycleOwner f30948c;

    /* renamed from: d */
    private final TemplateAdapter.TemplateClickListener f30949d;

    /* renamed from: e */
    private final String f30950e;

    /* renamed from: f */
    private final int f30951f;

    /* renamed from: a */
    private final C10917c m47878a() {
        Lazy lazy = this.f30947b;
        KProperty kProperty = f30946a[0];
        return (C10917c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c$b */
    static final class C11506b extends Lambda implements Function0<C10917c> {
        public static final C11506b INSTANCE = new C11506b();

        C11506b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/CategoryTabAdapter$TempGroupViewHolder;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "category", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "itemClickListener", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "form", "", ShareHitPoint.f121869d, "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.c$a */
    public static final class TempGroupViewHolder extends C20923c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TempGroupViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }

        /* renamed from: a */
        public final void mo44212a(LifecycleOwner lifecycleOwner, C10917c cVar, Category category, TemplateAdapter.TemplateClickListener bVar, String str, int i) {
            boolean z;
            int i2;
            LayoutType layoutType;
            Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            Intrinsics.checkParameterIsNotNull(category, "category");
            Intrinsics.checkParameterIsNotNull(bVar, "itemClickListener");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.groupName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.groupName");
            if (category.getName().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.groupName);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.groupName");
            textView2.setText(category.getName());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.templates);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "templates");
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            recyclerView.setLayoutManager(new GridLayoutManager(view4.getContext(), 2));
            if (recyclerView.getItemDecorationCount() <= 0) {
                recyclerView.addItemDecoration(new C11510d(C13749l.m55736a() - C11510d.f30971b));
            }
            boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.template_optimization_v5", false);
            C13479a.m54764b("CategoryTabAdapter", "fg = " + a);
            if (a) {
                layoutType = LayoutType.TYPE_CENTER2;
            } else {
                layoutType = LayoutType.TYPE_CENTER;
            }
            TemplateAdapter cVar2 = new TemplateAdapter(lifecycleOwner, layoutType, cVar, str, i);
            recyclerView.setAdapter(cVar2);
            recyclerView.setNestedScrollingEnabled(false);
            cVar2.mo43991a(category.getTemplates());
            cVar2.mo43990a(bVar);
            if (category.getTemplates().isEmpty()) {
                View view5 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                SpaceEmptyState spaceEmptyState = (SpaceEmptyState) view5.findViewById(R.id.nodata);
                Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState, "itemView.nodata");
                spaceEmptyState.setVisibility(0);
                return;
            }
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            SpaceEmptyState spaceEmptyState2 = (SpaceEmptyState) view6.findViewById(R.id.nodata);
            Intrinsics.checkExpressionValueIsNotNull(spaceEmptyState2, "itemView.nodata");
            spaceEmptyState2.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(TempGroupViewHolder aVar, Category category) {
        Intrinsics.checkParameterIsNotNull(aVar, "helper");
        Intrinsics.checkParameterIsNotNull(category, "item");
        aVar.mo44212a(this.f30948c, m47878a(), category, this.f30949d, this.f30950e, this.f30951f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryTabAdapter(LifecycleOwner lifecycleOwner, TemplateAdapter.TemplateClickListener bVar, String str, int i) {
        super((int) R.layout.docs_template_group_item4);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(bVar, "itemClickListener");
        this.f30948c = lifecycleOwner;
        this.f30949d = bVar;
        this.f30950e = str;
        this.f30951f = i;
        this.f30947b = LazyKt.lazy(C11506b.INSTANCE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryTabAdapter(LifecycleOwner lifecycleOwner, TemplateAdapter.TemplateClickListener bVar, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, bVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i);
    }
}

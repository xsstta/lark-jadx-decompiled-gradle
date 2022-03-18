package com.ss.android.lark.search.widget.business;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fJ\u0012\u0010\u0015\u001a\u00020\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u001aJ\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u001aJ(\u0010\u001c\u001a\u00020\u00002 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\u0010R?\u0010\u0004\u001a3\u0012/\u0012-\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f0\u0005X\u0004¢\u0006\u0002\n\u0000R?\u0010\r\u001a3\u0012/\u0012-\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f0\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006j\u0002`\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/search/widget/business/ContactsSelectorBusiness;", "Lcom/ss/android/lark/search/widget/business/ICustomBusiness;", "Lcom/ss/android/lark/search/widget/dependency/SearchWidgetModuleDependency$ISearchWidgetModuleDependency$IContactsSelectorController;", "()V", "addFooterActions", "", "Lkotlin/Function1;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lkotlin/ParameterName;", "name", "list", "", "Lcom/ss/android/lark/search/widget/business/Expressions;", "addHeaderActions", "dataConverter", "Landroid/view/View;", "Lcom/ss/android/lark/search/widget/business/Converter;", "addFooterList", "adapter", "addFooterView", "v", "addHeaderList", "addHeaderView", "applyTo", "controller", "convertBack", "", "convertHead", "setConverter", "converter", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.a.a */
public final class ContactsSelectorBusiness implements ICustomBusiness<SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController> {

    /* renamed from: a */
    public Function1<? super View, ? extends RecyclerView.Adapter<?>> f133023a = C53870d.INSTANCE;

    /* renamed from: b */
    private final List<Function1<List<RecyclerView.Adapter<?>>, Unit>> f133024b = new ArrayList();

    /* renamed from: c */
    private final List<Function1<List<RecyclerView.Adapter<?>>, Unit>> f133025c = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.a.a$d */
    static final class C53870d extends Lambda implements Function1 {
        public static final C53870d INSTANCE = new C53870d();

        C53870d() {
            super(1);
        }

        public final Void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            return null;
        }
    }

    /* renamed from: b */
    public final List<RecyclerView.Adapter<?>> mo183649b() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f133025c.iterator();
        while (it.hasNext()) {
            it.next().invoke(arrayList);
        }
        return CollectionsKt.filterNotNull(arrayList);
    }

    /* renamed from: a */
    public final List<RecyclerView.Adapter<?>> mo183646a() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f133024b.iterator();
        while (it.hasNext()) {
            it.next().invoke(arrayList);
        }
        return CollectionsKt.filterNotNull(arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "list", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "invoke", "com/ss/android/lark/search/widget/business/ContactsSelectorBusiness$addFooterList$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.a.a$a */
    static final class C53867a extends Lambda implements Function1<List<RecyclerView.Adapter<?>>, Unit> {
        final /* synthetic */ RecyclerView.Adapter $adapter$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53867a(RecyclerView.Adapter adapter) {
            super(1);
            this.$adapter$inlined = adapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<RecyclerView.Adapter<?>> list) {
            invoke(list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<RecyclerView.Adapter<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            list.add(this.$adapter$inlined);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "list", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "invoke", "com/ss/android/lark/search/widget/business/ContactsSelectorBusiness$addFooterView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.a.a$b */
    static final class C53868b extends Lambda implements Function1<List<RecyclerView.Adapter<?>>, Unit> {
        final /* synthetic */ ContactsSelectorBusiness $this_apply;
        final /* synthetic */ View $v$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53868b(ContactsSelectorBusiness aVar, View view) {
            super(1);
            this.$this_apply = aVar;
            this.$v$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<RecyclerView.Adapter<?>> list) {
            invoke(list);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<androidx.recyclerview.widget.RecyclerView$Adapter<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(List<RecyclerView.Adapter<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            list.add(this.$this_apply.f133023a.invoke(this.$v$inlined));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "list", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "invoke", "com/ss/android/lark/search/widget/business/ContactsSelectorBusiness$addHeaderView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.a.a$c */
    static final class C53869c extends Lambda implements Function1<List<RecyclerView.Adapter<?>>, Unit> {
        final /* synthetic */ ContactsSelectorBusiness $this_apply;
        final /* synthetic */ View $v$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53869c(ContactsSelectorBusiness aVar, View view) {
            super(1);
            this.$this_apply = aVar;
            this.$v$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<RecyclerView.Adapter<?>> list) {
            invoke(list);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<androidx.recyclerview.widget.RecyclerView$Adapter<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(List<RecyclerView.Adapter<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            list.add(this.$this_apply.f133023a.invoke(this.$v$inlined));
        }
    }

    /* renamed from: a */
    public final ContactsSelectorBusiness mo183645a(Function1<? super View, ? extends RecyclerView.Adapter<?>> function1) {
        ContactsSelectorBusiness aVar = this;
        if (function1 != null) {
            aVar.f133023a = function1;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo183647a(SearchWidgetModuleDependency.ISearchWidgetModuleDependency.IContactsSelectorController dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "controller");
        dVar.mo102948a(this);
    }

    /* renamed from: a */
    public final ContactsSelectorBusiness mo183643a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        ContactsSelectorBusiness aVar = this;
        aVar.f133024b.add(new C53869c(aVar, view));
        return aVar;
    }

    /* renamed from: b */
    public final ContactsSelectorBusiness mo183648b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        ContactsSelectorBusiness aVar = this;
        aVar.f133025c.add(new C53868b(aVar, view));
        return aVar;
    }

    /* renamed from: a */
    public final ContactsSelectorBusiness mo183644a(RecyclerView.Adapter<?> adapter) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        ContactsSelectorBusiness aVar = this;
        aVar.f133025c.add(new C53867a(adapter));
        return aVar;
    }
}

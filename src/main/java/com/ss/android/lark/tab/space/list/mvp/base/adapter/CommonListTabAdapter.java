package com.ss.android.lark.tab.space.list.mvp.base.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.C55309d;
import com.ss.android.lark.tab.space.list.mvp.base.OnItemListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001#B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "itemClickAction", "Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter$OnItemClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter$OnItemClickListener;)V", "getContext", "()Landroid/content/Context;", "getItemClickAction", "()Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter$OnItemClickListener;", "mBinderFactory", "Lcom/ss/android/lark/tab/space/list/mvp/base/ListTabBinderFactory;", "getMBinderFactory", "()Lcom/ss/android/lark/tab/space/list/mvp/base/ListTabBinderFactory;", "mBinderFactory$delegate", "Lkotlin/Lazy;", "mBinderListener", "Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setIs24HourFormat", "is24HourFormat", "", "OnItemClickListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.b */
public final class CommonListTabAdapter<T extends BaseListViewData> extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, T> {

    /* renamed from: a */
    private final Lazy f136488a = LazyKt.lazy(new C55305b(this));

    /* renamed from: b */
    private final OnItemListener<T> f136489b = new C55306c(this);

    /* renamed from: c */
    private final Context f136490c;

    /* renamed from: d */
    private final OnItemClickListener<T> f136491d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter$OnItemClickListener;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "", "onItemClick", "", "viewData", "position", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;I)V", "onItemPartialClick", "partialClickAction", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;ILjava/lang/String;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.b$a */
    public interface OnItemClickListener<T extends BaseListViewData> {
        /* renamed from: a */
        void mo188507a(T t, int i);

        /* renamed from: a */
        void mo188508a(T t, int i, String str);
    }

    /* renamed from: c */
    private final C55309d m214490c() {
        return (C55309d) this.f136488a.getValue();
    }

    /* renamed from: a */
    public final Context mo188522a() {
        return this.f136490c;
    }

    /* renamed from: b */
    public final OnItemClickListener<T> mo188524b() {
        return this.f136491d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/space/list/mvp/base/ListTabBinderFactory;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.b$b */
    static final class C55305b extends Lambda implements Function0<C55309d> {
        final /* synthetic */ CommonListTabAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55305b(CommonListTabAdapter bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C55309d invoke() {
            return new C55309d(this.this$0.mo188522a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J'\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter$mBinderListener$1", "Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener;", "onItemClick", "", "viewData", "position", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;I)V", "onItemPartialClick", "partialClickAction", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;ILjava/lang/String;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.b$c */
    public static final class C55306c implements OnItemListener<T> {

        /* renamed from: a */
        final /* synthetic */ CommonListTabAdapter f136492a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55306c(CommonListTabAdapter bVar) {
            this.f136492a = bVar;
        }

        @Override // com.ss.android.lark.tab.space.list.mvp.base.OnItemListener
        /* renamed from: a */
        public void mo188509a(T t, int i) {
            Intrinsics.checkParameterIsNotNull(t, "viewData");
            OnItemClickListener<T> b = this.f136492a.mo188524b();
            if (b != null) {
                b.mo188507a(t, i);
            }
        }

        @Override // com.ss.android.lark.tab.space.list.mvp.base.OnItemListener
        /* renamed from: a */
        public void mo188510a(T t, int i, String str) {
            Intrinsics.checkParameterIsNotNull(t, "viewData");
            OnItemClickListener<T> b = this.f136492a.mo188524b();
            if (b != null) {
                b.mo188508a(t, i, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo188523a(boolean z) {
        m214490c().mo188539a(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BaseListViewData) getItem(i)).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        m214490c().mo188538a(viewHolder, (BaseListViewData) getItem(i), this.f136489b, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        RecyclerView.ViewHolder a = m214490c().mo188537a(i, viewGroup);
        Intrinsics.checkExpressionValueIsNotNull(a, "mBinderFactory.createViewHolder(viewType, parent)");
        return a;
    }

    public CommonListTabAdapter(Context context, OnItemClickListener<T> aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136490c = context;
        this.f136491d = aVar;
    }
}

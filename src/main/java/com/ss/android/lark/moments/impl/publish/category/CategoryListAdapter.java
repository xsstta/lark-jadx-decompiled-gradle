package com.ss.android.lark.moments.impl.publish.category;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.publish.category.MomentsCategoryListFragment;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\"\u0010\u001c\u001a\u00020\u001d2\u0010\u0010\u001e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\"\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u001e\u0010$\u001a\u00020\u001d2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0016j\b\u0012\u0004\u0012\u00020\b`\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0016j\b\u0012\u0004\u0012\u00020\b`\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/category/CategoryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment$OnClickedCategoryItemListener;", "(Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment$OnClickedCategoryItemListener;)V", "currentCheckedTag", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "getCurrentCheckedTag", "()Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "setCurrentCheckedTag", "(Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;)V", "enableInvert", "", "getEnableInvert", "()Z", "setEnableInvert", "(Z)V", "getListener", "()Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment$OnClickedCategoryItemListener;", "tagList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTagList", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTagList", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.category.a */
public final class CategoryListAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    private final ArrayList<CategoryTag> f120702a = new ArrayList<>();

    /* renamed from: b */
    private CategoryTag f120703b;

    /* renamed from: c */
    private boolean f120704c = true;

    /* renamed from: d */
    private final MomentsCategoryListFragment.OnClickedCategoryItemListener f120705d;

    /* renamed from: a */
    public final ArrayList<CategoryTag> mo167906a() {
        return this.f120702a;
    }

    /* renamed from: b */
    public final CategoryTag mo167911b() {
        return this.f120703b;
    }

    /* renamed from: c */
    public final boolean mo167912c() {
        return this.f120704c;
    }

    /* renamed from: d */
    public final MomentsCategoryListFragment.OnClickedCategoryItemListener mo167913d() {
        return this.f120705d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120702a.size();
    }

    /* renamed from: a */
    public final void mo167907a(CategoryTag categoryTag) {
        this.f120703b = categoryTag;
    }

    public CategoryListAdapter(MomentsCategoryListFragment.OnClickedCategoryItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f120705d = bVar;
    }

    /* renamed from: a */
    public final void mo167910a(boolean z) {
        this.f120704c = z;
    }

    /* renamed from: a */
    public final void mo167909a(ArrayList<CategoryTag> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "tagList");
        this.f120702a.clear();
        this.f120702a.addAll(arrayList);
        for (T t : arrayList) {
            if (t.getSelected()) {
                this.f120703b = t;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/category/CategoryListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.category.a$a */
    public static final class C47952a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ CategoryListAdapter f120706a;

        /* renamed from: b */
        final /* synthetic */ int f120707b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            CategoryTag categoryTag = this.f120706a.mo167906a().get(this.f120707b);
            Intrinsics.checkExpressionValueIsNotNull(categoryTag, "tagList[position]");
            CategoryTag categoryTag2 = categoryTag;
            if (!categoryTag2.getSelected()) {
                categoryTag2.setSelected(true);
                CategoryTag b = this.f120706a.mo167911b();
                if (b != null) {
                    b.setSelected(false);
                }
                this.f120706a.mo167907a(categoryTag2);
                this.f120706a.notifyDataSetChanged();
                this.f120706a.mo167913d().mo167921a(this.f120706a.mo167906a().get(this.f120707b).getId(), true);
            } else if (!this.f120706a.mo167912c()) {
                this.f120706a.mo167913d().mo167920a();
            } else {
                categoryTag2.setSelected(false);
                this.f120706a.mo167907a((CategoryTag) null);
                this.f120706a.notifyDataSetChanged();
                this.f120706a.mo167913d().mo167921a(this.f120706a.mo167906a().get(this.f120707b).getId(), false);
            }
        }

        C47952a(CategoryListAdapter aVar, int i) {
            this.f120706a = aVar;
            this.f120707b = i;
        }
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return CategoryListViewHolder.f120708a.mo167915a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        CategoryTag categoryTag = this.f120702a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(categoryTag, "tagList[position]");
        ((CategoryListViewHolder) aVar).mo165944a(categoryTag);
        aVar.itemView.setOnClickListener(new C47952a(this, i));
    }
}

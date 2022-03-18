package com.ss.android.lark.moments.impl.publish.category;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.publish.input.IMomentsInputPluginDelegate;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u001b2\u0010\u0010\u001c\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\"\u0010\u001e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0014\u0010\"\u001a\u00020\u001b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0#R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0012j\b\u0012\u0004\u0012\u00020\n`\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/category/PublishTagListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "inputDelegate", "Lcom/ss/android/lark/moments/impl/publish/input/IMomentsInputPluginDelegate;", "viewModel", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "(Lcom/ss/android/lark/moments/impl/publish/input/IMomentsInputPluginDelegate;Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;)V", "currentCheckedTag", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "getCurrentCheckedTag", "()Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "setCurrentCheckedTag", "(Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;)V", "getInputDelegate", "()Lcom/ss/android/lark/moments/impl/publish/input/IMomentsInputPluginDelegate;", "tagList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTagList", "()Ljava/util/ArrayList;", "getViewModel", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTagList", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.category.d */
public final class PublishTagListAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    private CategoryTag f120714a;

    /* renamed from: b */
    private final ArrayList<CategoryTag> f120715b = new ArrayList<>();

    /* renamed from: c */
    private final IMomentsInputPluginDelegate f120716c;

    /* renamed from: d */
    private final MomentsPublishViewModel f120717d;

    /* renamed from: a */
    public final CategoryTag mo167923a() {
        return this.f120714a;
    }

    /* renamed from: b */
    public final ArrayList<CategoryTag> mo167928b() {
        return this.f120715b;
    }

    /* renamed from: c */
    public final IMomentsInputPluginDelegate mo167929c() {
        return this.f120716c;
    }

    /* renamed from: d */
    public final MomentsPublishViewModel mo167930d() {
        return this.f120717d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.min(this.f120715b.size(), 6);
    }

    /* renamed from: a */
    public final void mo167925a(CategoryTag categoryTag) {
        this.f120714a = categoryTag;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/category/PublishTagListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.category.d$a */
    public static final class C47956a extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishTagListAdapter f120718a;

        /* renamed from: b */
        final /* synthetic */ int f120719b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            CategoryTag categoryTag = this.f120718a.mo167928b().get(this.f120719b);
            Intrinsics.checkExpressionValueIsNotNull(categoryTag, "tagList[position]");
            CategoryTag categoryTag2 = categoryTag;
            if (categoryTag2.getSelected()) {
                categoryTag2.setSelected(false);
                this.f120718a.mo167925a((CategoryTag) null);
            } else {
                categoryTag2.setSelected(true);
                if (true ^ Intrinsics.areEqual(categoryTag2, this.f120718a.mo167923a())) {
                    CategoryTag a = this.f120718a.mo167923a();
                    if (a != null) {
                        a.setSelected(false);
                    }
                    this.f120718a.mo167925a(categoryTag2);
                }
            }
            this.f120718a.notifyDataSetChanged();
            if (!this.f120718a.mo167929c().mo167816a()) {
                this.f120718a.mo167930d().refreshAnonymousEnable();
            }
        }

        C47956a(PublishTagListAdapter dVar, int i) {
            this.f120718a = dVar;
            this.f120719b = i;
        }
    }

    /* renamed from: a */
    public final void mo167927a(List<CategoryTag> list) {
        Intrinsics.checkParameterIsNotNull(list, "tagList");
        this.f120715b.clear();
        for (T t : list) {
            this.f120715b.add(t);
            if (t.getSelected()) {
                this.f120714a = t;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return PublishTagViewHolder.f120720a.mo167932a(viewGroup);
    }

    public PublishTagListAdapter(IMomentsInputPluginDelegate aVar, MomentsPublishViewModel momentsPublishViewModel) {
        Intrinsics.checkParameterIsNotNull(aVar, "inputDelegate");
        Intrinsics.checkParameterIsNotNull(momentsPublishViewModel, "viewModel");
        this.f120716c = aVar;
        this.f120717d = momentsPublishViewModel;
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        CategoryTag categoryTag = this.f120715b.get(i);
        Intrinsics.checkExpressionValueIsNotNull(categoryTag, "tagList[position]");
        ((PublishTagViewHolder) aVar).mo165944a(categoryTag);
        aVar.itemView.setOnClickListener(new C47956a(this, i));
    }
}

package com.bytedance.ee.bear.templates.search.recommend;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/recommend/RecommendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/templates/search/recommend/RecommendAdapter$ViewHodler;", "()V", "datas", "", "", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "onClickItem", "Lkotlin/Function1;", "", "getOnClickItem", "()Lkotlin/jvm/functions/Function1;", "setOnClickItem", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHodler", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.recommend.a */
public final class RecommendAdapter extends RecyclerView.Adapter<ViewHodler> {

    /* renamed from: a */
    private List<String> f31391a = new ArrayList();

    /* renamed from: b */
    private Function1<? super String, Unit> f31392b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/recommend/RecommendAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "num", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getNum", "()Landroid/widget/TextView;", "searchKey", "getSearchKey", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.recommend.a$a */
    public static final class ViewHodler extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f31393a;

        /* renamed from: b */
        private final TextView f31394b;

        /* renamed from: a */
        public final TextView mo44699a() {
            return this.f31393a;
        }

        /* renamed from: b */
        public final TextView mo44700b() {
            return this.f31394b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHodler(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f31393a = (TextView) view.findViewById(R.id.recommend_num);
            this.f31394b = (TextView) view.findViewById(R.id.search_key);
        }
    }

    /* renamed from: a */
    public final List<String> mo44694a() {
        return this.f31391a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    /* renamed from: b */
    public final Function1<String, Unit> mo44698b() {
        return this.f31392b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f31391a.size();
    }

    /* renamed from: a */
    public final void mo44696a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f31391a = list;
    }

    /* renamed from: a */
    public final void mo44697a(Function1<? super String, Unit> function1) {
        this.f31392b = function1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.recommend.a$b */
    public static final class View$OnClickListenerC11657b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendAdapter f31395a;

        /* renamed from: b */
        final /* synthetic */ int f31396b;

        View$OnClickListenerC11657b(RecommendAdapter aVar, int i) {
            this.f31395a = aVar;
            this.f31396b = i;
        }

        public final void onClick(View view) {
            Function1<String, Unit> b = this.f31395a.mo44698b();
            if (b != null) {
                b.invoke(this.f31395a.mo44694a().get(this.f31396b));
            }
        }
    }

    /* renamed from: a */
    public ViewHodler onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.template_search_recommend_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHodler(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHodler aVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        TextView a = aVar.mo44699a();
        if (i == 0) {
            i2 = R.drawable.template_search_num_one;
        } else if (i == 1) {
            i2 = R.drawable.template_search_num_two;
        } else if (i != 2) {
            i2 = R.drawable.template_search_num_more;
        } else {
            i2 = R.drawable.template_search_num_three;
        }
        a.setBackgroundResource(i2);
        TextView a2 = aVar.mo44699a();
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.itemView.context");
        Resources resources = context.getResources();
        if (i == 0) {
            i3 = R.color.ud_R500;
        } else if (i == 1) {
            i3 = R.color.ud_O500;
        } else if (i != 2) {
            i3 = R.color.text_caption;
        } else {
            i3 = R.color.ud_Y500;
        }
        a2.setTextColor(resources.getColor(i3));
        TextView a3 = aVar.mo44699a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "holder.num");
        a3.setText(String.valueOf(i + 1));
        TextView b = aVar.mo44700b();
        Intrinsics.checkExpressionValueIsNotNull(b, "holder.searchKey");
        b.setText(this.f31391a.get(i));
        aVar.itemView.setOnClickListener(new View$OnClickListenerC11657b(this, i));
    }
}

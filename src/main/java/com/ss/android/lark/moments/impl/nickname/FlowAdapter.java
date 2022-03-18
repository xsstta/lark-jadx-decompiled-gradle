package com.ss.android.lark.moments.impl.nickname;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\"\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/moments/impl/nickname/FlowAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "clickListener", "Lcom/ss/android/lark/moments/impl/nickname/NicknameClickListener;", "(Lcom/ss/android/lark/moments/impl/nickname/NicknameClickListener;)V", "getClickListener", "()Lcom/ss/android/lark/moments/impl/nickname/NicknameClickListener;", "nameData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/nickname/NicknameItemViewData;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNicknames", "names", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.nickname.a */
public final class FlowAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    public final ArrayList<NicknameItemViewData> f120360a = new ArrayList<>();

    /* renamed from: b */
    private final NicknameClickListener f120361b;

    /* renamed from: a */
    public final NicknameClickListener mo167481a() {
        return this.f120361b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f120360a.size();
    }

    public FlowAdapter(NicknameClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "clickListener");
        this.f120361b = cVar;
    }

    /* renamed from: a */
    public final void mo167484a(List<NicknameItemViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "names");
        this.f120360a.clear();
        this.f120360a.addAll(list);
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/nickname/FlowAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/reaction/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.nickname.a$a */
    public static final class C47776a extends AbstractView$OnClickListenerC52989b {

        /* renamed from: a */
        final /* synthetic */ FlowAdapter f120362a;

        /* renamed from: b */
        final /* synthetic */ NicknameItemViewData f120363b;

        @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
        /* renamed from: a */
        public void mo122732a(View view) {
            boolean d = this.f120363b.mo167505d();
            if (!d) {
                Iterator<T> it = this.f120362a.f120360a.iterator();
                while (it.hasNext()) {
                    it.next().mo167502a(false);
                }
            }
            this.f120363b.mo167502a(!d);
            this.f120362a.notifyDataSetChanged();
            this.f120362a.mo167481a().mo167478a(this.f120363b, !d);
        }

        C47776a(FlowAdapter aVar, NicknameItemViewData dVar) {
            this.f120362a = aVar;
            this.f120363b = dVar;
        }
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return NicknameViewHolder.f120368a.mo167507a(viewGroup);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        NicknameItemViewData dVar = this.f120360a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(dVar, "nameData[position]");
        NicknameItemViewData dVar2 = dVar;
        if (!(aVar instanceof NicknameViewHolder)) {
            aVar = null;
        }
        NicknameViewHolder eVar = (NicknameViewHolder) aVar;
        if (eVar != null) {
            eVar.mo165944a(dVar2);
            eVar.itemView.setOnClickListener(new C47776a(this, dVar2));
        }
    }
}

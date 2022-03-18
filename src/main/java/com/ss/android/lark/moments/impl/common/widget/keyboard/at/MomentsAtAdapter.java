package com.ss.android.lark.moments.impl.common.widget.keyboard.at;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\"\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$IAtUserClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$IAtUserClickListener;)V", "getContext", "()Landroid/content/Context;", "dataList", "Ljava/util/ArrayList;", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "Lkotlin/collections/ArrayList;", "getListener", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$IAtUserClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "IAtUserClickListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.b */
public final class MomentsAtAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

    /* renamed from: a */
    private ArrayList<MomentUser> f119313a = new ArrayList<>();

    /* renamed from: b */
    private final Context f119314b;

    /* renamed from: c */
    private final IAtUserClickListener f119315c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$IAtUserClickListener;", "", "onSelectUser", "", "userId", "", "userName", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.b$a */
    public interface IAtUserClickListener {
        /* renamed from: a */
        void mo166280a(String str, String str2);
    }

    /* renamed from: a */
    public final IAtUserClickListener mo166276a() {
        return this.f119315c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f119313a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.b$b */
    public static final class C47304b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsAtAdapter f119316a;

        /* renamed from: b */
        final /* synthetic */ MomentUser f119317b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IAtUserClickListener a = this.f119316a.mo166276a();
            String str = this.f119317b.user_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "user.user_id");
            String str2 = this.f119317b.name;
            Intrinsics.checkExpressionValueIsNotNull(str2, "user.name");
            a.mo166280a(str, str2);
        }

        C47304b(MomentsAtAdapter bVar, MomentUser momentUser) {
            this.f119316a = bVar;
            this.f119317b = momentUser;
        }
    }

    /* renamed from: a */
    public final void mo166279a(List<MomentUser> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f119313a.clear();
        this.f119313a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        return MomentsAtViewHolder.f119326a.mo166289a(viewGroup);
    }

    public MomentsAtAdapter(Context context, IAtUserClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f119314b = context;
        this.f119315c = aVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        MomentUser momentUser = this.f119313a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(momentUser, "dataList[position]");
        MomentUser momentUser2 = momentUser;
        ((MomentsAtViewHolder) aVar).mo165944a(momentUser2);
        aVar.itemView.setOnClickListener(new C47304b(this, momentUser2));
    }
}

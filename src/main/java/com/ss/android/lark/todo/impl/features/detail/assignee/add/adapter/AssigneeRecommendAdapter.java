package com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.todo.impl.features.common.helper.ExternalTagHelper;
import com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.RecommendItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001e\u0010\u001a\u001a\u00020\r2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$ViewHolder;", "singlePick", "", "mOnItemClickListener", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$IRecommendItemClickListener;", "(ZLcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$IRecommendItemClickListener;)V", "showData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem;", "Lkotlin/collections/ArrayList;", "bindChatterItem", "", "holder", "item", "bindTitleItem", "getItemCount", "", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewClicked", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "AvatarBuilder", "IRecommendItemClickListener", "ViewHolder", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.a */
public final class AssigneeRecommendAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private ArrayList<RecommendItem> f139568a = new ArrayList<>();

    /* renamed from: b */
    private final boolean f139569b;

    /* renamed from: c */
    private final IRecommendItemClickListener f139570c;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$AvatarBuilder;", "Lcom/larksuite/component/ui/avatar/AvatarModel$Builder;", "()V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.a$a */
    public static final class AvatarBuilder extends AvatarModel.Builder<AvatarBuilder> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$IRecommendItemClickListener;", "", "onRecommendItemClicked", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "isCurrentChecked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.a$b */
    public interface IRecommendItemClickListener {
        /* renamed from: a */
        void mo192181a(Chatter chatter, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/AssigneeRecommendAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.a$c */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f139571a;

        /* renamed from: a */
        public final View mo192182a() {
            return this.f139571a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f139571a = view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f139568a.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.a$d */
    public static final class View$OnClickListenerC56436d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AssigneeRecommendAdapter f139572a;

        /* renamed from: b */
        final /* synthetic */ RecommendItem f139573b;

        View$OnClickListenerC56436d(AssigneeRecommendAdapter aVar, RecommendItem recommendItem) {
            this.f139572a = aVar;
            this.f139573b = recommendItem;
        }

        public final void onClick(View view) {
            this.f139572a.mo192178a(this.f139573b);
        }
    }

    /* renamed from: a */
    public final void mo192180a(ArrayList<RecommendItem> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f139568a = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo192178a(RecommendItem recommendItem) {
        Chatter a;
        Chatter a2;
        if (recommendItem.mo192164a() == RecommendItem.ShowType.CHATTER) {
            boolean b = recommendItem.mo192166b();
            IRecommendItemClickListener bVar = this.f139570c;
            RecommendItem.ChatterItem d = recommendItem.mo192168d();
            bVar.mo192181a(d != null ? d.mo192172a() : null, b);
            for (T t : this.f139568a) {
                RecommendItem.ChatterItem d2 = t.mo192168d();
                String id = (d2 == null || (a2 = d2.mo192172a()) == null) ? null : a2.getId();
                RecommendItem.ChatterItem d3 = recommendItem.mo192168d();
                if (Intrinsics.areEqual(id, (d3 == null || (a = d3.mo192172a()) == null) ? null : a.getId())) {
                    t.mo192165a(!b);
                }
            }
            notifyDataSetChanged();
        }
    }

    public AssigneeRecommendAdapter(boolean z, IRecommendItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickListener");
        this.f139569b = z;
        this.f139570c = bVar;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_assginee_recommend_fragment_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ment_item, parent, false)");
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        RecommendItem recommendItem = this.f139568a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(recommendItem, "showData[position]");
        RecommendItem recommendItem2 = recommendItem;
        if (recommendItem2.mo192164a() == RecommendItem.ShowType.CHATTER) {
            m219971b(cVar, recommendItem2);
        } else {
            m219970a(cVar, recommendItem2);
        }
        cVar.mo192182a().setOnClickListener(new View$OnClickListenerC56436d(this, recommendItem2));
    }

    /* renamed from: a */
    private final void m219970a(ViewHolder cVar, RecommendItem recommendItem) {
        RelativeLayout relativeLayout = (RelativeLayout) cVar.mo192182a().findViewById(R.id.recommend_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "holder.view.recommend_container");
        relativeLayout.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) cVar.mo192182a().findViewById(R.id.title_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "holder.view.title_container");
        relativeLayout2.setVisibility(0);
        TextView textView = (TextView) cVar.mo192182a().findViewById(R.id.title_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.view.title_text");
        textView.setText(recommendItem.mo192167c());
    }

    /* renamed from: b */
    private final void m219971b(ViewHolder cVar, RecommendItem recommendItem) {
        Chatter a;
        String str;
        boolean z;
        RecommendItem.ChatterItem d = recommendItem.mo192168d();
        if (d != null && (a = d.mo192172a()) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) cVar.mo192182a().findViewById(R.id.recommend_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "holder.view.recommend_container");
            relativeLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = (RelativeLayout) cVar.mo192182a().findViewById(R.id.title_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "holder.view.title_container");
            relativeLayout2.setVisibility(8);
            ((LarkAvatarView) cVar.mo192182a().findViewById(R.id.user_avatar)).mo89076a(((AvatarBuilder) ((AvatarBuilder) new AvatarBuilder().mo88962a(a.getAvatarKey())).mo88967b(a.getId())).mo88976k());
            TextView textView = (TextView) cVar.mo192182a().findViewById(R.id.user_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "holder.view.user_name");
            textView.setText(a.getLocalizedName());
            ExternalTagHelper cVar2 = ExternalTagHelper.f139400a;
            TextView textView2 = (TextView) cVar.mo192182a().findViewById(R.id.user_name);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.view.user_name");
            cVar2.mo192000a(textView2, a.getTenantId());
            RecommendItem.ChatterItem d2 = recommendItem.mo192168d();
            String str2 = null;
            if (d2 != null) {
                str = d2.mo192173b();
            } else {
                str = null;
            }
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TextView textView3 = (TextView) cVar.mo192182a().findViewById(R.id.department_name);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.view.department_name");
                textView3.setVisibility(8);
            } else {
                TextView textView4 = (TextView) cVar.mo192182a().findViewById(R.id.department_name);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.view.department_name");
                textView4.setVisibility(0);
                TextView textView5 = (TextView) cVar.mo192182a().findViewById(R.id.department_name);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "holder.view.department_name");
                RecommendItem.ChatterItem d3 = recommendItem.mo192168d();
                if (d3 != null) {
                    str2 = d3.mo192173b();
                }
                textView5.setText(str2);
            }
            if (this.f139569b) {
                UDCheckBox uDCheckBox = (UDCheckBox) cVar.mo192182a().findViewById(R.id.select_icon);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "holder.view.select_icon");
                uDCheckBox.setVisibility(8);
                return;
            }
            UDCheckBox uDCheckBox2 = (UDCheckBox) cVar.mo192182a().findViewById(R.id.select_icon);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "holder.view.select_icon");
            uDCheckBox2.setVisibility(0);
            UDCheckBox uDCheckBox3 = (UDCheckBox) cVar.mo192182a().findViewById(R.id.select_icon);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "holder.view.select_icon");
            uDCheckBox3.setChecked(recommendItem.mo192166b());
        }
    }
}

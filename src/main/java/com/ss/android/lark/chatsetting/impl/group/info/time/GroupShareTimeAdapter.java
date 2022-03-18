package com.ss.android.lark.chatsetting.impl.group.info.time;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\b\u0012\u00060\u0002R\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter$TimeItemViewHolder;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "()V", "listener", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter$OnItemSelectListener;", "displaySelectedItem", "", "position", "", "getItemId", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemSelectedListener", "OnItemSelectListener", "TimeItemViewHolder", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.a */
public final class GroupShareTimeAdapter extends LarkRecyclerViewBaseAdapter<TimeItemViewHolder, GroupShareTimeBean> {

    /* renamed from: a */
    public OnItemSelectListener f89500a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter$OnItemSelectListener;", "", "onItemSelect", "", "item", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.a$a */
    public interface OnItemSelectListener {
        /* renamed from: a */
        void mo128042a(GroupShareTimeBean bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter$TimeItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeAdapter;Landroid/view/View;)V", "dividerView", "getDividerView", "()Landroid/view/View;", "isSelectedIv", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "timeText", "Landroid/widget/TextView;", "getTimeText", "()Landroid/widget/TextView;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.a$b */
    public final class TimeItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ GroupShareTimeAdapter f89501a;

        /* renamed from: b */
        private final TextView f89502b;

        /* renamed from: c */
        private final ImageView f89503c;

        /* renamed from: d */
        private final View f89504d;

        /* renamed from: a */
        public final TextView mo128043a() {
            return this.f89502b;
        }

        /* renamed from: b */
        public final ImageView mo128044b() {
            return this.f89503c;
        }

        /* renamed from: c */
        public final View mo128045c() {
            return this.f89504d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TimeItemViewHolder(GroupShareTimeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f89501a = aVar;
            View findViewById = view.findViewById(R.id.time_tv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.time_tv)");
            this.f89502b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.is_selected_iv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.is_selected_iv)");
            this.f89503c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.divider)");
            this.f89504d = findViewById3;
        }
    }

    /* renamed from: a */
    public final void mo128040a(OnItemSelectListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f89500a = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ OnItemSelectListener m134768a(GroupShareTimeAdapter aVar) {
        OnItemSelectListener aVar2 = aVar.f89500a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.a$c */
    public static final class View$OnClickListenerC34680c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupShareTimeAdapter f89505a;

        /* renamed from: b */
        final /* synthetic */ int f89506b;

        /* renamed from: c */
        final /* synthetic */ GroupShareTimeBean f89507c;

        View$OnClickListenerC34680c(GroupShareTimeAdapter aVar, int i, GroupShareTimeBean bVar) {
            this.f89505a = aVar;
            this.f89506b = i;
            this.f89507c = bVar;
        }

        public final void onClick(View view) {
            this.f89505a.mo128039a(this.f89506b);
            OnItemSelectListener a = GroupShareTimeAdapter.m134768a(this.f89505a);
            GroupShareTimeBean bVar = this.f89507c;
            Intrinsics.checkExpressionValueIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            a.mo128042a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        GroupShareTimeBean bVar = (GroupShareTimeBean) getItem(i);
        if (bVar != null) {
            return (long) bVar.mo128047a().hashCode();
        }
        return super.getItemId(i);
    }

    /* renamed from: a */
    public final void mo128039a(int i) {
        List<GroupShareTimeBean> items = getItems();
        Intrinsics.checkExpressionValueIsNotNull(items, "getItems()");
        for (GroupShareTimeBean bVar : items) {
            bVar.mo128048a(false);
        }
        ((GroupShareTimeBean) items.get(i)).mo128048a(true);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public TimeItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_group_share_edit_time, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new TimeItemViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(TimeItemViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        GroupShareTimeBean bVar2 = (GroupShareTimeBean) getItem(i);
        if (bVar2.mo128050c()) {
            bVar.mo128044b().setVisibility(0);
        } else {
            bVar.mo128044b().setVisibility(8);
        }
        bVar.mo128043a().setText(bVar2.mo128047a());
        if (i == 0) {
            bVar.mo128045c().setVisibility(0);
            bVar.itemView.setBackgroundResource(R.drawable.bg_setting_group_item_round_top);
        } else if (i == getItemCount() - 1) {
            bVar.mo128045c().setVisibility(8);
            bVar.itemView.setBackgroundResource(R.drawable.bg_setting_group_item_round_bottom);
        } else {
            bVar.mo128045c().setVisibility(0);
            bVar.itemView.setBackgroundResource(R.drawable.bg_setting_group_item_rectangle);
        }
        bVar.itemView.setOnClickListener(new View$OnClickListenerC34680c(this, i, bVar2));
    }
}

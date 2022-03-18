package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MtRoomStrategyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MtRoomStrategyAdapter$MeetingRoomTextViewHolder;", "meetingRoomTextList", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomText;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MeetingRoomTextViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.c */
public final class MtRoomStrategyAdapter extends RecyclerView.Adapter<MeetingRoomTextViewHolder> {

    /* renamed from: a */
    private List<MeetingRoomText> f81400a;

    public MtRoomStrategyAdapter() {
        this(null, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81400a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MtRoomStrategyAdapter$MeetingRoomTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bindMtRoom", "", "mtArray", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomText;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.c$a */
    public static final class MeetingRoomTextViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f81401a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MeetingRoomTextViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f81401a = view;
        }

        /* renamed from: a */
        public final void mo116458a(MeetingRoomText bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "mtArray");
            TextView textView = (TextView) this.f81401a.findViewById(R.id.mtRoomSummary);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.mtRoomSummary");
            textView.setText(bVar.mo116451a());
            TextView textView2 = (TextView) this.f81401a.findViewById(R.id.mtRoomStrategy);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.mtRoomStrategy");
            textView2.setText(bVar.mo116452b());
        }
    }

    public MtRoomStrategyAdapter(List<MeetingRoomText> list) {
        Intrinsics.checkParameterIsNotNull(list, "meetingRoomTextList");
        this.f81400a = list;
    }

    /* renamed from: a */
    public MeetingRoomTextViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mtroom_strategy, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…_strategy, parent, false)");
        return new MeetingRoomTextViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(MeetingRoomTextViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (i >= 0 && i < this.f81400a.size()) {
            aVar.mo116458a(this.f81400a.get(i));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MtRoomStrategyAdapter(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}

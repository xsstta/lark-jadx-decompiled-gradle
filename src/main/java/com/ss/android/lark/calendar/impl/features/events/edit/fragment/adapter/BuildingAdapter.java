package com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.BaseViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.MeetingItemTypeFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010$J \u0010%\u001a\u00020\u000f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "mItemModels", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "mTypeFactory", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnBuildingClickedListener", "clickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "setOnChosenMeetingRoomDeletedListener", "deleteBtnClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "setOnLoadMoreClickedListener", "onLoadMoreClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "setOnMeetingRoomClickedListener", "onMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "setOnMultiLevelClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "setOnMultiMeetingRoomClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "updateModelList", "searchFreeItemModels", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.a.c */
public class BuildingAdapter extends RecyclerView.Adapter<BaseViewHolder<ItemModel>> {

    /* renamed from: a */
    private final ITypeFactory f80355a = new MeetingItemTypeFactory();

    /* renamed from: b */
    private ArrayList<ItemModel> f80356b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f80356b.size();
    }

    /* renamed from: a */
    public final void mo115208a(ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener aVar) {
        this.f80355a.mo115890a(aVar);
    }

    /* renamed from: a */
    public final void mo115209a(LoadMoreViewHolder.OnItemClickListener aVar) {
        this.f80355a.mo115891a(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f80356b.get(i).mo115745a(this.f80355a);
    }

    public BuildingAdapter(ArrayList<ItemModel> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "mItemModels");
        this.f80356b = arrayList;
    }

    /* renamed from: a */
    public final void mo115210a(MeetingRoomBuildingViewHolder.OnItemClickListener aVar) {
        this.f80355a.mo115892a(aVar);
    }

    /* renamed from: a */
    public final void mo115211a(MeetingRoomViewHolder.OnItemClickListener aVar) {
        this.f80355a.mo115893a(aVar);
    }

    /* renamed from: a */
    public final void mo115212a(MultiLevelViewHolder.OnItemClickListener aVar) {
        this.f80355a.mo115894a(aVar);
    }

    /* renamed from: a */
    public final void mo115213a(MultiMeetingRoomViewHolder.OnItemClickListener aVar) {
        this.f80355a.mo115895a(aVar);
    }

    /* renamed from: a */
    public void mo115214a(ArrayList<ItemModel> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "searchFreeItemModels");
        this.f80356b = arrayList;
    }

    /* renamed from: a */
    public BaseViewHolder<ItemModel> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        ITypeFactory aVar = this.f80355a;
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return aVar.mo115889a(i, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder<ItemModel> aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        ItemModel dVar = this.f80356b.get(i);
        Intrinsics.checkExpressionValueIsNotNull(dVar, "mItemModels[position]");
        aVar.mo115682a(dVar, i, this);
    }
}

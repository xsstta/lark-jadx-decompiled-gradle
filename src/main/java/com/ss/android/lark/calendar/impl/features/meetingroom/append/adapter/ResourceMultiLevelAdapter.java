package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.LoadErrViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.LoadingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelContentViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.NoneDataViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.TypeTitleViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelContentModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.TypeTitleModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020&H\u0016J\u0014\u00100\u001a\u00020*2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001202R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceMultiLevelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "baseActionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "getBaseActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "setBaseActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;)V", "buildingAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "getBuildingAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "setBuildingAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;)V", "itemModelList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "meetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "getMeetingRoomAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "setMeetingRoomAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;)V", "multiLevelContentAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "getMultiLevelContentAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "setMultiLevelContentAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;)V", "multiLevelMeetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "getMultiLevelMeetingRoomAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "setMultiLevelMeetingRoomAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "dataList", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.b */
public final class ResourceMultiLevelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private MeetingRoomViewHolder.IActionListener f81819a;

    /* renamed from: b */
    private BuildingViewHolder.IActionListener f81820b;

    /* renamed from: c */
    private MultiLevelMeetingRoomViewHolder.IActionListener f81821c;

    /* renamed from: d */
    private MultiLevelContentViewHolder.IActionListener f81822d;

    /* renamed from: e */
    private ResourceDisplayAdapter.IBaseActionListener f81823e;

    /* renamed from: f */
    private List<BaseModel> f81824f = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81824f.size();
    }

    /* renamed from: a */
    public final void mo116755a(ResourceDisplayAdapter.IBaseActionListener aVar) {
        this.f81823e = aVar;
    }

    /* renamed from: a */
    public final void mo116756a(MeetingRoomViewHolder.IActionListener bVar) {
        this.f81819a = bVar;
    }

    /* renamed from: a */
    public final void mo116757a(MultiLevelContentViewHolder.IActionListener bVar) {
        this.f81822d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f81824f.get(i).mo116760a();
    }

    /* renamed from: a */
    public final void mo116758a(MultiLevelMeetingRoomViewHolder.IActionListener bVar) {
        this.f81821c = bVar;
    }

    /* renamed from: a */
    public final void mo116759a(List<? extends BaseModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        this.f81824f = new ArrayList(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        BaseModel baseModel = this.f81824f.get(i);
        if ((viewHolder instanceof MeetingRoomViewHolder) && (baseModel instanceof MeetingRoomModel)) {
            ((MeetingRoomViewHolder) viewHolder).mo116734a((MeetingRoomModel) baseModel);
        } else if ((viewHolder instanceof BuildingViewHolder) && (baseModel instanceof BuildingModel)) {
            ((BuildingViewHolder) viewHolder).mo116718a((BuildingModel) baseModel);
        } else if ((viewHolder instanceof MultiLevelMeetingRoomViewHolder) && (baseModel instanceof MultiLevelMeetingRoomModel)) {
            ((MultiLevelMeetingRoomViewHolder) viewHolder).mo116746a((MultiLevelMeetingRoomModel) baseModel);
        } else if ((viewHolder instanceof MultiLevelContentViewHolder) && (baseModel instanceof MultiLevelContentModel)) {
            ((MultiLevelContentViewHolder) viewHolder).mo116738a((MultiLevelContentModel) baseModel);
        } else if ((viewHolder instanceof LoadMoreViewHolder) && (baseModel instanceof LoadMoreModel)) {
            ((LoadMoreViewHolder) viewHolder).mo116728a(baseModel);
        } else if ((viewHolder instanceof TypeTitleViewHolder) && (baseModel instanceof TypeTitleModel)) {
            ((TypeTitleViewHolder) viewHolder).mo116753a((TypeTitleModel) baseModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        switch (i) {
            case 0:
                return MeetingRoomViewHolder.f81795a.mo116735a(viewGroup, this.f81819a);
            case 1:
                return BuildingViewHolder.f81774a.mo116719a(viewGroup, this.f81820b);
            case 2:
                return ChosenMeetingRoomViewHolder.f81783a.mo116725a(viewGroup);
            case 3:
            default:
                return TypeTitleViewHolder.f81817a.mo116754a(viewGroup);
            case 4:
                return LoadingViewHolder.f81794a.mo116731a(viewGroup);
            case 5:
                return LoadErrViewHolder.f81788a.mo116727a(viewGroup);
            case 6:
                return NoneDataViewHolder.f81816a.mo116752a(viewGroup);
            case 7:
                return MultiLevelMeetingRoomViewHolder.f81809a.mo116747a(viewGroup, this.f81821c);
            case 8:
                return MultiLevelContentViewHolder.f81802b.mo116739a(viewGroup, this.f81822d);
            case 9:
                return LoadMoreViewHolder.f81789b.mo116729a(viewGroup, this.f81823e);
        }
    }
}

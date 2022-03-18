package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type;

import android.view.View;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.BaseViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ChosenMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.DividerModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadErrorDataModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadingDataModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.NoneDataModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.TypeTitleModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\"H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020-H&¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "", "createViewHolder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", ShareHitPoint.f121869d, "", "itemView", "Landroid/view/View;", "setOnBuildingClickedListener", "", "clickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "setOnChosenMeetingRoomDeletedListener", "deleteBtnClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "setOnLoadMoreClickedListener", "onLoadMoreClickedLisetener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "setOnMeetingRoomClickedListener", "onMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "setOnMultiLevelClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "setOnMultiMeetingRoomClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "chosenMeetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ChosenMeetingRoomModel;", "dividerModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/DividerModel;", "typeTitleModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadErrorDataModel;", "loadMoreModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadMoreModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadingDataModel;", "meetingRoomBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "multiLevelModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "multiMeetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiMeetingRoomModel;", "noneDataModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/NoneDataModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/TypeTitleModel;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d.a */
public interface ITypeFactory {
    /* renamed from: a */
    int mo115878a(ChosenMeetingRoomModel aVar);

    /* renamed from: a */
    int mo115879a(DividerModel bVar);

    /* renamed from: a */
    int mo115880a(LoadErrorDataModel eVar);

    /* renamed from: a */
    int mo115881a(LoadMoreModel fVar);

    /* renamed from: a */
    int mo115882a(LoadingDataModel gVar);

    /* renamed from: a */
    int mo115883a(MeetingRoomBuildingModel hVar);

    /* renamed from: a */
    int mo115884a(MeetingRoomModel iVar);

    /* renamed from: a */
    int mo115885a(MultiLevelModel jVar);

    /* renamed from: a */
    int mo115886a(MultiMeetingRoomModel kVar);

    /* renamed from: a */
    int mo115887a(NoneDataModel lVar);

    /* renamed from: a */
    int mo115888a(TypeTitleModel mVar);

    /* renamed from: a */
    BaseViewHolder<ItemModel> mo115889a(int i, View view);

    /* renamed from: a */
    void mo115890a(ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener aVar);

    /* renamed from: a */
    void mo115891a(LoadMoreViewHolder.OnItemClickListener aVar);

    /* renamed from: a */
    void mo115892a(MeetingRoomBuildingViewHolder.OnItemClickListener aVar);

    /* renamed from: a */
    void mo115893a(MeetingRoomViewHolder.OnItemClickListener aVar);

    /* renamed from: a */
    void mo115894a(MultiLevelViewHolder.OnItemClickListener aVar);

    /* renamed from: a */
    void mo115895a(MultiMeetingRoomViewHolder.OnItemClickListener aVar);
}

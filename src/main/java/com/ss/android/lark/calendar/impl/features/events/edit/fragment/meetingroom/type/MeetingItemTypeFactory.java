package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.BaseViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.DividerViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadErrorViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.NoneDataViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.TypeTitleViewHolder;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020+H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u00100\u001a\u000201H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u00102\u001a\u000203H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u00104\u001a\u000205H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u000206H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/MeetingItemTypeFactory;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/ITypeFactory;", "()V", "mOnBuildingClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "mOnDeleteBtnClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "mOnLoadErrorClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadErrorViewHolder$OnItemClickListener;", "mOnLoadMoreClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "mOnMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "mOnMultiLevelClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "mOnMultiMeetingRoomClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "createViewHolder", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/BaseViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", ShareHitPoint.f121869d, "", "itemView", "Landroid/view/View;", "setOnBuildingClickedListener", "", "clickedListener", "setOnChosenMeetingRoomDeletedListener", "deleteBtnClickListener", "setOnLoadMoreClickedListener", "onLoadMoreClickedLisetener", "setOnMeetingRoomClickedListener", "onMeetingRoomItemClickedListener", "setOnMultiLevelClickedListener", "setOnMultiMeetingRoomClickedListener", "chosenMeetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ChosenMeetingRoomModel;", "dividerModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/DividerModel;", "typeTitleModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadErrorDataModel;", "loadMoreModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadMoreModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/LoadingDataModel;", "meetingRoomBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "multiLevelModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "multiMeetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiMeetingRoomModel;", "noneDataModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/NoneDataModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/TypeTitleModel;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d.b */
public final class MeetingItemTypeFactory implements ITypeFactory {

    /* renamed from: a */
    public static final Companion f80819a = new Companion(null);

    /* renamed from: i */
    private static final int f80820i = R.layout.item_event_meeting_room_chosen;

    /* renamed from: j */
    private static final int f80821j = R.layout.item_event_meeting_room_divider;

    /* renamed from: k */
    private static final int f80822k = R.layout.item_meeting_room_load_more;

    /* renamed from: l */
    private static final int f80823l = R.layout.item_event_meeting_room_building;

    /* renamed from: m */
    private static final int f80824m = R.layout.item_event_meeting_room;

    /* renamed from: n */
    private static final int f80825n = R.layout.item_event_multi_level;

    /* renamed from: o */
    private static final int f80826o = R.layout.item_event_multi_meeting_room;

    /* renamed from: p */
    private static final int f80827p = R.layout.item_meeting_room_none_search_data;

    /* renamed from: q */
    private static final int f80828q = R.layout.item_event_meeting_room_title;

    /* renamed from: r */
    private static final int f80829r = R.layout.item_meeting_room_load_error;

    /* renamed from: s */
    private static final int f80830s = R.layout.item_meeting_room_loading;

    /* renamed from: b */
    private ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener f80831b;

    /* renamed from: c */
    private MeetingRoomBuildingViewHolder.OnItemClickListener f80832c;

    /* renamed from: d */
    private MeetingRoomViewHolder.OnItemClickListener f80833d;

    /* renamed from: e */
    private LoadMoreViewHolder.OnItemClickListener f80834e;

    /* renamed from: f */
    private LoadErrorViewHolder.OnItemClickListener f80835f;

    /* renamed from: g */
    private MultiLevelViewHolder.OnItemClickListener f80836g;

    /* renamed from: h */
    private MultiMeetingRoomViewHolder.OnItemClickListener f80837h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/type/MeetingItemTypeFactory$Companion;", "", "()V", "TYPE_CHOSEN_MEETING_ROOM_RESOURCE", "", "TYPE_DIVIDER_RESOURCE", "TYPE_LOADING", "TYPE_LOAD_ERROR", "TYPE_LOAD_MORE", "TYPE_MEETING_ROOM_BUILDING_RESOURCE", "TYPE_MEETING_ROOM_RESOURCE", "TYPE_MULTI_LEVEL", "TYPE_MULTI_MEETING_ROOM", "TYPE_NONE_SEARCH_DATA", "TYPE_TITLE_RESOURCE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115888a(TypeTitleModel mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "typeTitleModel");
        return f80828q;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public BaseViewHolder<ItemModel> mo115889a(int i, View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        if (i == f80820i) {
            ChosenMeetingRoomViewHolder bVar = new ChosenMeetingRoomViewHolder(view);
            bVar.mo115683a(this.f80831b);
            return bVar;
        } else if (i == f80821j) {
            return new DividerViewHolder(view);
        } else {
            if (i == f80822k) {
                LoadMoreViewHolder eVar = new LoadMoreViewHolder(view);
                eVar.mo115692a(this.f80834e);
                return eVar;
            } else if (i == f80823l) {
                MeetingRoomBuildingViewHolder gVar = new MeetingRoomBuildingViewHolder(view);
                gVar.mo115697a(this.f80832c);
                return gVar;
            } else if (i == f80824m) {
                MeetingRoomViewHolder iVar = new MeetingRoomViewHolder(view);
                iVar.mo115704a(this.f80833d);
                return iVar;
            } else if (i == f80825n) {
                MultiLevelViewHolder kVar = new MultiLevelViewHolder(view);
                kVar.mo115711a(this.f80836g);
                return kVar;
            } else if (i == f80826o) {
                MultiMeetingRoomViewHolder lVar = new MultiMeetingRoomViewHolder(view);
                lVar.mo115715a(this.f80837h);
                return lVar;
            } else if (i == f80829r) {
                LoadErrorViewHolder dVar = new LoadErrorViewHolder(view);
                dVar.mo115688a(this.f80835f);
                return dVar;
            } else if (i == f80830s) {
                return new LoadingViewHolder(view);
            } else {
                if (i == f80827p) {
                    return new NoneDataViewHolder(view);
                }
                if (i == f80828q) {
                    return new TypeTitleViewHolder(view);
                }
                return new NoneDataViewHolder(view);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public void mo115892a(MeetingRoomBuildingViewHolder.OnItemClickListener aVar) {
        this.f80832c = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public void mo115894a(MultiLevelViewHolder.OnItemClickListener aVar) {
        this.f80836g = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public void mo115895a(MultiMeetingRoomViewHolder.OnItemClickListener aVar) {
        this.f80837h = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public void mo115893a(MeetingRoomViewHolder.OnItemClickListener aVar) {
        this.f80833d = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public void mo115891a(LoadMoreViewHolder.OnItemClickListener aVar) {
        this.f80834e = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public void mo115890a(ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener aVar) {
        this.f80831b = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115878a(ChosenMeetingRoomModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "chosenMeetingRoomModel");
        return f80820i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115879a(DividerModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dividerModel");
        return f80821j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115880a(LoadErrorDataModel eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "typeTitleModel");
        return f80829r;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115881a(LoadMoreModel fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "loadMoreModel");
        return f80822k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115882a(LoadingDataModel gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "typeTitleModel");
        return f80830s;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115883a(MeetingRoomBuildingModel hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "meetingRoomBuildingModel");
        return f80823l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115884a(MeetingRoomModel iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "meetingRoomModel");
        return f80824m;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115885a(MultiLevelModel jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "multiLevelModel");
        return f80825n;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115886a(MultiMeetingRoomModel kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "multiMeetingRoomModel");
        return f80826o;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.type.ITypeFactory
    /* renamed from: a */
    public int mo115887a(NoneDataModel lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "noneDataModel");
        return f80827p;
    }
}

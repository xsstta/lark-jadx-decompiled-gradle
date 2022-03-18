package com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder;", "()V", "buildingList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "getBuildingList", "()Ljava/util/List;", "setBuildingList", "(Ljava/util/List;)V", "mOnItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "onItemClickListener", "BuildingViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.d */
public final class MeetingRoomBuildingSubscribeAdapter extends RecyclerView.Adapter<BuildingViewHolder> {

    /* renamed from: a */
    public BuildingViewHolder.OnItemClickListener f76701a;

    /* renamed from: b */
    private List<? extends CalendarBuilding> f76702b = CollectionsKt.emptyList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "buildingIcom", "Landroid/widget/ImageView;", "getBuildingIcom", "()Landroid/widget/ImageView;", "itemViewRootview", "getItemViewRootview", "()Landroid/view/View;", "tvBuildingName", "Landroid/widget/TextView;", "getTvBuildingName", "()Landroid/widget/TextView;", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.d$a */
    public static final class BuildingViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f76703a;

        /* renamed from: b */
        private final View f76704b;

        /* renamed from: c */
        private final ImageView f76705c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder$OnItemClickListener;", "", "onItemClick", "", "chooseCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.d$a$a */
        public interface OnItemClickListener {
            /* renamed from: a */
            void mo110516a(CalendarBuilding calendarBuilding);
        }

        /* renamed from: a */
        public final TextView mo110548a() {
            return this.f76703a;
        }

        /* renamed from: b */
        public final View mo110549b() {
            return this.f76704b;
        }

        /* renamed from: c */
        public final ImageView mo110550c() {
            return this.f76705c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BuildingViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            TextView textView = (TextView) view.findViewById(R.id.tv_building_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.tv_building_name");
            this.f76703a = textView;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.building_item_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.building_item_container");
            this.f76704b = relativeLayout;
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.icon");
            this.f76705c = imageView;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding>, java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding> */
    /* renamed from: a */
    public final List<CalendarBuilding> mo110544a() {
        return this.f76702b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76702b.size();
    }

    /* renamed from: a */
    public final void mo110545a(BuildingViewHolder.OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "onItemClickListener");
        this.f76701a = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ BuildingViewHolder.OnItemClickListener m113875a(MeetingRoomBuildingSubscribeAdapter dVar) {
        BuildingViewHolder.OnItemClickListener aVar = dVar.f76701a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnItemClickListener");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.d$b */
    public static final class View$OnClickListenerC30636b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomBuildingSubscribeAdapter f76706a;

        /* renamed from: b */
        final /* synthetic */ int f76707b;

        View$OnClickListenerC30636b(MeetingRoomBuildingSubscribeAdapter dVar, int i) {
            this.f76706a = dVar;
            this.f76707b = i;
        }

        public final void onClick(View view) {
            MeetingRoomBuildingSubscribeAdapter.m113875a(this.f76706a).mo110516a(this.f76706a.mo110544a().get(this.f76707b));
        }
    }

    /* renamed from: a */
    public final void mo110547a(List<? extends CalendarBuilding> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f76702b = list;
    }

    /* renamed from: a */
    public BuildingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_event_meeting_room_building, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new BuildingViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(BuildingViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo110548a().setText(((CalendarBuilding) this.f76702b.get(i)).getName());
        aVar.mo110550c().setImageResource(R.drawable.ud_icon_building_outlined);
        aVar.mo110549b().setOnClickListener(new View$OnClickListenerC30636b(this, i));
    }
}

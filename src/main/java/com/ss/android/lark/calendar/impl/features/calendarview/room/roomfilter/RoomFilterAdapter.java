package com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneRoomFilterViewData;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.CalendarGuideManager;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterViewHolder;", "()V", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter$OnItemClickListener;", "getItemClickListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter$OnItemClickListener;", "setItemClickListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter$OnItemClickListener;)V", "mFilterData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomFilterViewData;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshFilterData", "filterData", "", "Companion", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.d */
public final class RoomFilterAdapter extends RecyclerView.Adapter<RoomFilterViewHolder> {

    /* renamed from: a */
    public static final Companion f78205a = new Companion(null);

    /* renamed from: b */
    private final ArrayList<OneRoomFilterViewData> f78206b = new ArrayList<>();

    /* renamed from: c */
    private OnItemClickListener f78207c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter$OnItemClickListener;", "", "onItemClick", "", "id", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.d$b */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo112315a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/RoomFilterAdapter$Companion;", "", "()V", "FILTER_BUILDING", "", "FILTER_CAPACITY", "FILTER_EQUIPMENT", "FILTER_MULTI_LEVEL", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final OnItemClickListener mo112310a() {
        return this.f78207c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78206b.size();
    }

    /* renamed from: a */
    public final void mo112312a(OnItemClickListener bVar) {
        this.f78207c = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.d$c */
    public static final class View$OnClickListenerC31024c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RoomFilterAdapter f78208a;

        /* renamed from: b */
        final /* synthetic */ OneRoomFilterViewData f78209b;

        View$OnClickListenerC31024c(RoomFilterAdapter dVar, OneRoomFilterViewData iVar) {
            this.f78208a = dVar;
            this.f78209b = iVar;
        }

        public final void onClick(View view) {
            OnItemClickListener a = this.f78208a.mo112310a();
            if (a != null) {
                a.mo112315a(this.f78209b.mo112392a());
            }
        }
    }

    /* renamed from: a */
    public final void mo112314a(List<OneRoomFilterViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "filterData");
        Log.m165389i("MeetingRoomFilterAdapter", C32673y.m125378d("filterData.size = " + list.size()));
        this.f78206b.clear();
        this.f78206b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public RoomFilterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_meeting_room_search_filter, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new RoomFilterViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(RoomFilterViewHolder eVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        OneRoomFilterViewData iVar = this.f78206b.get(i);
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mFilterData[position]");
        OneRoomFilterViewData iVar2 = iVar;
        eVar.mo112317a().setOnClickListener(new View$OnClickListenerC31024c(this, iVar2));
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == getItemCount() - 1) {
            z2 = true;
        }
        eVar.mo112318a(iVar2, z, z2);
        if (i == 0) {
            CalendarGuideManager aVar = CalendarGuideManager.f78922a;
            View view = eVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            Context context = view.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            aVar.mo113200g((Activity) context, eVar.itemView);
        }
    }
}

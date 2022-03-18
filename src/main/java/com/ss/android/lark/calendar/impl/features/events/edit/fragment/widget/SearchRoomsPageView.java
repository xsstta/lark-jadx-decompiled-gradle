package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012J\u001a\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/SearchRoomsPageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mOnLoadMoreClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "mOnMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "meetingRoomsAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "meetingRoomsItemModels", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "Lkotlin/collections/ArrayList;", "refreshMeetingRooms", "", "meetingRooms", "setViewHolderListener", "onMeetingRoomItemClickedListener", "onLoadMoreClickedListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchRoomsPageView extends FrameLayout {

    /* renamed from: a */
    private BuildingAdapter f80980a;

    /* renamed from: b */
    private final ArrayList<ItemModel> f80981b;

    /* renamed from: c */
    private MeetingRoomViewHolder.OnItemClickListener f80982c;

    /* renamed from: d */
    private LoadMoreViewHolder.OnItemClickListener f80983d;

    /* renamed from: e */
    private HashMap f80984e;

    public SearchRoomsPageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchRoomsPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo115969a(int i) {
        if (this.f80984e == null) {
            this.f80984e = new HashMap();
        }
        View view = (View) this.f80984e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80984e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo115971a(ArrayList<ItemModel> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "meetingRooms");
        this.f80981b.clear();
        this.f80981b.addAll(arrayList);
        BuildingAdapter cVar = this.f80980a;
        if (cVar == null) {
            this.f80980a = new BuildingAdapter(arrayList);
            RecyclerView recyclerView = (RecyclerView) mo115969a(R.id.meetingRoomsRecycleView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "meetingRoomsRecycleView");
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView2 = (RecyclerView) mo115969a(R.id.meetingRoomsRecycleView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "meetingRoomsRecycleView");
            recyclerView2.setAdapter(this.f80980a);
            BuildingAdapter cVar2 = this.f80980a;
            if (cVar2 != null) {
                cVar2.mo115211a(this.f80982c);
            }
            BuildingAdapter cVar3 = this.f80980a;
            if (cVar3 != null) {
                cVar3.mo115209a(this.f80983d);
                return;
            }
            return;
        }
        if (cVar != null) {
            cVar.mo115214a(this.f80981b);
        }
        BuildingAdapter cVar4 = this.f80980a;
        if (cVar4 != null) {
            cVar4.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo115970a(MeetingRoomViewHolder.OnItemClickListener aVar, LoadMoreViewHolder.OnItemClickListener aVar2) {
        this.f80982c = aVar;
        this.f80983d = aVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRoomsPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80981b = new ArrayList<>();
        LayoutInflater.from(context).inflate(R.layout.calendar_search_meeting_rooms_page_result, (ViewGroup) this, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchRoomsPageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

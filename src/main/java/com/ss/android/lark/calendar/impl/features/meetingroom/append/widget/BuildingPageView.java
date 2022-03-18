package com.ss.android.lark.calendar.impl.features.meetingroom.append.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class BuildingPageView extends RecyclerView {

    /* renamed from: a */
    private final Lazy f81912a;

    public BuildingPageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BuildingPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ResourceDisplayAdapter getAppendBuildingAdapter() {
        return (ResourceDisplayAdapter) this.f81912a.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.BuildingPageView$a */
    public static final class C32028a extends Lambda implements Function0<ResourceDisplayAdapter> {
        public static final C32028a INSTANCE = new C32028a();

        C32028a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ResourceDisplayAdapter invoke() {
            return new ResourceDisplayAdapter();
        }
    }

    /* renamed from: a */
    public final void mo116978a(List<? extends BaseModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        getAppendBuildingAdapter().mo116713a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingPageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81912a = LazyKt.lazy(C32028a.INSTANCE);
        setLayoutManager(new LinearLayoutManager(context));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOverScrollMode(2);
        setMotionEventSplittingEnabled(false);
        setAdapter(getAppendBuildingAdapter());
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setChangeDuration(0);
        }
    }

    /* renamed from: a */
    public final void mo116977a(BuildingViewHolder.IActionListener bVar, MeetingRoomViewHolder.IActionListener bVar2, ResourceDisplayAdapter.IBaseActionListener aVar, ChosenMeetingRoomViewHolder.IChosenResourceAction bVar3) {
        getAppendBuildingAdapter().mo116710a(bVar);
        getAppendBuildingAdapter().mo116712a(bVar2);
        getAppendBuildingAdapter().mo116709a(aVar);
        getAppendBuildingAdapter().mo116711a(bVar3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuildingPageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m121901a(BuildingPageView buildingPageView, BuildingViewHolder.IActionListener bVar, MeetingRoomViewHolder.IActionListener bVar2, ResourceDisplayAdapter.IBaseActionListener aVar, ChosenMeetingRoomViewHolder.IChosenResourceAction bVar3, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        if ((i & 8) != 0) {
            bVar3 = null;
        }
        buildingPageView.mo116977a(bVar, bVar2, aVar, bVar3);
    }
}

package com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceMultiLevelAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelContentViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ6\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0012j\b\u0012\u0004\u0012\u00020\u0016`\u0014J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "multiLevelAdapter", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceMultiLevelAdapter;", "getMultiLevelAdapter", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceMultiLevelAdapter;", "multiLevelAdapter$delegate", "Lkotlin/Lazy;", "refreshMultiLevelView", "", "itemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "Lkotlin/collections/ArrayList;", "breadItem", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "refreshSearchView", "", "setBreadCrumbsListener", "multiBreadCrumbsListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "setViewHolderListener", "roomListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "levelContentListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "searchMeetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiLevelView extends FrameLayout {

    /* renamed from: a */
    private final Lazy f81877a;

    /* renamed from: b */
    private HashMap f81878b;

    public MultiLevelView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MultiLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ResourceMultiLevelAdapter getMultiLevelAdapter() {
        return (ResourceMultiLevelAdapter) this.f81877a.getValue();
    }

    /* renamed from: a */
    public View mo116915a(int i) {
        if (this.f81878b == null) {
            this.f81878b = new HashMap();
        }
        View view = (View) this.f81878b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81878b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceMultiLevelAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelView$a */
    static final class C32005a extends Lambda implements Function0<ResourceMultiLevelAdapter> {
        public static final C32005a INSTANCE = new C32005a();

        C32005a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ResourceMultiLevelAdapter invoke() {
            return new ResourceMultiLevelAdapter();
        }
    }

    /* renamed from: a */
    public final void mo116918a(List<? extends BaseModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "itemList");
        LevelBreadcrumbsView levelBreadcrumbsView = (LevelBreadcrumbsView) mo116915a(R.id.multiBreadcrumbs);
        Intrinsics.checkExpressionValueIsNotNull(levelBreadcrumbsView, "multiBreadcrumbs");
        levelBreadcrumbsView.setVisibility(8);
        getMultiLevelAdapter().mo116759a(list);
    }

    public final void setBreadCrumbsListener(LevelBreadcrumbsView.IBreadcrumbsListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "multiBreadCrumbsListener");
        ((LevelBreadcrumbsView) mo116915a(R.id.multiBreadcrumbs)).setCallback(aVar);
    }

    /* renamed from: a */
    public final void mo116917a(ArrayList<BaseModel> arrayList, ArrayList<MultiLevelNode> arrayList2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "itemList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "breadItem");
        if (arrayList2.size() > 1) {
            LevelBreadcrumbsView levelBreadcrumbsView = (LevelBreadcrumbsView) mo116915a(R.id.multiBreadcrumbs);
            Intrinsics.checkExpressionValueIsNotNull(levelBreadcrumbsView, "multiBreadcrumbs");
            levelBreadcrumbsView.setVisibility(0);
        } else {
            LevelBreadcrumbsView levelBreadcrumbsView2 = (LevelBreadcrumbsView) mo116915a(R.id.multiBreadcrumbs);
            Intrinsics.checkExpressionValueIsNotNull(levelBreadcrumbsView2, "multiBreadcrumbs");
            levelBreadcrumbsView2.setVisibility(8);
        }
        getMultiLevelAdapter().mo116759a(arrayList);
        ((LevelBreadcrumbsView) mo116915a(R.id.multiBreadcrumbs)).setMultiItems(arrayList2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81877a = LazyKt.lazy(C32005a.INSTANCE);
        LayoutInflater.from(context).inflate(R.layout.calendar_buildings_mutil_level_rooms, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) mo116915a(R.id.multiRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "multiRecycleView");
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = (RecyclerView) mo116915a(R.id.multiRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "multiRecycleView");
        recyclerView2.setAdapter(getMultiLevelAdapter());
        RecyclerView recyclerView3 = (RecyclerView) mo116915a(R.id.multiRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "multiRecycleView");
        recyclerView3.setItemAnimator(null);
    }

    /* renamed from: a */
    public final void mo116916a(MultiLevelMeetingRoomViewHolder.IActionListener bVar, MultiLevelContentViewHolder.IActionListener bVar2, MeetingRoomViewHolder.IActionListener bVar3, ResourceDisplayAdapter.IBaseActionListener aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "roomListener");
        Intrinsics.checkParameterIsNotNull(bVar2, "levelContentListener");
        Intrinsics.checkParameterIsNotNull(bVar3, "searchMeetingRoomAction");
        Intrinsics.checkParameterIsNotNull(aVar, "itemClickListener");
        getMultiLevelAdapter().mo116758a(bVar);
        getMultiLevelAdapter().mo116757a(bVar2);
        getMultiLevelAdapter().mo116756a(bVar3);
        getMultiLevelAdapter().mo116755a(aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiLevelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

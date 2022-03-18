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
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ6\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0012j\b\u0012\u0004\u0012\u00020\u0016`\u0014J\u0006\u0010\u0017\u001a\u00020\u0010J\u001e\u0010\u0018\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014J6\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/MultiLevelView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "multiItemAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "getMultiItemAdapter", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "multiItemAdapter$delegate", "Lkotlin/Lazy;", "refreshMultiLevelView", "", "itemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "Lkotlin/collections/ArrayList;", "breadItem", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "refreshMultiLevelViewState", "refreshSearchView", "setViewHolderListener", "onMultiLevelClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "onMultiMeetingRoomClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "onLoadMoreClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "onMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "onMultiBreadCrumbsListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiLevelView extends FrameLayout {

    /* renamed from: a */
    private final Lazy f80978a;

    /* renamed from: b */
    private HashMap f80979b;

    public MultiLevelView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MultiLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final BuildingAdapter getMultiItemAdapter() {
        return (BuildingAdapter) this.f80978a.getValue();
    }

    /* renamed from: a */
    public View mo115964a(int i) {
        if (this.f80979b == null) {
            this.f80979b = new HashMap();
        }
        View view = (View) this.f80979b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80979b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo115965a() {
        getMultiItemAdapter().notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.MultiLevelView$a */
    static final class C31809a extends Lambda implements Function0<BuildingAdapter> {
        public static final C31809a INSTANCE = new C31809a();

        C31809a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BuildingAdapter invoke() {
            return new BuildingAdapter(new ArrayList());
        }
    }

    /* renamed from: a */
    public final void mo115967a(ArrayList<ItemModel> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "itemList");
        LevelBreadcrumbsView levelBreadcrumbsView = (LevelBreadcrumbsView) mo115964a(R.id.multiBreadcrumbs);
        Intrinsics.checkExpressionValueIsNotNull(levelBreadcrumbsView, "multiBreadcrumbs");
        levelBreadcrumbsView.setVisibility(8);
        getMultiItemAdapter().mo115214a(arrayList);
        getMultiItemAdapter().notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo115968a(ArrayList<ItemModel> arrayList, ArrayList<MultiLevelNode> arrayList2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "itemList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "breadItem");
        if (arrayList2.size() > 1) {
            LevelBreadcrumbsView levelBreadcrumbsView = (LevelBreadcrumbsView) mo115964a(R.id.multiBreadcrumbs);
            Intrinsics.checkExpressionValueIsNotNull(levelBreadcrumbsView, "multiBreadcrumbs");
            levelBreadcrumbsView.setVisibility(0);
        } else {
            LevelBreadcrumbsView levelBreadcrumbsView2 = (LevelBreadcrumbsView) mo115964a(R.id.multiBreadcrumbs);
            Intrinsics.checkExpressionValueIsNotNull(levelBreadcrumbsView2, "multiBreadcrumbs");
            levelBreadcrumbsView2.setVisibility(8);
        }
        getMultiItemAdapter().mo115214a(arrayList);
        getMultiItemAdapter().notifyDataSetChanged();
        ((LevelBreadcrumbsView) mo115964a(R.id.multiBreadcrumbs)).setMultiItems(arrayList2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80978a = LazyKt.lazy(C31809a.INSTANCE);
        LayoutInflater.from(context).inflate(R.layout.calendar_buildings_mutil_level_rooms, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) mo115964a(R.id.multiRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "multiRecycleView");
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = (RecyclerView) mo115964a(R.id.multiRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "multiRecycleView");
        recyclerView2.setAdapter(getMultiItemAdapter());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiLevelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public final void mo115966a(MultiLevelViewHolder.OnItemClickListener aVar, MultiMeetingRoomViewHolder.OnItemClickListener aVar2, LoadMoreViewHolder.OnItemClickListener aVar3, MeetingRoomViewHolder.OnItemClickListener aVar4, LevelBreadcrumbsView.IBreadcrumbsListener aVar5) {
        Intrinsics.checkParameterIsNotNull(aVar5, "onMultiBreadCrumbsListener");
        getMultiItemAdapter().mo115212a(aVar);
        getMultiItemAdapter().mo115213a(aVar2);
        getMultiItemAdapter().mo115209a(aVar3);
        getMultiItemAdapter().mo115211a(aVar4);
        ((LevelBreadcrumbsView) mo115964a(R.id.multiBreadcrumbs)).setCallback(aVar5);
    }
}

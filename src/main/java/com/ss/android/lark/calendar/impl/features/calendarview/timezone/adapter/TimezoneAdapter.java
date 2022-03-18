package com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23281e;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23278b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0004)*+,B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J(\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0016J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0016\u0010#\u001a\u00020\u000e2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\nJ\u0010\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/SwipeableItemAdapter;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneVH;", "()V", "mDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "mIsModifyForDesktop", "", "mItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$ItemClickListener;", "deleteSwipedItem", "", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onGetSwipeReactionType", "x", "y", "onSetSwipeBackground", ShareHitPoint.f121869d, "onSwipeItem", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultAction;", "result", "onSwipeItemStarted", "refreshTimezoneData", "dataList", "setIsModifyForDesktop", "isModifyForDesktop", "setItemClickListener", "itemClickListener", "Companion", "ItemClickListener", "SwipeCloseResultAction", "SwipeLeftResultAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.c */
public final class TimezoneAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AbstractC23297g<TimeZoneVH> {

    /* renamed from: b */
    public static TimeZoneItemData f78381b;

    /* renamed from: c */
    public static final Companion f78382c = new Companion(null);

    /* renamed from: a */
    public ArrayList<TimeZoneItemData> f78383a = new ArrayList<>();

    /* renamed from: d */
    private ItemClickListener f78384d;

    /* renamed from: e */
    private boolean f78385e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$ItemClickListener;", "", "onBodyClick", "", "itemData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "onDeleteClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.c$b */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo112493a(TimeZoneItemData aVar);

        /* renamed from: b */
        void mo112494b(TimeZoneItemData aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$Companion;", "", "()V", "swipedItemData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "hitTest", "", "v", "Landroid/view/View;", "x", "", "y", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo112492a(View view, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            int translationX = (int) (view.getTranslationX() + 0.5f);
            int translationY = (int) (view.getTranslationY() + 0.5f);
            int left = view.getLeft() + translationX;
            int right = view.getRight() + translationX;
            int top = view.getTop() + translationY;
            int bottom = view.getBottom() + translationY;
            if (left <= i && right >= i && i2 >= top && i2 <= bottom) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78383a.size();
    }

    public TimezoneAdapter() {
        setHasStableIds(true);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$SwipeCloseResultAction;", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultActionDefault;", "adapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter;", "position", "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter;I)V", "onPerformAction", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.c$c */
    public static final class SwipeCloseResultAction extends C23278b {

        /* renamed from: a */
        private TimezoneAdapter f78386a;

        /* renamed from: b */
        private final int f78387b;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            TimeZoneItemData aVar = this.f78386a.f78383a.get(this.f78387b);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "adapter.mDataList[position]");
            TimeZoneItemData aVar2 = aVar;
            if (aVar2.mo112474a()) {
                aVar2.mo112473a(false);
                this.f78386a.notifyDataSetChanged();
            }
        }

        public SwipeCloseResultAction(TimezoneAdapter cVar, int i) {
            Intrinsics.checkParameterIsNotNull(cVar, "adapter");
            this.f78386a = cVar;
            this.f78387b = i;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$SwipeLeftResultAction;", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultActionMoveToSwipedDirection;", "adapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter;", "position", "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter;I)V", "onPerformAction", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.a.c$d */
    public static final class SwipeLeftResultAction extends AbstractC23281e {

        /* renamed from: a */
        private TimezoneAdapter f78388a;

        /* renamed from: b */
        private final int f78389b;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            TimeZoneItemData aVar = this.f78388a.f78383a.get(this.f78389b);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "adapter.mDataList[position]");
            TimeZoneItemData aVar2 = aVar;
            if (!aVar2.mo112474a()) {
                TimeZoneItemData aVar3 = TimezoneAdapter.f78381b;
                if (aVar3 != null) {
                    aVar3.mo112473a(false);
                }
                TimezoneAdapter.f78381b = aVar2;
                aVar2.mo112473a(true);
                this.f78388a.notifyDataSetChanged();
            }
        }

        public SwipeLeftResultAction(TimezoneAdapter cVar, int i) {
            Intrinsics.checkParameterIsNotNull(cVar, "adapter");
            this.f78388a = cVar;
            this.f78389b = i;
        }
    }

    /* renamed from: a */
    public final void mo112487a() {
        TimeZoneItemData aVar = f78381b;
        if (aVar != null) {
            this.f78383a.remove(aVar);
            f78381b = null;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo112489a(ItemClickListener bVar) {
        this.f78384d = bVar;
    }

    /* renamed from: a */
    public final void mo112490a(ArrayList<TimeZoneItemData> arrayList) {
        this.f78383a.clear();
        if (arrayList != null) {
            this.f78383a.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_calendar_timezone_cell, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new TimeZoneVH(inflate, this.f78385e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof TimeZoneVH) {
            TimeZoneItemData aVar = this.f78383a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mDataList[position]");
            TimeZoneItemData aVar2 = aVar;
            TimeZoneVH bVar = (TimeZoneVH) viewHolder;
            bVar.mo112481a(aVar2, this.f78384d);
            int dp2px = UIUtils.dp2px(bVar.mo112482l().getContext(), 100.0f);
            bVar.mo80838a(false);
            float f = BitmapDescriptorFactory.HUE_RED;
            bVar.mo80867d(BitmapDescriptorFactory.HUE_RED);
            float f2 = (float) (-dp2px);
            bVar.mo80866c(f2);
            if (aVar2.mo112474a()) {
                f = f2;
            }
            bVar.mo80835a(f);
        }
    }

    /* renamed from: a */
    public void mo80774e(TimeZoneVH bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo80760a(TimeZoneVH bVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        if (i2 == 0) {
            bVar.mo112482l().setVisibility(8);
        } else {
            bVar.mo112482l().setVisibility(0);
        }
    }

    /* renamed from: a */
    public AbstractC23277a mo80765b(TimeZoneVH bVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        if (i == -1) {
            return new SwipeCloseResultAction(this, i);
        }
        if (i2 != 2) {
            return new SwipeCloseResultAction(this, i);
        }
        return new SwipeLeftResultAction(this, i);
    }

    /* renamed from: a */
    public int mo80756a(TimeZoneVH bVar, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        if (f78382c.mo112492a(bVar.mo80851k(), i2, i3)) {
            return 8194;
        }
        return 0;
    }
}

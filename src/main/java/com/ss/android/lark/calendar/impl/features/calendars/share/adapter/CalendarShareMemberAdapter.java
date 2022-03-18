package com.ss.android.lark.calendar.impl.features.calendars.share.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1396o;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter$MemberListener;", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListener", "setMemberData", "memberList", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "isShowLimitTip", "", "Companion", "MemberListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.b */
public final class CalendarShareMemberAdapter extends AbstractC1396o<Object, RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final Companion f76223a = new Companion(null);

    /* renamed from: b */
    private MemberListener f76224b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter$MemberListener;", "", "getCalendarOwnerId", "", "onMemberContainerClicked", "", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.b$b */
    public interface MemberListener {
        /* renamed from: a */
        String mo109903a();

        /* renamed from: a */
        void mo109904a(CalendarMember calendarMember);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter$Companion;", "", "()V", "TYPE_MEMBER", "", "TYPE_TITLE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CalendarShareMemberAdapter() {
        super(new C1374g.AbstractC1378c<Object>() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter.C304571 */

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1378c
            public boolean areContentsTheSame(Object obj, Object obj2) {
                Intrinsics.checkParameterIsNotNull(obj, "oldItem");
                Intrinsics.checkParameterIsNotNull(obj2, "newItem");
                return Intrinsics.areEqual(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1378c
            public boolean areItemsTheSame(Object obj, Object obj2) {
                Intrinsics.checkParameterIsNotNull(obj, "oldItem");
                Intrinsics.checkParameterIsNotNull(obj2, "newItem");
                if ((obj instanceof MemberViewData) && (obj2 instanceof MemberViewData)) {
                    return CalendarShareDataHelper.f76316a.mo110023a(((MemberViewData) obj).mo109905a(), ((MemberViewData) obj2).mo109905a());
                }
                if (!(obj instanceof TextViewData) || !(obj2 instanceof TextViewData)) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void mo109901a(MemberListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f76224b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !(getItem(i) instanceof MemberViewData) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Object item = getItem(i);
        if ((viewHolder instanceof CalendarMemberVH) && (item instanceof MemberViewData)) {
            ((CalendarMemberVH) viewHolder).mo109896a(((MemberViewData) item).mo109905a(), this.f76224b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i != 0) {
            return new MemberTextTipViewHolder(new TextView(viewGroup.getContext()));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_calendar_share_member_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…er_layout, parent, false)");
        return new CalendarMemberVH(inflate);
    }

    /* renamed from: a */
    public final void mo109902a(List<CalendarMember> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "memberList");
        ArrayList arrayList = new ArrayList();
        List<CalendarMember> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new MemberViewData(it.next()));
        }
        arrayList.addAll(arrayList2);
        if (z) {
            arrayList.add(new TextViewData(list.size()));
        }
        submitList(arrayList);
    }
}

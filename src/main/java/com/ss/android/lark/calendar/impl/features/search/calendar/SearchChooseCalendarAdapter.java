package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.calendar.ISearchChooseCalendarContract;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListCellViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListHeaderViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListSubHeaderViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListSubscribeTitleViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListSubscribeViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J$\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J8\u0010\u001d\u001a\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\"\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 j\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"`#J:\u0010$\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\"\u0010&\u001a\u001e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 j\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"`#H\u0002J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u000eJ&\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\"H\u0002R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/BaseChooseCalendarAdapter;", "context", "Landroid/content/Context;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;)V", "mDecorationIndexList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter$OnViewItemClickListener;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "parseCalendar", "myCalendars", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "subCalendars", "parseCalendarDataSource", "calendars", "googleAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "parseGoogleCalendar", "googleCalendars", "calendarVisibleMap", "setOnViewItemClickListener", "listener", "setViewData", "viewData", "sortForVisibility", "isFixFirst", "CategoryDecoration", "OnViewItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.c */
public final class SearchChooseCalendarAdapter extends C32315a {

    /* renamed from: e */
    public final ArrayList<Integer> f82715e = new ArrayList<>();

    /* renamed from: f */
    public ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData f82716f;

    /* renamed from: g */
    public OnViewItemClickListener f82717g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter$OnViewItemClickListener;", "", "onClickSubscribe", "", "onItemClick", "calendarId", "", "isVisible", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.c$b */
    public interface OnViewItemClickListener {
        /* renamed from: a */
        void mo118090a();

        /* renamed from: a */
        void mo118091a(String str, boolean z);
    }

    /* renamed from: a */
    public final void mo118086a(ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewData");
        this.f82716f = bVar;
    }

    /* renamed from: a */
    public final void mo118087a(OnViewItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f82717g = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter$CategoryDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "(Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarAdapter;)V", "DEFAULT_HEIGHT", "", "mDividerHeight", "", "mPaint", "Landroid/graphics/Paint;", "margin", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.c$a */
    public final class CategoryDecoration extends RecyclerView.AbstractC1335d {

        /* renamed from: b */
        private final float f82721b = 8.0f;

        /* renamed from: c */
        private int f82722c;

        /* renamed from: d */
        private final Paint f82723d;

        /* renamed from: e */
        private float f82724e;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CategoryDecoration() {
            Paint paint = new Paint();
            this.f82723d = paint;
            paint.setAntiAlias(true);
            paint.setColor(C32634ae.m125178a(R.color.bg_base));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.getChildAdapterPosition(childAt);
                if (SearchChooseCalendarAdapter.this.f82715e.contains(Integer.valueOf(recyclerView.getChildAdapterPosition(childAt)))) {
                    if (this.f82722c == 0) {
                        this.f82722c = C57582a.m223601a(recyclerView.getContext(), this.f82721b);
                    }
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                    int top = childAt.getTop() - this.f82722c;
                    float f = (float) top;
                    canvas.drawRect(((float) recyclerView.getPaddingLeft()) + this.f82724e, f, (((float) recyclerView.getWidth()) - ((float) recyclerView.getPaddingRight())) - this.f82724e, (float) childAt.getTop(), this.f82723d);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            super.getItemOffsets(rect, view, recyclerView, state);
            if (this.f82722c == 0) {
                this.f82722c = C57582a.m223601a(recyclerView.getContext(), this.f82721b);
            }
            if (SearchChooseCalendarAdapter.this.f82715e.contains(Integer.valueOf(recyclerView.getChildAdapterPosition(view)))) {
                rect.top = this.f82722c;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchChooseCalendarAdapter(Context context, final RecyclerView recyclerView) {
        super(recyclerView);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f82713d = new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarAdapter.View$OnClickListenerC323181 */

            /* renamed from: a */
            final /* synthetic */ SearchChooseCalendarAdapter f82718a;

            {
                this.f82718a = r1;
            }

            public final void onClick(View view) {
                OnViewItemClickListener bVar;
                boolean z;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition != -1 && childAdapterPosition < this.f82718a.f82712c.size()) {
                    DataListItem dataListItem = (DataListItem) this.f82718a.f82712c.get(childAdapterPosition);
                    Intrinsics.checkExpressionValueIsNotNull(dataListItem, "item");
                    if (dataListItem.mo118153c() == DataListItem.TYPE.CELL) {
                        Calendar a = dataListItem.mo118146a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "cal");
                        String serverId = a.getServerId();
                        ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar2 = this.f82718a.f82716f;
                        if (bVar2 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(serverId, "calendarId");
                            z = bVar2.mo118084a(serverId);
                        } else {
                            z = false;
                        }
                        OnViewItemClickListener bVar3 = this.f82718a.f82717g;
                        if (bVar3 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(serverId, "calendarId");
                            bVar3.mo118091a(serverId, !z);
                        }
                    }
                    if (dataListItem.mo118153c() == DataListItem.TYPE.SUBSCRIBE && (bVar = this.f82718a.f82717g) != null) {
                        bVar.mo118090a();
                    }
                }
            }
        };
        recyclerView.addItemDecoration(new CategoryDecoration());
    }

    /* renamed from: a */
    private final List<Calendar> m123301a(List<? extends Calendar> list, boolean z) {
        int i;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        if (list == null) {
            return arrayList;
        }
        if (z) {
            arrayList.add(list.get(0));
            i = 1;
        } else {
            i = 0;
        }
        int size = list.size();
        while (i < size) {
            Calendar calendar = (Calendar) list.get(i);
            ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar = this.f82716f;
            if (bVar != null) {
                String serverId = calendar.getServerId();
                Intrinsics.checkExpressionValueIsNotNull(serverId, "cal.serverId");
                z2 = bVar.mo118084a(serverId);
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(calendar);
            } else {
                arrayList2.add(calendar);
            }
            i++;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.C32315a, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        View view = viewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setTag(Integer.valueOf(i));
        DataListItem dataListItem = (DataListItem) this.f82712c.get(i);
        if (dataListItem == null) {
            return;
        }
        if (dataListItem.mo118153c() == DataListItem.TYPE.HEADER) {
            CalendarListHeaderViewHolder calendarListHeaderViewHolder = (CalendarListHeaderViewHolder) viewHolder;
            calendarListHeaderViewHolder.mo118141a(dataListItem);
            calendarListHeaderViewHolder.mo118140a();
        } else if (dataListItem.mo118153c() == DataListItem.TYPE.SUB_HEADER) {
            CalendarListSubHeaderViewHolder calendarListSubHeaderViewHolder = (CalendarListSubHeaderViewHolder) viewHolder;
            calendarListSubHeaderViewHolder.mo118145a(dataListItem);
            calendarListSubHeaderViewHolder.mo118144a();
        } else if (dataListItem.mo118153c() == DataListItem.TYPE.CELL) {
            CalendarListCellViewHolder calendarListCellViewHolder = (CalendarListCellViewHolder) viewHolder;
            ISearchChooseCalendarContract.ISearchChooseCalendarView.IViewData bVar = this.f82716f;
            if (bVar != null) {
                Calendar a = dataListItem.mo118146a();
                Intrinsics.checkExpressionValueIsNotNull(a, "item.calendar");
                String serverId = a.getServerId();
                Intrinsics.checkExpressionValueIsNotNull(serverId, "item.calendar.serverId");
                z = bVar.mo118084a(serverId);
            } else {
                z = false;
            }
            calendarListCellViewHolder.mo118136a(dataListItem, z);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.calendar.C32315a, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == DataListItem.TYPE.SUBSCRIBE.getIntValue()) {
            View inflate = from.inflate(R.layout.item_calendar_drawer_subscribe, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            View.OnClickListener onClickListener = this.f82713d;
            Intrinsics.checkExpressionValueIsNotNull(onClickListener, "mOnItemClickListener");
            return new CalendarListSubscribeViewHolder(inflate, onClickListener);
        } else if (i == DataListItem.TYPE.SUBSCRIBE_TITLE.getIntValue()) {
            View inflate2 = from.inflate(R.layout.item_calendar_drawer_subscribe_title, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
            return new CalendarListSubscribeTitleViewHolder(inflate2);
        } else {
            RecyclerView.ViewHolder onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            Intrinsics.checkExpressionValueIsNotNull(onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
            return onCreateViewHolder;
        }
    }

    /* renamed from: a */
    private final void m123302a(List<? extends Calendar> list, List<? extends Calendar> list2) {
        if (!list.isEmpty()) {
            DataListItem dataListItem = new DataListItem();
            dataListItem.mo118147a(DataListItem.TYPE.SUB_HEADER);
            dataListItem.mo118149a(C32634ae.m125182b(R.string.Calendar_Common_MyCalendars));
            this.f82712c.add(dataListItem);
        }
        for (Calendar calendar : list) {
            DataListItem dataListItem2 = new DataListItem();
            dataListItem2.mo118148a(calendar);
            dataListItem2.mo118147a(DataListItem.TYPE.CELL);
            this.f82712c.add(dataListItem2);
        }
        this.f82715e.add(Integer.valueOf(this.f82712c.size()));
        if (!list2.isEmpty()) {
            DataListItem dataListItem3 = new DataListItem();
            dataListItem3.mo118147a(DataListItem.TYPE.SUB_HEADER);
            dataListItem3.mo118149a(C32634ae.m125182b(R.string.Calendar_Common_SubscribedCalendar));
            this.f82712c.add(dataListItem3);
        }
        for (Calendar calendar2 : list2) {
            DataListItem dataListItem4 = new DataListItem();
            dataListItem4.mo118148a(calendar2);
            dataListItem4.mo118147a(DataListItem.TYPE.CELL);
            this.f82712c.add(dataListItem4);
        }
    }

    /* renamed from: b */
    private final void m123303b(List<? extends Calendar> list, HashMap<String, Boolean> hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Calendar calendar : list) {
            if (calendar.getExternalAccount() != null) {
                ArrayList arrayList = (ArrayList) linkedHashMap.get(calendar.getExternalAccount());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    String externalAccount = calendar.getExternalAccount();
                    Intrinsics.checkExpressionValueIsNotNull(externalAccount, "cal.externalAccount");
                    linkedHashMap.put(externalAccount, arrayList);
                }
                arrayList.add(calendar);
            }
        }
        for (String str : linkedHashMap.keySet()) {
            Boolean bool = hashMap.get(str);
            if (bool == null) {
                bool = true;
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "calendarVisibleMap[email] ?: true");
            boolean booleanValue = bool.booleanValue();
            if (linkedHashMap.get(str) != null && (hashMap.get(str) == null || booleanValue)) {
                this.f82715e.add(Integer.valueOf(this.f82712c.size()));
                DataListItem dataListItem = new DataListItem();
                dataListItem.mo118147a(DataListItem.TYPE.HEADER);
                dataListItem.mo118152b(true);
                dataListItem.mo118149a(str);
                this.f82712c.add(dataListItem);
                ArrayList<Calendar> arrayList2 = (ArrayList) m123301a((List) linkedHashMap.get(str), true);
                if (arrayList2 != null) {
                    for (Calendar calendar2 : arrayList2) {
                        DataListItem dataListItem2 = new DataListItem();
                        dataListItem2.mo118148a(calendar2);
                        dataListItem2.mo118147a(DataListItem.TYPE.CELL);
                        this.f82712c.add(dataListItem2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo118088a(List<? extends Calendar> list, HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(list, "calendars");
        Intrinsics.checkParameterIsNotNull(hashMap, "googleAccountSetting");
        this.f82712c.clear();
        DataListItem dataListItem = new DataListItem();
        dataListItem.mo118147a(DataListItem.TYPE.SUBSCRIBE);
        this.f82712c.add(dataListItem);
        DataListItem dataListItem2 = new DataListItem();
        dataListItem2.mo118147a(DataListItem.TYPE.SUBSCRIBE_TITLE);
        this.f82712c.add(dataListItem2);
        this.f82715e.clear();
        this.f82715e.add(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Calendar calendar = (Calendar) list.get(i);
            if (calendar != null) {
                if (calendar.getType() == Calendar.Type.GOOGLE) {
                    arrayList3.add(calendar);
                } else if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                    arrayList.add(calendar);
                } else {
                    arrayList2.add(calendar);
                }
            }
        }
        List<Calendar> a = m123301a((List<? extends Calendar>) arrayList, true);
        if (a != null) {
            ArrayList arrayList4 = (ArrayList) a;
            List<Calendar> a2 = m123301a((List<? extends Calendar>) arrayList2, false);
            if (a2 != null) {
                m123302a(arrayList4, (ArrayList) a2);
                m123303b(arrayList3, hashMap);
                notifyDataSetChanged();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar> /* = java.util.ArrayList<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar> */");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar> /* = java.util.ArrayList<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar> */");
    }
}

package com.ss.android.lark.calendar.impl.features.search.p1564a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.AbstractC30813a;
import com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.calendar.impl.features.search.a.b */
public class C32298b extends RecyclerView.Adapter<C30819b.AbstractC30820a> {

    /* renamed from: a */
    public ArrayList<CalendarListViewData> f82674a = new ArrayList<>();

    /* renamed from: b */
    public int f82675b;

    /* renamed from: c */
    public boolean f82676c;

    /* renamed from: d */
    public Typeface f82677d;

    /* renamed from: e */
    public Context f82678e;

    /* renamed from: f */
    CalendarSearchResultRv f82679f;

    /* renamed from: g */
    private C32301b f82680g = new C32301b();

    /* renamed from: a */
    public C32301b mo118054a() {
        return this.f82680g;
    }

    /* renamed from: c */
    public int mo118058c() {
        int i = this.f82675b;
        if (i < 0) {
            return -1;
        }
        if (this.f82676c) {
            return i;
        }
        return i - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<CalendarListViewData> arrayList = this.f82674a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: b */
    public void mo118057b() {
        int i = this.f82675b;
        m123211d();
        if (i != this.f82675b) {
            if (i >= 0 && i < getItemCount()) {
                notifyItemChanged(i);
            }
            int i2 = this.f82675b;
            if (i2 >= 0 && i2 < getItemCount()) {
                notifyItemChanged(this.f82675b);
            }
        }
    }

    /* renamed from: d */
    private void m123211d() {
        this.f82675b = -1;
        ArrayList<CalendarListViewData> arrayList = this.f82674a;
        if (arrayList == null || arrayList.size() == 0) {
            this.f82675b = -1;
        }
        int julianDay = new CalendarDate().getJulianDay();
        Iterator<CalendarListViewData> it = this.f82674a.iterator();
        long j = -1;
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            CalendarListViewData next = it.next();
            int julianDay2 = next.getJulianDay();
            if (julianDay2 == julianDay) {
                if (next.getViewType() == 0) {
                    if (next.getEventChipViewData().isAllDay()) {
                        this.f82676c = true;
                        this.f82675b = i;
                    } else if (System.currentTimeMillis() >= next.getEventChipViewData().getEndTime() * 1000) {
                        this.f82676c = true;
                        this.f82675b = i;
                        j = -1;
                    } else if (System.currentTimeMillis() >= next.getEventChipViewData().getStartTime() * 1000) {
                        if (j != next.getEventChipViewData().getStartTime()) {
                            this.f82676c = false;
                            this.f82675b = i;
                            j = next.getEventChipViewData().getStartTime();
                        }
                    } else if (!z) {
                        this.f82675b = i;
                        this.f82676c = false;
                    }
                    z = true;
                }
            } else if (julianDay < julianDay2) {
                return;
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a.b$c */
    public class C32302c extends C30819b.AbstractC30820a {

        /* renamed from: a */
        TextView f82691a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.AbstractC30820a
        /* renamed from: a */
        public void mo111707a(CalendarListViewData calendarListViewData) {
            this.f82691a.setText(calendarListViewData.getMonthString());
        }

        C32302c(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.tv_calendar_list_month_data);
            this.f82691a = textView;
            textView.setTypeface(C32298b.this.f82677d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f82674a.get(i).getViewType();
    }

    /* renamed from: a */
    public CalendarListViewData mo118052a(int i) {
        if (this.f82674a.size() <= i || i < 0) {
            return null;
        }
        return this.f82674a.get(i);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a.b$b */
    public class C32301b extends RecyclerView.AbstractC1335d {

        /* renamed from: b */
        private int f82685b = C32634ae.m125185e(R.dimen.dp_5);

        /* renamed from: c */
        private int f82686c = C32634ae.m125185e(R.dimen.dp_23);

        /* renamed from: d */
        private int f82687d = C32634ae.m125185e(R.dimen.dp_2);

        /* renamed from: e */
        private int f82688e = C32634ae.m125185e(R.dimen.dp_1d5);

        /* renamed from: f */
        private int f82689f = C32634ae.m125185e(R.dimen.dp_53);

        /* renamed from: g */
        private int f82690g = C32634ae.m125178a(R.color.lkui_R500);

        public C32301b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && C32298b.this.f82675b == childAdapterPosition) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                    int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                    int right = childAt.getRight() + layoutParams.rightMargin;
                    int top = childAt.getTop() + layoutParams.topMargin;
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.f82690g);
                    if (C32298b.this.f82676c) {
                        i = bottom + this.f82685b;
                    } else {
                        i = top - this.f82685b;
                    }
                    float f = (float) this.f82689f;
                    int i3 = this.f82688e;
                    canvas.drawRect(f, (float) (i - (i3 / 2)), (float) (right - this.f82685b), (float) ((i3 / 2) + i), paint);
                    int i4 = this.f82689f;
                    int i5 = this.f82687d;
                    canvas.drawCircle((float) (i4 - i5), (float) i, (float) i5, paint);
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            CalendarListViewData calendarListViewData;
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            rect.top = this.f82685b;
            int i = childAdapterPosition + 1;
            if (C32298b.this.f82674a.size() > i) {
                calendarListViewData = C32298b.this.f82674a.get(i);
            } else {
                calendarListViewData = null;
            }
            if (calendarListViewData == null || (calendarListViewData.getViewType() == 0 && !calendarListViewData.isDayFirstInstance())) {
                rect.bottom = this.f82685b;
            } else {
                rect.bottom = this.f82686c;
            }
        }
    }

    /* renamed from: a */
    public void mo118056a(ArrayList<CalendarListViewData> arrayList) {
        this.f82674a.clear();
        this.f82674a.addAll(arrayList);
        m123211d();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a.b$a */
    public class C32299a extends AbstractC30813a {
        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.AbstractC30820a
        /* renamed from: a */
        public void mo111707a(CalendarListViewData calendarListViewData) {
            this.f77523b.mo112558a(calendarListViewData.getEventChipViewData());
            this.f77524c = calendarListViewData.getWeekDay();
            this.f77525d = calendarListViewData.getMonthShortString();
            this.f77526e = calendarListViewData.getMonthDay() + "";
            this.f77527f = calendarListViewData.getTimeTextColor();
            this.f77528g = Boolean.valueOf(calendarListViewData.isDayFirstInstance());
            this.f77529h = Boolean.valueOf(calendarListViewData.isDayLastInstance());
            this.f77530i = calendarListViewData.getJulianDay();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f77523b.getLayoutParams();
            if (this.f77523b.getViewData() == null || !this.f77523b.getViewData().needShowThirdLind()) {
                layoutParams.height = UIUtils.dp2px(C32298b.this.f82678e, 50.0f);
            } else {
                layoutParams.height = UIUtils.dp2px(C32298b.this.f82678e, 68.0f);
            }
            this.f77523b.setLayoutParams(layoutParams);
        }

        C32299a(View view) {
            super(view);
            this.f77523b = (EventChipView) view.findViewById(R.id.calendar_list_data_chip);
            this.f77523b.setType(2);
            this.f77523b.setOnClickListener(new AbstractView$OnClickListenerC32626b(C32298b.this) {
                /* class com.ss.android.lark.calendar.impl.features.search.p1564a.C32298b.C32299a.C323001 */

                @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
                /* renamed from: a */
                public void mo108751a(View view) {
                    C31238b.m116868a(C32299a.this.f77523b.getContext(), C32299a.this.f77523b.getViewData().getOriginalTime(), C32299a.this.f77523b.getViewData().getKey(), C32299a.this.f77523b.getViewData().getCalendarId(), C32299a.this.f77523b.getViewData().getStartTime(), C32299a.this.f77523b.getViewData().getEndTime());
                    GeneralHitPoint.m124272s("advanced");
                }
            });
        }
    }

    /* renamed from: b */
    private View m123210b(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* renamed from: a */
    public void onBindViewHolder(C30819b.AbstractC30820a aVar, int i) {
        aVar.mo111707a(this.f82674a.get(i));
    }

    public C32298b(CalendarSearchResultRv aVar, Context context) {
        this.f82678e = context;
        this.f82679f = aVar;
        this.f82677d = Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf");
    }

    /* renamed from: a */
    public C30819b.AbstractC30820a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C30819b.AbstractC30820a aVar;
        if (i == 0) {
            aVar = new C32299a(m123210b(viewGroup, R.layout.fragment_calendar_list_view_item_event));
        } else if (i != 1) {
            return null;
        } else {
            aVar = new C32302c(m123210b(viewGroup, R.layout.fragment_calendar_list_view_item_month));
        }
        return aVar;
    }
}

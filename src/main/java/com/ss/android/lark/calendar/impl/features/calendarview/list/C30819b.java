package com.ss.android.lark.calendar.impl.features.calendarview.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b;
import com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b */
public class C30819b extends RecyclerView.Adapter<AbstractC30820a> {

    /* renamed from: a */
    public ArrayList<CalendarListViewData> f77573a;

    /* renamed from: b */
    public int f77574b;

    /* renamed from: c */
    public boolean f77575c;

    /* renamed from: d */
    public Typeface f77576d;

    /* renamed from: e */
    public Context f77577e;

    /* renamed from: f */
    C30850a f77578f;

    /* renamed from: g */
    private C30823c f77579g;

    /* renamed from: h */
    private ArrayList<C30821b> f77580h = new ArrayList<>(8);

    /* renamed from: a */
    public C30823c mo111702a() {
        return this.f77579g;
    }

    /* renamed from: c */
    public int mo111706c() {
        int i = this.f77574b;
        if (i < 0) {
            return -1;
        }
        if (this.f77575c) {
            return i;
        }
        return i - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<CalendarListViewData> arrayList = this.f77573a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    private void m115010d() {
        for (int i = 0; i < 8; i++) {
            this.f77580h.add(new C30821b(m115009b(this.f77578f.mo111791f(), R.layout.fragment_calendar_list_view_item_event)));
        }
    }

    /* renamed from: b */
    public void mo111705b() {
        int i = this.f77574b;
        m115011e();
        if (i != this.f77574b) {
            if (i >= 0 && i < getItemCount()) {
                notifyItemChanged(i);
            }
            int i2 = this.f77574b;
            if (i2 >= 0 && i2 < getItemCount()) {
                notifyItemChanged(this.f77574b);
            }
        }
    }

    /* renamed from: e */
    private void m115011e() {
        this.f77574b = -1;
        ArrayList<CalendarListViewData> arrayList = this.f77573a;
        if (arrayList == null || arrayList.size() == 0) {
            this.f77574b = -1;
        }
        int julianDay = new CalendarDate().getJulianDay();
        Iterator<CalendarListViewData> it = this.f77573a.iterator();
        long j = -1;
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            CalendarListViewData next = it.next();
            int julianDay2 = next.getJulianDay();
            if (julianDay2 == julianDay) {
                if (next.getViewType() == 3) {
                    this.f77574b = i;
                    this.f77575c = true;
                } else if (next.getViewType() == 0) {
                    if (next.getEventChipViewData().isAllDay()) {
                        this.f77575c = true;
                        this.f77574b = i;
                    } else if (System.currentTimeMillis() >= next.getEventChipViewData().getEndTime() * 1000) {
                        this.f77575c = true;
                        this.f77574b = i;
                        j = -1;
                    } else if (System.currentTimeMillis() >= next.getEventChipViewData().getStartTime() * 1000) {
                        if (j != next.getEventChipViewData().getStartTime()) {
                            this.f77575c = false;
                            this.f77574b = i;
                            j = next.getEventChipViewData().getStartTime();
                        }
                    } else if (!z) {
                        this.f77574b = i;
                        this.f77575c = false;
                    }
                }
                z = true;
            } else if (julianDay < julianDay2) {
                return;
            }
            i++;
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b$a */
    public static abstract class AbstractC30820a extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public abstract void mo111707a(CalendarListViewData calendarListViewData);

        public AbstractC30820a(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b$d */
    public class C30824d extends AbstractC30820a {

        /* renamed from: a */
        TextView f77591a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.AbstractC30820a
        /* renamed from: a */
        public void mo111707a(CalendarListViewData calendarListViewData) {
            this.f77591a.setText(calendarListViewData.getMonthString());
        }

        C30824d(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.tv_calendar_list_month_data);
            this.f77591a = textView;
            textView.setTypeface(C30819b.this.f77576d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f77573a.get(i).getViewType();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b$f */
    public class C30827f extends AbstractC30820a {

        /* renamed from: a */
        TextView f77602a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.AbstractC30820a
        /* renamed from: a */
        public void mo111707a(CalendarListViewData calendarListViewData) {
            C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(calendarListViewData) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.$$Lambda$b$f$8Ig2Iwip8p34ZAl1MOvLIhrtQkA */
                public final /* synthetic */ CalendarListViewData f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
                public final void onGetSucceed(CalendarSetting calendarSetting) {
                    C30819b.C30827f.this.m115024a(this.f$1, calendarSetting);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m115024a(CalendarListViewData calendarListViewData, CalendarSetting calendarSetting) {
            this.f77602a.setText(calendarListViewData.getYearWeekStr(calendarSetting.getWeekStartDay()));
        }

        C30827f(View view) {
            super(view);
            this.f77602a = (TextView) view.findViewById(R.id.tv_calendar_list_week_data);
            view.setOnClickListener(new View.OnClickListener(C30819b.this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.C30827f.View$OnClickListenerC308281 */

                public void onClick(View view) {
                    C30819b.this.f77578f.mo111790e();
                }
            });
        }
    }

    /* renamed from: a */
    public CalendarListViewData mo111700a(int i) {
        if (this.f77573a.size() <= i || i < 0) {
            return null;
        }
        return this.f77573a.get(i);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b$c */
    public class C30823c extends RecyclerView.AbstractC1335d {

        /* renamed from: b */
        private int f77585b = C32634ae.m125185e(R.dimen.dp_5);

        /* renamed from: c */
        private int f77586c = C32634ae.m125185e(R.dimen.dp_23);

        /* renamed from: d */
        private int f77587d = C32634ae.m125185e(R.dimen.dp_3d5);

        /* renamed from: e */
        private int f77588e = C32634ae.m125185e(R.dimen.dp_1d5);

        /* renamed from: f */
        private int f77589f = C32634ae.m125185e(R.dimen.dp_53);

        /* renamed from: g */
        private int f77590g = C32634ae.m125178a(R.color.lkui_R500);

        public C30823c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && C30819b.this.f77574b == childAdapterPosition) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                    int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                    int right = childAt.getRight() + layoutParams.rightMargin;
                    int top = childAt.getTop() + layoutParams.topMargin;
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.f77590g);
                    if (C30819b.this.f77575c) {
                        i = bottom + this.f77585b;
                    } else {
                        i = top - this.f77585b;
                    }
                    float f = (float) this.f77589f;
                    int i3 = this.f77588e;
                    canvas.drawRect(f, (float) (i - (i3 / 2)), (float) (right - this.f77585b), (float) ((i3 / 2) + i), paint);
                    int i4 = this.f77589f;
                    int i5 = this.f77587d;
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
            rect.top = this.f77585b;
            int i = childAdapterPosition + 1;
            if (C30819b.this.f77573a.size() > i) {
                calendarListViewData = C30819b.this.f77573a.get(i);
            } else {
                calendarListViewData = null;
            }
            if (calendarListViewData == null || (calendarListViewData.getViewType() == 0 && !calendarListViewData.isDayFirstInstance())) {
                rect.bottom = this.f77585b;
            } else {
                rect.bottom = this.f77586c;
            }
        }
    }

    /* renamed from: a */
    public void mo111704a(ArrayList<CalendarListViewData> arrayList) {
        this.f77573a.clear();
        this.f77573a.addAll(arrayList);
        m115011e();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b$b */
    public class C30821b extends AbstractC30813a {
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
            this.f77533l.setVisibility(8);
        }

        C30821b(View view) {
            super(view);
            this.f77523b = (EventChipView) view.findViewById(R.id.calendar_list_data_chip);
            this.f77523b.setOnClickListener(new AbstractView$OnClickListenerC32626b(C30819b.this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.C30821b.C308221 */

                @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
                /* renamed from: a */
                public void mo108751a(View view) {
                    Log.m165389i("CommonEventChipViewHolder", C32673y.m125369a("listDetail"));
                    C31238b.m116870a(C30821b.this.f77523b.getContext(), C30821b.this.f77523b.getViewData());
                }
            });
            this.f77531j = (TextView) view.findViewById(R.id.tv_calendar_list_week_day);
            this.f77532k = (TextView) view.findViewById(R.id.tv_calendar_list_month_day);
            this.f77532k.setTypeface(C30819b.this.f77576d);
            this.f77533l = (LinearLayout) view.findViewById(R.id.ll_calendar_list_date);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.b$e */
    public class C30825e extends AbstractC30820a {

        /* renamed from: a */
        TextView f77593a;

        /* renamed from: b */
        TextView f77594b;

        /* renamed from: c */
        TextView f77595c;

        /* renamed from: d */
        LinearLayout f77596d;

        /* renamed from: e */
        CalendarDate f77597e;

        /* renamed from: g */
        private final String f77599g = "NoEventViewHolder";

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.AbstractC30820a
        /* renamed from: a */
        public void mo111707a(CalendarListViewData calendarListViewData) {
            if (calendarListViewData.isDayFirstInstance()) {
                this.f77594b.setText(calendarListViewData.getWeekDay());
                TextView textView = this.f77595c;
                textView.setText("" + calendarListViewData.getMonthDay());
                this.f77594b.setTextColor(calendarListViewData.getTimeTextColor());
                this.f77595c.setTextColor(calendarListViewData.getTimeTextColor());
                this.f77596d.setVisibility(0);
            } else {
                this.f77596d.setVisibility(8);
            }
            this.f77597e = calendarListViewData.getViewDate();
        }

        C30825e(View view) {
            super(view);
            this.f77593a = (TextView) view.findViewById(R.id.tv_calendar_list_item_create_event);
            this.f77594b = (TextView) view.findViewById(R.id.tv_calendar_list_week_day);
            TextView textView = (TextView) view.findViewById(R.id.tv_calendar_list_month_day);
            this.f77595c = textView;
            textView.setTypeface(C30819b.this.f77576d);
            this.f77596d = (LinearLayout) view.findViewById(R.id.ll_calendar_list_date);
            this.f77593a.setOnClickListener(new View.OnClickListener(C30819b.this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b.C30825e.View$OnClickListenerC308261 */

                public void onClick(View view) {
                    Log.m165389i("NoEventViewHolder", C32673y.m125369a("listAdd"));
                    CalendarDate calendarDate = C30825e.this.f77597e;
                    if (calendarDate == null) {
                        calendarDate = new CalendarDate();
                    }
                    EditActivityEntrance.m118930a(C30819b.this.f77577e, calendarDate, false);
                }
            });
        }
    }

    /* renamed from: b */
    private View m115009b(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC30820a aVar, int i) {
        aVar.mo111707a(this.f77573a.get(i));
    }

    public C30819b(C30850a aVar, Context context) {
        this.f77577e = context;
        this.f77578f = aVar;
        this.f77579g = new C30823c();
        this.f77573a = new ArrayList<>();
        this.f77576d = Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf");
        m115010d();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public AbstractC30820a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C30824d(m115009b(viewGroup, R.layout.fragment_calendar_list_view_item_month));
            }
            if (i == 2) {
                return new C30827f(m115009b(viewGroup, R.layout.fragment_calendar_list_view_item_week));
            }
            if (i != 3) {
                return new C30825e(m115009b(viewGroup, R.layout.fragment_calendar_list_view_item_no_event));
            }
            return new C30825e(m115009b(viewGroup, R.layout.fragment_calendar_list_view_item_no_event));
        } else if (this.f77580h.size() > 0) {
            return this.f77580h.remove(0);
        } else {
            return new C30821b(m115009b(viewGroup, R.layout.fragment_calendar_list_view_item_event));
        }
    }
}

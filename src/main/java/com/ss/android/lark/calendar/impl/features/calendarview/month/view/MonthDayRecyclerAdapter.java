package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0774a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.EventChipEndSplitTextView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.List;

public class MonthDayRecyclerAdapter extends RecyclerView.Adapter {

    /* renamed from: a */
    List<MonthEventChipViewData> f77998a;

    /* renamed from: b */
    public int f77999b;

    /* renamed from: c */
    public boolean f78000c;

    /* renamed from: d */
    C30967a f78001d;

    /* renamed from: e */
    IMonthDayViewListener f78002e;

    /* renamed from: f */
    RecyclerView f78003f;

    /* renamed from: g */
    Drawable f78004g;

    /* renamed from: h */
    private final String f78005h = "MonthDayRecyclerAdapter";

    /* renamed from: i */
    private CalendarDate f78006i;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    /* renamed from: a */
    public C30967a mo112088a() {
        return this.f78001d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f77998a.size();
    }

    public class EventInstanceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f78008a;

        /* renamed from: b */
        MonthEventChipViewData f78009b;
        @BindView(9814)
        ImageView mEventColor;
        @BindView(9841)
        ImageView mExchangeIcon;
        @BindView(9842)
        ImageView mGoogleIcon;
        @BindView(9827)
        ImageView mIvFinishedMask;
        @BindView(9843)
        ImageView mLocalIcon;
        @BindView(11518)
        EventChipEndSplitTextView mSummery;
        @BindView(11519)
        EventChipEndSplitTextView mTimeAndRoom;

        /* renamed from: a */
        public void mo112090a() {
            if (this.mIvFinishedMask.getVisibility() == 8 && this.f78009b.needDrawEventFinishedMask()) {
                this.mIvFinishedMask.post(new Runnable() {
                    /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter.EventInstanceViewHolder.RunnableC309651 */

                    public void run() {
                        EventInstanceViewHolder.this.mo112092b();
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo112092b() {
            this.mIvFinishedMask.setVisibility(0);
            float b = CalendarSkinColorTool.m124925b(C30022a.f74884c.mo108456c().getSkinType());
            this.mIvFinishedMask.setBackgroundColor(C32658j.m125333a(C32634ae.m125178a(R.color.bg_body), (double) b));
        }

        /* renamed from: a */
        public void mo112091a(final MonthEventChipViewData monthEventChipViewData) {
            this.f78009b = monthEventChipViewData;
            this.mSummery.setText(monthEventChipViewData.getEventTitleForDayInstance());
            this.mTimeAndRoom.setText(monthEventChipViewData.getEventLocation());
            CalendarEventAttendee.Status selfAttendeeStatus = monthEventChipViewData.getCalendarEventInstance().getSelfAttendeeStatus();
            int eventCardColor = monthEventChipViewData.getEventCardColor();
            int a = C32634ae.m125178a(R.color.text_title);
            int a2 = C32634ae.m125178a(R.color.ud_N500);
            int a3 = C32634ae.m125178a(R.color.text_title);
            int dp2px = UIUtils.dp2px(this.f78008a.getContext(), 2.0f);
            if (monthEventChipViewData.needDrawEventFinishedMask()) {
                this.mIvFinishedMask.setVisibility(0);
                float b = CalendarSkinColorTool.m124925b(C30022a.f74884c.mo108456c().getSkinType());
                this.mIvFinishedMask.setBackgroundColor(C32658j.m125333a(C32634ae.m125178a(R.color.bg_body), (double) b));
            } else {
                this.mIvFinishedMask.setVisibility(8);
            }
            int i = C309641.f78007a[selfAttendeeStatus.ordinal()];
            if (i == 1) {
                this.mEventColor.setBackground(C32634ae.m125184d(R.drawable.icon_month_day));
                ((GradientDrawable) this.mEventColor.getBackground()).setColor(eventCardColor);
                this.mSummery.setTextColor(a);
                EventChipEndSplitTextView eventChipEndSplitTextView = this.mSummery;
                eventChipEndSplitTextView.setPaintFlags(eventChipEndSplitTextView.getPaintFlags() & -17);
                this.mTimeAndRoom.setTextColor(a3);
                EventChipEndSplitTextView eventChipEndSplitTextView2 = this.mTimeAndRoom;
                eventChipEndSplitTextView2.setPaintFlags(eventChipEndSplitTextView2.getPaintFlags() & -17);
            } else if (i == 2 || i == 3) {
                this.mEventColor.setBackground(C32634ae.m125184d(R.drawable.icon_month_day_udf));
                ((GradientDrawable) this.mEventColor.getBackground()).setStroke(dp2px, a2);
                this.mSummery.setTextColor(a2);
                EventChipEndSplitTextView eventChipEndSplitTextView3 = this.mSummery;
                eventChipEndSplitTextView3.setPaintFlags(eventChipEndSplitTextView3.getPaintFlags() | 16);
                this.mTimeAndRoom.setTextColor(a2);
                EventChipEndSplitTextView eventChipEndSplitTextView4 = this.mTimeAndRoom;
                eventChipEndSplitTextView4.setPaintFlags(eventChipEndSplitTextView4.getPaintFlags() | 16);
            } else {
                this.mEventColor.setBackground(C32634ae.m125184d(R.drawable.icon_month_day_udf));
                ((GradientDrawable) this.mEventColor.getBackground()).setStroke(dp2px, eventCardColor);
                this.mSummery.setTextColor(a);
                EventChipEndSplitTextView eventChipEndSplitTextView5 = this.mSummery;
                eventChipEndSplitTextView5.setPaintFlags(eventChipEndSplitTextView5.getPaintFlags() & -17);
                this.mTimeAndRoom.setTextColor(a3);
                EventChipEndSplitTextView eventChipEndSplitTextView6 = this.mTimeAndRoom;
                eventChipEndSplitTextView6.setPaintFlags(eventChipEndSplitTextView6.getPaintFlags() & -17);
            }
            if (monthEventChipViewData.isLocalEventInstance()) {
                this.mGoogleIcon.setVisibility(8);
                this.mExchangeIcon.setVisibility(8);
                this.mLocalIcon.setVisibility(0);
                this.mLocalIcon.setImageDrawable(MonthDayRecyclerAdapter.this.f78004g);
            } else if (monthEventChipViewData.isGoogleEventInstance()) {
                this.mGoogleIcon.setVisibility(0);
                this.mExchangeIcon.setVisibility(8);
                this.mLocalIcon.setVisibility(8);
            } else if (monthEventChipViewData.isExchangeEventInstance()) {
                this.mGoogleIcon.setVisibility(8);
                this.mExchangeIcon.setVisibility(0);
                this.mLocalIcon.setVisibility(8);
            } else {
                this.mGoogleIcon.setVisibility(8);
                this.mExchangeIcon.setVisibility(8);
                this.mLocalIcon.setVisibility(8);
            }
            this.f78008a.setOnClickListener(new AbstractView$OnClickListenerC32626b() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter.EventInstanceViewHolder.C309662 */

                @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
                /* renamed from: a */
                public void mo108751a(View view) {
                    Log.m165389i("MonthDayRecyclerAdapter", C32673y.m125369a("monthDetail"));
                    MonthDayRecyclerAdapter.this.f78002e.mo112050a(monthEventChipViewData);
                }
            });
        }

        EventInstanceViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.f78008a = view;
        }
    }

    public class EventInstanceViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private EventInstanceViewHolder f78014a;

        @Override // butterknife.Unbinder
        public void unbind() {
            EventInstanceViewHolder eventInstanceViewHolder = this.f78014a;
            if (eventInstanceViewHolder != null) {
                this.f78014a = null;
                eventInstanceViewHolder.mSummery = null;
                eventInstanceViewHolder.mTimeAndRoom = null;
                eventInstanceViewHolder.mEventColor = null;
                eventInstanceViewHolder.mLocalIcon = null;
                eventInstanceViewHolder.mGoogleIcon = null;
                eventInstanceViewHolder.mExchangeIcon = null;
                eventInstanceViewHolder.mIvFinishedMask = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public EventInstanceViewHolder_ViewBinding(EventInstanceViewHolder eventInstanceViewHolder, View view) {
            this.f78014a = eventInstanceViewHolder;
            eventInstanceViewHolder.mSummery = (EventChipEndSplitTextView) Utils.findRequiredViewAsType(view, R.id.tv_moonth_day_event_summery, "field 'mSummery'", EventChipEndSplitTextView.class);
            eventInstanceViewHolder.mTimeAndRoom = (EventChipEndSplitTextView) Utils.findRequiredViewAsType(view, R.id.tv_moonth_day_time_and_room, "field 'mTimeAndRoom'", EventChipEndSplitTextView.class);
            eventInstanceViewHolder.mEventColor = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_event_color, "field 'mEventColor'", ImageView.class);
            eventInstanceViewHolder.mLocalIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_month_day_local, "field 'mLocalIcon'", ImageView.class);
            eventInstanceViewHolder.mGoogleIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_month_day_google, "field 'mGoogleIcon'", ImageView.class);
            eventInstanceViewHolder.mExchangeIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_month_day_exchange, "field 'mExchangeIcon'", ImageView.class);
            eventInstanceViewHolder.mIvFinishedMask = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_finished_mask, "field 'mIvFinishedMask'", ImageView.class);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter$1 */
    public static /* synthetic */ class C309641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78007a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter.C309641.f78007a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.ACCEPT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter.C309641.f78007a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.DECLINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter.C309641.f78007a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee$Status r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee.Status.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter.C309641.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m115571b() {
        this.f77999b = -1;
        List<MonthEventChipViewData> list = this.f77998a;
        if (list == null || list.size() == 0) {
            this.f77999b = -1;
        }
        int julianDay = new CalendarDate().getJulianDay();
        long j = -1;
        int i = 0;
        boolean z = false;
        for (MonthEventChipViewData monthEventChipViewData : this.f77998a) {
            if (julianDay == this.f78006i.getJulianDay()) {
                if (monthEventChipViewData.isAllDay()) {
                    this.f78000c = true;
                    this.f77999b = i;
                } else if (System.currentTimeMillis() >= monthEventChipViewData.getEndTime() * 1000) {
                    this.f78000c = true;
                    this.f77999b = i;
                    j = -1;
                } else if (System.currentTimeMillis() >= monthEventChipViewData.getStartTime() * 1000) {
                    if (j != monthEventChipViewData.getStartTime()) {
                        this.f78000c = false;
                        this.f77999b = i;
                        j = monthEventChipViewData.getStartTime();
                    }
                } else if (!z) {
                    this.f77999b = i;
                    this.f78000c = false;
                }
                z = true;
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter$a */
    public class C30967a extends RecyclerView.AbstractC1335d {

        /* renamed from: b */
        private int f78016b = C32634ae.m125185e(R.dimen.dp_3d5);

        /* renamed from: c */
        private int f78017c = C32634ae.m125185e(R.dimen.dp_9);

        /* renamed from: d */
        private int f78018d = C32634ae.m125185e(R.dimen.dp_3d5);

        /* renamed from: e */
        private int f78019e = C32634ae.m125185e(R.dimen.dp_1d5);

        /* renamed from: f */
        private int f78020f = C32634ae.m125185e(R.dimen.dp_40);

        /* renamed from: g */
        private int f78021g = C32634ae.m125185e(R.dimen.dp_16);

        /* renamed from: h */
        private int f78022h = C32634ae.m125178a(R.color.ud_R500);

        public C30967a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            super.onDraw(canvas, recyclerView, state);
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && MonthDayRecyclerAdapter.this.f77999b == childAdapterPosition) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                    int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                    int right = childAt.getRight() + layoutParams.rightMargin;
                    int top = childAt.getTop() + layoutParams.topMargin;
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(this.f78022h);
                    if (MonthDayRecyclerAdapter.this.f78000c) {
                        i = bottom + this.f78016b;
                    } else {
                        i = top - this.f78016b;
                    }
                    float f = (float) this.f78020f;
                    int i3 = this.f78019e;
                    canvas.drawRect(f, (float) (i - (i3 / 2)), (float) (right - this.f78021g), (float) ((i3 / 2) + i), paint);
                    int i4 = this.f78020f;
                    int i5 = this.f78018d;
                    canvas.drawCircle((float) (i4 - i5), (float) i, (float) i5, paint);
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.top = this.f78016b;
            rect.bottom = this.f78016b;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.top = this.f78017c;
            }
            if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
                rect.bottom = this.f78017c;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        ((EventInstanceViewHolder) viewHolder).mo112091a(this.f77998a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new EventInstanceViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_month_day_instance, viewGroup, false));
    }

    public MonthDayRecyclerAdapter(RecyclerView recyclerView, IMonthDayViewListener aVar) {
        this.f78002e = aVar;
        this.f78001d = new C30967a();
        this.f78003f = recyclerView;
        Drawable g = C0774a.m3779g(C32634ae.m125184d(R.drawable.ud_icon_cellphone_filled));
        this.f78004g = g;
        C0774a.m3766a(g, C32634ae.m125178a(R.color.icon_n3));
    }

    /* renamed from: a */
    public void mo112089a(List<MonthEventChipViewData> list, CalendarDate calendarDate) {
        this.f77998a = list;
        this.f78006i = calendarDate;
        notifyDataSetChanged();
        m115571b();
        int i = this.f77999b;
        if (i >= 0 && i < this.f77998a.size()) {
            int i2 = this.f77999b;
            if (!this.f78000c && i2 > 0) {
                i2--;
            }
            ((LinearLayoutManager) this.f78003f.getLayoutManager()).scrollToPositionWithOffset(i2, 0);
        }
    }
}

package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthDayRecyclerAdapter;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32631ab;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.List;

public class MonthDayPage extends FrameLayout {

    /* renamed from: a */
    IMonthDayViewListener f77990a;

    /* renamed from: b */
    MonthDayRecyclerAdapter f77991b;

    /* renamed from: c */
    private final String f77992c = "MonthDayPage";

    /* renamed from: d */
    private CalendarDate f77993d;
    @BindView(11433)
    TextView mAppendEvent;
    @BindView(10064)
    ViewGroup mNoEventZone;
    @BindView(10328)
    RecyclerView mRecyclerView;

    /* renamed from: a */
    public void mo112085a() {
        for (int i = 0; i < this.mRecyclerView.getChildCount(); i++) {
            RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(this.mRecyclerView.getChildAt(i));
            if (childViewHolder != null && (childViewHolder instanceof MonthDayRecyclerAdapter.EventInstanceViewHolder)) {
                ((MonthDayRecyclerAdapter.EventInstanceViewHolder) childViewHolder).mo112090a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick({11433})
    public void openAppendEvent() {
        if (!C32631ab.m125168a()) {
            Log.m165389i("MonthDayPage", C32673y.m125369a("monthAdd"));
            if (this.f77990a != null) {
                CalendarHitPoint.m124144k();
                this.f77990a.mo112049a(this.f77993d);
            }
        }
    }

    public MonthDayPage(Context context, IMonthDayViewListener aVar) {
        super(context);
        this.f77990a = aVar;
        ButterKnife.bind(this, LayoutInflater.from(context).inflate(R.layout.view_month_day, this));
    }

    /* renamed from: a */
    public void mo112086a(List<MonthEventChipViewData> list, CalendarDate calendarDate) {
        this.f77993d = calendarDate;
        if (CollectionUtils.isEmpty(list)) {
            this.mRecyclerView.setVisibility(8);
            this.mNoEventZone.setVisibility(0);
            return;
        }
        this.mRecyclerView.setVisibility(0);
        this.mNoEventZone.setVisibility(8);
        MonthDayRecyclerAdapter monthDayRecyclerAdapter = this.f77991b;
        if (monthDayRecyclerAdapter == null) {
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mRecyclerView.getContext(), 1, false));
            MonthDayRecyclerAdapter monthDayRecyclerAdapter2 = new MonthDayRecyclerAdapter(this.mRecyclerView, this.f77990a);
            this.f77991b = monthDayRecyclerAdapter2;
            this.mRecyclerView.addItemDecoration(monthDayRecyclerAdapter2.mo112088a());
            this.mRecyclerView.setAdapter(this.f77991b);
            this.f77991b.mo112089a(list, this.f77993d);
            return;
        }
        monthDayRecyclerAdapter.mo112089a(list, this.f77993d);
    }
}

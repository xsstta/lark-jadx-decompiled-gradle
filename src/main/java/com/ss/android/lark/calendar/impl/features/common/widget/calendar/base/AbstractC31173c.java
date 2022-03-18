package com.ss.android.lark.calendar.impl.features.common.widget.calendar.base;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a.C31101a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.c */
public abstract class AbstractC31173c extends AbstractC31172b {

    /* renamed from: d */
    protected TextView f78788d = ((TextView) findViewById(R.id.date_day));

    /* renamed from: e */
    protected TextView f78789e = ((TextView) findViewById(R.id.lunar_day));

    /* renamed from: f */
    protected LinearLayout f78790f = ((LinearLayout) findViewById(R.id.dot_container));

    /* renamed from: g */
    protected Typeface f78791g;

    /* renamed from: h */
    protected int f78792h;

    /* renamed from: i */
    protected boolean f78793i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo112930a(CalendarAttr.MonthState monthState, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo112931a(List<Integer> list, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState);

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public int getCellViewWidth() {
        return getResources().getDisplayMetrics().widthPixels / 7;
    }

    /* renamed from: d */
    private boolean m116367d() {
        if (!this.f78793i || !C30022a.f74884c.mo108456c().isShowLunarCalendar()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public int getCellViewHeight() {
        if (m116367d()) {
            return UIUtils.dp2px(getContext(), 62.0f);
        }
        return UIUtils.dp2px(getContext(), 34.0f);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31172b
    /* renamed from: a */
    public void mo112924a() {
        mo112929a(this.f78785a.mo112992e(), this.f78785a.mo112982a(), this.f78785a.mo112989b(), this.f78785a.mo112990c(), this.f78785a.mo112995h());
        super.mo112924a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo112932b() {
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f78790f.getLayoutParams();
        if (m116367d()) {
            i = 0;
        } else {
            i = UIUtils.dp2px(this.f78786b, -6.0f);
        }
        layoutParams.setMargins(0, i, 0, 0);
        this.f78790f.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo112933c() {
        int i;
        int i2;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f78788d.getLayoutParams();
        if (m116367d()) {
            i2 = UIUtils.dp2px(this.f78788d.getContext(), 28.0f);
            i = UIUtils.dp2px(this.f78788d.getContext(), 10.0f);
        } else {
            i2 = UIUtils.dp2px(this.f78788d.getContext(), 32.0f);
            i = 0;
        }
        layoutParams.height = i2;
        layoutParams.width = i2;
        layoutParams.setMargins(0, i, 0, 0);
        this.f78788d.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public void setDesktopWidth(int i) {
        this.f78792h = i;
    }

    public void setShowLunarDay(boolean z) {
        this.f78793i = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31174d
    public void setTypeFace(Typeface typeface) {
        this.f78791g = typeface;
        this.f78788d.setTypeface(typeface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112928a(CalendarDate calendarDate) {
        if (!m116367d()) {
            this.f78789e.setVisibility(8);
            return;
        }
        this.f78789e.setVisibility(0);
        this.f78789e.setText(C31101a.m116088a(calendarDate));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112927a(int i) {
        GradientDrawable a = ao.m125221a(i, 0, 0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackground(a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), 4.0f), UIUtils.dp2px(getContext(), 4.0f));
        layoutParams.gravity = 1;
        layoutParams.setMargins(UIUtils.dp2px(getContext(), 1.0f), 0, UIUtils.dp2px(getContext(), 1.0f), 0);
        this.f78790f.addView(imageView, layoutParams);
    }

    public AbstractC31173c(Context context, boolean z) {
        super(context, R.layout.calendar_view_list_day);
        this.f78793i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112929a(CalendarDate calendarDate, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState, List<Integer> list) {
        this.f78788d.setText(String.valueOf(calendarDate.getMonthDay()));
        mo112928a(calendarDate);
        mo112932b();
        mo112933c();
        mo112930a(monthState, selectState, dateState);
        if (!CollectionUtils.isNotEmpty(list) || selectState != CalendarAttr.SelectState.UN_SELECT) {
            this.f78790f.setVisibility(4);
            return;
        }
        this.f78790f.setVisibility(0);
        this.f78790f.removeAllViews();
        mo112931a(list, dateState, monthState);
    }
}

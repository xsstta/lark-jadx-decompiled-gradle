package com.ss.android.lark.calendar.impl.features.common.widget.calendar.week;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31173c;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.b */
public class C31191b extends AbstractC31173c {
    public C31191b(Context context) {
        super(context, true);
    }

    public C31191b(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31173c
    /* renamed from: a */
    public void mo112931a(List<Integer> list, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState) {
        for (Integer num : list) {
            int intValue = num.intValue();
            if (dateState == CalendarAttr.DateState.PAST_DATE) {
                intValue = C32658j.m125333a(intValue, 0.6d);
            }
            mo112927a(intValue);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31173c
    /* renamed from: a */
    public void mo112930a(CalendarAttr.MonthState monthState, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState) {
        if (selectState == CalendarAttr.SelectState.SELECT) {
            if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
                this.f78788d.setTextColor(C32634ae.m125178a(R.color.white));
                this.f78788d.setBackgroundResource(R.drawable.bg_select_blue_circle);
                this.f78789e.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            } else if (dateState == CalendarAttr.DateState.PAST_DATE) {
                this.f78788d.setTextColor(C32634ae.m125178a(R.color.ud_N500));
                this.f78788d.setBackgroundResource(R.drawable.calendar_shape_gray_circle_bg);
                this.f78789e.setTextColor(C32634ae.m125178a(R.color.ud_N400));
            } else {
                this.f78788d.setTextColor(C32634ae.m125178a(R.color.text_title));
                this.f78788d.setBackgroundResource(R.drawable.calendar_shape_gray_circle_bg);
                this.f78789e.setTextColor(C32634ae.m125178a(R.color.ud_N500));
            }
        } else if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            this.f78788d.setBackgroundResource(0);
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
        } else if (dateState == CalendarAttr.DateState.PAST_DATE) {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.ud_N500));
            this.f78788d.setBackgroundResource(0);
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.ud_N400));
        } else {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.text_title));
            this.f78788d.setBackgroundResource(0);
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.ud_N500));
        }
    }
}

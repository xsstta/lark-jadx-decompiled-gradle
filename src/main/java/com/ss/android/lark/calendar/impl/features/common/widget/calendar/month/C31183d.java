package com.ss.android.lark.calendar.impl.features.common.widget.calendar.month;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31173c;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.d */
public class C31183d extends AbstractC31173c {
    /* renamed from: a */
    private void m116424a(CalendarAttr.DateState dateState) {
        if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
        } else {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.text_disable));
        }
        this.f78788d.setBackgroundResource(0);
    }

    public C31183d(Context context, boolean z) {
        super(context, z);
    }

    /* renamed from: a */
    private void m116425a(CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState) {
        if (selectState == CalendarAttr.SelectState.SELECT) {
            if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
                this.f78788d.setTextColor(C32634ae.m125178a(R.color.static_white));
                this.f78788d.setBackgroundResource(R.drawable.bg_select_blue_circle);
                this.f78789e.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
                return;
            }
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.text_title));
            this.f78788d.setBackgroundResource(R.drawable.calendar_shape_gray_circle_bg);
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        } else if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            this.f78788d.setBackgroundResource(0);
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
        } else {
            this.f78788d.setTextColor(C32634ae.m125178a(R.color.text_title));
            this.f78788d.setBackgroundResource(0);
            this.f78789e.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31173c
    /* renamed from: a */
    public void mo112930a(CalendarAttr.MonthState monthState, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState) {
        if (monthState == CalendarAttr.MonthState.CURRENT_MONTH) {
            m116425a(selectState, dateState);
        } else {
            m116424a(dateState);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.calendar.base.AbstractC31173c
    /* renamed from: a */
    public void mo112931a(List<Integer> list, CalendarAttr.DateState dateState, CalendarAttr.MonthState monthState) {
        for (Integer num : list) {
            int intValue = num.intValue();
            if (monthState != CalendarAttr.MonthState.CURRENT_MONTH) {
                intValue = C32658j.m125333a(intValue, 0.6d);
            }
            mo112927a(intValue);
        }
    }
}

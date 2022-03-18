package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.f */
public class C59246f extends AbstractC59245e {

    /* renamed from: g */
    private Context f147133g;

    /* renamed from: b */
    private void m230107b() {
        this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_N400));
        this.f147130a.setBackgroundResource(0);
    }

    public C59246f(Context context) {
        super(context);
        this.f147133g = context;
    }

    /* renamed from: a */
    private void m230105a(MonthViewAttr.DateState dateState) {
        if (dateState == MonthViewAttr.DateState.CURRENT_DATE) {
            this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_B500));
        } else {
            this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_N400));
        }
        this.f147130a.setBackgroundResource(0);
    }

    /* renamed from: a */
    private void m230106a(MonthViewAttr.SelectState selectState, MonthViewAttr.DateState dateState) {
        if (selectState == MonthViewAttr.SelectState.SELECT) {
            if (dateState == MonthViewAttr.DateState.CURRENT_DATE) {
                this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_N00));
                this.f147130a.setBackgroundResource(R.drawable.bg_blue_circle);
                return;
            }
            this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_N900));
            this.f147130a.setBackgroundResource(R.drawable.bg_gray_circle);
        } else if (dateState == MonthViewAttr.DateState.CURRENT_DATE) {
            this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_B500));
            this.f147130a.setBackgroundResource(0);
        } else {
            this.f147130a.setTextColor(UIUtils.getColor(this.f147133g, R.color.ud_N900));
            this.f147130a.setBackgroundResource(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59245e
    /* renamed from: a */
    public void mo201460a(List<Integer> list, MonthViewAttr.DateState dateState, MonthViewAttr.MonthState monthState) {
        for (Integer num : list) {
            int intValue = num.intValue();
            if (monthState != MonthViewAttr.MonthState.CURRENT_MONTH) {
                intValue = UIUtils.getAlphaColor(intValue, 0.6d);
            }
            mo201457a(intValue);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59245e
    /* renamed from: a */
    public void mo201458a(MonthViewAttr.MonthState monthState, MonthViewAttr.SelectState selectState, MonthViewAttr.DateState dateState, MonthViewAttr.OptionalState optionalState) {
        if (optionalState == MonthViewAttr.OptionalState.NOT_OPTIONAL) {
            m230107b();
        } else if (dateState == MonthViewAttr.DateState.FUTURE_DATE) {
            m230107b();
        } else if (monthState == MonthViewAttr.MonthState.CURRENT_MONTH) {
            m230106a(selectState, dateState);
        } else {
            m230105a(dateState);
        }
    }
}

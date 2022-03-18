package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;
import com.ss.android.lark.widget.timepicker.monthview.p2981b.C59236b;
import com.ss.android.lark.widget.timepicker.monthview.p2982c.AbstractC59241b;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.e */
public abstract class AbstractC59245e extends AbstractC59241b {

    /* renamed from: a */
    protected TextView f147130a = ((TextView) findViewById(R.id.date_day));

    /* renamed from: b */
    protected LinearLayout f147131b = ((LinearLayout) findViewById(R.id.dot_container));

    /* renamed from: c */
    protected Typeface f147132c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo201458a(MonthViewAttr.MonthState monthState, MonthViewAttr.SelectState selectState, MonthViewAttr.DateState dateState, MonthViewAttr.OptionalState optionalState);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo201460a(List<Integer> list, MonthViewAttr.DateState dateState, MonthViewAttr.MonthState monthState);

    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59229a
    public int getCellViewHeight() {
        return UIUtils.dp2px(getContext(), 36.0f);
    }

    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59229a
    public int getCellViewWidth() {
        return DeviceUtils.getScreenWidth(this.f147114e) / 7;
    }

    @Override // com.ss.android.lark.widget.timepicker.monthview.p2982c.AbstractC59241b
    /* renamed from: a */
    public void mo201389a() {
        mo201459a(this.f147113d.mo201451d(), this.f147113d.mo201443a(), this.f147113d.mo201449b(), this.f147113d.mo201450c(), this.f147113d.mo201454g(), this.f147113d.mo201455h());
        super.mo201389a();
    }

    @Override // com.ss.android.lark.widget.timepicker.monthview.AbstractC59229a
    public void setTypeFace(Typeface typeface) {
        this.f147132c = typeface;
        this.f147130a.setTypeface(typeface);
    }

    public AbstractC59245e(Context context) {
        super(context, R.layout.calendar_list_day_view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo201457a(int i) {
        GradientDrawable a = C59236b.m230065a(i, 0, 0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackground(a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIUtils.dp2px(getContext(), 4.0f), UIUtils.dp2px(getContext(), 4.0f));
        layoutParams.gravity = 1;
        layoutParams.setMargins(UIUtils.dp2px(getContext(), 1.0f), 0, UIUtils.dp2px(getContext(), 1.0f), 0);
        this.f147131b.addView(imageView, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo201459a(CalendarDate calendarDate, MonthViewAttr.SelectState selectState, MonthViewAttr.DateState dateState, MonthViewAttr.MonthState monthState, MonthViewAttr.OptionalState optionalState, List<Integer> list) {
        this.f147130a.setText(String.valueOf(calendarDate.getMonthDay()));
        mo201458a(monthState, selectState, dateState, optionalState);
        if (!CollectionUtils.isNotEmpty(list) || selectState != MonthViewAttr.SelectState.UN_SELECT) {
            this.f147131b.setVisibility(4);
            return;
        }
        this.f147131b.setVisibility(0);
        this.f147131b.removeAllViews();
        mo201460a(list, dateState, monthState);
    }
}

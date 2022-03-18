package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class ListCalendarWeekIndicator extends LinearLayout {

    /* renamed from: a */
    private String[] f147066a;

    /* renamed from: b */
    private Context f147067b;

    public ListCalendarWeekIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f147067b = context;
        this.f147066a = UIUtils.getStringArray(context, R.array.week_text);
        LayoutInflater.from(this.f147067b).inflate(R.layout.list_calendar_week_indicator, this);
    }

    /* renamed from: a */
    public void mo201318a(int i, boolean z) {
        for (int i2 = 0; i2 < 7; i2++) {
            ((TextView) getChildAt(i2)).setText(this.f147066a[i2]);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (!z || i3 != i) {
                ((TextView) getChildAt(i3)).setTextColor(UIUtils.getColor(this.f147067b, R.color.ud_N900));
            } else {
                ((TextView) getChildAt(i3)).setTextColor(UIUtils.getColor(this.f147067b, R.color.ud_B500));
            }
        }
    }
}

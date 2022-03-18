package com.bytedance.ee.bear.bitable.card.view.cell.p259a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.a.b */
public class C4572b extends AbstractC4565a {

    /* renamed from: f */
    public boolean f13477f;

    /* renamed from: g */
    private UDTimePicker f13478g;

    /* renamed from: h */
    private Long f13479h;

    /* renamed from: i */
    private String f13480i;

    /* renamed from: j */
    private String f13481j;

    /* renamed from: k */
    private boolean f13482k;

    /* renamed from: l */
    private final int f13483l = 1;

    /* renamed from: m */
    private final int f13484m = 2;

    /* renamed from: n */
    private final int f13485n = 3;

    /* renamed from: o */
    private int f13486o = 3;

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17973a() {
        super.mo17973a();
        m19000h();
    }

    /* renamed from: h */
    private void m19000h() {
        Calendar instance = Calendar.getInstance();
        Long l = this.f13479h;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        if (TextUtils.isEmpty(this.f13481j)) {
            this.f13478g.setPickerMode(PickerModel.YEAR_MONTH_DAY);
            this.f13478g.setSelectedCalendar(instance);
            return;
        }
        this.f13478g.setPickerMode(PickerModel.MONTHDAY_HOUR_MINUTE_24H);
        this.f13478g.setSelectedCalendar(instance);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: c */
    public void mo17979c() {
        boolean z;
        super.mo17979c();
        if (this.f13459c != null) {
            int i = this.f13486o;
            boolean z2 = true;
            if (i == 1) {
                this.f13459c.mo17986a(Long.valueOf(this.f13478g.getSelectedCalendar().getTimeInMillis()));
            } else if (i == 2) {
                this.f13459c.mo17986a(null);
            } else if (i == 3) {
                if (this.f13482k || this.f13477f) {
                    this.f13459c.mo17986a(Long.valueOf(this.f13478g.getSelectedCalendar().getTimeInMillis()));
                } else {
                    return;
                }
            }
            this.f13460d.clear();
            Map map = this.f13460d;
            if (this.f13486o == 1) {
                z = true;
            } else {
                z = false;
            }
            map.put("click_done_btn", String.valueOf(z));
            Map map2 = this.f13460d;
            if (this.f13486o != 2) {
                z2 = false;
            }
            map2.put("click_clear_btn", String.valueOf(z2));
            this.f13459c.mo17987a("dateTime", this.f13460d);
            this.f13486o = 3;
            this.f13477f = false;
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public View mo17972a(Context context) {
        return this.f13458b;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m18998a(View view) {
        this.f13486o = 1;
        mo17978b();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m18999b(View view) {
        this.f13486o = 2;
        mo17978b();
    }

    public C4572b(Context context) {
        super(context);
        this.f13458b = LayoutInflater.from(context).inflate(R.layout.bitable_card_date_edit_panel, (ViewGroup) null);
        this.f13478g = (UDTimePicker) this.f13458b.findViewById(R.id.date_picker_view);
        this.f13458b.findViewById(R.id.clear_tv).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p259a.$$Lambda$b$CcR1jqSVw0uBgiV1NNHcrm4tc */

            public final void onClick(View view) {
                C4572b.m269111lambda$CcR1jqSVw0uBgiV1NNHcrm4tc(C4572b.this, view);
            }
        });
        this.f13458b.findViewById(R.id.confirm_tv).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p259a.$$Lambda$b$smvwlv5JyysrkBk5UcWfvmJn5WQ */

            public final void onClick(View view) {
                C4572b.lambda$smvwlv5JyysrkBk5UcWfvmJn5WQ(C4572b.this, view);
            }
        });
        this.f13478g.setDatePickerListener(new ITimePickerDelegate.TimePickerListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p259a.C4572b.C45731 */

            @Override // com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate.TimePickerListener
            /* renamed from: a */
            public void mo18000a(int i, int i2, int i3, int i4, int i5) {
                C4572b.this.f13477f = true;
            }
        });
    }

    /* renamed from: a */
    public void mo17999a(Long l, String str, String str2, boolean z) {
        this.f13479h = l;
        this.f13480i = str;
        this.f13481j = str2;
        this.f13482k = !z;
        if (z) {
            m19000h();
        }
    }
}

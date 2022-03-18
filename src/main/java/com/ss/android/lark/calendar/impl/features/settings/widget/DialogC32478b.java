package com.ss.android.lark.calendar.impl.features.settings.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.C31912c;
import com.ss.android.lark.ui.DialogC57586c;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.calendar.impl.features.settings.widget.b */
public class DialogC32478b extends BaseDialog {

    /* renamed from: a */
    public AbstractC32483a f83265a;

    /* renamed from: b */
    public Button f83266b;

    /* renamed from: c */
    public int f83267c;

    /* renamed from: d */
    public int f83268d;

    /* renamed from: e */
    public Context f83269e;

    /* renamed from: f */
    public boolean f83270f = true;

    /* renamed from: g */
    public CalendarDate f83271g;

    /* renamed from: h */
    public CalendarDate f83272h;

    /* renamed from: i */
    private ViewGroup f83273i;

    /* renamed from: j */
    private TextView f83274j;

    /* renamed from: k */
    private TextView f83275k;

    /* renamed from: l */
    private TextView f83276l;

    /* renamed from: m */
    private String f83277m;

    /* renamed from: n */
    private C31912c f83278n;

    /* renamed from: o */
    private boolean f83279o;

    /* renamed from: p */
    private boolean f83280p;

    /* renamed from: q */
    private AbstractC31910b.AbstractC31911a f83281q = new AbstractC31910b.AbstractC31911a() {
        /* class com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b.C324824 */

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31910b.AbstractC31911a
        /* renamed from: a */
        public void mo115475a(CalendarDate calendarDate) {
            if ((DialogC32478b.this.f83269e instanceof Activity) && !C57582a.m223607a((Activity) DialogC32478b.this.f83269e)) {
                return;
            }
            if (DialogC32478b.this.f83270f) {
                DialogC32478b.this.f83271g = calendarDate;
                DialogC32478b.this.f83267c = (calendarDate.getHour() * 60) + calendarDate.getMinute();
                DialogC32478b.this.mo118629f();
                return;
            }
            DialogC32478b.this.f83272h = calendarDate;
            DialogC32478b.this.f83268d = (calendarDate.getHour() * 60) + calendarDate.getMinute();
            DialogC32478b.this.mo118630g();
        }
    };

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.widget.b$a */
    public interface AbstractC32483a {
        /* renamed from: a */
        void mo118580a();

        /* renamed from: a */
        void mo118581a(int i, int i2, Button button);
    }

    /* renamed from: k */
    private void m123983k() {
        this.f83278n.mo116498a(this.f83271g);
    }

    /* renamed from: l */
    private void m123984l() {
        this.f83278n.mo116498a(this.f83272h);
    }

    /* renamed from: b */
    public void mo118624b() {
        this.f83270f = true;
        this.f83279o = false;
        mo118627d();
        mo118629f();
        m123983k();
    }

    /* renamed from: c */
    public void mo118626c() {
        this.f83270f = false;
        this.f83279o = true;
        mo118628e();
        mo118630g();
        m123984l();
    }

    public void onBackPressed() {
        AbstractC32483a aVar = this.f83265a;
        if (aVar != null) {
            aVar.mo118580a();
        }
        super.onBackPressed();
    }

    /* renamed from: i */
    private void m123981i() {
        this.f83274j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b.View$OnClickListenerC324791 */

            public void onClick(View view) {
                DialogC32478b.this.mo118624b();
            }
        });
        this.f83275k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b.View$OnClickListenerC324802 */

            public void onClick(View view) {
                DialogC32478b.this.mo118626c();
            }
        });
        this.f83276l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.DialogC32478b.View$OnClickListenerC324813 */

            public void onClick(View view) {
                if (DialogC32478b.this.f83268d <= DialogC32478b.this.f83267c) {
                    m123997a(DialogC32478b.this.f83269e, DialogC32478b.this.f83269e.getResources().getString(R.string.Calendar_Common_Notice), DialogC32478b.this.f83269e.getResources().getString(R.string.Calendar_Edit_InvalidEndTime), DialogC32478b.this.f83269e.getResources().getString(R.string.Calendar_Common_Confirm), null).show();
                } else {
                    DialogC32478b.this.f83265a.mo118581a(DialogC32478b.this.f83267c, DialogC32478b.this.f83268d, DialogC32478b.this.f83266b);
                }
            }

            /* renamed from: a */
            private DialogC57586c m123997a(Context context, String str, String str2, String str3, View.OnClickListener onClickListener) {
                DialogC57586c cVar = new DialogC57586c(context);
                cVar.mo195559a(str);
                cVar.mo195563b(str2);
                if (TextUtils.isEmpty(str)) {
                    cVar.mo195566c(1);
                    cVar.mo195562b(17);
                }
                cVar.mo195567c(str3, onClickListener, true);
                cVar.mo195558a(1);
                cVar.mo195562b(14);
                cVar.mo195568d(UIUtils.getColor(context, R.color.text_caption));
                return cVar;
            }
        });
    }

    /* renamed from: j */
    private void m123982j() {
        if (this.f83270f) {
            this.f83278n.mo116498a(this.f83271g);
        } else {
            this.f83278n.mo116498a(this.f83272h);
        }
        this.f83278n.mo116524a(this.f83277m);
        this.f83278n.mo116527d();
    }

    /* renamed from: f */
    public void mo118629f() {
        boolean z;
        if (this.f83268d <= this.f83267c) {
            z = true;
        } else {
            z = false;
        }
        this.f83280p = z;
        if (z) {
            this.f83278n.mo116526c();
        } else {
            this.f83278n.mo116527d();
        }
    }

    /* renamed from: g */
    public void mo118630g() {
        if (this.f83268d <= this.f83267c) {
            this.f83280p = true;
            this.f83278n.mo116526c();
        } else if (this.f83280p) {
            this.f83280p = false;
            this.f83278n.mo116527d();
        }
    }

    /* renamed from: d */
    public void mo118627d() {
        this.f83274j.setTextColor(this.f83269e.getResources().getColor(R.color.primary_pri_500));
        this.f83275k.setTextColor(this.f83269e.getResources().getColor(R.color.text_disable));
    }

    /* renamed from: e */
    public void mo118628e() {
        this.f83275k.setTextColor(this.f83269e.getResources().getColor(R.color.primary_pri_500));
        this.f83274j.setTextColor(this.f83269e.getResources().getColor(R.color.text_disable));
    }

    /* renamed from: h */
    private void m123980h() {
        this.f83276l = (TextView) findViewById(R.id.work_hour_confirm);
        this.f83273i = (ViewGroup) findViewById(R.id.work_hour_time_picker);
        this.f83274j = (TextView) findViewById(R.id.work_hour_start_time_button);
        this.f83275k = (TextView) findViewById(R.id.work_hour_end_time_button);
        C31912c cVar = new C31912c(this.f83269e, this.f83273i, this.f83281q, true);
        this.f83278n = cVar;
        this.f83273i.addView(cVar.mo116528e(), 0);
    }

    /* renamed from: a */
    public void mo118619a() {
        this.f83270f = true;
        this.f83279o = false;
        CalendarDate calendarDate = new CalendarDate();
        this.f83271g = calendarDate;
        calendarDate.setHour(this.f83267c / 60);
        this.f83271g.setMinute(this.f83267c % 60);
        CalendarDate calendarDate2 = new CalendarDate();
        this.f83272h = calendarDate2;
        calendarDate2.setHour(this.f83268d / 60);
        this.f83272h.setMinute(this.f83268d % 60);
        if (this.f83270f) {
            mo118627d();
        } else {
            mo118628e();
        }
        this.f83278n.mo116528e().setVisibility(0);
        m123982j();
    }

    /* renamed from: a */
    public void mo118620a(int i) {
        this.f83267c = i;
    }

    /* renamed from: b */
    public void mo118625b(int i) {
        this.f83268d = i;
    }

    /* renamed from: a */
    public void mo118621a(Button button) {
        this.f83266b = button;
    }

    /* renamed from: a */
    public void mo118622a(AbstractC32483a aVar) {
        this.f83265a = aVar;
    }

    /* renamed from: a */
    public void mo118623a(String str) {
        this.f83277m = str;
    }

    public DialogC32478b(Context context, int i) {
        super(context, i);
        this.f83269e = context;
        setContentView(R.layout.calendar_dialog_time_picker);
        setCanceledOnTouchOutside(true);
        m123980h();
        m123981i();
    }
}

package com.ss.android.lark.widget.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer;
import com.ss.android.lark.widget.timepicker.monthview.constants.MonthViewAttr;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;
import java.util.Date;

public class TimeSelectDialog extends Dialog {

    /* renamed from: a */
    public CheckBox f147026a;

    /* renamed from: b */
    public MonthViewContainer f147027b;

    /* renamed from: c */
    public CalendarDate f147028c;

    /* renamed from: d */
    public CalendarDate f147029d;

    /* renamed from: e */
    public Date f147030e;

    /* renamed from: f */
    public Date f147031f;

    /* renamed from: g */
    public AbstractC59218a f147032g;

    /* renamed from: h */
    public int f147033h = 1;

    /* renamed from: i */
    private Context f147034i;

    /* renamed from: j */
    private View f147035j;

    /* renamed from: k */
    private CommonTitleBar f147036k;

    /* renamed from: l */
    private LinearLayout f147037l;

    /* renamed from: m */
    private TextView f147038m;

    /* renamed from: n */
    private TextView f147039n;

    /* renamed from: o */
    private LinearLayout f147040o;

    /* renamed from: p */
    private TextView f147041p;

    /* renamed from: q */
    private TextView f147042q;

    /* renamed from: r */
    private TextView f147043r;

    /* renamed from: s */
    private ImageView f147044s;

    /* renamed from: t */
    private ImageView f147045t;

    /* renamed from: u */
    private RelativeLayout f147046u;

    /* renamed from: v */
    private CompoundButton.OnCheckedChangeListener f147047v;

    /* renamed from: w */
    private int f147048w = 1;

    public @interface WindowStyle {
    }

    /* renamed from: com.ss.android.lark.widget.timepicker.TimeSelectDialog$a */
    public interface AbstractC59218a {
        /* renamed from: a */
        void mo182573a(Date date, Date date2);
    }

    /* renamed from: l */
    private void m229987l() {
        this.f147027b.mo201319a();
    }

    /* renamed from: j */
    private void m229984j() {
        this.f147038m.setText(UIUtils.getString(this.f147034i, R.string.Lark_Search_AnyTime));
    }

    /* renamed from: g */
    private void m229978g() {
        m229980h();
        m229983i();
        m229984j();
        m229986k();
        mo201291a();
        m229987l();
        m229991p();
    }

    /* renamed from: k */
    private void m229986k() {
        this.f147041p.setText(m229977f(this.f147027b.getCurrSelectedDate().getDate()));
    }

    /* renamed from: m */
    private void m229988m() {
        int i = this.f147048w;
        if (i == 1) {
            m229989n();
        } else if (i == 2) {
            m229990o();
        }
    }

    /* renamed from: q */
    private void m229992q() {
        if (this.f147033h == 1) {
            this.f147046u.setVisibility(0);
        } else {
            this.f147046u.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo201296b() {
        this.f147038m.setText(UIUtils.getString(this.f147034i, R.string.Lark_Search_AnyTime));
        this.f147030e = null;
    }

    /* renamed from: i */
    private void m229983i() {
        this.f147036k.setTitle(UIUtils.getString(this.f147034i, R.string.Lark_Search_SelectStartTime));
        this.f147036k.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.View$OnClickListenerC592091 */

            public void onClick(View view) {
                TimeSelectDialog.this.dismiss();
            }
        });
        this.f147036k.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f147034i, R.string.Lark_Legacy_Completed), R.color.ud_B500) {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.C592102 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                TimeSelectDialog.this.dismiss();
                if (TimeSelectDialog.this.f147032g != null) {
                    AbstractC59218a aVar = TimeSelectDialog.this.f147032g;
                    TimeSelectDialog timeSelectDialog = TimeSelectDialog.this;
                    Date a = timeSelectDialog.mo201290a(timeSelectDialog.f147030e);
                    TimeSelectDialog timeSelectDialog2 = TimeSelectDialog.this;
                    aVar.mo182573a(a, timeSelectDialog2.mo201295b(timeSelectDialog2.f147031f));
                }
            }
        });
    }

    /* renamed from: n */
    private void m229989n() {
        Window window = getWindow();
        if (window == null) {
            Log.m165383e("TimeSelectDialog", "window is null");
            return;
        }
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = DeviceUtils.getScreenWidth(getContext());
        attributes.height = -2;
        attributes.softInputMode = 16;
        window.setAttributes(attributes);
        window.setDimAmount(0.3f);
        window.setWindowAnimations(R.style.AnimBottomInBottomOut);
    }

    /* renamed from: r */
    private void m229993r() {
        this.f147039n.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N00));
        this.f147038m.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N00));
        this.f147042q.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N600));
        this.f147041p.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N900));
    }

    /* renamed from: s */
    private void m229994s() {
        this.f147039n.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N600));
        this.f147038m.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N900));
        this.f147042q.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N00));
        this.f147041p.setTextColor(UIUtils.getColor(this.f147034i, R.color.ud_N00));
    }

    /* renamed from: a */
    public void mo201291a() {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191591a(DatePreciseness.MONTH);
        aVar.mo191593a(LengthType.LONG);
        this.f147043r.setText(TimeFormatUtils.m219289e(this.f147034i, this.f147027b.getCurrSelectedDate().getDate(), aVar));
    }

    /* renamed from: c */
    public void mo201297c() {
        if (this.f147029d.sameDay(this.f147028c)) {
            this.f147038m.setText("");
        } else {
            m229979g(this.f147029d.getDate());
        }
        this.f147030e = this.f147029d.getDate();
    }

    /* renamed from: d */
    public void mo201299d() {
        this.f147033h = 1;
        m229993r();
        this.f147036k.setTitle(UIUtils.getString(this.f147034i, R.string.Lark_Search_SelectStartTime));
        this.f147037l.setBackgroundResource(R.drawable.start_time_btn_pressed_bg);
        this.f147040o.setBackgroundResource(R.drawable.end_time_btn_bg);
        m229992q();
    }

    /* renamed from: e */
    public void mo201300e() {
        this.f147033h = 2;
        m229994s();
        this.f147036k.setTitle(UIUtils.getString(this.f147034i, R.string.Lark_Search_SelectEndTime));
        this.f147037l.setBackgroundResource(R.drawable.start_time_btn_bg);
        this.f147040o.setBackgroundResource(R.drawable.end_time_btn_pressed_bg);
        m229992q();
    }

    /* renamed from: f */
    public void mo201301f() {
        this.f147027b.mo201321a(m229982i(this.f147030e), m229982i(this.f147031f), this.f147029d, MonthViewAttr.SelectTimeType.forNumber(this.f147033h));
    }

    public void show() {
        int i;
        if (DesktopUtil.m144307b()) {
            i = 2;
        } else {
            i = 1;
        }
        mo201292a(i);
        m229988m();
        super.show();
        m229979g(this.f147030e);
        m229981h(this.f147031f);
        this.f147026a.setChecked(m229985j(this.f147030e));
        this.f147026a.setOnCheckedChangeListener(this.f147047v);
        mo201301f();
    }

    /* renamed from: o */
    private void m229990o() {
        Window window = getWindow();
        if (window == null) {
            Log.m165383e("TimeSelectDialog", "window is null");
            return;
        }
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = UIUtils.dp2px(getContext(), 440.0f);
        attributes.height = UIUtils.dp2px(getContext(), 560.0f);
        attributes.softInputMode = 16;
        window.setAttributes(attributes);
        window.setDimAmount(0.7f);
        window.setWindowAnimations(R.style.AnimFadeInFadeOut);
        window.setBackgroundDrawableResource(R.drawable.desktop_shadow_bg);
        this.f147035j.setBackground(null);
        this.f147036k.setBackground(null);
        m229974a(this.f147036k, 40);
        m229974a(findViewById(R.id.time_ll), 80);
    }

    /* renamed from: p */
    private void m229991p() {
        this.f147037l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.View$OnClickListenerC592113 */

            public void onClick(View view) {
                if (TimeSelectDialog.this.f147033h != 1) {
                    TimeSelectDialog.this.mo201299d();
                    TimeSelectDialog.this.mo201301f();
                }
            }
        });
        this.f147040o.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.View$OnClickListenerC592124 */

            public void onClick(View view) {
                if (TimeSelectDialog.this.f147033h != 2) {
                    TimeSelectDialog.this.mo201300e();
                    TimeSelectDialog.this.mo201301f();
                }
            }
        });
        this.f147044s.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.View$OnClickListenerC592135 */

            public void onClick(View view) {
                TimeSelectDialog.this.f147027b.mo201323b();
                TimeSelectDialog.this.mo201291a();
            }
        });
        this.f147045t.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.View$OnClickListenerC592146 */

            public void onClick(View view) {
                TimeSelectDialog.this.f147027b.mo201324c();
                TimeSelectDialog.this.mo201291a();
            }
        });
        this.f147027b.setChangeListener(new MonthViewContainer.MonthViewChangeListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.C592157 */

            @Override // com.ss.android.lark.widget.timepicker.monthview.MonthViewContainer.MonthViewChangeListener
            /* renamed from: a */
            public void mo201309a(CalendarDate calendarDate, int i) {
                TimeSelectDialog.this.mo201301f();
                TimeSelectDialog.this.mo201291a();
                if (calendarDate.getJulianDay() <= TimeSelectDialog.this.f147028c.getJulianDay() && i == 1) {
                    if (TimeSelectDialog.this.f147033h == 1 && TimeSelectDialog.this.f147026a.isChecked()) {
                        TimeSelectDialog.this.f147026a.toggle();
                    }
                    TimeSelectDialog.this.f147029d = calendarDate;
                    TimeSelectDialog.this.mo201298c(calendarDate.getDate());
                }
            }
        });
        this.f147046u.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.View$OnClickListenerC592168 */

            public void onClick(View view) {
                TimeSelectDialog.this.f147026a.toggle();
            }
        });
        this.f147047v = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.widget.timepicker.TimeSelectDialog.C592179 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (TimeSelectDialog.this.f147030e != null) {
                    if (z) {
                        TimeSelectDialog.this.mo201296b();
                    } else {
                        TimeSelectDialog.this.mo201297c();
                    }
                }
            }
        };
    }

    /* renamed from: h */
    private void m229980h() {
        this.f147036k = (CommonTitleBar) findViewById(R.id.title_bar);
        this.f147037l = (LinearLayout) findViewById(R.id.start_time_ll);
        this.f147038m = (TextView) findViewById(R.id.start_time_tv);
        this.f147039n = (TextView) findViewById(R.id.start_time_label_tv);
        this.f147040o = (LinearLayout) findViewById(R.id.end_time_ll);
        this.f147041p = (TextView) findViewById(R.id.end_time_tv);
        this.f147042q = (TextView) findViewById(R.id.end_time_label_tv);
        this.f147043r = (TextView) findViewById(R.id.current_month_label_tv);
        this.f147044s = (ImageView) findViewById(R.id.last_month_btn_iv);
        this.f147045t = (ImageView) findViewById(R.id.next_month_btn_iv);
        this.f147046u = (RelativeLayout) findViewById(R.id.time_select_no_limit_rl);
        this.f147026a = (CheckBox) findViewById(R.id.time_select_no_limit_cb);
        this.f147027b = (MonthViewContainer) findViewById(R.id.monthViewContainer);
    }

    /* renamed from: a */
    public void mo201292a(int i) {
        this.f147048w = i;
    }

    /* renamed from: a */
    public void mo201294a(AbstractC59218a aVar) {
        this.f147032g = aVar;
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f147036k.setTitle(charSequence);
    }

    /* renamed from: d */
    private CalendarDate m229975d(Date date) {
        CalendarDate calendarDate = new CalendarDate(date);
        calendarDate.setHour(0);
        calendarDate.setMinute(0);
        calendarDate.setSecond(0);
        return calendarDate;
    }

    /* renamed from: h */
    private void m229981h(Date date) {
        this.f147041p.setText(m229977f(date));
    }

    /* renamed from: a */
    public Date mo201290a(Date date) {
        if (date == null) {
            return null;
        }
        return m229975d(date).getDate();
    }

    /* renamed from: b */
    public Date mo201295b(Date date) {
        return m229976e(date).getDate();
    }

    /* renamed from: e */
    private CalendarDate m229976e(Date date) {
        CalendarDate calendarDate = new CalendarDate(date);
        calendarDate.setHour(23);
        calendarDate.setMinute(59);
        calendarDate.setSecond(59);
        return calendarDate;
    }

    /* renamed from: f */
    private String m229977f(Date date) {
        Options aVar = new Options();
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        aVar.mo191591a(DatePreciseness.DAY);
        aVar.mo191593a(LengthType.LONG);
        return TimeFormatUtils.m219289e(this.f147034i, date, aVar);
    }

    /* renamed from: i */
    private CalendarDate m229982i(Date date) {
        if (date == null) {
            return new CalendarDate(new Date(0));
        }
        return new CalendarDate(date);
    }

    /* renamed from: j */
    private boolean m229985j(Date date) {
        if (date == null || date.getTime() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo201298c(Date date) {
        if (this.f147033h == 1) {
            this.f147030e = date;
            m229979g(date);
            return;
        }
        this.f147031f = date;
        m229981h(date);
    }

    public TimeSelectDialog(Context context) {
        super(context, R.style.CommonDialog);
        this.f147034i = context;
        CalendarDate calendarDate = new CalendarDate();
        this.f147028c = calendarDate;
        this.f147029d = calendarDate;
        this.f147031f = calendarDate.getDate();
        View inflate = LayoutInflater.from(this.f147034i).inflate(R.layout.dialog_time_select_layout, (ViewGroup) null);
        this.f147035j = inflate;
        setContentView(inflate);
        m229978g();
    }

    /* renamed from: g */
    private void m229979g(Date date) {
        if (m229985j(date)) {
            this.f147038m.setText(UIUtils.getString(this.f147034i, R.string.Lark_Search_AnyTime));
        } else {
            this.f147038m.setText(m229977f(date));
        }
    }

    /* renamed from: a */
    public void mo201293a(Pair<Date, Date> pair) {
        this.f147030e = (Date) pair.first;
        this.f147031f = (Date) pair.second;
    }

    /* renamed from: a */
    private void m229974a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = UIUtils.dp2px(getContext(), (float) i);
            view.setLayoutParams(layoutParams);
        }
    }
}

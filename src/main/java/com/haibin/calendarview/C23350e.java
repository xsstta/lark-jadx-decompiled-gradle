package com.haibin.calendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.haibin.calendarview.CalendarView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.haibin.calendarview.e */
public final class C23350e {

    /* renamed from: A */
    private int f57594A;

    /* renamed from: B */
    private int f57595B;

    /* renamed from: C */
    private int f57596C;

    /* renamed from: D */
    private int f57597D;

    /* renamed from: E */
    private int f57598E;

    /* renamed from: F */
    private int f57599F;

    /* renamed from: G */
    private int f57600G;

    /* renamed from: H */
    private boolean f57601H;

    /* renamed from: I */
    private int f57602I;

    /* renamed from: J */
    private int f57603J;

    /* renamed from: K */
    private int f57604K;

    /* renamed from: L */
    private int f57605L;

    /* renamed from: M */
    private int f57606M;

    /* renamed from: N */
    private int f57607N;

    /* renamed from: O */
    private int f57608O;

    /* renamed from: P */
    private int f57609P;

    /* renamed from: Q */
    private int f57610Q;

    /* renamed from: R */
    private int f57611R;

    /* renamed from: S */
    private int f57612S;

    /* renamed from: T */
    private int f57613T;

    /* renamed from: U */
    private int f57614U;

    /* renamed from: V */
    private int f57615V;

    /* renamed from: W */
    private int f57616W;

    /* renamed from: X */
    private int f57617X;

    /* renamed from: Y */
    private int f57618Y;

    /* renamed from: Z */
    private int f57619Z;

    /* renamed from: a */
    boolean f57620a;
    private boolean aA;
    private boolean aB;
    private int aC;
    private int aD;
    private int aE;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private String ae;
    private Class<?> af;
    private String ag;
    private Class<?> ah;

    /* renamed from: ai  reason: collision with root package name */
    private String f175437ai;
    private Class<?> aj;
    private String ak;
    private Class<?> al;
    private String am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private boolean aw;
    private int ax;
    private Calendar ay;
    private boolean az;

    /* renamed from: b */
    int f57621b;

    /* renamed from: c */
    Map<String, Calendar> f57622c;

    /* renamed from: d */
    CalendarView.AbstractC23325a f57623d;

    /* renamed from: e */
    CalendarView.AbstractC23329e f57624e;

    /* renamed from: f */
    CalendarView.AbstractC23328d f57625f;

    /* renamed from: g */
    CalendarView.AbstractC23327c f57626g;

    /* renamed from: h */
    CalendarView.AbstractC23326b f57627h;

    /* renamed from: i */
    CalendarView.AbstractC23330f f57628i;

    /* renamed from: j */
    CalendarView.AbstractC23334j f57629j;

    /* renamed from: k */
    CalendarView.AbstractC23331g f57630k;

    /* renamed from: l */
    CalendarView.AbstractC23333i f57631l;

    /* renamed from: m */
    CalendarView.AbstractC23332h f57632m;

    /* renamed from: n */
    CalendarView.AbstractC23335k f57633n;

    /* renamed from: o */
    Calendar f57634o;

    /* renamed from: p */
    Calendar f57635p;

    /* renamed from: q */
    Map<String, Calendar> f57636q = new HashMap();

    /* renamed from: r */
    Calendar f57637r;

    /* renamed from: s */
    Calendar f57638s;

    /* renamed from: t */
    private int f57639t;

    /* renamed from: u */
    private int f57640u;

    /* renamed from: v */
    private int f57641v;

    /* renamed from: w */
    private int f57642w;

    /* renamed from: x */
    private int f57643x;

    /* renamed from: y */
    private int f57644y;

    /* renamed from: z */
    private int f57645z;

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo81106A() {
        return this.at;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo81107B() {
        return this.au;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo81108C() {
        return this.av;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo81109D() {
        return this.ap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo81110E() {
        return this.aq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo81111F() {
        return this.f57603J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo81112G() {
        return this.f57611R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public int mo81113H() {
        return this.f57605L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo81114I() {
        return this.f57616W;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo81115J() {
        return this.f57614U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo81116K() {
        return this.f57615V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo81117L() {
        return this.f57608O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo81118M() {
        return this.f57609P;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public int mo81119N() {
        return this.f57610Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public int mo81120O() {
        return this.f57607N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo81121P() {
        return this.f57606M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public int mo81122Q() {
        return this.f57612S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public int mo81123R() {
        return this.f57604K;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public int mo81124S() {
        return this.f57613T;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public int mo81125T() {
        return this.f57640u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public boolean mo81126U() {
        return this.az;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo81127V() {
        return this.aA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo81128W() {
        return this.aB;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public int mo81129X() {
        return this.f57639t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public int mo81130Y() {
        return this.ab;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public int mo81131Z() {
        return this.f57641v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo81132a() {
        return this.am;
    }

    /* access modifiers changed from: package-private */
    public int aa() {
        return this.aD;
    }

    /* access modifiers changed from: package-private */
    public int ab() {
        return this.aE;
    }

    /* access modifiers changed from: package-private */
    public int ac() {
        return this.aC;
    }

    /* access modifiers changed from: package-private */
    public Calendar ad() {
        return this.ay;
    }

    /* access modifiers changed from: package-private */
    public int ae() {
        return this.f57602I;
    }

    /* access modifiers changed from: package-private */
    public boolean af() {
        return this.f57601H;
    }

    /* access modifiers changed from: package-private */
    public int ah() {
        return this.ar;
    }

    /* access modifiers changed from: package-private */
    public int ai() {
        return this.as;
    }

    /* access modifiers changed from: package-private */
    public boolean aj() {
        return this.aw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo81153b() {
        return this.f57642w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo81157c() {
        return this.f57643x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo81161d() {
        return this.f57644y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo81163e() {
        return this.f57645z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo81164f() {
        return this.f57594A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo81165g() {
        return this.f57595B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo81166h() {
        return this.f57596C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo81167i() {
        return this.f57597D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo81168j() {
        return this.f57598E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo81169k() {
        return this.f57599F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo81170l() {
        return this.f57600G;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo81171m() {
        return this.ac;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo81172n() {
        return this.ad;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo81173o() {
        return this.f57619Z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo81174p() {
        return this.f57618Y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo81175q() {
        return this.f57617X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo81176r() {
        return this.aa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Class<?> mo81177s() {
        return this.af;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Class<?> mo81178t() {
        return this.ah;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public Class<?> mo81179u() {
        return this.al;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Class<?> mo81180v() {
        return this.aj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public String mo81181w() {
        return this.f175437ai;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo81182x() {
        return this.ax;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo81183y() {
        return this.an;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo81184z() {
        return this.ao;
    }

    /* access modifiers changed from: package-private */
    public void ag() {
        this.f57634o.clearScheme();
    }

    /* access modifiers changed from: package-private */
    public final void ak() {
        Map<String, Calendar> map = this.f57622c;
        if (map == null || map.size() <= 0) {
            ag();
            return;
        }
        String calendar = this.f57634o.toString();
        if (this.f57622c.containsKey(calendar)) {
            this.f57634o.mergeScheme(this.f57622c.get(calendar), mo81132a());
        }
    }

    /* access modifiers changed from: package-private */
    public Calendar al() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.ay.getYear());
        calendar.setWeek(this.ay.getWeek());
        calendar.setMonth(this.ay.getMonth());
        calendar.setDay(this.ay.getDay());
        calendar.setCurrentDay(true);
        C23354i.m84878a(calendar);
        return calendar;
    }

    /* access modifiers changed from: package-private */
    public final Calendar am() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.an);
        calendar.setMonth(this.ap);
        calendar.setDay(this.ar);
        calendar.setCurrentDay(calendar.equals(this.ay));
        C23354i.m84878a(calendar);
        return calendar;
    }

    /* access modifiers changed from: package-private */
    public final Calendar an() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.ao);
        calendar.setMonth(this.aq);
        calendar.setDay(this.as);
        calendar.setCurrentDay(calendar.equals(this.ay));
        C23354i.m84878a(calendar);
        return calendar;
    }

    private void ap() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        this.ay = new Calendar();
        Date date = new Date();
        this.ay.setYear(C23349d.m84780a("yyyy", date));
        this.ay.setMonth(C23349d.m84780a("MM", date));
        this.ay.setDay(C23349d.m84780a("dd", date));
        this.ay.setCurrentDay(true);
        C23354i.m84878a(this.ay);
        m84800a(this.an, this.ap, this.ao, this.aq);
        try {
            if (TextUtils.isEmpty(this.ak)) {
                cls4 = C23363o.class;
                this.al = cls4;
            } else {
                cls4 = Class.forName(this.ak);
            }
            this.al = cls4;
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(this.f175437ai)) {
                cls3 = C23353h.class;
                this.aj = cls3;
            } else {
                cls3 = Class.forName(this.f175437ai);
            }
            this.aj = cls3;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(this.ae)) {
                cls2 = C23351f.class;
            } else {
                cls2 = Class.forName(this.ae);
            }
            this.af = cls2;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(this.ag)) {
                cls = C23352g.class;
            } else {
                cls = Class.forName(this.ag);
            }
            this.ah = cls;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<Calendar> ao() {
        if (this.f57641v != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!(this.f57637r == null || this.f57638s == null)) {
            Calendar instance = Calendar.getInstance();
            instance.set(this.f57637r.getYear(), this.f57637r.getMonth() - 1, this.f57637r.getDay());
            instance.set(this.f57638s.getYear(), this.f57638s.getMonth() - 1, this.f57638s.getDay());
            long timeInMillis = instance.getTimeInMillis();
            for (long timeInMillis2 = instance.getTimeInMillis(); timeInMillis2 <= timeInMillis; timeInMillis2 += 86400000) {
                instance.setTimeInMillis(timeInMillis2);
                Calendar calendar = new Calendar();
                calendar.setYear(instance.get(1));
                calendar.setMonth(instance.get(2) + 1);
                calendar.setDay(instance.get(5));
                CalendarView.AbstractC23325a aVar = this.f57623d;
                if (aVar == null || !aVar.mo81030a(calendar)) {
                    C23354i.m84878a(calendar);
                    arrayList.add(calendar);
                }
            }
            mo81136a(arrayList);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81133a(int i) {
        this.av = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo81154b(int i) {
        this.f57640u = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo81158c(int i) {
        this.f57639t = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo81162d(int i) {
        this.aC = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81135a(Class<?> cls) {
        this.af = cls;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo81155b(Class<?> cls) {
        this.al = cls;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo81159c(Class<?> cls) {
        this.ah = cls;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo81156b(boolean z) {
        this.aA = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo81160c(boolean z) {
        this.aB = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81136a(List<Calendar> list) {
        String str;
        Map<String, Calendar> map = this.f57622c;
        if (!(map == null || map.size() == 0)) {
            for (Calendar calendar : list) {
                if (this.f57622c.containsKey(calendar.toString())) {
                    Calendar calendar2 = this.f57622c.get(calendar.toString());
                    if (TextUtils.isEmpty(calendar2.getScheme())) {
                        str = mo81132a();
                    } else {
                        str = calendar2.getScheme();
                    }
                    calendar.setScheme(str);
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                } else {
                    calendar.setScheme("");
                    calendar.setSchemeColor(0);
                    calendar.setSchemes(null);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo81137a(boolean z) {
        this.az = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81134a(int i, int i2) {
        if (i <= i2 || i2 <= 0) {
            if (i <= 0) {
                this.aD = -1;
            } else {
                this.aD = i;
            }
            if (i2 <= 0) {
                this.aE = -1;
            } else {
                this.aE = i2;
            }
        } else {
            this.aE = i;
            this.aD = i;
        }
    }

    C23350e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.calendar_height, R.attr.calendar_match_parent, R.attr.calendar_padding, R.attr.current_day_lunar_text_color, R.attr.current_day_text_color, R.attr.current_month_lunar_text_color, R.attr.current_month_text_color, R.attr.day_text_size, R.attr.lunar_text_size, R.attr.max_multi_select_size, R.attr.max_select_range, R.attr.max_year, R.attr.max_year_day, R.attr.max_year_month, R.attr.min_select_range, R.attr.min_year, R.attr.min_year_day, R.attr.min_year_month, R.attr.month_view, R.attr.month_view_scrollable, R.attr.month_view_show_mode, R.attr.other_month_lunar_text_color, R.attr.other_month_text_color, R.attr.scheme_lunar_text_color, R.attr.scheme_month_text_color, R.attr.scheme_text, R.attr.scheme_text_color, R.attr.scheme_theme_color, R.attr.select_mode, R.attr.selected_lunar_text_color, R.attr.selected_text_color, R.attr.selected_theme_color, R.attr.week_background, R.attr.week_bar_height, R.attr.week_bar_view, R.attr.week_line_background, R.attr.week_line_margin, R.attr.week_start_with, R.attr.week_text_color, R.attr.week_text_size, R.attr.week_view, R.attr.week_view_scrollable, R.attr.year_view, R.attr.year_view_background, R.attr.year_view_current_day_text_color, R.attr.year_view_day_text_color, R.attr.year_view_day_text_size, R.attr.year_view_month_height, R.attr.year_view_month_margin_bottom, R.attr.year_view_month_margin_top, R.attr.year_view_month_text_color, R.attr.year_view_month_text_size, R.attr.year_view_padding, R.attr.year_view_scheme_color, R.attr.year_view_scrollable, R.attr.year_view_select_text_color, R.attr.year_view_week_height, R.attr.year_view_week_text_color, R.attr.year_view_week_text_size});
        C23354i.m84877a(context);
        this.f57602I = (int) obtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED);
        this.f57645z = obtainStyledAttributes.getColor(26, -1);
        this.f57594A = obtainStyledAttributes.getColor(23, -1973791);
        this.ac = obtainStyledAttributes.getColor(27, 1355796431);
        this.ae = obtainStyledAttributes.getString(18);
        this.f175437ai = obtainStyledAttributes.getString(42);
        this.ag = obtainStyledAttributes.getString(40);
        this.ak = obtainStyledAttributes.getString(34);
        this.ab = obtainStyledAttributes.getDimensionPixelSize(39, C23349d.m84776a(context, 12.0f));
        this.ax = (int) obtainStyledAttributes.getDimension(33, (float) C23349d.m84776a(context, 40.0f));
        this.aa = (int) obtainStyledAttributes.getDimension(36, (float) C23349d.m84776a(context, (float) BitmapDescriptorFactory.HUE_RED));
        String string = obtainStyledAttributes.getString(25);
        this.am = string;
        if (TextUtils.isEmpty(string)) {
            this.am = "记";
        }
        this.az = obtainStyledAttributes.getBoolean(19, true);
        this.aA = obtainStyledAttributes.getBoolean(41, true);
        this.aB = obtainStyledAttributes.getBoolean(54, true);
        this.f57640u = obtainStyledAttributes.getInt(20, 0);
        this.f57639t = obtainStyledAttributes.getInt(37, 1);
        this.f57641v = obtainStyledAttributes.getInt(28, 0);
        this.aC = obtainStyledAttributes.getInt(9, Integer.MAX_VALUE);
        this.aD = obtainStyledAttributes.getInt(14, -1);
        int i = obtainStyledAttributes.getInt(10, -1);
        this.aE = i;
        mo81134a(this.aD, i);
        this.f57619Z = obtainStyledAttributes.getColor(32, -1);
        this.f57617X = obtainStyledAttributes.getColor(35, 0);
        this.f57618Y = obtainStyledAttributes.getColor(43, -1);
        this.f57644y = obtainStyledAttributes.getColor(38, -13421773);
        this.f57642w = obtainStyledAttributes.getColor(4, -65536);
        this.f57643x = obtainStyledAttributes.getColor(3, -65536);
        this.ad = obtainStyledAttributes.getColor(31, 1355796431);
        this.f57597D = obtainStyledAttributes.getColor(30, -15658735);
        this.f57598E = obtainStyledAttributes.getColor(29, -15658735);
        this.f57596C = obtainStyledAttributes.getColor(6, -15658735);
        this.f57595B = obtainStyledAttributes.getColor(22, -1973791);
        this.f57599F = obtainStyledAttributes.getColor(5, -1973791);
        this.f57600G = obtainStyledAttributes.getColor(21, -1973791);
        this.an = obtainStyledAttributes.getInt(15, 1971);
        this.ao = obtainStyledAttributes.getInt(11, 2055);
        this.ap = obtainStyledAttributes.getInt(17, 1);
        this.aq = obtainStyledAttributes.getInt(13, 12);
        this.ar = obtainStyledAttributes.getInt(16, 1);
        this.as = obtainStyledAttributes.getInt(12, -1);
        this.at = obtainStyledAttributes.getDimensionPixelSize(7, C23349d.m84776a(context, 16.0f));
        this.au = obtainStyledAttributes.getDimensionPixelSize(8, C23349d.m84776a(context, 10.0f));
        this.av = (int) obtainStyledAttributes.getDimension(0, (float) C23349d.m84776a(context, 56.0f));
        this.aw = obtainStyledAttributes.getBoolean(1, false);
        this.f57603J = obtainStyledAttributes.getDimensionPixelSize(51, C23349d.m84776a(context, 18.0f));
        this.f57604K = obtainStyledAttributes.getDimensionPixelSize(46, C23349d.m84776a(context, 7.0f));
        this.f57611R = obtainStyledAttributes.getColor(50, -15658735);
        this.f57612S = obtainStyledAttributes.getColor(45, -15658735);
        this.f57613T = obtainStyledAttributes.getColor(53, this.ac);
        this.f57616W = obtainStyledAttributes.getColor(57, -13421773);
        this.f57615V = obtainStyledAttributes.getColor(44, this.f57642w);
        this.f57614U = obtainStyledAttributes.getColor(55, -13421773);
        this.f57605L = obtainStyledAttributes.getDimensionPixelSize(58, C23349d.m84776a(context, 8.0f));
        this.f57606M = obtainStyledAttributes.getDimensionPixelSize(47, C23349d.m84776a(context, 32.0f));
        this.f57607N = obtainStyledAttributes.getDimensionPixelSize(56, C23349d.m84776a(context, (float) BitmapDescriptorFactory.HUE_RED));
        this.f57608O = (int) obtainStyledAttributes.getDimension(52, (float) C23349d.m84776a(context, 6.0f));
        this.f57609P = (int) obtainStyledAttributes.getDimension(49, (float) C23349d.m84776a(context, 4.0f));
        this.f57610Q = (int) obtainStyledAttributes.getDimension(48, (float) C23349d.m84776a(context, 4.0f));
        if (this.an <= 1900) {
            this.an = 1900;
        }
        if (this.ao >= 2099) {
            this.ao = 2099;
        }
        obtainStyledAttributes.recycle();
        ap();
    }

    /* renamed from: a */
    private void m84800a(int i, int i2, int i3, int i4) {
        this.an = i;
        this.ap = i2;
        this.ao = i3;
        this.aq = i4;
        if (i3 < this.ay.getYear()) {
            this.ao = this.ay.getYear();
        }
        if (this.as == -1) {
            this.as = C23349d.m84771a(this.ao, this.aq);
        }
        this.f57621b = (((this.ay.getYear() - this.an) * 12) + this.ay.getMonth()) - this.ap;
    }
}

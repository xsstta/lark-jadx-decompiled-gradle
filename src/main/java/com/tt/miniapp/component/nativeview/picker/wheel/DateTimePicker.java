package com.tt.miniapp.component.nativeview.picker.wheel;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.component.nativeview.picker.wheel.WheelView;
import com.tt.miniapp.util.MiniAppDateUtils;
import com.tt.miniapphost.util.DebugUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class DateTimePicker extends AbstractC65965f {

    /* renamed from: D */
    public ArrayList<String> f166360D = new ArrayList<>();

    /* renamed from: E */
    public ArrayList<String> f166361E = new ArrayList<>();

    /* renamed from: F */
    public ArrayList<String> f166362F = new ArrayList<>();

    /* renamed from: G */
    public ArrayList<String> f166363G = new ArrayList<>();

    /* renamed from: H */
    public ArrayList<String> f166364H = new ArrayList<>();

    /* renamed from: I */
    public String f166365I;

    /* renamed from: J */
    public String f166366J;

    /* renamed from: K */
    public String f166367K;

    /* renamed from: L */
    public int f166368L = 0;

    /* renamed from: M */
    public int f166369M = 0;

    /* renamed from: N */
    public int f166370N = 0;

    /* renamed from: O */
    public String f166371O = "";

    /* renamed from: P */
    public String f166372P = "";

    /* renamed from: Q */
    public AbstractC65927d f166373Q;

    /* renamed from: R */
    public int f166374R = 0;

    /* renamed from: S */
    public boolean f166375S = true;
    private String ag;
    private String ah;

    /* renamed from: ai  reason: collision with root package name */
    private AbstractC65924a f175468ai;
    private int aj = 3;
    private int ak = 1900;
    private int al = 1;
    private int am = 1;
    private int an = 2100;
    private int ao = 12;
    private int ap = 31;
    private int aq;
    private int ar = 0;
    private int as;
    private int at = 59;
    private int au = 17;
    private boolean av = false;
    private List<WeakReference<WheelView>> aw = new ArrayList(5);

    @Retention(RetentionPolicy.SOURCE)
    public @interface DateMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TimeMode {
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker$a */
    protected interface AbstractC65924a {
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker$b */
    public interface AbstractC65925b extends AbstractC65924a {
        /* renamed from: a */
        void mo230833a(String str, String str2, String str3, String str4);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker$c */
    public interface AbstractC65926c extends AbstractC65924a {
        /* renamed from: a */
        void mo230834a(String str, String str2);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker$d */
    public interface AbstractC65927d {
        /* renamed from: a */
        void mo230835a(int i, String str);

        /* renamed from: b */
        void mo230836b(int i, String str);

        /* renamed from: c */
        void mo230837c(int i, String str);

        /* renamed from: d */
        void mo230838d(int i, String str);

        /* renamed from: e */
        void mo230839e(int i, String str);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker$e */
    public interface AbstractC65928e extends AbstractC65924a {
        /* renamed from: a */
        void mo230840a(String str, String str2, String str3, String str4, String str5);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker$f */
    public interface AbstractC65929f extends AbstractC65924a {
        /* renamed from: a */
        void mo230841a(String str, String str2, String str3, String str4);
    }

    /* renamed from: i */
    public int mo230824i(int i, int i2) {
        return i >= i2 ? i2 - 1 : i;
    }

    /* renamed from: q */
    public String mo230829q() {
        if (this.aj != -1) {
            return this.f166371O;
        }
        return "";
    }

    /* renamed from: r */
    public String mo230830r() {
        if (this.aj != -1) {
            return this.f166372P;
        }
        return "";
    }

    /* renamed from: n */
    public String mo230826n() {
        int i = this.f166374R;
        if (i != 0 && i != 1 && i != 5) {
            return "";
        }
        if (this.f166360D.size() <= this.f166368L) {
            this.f166368L = this.f166360D.size() - 1;
        }
        return this.f166360D.get(this.f166368L);
    }

    /* renamed from: o */
    public String mo230827o() {
        if (this.f166374R == -1) {
            return "";
        }
        if (this.f166361E.size() <= this.f166369M) {
            this.f166369M = this.f166361E.size() - 1;
        }
        return this.f166361E.get(this.f166369M);
    }

    /* renamed from: p */
    public String mo230828p() {
        int i = this.f166374R;
        if (i != 0 && i != 2) {
            return "";
        }
        if (this.f166362F.size() <= this.f166370N) {
            this.f166370N = this.f166362F.size() - 1;
        }
        return this.f166362F.get(this.f166370N);
    }

    /* renamed from: u */
    private void m258221u() {
        this.f166360D.clear();
        int i = this.ak;
        int i2 = this.an;
        if (i == i2) {
            this.f166360D.add(String.valueOf(i));
        } else if (i < i2) {
            while (i <= this.an) {
                this.f166360D.add(String.valueOf(i));
                i++;
            }
        } else {
            while (i >= this.an) {
                this.f166360D.add(String.valueOf(i));
                i--;
            }
        }
        if (!this.f166375S) {
            int i3 = this.f166374R;
            if (i3 == 0 || i3 == 1) {
                int indexOf = this.f166360D.indexOf(MiniAppDateUtils.m261178a(Calendar.getInstance().get(1)));
                if (indexOf == -1) {
                    this.f166368L = 0;
                } else {
                    this.f166368L = indexOf;
                }
            }
        }
    }

    /* renamed from: v */
    private void m258222v() {
        int i;
        this.f166363G.clear();
        if (this.f166375S) {
            i = 0;
        } else if (this.aj == 3) {
            i = Calendar.getInstance().get(11);
        } else {
            i = Calendar.getInstance().get(10);
        }
        for (int i2 = this.aq; i2 <= this.as; i2++) {
            String a = MiniAppDateUtils.m261178a(i2);
            if (!this.f166375S && i2 == i) {
                this.f166371O = a;
            }
            this.f166363G.add(a);
        }
        if (this.f166363G.indexOf(this.f166371O) == -1) {
            this.f166371O = this.f166363G.get(0);
        }
        if (!this.f166375S) {
            this.f166372P = MiniAppDateUtils.m261178a(Calendar.getInstance().get(12));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b
    /* renamed from: l */
    public void mo230806l() {
        if (this.f175468ai != null) {
            for (WeakReference<WheelView> weakReference : this.aw) {
                WheelView wheelView = weakReference.get();
                if (wheelView != null) {
                    wheelView.mo230850c();
                }
            }
            this.aw.clear();
            String n = mo230826n();
            String o = mo230827o();
            String p = mo230828p();
            String q = mo230829q();
            String r = mo230830r();
            int i = this.f166374R;
            if (i == -1) {
                ((AbstractC65926c) this.f175468ai).mo230834a(q, r);
            } else if (i == 0) {
                ((AbstractC65928e) this.f175468ai).mo230840a(n, o, p, q, r);
            } else if (i == 1) {
                ((AbstractC65929f) this.f175468ai).mo230841a(n, o, q, r);
            } else if (i == 2) {
                ((AbstractC65925b) this.f175468ai).mo230833a(o, p, q, r);
            } else if (i == 5) {
                ((AbstractC65928e) this.f175468ai).mo230840a(n, o, p, q, r);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.component.nativeview.picker.p3274a.p3275a.AbstractC65914b
    /* renamed from: j */
    public View mo230804j() {
        int i;
        int i2 = this.f166374R;
        if ((i2 == 0 || i2 == 1 || i2 == 5) && this.f166360D.size() == 0) {
            m258221u();
        }
        int i3 = this.f166374R;
        if (i3 == 0 || (i3 == 1 && this.f166361E.size() == 0)) {
            mo230811a(MiniAppDateUtils.m261177a(mo230826n()));
        }
        int i4 = this.f166374R;
        if ((i4 == 0 || i4 == 2) && this.f166362F.size() == 0) {
            if (this.f166374R == 0) {
                i = MiniAppDateUtils.m261177a(mo230826n());
            } else {
                i = Calendar.getInstance(Locale.CHINA).get(1);
            }
            mo230825j(i, MiniAppDateUtils.m261177a(mo230827o()));
        }
        if (this.aj != -1 && this.f166363G.size() == 0) {
            m258222v();
        }
        if (this.aj != -1 && this.f166364H.size() == 0) {
            mo230817b(MiniAppDateUtils.m261177a(this.f166371O));
        }
        LinearLayout linearLayout = new LinearLayout(this.f166322a);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        WheelView s = mo230927s();
        final WheelView s2 = mo230927s();
        final WheelView s3 = mo230927s();
        WheelView s4 = mo230927s();
        final WheelView s5 = mo230927s();
        this.aw.add(new WeakReference<>(s));
        this.aw.add(new WeakReference<>(s2));
        this.aw.add(new WeakReference<>(s3));
        this.aw.add(new WeakReference<>(s4));
        this.aw.add(new WeakReference<>(s5));
        int i5 = this.f166374R;
        if (i5 == 0 || i5 == 1 || i5 == 5) {
            s.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            s.mo230847a(mo230810a(this.f166360D, this.ag), this.f166368L);
            s.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.C659181 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                /* renamed from: a */
                public void mo230831a(int i) {
                    DateTimePicker.this.f166368L = i;
                    String str = DateTimePicker.this.f166360D.get(DateTimePicker.this.f166368L);
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230835a(DateTimePicker.this.f166368L, str);
                    }
                    if (DateTimePicker.this.f166375S) {
                        DateTimePicker.this.f166369M = 0;
                        DateTimePicker.this.f166370N = 0;
                    }
                    int a = MiniAppDateUtils.m261177a(str);
                    DateTimePicker.this.mo230811a(a);
                    WheelView wheelView = s2;
                    DateTimePicker dateTimePicker = DateTimePicker.this;
                    wheelView.mo230847a(dateTimePicker.mo230810a(dateTimePicker.f166361E, DateTimePicker.this.f166365I), DateTimePicker.this.f166369M);
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230836b(DateTimePicker.this.f166369M, DateTimePicker.this.f166361E.get(DateTimePicker.this.f166369M));
                    }
                    DateTimePicker dateTimePicker2 = DateTimePicker.this;
                    dateTimePicker2.mo230825j(a, MiniAppDateUtils.m261177a(dateTimePicker2.f166361E.get(DateTimePicker.this.f166369M)));
                    WheelView wheelView2 = s3;
                    DateTimePicker dateTimePicker3 = DateTimePicker.this;
                    wheelView2.mo230847a(dateTimePicker3.mo230810a(dateTimePicker3.f166362F, DateTimePicker.this.f166366J), DateTimePicker.this.f166370N);
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230837c(DateTimePicker.this.f166370N, DateTimePicker.this.f166362F.get(DateTimePicker.this.f166370N));
                    }
                }
            });
            linearLayout.addView(s);
            if (this.av && !TextUtils.isEmpty(this.ag)) {
                TextView t = mo230928t();
                t.setTextSize((float) this.au);
                t.setText(this.ag);
                linearLayout.addView(t);
            }
        }
        int i6 = this.f166374R;
        if (i6 == 0 || i6 == 1) {
            s2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            s2.mo230847a(mo230810a(this.f166361E, this.f166365I), this.f166369M);
            s2.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.C659192 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                /* renamed from: a */
                public void mo230831a(int i) {
                    int i2;
                    DateTimePicker dateTimePicker = DateTimePicker.this;
                    int i3 = dateTimePicker.mo230824i(i, dateTimePicker.f166361E.size());
                    if (i3 < 0) {
                        DebugUtil.outputError("DateTimePicker", "invalid Index. index:", Integer.valueOf(i3), "months.size():", Integer.valueOf(DateTimePicker.this.f166361E.size()), "originIndex:", Integer.valueOf(i));
                        return;
                    }
                    DateTimePicker.this.f166369M = i3;
                    String str = DateTimePicker.this.f166361E.get(DateTimePicker.this.f166369M);
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230836b(DateTimePicker.this.f166369M, str);
                    }
                    if (DateTimePicker.this.f166374R == 0 || DateTimePicker.this.f166374R == 2) {
                        if (DateTimePicker.this.f166375S) {
                            DateTimePicker.this.f166370N = 0;
                        }
                        if (DateTimePicker.this.f166374R == 0) {
                            i2 = MiniAppDateUtils.m261177a(DateTimePicker.this.mo230826n());
                        } else {
                            i2 = Calendar.getInstance(Locale.CHINA).get(1);
                        }
                        DateTimePicker.this.mo230825j(i2, MiniAppDateUtils.m261177a(str));
                        WheelView wheelView = s3;
                        DateTimePicker dateTimePicker2 = DateTimePicker.this;
                        wheelView.mo230847a(dateTimePicker2.mo230810a(dateTimePicker2.f166362F, DateTimePicker.this.f166366J), DateTimePicker.this.f166370N);
                        if (DateTimePicker.this.f166373Q != null) {
                            DateTimePicker.this.f166373Q.mo230837c(DateTimePicker.this.f166370N, DateTimePicker.this.f166362F.get(DateTimePicker.this.f166370N));
                        }
                    }
                }
            });
            linearLayout.addView(s2);
            if (this.av && !TextUtils.isEmpty(this.f166365I)) {
                TextView t2 = mo230928t();
                t2.setTextSize((float) this.au);
                t2.setText(this.f166365I);
                linearLayout.addView(t2);
            }
        }
        if (this.f166374R == 0) {
            s3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            s3.mo230847a(mo230810a(this.f166362F, this.f166366J), this.f166370N);
            s3.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.C659203 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                /* renamed from: a */
                public void mo230831a(int i) {
                    DateTimePicker dateTimePicker = DateTimePicker.this;
                    int i2 = dateTimePicker.mo230824i(i, dateTimePicker.f166362F.size());
                    if (i2 < 0) {
                        DebugUtil.outputError("DateTimePicker", "invalid Index. index:", Integer.valueOf(i2), "days.size():", Integer.valueOf(DateTimePicker.this.f166362F.size()), "originIndex:", Integer.valueOf(i));
                        return;
                    }
                    DateTimePicker.this.f166370N = i2;
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230837c(DateTimePicker.this.f166370N, DateTimePicker.this.f166362F.get(DateTimePicker.this.f166370N));
                    }
                }
            });
            linearLayout.addView(s3);
            if (this.av && !TextUtils.isEmpty(this.f166366J)) {
                TextView t3 = mo230928t();
                t3.setTextSize((float) this.au);
                t3.setText(this.f166366J);
                linearLayout.addView(t3);
            }
        }
        if (this.aj != -1) {
            s4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            s4.mo230848a(mo230810a(this.f166363G, this.ah), m258220a(this.f166371O, this.ah));
            s4.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.C659214 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                /* renamed from: a */
                public void mo230831a(int i) {
                    DateTimePicker dateTimePicker = DateTimePicker.this;
                    dateTimePicker.f166371O = dateTimePicker.f166363G.get(i);
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230838d(i, DateTimePicker.this.f166371O);
                    }
                    DateTimePicker dateTimePicker2 = DateTimePicker.this;
                    dateTimePicker2.mo230817b(MiniAppDateUtils.m261177a(dateTimePicker2.f166371O));
                    WheelView wheelView = s5;
                    DateTimePicker dateTimePicker3 = DateTimePicker.this;
                    wheelView.mo230848a(dateTimePicker3.mo230810a(dateTimePicker3.f166364H, DateTimePicker.this.f166367K), DateTimePicker.this.f166372P);
                }
            });
            linearLayout.addView(s4);
            if (this.av && !TextUtils.isEmpty(this.ah)) {
                TextView t4 = mo230928t();
                t4.setTextSize((float) this.au);
                t4.setText(this.ah);
                linearLayout.addView(t4);
            }
            s5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            s5.mo230848a(mo230810a(this.f166364H, this.f166367K), m258220a(this.f166372P, this.f166367K));
            s5.setOnItemSelectListener(new WheelView.AbstractC65935d() {
                /* class com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.C659225 */

                @Override // com.tt.miniapp.component.nativeview.picker.wheel.WheelView.AbstractC65935d
                /* renamed from: a */
                public void mo230831a(int i) {
                    DateTimePicker dateTimePicker = DateTimePicker.this;
                    int i2 = dateTimePicker.mo230824i(i, dateTimePicker.f166364H.size());
                    if (i2 < 0) {
                        DebugUtil.outputError("DateTimePicker", "invalid Index. index:", Integer.valueOf(i2), "minutes.size():", Integer.valueOf(DateTimePicker.this.f166364H.size()), "originIndex:", Integer.valueOf(i));
                        return;
                    }
                    DateTimePicker dateTimePicker2 = DateTimePicker.this;
                    dateTimePicker2.f166372P = dateTimePicker2.f166364H.get(i2);
                    if (DateTimePicker.this.f166373Q != null) {
                        DateTimePicker.this.f166373Q.mo230839e(i2, DateTimePicker.this.f166372P);
                    }
                }
            });
            linearLayout.addView(s5);
            if (this.av && !TextUtils.isEmpty(this.f166367K)) {
                TextView t5 = mo230928t();
                t5.setTextSize((float) this.au);
                t5.setText(this.f166367K);
                linearLayout.addView(t5);
            }
        }
        return linearLayout;
    }

    /* renamed from: a */
    public void mo230815a(AbstractC65924a aVar) {
        this.f175468ai = aVar;
    }

    /* renamed from: b */
    public void mo230817b(int i) {
        this.f166364H.clear();
        int i2 = this.aq;
        int i3 = this.as;
        if (i2 == i3) {
            int i4 = this.ar;
            int i5 = this.at;
            if (i4 > i5) {
                this.ar = i5;
                this.at = i4;
            }
            for (int i6 = this.ar; i6 <= this.at; i6++) {
                this.f166364H.add(MiniAppDateUtils.m261178a(i6));
            }
        } else if (i == i2) {
            for (int i7 = this.ar; i7 <= 59; i7++) {
                this.f166364H.add(MiniAppDateUtils.m261178a(i7));
            }
        } else if (i == i3) {
            for (int i8 = 0; i8 <= this.at; i8++) {
                this.f166364H.add(MiniAppDateUtils.m261178a(i8));
            }
        } else {
            for (int i9 = 0; i9 <= 59; i9++) {
                this.f166364H.add(MiniAppDateUtils.m261178a(i9));
            }
        }
        if (this.f166364H.indexOf(this.f166372P) == -1) {
            this.f166372P = this.f166364H.get(0);
        }
    }

    /* renamed from: a */
    public void mo230811a(int i) {
        String str;
        int i2;
        int i3 = 1;
        if (!this.f166375S) {
            int size = this.f166361E.size();
            int i4 = this.f166369M;
            if (size > i4) {
                str = this.f166361E.get(i4);
            } else {
                str = MiniAppDateUtils.m261178a(Calendar.getInstance().get(2) + 1);
            }
        } else {
            str = "";
        }
        this.f166361E.clear();
        int i5 = this.al;
        if (i5 < 1 || (i2 = this.ao) < 1 || i5 > 12 || i2 > 12) {
            throw new IllegalArgumentException("Month out of range [1-12]");
        }
        int i6 = this.ak;
        int i7 = this.an;
        if (i6 == i7) {
            if (i5 > i2) {
                while (i2 >= this.al) {
                    this.f166361E.add(MiniAppDateUtils.m261178a(i2));
                    i2--;
                }
            } else {
                while (i5 <= this.ao) {
                    this.f166361E.add(MiniAppDateUtils.m261178a(i5));
                    i5++;
                }
            }
        } else if (i == i6) {
            while (i5 <= 12) {
                this.f166361E.add(MiniAppDateUtils.m261178a(i5));
                i5++;
            }
        } else if (i == i7) {
            while (i3 <= this.ao) {
                this.f166361E.add(MiniAppDateUtils.m261178a(i3));
                i3++;
            }
        } else {
            while (i3 <= 12) {
                this.f166361E.add(MiniAppDateUtils.m261178a(i3));
                i3++;
            }
        }
        if (!this.f166375S) {
            int indexOf = this.f166361E.indexOf(str);
            if (indexOf == -1) {
                indexOf = 0;
            }
            this.f166369M = indexOf;
        }
    }

    /* renamed from: a */
    private int m258219a(ArrayList<String> arrayList, int i) {
        int binarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i), new Comparator<Object>() {
            /* class com.tt.miniapp.component.nativeview.picker.wheel.DateTimePicker.C659236 */

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                String obj3 = obj.toString();
                String obj4 = obj2.toString();
                if (obj3.startsWith("0")) {
                    obj3 = obj3.substring(1);
                }
                if (obj4.startsWith("0")) {
                    obj4 = obj4.substring(1);
                }
                try {
                    return Integer.parseInt(obj3) - Integer.parseInt(obj4);
                } catch (NumberFormatException e) {
                    AppBrandLogger.stacktrace(6, "DateTimePicker", e.getStackTrace());
                    return 0;
                }
            }
        });
        if (binarySearch < 0) {
            return 0;
        }
        return binarySearch;
    }

    /* renamed from: f */
    public void mo230823f(int i, int i2) {
        if (this.f166374R != -1) {
            this.ak = i;
            this.an = i2;
            m258221u();
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    /* renamed from: a */
    private String m258220a(String str, String str2) {
        if (this.av) {
            return str;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str + str2;
    }

    /* renamed from: b */
    public void mo230818b(int i, int i2) {
        int i3 = this.f166374R;
        if (i3 == -1) {
            throw new IllegalArgumentException("Date mode invalid");
        } else if (i3 != 0) {
            if (i3 == 1) {
                this.ak = i;
                this.al = i2;
            } else if (i3 == 2) {
                int i4 = Calendar.getInstance(Locale.CHINA).get(1);
                this.an = i4;
                this.ak = i4;
                this.al = i;
                this.am = i2;
            }
            m258221u();
        } else {
            throw new IllegalArgumentException("Not support year/month/day mode");
        }
    }

    /* renamed from: c */
    public void mo230820c(int i, int i2) {
        int i3 = this.f166374R;
        if (i3 == -1) {
            throw new IllegalArgumentException("Date mode invalid");
        } else if (i3 != 0) {
            if (i3 == 1) {
                this.an = i;
                this.ao = i2;
            } else if (i3 == 2) {
                this.ao = i;
                this.ap = i2;
            }
            m258221u();
        } else {
            throw new IllegalArgumentException("Not support year/month/day mode");
        }
    }

    /* renamed from: a */
    public ArrayList<String> mo230810a(ArrayList<String> arrayList, String str) {
        if (this.av) {
            return arrayList;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next() + str);
        }
        return arrayList2;
    }

    /* renamed from: d */
    public void mo230821d(int i, int i2) {
        boolean z;
        int i3 = this.aj;
        if (i3 != -1) {
            if (i < 0 || i2 < 0 || i2 > 59) {
                z = true;
            } else {
                z = false;
            }
            if (i3 == 4 && (i == 0 || i > 12)) {
                z = true;
            }
            if (i3 == 3 && i >= 24) {
                z = true;
            }
            if (z) {
                AppBrandLogger.m52829e("DateTimePicker", "set time range start err, startHour ", Integer.valueOf(i), " startMinute ", Integer.valueOf(i2));
            } else {
                this.aq = i;
                this.ar = i2;
            }
            m258222v();
            return;
        }
        throw new IllegalArgumentException("Time mode invalid");
    }

    /* renamed from: e */
    public void mo230822e(int i, int i2) {
        boolean z;
        int i3 = this.aj;
        if (i3 != -1) {
            if (i < 0 || i2 < 0 || i2 > 59) {
                z = true;
            } else {
                z = false;
            }
            if (i3 == 4 && (i == 0 || i > 12)) {
                z = true;
            }
            if (i3 == 3 && i >= 24) {
                z = true;
            }
            if (z) {
                AppBrandLogger.m52829e("DateTimePicker", "set time range end err, endHour ", Integer.valueOf(i), " endMinute ", Integer.valueOf(i2));
            } else {
                this.as = i;
                this.at = i2;
            }
            m258222v();
            return;
        }
        throw new IllegalArgumentException("Time mode invalid");
    }

    /* renamed from: j */
    public void mo230825j(int i, int i2) {
        String str;
        int a = MiniAppDateUtils.m261176a(i, i2);
        if (!this.f166375S) {
            if (this.f166370N >= a) {
                this.f166370N = a - 1;
            }
            int size = this.f166362F.size();
            int i3 = this.f166370N;
            if (size > i3) {
                str = this.f166362F.get(i3);
            } else {
                str = MiniAppDateUtils.m261178a(Calendar.getInstance().get(5));
            }
        } else {
            str = "";
        }
        this.f166362F.clear();
        int i4 = this.ak;
        if (i == i4 && i2 == this.al && i == this.an && i2 == this.ao) {
            for (int i5 = this.am; i5 <= this.ap; i5++) {
                this.f166362F.add(MiniAppDateUtils.m261178a(i5));
            }
        } else if (i == i4 && i2 == this.al) {
            for (int i6 = this.am; i6 <= a; i6++) {
                this.f166362F.add(MiniAppDateUtils.m261178a(i6));
            }
        } else {
            int i7 = 1;
            if (i == this.an && i2 == this.ao) {
                while (i7 <= this.ap) {
                    this.f166362F.add(MiniAppDateUtils.m261178a(i7));
                    i7++;
                }
            } else {
                while (i7 <= a) {
                    this.f166362F.add(MiniAppDateUtils.m261178a(i7));
                    i7++;
                }
            }
        }
        if (!this.f166375S) {
            int indexOf = this.f166362F.indexOf(str);
            if (indexOf == -1) {
                indexOf = 0;
            }
            this.f166370N = indexOf;
        }
    }

    /* renamed from: b */
    public void mo230819b(int i, int i2, int i3) {
        if (this.f166374R != -1) {
            this.an = i;
            this.ao = i2;
            this.ap = i3;
            m258221u();
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    public DateTimePicker(Activity activity, int i, int i2) {
        super(activity);
        this.ag = activity.getString(R.string.microapp_m_year);
        this.f166365I = activity.getString(R.string.microapp_m_month);
        this.f166366J = activity.getString(R.string.microapp_m_day);
        this.ah = activity.getString(R.string.microapp_m_hour);
        this.f166367K = activity.getString(R.string.microapp_m_minute);
        if (i == -1 && i2 == -1) {
            throw new IllegalArgumentException("The modes are NONE at the same time");
        }
        if (i == 0 && i2 != -1) {
            if (this.f166323b < 480) {
                this.au = 12;
            } else if (this.f166323b < 720) {
                this.au = 14;
            }
        }
        this.f166374R = i;
        if (i2 == 4) {
            this.aq = 1;
            this.as = 12;
        } else {
            this.aq = 0;
            this.as = 23;
        }
        this.aj = i2;
    }

    /* renamed from: a */
    public void mo230812a(int i, int i2, int i3) {
        if (this.f166374R != -1) {
            this.ak = i;
            this.al = i2;
            this.am = i3;
            m258221u();
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    /* renamed from: a */
    public void mo230813a(int i, int i2, int i3, int i4) {
        int i5 = this.f166374R;
        if (i5 != 0) {
            if (i5 == 2) {
                int i6 = Calendar.getInstance(Locale.CHINA).get(1);
                this.an = i6;
                this.ak = i6;
                mo230811a(i6);
                mo230825j(i6, i);
                this.f166369M = m258219a(this.f166361E, i);
                this.f166370N = m258219a(this.f166362F, i2);
            } else if (i5 == 1) {
                mo230811a(i);
                this.f166368L = m258219a(this.f166360D, i);
                this.f166369M = m258219a(this.f166361E, i2);
            }
            if (this.aj != -1) {
                this.f166371O = MiniAppDateUtils.m261178a(i3);
                this.f166372P = MiniAppDateUtils.m261178a(i4);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Date mode invalid");
    }

    /* renamed from: a */
    public void mo230816a(String str, String str2, String str3, String str4, String str5) {
        this.ag = str;
        this.f166365I = str2;
        this.f166366J = str3;
        this.ah = str4;
        this.f166367K = str5;
    }

    /* renamed from: a */
    public void mo230814a(int i, int i2, int i3, int i4, int i5) {
        mo230811a(i);
        mo230825j(i, i2);
        this.f166368L = m258219a(this.f166360D, i);
        this.f166369M = m258219a(this.f166361E, i2);
        this.f166370N = m258219a(this.f166362F, i3);
        if (this.aj != -1) {
            this.f166371O = MiniAppDateUtils.m261178a(i4);
            this.f166372P = MiniAppDateUtils.m261178a(i5);
        }
    }
}

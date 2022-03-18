package com.bytedance.ies.xelement.picker.p819b;

import android.content.Context;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p820c.C14503a;
import com.bytedance.ies.xelement.picker.p820c.C14505c;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14516j;
import com.bytedance.ies.xelement.picker.view.View$OnClickListenerC14532d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.bytedance.ies.xelement.picker.b.d */
public class C14502d extends AbstractC14499a<C14502d> {

    /* renamed from: a */
    private C14505c f38262a;

    /* renamed from: b */
    private String f38263b = ":";

    /* renamed from: c */
    private String f38264c;

    /* renamed from: d */
    private String f38265d;

    /* renamed from: e */
    private String f38266e;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.p819b.AbstractC14499a
    /* renamed from: a */
    public C14503a mo53390a() {
        return this.f38262a;
    }

    /* renamed from: c */
    private String m58666c() {
        boolean[] zArr = this.f38262a.f38308G;
        if (zArr == null || zArr.length != 3) {
            return "HH" + this.f38263b + "mm";
        }
        boolean z = zArr[0];
        boolean z2 = zArr[1];
        boolean z3 = zArr[2];
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("HH");
            if (z2 || z3) {
                sb.append(this.f38263b);
            }
        }
        if (z2) {
            sb.append("mm");
            if (z3) {
                sb.append(this.f38263b);
            }
        }
        if (z3) {
            sb.append("ss");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public View$OnClickListenerC14532d mo53409b() {
        SimpleDateFormat simpleDateFormat;
        this.f38262a.f38326Y = this.f38263b;
        try {
            simpleDateFormat = new SimpleDateFormat(m58666c(), Locale.getDefault());
        } catch (Exception unused) {
            String str = this.f38265d;
            if (str != null) {
                this.f38265d = str.replace(this.f38263b, ":");
            }
            String str2 = this.f38266e;
            if (str2 != null) {
                this.f38266e = str2.replace(this.f38263b, ":");
            }
            String str3 = this.f38264c;
            if (str3 != null) {
                this.f38264c = str3.replace(this.f38263b, ":");
            }
            this.f38263b = ":";
            simpleDateFormat = new SimpleDateFormat(m58666c(), Locale.getDefault());
        }
        String str4 = this.f38265d;
        if (str4 != null) {
            try {
                Date parse = simpleDateFormat.parse(str4);
                this.f38262a.f38310I = Calendar.getInstance();
                this.f38262a.f38310I.setTime(parse);
            } catch (ParseException unused2) {
            }
        }
        if (this.f38262a.f38310I == null) {
            this.f38262a.f38310I = Calendar.getInstance();
            this.f38262a.f38310I.set(2000, 0, 1, 0, 0, 0);
        }
        String str5 = this.f38266e;
        if (str5 != null) {
            try {
                Date parse2 = simpleDateFormat.parse(str5);
                this.f38262a.f38311J = Calendar.getInstance();
                this.f38262a.f38311J.setTimeInMillis(parse2.getTime());
            } catch (ParseException unused3) {
            }
        }
        if (this.f38262a.f38311J == null) {
            this.f38262a.f38311J = Calendar.getInstance();
            this.f38262a.f38311J.set(2000, 0, 1, 23, 59, 59);
        }
        String str6 = this.f38264c;
        if (str6 != null) {
            try {
                Date parse3 = simpleDateFormat.parse(str6);
                this.f38262a.f38309H = Calendar.getInstance();
                this.f38262a.f38309H.setTime(parse3);
            } catch (ParseException unused4) {
            }
        }
        if (this.f38262a.f38309H == null) {
            this.f38262a.f38309H = Calendar.getInstance();
        }
        return new View$OnClickListenerC14532d(this.f38262a);
    }

    /* renamed from: c */
    public C14502d mo53410c(String str) {
        this.f38264c = str;
        return this;
    }

    /* renamed from: a */
    public C14502d mo53404a(LocalizeAdapter aVar) {
        this.f38262a.f38325X = aVar;
        return this;
    }

    /* renamed from: a */
    public C14502d mo53405a(AbstractC14516j jVar) {
        this.f38262a.f38305D = jVar;
        return this;
    }

    /* renamed from: b */
    public C14502d mo53408b(String str) {
        if (str == null) {
            this.f38263b = ":";
        } else {
            this.f38263b = str;
        }
        return this;
    }

    public C14502d(Context context) {
        C14505c cVar = new C14505c();
        this.f38262a = cVar;
        cVar.f38275f = context;
    }

    /* renamed from: a */
    public C14502d mo53406a(String str) {
        if ("hour".equals(str)) {
            this.f38262a.f38308G = new boolean[]{true, false, false};
        } else if ("minute".equals(str)) {
            this.f38262a.f38308G = new boolean[]{true, true, false};
        } else if ("second".equals(str)) {
            this.f38262a.f38308G = new boolean[]{true, true, true};
        } else {
            this.f38262a.f38308G = new boolean[]{true, true, false};
        }
        return this;
    }

    /* renamed from: a */
    public C14502d mo53407a(String str, String str2) {
        this.f38265d = str;
        this.f38266e = str2;
        return this;
    }
}

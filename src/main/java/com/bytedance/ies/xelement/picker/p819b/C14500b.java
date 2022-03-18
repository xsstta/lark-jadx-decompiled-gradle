package com.bytedance.ies.xelement.picker.p819b;

import android.content.Context;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p820c.C14503a;
import com.bytedance.ies.xelement.picker.p820c.C14505c;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14516j;
import com.bytedance.ies.xelement.picker.view.View$OnClickListenerC14529b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.bytedance.ies.xelement.picker.b.b */
public class C14500b extends AbstractC14499a<C14500b> {

    /* renamed from: a */
    private C14505c f38256a;

    /* renamed from: b */
    private String f38257b = "-";

    /* renamed from: c */
    private String f38258c;

    /* renamed from: d */
    private String f38259d;

    /* renamed from: e */
    private String f38260e;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.xelement.picker.p819b.AbstractC14499a
    /* renamed from: a */
    public C14503a mo53390a() {
        return this.f38256a;
    }

    /* renamed from: c */
    private String m58650c() {
        boolean[] zArr = this.f38256a.f38307F;
        if (zArr == null || zArr.length != 3) {
            return "yyyy" + this.f38257b + "MM" + this.f38257b + "dd";
        }
        boolean z = zArr[0];
        boolean z2 = zArr[1];
        boolean z3 = zArr[2];
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("yyyy");
            if (z2 || z3) {
                sb.append(this.f38257b);
            }
        }
        if (z2) {
            sb.append("MM");
            if (z3) {
                sb.append(this.f38257b);
            }
        }
        if (z3) {
            sb.append("dd");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public View$OnClickListenerC14529b mo53396b() {
        SimpleDateFormat simpleDateFormat;
        this.f38256a.f38326Y = this.f38257b;
        try {
            simpleDateFormat = new SimpleDateFormat(m58650c(), Locale.getDefault());
        } catch (Exception unused) {
            String str = this.f38259d;
            if (str != null) {
                this.f38259d = str.replace(this.f38257b, "-");
            }
            String str2 = this.f38260e;
            if (str2 != null) {
                this.f38260e = str2.replace(this.f38257b, "-");
            }
            String str3 = this.f38258c;
            if (str3 != null) {
                this.f38258c = str3.replace(this.f38257b, "-");
            }
            this.f38257b = "-";
            simpleDateFormat = new SimpleDateFormat(m58650c(), Locale.getDefault());
        }
        String str4 = this.f38259d;
        if (str4 != null) {
            try {
                Date parse = simpleDateFormat.parse(str4);
                this.f38256a.f38310I = Calendar.getInstance();
                this.f38256a.f38310I.setTime(parse);
            } catch (ParseException unused2) {
            }
        }
        String str5 = this.f38260e;
        if (str5 != null) {
            try {
                Date parse2 = simpleDateFormat.parse(str5);
                this.f38256a.f38311J = Calendar.getInstance();
                this.f38256a.f38311J.setTime(parse2);
            } catch (ParseException unused3) {
            }
        }
        String str6 = this.f38258c;
        if (str6 != null) {
            try {
                Date parse3 = simpleDateFormat.parse(str6);
                this.f38256a.f38309H = Calendar.getInstance();
                this.f38256a.f38309H.setTime(parse3);
            } catch (ParseException unused4) {
            }
        }
        return new View$OnClickListenerC14529b(this.f38256a);
    }

    /* renamed from: c */
    public C14500b mo53397c(String str) {
        this.f38258c = str;
        return this;
    }

    /* renamed from: a */
    public C14500b mo53391a(LocalizeAdapter aVar) {
        this.f38256a.f38325X = aVar;
        return this;
    }

    /* renamed from: a */
    public C14500b mo53392a(AbstractC14516j jVar) {
        this.f38256a.f38305D = jVar;
        return this;
    }

    /* renamed from: b */
    public C14500b mo53395b(String str) {
        if (str == null) {
            this.f38257b = "-";
        } else {
            this.f38257b = str;
        }
        return this;
    }

    public C14500b(Context context) {
        C14505c cVar = new C14505c();
        this.f38256a = cVar;
        cVar.f38275f = context;
    }

    /* renamed from: a */
    public C14500b mo53393a(String str) {
        if ("year".equals(str)) {
            this.f38256a.f38307F = new boolean[]{true, false, false};
        } else if ("month".equals(str)) {
            this.f38256a.f38307F = new boolean[]{true, true, false};
        } else if ("day".equals(str)) {
            this.f38256a.f38307F = new boolean[]{true, true, true};
        } else {
            this.f38256a.f38308G = new boolean[]{true, true, true};
        }
        return this;
    }

    /* renamed from: a */
    public C14500b mo53394a(String str, String str2) {
        this.f38259d = str;
        this.f38260e = str2;
        return this;
    }
}

package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.xelement.picker.p820c.C14503a;
import com.bytedance.ies.xelement.picker.p820c.C14505c;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14509c;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ies.xelement.picker.view.d */
public class View$OnClickListenerC14532d extends AbstractC14522a implements View.OnClickListener {

    /* renamed from: i */
    public C14505c f38412i;

    /* renamed from: j */
    private C14540g f38413j;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.AbstractC14522a
    /* renamed from: a */
    public C14503a mo53460a() {
        return this.f38412i;
    }

    @Override // com.bytedance.ies.xelement.picker.view.AbstractC14522a
    /* renamed from: m */
    public boolean mo53477m() {
        return this.f38412i.f38292w;
    }

    /* renamed from: n */
    public String mo53485n() {
        String str;
        if (this.f38412i.f38326Y != null) {
            str = this.f38412i.f38326Y;
        } else {
            str = ":";
        }
        boolean[] zArr = this.f38412i.f38308G;
        Calendar a = this.f38413j.mo53529a();
        int i = a.get(11);
        int i2 = a.get(12);
        int i3 = a.get(13);
        if (zArr == null || zArr.length != 3) {
            return String.format(Locale.getDefault(), "%02d%s%02d%s%02d", Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3));
        } else if (zArr[2]) {
            return String.format(Locale.getDefault(), "%02d%s%02d%s%02d", Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3));
        } else if (zArr[1]) {
            return String.format(Locale.getDefault(), "%02d%s%02d", Integer.valueOf(i), str, Integer.valueOf(i2));
        } else {
            return String.format(Locale.getDefault(), "%02d", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private void m58749a(Calendar calendar) {
        this.f38413j.mo53536a(calendar);
    }

    public View$OnClickListenerC14532d(C14505c cVar) {
        super(cVar.f38275f);
        this.f38412i = cVar;
        m58747a(cVar.f38275f);
    }

    public void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f38412i.f38305D != null) {
                this.f38412i.f38305D.mo53379a(mo53485n(), this.f38391g);
            }
            this.f38392h = true;
        } else if (str.equals("cancel")) {
            if (this.f38412i.f38270a != null) {
                this.f38412i.f38270a.mo53380a();
            }
            this.f38392h = true;
        }
        mo53471g();
    }

    /* renamed from: a */
    private void m58747a(Context context) {
        String str;
        String str2;
        String str3;
        mo53473i();
        mo53465b();
        mo53467c();
        if (this.f38412i.f38271b == null) {
            LayoutInflater.from(context).inflate(R.layout.lynx_picker_time, this.f38385a);
            TextView textView = (TextView) mo53459a(R.id.tvTitle);
            RelativeLayout relativeLayout = (RelativeLayout) mo53459a(R.id.rv_topbar);
            Button button = (Button) mo53459a(R.id.btnSubmit);
            Button button2 = (Button) mo53459a(R.id.btnCancel);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a = this.f38412i.f38325X.mo53213a();
            if (TextUtils.isEmpty(this.f38412i.f38276g)) {
                str = a.get("confirm");
            } else {
                str = this.f38412i.f38276g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f38412i.f38277h)) {
                str2 = a.get("cancel");
            } else {
                str2 = this.f38412i.f38277h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f38412i.f38278i)) {
                str3 = "";
            } else {
                str3 = this.f38412i.f38278i;
            }
            textView.setText(str3);
            button.setTextColor(this.f38412i.f38279j);
            button2.setTextColor(this.f38412i.f38280k);
            textView.setTextColor(this.f38412i.f38281l);
            relativeLayout.setBackgroundColor(this.f38412i.f38283n);
            button.setTextSize((float) this.f38412i.f38284o);
            button2.setTextSize((float) this.f38412i.f38284o);
            textView.setTextSize((float) this.f38412i.f38285p);
        } else {
            this.f38412i.f38271b.mo53412a(LayoutInflater.from(context).inflate(this.f38412i.f38272c, this.f38385a));
        }
        LinearLayout linearLayout = (LinearLayout) mo53459a(R.id.timepicker);
        linearLayout.setBackgroundColor(this.f38412i.f38282m);
        m58748a(linearLayout);
    }

    /* renamed from: a */
    private void m58748a(LinearLayout linearLayout) {
        this.f38413j = new C14540g(linearLayout, this.f38412i.f38308G, this.f38412i.f38274e, this.f38412i.f38286q, this.f38412i.f38325X);
        if (this.f38412i.f38306E != null) {
            this.f38413j.mo53533a(new AbstractC14509c() {
                /* class com.bytedance.ies.xelement.picker.view.View$OnClickListenerC14532d.C145331 */

                @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14509c
                /* renamed from: a */
                public void mo53413a() {
                    View$OnClickListenerC14532d.this.f38412i.f38306E.mo53417a(View$OnClickListenerC14532d.this.mo53485n());
                }
            });
        }
        m58750a(this.f38412i.f38310I, this.f38412i.f38311J);
        m58749a(this.f38412i.f38309H);
        this.f38413j.mo53535a(this.f38412i.f38316O, this.f38412i.f38317P, this.f38412i.f38318Q);
        this.f38413j.mo53532a(this.f38412i.f38322U, this.f38412i.f38323V, this.f38412i.f38324W);
        this.f38413j.mo53544d(this.f38412i.f38268B);
        this.f38413j.mo53543c(this.f38412i.f38269C);
        mo53464b(this.f38412i.f38293x);
        this.f38413j.mo53538a(this.f38412i.f38312K);
        this.f38413j.mo53531a(this.f38412i.f38289t);
        this.f38413j.mo53534a(this.f38412i.f38267A);
        this.f38413j.mo53530a(this.f38412i.f38291v);
        this.f38413j.mo53542c(this.f38412i.f38287r);
        this.f38413j.mo53539b(this.f38412i.f38288s);
        this.f38413j.mo53541b(this.f38412i.f38294y);
    }

    /* renamed from: a */
    private void m58750a(Calendar calendar, Calendar calendar2) {
        this.f38413j.mo53537a(calendar, calendar2);
    }
}

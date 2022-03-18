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

/* renamed from: com.bytedance.ies.xelement.picker.view.b */
public class View$OnClickListenerC14529b extends AbstractC14522a implements View.OnClickListener {

    /* renamed from: i */
    public C14505c f38407i;

    /* renamed from: j */
    private C14534e f38408j;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.AbstractC14522a
    /* renamed from: a */
    public C14503a mo53460a() {
        return this.f38407i;
    }

    @Override // com.bytedance.ies.xelement.picker.view.AbstractC14522a
    /* renamed from: m */
    public boolean mo53477m() {
        return this.f38407i.f38292w;
    }

    /* renamed from: o */
    private void m58733o() {
        if (this.f38407i.f38310I == null) {
            this.f38407i.f38310I = Calendar.getInstance();
            this.f38407i.f38310I.set(1900, 0, 1);
        }
        if (this.f38407i.f38311J == null) {
            this.f38407i.f38311J = Calendar.getInstance();
            this.f38407i.f38311J.set(2100, 11, 31);
        }
        if (this.f38407i.f38310I.get(1) < 1900 || this.f38407i.f38310I.get(1) > 2100) {
            this.f38407i.f38310I.set(1900, 0, 1);
        }
        if (this.f38407i.f38311J.get(1) < 1900 || this.f38407i.f38311J.get(1) > 2100) {
            this.f38407i.f38311J.set(2100, 11, 31);
        }
        this.f38408j.mo53499a(this.f38407i.f38310I, this.f38407i.f38311J);
    }

    /* renamed from: p */
    private void m58734p() {
        if (this.f38407i.f38310I == null || this.f38407i.f38311J == null) {
            throw new IllegalStateException("you should call setRangDate() first");
        }
        if (this.f38407i.f38309H == null) {
            this.f38407i.f38309H = Calendar.getInstance();
        }
        if (this.f38407i.f38309H.getTimeInMillis() < this.f38407i.f38310I.getTimeInMillis()) {
            this.f38407i.f38309H.setTimeInMillis(this.f38407i.f38310I.getTimeInMillis());
        }
        if (this.f38407i.f38309H.getTimeInMillis() > this.f38407i.f38311J.getTimeInMillis()) {
            this.f38407i.f38309H.setTimeInMillis(this.f38407i.f38311J.getTimeInMillis());
        }
        int i = this.f38407i.f38309H.get(5);
        this.f38408j.mo53495a(this.f38407i.f38309H.get(1), this.f38407i.f38309H.get(2) + 1, i);
    }

    /* renamed from: n */
    public String mo53485n() {
        String str;
        Calendar a = this.f38408j.mo53492a();
        if (this.f38407i.f38326Y != null) {
            str = this.f38407i.f38326Y;
        } else {
            str = "-";
        }
        int i = a.get(1);
        int i2 = a.get(2) + 1;
        int i3 = a.get(5);
        boolean[] zArr = this.f38407i.f38307F;
        if (zArr.length != 3) {
            return String.format(Locale.getDefault(), "%04d%s%02d%s%02d", Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3));
        } else if (zArr[2]) {
            return String.format(Locale.getDefault(), "%04d%s%02d%s%02d", Integer.valueOf(i), str, Integer.valueOf(i2), str, Integer.valueOf(i3));
        } else if (zArr[1]) {
            return String.format(Locale.getDefault(), "%04d%s%02d", Integer.valueOf(i), str, Integer.valueOf(i2));
        } else {
            return String.format(Locale.getDefault(), "%04d", Integer.valueOf(i));
        }
    }

    public View$OnClickListenerC14529b(C14505c cVar) {
        super(cVar.f38275f);
        this.f38407i = cVar;
        m58731a(cVar.f38275f);
    }

    public void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f38407i.f38305D != null) {
                this.f38407i.f38305D.mo53379a(mo53485n(), this.f38391g);
            }
            this.f38392h = true;
        } else if (str.equals("cancel")) {
            if (this.f38407i.f38270a != null) {
                this.f38407i.f38270a.mo53380a();
            }
            this.f38392h = true;
        }
        mo53471g();
    }

    /* renamed from: a */
    private void m58731a(Context context) {
        String str;
        String str2;
        String str3;
        mo53473i();
        mo53465b();
        mo53467c();
        if (this.f38407i.f38271b == null) {
            LayoutInflater.from(context).inflate(R.layout.lynx_picker_date, this.f38385a);
            TextView textView = (TextView) mo53459a(R.id.tvTitle);
            RelativeLayout relativeLayout = (RelativeLayout) mo53459a(R.id.rv_topbar);
            Button button = (Button) mo53459a(R.id.btnSubmit);
            Button button2 = (Button) mo53459a(R.id.btnCancel);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a = this.f38407i.f38325X.mo53213a();
            if (TextUtils.isEmpty(this.f38407i.f38276g)) {
                str = a.get("confirm");
            } else {
                str = this.f38407i.f38276g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f38407i.f38277h)) {
                str2 = a.get("cancel");
            } else {
                str2 = this.f38407i.f38277h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f38407i.f38278i)) {
                str3 = "";
            } else {
                str3 = this.f38407i.f38278i;
            }
            textView.setText(str3);
            button.setTextColor(this.f38407i.f38279j);
            button2.setTextColor(this.f38407i.f38280k);
            textView.setTextColor(this.f38407i.f38281l);
            relativeLayout.setBackgroundColor(this.f38407i.f38283n);
            button.setTextSize((float) this.f38407i.f38284o);
            button2.setTextSize((float) this.f38407i.f38284o);
            textView.setTextSize((float) this.f38407i.f38285p);
        } else {
            this.f38407i.f38271b.mo53412a(LayoutInflater.from(context).inflate(this.f38407i.f38272c, this.f38385a));
        }
        LinearLayout linearLayout = (LinearLayout) mo53459a(R.id.datepicker);
        linearLayout.setBackgroundColor(this.f38407i.f38282m);
        m58732a(linearLayout);
    }

    /* renamed from: a */
    private void m58732a(LinearLayout linearLayout) {
        this.f38408j = new C14534e(linearLayout, this.f38407i.f38307F, this.f38407i.f38274e, this.f38407i.f38286q, this.f38407i.f38325X);
        if (this.f38407i.f38306E != null) {
            this.f38408j.mo53496a(new AbstractC14509c() {
                /* class com.bytedance.ies.xelement.picker.view.View$OnClickListenerC14529b.C145301 */

                @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14509c
                /* renamed from: a */
                public void mo53413a() {
                    View$OnClickListenerC14529b.this.f38407i.f38306E.mo53417a(View$OnClickListenerC14529b.this.mo53485n());
                }
            });
        }
        m58733o();
        m58734p();
        this.f38408j.mo53498a(this.f38407i.f38313L, this.f38407i.f38314M, this.f38407i.f38315N);
        this.f38408j.mo53507c(this.f38407i.f38319R, this.f38407i.f38320S, this.f38407i.f38321T);
        this.f38408j.mo53509d(this.f38407i.f38268B);
        this.f38408j.mo53508c(this.f38407i.f38269C);
        mo53464b(this.f38407i.f38293x);
        this.f38408j.mo53500a(this.f38407i.f38312K);
        this.f38408j.mo53494a(this.f38407i.f38289t);
        this.f38408j.mo53497a(this.f38407i.f38267A);
        this.f38408j.mo53493a(this.f38407i.f38291v);
        this.f38408j.mo53506c(this.f38407i.f38287r);
        this.f38408j.mo53503b(this.f38407i.f38288s);
        this.f38408j.mo53504b(this.f38407i.f38294y);
    }
}

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
import com.bytedance.ies.xelement.picker.p820c.C14504b;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.xelement.picker.view.c */
public class View$OnClickListenerC14531c extends AbstractC14522a implements View.OnClickListener {

    /* renamed from: i */
    private C14538f f38410i;

    /* renamed from: j */
    private C14504b f38411j;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.AbstractC14522a
    /* renamed from: a */
    public C14503a mo53460a() {
        return this.f38411j;
    }

    @Override // com.bytedance.ies.xelement.picker.view.AbstractC14522a
    /* renamed from: m */
    public boolean mo53477m() {
        return this.f38411j.f38292w;
    }

    /* renamed from: n */
    public void mo53485n() {
        if (this.f38411j.f38297E != null) {
            this.f38411j.f38297E.mo53381a(this.f38410i.mo53510a());
        }
    }

    /* renamed from: o */
    private void m58740o() {
        this.f38410i.mo53512a(this.f38411j.f38286q);
        this.f38410i.mo53519b(this.f38411j.f38268B);
        this.f38410i.mo53521b(this.f38411j.f38269C);
        this.f38410i.mo53523c(this.f38411j.f38299G);
        this.f38410i.mo53526d(this.f38411j.f38301I);
        if (this.f38411j.f38303K != null || this.f38411j.f38302J == null) {
            this.f38410i.mo53528e(this.f38411j.f38303K);
        } else {
            this.f38410i.mo53518a(this.f38411j.f38302J.booleanValue());
        }
        this.f38410i.mo53513a(this.f38411j.f38295z);
        mo53464b(this.f38411j.f38293x);
        this.f38410i.mo53522c(this.f38411j.f38289t);
        this.f38410i.mo53516a(this.f38411j.f38267A);
        this.f38410i.mo53511a(this.f38411j.f38291v);
        this.f38410i.mo53527e(this.f38411j.f38287r);
        this.f38410i.mo53525d(this.f38411j.f38288s);
        this.f38410i.mo53524c(this.f38411j.f38294y);
    }

    /* renamed from: a */
    public void mo53487a(List<Integer> list) {
        C14538f fVar = this.f38410i;
        if (fVar != null) {
            fVar.mo53520b(list);
        }
    }

    /* renamed from: b */
    public void mo53489b(List<List<String>> list) {
        mo53488a(list, true);
    }

    public View$OnClickListenerC14531c(C14504b bVar) {
        super(bVar.f38275f);
        this.f38411j = bVar;
        m58739a(bVar.f38275f);
    }

    public void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            mo53485n();
            this.f38392h = true;
        } else if (str.equals("cancel")) {
            if (this.f38411j.f38270a != null) {
                this.f38411j.f38270a.mo53380a();
            }
            this.f38392h = true;
        }
        mo53471g();
    }

    /* renamed from: a */
    private void m58739a(Context context) {
        String str;
        String str2;
        String str3;
        mo53473i();
        mo53465b();
        mo53467c();
        mo53468d();
        if (this.f38411j.f38271b == null) {
            LayoutInflater.from(context).inflate(this.f38411j.f38272c, this.f38385a);
            TextView textView = (TextView) mo53459a(R.id.tvTitle);
            RelativeLayout relativeLayout = (RelativeLayout) mo53459a(R.id.rv_topbar);
            Button button = (Button) mo53459a(R.id.btnSubmit);
            Button button2 = (Button) mo53459a(R.id.btnCancel);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a = this.f38411j.f38304L.mo53213a();
            if (TextUtils.isEmpty(this.f38411j.f38276g)) {
                str = a.get("confirm");
            } else {
                str = this.f38411j.f38276g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f38411j.f38277h)) {
                str2 = a.get("cancel");
            } else {
                str2 = this.f38411j.f38277h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f38411j.f38278i)) {
                str3 = "";
            } else {
                str3 = this.f38411j.f38278i;
            }
            textView.setText(str3);
            button.setTextColor(this.f38411j.f38279j);
            button2.setTextColor(this.f38411j.f38280k);
            textView.setTextColor(this.f38411j.f38281l);
            relativeLayout.setBackgroundColor(this.f38411j.f38283n);
            button.setTextSize((float) this.f38411j.f38284o);
            button2.setTextSize((float) this.f38411j.f38284o);
            textView.setTextSize((float) this.f38411j.f38285p);
        } else {
            this.f38411j.f38271b.mo53412a(LayoutInflater.from(context).inflate(this.f38411j.f38272c, this.f38385a));
        }
        LinearLayout linearLayout = (LinearLayout) mo53459a(R.id.optionspicker);
        linearLayout.setBackgroundColor(this.f38411j.f38282m);
        C14538f fVar = new C14538f(linearLayout);
        this.f38410i = fVar;
        fVar.mo53514a(this.f38411j);
        if (this.f38411j.f38296D != null) {
            this.f38410i.mo53515a(this.f38411j.f38296D);
        }
        mo53489b(this.f38411j.f38298F);
        mo53487a(this.f38411j.f38300H);
    }

    /* renamed from: a */
    public void mo53488a(List<List<String>> list, boolean z) {
        C14538f fVar = this.f38410i;
        if (fVar != null) {
            fVar.mo53517a(list);
        }
        if (z) {
            m58740o();
        }
    }
}

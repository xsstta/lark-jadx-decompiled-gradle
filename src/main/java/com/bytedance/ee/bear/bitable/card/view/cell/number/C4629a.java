package com.bytedance.ee.bear.bitable.card.view.cell.number;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.NumberModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.cell.number.C4631b;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13746i;
import com.larksuite.suite.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.number.a */
public class C4629a extends AbstractC4597b<List<NumberModel>, Double> implements AbstractC4607d, AbstractC7666d {

    /* renamed from: g */
    protected EditText f13677g;

    /* renamed from: h */
    public boolean f13678h;

    /* renamed from: i */
    private C4631b f13679i;

    /* renamed from: j */
    private NumberModel f13680j;

    /* renamed from: k */
    private String f13681k;

    /* renamed from: l */
    private String f13682l;

    /* renamed from: m */
    private AbstractC4548e f13683m;

    /* renamed from: n */
    private Map<String, String> f13684n = new HashMap();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13677g;
    }

    /* renamed from: l */
    private void mo18017l() {
        if (this.f13679i == null) {
            C4631b bVar = new C4631b(this.f13677g.getContext());
            this.f13679i = bVar;
            bVar.mo18209a(new C4631b.AbstractC4633a() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.number.$$Lambda$a$AyQWy2L91_BJCkUsgPZzERkD9Y */

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.number.C4631b.AbstractC4633a
                public final void onDismiss(boolean z) {
                    C4629a.this.m19237d(z);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        C4631b bVar = this.f13679i;
        if (bVar == null || !bVar.mo18211a()) {
            return false;
        }
        mo17997i();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        this.f13588e.mo17867b(this);
        C4631b bVar = this.f13679i;
        if (bVar != null && bVar.mo18211a()) {
            this.f13679i.mo18210a(false);
        }
        AbstractC4548e eVar = this.f13683m;
        if (eVar != null) {
            eVar.mo17910b(this.f13677g, this);
        }
        this.f13682l = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        if (!TextUtils.isEmpty(this.f13681k)) {
            this.f13677g.setText(new BigDecimal(String.valueOf(this.f13680j.getNumberValue())).toPlainString());
        }
        super.mo17996h();
        this.f13588e.mo17861a(this);
        C10548d.m43697a((View) this.f13677g);
        mo18017l();
        View h = this.f13588e.mo17875h();
        if (h instanceof ViewGroup) {
            this.f13679i.mo18207a((ViewGroup) h, this.f13677g.getText());
        }
        AbstractC4548e eVar = this.f13683m;
        if (eVar != null) {
            eVar.mo17908a(this.f13677g, this);
        }
        this.f13678h = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m19237d(boolean z) {
        m19236c(z);
        if (this.f13586c) {
            mo17997i();
        }
    }

    /* renamed from: a */
    private void m19235a(NumberFormatException numberFormatException) {
        C13479a.m54758a("NumberCellViewHolder", "edit fail, error : " + numberFormatException.getMessage());
        if (TextUtils.equals(numberFormatException.getMessage(), "multiple points")) {
            Toast.showFailureText(this.f13677g.getContext(), (int) R.string.Doc_Block_NotSupportMultiplePoints);
        } else {
            Toast.showFailureText(this.f13677g.getContext(), (int) R.string.Doc_Block_OnlySupportNumber);
        }
    }

    /* renamed from: c */
    private void m19236c(boolean z) {
        EditText editText = this.f13677g;
        if (editText != null && editText.getText() != null) {
            String obj = this.f13677g.getText().toString();
            if (!this.f13678h && !z) {
                String str = this.f13682l;
                if (str != null) {
                    this.f13677g.setText(str);
                } else {
                    this.f13677g.setText(this.f13681k);
                }
            } else if (TextUtils.isEmpty(obj)) {
                m19234a((Double) null, z);
            } else {
                try {
                    m19234a(Double.valueOf(Double.parseDouble(obj)), z);
                    if (!this.f13678h) {
                        this.f13677g.setText(this.f13681k);
                    }
                } catch (NumberFormatException e) {
                    this.f13677g.setText(this.f13681k);
                    m19235a(e);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d
    /* renamed from: a */
    public int mo17990a(Context context) {
        C4631b bVar = this.f13679i;
        if (bVar != null) {
            return bVar.mo18212b() + C13746i.m55721a((Activity) this.f13588e.mo17873f());
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<NumberModel>> aVar) {
        String str;
        super.mo17993a((C4537a) aVar);
        if (!mo18116e()) {
            NumberModel numberModel = (NumberModel) aVar.mo17830a(NumberModel.class);
            this.f13680j = numberModel;
            if (numberModel != null) {
                str = numberModel.getFormatterValue();
            } else {
                str = "";
            }
            if (this.f13586c) {
                this.f13682l = str;
                return;
            }
            this.f13681k = str;
            this.f13677g.setText(str);
        } else if (aVar.mo17835c() != null) {
            ArrayList arrayList = new ArrayList();
            for (NumberModel numberModel2 : aVar.mo17835c()) {
                arrayList.add(numberModel2.getFormatterValue());
            }
            this.f13677g.setText(C13721c.m55645a(arrayList, ","));
        }
    }

    /* renamed from: a */
    private void m19234a(Double d, boolean z) {
        mo18110a(d);
        this.f13684n.clear();
        this.f13684n.put("click_done_btn", String.valueOf(z));
        this.f13588e.mo17864a("number", this.f13684n);
    }

    public C4629a(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar);
        this.f13683m = eVar;
        EditText editText = (EditText) view.findViewById(R.id.num_content);
        this.f13677g = editText;
        C10548d.m43699a(editText);
        this.f13677g.addTextChangedListener(new TextWatcher() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.number.C4629a.C46301 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (C4629a.this.f13586c) {
                    C4629a.this.f13678h = true;
                }
            }
        });
    }
}

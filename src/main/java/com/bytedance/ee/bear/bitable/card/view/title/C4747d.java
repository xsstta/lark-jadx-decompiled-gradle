package com.bytedance.ee.bear.bitable.card.view.title;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.NumberModel;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.number.C4629a;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.title.d */
public class C4747d extends C4629a implements AbstractC4746c {

    /* renamed from: i */
    private String f14005i = "";

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    public /* synthetic */ void a_(boolean z) {
        AbstractC4746c.CC.$default$a_(this, z);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: l */
    public TextView mo18017l() {
        return this.f13677g;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.title.AbstractC4746c
    /* renamed from: a */
    public void mo18492a(String str) {
        this.f14005i = str;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.number.C4629a, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<NumberModel>> aVar) {
        String str;
        NumberModel numberModel = (NumberModel) aVar.mo17830a(NumberModel.class);
        EditText editText = this.f13677g;
        if (numberModel == null) {
            str = this.f14005i;
        } else {
            str = numberModel.getFormatterValue();
        }
        editText.setText(str);
    }

    C4747d(View view, AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar, eVar);
    }
}

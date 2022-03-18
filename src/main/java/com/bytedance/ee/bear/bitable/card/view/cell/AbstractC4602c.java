package com.bytedance.ee.bear.bitable.card.view.cell;

import android.view.View;
import android.widget.EditText;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.c */
public abstract class AbstractC4602c<V> extends AbstractC4597b<V, String> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public abstract View mo17991a();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: b */
    public void mo18113b() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo18112a(boolean z) {
        View a = mo17991a();
        if (a != null) {
            if (a instanceof EditText) {
                ((EditText) a).setCursorVisible(false);
            }
            a.setFocusableInTouchMode(false);
            a.setBackgroundResource(R.drawable.bitable_card_uneditable_field_item_bg);
        }
    }

    public AbstractC4602c(View view, AbstractC4712d dVar) {
        super(view, dVar);
    }
}

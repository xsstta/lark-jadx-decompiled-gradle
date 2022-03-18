package com.bytedance.ee.bear.sheet.panel.panelcell;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;

public class SheetRegulatorView extends SheetListItemView {

    /* renamed from: c */
    private String f30356c;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView
    /* renamed from: a */
    public void mo43227a() {
        super.mo43227a();
        findViewById(R.id.regulator_container).setVisibility(0);
    }

    public SheetRegulatorView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m46888b(SheetItem sheetItem) {
        int i;
        TextView textView = (TextView) findViewById(R.id.regulator_value);
        textView.setText(sheetItem.getValue());
        Resources resources = getResources();
        if (sheetItem.isEnable()) {
            i = R.color.sheet_item_text_normal;
        } else {
            i = R.color.sheet_item_text_disable;
        }
        textView.setTextColor(resources.getColor(i));
    }

    /* renamed from: c */
    private void m46890c(SheetItem sheetItem) {
        boolean z;
        UDButton uDButton = (UDButton) findViewById(R.id.regulator_minus);
        UDButton uDButton2 = (UDButton) findViewById(R.id.regulator_add);
        int currentIndex = sheetItem.getCurrentIndex();
        boolean z2 = false;
        if (!sheetItem.isEnable() || currentIndex < 0 || currentIndex >= sheetItem.valueRange()) {
            uDButton.setEnabled(false);
            uDButton2.setEnabled(false);
        } else {
            if (currentIndex > 0) {
                z = true;
            } else {
                z = false;
            }
            uDButton.setEnabled(z);
            if (currentIndex < sheetItem.valueRange() - 1) {
                z2 = true;
            }
            uDButton2.setEnabled(z2);
        }
        uDButton.setOnClickListener(new View.OnClickListener(sheetItem) {
            /* class com.bytedance.ee.bear.sheet.panel.panelcell.$$Lambda$SheetRegulatorView$y0xXeIIwULx5rKvTKLiCSUzLM */
            public final /* synthetic */ SheetItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                SheetRegulatorView.this.m46889b(this.f$1, view);
            }
        });
        uDButton2.setOnClickListener(new View.OnClickListener(sheetItem) {
            /* class com.bytedance.ee.bear.sheet.panel.panelcell.$$Lambda$SheetRegulatorView$kgOZDOCLKmSMn8RYaDSIeAiQIpo */
            public final /* synthetic */ SheetItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                SheetRegulatorView.this.m46886a((SheetRegulatorView) this.f$1, (SheetItem) view);
            }
        });
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView, com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    /* renamed from: a */
    public void mo43222a(SheetItem sheetItem) {
        super.mo43222a(sheetItem);
        this.f30356c = sheetItem.getId();
        m46888b(sheetItem);
        m46890c(sheetItem);
        this.f30340b.setOnClickListener(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46886a(SheetItem sheetItem, View view) {
        m46887a(sheetItem, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46889b(SheetItem sheetItem, View view) {
        m46887a(sheetItem, false);
    }

    public SheetRegulatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView
    /* renamed from: a */
    public void mo43228a(SheetItem.GroupPosition groupPosition, boolean z) {
        super.mo43228a(groupPosition, false);
    }

    /* renamed from: a */
    private void m46887a(SheetItem sheetItem, boolean z) {
        int currentIndex;
        int i;
        if (this.f30339a != null && (currentIndex = sheetItem.getCurrentIndex()) >= 0 && currentIndex < sheetItem.valueRange()) {
            if (z) {
                i = currentIndex + 1;
            } else {
                i = currentIndex - 1;
            }
            this.f30339a.clickItem(this.f30356c, sheetItem.valueAt(i));
        }
    }

    public SheetRegulatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

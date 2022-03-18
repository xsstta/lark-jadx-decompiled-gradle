package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.larksuite.suite.R;

public class RecordCardSingleSelectView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f13696a;

    /* renamed from: b */
    private SelectTextView f13697b;

    /* renamed from: a */
    private void m19257a() {
        inflate(getContext(), R.layout.bitable_card_singleselect_layout, this);
        this.f13696a = (ImageView) findViewById(R.id.drop_triangle);
        this.f13697b = (SelectTextView) findViewById(R.id.selected_item);
    }

    public RecordCardSingleSelectView(Context context) {
        super(context);
        m19257a();
    }

    public void setDropTriangleSelected(boolean z) {
        this.f13696a.setSelected(z);
    }

    public void setDropTriangleVisibility(int i) {
        this.f13696a.setVisibility(i);
    }

    public void setData(C4530e.C4531a aVar) {
        if (aVar != null) {
            this.f13697b.setData(aVar);
            this.f13697b.setVisibility(0);
            return;
        }
        this.f13697b.setVisibility(8);
    }

    public RecordCardSingleSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19257a();
    }

    public RecordCardSingleSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19257a();
    }
}

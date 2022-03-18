package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.larksuite.suite.R;
import java.util.List;

public class RecordCardMultiSelectView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f13694a;

    /* renamed from: b */
    private MultiSelectViewContainer f13695b;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public RecordCardMultiSelectView(Context context) {
        super(context);
        mo18223a(context);
    }

    public void setDropTriangleSelected(boolean z) {
        this.f13694a.setSelected(z);
    }

    public void setDropTriangleVisibility(int i) {
        this.f13694a.setVisibility(i);
    }

    public void setData(List<C4530e.C4531a> list) {
        this.f13695b.setData(list);
        this.f13695b.setCanSelected(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18223a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.bitable_card_multiselect_layout, this);
        this.f13695b = (MultiSelectViewContainer) findViewById(R.id.record_flow_layout);
        this.f13694a = (ImageView) findViewById(R.id.drop_triangle);
    }

    public RecordCardMultiSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo18223a(context);
    }

    public RecordCardMultiSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo18223a(context);
    }
}

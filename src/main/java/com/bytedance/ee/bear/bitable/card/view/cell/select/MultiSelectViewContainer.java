package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.widgets.FlowLayout;
import com.larksuite.suite.R;
import java.util.List;

public class MultiSelectViewContainer extends SelectViewContainer {

    /* renamed from: a */
    public ViewGroup.MarginLayoutParams f13692a;

    public MultiSelectViewContainer(Context context) {
        super(context);
    }

    public void setChildViewMarginLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f13692a = marginLayoutParams;
    }

    public void setData(List<C4530e.C4531a> list) {
        this.f13700b = new AbstractC4652f<C4530e.C4531a>(list) {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.select.MultiSelectViewContainer.C46341 */

            /* renamed from: a */
            public View mo18222a(FlowLayout flowLayout, int i, C4530e.C4531a aVar) {
                SelectTextView selectTextView = (SelectTextView) LayoutInflater.from(MultiSelectViewContainer.this.getContext()).inflate(R.layout.bitable_card_multiselect_cell_item, (ViewGroup) flowLayout, false);
                if (MultiSelectViewContainer.this.f13692a != null) {
                    selectTextView.setLayoutParams(MultiSelectViewContainer.this.f13692a);
                }
                selectTextView.setData(aVar);
                return selectTextView;
            }
        };
        this.f13700b.mo18289a(this);
        this.f13702d.clear();
        mo18233a();
    }

    public MultiSelectViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MultiSelectViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

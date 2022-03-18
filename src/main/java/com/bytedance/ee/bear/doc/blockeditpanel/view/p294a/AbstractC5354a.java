package com.bytedance.ee.bear.doc.blockeditpanel.view.p294a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a.a */
public abstract class AbstractC5354a extends RecyclerView.ViewHolder {

    /* renamed from: a */
    protected AbstractC5342b f15277a;

    /* renamed from: b */
    protected int f15278b;

    /* renamed from: a */
    public abstract void mo21448a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem);

    /* renamed from: a */
    public void mo21445a(int i) {
        this.f15278b = i;
    }

    /* renamed from: a */
    public void mo21447a(AbstractC5342b bVar) {
        this.f15277a = bVar;
    }

    public AbstractC5354a(View view) {
        super(view);
        view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.AbstractC5354a.C53551 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Object tag = view.getTag();
                if ((tag instanceof BlockEditPanelMenusModel.BlockEditPanelMenuItem) && AbstractC5354a.this.f15277a != null) {
                    AbstractC5354a.this.f15277a.mo21379a((BlockEditPanelMenusModel.BlockEditPanelMenuItem) tag);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21446a(View view) {
        if (this.f15278b > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f15278b;
            view.setLayoutParams(layoutParams);
        }
    }
}

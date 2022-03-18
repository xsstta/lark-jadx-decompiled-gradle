package com.bytedance.ee.bear.doc.blockeditpanel.view.p294a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.view.C5362b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a.d */
public class C5359d extends AbstractC5354a {

    /* renamed from: c */
    ImageView f15281c;

    public C5359d(View view) {
        super(view);
        this.f15281c = (ImageView) view.findViewById(R.id.editPanelMenuItemImg);
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.AbstractC5354a
    /* renamed from: a */
    public void mo21448a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        this.itemView.setTag(blockEditPanelMenuItem);
        mo21446a(this.itemView);
        EMenuItemConfig menuItemConfigById = EMenuItemConfig.getMenuItemConfigById(blockEditPanelMenuItem.getId());
        if (menuItemConfigById != EMenuItemConfig.UNKNOWN) {
            if (menuItemConfigById.imageRes != -1) {
                this.f15281c.setImageResource(menuItemConfigById.imageRes);
            }
            if (menuItemConfigById.bgRes != -1) {
                this.itemView.setBackgroundResource(menuItemConfigById.bgRes);
            }
            C5362b.m21846a(this.f15281c, menuItemConfigById.iconStateColorList);
            C5362b.m21845a(this.itemView, menuItemConfigById.backgroundStateColorList);
            this.itemView.setEnabled(blockEditPanelMenuItem.isEnable());
            this.itemView.setSelected(blockEditPanelMenuItem.isSelected());
        }
    }
}

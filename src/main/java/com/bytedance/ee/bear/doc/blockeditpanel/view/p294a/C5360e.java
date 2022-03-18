package com.bytedance.ee.bear.doc.blockeditpanel.view.p294a;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.view.C5362b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a.e */
public class C5360e extends AbstractC5354a {

    /* renamed from: c */
    private ImageView f15282c;

    public C5360e(View view) {
        super(view);
        this.f15282c = (ImageView) view.findViewById(R.id.iv_text_block_hn);
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.AbstractC5354a
    /* renamed from: a */
    public void mo21448a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        this.itemView.setTag(blockEditPanelMenuItem);
        mo21446a(this.f15282c);
        EMenuItemConfig menuItemConfigById = EMenuItemConfig.getMenuItemConfigById(blockEditPanelMenuItem.getId());
        if (menuItemConfigById.imageRes != -1) {
            this.f15282c.setImageResource(menuItemConfigById.imageRes);
        }
        if (menuItemConfigById.bgRes != -1) {
            this.itemView.setBackgroundResource(menuItemConfigById.bgRes);
        }
        this.itemView.setEnabled(blockEditPanelMenuItem.isEnable());
        this.itemView.setSelected(blockEditPanelMenuItem.isSelected());
        C5362b.m21846a(this.f15282c, menuItemConfigById.iconStateColorList);
        C5362b.m21845a(this.itemView, menuItemConfigById.backgroundStateColorList);
    }
}

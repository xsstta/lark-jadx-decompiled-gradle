package com.bytedance.ee.bear.doc.blockeditpanel.view.p294a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.view.C5362b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a.f */
class C5361f extends AbstractC5354a {

    /* renamed from: c */
    private ImageView f15283c;

    /* renamed from: d */
    private TextView f15284d;

    public C5361f(View view) {
        super(view);
        this.f15283c = (ImageView) view.findViewById(R.id.icon);
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.f15284d = textView;
        textView.setTextColor(view.getResources().getColor(R.color.text_caption));
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.AbstractC5354a
    /* renamed from: a */
    public void mo21448a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        this.itemView.setTag(blockEditPanelMenuItem);
        EMenuItemConfig menuItemConfigById = EMenuItemConfig.getMenuItemConfigById(blockEditPanelMenuItem.getId());
        if (menuItemConfigById != EMenuItemConfig.UNKNOWN) {
            this.f15283c.setImageResource(menuItemConfigById.imageRes);
            this.f15284d.setText(blockEditPanelMenuItem.getText());
            C5362b.m21846a(this.f15283c, menuItemConfigById.iconStateColorList);
            this.f15283c.setEnabled(blockEditPanelMenuItem.isEnable());
            this.f15283c.setSelected(blockEditPanelMenuItem.isSelected());
            EMenuItemConfig.C5344a aVar = menuItemConfigById.textStateColorList;
            if (aVar != null) {
                this.f15284d.setTextColor(C5362b.m21844a(this.itemView.getContext(), aVar));
            }
            this.f15284d.setEnabled(blockEditPanelMenuItem.isEnable());
            this.f15284d.setSelected(blockEditPanelMenuItem.isSelected());
            C5362b.m21845a(this.itemView, menuItemConfigById.backgroundStateColorList);
            if (menuItemConfigById.bgRes != -1) {
                this.itemView.setBackgroundResource(menuItemConfigById.bgRes);
            }
            this.itemView.setEnabled(blockEditPanelMenuItem.isEnable());
            this.itemView.setSelected(blockEditPanelMenuItem.isSelected());
        }
    }
}

package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b;
import com.bytedance.ee.bear.doc.blockeditpanel.view.C5362b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class GroupIconView extends LinearLayout {

    /* renamed from: b */
    private static final int f15337b = C13749l.m55738a(1);

    /* renamed from: a */
    public AbstractC5342b f15338a;

    /* renamed from: c */
    private List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> f15339c;

    /* renamed from: d */
    private List<ImageView> f15340d;

    /* renamed from: e */
    private int f15341e;

    /* renamed from: a */
    private void m21882a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = this.f15341e;
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    private void m21885b() {
        for (BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem : new ArrayList(this.f15339c)) {
            m21884a(blockEditPanelMenuItem);
        }
    }

    public void setOnClickMenuItemListener(AbstractC5342b bVar) {
        this.f15338a = bVar;
    }

    public GroupIconView(Context context) {
        this(context, null);
    }

    public void setIconWidth(int i) {
        this.f15341e = i;
        m21882a();
    }

    public void setMenuItems(List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> list) {
        this.f15339c.clear();
        this.f15339c.addAll(list);
        removeAllViews();
        m21885b();
    }

    /* renamed from: a */
    private void m21884a(final BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        if (!this.f15340d.isEmpty()) {
            List<ImageView> list = this.f15340d;
            ImageView imageView = list.get(list.size() - 1);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.rightMargin = f15337b;
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.doc_block_edit_panel_icon_menu_item, (ViewGroup) this, false);
        if (this.f15341e > 0) {
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = this.f15341e;
            imageView2.setLayoutParams(layoutParams2);
        }
        EMenuItemConfig menuItemConfigById = EMenuItemConfig.getMenuItemConfigById(blockEditPanelMenuItem.getId());
        if (menuItemConfigById != EMenuItemConfig.UNKNOWN) {
            imageView2.setImageResource(menuItemConfigById.imageRes);
            if (menuItemConfigById.bgRes != -1) {
                imageView2.setBackgroundResource(menuItemConfigById.bgRes);
            }
            C5362b.m21846a(imageView2, menuItemConfigById.iconStateColorList);
            C5362b.m21845a((View) imageView2, menuItemConfigById.backgroundStateColorList);
            m21883a(imageView2, blockEditPanelMenuItem);
            imageView2.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.GroupIconView.C53751 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (GroupIconView.this.f15338a != null) {
                        GroupIconView.this.f15338a.mo21379a(blockEditPanelMenuItem);
                    }
                }
            });
            addView(imageView2);
            this.f15340d.add(imageView2);
            this.f15339c.add(blockEditPanelMenuItem);
        }
    }

    public GroupIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m21883a(ImageView imageView, BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        imageView.setSelected(blockEditPanelMenuItem.isSelected());
        imageView.setEnabled(blockEditPanelMenuItem.isEnable());
    }

    public GroupIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15339c = new ArrayList();
        this.f15340d = new ArrayList();
        this.f15341e = 0;
    }
}

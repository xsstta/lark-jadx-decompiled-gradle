package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5341a;
import com.bytedance.ee.bear.doc.blockeditpanel.view.C5362b;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.larksuite.suite.R;

public class HighlightView extends LinearLayout {

    /* renamed from: a */
    private ImageView f15344a;

    /* renamed from: b */
    private ImageView f15345b;

    /* renamed from: c */
    private FrameLayout f15346c;

    /* renamed from: d */
    private AbstractC5341a f15347d;

    public void setOnClickHighlightItemListener(AbstractC5341a aVar) {
        this.f15347d = aVar;
    }

    public HighlightView(Context context) {
        this(context, null);
    }

    public void setIconWidth(int i) {
        ViewGroup.LayoutParams layoutParams = this.f15346c.getLayoutParams();
        layoutParams.width = i;
        this.f15346c.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private int m21887a(Highlight.ColorRgba colorRgba) {
        return Color.argb((int) (colorRgba.getA() * 255.0f), colorRgba.getR(), colorRgba.getG(), colorRgba.getB());
    }

    public void setMenuItem(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
        float f;
        EMenuItemConfig menuItemConfigById = EMenuItemConfig.getMenuItemConfigById(blockEditPanelMenuItem.getId());
        if (menuItemConfigById.imageRes != -1) {
            this.f15344a.setImageResource(menuItemConfigById.imageRes);
        }
        if (menuItemConfigById.bgRes != -1) {
            this.f15346c.setBackgroundResource(menuItemConfigById.bgRes);
        }
        this.f15346c.setEnabled(blockEditPanelMenuItem.isEnable());
        this.f15346c.setSelected(blockEditPanelMenuItem.isSelected());
        this.f15345b.setEnabled(blockEditPanelMenuItem.isEnable());
        this.f15345b.setSelected(blockEditPanelMenuItem.isSelected());
        ImageView imageView = this.f15344a;
        float f2 = 1.0f;
        if (blockEditPanelMenuItem.isEnable()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        imageView.setAlpha(f);
        ImageView imageView2 = this.f15345b;
        if (!blockEditPanelMenuItem.isEnable()) {
            f2 = 0.5f;
        }
        imageView2.setAlpha(f2);
        Highlight.ColorRgba backgroundColor = blockEditPanelMenuItem.getBackgroundColor();
        if (backgroundColor != null) {
            this.f15344a.setBackgroundTintList(ColorStateList.valueOf(m21887a(backgroundColor)));
        }
        Highlight.ColorRgba foregroundColor = blockEditPanelMenuItem.getForegroundColor();
        if (foregroundColor != null) {
            this.f15344a.setImageTintList(ColorStateList.valueOf(m21887a(foregroundColor)));
        }
        C5362b.m21845a(this.f15346c, menuItemConfigById.iconStateColorList);
        C5362b.m21845a((View) this.f15345b, menuItemConfigById.backgroundStateColorList);
        this.f15346c.setOnClickListener(new View.OnClickListener(blockEditPanelMenuItem) {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.$$Lambda$HighlightView$Pz5B9FWc7ASCxTXEPjXxmWX6xCo */
            public final /* synthetic */ BlockEditPanelMenusModel.BlockEditPanelMenuItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                HighlightView.lambda$Pz5B9FWc7ASCxTXEPjXxmWX6xCo(HighlightView.this, this.f$1, view);
            }
        });
        this.f15345b.setOnClickListener(new View.OnClickListener(blockEditPanelMenuItem) {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.$$Lambda$HighlightView$sOmJiwPRhOX3UpFzX25RINkNVv4 */
            public final /* synthetic */ BlockEditPanelMenusModel.BlockEditPanelMenuItem f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                HighlightView.lambda$sOmJiwPRhOX3UpFzX25RINkNVv4(HighlightView.this, this.f$1, view);
            }
        });
    }

    public HighlightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21888a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, View view) {
        AbstractC5341a aVar = this.f15347d;
        if (aVar != null) {
            aVar.mo21378a(blockEditPanelMenuItem, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21889b(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, View view) {
        AbstractC5341a aVar = this.f15347d;
        if (aVar != null) {
            aVar.mo21378a(blockEditPanelMenuItem, false);
        }
    }

    public HighlightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.doc_block_edit_panel_menu_item_highlight, this);
        this.f15344a = (ImageView) findViewById(R.id.iv_text_highlight);
        this.f15345b = (ImageView) findViewById(R.id.iv_arrow);
        this.f15346c = (FrameLayout) findViewById(R.id.fl_text_highlight);
    }
}

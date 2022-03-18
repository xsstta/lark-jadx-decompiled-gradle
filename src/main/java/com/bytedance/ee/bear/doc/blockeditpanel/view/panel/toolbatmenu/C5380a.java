package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemButtonType;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b;
import com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.AbstractC5354a;
import com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.C5356b;
import com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.C5359d;
import com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.C5360e;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.a */
public class C5380a extends RecyclerView.Adapter<AbstractC5354a> {

    /* renamed from: a */
    protected AbstractC5342b f15368a;

    /* renamed from: b */
    private int f15369b;

    /* renamed from: c */
    private List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> f15370c = new ArrayList();

    /* renamed from: a */
    public List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> mo21489a() {
        return this.f15370c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15370c.size();
    }

    /* renamed from: a */
    public void mo21491a(AbstractC5342b bVar) {
        this.f15368a = bVar;
    }

    /* renamed from: a */
    public void mo21490a(int i) {
        this.f15369b = i;
        C13742g.m55705a(new Runnable() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.$$Lambda$Z7wzg9ylGXMeMKwFPsC4wIDCno */

            public final void run() {
                C5380a.this.notifyDataSetChanged();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        String str;
        BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem = this.f15370c.get(i);
        if (blockEditPanelMenuItem == null) {
            str = "";
        } else {
            str = blockEditPanelMenuItem.getButtonType();
        }
        return EMenuItemButtonType.getEMenuItemButtonTypeByName(str).ordinal();
    }

    /* renamed from: a */
    public void mo21493a(List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> list) {
        this.f15370c.clear();
        if (list != null) {
            this.f15370c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC5354a aVar, int i) {
        aVar.mo21445a(this.f15369b);
        aVar.mo21448a(this.f15370c.get(i));
    }

    /* renamed from: a */
    public AbstractC5354a onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC5354a aVar;
        EMenuItemButtonType eMenuItemButtonTypeByOrdinal = EMenuItemButtonType.getEMenuItemButtonTypeByOrdinal(i);
        if (eMenuItemButtonTypeByOrdinal == EMenuItemButtonType.SEPARATOR) {
            aVar = new C5356b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_block_edit_panel_divider_menu_item, viewGroup, false));
        } else if (eMenuItemButtonTypeByOrdinal == EMenuItemButtonType.ICON_WITH_RIGHT_ARROW) {
            aVar = new C5360e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_block_edit_panel_menu_item_hn, viewGroup, false));
        } else {
            aVar = new C5359d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_block_edit_panel_icon_menu_item, viewGroup, false));
        }
        aVar.mo21447a(this.f15368a);
        return aVar;
    }
}

package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;

public class HighlightPanel extends BaseBlockEditPanel {

    /* renamed from: d */
    public Highlight f15315d;

    /* renamed from: e */
    public C6255f f15316e;

    /* renamed from: f */
    public C6255f f15317f;

    /* renamed from: g */
    private View f15318g;

    /* renamed from: h */
    private GridLayoutManager f15319h;

    /* renamed from: i */
    private GridLayoutManager f15320i;

    /* renamed from: j */
    private TextView f15321j;

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    /* renamed from: a */
    private int m21867a(int i) {
        if (i <= 0) {
            return 7;
        }
        return i;
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    /* renamed from: a */
    public void mo21453a(BlockEditPanelMenusModel.BlockEditPanel blockEditPanel) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    public View getContentView() {
        View view = this.f15318g;
        if (view != null) {
            return view;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.new_select_color_fragment, (ViewGroup) null);
        this.f15318g = inflate;
        inflate.findViewById(R.id.title_layout).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f15318g.findViewById(R.id.textColorList);
        RecyclerView recyclerView2 = (RecyclerView) this.f15318g.findViewById(R.id.backColorList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 7);
        this.f15320i = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), 7);
        this.f15319h = gridLayoutManager2;
        recyclerView2.setLayoutManager(gridLayoutManager2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView2.setNestedScrollingEnabled(false);
        int d = UDDimenUtils.m93313d(getContext(), R.dimen.space_kit_len_1);
        final C5373a aVar = new C5373a(getContext());
        aVar.mo21472a(d);
        recyclerView.addItemDecoration(aVar);
        final C5373a aVar2 = new C5373a(getContext());
        aVar2.mo21472a(d);
        recyclerView2.addItemDecoration(aVar2);
        int d2 = UDDimenUtils.m93313d(getContext(), R.dimen.space_kit_len_8);
        C6255f fVar = new C6255f("text", null, null, 7, d2);
        this.f15316e = fVar;
        recyclerView.setAdapter(fVar);
        C6255f fVar2 = new C6255f("background", null, null, 7, d2);
        this.f15317f = fVar2;
        recyclerView2.setAdapter(fVar2);
        this.f15316e.mo25224a(new C6255f.AbstractC6258b() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.$$Lambda$HighlightPanel$7M1prCx1hivMtm7HUa01YWTe9cM */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6258b
            public final void onItemClicked(Highlight.ColorItem colorItem, int i) {
                HighlightPanel.this.m21871b((HighlightPanel) colorItem, (Highlight.ColorItem) i);
            }
        });
        this.f15316e.mo25225a(new C6255f.AbstractC6259c() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.$$Lambda$HighlightPanel$2BeIe4tFUdUmeTj7_HlvV7O6bM */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6259c
            public final void onItemSelected(int i) {
                C5373a.this.mo21473b(i);
            }
        });
        this.f15317f.mo25224a(new C6255f.AbstractC6258b() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.$$Lambda$HighlightPanel$Oy4jD5lmmuFuPKb5a6_SuCW4jdQ */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6258b
            public final void onItemClicked(Highlight.ColorItem colorItem, int i) {
                HighlightPanel.this.m21869a((HighlightPanel) colorItem, (Highlight.ColorItem) i);
            }
        });
        this.f15317f.mo25225a(new C6255f.AbstractC6259c() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.$$Lambda$HighlightPanel$KfmsE8LX4k8kQXr2_A3M1zcNdMw */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6259c
            public final void onItemSelected(int i) {
                C5373a.this.mo21473b(i);
            }
        });
        TextView textView = (TextView) this.f15318g.findViewById(R.id.clearBtn);
        this.f15321j = textView;
        textView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.HighlightPanel.C53721 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (HighlightPanel.this.f15315d != null) {
                    C5373a aVar = aVar;
                    aVar.getClass();
                    aVar.mo21473b(-1);
                    C5373a aVar2 = aVar2;
                    aVar.getClass();
                    aVar2.mo21473b(-1);
                    HighlightPanel.this.f15316e.mo25223a((Highlight.ColorItem) null);
                    HighlightPanel.this.f15317f.mo25223a((Highlight.ColorItem) null);
                    HighlightPanel.this.f15287c.onClickColorMenuItem(null, null, HighlightPanel.this.f15315d.getClear(), HighlightPanel.this.f15315d.getReset());
                }
            }
        });
        C13747j.m55726a(this.f15318g, (int) R.color.bg_body);
        return this.f15318g;
    }

    public HighlightPanel(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m21872b(Highlight highlight) {
        int a = m21867a(highlight.getTextColorSpanCount());
        int a2 = m21867a(highlight.getBackgroundSpanCount());
        this.f15316e.mo25222a(a);
        this.f15317f.mo25222a(a2);
        this.f15320i.mo6500a(a);
        this.f15319h.mo6500a(a2);
    }

    /* renamed from: a */
    public void mo21471a(Highlight highlight) {
        this.f15315d = highlight;
        if (highlight != null) {
            m21872b(highlight);
            Highlight.Selected selected = highlight.getSelected();
            Highlight.ColorItem[] text = highlight.getText();
            Highlight.ColorItem[] background = highlight.getBackground();
            if (selected != null) {
                this.f15316e.mo25227a(text, selected.getText());
                this.f15317f.mo25227a(background, selected.getBackground());
            } else {
                this.f15316e.mo25227a(text, (Highlight.ColorItem) null);
                this.f15317f.mo25227a(background, (Highlight.ColorItem) null);
            }
            if (highlight.getReset() != null) {
                this.f15321j.setText(R.string.CreationMobile_Common_Reset);
            } else {
                this.f15321j.setText(R.string.Doc_Doc_ColorSelectClear);
            }
        }
    }

    public HighlightPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21869a(Highlight.ColorItem colorItem, int i) {
        this.f15317f.mo25223a(colorItem);
        this.f15287c.onClickColorMenuItem(this.f15317f.mo25220a(), null, null, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21871b(Highlight.ColorItem colorItem, int i) {
        this.f15316e.mo25223a(colorItem);
        this.f15287c.onClickColorMenuItem(null, this.f15316e.mo25220a(), null, null);
    }

    public HighlightPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

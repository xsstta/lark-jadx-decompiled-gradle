package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.h */
public class C6262h extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: f */
    static final /* synthetic */ boolean f17379f = true;

    /* renamed from: c */
    public C6265i f17380c;

    /* renamed from: d */
    public C6255f f17381d;

    /* renamed from: e */
    public C6255f f17382e;

    /* renamed from: g */
    private GridLayoutManager f17383g;

    /* renamed from: h */
    private GridLayoutManager f17384h;

    /* renamed from: i */
    private UDButton f17385i;

    /* renamed from: j */
    private Dialog f17386j;

    /* renamed from: k */
    private View f17387k;

    /* renamed from: a */
    private int m25153a(int i) {
        if (i <= 0) {
            return 7;
        }
        return i;
    }

    /* renamed from: g */
    private void m25161g() {
        WindowManager.LayoutParams attributes = this.f17386j.getWindow().getAttributes();
        attributes.height = m25154a(this.f17387k);
        this.f17386j.getWindow().setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public View mo25229f() {
        Highlight.ColorItem colorItem;
        Context context = getContext();
        if (f17379f || context != null) {
            Highlight.ColorItem colorItem2 = null;
            View inflate = LayoutInflater.from(context).inflate(R.layout.new_select_color_fragment, (ViewGroup) null);
            BaseTitleBar baseTitleBar = (BaseTitleBar) inflate.findViewById(R.id.title);
            baseTitleBar.setMainTitleSize(17.0f);
            baseTitleBar.setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h.C62631 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C6262h.this.mo5513b();
                }
            });
            Highlight b = this.f17380c.getHighlightLiveData().mo5927b();
            if (b == null) {
                b = new Highlight();
            }
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.textColorList);
            RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.backColorList);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 7);
            this.f17383g = gridLayoutManager;
            recyclerView.setLayoutManager(gridLayoutManager);
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), 7);
            this.f17384h = gridLayoutManager2;
            recyclerView2.setLayoutManager(gridLayoutManager2);
            inflate.findViewById(R.id.color_panel_layout).setBackgroundResource(R.color.bg_body);
            int d = UDDimenUtils.m93313d(getContext(), R.dimen.space_kit_len_1);
            final C6253e eVar = new C6253e(getContext(), 7);
            eVar.mo25216a(d);
            recyclerView.addItemDecoration(eVar);
            final C6253e eVar2 = new C6253e(getContext(), 7);
            eVar2.mo25216a(d);
            recyclerView2.addItemDecoration(eVar2);
            if (b.getSelected() != null) {
                colorItem = b.getSelected().getText();
            } else {
                colorItem = null;
            }
            int d2 = UDDimenUtils.m93313d(getContext(), R.dimen.space_kit_len_8);
            C6255f fVar = new C6255f("text", b.getText(), colorItem, 7, d2);
            this.f17381d = fVar;
            recyclerView.setAdapter(fVar);
            if (b.getSelected() != null) {
                colorItem2 = b.getSelected().getBackground();
            }
            C6255f fVar2 = new C6255f("background", b.getBackground(), colorItem2, 7, d2);
            this.f17382e = fVar2;
            recyclerView2.setAdapter(fVar2);
            this.f17381d.mo25224a(new C6255f.AbstractC6258b() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$h$ZKdat_RDAnrNQyd6k0me3C3hP6w */

                @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6258b
                public final void onItemClicked(Highlight.ColorItem colorItem, int i) {
                    C6262h.this.m25158b((C6262h) colorItem, (Highlight.ColorItem) i);
                }
            });
            this.f17381d.mo25225a(new C6255f.AbstractC6259c() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$h$7CramG4FaTsWx7Eg_UBBVghjyTg */

                @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6259c
                public final void onItemSelected(int i) {
                    C6253e.this.mo25217b(i);
                }
            });
            this.f17382e.mo25224a(new C6255f.AbstractC6258b() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$h$OnYNyGx0SGi__rJ52jsZuLcnHu4 */

                @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6258b
                public final void onItemClicked(Highlight.ColorItem colorItem, int i) {
                    C6262h.this.m25155a((C6262h) colorItem, (Highlight.ColorItem) i);
                }
            });
            this.f17382e.mo25225a(new C6255f.AbstractC6259c() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$h$ecvQK87eabnYemvuZJuP8YUzYw */

                @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.AbstractC6259c
                public final void onItemSelected(int i) {
                    C6253e.this.mo25217b(i);
                }
            });
            UDButton uDButton = (UDButton) inflate.findViewById(R.id.clearBtn);
            this.f17385i = uDButton;
            uDButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h.C62642 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    Highlight b = C6262h.this.f17380c.getHighlightLiveData().mo5927b();
                    if (b != null) {
                        C6253e eVar = eVar;
                        eVar.getClass();
                        eVar.mo25217b(-1);
                        C6253e eVar2 = eVar2;
                        eVar.getClass();
                        eVar2.mo25217b(-1);
                        C6262h.this.f17381d.mo25223a((Highlight.ColorItem) null);
                        C6262h.this.f17382e.mo25223a((Highlight.ColorItem) null);
                        C6262h.this.f17380c.selectColor(null, null, b.getClear(), b.getReset());
                    }
                }
            });
            this.f17380c.getHighlightLiveData().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.$$Lambda$h$jMdAy7p1RV9cJnwz4EvFeDT5MU */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C6262h.this.m25159b((C6262h) ((Highlight) obj));
                }
            });
            return inflate;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17380c = (C6265i) C4950k.m20474a(this, C6265i.class);
    }

    /* renamed from: a */
    private int m25154a(View view) {
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0) {
            view.measure(0, 0);
            measuredHeight = view.getMeasuredHeight();
        }
        C13479a.m54764b("SelectColorV2Fragment", "contentHeight:" + measuredHeight);
        return measuredHeight;
    }

    /* renamed from: a */
    private void m25156a(Highlight highlight) {
        int a = m25153a(highlight.getTextColorSpanCount());
        int a2 = m25153a(highlight.getBackgroundSpanCount());
        this.f17381d.mo25222a(a);
        this.f17382e.mo25222a(a2);
        this.f17383g.mo6500a(a);
        this.f17384h.mo6500a(a2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25159b(Highlight highlight) {
        if (highlight != null) {
            m25156a(highlight);
            Highlight.Selected selected = highlight.getSelected();
            if (selected != null) {
                this.f17381d.mo25227a(highlight.getText(), selected.getText());
                this.f17382e.mo25227a(highlight.getBackground(), selected.getBackground());
            } else {
                this.f17381d.mo25227a(highlight.getText(), (Highlight.ColorItem) null);
                this.f17382e.mo25227a(highlight.getBackground(), (Highlight.ColorItem) null);
            }
            if (highlight.getReset() != null) {
                this.f17385i.setText(R.string.CreationMobile_Common_Reset);
            } else {
                this.f17385i.setText(R.string.Doc_Doc_ColorSelectClear);
            }
            m25161g();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        this.f17386j = a;
        a.requestWindowFeature(1);
        View f = mo25229f();
        this.f17387k = f;
        ViewGroup viewGroup = (ViewGroup) f.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f17386j.setContentView(this.f17387k);
        if (this.f17386j.getWindow() != null) {
            WindowManager.LayoutParams attributes = this.f17386j.getWindow().getAttributes();
            attributes.type = 1000;
            attributes.width = -1;
            attributes.softInputMode = 1;
            attributes.flags &= -3;
            attributes.flags |= 8;
            attributes.gravity = 80;
            this.f17386j.getWindow().setAttributes(attributes);
            this.f17386j.getWindow().setBackgroundDrawableResource(17170445);
            this.f17386j.setCanceledOnTouchOutside(false);
        }
        return this.f17386j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25155a(Highlight.ColorItem colorItem, int i) {
        this.f17382e.mo25223a(colorItem);
        this.f17380c.selectColor(this.f17382e.mo25220a(), null, null, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25158b(Highlight.ColorItem colorItem, int i) {
        this.f17381d.mo25223a(colorItem);
        this.f17380c.selectColor(null, this.f17381d.mo25220a(), null, null);
    }
}

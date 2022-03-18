package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemButtonType;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5341a;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.Collections;

public class ToolbarMenuPanel extends BaseBlockEditPanel {

    /* renamed from: d */
    public static final int f15348d = C13749l.m55738a(4);

    /* renamed from: e */
    public static final int f15349e = C13749l.m55738a(3);

    /* renamed from: f */
    public static final int f15350f = C13749l.m55738a(1);

    /* renamed from: h */
    private static final int f15351h = C13749l.m55738a(80);

    /* renamed from: i */
    private static final int f15352i = C13749l.m55738a(8);

    /* renamed from: j */
    private static final int f15353j = C13749l.m55738a(48);

    /* renamed from: g */
    public C5380a f15354g;

    /* renamed from: k */
    private LinearLayout f15355k;

    /* renamed from: l */
    private GroupIconView f15356l;

    /* renamed from: m */
    private GroupIconView f15357m;

    /* renamed from: n */
    private GroupIconView f15358n;

    /* renamed from: o */
    private GroupIconView f15359o;

    /* renamed from: p */
    private GroupIconView f15360p;

    /* renamed from: q */
    private HighlightView f15361q;

    /* renamed from: r */
    private AbstractC5342b f15362r;

    /* renamed from: s */
    private AbstractC5341a f15363s;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m21895h() {
        m21890a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m21896i() {
        m21890a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m21897j() {
        m21890a(true);
    }

    /* renamed from: f */
    private LinearLayout.LayoutParams m21893f() {
        return new LinearLayout.LayoutParams(-2, f15353j);
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    /* renamed from: g */
    private LinearLayout m21894g() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = f15352i;
        this.f15355k.addView(linearLayout, layoutParams);
        return linearLayout;
    }

    /* renamed from: e */
    private void m21892e() {
        C53772 r0 = new AbstractC5342b() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53772 */

            @Override // com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b
            /* renamed from: a */
            public void mo21379a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
                ToolbarMenuPanel.this.f15287c.onClickEditMenuItem(blockEditPanelMenuItem);
            }
        };
        this.f15362r = r0;
        this.f15354g.mo21491a(r0);
        this.f15356l.setOnClickMenuItemListener(this.f15362r);
        this.f15357m.setOnClickMenuItemListener(this.f15362r);
        this.f15358n.setOnClickMenuItemListener(this.f15362r);
        this.f15359o.setOnClickMenuItemListener(this.f15362r);
        C53783 r02 = new AbstractC5341a() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53783 */

            @Override // com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5341a
            /* renamed from: a */
            public void mo21378a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem, boolean z) {
                ToolbarMenuPanel.this.f15287c.onClickHighlightItem(blockEditPanelMenuItem, z);
            }
        };
        this.f15363s = r02;
        this.f15361q.setOnClickHighlightItemListener(r02);
        this.f15360p.setOnClickMenuItemListener(this.f15362r);
    }

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel$4 */
    static /* synthetic */ class C53794 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15367a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a = r0
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.TEXT_BLOCK_TRANSFORM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.TEXT_TRANSFORM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.INLINE_CODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.HIGHLIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.INDENT_TRANSFORM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.ALIGN_TRANSFORM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.f15367a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig r1 = com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig.BLOCK_BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53794.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    public View getContentView() {
        if (this.f15355k == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f15355k = linearLayout;
            linearLayout.setOrientation(1);
            RecyclerView recyclerView = new RecyclerView(getContext());
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerView.setHorizontalFadingEdgeEnabled(true);
            recyclerView.setFadingEdgeLength(f15351h);
            C5380a aVar = new C5380a();
            this.f15354g = aVar;
            recyclerView.setAdapter(aVar);
            recyclerView.addItemDecoration(new RecyclerView.AbstractC1335d() {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.ToolbarMenuPanel.C53761 */

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem = ToolbarMenuPanel.this.f15354g.mo21489a().get(childAdapterPosition);
                    rect.top = 0;
                    rect.bottom = 0;
                    if (childAdapterPosition == 0) {
                        rect.left = 0;
                        if (blockEditPanelMenuItem == null || EMenuItemButtonType.HEADING_BUTTON_GROUP.name.equals(blockEditPanelMenuItem.getGroupId())) {
                            rect.right = 0;
                        } else {
                            rect.right = ToolbarMenuPanel.f15349e;
                        }
                    } else if (blockEditPanelMenuItem == null || !EMenuItemButtonType.HEADING_BUTTON_GROUP.name.equals(blockEditPanelMenuItem.getGroupId())) {
                        rect.left = ToolbarMenuPanel.f15348d;
                    } else {
                        rect.left = ToolbarMenuPanel.f15350f;
                    }
                }
            });
            int i = f15352i;
            recyclerView.setPadding(i, 0, i, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, f15353j);
            layoutParams.bottomMargin = i;
            this.f15355k.addView(recyclerView, layoutParams);
            LinearLayout g = m21894g();
            LinearLayout.LayoutParams f = m21893f();
            int i2 = f15348d;
            f.rightMargin = i2;
            f.leftMargin = i;
            GroupIconView groupIconView = new GroupIconView(getContext());
            this.f15356l = groupIconView;
            g.addView(groupIconView, f);
            LinearLayout.LayoutParams f2 = m21893f();
            f2.rightMargin = i2;
            GroupIconView groupIconView2 = new GroupIconView(getContext());
            this.f15357m = groupIconView2;
            g.addView(groupIconView2, f2);
            LinearLayout.LayoutParams f3 = m21893f();
            HighlightView highlightView = new HighlightView(getContext());
            this.f15361q = highlightView;
            g.addView(highlightView, f3);
            this.f15361q.setVisibility(8);
            LinearLayout.LayoutParams f4 = m21893f();
            f4.rightMargin = i2;
            GroupIconView groupIconView3 = new GroupIconView(getContext());
            this.f15360p = groupIconView3;
            g.addView(groupIconView3, f4);
            this.f15360p.setVisibility(8);
            LinearLayout g2 = m21894g();
            LinearLayout.LayoutParams f5 = m21893f();
            f5.rightMargin = i2;
            f5.leftMargin = i;
            GroupIconView groupIconView4 = new GroupIconView(getContext());
            this.f15358n = groupIconView4;
            g2.addView(groupIconView4, f5);
            LinearLayout.LayoutParams f6 = m21893f();
            GroupIconView groupIconView5 = new GroupIconView(getContext());
            this.f15359o = groupIconView5;
            g2.addView(groupIconView5, f6);
        }
        this.f15355k.post(new Runnable() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.$$Lambda$ToolbarMenuPanel$synWoptpY_VCGOus6pMu9wEpff0 */

            public final void run() {
                ToolbarMenuPanel.this.m21897j();
            }
        });
        m21892e();
        C13747j.m55726a(this.f15355k, (int) R.color.bg_float);
        return this.f15355k;
    }

    public ToolbarMenuPanel(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private int m21891b(boolean z) {
        if (z) {
            return C13749l.m55738a(32);
        }
        return 0;
    }

    /* renamed from: a */
    private void m21890a(boolean z) {
        int measuredWidth = ((((getMeasuredWidth() - (C13749l.m55738a(8) * 4)) - (C13749l.m55738a(4) * 2)) - (f15350f * 3)) - m21891b(z)) / 6;
        this.f15354g.mo21490a(measuredWidth);
        this.f15356l.setIconWidth(measuredWidth);
        this.f15359o.setIconWidth(measuredWidth);
        this.f15358n.setIconWidth(measuredWidth);
        this.f15357m.setIconWidth(measuredWidth);
        this.f15361q.setIconWidth(measuredWidth);
        this.f15360p.setIconWidth(measuredWidth);
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    /* renamed from: a */
    public void mo21453a(BlockEditPanelMenusModel.BlockEditPanel blockEditPanel) {
        for (BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem : blockEditPanel.getMenus()) {
            switch (C53794.f15367a[EMenuItemConfig.getMenuItemConfigById(blockEditPanelMenuItem.getId()).ordinal()]) {
                case 1:
                    this.f15354g.mo21493a(blockEditPanelMenuItem.getMembers());
                    break;
                case 2:
                    this.f15356l.setMenuItems(blockEditPanelMenuItem.getMembers());
                    break;
                case 3:
                    this.f15357m.setMenuItems(Collections.singletonList(blockEditPanelMenuItem));
                    break;
                case 4:
                    this.f15361q.setVisibility(0);
                    this.f15361q.setMenuItem(blockEditPanelMenuItem);
                    this.f15355k.post(new Runnable() {
                        /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.$$Lambda$ToolbarMenuPanel$C89jk47X1tGPQ6rp8Xsfrch0k */

                        public final void run() {
                            ToolbarMenuPanel.this.m21896i();
                        }
                    });
                    break;
                case 5:
                    this.f15358n.setMenuItems(blockEditPanelMenuItem.getMembers());
                    break;
                case 6:
                    this.f15359o.setMenuItems(blockEditPanelMenuItem.getMembers());
                    break;
                case 7:
                    this.f15360p.setVisibility(0);
                    this.f15360p.setMenuItems(Collections.singletonList(blockEditPanelMenuItem));
                    this.f15355k.post(new Runnable() {
                        /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.toolbatmenu.$$Lambda$ToolbarMenuPanel$ubtL4_Vu_Hj2DqBaZtJDzqfCk */

                        public final void run() {
                            ToolbarMenuPanel.this.m21895h();
                        }
                    });
                    break;
            }
        }
    }

    public ToolbarMenuPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarMenuPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

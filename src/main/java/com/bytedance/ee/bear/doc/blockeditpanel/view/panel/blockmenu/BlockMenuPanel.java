package com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemButtonType;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b;
import com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.AbstractC5354a;
import com.bytedance.ee.bear.doc.blockeditpanel.view.p294a.C5357c;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel;
import com.bytedance.ee.util.p718t.C13749l;
import java.util.ArrayList;
import java.util.List;

public class BlockMenuPanel extends BaseBlockEditPanel {

    /* renamed from: g */
    public static int f15301g = C13749l.m55738a(1);

    /* renamed from: j */
    private static int f15302j = C13749l.m55738a(8);

    /* renamed from: k */
    private static int f15303k = C13749l.m55738a(4);

    /* renamed from: d */
    public RecyclerView f15304d;

    /* renamed from: e */
    public GridLayoutManager f15305e;

    /* renamed from: f */
    public AbstractC5342b f15306f;

    /* renamed from: h */
    int f15307h;

    /* renamed from: i */
    private C5371a f15308i;

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.BlockMenuPanel$a */
    class C5371a extends RecyclerView.Adapter<AbstractC5354a> {

        /* renamed from: b */
        private List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> f15314b = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f15314b.size();
        }

        C5371a() {
            BlockMenuPanel.this = r1;
        }

        /* renamed from: a */
        public void mo21468a(List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> list) {
            this.f15314b.clear();
            if (list != null) {
                this.f15314b.addAll(list);
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            String str;
            BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem = this.f15314b.get(i);
            if (blockEditPanelMenuItem == null) {
                str = "";
            } else {
                str = blockEditPanelMenuItem.getButtonType();
            }
            return EMenuItemButtonType.getEMenuItemButtonTypeByName(str).ordinal();
        }

        /* renamed from: a */
        public AbstractC5354a onCreateViewHolder(ViewGroup viewGroup, int i) {
            AbstractC5354a a = C5357c.m21839a(viewGroup.getContext(), viewGroup, EMenuItemButtonType.getEMenuItemButtonTypeByOrdinal(i));
            a.mo21447a(BlockMenuPanel.this.f15306f);
            return a;
        }

        /* renamed from: a */
        public void onBindViewHolder(AbstractC5354a aVar, int i) {
            if (i >= 0 && i < this.f15314b.size()) {
                aVar.mo21448a(this.f15314b.get(i));
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m21860e() {
        int childCount;
        if (!(this.f15304d.getAdapter() == null || this.f15304d.getAdapter().getItemCount() <= 4 || this.f15304d.getChildAt(0) == null || (childCount = this.f15304d.getChildCount()) == 0)) {
            int b = this.f15305e.mo6502b();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2 += b) {
                i += this.f15304d.getChildAt(i2).getHeight();
            }
            ValueAnimator ofInt = ObjectAnimator.ofInt(this.f15304d.getHeight(), i + (f15303k * this.f15307h));
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.BlockMenuPanel.C53704 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams = BlockMenuPanel.this.f15304d.getLayoutParams();
                    layoutParams.height = intValue;
                    BlockMenuPanel.this.f15304d.setLayoutParams(layoutParams);
                }
            });
            ofInt.setDuration(200L);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
        }
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    public View getContentView() {
        if (this.f15304d == null) {
            this.f15304d = new RecyclerView(getContext());
            C53671 r0 = new GridLayoutManager(getContext(), 5) {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.BlockMenuPanel.C53671 */

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
                public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                    super.onLayoutChildren(recycler, state);
                    BlockMenuPanel blockMenuPanel = BlockMenuPanel.this;
                    blockMenuPanel.f15307h = blockMenuPanel.f15305e.getRowCountForAccessibility(recycler, state);
                }
            };
            this.f15305e = r0;
            this.f15304d.setLayoutManager(r0);
            this.f15304d.setNestedScrollingEnabled(false);
            C5371a aVar = new C5371a();
            this.f15308i = aVar;
            this.f15304d.setAdapter(aVar);
            this.f15304d.addItemDecoration(new RecyclerView.AbstractC1335d() {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.BlockMenuPanel.C53682 */

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (recyclerView.getChildLayoutPosition(view) % BlockMenuPanel.this.f15305e.mo6502b() != 0) {
                        rect.left = BlockMenuPanel.f15301g;
                    }
                }
            });
            this.f15306f = new AbstractC5342b() {
                /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.BlockMenuPanel.C53693 */

                @Override // com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5342b
                /* renamed from: a */
                public void mo21379a(BlockEditPanelMenusModel.BlockEditPanelMenuItem blockEditPanelMenuItem) {
                    BlockMenuPanel.this.f15287c.onClickEditMenuItem(blockEditPanelMenuItem);
                }
            };
        }
        return this.f15304d;
    }

    public BlockMenuPanel(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m21859a(List<BlockEditPanelMenusModel.BlockEditPanelMenuItem> list) {
        int size = list.size();
        int i = 5;
        if (size <= 5) {
            this.f15305e.mo6500a(size);
            return;
        }
        GridLayoutManager gridLayoutManager = this.f15305e;
        if (size == 6) {
            i = 4;
        }
        gridLayoutManager.mo6500a(i);
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    /* renamed from: a */
    public ViewGroup.LayoutParams mo21451a(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = f15302j;
        layoutParams.rightMargin = f15302j;
        layoutParams.bottomMargin = f15302j;
        return layoutParams;
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel
    /* renamed from: a */
    public void mo21453a(BlockEditPanelMenusModel.BlockEditPanel blockEditPanel) {
        m21859a(blockEditPanel.getMenus());
        this.f15308i.mo21468a(blockEditPanel.getMenus());
        this.f15304d.post(new Runnable() {
            /* class com.bytedance.ee.bear.doc.blockeditpanel.view.panel.blockmenu.$$Lambda$BlockMenuPanel$cHGmkjCSQAlyrd6jr8X6LOX4aM */

            public final void run() {
                BlockMenuPanel.m269167lambda$cHGmkjCSQAlyrd6jr8X6LOX4aM(BlockMenuPanel.this);
            }
        });
    }

    public BlockMenuPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlockMenuPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPadding(0, 0, 0, 0);
    }
}

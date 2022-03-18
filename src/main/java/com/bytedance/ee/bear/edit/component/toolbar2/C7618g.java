package com.bytedance.ee.bear.edit.component.toolbar2;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0774a;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.g */
public class C7618g extends AbstractC7605c {

    /* renamed from: c */
    private AbstractC7621b f20683c;

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.g$b */
    public interface AbstractC7621b {
        void onHighlightItemClick(ItemV2 itemV2, boolean z);
    }

    public C7618g(ItemV2[] itemV2Arr) {
        super(itemV2Arr);
    }

    /* renamed from: a */
    public void mo29985a(AbstractC7621b bVar) {
        this.f20683c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.g$a */
    public static class C7619a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f20684a;

        /* renamed from: b */
        ImageView f20685b;

        /* renamed from: c */
        View f20686c;

        /* renamed from: d */
        View f20687d;

        /* renamed from: e */
        View f20688e;

        C7619a(View view) {
            super(view);
            this.f20684a = (ImageView) view.findViewById(R.id.sub_toolbar_item_icon);
            this.f20685b = (ImageView) view.findViewById(R.id.allow);
            this.f20686c = view.findViewById(R.id.parent);
            this.f20687d = view.findViewById(R.id.selected);
            this.f20688e = view.findViewById(R.id.openPanel);
            this.f20686c.post(new Runnable() {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.C7618g.C7619a.RunnableC76201 */

                public void run() {
                    C7619a.this.f20686c.setTouchDelegate(new TouchDelegate(new Rect(C7619a.this.f20684a.getRight(), C7619a.this.f20684a.getTop(), C7619a.this.f20686c.getRight(), C7619a.this.f20686c.getBottom()), C7619a.this.f20688e));
                }
            });
            this.f20684a.bringToFront();
            this.f20685b.bringToFront();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f20633a == null) {
            return 0;
        }
        ItemV2 itemV2 = this.f20633a[i];
        if (ItemIdV2.ConstId.separator.name().equals(itemV2.getId())) {
            return 1;
        }
        if (ToolbarPrimaryItemId.TextTransformSecondaryItemId.oldHighlight.name().equals(itemV2.id().name())) {
            return 4;
        }
        if (ToolbarPrimaryItemId.TextTransformSecondaryItemId.highlight.name().equals(itemV2.id().name())) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30576a(ItemV2 itemV2, View view) {
        AbstractC7621b bVar = this.f20683c;
        if (bVar != null) {
            bVar.onHighlightItemClick(itemV2, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30579b(ItemV2 itemV2, View view) {
        AbstractC7621b bVar = this.f20683c;
        if (bVar != null) {
            bVar.onHighlightItemClick(itemV2, false);
        }
    }

    /* renamed from: a */
    private int m30575a(Highlight.ColorRgba colorRgba, C7619a aVar) {
        int color = aVar.itemView.getResources().getColor(R.color.space_kit_trans);
        if (colorRgba == null) {
            return color;
        }
        try {
            return Color.argb((int) (colorRgba.getA() * 255.0f), colorRgba.getR(), colorRgba.getG(), colorRgba.getB());
        } catch (Throwable th) {
            C13479a.m54761a("SelectColorV2Plugin", th);
            return color;
        }
    }

    /* renamed from: a */
    private void m30577a(AbstractC7605c.C7609d dVar, ItemV2 itemV2) {
        String value = itemV2.getValue();
        if (TextUtils.isEmpty(value)) {
            C13479a.m54775e("SelectColorV2Plugin", "bind old highlight but value is empty");
            return;
        }
        C13479a.m54764b("SelectColorV2Plugin", "color: " + value);
        dVar.f20636a.setBackgroundColor(mo29934a(value, dVar.itemView.getResources().getColor(R.color.space_kit_n800)));
        dVar.f20637b.setImageResource(R.drawable.ud_icon_style_fontcolor_outlined);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new AbstractC7605c.C7606a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_divider, viewGroup, false));
        }
        if (i == 4) {
            return new AbstractC7605c.C7609d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_text_color, viewGroup, false));
        }
        if (i == 6) {
            return new C7619a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_highlight, viewGroup, false));
        }
        return new AbstractC7605c.C7608c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_horizontal, viewGroup, false));
    }

    /* renamed from: a */
    private void m30578a(C7619a aVar, ItemV2 itemV2) {
        aVar.f20684a.setImageResource(C7622h.m30581a(itemV2.id()));
        String value = itemV2.getValue();
        if (TextUtils.isEmpty(value)) {
            C13479a.m54775e("SelectColorV2Plugin", "bind highlight but value is empty");
            return;
        }
        Highlight.Selected fromJson = Highlight.Selected.fromJson(value);
        C13479a.m54764b("SelectColorV2Plugin", "item is selected " + itemV2.isSelected() + " highlight: =" + fromJson.toString());
        aVar.f20687d.setSelected(itemV2.isSelected());
        aVar.f20686c.setOnClickListener(new View.OnClickListener(itemV2) {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$g$1aZwQMyZhdKAWKk4VSos8rKB1mo */
            public final /* synthetic */ ItemV2 f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7618g.this.m30579b(this.f$1, view);
            }
        });
        aVar.f20688e.setOnClickListener(new View.OnClickListener(itemV2) {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$g$Blt6mYJbwxLhv3v3M1sWPVTZY84 */
            public final /* synthetic */ ItemV2 f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7618g.this.m30576a((C7618g) this.f$1, (ItemV2) view);
            }
        });
        Highlight.ColorItem background = fromJson.getBackground();
        if (background == null) {
            aVar.f20684a.setBackground(null);
        } else {
            int a = m30575a(background.getValue(), aVar);
            Drawable mutate = aVar.f20684a.getResources().getDrawable(R.drawable.doc_toolbar_subitem_bg).mutate();
            C0774a.m3766a(mutate, a);
            aVar.f20684a.setBackground(mutate);
        }
        Highlight.ColorItem text = fromJson.getText();
        if (text == null) {
            aVar.f20684a.setColorFilter(aVar.f20684a.getResources().getColor(R.color.icon_n1));
            return;
        }
        aVar.f20684a.setColorFilter(m30575a(text.getValue(), aVar));
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        Drawable drawable;
        super.onBindViewHolder(viewHolder, i);
        if (!(viewHolder instanceof AbstractC7605c.C7606a) && this.f20633a != null) {
            ItemV2 itemV2 = this.f20633a[i];
            if (ToolbarPrimaryItemId.TextTransformSecondaryItemId.highlight.name().equals(itemV2.getId())) {
                viewHolder.itemView.setOnClickListener(null);
                m30578a((C7619a) viewHolder, itemV2);
            } else if (ToolbarPrimaryItemId.TextTransformSecondaryItemId.oldHighlight.name().equals(itemV2.id().name())) {
                m30577a((AbstractC7605c.C7609d) viewHolder, itemV2);
            } else {
                AbstractC7605c.C7608c cVar = (AbstractC7605c.C7608c) viewHolder;
                cVar.f20635a.setImageTintList(cVar.f20635a.getResources().getColorStateList(R.color.toolbar_item_tint));
                cVar.f20635a.setImageResource(C7622h.m30581a(itemV2.id()));
                ImageView imageView = cVar.f20635a;
                if (!itemV2.isEnable() || !itemV2.isSelected()) {
                    z = false;
                } else {
                    z = true;
                }
                imageView.setSelected(z);
                cVar.f20635a.setEnabled(itemV2.isEnable());
                if (itemV2.isEnable()) {
                    drawable = cVar.f20635a.getResources().getDrawable(R.drawable.doc_toolbar_v2_subitem_all_selector).mutate();
                } else {
                    drawable = null;
                }
                cVar.f20635a.setBackground(drawable);
                cVar.f20635a.setColorFilter((ColorFilter) null);
            }
        }
    }
}

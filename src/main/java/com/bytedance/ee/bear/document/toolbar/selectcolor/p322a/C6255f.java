package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.RectColorView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.f */
public class C6255f extends RecyclerView.Adapter<C6260d> {

    /* renamed from: a */
    public int f17359a;

    /* renamed from: b */
    public AbstractC6258b f17360b;

    /* renamed from: c */
    private final C6257a f17361c;

    /* renamed from: d */
    private String f17362d;

    /* renamed from: e */
    private Highlight.ColorItem[] f17363e;

    /* renamed from: f */
    private Highlight.ColorItem f17364f;

    /* renamed from: g */
    private AbstractC6259c f17365g;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.f$b */
    public interface AbstractC6258b {
        void onItemClicked(Highlight.ColorItem colorItem, int i);
    }

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.f$c */
    public interface AbstractC6259c {
        void onItemSelected(int i);
    }

    /* renamed from: a */
    public Highlight.ColorItem mo25220a() {
        return this.f17364f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Highlight.ColorItem[] colorItemArr = this.f17363e;
        if (colorItemArr == null) {
            return 0;
        }
        return colorItemArr.length;
    }

    /* renamed from: a */
    public void mo25222a(int i) {
        this.f17359a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.f$d */
    public static class C6260d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RectColorView f17377a;

        C6260d(View view) {
            super(view);
            this.f17377a = (RectColorView) view.findViewById(R.id.rectColorView);
        }
    }

    /* renamed from: a */
    public void mo25223a(Highlight.ColorItem colorItem) {
        this.f17364f = colorItem;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    private boolean m25140b(Highlight.ColorItem colorItem) {
        Highlight.ColorItem colorItem2 = this.f17364f;
        if (colorItem2 == null || !TextUtils.equals(colorItem2.getKey(), colorItem.getKey())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.f$a */
    public class C6257a {

        /* renamed from: b */
        private final float[] f17370b;

        /* renamed from: c */
        private final float[] f17371c;

        /* renamed from: d */
        private final float[] f17372d;

        /* renamed from: e */
        private final float[] f17373e;

        /* renamed from: f */
        private final float[] f17374f;

        /* renamed from: g */
        private final float[] f17375g;

        /* renamed from: h */
        private final float[] f17376h = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

        /* renamed from: a */
        public float[] mo25228a(int i) {
            int ceil = (int) Math.ceil((double) ((((float) C6255f.this.getItemCount()) * 1.0f) / ((float) C6255f.this.f17359a)));
            if (ceil == 1) {
                if (i == 0) {
                    return this.f17370b;
                }
                if (C6255f.this.getItemCount() - 1 == i) {
                    return this.f17371c;
                }
                return this.f17376h;
            } else if (i == 0) {
                return this.f17372d;
            } else {
                if (i == C6255f.this.f17359a - 1) {
                    return this.f17373e;
                }
                if ((ceil - 1) * C6255f.this.f17359a == i) {
                    return this.f17375g;
                }
                if (C6255f.this.getItemCount() - 1 == i) {
                    return this.f17374f;
                }
                return this.f17376h;
            }
        }

        public C6257a(int i) {
            float f = (float) i;
            this.f17370b = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
            this.f17371c = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
            this.f17372d = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.f17373e = new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
            this.f17374f = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, 0.0f, 0.0f};
            this.f17375g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        }
    }

    /* renamed from: a */
    public void mo25224a(AbstractC6258b bVar) {
        this.f17360b = bVar;
    }

    /* renamed from: a */
    public void mo25225a(AbstractC6259c cVar) {
        this.f17365g = cVar;
    }

    /* renamed from: a */
    private void m25139a(int i, Highlight.ColorItem colorItem) {
        AbstractC6259c cVar = this.f17365g;
        if (cVar != null) {
            if (this.f17364f == null) {
                cVar.onItemSelected(-1);
            } else if (m25140b(colorItem)) {
                this.f17365g.onItemSelected(i);
            }
        }
    }

    /* renamed from: a */
    public C6260d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6260d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.new_select_color_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C6260d dVar, final int i) {
        final Highlight.ColorItem colorItem = this.f17363e[i];
        dVar.f17377a.mo23731a(this.f17362d, colorItem, this.f17361c.mo25228a(i));
        dVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6255f.C62561 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C6255f.this.f17360b != null) {
                    C6255f.this.f17360b.onItemClicked(colorItem, i);
                }
            }
        });
        m25139a(i, colorItem);
    }

    /* renamed from: a */
    public void mo25227a(Highlight.ColorItem[] colorItemArr, Highlight.ColorItem colorItem) {
        this.f17363e = colorItemArr;
        this.f17364f = colorItem;
        notifyDataSetChanged();
    }

    public C6255f(String str, Highlight.ColorItem[] colorItemArr, Highlight.ColorItem colorItem, int i, int i2) {
        this.f17363e = colorItemArr;
        this.f17362d = str;
        this.f17364f = colorItem;
        this.f17359a = i;
        this.f17361c = new C6257a(i2);
    }
}

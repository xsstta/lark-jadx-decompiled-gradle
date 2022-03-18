package com.bytedance.ee.bear.edit.component.toolbar2;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.c */
public abstract class AbstractC7605c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    protected ItemV2[] f20633a;

    /* renamed from: b */
    public AbstractC7607b f20634b;

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.c$b */
    public interface AbstractC7607b {
        void onItemClicked(ItemV2 itemV2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ItemV2[] itemV2Arr = this.f20633a;
        if (itemV2Arr == null) {
            return 0;
        }
        return itemV2Arr.length;
    }

    /* renamed from: a */
    public ItemV2[] mo29937a() {
        return this.f20633a;
    }

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.c$a */
    protected static class C7606a extends RecyclerView.ViewHolder {
        public C7606a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo29935a(AbstractC7607b bVar) {
        this.f20634b = bVar;
    }

    public AbstractC7605c(ItemV2[] itemV2Arr) {
        this.f20633a = itemV2Arr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29933a(String str) {
        return mo29934a(str, Integer.MIN_VALUE);
    }

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.c$c */
    protected static class C7608c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f20635a;

        public C7608c(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(R.id.sub_toolbar_item_icon);
            this.f20635a = imageView;
            C13747j.m55728a(imageView, (int) R.color.icon_n1);
        }
    }

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.c$d */
    protected static class C7609d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f20636a;

        /* renamed from: b */
        public ImageView f20637b;

        public C7609d(View view) {
            super(view);
            this.f20636a = view.findViewById(R.id.textColorRect);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            this.f20637b = imageView;
            C13747j.m55728a(imageView, (int) R.color.icon_n1);
        }
    }

    /* renamed from: a */
    public void mo29936a(ItemV2[] itemV2Arr) {
        this.f20633a = itemV2Arr;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m30506a(int i, View view) {
        AbstractC7607b bVar = this.f20634b;
        if (bVar != null) {
            bVar.onItemClicked(this.f20633a[i]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ItemV2[] itemV2Arr;
        if (!(viewHolder instanceof C7606a) && (itemV2Arr = this.f20633a) != null && i < itemV2Arr.length) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(i) {
                /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$c$2XiUCdSn9iNggw6OnDae31sT9es */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC7605c.this.m30506a((AbstractC7605c) this.f$1, (int) view);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29934a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return ColorUtils.m55697a(str);
            }
        } catch (Throwable th) {
            C13479a.m54759a("BaseSubToolbarAdapter", "color:" + str, th);
        }
        return i;
    }
}

package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.RoundColorView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.a */
public class C6245a extends RecyclerView.Adapter<C6248b> {

    /* renamed from: a */
    public AbstractC6247a f17326a;

    /* renamed from: b */
    private int f17327b;

    /* renamed from: c */
    private String[] f17328c;

    /* renamed from: d */
    private String f17329d;

    /* renamed from: e */
    private C6250c f17330e;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.a$a */
    public interface AbstractC6247a {
        void onColorSelected(String str);
    }

    /* renamed from: a */
    public int mo25209a() {
        int i = this.f17327b;
        if (i == 0) {
            return R.layout.select_color_item;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        String[] strArr = this.f17328c;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    /* renamed from: a */
    public void mo25211a(AbstractC6247a aVar) {
        this.f17326a = aVar;
    }

    /* renamed from: a */
    public void mo25213a(C6250c cVar) {
        this.f17330e = cVar;
    }

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.a$b */
    public class C6248b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RoundColorView f17333a;

        C6248b(View view) {
            super(view);
            this.f17333a = (RoundColorView) view.findViewById(R.id.color);
        }
    }

    /* renamed from: a */
    public C6248b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6248b(LayoutInflater.from(viewGroup.getContext()).inflate(mo25209a(), (ViewGroup) null));
    }

    /* renamed from: a */
    public void onBindViewHolder(C6248b bVar, int i) {
        final String str = this.f17328c[i];
        boolean equals = TextUtils.equals(str, "#clear");
        if (equals) {
            str = "#ffffff";
        }
        bVar.f17333a.setClear(equals);
        bVar.f17333a.setColor(str);
        bVar.f17333a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6245a.C62461 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C6245a.this.f17326a != null) {
                    C6245a.this.f17326a.onColorSelected(str);
                }
            }
        });
        if (this.f17330e != null && TextUtils.equals(this.f17329d, str)) {
            this.f17330e.mo25215a(bVar.itemView);
        }
    }

    /* renamed from: a */
    public void mo25214a(String[] strArr, String str) {
        this.f17328c = strArr;
        this.f17329d = str;
        C6250c cVar = this.f17330e;
        if (cVar != null) {
            cVar.mo25215a((View) null);
        }
        notifyDataSetChanged();
    }
}

package com.ss.lark.android.passport.biz.widget.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.picker.C65329b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.widget.picker.c */
public class C65340c extends RecyclerView.Adapter<C65343b> {

    /* renamed from: a */
    public List<C65329b.AbstractC65337b> f164533a = new ArrayList();

    /* renamed from: b */
    public AbstractC65342a f164534b;

    /* renamed from: c */
    public int f164535c = -1;

    /* renamed from: d */
    private Context f164536d;

    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.c$a */
    public interface AbstractC65342a {
        /* renamed from: a */
        void mo224746a(int i, C65329b.AbstractC65337b bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f164533a.size();
    }

    /* renamed from: a */
    public void mo224754a(AbstractC65342a aVar) {
        this.f164534b = aVar;
    }

    public C65340c(Context context) {
        this.f164536d = context;
    }

    /* renamed from: a */
    public void mo224756a(List<C65329b.AbstractC65337b> list) {
        if (list != null) {
            this.f164533a.clear();
            this.f164533a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public C65343b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C65343b(LayoutInflater.from(this.f164536d).inflate(R.layout.sigin_sdk_item_picker, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.lark.android.passport.biz.widget.picker.c$b */
    public class C65343b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f164539a;

        /* renamed from: b */
        View f164540b;

        /* renamed from: c */
        ImageView f164541c;

        private C65343b(View view) {
            super(view);
            this.f164539a = (TextView) view.findViewById(R.id.tv_content);
            this.f164540b = view.findViewById(R.id.ll_content);
            this.f164541c = (ImageView) view.findViewById(R.id.iv_check);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C65343b bVar, final int i) {
        bVar.f164539a.setText(this.f164533a.get(i).getContent());
        bVar.f164540b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.picker.C65340c.View$OnClickListenerC653411 */

            public void onClick(View view) {
                if (C65340c.this.f164534b != null) {
                    C65340c.this.f164534b.mo224746a(i, C65340c.this.f164533a.get(i));
                }
                int i = C65340c.this.f164535c;
                C65340c.this.f164535c = i;
                C65340c.this.notifyItemChanged(i);
                C65340c cVar = C65340c.this;
                cVar.notifyItemChanged(cVar.f164535c);
            }
        });
        if (this.f164533a.get(i).getPickDatas() == null && i == this.f164535c) {
            bVar.f164541c.setVisibility(0);
            bVar.f164539a.setSelected(true);
            return;
        }
        bVar.f164541c.setVisibility(4);
        bVar.f164539a.setSelected(false);
    }
}

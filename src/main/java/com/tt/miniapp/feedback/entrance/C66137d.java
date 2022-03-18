package com.tt.miniapp.feedback.entrance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.tt.miniapp.feedback.entrance.vo.FAQItemVO;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.feedback.entrance.d */
public class C66137d extends RecyclerView.Adapter<C66140b> {

    /* renamed from: a */
    public AbstractC66139a f166936a;

    /* renamed from: b */
    private List<FAQItemVO> f166937b = new ArrayList();

    /* renamed from: c */
    private Context f166938c;

    /* renamed from: d */
    private int f166939d = this.f166938c.getResources().getColor(R.color.microapp_m_text_focus);

    /* renamed from: com.tt.miniapp.feedback.entrance.d$a */
    public interface AbstractC66139a {
        /* renamed from: a */
        void mo231337a(View view, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f166937b.size();
    }

    /* renamed from: a */
    public void mo231342a(AbstractC66139a aVar) {
        this.f166936a = aVar;
    }

    /* renamed from: a */
    public void mo231341a(int i) {
        this.f166939d = this.f166938c.getResources().getColor(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.feedback.entrance.d$b */
    public static class C66140b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f166941a;

        /* renamed from: b */
        public View f166942b;

        public C66140b(View view) {
            super(view);
            this.f166941a = (TextView) view.findViewById(R.id.tv_faq_name);
            this.f166942b = view.findViewById(R.id.split_view_bottom);
        }
    }

    public C66137d(Context context) {
        this.f166938c = context;
    }

    /* renamed from: a */
    public void mo231344a(List<FAQItemVO> list) {
        if (list != null) {
            this.f166937b.clear();
            this.f166937b.addAll(list);
        }
    }

    /* renamed from: a */
    public C66140b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C66140b(LayoutInflater.from(this.f166938c).inflate(R.layout.microapp_m_feedback_faq_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C66140b bVar, int i) {
        FAQItemVO fAQItemVO = this.f166937b.get(i);
        if (fAQItemVO != null) {
            bVar.f166941a.setText(fAQItemVO.mo231389b());
            bVar.f166941a.setTextColor(this.f166939d);
            if (i == this.f166937b.size() - 1) {
                bVar.f166942b.setVisibility(4);
            } else {
                bVar.f166942b.setVisibility(0);
            }
            bVar.itemView.setTag(fAQItemVO);
            bVar.itemView.setTag(R.id.microapp_m_item_position, Integer.valueOf(i));
            bVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.tt.miniapp.feedback.entrance.C66137d.View$OnClickListenerC661381 */

                public void onClick(View view) {
                    if (C66137d.this.f166936a != null) {
                        C66137d.this.f166936a.mo231337a(view, ((Integer) view.getTag(R.id.microapp_m_item_position)).intValue());
                    }
                }
            });
        }
    }
}

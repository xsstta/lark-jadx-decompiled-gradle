package com.bytedance.ee.bear.bitable.card.view.form;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.util.C13655e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.form.b */
public class C4716b extends AbstractC4540a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a
    /* renamed from: a */
    public int mo17888a() {
        return R.layout.bitable_form_title_layout;
    }

    /* renamed from: c */
    private boolean m19572c() {
        return this.f13380e.isEmpty();
    }

    /* renamed from: b */
    private boolean m19571b() {
        for (C4537a aVar : this.f13380e) {
            if (aVar.mo17837e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m19572c()) {
            return super.getItemCount() + 3;
        }
        return super.getItemCount() + 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.form.b$a */
    public static class C4717a extends CharacterStyle {

        /* renamed from: a */
        private Context f13933a;

        public C4717a(Context context) {
            this.f13933a = context;
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTextSize((float) C13655e.m55414b(14));
            textPaint.setColor(this.f13933a.getResources().getColor(R.color.function_danger_500));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a
    /* renamed from: a */
    public int mo17889a(int i) {
        boolean z;
        if (m19572c() || i <= 0 || i >= getItemCount() - 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return i - 1;
        }
        return super.mo17889a(i);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return -2;
        }
        if (i == getItemCount() - 2) {
            return -3;
        }
        if (!m19572c() || i != 1) {
            return super.getItemViewType(i);
        }
        return -4;
    }

    /* renamed from: a */
    private void m19570a(View view, C4537a aVar) {
        TextView textView = (TextView) view.findViewById(R.id.form_cell_title_name);
        C4533g a = aVar.mo17829a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a.mo17750h());
        if (a.mo17753j()) {
            spannableStringBuilder.append((CharSequence) "*");
            spannableStringBuilder.setSpan(new C4717a(view.getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z;
        super.onBindViewHolder(viewHolder, i);
        if (viewHolder instanceof AbstractC4609e) {
            m19570a(viewHolder.itemView, (C4537a) this.f13380e.get(mo17889a(i)));
        } else if (viewHolder instanceof C4718c) {
            C4718c cVar = (C4718c) viewHolder;
            if (this.f13379d == null || !this.f13379d.mo17716i()) {
                z = false;
            } else {
                z = true;
            }
            cVar.mo18434a(z);
        } else if (viewHolder instanceof C4722e) {
            C4722e eVar = (C4722e) viewHolder;
            if (this.f13379d != null) {
                str = this.f13379d.mo17705a().mo17775e().mo17795d();
            } else {
                str = "";
            }
            eVar.mo18437a(str);
        } else if (viewHolder instanceof C4719d) {
            ((C4719d) viewHolder).mo18435a(m19571b());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a
    /* renamed from: a */
    public RecyclerView.ViewHolder mo17891a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (i == -2) {
            return new C4722e(layoutInflater.inflate(R.layout.bitable_form_header, viewGroup, false));
        }
        if (i == -3) {
            return new C4719d(layoutInflater.inflate(R.layout.bitable_form_footer, viewGroup, false), this.f13378c);
        }
        if (i == -4) {
            return new C4718c(layoutInflater.inflate(R.layout.bitable_form_empty, viewGroup, false));
        }
        return null;
    }

    public C4716b(C4771b bVar, AbstractC4712d dVar, RecyclerView recyclerView, AbstractC4548e eVar) {
        super(bVar, dVar, recyclerView);
        this.f13377b.mo17909a(eVar);
    }
}

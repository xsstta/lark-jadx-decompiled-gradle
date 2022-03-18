package com.bytedance.ee.bear.quoto;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.quoto.u */
public class C10587u extends RecyclerView.Adapter<C10588a> {

    /* renamed from: a */
    private List<C10597y> f28388a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return C13657b.m55424c(this.f28388a);
    }

    /* renamed from: a */
    public void mo40047a(List<C10597y> list) {
        this.f28388a = list;
        notifyDataSetChanged();
    }

    /* renamed from: com.bytedance.ee.bear.quoto.u$a */
    public static class C10588a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f28389a;

        /* renamed from: b */
        TextView f28390b;

        /* renamed from: c */
        TextView f28391c;

        /* renamed from: d */
        View f28392d;

        public C10588a(View view) {
            super(view);
            this.f28389a = view.findViewById(R.id.suite_content);
            this.f28390b = (TextView) view.findViewById(R.id.tv_suite_size);
            this.f28391c = (TextView) view.findViewById(R.id.tv_suite_type_name);
            this.f28392d = view.findViewById(R.id.divide);
        }
    }

    /* renamed from: a */
    public C10588a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C10588a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.suite_type_item_grid, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C10588a aVar, int i) {
        C10597y yVar = this.f28388a.get(i);
        String a = yVar.mo40057a();
        String b = yVar.mo40058b();
        String c = yVar.mo40059c();
        TextView textView = aVar.f28390b;
        if (TextUtils.isEmpty(b)) {
            b = "";
        }
        textView.setText(b);
        TextView textView2 = aVar.f28391c;
        if (TextUtils.isEmpty(c)) {
            c = "";
        }
        textView2.setText(c);
        Resources resources = aVar.itemView.getContext().getResources();
        if (SuiteTypeVersion.m43882c(a)) {
            aVar.f28389a.setBackgroundTintList(resources.getColorStateList(R.color.primary_pri_50));
            aVar.f28390b.setTextColor(resources.getColor(R.color.primary_pri_700));
            aVar.f28391c.setTextColor(resources.getColor(R.color.primary_pri_700));
            aVar.f28392d.setBackgroundTintList(resources.getColorStateList(R.color.primary_pri_500));
        } else if (SuiteTypeVersion.m43883d(a)) {
            aVar.f28389a.setBackgroundTintList(resources.getColorStateList(R.color.function_success_50));
            aVar.f28390b.setTextColor(resources.getColor(R.color.function_success_700));
            aVar.f28391c.setTextColor(resources.getColor(R.color.function_success_700));
            aVar.f28392d.setBackgroundTintList(resources.getColorStateList(R.color.function_success_500));
        } else {
            aVar.f28389a.setBackgroundTintList(resources.getColorStateList(R.color.ud_neutral_color_2));
            aVar.f28390b.setTextColor(resources.getColor(R.color.text_caption));
            aVar.f28391c.setTextColor(resources.getColor(R.color.text_caption));
            aVar.f28392d.setBackgroundTintList(resources.getColorStateList(R.color.ud_neutral_color_7));
        }
    }
}

package com.ss.android.lark.openplatform.plus;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.ttve.utils.C60275a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.openplatform.plus.b */
public class C48840b extends RecyclerView.Adapter<C48841a> {

    /* renamed from: a */
    private List<String> f122693a;

    /* renamed from: b */
    private int f122694b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f122693a.size();
    }

    /* renamed from: com.ss.android.lark.openplatform.plus.b$a */
    public static class C48841a extends RecyclerView.ViewHolder {
        public C48841a(View view) {
            super(view);
        }
    }

    public C48840b(Context context, List<String> list) {
        this.f122693a = list;
        if (list == null) {
            this.f122693a = new ArrayList();
        }
        this.f122694b = (int) C60275a.m234185a(context, 40.0f);
    }

    /* renamed from: a */
    public C48841a onCreateViewHolder(ViewGroup viewGroup, int i) {
        LKUIRoundedImageView lKUIRoundedImageView = new LKUIRoundedImageView(viewGroup.getContext());
        int i2 = this.f122694b;
        lKUIRoundedImageView.setLayoutParams(new RecyclerView.LayoutParams(i2, i2));
        return new C48841a(lKUIRoundedImageView);
    }

    /* renamed from: a */
    public void onBindViewHolder(C48841a aVar, int i) {
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) aVar.itemView;
        lKUIRoundedImageView.setOval(true);
        lKUIRoundedImageView.setBorderWidthDP(0.5f);
        lKUIRoundedImageView.setBorderColor(C25653b.m91893a(ContextCompat.getColor(lKUIRoundedImageView.getContext(), R.color.lkui_N1000), 0.05f));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lKUIRoundedImageView.getLayoutParams();
        if (i >= 5) {
            marginLayoutParams.topMargin = (int) C60275a.m234185a(lKUIRoundedImageView.getContext(), 5.0f);
        } else {
            marginLayoutParams.topMargin = 0;
        }
        ComponentCallbacks2C2115c.m9151c(lKUIRoundedImageView.getContext()).mo10415a(this.f122693a.get(i)).mo10399a((ImageView) lKUIRoundedImageView);
    }
}

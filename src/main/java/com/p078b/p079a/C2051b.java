package com.p078b.p079a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.b.a.b */
public class C2051b extends RecyclerView.ViewHolder {
    public C2051b(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(layoutInflater.inflate(R.layout.layout_shimmer, viewGroup, false));
        ViewGroup viewGroup2 = (ViewGroup) this.itemView;
        View inflate = layoutInflater.inflate(i, viewGroup2, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        viewGroup2.addView(inflate);
    }
}

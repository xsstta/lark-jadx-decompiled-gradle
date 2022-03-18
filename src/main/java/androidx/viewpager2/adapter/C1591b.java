package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.adapter.b */
public final class C1591b extends RecyclerView.ViewHolder {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public FrameLayout mo8266a() {
        return (FrameLayout) this.itemView;
    }

    private C1591b(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: a */
    static C1591b m7248a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.m4025a());
        frameLayout.setSaveEnabled(false);
        return new C1591b(frameLayout);
    }
}

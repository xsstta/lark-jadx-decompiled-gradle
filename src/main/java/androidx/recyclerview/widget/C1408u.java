package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.u */
public class C1408u {
    /* renamed from: a */
    static int m6453a(RecyclerView.State state, AbstractC1401r rVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(rVar.mo7472f(), rVar.mo7465b(view2) - rVar.mo7461a(view));
    }

    /* renamed from: b */
    static int m6455b(RecyclerView.State state, AbstractC1401r rVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.getItemCount();
        }
        return (int) ((((float) (rVar.mo7465b(view2) - rVar.mo7461a(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) * ((float) state.getItemCount()));
    }

    /* renamed from: a */
    static int m6454a(RecyclerView.State state, AbstractC1401r rVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int i;
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        int max = Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        if (z2) {
            i = Math.max(0, (state.getItemCount() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(rVar.mo7465b(view2) - rVar.mo7461a(view))) / ((float) (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)))) + ((float) (rVar.mo7466c() - rVar.mo7461a(view))));
    }
}

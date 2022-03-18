package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1354c;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class AbstractC1396o<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    final C1356d<T> mDiffer;
    private final C1356d.AbstractC1360a<T> mListener;

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public List<T> getCurrentList() {
        return this.mDiffer.mo7374a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.mo7374a().size();
    }

    public void submitList(List<T> list) {
        this.mDiffer.mo7376a(list);
    }

    public T getItem(int i) {
        return this.mDiffer.mo7374a().get(i);
    }

    protected AbstractC1396o(C1354c<T> cVar) {
        C13971 r0 = new C1356d.AbstractC1360a<T>() {
            /* class androidx.recyclerview.widget.AbstractC1396o.C13971 */

            @Override // androidx.recyclerview.widget.C1356d.AbstractC1360a
            /* renamed from: a */
            public void mo7386a(List<T> list, List<T> list2) {
                AbstractC1396o.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = r0;
        C1356d<T> dVar = new C1356d<>(new C1353b(this), cVar);
        this.mDiffer = dVar;
        dVar.mo7375a(r0);
    }

    protected AbstractC1396o(C1374g.AbstractC1378c<T> cVar) {
        C13971 r0 = new C1356d.AbstractC1360a<T>() {
            /* class androidx.recyclerview.widget.AbstractC1396o.C13971 */

            @Override // androidx.recyclerview.widget.C1356d.AbstractC1360a
            /* renamed from: a */
            public void mo7386a(List<T> list, List<T> list2) {
                AbstractC1396o.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = r0;
        C1356d<T> dVar = new C1356d<>(new C1353b(this), new C1354c.C1355a(cVar).mo7373a());
        this.mDiffer = dVar;
        dVar.mo7375a(r0);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.mo7378a(list, runnable);
    }
}

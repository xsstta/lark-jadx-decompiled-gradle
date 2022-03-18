package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (!this.mSupportsChangeAnimations || viewHolder.isInvalid()) {
            return true;
        }
        return false;
    }

    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
        onChangeStarting(viewHolder, z);
    }

    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
        onChangeFinished(viewHolder, z);
        dispatchAnimationFinished(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2) {
        if (cVar == null || (cVar.f4683a == cVar2.f4683a && cVar.f4684b == cVar2.f4684b)) {
            return animateAdd(viewHolder);
        }
        return animateMove(viewHolder, cVar.f4683a, cVar.f4684b, cVar2.f4683a, cVar2.f4684b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4683a;
        int i4 = cVar.f4684b;
        View view = viewHolder.itemView;
        if (cVar2 == null) {
            i = view.getLeft();
        } else {
            i = cVar2.f4683a;
        }
        if (cVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = cVar2.f4684b;
        }
        if (viewHolder.isRemoved() || (i3 == i && i4 == i2)) {
            return animateRemove(viewHolder);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return animateMove(viewHolder, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2) {
        if (cVar.f4683a != cVar2.f4683a || cVar.f4684b != cVar2.f4684b) {
            return animateMove(viewHolder, cVar.f4683a, cVar.f4684b, cVar2.f4683a, cVar2.f4684b);
        }
        dispatchMoveFinished(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4683a;
        int i4 = cVar.f4684b;
        if (viewHolder2.shouldIgnore()) {
            int i5 = cVar.f4683a;
            i = cVar.f4684b;
            i2 = i5;
        } else {
            i2 = cVar2.f4683a;
            i = cVar2.f4684b;
        }
        return animateChange(viewHolder, viewHolder2, i3, i4, i2, i);
    }
}

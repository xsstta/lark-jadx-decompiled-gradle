package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
public class C1363f extends SimpleItemAnimator {
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<RecyclerView.ViewHolder> mAddAnimations = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mChangeAnimations = new ArrayList<>();
    ArrayList<ArrayList<C1372a>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mMoveAnimations = new ArrayList<>();
    ArrayList<ArrayList<C1373b>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> mPendingAdditions = new ArrayList<>();
    private ArrayList<C1372a> mPendingChanges = new ArrayList<>();
    private ArrayList<C1373b> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> mPendingRemovals = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mRemoveAnimations = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.f$a */
    public static class C1372a {

        /* renamed from: a */
        public RecyclerView.ViewHolder f4848a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f4849b;

        /* renamed from: c */
        public int f4850c;

        /* renamed from: d */
        public int f4851d;

        /* renamed from: e */
        public int f4852e;

        /* renamed from: f */
        public int f4853f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4848a + ", newHolder=" + this.f4849b + ", fromX=" + this.f4850c + ", fromY=" + this.f4851d + ", toX=" + this.f4852e + ", toY=" + this.f4853f + '}';
        }

        private C1372a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f4848a = viewHolder;
            this.f4849b = viewHolder2;
        }

        C1372a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f4850c = i;
            this.f4851d = i2;
            this.f4852e = i3;
            this.f4853f = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (!this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                final ArrayList<C1373b> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                RunnableC13641 r6 = new Runnable() {
                    /* class androidx.recyclerview.widget.C1363f.RunnableC13641 */

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1373b bVar = (C1373b) it.next();
                            C1363f.this.animateMoveImpl(bVar.f4854a, bVar.f4855b, bVar.f4856c, bVar.f4857d, bVar.f4858e);
                        }
                        arrayList.clear();
                        C1363f.this.mMovesList.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.m4047a(arrayList.get(0).f4854a.itemView, r6, getRemoveDuration());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList<C1372a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                RunnableC13652 r62 = new Runnable() {
                    /* class androidx.recyclerview.widget.C1363f.RunnableC13652 */

                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1363f.this.animateChangeImpl((C1372a) it.next());
                        }
                        arrayList2.clear();
                        C1363f.this.mChangesList.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.m4047a(arrayList2.get(0).f4848a.itemView, r62, getRemoveDuration());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                RunnableC13663 r5 = new Runnable() {
                    /* class androidx.recyclerview.widget.C1363f.RunnableC13663 */

                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1363f.this.animateAddImpl((RecyclerView.ViewHolder) it.next());
                        }
                        arrayList3.clear();
                        C1363f.this.mAdditionsList.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = getRemoveDuration();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = getMoveDuration();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = getChangeDuration();
                    }
                    ViewCompat.m4047a(arrayList3.get(0).itemView, r5, j + Math.max(j2, j3));
                    return;
                }
                r5.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1373b bVar = this.mPendingMoves.get(size);
            View view = bVar.f4854a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            dispatchMoveFinished(bVar.f4854a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.mPendingAdditions.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<C1373b> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1373b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f4854a.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(bVar2.f4854a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<C1372a> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    private void endChangeAnimationIfNecessary(C1372a aVar) {
        if (aVar.f4848a != null) {
            endChangeAnimationIfNecessary(aVar, aVar.f4848a);
        }
        if (aVar.f4849b != null) {
            endChangeAnimationIfNecessary(aVar, aVar.f4849b);
        }
    }

    private void resetAnimation(RecyclerView.ViewHolder viewHolder) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
    }

    /* access modifiers changed from: package-private */
    public void cancelAll(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    private void animateRemoveImpl(final RecyclerView.ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
            /* class androidx.recyclerview.widget.C1363f.C13674 */

            public void onAnimationStart(Animator animator) {
                C1363f.this.dispatchRemoveStarting(viewHolder);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C1363f.this.dispatchRemoveFinished(viewHolder);
                C1363f.this.mRemoveAnimations.remove(viewHolder);
                C1363f.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    /* access modifiers changed from: package-private */
    public void animateAddImpl(final RecyclerView.ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {
            /* class androidx.recyclerview.widget.C1363f.C13685 */

            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationStart(Animator animator) {
                C1363f.this.dispatchAddStarting(viewHolder);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C1363f.this.dispatchAddFinished(viewHolder);
                C1363f.this.mAddAnimations.remove(viewHolder);
                C1363f.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    /* access modifiers changed from: package-private */
    public void animateChangeImpl(final C1372a aVar) {
        final View view;
        RecyclerView.ViewHolder viewHolder = aVar.f4848a;
        final View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = aVar.f4849b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(aVar.f4848a);
            duration.translationX((float) (aVar.f4852e - aVar.f4850c));
            duration.translationY((float) (aVar.f4853f - aVar.f4851d));
            duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
                /* class androidx.recyclerview.widget.C1363f.C13707 */

                public void onAnimationStart(Animator animator) {
                    C1363f.this.dispatchChangeStarting(aVar.f4848a, true);
                }

                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    C1363f.this.dispatchChangeFinished(aVar.f4848a, true);
                    C1363f.this.mChangeAnimations.remove(aVar.f4848a);
                    C1363f.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(aVar.f4849b);
            animate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                /* class androidx.recyclerview.widget.C1363f.C13718 */

                public void onAnimationStart(Animator animator) {
                    C1363f.this.dispatchChangeStarting(aVar.f4849b, false);
                }

                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    C1363f.this.dispatchChangeFinished(aVar.f4849b, false);
                    C1363f.this.mChangeAnimations.remove(aVar.f4849b);
                    C1363f.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f4854a == viewHolder) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<C1372a> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1373b> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4854a == viewHolder) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        if (!list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return true;
        }
        return false;
    }

    private void endChangeAnimation(List<C1372a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1372a aVar = list.get(size);
            if (endChangeAnimationIfNecessary(aVar, viewHolder) && aVar.f4848a == null && aVar.f4849b == null) {
                list.remove(aVar);
            }
        }
    }

    private boolean endChangeAnimationIfNecessary(C1372a aVar, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (aVar.f4849b == viewHolder) {
            aVar.f4849b = null;
        } else if (aVar.f4848a != viewHolder) {
            return false;
        } else {
            aVar.f4848a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        viewHolder.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.f$b */
    public static class C1373b {

        /* renamed from: a */
        public RecyclerView.ViewHolder f4854a;

        /* renamed from: b */
        public int f4855b;

        /* renamed from: c */
        public int f4856c;

        /* renamed from: d */
        public int f4857d;

        /* renamed from: e */
        public int f4858e;

        C1373b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f4854a = viewHolder;
            this.f4855b = i;
            this.f4856c = i2;
            this.f4857d = i3;
            this.f4858e = i4;
        }
    }

    /* access modifiers changed from: package-private */
    public void animateMoveImpl(final RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        final View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (i6 != 0) {
            view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() {
            /* class androidx.recyclerview.widget.C1363f.C13696 */

            public void onAnimationStart(Animator animator) {
                C1363f.this.dispatchMoveStarting(viewHolder);
            }

            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                }
                if (i6 != 0) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C1363f.this.dispatchMoveFinished(viewHolder);
                C1363f.this.mMoveAnimations.remove(viewHolder);
                C1363f.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) viewHolder.itemView.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.mPendingMoves.add(new C1373b(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i5));
            viewHolder2.itemView.setTranslationY((float) (-i6));
            viewHolder2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.mPendingChanges.add(new C1372a(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }
}

package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.C0899e;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends RecyclerView.AbstractC1335d implements RecyclerView.AbstractC1336e {
    private int mActionState = 0;
    int mActivePointerId = -1;
    AbstractC1303a mCallback;
    private RecyclerView.AbstractC1333b mChildDrawingOrderCallback = null;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    C0899e mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private C1306b mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    private final RecyclerView.AbstractC1338g mOnItemTouchListener = new RecyclerView.AbstractC1338g() {
        /* class androidx.recyclerview.widget.ItemTouchHelper.C12992 */

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public void mo6561a(boolean z) {
            if (z) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C1307c findAnimation;
            ItemTouchHelper.this.mGestureDetector.mo4687a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                if (ItemTouchHelper.this.mSelected == null && (findAnimation = ItemTouchHelper.this.findAnimation(motionEvent)) != null) {
                    ItemTouchHelper.this.mInitialTouchX -= findAnimation.f4646l;
                    ItemTouchHelper.this.mInitialTouchY -= findAnimation.f4647m;
                    ItemTouchHelper.this.endRecoverAnimation(findAnimation.f4642h, true);
                    if (ItemTouchHelper.this.mPendingCleanup.remove(findAnimation.f4642h.itemView)) {
                        ItemTouchHelper.this.mCallback.mo6591e(ItemTouchHelper.this.mRecyclerView, findAnimation.f4642h);
                    }
                    ItemTouchHelper.this.select(findAnimation.f4642h, findAnimation.f4643i);
                    ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                    itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper.this.mActivePointerId = -1;
                ItemTouchHelper.this.select(null, 0);
            } else if (ItemTouchHelper.this.mActivePointerId != -1 && (findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId)) >= 0) {
                ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
            }
            if (ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mSelected != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: b */
        public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.mo4687a(motionEvent);
            if (ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mActivePointerId != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                if (findPointerIndex >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
                RecyclerView.ViewHolder viewHolder = ItemTouchHelper.this.mSelected;
                if (viewHolder != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == ItemTouchHelper.this.mActivePointerId) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(i);
                                        ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                                        itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, actionIndex);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (ItemTouchHelper.this.mVelocityTracker != null) {
                                ItemTouchHelper.this.mVelocityTracker.clear();
                            }
                        } else if (findPointerIndex >= 0) {
                            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                            itemTouchHelper2.updateDxDy(motionEvent, itemTouchHelper2.mSelectedFlags, findPointerIndex);
                            ItemTouchHelper.this.moveIfNecessary(viewHolder);
                            ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                            ItemTouchHelper.this.mScrollRunnable.run();
                            ItemTouchHelper.this.mRecyclerView.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    ItemTouchHelper.this.select(null, 0);
                    ItemTouchHelper.this.mActivePointerId = -1;
                }
            }
        }
    };
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    final List<View> mPendingCleanup = new ArrayList();
    List<C1307c> mRecoverAnimations = new ArrayList();
    RecyclerView mRecyclerView;
    final Runnable mScrollRunnable = new Runnable() {
        /* class androidx.recyclerview.widget.ItemTouchHelper.RunnableC12981 */

        public void run() {
            if (ItemTouchHelper.this.mSelected != null && ItemTouchHelper.this.scrollIfNecessary()) {
                if (ItemTouchHelper.this.mSelected != null) {
                    ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                    itemTouchHelper.moveIfNecessary(itemTouchHelper.mSelected);
                }
                ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                ViewCompat.m4046a(ItemTouchHelper.this.mRecyclerView, this);
            }
        }
    };
    RecyclerView.ViewHolder mSelected = null;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private final float[] mTmpPosition = new float[2];
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$e */
    public interface AbstractC1310e {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1336e
    public void onChildViewAttachedToWindow(View view) {
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$a */
    public static abstract class AbstractC1303a {

        /* renamed from: a */
        private static final Interpolator f4631a = new Interpolator() {
            /* class androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a.animationInterpolatorC13041 */

            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };

        /* renamed from: b */
        private static final Interpolator f4632b = new Interpolator() {
            /* class androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a.animationInterpolatorC13052 */

            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };

        /* renamed from: c */
        private int f4633c = -1;

        /* renamed from: a */
        public static int m5977a(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: c */
        public static int m5980c(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: a */
        public float mo6567a(float f) {
            return f;
        }

        /* renamed from: a */
        public float mo6568a(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        /* renamed from: a */
        public abstract int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        /* renamed from: a */
        public abstract void mo6575a(RecyclerView.ViewHolder viewHolder, int i);

        /* renamed from: a */
        public boolean mo6577a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo6578a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        /* renamed from: b */
        public float mo6579b(float f) {
            return f;
        }

        /* renamed from: b */
        public float mo6580b(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        /* renamed from: b */
        public boolean mo6585b() {
            return true;
        }

        /* renamed from: b */
        public abstract boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        /* renamed from: c */
        public int mo6587c() {
            return 0;
        }

        /* renamed from: d */
        public int mo6589d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: a */
        public void mo6576a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof AbstractC1310e) {
                ((AbstractC1310e) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        /* renamed from: a */
        private int m5978a(RecyclerView recyclerView) {
            if (this.f4633c == -1) {
                this.f4633c = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f4633c;
        }

        /* renamed from: e */
        public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            C1393l.f4934a.mo7444a(viewHolder.itemView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo6581b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return mo6589d(mo6570a(recyclerView, viewHolder), ViewCompat.m4082h(recyclerView));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6588c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((mo6581b(recyclerView, viewHolder) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6590d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((mo6581b(recyclerView, viewHolder) & 65280) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static int m5979b(int i, int i2) {
            int c = m5980c(0, i2 | i);
            return m5980c(2, i) | m5980c(1, i2) | c;
        }

        /* renamed from: b */
        public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                C1393l.f4934a.mo7446b(viewHolder.itemView);
            }
        }

        /* renamed from: a */
        public long mo6571a(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        /* renamed from: a */
        public RecyclerView.ViewHolder mo6572a(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + viewHolder.itemView.getWidth();
            int height = i2 + viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
            }
            return viewHolder2;
        }

        /* renamed from: a */
        public int mo6569a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * m5978a(recyclerView))) * f4632b.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f4631a.getInterpolation(f));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        /* renamed from: b */
        public void mo6582b(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C1393l.f4934a.mo7445b(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6583b(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<C1307c> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1307c cVar = list.get(i2);
                int save = canvas.save();
                mo6582b(canvas, recyclerView, cVar.f4642h, cVar.f4646l, cVar.f4647m, cVar.f4643i, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                mo6582b(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1307c cVar2 = list.get(i3);
                if (cVar2.f4649o && !cVar2.f4645k) {
                    list.remove(i3);
                } else if (!cVar2.f4649o) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: a */
        public void mo6573a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C1393l.f4934a.mo7443a(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6574a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<C1307c> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1307c cVar = list.get(i2);
                cVar.mo6601c();
                int save = canvas.save();
                mo6573a(canvas, recyclerView, cVar.f4642h, cVar.f4646l, cVar.f4647m, cVar.f4643i, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                mo6573a(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c */
    public static class C1307c implements Animator.AnimatorListener {

        /* renamed from: a */
        private final ValueAnimator f4636a;

        /* renamed from: b */
        private float f4637b;

        /* renamed from: d */
        final float f4638d;

        /* renamed from: e */
        final float f4639e;

        /* renamed from: f */
        final float f4640f;

        /* renamed from: g */
        final float f4641g;

        /* renamed from: h */
        final RecyclerView.ViewHolder f4642h;

        /* renamed from: i */
        final int f4643i;

        /* renamed from: j */
        final int f4644j;

        /* renamed from: k */
        boolean f4645k;

        /* renamed from: l */
        float f4646l;

        /* renamed from: m */
        float f4647m;

        /* renamed from: n */
        boolean f4648n;

        /* renamed from: o */
        boolean f4649o;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: b */
        public void mo6600b() {
            this.f4636a.cancel();
        }

        /* renamed from: a */
        public void mo6597a() {
            this.f4642h.setIsRecyclable(false);
            this.f4636a.start();
        }

        /* renamed from: c */
        public void mo6601c() {
            float f = this.f4638d;
            float f2 = this.f4640f;
            if (f == f2) {
                this.f4646l = this.f4642h.itemView.getTranslationX();
            } else {
                this.f4646l = f + (this.f4637b * (f2 - f));
            }
            float f3 = this.f4639e;
            float f4 = this.f4641g;
            if (f3 == f4) {
                this.f4647m = this.f4642h.itemView.getTranslationY();
            } else {
                this.f4647m = f3 + (this.f4637b * (f4 - f3));
            }
        }

        /* renamed from: a */
        public void mo6598a(float f) {
            this.f4637b = f;
        }

        /* renamed from: a */
        public void mo6599a(long j) {
            this.f4636a.setDuration(j);
        }

        public void onAnimationCancel(Animator animator) {
            mo6598a(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4649o) {
                this.f4642h.setIsRecyclable(true);
            }
            this.f4649o = true;
        }

        C1307c(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4643i = i2;
            this.f4644j = i;
            this.f4642h = viewHolder;
            this.f4638d = f;
            this.f4639e = f2;
            this.f4640f = f3;
            this.f4641g = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f4636a = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class androidx.recyclerview.widget.ItemTouchHelper.C1307c.C13081 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1307c.this.mo6598a(valueAnimator.getAnimatedFraction());
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            mo6598a(BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    private void addChildDrawingOrderCallback() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.mChildDrawingOrderCallback == null) {
                this.mChildDrawingOrderCallback = new RecyclerView.AbstractC1333b() {
                    /* class androidx.recyclerview.widget.ItemTouchHelper.C13025 */

                    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1333b
                    /* renamed from: a */
                    public int mo6566a(int i, int i2) {
                        if (ItemTouchHelper.this.mOverdrawChild == null) {
                            return i2;
                        }
                        int i3 = ItemTouchHelper.this.mOverdrawChildPosition;
                        if (i3 == -1) {
                            i3 = ItemTouchHelper.this.mRecyclerView.indexOfChild(ItemTouchHelper.this.mOverdrawChild);
                            ItemTouchHelper.this.mOverdrawChildPosition = i3;
                        }
                        if (i2 == i - 1) {
                            return i3;
                        }
                        if (i2 < i3) {
                            return i2;
                        }
                        return i2 + 1;
                    }
                };
            }
            this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
        }
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new C1306b();
        this.mGestureDetector = new C0899e(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        C1306b bVar = this.mItemTouchHelperGestureListener;
        if (bVar != null) {
            bVar.mo6594a();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i = 0; i < size; i++) {
            if (!this.mRecoverAnimations.get(i).f4649o) {
                return true;
            }
        }
        return false;
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            this.mCallback.mo6591e(this.mRecyclerView, this.mRecoverAnimations.get(0).f4642h);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean scrollIfNecessary() {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.scrollIfNecessary():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$b */
    public class C1306b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        private boolean f4635b = true;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6594a() {
            this.f4635b = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        C1306b() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            View findChildView;
            RecyclerView.ViewHolder childViewHolder;
            if (this.f4635b && (findChildView = ItemTouchHelper.this.findChildView(motionEvent)) != null && (childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(findChildView)) != null && ItemTouchHelper.this.mCallback.mo6588c(ItemTouchHelper.this.mRecyclerView, childViewHolder) && motionEvent.getPointerId(0) == ItemTouchHelper.this.mActivePointerId) {
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                ItemTouchHelper.this.mInitialTouchX = x;
                ItemTouchHelper.this.mInitialTouchY = y;
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                itemTouchHelper.mDy = BitmapDescriptorFactory.HUE_RED;
                itemTouchHelper.mDx = BitmapDescriptorFactory.HUE_RED;
                if (ItemTouchHelper.this.mCallback.mo6577a()) {
                    ItemTouchHelper.this.select(childViewHolder, 2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    public ItemTouchHelper(AbstractC1303a aVar) {
        this.mCallback = aVar;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                setupCallbacks();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1307c findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            C1307c cVar = this.mRecoverAnimations.get(size);
            if (cVar.f4642h.itemView == findChildView) {
                return cVar;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1336e
    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.ViewHolder viewHolder = this.mSelected;
            if (viewHolder == null || childViewHolder != viewHolder) {
                endRecoverAnimation(childViewHolder, false);
                if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
                    this.mCallback.mo6591e(this.mRecyclerView, childViewHolder);
                    return;
                }
                return;
            }
            select(null, 0);
        }
    }

    public void startDrag(RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.mo6588c(this.mRecyclerView, viewHolder)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = BitmapDescriptorFactory.HUE_RED;
            this.mDx = BitmapDescriptorFactory.HUE_RED;
            select(viewHolder, 2);
        }
    }

    public void startSwipe(RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.mo6590d(this.mRecyclerView, viewHolder)) {
            Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = BitmapDescriptorFactory.HUE_RED;
            this.mDx = BitmapDescriptorFactory.HUE_RED;
            select(viewHolder, 1);
        }
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
        View findChildView;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i = this.mActivePointerId;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.mInitialTouchX);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.mInitialTouchY);
        int i2 = this.mSlop;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (findChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(findChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - ((float) this.mSelected.itemView.getLeft());
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - ((float) this.mSelected.itemView.getTop());
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int a = this.mCallback.mo6570a(this.mRecyclerView, viewHolder);
        int d = (this.mCallback.mo6589d(a, ViewCompat.m4082h(this.mRecyclerView)) & 65280) >> 8;
        if (d == 0) {
            return 0;
        }
        int i = (a & 65280) >> 8;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, d);
            if (checkHorizontalSwipe <= 0) {
                int checkVerticalSwipe = checkVerticalSwipe(viewHolder, d);
                if (checkVerticalSwipe > 0) {
                    return checkVerticalSwipe;
                }
            } else if ((i & checkHorizontalSwipe) == 0) {
                return AbstractC1303a.m5977a(checkHorizontalSwipe, ViewCompat.m4082h(this.mRecyclerView));
            } else {
                return checkHorizontalSwipe;
            }
        } else {
            int checkVerticalSwipe2 = checkVerticalSwipe(viewHolder, d);
            if (checkVerticalSwipe2 > 0) {
                return checkVerticalSwipe2;
            }
            int checkHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, d);
            if (checkHorizontalSwipe2 > 0) {
                if ((i & checkHorizontalSwipe2) == 0) {
                    return AbstractC1303a.m5977a(checkHorizontalSwipe2, ViewCompat.m4082h(this.mRecyclerView));
                }
                return checkHorizontalSwipe2;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View findChildView(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x, y, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            C1307c cVar = this.mRecoverAnimations.get(size);
            View view2 = cVar.f4642h.itemView;
            if (hitTest(view2, x, y, cVar.f4646l, cVar.f4647m)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x, y);
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int c = this.mCallback.mo6587c();
        int round = Math.round(this.mSelectedStartX + this.mDx) - c;
        int round2 = Math.round(this.mSelectedStartY + this.mDy) - c;
        int i = c * 2;
        int width = viewHolder2.itemView.getWidth() + round + i;
        int height = viewHolder2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.mo6578a(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int abs = Math.abs(i2 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.mSwapTargets.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > this.mDistances.get(i6).intValue()) {
                        i7++;
                        i6++;
                    }
                    this.mSwapTargets.add(i7, childViewHolder);
                    this.mDistances.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    /* access modifiers changed from: package-private */
    public void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float b = this.mCallback.mo6580b(viewHolder);
            int i = (int) (this.mSelectedStartX + this.mDx);
            int i2 = (int) (this.mSelectedStartY + this.mDy);
            if (((float) Math.abs(i2 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * b || ((float) Math.abs(i - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * b) {
                List<RecyclerView.ViewHolder> findSwapTargets = findSwapTargets(viewHolder);
                if (findSwapTargets.size() != 0) {
                    RecyclerView.ViewHolder a = this.mCallback.mo6572a(viewHolder, findSwapTargets, i, i2);
                    if (a == null) {
                        this.mSwapTargets.clear();
                        this.mDistances.clear();
                        return;
                    }
                    int adapterPosition = a.getAdapterPosition();
                    int adapterPosition2 = viewHolder.getAdapterPosition();
                    if (this.mCallback.mo6586b(this.mRecyclerView, viewHolder, a)) {
                        this.mCallback.mo6576a(this.mRecyclerView, viewHolder, adapterPosition2, a, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d */
    public static abstract class AbstractC1309d extends AbstractC1303a {

        /* renamed from: a */
        private int f4651a;

        /* renamed from: b */
        private int f4652b;

        /* renamed from: f */
        public int mo6606f(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.f4651a;
        }

        /* renamed from: g */
        public int mo6607g(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.f4652b;
        }

        public AbstractC1309d(int i, int i2) {
            this.f4651a = i2;
            this.f4652b = i;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
        /* renamed from: a */
        public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return m5979b(mo6607g(recyclerView, viewHolder), mo6606f(recyclerView, viewHolder));
        }
    }

    /* access modifiers changed from: package-private */
    public void postDispatchSwipe(final C1307c cVar, final int i) {
        this.mRecyclerView.post(new Runnable() {
            /* class androidx.recyclerview.widget.ItemTouchHelper.RunnableC13014 */

            public void run() {
                if (ItemTouchHelper.this.mRecyclerView != null && ItemTouchHelper.this.mRecyclerView.isAttachedToWindow() && !cVar.f4648n && cVar.f4642h.getAdapterPosition() != -1) {
                    RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                        ItemTouchHelper.this.mCallback.mo6575a(cVar.f4642h, i);
                    } else {
                        ItemTouchHelper.this.mRecyclerView.post(this);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            C1307c cVar = this.mRecoverAnimations.get(size);
            if (cVar.f4642h == viewHolder) {
                cVar.f4648n |= z;
                if (!cVar.f4649o) {
                    cVar.mo6600b();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        if (this.mDx > BitmapDescriptorFactory.HUE_RED) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.mo6579b(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (xVelocity <= BitmapDescriptorFactory.HUE_RED) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.mCallback.mo6567a(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = ((float) this.mRecyclerView.getWidth()) * this.mCallback.mo6568a(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.mDx) <= width) {
            return 0;
        }
        return i2;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        if (this.mDy > BitmapDescriptorFactory.HUE_RED) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.mo6579b(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (yVelocity <= BitmapDescriptorFactory.HUE_RED) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.mCallback.mo6567a(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = ((float) this.mRecyclerView.getHeight()) * this.mCallback.mo6568a(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.mDy) <= height) {
            return 0;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void select(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.select(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.mCallback.mo6574a(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.mCallback.mo6583b(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    /* access modifiers changed from: package-private */
    public void updateDxDy(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.mInitialTouchX;
        this.mDx = f;
        this.mDy = y - this.mInitialTouchY;
        if ((i & 4) == 0) {
            this.mDx = Math.max((float) BitmapDescriptorFactory.HUE_RED, f);
        }
        if ((i & 8) == 0) {
            this.mDx = Math.min((float) BitmapDescriptorFactory.HUE_RED, this.mDx);
        }
        if ((i & 1) == 0) {
            this.mDy = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.mDy);
        }
        if ((i & 2) == 0) {
            this.mDy = Math.min((float) BitmapDescriptorFactory.HUE_RED, this.mDy);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkSelectForSwipe(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.ViewHolder findSwipedView;
        int b;
        if (this.mSelected == null && i == 2 && this.mActionState != 2 && this.mCallback.mo6585b() && this.mRecyclerView.getScrollState() != 1 && (findSwipedView = findSwipedView(motionEvent)) != null && (b = (this.mCallback.mo6581b(this.mRecyclerView, findSwipedView) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f = x - this.mInitialTouchX;
            float f2 = y - this.mInitialTouchY;
            float abs = Math.abs(f);
            float abs2 = Math.abs(f2);
            int i3 = this.mSlop;
            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                if (abs > abs2) {
                    if (f < BitmapDescriptorFactory.HUE_RED && (b & 4) == 0) {
                        return;
                    }
                    if (f > BitmapDescriptorFactory.HUE_RED && (b & 8) == 0) {
                        return;
                    }
                } else if (f2 < BitmapDescriptorFactory.HUE_RED && (b & 1) == 0) {
                    return;
                } else {
                    if (f2 > BitmapDescriptorFactory.HUE_RED && (b & 2) == 0) {
                        return;
                    }
                }
                this.mDy = BitmapDescriptorFactory.HUE_RED;
                this.mDx = BitmapDescriptorFactory.HUE_RED;
                this.mActivePointerId = motionEvent.getPointerId(0);
                select(findSwipedView, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    private static boolean hitTest(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}

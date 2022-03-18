package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class ChildHelper {
    final Bucket mBucket = new Bucket();
    final AbstractC1295a mCallback;
    final List<View> mHiddenViews = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ChildHelper$a */
    public interface AbstractC1295a {
        /* renamed from: a */
        int mo6487a();

        /* renamed from: a */
        int mo6488a(View view);

        /* renamed from: a */
        void mo6489a(int i);

        /* renamed from: a */
        void mo6490a(View view, int i);

        /* renamed from: a */
        void mo6491a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        View mo6492b(int i);

        /* renamed from: b */
        RecyclerView.ViewHolder mo6493b(View view);

        /* renamed from: b */
        void mo6494b();

        /* renamed from: c */
        void mo6495c(int i);

        /* renamed from: c */
        void mo6496c(View view);

        /* renamed from: d */
        void mo6497d(View view);
    }

    /* access modifiers changed from: package-private */
    public static class Bucket {
        long mData;
        Bucket mNext;

        Bucket() {
        }

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        /* access modifiers changed from: package-private */
        public void reset() {
            this.mData = 0;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }

        /* access modifiers changed from: package-private */
        public void clear(int i) {
            if (i >= 64) {
                Bucket bucket = this.mNext;
                if (bucket != null) {
                    bucket.clear(i - 64);
                    return;
                }
                return;
            }
            this.mData &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        public boolean get(int i) {
            if (i >= 64) {
                ensureNext();
                return this.mNext.get(i - 64);
            } else if ((this.mData & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void set(int i) {
            if (i >= 64) {
                ensureNext();
                this.mNext.set(i - 64);
                return;
            }
            this.mData |= 1 << i;
        }

        /* access modifiers changed from: package-private */
        public int countOnesBefore(int i) {
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.mData & ((1 << i) - 1));
            } else {
                return bucket.countOnesBefore(i - 64) + Long.bitCount(this.mData);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean remove(int i) {
            boolean z;
            if (i >= 64) {
                ensureNext();
                return this.mNext.remove(i - 64);
            }
            long j = 1 << i;
            long j2 = this.mData;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.mData = j3;
            long j4 = j - 1;
            this.mData = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void insert(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                ensureNext();
                this.mNext.insert(i - 64, z);
                return;
            }
            long j = this.mData;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.mData = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                set(i);
            } else {
                clear(i);
            }
            if (z2 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int getUnfilteredChildCount() {
        return this.mCallback.mo6487a();
    }

    /* access modifiers changed from: package-private */
    public int getChildCount() {
        return this.mCallback.mo6487a() - this.mHiddenViews.size();
    }

    /* access modifiers changed from: package-private */
    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.mo6497d(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.mo6494b();
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    /* access modifiers changed from: package-private */
    public View getUnfilteredChildAt(int i) {
        return this.mCallback.mo6492b(i);
    }

    /* access modifiers changed from: package-private */
    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.mo6496c(view);
    }

    /* access modifiers changed from: package-private */
    public void detachViewFromParent(int i) {
        int offset = getOffset(i);
        this.mBucket.remove(offset);
        this.mCallback.mo6495c(offset);
    }

    /* access modifiers changed from: package-private */
    public View getChildAt(int i) {
        return this.mCallback.mo6492b(getOffset(i));
    }

    ChildHelper(AbstractC1295a aVar) {
        this.mCallback = aVar;
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.mo6497d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public int indexOfChild(View view) {
        int a = this.mCallback.mo6488a(view);
        if (a != -1 && !this.mBucket.get(a)) {
            return a - this.mBucket.countOnesBefore(a);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void removeView(View view) {
        int a = this.mCallback.mo6488a(view);
        if (a >= 0) {
            if (this.mBucket.remove(a)) {
                unhideViewInternal(view);
            }
            this.mCallback.mo6489a(a);
        }
    }

    /* access modifiers changed from: package-private */
    public void removeViewAt(int i) {
        int offset = getOffset(i);
        View b = this.mCallback.mo6492b(offset);
        if (b != null) {
            if (this.mBucket.remove(offset)) {
                unhideViewInternal(b);
            }
            this.mCallback.mo6489a(offset);
        }
    }

    private int getOffset(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.mCallback.mo6487a();
        int i2 = i;
        while (i2 < a) {
            int countOnesBefore = i - (i2 - this.mBucket.countOnesBefore(i2));
            if (countOnesBefore == 0) {
                while (this.mBucket.get(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += countOnesBefore;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public View findHiddenNonRemovedView(int i) {
        int size = this.mHiddenViews.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.mHiddenViews.get(i2);
            RecyclerView.ViewHolder b = this.mCallback.mo6493b(view);
            if (!(b.getLayoutPosition() != i || b.isInvalid() || b.isRemoved())) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void hide(View view) {
        int a = this.mCallback.mo6488a(view);
        if (a >= 0) {
            this.mBucket.set(a);
            hideViewInternal(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public boolean removeViewIfHidden(View view) {
        int a = this.mCallback.mo6488a(view);
        if (a == -1) {
            unhideViewInternal(view);
            return true;
        } else if (!this.mBucket.get(a)) {
            return false;
        } else {
            this.mBucket.remove(a);
            unhideViewInternal(view);
            this.mCallback.mo6489a(a);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void unhide(View view) {
        int a = this.mCallback.mo6488a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.mBucket.get(a)) {
            this.mBucket.clear(a);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* access modifiers changed from: package-private */
    public void addView(View view, boolean z) {
        addView(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public void addView(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.mCallback.mo6487a();
        } else {
            i2 = getOffset(i);
        }
        this.mBucket.insert(i2, z);
        if (z) {
            hideViewInternal(view);
        }
        this.mCallback.mo6490a(view, i2);
    }

    /* access modifiers changed from: package-private */
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.mCallback.mo6487a();
        } else {
            i2 = getOffset(i);
        }
        this.mBucket.insert(i2, z);
        if (z) {
            hideViewInternal(view);
        }
        this.mCallback.mo6491a(view, i2, layoutParams);
    }
}

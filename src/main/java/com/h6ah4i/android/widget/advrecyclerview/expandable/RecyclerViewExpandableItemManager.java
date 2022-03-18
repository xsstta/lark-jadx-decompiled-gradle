package com.h6ah4i.android.widget.advrecyclerview.expandable;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23305d;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23307f;

public class RecyclerViewExpandableItemManager {

    /* renamed from: a */
    private SavedState f57347a;

    /* renamed from: b */
    private RecyclerView f57348b;

    /* renamed from: c */
    private C23273f f57349c;

    /* renamed from: d */
    private RecyclerView.AbstractC1338g f57350d = new RecyclerView.AbstractC1338g() {
        /* class com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager.C232641 */

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public void mo6561a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: b */
        public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
        /* renamed from: a */
        public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
            return RecyclerViewExpandableItemManager.this.mo80694a(recyclerView, motionEvent);
        }
    };

    /* renamed from: e */
    private AbstractC23267b f57351e;

    /* renamed from: f */
    private AbstractC23266a f57352f;

    /* renamed from: g */
    private long f57353g = -1;

    /* renamed from: h */
    private int f57354h;

    /* renamed from: i */
    private int f57355i;

    /* renamed from: j */
    private int f57356j;

    /* renamed from: k */
    private boolean f57357k;

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager$a */
    public interface AbstractC23266a {
        /* renamed from: a */
        void mo80711a(int i, boolean z, Object obj);
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager$b */
    public interface AbstractC23267b {
        /* renamed from: a */
        void mo80712a(int i, boolean z, Object obj);
    }

    /* renamed from: b */
    public boolean mo80697b() {
        return this.f57357k;
    }

    /* renamed from: a */
    public boolean mo80691a() {
        if (this.f57350d == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo80702d(int i) {
        this.f57349c.mo80758a(i, (Object) null);
    }

    /* renamed from: e */
    public void mo80703e(int i) {
        mo80689a(i, this.f57357k);
    }

    /* renamed from: f */
    public void mo80704f(int i) {
        this.f57349c.mo80766b(i);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager.SavedState.C232651 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        final long[] f57359a;

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f57359a = parcel.createLongArray();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLongArray(this.f57359a);
        }
    }

    /* renamed from: c */
    public boolean mo80701c(int i) {
        C23273f fVar = this.f57349c;
        if (fVar == null || !fVar.mo80763a(i)) {
            return false;
        }
        return true;
    }

    public RecyclerViewExpandableItemManager(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f57347a = (SavedState) parcelable;
        }
    }

    /* renamed from: b */
    public boolean mo80698b(int i) {
        return mo80699b(i, (Object) null);
    }

    /* renamed from: a */
    public RecyclerView.Adapter mo80686a(RecyclerView.Adapter adapter) {
        long[] jArr;
        if (!adapter.hasStableIds()) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        } else if (this.f57349c == null) {
            SavedState savedState = this.f57347a;
            if (savedState != null) {
                jArr = savedState.f57359a;
            } else {
                jArr = null;
            }
            this.f57347a = null;
            C23273f fVar = new C23273f(this, adapter, jArr);
            this.f57349c = fVar;
            fVar.mo80762a(this.f57351e);
            this.f57351e = null;
            this.f57349c.mo80761a(this.f57352f);
            this.f57352f = null;
            return this.f57349c;
        } else {
            throw new IllegalStateException("already have a wrapped adapter");
        }
    }

    /* renamed from: a */
    public void mo80690a(RecyclerView recyclerView) {
        if (mo80691a()) {
            throw new IllegalStateException("Accessing released object");
        } else if (this.f57348b == null) {
            this.f57348b = recyclerView;
            recyclerView.addOnItemTouchListener(this.f57350d);
            this.f57354h = ViewConfiguration.get(this.f57348b.getContext()).getScaledTouchSlop();
        } else {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
    }

    /* renamed from: a */
    public boolean mo80692a(int i) {
        return mo80693a(i, (Object) null);
    }

    /* renamed from: a */
    public void mo80687a(int i, int i2) {
        this.f57349c.mo80768b(i, i2, (Object) null);
    }

    /* renamed from: b */
    public void mo80695b(int i, int i2) {
        this.f57349c.mo80772d(i, i2);
    }

    /* renamed from: c */
    public void mo80700c(int i, int i2) {
        this.f57349c.mo80773e(i, i2);
    }

    /* renamed from: a */
    public void mo80689a(int i, boolean z) {
        this.f57349c.mo80759a(i, z);
    }

    /* renamed from: b */
    private void m84363b(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.ViewHolder a = C23305d.m84658a(recyclerView, motionEvent.getX(), motionEvent.getY());
        this.f57355i = (int) (motionEvent.getX() + 0.5f);
        this.f57356j = (int) (motionEvent.getY() + 0.5f);
        if (a instanceof AbstractC23271d) {
            this.f57353g = a.getItemId();
        } else {
            this.f57353g = -1;
        }
    }

    /* renamed from: b */
    public boolean mo80699b(int i, Object obj) {
        C23273f fVar = this.f57349c;
        if (fVar == null || !fVar.mo80764a(i, false, obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m84364c(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.ViewHolder a;
        int a2;
        long j = this.f57353g;
        int i = this.f57355i;
        int i2 = this.f57356j;
        this.f57353g = -1;
        this.f57355i = 0;
        this.f57356j = 0;
        if (j == -1 || motionEvent.getActionMasked() != 1 || this.f57348b.isComputingLayout()) {
            return false;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        int i3 = y - i2;
        if (Math.abs(x - i) >= this.f57354h || Math.abs(i3) >= this.f57354h || (a = C23305d.m84658a(recyclerView, motionEvent.getX(), motionEvent.getY())) == null || a.getItemId() != j || (a2 = C23307f.m84664a(this.f57348b.getAdapter(), this.f57349c, C23305d.m84655a(a))) == -1) {
            return false;
        }
        View view = a.itemView;
        int left = view.getLeft();
        return this.f57349c.mo80770b(a, a2, x - (left + ((int) (view.getTranslationX() + 0.5f))), y - (view.getTop() + ((int) (view.getTranslationY() + 0.5f))));
    }

    /* renamed from: a */
    public boolean mo80693a(int i, Object obj) {
        C23273f fVar = this.f57349c;
        if (fVar == null || !fVar.mo80769b(i, false, obj)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo80694a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f57349c == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m84363b(recyclerView, motionEvent);
        } else if ((actionMasked == 1 || actionMasked == 3) && m84364c(recyclerView, motionEvent)) {
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void mo80688a(int i, int i2, int i3) {
        this.f57349c.mo80767b(i, i2, i3);
    }

    /* renamed from: b */
    public void mo80696b(int i, int i2, int i3) {
        this.f57349c.mo80771c(i, i2, i3);
    }
}

package com.ss.android.lark.mail.impl.home.threadlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.framwork.core.monitor.C14124a;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a;

public class MailFeedRecyclerView extends HeaderFooterRecyclerView {

    /* renamed from: a */
    C44032c f108383a;

    /* renamed from: b */
    public boolean f108384b;

    /* renamed from: c */
    public boolean f108385c;

    /* renamed from: h */
    private RecyclerView.OnScrollListener f108386h;

    /* renamed from: i */
    private int f108387i;

    /* renamed from: j */
    private int f108388j;

    /* renamed from: k */
    private boolean f108389k;

    /* renamed from: l */
    private int f108390l;

    /* renamed from: m */
    private AbstractC42591a f108391m;

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView$a */
    public interface AbstractC42591a {
        /* renamed from: a */
        boolean mo153094a(int i, int i2, int i3, int i4, int[] iArr, int i5);

        /* renamed from: a */
        boolean mo153095a(int i, int i2, int[] iArr, int[] iArr2, int i3);
    }

    public AbstractC42591a getNestScrollListener() {
        return this.f108391m;
    }

    public C44032c getmRecyclerViewSwipeManager() {
        return this.f108383a;
    }

    /* renamed from: b */
    public void mo153087b() {
        C44032c cVar = this.f108383a;
        if (cVar != null) {
            cVar.mo156679c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        mo153086a();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    public void mo153088c() {
        this.f108385c = true;
        postDelayed(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView.RunnableC425901 */

            public void run() {
                MailFeedRecyclerView.this.f108385c = false;
            }
        }, 200);
    }

    /* renamed from: a */
    public void mo153086a() {
        RecyclerView.OnScrollListener onScrollListener = this.f108386h;
        if (onScrollListener != null) {
            removeOnScrollListener(onScrollListener);
            this.f108386h = null;
        }
        if (this.f108384b) {
            C14124a.m57148a();
            this.f108384b = false;
        }
    }

    /* renamed from: e */
    private void m169878e() {
        this.f108390l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        C44032c cVar = new C44032c();
        this.f108383a = cVar;
        cVar.mo156672b(this.f108390l * 40);
        this.f108383a.mo156662a(800);
    }

    public void setNestScrollListener(AbstractC42591a aVar) {
        this.f108391m = aVar;
    }

    public MailFeedRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f108385c || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof AbstractC44040g) {
            RecyclerView.Adapter a = this.f108383a.mo156661a(new C42592b(this, adapter));
            this.f108383a.mo156665a(this);
            setWrappedAdapter(a);
            return;
        }
        super.setAdapter(adapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r2 = 1
            if (r0 == r2) goto L_0x0018
            r2 = 2
            if (r0 == r2) goto L_0x0011
            r2 = 3
            if (r0 == r2) goto L_0x0018
            goto L_0x002f
        L_0x0011:
            r4.getRawX()
            r4.getRawY()
            goto L_0x002f
        L_0x0018:
            r3.f108389k = r1
            goto L_0x002f
        L_0x001b:
            r3.f108389k = r1
            float r0 = r4.getRawX()
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r3.f108387i = r0
            float r0 = r4.getRawY()
            float r0 = r0 + r1
            int r0 = (int) r0
            r3.f108388j = r0
        L_0x002f:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView$b */
    public static class C42592b extends HeaderFooterRecyclerView.C43987c implements AbstractC44040g {

        /* renamed from: a */
        AbstractC44040g f108393a;

        public C42592b(HeaderFooterRecyclerView headerFooterRecyclerView, RecyclerView.Adapter adapter) {
            super(headerFooterRecyclerView, adapter);
            setHasStableIds(adapter.hasStableIds());
            this.f108393a = (AbstractC44040g) adapter;
        }

        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
        /* renamed from: a */
        public void mo153097a(RecyclerView.ViewHolder viewHolder, int i) {
            int a = mo156547a(i);
            if (a >= 0) {
                this.f108393a.mo153097a(viewHolder, a);
            }
        }

        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
        /* renamed from: b */
        public AbstractC44022a mo153099b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            int a = mo156547a(i);
            if (a < 0) {
                return null;
            }
            return this.f108393a.mo153099b(viewHolder, a, i2);
        }

        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
        /* renamed from: a */
        public void mo153098a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            int a = mo156547a(i);
            if (a >= 0) {
                this.f108393a.mo153098a(viewHolder, a, i2);
            }
        }

        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
        /* renamed from: a */
        public int mo153096a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
            int a = mo156547a(i);
            if (a < 0) {
                return 0;
            }
            return this.f108393a.mo153096a(viewHolder, a, i2, i3);
        }
    }

    public MailFeedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MailFeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m169878e();
    }

    @Override // androidx.core.view.NestedScrollingChild2, androidx.recyclerview.widget.RecyclerView
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean z;
        AbstractC42591a aVar = this.f108391m;
        if (aVar != null) {
            z = aVar.mo153095a(i, i2, iArr, iArr2, i3);
        } else {
            z = false;
        }
        if (z || super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3)) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingChild2, androidx.recyclerview.widget.RecyclerView
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        boolean z;
        AbstractC42591a aVar = this.f108391m;
        if (aVar != null) {
            z = aVar.mo153094a(i, i2, i3, i4, iArr, i5);
        } else {
            z = false;
        }
        if (z || super.dispatchNestedScroll(i, i2, i3, i4, iArr, i5)) {
            return true;
        }
        return false;
    }
}

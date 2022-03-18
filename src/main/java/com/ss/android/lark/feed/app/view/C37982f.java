package com.ss.android.lark.feed.app.view;

import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23279c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23280d;
import com.ss.android.lark.feed.app.entity.UIFeedCard;

/* renamed from: com.ss.android.lark.feed.app.view.f */
public class C37982f extends FeedListAdapter implements AbstractC23297g<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public UIFeedCard f97514a;

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: a */
    public int mo80756a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        return 0;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: a */
    public void mo80760a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: e */
    public void mo80774e(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* renamed from: com.ss.android.lark.feed.app.view.f$a */
    public class C37983a extends C23279c {

        /* renamed from: b */
        private C37982f f97516b;

        /* renamed from: c */
        private int f97517c;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: e */
        public void mo80781e() {
            super.mo80781e();
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: f */
        public void mo80782f() {
            super.mo80782f();
            this.f97516b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard uIFeedCard = (UIFeedCard) this.f97516b.getItem(this.f97517c);
            if (C37982f.this.f97514a != null) {
                C37982f.this.f97514a.setSwipedLeftPinned(false);
                this.f97516b.notifyItemChanged(C37982f.this.f97514a);
            }
            C37982f.this.f97514a = uIFeedCard;
            uIFeedCard.setSwipedLeftPinned(true);
            this.f97516b.notifyItemChanged(uIFeedCard);
        }

        public C37983a(C37982f fVar, int i) {
            this.f97516b = fVar;
            this.f97517c = i;
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.view.f$b */
    private class C37984b extends C23280d {

        /* renamed from: b */
        private C37982f f97519b;

        /* renamed from: c */
        private int f97520c;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: e */
        public void mo80781e() {
            super.mo80781e();
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: f */
        public void mo80782f() {
            super.mo80782f();
            this.f97519b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard uIFeedCard = (UIFeedCard) this.f97519b.getItem(this.f97520c);
            uIFeedCard.setSwipedLeftPinned(false);
            this.f97519b.notifyItemChanged(uIFeedCard);
        }

        public C37984b(C37982f fVar, int i) {
            this.f97519b = fVar;
            this.f97520c = i;
        }
    }

    /* renamed from: j */
    public void mo137349j() {
        UIFeedCard uIFeedCard = this.f97514a;
        if (uIFeedCard != null) {
            uIFeedCard.setSwipedLeftPinned(false);
            notifyItemChanged(this.f97514a);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: b */
    public AbstractC23277a mo80765b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        if (i2 == 2) {
            return new C37983a(this, i);
        }
        if (i2 != 4) {
            return null;
        }
        return new C37984b(this, i);
    }
}

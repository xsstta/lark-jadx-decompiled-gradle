package com.ss.android.lark.feed.app.conversationbox;

import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23279c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23280d;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.view.FeedListAdapter;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.b */
public class C37431b extends FeedListAdapter implements AbstractC23297g<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public UIFeedCard f96030a;

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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.view.FeedListAdapter
    /* renamed from: i */
    public AbstractC37628k mo137348i() {
        return this;
    }

    /* renamed from: com.ss.android.lark.feed.app.conversationbox.b$a */
    public class C37432a extends C23279c {

        /* renamed from: b */
        private C37431b f96032b;

        /* renamed from: c */
        private int f96033c;

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
            this.f96032b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard uIFeedCard = (UIFeedCard) this.f96032b.getItem(this.f96033c);
            if (C37431b.this.f96030a != null) {
                C37431b.this.f96030a.setSwipedLeftPinned(false);
                this.f96032b.notifyItemChanged(C37431b.this.f96030a);
            }
            C37431b.this.f96030a = uIFeedCard;
            uIFeedCard.setSwipedLeftPinned(true);
            this.f96032b.notifyItemChanged(uIFeedCard);
        }

        public C37432a(C37431b bVar, int i) {
            this.f96032b = bVar;
            this.f96033c = i;
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.conversationbox.b$b */
    private class C37433b extends C23280d {

        /* renamed from: b */
        private C37431b f96035b;

        /* renamed from: c */
        private int f96036c;

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
            this.f96035b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard uIFeedCard = (UIFeedCard) this.f96035b.getItem(this.f96036c);
            uIFeedCard.setSwipedLeftPinned(false);
            this.f96035b.notifyItemChanged(uIFeedCard);
        }

        public C37433b(C37431b bVar, int i) {
            this.f96035b = bVar;
            this.f96036c = i;
        }
    }

    /* renamed from: j */
    public void mo137349j() {
        UIFeedCard uIFeedCard = this.f96030a;
        if (uIFeedCard != null) {
            uIFeedCard.setSwipedLeftPinned(false);
            notifyItemChanged(this.f96030a);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: b */
    public AbstractC23277a mo80765b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        if (i2 == 2) {
            return new C37432a(this, i);
        }
        if (i2 != 4) {
            return null;
        }
        return new C37433b(this, i);
    }
}

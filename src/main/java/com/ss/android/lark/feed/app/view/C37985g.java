package com.ss.android.lark.feed.app.view;

import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23282f;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23279c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23280d;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23283g;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26256ah;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.C37284a;
import com.ss.android.lark.feed.app.entity.ExtraHeaderPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.ShortCutPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.shortcut.AbstractC37804b;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.p1873d.C38077b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.C58996h;

/* renamed from: com.ss.android.lark.feed.app.view.g */
public class C37985g extends FeedListAdapter implements AbstractC23297g<RecyclerView.ViewHolder>, AbstractC37804b {

    /* renamed from: a */
    C37284a.AbstractC37287b f97521a = new C37284a.AbstractC37287b() {
        /* class com.ss.android.lark.feed.app.view.C37985g.C379861 */

        @Override // com.ss.android.lark.feed.app.C37284a.AbstractC37287b
        /* renamed from: a */
        public void mo137114a(C1374g.C1377b bVar, UpdateRecord updateRecord) {
            C37985g.this.items = updateRecord.mo138376c();
            C37985g.this.f97298n.mo137382a(updateRecord);
            C37985g.this.mo139055p();
            bVar.mo7412a(C37985g.this);
            C37985g.this.f97298n.mo137383b(updateRecord);
        }
    };

    /* renamed from: b */
    public int f97522b = 0;

    /* renamed from: r */
    protected UIFeedCard f97523r;

    /* renamed from: s */
    private int f97524s;

    /* renamed from: t */
    private int f97525t;

    /* renamed from: u */
    private AbstractC37989b f97526u;

    /* renamed from: v */
    private AbstractC37990c f97527v;

    /* renamed from: w */
    private AbstractC37988a f97528w;

    /* renamed from: x */
    private boolean f97529x;

    /* renamed from: y */
    private boolean f97530y = true;

    /* renamed from: z */
    private C38077b f97531z;

    /* renamed from: com.ss.android.lark.feed.app.view.g$a */
    public interface AbstractC37988a {
        /* renamed from: a */
        void mo137499a();

        /* renamed from: a */
        void mo137500a(C37968c cVar, UIFeedCard uIFeedCard, boolean z, boolean z2);

        /* renamed from: b */
        void mo137501b();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$b */
    public interface AbstractC37989b {
        /* renamed from: b */
        void mo139058b(View view, UIFeedCard uIFeedCard);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$c */
    public interface AbstractC37990c {
        /* renamed from: a */
        void mo139047a(UIFeedCard uIFeedCard, int i);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$e */
    public class C37992e extends C23279c {

        /* renamed from: b */
        private C37985g f97537b;

        /* renamed from: c */
        private int f97538c;

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
            this.f97537b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard c = this.f97537b.getItem(this.f97538c);
            if (C37985g.this.f97523r != null) {
                C37985g.this.f97523r.setSwipedLeftPinned(false);
                this.f97537b.notifyItemChanged(C37985g.this.f97523r);
            }
            C37985g.this.f97523r = c;
            c.setSwipedLeftPinned(true);
            this.f97537b.notifyItemChanged(c);
        }

        public C37992e(C37985g gVar, int i) {
            this.f97537b = gVar;
            this.f97538c = i;
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$h */
    private class C37995h extends C23280d {

        /* renamed from: b */
        private C37985g f97546b;

        /* renamed from: c */
        private int f97547c;

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
            this.f97546b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard c = this.f97546b.getItem(this.f97547c);
            c.setSwipedLeftPinned(false);
            c.setSwipeRightPinned(false);
            this.f97546b.notifyItemChanged(c);
        }

        public C37995h(C37985g gVar, int i) {
            this.f97546b = gVar;
            this.f97547c = i;
        }
    }

    @Override // com.ss.android.lark.feed.app.shortcut.AbstractC37804b
    public AbstractC37989b aC_() {
        return this.f97526u;
    }

    @Override // com.ss.android.lark.feed.app.shortcut.AbstractC37804b
    /* renamed from: j */
    public AbstractC37990c mo137349j() {
        return this.f97527v;
    }

    /* renamed from: q */
    public AbstractC37988a mo139056q() {
        return this.f97528w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public int getItemCount() {
        return this.items.size();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$g */
    private class C37994g extends C23283g {

        /* renamed from: b */
        private final RecyclerView.ViewHolder f97543b;

        /* renamed from: c */
        private final int f97544c;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: e */
        public void mo80781e() {
            super.mo80781e();
            RecyclerView.ViewHolder viewHolder = this.f97543b;
            if (viewHolder instanceof C37968c) {
                ((C37968c) viewHolder).mo139032d(true);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            UIFeedCard c = C37985g.this.getItem(this.f97544c);
            if (C37985g.this.f97523r != null) {
                C37985g.this.f97523r.setSwipedLeftPinned(false);
            }
            C37985g.this.f97523r = c;
            FeedHitPointNew.m148858b(FeedHitPointNew.FeedMainClickParam.FEED_RIGHTSLIDE);
            c.setSwipeRightPinned(true);
        }

        C37994g(RecyclerView.ViewHolder viewHolder, int i) {
            this.f97543b = viewHolder;
            this.f97544c = i;
        }
    }

    /* renamed from: s */
    private void m149402s() {
        if (this.f97529x) {
            this.f97529x = false;
            AbstractC37988a aVar = this.f97528w;
            if (aVar != null) {
                aVar.mo137499a();
            }
        }
    }

    public C37985g() {
        this.f97291g.mo137109a(this.f97521a);
        setHasStableIds(true);
    }

    /* renamed from: r */
    public void mo139057r() {
        UIFeedCard uIFeedCard = this.f97523r;
        if (uIFeedCard != null) {
            uIFeedCard.setSwipedLeftPinned(false);
            this.f97523r.setSwipeRightPinned(false);
            notifyItemChanged(this.f97523r);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$f */
    private class C37993f extends AbstractC23282f {

        /* renamed from: b */
        private final RecyclerView.ViewHolder f97540b;

        /* renamed from: c */
        private final UIFeedCard f97541c;

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a
        /* renamed from: d */
        public void mo80780d() {
            super.mo80780d();
            if ((this.f97540b instanceof C37968c) && (this.f97541c instanceof FeedPreview)) {
                C37985g.this.mo138041h().mo138950a((C37968c) this.f97540b, (FeedPreview) this.f97541c, false);
                ((C37968c) this.f97540b).mo139032d(false);
            }
        }

        public C37993f(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard) {
            this.f97540b = viewHolder;
            this.f97541c = uIFeedCard;
        }
    }

    /* renamed from: p */
    public void mo139055p() {
        this.f97525t = 0;
        this.f97524s = 0;
        for (UIFeedCard uIFeedCard : this.items) {
            if (uIFeedCard instanceof ExtraHeaderPreview) {
                this.f97525t++;
            } else if (uIFeedCard instanceof ShortCutPreview) {
                this.f97525t++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo139049a(AbstractC37988a aVar) {
        this.f97528w = aVar;
    }

    /* renamed from: a */
    public void mo139050a(AbstractC37989b bVar) {
        this.f97526u = bVar;
    }

    /* renamed from: a */
    private boolean m149401a(UIFeedCard uIFeedCard) {
        if (uIFeedCard.getType() != FeedCard.Type.BOX) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.app.view.FeedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f97289e.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.feed.app.view.C37985g.C379872 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C37985g.this.f97522b = i;
            }
        });
    }

    /* renamed from: c */
    public UIFeedCard getItem(int i) {
        if (i >= getItemCount()) {
            return null;
        }
        return (UIFeedCard) this.items.get(i);
    }

    @Override // com.ss.android.lark.feed.app.view.FeedListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        String id = ((UIFeedCard) this.items.get(i)).getId();
        long a = C26256ah.m95012a(((UIFeedCard) this.items.get(i)).getId(), -1);
        if (a == -1) {
            return (long) id.hashCode();
        }
        return a;
    }

    @Override // com.ss.android.lark.feed.app.view.FeedListAdapter
    /* renamed from: a */
    public void mo138927a(UpdateRecord updateRecord) {
        super.mo138927a(updateRecord);
        mo139055p();
        C38077b bVar = this.f97531z;
        if (bVar != null) {
            bVar.mo139374a();
        }
    }

    /* renamed from: a */
    public void mo139051a(AbstractC37990c cVar) {
        this.f97527v = cVar;
    }

    /* renamed from: a */
    public void mo139052a(C38077b bVar) {
        this.f97531z = bVar;
    }

    /* renamed from: a */
    public void mo139053a(boolean z) {
        this.f97530y = z;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: e */
    public void mo80774e(RecyclerView.ViewHolder viewHolder, int i) {
        this.f97529x = true;
    }

    /* renamed from: com.ss.android.lark.feed.app.view.g$d */
    public static abstract class AbstractC37991d implements AbstractC37989b {

        /* renamed from: a */
        private long f97534a;

        /* renamed from: b */
        private long f97535b = 500;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo139046a(View view, UIFeedCard uIFeedCard);

        @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37989b
        /* renamed from: b */
        public void mo139058b(View view, UIFeedCard uIFeedCard) {
            if (SystemClock.uptimeMillis() - this.f97534a < this.f97535b) {
                Log.m165389i("ClickThrottle", "click had been throttle");
                return;
            }
            this.f97534a = SystemClock.uptimeMillis();
            mo139046a(view, uIFeedCard);
        }
    }

    @Override // com.ss.android.lark.feed.app.view.FeedListAdapter
    /* renamed from: a */
    public void mo138925a(int i, int i2) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f97289e.getLayoutManager();
        int i3 = this.f97524s;
        int i4 = this.f97525t + i3;
        if (i3 == 0) {
            linearLayoutManager.scrollToPositionWithOffset(i, i2);
        } else if (i3 <= 0) {
        } else {
            if (i == i4) {
                linearLayoutManager.scrollToPositionWithOffset(i, i2);
            } else {
                linearLayoutManager.scrollToPositionWithOffset(i, UIUtils.dp2px(this.f97287c, 34.0f));
            }
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: a */
    public void mo80760a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        if ((viewHolder instanceof C37968c) && i2 == 3) {
            ((C37968c) viewHolder).f97476a.setBehindViewsForSwipeRight(8, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED);
            m149402s();
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: b */
    public AbstractC23277a mo80765b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        if (i2 == 1) {
            AbstractC37988a aVar = this.f97528w;
            if (aVar != null) {
                aVar.mo137501b();
            }
            mo139057r();
            return null;
        } else if (i2 != 2) {
            if (i2 != 4) {
                return null;
            }
            UIFeedCard c = getItem(i);
            if (c.isSwipedLeftPinned()) {
                return new C37995h(this, i);
            }
            if (c.isSwipeRightPinned()) {
                return new C37993f(viewHolder, c);
            }
            return new C37994g(viewHolder, i);
        } else if (((C37968c) viewHolder).mo139038m()) {
            return new C37995h(this, i);
        } else {
            return new C37992e(this, i);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23297g
    /* renamed from: a */
    public int mo80756a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        if (this.f97530y && (viewHolder instanceof C37968c) && m149401a(getItem(i))) {
            C37968c cVar = (C37968c) viewHolder;
            if (C58996h.m228976a(cVar.mo80851k(), i2, i3) && cVar.mo139037l()) {
                if (getItem(i).equals(this.f97523r)) {
                    return 8194;
                }
                mo139057r();
                this.f97523r = null;
                return 8194;
            }
        }
        return 0;
    }
}

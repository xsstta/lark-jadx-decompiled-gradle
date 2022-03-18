package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.C23252d;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.ShortCutPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.shortcut.AbstractC37804b;
import com.ss.android.lark.feed.app.shortcut.C37805c;
import com.ss.android.lark.feed.app.shortcut.C37807e;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.app.shortcut.ShortcutViewHolder;
import com.ss.android.lark.feed.app.view.C37985g;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.app.view.ShortCutRecyclerView;
import com.ss.android.lark.feed.app.view.ShortcutFeedItemView;
import com.ss.android.lark.feed.dto.ShortcutBtnPreView;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.p2965b.C58981b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.binder.m */
public class C37416m implements AbstractC37406i<ShortCutPreview, ShortcutViewHolder, AbstractC37804b> {

    /* renamed from: a */
    Context f95995a = C37268c.m146766b().mo139170a();

    /* renamed from: b */
    C37807e f95996b;

    /* renamed from: c */
    boolean f95997c = false;

    /* renamed from: d */
    C37805c f95998d;

    /* renamed from: e */
    public ShortCutPreview f95999e;

    /* renamed from: f */
    private boolean f96000f;

    /* renamed from: g */
    private C37420a f96001g;

    /* renamed from: a */
    public void mo137312a(boolean z) {
        this.f96000f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.binder.m$a */
    public class C37420a implements C58981b.AbstractC58982a {

        /* renamed from: a */
        C37985g.AbstractC37990c f96006a;

        /* renamed from: b */
        public UIFeedCard f96007b;

        /* renamed from: c */
        public UIFeedCard f96008c;

        /* renamed from: d */
        public ArrayList<UIFeedCard> f96009d;

        /* renamed from: e */
        public boolean f96010e;

        /* renamed from: g */
        private final int f96012g = LocationRequest.PRIORITY_HD_ACCURACY;

        /* renamed from: h */
        private long f96013h;

        /* renamed from: i */
        private int f96014i;

        /* renamed from: j */
        private int f96015j;

        @Override // com.ss.android.lark.widget.recyclerview.p2965b.C58981b.AbstractC58982a
        /* renamed from: a */
        public void mo137318a(int i) {
        }

        /* renamed from: a */
        public void mo137319a(C37985g.AbstractC37990c cVar) {
            this.f96006a = cVar;
        }

        /* renamed from: b */
        public int mo137322b(int i) {
            if (i > ShortCutStausManager.m148791a().mo138579f() - 1) {
                return i - 1;
            }
            return i;
        }

        public C37420a(final RecyclerView recyclerView) {
            recyclerView.setOnTouchListener(new View.OnTouchListener(C37416m.this) {
                /* class com.ss.android.lark.feed.app.binder.C37416m.C37420a.View$OnTouchListenerC374211 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C37416m.this.f95997c = false;
                        if (C37420a.this.f96010e) {
                            C37420a aVar = C37420a.this;
                            aVar.mo137321a(recyclerView, aVar.f96007b, C37420a.this.f96008c);
                            C37420a.this.f96009d.clear();
                            C37420a.this.f96010e = false;
                            C37420a.this.f96007b = null;
                            C37420a.this.f96008c = null;
                        }
                        if (!(C37416m.this.f95999e == null || C37416m.this.f95996b == null)) {
                            C37416m.this.mo137310a(C37416m.this.f95999e);
                            C37416m.this.f95999e = null;
                        }
                    }
                    return false;
                }
            });
        }

        @Override // com.ss.android.lark.widget.recyclerview.p2965b.C58981b.AbstractC58982a
        /* renamed from: a */
        public boolean mo137320a(RecyclerView recyclerView, int i, int i2) {
            if (this.f96013h == 0 || System.currentTimeMillis() - this.f96013h >= 200) {
                this.f96013h = System.currentTimeMillis();
                this.f96014i = i;
                this.f96015j = i2;
                return mo137323b(recyclerView, i, i2);
            } else if (i == this.f96014i || i2 == this.f96015j) {
                return true;
            } else {
                this.f96013h = System.currentTimeMillis();
                this.f96014i = i;
                this.f96015j = i2;
                return true;
            }
        }

        /* renamed from: a */
        public boolean mo137321a(RecyclerView recyclerView, UIFeedCard uIFeedCard, UIFeedCard uIFeedCard2) {
            if (C37416m.this.f95996b == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("real swap id=");
            sb.append(uIFeedCard.getId());
            sb.append("from:");
            sb.append(((FeedPreview) uIFeedCard).getShortcutPosition());
            sb.append("to:");
            FeedPreview feedPreview = (FeedPreview) uIFeedCard2;
            sb.append(feedPreview.getShortcutPosition());
            Log.m165388i(sb.toString());
            C37985g.AbstractC37990c cVar = this.f96006a;
            if (cVar == null) {
                return true;
            }
            cVar.mo139047a(uIFeedCard, feedPreview.getShortcutPosition());
            return true;
        }

        /* renamed from: b */
        public boolean mo137323b(RecyclerView recyclerView, int i, int i2) {
            if (i2 == ShortCutStausManager.m148791a().mo138579f() - 1) {
                return true;
            }
            if (!this.f96010e) {
                this.f96009d = new ArrayList<>(C37416m.this.f95996b.getItems());
            }
            if (C37416m.this.f95996b != null) {
                List items = C37416m.this.f95996b.getItems();
                int itemCount = C37416m.this.f95996b.getItemCount();
                if (i >= 0 && i2 >= 0 && i < itemCount && i2 < itemCount) {
                    int b = mo137322b(i);
                    int b2 = mo137322b(i2);
                    UIFeedCard uIFeedCard = null;
                    if (items.size() > ShortCutStausManager.m148791a().mo138579f()) {
                        uIFeedCard = (UIFeedCard) items.get(ShortCutStausManager.m148791a().mo138579f() - 1);
                        items.remove(uIFeedCard);
                    }
                    UIFeedCard uIFeedCard2 = (UIFeedCard) items.get(b);
                    UIFeedCard uIFeedCard3 = (UIFeedCard) items.get(b2);
                    items.remove(uIFeedCard2);
                    items.add(b2, uIFeedCard2);
                    if (uIFeedCard != null) {
                        items.add(ShortCutStausManager.m148791a().mo138579f() - 1, uIFeedCard);
                    }
                    C37416m.this.f95996b.notifyDataSetChanged();
                    this.f96007b = uIFeedCard2;
                    this.f96008c = uIFeedCard3;
                    this.f96010e = true;
                    Log.m165388i("before swap id=" + uIFeedCard2.getId() + " from : " + i + " to : " + i2 + "realPos=" + ((FeedPreview) this.f96008c).getShortcutPosition());
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo137310a(ShortCutPreview shortCutPreview) {
        this.f95996b.mo138598a(shortCutPreview.getFeedPreviews(), this.f96000f);
        this.f96000f = false;
    }

    /* renamed from: a */
    public void mo137309a(int i) {
        if (this.f95996b.getItemCount() >= i) {
            List items = this.f95996b.getItems();
            UIFeedCard uIFeedCard = null;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f95996b.getItemCount()) {
                    break;
                } else if (items.get(i2) instanceof ShortcutBtnPreView) {
                    uIFeedCard = (UIFeedCard) items.get(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (uIFeedCard != null) {
                items.remove(uIFeedCard);
                items.add(i - 1, uIFeedCard);
                this.f95996b.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    public ShortcutViewHolder mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        ShortcutViewHolder shortcutViewHolder = new ShortcutViewHolder((ShortcutFeedItemView) bVar.mo137128a(ShortcutFeedItemView.class, viewGroup.getContext()));
        C23252d dVar = new C23252d();
        dVar.setSupportsChangeAnimations(false);
        shortcutViewHolder.mShortcutRV.setItemAnimator(dVar);
        shortcutViewHolder.mShortcutRV.setLayoutManager(new GridLayoutManager(this.f95995a, ShortCutStausManager.m148791a().mo138579f()) {
            /* class com.ss.android.lark.feed.app.binder.C37416m.C374171 */

            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        if (this.f95996b == null) {
            C37807e eVar = new C37807e(this.f95995a, bVar);
            this.f95996b = eVar;
            eVar.setHasStableIds(true);
        }
        shortcutViewHolder.mShortcutRV.setAdapter(this.f95996b);
        shortcutViewHolder.mShortcutRV.setRelayoutListener(new ShortCutRecyclerView.ShortCutRelayoutListener() {
            /* class com.ss.android.lark.feed.app.binder.C37416m.C374182 */

            @Override // com.ss.android.lark.feed.app.view.ShortCutRecyclerView.ShortCutRelayoutListener
            /* renamed from: a */
            public void mo137314a(int i) {
                C37416m.this.mo137309a(i);
            }
        });
        C37420a aVar = new C37420a(shortcutViewHolder.mShortcutRV);
        this.f96001g = aVar;
        C37805c cVar = new C37805c(aVar);
        this.f95998d = cVar;
        cVar.attachToRecyclerView(shortcutViewHolder.mShortcutRV);
        this.f95998d.mo138592a(true);
        this.f95998d.mo138593b(false);
        return shortcutViewHolder;
    }

    /* renamed from: a */
    public void mo137226a(ShortcutViewHolder shortcutViewHolder, ShortCutPreview shortCutPreview, final AbstractC37804b bVar, int i) {
        C37420a aVar;
        ViewGroup.LayoutParams layoutParams = shortcutViewHolder.mContentView.getLayoutParams();
        if (shortCutPreview.isShortCardVisible()) {
            if (layoutParams.height != -2) {
                layoutParams.height = -2;
                shortcutViewHolder.mContentView.setLayoutParams(layoutParams);
            }
            if (!this.f95997c) {
                this.f95999e = null;
                mo137310a(shortCutPreview);
            } else {
                this.f95999e = shortCutPreview;
            }
            this.f95996b.mo138596a(new C37807e.AbstractC37813a() {
                /* class com.ss.android.lark.feed.app.binder.C37416m.C374193 */

                @Override // com.ss.android.lark.feed.app.shortcut.C37807e.AbstractC37813a
                /* renamed from: b */
                public void mo137317b(View view, UIFeedCard uIFeedCard) {
                    C37416m.this.f95997c = true;
                }

                @Override // com.ss.android.lark.feed.app.shortcut.C37807e.AbstractC37813a
                /* renamed from: a */
                public void mo137316a(View view, UIFeedCard uIFeedCard) {
                    C37985g.AbstractC37989b aC_ = bVar.aC_();
                    if (aC_ != null) {
                        aC_.mo139058b(view, uIFeedCard);
                    }
                }

                @Override // com.ss.android.lark.feed.app.shortcut.C37807e.AbstractC37813a
                /* renamed from: a */
                public void mo137315a(int i, View view, FeedPreview feedPreview) {
                    FeedListAdapter.AbstractC37935j c = bVar.mo138036c();
                    if (c != null) {
                        c.mo137372a(feedPreview);
                    }
                }
            });
        } else if (layoutParams.height != 0) {
            layoutParams.height = 0;
            shortcutViewHolder.mContentView.setLayoutParams(layoutParams);
        }
        C37985g.AbstractC37990c j = bVar.mo138591j();
        if (j != null && (aVar = this.f96001g) != null) {
            aVar.mo137319a(j);
        }
    }
}

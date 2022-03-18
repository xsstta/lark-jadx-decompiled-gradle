package com.ss.android.lark.feed.p1873d;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.monitor.util.C20169b;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.lark.feed.d.b */
public class C38077b {

    /* renamed from: a */
    public static final boolean f97699a = C26284k.m95186b(LarkContext.getApplication());

    /* renamed from: b */
    public FeedListAdapter f97700b;

    /* renamed from: c */
    public volatile RecyclerView f97701c;

    /* renamed from: d */
    public RecyclerView.Recycler f97702d;

    /* renamed from: e */
    public ArrayList<RecyclerView.ViewHolder> f97703e;

    /* renamed from: f */
    public HashMap<String, Pair<Long, RecyclerView.ViewHolder>> f97704f = new HashMap<>();

    /* renamed from: g */
    private final Runnable f97705g = new Runnable() {
        /* class com.ss.android.lark.feed.p1873d.C38077b.RunnableC380803 */

        public void run() {
            if (C38077b.this.f97701c.getScrollState() == 0) {
                if (C38077b.this.f97702d != null) {
                    int childCount = C38077b.this.f97701c.getChildCount();
                    View childAt = C38077b.this.f97701c.getChildAt(0);
                    View childAt2 = C38077b.this.f97701c.getChildAt(childCount - 1);
                    HashSet<Integer> hashSet = new HashSet();
                    int childAdapterPosition = C38077b.this.f97701c.getChildAdapterPosition(childAt);
                    int childAdapterPosition2 = C38077b.this.f97701c.getChildAdapterPosition(childAt2);
                    for (int i = 1; i <= 8; i++) {
                        int i2 = childAdapterPosition - i;
                        if (i2 >= 0) {
                            hashSet.add(Integer.valueOf(i2));
                        }
                        int i3 = childAdapterPosition2 + i;
                        if (i3 <= C38077b.this.f97700b.getItemCount() - 1) {
                            hashSet.add(Integer.valueOf(i3));
                        }
                    }
                    if (C38077b.f97699a) {
                        Log.m165379d("FeedPreBinder", "================================");
                        Log.m165379d("FeedPreBinder", "firstChildAdapterPosition=" + childAdapterPosition);
                        Log.m165379d("FeedPreBinder", "lastChildAdapterPosition=" + childAdapterPosition2);
                        Log.m165379d("FeedPreBinder", "tempSet=" + hashSet);
                    }
                    if (C38077b.this.f97703e != null) {
                        for (int i4 = 0; i4 < C38077b.this.f97703e.size(); i4++) {
                            RecyclerView.ViewHolder viewHolder = C38077b.this.f97703e.get(i4);
                            int adapterPosition = viewHolder.getAdapterPosition();
                            hashSet.remove(Integer.valueOf(adapterPosition));
                            if (C38077b.f97699a) {
                                Log.m165383e("FeedPreBinder", "cachedView index=" + i4 + " adapterPosition= " + adapterPosition + " holder=" + viewHolder);
                            }
                        }
                    }
                    if (C38077b.f97699a) {
                        Log.m165379d("FeedPreBinder", "tempSet without cachedView=" + hashSet);
                        Log.m165379d("FeedPreBinder", "================================");
                    }
                    HashMap<String, Pair<Long, RecyclerView.ViewHolder>> hashMap = new HashMap<>();
                    for (Integer num : hashSet) {
                        UIFeedCard uIFeedCard = (UIFeedCard) C38077b.this.f97700b.getItem(num.intValue());
                        String id = uIFeedCard.getId();
                        long updateTime = uIFeedCard.getUpdateTime();
                        Pair<Long, RecyclerView.ViewHolder> remove = C38077b.this.f97704f.remove(id);
                        if (remove != null && ((Long) remove.first).longValue() == updateTime) {
                            hashMap.put(id, remove);
                            if (C38077b.f97699a) {
                                Log.m165379d("FeedPreBinder", "put into newExtentCachedView: use already prebinded position=" + num + " id=" + id + " updateTime=" + updateTime + " holder=" + remove.second);
                            }
                        }
                    }
                    for (Pair<Long, RecyclerView.ViewHolder> pair : C38077b.this.f97704f.values()) {
                        C38077b.this.f97701c.getRecycledViewPool().putRecycledView((RecyclerView.ViewHolder) pair.second);
                    }
                    C38077b.this.f97704f.clear();
                    for (Integer num2 : hashSet) {
                        UIFeedCard uIFeedCard2 = (UIFeedCard) C38077b.this.f97700b.getItem(num2.intValue());
                        String id2 = uIFeedCard2.getId();
                        long updateTime2 = uIFeedCard2.getUpdateTime();
                        if (!hashMap.containsKey(id2)) {
                            int itemViewType = C38077b.this.f97700b.getItemViewType(num2.intValue());
                            RecyclerView.ViewHolder recycledView = C38077b.this.f97701c.getRecycledViewPool().getRecycledView(itemViewType);
                            if (recycledView == null) {
                                recycledView = C38077b.this.f97700b.createViewHolder(C38077b.this.f97701c, itemViewType);
                            }
                            C38077b.this.mo139375a(recycledView);
                            C38077b.this.f97702d.bindViewToPosition(recycledView.itemView, num2.intValue());
                            hashMap.put(id2, new Pair<>(Long.valueOf(updateTime2), recycledView));
                            if (C38077b.f97699a) {
                                Log.m165379d("FeedPreBinder", "put into newExtentCachedView: prebinded  position=" + num2 + " id=" + id2 + " updateTime=" + updateTime2 + " holder=" + recycledView);
                            }
                        }
                    }
                    C38077b.this.f97704f = hashMap;
                } else if (C38077b.f97699a) {
                    Log.m165383e("FeedPreBinder", "recycler is null.");
                }
            }
        }
    };

    /* renamed from: a */
    public void mo139374a() {
        this.f97701c.postOnAnimation(this.f97705g);
    }

    /* renamed from: a */
    private boolean m149794a(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof RecyclerView.LayoutParams) || !this.f97701c.getLayoutManager().checkLayoutParams((RecyclerView.LayoutParams) layoutParams)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo139375a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = viewHolder.itemView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = this.f97701c.getLayoutManager().generateDefaultLayoutParams();
            viewHolder.itemView.setLayoutParams(layoutParams);
        } else if (!m149794a(layoutParams2)) {
            layoutParams = this.f97701c.getLayoutManager().generateLayoutParams(layoutParams2);
            viewHolder.itemView.setLayoutParams(layoutParams);
        } else {
            layoutParams = (RecyclerView.LayoutParams) layoutParams2;
        }
        try {
            C20169b.m73604a(layoutParams, "mViewHolder", viewHolder);
        } catch (IllegalAccessException e) {
            Log.m165384e("FeedPreBinder", "fixLayoutParams: set rvLayoutParams.mViewHolder error", e);
        }
    }

    /* renamed from: a */
    public void mo139376a(final RecyclerView recyclerView, FeedListAdapter feedListAdapter) {
        this.f97701c = recyclerView;
        try {
            this.f97700b = feedListAdapter;
            RecyclerView.Recycler recycler = (RecyclerView.Recycler) C20169b.m73601a(recyclerView, "mRecycler");
            this.f97702d = recycler;
            this.f97703e = (ArrayList) C20169b.m73601a(recycler, "mCachedViews");
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.ss.android.lark.feed.p1873d.C38077b.C380781 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        C38077b.this.mo139374a();
                    }
                }
            });
            recyclerView.setViewCacheExtension(new RecyclerView.AbstractC1341j() {
                /* class com.ss.android.lark.feed.p1873d.C38077b.C380792 */

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1341j
                /* renamed from: a */
                public View mo7218a(RecyclerView.Recycler recycler, int i, int i2) {
                    UIFeedCard uIFeedCard = (UIFeedCard) C38077b.this.f97700b.getItem(i);
                    String id = uIFeedCard.getId();
                    long updateTime = uIFeedCard.getUpdateTime();
                    Pair<Long, RecyclerView.ViewHolder> remove = C38077b.this.f97704f.remove(id);
                    if (remove == null) {
                        return null;
                    }
                    if (((Long) remove.first).longValue() == updateTime) {
                        if (C38077b.f97699a) {
                            Log.m165389i("FeedPreBinder", "getViewForPositionAndType return=" + remove.second);
                        }
                        return ((RecyclerView.ViewHolder) remove.second).itemView;
                    }
                    if (C38077b.f97699a) {
                        Log.m165383e("FeedPreBinder", "getViewForPositionAndType updateTime not match.  cache.updateTime=" + remove.first + " item.updateTime=" + updateTime);
                    }
                    recyclerView.getRecycledViewPool().putRecycledView((RecyclerView.ViewHolder) remove.second);
                    return null;
                }
            });
        } catch (Exception e) {
            Log.m165384e("FeedPreBinder", "FeedPreBinder init error.", e);
        }
    }
}

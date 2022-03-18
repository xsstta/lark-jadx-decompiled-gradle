package com.ss.android.lark.feed.app.model.cache;

import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.model.cache.ICache.AbstractC37714a;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.service.impl.C38126b;
import java.util.List;
import java.util.Map;

public interface ICache<T extends AbstractC37714a> {

    public static class Operation {

        /* renamed from: a */
        public Type f96685a;

        /* renamed from: b */
        public int f96686b;

        /* renamed from: c */
        public int f96687c;

        public enum Type {
            UNKNOWN(0),
            UPDATE(1),
            ADD(2),
            REMOVE(3),
            MOVE(4);
            
            private final int value;

            public int getNumber() {
                return this.value;
            }

            public static Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type forNumber(int i) {
                if (i == 1) {
                    return UPDATE;
                }
                if (i == 2) {
                    return ADD;
                }
                if (i == 3) {
                    return REMOVE;
                }
                if (i != 4) {
                    return UNKNOWN;
                }
                return MOVE;
            }

            private Type(int i) {
                this.value = i;
            }
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.model.cache.ICache$a */
    public interface AbstractC37714a {
        /* renamed from: a */
        void mo138255a(FeedCard.FeedType feedType, LoadState.LoadType loadType);

        /* renamed from: a */
        void mo138256a(LoadState loadState, FeedCard.FeedType feedType);

        /* renamed from: a */
        void mo138257a(UpdateRecord updateRecord);

        /* renamed from: a */
        void mo138258a(Map<Integer, Integer> map);

        /* renamed from: a */
        void mo138259a(boolean z);

        /* renamed from: b */
        void mo138260b(boolean z);
    }

    /* renamed from: a */
    Map<FeedFilter, Boolean> mo138229a(UIFeedCard uIFeedCard, List<FeedFilter> list);

    /* renamed from: a */
    void mo138230a(int i);

    /* renamed from: a */
    void mo138231a(FeedCard.FeedType feedType, int i);

    /* renamed from: a */
    void mo138232a(FeedCard.FeedType feedType, FeedFilter feedFilter);

    /* renamed from: a */
    void mo138233a(FeedCard.FeedType feedType, FeedFilter feedFilter, C38126b bVar);

    /* renamed from: a */
    void mo138234a(FeedCard.FeedType feedType, FeedFilter feedFilter, List<C38126b> list);

    /* renamed from: a */
    void mo138235a(FeedCard.FeedType feedType, LoadState.LoadType loadType);

    /* renamed from: a */
    void mo138236a(FeedCard.FeedType feedType, LoadState.LoadType loadType, boolean z);

    /* renamed from: a */
    void mo138237a(String str, String str2);

    /* renamed from: a */
    void mo138238a(List<String> list);

    /* renamed from: a */
    void mo138239a(List<UIFeedCard> list, FeedFilter feedFilter);

    /* renamed from: a */
    void mo138240a(List<UIFeedCard> list, Map<String, List<FeedFilter>> map);

    /* renamed from: a */
    void mo138241a(Map<String, List<FeedFilter>> map);

    /* renamed from: a */
    void mo138242a(boolean z);

    /* renamed from: b */
    void mo138243b(int i);

    /* renamed from: b */
    void mo138244b(List<UIFeedCard> list);

    /* renamed from: b */
    void mo138245b(Map<String, Integer> map);

    /* renamed from: c */
    void mo138246c(int i);

    /* renamed from: c */
    void mo138247c(List<UIFeedCard> list);

    /* renamed from: d */
    UpdateRecord mo138248d(FeedCard.FeedType feedType);

    /* renamed from: d */
    void mo138249d(int i);

    /* renamed from: d */
    void mo138250d(List<FeedTabItemData.IFilterItem> list);

    /* renamed from: e */
    void mo138251e(List<FeedTabItemData.IFilterItem> list);

    /* renamed from: h */
    void mo138252h();

    /* renamed from: i */
    boolean mo138253i();
}

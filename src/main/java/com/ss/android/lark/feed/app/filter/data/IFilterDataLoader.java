package com.ss.android.lark.feed.app.filter.data;

import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/IFilterDataLoader;", "", "netLoad", "", "callback", "Lcom/ss/android/lark/feed/app/filter/data/IFilterDataLoader$FilterLoadCallback;", "FilterLoadCallback", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.filter.data.b */
public interface IFilterDataLoader {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/IFilterDataLoader$FilterLoadCallback;", "", "onDataLoaded", "", "list", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "Lkotlin/collections/ArrayList;", "enableAtAllFilter", "", "onLoadErr", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.b$a */
    public interface FilterLoadCallback {
        /* renamed from: a */
        void mo137830a(ArrayList<FeedTabItemData.IFilterItem> arrayList, boolean z);

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.filter.data.b$a$a */
        public static final class C37556a {
            /* renamed from: a */
            public static /* synthetic */ void m147708a(FilterLoadCallback aVar, ArrayList arrayList, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        z = true;
                    }
                    aVar.mo137830a(arrayList, z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDataLoaded");
            }
        }
    }
}

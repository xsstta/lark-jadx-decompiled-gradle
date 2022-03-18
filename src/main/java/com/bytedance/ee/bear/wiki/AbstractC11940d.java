package com.bytedance.ee.bear.wiki;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.wiki.d */
public interface AbstractC11940d {
    AbstractC68307f<Boolean> cleanWikiRecentListDataFlowable();

    AbstractC68307f<ArrayList<WikiDocument>> getRecentWikiFlowable();

    void notifyWikiAdded();

    void notifyWikiNodeRemoved(String str, String str2);

    void saveRecentWiki(ArrayList<WikiDocument> arrayList);
}

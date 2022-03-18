package com.bytedance.ee.bear.wiki;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import io.reactivex.AbstractC68307f;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.wiki.g */
public interface AbstractC11955g {
    AbstractC68307f<Boolean> cleanWikiDataFlowable(long j);

    void updateWikiTitle(OfflineRenameData offlineRenameData);
}

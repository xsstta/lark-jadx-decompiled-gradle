package com.bytedance.ee.bear.drive.biz.feed;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/feed/DriveFeedVM;", "Landroidx/lifecycle/ViewModel;", "()V", "driveFeedManager", "Lcom/bytedance/ee/bear/drive/biz/feed/DriveFeedManager;", "getDriveFeedManager", "()Lcom/bytedance/ee/bear/drive/biz/feed/DriveFeedManager;", "setDriveFeedManager", "(Lcom/bytedance/ee/bear/drive/biz/feed/DriveFeedManager;)V", "feedCount", "Landroidx/lifecycle/MutableLiveData;", "", "getFeedCount", "()Landroidx/lifecycle/MutableLiveData;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.feed.f */
public final class DriveFeedVM extends AbstractC1142af {
    private AbstractC6464e driveFeedManager;
    private final C1177w<Integer> feedCount = new C1177w<>();

    public final AbstractC6464e getDriveFeedManager() {
        return this.driveFeedManager;
    }

    public final C1177w<Integer> getFeedCount() {
        return this.feedCount;
    }

    public final void setDriveFeedManager(AbstractC6464e eVar) {
        this.driveFeedManager = eVar;
    }
}

package com.bytedance.ee.bear.drive.biz.versions.history;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/versions/history/DriveHistoryVM;", "Landroidx/lifecycle/ViewModel;", "()V", "currentDataVersion", "", "getCurrentDataVersion", "()Ljava/lang/String;", "setCurrentDataVersion", "(Ljava/lang/String;)V", "liveHasNewVersion", "Landroidx/lifecycle/MutableLiveData;", "getLiveHasNewVersion", "()Landroidx/lifecycle/MutableLiveData;", "liveVersionDeleted", "getLiveVersionDeleted", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.versions.history.a */
public final class DriveHistoryVM extends AbstractC1142af {
    private String currentDataVersion;
    private final C1177w<String> liveHasNewVersion = new C1177w<>();
    private final C1177w<String> liveVersionDeleted = new C1177w<>();

    public final String getCurrentDataVersion() {
        return this.currentDataVersion;
    }

    public final C1177w<String> getLiveHasNewVersion() {
        return this.liveHasNewVersion;
    }

    public final C1177w<String> getLiveVersionDeleted() {
        return this.liveVersionDeleted;
    }

    public final void setCurrentDataVersion(String str) {
        this.currentDataVersion = str;
    }
}

package com.bytedance.ee.bear.drive.biz.preview.screen;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/screen/DriveFullScreenVM;", "Landroidx/lifecycle/ViewModel;", "()V", "liveFullScreen", "Landroidx/lifecycle/MutableLiveData;", "", "getLiveFullScreen", "()Landroidx/lifecycle/MutableLiveData;", "originNavigationBarColor", "", "getOriginNavigationBarColor", "()I", "setOriginNavigationBarColor", "(I)V", "originStatusBarColor", "getOriginStatusBarColor", "setOriginStatusBarColor", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.screen.b */
public final class DriveFullScreenVM extends AbstractC1142af {
    private final C1177w<Boolean> liveFullScreen = new C1177w<>(false);
    private int originNavigationBarColor;
    private int originStatusBarColor;

    public final C1177w<Boolean> getLiveFullScreen() {
        return this.liveFullScreen;
    }

    public final int getOriginNavigationBarColor() {
        return this.originNavigationBarColor;
    }

    public final int getOriginStatusBarColor() {
        return this.originStatusBarColor;
    }

    public final void setOriginNavigationBarColor(int i) {
        this.originNavigationBarColor = i;
    }

    public final void setOriginStatusBarColor(int i) {
        this.originStatusBarColor = i;
    }
}

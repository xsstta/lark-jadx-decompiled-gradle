package com.bytedance.ee.bear.drive.view.preview.media;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/media/DriveMediaVM;", "Landroidx/lifecycle/ViewModel;", "()V", "isAutoPlay", "", "()Z", "setAutoPlay", "(Z)V", "playPosition", "Landroidx/lifecycle/MutableLiveData;", "", "getPlayPosition", "()Landroidx/lifecycle/MutableLiveData;", "playerState", "", "getPlayerState", "resumePosition", "getResumePosition", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.b.b */
public final class DriveMediaVM extends AbstractC1142af {
    private boolean isAutoPlay = true;
    private final C1177w<Long> playPosition = new C1177w<>();
    private final C1177w<Integer> playerState = new C1177w<>();
    private final C1177w<Long> resumePosition = new C1177w<>();

    public final C1177w<Long> getPlayPosition() {
        return this.playPosition;
    }

    public final C1177w<Integer> getPlayerState() {
        return this.playerState;
    }

    public final C1177w<Long> getResumePosition() {
        return this.resumePosition;
    }

    public final boolean isAutoPlay() {
        return this.isAutoPlay;
    }

    public final void setAutoPlay(boolean z) {
        this.isAutoPlay = z;
    }
}

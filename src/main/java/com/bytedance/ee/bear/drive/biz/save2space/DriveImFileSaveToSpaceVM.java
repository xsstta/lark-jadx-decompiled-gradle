package com.bytedance.ee.bear.drive.biz.save2space;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import io.reactivex.disposables.C68289a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/save2space/DriveImFileSaveToSpaceVM;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "liveFileToken", "Landroidx/lifecycle/MutableLiveData;", "", "getLiveFileToken", "()Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.save2space.a */
public final class DriveImFileSaveToSpaceVM extends AbstractC1142af {
    private final C68289a compositeDisposable = new C68289a();
    private final C1177w<String> liveFileToken = new C1177w<>();

    public final C1177w<String> getLiveFileToken() {
        return this.liveFileToken;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.mo237935a();
    }
}

package com.bytedance.ee.bear.drive.biz.preview.viewfinder;

import android.view.View;
import androidx.lifecycle.AbstractC1142af;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/viewfinder/DriveViewFinderVM;", "Landroidx/lifecycle/ViewModel;", "()V", "finder", "Lcom/bytedance/ee/bear/drive/biz/preview/viewfinder/IViewFinder;", "getFinder$drive_impl_release", "()Lcom/bytedance/ee/bear/drive/biz/preview/viewfinder/IViewFinder;", "setFinder$drive_impl_release", "(Lcom/bytedance/ee/bear/drive/biz/preview/viewfinder/IViewFinder;)V", "findViewById", "T", "Landroid/view/View;", "idRes", "", "(I)Landroid/view/View;", "onCleared", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.viewfinder.a */
public final class DriveViewFinderVM extends AbstractC1142af {
    private IViewFinder finder;

    public final IViewFinder getFinder$drive_impl_release() {
        return this.finder;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.finder = null;
    }

    public final void setFinder$drive_impl_release(IViewFinder bVar) {
        this.finder = bVar;
    }

    public final <T extends View> T findViewById(int i) {
        IViewFinder bVar = this.finder;
        if (bVar != null) {
            return (T) bVar.mo26521a(i);
        }
        return null;
    }
}

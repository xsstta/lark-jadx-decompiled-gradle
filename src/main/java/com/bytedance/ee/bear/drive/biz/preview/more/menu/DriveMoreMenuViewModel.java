package com.bytedance.ee.bear.drive.biz.preview.more.menu;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.drive.biz.extra_info.meta.DriveMetaInfoVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6521a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class DriveMoreMenuViewModel extends AbstractC1142af {
    private DocDataListener mDocDataListener;

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        onDetach();
    }

    public void onDetach() {
        if (this.mDocDataListener != null) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31508b(this.mDocDataListener);
            this.mDocDataListener = null;
        }
    }

    public static class DocDataListener extends SimpleListDataChangeCallback {
        private WeakReference<DriveMetaInfoVM> mDriveMetaInfoVMRef;

        public DocDataListener(DriveMetaInfoVM aVar) {
            this.mDriveMetaInfoVMRef = new WeakReference<>(aVar);
        }

        private C6521a getDocInfo(String str) {
            DriveMetaInfoVM aVar = this.mDriveMetaInfoVMRef.get();
            if (aVar == null || aVar.getLiveMetaInfo().mo5927b() == null || !TextUtils.equals(str, aVar.getLiveMetaInfo().mo5927b().mo26054j())) {
                return null;
            }
            return aVar.getLiveMetaInfo().mo5927b();
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onPin(String str, boolean z) {
            C6521a docInfo = getDocInfo(str);
            if (docInfo != null) {
                docInfo.mo26044a(z);
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onStar(String str, boolean z) {
            C6521a docInfo = getDocInfo(str);
            if (docInfo != null) {
                docInfo.mo26046b(z);
            }
        }
    }

    public DriveMoreMenuViewModel init(DriveMetaInfoVM aVar) {
        if (this.mDocDataListener == null) {
            this.mDocDataListener = new DocDataListener(aVar);
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(this.mDocDataListener);
        }
        return this;
    }
}

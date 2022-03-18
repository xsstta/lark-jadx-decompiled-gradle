package com.bytedance.ee.bear.contract;

import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import java.util.List;

public class SimpleListDataChangeCallback extends BinderListDataChangeCallback.Stub {
    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onDelete(String str) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onFileClose() {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onFileOpen() {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onPin(String str, boolean z) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onRename(String str, String str2) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onRename(List<OfflineRenameData> list) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onStar(String str, boolean z) {
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onSubscribe(String str, boolean z) {
    }
}

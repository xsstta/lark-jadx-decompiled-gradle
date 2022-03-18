package com.bytedance.ee.bear.bitable.managerpanel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R%\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\tj\n\u0012\u0006\u0012\u0004\u0018\u00010\n`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "mExpandedTableList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getMExpandedTableList", "()Ljava/util/ArrayList;", "operationCallBack", "Lcom/bytedance/ee/bear/bitable/managerpanel/OperationCallBack;", "getOperationCallBack", "()Lcom/bytedance/ee/bear/bitable/managerpanel/OperationCallBack;", "setOperationCallBack", "(Lcom/bytedance/ee/bear/bitable/managerpanel/OperationCallBack;)V", "panelData", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData;", "getPanelData", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.managerpanel.c */
public final class BitableManagerPanelViewModel extends AbstractC1142af {
    private final C1177w<Boolean> active = new C1177w<>();
    private final ArrayList<String> mExpandedTableList = new ArrayList<>();
    private OperationCallBack operationCallBack;
    private final C1177w<BitableManagerPanelData> panelData = new C1177w<>();

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final ArrayList<String> getMExpandedTableList() {
        return this.mExpandedTableList;
    }

    public final OperationCallBack getOperationCallBack() {
        return this.operationCallBack;
    }

    public final C1177w<BitableManagerPanelData> getPanelData() {
        return this.panelData;
    }

    public final void setOperationCallBack(OperationCallBack dVar) {
        this.operationCallBack = dVar;
    }
}

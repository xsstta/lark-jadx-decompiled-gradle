package com.bytedance.ee.bear.middleground.permission.setting.permselect;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/permselect/SelectPermTypeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dismissLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "permType", "", "getDismissLiveData", "Landroidx/lifecycle/LiveData;", "getPermTypeValue", "reset", "", "setDismiss", "dismiss", "setPermType", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.a.b */
public final class SelectPermTypeViewModel extends AbstractC1142af {
    private final C1177w<Boolean> dismissLiveData = new C1177w<>();
    private int permType;

    public final int getPermTypeValue() {
        return this.permType;
    }

    public final LiveData<Boolean> getDismissLiveData() {
        return this.dismissLiveData;
    }

    public final void reset() {
        this.permType = 0;
        this.dismissLiveData.mo5929b((Boolean) false);
    }

    public final void setPermType(int i) {
        this.permType = i;
    }

    public final void setDismiss(boolean z) {
        this.dismissLiveData.mo5929b(Boolean.valueOf(z));
    }
}

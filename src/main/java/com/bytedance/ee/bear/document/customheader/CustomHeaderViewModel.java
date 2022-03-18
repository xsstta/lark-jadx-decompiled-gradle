package com.bytedance.ee.bear.document.customheader;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel$Delegate;)V", "headerData", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig;", "getHeaderData", "isStatusBarImmersive", "statusBarDiffHeight", "", "getStatusBarDiffHeight", "Delegate", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.customheader.c */
public final class CustomHeaderViewModel extends AbstractC1142af {
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegate delegate;
    private final C1177w<CustomHeaderConfig> headerData = new C1177w<>();
    private final C1177w<Boolean> isStatusBarImmersive = new C1177w<>();
    private final C1177w<Integer> statusBarDiffHeight = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel$Delegate;", "", "onItemClick", "", "id", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.c$a */
    public interface Delegate {
        /* renamed from: a */
        void mo22977a(String str);
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<CustomHeaderConfig> getHeaderData() {
        return this.headerData;
    }

    public final C1177w<Integer> getStatusBarDiffHeight() {
        return this.statusBarDiffHeight;
    }

    public final C1177w<Boolean> isStatusBarImmersive() {
        return this.isStatusBarImmersive;
    }

    public final void setDelegate(Delegate aVar) {
        this.delegate = aVar;
    }
}

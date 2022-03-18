package com.bytedance.ee.bear.bitable.panel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bitable.panel.BitablePanelModel;
import com.bytedance.ee.log.C13479a;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel$Delegate;)V", "panelModel", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel;", "getPanelModel", "onCancel", "", "onClickItem", "item", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "setActive", "updatePanelJsModel", "Delegate", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.panel.d */
public final class BitablePanelViewModel extends AbstractC1142af {
    private final String TAG = "SheetsActionSheetViewModel";
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegate delegate;
    private final C1177w<BitablePanelModel> panelModel = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel$Delegate;", "", "onCancel", "", "onClickItem", "item", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.d$a */
    public interface Delegate {
        /* renamed from: a */
        void mo18832a();

        /* renamed from: a */
        void mo18833a(BitablePanelModel.BitablePanelItem bitablePanelItem);
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<BitablePanelModel> getPanelModel() {
        return this.panelModel;
    }

    public final void onCancel() {
        C13479a.m54772d(this.TAG, "click cancel...");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo18832a();
        }
    }

    public final void setDelegate(Delegate aVar) {
        this.delegate = aVar;
    }

    public final void setActive(boolean z) {
        this.active.mo5929b(Boolean.valueOf(z));
    }

    public final void updatePanelJsModel(BitablePanelModel bitablePanelModel) {
        Intrinsics.checkParameterIsNotNull(bitablePanelModel, "panelModel");
        if (!Objects.equals(bitablePanelModel, this.panelModel.mo5927b())) {
            this.panelModel.mo5929b(bitablePanelModel);
        }
    }

    public final void onClickItem(BitablePanelModel.BitablePanelItem bitablePanelItem) {
        Intrinsics.checkParameterIsNotNull(bitablePanelItem, "item");
        String str = this.TAG;
        C13479a.m54772d(str, "click item[" + bitablePanelItem.getId() + "]...");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo18833a(bitablePanelItem);
        }
    }
}

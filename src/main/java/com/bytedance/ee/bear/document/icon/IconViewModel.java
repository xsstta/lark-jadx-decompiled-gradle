package com.bytedance.ee.bear.document.icon;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.document.icon.DocIconNetResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\fR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR*\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "setActive", "(Landroidx/lifecycle/MutableLiveData;)V", "iconInfoList", "", "Lcom/bytedance/ee/bear/document/icon/DocIconNetResult$Icon;", "getIconInfoList", "setIconInfoList", "selectedIcon", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "getSelectedIcon", "setSelectedIcon", "setIconCallback", "Lkotlin/Function1;", "", "getSetIconCallback", "()Lkotlin/jvm/functions/Function1;", "setSetIconCallback", "(Lkotlin/jvm/functions/Function1;)V", "setIcon", "iconInfoData", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.icon.e */
public final class IconViewModel extends AbstractC1142af {
    private C1177w<Boolean> active = new C1177w<>();
    private C1177w<List<DocIconNetResult.Icon>> iconInfoList = new C1177w<>();
    private C1177w<IconInfo> selectedIcon = new C1177w<>();
    private Function1<? super DocIconNetResult.Icon, Unit> setIconCallback;

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final C1177w<List<DocIconNetResult.Icon>> getIconInfoList() {
        return this.iconInfoList;
    }

    public final C1177w<IconInfo> getSelectedIcon() {
        return this.selectedIcon;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.document.icon.DocIconNetResult$Icon, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.document.icon.DocIconNetResult$Icon, kotlin.Unit> */
    public final Function1<DocIconNetResult.Icon, Unit> getSetIconCallback() {
        return this.setIconCallback;
    }

    public final void setSetIconCallback(Function1<? super DocIconNetResult.Icon, Unit> function1) {
        this.setIconCallback = function1;
    }

    public final void setActive(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.active = wVar;
    }

    public final void setIconInfoList(C1177w<List<DocIconNetResult.Icon>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.iconInfoList = wVar;
    }

    public final void setSelectedIcon(C1177w<IconInfo> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.selectedIcon = wVar;
    }

    public final void setIcon(DocIconNetResult.Icon icon) {
        Function1<? super DocIconNetResult.Icon, Unit> function1 = this.setIconCallback;
        if (function1 != null) {
            function1.invoke(icon);
        }
    }
}

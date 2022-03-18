package com.bytedance.ee.bear.bitable.fab;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bitable.fab.BitableFabModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0019\u0010\u0012\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0013R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/bitable/fab/BitableFabViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "fabItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/bitable/fab/BitableFabModel$BitableFabItem;", "getFabItems", "()Landroidx/lifecycle/MutableLiveData;", "onClickFabItem", "Lkotlin/Function1;", "", "", "getOnClickFabItem", "()Lkotlin/jvm/functions/Function1;", "setOnClickFabItem", "(Lkotlin/jvm/functions/Function1;)V", "id", "updateItems", "([Lcom/bytedance/ee/bear/bitable/fab/BitableFabModel$BitableFabItem;)V", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.fab.b */
public final class BitableFabViewModel extends AbstractC1142af {
    private final C1177w<BitableFabModel.BitableFabItem[]> fabItems = new C1177w<>();
    private Function1<? super String, Unit> onClickFabItem;

    public final C1177w<BitableFabModel.BitableFabItem[]> getFabItems() {
        return this.fabItems;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<String, Unit> getOnClickFabItem() {
        return this.onClickFabItem;
    }

    public final void setOnClickFabItem(Function1<? super String, Unit> function1) {
        this.onClickFabItem = function1;
    }

    public final void onClickFabItem(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Function1<? super String, Unit> function1 = this.onClickFabItem;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public final void updateItems(BitableFabModel.BitableFabItem[] bitableFabItemArr) {
        Intrinsics.checkParameterIsNotNull(bitableFabItemArr, "fabItems");
        this.fabItems.mo5929b(bitableFabItemArr);
    }
}

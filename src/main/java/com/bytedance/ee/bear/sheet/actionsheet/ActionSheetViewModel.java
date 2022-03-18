package com.bytedance.ee.bear.sheet.actionsheet;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0005R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegate", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel$Delegate;)V", "sheetsActionSheetModel", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetModel;", "getSheetsActionSheetModel", "onCancel", "", "onClickItem", "item", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "onClickItemRightIcon", "rightIcon", "Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;", "setActive", "Companion", "Delegate", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.a.f */
public final class ActionSheetViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegate delegate;
    private final C1177w<ActionSheetModel> sheetsActionSheetModel = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel$Delegate;", "", "onCancel", "", "onClickItem", "item", "Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetItem;", "onClickItemRightIcon", "rightIcon", "Lcom/bytedance/ee/bear/sheet/actionsheet/RightIcon;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.f$b */
    public interface Delegate {
        /* renamed from: a */
        void mo42062a();

        /* renamed from: a */
        void mo42063a(ActionSheetItem cVar);

        /* renamed from: a */
        void mo42064a(ActionSheetItem cVar, RightIcon hVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/actionsheet/ActionSheetViewModel$Companion;", "", "()V", "TAG", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<ActionSheetModel> getSheetsActionSheetModel() {
        return this.sheetsActionSheetModel;
    }

    public final void onCancel() {
        C13479a.m54772d("SheetsActionSheetViewModel", "click cancel...");
        Delegate bVar = this.delegate;
        if (bVar != null) {
            bVar.mo42062a();
        }
    }

    public final void setDelegate(Delegate bVar) {
        this.delegate = bVar;
    }

    public final void setActive(boolean z) {
        this.active.mo5929b(Boolean.valueOf(z));
    }

    public final void onClickItem(ActionSheetItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        C13479a.m54772d("SheetsActionSheetViewModel", "click item[" + cVar.mo42039d() + "]...");
        Delegate bVar = this.delegate;
        if (bVar != null) {
            bVar.mo42063a(cVar);
        }
    }

    public final void onClickItemRightIcon(ActionSheetItem cVar, RightIcon hVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        Intrinsics.checkParameterIsNotNull(hVar, "rightIcon");
        C13479a.m54772d("SheetsActionSheetViewModel", "click item[" + cVar.mo42039d() + "] icon[" + hVar.mo42065c() + "]...");
        Delegate bVar = this.delegate;
        if (bVar != null) {
            bVar.mo42064a(cVar, hVar);
        }
    }
}

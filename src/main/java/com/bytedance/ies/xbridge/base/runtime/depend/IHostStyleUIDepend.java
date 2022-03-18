package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostStyleUIDepend;", "", "hideLoading", "", "contextProviderFactory", "Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;", "(Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;)Ljava/lang/Boolean;", "showActionSheet", "actionSheetBuilder", "Lcom/bytedance/ies/xbridge/base/runtime/depend/ActionSheetBuilder;", "showActionSheetListener", "Lcom/bytedance/ies/xbridge/base/runtime/depend/ShowActionSheetListener;", "(Lcom/bytedance/ies/xbridge/base/runtime/depend/ActionSheetBuilder;Lcom/bytedance/ies/xbridge/base/runtime/depend/ShowActionSheetListener;)Ljava/lang/Boolean;", "showDialog", "dialogBuilder", "Lcom/bytedance/ies/xbridge/base/runtime/depend/DialogBuilder;", "(Lcom/bytedance/ies/xbridge/base/runtime/depend/DialogBuilder;)Ljava/lang/Boolean;", "showLoading", "showToast", "toastBuilder", "Lcom/bytedance/ies/xbridge/base/runtime/depend/ToastBuilder;", "(Lcom/bytedance/ies/xbridge/base/runtime/depend/ToastBuilder;)Ljava/lang/Boolean;", "Companion", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IHostStyleUIDepend {
    public static final Companion Companion = Companion.f37996a;

    Boolean hideLoading(XContextProviderFactory cVar);

    Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener);

    Boolean showDialog(DialogBuilder dialogBuilder);

    Boolean showLoading(XContextProviderFactory cVar);

    Boolean showToast(ToastBuilder toastBuilder);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostStyleUIDepend$Companion;", "", "()V", "TOAST_TYPE_ERROR", "", "TOAST_TYPE_SUCCESS", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f37996a = new Companion();

        private Companion() {
        }
    }
}

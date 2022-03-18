package com.bytedance.ee.bear.widgets.dialog.progressdialog;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/progressdialog/BearUDProgressDialogBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mProgress", "", "getMProgress$ccm_widget_release", "()I", "setMProgress$ccm_widget_release", "(I)V", "progress", "value", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.dialog.c.a */
public final class BearUDProgressDialogBuilder extends UDBaseDialogBuilder<BearUDProgressDialogBuilder> {

    /* renamed from: a */
    private int f31976a;

    /* renamed from: a */
    public final int mo45426a() {
        return this.f31976a;
    }

    /* renamed from: a */
    public final BearUDProgressDialogBuilder mo45427a(int i) {
        BearUDProgressDialogBuilder aVar = this;
        aVar.f31976a = i;
        return aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BearUDProgressDialogBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new BearUDProgressDialogController(context));
        marginInDp(36);
        autoDismiss(true);
        cancelOnTouchOutside(false);
    }
}

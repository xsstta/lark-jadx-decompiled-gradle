package com.larksuite.component.universe_design.dialog.actionpanel;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/actionpanel/UDActionPanelBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.dialog.a.a */
public final class UDActionPanelBuilder extends UDBaseListDialogBuilder<UDActionPanelBuilder> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDActionPanelBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setMGravity$universe_ui_dialog_release(80);
        setMWidth$universe_ui_dialog_release(1.0f);
    }
}

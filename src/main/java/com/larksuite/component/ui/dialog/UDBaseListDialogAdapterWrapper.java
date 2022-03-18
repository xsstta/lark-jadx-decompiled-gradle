package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/ui/dialog/UDBaseListDialogAdapterWrapper;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "context", "Landroid/content/Context;", "itemLayout", "", "(Landroid/content/Context;I)V", "onCreateViewHolder", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.s */
public final class UDBaseListDialogAdapterWrapper extends UDBaseListDialogAdapter {

    /* renamed from: a */
    private final Context f62612a;

    /* renamed from: c */
    private final int f62613c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDBaseListDialogAdapterWrapper(Context context, int i) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62612a = context;
        this.f62613c = i;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
    /* renamed from: b */
    public UDBaseListDialogAdapter.UDDialogListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f62612a).inflate(this.f62613c, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…temLayout, parent, false)");
        C25645r.m91841a(inflate);
        return new UDBaseListDialogAdapter.UDDialogListItemViewHolder(inflate);
    }
}

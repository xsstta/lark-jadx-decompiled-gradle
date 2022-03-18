package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.dialog.UDInputDialogController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/dialog/LKUIInputDialogControllerCompat;", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreateContent", "Landroid/view/View;", "onCreateFooter", "onCreateHeader", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.k */
public final class LKUIInputDialogControllerCompat extends UDInputDialogController {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController, com.larksuite.component.universe_design.dialog.UDInputDialogController
    public View onCreateContent() {
        View view;
        if (getMContentLayoutRes() != 0) {
            view = LayoutInflater.from(getContext()).inflate(getMContentLayoutRes(), (ViewGroup) null);
            setMContentLayoutRes(0);
        } else {
            view = getMContentLayout();
        }
        setMContentLayout(view);
        View mContentLayout = getMContentLayout();
        if (mContentLayout != null) {
            C25645r.m91841a(mContentLayout);
        }
        return super.onCreateContent();
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateFooter() {
        View view;
        if (getMFooterLayoutRes() != 0) {
            view = LayoutInflater.from(getContext()).inflate(getMFooterLayoutRes(), (ViewGroup) null);
            setMFooterLayoutRes(0);
        } else {
            view = getMFooterLayout();
        }
        setMFooterLayout(view);
        View mFooterLayout = getMFooterLayout();
        if (mFooterLayout != null) {
            C25645r.m91841a(mFooterLayout);
        }
        return super.onCreateFooter();
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateHeader() {
        View view;
        if (getMHeaderLayoutRes() != 0) {
            view = LayoutInflater.from(getContext()).inflate(getMHeaderLayoutRes(), (ViewGroup) null);
            setMHeaderLayoutRes(0);
        } else {
            view = getMHeaderLayout();
        }
        setMHeaderLayout(view);
        View mHeaderLayout = getMHeaderLayout();
        if (mHeaderLayout != null) {
            C25645r.m91841a(mHeaderLayout);
        }
        return super.onCreateHeader();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUIInputDialogControllerCompat(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}

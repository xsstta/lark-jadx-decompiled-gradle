package com.ss.android.lark.tab.manager.dialog;

import android.content.Context;
import android.view.View;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel;
import com.ss.android.lark.tab.manager.dialog.TabOrderManagerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u000b\u001a\u00020\f\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "viewModel", "Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;", "getViewModel", "()Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;", "setViewModel", "(Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;)V", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.manager.dialog.b */
public final class TabOrderManagerDialogController extends UDDialogController {

    /* renamed from: a */
    public static final Companion f136385a = new Companion(null);

    /* renamed from: b */
    private ChatTabOrderManagerViewModel f136386b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerDialogController$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/tab/manager/dialog/TabOrderManagerDialogController$createView$1", "Lcom/ss/android/lark/tab/manager/dialog/TabOrderManagerView$TabOrderManagerViewDependency;", "onCloseButtonClick", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.dialog.b$b */
    public static final class C55274b implements TabOrderManagerView.TabOrderManagerViewDependency {

        /* renamed from: a */
        final /* synthetic */ TabOrderManagerDialogController f136387a;

        @Override // com.ss.android.lark.tab.manager.dialog.TabOrderManagerView.TabOrderManagerViewDependency
        /* renamed from: a */
        public void mo188327a() {
            UDDialog mDialog = this.f136387a.getMDialog();
            if (mDialog != null) {
                mDialog.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55274b(TabOrderManagerDialogController bVar) {
            this.f136387a = bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View createView() {
        View view;
        View createView = super.createView();
        if (createView == null) {
            return null;
        }
        if (!(createView instanceof TabOrderManagerView)) {
            view = null;
        } else {
            view = createView;
        }
        TabOrderManagerView tabOrderManagerView = (TabOrderManagerView) view;
        if (tabOrderManagerView == null) {
            return createView;
        }
        tabOrderManagerView.mo188314a(new C55274b(this));
        ChatTabOrderManagerViewModel bVar = this.f136386b;
        if (bVar == null) {
            Log.m165383e("TabOrderManagerDialog", "viewModel is invalid");
            UDDialog mDialog = getMDialog();
            if (mDialog != null) {
                mDialog.dismiss();
            }
            return null;
        } else if (bVar != null) {
            tabOrderManagerView.mo188313a(bVar);
            return createView;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabOrderManagerDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof TabOrderManagerDialogBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            this.f136386b = ((TabOrderManagerDialogBuilder) uDBaseDialogBuilder).mo188333a();
            return;
        }
        throw new IllegalArgumentException(("builder should be TabOrderManagerDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}

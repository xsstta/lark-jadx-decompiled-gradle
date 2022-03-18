package com.ss.android.lark.profile.func.v3.userprofile.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\b\u001a\u00020\t\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/StatusCardController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "statusAvatarKey", "", "statusAvatarTitle", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "getDefaultRootRes", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.view.c */
public final class StatusCardController extends UDDialogController {

    /* renamed from: a */
    private String f130673a = "";

    /* renamed from: b */
    private String f130674b = "";

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public int getDefaultRootRes() {
        return R.layout.status_card_root;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View createView() {
        View createView = super.createView();
        if (createView == null) {
            return null;
        }
        ImageView imageView = (ImageView) createView.findViewById(R.id.avatar);
        if (imageView != null) {
            C52977a.m205190a().mo180995a(imageView, this.f130673a);
        }
        TextView textView = (TextView) createView.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(this.f130674b);
        }
        return createView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusCardController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof StatusCardBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            StatusCardBuilder bVar = (StatusCardBuilder) uDBaseDialogBuilder;
            this.f130673a = bVar.mo180475a();
            this.f130674b = bVar.mo180477b();
            return;
        }
        throw new IllegalArgumentException(("builder should be StatusCardBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}

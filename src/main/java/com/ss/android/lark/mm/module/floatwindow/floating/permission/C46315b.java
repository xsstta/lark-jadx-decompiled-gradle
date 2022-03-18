package com.ss.android.lark.mm.module.floatwindow.floating.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.C46313a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"showDialog", "", "context", "Landroid/content/Context;", "title", "", "description", "callback", "Lcom/ss/android/lark/mm/module/floatwindow/floating/permission/FloatPermission$PermissionCallBack;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.b */
public final class C46315b {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/ss/android/lark/mm/module/floatwindow/floating/permission/FloatPermissionKt$showDialog$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.b$a */
    public static final class DialogInterface$OnClickListenerC46316a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f116663a;

        /* renamed from: b */
        final /* synthetic */ String f116664b;

        /* renamed from: c */
        final /* synthetic */ String f116665c;

        /* renamed from: d */
        final /* synthetic */ C46313a.AbstractC46314a f116666d;

        DialogInterface$OnClickListenerC46316a(Context context, String str, String str2, C46313a.AbstractC46314a aVar) {
            this.f116663a = context;
            this.f116664b = str;
            this.f116665c = str2;
            this.f116666d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f116666d.permissionGranted(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/mm/module/floatwindow/floating/permission/FloatPermissionKt$showDialog$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.b$b */
    public static final class DialogInterface$OnClickListenerC46317b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f116667a;

        /* renamed from: b */
        final /* synthetic */ String f116668b;

        /* renamed from: c */
        final /* synthetic */ String f116669c;

        /* renamed from: d */
        final /* synthetic */ C46313a.AbstractC46314a f116670d;

        DialogInterface$OnClickListenerC46317b(Context context, String str, String str2, C46313a.AbstractC46314a aVar) {
            this.f116667a = context;
            this.f116668b = str;
            this.f116669c = str2;
            this.f116670d = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Context context = this.f116667a;
            if (context != null) {
                C46313a.m183386a(((Activity) context).getApplication());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public static final void m183389a(Context context, String str, String str2, C46313a.AbstractC46314a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "description");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(str)).titleBold(true)).message(str2)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL)).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_Cancel, new DialogInterface$OnClickListenerC46316a(context, str, str2, aVar))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_ConfirmButton, new DialogInterface$OnClickListenerC46317b(context, str, str2, aVar))).show();
    }
}

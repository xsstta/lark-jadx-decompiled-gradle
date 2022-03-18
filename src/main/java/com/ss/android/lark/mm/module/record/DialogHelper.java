package com.ss.android.lark.mm.module.record;

import android.app.Activity;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mm/module/record/DialogHelper;", "", "()V", "askForConflict", "", "activity", "Landroid/app/Activity;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.a */
public final class DialogHelper {

    /* renamed from: a */
    public static final DialogHelper f117950a = new DialogHelper();

    private DialogHelper() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.a$a */
    public static final class DialogInterface$OnClickListenerC46852a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f117951a;

        DialogInterface$OnClickListenerC46852a(Function0 function0) {
            this.f117951a = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f117951a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.a$b */
    public static final class DialogInterface$OnClickListenerC46853b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f117952a;

        DialogInterface$OnClickListenerC46853b(Function0 function0) {
            this.f117952a = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Function0 function0 = this.f117952a;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo164569a(Activity activity, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(function0, "onConfirm");
        if (UIUtils.isActivityRunning(activity)) {
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(activity).message(R.string.MMWeb_G_StartNewRecordingQuestion)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL)).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_StartNewRecording, new DialogInterface$OnClickListenerC46852a(function0))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_Cancel, new DialogInterface$OnClickListenerC46853b(function02))).show();
        }
    }
}

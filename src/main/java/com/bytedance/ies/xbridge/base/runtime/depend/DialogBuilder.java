package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import android.content.DialogInterface;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u0006."}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/DialogBuilder;", "", "context", "Landroid/content/Context;", "title", "", "message", "positiveBtnText", "positiveClickListener", "Landroid/content/DialogInterface$OnClickListener;", "negativeBtnText", "negativeClickListener", "cancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "cancelOnTouchOutside", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnCancelListener;Z)V", "getCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "getCancelOnTouchOutside", "()Z", "getContext", "()Landroid/content/Context;", "getMessage", "()Ljava/lang/String;", "getNegativeBtnText", "getNegativeClickListener", "()Landroid/content/DialogInterface$OnClickListener;", "getPositiveBtnText", "getPositiveClickListener", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DialogBuilder {
    private final DialogInterface.OnCancelListener cancelListener;
    private final boolean cancelOnTouchOutside;
    private final Context context;
    private final String message;
    private final String negativeBtnText;
    private final DialogInterface.OnClickListener negativeClickListener;
    private final String positiveBtnText;
    private final DialogInterface.OnClickListener positiveClickListener;
    private final String title;

    public static /* synthetic */ DialogBuilder copy$default(DialogBuilder dialogBuilder, Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z, int i, Object obj) {
        return dialogBuilder.copy((i & 1) != 0 ? dialogBuilder.context : context2, (i & 2) != 0 ? dialogBuilder.title : str, (i & 4) != 0 ? dialogBuilder.message : str2, (i & 8) != 0 ? dialogBuilder.positiveBtnText : str3, (i & 16) != 0 ? dialogBuilder.positiveClickListener : onClickListener, (i & 32) != 0 ? dialogBuilder.negativeBtnText : str4, (i & 64) != 0 ? dialogBuilder.negativeClickListener : onClickListener2, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? dialogBuilder.cancelListener : onCancelListener, (i & DynamicModule.f58006b) != 0 ? dialogBuilder.cancelOnTouchOutside : z);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener component5() {
        return this.positiveClickListener;
    }

    public final String component6() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener component7() {
        return this.negativeClickListener;
    }

    public final DialogInterface.OnCancelListener component8() {
        return this.cancelListener;
    }

    public final boolean component9() {
        return this.cancelOnTouchOutside;
    }

    public final DialogBuilder copy(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return new DialogBuilder(context2, str, str2, str3, onClickListener, str4, onClickListener2, onCancelListener, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogBuilder)) {
            return false;
        }
        DialogBuilder dialogBuilder = (DialogBuilder) obj;
        return Intrinsics.areEqual(this.context, dialogBuilder.context) && Intrinsics.areEqual(this.title, dialogBuilder.title) && Intrinsics.areEqual(this.message, dialogBuilder.message) && Intrinsics.areEqual(this.positiveBtnText, dialogBuilder.positiveBtnText) && Intrinsics.areEqual(this.positiveClickListener, dialogBuilder.positiveClickListener) && Intrinsics.areEqual(this.negativeBtnText, dialogBuilder.negativeBtnText) && Intrinsics.areEqual(this.negativeClickListener, dialogBuilder.negativeClickListener) && Intrinsics.areEqual(this.cancelListener, dialogBuilder.cancelListener) && this.cancelOnTouchOutside == dialogBuilder.cancelOnTouchOutside;
    }

    public int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.positiveBtnText;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        DialogInterface.OnClickListener onClickListener = this.positiveClickListener;
        int hashCode5 = (hashCode4 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        String str4 = this.negativeBtnText;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        DialogInterface.OnClickListener onClickListener2 = this.negativeClickListener;
        int hashCode7 = (hashCode6 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        DialogInterface.OnCancelListener onCancelListener = this.cancelListener;
        if (onCancelListener != null) {
            i = onCancelListener.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.cancelOnTouchOutside;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "DialogBuilder(context=" + this.context + ", title=" + this.title + ", message=" + this.message + ", positiveBtnText=" + this.positiveBtnText + ", positiveClickListener=" + this.positiveClickListener + ", negativeBtnText=" + this.negativeBtnText + ", negativeClickListener=" + this.negativeClickListener + ", cancelListener=" + this.cancelListener + ", cancelOnTouchOutside=" + this.cancelOnTouchOutside + ")";
    }

    public final DialogInterface.OnCancelListener getCancelListener() {
        return this.cancelListener;
    }

    public final boolean getCancelOnTouchOutside() {
        return this.cancelOnTouchOutside;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNegativeBtnText() {
        return this.negativeBtnText;
    }

    public final DialogInterface.OnClickListener getNegativeClickListener() {
        return this.negativeClickListener;
    }

    public final String getPositiveBtnText() {
        return this.positiveBtnText;
    }

    public final DialogInterface.OnClickListener getPositiveClickListener() {
        return this.positiveClickListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public DialogBuilder(Context context2, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, boolean z) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
        this.title = str;
        this.message = str2;
        this.positiveBtnText = str3;
        this.positiveClickListener = onClickListener;
        this.negativeBtnText = str4;
        this.negativeClickListener = onClickListener2;
        this.cancelListener = onCancelListener;
        this.cancelOnTouchOutside = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DialogBuilder(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, android.content.DialogInterface.OnClickListener r14, java.lang.String r15, android.content.DialogInterface.OnClickListener r16, android.content.DialogInterface.OnCancelListener r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x000c
        L_0x000b:
            r1 = r11
        L_0x000c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0014
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0015
        L_0x0014:
            r3 = r12
        L_0x0015:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x001d
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x001e
        L_0x001d:
            r4 = r13
        L_0x001e:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0026
            r5 = r2
            android.content.DialogInterface$OnClickListener r5 = (android.content.DialogInterface.OnClickListener) r5
            goto L_0x0027
        L_0x0026:
            r5 = r14
        L_0x0027:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x002f
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0030
        L_0x002f:
            r6 = r15
        L_0x0030:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0038
            r7 = r2
            android.content.DialogInterface$OnClickListener r7 = (android.content.DialogInterface.OnClickListener) r7
            goto L_0x003a
        L_0x0038:
            r7 = r16
        L_0x003a:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0041
            android.content.DialogInterface$OnCancelListener r2 = (android.content.DialogInterface.OnCancelListener) r2
            goto L_0x0043
        L_0x0041:
            r2 = r17
        L_0x0043:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004b
        L_0x0049:
            r0 = r18
        L_0x004b:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r2
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, android.content.DialogInterface$OnClickListener, java.lang.String, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnCancelListener, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

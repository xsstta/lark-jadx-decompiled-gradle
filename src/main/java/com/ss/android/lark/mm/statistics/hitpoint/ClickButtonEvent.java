package com.ss.android.lark.mm.statistics.hitpoint;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/ClickButtonEvent;", "Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "actionName", "", "actionType", "actionEnabled", "", "actionResult", "pageName", "fileId", "fromSource", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionEnabled", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActionName", "()Ljava/lang/String;", "getActionResult", "getActionType", "getFileId", "getFromSource", "getPageName", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.a */
public final class ClickButtonEvent extends UIEvent {
    @SerializedName("action_name")

    /* renamed from: a */
    private final String f118556a;
    @SerializedName("action_type")

    /* renamed from: b */
    private final String f118557b;
    @SerializedName("action_enabled")

    /* renamed from: c */
    private final Integer f118558c;
    @SerializedName("action_result")

    /* renamed from: d */
    private final String f118559d;
    @SerializedName("page_name")

    /* renamed from: e */
    private final String f118560e;
    @SerializedName("file_id")

    /* renamed from: f */
    private final String f118561f;
    @SerializedName("from_source")

    /* renamed from: g */
    private final String f118562g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickButtonEvent(String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
        super("vc_mm_click_button", null, 2, null);
        Intrinsics.checkParameterIsNotNull(str, "actionName");
        this.f118556a = str;
        this.f118557b = str2;
        this.f118558c = num;
        this.f118559d = str3;
        this.f118560e = str4;
        this.f118561f = str5;
        this.f118562g = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ClickButtonEvent(java.lang.String r8, java.lang.String r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x000a
        L_0x0009:
            r0 = r9
        L_0x000a:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0012
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0013
        L_0x0012:
            r2 = r10
        L_0x0013:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x001b
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x001c
        L_0x001b:
            r3 = r11
        L_0x001c:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x0024
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0025
        L_0x0024:
            r4 = r12
        L_0x0025:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x002d
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x002e
        L_0x002d:
            r5 = r13
        L_0x002e:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0035
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0036
        L_0x0035:
            r1 = r14
        L_0x0036:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

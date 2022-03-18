package com.ss.android.lark.auditsdk.authorization;

import android.content.Context;
import android.content.DialogInterface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/auditsdk/authorization/IAuthorizationService;", "", "checkFileOpenIn3rdAppAuthorization", "", "originKey", "", "defaultPassed", "checkFileSavedToDriveAuthorization", "checkImageDownloadAuthorization", "checkVideoDownloadAuthorization", "getAuditDisplayMsg", "actionResId", "", "getLoginUserAuthorityDeniedCode", "getLoginUserAuthorityDeniedReason", "getOtherUserAuthorityDeniedCode", "getOtherUserAuthorityDeniedReason", "getUploadAuthorizationTip", "getUserAuthorityControledTip", "onCheckedAuthorizationFailed", "", "context", "Landroid/content/Context;", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "displayMsg", "onCheckedAuthorizationFailedToast", "im_audit-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.auditsdk.authorization.c */
public interface IAuthorizationService {
    /* renamed from: a */
    String mo104067a();

    /* renamed from: a */
    String mo104068a(int i);

    /* renamed from: a */
    void mo104069a(Context context, int i);

    /* renamed from: a */
    void mo104070a(Context context, int i, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: a */
    void mo104071a(Context context, String str, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: a */
    boolean mo104072a(String str, boolean z);

    /* renamed from: b */
    String mo104073b();

    /* renamed from: b */
    boolean mo104074b(String str, boolean z);

    /* renamed from: c */
    int mo104075c();

    /* renamed from: c */
    boolean mo104076c(String str, boolean z);

    /* renamed from: d */
    int mo104077d();

    /* renamed from: d */
    boolean mo104078d(String str, boolean z);

    /* renamed from: e */
    int mo104079e();

    /* renamed from: f */
    int mo104080f();
}

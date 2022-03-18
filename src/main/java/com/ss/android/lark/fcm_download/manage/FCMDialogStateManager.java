package com.ss.android.lark.fcm_download.manage;

import com.ss.android.lark.fcm_download.FCMDownloadModule;
import com.ss.android.lark.fcm_download.IFCMDownModuleDependency;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/fcm_download/manage/FCMDialogStateManager;", "", "()V", "SP_KEY_FCM_STATE", "", "getState", "Lcom/ss/android/lark/fcm_download/manage/FCMDialogState;", "getStateKey", "isAgree", "", "isRejected", "setState", "", "state", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.fcm_download.manage.a */
public final class FCMDialogStateManager {

    /* renamed from: a */
    public static final FCMDialogStateManager f95621a = new FCMDialogStateManager();

    private FCMDialogStateManager() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m146632a() {
        if (m146634c() == FCMDialogState.REJECT) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m146633b() {
        if (m146634c() == FCMDialogState.AGREE) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: c */
    public static final FCMDialogState m146634c() {
        return FCMDialogState.Companion.mo136927a(C57744a.m224104a().getInt(f95621a.m146635d(), FCMDialogState.SHOW_DIALOG.getValue()));
    }

    /* renamed from: d */
    private final String m146635d() {
        Integer num;
        String b;
        StringBuilder sb = new StringBuilder();
        sb.append("SP_KEY_FCM_STATE_");
        IFCMDownModuleDependency a = FCMDownloadModule.f95612b.mo136916a();
        if (a == null || (b = a.mo133162b()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(b.hashCode());
        }
        sb.append(num);
        return sb.toString();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m146631a(FCMDialogState fCMDialogState) {
        Intrinsics.checkParameterIsNotNull(fCMDialogState, "state");
        C57744a.m224104a().putInt(f95621a.m146635d(), fCMDialogState.getValue());
    }
}

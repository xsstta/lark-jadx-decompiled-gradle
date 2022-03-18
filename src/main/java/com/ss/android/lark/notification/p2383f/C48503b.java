package com.ss.android.lark.notification.p2383f;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.notification.f.b */
public class C48503b implements AbstractNotification.AbstractC48494a {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48494a
    /* renamed from: a */
    public void mo135461a(Notice notice) {
        String str = notice.messageId;
        if (TextUtils.isEmpty(str) || notice.extra == null) {
            Log.m165383e("MessageNoticeCancel", "messageId or notice extra is null");
            return;
        }
        String str2 = notice.extra.f122004c;
        if (TextUtils.isEmpty(str2)) {
            Log.m165383e("MessageNoticeCancel", "getChatId extra is null");
            return;
        }
        C57823a.m224448a(C29990c.m110930b().mo134528a()).mo196174a((((int) Long.parseLong(str2)) % HwBuildEx.VersionCodes.CUR_DEVELOPMENT) * HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        C57823a.m224448a(C29990c.m110930b().mo134528a()).mo196174a((((int) Long.parseLong(str)) % HwBuildEx.VersionCodes.CUR_DEVELOPMENT) * HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    }
}

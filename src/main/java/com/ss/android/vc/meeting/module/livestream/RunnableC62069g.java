package com.ss.android.vc.meeting.module.livestream;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.livestream.g */
public class RunnableC62069g implements Runnable {

    /* renamed from: a */
    private C61303k f155933a;

    public void run() {
        if (m242512a(this.f155933a)) {
            C60738ac.m236037c((int) R.string.View_M_LivestreamingLinkCopiedNew);
            return;
        }
        C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_M_CopyLivestreamLinkErrorTryAgainLaterNew, 3000);
        C60700b.m235851b("LivestreamCopyUrlRunnable", "[onClickcopyLiveUrl]", "copy url fail");
    }

    public RunnableC62069g(C61303k kVar) {
        this.f155933a = kVar;
    }

    /* renamed from: a */
    public static boolean m242512a(C61303k kVar) {
        String str;
        if (kVar == null) {
            return false;
        }
        LiveInfo m = kVar.mo212091I().mo212490a().mo212481m();
        String str2 = null;
        if (m != null) {
            str = m.mo209929a();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            LiveInfo c = kVar.am().mo214677c();
            if (c != null) {
                str2 = c.mo209929a();
            }
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("liveUrl", str));
        return true;
    }
}

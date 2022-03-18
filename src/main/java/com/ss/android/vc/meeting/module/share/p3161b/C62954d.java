package com.ss.android.vc.meeting.module.share.p3161b;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.share.b.d */
public class C62954d {
    /* renamed from: a */
    public static AbstractC61222a m246537a(Activity activity, C61303k kVar, ArrayList<VideoChatShareItem> arrayList, boolean z, int i, OnSaveListener aVar, boolean z2, boolean z3) {
        if (DesktopUtil.m144307b()) {
            return new VideoChatShareSelectedDesktopDialog(activity, kVar, arrayList, z, i, aVar);
        }
        return new VideoChatShareSelectedDialog(activity, kVar, arrayList, z, i, aVar, z2, z3);
    }
}

package com.ss.android.vc.meeting.module.p3148o.p3149a;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j;

/* renamed from: com.ss.android.vc.meeting.module.o.a.i */
public class C62579i {
    /* renamed from: a */
    public static AbstractC61222a m244771a(Activity activity, C61303k kVar, MsgWithUrlInfo bVar, C62580j.AbstractC62589a aVar, VideoChatLiveActionEntityRequest.Action action) {
        if (DesktopUtil.m144307b()) {
            return C62577g.m244757a(activity, kVar, bVar, aVar, action);
        }
        return C62578h.m244762a(activity, kVar, bVar, aVar, action);
    }
}

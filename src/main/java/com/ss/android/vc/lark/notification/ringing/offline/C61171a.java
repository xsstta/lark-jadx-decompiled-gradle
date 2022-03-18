package com.ss.android.vc.lark.notification.ringing.offline;

import android.text.TextUtils;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.vc.lark.notification.ringing.offline.a */
public class C61171a {

    /* renamed from: a */
    private static ArrayList<VCOfflineNotice> f153223a = new ArrayList<>();

    /* renamed from: a */
    public static void m237879a(VCOfflineNotice vCOfflineNotice) {
        if (vCOfflineNotice != null) {
            f153223a.add(vCOfflineNotice);
        }
    }

    /* renamed from: a */
    public static VCOfflineNotice m237878a(VideoChat videoChat) {
        Participant b;
        if (!(videoChat == null || (b = MeetingUtil.m238370b(videoChat)) == null || TextUtils.isEmpty(b.getInteractiveId()))) {
            Iterator<VCOfflineNotice> it = f153223a.iterator();
            while (it.hasNext()) {
                VCOfflineNotice next = it.next();
                if (b.getInteractiveId().equals(next.getInteractiveid())) {
                    return next;
                }
            }
        }
        return null;
    }
}

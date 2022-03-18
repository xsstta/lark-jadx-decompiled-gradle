package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.statemachine.C61340f;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.vc.meeting.framework.manager.d */
public class C61281d {

    /* renamed from: a */
    private Map<String, String> f153512a = new HashMap();

    /* renamed from: a */
    public static String m238421a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    private boolean m238422c(VideoChat videoChat) {
        if (videoChat == null || TextUtils.isEmpty(videoChat.getCreatingId())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m238423d(VideoChat videoChat) {
        if (videoChat == null || TextUtils.isEmpty(videoChat.getId())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized String mo211936a(String str) {
        for (Map.Entry<String, String> entry : this.f153512a.entrySet()) {
            if (entry.getKey().equals(str)) {
                return str;
            }
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void mo211937a(VideoChat videoChat) {
        if (!m238422c(videoChat)) {
            if (!m238423d(videoChat)) {
                this.f153512a.put(videoChat.getCreatingId(), videoChat.getId());
                C60871a.m236611b("IdManager", "[relateIds] after, idsRelationMap = " + C61340f.m238969a(this.f153512a));
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo211939b(VideoChat videoChat) {
        if (videoChat != null) {
            boolean isEmpty = TextUtils.isEmpty(videoChat.getCreatingId());
            boolean isEmpty2 = TextUtils.isEmpty(videoChat.getId());
            if (!isEmpty && !isEmpty2) {
                this.f153512a.put(videoChat.getCreatingId(), videoChat.getId());
            } else if (isEmpty && !isEmpty2) {
                Iterator<Map.Entry<String, String>> it = this.f153512a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (videoChat.getId().equals(next.getValue())) {
                        videoChat.setCreatingId(next.getKey());
                        break;
                    }
                }
                if (TextUtils.isEmpty(videoChat.getCreatingId())) {
                    videoChat.setCreatingId(m238421a());
                    this.f153512a.put(videoChat.getCreatingId(), videoChat.getId());
                }
            }
            C60871a.m236611b("IdManager", "[setCreatingId] creatingId = " + videoChat.getCreatingId() + " , meetingId = " + videoChat.getId() + ", idsRelationMap = " + C61340f.m238969a(this.f153512a));
        }
    }

    /* renamed from: a */
    public synchronized boolean mo211938a(VideoChat videoChat, VideoChat videoChat2) {
        boolean a;
        a = C61266a.m238332a().mo210466a(videoChat, videoChat2);
        C60871a.m236611b("IdManager", "[isMatch] finally return " + a);
        return a;
    }
}

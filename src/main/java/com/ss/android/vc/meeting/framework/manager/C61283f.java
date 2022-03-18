package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d;
import com.ss.android.vc.meeting.framework.statemachine.C61355p;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.framework.manager.f */
public class C61283f implements AbstractC61285b {

    /* renamed from: a */
    private final String f153520a = "MeetingInfoRecord";

    /* renamed from: b */
    private Map<String, List<StatusNode>> f153521b = new HashMap();

    /* renamed from: c */
    private Map<String, StatusNode[]> f153522c = new HashMap();

    /* renamed from: d */
    private Map<String, StatusNode> f153523d = new HashMap();

    /* renamed from: e */
    private Map<String, VideoChat.Type> f153524e = new HashMap();

    /* renamed from: a */
    public static StatusNode m238435a(AbstractC61338d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar instanceof C61355p.C61359d) {
            return StatusNode.Init;
        }
        if (dVar instanceof C61355p.C61361f) {
            return StatusNode.Ringing;
        }
        if (dVar instanceof C61355p.C61357b) {
            return StatusNode.Calling;
        }
        if (dVar instanceof C61355p.C61360e) {
            return StatusNode.OnTheCall;
        }
        if (dVar instanceof C61355p.C61358c) {
            return StatusNode.Idle;
        }
        return null;
    }

    /* renamed from: c */
    private void m238439c(VideoChat videoChat) {
        String id = videoChat.getId();
        VideoChat.Type type = videoChat.getType();
        if (!TextUtils.isEmpty(id) && type != null) {
            this.f153524e.put(id, type);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b
    /* renamed from: b */
    public synchronized boolean mo211953b(VideoChat videoChat) {
        boolean z;
        Participant b;
        z = false;
        if (videoChat != null) {
            List<Participant> participants = videoChat.getParticipants();
            if (!(participants == null || participants.size() <= 0 || (b = C61266a.m238332a().mo210467b(videoChat)) == null)) {
                z = mo211951a(videoChat.getId(), b.getInteractiveId());
            }
        }
        C60871a.m236611b("MeetingInfoRecord", "[isEndByInteractiveId] finally isEnd=" + z);
        return z;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b
    /* renamed from: a */
    public synchronized boolean mo211950a(VideoChat videoChat) {
        if (videoChat == null) {
            C60871a.m236611b("MeetingInfoRecord", "[isEndForSingle] return false,eventVc == null");
            return false;
        }
        String creatingId = videoChat.getCreatingId();
        if (TextUtils.isEmpty(creatingId)) {
            C60871a.m236611b("MeetingInfoRecord", "[isEndForSingle] return false,creatingId == null");
            return false;
        }
        List<StatusNode> list = this.f153521b.get(creatingId);
        if (list == null || list.size() <= 0 || list.get(list.size() - 1) != StatusNode.Idle) {
            C60871a.m236611b("MeetingInfoRecord", "[isEndForSingle] return false finally");
            return false;
        }
        C60871a.m236611b("MeetingInfoRecord", "[isEndForSingle] return true finally");
        return true;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b
    /* renamed from: b */
    public void mo211952b(String str, String str2) {
        this.f153523d.remove(m238438c(str, str2));
    }

    /* renamed from: c */
    private String m238438c(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: b */
    private void m238437b(VideoChat videoChat, StatusNode statusNode) {
        Participant b;
        List<Participant> participants = videoChat.getParticipants();
        if (participants != null && participants.size() >= 1 && (b = C61266a.m238332a().mo210467b(videoChat)) != null) {
            String id = videoChat.getId();
            String interactiveId = b.getInteractiveId();
            if (!TextUtils.isEmpty(id) && !TextUtils.isEmpty(interactiveId)) {
                this.f153523d.put(m238438c(id, interactiveId), statusNode);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b
    /* renamed from: a */
    public synchronized void mo211947a(VideoChat videoChat, StatusNode statusNode) {
        if (videoChat != null) {
            String creatingId = videoChat.getCreatingId();
            if (!TextUtils.isEmpty(creatingId)) {
                mo211949a(creatingId, statusNode);
                m238436a(creatingId, statusNode, (StatusNode) null);
            }
            m238437b(videoChat, statusNode);
            m238439c(videoChat);
        }
    }

    /* renamed from: a */
    public synchronized void mo211949a(String str, StatusNode statusNode) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f153521b.containsKey(str)) {
                ArrayList arrayList = (ArrayList) this.f153521b.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f153521b.put(str, arrayList);
                }
                if (arrayList.size() <= 0 || arrayList.get(arrayList.size() - 1) != statusNode) {
                    arrayList.add(statusNode);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                this.f153521b.put(str, arrayList2);
                arrayList2.add(statusNode);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b
    /* renamed from: a */
    public synchronized boolean mo211951a(String str, String str2) {
        boolean z;
        z = false;
        String c = m238438c(str, str2);
        if (this.f153523d.containsKey(c) && this.f153523d.get(c) == StatusNode.Idle) {
            z = true;
        }
        C60871a.m236611b("MeetingInfoRecord", "[isEndByInteractiveId] combineId=" + c + " , isEnd=" + z);
        return z;
    }

    /* renamed from: a */
    private synchronized void m238436a(String str, StatusNode statusNode, StatusNode statusNode2) {
        StatusNode[] statusNodeArr = null;
        if (this.f153522c.containsKey(str)) {
            statusNodeArr = this.f153522c.get(str);
        }
        if (statusNodeArr == null) {
            statusNodeArr = new StatusNode[2];
            this.f153522c.put(str, statusNodeArr);
        }
        statusNodeArr[0] = statusNode;
        statusNodeArr[1] = statusNode2;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b
    /* renamed from: a */
    public synchronized void mo211948a(VideoChat videoChat, AbstractC61338d dVar, AbstractC61338d dVar2) {
        if (videoChat != null) {
            if (!TextUtils.isEmpty(videoChat.getCreatingId())) {
                m238436a(videoChat.getCreatingId(), m238435a(dVar), m238435a(dVar2));
            }
        }
    }
}

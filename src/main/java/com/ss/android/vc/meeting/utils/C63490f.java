package com.ss.android.vc.meeting.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.utils.f */
public class C63490f {

    /* renamed from: a */
    private List<MeetingCacheEntity> f160401a = new ArrayList();

    /* renamed from: b */
    private List<VideoChat> f160402b = new ArrayList();

    /* renamed from: d */
    private void m248811d() {
        C57744a.m224104a().putString("sp_key_meeting_info_list", JSON.toJSONString(this.f160401a));
    }

    /* renamed from: c */
    public List<VideoChat> mo219638c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f160402b);
        this.f160402b.clear();
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo219634a() {
        C57744a.m224104a().putString("sp_key_meeting_info_list", "");
        this.f160401a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.utils.f$1 */
    public static /* synthetic */ class C634911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160403a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.meeting.framework.statemachine.StatusNode[] r0 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.utils.C63490f.C634911.f160403a = r0
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Init     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.utils.C63490f.C634911.f160403a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Idle     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.utils.C63490f.C634911.f160403a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Calling     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.utils.C63490f.C634911.f160403a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.Ringing     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.utils.C63490f.C634911.f160403a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.framework.statemachine.StatusNode r1 = com.ss.android.vc.meeting.framework.statemachine.StatusNode.OnTheCall     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.utils.C63490f.C634911.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void m248812e() {
        List parseArray;
        this.f160401a.clear();
        String string = C57744a.m224104a().getString("sp_key_meeting_info_list");
        if (!TextUtils.isEmpty(string) && (parseArray = JSON.parseArray(string, MeetingCacheEntity.class)) != null && parseArray.size() > 0) {
            this.f160401a.addAll(parseArray);
        }
    }

    /* renamed from: f */
    private void m248813f() {
        this.f160402b.clear();
        for (MeetingCacheEntity meetingCacheEntity : this.f160401a) {
            this.f160402b.add(meetingCacheEntity.getVideoChat());
        }
    }

    /* renamed from: b */
    public synchronized List<String> mo219637b() {
        ArrayList arrayList;
        m248812e();
        m248813f();
        arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < this.f160401a.size()) {
            MeetingCacheEntity meetingCacheEntity = this.f160401a.get(i);
            if (meetingCacheEntity.getVideoChat().getType() == VideoChat.Type.MEET && meetingCacheEntity.getStatus() == Participant.Status.ON_THE_CALL) {
                String id = meetingCacheEntity.getVideoChat().getId();
                arrayList.add(id);
                sb.append(id);
                sb.append(",");
                i++;
            } else {
                this.f160401a.remove(meetingCacheEntity);
            }
        }
        m248811d();
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo219635a(VideoChat videoChat) {
        if (videoChat != null) {
            VideoChat videoChat2 = null;
            Iterator<MeetingCacheEntity> it = this.f160401a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VideoChat videoChat3 = it.next().getVideoChat();
                if (m248810a(videoChat3, videoChat)) {
                    videoChat2 = videoChat3;
                    break;
                }
            }
            if (videoChat2 != null) {
                videoChat2.setType(VideoChat.Type.MEET);
                m248811d();
            }
        }
    }

    /* renamed from: a */
    private boolean m248810a(VideoChat videoChat, VideoChat videoChat2) {
        if (videoChat == null || videoChat2 == null || TextUtils.isEmpty(videoChat.getId()) || TextUtils.isEmpty(videoChat2.getId()) || !videoChat.getId().equals(videoChat2.getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void mo219636a(VideoChat videoChat, StatusNode statusNode) {
        if (videoChat != null) {
            if (!TextUtils.isEmpty(videoChat.getId())) {
                Participant.Status status = Participant.Status.UNKNOWN;
                int i = C634911.f160403a[statusNode.ordinal()];
                if (i == 1) {
                    status = Participant.Status.UNKNOWN;
                } else if (i == 2) {
                    status = Participant.Status.IDLE;
                } else if (i == 3) {
                    status = Participant.Status.CALLING;
                } else if (i == 4) {
                    status = Participant.Status.RINGING;
                } else if (i == 5) {
                    status = Participant.Status.ON_THE_CALL;
                }
                MeetingCacheEntity meetingCacheEntity = null;
                Iterator<MeetingCacheEntity> it = this.f160401a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MeetingCacheEntity next = it.next();
                    if (m248810a(next.getVideoChat(), videoChat)) {
                        meetingCacheEntity = next;
                        break;
                    }
                }
                if (meetingCacheEntity != null) {
                    this.f160401a.remove(meetingCacheEntity);
                }
                if (status != Participant.Status.IDLE) {
                    this.f160401a.add(new MeetingCacheEntity(videoChat, status));
                }
                m248811d();
            }
        }
    }
}

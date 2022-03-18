package com.ss.android.vc.meeting.framework.manager;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.C60998v;
import com.ss.android.vc.entity.MeetingConfig;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.C61345k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.framework.manager.b */
public class C61274b {
    /* renamed from: a */
    public static void m238402a(C60998v vVar) {
        C60700b.m235851b("CreateMeetingUtil", "[create]", "createParams = " + vVar);
        if (vVar != null) {
            C61345k kVar = new C61345k();
            kVar.mo212339a(vVar);
            int i = vVar.f152836a;
            if (i == 2000) {
                ArrayList arrayList = new ArrayList();
                Participant participant = new Participant();
                participant.setId(vVar.f152837b);
                arrayList.add(participant);
                VideoChat videoChat = new VideoChat();
                videoChat.setCreatingId(C61281d.m238421a());
                videoChat.setType(VideoChat.Type.CALL);
                videoChat.setVoiceCall(vVar.f152852q);
                videoChat.setParticipants(arrayList);
                MeetingManager.m238341a().mo211891a(C61344j.m239002a().mo212329a(100).mo212330a(videoChat).mo212332a(kVar));
            } else if (i == 2001) {
                String str = vVar.f152843h;
                List<String> list = (List) vVar.f152844i;
                boolean z = vVar.f152845j;
                String str2 = vVar.f152846k;
                int i2 = vVar.f152848m;
                ArrayList arrayList2 = new ArrayList(list.size());
                for (String str3 : list) {
                    Participant participant2 = new Participant();
                    participant2.setId(str3);
                    arrayList2.add(participant2);
                }
                C60700b.m235851b("CreateMeetingUtil", "[create2]", "[dispatch] groupid = " + str + ", participants = " + arrayList2 + ", share = " + z + " event=VC_TYPE_MULTI, topic = " + str2 + ", sdkType = " + i2);
                VideoChat videoChat2 = new VideoChat();
                videoChat2.setCreatingId(C61281d.m238421a());
                videoChat2.setVendorType(VideoChat.VendorType.forNumber(i2));
                videoChat2.setType(VideoChat.Type.MEET);
                videoChat2.setParticipants(arrayList2);
                videoChat2.setGroudId(str);
                try {
                    MeetingConfig meetingConfig = new MeetingConfig();
                    meetingConfig.isAudioOn = vVar.f152849n;
                    meetingConfig.isCameraOn = vVar.f152850o;
                    meetingConfig.isSpeakerOn = vVar.f152851p;
                    videoChat2.setMeetingConfig(meetingConfig);
                } catch (Exception unused) {
                    C60700b.m235864f("CreateMeetingUtil", "[create3]", "create vc with error params.");
                }
                MeetingManager.m238341a().mo211891a(C61344j.m239002a().mo212329a(100).mo212330a(videoChat2).mo212332a(kVar));
            }
        }
    }
}

package com.ss.android.vc.lark.chatbanner;

import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.Status;
import com.ss.android.vc.entity.VCMeetingAbbrInfo;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import java.util.List;

/* renamed from: com.ss.android.vc.lark.chatbanner.a */
public class C61086a {
    /* renamed from: a */
    public static int m237567a(VCMeetingAbbrInfo sVar) {
        List<VCParticipantAbbrInfo> g;
        boolean z;
        boolean z2;
        if (!(sVar == null || (g = sVar.mo210147g()) == null || g.isEmpty())) {
            String userId = VideoChatModuleDependency.getDependency().getUserId();
            if (userId != null) {
                z2 = false;
                z = false;
                for (VCParticipantAbbrInfo tVar : g) {
                    if (!(tVar == null || tVar.mo210170b() == null || tVar.mo210170b().getUserId() == null || !tVar.mo210170b().getUserId().equals(userId) || tVar.mo210169a() != Status.ON_THE_CALL)) {
                        if (VideoChatModuleDependency.m236629b().equals(tVar.mo210170b().getDeviceId())) {
                            z2 = true;
                            z = true;
                        } else {
                            z2 = true;
                        }
                    }
                }
            } else {
                z2 = false;
                z = false;
            }
            if (z) {
                return 2;
            }
            if (z2) {
                return 1;
            }
        }
        return 0;
    }
}

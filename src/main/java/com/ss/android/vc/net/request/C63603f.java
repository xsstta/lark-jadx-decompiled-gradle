package com.ss.android.vc.net.request;

import android.content.Intent;
import androidx.p034e.p035a.C0978a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatNoticeUpdate;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.entity.response.RejoinVideoChatEntity;

/* renamed from: com.ss.android.vc.net.request.f */
public class C63603f {
    /* renamed from: a */
    public static void m249425a(VideoChat videoChat) {
        if (videoChat != null) {
            m249429b(videoChat.getMsgInfo());
        }
    }

    /* renamed from: a */
    public static void m249427a(JoinMeetingEntity joinMeetingEntity) {
        if (joinMeetingEntity != null && joinMeetingEntity.f152600a == JoinMeetingEntity.Type.SUCCESS && joinMeetingEntity.f152601b != null) {
            m249429b(joinMeetingEntity.f152601b.getMsgInfo());
        }
    }

    /* renamed from: b */
    private static void m249429b(VcMsgInfo vcMsgInfo) {
        if (vcMsgInfo != null && vcMsgInfo.is_show && vcMsgInfo.type == VcMsgInfo.Type.TOAST) {
            C60738ac.m236031a(vcMsgInfo.message, (long) vcMsgInfo.expire);
        }
    }

    /* renamed from: a */
    public static void m249424a(VcMsgInfo vcMsgInfo) {
        C60700b.m235851b("VcMsgInfoUtils", "[sendTipsShow]", "sendTipsShow");
        Intent intent = new Intent("tips_show");
        intent.putExtra("message", vcMsgInfo);
        C0978a.m4782a(ar.m236694a()).mo4992a(intent);
    }

    /* renamed from: a */
    public static void m249426a(VideoChatNoticeUpdate videoChatNoticeUpdate) {
        C60700b.m235851b("VcMsgInfoUtils", "[sendTipsUpdate]", "sendTipsUpdate");
        Intent intent = new Intent("tips_update");
        intent.putExtra("message", videoChatNoticeUpdate);
        C0978a.m4782a(ar.m236694a()).mo4992a(intent);
    }

    /* renamed from: a */
    public static void m249428a(RejoinVideoChatEntity rejoinVideoChatEntity) {
        if (rejoinVideoChatEntity != null && rejoinVideoChatEntity.f152611a != null) {
            m249429b(rejoinVideoChatEntity.f152611a.getMsgInfo());
        }
    }
}

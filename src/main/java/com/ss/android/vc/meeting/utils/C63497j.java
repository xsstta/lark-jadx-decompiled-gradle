package com.ss.android.vc.meeting.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.service.VideoChatUIConfigService;

/* renamed from: com.ss.android.vc.meeting.utils.j */
public class C63497j {

    /* renamed from: com.ss.android.vc.meeting.utils.j$a */
    public interface AbstractC63498a {
        /* renamed from: a */
        void mo214951a(ByteviewUser byteviewUser);
    }

    /* renamed from: com.ss.android.vc.meeting.utils.j$b */
    public static class C63499b extends ClickableSpan {

        /* renamed from: a */
        private ByteviewUser f160424a;

        /* renamed from: b */
        private AbstractC63498a f160425b;

        public void onClick(View view) {
            AbstractC63498a aVar = this.f160425b;
            if (aVar != null) {
                aVar.mo214951a(this.f160424a);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setTypeface(Typeface.defaultFromStyle(1));
            textPaint.setColor(C60773o.m236126d(R.color.ud_N900));
            textPaint.setUnderlineText(false);
        }

        public C63499b(ByteviewUser byteviewUser, AbstractC63498a aVar) {
            this.f160424a = byteviewUser;
            this.f160425b = aVar;
        }
    }

    /* renamed from: a */
    public static boolean m248855a(Participant participant) {
        if (participant.getParticipantType() != ParticipantType.LARK_USER || participant.isGuest()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m248856a(VCParticipantAbbrInfo tVar) {
        if (tVar.mo210170b().getParticipantType() == ParticipantType.LARK_USER) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m248860d(C61303k kVar, ByteviewUser byteviewUser) {
        if (m248857a(kVar, byteviewUser) || m248858b(kVar, byteviewUser) || m248859c(kVar, byteviewUser)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m248858b(C61303k kVar, ByteviewUser byteviewUser) {
        VCLobbyParticipant a;
        if (kVar == null || byteviewUser == null || (a = kVar.mo212091I().mo212497d().mo212412a(byteviewUser)) == null || a.getParticipantType() != ParticipantType.LARK_USER || a.isGuest() || kVar.mo212089G() == ParticipantRole.INTERVIEWEE || !VideoChatUIConfigService.m249510m(kVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m248859c(C61303k kVar, ByteviewUser byteviewUser) {
        if (kVar == null || byteviewUser == null) {
            return false;
        }
        Participant a = kVar.mo212091I().mo212494b().mo212587a(byteviewUser);
        VCLobbyParticipant a2 = kVar.mo212091I().mo212497d().mo212412a(byteviewUser);
        if (a == null && a2 == null && byteviewUser.getParticipantType() == ParticipantType.LARK_USER && kVar.mo212089G() != ParticipantRole.INTERVIEWEE && VideoChatUIConfigService.m249510m(kVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m248857a(C61303k kVar, ByteviewUser byteviewUser) {
        Participant a;
        if (kVar == null || byteviewUser == null || (a = kVar.mo212091I().mo212494b().mo212587a(byteviewUser)) == null || a.getParticipantType() != ParticipantType.LARK_USER || a.isGuest() || kVar.mo212089G() == ParticipantRole.INTERVIEWEE || !VideoChatUIConfigService.m249510m(kVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m248853a(Activity activity, C61303k kVar, ByteviewUser byteviewUser) {
        if (C28460b.m104296a(activity)) {
            VideoChatModuleDependency.getDependency().startContactsProfileActivity(activity, byteviewUser.getUserId(), kVar.mo212056e().getVideoChatSettings().getTopic(), kVar.mo212055d(), kVar.mo212056e().getSponsorUser());
        }
        kVar.ae().mo213808a(activity, 0);
    }

    /* renamed from: a */
    public static void m248854a(Context context, String str, String str2, String str3, ByteviewUser byteviewUser) {
        VideoChatModuleDependency.getDependency().startContactsProfileActivity(context, str, str2, str3, byteviewUser);
    }
}

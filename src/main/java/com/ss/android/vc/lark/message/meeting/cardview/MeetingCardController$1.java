package com.ss.android.vc.lark.message.meeting.cardview;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;

/* access modifiers changed from: package-private */
public class MeetingCardController$1 extends XIGetDataCallback<OpenChatter> {

    /* renamed from: a */
    final /* synthetic */ VideoChatContent f153065a;

    /* renamed from: b */
    final /* synthetic */ Context f153066b;

    /* renamed from: c */
    final /* synthetic */ C61144c f153067c;

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        C60738ac.m236029a(errorResult.getDisplayMsg(UIHelper.getString(R.string.View_G_NoConnection)));
    }

    @XMethod
    public void onSuccess(OpenChatter openChatter) {
        ByteviewUser byteviewUser = new ByteviewUser();
        byteviewUser.setUserId(this.f153065a.meetingCard.sponsorId);
        byteviewUser.setParticipantType(ParticipantType.LARK_USER);
        C63497j.m248854a(this.f153066b, openChatter.getId(), this.f153065a.meetingCard.topic, this.f153065a.meetingCard.meetingId, byteviewUser);
    }

    MeetingCardController$1(C61144c cVar, VideoChatContent videoChatContent, Context context) {
        this.f153067c = cVar;
        this.f153065a = videoChatContent;
        this.f153066b = context;
    }
}

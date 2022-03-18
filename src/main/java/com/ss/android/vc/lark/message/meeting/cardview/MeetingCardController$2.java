package com.ss.android.vc.lark.message.meeting.cardview;

import android.app.Activity;
import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewLauncher;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.p3457e.C68296b;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public class MeetingCardController$2 implements XConsumer<MeetingCheckData> {

    /* renamed from: a */
    final /* synthetic */ C68296b f153068a;

    /* renamed from: b */
    final /* synthetic */ VideoChatContent f153069b;

    /* renamed from: c */
    final /* synthetic */ Context f153070c;

    /* renamed from: d */
    final /* synthetic */ Activity f153071d;

    /* renamed from: e */
    final /* synthetic */ String f153072e;

    /* renamed from: f */
    final /* synthetic */ String f153073f;

    /* renamed from: g */
    final /* synthetic */ C61144c f153074g;

    @XMethod
    public void accept(MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            TimeConsumeUtils.m248928a(this.f153068a);
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f153069b.meetingCard.topic);
            MeetingPreviewLauncher.showJoinPreviewPage(this.f153071d, UIHelper.mustacheFormat(this.f153070c.getResources().getString(R.string.View_M_VideoInterviewNameBraces), hashMap), this.f153072e, false, this.f153073f, bVar.mo219666c());
        }
    }

    MeetingCardController$2(C61144c cVar, C68296b bVar, VideoChatContent videoChatContent, Context context, Activity activity, String str, String str2) {
        this.f153074g = cVar;
        this.f153068a = bVar;
        this.f153069b = videoChatContent;
        this.f153070c = context;
        this.f153071d = activity;
        this.f153072e = str;
        this.f153073f = str2;
    }
}

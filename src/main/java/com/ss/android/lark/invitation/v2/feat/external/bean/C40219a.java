package com.ss.android.lark.invitation.v2.feat.external.bean;

import android.text.TextUtils;
import com.bytedance.lark.pb.im.v2.GetContactTokenResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.bean.a */
public class C40219a {

    /* renamed from: a */
    public ErrorResult f102188a;

    /* renamed from: b */
    private InvitationInfo f102189b;

    /* renamed from: c */
    private InvitationInfo f102190c;

    /* renamed from: b */
    public String mo145912b() {
        InvitationInfo invitationInfo = this.f102190c;
        if (invitationInfo != null) {
            return invitationInfo.invMsg;
        }
        return "";
    }

    /* renamed from: c */
    public String mo145914c() {
        InvitationInfo invitationInfo = this.f102190c;
        if (invitationInfo != null) {
            return invitationInfo.uniqueId;
        }
        return "";
    }

    /* renamed from: a */
    public String mo145910a() {
        String str;
        InvitationInfo invitationInfo = this.f102190c;
        if (invitationInfo != null) {
            str = invitationInfo.invMsg;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        InvitationInfo invitationInfo2 = this.f102189b;
        if (invitationInfo2 != null) {
            return invitationInfo2.invMsg;
        }
        return "";
    }

    /* renamed from: a */
    public void mo145911a(InvitationInfo invitationInfo) {
        this.f102189b = invitationInfo;
    }

    /* renamed from: b */
    public void mo145913b(InvitationInfo invitationInfo) {
        this.f102190c = invitationInfo;
    }

    /* renamed from: a */
    public static C40219a m159394a(ErrorResult errorResult) {
        C40219a aVar = new C40219a();
        aVar.f102188a = errorResult;
        return aVar;
    }

    /* renamed from: a */
    public InvitationInfo mo145909a(String str) {
        if (TextUtils.equals("qr_code", str)) {
            return this.f102189b;
        }
        return this.f102190c;
    }

    /* renamed from: a */
    public static C40219a m159393a(GetContactTokenResponse getContactTokenResponse) {
        if (getContactTokenResponse == null) {
            return new C40219a();
        }
        C40219a aVar = new C40219a();
        aVar.mo145911a(InvitationInfo.parseFromPb(getContactTokenResponse.qr_code));
        aVar.mo145913b(InvitationInfo.parseFromPb(getContactTokenResponse.link));
        return aVar;
    }
}

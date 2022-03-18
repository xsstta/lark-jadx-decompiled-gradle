package com.ss.android.lark.invitation.v2.p2052c;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.util.C40145x;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.edu.bean.EduInvitation;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.c.a */
public class C40157a {
    /* renamed from: a */
    private static List<ShareActionType> m159176a(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ShareActionType.WX);
        arrayList.add(ShareActionType.WB);
        arrayList.add(ShareActionType.QQ);
        if (!z) {
            arrayList.add(ShareActionType.COPY);
        }
        arrayList.add(ShareActionType.SYS);
        return arrayList;
    }

    /* renamed from: a */
    public static void m159181a(Context context, String str) {
        C55761a.m215990a(context, str);
    }

    /* renamed from: a */
    public static void m159182a(Context context, String str, String str2) {
        C55761a.m215991a(context, str, str2);
    }

    /* renamed from: a */
    public static void m159177a(Context context, Bitmap bitmap, OnShareCallback onShareCallback) {
        m159178a(context, bitmap, "lark.invite.external.qrcode", m159176a(true), onShareCallback);
    }

    /* renamed from: b */
    public static void m159185b(Context context, Bitmap bitmap, OnShareCallback onShareCallback) {
        m159178a(context, bitmap, "lark.invite.member.qrcode", m159176a(true), onShareCallback);
    }

    /* renamed from: c */
    public static void m159188c(Context context, Bitmap bitmap, OnShareCallback onShareCallback) {
        m159178a(context, bitmap, "lark.invite.b2b.qrcode", m159176a(true), onShareCallback);
    }

    /* renamed from: d */
    public static void m159189d(Context context, Bitmap bitmap, OnShareCallback onShareCallback) {
        m159178a(context, bitmap, "lark.invite.parent.qrcode", m159176a(true), onShareCallback);
    }

    /* renamed from: e */
    public static void m159190e(Context context, Bitmap bitmap, OnShareCallback onShareCallback) {
        m159178a(context, bitmap, "lark.invite.member.qrcode.wx", Collections.singletonList(ShareActionType.WX), onShareCallback);
    }

    /* renamed from: a */
    public static void m159179a(Context context, EduInvitation aVar, OnShareCallback onShareCallback) {
        m159184a(context, aVar.mo145784g(), aVar.mo145785h(), aVar.mo145778a(), "lark.invite.parent.link", m159176a(false), null, onShareCallback);
    }

    /* renamed from: b */
    public static void m159186b(Context context, EduInvitation aVar, OnShareCallback onShareCallback) {
        m159184a(context, aVar.mo145784g(), aVar.mo145785h(), aVar.mo145778a(), "lark.invite.parent.link.wx", Collections.singletonList(ShareActionType.WX), null, onShareCallback);
    }

    /* renamed from: b */
    public static void m159187b(Context context, MemberInvitationInfo memberInvitationInfo, OnShareCallback onShareCallback) {
        m159184a(context, memberInvitationInfo.getShareTitle(), memberInvitationInfo.getTeamCodeMsg(), memberInvitationInfo.invUrl, "lark.invite.member.teamcode", m159176a(false), new ShareEntity.TextDowngradePanel(C40145x.m159158a(R.string.Lark_Invitation_TeamCodeShareTitle), memberInvitationInfo.getTeamCodeMsg()), onShareCallback);
    }

    /* renamed from: a */
    public static void m159180a(Context context, MemberInvitationInfo memberInvitationInfo, OnShareCallback onShareCallback) {
        m159184a(context, memberInvitationInfo.getShareTitle(), memberInvitationInfo.getLinkMsg(), memberInvitationInfo.invUrl, "lark.invite.member.link", m159176a(false), new ShareEntity.TextDowngradePanel(C40145x.m159158a(R.string.Lark_Invitation_InviteViaWeChat_TeamLinkCopied), memberInvitationInfo.getLinkMsg()), onShareCallback);
    }

    /* renamed from: a */
    private static void m159178a(Context context, Bitmap bitmap, String str, List<ShareActionType> list, OnShareCallback onShareCallback) {
        C40147z.m159160a().getThirdShareDependency().mo145592a(context, new ShareEntity.C55696a(bitmap).mo189775b(str).mo189768a(list).mo189764a(onShareCallback).mo189769a());
    }

    /* renamed from: a */
    public static void m159183a(Context context, String str, String str2, String str3, OnShareCallback onShareCallback) {
        m159184a(context, str, str2, str3, "lark.invite.external.link", m159176a(false), new ShareEntity.TextDowngradePanel(UIHelper.getString(R.string.Lark_Invitation_InviteViaWeChat_InviteLinkCopied_Title), str2), onShareCallback);
    }

    /* renamed from: a */
    private static void m159184a(Context context, String str, String str2, String str3, String str4, List<ShareActionType> list, ShareEntity.TextDowngradePanel textDowngradePanel, OnShareCallback onShareCallback) {
        C40147z.m159160a().getThirdShareDependency().mo145592a(context, new ShareEntity.C55696a(str, str2, str3).mo189775b(str4).mo189768a(list).mo189766a(textDowngradePanel).mo189764a(onShareCallback).mo189769a());
    }
}

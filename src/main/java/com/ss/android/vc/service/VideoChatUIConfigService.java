package com.ss.android.vc.service;

import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.VCFeatureConfig;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61371a;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0019"}, d2 = {"Lcom/ss/android/vc/service/VideoChatUIConfigService;", "", "()V", "canStartMagicShare", "", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "isBrowseUserProfileEnabled", "isCopyMeetingLinkEnabled", "isEnterGroupEnabled", "isHostControlEnabled", "isInterpretationEnabled", "isInviteEnabled", "isLiveEnabled", "isNewCCMEnabled", "isPstnCallInEnabled", "isPstnCallOutEnabled", "isRecordEnabled", "isShareCardEnabled", "isSipCallInEnabled", "isSipCallOutEnabled", "isStartCCMEnabled", "isStartGoogleDriveEnabled", "isStartUniversalEnabled", "isUploadFileEnabled", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.service.d */
public final class VideoChatUIConfigService {

    /* renamed from: a */
    public static final VideoChatUIConfigService f160622a = new VideoChatUIConfigService();

    private VideoChatUIConfigService() {
    }

    @JvmStatic
    /* renamed from: g */
    public static final boolean m249504g(C61303k kVar) {
        VCFeatureConfig vCFeatureConfig;
        C61383d I;
        C61371a c;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null) {
            vCFeatureConfig = null;
        } else {
            vCFeatureConfig = c.mo212430d();
        }
        if (vCFeatureConfig != null) {
            return vCFeatureConfig.isHostControlEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: o */
    public static final boolean m249512o(C61303k kVar) {
        VCFeatureConfig vCFeatureConfig;
        C61383d I;
        C61371a c;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null) {
            vCFeatureConfig = null;
        } else {
            vCFeatureConfig = c.mo212430d();
        }
        if (vCFeatureConfig != null) {
            return vCFeatureConfig.isInterpretationEnable();
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m249498a(C61303k kVar) {
        VCFeatureConfig vCFeatureConfig;
        boolean z;
        boolean z2;
        C61383d I;
        C61371a c;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null) {
            vCFeatureConfig = null;
        } else {
            vCFeatureConfig = c.mo212430d();
        }
        if (kVar != null) {
            z = kVar.mo212098P();
        } else {
            z = false;
        }
        if (!C63634c.m249496b("byteview.meeting.android.live_meeting") || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (vCFeatureConfig == null) {
            return z2;
        }
        if (!vCFeatureConfig.isLiveEnabled() || !z2) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m249499b(C61303k kVar) {
        VCFeatureConfig vCFeatureConfig;
        boolean z;
        boolean z2;
        C61383d I;
        C61371a c;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null) {
            vCFeatureConfig = null;
        } else {
            vCFeatureConfig = c.mo212430d();
        }
        if (kVar != null) {
            z = kVar.mo212098P();
        } else {
            z = false;
        }
        if (!C63634c.m249496b("byteview.meeting.android.recording") || !VideoChatAdminSettings.m239414d() || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (vCFeatureConfig == null) {
            return z2;
        }
        if (!vCFeatureConfig.isRecordEnabled() || !z2) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m249502e(C61303k kVar) {
        VCFeatureConfig.Sip sip;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            sip = null;
        } else {
            sip = d.getSip();
        }
        boolean b = C63634c.m249496b("byteview.meeting.android.copysipinvitation");
        if (sip == null) {
            return b;
        }
        if (!sip.isSipCallInEnable() || !b) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: f */
    public static final boolean m249503f(C61303k kVar) {
        VCFeatureConfig.Sip sip;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            sip = null;
        } else {
            sip = d.getSip();
        }
        boolean b = C63634c.m249496b("byteview.meeting.android.invitesip");
        if (sip == null) {
            return b;
        }
        if (!sip.isSipCallOutEnable() || !b) {
            return false;
        }
        return true;
    }

    @JvmStatic
    /* renamed from: h */
    public static final boolean m249505h(C61303k kVar) {
        VCFeatureConfig.ShareMeeting shareMeeting;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            shareMeeting = null;
        } else {
            shareMeeting = d.getShareMeeting();
        }
        if (shareMeeting != null) {
            return shareMeeting.isInviteEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: i */
    public static final boolean m249506i(C61303k kVar) {
        VCFeatureConfig.ShareMeeting shareMeeting;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            shareMeeting = null;
        } else {
            shareMeeting = d.getShareMeeting();
        }
        if (shareMeeting != null) {
            return shareMeeting.isShareCardEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: j */
    public static final boolean m249507j(C61303k kVar) {
        VCFeatureConfig.ShareMeeting shareMeeting;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            shareMeeting = null;
        } else {
            shareMeeting = d.getShareMeeting();
        }
        if (shareMeeting != null) {
            return shareMeeting.isCopyMeetingLinkEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: k */
    public static final boolean m249508k(C61303k kVar) {
        VCFeatureConfig.MagicShare magicShare;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            magicShare = null;
        } else {
            magicShare = d.getMagicShare();
        }
        if (magicShare != null) {
            return magicShare.isNewCCMEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: l */
    public static final boolean m249509l(C61303k kVar) {
        VCFeatureConfig.MagicShare magicShare;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            magicShare = null;
        } else {
            magicShare = d.getMagicShare();
        }
        if (magicShare == null || magicShare.isStartCCMEnabled() || magicShare.isStartGoogleDriveEnabled() || magicShare.isNewCCMEnabled()) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: m */
    public static final boolean m249510m(C61303k kVar) {
        VCFeatureConfig.RelationChain relationChain;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            relationChain = null;
        } else {
            relationChain = d.getRelationChain();
        }
        if (relationChain != null) {
            return relationChain.isBrowseUserProfileEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: n */
    public static final boolean m249511n(C61303k kVar) {
        VCFeatureConfig.RelationChain relationChain;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            relationChain = null;
        } else {
            relationChain = d.getRelationChain();
        }
        if (relationChain != null) {
            return relationChain.isEnterGroupEnabled();
        }
        return true;
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m249500c(C61303k kVar) {
        boolean z;
        VCFeatureConfig.Pstn pstn;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        C61383d I2;
        C61371a c2;
        AdminSettings b;
        if (kVar == null || (I2 = kVar.mo212091I()) == null || (c2 = I2.mo212496c()) == null || (b = c2.mo212427b()) == null) {
            z = true;
        } else {
            z = b.pstnEnableIncomingCall;
        }
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            pstn = null;
        } else {
            pstn = d.getPstn();
        }
        boolean b2 = C63634c.m249496b("byteview.meeting.android.copyinvitation");
        if (pstn != null) {
            if (!pstn.isPstnCallInEnabled() || !b2 || !z) {
                return false;
            }
            return true;
        } else if (!b2 || !z) {
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m249501d(C61303k kVar) {
        boolean z;
        VCFeatureConfig.Pstn pstn;
        C61383d I;
        C61371a c;
        VCFeatureConfig d;
        C61383d I2;
        C61371a c2;
        AdminSettings b;
        if (kVar == null || (I2 = kVar.mo212091I()) == null || (c2 = I2.mo212496c()) == null || (b = c2.mo212427b()) == null) {
            z = true;
        } else {
            z = b.pstnEnableOutgoingCall;
        }
        if (kVar == null || (I = kVar.mo212091I()) == null || (c = I.mo212496c()) == null || (d = c.mo212430d()) == null) {
            pstn = null;
        } else {
            pstn = d.getPstn();
        }
        boolean b2 = C63634c.m249496b("byteview.meeting.android.invitepstn");
        if (pstn != null) {
            if (!pstn.isPstnCallOutEnabled() || !b2 || !z) {
                return false;
            }
            return true;
        } else if (!b2 || !z) {
            return false;
        } else {
            return true;
        }
    }
}

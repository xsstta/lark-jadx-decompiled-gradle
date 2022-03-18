package com.ss.android.vc.net.service;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.RtcDnsInfo;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.net.request.VcBizSender;

public class VCSyncGetService {
    private static volatile RtcDnsInfo sRtcDnsInfo;
    private static volatile ViewDeviceSetting sViewDeviceSetting;

    public static void initSyncGetCache() {
        if (sViewDeviceSetting == null || sRtcDnsInfo == null) {
            C60735ab.m236018e($$Lambda$VCSyncGetService$DNg8XTCRpwYIwXjJqMpfYKLk_HY.INSTANCE);
        }
    }

    public static void reInitViewDeviceSetting() {
        $$Lambda$VCSyncGetService$GTIINIUxxt7a5mT3oRjB15K3eOo r0 = $$Lambda$VCSyncGetService$GTIINIUxxt7a5mT3oRjB15K3eOo.INSTANCE;
        if (C60735ab.m236014c()) {
            C60735ab.m236018e(r0);
        } else {
            r0.run();
        }
    }

    public static RtcDnsInfo getRtcDnsInfo() {
        if (sRtcDnsInfo != null) {
            C60700b.m235851b("VCSyncGetService", "[getViewDeviceSetting2]", "fetch remote: rtcDnsInfo = " + sRtcDnsInfo);
        } else {
            $$Lambda$VCSyncGetService$tNLCxI4n8WbNQ8jIscp31boXaxE r0 = $$Lambda$VCSyncGetService$tNLCxI4n8WbNQ8jIscp31boXaxE.INSTANCE;
            if (C60735ab.m236014c()) {
                C60735ab.m236018e(r0);
            } else {
                r0.run();
            }
        }
        return sRtcDnsInfo;
    }

    public static ViewDeviceSetting getViewDeviceSetting() {
        if (sViewDeviceSetting == null || sViewDeviceSetting.video == null) {
            C60700b.m235851b("VCSyncGetService", "[getViewDeviceSetting]", "no cache");
            $$Lambda$VCSyncGetService$z3LCqFZ5bOp6uP2up2esQyrXjIQ r0 = $$Lambda$VCSyncGetService$z3LCqFZ5bOp6uP2up2esQyrXjIQ.INSTANCE;
            if (C60735ab.m236014c()) {
                C60735ab.m236018e(r0);
            } else {
                r0.run();
            }
        } else {
            C60700b.m235851b("VCSyncGetService", "[getViewDeviceSetting]", "in cache: viewDeviceSetting = " + sViewDeviceSetting);
        }
        return sViewDeviceSetting;
    }

    static /* synthetic */ void lambda$getRtcDnsInfo$3() {
        synchronized (VCSyncGetService.class) {
            RtcDnsInfo rtcDns = VcBizSender.getRtcDns();
            C60700b.m235851b("VCSyncGetService", "[getViewDeviceSetting2]", "fetch remote: rtcDnsInfo = " + rtcDns);
            sRtcDnsInfo = rtcDns;
        }
    }

    static /* synthetic */ void lambda$getViewDeviceSetting$2() {
        synchronized (VCSyncGetService.class) {
            ViewDeviceSetting syncGetViewUserSetting = VcBizSender.syncGetViewUserSetting();
            C60700b.m235851b("VCSyncGetService", "[getViewDeviceSetting2]", "fetch remote: viewDeviceSetting = " + syncGetViewUserSetting);
            if (!(syncGetViewUserSetting == null || syncGetViewUserSetting.video == null)) {
                sViewDeviceSetting = syncGetViewUserSetting;
            }
        }
    }

    static /* synthetic */ void lambda$initSyncGetCache$0() {
        synchronized (VCSyncGetService.class) {
            if (sViewDeviceSetting == null) {
                sViewDeviceSetting = VcBizSender.syncGetViewUserSetting();
                C60700b.m235851b("VCSyncGetService", "[initSyncGetCache]", "ViewDeviceSetting cache success");
            }
            if (sRtcDnsInfo == null) {
                sRtcDnsInfo = VcBizSender.getRtcDns();
                C60700b.m235851b("VCSyncGetService", "[initSyncGetCache2]", "RtcDnsInfo cache success");
            }
        }
    }

    static /* synthetic */ void lambda$reInitViewDeviceSetting$1() {
        synchronized (VCSyncGetService.class) {
            ViewDeviceSetting syncGetViewUserSetting = VcBizSender.syncGetViewUserSetting();
            C60700b.m235851b("VCSyncGetService", "[getViewDeviceSetting2]", "fetch remote: viewDeviceSetting = " + syncGetViewUserSetting);
            sViewDeviceSetting = syncGetViewUserSetting;
        }
    }

    public static void setViewDeviceSetting(ViewDeviceSetting viewDeviceSetting) {
        if (viewDeviceSetting != null && viewDeviceSetting.video != null) {
            synchronized (VCSyncGetService.class) {
                sViewDeviceSetting = viewDeviceSetting;
                VcBizSender.m249148a(viewDeviceSetting).mo219896d();
                C60700b.m235851b("VCSyncGetService", "[setViewDeviceSetting]", "in cache: viewDeviceSetting = " + viewDeviceSetting);
            }
        }
    }
}

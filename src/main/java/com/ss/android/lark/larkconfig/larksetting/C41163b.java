package com.ss.android.lark.larkconfig.larksetting;

import com.ss.android.lark.larkconfig.larksetting.handler.browser.PendingShowReStartDialogConfigHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.chat.ReactionSampleSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.chat.ReadSampleSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.C41176a;
import com.ss.android.lark.larkconfig.larksetting.handler.customnav.NavDataSource;
import com.ss.android.lark.larkconfig.larksetting.handler.helpdesk.C41196a;
import com.ss.android.lark.larkconfig.larksetting.handler.magic.UGMagicConfigEventFilterHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.monitor.PushMonitorConfigHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.p2107a.C41170a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2111e.C41185a;
import com.ss.android.lark.larkconfig.larksetting.handler.p2112f.C41187a;
import com.ss.android.lark.larkconfig.larksetting.handler.ugbanner.UGBannerConfig;
import com.ss.android.lark.larkconfig.larksetting.handler.ugbanner.UGBannerSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.b */
public class C41163b {
    /* renamed from: g */
    public void mo148453g() {
        C41187a.m163400f();
    }

    /* renamed from: j */
    public String mo148456j() {
        return ReadSampleSettingHandler.f104963a.mo136183d();
    }

    /* renamed from: k */
    public String mo148457k() {
        return ReactionSampleSettingHandler.f104962a.mo136183d();
    }

    /* renamed from: l */
    public String mo148458l() {
        return PushMonitorConfigHandler.f104982a.mo136183d();
    }

    /* renamed from: m */
    public long mo148459m() {
        return PendingShowReStartDialogConfigHandler.f104958a.mo136183d();
    }

    /* renamed from: a */
    public static AbstractC41162a m163326a() {
        return (AbstractC41162a) ApiUtils.getApi(AbstractC41162a.class);
    }

    /* renamed from: b */
    public String mo148448b() {
        return C41196a.m163419d().mo107775e().getHelpdeskMiniProgramAppId();
    }

    /* renamed from: c */
    public String mo148449c() {
        return C41196a.m163419d().mo107775e().getFeiShuMiniAppLink();
    }

    /* renamed from: d */
    public Boolean mo148450d() {
        return C41176a.m163374b().mo148480c();
    }

    /* renamed from: f */
    public String mo148452f() {
        return UGMagicConfigEventFilterHandler.m163423e().mo136183d();
    }

    /* renamed from: h */
    public int mo148454h() {
        return C41185a.m163389d().mo107775e();
    }

    /* renamed from: i */
    public String mo148455i() {
        return C41185a.m163389d().mo107776f();
    }

    /* renamed from: e */
    public List<String> mo148451e() {
        UGBannerConfig d = UGBannerSettingHandler.f104990a.mo136183d();
        if (d == null) {
            return Collections.emptyList();
        }
        List<String> supportSource = d.getSupportSource();
        if (supportSource == null || supportSource.isEmpty()) {
            return Collections.emptyList();
        }
        return supportSource;
    }

    /* renamed from: a */
    public String mo148445a(NavDataSource navDataSource) {
        return C41176a.m163374b().mo148477a(navDataSource);
    }

    /* renamed from: a */
    public void mo148447a(boolean z) {
        C41176a.m163374b().mo148479a(z);
    }

    /* renamed from: a */
    public void mo148446a(String str, NavDataSource navDataSource) {
        C41176a.m163374b().mo148478a(str, navDataSource);
    }

    /* renamed from: a */
    public <T> T mo148444a(String str, Class<T> cls, T t) {
        return (T) C41170a.m163359a(str, cls, t);
    }
}

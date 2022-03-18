package com.ss.android.lark.live.settings;

import android.text.TextUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.settings.MmFeatureSettingConfig;
import com.ss.android.lark.mm.settings.MmSettingsConfig;
import com.ss.android.lark.mm.settings.MmTTDNSServerHostConfig;
import com.ss.android.lark.mm.settings.MmVideoEngineConfig;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.live.settings.a */
public class C41524a {

    /* renamed from: a */
    private C41525b<VcLiveSettingConfig> f105554a = new C41525b<>(1800000);

    /* renamed from: b */
    private C41525b<MmFeatureSettingConfig> f105555b = new C41525b<>(300000);

    /* renamed from: c */
    private C41525b<MmTTDNSServerHostConfig> f105556c = new C41525b<>(300000);

    /* renamed from: d */
    private C41525b<MmSettingsConfig> f105557d = new C41525b<>(300000);

    /* renamed from: e */
    private C41525b<MmVideoEngineConfig> f105558e = new C41525b<>(300000);

    /* renamed from: f */
    private ConcurrentHashMap<String, MmSettingsConfig> f105559f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private VcLiveSettingConfig m164780g() {
        return VcLiveSettingConfig.parse(C45899c.m181859a().getDomainDepend().mo144622g());
    }

    /* renamed from: h */
    private MmSettingsConfig m164781h() {
        MmSettingsConfig parser = MmSettingsConfig.parser(C45899c.m181859a().getDomainDepend().mo144621f());
        if (parser != null) {
            return parser;
        }
        return MmSettingsConfig.C47078a.m186368a();
    }

    /* renamed from: i */
    private MmFeatureSettingConfig m164782i() {
        MmFeatureSettingConfig parse = MmFeatureSettingConfig.parse(C45899c.m181859a().getSettingDepend().mo144662a("vc_inno_feature_and_performance_config"));
        if (parse != null) {
            return parse;
        }
        return MmFeatureSettingConfig.C47077a.m186367a();
    }

    /* renamed from: j */
    private MmTTDNSServerHostConfig m164783j() {
        MmTTDNSServerHostConfig parse = MmTTDNSServerHostConfig.parse(C45899c.m181859a().getSettingDepend().mo144662a("setTTDNSServerHost"));
        if (parse != null) {
            return parse;
        }
        return MmTTDNSServerHostConfig.C47080a.m186378a();
    }

    /* renamed from: k */
    private MmVideoEngineConfig m164784k() {
        MmVideoEngineConfig parse = MmVideoEngineConfig.parse(C45899c.m181859a().getSettingDepend().mo144662a("video_engine_config"));
        if (parse != null) {
            return parse;
        }
        return MmVideoEngineConfig.C47081a.m186379a();
    }

    /* renamed from: d */
    public MmFeatureSettingConfig mo149415d() {
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        MmFeatureSettingConfig a2 = this.f105555b.mo149422a(a);
        if (a2 != null) {
            return a2;
        }
        MmFeatureSettingConfig i = m164782i();
        this.f105555b.mo149423a(i, a);
        return i;
    }

    /* renamed from: e */
    public MmTTDNSServerHostConfig mo149417e() {
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        MmTTDNSServerHostConfig a2 = this.f105556c.mo149422a(a);
        if (a2 != null) {
            return a2;
        }
        MmTTDNSServerHostConfig j = m164783j();
        this.f105556c.mo149423a(j, a);
        return j;
    }

    /* renamed from: f */
    public MmVideoEngineConfig mo149419f() {
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        MmVideoEngineConfig a2 = this.f105558e.mo149422a(a);
        if (a2 != null) {
            return a2;
        }
        MmVideoEngineConfig k = m164784k();
        this.f105558e.mo149423a(k, a);
        return k;
    }

    /* renamed from: a */
    public VcLiveSettingConfig mo149409a() {
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        VcLiveSettingConfig a2 = this.f105554a.mo149422a(a);
        if (a2 == null && (a2 = m164780g()) != null) {
            this.f105554a.mo149423a(a2, a);
        }
        return a2;
    }

    /* renamed from: c */
    public synchronized MmSettingsConfig mo149413c() {
        MmSettingsConfig mmSettingsConfig;
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        if (a == null) {
            a = "";
        }
        mmSettingsConfig = this.f105559f.get(a);
        if (mmSettingsConfig != null) {
            C45855f.m181664c("VcInnoSettings", "[getMmSettingConfig] hit mmUrlPatterCache");
        }
        if (mmSettingsConfig == null) {
            mmSettingsConfig = this.f105557d.mo149422a(a);
        }
        if (mmSettingsConfig == null) {
            mmSettingsConfig = m164781h();
            this.f105557d.mo149423a(mmSettingsConfig, a);
        }
        return mmSettingsConfig;
    }

    /* renamed from: b */
    public synchronized void mo149411b() {
        C45855f.m181664c("VcInnoSettings", "[preloadSettings] start");
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        if (a == null) {
            a = "";
        }
        this.f105559f.put(a, m164781h());
        C45855f.m181664c("VcInnoSettings", "[preloadSettings] end, cache size: " + this.f105559f.size());
    }

    /* renamed from: b */
    public boolean mo149412b(String str) {
        C45855f.m181664c("VcInnoSettings", "[isMmUrlMatch] enter");
        boolean a = mo149413c().getSettingHelper().mo165352a(str);
        C45855f.m181664c("VcInnoSettings", "[isMmUrlMatch] result is " + a);
        return a;
    }

    /* renamed from: d */
    public boolean mo149416d(String str) {
        C45855f.m181664c("VcInnoSettings", "[isHomeList] enter");
        boolean b = mo149413c().getSettingHelper().mo165353b(str);
        C45855f.m181664c("VcInnoSettings", "[isHomeList] result is " + b);
        return b;
    }

    /* renamed from: e */
    public boolean mo149418e(String str) {
        C45855f.m181664c("VcInnoSettings", "[isMyList] enter");
        boolean d = mo149413c().getSettingHelper().mo165355d(str);
        C45855f.m181664c("VcInnoSettings", "[isMyList] result is " + d);
        return d;
    }

    /* renamed from: f */
    public boolean mo149420f(String str) {
        C45855f.m181664c("VcInnoSettings", "[isShareList] enter");
        boolean e = mo149413c().getSettingHelper().mo165356e(str);
        C45855f.m181664c("VcInnoSettings", "[isShareList] result is " + e);
        return e;
    }

    /* renamed from: g */
    public boolean mo149421g(String str) {
        C45855f.m181664c("VcInnoSettings", "[isTrashList] enter");
        boolean c = mo149413c().getSettingHelper().mo165354c(str);
        C45855f.m181664c("VcInnoSettings", "[isTrashList] result is " + c);
        return c;
    }

    /* renamed from: a */
    public boolean mo149410a(String str) {
        C45855f.m181664c("VcInnoSettings", "[isVcLiveUrl] enter");
        if (TextUtils.isEmpty(C45899c.m181859a().getLoginDepend().mo144647a())) {
            C45855f.m181664c("VcInnoSettings", "[isVcLiveUrl2] loginUserId is null");
            return false;
        }
        VcLiveSettingConfig a = mo149409a();
        if (a == null) {
            return false;
        }
        boolean a2 = a.getSettingHelper().mo149407a(str);
        C45855f.m181664c("VcInnoSettings", "[isVcLiveUrl3] result is " + a2);
        return a2;
    }

    /* renamed from: c */
    public boolean mo149414c(String str) {
        C45855f.m181664c("VcInnoSettings", "[isMmList] enter");
        boolean g = mo149413c().getSettingHelper().mo165358g(str);
        C45855f.m181664c("VcInnoSettings", "[isMmList] result is " + g);
        return g;
    }
}

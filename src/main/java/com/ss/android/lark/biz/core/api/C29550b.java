package com.ss.android.lark.biz.core.api;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.biz.core.api.b */
public class C29550b {
    @JSONField(name = "maxMemberCount")

    /* renamed from: a */
    private int f73957a;
    @JSONField(name = "maxRecallTime")

    /* renamed from: b */
    private long f73958b;
    @JSONField(name = "vcHeartBeatCycle")

    /* renamed from: c */
    private int f73959c;
    @JSONField(name = "vcHeartBeatExpire")

    /* renamed from: d */
    private int f73960d;
    @JSONField(name = "domain")

    /* renamed from: e */
    private String f73961e;
    @JSONField(name = "docsDomains")

    /* renamed from: f */
    private List<String> f73962f;
    @JSONField(name = "createDocsUrl")

    /* renamed from: g */
    private String f73963g;
    @JSONField(name = "addresses")

    /* renamed from: h */
    private Map<String, String> f73964h;
    @JSONField(name = "customerServiceUrl")

    /* renamed from: i */
    private String f73965i;
    @JSONField(name = "onCallChat")

    /* renamed from: j */
    private boolean f73966j;
    @JSONField(name = "androidAppStores")

    /* renamed from: k */
    private List<String> f73967k;
    @JSONField(name = "guideToRateDelayHours")

    /* renamed from: l */
    private int f73968l = -1;
    @JSONField(name = "isAutoTranslateEnable")

    /* renamed from: m */
    private boolean f73969m;
    @JSONField(name = "isRedPacketEnable")

    /* renamed from: n */
    private boolean f73970n;
    @JSONField(name = "secretChatEnable")

    /* renamed from: o */
    private boolean f73971o;
    @JSONField(name = "recallGroupChatterValidLimit")

    /* renamed from: p */
    private int f73972p = -1;
    @JSONField(name = "externalSearches")

    /* renamed from: q */
    private List<ExternalSearchConfig> f73973q;
    @JSONField(name = "notificationBannerRefreshTime")

    /* renamed from: r */
    private long f73974r;
    @JSONField(name = "createExternalChatMaxMemberCount")

    /* renamed from: s */
    private int f73975s;
    @JSONField(name = "urlRegex")

    /* renamed from: t */
    private Map<Integer, String> f73976t = new HashMap();
    @JSONField(name = "cryptoChatState")

    /* renamed from: u */
    private int f73977u = 3;

    /* renamed from: b */
    public String mo105631b() {
        return this.f73965i;
    }

    /* renamed from: d */
    public List<String> mo105643d() {
        return this.f73967k;
    }

    /* renamed from: e */
    public int mo105647e() {
        return this.f73968l;
    }

    /* renamed from: h */
    public boolean mo105653h() {
        return this.f73971o;
    }

    /* renamed from: i */
    public int mo105654i() {
        return this.f73972p;
    }

    /* renamed from: j */
    public long mo105655j() {
        return this.f73974r;
    }

    /* renamed from: k */
    public int mo105656k() {
        return this.f73975s;
    }

    /* renamed from: l */
    public Map<Integer, String> mo105657l() {
        return this.f73976t;
    }

    /* renamed from: m */
    public int mo105658m() {
        return this.f73977u;
    }

    /* renamed from: f */
    public boolean mo105650f() {
        return this.f73969m;
    }

    /* renamed from: g */
    public boolean mo105652g() {
        return this.f73970n;
    }

    /* renamed from: a */
    public List<String> mo105625a() {
        List<String> list = this.f73962f;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    /* renamed from: c */
    public boolean mo105642c() {
        return this.f73966j;
    }

    /* renamed from: a */
    public void mo105626a(int i) {
        this.f73957a = i;
    }

    /* renamed from: c */
    public void mo105638c(int i) {
        this.f73960d = i;
    }

    /* renamed from: f */
    public void mo105649f(int i) {
        this.f73975s = i;
    }

    /* renamed from: g */
    public void mo105651g(int i) {
        this.f73977u = i;
    }

    /* renamed from: a */
    public void mo105627a(long j) {
        this.f73958b = j;
    }

    /* renamed from: b */
    public void mo105632b(int i) {
        this.f73959c = i;
    }

    /* renamed from: c */
    public void mo105639c(String str) {
        this.f73963g = str;
    }

    /* renamed from: d */
    public void mo105644d(int i) {
        this.f73968l = i;
    }

    /* renamed from: e */
    public void mo105648e(int i) {
        this.f73972p = i;
    }

    /* renamed from: a */
    public String mo105624a(String str) {
        Map<String, String> map = this.f73964h;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public void mo105633b(long j) {
        this.f73974r = j;
    }

    /* renamed from: c */
    public void mo105640c(List<ExternalSearchConfig> list) {
        this.f73973q = list;
    }

    /* renamed from: d */
    public void mo105645d(String str) {
        this.f73965i = str;
    }

    /* renamed from: b */
    public void mo105634b(String str) {
        this.f73961e = str;
    }

    /* renamed from: c */
    public void mo105641c(boolean z) {
        this.f73970n = z;
    }

    /* renamed from: d */
    public void mo105646d(boolean z) {
        this.f73971o = z;
    }

    /* renamed from: a */
    public void mo105628a(List<String> list) {
        this.f73962f = list;
    }

    /* renamed from: b */
    public void mo105635b(List<String> list) {
        this.f73967k = list;
    }

    /* renamed from: a */
    public void mo105629a(Map<String, String> map) {
        this.f73964h = map;
    }

    /* renamed from: b */
    public void mo105636b(Map<Integer, String> map) {
        this.f73976t = map;
    }

    /* renamed from: a */
    public void mo105630a(boolean z) {
        this.f73966j = z;
    }

    /* renamed from: b */
    public void mo105637b(boolean z) {
        this.f73969m = z;
    }
}

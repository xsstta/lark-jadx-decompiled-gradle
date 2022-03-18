package com.ss.android.lark.mail.impl.entity;

import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.client.v1.StorageLimitNotify;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.settings.C43391a;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.entity.f */
public class C42094f {

    /* renamed from: a */
    EngagementSettings f107053a;
    @SerializedName("notify")
    @Expose

    /* renamed from: b */
    private boolean f107054b;

    /* renamed from: c */
    private boolean f107055c;

    /* renamed from: d */
    private int f107056d;

    /* renamed from: e */
    private EmailSignature f107057e = new EmailSignature.C43549a().mo155488a();
    @SerializedName("smartInbox")
    @Expose

    /* renamed from: f */
    private C43391a f107058f = new C43391a.C43393a().mo155176a();
    @SerializedName("accountType")
    @Expose

    /* renamed from: g */
    private int f107059g = -1;

    /* renamed from: h */
    private boolean f107060h;

    /* renamed from: i */
    private boolean f107061i;
    @SerializedName("clientConfigs")
    @Expose

    /* renamed from: j */
    private List<MailClientConfig> f107062j;
    @SerializedName("accounts")
    @Expose

    /* renamed from: k */
    private EmailAliasList f107063k = new EmailAliasList();

    /* renamed from: l */
    private EmailAutoReply f107064l = new EmailAutoReply.C42059a(false, 0, 0, "").mo151154a();
    @SerializedName("revokeVisible")
    @Expose

    /* renamed from: m */
    private boolean f107065m = false;

    /* renamed from: n */
    private C42101o f107066n = null;
    @SerializedName("translationRecommendationSkipLanguage")
    @Expose

    /* renamed from: o */
    private List<String> f107067o;
    @SerializedName("replyLang")
    @Expose

    /* renamed from: p */
    private int f107068p = -1;
    @SerializedName("onBoardStatus")
    @Expose

    /* renamed from: q */
    private MailOnBoardStatus f107069q;

    /* renamed from: r */
    private StorageLimitNotify f107070r;

    /* renamed from: s */
    private boolean f107071s;

    /* renamed from: t */
    private boolean f107072t = true;

    /* renamed from: c */
    public EmailSignature mo151880c() {
        return this.f107057e;
    }

    /* renamed from: d */
    public C43391a mo151882d() {
        return this.f107058f;
    }

    /* renamed from: h */
    public EmailAutoReply mo151891h() {
        return this.f107064l;
    }

    /* renamed from: j */
    public EmailAliasList mo151896j() {
        return this.f107063k;
    }

    /* renamed from: k */
    public boolean mo151897k() {
        return this.f107065m;
    }

    /* renamed from: l */
    public C42101o mo151898l() {
        return this.f107066n;
    }

    /* renamed from: m */
    public EngagementSettings mo151899m() {
        return this.f107053a;
    }

    /* renamed from: n */
    public List<String> mo151900n() {
        return this.f107067o;
    }

    /* renamed from: p */
    public MailOnBoardStatus mo151902p() {
        return this.f107069q;
    }

    /* renamed from: q */
    public StorageLimitNotify mo151903q() {
        return this.f107070r;
    }

    /* renamed from: r */
    public boolean mo151904r() {
        return this.f107071s;
    }

    /* renamed from: s */
    public boolean mo151905s() {
        return this.f107072t;
    }

    /* renamed from: t */
    public boolean mo151906t() {
        return this.f107055c;
    }

    /* renamed from: u */
    public int mo151908u() {
        return this.f107056d;
    }

    /* renamed from: a */
    public boolean mo151875a() {
        return this.f107054b;
    }

    /* renamed from: e */
    public UserType mo151884e() {
        return UserType.fromValue(this.f107059g);
    }

    /* renamed from: f */
    public boolean mo151888f() {
        return this.f107060h;
    }

    /* renamed from: o */
    public ReplyLanguage mo151901o() {
        return ReplyLanguage.fromValue(this.f107068p);
    }

    /* renamed from: g */
    public List<MailClientConfig> mo151889g() {
        List<MailClientConfig> list = this.f107062j;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: b */
    public boolean mo151879b() {
        return this.f107061i;
    }

    /* renamed from: i */
    public MailClientConfig mo151894i() {
        List<MailClientConfig> list = this.f107062j;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f107062j.get(0);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f107054b), this.f107057e, this.f107058f, Integer.valueOf(this.f107059g), Boolean.valueOf(this.f107060h), Boolean.valueOf(this.f107061i), this.f107062j, this.f107063k, this.f107064l, this.f107066n, Boolean.valueOf(this.f107065m), this.f107053a, Integer.valueOf(this.f107068p), this.f107069q, this.f107070r, Boolean.valueOf(this.f107071s), Boolean.valueOf(this.f107072t), Boolean.valueOf(this.f107055c), Integer.valueOf(this.f107056d));
    }

    public String toString() {
        if (!C41816b.m166115a().mo150143j()) {
            return super.toString();
        }
        return "EmailSetting{mIsNotificationOpen=" + this.f107054b + ", mSignature=" + this.f107057e + ", mSmartInbox=" + this.f107058f + ", accountType=" + this.f107059g + ", clientTabVisible=" + this.f107060h + ", isSmartReplyOpen=" + this.f107061i + ", clientConfigs=" + this.f107062j + ", mAliasList=" + this.f107063k + ", mAutoReply=" + this.f107064l + ", revokeVisible=" + this.f107065m + ", undo=" + this.f107066n + ", engagementSettings=" + this.f107053a + ", replyLanguage=" + this.f107068p + ", onBoardStatus=" + this.f107069q + ", isShowApiOnBoardingPage=" + this.f107071s + ", enableConversationMode=" + this.f107072t + ", mIsNotificationAllOpen" + this.f107055c + ", mNotificationChannel" + this.f107056d + '}';
    }

    /* renamed from: a */
    public void mo151864a(int i) {
        this.f107068p = i;
    }

    /* renamed from: b */
    public void mo151876b(int i) {
        this.f107056d = i;
    }

    /* renamed from: e */
    public void mo151885e(boolean z) {
        this.f107060h = z;
    }

    /* renamed from: f */
    public void mo151887f(boolean z) {
        this.f107065m = z;
    }

    /* renamed from: g */
    public void mo151890g(boolean z) {
        this.f107071s = z;
    }

    /* renamed from: i */
    public void mo151895i(boolean z) {
        this.f107055c = z;
    }

    /* renamed from: a */
    public void mo151866a(StorageLimitNotify storageLimitNotify) {
        this.f107070r = storageLimitNotify;
    }

    /* renamed from: b */
    public void mo151877b(List<String> list) {
        this.f107067o = list;
    }

    /* renamed from: c */
    public void mo151881c(boolean z) {
        this.f107058f.mo155171b(z);
    }

    /* renamed from: d */
    public void mo151883d(boolean z) {
        this.f107058f.mo155169a(z);
    }

    /* renamed from: h */
    public void mo151892h(boolean z) {
        this.f107072t = z;
    }

    /* renamed from: a */
    public void mo151865a(Setting.UserType userType) {
        if (userType != null) {
            this.f107059g = userType.getValue();
        } else {
            this.f107059g = -1;
        }
    }

    /* renamed from: b */
    public void mo151878b(boolean z) {
        this.f107061i = z;
    }

    /* renamed from: a */
    public void mo151867a(EmailAliasList emailAliasList) {
        this.f107063k = emailAliasList;
    }

    /* renamed from: a */
    public void mo151868a(EmailAutoReply emailAutoReply) {
        this.f107064l = emailAutoReply;
    }

    /* renamed from: a */
    public void mo151869a(MailOnBoardStatus mailOnBoardStatus) {
        this.f107069q = mailOnBoardStatus;
    }

    /* renamed from: a */
    public void mo151870a(EngagementSettings gVar) {
        this.f107053a = gVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42094f fVar = (C42094f) obj;
        if (this.f107054b != fVar.f107054b || this.f107055c != fVar.f107055c || this.f107056d != fVar.f107056d || this.f107059g != fVar.f107059g || this.f107060h != fVar.f107060h || this.f107061i != fVar.f107061i || this.f107065m != fVar.f107065m || !Objects.equals(this.f107057e, fVar.f107057e) || !Objects.equals(this.f107058f, fVar.f107058f) || !Objects.equals(this.f107062j, fVar.f107062j) || !Objects.equals(this.f107063k, fVar.f107063k) || !Objects.equals(this.f107066n, fVar.f107066n) || !Objects.equals(this.f107064l, fVar.f107064l) || !Objects.equals(this.f107053a, fVar.f107053a) || !Objects.equals(this.f107067o, fVar.f107067o) || this.f107068p != fVar.f107068p || !Objects.equals(this.f107069q, fVar.f107069q) || !Objects.equals(this.f107070r, fVar.f107070r) || !Objects.equals(Boolean.valueOf(this.f107071s), Boolean.valueOf(fVar.f107071s)) || !Objects.equals(Boolean.valueOf(this.f107072t), Boolean.valueOf(fVar.f107072t))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo151871a(C42101o oVar) {
        this.f107066n = oVar;
    }

    /* renamed from: a */
    public void mo151872a(EmailSignature emailSignature) {
        this.f107057e = emailSignature;
    }

    /* renamed from: a */
    public void mo151873a(List<MailClientConfig> list) {
        this.f107062j = list;
    }

    /* renamed from: a */
    public void mo151874a(boolean z) {
        this.f107054b = z;
    }
}

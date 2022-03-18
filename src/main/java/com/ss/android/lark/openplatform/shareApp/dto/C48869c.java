package com.ss.android.lark.openplatform.shareApp.dto;

import android.text.TextUtils;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;

/* renamed from: com.ss.android.lark.openplatform.shareApp.dto.c */
public class C48869c {

    /* renamed from: a */
    LarkShareContainerConfig.Head f122775a;

    /* renamed from: b */
    private String f122776b;

    /* renamed from: c */
    private String f122777c;

    /* renamed from: d */
    private String f122778d;

    /* renamed from: e */
    private String f122779e;

    /* renamed from: f */
    private String f122780f;

    /* renamed from: g */
    private String f122781g;

    /* renamed from: h */
    private String f122782h;

    /* renamed from: i */
    private String f122783i;

    /* renamed from: j */
    private ShareAppType f122784j = ShareAppType.SHARE_APP;

    /* renamed from: b */
    public LarkShareContainerConfig.Head mo170682b() {
        return this.f122775a;
    }

    /* renamed from: c */
    public String mo170684c() {
        return this.f122782h;
    }

    /* renamed from: d */
    public String mo170686d() {
        return this.f122781g;
    }

    /* renamed from: e */
    public String mo170688e() {
        return this.f122780f;
    }

    /* renamed from: f */
    public String mo170690f() {
        return this.f122776b;
    }

    /* renamed from: j */
    public String mo170695j() {
        return this.f122777c;
    }

    /* renamed from: k */
    public String mo170696k() {
        return this.f122783i;
    }

    /* renamed from: a */
    public ShareAppType mo170679a() {
        return this.f122784j;
    }

    /* renamed from: g */
    public boolean mo170692g() {
        return !TextUtils.isEmpty(this.f122776b);
    }

    /* renamed from: h */
    public boolean mo170693h() {
        if (!mo170692g() || TextUtils.isEmpty(this.f122777c) || TextUtils.isEmpty(this.f122778d)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo170694i() {
        LarkShareContainerConfig.Head head;
        if (mo170693h()) {
            head = new LarkShareContainerConfig.Head(this.f122777c, "", this.f122778d, this.f122779e);
        } else {
            head = null;
        }
        m192508a(head);
    }

    /* renamed from: a */
    private void m192508a(LarkShareContainerConfig.Head head) {
        this.f122775a = head;
    }

    /* renamed from: b */
    public void mo170683b(String str) {
        this.f122781g = str;
    }

    /* renamed from: c */
    public void mo170685c(String str) {
        this.f122780f = str;
    }

    /* renamed from: d */
    public void mo170687d(String str) {
        this.f122777c = str;
    }

    /* renamed from: e */
    public void mo170689e(String str) {
        this.f122778d = str;
    }

    /* renamed from: f */
    public void mo170691f(String str) {
        this.f122779e = str;
    }

    /* renamed from: a */
    public void mo170680a(ShareAppType shareAppType) {
        if (shareAppType != ShareAppType.SHARE_UNKNOWN) {
            this.f122784j = shareAppType;
        }
    }

    /* renamed from: a */
    public void mo170681a(String str) {
        this.f122782h = str;
    }

    public C48869c(String str, String str2) {
        this.f122776b = str;
        this.f122777c = str2;
    }

    public C48869c(String str, String str2, String str3, String str4) {
        this.f122776b = str;
        this.f122777c = str2;
        this.f122778d = str3;
        this.f122779e = str4;
    }
}

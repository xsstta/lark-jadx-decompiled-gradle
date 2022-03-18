package com.bytedance.ee.bear.drive.view.preview.wps;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.log.C13479a;
import java.util.UUID;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wps.f */
public class C7528f implements AbstractC7522a {

    /* renamed from: a */
    private WpsView f20345a;

    /* renamed from: b */
    private C7555f f20346b;

    /* renamed from: c */
    private boolean f20347c;

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: c */
    public void mo29389c() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: d */
    public void mo29390d() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: e */
    public void mo29391e() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: f */
    public boolean mo29392f() {
        return this.f20347c;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: a */
    public WpsMainOptions mo29385a() {
        String str;
        WpsMainOptions wpsMainOptions = new WpsMainOptions();
        if (this.f20345a.f20312m) {
            str = "normal";
        } else {
            str = "simple";
        }
        wpsMainOptions.mode = str;
        return wpsMainOptions;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: b */
    public String mo29388b() {
        String str;
        String o = this.f20345a.f20309j.mo29380a().mo29496o();
        String b = this.f20345a.f20309j.mo29380a().mo29479b();
        boolean z = !TextUtils.isEmpty(this.f20345a.f20309j.mo29380a().mo29498q());
        String replace = UUID.randomUUID().toString().replace("-", "");
        StringBuilder sb = new StringBuilder("https://");
        sb.append(this.f20345a.getWpsDomain());
        sb.append("/office/");
        sb.append(this.f20345a.getType());
        sb.append("/");
        if (z) {
            sb.append(o);
            sb.append("_");
        }
        sb.append(b);
        sb.append("?_w_tokentype=1");
        sb.append("&lang=");
        sb.append(this.f20345a.getLocal());
        sb.append("&third_req_id=");
        sb.append(replace);
        sb.append("&require_mode=1");
        sb.append("&gray_strategy=");
        if (TextUtils.isEmpty(this.f20345a.f20308i)) {
            str = "online";
        } else {
            str = this.f20345a.f20308i;
        }
        sb.append(str);
        String sb2 = sb.toString();
        C13479a.m54772d("WpsOnlyReadController", "getWpsIframeUrl = " + sb2);
        return sb2;
    }

    public C7528f(WpsView wpsView) {
        this.f20345a = wpsView;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: a */
    public void mo29387a(Throwable th) {
        this.f20345a.mo29361a(th);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: a */
    public void mo29386a(ViewOwner viewOwner) {
        this.f20346b = (C7555f) viewOwner.viewModel(C7555f.class);
    }
}

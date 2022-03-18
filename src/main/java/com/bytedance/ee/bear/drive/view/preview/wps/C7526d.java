package com.bytedance.ee.bear.drive.view.preview.wps;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.edit.C6568a;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.wps.WpsWordOptions;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.UUID;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wps.d */
public class C7526d implements AbstractC7522a {

    /* renamed from: a */
    private WpsView f20331a;

    /* renamed from: b */
    private volatile boolean f20332b;

    /* renamed from: c */
    private C7555f f20333c;

    /* renamed from: d */
    private LifecycleOwner f20334d;

    /* renamed from: e */
    private boolean f20335e = true;

    /* renamed from: f */
    private final AbstractC1178x<Integer> f20336f = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$d$jaTGfYahfDk3yhWxmQiSkfEac */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            C7526d.m269502lambda$jaTGfYahfDk3yhWxmQiSkfEac(C7526d.this, (Integer) obj);
        }
    };

    /* renamed from: g */
    private final AbstractC1178x<C6522b> f20337g = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$d$XpAWjflGews0iu1sXnY9vvRdnoU */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            C7526d.lambda$XpAWjflGews0iu1sXnY9vvRdnoU(C7526d.this, (C6522b) obj);
        }
    };

    /* renamed from: h */
    private final AbstractC1178x<Integer> f20338h = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$d$4QrYsFxze1_bkB24dRFiU3pfWWc */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            C7526d.lambda$4QrYsFxze1_bkB24dRFiU3pfWWc(C7526d.this, (Integer) obj);
        }
    };

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: f */
    public boolean mo29392f() {
        if (!this.f20335e || !this.f20332b) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: c */
    public void mo29389c() {
        if (!this.f20332b) {
            C13479a.m54764b("WpsCanWriteController", "onSwitchHide current file can't be editted and forced to read");
        } else {
            C6568a.m26289b(this.f20333c);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: d */
    public void mo29390d() {
        if (!this.f20332b) {
            C13479a.m54764b("WpsCanWriteController", "onSwitchShow current file can't be editted and forced to read");
        } else if (this.f20331a.f20309j.mo29384e() && this.f20335e) {
            C6568a.m26288a(this.f20333c);
        }
    }

    /* renamed from: g */
    private String m30132g() {
        if (!this.f20331a.f20312m && ((!this.f20331a.f20313n && !this.f20331a.f20314o) || !this.f20331a.f20309j.mo29383d() || !this.f20335e)) {
            return "&hidecmb";
        }
        return "";
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: e */
    public void mo29391e() {
        if (this.f20333c == null || !this.f20332b) {
            C13479a.m54764b("WpsCanWriteController", "onDetachedFromWindow current file can't be editted and forced to read");
            return;
        }
        this.f20333c.liveInnerEditModeSwitchAction().mo5928b(this.f20336f);
        this.f20333c.liveInnerFilePermissionChanged().mo5928b(this.f20337g);
        this.f20333c.liveInnerWPSViewPaddingChanged().mo5928b(this.f20338h);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: a */
    public WpsMainOptions mo29385a() {
        WpsMainOptions wpsMainOptions = new WpsMainOptions();
        String str = "normal";
        if (!this.f20332b) {
            C13479a.m54764b("WpsCanWriteController", "generateWpsMainOptions current file can't be editted and forced to read");
            if (!this.f20331a.f20312m) {
                str = "simple";
            }
            wpsMainOptions.mode = str;
            return wpsMainOptions;
        }
        if (this.f20331a.f20312m) {
            wpsMainOptions.wordOptions = new WpsWordOptions();
            WpsWordOptions.Mobile mobile = new WpsWordOptions.Mobile();
            mobile.isOpenIntoEdit = true;
            wpsMainOptions.wordOptions.mobile = mobile;
        }
        wpsMainOptions.mode = str;
        return wpsMainOptions;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: b */
    public String mo29388b() {
        String str;
        String o = this.f20331a.f20309j.mo29380a().mo29496o();
        String b = this.f20331a.f20309j.mo29380a().mo29479b();
        boolean z = !TextUtils.isEmpty(this.f20331a.f20309j.mo29380a().mo29498q());
        String str2 = "";
        String replace = UUID.randomUUID().toString().replace("-", str2);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(this.f20331a.getWpsDomain());
        sb.append("/office/");
        sb.append(this.f20331a.getType());
        sb.append("/");
        if (z) {
            sb.append(o);
            sb.append("_");
        }
        sb.append(b);
        sb.append("?_w_tokentype=1");
        sb.append("&lang=");
        sb.append(this.f20331a.getLocal());
        sb.append("&third_req_id=");
        sb.append(replace);
        sb.append("&require_mode=");
        sb.append(this.f20331a.f20309j.f20327b);
        if (this.f20332b) {
            str2 = m30132g();
        }
        sb.append(str2);
        sb.append("&gray_strategy=");
        if (TextUtils.isEmpty(this.f20331a.f20308i)) {
            str = "online";
        } else {
            str = this.f20331a.f20308i;
        }
        sb.append(str);
        String sb2 = sb.toString();
        C13479a.m54772d("WpsCanWriteController", "getWpsIframeUrl = " + sb2);
        return sb2;
    }

    public C7526d(WpsView wpsView) {
        this.f20331a = wpsView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30130a(Integer num) {
        C13479a.m54764b("WpsCanWriteController", "liveInnerWPSViewPaddingChanged wpsView show");
        if (this.f20331a.f20310k && this.f20331a.f20309j.mo29383d() && this.f20335e) {
            if (this.f20331a.f20312m || this.f20331a.f20313n) {
                this.f20331a.setPadding(0, 0, 0, num.intValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30131b(Integer num) {
        C13479a.m54764b("WpsCanWriteController", "liveInnerEditModeSwitchAction wpsView show");
        this.f20331a.f20309j.mo29382c();
        C6568a.m26289b(this.f20333c);
        this.f20333c.liveInnerExtraViewVisible().mo5926a((Boolean) false);
        this.f20331a.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30129a(C6522b bVar) {
        int i;
        boolean j = bVar.mo26064j();
        this.f20331a.f20309j.f20328c = j;
        C13479a.m54764b("WpsCanWriteController", "liveInnerFileEditable editable=" + j + ", lastSuccess=" + this.f20331a.f20310k + ", isEditMode=" + this.f20331a.f20309j.mo29383d() + ", accessTokenNeedEdit= " + this.f20335e);
        if (!j) {
            if (this.f20331a.f20310k) {
                UDToast.build(this.f20331a.getContext()).mo91643a(C10539a.m43639a(this.f20331a.getContext(), R.string.CreationMobile_ECM_PermissionChanged_toast, ShareHitPoint.f121869d, this.f20331a.getContext().getString(R.string.Doc_Share_LinkCanView))).mo91656k();
            }
            C6568a.m26289b(this.f20333c);
            this.f20333c.liveInnerExtraViewVisible().mo5926a((Boolean) true);
            if (this.f20331a.f20309j.mo29383d()) {
                this.f20331a.f20309j.mo29381b();
                this.f20331a.show();
                return;
            }
            return;
        }
        if (this.f20331a.f20310k) {
            if (bVar.mo26061g()) {
                i = R.string.CreationMobile_Wiki_Permission_FullAccess_Options;
            } else {
                i = R.string.Doc_Share_LinkCanEdit;
            }
            UDToast.build(this.f20331a.getContext()).mo91643a(C10539a.m43639a(this.f20331a.getContext(), R.string.CreationMobile_ECM_PermissionChanged_toast, ShareHitPoint.f121869d, this.f20331a.getContext().getString(i))).mo91656k();
        }
        if (this.f20331a.f20310k && !this.f20331a.f20309j.mo29383d() && this.f20335e) {
            C6568a.m26288a(this.f20333c);
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: a */
    public void mo29386a(ViewOwner viewOwner) {
        this.f20334d = viewOwner.lifecycleOwner();
        this.f20333c = (C7555f) viewOwner.viewModel(C7555f.class);
        this.f20332b = !this.f20331a.f20315p;
        if (this.f20333c == null || !this.f20332b) {
            C13479a.m54764b("WpsCanWriteController", "setPreviewModel current file can't be editted and forced to read");
            return;
        }
        this.f20333c.liveInnerEditModeSwitchAction().mo5923a(this.f20334d, this.f20336f);
        this.f20333c.liveInnerFilePermissionChanged().mo5923a(this.f20334d, this.f20337g);
        this.f20333c.liveInnerWPSKeyboardChangedActive().mo5926a((Boolean) true);
        this.f20333c.liveInnerWPSViewPaddingChanged().mo5923a(this.f20334d, this.f20338h);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wps.AbstractC7522a
    /* renamed from: a */
    public void mo29387a(Throwable th) {
        if (!this.f20332b) {
            C13479a.m54764b("WpsCanWriteController", "handleAuthTokenFailed current file can't be editted and forced to read");
            return;
        }
        mo29389c();
        if (!(th instanceof DriveException) || !this.f20335e) {
            this.f20331a.mo29361a(th);
            return;
        }
        ErrCode errorCode = ((DriveException) th).getErrorCode();
        if (errorCode == ErrCode.WPS_PREVIEW_GET_ACCESS_TOKEN_USER_MEMORY_OVER_LIMIT) {
            this.f20333c.liveInnerMemoryOverLimit().mo5926a((Integer) 90001061);
            this.f20335e = false;
            this.f20331a.show();
        } else if (errorCode == ErrCode.WPS_PREVIEW_GET_ACCESS_TOKEN_TENANT_MEMORY_OVER_LIMIT) {
            this.f20333c.liveInnerMemoryOverLimit().mo5926a((Integer) 11001);
            this.f20335e = false;
            this.f20331a.show();
        } else {
            this.f20331a.mo29361a(th);
        }
    }
}

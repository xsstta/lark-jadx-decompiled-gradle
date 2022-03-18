package com.ss.android.lark.contact.impl.contacts_banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.ContactBannerLoaderProxy;
import com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.a */
public class C35510a {

    /* renamed from: a */
    private IContactBannerLoader f91799a;

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        IContactBannerLoader dVar = this.f91799a;
        if (dVar != null) {
            dVar.mo130950b();
        }
    }

    /* renamed from: a */
    public void mo130943a(FrameLayout frameLayout) {
        Context context;
        if (frameLayout != null && (context = frameLayout.getContext()) != null) {
            m138894a(context, frameLayout);
        }
    }

    /* renamed from: a */
    private void m138894a(Context context, FrameLayout frameLayout) {
        frameLayout.setVisibility(0);
        IContactBannerLoader dVar = this.f91799a;
        if (dVar == null) {
            this.f91799a = new ContactBannerLoaderProxy(frameLayout);
        } else if (dVar.mo130946a() != frameLayout) {
            this.f91799a.mo130950b();
            this.f91799a = new ContactBannerLoaderProxy(frameLayout);
        }
        this.f91799a.mo130947a(context);
    }
}

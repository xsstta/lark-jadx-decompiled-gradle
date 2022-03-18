package com.ss.android.lark.contact.impl.contacts_banner.ug_banner;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/ContactBannerLoaderProxy;", "Lcom/ss/android/lark/contact/impl/contacts_banner/ug_banner/IContactBannerLoader;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "base", "getContainer", "loadBanner", "", "context", "Landroid/content/Context;", "unInit", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.c */
public final class ContactBannerLoaderProxy implements IContactBannerLoader {

    /* renamed from: a */
    private final IContactBannerLoader f91826a;

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: a */
    public ViewGroup mo130946a() {
        return this.f91826a.mo130946a();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: b */
    public void mo130950b() {
        this.f91826a.mo130950b();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_banner.ug_banner.IContactBannerLoader
    /* renamed from: a */
    public void mo130947a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f91826a.mo130947a(context);
    }

    public ContactBannerLoaderProxy(ViewGroup viewGroup) {
        C35511a aVar;
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        boolean a2 = a.mo130150b().mo130208a("lark.ug.reach.contact.banner");
        Log.m165389i("IContactBannerLoader", "fgEnable=" + a2);
        if (a2) {
            aVar = new ContactBannerLoader2(viewGroup);
        } else {
            aVar = new C35511a(viewGroup);
        }
        this.f91826a = aVar;
    }
}

package com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission;

import android.app.Activity;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.framework.utils.C26323w;
import com.ss.android.lark.banner.export.AbstractC29483d;
import com.ss.android.lark.banner.export.broadcast.C29481a;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.statistics.BannerHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.b */
public class C35526b implements AbstractC29483d {
    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16928a() {
        boolean z;
        boolean z2 = false;
        boolean z3 = C57744a.m224104a().getBoolean("key_contact_banner_contacts_permission", false);
        if (ContextCompat.checkSelfPermission(C35358a.m138143a().mo130143a(), "android.permission.READ_CONTACTS") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !z3) {
            z2 = true;
        }
        if (z2) {
            BannerHitPoint.f92899a.mo132198a();
        }
        return z2;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16929a(View view) {
        C57744a.m224104a().putBoolean("key_contact_banner_contacts_permission", true);
        C29481a.m108561a(view.getContext(), "ContactsPermission");
        return true;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        Activity a;
        BannerHitPoint.f92899a.mo132199b();
        if (view == null || (a = ViewUtils.m224141a(view.getContext())) == null) {
            C26323w.m95322a(C35358a.m138143a().mo130143a());
            return true;
        }
        C57805b.m224332c(a, null);
        return true;
    }
}

package com.ss.android.appcenter.business.tab.fragmentv3.component.header;

import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.header.a */
public class C28078a {
    /* renamed from: a */
    public static boolean m102637a(boolean z, boolean z2) {
        return !z && z2;
    }

    /* renamed from: b */
    public static boolean m102639b(boolean z, boolean z2) {
        return z && z2;
    }

    /* renamed from: a */
    public static boolean m102636a(CommonHeader.C28077b bVar) {
        if (bVar == null || !m102637a(bVar.f70286a, bVar.f70287b)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m102638b(CommonHeader.C28077b bVar) {
        if (bVar == null || !m102639b(bVar.f70286a, bVar.f70287b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m102635a(CommonHeader commonHeader, CommonHeader.C28077b bVar) {
        int i;
        int i2;
        commonHeader.setTitle(bVar.f70288c);
        commonHeader.setTitleIconUrl(bVar.f70289d);
        commonHeader.mo99948a(bVar.f70290e, bVar.f70292g, bVar.f70286a);
        int i3 = 0;
        if (bVar.f70291f != null) {
            i3 = bVar.f70291f.f70283a;
            i2 = bVar.f70291f.f70284b;
            i = bVar.f70291f.f70285c;
        } else {
            i2 = 0;
            i = 0;
        }
        if (bVar.f70286a) {
            commonHeader.mo99946a(i3, i2);
        } else {
            commonHeader.mo99947a(i3, i2, i);
        }
    }
}

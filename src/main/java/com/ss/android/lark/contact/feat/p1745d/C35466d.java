package com.ss.android.lark.contact.feat.p1745d;

import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.util.ContactMobileUtils;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.d.d */
public class C35466d {
    /* renamed from: a */
    public static boolean m138738a() {
        return C35358a.m138143a().mo130150b().mo130208a("lark.client.contact.opt");
    }

    /* renamed from: b */
    public static boolean m138739b() {
        return C35358a.m138143a().mo130150b().mo130208a("lark.client.contact.opt.ui");
    }

    /* renamed from: a */
    public static List<ContactMobileBean> m138736a(int i) {
        return ContactMobileUtils.m138438a(i, ((IInvitationModuleDependency) ApiUtils.getApi(IInvitationModuleDependency.class)).isLarkEnv());
    }

    /* renamed from: a */
    public static List<String> m138737a(List<ContactMobileBean> list) {
        ArrayList arrayList = new ArrayList();
        for (ContactMobileBean contactMobileBean : list) {
            arrayList.add(contactMobileBean.getEmailOrPhoneE164());
        }
        return arrayList;
    }
}

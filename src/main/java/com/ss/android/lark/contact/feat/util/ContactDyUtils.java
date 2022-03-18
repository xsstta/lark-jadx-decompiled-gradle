package com.ss.android.lark.contact.feat.util;

import com.ss.android.lark.utils.DyResUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/feat/util/ContactDyUtils;", "", "()V", "SETTINGS_KEY_CONTACT", "", "getContactString", "resId", "", "resKey", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.d.b */
public final class ContactDyUtils {

    /* renamed from: a */
    public static final ContactDyUtils f91696a = new ContactDyUtils();

    private ContactDyUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m138724a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "resKey");
        String a = DyResUtils.f142243a.mo195941a("contact_config", str);
        if (a != null) {
            return a;
        }
        return "";
    }
}

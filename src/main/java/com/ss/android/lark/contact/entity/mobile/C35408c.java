package com.ss.android.lark.contact.entity.mobile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"isMatch", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;", "filterKey", "", "core_contact_contact-entity_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.mobile.c */
public final class C35408c {
    /* renamed from: a */
    public static final boolean m138428a(ContactPointUserInfoBean aVar, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$isMatch");
        if (str != null) {
            String str2 = str;
            if (!StringsKt.isBlank(str2)) {
                String str3 = aVar.mo130622a().user_name;
                if (str3 != null && StringsKt.contains((CharSequence) str3, (CharSequence) str2, false)) {
                    return true;
                }
                String str4 = aVar.mo130622a().name_py;
                if (str4 != null && StringsKt.contains((CharSequence) str4, (CharSequence) str2, false)) {
                    return true;
                }
                String str5 = aVar.mo130622a().tenant_name;
                if (str5 == null || !StringsKt.contains((CharSequence) str5, (CharSequence) str2, false)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}

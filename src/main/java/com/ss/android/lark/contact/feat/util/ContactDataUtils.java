package com.ss.android.lark.contact.feat.util;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u000e¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/contact/feat/util/ContactDataUtils;", "", "()V", "DEFAULT_ONBOARDING_UPLOAD_CP_MAX_NUM", "", "DEFAULT_VALUE_UPLOAD_CONTACTS_MAX_NUM", "KEY_SETTINGS_ONBOARDING_UPLOAD_CONTACTS_MAX_NUM", "", "KEY_SETTINGS_UPLOAD_CONTACTS_MAX_NUM", "KEY_SP_PRE_REQUEST_CONTACTS_MILLIS", "KEY_SP_TIME_LINE_FOR_ADDRESS_BOOK_CONTACTS", "TAG", "timeline", "", "contactsTimeLine", "contactsTimeLine$annotations", "getContactsTimeLine", "()J", "setContactsTimeLine", "(J)V", "preRequestContactsMillis", "preRequestContactsMillis$annotations", "getPreRequestContactsMillis", "setPreRequestContactsMillis", "getOnboardingUploadCpMaxCount", "getUploadContactsMaxNum", "hasContactTimeLine", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.d.a */
public final class ContactDataUtils {

    /* renamed from: a */
    public static final ContactDataUtils f91695a = new ContactDataUtils();

    private ContactDataUtils() {
    }

    /* renamed from: a */
    public static final long m138718a() {
        return UserSP.getInstance().getLong("time_line_for_address_book_contacts", 0);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m138721b() {
        return UserSP.getInstance().contains("time_line_for_address_book_contacts");
    }

    @JvmStatic
    /* renamed from: c */
    public static final int m138722c() {
        String a = ContactDyUtils.m138724a("upload_contacts_max_num");
        Log.m165389i("ContactFeat", "upload_contacts_max_num: " + a);
        if (TextUtils.isEmpty(a)) {
            return 3000;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException unused) {
            return 3000;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m138723d() {
        /*
            java.lang.String r0 = "onboarding_upload_contacts_max_num"
            java.lang.String r0 = com.ss.android.lark.contact.feat.util.ContactDyUtils.m138724a(r0)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001e
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0014 }
            goto L_0x001f
        L_0x0014:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r1 = "ContactFeat"
            java.lang.String r2 = "parse onboarding_upload_contacts_max_num error"
            com.ss.android.lark.log.Log.m165384e(r1, r2, r0)
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 > 0) goto L_0x0023
            r0 = 200(0xc8, float:2.8E-43)
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.feat.util.ContactDataUtils.m138723d():int");
    }

    /* renamed from: b */
    private static final void m138720b(long j) {
        UserSP.getInstance().putLong("pre_request_contacts_millis", j);
    }

    /* renamed from: a */
    public static final void m138719a(long j) {
        UserSP.getInstance().putLong("time_line_for_address_book_contacts", j);
        m138720b(System.currentTimeMillis());
    }
}

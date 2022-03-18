package com.ss.android.lark.contact.impl.contacts_email.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "cardId", "getCardId", "setCardId", "companyName", "getCompanyName", "setCompanyName", "email", "getEmail", "setEmail", "isSelected", "", "()Z", "setSelected", "(Z)V", "name", "getName", "setName", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.a.a */
public final class BusinessCardViewData {

    /* renamed from: a */
    private String f91852a = "";

    /* renamed from: b */
    private String f91853b = "";

    /* renamed from: c */
    private String f91854c;

    /* renamed from: d */
    private String f91855d = "";

    /* renamed from: e */
    private String f91856e = "";

    /* renamed from: f */
    private boolean f91857f;

    /* renamed from: a */
    public final String mo130995a() {
        return this.f91852a;
    }

    /* renamed from: b */
    public final String mo130998b() {
        return this.f91853b;
    }

    /* renamed from: c */
    public final String mo131000c() {
        return this.f91854c;
    }

    /* renamed from: d */
    public final String mo131002d() {
        return this.f91855d;
    }

    /* renamed from: e */
    public final String mo131004e() {
        return this.f91856e;
    }

    /* renamed from: f */
    public final boolean mo131006f() {
        return this.f91857f;
    }

    /* renamed from: a */
    public final void mo130996a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f91852a = str;
    }

    /* renamed from: b */
    public final void mo130999b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f91853b = str;
    }

    /* renamed from: c */
    public final void mo131001c(String str) {
        this.f91854c = str;
    }

    /* renamed from: d */
    public final void mo131003d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f91855d = str;
    }

    /* renamed from: e */
    public final void mo131005e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f91856e = str;
    }

    /* renamed from: a */
    public final void mo130997a(boolean z) {
        this.f91857f = z;
    }
}

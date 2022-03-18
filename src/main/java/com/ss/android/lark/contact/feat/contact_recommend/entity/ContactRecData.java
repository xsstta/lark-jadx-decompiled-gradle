package com.ss.android.lark.contact.feat.contact_recommend.entity;

import com.ss.android.lark.contact.feat.common.MultiItemData;
import com.ss.android.lark.contact.feat.entity.C35471d;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "Lcom/ss/android/lark/contact/feat/common/MultiItemData;", "()V", "applied", "", "getApplied", "()Z", "setApplied", "(Z)V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "contactPoint", "getContactPoint", "setContactPoint", "desc", "getDesc", "setDesc", "name", "getName", "setName", "userInfo", "Lcom/ss/android/lark/contact/feat/entity/UserInfoBean;", "getUserInfo", "()Lcom/ss/android/lark/contact/feat/entity/UserInfoBean;", "setUserInfo", "(Lcom/ss/android/lark/contact/feat/entity/UserInfoBean;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.a.a */
public final class ContactRecData implements MultiItemData {

    /* renamed from: a */
    private String f91515a;

    /* renamed from: b */
    private String f91516b;

    /* renamed from: c */
    private String f91517c;

    /* renamed from: d */
    private boolean f91518d;

    /* renamed from: e */
    private C35471d f91519e;

    /* renamed from: f */
    private String f91520f;

    /* renamed from: b */
    public final String mo130672b() {
        return this.f91515a;
    }

    /* renamed from: c */
    public final String mo130674c() {
        return this.f91516b;
    }

    /* renamed from: d */
    public final String mo130676d() {
        return this.f91517c;
    }

    /* renamed from: e */
    public final boolean mo130678e() {
        return this.f91518d;
    }

    /* renamed from: f */
    public final C35471d mo130679f() {
        return this.f91519e;
    }

    /* renamed from: g */
    public final String mo130680g() {
        return this.f91520f;
    }

    @Override // com.ss.android.lark.contact.feat.common.ItemData
    /* renamed from: a */
    public String mo130668a() {
        return MultiItemData.C35430a.m138577a(this);
    }

    /* renamed from: a */
    public final void mo130669a(C35471d dVar) {
        this.f91519e = dVar;
    }

    /* renamed from: b */
    public final void mo130673b(String str) {
        this.f91516b = str;
    }

    /* renamed from: c */
    public final void mo130675c(String str) {
        this.f91517c = str;
    }

    /* renamed from: d */
    public final void mo130677d(String str) {
        this.f91520f = str;
    }

    /* renamed from: a */
    public final void mo130670a(String str) {
        this.f91515a = str;
    }

    /* renamed from: a */
    public final void mo130671a(boolean z) {
        this.f91518d = z;
    }
}

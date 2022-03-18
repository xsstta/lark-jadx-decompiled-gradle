package com.ss.android.lark.contact.entity.mobile;

import android.text.TextUtils;
import com.bytedance.lark.pb.contact.v2.ContactPointUserInfo;
import com.bytedance.lark.pb.contact.v2.ContactPointUserList;
import com.bytedance.lark.pb.contact.v2.GetAddressBookContactListResponse;
import com.ss.android.lark.contact.entity.mobile.ContactPointUserInfoBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo;", "", "cpFeishuUsers", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;", "cpNotFeishuUsers", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "(Ljava/util/List;Ljava/util/List;)V", "getCpFeishuUsers", "()Ljava/util/List;", "getCpNotFeishuUsers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "CpFeishuUsers", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.mobile.b */
public final class ContactsMobileFeishuInfo {

    /* renamed from: a */
    public static final Companion f91479a = new Companion(null);

    /* renamed from: b */
    private final List<CpFeishuUsers> f91480b;

    /* renamed from: c */
    private final List<ContactMobileBean> f91481c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsMobileFeishuInfo)) {
            return false;
        }
        ContactsMobileFeishuInfo bVar = (ContactsMobileFeishuInfo) obj;
        return Intrinsics.areEqual(this.f91480b, bVar.f91480b) && Intrinsics.areEqual(this.f91481c, bVar.f91481c);
    }

    public int hashCode() {
        List<CpFeishuUsers> list = this.f91480b;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ContactMobileBean> list2 = this.f91481c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ContactsMobileFeishuInfo(cpFeishuUsers=" + this.f91480b + ", cpNotFeishuUsers=" + this.f91481c + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$Companion;", "", "()V", "TAG", "", "empty", "Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo;", "isHiddenCp", "", "userInfos", "", "Lcom/bytedance/lark/pb/contact/v2/ContactPointUserInfo;", "parse", "allCp", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "response", "Lcom/bytedance/lark/pb/contact/v2/GetAddressBookContactListResponse;", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ContactsMobileFeishuInfo mo130648a() {
            return new ContactsMobileFeishuInfo(new ArrayList(), new ArrayList());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final boolean m138419a(List<ContactPointUserInfo> list) {
            for (ContactPointUserInfo contactPointUserInfo : list) {
                if (!contactPointUserInfo.should_hidden.booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final ContactsMobileFeishuInfo mo130649a(List<? extends ContactMobileBean> list, GetAddressBookContactListResponse getAddressBookContactListResponse) {
            List<ContactPointUserInfo> list2;
            Intrinsics.checkParameterIsNotNull(list, "allCp");
            Intrinsics.checkParameterIsNotNull(getAddressBookContactListResponse, "response");
            Map<String, ContactPointUserList> map = getAddressBookContactListResponse.cp_user_infos;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ContactsMobileFeishuInfo bVar = new ContactsMobileFeishuInfo(arrayList, arrayList2);
            for (ContactMobileBean contactMobileBean : list) {
                ContactPointUserList contactPointUserList = map.get(contactMobileBean.getEmailOrPhoneE164());
                if (contactPointUserList != null) {
                    list2 = contactPointUserList.users;
                } else {
                    list2 = null;
                }
                if (list2 != null) {
                    List<ContactPointUserInfo> list3 = contactPointUserList.users;
                    Intrinsics.checkExpressionValueIsNotNull(list3, "userList.users");
                    if (!list3.isEmpty()) {
                        List<ContactPointUserInfo> list4 = contactPointUserList.users;
                        Intrinsics.checkExpressionValueIsNotNull(list4, "userList.users");
                        if (!m138419a(list4)) {
                            ContactPointUserInfoBean.Companion aVar = ContactPointUserInfoBean.f91456d;
                            List<ContactPointUserInfo> list5 = contactPointUserList.users;
                            Intrinsics.checkExpressionValueIsNotNull(list5, "userList.users");
                            arrayList.add(new CpFeishuUsers(contactMobileBean, aVar.mo130628a(list5)));
                        }
                    }
                }
                arrayList2.add(contactMobileBean);
            }
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0010\u0010\u0017\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/ContactsMobileFeishuInfo$CpFeishuUsers;", "", "cp", "Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "userInfos", "", "Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;", "(Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;Ljava/util/List;)V", "getCp", "()Lcom/ss/android/lark/contact/entity/mobile/ContactMobileBean;", "getUserInfos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "getUserInfosByFilter", "filterKey", "", "hashCode", "", "isMatch", "toString", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.b$b */
    public static final class CpFeishuUsers {

        /* renamed from: a */
        private final ContactMobileBean f91482a;

        /* renamed from: b */
        private final List<ContactPointUserInfoBean> f91483b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CpFeishuUsers)) {
                return false;
            }
            CpFeishuUsers bVar = (CpFeishuUsers) obj;
            return Intrinsics.areEqual(this.f91482a, bVar.f91482a) && Intrinsics.areEqual(this.f91483b, bVar.f91483b);
        }

        public int hashCode() {
            ContactMobileBean contactMobileBean = this.f91482a;
            int i = 0;
            int hashCode = (contactMobileBean != null ? contactMobileBean.hashCode() : 0) * 31;
            List<ContactPointUserInfoBean> list = this.f91483b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "CpFeishuUsers(cp=" + this.f91482a + ", userInfos=" + this.f91483b + ")";
        }

        /* renamed from: a */
        public final ContactMobileBean mo130650a() {
            return this.f91482a;
        }

        /* renamed from: b */
        public final List<ContactPointUserInfoBean> mo130652b() {
            return this.f91483b;
        }

        /* renamed from: a */
        public final List<ContactPointUserInfoBean> mo130651a(String str) {
            if (TextUtils.isEmpty(str)) {
                return this.f91483b;
            }
            if (this.f91482a.isMatch(str)) {
                return this.f91483b;
            }
            ArrayList arrayList = new ArrayList();
            for (T t : this.f91483b) {
                if (C35408c.m138428a(t, str)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final boolean mo130653b(String str) {
            if (TextUtils.isEmpty(str) || this.f91482a.isMatch(str)) {
                return true;
            }
            for (ContactPointUserInfoBean aVar : this.f91483b) {
                if (C35408c.m138428a(aVar, str)) {
                    return true;
                }
            }
            return false;
        }

        public CpFeishuUsers(ContactMobileBean contactMobileBean, List<ContactPointUserInfoBean> list) {
            Intrinsics.checkParameterIsNotNull(contactMobileBean, "cp");
            Intrinsics.checkParameterIsNotNull(list, "userInfos");
            this.f91482a = contactMobileBean;
            this.f91483b = list;
        }
    }

    /* renamed from: a */
    public final List<CpFeishuUsers> mo130643a() {
        return this.f91480b;
    }

    /* renamed from: b */
    public final List<ContactMobileBean> mo130644b() {
        return this.f91481c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.contact.entity.mobile.ContactMobileBean> */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactsMobileFeishuInfo(List<CpFeishuUsers> list, List<? extends ContactMobileBean> list2) {
        Intrinsics.checkParameterIsNotNull(list, "cpFeishuUsers");
        Intrinsics.checkParameterIsNotNull(list2, "cpNotFeishuUsers");
        this.f91480b = list;
        this.f91481c = list2;
    }
}

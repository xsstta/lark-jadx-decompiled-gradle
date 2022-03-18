package com.ss.android.lark.contact.entity.mobile;

import com.bytedance.lark.pb.basic.v1.UserInfo;
import com.bytedance.lark.pb.contact.v2.ContactPointUserInfo;
import com.bytedance.lark.pb.contact.v2.UserContactStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;", "", "()V", "contactPoint", "", "getContactPoint", "()Ljava/lang/String;", "setContactPoint", "(Ljava/lang/String;)V", "contactStatus", "Lcom/bytedance/lark/pb/contact/v2/UserContactStatus;", "getContactStatus", "()Lcom/bytedance/lark/pb/contact/v2/UserContactStatus;", "setContactStatus", "(Lcom/bytedance/lark/pb/contact/v2/UserContactStatus;)V", "userInfo", "Lcom/bytedance/lark/pb/basic/v1/UserInfo;", "getUserInfo", "()Lcom/bytedance/lark/pb/basic/v1/UserInfo;", "setUserInfo", "(Lcom/bytedance/lark/pb/basic/v1/UserInfo;)V", "Companion", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.mobile.a */
public final class ContactPointUserInfoBean {

    /* renamed from: d */
    public static final Companion f91456d = new Companion(null);

    /* renamed from: a */
    public String f91457a;

    /* renamed from: b */
    public UserInfo f91458b;

    /* renamed from: c */
    public UserContactStatus f91459c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/contact/entity/mobile/ContactPointUserInfoBean;", "info", "Lcom/bytedance/lark/pb/contact/v2/ContactPointUserInfo;", "", "infos", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.contact.entity.mobile.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ContactPointUserInfoBean mo130627a(ContactPointUserInfo contactPointUserInfo) {
            Intrinsics.checkParameterIsNotNull(contactPointUserInfo, "info");
            ContactPointUserInfoBean aVar = new ContactPointUserInfoBean();
            String str = contactPointUserInfo.contact_point;
            Intrinsics.checkExpressionValueIsNotNull(str, "info.contact_point");
            aVar.mo130625a(str);
            UserInfo userInfo = contactPointUserInfo.user_info;
            Intrinsics.checkExpressionValueIsNotNull(userInfo, "info.user_info");
            aVar.mo130623a(userInfo);
            UserContactStatus userContactStatus = contactPointUserInfo.contact_status;
            Intrinsics.checkExpressionValueIsNotNull(userContactStatus, "info.contact_status");
            aVar.mo130624a(userContactStatus);
            return aVar;
        }

        /* renamed from: a */
        public final List<ContactPointUserInfoBean> mo130628a(List<ContactPointUserInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "infos");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.should_hidden.booleanValue()) {
                    arrayList.add(t);
                }
            }
            ArrayList<ContactPointUserInfo> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (ContactPointUserInfo contactPointUserInfo : arrayList2) {
                arrayList3.add(ContactPointUserInfoBean.f91456d.mo130627a(contactPointUserInfo));
            }
            return arrayList3;
        }
    }

    /* renamed from: a */
    public final UserInfo mo130622a() {
        UserInfo userInfo = this.f91458b;
        if (userInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfo");
        }
        return userInfo;
    }

    /* renamed from: b */
    public final UserContactStatus mo130626b() {
        UserContactStatus userContactStatus = this.f91459c;
        if (userContactStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contactStatus");
        }
        return userContactStatus;
    }

    /* renamed from: a */
    public final void mo130623a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "<set-?>");
        this.f91458b = userInfo;
    }

    /* renamed from: a */
    public final void mo130624a(UserContactStatus userContactStatus) {
        Intrinsics.checkParameterIsNotNull(userContactStatus, "<set-?>");
        this.f91459c = userContactStatus;
    }

    /* renamed from: a */
    public final void mo130625a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f91457a = str;
    }
}

package com.ss.android.lark.profile.v2.service;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.basic.v1.Cipher;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.basic.v1.SerCrypto;
import com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.entity.ChatterDescription;
import com.ss.android.lark.profile.v2.entity.AliasDescriptionField;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.profile.v2.entity.CTA;
import com.ss.android.lark.profile.v2.entity.DepartmentField;
import com.ss.android.lark.profile.v2.entity.DescriptionField;
import com.ss.android.lark.profile.v2.entity.HrefField;
import com.ss.android.lark.profile.v2.entity.HrefListField;
import com.ss.android.lark.profile.v2.entity.PhoneNumberField;
import com.ss.android.lark.profile.v2.entity.Profile;
import com.ss.android.lark.profile.v2.entity.TextField;
import com.ss.android.lark.profile.v2.entity.TextListField;
import com.ss.android.lark.profile.v2.entity.TextStyle;
import com.ss.android.lark.profile.v2.entity.UserInfo;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser;", "", "()V", "Companion", "JsonCipher", "JsonDepartment", "JsonDepartmentNode", "JsonDepartmentPath", "JsonDescription", "JsonHref", "JsonHrefList", "JsonI18nVal", "JsonImageSetPassThrough", "JsonMemoDescription", "JsonPhoneNumber", "JsonSerCrypto", "JsonStyle", "JsonText", "JsonTextList", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ModelParser {

    /* renamed from: a */
    public static final Companion f130758a = new Companion(null);

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription;", "Ljava/io/Serializable;", "()V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", ShareHitPoint.f121869d, "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription$Type;", "getType", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription$Type;", "setType", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription$Type;)V", "Type", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class JsonDescription implements Serializable {
        private String text;
        private Type type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription$Type;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ON_DEFAULT", "ON_BUSINESS", "ON_LEAVE", "ON_MEETING", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        public enum Type {
            ON_DEFAULT(0),
            ON_BUSINESS(1),
            ON_LEAVE(2),
            ON_MEETING(3);
            
            public static final Companion Companion = new Companion(null);
            private final int value;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDescription$Type;", "value", "", "valueOf", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$JsonDescription$Type$a */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final int getValue() {
                return this.value;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public final String getText() {
            return this.text;
        }

        public final Type getType() {
            return this.type;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(Type type2) {
            this.type = type2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0019j\b\u0012\u0004\u0012\u00020\u0016`\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J$\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0019j\b\u0012\u0004\u0012\u00020\u0016`\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J&\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0019j\b\u0012\u0004\u0012\u00020\u0016`\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002010\u0004H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u0010\u0014\u001a\u000201H\u0002J\u0010\u00104\u001a\u0002052\u0006\u0010\u0014\u001a\u000201H\u0002J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u000209J\u0010\u0010:\u001a\u00020;2\u0006\u0010\u0014\u001a\u000201H\u0002J\u0012\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0010\u0010@\u001a\u0002052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u000e\u0010A\u001a\u0002072\u0006\u00108\u001a\u00020BJ\u0010\u0010C\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u00020E2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020=2\u0006\u0010>\u001a\u00020KH\u0002¨\u0006L"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$Companion;", "", "()V", "filterFields", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$Field;", "pbFields", "generateCipher", "Lcom/bytedance/lark/pb/basic/v1/Cipher;", "jsonCipher", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonCipher;", "getI18nValue", "", "pbI18n", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$I18nVal;", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "getNameCardI18nValue", "Lcom/bytedance/lark/pb/contact/v2/GetNamecardProfileResponse$I18nVal;", "parseAliasDescriptionField", "Lcom/ss/android/lark/profile/v2/entity/AliasDescriptionField;", "pbField", "parseBaseField", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "baseField", "parseCtas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/profile/v2/entity/CTA;", "Lkotlin/collections/ArrayList;", "pbCtas", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CTA;", "parseDepartmentField", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField;", "parseDepartmentPath", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField$DepartmentPath;", "pbDepartmentPath", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDepartmentPath;", "parseDescriptionField", "Lcom/ss/android/lark/profile/v2/entity/DescriptionField;", "parseFields", "parseFieldsV3", "parseHrefField", "Lcom/ss/android/lark/profile/v2/entity/HrefField;", "parseHrefListField", "Lcom/ss/android/lark/profile/v2/entity/HrefListField;", "parseImageSetPassThrough", "Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "image", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonImageSetPassThrough;", "parseNameCardBaseField", "Lcom/bytedance/lark/pb/contact/v2/GetNamecardProfileResponse$Field;", "parseNameCardFields", "parseNameCardHrefField", "parseNameCardPhoneNumber", "Lcom/ss/android/lark/profile/v2/entity/PhoneNumberField;", "parseNameCardProfile", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "pbResponse", "Lcom/bytedance/lark/pb/contact/v2/GetNamecardProfileResponse;", "parseNameCardTextField", "Lcom/ss/android/lark/profile/v2/entity/TextField;", "parseNameCardUserInfo", "Lcom/ss/android/lark/profile/v2/entity/UserInfo;", "pbUserInfo", "Lcom/bytedance/lark/pb/contact/v2/GetNamecardProfileResponse$UserInfo;", "parsePhoneNumber", "parseProfile", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse;", "parseTextField", "parseTextListField", "Lcom/ss/android/lark/profile/v2/entity/TextListField;", "parseTextStyle", "Lcom/ss/android/lark/profile/v2/entity/TextStyle;", "pbStyle", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;", "parseUserInfo", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$UserInfo;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Profile mo180741a(GetUserProfileResponse getUserProfileResponse) {
            Intrinsics.checkParameterIsNotNull(getUserProfileResponse, "pbResponse");
            Companion aVar = this;
            GetUserProfileResponse.UserInfo userInfo = getUserProfileResponse.user_info;
            Intrinsics.checkExpressionValueIsNotNull(userInfo, "pbResponse.user_info");
            UserInfo a = aVar.m204846a(userInfo);
            List<GetUserProfileResponse.CTA> list = getUserProfileResponse.cta_orders;
            Intrinsics.checkExpressionValueIsNotNull(list, "pbResponse.cta_orders");
            ArrayList<CTA> c = aVar.m204855c(list);
            List<GetUserProfileResponse.Field> list2 = getUserProfileResponse.field_orders;
            Intrinsics.checkExpressionValueIsNotNull(list2, "pbResponse.field_orders");
            return new Profile(a, c, aVar.mo180742a(list2));
        }

        /* renamed from: a */
        public final Profile mo180740a(GetNamecardProfileResponse getNamecardProfileResponse) {
            Intrinsics.checkParameterIsNotNull(getNamecardProfileResponse, "pbResponse");
            Companion aVar = this;
            UserInfo a = aVar.m204845a(getNamecardProfileResponse.user_info);
            ArrayList arrayList = new ArrayList();
            List<GetNamecardProfileResponse.Field> list = getNamecardProfileResponse.field_orders;
            Intrinsics.checkExpressionValueIsNotNull(list, "pbResponse.field_orders");
            return new Profile(a, arrayList, aVar.m204859e(list));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0150 A[LOOP:0: B:20:0x014a->B:22:0x0150, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final com.ss.android.lark.profile.v2.entity.UserInfo m204846a(com.bytedance.lark.pb.contact.v2.GetUserProfileResponse.UserInfo r14) {
            /*
            // Method dump skipped, instructions count: 392
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.v2.service.ModelParser.Companion.m204846a(com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$UserInfo):com.ss.android.lark.profile.v2.entity.UserInfo");
        }

        /* renamed from: a */
        private final UserInfo m204845a(GetNamecardProfileResponse.UserInfo userInfo) {
            UserInfo userInfo2 = new UserInfo();
            if (userInfo != null) {
                userInfo2.setNameCardId(userInfo.namecard_id);
                GetNamecardProfileResponse.UserInfo.FriendStatus friendStatus = userInfo.friend_status;
                Intrinsics.checkExpressionValueIsNotNull(friendStatus, "pbUserInfo.friend_status");
                userInfo2.setFriendStatus(friendStatus.getValue());
                userInfo2.setUserName(userInfo.user_name);
                userInfo2.setAvatarKey(userInfo.avatar_key);
                userInfo2.setTenantName(userInfo.company_name);
            } else {
                userInfo2.setFriendStatus(GetNamecardProfileResponse.UserInfo.FriendStatus.None.getValue());
            }
            return userInfo2;
        }

        /* renamed from: a */
        public final ArrayList<BaseField> mo180742a(List<GetUserProfileResponse.Field> list) {
            Intrinsics.checkParameterIsNotNull(list, "pbFields");
            ArrayList<BaseField> arrayList = new ArrayList<>();
            for (T t : list) {
                GetUserProfileResponse.Field.FieldType fieldType = t.field_type;
                if (fieldType != null) {
                    switch (C52915a.f130759a[fieldType.ordinal()]) {
                        case 1:
                            arrayList.add(ModelParser.f130758a.m204844a((GetUserProfileResponse.Field) t));
                            continue;
                        case 2:
                            arrayList.add(ModelParser.f130758a.m204854c((GetUserProfileResponse.Field) t));
                            continue;
                        case 3:
                            arrayList.add(ModelParser.f130758a.m204858e((GetUserProfileResponse.Field) t));
                            continue;
                        case 4:
                            arrayList.add(ModelParser.f130758a.m204856d((GetUserProfileResponse.Field) t));
                            continue;
                        case 5:
                            arrayList.add(ModelParser.f130758a.m204844a((GetUserProfileResponse.Field) t));
                            continue;
                        case 6:
                            arrayList.add(ModelParser.f130758a.m204860f(t));
                            continue;
                        case 7:
                            arrayList.add(ModelParser.f130758a.m204861g(t));
                            continue;
                        case 8:
                            arrayList.add(ModelParser.f130758a.m204862h(t));
                            continue;
                        case 9:
                            HrefField e = ModelParser.f130758a.m204858e((GetUserProfileResponse.Field) t);
                            e.setLink("lark://client/contact/share");
                            IProfileModuleDependency d = C52239a.m202617d();
                            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                            if (DesktopUtil.m144301a(d.mo133562b())) {
                                e.setName(UIHelper.getString(R.string.Lark_Legacy_WebCopyLink));
                            }
                            arrayList.add(e);
                            continue;
                    }
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private final TextField m204844a(GetUserProfileResponse.Field field) {
            JsonStyle style;
            JsonI18nVal text;
            TextField textField = new TextField();
            m204841a(field, textField);
            String str = field.json_field_val;
            if (str != null) {
                JsonText nVar = (JsonText) JSON.parseObject(str, JsonText.class);
                if (!(nVar == null || (text = nVar.getText()) == null)) {
                    textField.setText(ModelParser.f130758a.m204850a(text));
                }
                if (!(nVar == null || (style = nVar.getStyle()) == null)) {
                    textField.setTextStyle(ModelParser.f130758a.m204847a(style));
                }
            }
            return textField;
        }

        /* renamed from: a */
        private final TextStyle m204847a(JsonStyle mVar) {
            TextStyle aVar = new TextStyle();
            String color = mVar.getColor();
            if (color == null) {
                color = "0";
            }
            aVar.mo180731a(color);
            Boolean expandable = mVar.getExpandable();
            int i = 0;
            aVar.mo180732a(expandable != null ? expandable.booleanValue() : false);
            Integer max_lines = mVar.getMax_lines();
            if (max_lines != null) {
                i = max_lines.intValue();
            }
            aVar.mo180730a(i);
            return aVar;
        }

        /* renamed from: a */
        private final String m204849a(GetUserProfileResponse.I18nVal i18nVal) {
            StringBuilder sb = new StringBuilder();
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            Locale h = d.mo133577h();
            Intrinsics.checkExpressionValueIsNotNull(h, "ProfileModule.getDependency().languageSetting");
            sb.append(h.getLanguage());
            sb.append('_');
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            Locale h2 = d2.mo133577h();
            Intrinsics.checkExpressionValueIsNotNull(h2, "ProfileModule.getDependency().languageSetting");
            sb.append(h2.getCountry());
            String sb2 = sb.toString();
            Map<String, String> map = i18nVal.i18n_vals;
            if (sb2 != null) {
                String lowerCase = sb2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                String str = map.get(lowerCase);
                return TextUtils.isEmpty(str) ? i18nVal.default_val : str;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: a */
        private final String m204850a(JsonI18nVal hVar) {
            String str;
            StringBuilder sb = new StringBuilder();
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            Locale h = d.mo133577h();
            Intrinsics.checkExpressionValueIsNotNull(h, "ProfileModule.getDependency().languageSetting");
            sb.append(h.getLanguage());
            sb.append('_');
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            Locale h2 = d2.mo133577h();
            Intrinsics.checkExpressionValueIsNotNull(h2, "ProfileModule.getDependency().languageSetting");
            sb.append(h2.getCountry());
            String sb2 = sb.toString();
            Map<String, String> i18n_vals = hVar.getI18n_vals();
            if (i18n_vals == null) {
                str = null;
            } else if (sb2 != null) {
                String lowerCase = sb2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                str = i18n_vals.get(lowerCase);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            return TextUtils.isEmpty(str) ? hVar.getDefault_val() : str;
        }

        /* renamed from: a */
        private final String m204848a(GetNamecardProfileResponse.I18nVal i18nVal) {
            StringBuilder sb = new StringBuilder();
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            Locale h = d.mo133577h();
            Intrinsics.checkExpressionValueIsNotNull(h, "ProfileModule.getDependency().languageSetting");
            sb.append(h.getLanguage());
            sb.append('_');
            IProfileModuleDependency d2 = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
            Locale h2 = d2.mo133577h();
            Intrinsics.checkExpressionValueIsNotNull(h2, "ProfileModule.getDependency().languageSetting");
            sb.append(h2.getCountry());
            String sb2 = sb.toString();
            Map<String, String> map = i18nVal.i18n_vals;
            if (sb2 != null) {
                String lowerCase = sb2.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                String str = map.get(lowerCase);
                return TextUtils.isEmpty(str) ? i18nVal.default_val : str;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final Cipher m204838a(JsonCipher bVar) {
            ByteString byteString;
            ByteString byteString2;
            ByteString byteString3 = null;
            if (bVar == null) {
                return null;
            }
            String secret = bVar.getSecret();
            if (secret != null) {
                byteString = ByteString.decodeBase64(secret);
            } else {
                byteString = null;
            }
            String nonce = bVar.getNonce();
            if (nonce != null) {
                byteString2 = ByteString.decodeBase64(nonce);
            } else {
                byteString2 = null;
            }
            String additional_data = bVar.getAdditional_data();
            if (additional_data != null) {
                byteString3 = ByteString.decodeBase64(additional_data);
            }
            return new Cipher.Builder().secret(byteString).nonce(byteString2).additional_data(byteString3).build();
        }

        /* renamed from: b */
        private final AliasDescriptionField m204851b(GetUserProfileResponse.Field field) {
            ImageSetPassThrough imageSetPassThrough = null;
            AliasDescriptionField aliasDescriptionField = new AliasDescriptionField(null, null, 3, null);
            m204841a(field, aliasDescriptionField);
            String str = field.json_field_val;
            if (str != null) {
                JsonMemoDescription jVar = (JsonMemoDescription) JSON.parseObject(str, JsonMemoDescription.class);
                String memo_text = jVar.getMemo_text();
                if (memo_text == null) {
                    memo_text = "";
                }
                aliasDescriptionField.setDescription(memo_text);
                JsonImageSetPassThrough memo_picture = jVar.getMemo_picture();
                if (memo_picture != null) {
                    imageSetPassThrough = ModelParser.f130758a.m204839a(memo_picture);
                }
                aliasDescriptionField.setImage(imageSetPassThrough);
            }
            return aliasDescriptionField;
        }

        /* renamed from: c */
        private final PhoneNumberField m204853c(GetNamecardProfileResponse.Field field) {
            PhoneNumberField phoneNumberField = new PhoneNumberField();
            phoneNumberField.setPlain(true);
            m204840a(field, phoneNumberField);
            String str = field.json_field_val;
            if (str != null) {
                JsonPhoneNumber kVar = (JsonPhoneNumber) JSON.parseObject(str, JsonPhoneNumber.class);
                phoneNumberField.setCountryCode(kVar.getCountry_code());
                phoneNumberField.setNumber(kVar.getNumber());
                phoneNumberField.setRateLimited(kVar.getRate_limited());
                phoneNumberField.setPlain(kVar.is_plain());
            }
            return phoneNumberField;
        }

        /* renamed from: f */
        private final DescriptionField m204860f(GetUserProfileResponse.Field field) {
            int i;
            DescriptionField descriptionField = new DescriptionField();
            m204841a(field, descriptionField);
            String str = field.json_field_val;
            if (str != null) {
                JsonDescription jsonDescription = (JsonDescription) JSON.parseObject(str, JsonDescription.class);
                String text = jsonDescription.getText();
                JsonDescription.Type type = jsonDescription.getType();
                if (type != null) {
                    i = type.getValue();
                } else {
                    i = 0;
                }
                descriptionField.setDescription(new ChatterDescription(text, ChatterDescription.Type.valueOf(i)));
            }
            return descriptionField;
        }

        /* renamed from: h */
        private final PhoneNumberField m204862h(GetUserProfileResponse.Field field) {
            PhoneNumberField phoneNumberField = new PhoneNumberField();
            m204841a(field, phoneNumberField);
            String str = field.json_field_val;
            if (str != null) {
                JsonPhoneNumber kVar = (JsonPhoneNumber) JSON.parseObject(str, JsonPhoneNumber.class);
                phoneNumberField.setCountryCode(kVar.getCountry_code());
                phoneNumberField.setNumber(kVar.getNumber());
                phoneNumberField.setRateLimited(kVar.getRate_limited());
                phoneNumberField.setPlain(kVar.is_plain());
            }
            return phoneNumberField;
        }

        /* renamed from: a */
        private final ImageSetPassThrough m204839a(JsonImageSetPassThrough iVar) {
            int i;
            JsonCipher bVar;
            JsonSerCrypto crypto = iVar.getCrypto();
            if (crypto != null) {
                i = crypto.getType();
            } else {
                i = 0;
            }
            SerCrypto.Type fromValue = SerCrypto.Type.fromValue(i);
            SerCrypto.Builder builder = new SerCrypto.Builder();
            Companion aVar = this;
            JsonSerCrypto crypto2 = iVar.getCrypto();
            if (crypto2 != null) {
                bVar = crypto2.getCipher();
            } else {
                bVar = null;
            }
            ImageSetPassThrough a = new ImageSetPassThrough.C15013a().mo54865a(iVar.getKey()).mo54867b(iVar.getFs_unit()).mo54864a(builder.cipher(aVar.m204838a(bVar)).type(fromValue).build()).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "ImageSetPassThrough.Buil…crypto(serCrypto).build()");
            return a;
        }

        /* renamed from: b */
        private final HrefField m204852b(GetNamecardProfileResponse.Field field) {
            JsonStyle style;
            JsonI18nVal link;
            JsonI18nVal title;
            HrefField hrefField = new HrefField();
            m204840a(field, hrefField);
            String str = field.json_field_val;
            if (str != null) {
                JsonHref fVar = (JsonHref) JSON.parseObject(str, JsonHref.class);
                if (!(fVar == null || (title = fVar.getTitle()) == null)) {
                    hrefField.setTitle(ModelParser.f130758a.m204850a(title));
                }
                if (!(fVar == null || (link = fVar.getLink()) == null)) {
                    hrefField.setLink(ModelParser.f130758a.m204850a(link));
                }
                if (!(fVar == null || (style = fVar.getStyle()) == null)) {
                    hrefField.setTextStyle(ModelParser.f130758a.m204847a(style));
                }
            }
            return hrefField;
        }

        /* renamed from: c */
        private final TextListField m204854c(GetUserProfileResponse.Field field) {
            List<JsonText> text_list;
            TextListField textListField = new TextListField();
            m204841a(field, textListField);
            String str = field.json_field_val;
            if (str != null) {
                JsonTextList oVar = (JsonTextList) JSON.parseObject(str, JsonTextList.class);
                ArrayList arrayList = null;
                if (!(oVar == null || (text_list = oVar.getText_list()) == null)) {
                    List<JsonText> list = text_list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (T t : list) {
                        TextField textField = new TextField();
                        JsonI18nVal text = t.getText();
                        textField.setText(text != null ? ModelParser.f130758a.m204850a(text) : null);
                        JsonStyle style = t.getStyle();
                        textField.setTextStyle(style != null ? ModelParser.f130758a.m204847a(style) : null);
                        arrayList2.add(textField);
                    }
                    arrayList = arrayList2;
                }
                textListField.setData(arrayList);
            }
            return textListField;
        }

        /* renamed from: e */
        private final HrefField m204858e(GetUserProfileResponse.Field field) {
            JsonStyle style;
            JsonI18nVal link;
            JsonI18nVal title;
            HrefField hrefField = new HrefField();
            m204841a(field, hrefField);
            String str = field.json_field_val;
            if (str != null) {
                JsonHref fVar = (JsonHref) JSON.parseObject(str, JsonHref.class);
                if (!(fVar == null || (title = fVar.getTitle()) == null)) {
                    hrefField.setTitle(ModelParser.f130758a.m204850a(title));
                }
                if (!(fVar == null || (link = fVar.getLink()) == null)) {
                    hrefField.setLink(ModelParser.f130758a.m204850a(link));
                }
                if (!(fVar == null || (style = fVar.getStyle()) == null)) {
                    hrefField.setTextStyle(ModelParser.f130758a.m204847a(style));
                }
            }
            return hrefField;
        }

        /* renamed from: g */
        private final DepartmentField m204861g(GetUserProfileResponse.Field field) {
            JsonDepartment cVar;
            List<JsonDepartmentPath> department_paths;
            DepartmentField departmentField = new DepartmentField();
            m204841a(field, departmentField);
            ArrayList arrayList = new ArrayList();
            String str = field.json_field_val;
            if (!(str == null || (cVar = (JsonDepartment) JSON.parseObject(str, JsonDepartment.class)) == null || (department_paths = cVar.getDepartment_paths()) == null)) {
                Iterator<T> it = department_paths.iterator();
                while (it.hasNext()) {
                    arrayList.add(ModelParser.f130758a.m204842a((JsonDepartmentPath) it.next()));
                }
            }
            departmentField.setDepartmentPathList(arrayList);
            return departmentField;
        }

        /* renamed from: c */
        private final ArrayList<CTA> m204855c(List<GetUserProfileResponse.CTA> list) {
            ArrayList<CTA> arrayList = new ArrayList<>();
            for (T t : list) {
                CTA cta = new CTA();
                String str = t.key;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.key");
                cta.setKey(str);
                GetUserProfileResponse.CTA.CTAType cTAType = t.cta_type;
                Intrinsics.checkExpressionValueIsNotNull(cTAType, "it.cta_type");
                cta.setCtaType(cTAType.getValue());
                Boolean bool = t.enable;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.enable");
                cta.setEnable(bool.booleanValue());
                GetUserProfileResponse.I18nVal i18nVal = t.i18n_names;
                if (i18nVal != null) {
                    cta.setName(ModelParser.f130758a.m204849a(i18nVal));
                }
                cta.setUrl(t.link);
                cta.setIconKey(t.icon_key);
                GetUserProfileResponse.CTA.DeniedReason deniedReason = t.deny_reason;
                Intrinsics.checkExpressionValueIsNotNull(deniedReason, "it.deny_reason");
                cta.setDenyReason(deniedReason.getValue());
                if (t.denied_description != null) {
                    Companion aVar = ModelParser.f130758a;
                    GetUserProfileResponse.I18nVal i18nVal2 = t.denied_description;
                    if (i18nVal2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(i18nVal2, "it.denied_description!!");
                    cta.setDenyReasonDescription(aVar.m204849a(i18nVal2));
                } else {
                    cta.setDenyReasonDescription(null);
                }
                arrayList.add(cta);
            }
            return arrayList;
        }

        /* renamed from: d */
        private final HrefListField m204856d(GetUserProfileResponse.Field field) {
            HrefListField hrefListField = new HrefListField();
            m204841a(field, hrefListField);
            String str = field.json_field_val;
            if (str != null) {
                List<JsonHref> href_list = ((JsonHrefList) JSON.parseObject(str, JsonHrefList.class)).getHref_list();
                ArrayList arrayList = null;
                if (href_list != null) {
                    List<JsonHref> list = href_list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (T t : list) {
                        HrefField hrefField = new HrefField();
                        JsonI18nVal title = t.getTitle();
                        hrefField.setTitle(title != null ? ModelParser.f130758a.m204850a(title) : null);
                        JsonI18nVal link = t.getLink();
                        hrefField.setLink(link != null ? ModelParser.f130758a.m204850a(link) : null);
                        JsonStyle style = t.getStyle();
                        hrefField.setTextStyle(style != null ? ModelParser.f130758a.m204847a(style) : null);
                        hrefField.setType(field.key);
                        arrayList2.add(hrefField);
                    }
                    arrayList = arrayList2;
                }
                hrefListField.setData(arrayList);
            }
            return hrefListField;
        }

        /* renamed from: e */
        private final ArrayList<BaseField> m204859e(List<GetNamecardProfileResponse.Field> list) {
            ArrayList<BaseField> arrayList = new ArrayList<>();
            for (T t : list) {
                GetNamecardProfileResponse.Field.FieldType fieldType = t.field_type;
                if (fieldType != null) {
                    int i = C52915a.f130761c[fieldType.ordinal()];
                    if (i == 1) {
                        arrayList.add(ModelParser.f130758a.m204843a((GetNamecardProfileResponse.Field) t));
                    } else if (i == 2) {
                        arrayList.add(ModelParser.f130758a.m204852b((GetNamecardProfileResponse.Field) t));
                    } else if (i == 3) {
                        arrayList.add(ModelParser.f130758a.m204853c((GetNamecardProfileResponse.Field) t));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final ArrayList<BaseField> mo180743b(List<GetUserProfileResponse.Field> list) {
            Intrinsics.checkParameterIsNotNull(list, "pbFields");
            ArrayList<BaseField> arrayList = new ArrayList<>();
            for (T t : m204857d(list)) {
                GetUserProfileResponse.Field.FieldType fieldType = t.field_type;
                if (fieldType != null) {
                    switch (C52915a.f130760b[fieldType.ordinal()]) {
                        case 1:
                            arrayList.add(ModelParser.f130758a.m204844a((GetUserProfileResponse.Field) t));
                            continue;
                        case 2:
                            arrayList.add(ModelParser.f130758a.m204854c((GetUserProfileResponse.Field) t));
                            continue;
                        case 3:
                            arrayList.add(ModelParser.f130758a.m204858e((GetUserProfileResponse.Field) t));
                            continue;
                        case 4:
                            arrayList.add(ModelParser.f130758a.m204856d((GetUserProfileResponse.Field) t));
                            continue;
                        case 5:
                            arrayList.add(ModelParser.f130758a.m204844a((GetUserProfileResponse.Field) t));
                            continue;
                        case 6:
                            arrayList.add(ModelParser.f130758a.m204844a((GetUserProfileResponse.Field) t));
                            continue;
                        case 7:
                            arrayList.add(ModelParser.f130758a.m204851b((GetUserProfileResponse.Field) t));
                            continue;
                        case 8:
                            arrayList.add(ModelParser.f130758a.m204860f(t));
                            continue;
                        case 9:
                            arrayList.add(ModelParser.f130758a.m204861g(t));
                            continue;
                        case 10:
                            arrayList.add(ModelParser.f130758a.m204862h(t));
                            continue;
                        case 11:
                            HrefField e = ModelParser.f130758a.m204858e((GetUserProfileResponse.Field) t);
                            e.setLink("lark://client/contact/share");
                            IProfileModuleDependency d = C52239a.m202617d();
                            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                            if (DesktopUtil.m144301a(d.mo133562b())) {
                                e.setName(UIHelper.getString(R.string.Lark_Legacy_WebCopyLink));
                            }
                            arrayList.add(e);
                            continue;
                    }
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x001b A[SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse.Field> m204857d(java.util.List<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse.Field> r8) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.v2.service.ModelParser.Companion.m204857d(java.util.List):java.util.List");
        }

        /* renamed from: a */
        private final DepartmentField.DepartmentPath m204842a(JsonDepartmentPath eVar) {
            DepartmentField.DepartmentPath bVar = new DepartmentField.DepartmentPath();
            ArrayList arrayList = new ArrayList();
            List<JsonDepartmentNode> department_nodes = eVar.getDepartment_nodes();
            if (department_nodes != null) {
                for (T t : department_nodes) {
                    DepartmentField.DepartmentNode aVar = new DepartmentField.DepartmentNode();
                    aVar.mo180651a(t.getDepartment_id());
                    JsonI18nVal department_name = t.getDepartment_name();
                    if (department_name != null) {
                        aVar.mo180653b(ModelParser.f130758a.m204850a(department_name));
                    }
                    arrayList.add(aVar);
                }
            }
            bVar.mo180655a(arrayList);
            return bVar;
        }

        /* renamed from: a */
        private final TextField m204843a(GetNamecardProfileResponse.Field field) {
            JsonStyle style;
            JsonI18nVal text;
            TextField textField = new TextField();
            m204840a(field, textField);
            String str = field.json_field_val;
            if (str != null) {
                JsonText nVar = (JsonText) JSON.parseObject(str, JsonText.class);
                if (!(nVar == null || (text = nVar.getText()) == null)) {
                    textField.setText(ModelParser.f130758a.m204850a(text));
                }
                if (!(nVar == null || (style = nVar.getStyle()) == null)) {
                    textField.setTextStyle(ModelParser.f130758a.m204847a(style));
                }
            }
            return textField;
        }

        /* renamed from: a */
        private final BaseField m204840a(GetNamecardProfileResponse.Field field, BaseField baseField) {
            GetNamecardProfileResponse.Field.FieldType fieldType = field.field_type;
            Intrinsics.checkExpressionValueIsNotNull(fieldType, "pbField.field_type");
            baseField.setFieldType(fieldType.getValue());
            String str = field.key;
            Intrinsics.checkExpressionValueIsNotNull(str, "pbField.key");
            baseField.setKey(str);
            GetNamecardProfileResponse.I18nVal i18nVal = field.i18n_names;
            if (i18nVal != null) {
                Companion aVar = ModelParser.f130758a;
                Intrinsics.checkExpressionValueIsNotNull(i18nVal, "it");
                baseField.setName(aVar.m204848a(i18nVal));
            }
            return baseField;
        }

        /* renamed from: a */
        private final BaseField m204841a(GetUserProfileResponse.Field field, BaseField baseField) {
            GetUserProfileResponse.Field.FieldType fieldType = field.field_type;
            Intrinsics.checkExpressionValueIsNotNull(fieldType, "pbField.field_type");
            baseField.setFieldType(fieldType.getValue());
            String str = field.key;
            Intrinsics.checkExpressionValueIsNotNull(str, "pbField.key");
            baseField.setKey(str);
            GetUserProfileResponse.I18nVal i18nVal = field.i18n_names;
            if (i18nVal != null) {
                baseField.setName(ModelParser.f130758a.m204849a(i18nVal));
            }
            return baseField;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonCipher;", "Ljava/io/Serializable;", "()V", "additional_data", "", "getAdditional_data", "()Ljava/lang/String;", "setAdditional_data", "(Ljava/lang/String;)V", "nonce", "getNonce", "setNonce", "secret", "getSecret", "setSecret", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$b */
    public static final class JsonCipher implements Serializable {
        private String additional_data;
        private String nonce;
        private String secret;

        public final String getAdditional_data() {
            return this.additional_data;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getSecret() {
            return this.secret;
        }

        public final void setAdditional_data(String str) {
            this.additional_data = str;
        }

        public final void setNonce(String str) {
            this.nonce = str;
        }

        public final void setSecret(String str) {
            this.secret = str;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDepartment;", "Ljava/io/Serializable;", "()V", "department_paths", "", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDepartmentPath;", "getDepartment_paths", "()Ljava/util/List;", "setDepartment_paths", "(Ljava/util/List;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$c */
    public static final class JsonDepartment implements Serializable {
        private List<JsonDepartmentPath> department_paths;

        public final List<JsonDepartmentPath> getDepartment_paths() {
            return this.department_paths;
        }

        public final void setDepartment_paths(List<JsonDepartmentPath> list) {
            this.department_paths = list;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDepartmentNode;", "Ljava/io/Serializable;", "()V", "department_id", "", "getDepartment_id", "()Ljava/lang/String;", "setDepartment_id", "(Ljava/lang/String;)V", "department_name", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "getDepartment_name", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "setDepartment_name", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$d */
    public static final class JsonDepartmentNode implements Serializable {
        private String department_id;
        private JsonI18nVal department_name;

        public final String getDepartment_id() {
            return this.department_id;
        }

        public final JsonI18nVal getDepartment_name() {
            return this.department_name;
        }

        public final void setDepartment_id(String str) {
            this.department_id = str;
        }

        public final void setDepartment_name(JsonI18nVal hVar) {
            this.department_name = hVar;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDepartmentPath;", "Ljava/io/Serializable;", "()V", "department_nodes", "", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonDepartmentNode;", "getDepartment_nodes", "()Ljava/util/List;", "setDepartment_nodes", "(Ljava/util/List;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$e */
    public static final class JsonDepartmentPath implements Serializable {
        private List<JsonDepartmentNode> department_nodes;

        public final List<JsonDepartmentNode> getDepartment_nodes() {
            return this.department_nodes;
        }

        public final void setDepartment_nodes(List<JsonDepartmentNode> list) {
            this.department_nodes = list;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonHref;", "Ljava/io/Serializable;", "()V", "link", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "getLink", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "setLink", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;)V", "style", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;", "getStyle", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;", "setStyle", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;)V", "title", "getTitle", "setTitle", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$f */
    public static final class JsonHref implements Serializable {
        private JsonI18nVal link;
        private JsonStyle style;
        private JsonI18nVal title;

        public final JsonI18nVal getLink() {
            return this.link;
        }

        public final JsonStyle getStyle() {
            return this.style;
        }

        public final JsonI18nVal getTitle() {
            return this.title;
        }

        public final void setLink(JsonI18nVal hVar) {
            this.link = hVar;
        }

        public final void setStyle(JsonStyle mVar) {
            this.style = mVar;
        }

        public final void setTitle(JsonI18nVal hVar) {
            this.title = hVar;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonHrefList;", "Ljava/io/Serializable;", "()V", "href_list", "", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonHref;", "getHref_list", "()Ljava/util/List;", "setHref_list", "(Ljava/util/List;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$g */
    public static final class JsonHrefList implements Serializable {
        private List<JsonHref> href_list;

        public final List<JsonHref> getHref_list() {
            return this.href_list;
        }

        public final void setHref_list(List<JsonHref> list) {
            this.href_list = list;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "Ljava/io/Serializable;", "()V", "default_val", "", "getDefault_val", "()Ljava/lang/String;", "setDefault_val", "(Ljava/lang/String;)V", "i18n_vals", "", "getI18n_vals", "()Ljava/util/Map;", "setI18n_vals", "(Ljava/util/Map;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$h */
    public static final class JsonI18nVal implements Serializable {
        private String default_val;
        private Map<String, String> i18n_vals;

        public final String getDefault_val() {
            return this.default_val;
        }

        public final Map<String, String> getI18n_vals() {
            return this.i18n_vals;
        }

        public final void setDefault_val(String str) {
            this.default_val = str;
        }

        public final void setI18n_vals(Map<String, String> map) {
            this.i18n_vals = map;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonImageSetPassThrough;", "Ljava/io/Serializable;", "()V", "crypto", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonSerCrypto;", "getCrypto", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonSerCrypto;", "setCrypto", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonSerCrypto;)V", "fs_unit", "", "getFs_unit", "()Ljava/lang/String;", "setFs_unit", "(Ljava/lang/String;)V", "key", "getKey", "setKey", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$i */
    public static final class JsonImageSetPassThrough implements Serializable {
        private JsonSerCrypto crypto;
        private String fs_unit;
        private String key;

        public final JsonSerCrypto getCrypto() {
            return this.crypto;
        }

        public final String getFs_unit() {
            return this.fs_unit;
        }

        public final String getKey() {
            return this.key;
        }

        public final void setCrypto(JsonSerCrypto lVar) {
            this.crypto = lVar;
        }

        public final void setFs_unit(String str) {
            this.fs_unit = str;
        }

        public final void setKey(String str) {
            this.key = str;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonMemoDescription;", "Ljava/io/Serializable;", "()V", "memo_picture", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonImageSetPassThrough;", "getMemo_picture", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonImageSetPassThrough;", "setMemo_picture", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonImageSetPassThrough;)V", "memo_text", "", "getMemo_text", "()Ljava/lang/String;", "setMemo_text", "(Ljava/lang/String;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$j */
    public static final class JsonMemoDescription implements Serializable {
        private JsonImageSetPassThrough memo_picture;
        private String memo_text;

        public final JsonImageSetPassThrough getMemo_picture() {
            return this.memo_picture;
        }

        public final String getMemo_text() {
            return this.memo_text;
        }

        public final void setMemo_picture(JsonImageSetPassThrough iVar) {
            this.memo_picture = iVar;
        }

        public final void setMemo_text(String str) {
            this.memo_text = str;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonPhoneNumber;", "Ljava/io/Serializable;", "()V", "country_code", "", "getCountry_code", "()Ljava/lang/String;", "setCountry_code", "(Ljava/lang/String;)V", "is_plain", "", "()Z", "set_plain", "(Z)V", "number", "getNumber", "setNumber", "rate_limited", "getRate_limited", "setRate_limited", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$k */
    public static final class JsonPhoneNumber implements Serializable {
        private String country_code;
        private boolean is_plain;
        private String number;
        private boolean rate_limited;

        public final String getCountry_code() {
            return this.country_code;
        }

        public final String getNumber() {
            return this.number;
        }

        public final boolean getRate_limited() {
            return this.rate_limited;
        }

        public final boolean is_plain() {
            return this.is_plain;
        }

        public final void setCountry_code(String str) {
            this.country_code = str;
        }

        public final void setNumber(String str) {
            this.number = str;
        }

        public final void setRate_limited(boolean z) {
            this.rate_limited = z;
        }

        public final void set_plain(boolean z) {
            this.is_plain = z;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonSerCrypto;", "Ljava/io/Serializable;", "()V", "cipher", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonCipher;", "getCipher", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonCipher;", "setCipher", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonCipher;)V", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$l */
    public static final class JsonSerCrypto implements Serializable {
        private JsonCipher cipher;
        private int type;

        public final JsonCipher getCipher() {
            return this.cipher;
        }

        public final int getType() {
            return this.type;
        }

        public final void setCipher(JsonCipher bVar) {
            this.cipher = bVar;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;", "Ljava/io/Serializable;", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "expandable", "", "getExpandable", "()Ljava/lang/Boolean;", "setExpandable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "max_lines", "", "getMax_lines", "()Ljava/lang/Integer;", "setMax_lines", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$m */
    public static final class JsonStyle implements Serializable {
        private String color;
        private Boolean expandable;
        private Integer max_lines;

        public final String getColor() {
            return this.color;
        }

        public final Boolean getExpandable() {
            return this.expandable;
        }

        public final Integer getMax_lines() {
            return this.max_lines;
        }

        public final void setColor(String str) {
            this.color = str;
        }

        public final void setExpandable(Boolean bool) {
            this.expandable = bool;
        }

        public final void setMax_lines(Integer num) {
            this.max_lines = num;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonText;", "Ljava/io/Serializable;", "()V", "style", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;", "getStyle", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;", "setStyle", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonStyle;)V", "text", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "getText", "()Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;", "setText", "(Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonI18nVal;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$n */
    public static final class JsonText implements Serializable {
        private JsonStyle style;
        private JsonI18nVal text;

        public final JsonStyle getStyle() {
            return this.style;
        }

        public final JsonI18nVal getText() {
            return this.text;
        }

        public final void setStyle(JsonStyle mVar) {
            this.style = mVar;
        }

        public final void setText(JsonI18nVal hVar) {
            this.text = hVar;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonTextList;", "Ljava/io/Serializable;", "()V", "text_list", "", "Lcom/ss/android/lark/profile/v2/service/ModelParser$JsonText;", "getText_list", "()Ljava/util/List;", "setText_list", "(Ljava/util/List;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.ModelParser$o */
    public static final class JsonTextList implements Serializable {
        private List<JsonText> text_list;

        public final List<JsonText> getText_list() {
            return this.text_list;
        }

        public final void setText_list(List<JsonText> list) {
            this.text_list = list;
        }
    }
}

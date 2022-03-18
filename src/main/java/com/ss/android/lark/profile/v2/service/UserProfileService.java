package com.ss.android.lark.profile.v2.service;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v2.GetNamecardProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetNamecardProfileResponse;
import com.bytedance.lark.pb.contact.v2.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.bytedance.lark.pb.contact.v2.QueryCondition;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.v2.entity.Profile;
import com.ss.android.lark.profile.v2.service.ModelParser;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0016J0\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/UserProfileService;", "Lcom/ss/android/lark/profile/v2/service/IUserProfileService;", "()V", "createSingleNameCard", "", "context", "Landroid/app/Activity;", "email", "", "name", "deleteSingleNameCard", "nameCardId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getCardNameProfileFromNet", "queryCondition", "Lcom/bytedance/lark/pb/contact/v2/QueryCondition;", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "getNameCardProfileFromLocal", "getProfileFromLocal", "token", ShareHitPoint.f121868c, "Lcom/ss/android/lark/biz/core/api/ContactSource;", "userId", "chatId", "getProfileFromNet", "updateSingleNameCard", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.v2.service.b */
public final class UserProfileService {

    /* renamed from: a */
    public static volatile UserProfileService f130762a;

    /* renamed from: b */
    public static final Companion f130763b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/v2/service/UserProfileService$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/profile/v2/service/UserProfileService;", "getInstance", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final UserProfileService mo180813a() {
            UserProfileService bVar;
            UserProfileService bVar2 = UserProfileService.f130762a;
            if (bVar2 != null) {
                return bVar2;
            }
            synchronized (this) {
                bVar = UserProfileService.f130762a;
                if (bVar == null) {
                    bVar = new UserProfileService(null);
                    UserProfileService.f130762a = bVar;
                }
            }
            return bVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private UserProfileService() {
    }

    /* renamed from: a */
    public void mo180812a(String str, String str2, ContactSource contactSource, IGetDataCallback<Profile> iGetDataCallback) {
        GetUserProfileRequest.Scene scene;
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetUserProfileRequest.C16488a aVar = new GetUserProfileRequest.C16488a();
        aVar.f42800g = true;
        aVar.f42796c = str;
        if (!TextUtils.isEmpty(str2)) {
            aVar.f42798e = str2;
            scene = GetUserProfileRequest.Scene.IN_CHAT;
        } else {
            scene = GetUserProfileRequest.Scene.BY_USER_ID;
        }
        aVar.f42794a = scene;
        aVar.f42795b = SyncDataStrategy.FORCE_SERVER;
        aVar.f42799f = com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType());
        aVar.mo58769a((Boolean) true);
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE_V2, aVar, iGetDataCallback, C52920f.f130768a);
    }

    /* renamed from: a */
    public void mo180811a(String str, ContactSource contactSource, IGetDataCallback<Profile> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetUserProfileRequest.C16488a aVar = new GetUserProfileRequest.C16488a();
        aVar.f42797d = str;
        aVar.f42794a = GetUserProfileRequest.Scene.BY_CONTACT_TOKEN;
        aVar.f42795b = SyncDataStrategy.FORCE_SERVER;
        aVar.f42799f = com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType());
        aVar.mo58769a((Boolean) true);
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE_V2, aVar, iGetDataCallback, C52921g.f130769a);
    }

    public /* synthetic */ UserProfileService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$b */
    public static final class C52916b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C52916b f130764a = new C52916b();

        C52916b() {
        }

        /* renamed from: a */
        public final Profile parse(byte[] bArr) {
            ModelParser.Companion aVar = ModelParser.f130758a;
            GetNamecardProfileResponse decode = GetNamecardProfileResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetNamecardProfileResponse.ADAPTER.decode(it)");
            return aVar.mo180740a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$c */
    public static final class C52917c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C52917c f130765a = new C52917c();

        C52917c() {
        }

        /* renamed from: a */
        public final Profile parse(byte[] bArr) {
            ModelParser.Companion aVar = ModelParser.f130758a;
            GetNamecardProfileResponse decode = GetNamecardProfileResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetNamecardProfileResponse.ADAPTER.decode(it)");
            return aVar.mo180740a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$d */
    public static final class C52918d<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C52918d f130766a = new C52918d();

        C52918d() {
        }

        /* renamed from: a */
        public final Profile parse(byte[] bArr) {
            ModelParser.Companion aVar = ModelParser.f130758a;
            GetUserProfileResponse decode = GetUserProfileResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetUserProfileResponse.ADAPTER.decode(it)");
            return aVar.mo180741a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$e */
    public static final class C52919e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C52919e f130767a = new C52919e();

        C52919e() {
        }

        /* renamed from: a */
        public final Profile parse(byte[] bArr) {
            ModelParser.Companion aVar = ModelParser.f130758a;
            GetUserProfileResponse decode = GetUserProfileResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetUserProfileResponse.ADAPTER.decode(it)");
            return aVar.mo180741a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$f */
    public static final class C52920f<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C52920f f130768a = new C52920f();

        C52920f() {
        }

        /* renamed from: a */
        public final Profile parse(byte[] bArr) {
            ModelParser.Companion aVar = ModelParser.f130758a;
            GetUserProfileResponse decode = GetUserProfileResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetUserProfileResponse.ADAPTER.decode(it)");
            return aVar.mo180741a(decode);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/v2/entity/Profile;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.service.b$g */
    public static final class C52921g<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C52921g f130769a = new C52921g();

        C52921g() {
        }

        /* renamed from: a */
        public final Profile parse(byte[] bArr) {
            ModelParser.Companion aVar = ModelParser.f130758a;
            GetUserProfileResponse decode = GetUserProfileResponse.ADAPTER.decode(bArr);
            Intrinsics.checkExpressionValueIsNotNull(decode, "GetUserProfileResponse.ADAPTER.decode(it)");
            return aVar.mo180741a(decode);
        }
    }

    /* renamed from: a */
    public Profile mo180804a(QueryCondition queryCondition) {
        Intrinsics.checkParameterIsNotNull(queryCondition, "queryCondition");
        GetNamecardProfileRequest.C16470a aVar = new GetNamecardProfileRequest.C16470a();
        aVar.f42774a = queryCondition;
        aVar.f42775b = SyncDataStrategy.LOCAL;
        Object syncSend = SdkSender.syncSend(Command.GET_NAMECARD_PROFILE, aVar, C52917c.f130765a);
        Intrinsics.checkExpressionValueIsNotNull(syncSend, "syncSend(GET_NAMECARD_PR…TER.decode(it))\n        }");
        return (Profile) syncSend;
    }

    /* renamed from: a */
    public void mo180807a(Activity activity, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(str, "nameCardId");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133582l().mo133651a(activity, str, 1);
    }

    /* renamed from: a */
    public Profile mo180805a(String str, ContactSource contactSource) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        GetUserProfileRequest.C16488a aVar = new GetUserProfileRequest.C16488a();
        aVar.f42797d = str;
        aVar.f42794a = GetUserProfileRequest.Scene.BY_CONTACT_TOKEN;
        aVar.f42795b = SyncDataStrategy.LOCAL;
        aVar.f42799f = com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType());
        aVar.mo58769a((Boolean) true);
        Object syncSend = SdkSender.syncSend(Command.GET_USER_PROFILE_V2, aVar, C52919e.f130767a);
        Intrinsics.checkExpressionValueIsNotNull(syncSend, "syncSend(GET_USER_PROFIL…TER.decode(it))\n        }");
        return (Profile) syncSend;
    }

    /* renamed from: a */
    public void mo180809a(QueryCondition queryCondition, IGetDataCallback<Profile> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(queryCondition, "queryCondition");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetNamecardProfileRequest.C16470a aVar = new GetNamecardProfileRequest.C16470a();
        aVar.f42774a = queryCondition;
        aVar.f42775b = SyncDataStrategy.FORCE_SERVER;
        SdkSender.asynSendRequestNonWrap(Command.GET_NAMECARD_PROFILE, aVar, iGetDataCallback, C52916b.f130764a);
    }

    /* renamed from: a */
    public void mo180810a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "nameCardId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133582l().mo133660c(str, iGetDataCallback);
    }

    /* renamed from: a */
    public Profile mo180806a(String str, String str2, ContactSource contactSource) {
        GetUserProfileRequest.Scene scene;
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(contactSource, ShareHitPoint.f121868c);
        GetUserProfileRequest.C16488a aVar = new GetUserProfileRequest.C16488a();
        aVar.f42796c = str;
        if (!TextUtils.isEmpty(str2)) {
            aVar.f42798e = str2;
            scene = GetUserProfileRequest.Scene.IN_CHAT;
        } else {
            scene = GetUserProfileRequest.Scene.BY_USER_ID;
        }
        aVar.f42794a = scene;
        aVar.f42799f = com.bytedance.lark.pb.basic.v1.ContactSource.fromValue(contactSource.getSourceType());
        aVar.mo58769a((Boolean) true);
        aVar.f42795b = SyncDataStrategy.LOCAL;
        Object syncSend = SdkSender.syncSend(Command.GET_USER_PROFILE_V2, aVar, C52918d.f130766a);
        Intrinsics.checkExpressionValueIsNotNull(syncSend, "syncSend(GET_USER_PROFIL…TER.decode(it))\n        }");
        return (Profile) syncSend;
    }

    /* renamed from: a */
    public void mo180808a(Activity activity, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(str, "email");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        d.mo133582l().mo133652a(activity, str2, str, 1);
    }
}

package com.ss.android.lark.contact.impl.setting.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.contact.v2.BlockUser;
import com.bytedance.lark.pb.contact.v2.GetBlockUserListRequest;
import com.bytedance.lark.pb.contact.v2.GetBlockUserListResponse;
import com.bytedance.lark.pb.contact.v2.GetBlockUserNumRequest;
import com.bytedance.lark.pb.contact.v2.GetBlockUserNumResponse;
import com.bytedance.lark.pb.contact.v2.GetUserMsgAuthRequest;
import com.bytedance.lark.pb.contact.v2.GetUserMsgAuthResponse;
import com.bytedance.lark.pb.contact.v2.MsgType;
import com.bytedance.lark.pb.contact.v2.SetupBlockUserRequest;
import com.bytedance.lark.pb.contact.v2.SetupUserMsgAuthRequest;
import com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigRequest;
import com.bytedance.lark.pb.settings.v1.GetAddFriendPrivateConfigResponse;
import com.bytedance.lark.pb.settings.v1.GetUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.GetUserSettingResponse;
import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.SetWayToAddMeSettingRequest;
import com.bytedance.lark.pb.settings.v1.SetWayToFindMeSettingRequest;
import com.bytedance.lark.pb.settings.v1.SmsPhoneUrgentSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.BlockListInfo;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.ExceptionUser;
import com.ss.android.lark.contact.impl.setting.service.entity.C36064a;
import com.ss.android.lark.contact.impl.setting.service.entity.C36065b;
import com.ss.android.lark.contact.impl.setting.service.entity.C36067c;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToAddMeSettingItem;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class PrivacyService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CoordinationType {
    }

    /* renamed from: com.ss.android.lark.contact.impl.setting.service.PrivacyService$a */
    private static class C36063a {

        /* renamed from: a */
        static PrivacyService f93203a = new PrivacyService();
    }

    /* renamed from: lambda$C-jtIhmbAFyK6R5GwgVp3j6UM7M  reason: not valid java name */
    public static /* synthetic */ Boolean m270505lambda$CjtIhmbAFyK6R5GwgVp3j6UM7M(byte[] bArr) {
        return true;
    }

    public static /* synthetic */ Boolean lambda$hE0wPdGDGHZ18WILZp0xrXK5wsk(byte[] bArr) {
        return true;
    }

    /* renamed from: a */
    public static PrivacyService m141400a() {
        return C36063a.f93203a;
    }

    /* renamed from: a */
    public void mo132581a(boolean z, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
        C35358a.m138143a().mo130177v().mo130183a("CHECK_PHONE_NOTIFY", Boolean.valueOf(z), iGetDataCallback);
    }

    /* renamed from: b */
    public C36067c mo132582b() {
        GetAddFriendPrivateConfigRequest.C19135a aVar = new GetAddFriendPrivateConfigRequest.C19135a();
        aVar.mo65415a(GetAddFriendPrivateConfigRequest.VersionType.FIRST_VERSION);
        return (C36067c) SdkSender.syncSend(Command.GET_ADD_FRIEND_PRIVATE_CONFIG, aVar, new SdkSender.IParser<C36067c>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360574 */

            /* renamed from: a */
            public C36067c parse(byte[] bArr) throws IOException {
                return C36065b.m141447a(GetAddFriendPrivateConfigResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: c */
    public C36064a mo132584c() {
        Log.m165389i("GET_USER_SETTING", "ding sms phone setting; is local = true");
        return (C36064a) SdkSender.syncSend(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(false), new SdkSender.IParser<C36064a>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360618 */

            /* renamed from: a */
            public C36064a parse(byte[] bArr) throws IOException {
                GetUserSettingResponse decode = GetUserSettingResponse.ADAPTER.decode(bArr);
                C36064a aVar = new C36064a();
                if (decode.sms_phone_urgent_setting != null) {
                    aVar.mo132611a(decode.sms_phone_urgent_setting.accept.booleanValue());
                    aVar.mo132613b(decode.sms_phone_urgent_setting.can_modify.booleanValue());
                    aVar.mo132615c(decode.sms_phone_urgent_setting.need_confirm.booleanValue());
                    aVar.mo132617d(decode.sms_phone_urgent_setting.can_send.booleanValue());
                }
                return aVar;
            }
        });
    }

    /* renamed from: d */
    public boolean mo132587d() {
        UniversalUserSetting a = C35358a.m138143a().mo130177v().mo130182a("CHECK_PHONE_NOTIFY");
        if (a.bool_value == null) {
            return true;
        }
        return a.bool_value.booleanValue();
    }

    /* renamed from: b */
    public void mo132583b(final IGetDataCallback<C36067c> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.RunnableC360585 */

            public void run() {
                if (iGetDataCallback != null) {
                    C36067c b = PrivacyService.this.mo132582b();
                    if (b != null) {
                        iGetDataCallback.onSuccess(b);
                    } else {
                        iGetDataCallback.onError(new ErrorResult("cannot load PrivacySetting from local"));
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public void mo132585c(final IGetDataCallback<C36064a> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.RunnableC360629 */

            public void run() {
                C36064a c = PrivacyService.this.mo132584c();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback == null) {
                    return;
                }
                if (c != null) {
                    iGetDataCallback.onSuccess(c);
                } else {
                    iGetDataCallback.onError(new ErrorResult(" local ding setting null"));
                }
            }
        });
    }

    /* renamed from: d */
    public void mo132586d(final IGetDataCallback<Boolean> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.AnonymousClass10 */

            public void run() {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(PrivacyService.this.mo132584c().mo132618d()));
                }
            }
        });
    }

    /* renamed from: f */
    public void mo132589f(IGetDataCallback<Integer> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_MSG_AUTH, new GetUserMsgAuthRequest.C16484a(), iGetDataCallback, $$Lambda$PrivacyService$cMiBN8LMuLEvsqmObZCBHw8Omc4.INSTANCE);
    }

    /* renamed from: g */
    public void mo132590g(IGetDataCallback<Integer> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_BLOCK_USER_NUM, new GetBlockUserNumRequest.C16444a(), iGetDataCallback, new SdkSender.IParser<Integer>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360563 */

            /* renamed from: a */
            public Integer parse(byte[] bArr) throws IOException {
                return GetBlockUserNumResponse.ADAPTER.decode(bArr).block_user_nums;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Integer m141404d(byte[] bArr) throws IOException {
        return Integer.valueOf(GetUserMsgAuthResponse.ADAPTER.decode(bArr).msg_type.getValue());
    }

    /* renamed from: e */
    public void mo132588e(IGetDataCallback<C36064a> iGetDataCallback) {
        Log.m165389i("GET_USER_SETTING", "ding sms phone setting; is local = false");
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), iGetDataCallback, new SdkSender.IParser<C36064a>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.AnonymousClass11 */

            /* renamed from: a */
            public C36064a parse(byte[] bArr) throws IOException {
                GetUserSettingResponse decode = GetUserSettingResponse.ADAPTER.decode(bArr);
                C36064a aVar = new C36064a();
                if (decode.sms_phone_urgent_setting != null) {
                    aVar.mo132611a(decode.sms_phone_urgent_setting.accept.booleanValue());
                    aVar.mo132613b(decode.sms_phone_urgent_setting.can_modify.booleanValue());
                    aVar.mo132615c(decode.sms_phone_urgent_setting.need_confirm.booleanValue());
                    aVar.mo132617d(decode.sms_phone_urgent_setting.can_send.booleanValue());
                }
                return aVar;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ BlockListInfo m141402b(byte[] bArr) throws IOException {
        GetBlockUserListResponse decode = GetBlockUserListResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        for (BlockUser blockUser : decode.user_infos) {
            arrayList.add(new ExceptionUser(blockUser.avatar_key, blockUser.user_name, blockUser.tenant_name, blockUser.user_id));
        }
        return new BlockListInfo(arrayList, decode.cursor, decode.has_more);
    }

    /* renamed from: a */
    public void mo132575a(IGetDataCallback<C36067c> iGetDataCallback) {
        GetAddFriendPrivateConfigRequest.C19135a aVar = new GetAddFriendPrivateConfigRequest.C19135a();
        aVar.mo65415a(GetAddFriendPrivateConfigRequest.VersionType.FIRST_VERSION);
        SdkSender.asynSendRequestNonWrap(Command.GET_ADD_FRIEND_PRIVATE_CONFIG, aVar, iGetDataCallback, new SdkSender.IParser<C36067c>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360541 */

            /* renamed from: a */
            public C36067c parse(byte[] bArr) throws IOException {
                return C36065b.m141447a(GetAddFriendPrivateConfigResponse.ADAPTER.decode(bArr));
            }
        });
    }

    /* renamed from: a */
    public void mo132574a(int i, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SETUP_MSG_AUTH, new SetupUserMsgAuthRequest.C16564a().mo58955a(MsgType.fromValue(i)), iGetDataCallback, $$Lambda$PrivacyService$CjtIhmbAFyK6R5GwgVp3j6UM7M.INSTANCE);
    }

    /* renamed from: a */
    public void mo132576a(WayToAddMeSettingItem wayToAddMeSettingItem, IGetDataCallback<Void> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_WAY_TO_ADD_ME_SETTING, new SetWayToAddMeSettingRequest.C19213a().mo65603a(C36065b.m141445a(wayToAddMeSettingItem)), iGetDataCallback, new SdkSender.IParser<Void>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360596 */

            /* renamed from: a */
            public Void parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    /* renamed from: a */
    public void mo132577a(C36064a aVar, IGetDataCallback<Void> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65588a(new SmsPhoneUrgentSetting(Boolean.valueOf(aVar.mo132612a()), Boolean.valueOf(aVar.mo132614b()), Boolean.valueOf(aVar.mo132616c()), Boolean.valueOf(aVar.mo132618d()))), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360552 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    /* renamed from: a */
    public void mo132578a(String str, IGetDataCallback<BlockListInfo> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.MGET_BLOCK_USER_INFO, new GetBlockUserListRequest.C16440a().mo58657a(str), iGetDataCallback, $$Lambda$PrivacyService$Tlzxu0V_vnBbBNNc2Fj3HhlTXhg.INSTANCE);
    }

    /* renamed from: a */
    public void mo132580a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SETUP_BLOCK_USER, new SetupBlockUserRequest.C16562a().mo58950a(str).mo58949a(Boolean.valueOf(z)), iGetDataCallback, $$Lambda$PrivacyService$hE0wPdGDGHZ18WILZp0xrXK5wsk.INSTANCE);
    }

    /* renamed from: a */
    public void mo132579a(String str, String str2, boolean z, IGetDataCallback<Void> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_WAY_TO_FIND_ME_SETTING, new SetWayToFindMeSettingRequest.C19215a().mo65610a(str).mo65608a(SetWayToFindMeSettingRequest.VersionType.FIRST_VERSION).mo65612b(str2).mo65609a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<Void>() {
            /* class com.ss.android.lark.contact.impl.setting.service.PrivacyService.C360607 */

            /* renamed from: a */
            public Void parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }
}

package com.ss.android.lark.setting.service.impl;

import ai.v1.ComposerSetting;
import ai.v1.GetComposerSettingRequest;
import ai.v1.GetComposerSettingResponse;
import ai.v1.MobileComposerSetting;
import ai.v1.SetComposerSettingRequest;
import ai.v1.SetComposerSettingResponse;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetClientStatusRequest;
import com.bytedance.lark.pb.basic.v1.GetClientStatusResponse;
import com.bytedance.lark.pb.basic.v1.SetClientStatusRequest;
import com.bytedance.lark.pb.basic.v1.SetClientStatusResponse;
import com.bytedance.lark.pb.im.v1.GetUrgentPhoneNumbersRequest;
import com.bytedance.lark.pb.im.v1.GetUrgentPhoneNumbersResponse;
import com.bytedance.lark.pb.settings.v1.GetUserSecurityConfigRequest;
import com.bytedance.lark.pb.settings.v1.GetUserSecurityConfigResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.biz.core.api.ISettingsUpdateListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.GetSmartReplySettingRequest;
import com.ss.android.lark.pb.ai.GetSmartReplySettingResponse;
import com.ss.android.lark.pb.ai.SetSmartReplySettingRequest;
import com.ss.android.lark.pb.ai.SetSmartReplySettingResponse;
import com.ss.android.lark.pb.ai.SmartReplySetting;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.NotificationDetail;
import com.ss.android.lark.setting.service.AbstractC54602b;
import com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting;
import com.ss.android.lark.setting.service.usersetting.p2674b.C54655a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.setting.service.impl.d */
public class C54617d implements AbstractC54602b {

    /* renamed from: a */
    private CopyOnWriteArrayList<ISettingsUpdateListener> f134941a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.service.impl.d$a */
    public static class C54627a {

        /* renamed from: a */
        public static C54617d f134961a = new C54617d(null);
    }

    /* renamed from: l */
    public static C54617d m211936l() {
        return C54627a.f134961a;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public boolean mo186520a() {
        return UserSP.getInstance().getBoolean("is_notification_shown", true);
    }

    private C54617d() {
        this.f134941a = new CopyOnWriteArrayList<>();
    }

    /* renamed from: p */
    private void m211938p() {
        UserSP.getInstance().remove("smart_reply_setting");
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: c */
    public boolean mo186525c() {
        return UserSP.getInstance().getBoolean("is_notification_vibrate_on", true);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: g */
    public boolean mo186529g() {
        return C54115c.m210080a().mo178285b("all_create_topic_group");
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: i */
    public boolean mo186531i() {
        return UserSP.getInstance().getBoolean("is_messenger_smart_compose_enabled", false);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: j */
    public boolean mo186532j() {
        return UserSP.getInstance().getBoolean("is_mail_smart_compose_enabled", false);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: k */
    public boolean mo186533k() {
        return C54655a.m212173a().mo186715c();
    }

    /* renamed from: m */
    public boolean mo186599m() {
        return UserSP.getInstance().getBoolean("ding_address_book_switch", false);
    }

    /* renamed from: o */
    private void m211937o() {
        UserSP.getInstance().remove("is_doc_smart_compose_enabled");
        UserSP.getInstance().remove("is_messenger_smart_compose_enabled");
        UserSP.getInstance().remove("is_mail_smart_compose_enabled");
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: e */
    public boolean mo186527e() {
        Boolean bool = (Boolean) SdkSender.sendRequest(Command.GET_CLIENT_STATUS, new GetClientStatusRequest.C14963a(), new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546192 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                boolean z;
                try {
                    z = GetClientStatusResponse.ADAPTER.decode(bArr).show_notice_detail.booleanValue();
                } catch (IOException e) {
                    Log.m165383e("SettingService", e.getMessage());
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: f */
    public Boolean mo186528f() {
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_USER_SECURITY_CONFIG, new GetUserSecurityConfigRequest.C19163a(), new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546225 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return GetUserSecurityConfigResponse.ADAPTER.decode(bArr).has_water_mark;
            }
        });
        if (syncSendMayError.f131573b != null) {
            return true;
        }
        return syncSendMayError.f131572a;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: h */
    public boolean mo186530h() {
        SmartReplySetting smartReplySetting = (SmartReplySetting) UserSP.getInstance().getJSONObject("smart_reply_setting", SmartReplySetting.class);
        if (smartReplySetting == null || smartReplySetting.isSmartReplyEnable()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public void mo186600n() {
        Iterator<ISettingsUpdateListener> it = this.f134941a.iterator();
        while (it.hasNext()) {
            ISettingsUpdateListener next = it.next();
            if (next != null) {
                next.onSettingsUpdate();
            }
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: d */
    public boolean mo186526d() {
        return C54115c.m210080a().mo178285b("mobile_sync_message");
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: b */
    public boolean mo186523b() {
        return UserSP.getInstance().getBoolean("is_notification_sound_on", true);
    }

    /* synthetic */ C54617d(C546181 r1) {
        this();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: b */
    public void mo186522b(ISettingsUpdateListener amVar) {
        this.f134941a.remove(amVar);
    }

    /* renamed from: com.ss.android.lark.setting.service.impl.d$1 */
    class C546181 implements SdkSender.IParser<Boolean> {
        /* renamed from: a */
        public Boolean parse(byte[] bArr) throws IOException {
            return GetUserSecurityConfigResponse.ADAPTER.decode(bArr).has_water_mark;
        }
    }

    /* renamed from: e */
    private void m211935e(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_CLIENT_STATUS, new GetClientStatusRequest.C14963a(), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546203 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                try {
                    return Boolean.valueOf(GetClientStatusResponse.ADAPTER.decode(bArr).show_notice_detail.booleanValue());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("get notify setting info error");
                }
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public void mo186515a(final IGetDataCallback<Boolean> iGetDataCallback) {
        m211935e(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.AnonymousClass10 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool != null) {
                    C54617d.this.mo186598d(bool.booleanValue());
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(bool);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: b */
    public void mo186521b(IGetDataCallback<List<String>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_URGENT_PHONE_NUMBERS, new GetUrgentPhoneNumbersRequest.C17747a(), iGetDataCallback, new SdkSender.IParser<List<String>>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.AnonymousClass12 */

            /* renamed from: a */
            public List<String> parse(byte[] bArr) throws IOException {
                return new ArrayList(GetUrgentPhoneNumbersResponse.ADAPTER.decode(bArr).phone_numbers);
            }
        });
    }

    /* renamed from: d */
    public void mo186598d(boolean z) {
        UserSP.getInstance().putBoolean("is_notification_detail", z);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public NotificationDetail mo186514a(String str) {
        String string = UserSP.getInstance().getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (NotificationDetail) JSON.parseObject(string, NotificationDetail.class);
    }

    /* renamed from: c */
    public void mo186595c(final IGetDataCallback<SmartReplySetting> iGetDataCallback) {
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.GET_SMART_REPLY_SETTING;
        GetSmartReplySettingRequest.C49475a aVar = new GetSmartReplySettingRequest.C49475a();
        C546236 r2 = new IGetDataCallback<GetSmartReplySettingResponse>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546236 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetSmartReplySettingResponse getSmartReplySettingResponse) {
                if (getSmartReplySettingResponse.msmart_reply_setting == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("smartreplysetting is null"));
                        return;
                    }
                    return;
                }
                SmartReplySetting smartReplySetting = new SmartReplySetting(getSmartReplySettingResponse.msmart_reply_setting.msmart_reply_enabled.booleanValue(), getSmartReplySettingResponse.msmart_reply_setting.msmart_action_enabled.booleanValue(), getSmartReplySettingResponse.mupdate_time);
                SmartReplySetting smartReplySetting2 = (SmartReplySetting) UserSP.getInstance().getJSONObject("smart_reply_setting", SmartReplySetting.class);
                if (smartReplySetting2 == null || smartReplySetting.compareTo(smartReplySetting2) > 0) {
                    UserSP.getInstance().putJSONObject("smart_reply_setting", smartReplySetting);
                }
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(smartReplySetting);
                }
            }
        };
        ProtoAdapter<GetSmartReplySettingResponse> protoAdapter = GetSmartReplySettingResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.service.impl.$$Lambda$ZZrV64iW3rUXUlJDC1I4K9ocUxg */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetSmartReplySettingResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: d */
    public void mo186597d(final IGetDataCallback<MobileComposerSetting> iGetDataCallback) {
        GetComposerSettingRequest.C0053a aVar = new GetComposerSettingRequest.C0053a();
        Command command = Command.GET_COMPOSER_SETTING;
        C546258 r2 = new IGetDataCallback<GetComposerSettingResponse>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546258 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetComposerSettingResponse getComposerSettingResponse) {
                if (getComposerSettingResponse.mobile_composer_setting != null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(getComposerSettingResponse.mobile_composer_setting);
                    }
                    C54617d.this.mo186594b(getComposerSettingResponse.mobile_composer_setting);
                    return;
                }
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onError(new ErrorResult("GetComposerSettingResponse.scenes empty"));
                }
            }
        };
        ProtoAdapter<GetComposerSettingResponse> protoAdapter = GetComposerSettingResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.service.impl.$$Lambda$fYaodZMIdQOHBnk2N8dCiMmktcc */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetComposerSettingResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo186592a(final MobileComposerSetting mobileComposerSetting) {
        SetComposerSettingRequest.C0073a aVar = new SetComposerSettingRequest.C0073a();
        aVar.mo123a(mobileComposerSetting).mo122a(new ComposerSetting.C0041a().build());
        Command command = Command.SET_COMPOSER_SETTING;
        C546269 r2 = new IGetDataCallback<SetComposerSettingResponse>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546269 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(SetComposerSettingResponse setComposerSettingResponse) {
                C54617d.this.mo186594b(mobileComposerSetting);
            }
        };
        ProtoAdapter<SetComposerSettingResponse> protoAdapter = SetComposerSettingResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.service.impl.$$Lambda$zhwe5ik3gMLZRca47MxoxAVQus */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SetComposerSettingResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    public void mo186594b(MobileComposerSetting mobileComposerSetting) {
        if (mobileComposerSetting.is_docs_enabled != null) {
            UserSP.getInstance().putBoolean("is_doc_smart_compose_enabled", mobileComposerSetting.is_docs_enabled.booleanValue());
        }
        if (mobileComposerSetting.is_messenger_enabled != null) {
            UserSP.getInstance().putBoolean("is_messenger_smart_compose_enabled", mobileComposerSetting.is_messenger_enabled.booleanValue());
        }
        if (mobileComposerSetting.is_mail_enabled != null) {
            UserSP.getInstance().putBoolean("is_mail_smart_compose_enabled", mobileComposerSetting.is_mail_enabled.booleanValue());
        }
    }

    /* renamed from: c */
    public void mo186596c(boolean z) {
        if (z) {
            if (C54115c.m210080a().mo178268D()) {
                mo186597d((IGetDataCallback<MobileComposerSetting>) null);
            }
            if (C54115c.m210080a().mo178269E()) {
                mo186595c((IGetDataCallback<SmartReplySetting>) null);
                return;
            }
            return;
        }
        m211937o();
        m211938p();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public void mo186516a(ISettingsUpdateListener amVar) {
        if (amVar != null && !this.f134941a.contains(amVar)) {
            this.f134941a.add(amVar);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: b */
    public boolean mo186524b(boolean z) {
        return UserSP.getInstance().getBoolean("is_notification_detail", z);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public void mo186518a(boolean z) {
        UserSP.getInstance().putBoolean("ding_address_book_switch", z);
    }

    /* renamed from: b */
    private void m211934b(boolean z, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_CLIENT_STATUS, new SetClientStatusRequest.C15264a().mo55564a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546214 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                SetClientStatusResponse.ADAPTER.decode(bArr);
                new JSONObject();
                return "";
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public void mo186517a(String str, NotificationDetail notificationDetail) {
        if (str != null && notificationDetail != null) {
            UserSP.getInstance().putString(str, JSON.toJSONString(notificationDetail));
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54602b
    /* renamed from: a */
    public void mo186519a(final boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
        m211934b(z, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C54617d.this.mo186598d(z);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186593a(final boolean z, final boolean z2) {
        SetSmartReplySettingRequest.C49515a aVar = new SetSmartReplySettingRequest.C49515a();
        aVar.mo172706a(new SmartReplySetting.C49525a().mo172732b(Boolean.valueOf(z2)).mo172730a(Boolean.valueOf(z)).build());
        com.ss.android.lark.pb.improto.Command command = com.ss.android.lark.pb.improto.Command.SET_SMART_REPLY_SETTING;
        C546247 r2 = new IGetDataCallback<SetSmartReplySettingResponse>() {
            /* class com.ss.android.lark.setting.service.impl.C54617d.C546247 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(SetSmartReplySettingResponse setSmartReplySettingResponse) {
                com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting smartReplySetting = (com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting) UserSP.getInstance().getJSONObject("smart_reply_setting", com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting.class);
                if (smartReplySetting == null) {
                    smartReplySetting = new com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting(z, z2, Long.valueOf(System.currentTimeMillis() / 1000));
                }
                smartReplySetting.setSmartActionEnable(z2);
                smartReplySetting.setSmartReplyEnable(z);
                UserSP.getInstance().putJSONObject("smart_reply_setting", smartReplySetting);
            }
        };
        ProtoAdapter<SetSmartReplySettingResponse> protoAdapter = SetSmartReplySettingResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.sendPassThroughRequest(command, aVar, r2, new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.service.impl.$$Lambda$gAmnALd2Qxe19hkoBPA4AbtgDQ */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (SetSmartReplySettingResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}

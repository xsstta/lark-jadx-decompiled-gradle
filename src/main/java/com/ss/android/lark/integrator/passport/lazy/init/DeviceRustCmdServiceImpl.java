package com.ss.android.lark.integrator.passport.lazy.init;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DeviceNotifySetting;
import com.bytedance.lark.pb.device.v1.GetDeviceNotifySettingRequest;
import com.bytedance.lark.pb.device.v1.GetDeviceNotifySettingResponse;
import com.bytedance.lark.pb.device.v1.GetGeoInfoRequest;
import com.bytedance.lark.pb.device.v1.GetGeoInfoResponse;
import com.bytedance.lark.pb.device.v1.GetValidDevicesRequest;
import com.bytedance.lark.pb.device.v1.GetValidDevicesResponse;
import com.bytedance.lark.pb.device.v1.SetDeviceNotifySettingRequest;
import com.bytedance.lark.pb.device.v1.SetDeviceRequest;
import com.bytedance.lark.pb.device.v1.SetDeviceSettingRequest;
import com.bytedance.lark.pb.device.v1.SetDeviceSettingResponse;
import com.bytedance.lark.pb.passport.v1.ResetRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.device.service.AbstractC48976a;
import com.ss.android.lark.passport.device.service.impl.C48987c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.NotifySettings;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@ClaymoreImpl(AbstractC48976a.class)
public class DeviceRustCmdServiceImpl implements AbstractC48976a {
    public final PassportLog log = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public NotifySettings syncPullDeviceNotifySetting() {
        return (NotifySettings) SdkSender.sendRequest(Command.GET_DEVICE_NOTIFY_SETTING, new GetDeviceNotifySettingRequest.C16570a(), new SdkSender.IParser<NotifySettings>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399601 */

            /* renamed from: a */
            public NotifySettings parse(byte[] bArr) throws IOException {
                try {
                    DeviceNotifySetting deviceNotifySetting = GetDeviceNotifySettingResponse.ADAPTER.decode(bArr).setting;
                    NotifySettings notifySettings = new NotifySettings();
                    notifySettings.setStillNotifyAt(deviceNotifySetting.still_notify_at.booleanValue());
                    notifySettings.setDisableMobileNotify(deviceNotifySetting.disable_mobile_notify.booleanValue());
                    return notifySettings;
                } catch (Exception e) {
                    PassportLog passportLog = DeviceRustCmdServiceImpl.this.log;
                    passportLog.mo171471d("DeviceRustCmdServiceImpl", "error occurs for syncPullDeviceNotifySetting " + e.getMessage());
                    return new NotifySettings();
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public void pullDeviceNotifySetting(IGetDataCallback<NotifySettings> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_DEVICE_NOTIFY_SETTING, new GetDeviceNotifySettingRequest.C16570a(), iGetDataCallback, new SdkSender.IParser<NotifySettings>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399612 */

            /* renamed from: a */
            public NotifySettings parse(byte[] bArr) throws IOException {
                DeviceNotifySetting deviceNotifySetting = GetDeviceNotifySettingResponse.ADAPTER.decode(bArr).setting;
                NotifySettings notifySettings = new NotifySettings();
                notifySettings.setStillNotifyAt(deviceNotifySetting.still_notify_at.booleanValue());
                notifySettings.setDisableMobileNotify(deviceNotifySetting.disable_mobile_notify.booleanValue());
                return notifySettings;
            }
        });
    }

    public void resetCmd(final AbstractC49338a aVar) {
        SdkSender.asynSendRequestNonWrap(Command.MIGRATE_RESET, new ResetRequest.C18737a(), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399667 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("DeviceRustCmdServiceImpl", "reset cmd success");
                AbstractC49338a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(true);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("DeviceRustCmdServiceImpl", "reset cmd failed: " + errorResult.getDebugMsg());
                AbstractC49338a aVar = aVar;
                if (aVar != null) {
                    aVar.onResult(false);
                }
            }
        }, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399678 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public void pullDeviceOnlineStatus(IGetDataCallback<DevicesStatus> iGetDataCallback) {
        if (iGetDataCallback != null) {
            SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_VALID_DEVICES, new GetValidDevicesRequest.C16580a(), new SdkSender.IParser<DevicesStatus>() {
                /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399634 */

                /* renamed from: a */
                public DevicesStatus parse(byte[] bArr) throws IOException {
                    List<DevicesStatus.DeviceStatus> a = C39969a.m158603a(GetValidDevicesResponse.ADAPTER.decode(bArr).devices);
                    DevicesStatus devicesStatus = new DevicesStatus();
                    devicesStatus.setDevices(a);
                    return devicesStatus;
                }
            });
            if (syncSendMayError.f131573b != null) {
                iGetDataCallback.onError(syncSendMayError.f131573b);
            } else {
                iGetDataCallback.onSuccess(syncSendMayError.f131572a);
            }
        }
    }

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public void setDeviceId(String str) {
        String userUnit = ServiceFinder.m193749d().getUserUnit();
        PassportLog passportLog = this.log;
        passportLog.mo171465b("DeviceIdService", "setDeviceId1  rust setDeviceId = " + str + ", userUnit:" + userUnit);
        HashMap hashMap = new HashMap();
        hashMap.put("device_model", Build.MODEL);
        SetDeviceRequest.C16592a aVar = new SetDeviceRequest.C16592a();
        aVar.mo59022a(str).mo59025b(Build.VERSION.RELEASE).mo59026c(Build.MODEL).mo59023a(hashMap).mo59027d(UIHelper.getAppName()).mo59028e(C48987c.m192916a().mo171042j());
        byte[] bArr = (byte[]) SdkSender.syncSend(Command.SET_DEVICE, aVar, new SdkSender.IParser<byte[]>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399656 */

            /* renamed from: a */
            public byte[] parse(byte[] bArr) throws IOException {
                return new byte[0];
            }
        });
    }

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public void getGeoInfo(String str, IGetDataCallback<IDeviceService.Country> iGetDataCallback) {
        GetGeoInfoRequest.C16574a aVar = new GetGeoInfoRequest.C16574a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo58983a(str);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_GEOCODE_INFO, aVar, iGetDataCallback, new SdkSender.IParser<IDeviceService.Country>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399689 */

            /* renamed from: a */
            public IDeviceService.Country parse(byte[] bArr) throws IOException {
                return C39969a.m158601a(GetGeoInfoResponse.ADAPTER.decode(bArr).country);
            }
        });
    }

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public void putDeviceSetting(String str, String str2, IGetDataCallback<DeviceSetting> iGetDataCallback) {
        SetDeviceSettingRequest.C16594a aVar = new SetDeviceSettingRequest.C16594a();
        aVar.mo59032a(str);
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo59034b(str2);
        }
        SdkSender.asynSendRequestNonWrap(Command.SET_DEVICE_SETTING, aVar, iGetDataCallback, new SdkSender.IParser<DeviceSetting>() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399645 */

            /* renamed from: a */
            public DeviceSetting parse(byte[] bArr) throws IOException {
                SetDeviceSettingResponse decode = SetDeviceSettingResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    return null;
                }
                DeviceSetting deviceSetting = new DeviceSetting();
                deviceSetting.setLocaleIdentifier(decode.locale_identifier);
                return deviceSetting;
            }
        });
    }

    @Override // com.ss.android.lark.passport.device.service.AbstractC48976a
    public void putDeviceNotifySettingInternal(NotifySettings notifySettings, int i, IGetDataCallback<String> iGetDataCallback) {
        DeviceNotifySetting deviceNotifySetting;
        if (i == SetDeviceNotifySettingRequest.Type.ALL.getValue()) {
            deviceNotifySetting = new DeviceNotifySetting.C14866a().mo54516b(Boolean.valueOf(notifySettings.isStillNotifyAt())).mo54514a(Boolean.valueOf(notifySettings.isDisableMobileNotify())).build();
        } else if (i == SetDeviceNotifySettingRequest.Type.STILL_NOTIFY_AT.getValue()) {
            deviceNotifySetting = new DeviceNotifySetting.C14866a().mo54516b(Boolean.valueOf(notifySettings.isStillNotifyAt())).build();
        } else if (i == SetDeviceNotifySettingRequest.Type.DISABLE_MOBILE_NOTIFY.getValue()) {
            deviceNotifySetting = new DeviceNotifySetting.C14866a().mo54514a(Boolean.valueOf(notifySettings.isDisableMobileNotify())).build();
        } else {
            deviceNotifySetting = null;
        }
        if (deviceNotifySetting != null) {
            SdkSender.asynSendRequestNonWrap(Command.SET_DEVICE_NOTIFY_SETTING, new SetDeviceNotifySettingRequest.C16590a().mo59017a(SetDeviceNotifySettingRequest.Type.fromValue(i)).mo59016a(deviceNotifySetting), iGetDataCallback, new SdkSender.IParser<String>() {
                /* class com.ss.android.lark.integrator.passport.lazy.init.DeviceRustCmdServiceImpl.C399623 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return "";
                }
            });
        }
    }
}

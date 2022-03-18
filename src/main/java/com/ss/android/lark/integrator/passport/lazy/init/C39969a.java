package com.ss.android.lark.integrator.passport.lazy.init;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Device;
import com.bytedance.lark.pb.basic.v1.PushSessionValidatingResponse;
import com.bytedance.lark.pb.contact.v1.GetAccountUserListResponse;
import com.bytedance.lark.pb.device.v1.GetGeoInfoResponse;
import com.bytedance.lark.pb.device.v1.PushDeviceNotifySettingResponse;
import com.bytedance.lark.pb.device.v1.PushDeviceOnlineStatusResponse;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.account.config.AccountSecurityConfig;
import com.ss.android.lark.passport.signinsdk_api.entity.C49369d;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.Tenant;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.passport.lazy.init.a */
public class C39969a {
    /* renamed from: a */
    public static Boolean m158602a(PushDeviceNotifySettingResponse pushDeviceNotifySettingResponse) {
        if (pushDeviceNotifySettingResponse == null) {
            return false;
        }
        return pushDeviceNotifySettingResponse.is_notify;
    }

    /* renamed from: a */
    public static IDeviceService.Country m158601a(GetGeoInfoResponse.Country country) {
        if (country != null) {
            return new IDeviceService.Country(country.geocode_name_id.longValue(), country.iso_code);
        }
        return null;
    }

    /* renamed from: a */
    public static DevicesStatus.DeviceStatus m158599a(PushDeviceOnlineStatusResponse pushDeviceOnlineStatusResponse) {
        DevicesStatus.DeviceStatus.OnLineStatus onLineStatus;
        DevicesStatus.DeviceStatus deviceStatus = new DevicesStatus.DeviceStatus();
        if (!(pushDeviceOnlineStatusResponse == null || pushDeviceOnlineStatusResponse.device == null)) {
            Device device = pushDeviceOnlineStatusResponse.device;
            deviceStatus.setDeviceId(device.id);
            deviceStatus.setTerminalType(DevicesStatus.DeviceStatus.TerminalType.valueOf(device.terminal.getValue()));
            if (device.is_online.booleanValue()) {
                onLineStatus = DevicesStatus.DeviceStatus.OnLineStatus.ONLINE;
            } else {
                onLineStatus = DevicesStatus.DeviceStatus.OnLineStatus.OFFLINE;
            }
            deviceStatus.setOnlineStatus(onLineStatus);
        }
        return deviceStatus;
    }

    /* renamed from: a */
    public static C49369d m158600a(byte[] bArr) {
        PushSessionValidatingResponse pushSessionValidatingResponse;
        try {
            pushSessionValidatingResponse = PushSessionValidatingResponse.ADAPTER.decode(bArr);
        } catch (IOException e) {
            e.printStackTrace();
            pushSessionValidatingResponse = null;
        }
        if (pushSessionValidatingResponse == null) {
            return null;
        }
        return new C49369d(pushSessionValidatingResponse.access_token, pushSessionValidatingResponse.truncated_access_token, pushSessionValidatingResponse.current_user_id, pushSessionValidatingResponse.data_base_clear_type, pushSessionValidatingResponse.reason_source, pushSessionValidatingResponse.logic_source, pushSessionValidatingResponse.connection_token, pushSessionValidatingResponse.request_id, pushSessionValidatingResponse.frontier_error_code, pushSessionValidatingResponse.current_device_id, pushSessionValidatingResponse.context_device_id, pushSessionValidatingResponse.server_reason);
    }

    /* renamed from: a */
    public static List<DevicesStatus.DeviceStatus> m158603a(List<Device> list) {
        DevicesStatus.DeviceStatus.OnLineStatus onLineStatus;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Device device : list) {
            if (device != null) {
                DevicesStatus.DeviceStatus deviceStatus = new DevicesStatus.DeviceStatus();
                deviceStatus.setDeviceId(device.id);
                if (device.is_online.booleanValue()) {
                    onLineStatus = DevicesStatus.DeviceStatus.OnLineStatus.ONLINE;
                } else {
                    onLineStatus = DevicesStatus.DeviceStatus.OnLineStatus.OFFLINE;
                }
                deviceStatus.setOnlineStatus(onLineStatus);
                deviceStatus.setTerminalType(DevicesStatus.DeviceStatus.TerminalType.valueOf(device.terminal.getValue()));
                arrayList.add(deviceStatus);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static TenantInfo m158598a(Chatter chatter) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (chatter == null) {
            return null;
        }
        Tenant tenant = ((AbstractC49393f) ServiceFinder.m193746a(AbstractC49393f.class)).getTenantsByIds(new ArrayList(Collections.singleton(chatter.getTenantId()))).get(chatter.getTenantId());
        User b = C39959a.m158588a().mo101457n().mo172421b();
        String c = C39959a.m158588a().mo101457n().mo172422c();
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        String h = C39959a.m158588a().mo101457n().mo172427h();
        if (!chatter.isCustomer() || chatter.getRegistered()) {
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(chatter.getLocalizedName())) {
            str = chatter.getLocalizedName();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(chatter.getName())) {
            str = chatter.getName();
        }
        if (chatter.getAvatarUrls() == null || chatter.getAvatarUrls().isEmpty()) {
            str2 = "";
        } else {
            str2 = chatter.getAvatarUrls().get(0);
        }
        String id = chatter.getId();
        String enName = chatter.getEnName();
        String tenantId = chatter.getTenantId();
        if (tenant == null) {
            str3 = "";
        } else {
            str3 = tenant.getName();
        }
        String avatarKey = chatter.getAvatarKey();
        if (tenant == null) {
            str4 = "";
        } else {
            str4 = tenant.getIconUrl();
        }
        boolean equals = c.equals(chatter.getId());
        int value = GetAccountUserListResponse.AccountUser.TenantTag.STANDARD.getValue();
        AccountSecurityConfig accountSecurityConfig = b.getAccountSecurityConfig();
        boolean isIdp = b.isIdp();
        boolean isFrozen = b.isFrozen();
        boolean isActive = b.isActive();
        if (tenant == null) {
            str5 = "";
        } else {
            str5 = tenant.getSuiteFullDomain();
        }
        boolean isUpgradeEnabled = b.isUpgradeEnabled();
        if (tenant == null) {
            str6 = "";
        } else {
            str6 = tenant.getUnitLeague();
        }
        return new TenantInfo(id, str, enName, tenantId, str3, h, avatarKey, str4, 0, equals, z, null, null, value, accountSecurityConfig, isIdp, isFrozen, isActive, str2, str5, isUpgradeEnabled, str6, b.getAuthNMode(), b.getLastUseTimestamp());
    }
}

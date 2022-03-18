package com.ss.android.lark.leanmode.p2119a;

import com.bytedance.lark.pb.im.v1.PatchLeanModeStatusResponse;
import com.bytedance.lark.pb.im.v1.PullLeanModeStatusAndAuthorityResponse;
import com.bytedance.lark.pb.im.v1.PushLeanModeStatusAndAuthorityResponse;
import com.ss.android.lark.leanmode.dto.LeanMode;

/* renamed from: com.ss.android.lark.leanmode.a.b */
public class C41241b {
    /* renamed from: a */
    public static LeanMode m163537a(PatchLeanModeStatusResponse patchLeanModeStatusResponse) {
        LeanMode leanMode = new LeanMode();
        if (patchLeanModeStatusResponse == null) {
            return leanMode;
        }
        leanMode.setAuthority(patchLeanModeStatusResponse.device_have_authority.booleanValue());
        leanMode.setDeviceInLeanMode(patchLeanModeStatusResponse.enable_lean_mode.booleanValue());
        leanMode.setOtherCloseableDevicesInLeanMode(patchLeanModeStatusResponse.other_closeable_device_is_lean_mode.booleanValue());
        leanMode.setOtherDevicesInLeanMode(patchLeanModeStatusResponse.have_device_lean_mode.booleanValue());
        leanMode.setAllDevicesInLeanMode(patchLeanModeStatusResponse.have_all_device_lean_mode.booleanValue());
        leanMode.setUpdateTime(patchLeanModeStatusResponse.update_time);
        return leanMode;
    }

    /* renamed from: a */
    public static LeanMode m163538a(PullLeanModeStatusAndAuthorityResponse pullLeanModeStatusAndAuthorityResponse) {
        LeanMode leanMode = new LeanMode();
        if (pullLeanModeStatusAndAuthorityResponse == null) {
            return leanMode;
        }
        leanMode.setAuthority(pullLeanModeStatusAndAuthorityResponse.device_have_authority.booleanValue());
        leanMode.setDeviceInLeanMode(pullLeanModeStatusAndAuthorityResponse.enable_lean_mode.booleanValue());
        leanMode.setOtherCloseableDevicesInLeanMode(pullLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode.booleanValue());
        leanMode.setOtherDevicesInLeanMode(pullLeanModeStatusAndAuthorityResponse.have_device_lean_mode.booleanValue());
        leanMode.setAllDevicesInLeanMode(pullLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode.booleanValue());
        leanMode.setUpdateTime(pullLeanModeStatusAndAuthorityResponse.update_time);
        return leanMode;
    }

    /* renamed from: a */
    public static LeanMode m163539a(PushLeanModeStatusAndAuthorityResponse pushLeanModeStatusAndAuthorityResponse) {
        LeanMode leanMode = new LeanMode();
        if (pushLeanModeStatusAndAuthorityResponse == null) {
            return leanMode;
        }
        leanMode.setAuthority(pushLeanModeStatusAndAuthorityResponse.device_have_authority.booleanValue());
        leanMode.setDeviceInLeanMode(pushLeanModeStatusAndAuthorityResponse.enable_lean_mode.booleanValue());
        leanMode.setOtherCloseableDevicesInLeanMode(pushLeanModeStatusAndAuthorityResponse.other_closeable_device_is_lean_mode.booleanValue());
        leanMode.setOtherDevicesInLeanMode(pushLeanModeStatusAndAuthorityResponse.have_device_lean_mode.booleanValue());
        leanMode.setAllDevicesInLeanMode(pushLeanModeStatusAndAuthorityResponse.have_all_device_lean_mode.booleanValue());
        leanMode.setUpdateTime(pushLeanModeStatusAndAuthorityResponse.update_time);
        return leanMode;
    }
}

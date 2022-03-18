package com.bytedance.lynx.webview.internal;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public enum LoadEventType {
    StartImpl_begin(1),
    DoCrossProcessInitialization_begin(2),
    LoadPreCheck_abi_enbale(3),
    CheckSwitch_enable_ttwebview(4),
    LoadPreCheck_switch_enable(5),
    CheckSwitch_enable_ttwebview_by_multiprocess_setting(6),
    CheckSoVersion_has_cachesoVersionCode(100),
    CheckSoVersion_not_old_soVersion(101),
    LoadPreCheck_soVersion_suited(102),
    LoadPreCheck_oldmd5_not_empty(103),
    LoadPreCheck_md5_not_empty(104),
    LoadPreCheck_not_first_download(LocationRequest.PRIORITY_NO_POWER),
    LoadPreCheck_first_download(106),
    LoadPreCheck_so_exits(ActivityIdentificationData.WALKING),
    LoadPreCheck_osapi_enable(108),
    LoadPreCheck_hostabi_enable(SmEvents.EVENT_NR),
    LoadPreCheck_dex_compiled(SmEvents.EVENT_NO),
    LoadPreCheck_so_runtime_environment(SmEvents.EVENT_NE_RR),
    ErrorCheck_success(SmEvents.EVENT_NW),
    DoCrossProcessInitialization_load_ttwebview(LocationRequest.PRIORITY_HD_ACCURACY),
    DoCreateHookProvider_begin(201),
    InitProvider_addClasses_success(202),
    InitProvider_checkGlueVersion_success(SmEvents.EVENT_HBRESET),
    DoCreateHookProvider_initProvider_success(204),
    OnLoad_Success(999),
    Default_Type(-1);
    
    public static String[] SuccessStatus = {"DoCreateHookProvider_initProvider_success"};
    private int StatusCode;

    public int getStatusCode() {
        return this.StatusCode;
    }

    public static LoadEventType getLoadEventType(int i) {
        LoadEventType[] values = values();
        for (LoadEventType loadEventType : values) {
            if (loadEventType.getStatusCode() == i) {
                return loadEventType;
            }
        }
        return null;
    }

    public static LoadEventType getLoadEventTypeByIndex(int i) {
        LoadEventType[] values = values();
        for (LoadEventType loadEventType : values) {
            if (loadEventType.ordinal() == i) {
                return loadEventType;
            }
        }
        return null;
    }

    public static boolean isSucessStatus(String str) {
        for (String str2 : SuccessStatus) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private LoadEventType(int i) {
        this.StatusCode = i;
    }
}

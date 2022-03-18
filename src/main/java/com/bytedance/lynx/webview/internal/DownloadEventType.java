package com.bytedance.lynx.webview.internal;

import com.huawei.hms.location.LocationRequest;

public enum DownloadEventType {
    InitSetting_download_begin(1),
    InitSetting_has_appInfo(2),
    InitSetting_has_miniappInfo(3),
    InitSetting_setting_not_empty(4),
    OnSuccess_begin(5),
    OnConfigLoaded_is_valid(6),
    PrepareAsync_prepare_finish(LocationRequest.PRIORITY_HD_ACCURACY),
    Prepare_prepare_start(201),
    Prepare_abi_enable(7),
    Prepare_prepare_once(8),
    DoPrepare_begin(101),
    DoPrepare_finish_not_exists(9),
    PrepareFromDebugPath_begin(10),
    PrepareFromAssets_begin(11),
    PrepareFromDataDir_begin(12),
    PrepareFromSharedDir_begin(13),
    HasDownloadEnv_wifi_enable(14),
    HasDownloadEnv_memory_enable(15),
    PrepareByDownload_start(16),
    DownloadByBreakResume_not_first(17),
    DownloadByBreakResume_first(18),
    InitDownload_getLength(19),
    PrepareByDownload_end(20),
    Decompress_has_vPair(21),
    Decompress_right_signData(22),
    Decompress_right_md5(23),
    PrepareAssetsApks_unzip_webviewutilso(24),
    PrepareAssetsApks_unzip_libwebviewso(25),
    PrepareAssetsApks_unzip_libwebviewresso(26),
    Decompress_prepareAssets_success(27),
    Decompress_success(28),
    DoPrepare_getSo_success(29),
    Prepare_download_end(999);
    
    public static String[] SuccessStatus = {"DoPrepare_getSo_success", "Prepare_download_end", "DoPrepare_begin"};
    private int StatusCode;

    public int getStatusCode() {
        return this.StatusCode;
    }

    public static DownloadEventType getDownloadEventType(int i) {
        DownloadEventType[] values = values();
        for (DownloadEventType downloadEventType : values) {
            if (downloadEventType.getStatusCode() == i) {
                return downloadEventType;
            }
        }
        return null;
    }

    public static DownloadEventType getDownloadEventTypeByIndex(int i) {
        DownloadEventType[] values = values();
        for (DownloadEventType downloadEventType : values) {
            if (downloadEventType.ordinal() == i) {
                return downloadEventType;
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

    private DownloadEventType(int i) {
        this.StatusCode = i;
    }
}

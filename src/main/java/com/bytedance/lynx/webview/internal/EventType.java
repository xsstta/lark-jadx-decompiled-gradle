package com.bytedance.lynx.webview.internal;

import com.bytedance.lynx.webview.sdkadapt.Version;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;

public enum EventType {
    UNKNOWN(-1, GrsBaseInfo.CountryCodeSource.UNKNOWN),
    StartUp(0, "startUp"),
    UseStatus(2, "UseStatus"),
    WEBVIEW_TYPE(1, "WebViewType"),
    DISABLED_BY_SWITCH(100, "UseStatus"),
    DISABLED_BY_BLACKLIST(101, "UseStatus"),
    DISABLED_BY_BELOW_4_4(102, "UseStatus"),
    DISABLED_BY_ABI(103, "UseStatus"),
    DISABLED_BY_NO_WIFI(104, "UseStatus"),
    DISABLED_BY_NO_MEMORY(LocationRequest.PRIORITY_NO_POWER, "UseStatus"),
    DISABLED_BY_BROTLI_SO_LOAD_FAILED(106, "UseStatus"),
    DISABLED_BY_APP_NOT_STABLE(ActivityIdentificationData.WALKING, "UseStatus"),
    DO_PREPARE_CRASHED(LocationRequest.PRIORITY_HD_ACCURACY, "UseStatus"),
    DOWNLOAD_START(201, "UseStatus"),
    DOWNLOAD_CRASHED(202, "UseStatus"),
    DOWNLOAD_PROCESS(SmEvents.EVENT_HBRESET, "sdk_download_process"),
    DOWNLOAD_RESULT(204, "sdk_download_result"),
    DOWNLOAD_STATUS_START(SmEvents.EVENT_HB_NOTICE_DISCONNECT, "download_so_update_version"),
    DOWNLOAD_STATUS_END(SmEvents.EVENT_NONET, "download_so_update_version"),
    DOWNLOAD_STATUS_FAILED(207, "download_so_update_version"),
    DOWNLOAD_FINISH_STATUS(208, "sdk_download_finish_status"),
    DOWNLOAD_END(299, "UseStatus"),
    DECOMPRESS_START(LocationRequest.PRIORITY_INDOOR, "UseStatus"),
    DECOMPRESS_WITH_ERROR_FILE(301, "UseStatus"),
    DECOMPRESS_CRASHED(302, "UseStatus"),
    DECOMPRESS_ERROR_LOCAL_CONFIG(303, "UseStatus"),
    DECOMPRESS_ERROR_SIGNDATA(304, "UseStatus"),
    DECOMPRESS_FAILED(305, "UseStatus"),
    DECOMPRESS_FAILED_UNZIP_WEBVIEWUTILSO(306, "UseStatus"),
    DECOMPRESS_FAILED_UNZIP_LIBWEBVIEWSO(307, "UseStatus"),
    DECOMPRESS_FAILED_PREPARE_ASSETS_APKS(308, "UseStatus"),
    DECOMPRESS_FAILED_GETDECOMPRESS_METHOD_EXCEPTION(309, "UseStatus"),
    DECOMPRESS_FAILED_GETDECOMPRESS_METHOD(310, "UseStatus"),
    DECOMPRESS_END(399, "UseStatus"),
    LOAD_START(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, "UseStatus"),
    LOAD_CRASHED(401, "UseStatus"),
    LOAD_UNASSIGNED(402, "UseStatus"),
    LOAD_ERROR_RES(403, "UseStatus"),
    LOAD_ERROR_ENSURE_FACTORYPROVIDER_CREATED(404, "LoadError"),
    LOAD_PRELOAD_ERROR(405, "UseStatus"),
    LOAD_PRELOAD_SUCCESS(406, "UseStatus"),
    LOAD_ENSURE_FACTORYPROVIDER_CREATED(407, "LoadEnsure"),
    LOAD_ERROR_SYNC_PROCESS(408, "SyncProcessError"),
    LOAD_FALLBACK_TO_SYSTEM(409, "LoadFallback"),
    LOAD_SYNC_SO_VERSION_ERROR(410, "SyncSoVersionError"),
    LOAD_CONSISTENCY_ERROR(TTVideoEngine.PLAYER_OPTION_USE_THREAD_POOL, "CorruptionDetected"),
    LOAD_CONSISTENCY_OK(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, "NoCorruption"),
    LOAD_CONSISTENCY_ERROR_TYPE(TTVideoEngine.PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO, "CorruptionDetected"),
    LOAD_CONSISTENCY_ERROR_VERSION(TTVideoEngine.PLAYER_OPTION_DEFAULT_RENDER_TYPE, "CorruptionDetected"),
    LOAD_CONSISTENCY_ERROR_NATIVE(415, "CorruptionDetected"),
    LOAD_CONSISTENCY_ERROR_PROVIDER(416, "CorruptionDetected"),
    LOAD_ERROR_MD5_AND_VERSION(417, "LoadError"),
    LOAD_HOOKLATER_SYNC_SO_VERSION_ERROR(418, "HookLaterSyncSoVersionError"),
    LOAD_TRACE_EVENT_INIT(420, "TraceInitTime"),
    LOAD_TRACE_EVENT_HOOK(421, "TraceHookTime"),
    LOAD_TRACE_EVENT_ENSURE(422, "TraceEnsureTime"),
    LOAD_TRACE_EVENT_START_IMPL(423, "TraceStartImplTime"),
    LOAD_TRACE_EVENT_SYNC_PROCESS(424, "TraceSyncProcessTime"),
    LOAD_TRACE_EVENT_CREATE_PROVIDER(425, "TraceCreateProviderTime"),
    LOAD_TRACE_EVENT_CALLBACK(426, "TraceSyncCBTime"),
    LOAD_TRACE_EVENT_START_RENDERER(427, "TraceStartRendererProcess"),
    LOAD_GLUE_SYNC_ERROR(430, "GlueSyncError"),
    LOAD_HOOK_BEFORE_SYSTEM(431, "HookEarly"),
    LOAD_HOOK_AFTER_SYSTEM(432, "HookLate"),
    LOAD_ENSURE_FACTORYPROVIDER_INVOKE(433, "InvokeEnsure"),
    LOAD_WEBVIEW_INIT_TIME(440, "time_Webview_init"),
    LOAD_WEBVIEW_CREATEWEBVIEW_TIME(441, "time_Webview_CreateWebView"),
    LOAD_PROCESS(442, "sdk_loadso_process"),
    LOAD_RESULT(443, "sdk_loadso_result"),
    LOAD_MD5_ERROR(444, "load_md5_error"),
    LOAD_OSAPI_ERROR(445, "load_osapi_error"),
    LOAD_PRELOAD_FAILED(446, "webview_created_before_preload"),
    LOAD_MD5_NOT_COMPILED(447, "load_md5_not_compiled"),
    LOAD_LOAD_SYSTEM_PROVIDER_ERROR(497, "sdk_load_sys_provider_err"),
    LOAD_INIT_TWICE(498, "sdk_startImpl_twice"),
    LOAD_END(499, "UseStatus"),
    GET_JSON_NET_ERROR(1000, "NetError"),
    JSON_OUT_FORMAT_ERROR(CommonCode.StatusCode.API_CLIENT_EXPIRED, "CaptureError"),
    JSON_INNER_FORMAT_ERROR(1002, "CaptureError"),
    LOADED_SO_VERSION(1100, "LoadSo"),
    SETTINGS_SO_VERSION(1101, "NetSettingsSo"),
    CRASH_TOO_MANNY(ExceptionCode.NETWORK_IO_EXCEPTION, "CrashProtect"),
    LOADED_SO_VERSION_EX(ExceptionCode.CRASH_EXCEPTION, "LoadSo_" + Version.f48943d),
    SETTINGS_SO_VERSION_EX(ExceptionCode.CANCEL, "NetSettingsSo_" + Version.f48943d),
    LOADED_SDK_VERSION_AND_SO_VERSION(1105, "LoadSdkAndSo_" + Version.f48943d),
    DOWNLOAD_TIME(1201, "DownloadTime"),
    DECOMPRESS_TIME(1202, "DecompressTime"),
    INIT_TTWEBVIEW(1203, "Initttwebview"),
    COOKIE_ERROR(1301, "Cookie_ErrorMiss"),
    COOKIE_MIGRATE(1302, "Cookie_Merge"),
    COOKIE_ERROR_NATIVE(1303, "CookieError"),
    NATIVE_COOKIEOPENFAILED(1304, "CookieOpenFailed"),
    NATIVE_COOKIEVERSION(1305, "CookieVersion"),
    COOKIE_REMOVESESSIONCOOKIES(1310, "Cookie_removeSessionCookies"),
    COOKIE_REMOVEALLCOOKIES(1311, "Cookie_removeAllCookies"),
    COOKIE_CHECKOK(1312, "Cookie_Start_CheckOk"),
    COOKIE_SETOK(1313, "Cookie_Start_SetOk"),
    COOKIE_GETGETINSTANCEERRO(1314, "Cookie_getInstance_erro"),
    DISABLED_BY_FILELOCK_FAILED(1401, "FileLockError"),
    RENDERER_PROCESS_HOOK_ERROR(1402, "RendererProcessHookError"),
    RENDERER_PROCESS_GONE(1403, "RendererProcessGone"),
    EXTENSION_ERROR(1404, "ExtensionError"),
    NATIVE_ERROR_GPU(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "Error_Gpu"),
    NATIVE_ERROR_NOMEMORY(1501, "Error_No_memory"),
    MEMORY_VM_EXCEED_LIMIT(1502, "VM_Exceed_Limit"),
    NATIVE_ERROR_GPU_NOMEMORY(1503, "Error_Gpu_No_memory"),
    NATIVE_ERROR_GPU_ALLOCKFAILED(1504, "Error_Gpu_Allock_Failed"),
    SDK_LOAD_ERRO_Dexpath(1600, "sdk_load_erro"),
    SDK_LOAD_ERRO_SdkCheck(1601, "sdk_load_erro"),
    SDK_LOAD_ERRO_GlueCheck(1602, "sdk_load_erro"),
    SDK_LOAD_ERRO_RuntimeEnvironment(1603, "sdk_load_erro"),
    SDK_LOAD_ERRO_SupportAndroidX(1604, "sdk_load_erro"),
    SO_UPDATE_NEED(1700, "so_need_update"),
    SO_UPDATE_FAILED(1701, "so_failed_update"),
    SO_UPDATE_SUCCESS(1702, "so_success_update"),
    MAX(3000, ""),
    NATIVE_NEED_ALOG(5200, "NativeNeedALog"),
    NATIVE_INIT_EVENT(5201, "NativeInit");
    
    private int eventCode;
    private String eventName;

    public int getEventCode() {
        return this.eventCode;
    }

    public String getEventName() {
        return this.eventName;
    }

    private EventType(int i, String str) {
        this.eventCode = i;
        this.eventName = str;
    }
}

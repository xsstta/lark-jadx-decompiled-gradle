package com.ss.ugc.effectplatform;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u001dXT¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/ugc/effectplatform/ErrorConstants;", "", "()V", "APP_NEED_UPGRADE", "", "CODE_CANCEL_DOWNLOAD", "CODE_DOWNLOAD_ERROR", "CODE_EFFECT_FETCHER_NULL", "CODE_EFFECT_NULL", "CODE_INVALID_EFFECT_CACHE", "CODE_INVALID_EFFECT_ID", "CODE_IO_FAIL", "CODE_JSON_CONVERT_ERROR", "CODE_LINK_CONTEXT_NULL", "CODE_MD5_ERROR", "CODE_MODEL_FETCH_FAIL", "CODE_NO_DOWNLOADED_EFFECTS", "CODE_NO_LOCAL_TAG", "CODE_NO_NETWORK", "CODE_PANEL_NULL", "CODE_SDK_ERROR", "CODE_UNKNOW", "CODE_UNZIP_FAIL", "CODE_URL_NOT_EXIST", "EFFECT_NOT_FOUND", "EFFECT_NOT_IN_ALLOW_LIST", "EFFECT_NOT_SUPPORT", "EFFECT_UNAVAILABLE", "EXCEPTION_CANCEL_DOWNLOAD", "", "EXCEPTION_CONTEXT_NULL", "EXCEPTION_DOWNLOAD_ERROR", "EXCEPTION_DOWNLOAD_URL_ERROR", "EXCEPTION_EFFECT_NULL", "EXCEPTION_INVALID_EFFECT_CACHE", "EXCEPTION_JSON_CONVERT", "EXCEPTION_MD5_ERROR", "EXCEPTION_NO_DOWNLOADED_EFFECTS", "EXCEPTION_NO_NETWORK", "EXCEPTION_PANEL_NULL", "EXCEPTION_SDK_ERROR", "LOG_CACHE_DIR_NOT_SET", "LOG_CONFIGURATION_NOT_SET", "LOG_CONTEXT_NOT_SET", "LOG_HOST_NOT_SET", "LOG_JSON_CONCERT_NOT_SET", "LOG_NET_WORKER_NOT_SET", "APIErrorHandle", "errorCode", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.d */
public final class ErrorConstants {

    /* renamed from: a */
    public static final ErrorConstants f164880a = new ErrorConstants();

    /* renamed from: a */
    public final String mo227752a(int i) {
        if (i == 1) {
            return "unknown error";
        }
        if (i == 10014) {
            return "Invalid effect id";
        }
        if (i == 10016) {
            return "link-selector context is null";
        }
        if (i == 1100) {
            return "The current application is not a test application";
        }
        if (i == 1101) {
            return "access_key does not exist";
        }
        switch (i) {
            case 1000:
                return "Illegal params (missing or wrong params)";
            case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                return "access_key is invalid";
            case 1002:
                return "app_version is invalid";
            case 1003:
                return "sdk_version is invalid";
            case 1004:
                return "device_id is invalid";
            case 1005:
                return "device_platform is invalid";
            case 1006:
                return "device_type is invalid";
            case 1007:
                return "channel is invalid";
            case 1008:
                return "app_channel is invalid";
            default:
                switch (i) {
                    case 2001:
                        return "no change in content";
                    case 2002:
                        return "Effect is offline";
                    case 2003:
                        return "Does not support the current device";
                    case 2004:
                        return "The current effect id does not exist";
                    case 2005:
                        return "Not on allowed list";
                    case 2006:
                        return "App needs to be updated";
                    default:
                        switch (i) {
                            case UpdateDialogStatusCode.DISMISS:
                                return "Cancel download";
                            case UpdateDialogStatusCode.SHOW:
                                return "Download error";
                            case 10003:
                                return "Sticker is null";
                            case 10004:
                                return "Invalid effect list cache !!!";
                            case 10005:
                                return "SDK error";
                            case 10006:
                                return "No Downloaded Effects";
                            case 10007:
                                return "panel is null";
                            default:
                                switch (i) {
                                    case 10009:
                                        return "No local TAG cache";
                                    case 10010:
                                        return "MD5 error";
                                    case 10011:
                                        return "No network";
                                    case 10012:
                                        return "io error";
                                    default:
                                        return "Unkown error";
                                }
                        }
                }
        }
    }

    private ErrorConstants() {
    }
}

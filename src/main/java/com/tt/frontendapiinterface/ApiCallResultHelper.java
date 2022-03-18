package com.tt.frontendapiinterface;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiCallResultHelper {
    public static String generateAppIdIsNotInJumpListInfo(String str) {
        return String.format("appId %s is not in navigateToMiniProgramAppIdList", str);
    }

    public static String generateDataNullExtraInfo(String str) {
        return String.format("%s is null", str);
    }

    public static String generateFileNotExistInfo(String str) {
        return String.format("file not exist path:%s", str);
    }

    public static String generateFileNotReadableInfo(String str) {
        return String.format("file not readable path:%s", str);
    }

    public static String generateIllegalArgExtraInfo(String str) {
        return String.format("illegal args:%s", str);
    }

    public static String generateIllegalParamExtraInfo(String str) {
        return String.format("param:%s illegal", str);
    }

    public static String generateVideoFileTooShortInfo(String str) {
        return String.format("video file is too short path:%s", str);
    }

    public static String generateInnerNetRequestResultErrorInfo(int i) {
        return String.format("net request result error errorNo:%s", String.valueOf(i));
    }

    public static String generateThrowableExtraInfo(Throwable th) {
        return String.format("native exception %s stack:%s", th, getStackInfoFromThrowable(th, 0));
    }

    public static String generateTmaNetRequestFailInfo(C12830f fVar) {
        return String.format("net request fail code:%s message:%s", Integer.valueOf(fVar.mo48463b()), fVar.mo48465c());
    }

    public static String generateUnknownErrorExtraInfo(String str) {
        return String.format("unknown error on method %s stack:%s", str, getStackInfoFromThrowable(new Throwable(), 1));
    }

    public static String generateFilePermissionDenyInfo(String... strArr) {
        if (strArr.length == 2) {
            return String.format("permission denied, %s %s", strArr[0], strArr[1]);
        } else if (strArr.length == 3) {
            return String.format("permission denied, %s %s -> %s", strArr[0], strArr[1], strArr[2]);
        } else {
            AppBrandLogger.m52829e("ApiCallResultHelper", "PermissionDenyStr unsupported args length");
            return "";
        }
    }

    public static JSONObject generateJsonObjectResponseData(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : hashMap.keySet()) {
            try {
                jSONObject.put(str, hashMap.get(str));
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiCallResultHelper", "generateJsonObjectResponseData", e);
            }
        }
        return jSONObject;
    }

    public static String generateNoSuchFileInfo(String... strArr) {
        if (strArr.length == 1) {
            return String.format("no such file or directory %s", strArr[0]);
        } else if (strArr.length == 2) {
            return String.format("no such file or directory, %s %s", strArr[0], strArr[1]);
        } else if (strArr.length == 3) {
            return String.format("no such file or directory, %s %s -> %s", strArr[0], strArr[1], strArr[2]);
        } else {
            AppBrandLogger.m52829e("ApiCallResultHelper", "NoSuchFileStr unsupported args length");
            return "";
        }
    }

    public static String fail(String str, String str2) {
        if (!str2.isEmpty()) {
            str2 = str2.trim();
        }
        return ApiCallResult.Builder.createFail(str).extraInfo(str2).build().toString();
    }

    public static String success(String str, String str2) {
        if (!str2.isEmpty()) {
            str2 = str2.trim();
        }
        return ApiCallResult.Builder.createOk(str).extraInfo(str2).build().toString();
    }

    public static String exception(String str, Throwable th) {
        ApiCallResult.Builder createFail = ApiCallResult.Builder.createFail(str);
        if (th instanceof JSONException) {
            createFail.extraInfo(generateIllegalArgExtraInfo(null));
        } else {
            createFail.extraInfo(generateThrowableExtraInfo(th));
        }
        return createFail.build().toString();
    }

    private static String getStackInfoFromThrowable(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i2 = i + 5;
        if (i2 > stackTrace.length) {
            i2 = stackTrace.length;
        }
        if (i < i2) {
            sb.append(stackTrace[i]);
            while (true) {
                i++;
                if (i >= i2) {
                    break;
                }
                sb.append(" ");
                sb.append(stackTrace[i]);
            }
        }
        return sb.toString();
    }

    public static String generateFilePermissionDenyInfo(boolean z, String... strArr) {
        String str;
        if (strArr.length == 2) {
            str = String.format("permission denied, %s %s", strArr[0], strArr[1]);
        } else if (strArr.length == 3) {
            str = String.format("permission denied, %s %s -> %s", strArr[0], strArr[1], strArr[2]);
        } else {
            str = "";
        }
        AppBrandLogger.m52829e("ApiCallResultHelper", "PermissionDenyStr unsupported args length");
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.trim();
    }

    public static ApiCallResult getApiRemoteProcessCallResult(String str, CrossProcessDataEntity crossProcessDataEntity, String str2) {
        ApiCallResult apiCallResult;
        String str3 = null;
        if (crossProcessDataEntity != null) {
            apiCallResult = (ApiCallResult) crossProcessDataEntity.mo234751h(str2);
            if (apiCallResult == null) {
                str3 = "get empty data from remote process result";
            } else if (!apiCallResult.toString().contains(str)) {
                str3 = "get illegal data from remote process result " + apiCallResult;
            }
        } else {
            str3 = "get empty remote process result";
            apiCallResult = null;
        }
        if (str3 != null) {
            return ApiCallResult.Builder.createFail(str).extraInfo(str3).build();
        }
        return apiCallResult;
    }
}

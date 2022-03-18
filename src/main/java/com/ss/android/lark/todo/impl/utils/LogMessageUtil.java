package com.ss.android.lark.todo.impl.utils;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J=\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u001b\"\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u001cJ3\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u001b\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ3\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u001b\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0010\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\"\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0010\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0004J\u0010\u0010&\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/todo/impl/utils/LogMessageUtil;", "", "()V", "API_NAME_KEY", "", "API_OPT_KEY", "ASSERT_KEY", "CONTEXT_ID_KEY", "ERR_CODE_KEY", "ERR_MSG_KEY", "ERR_NULL_KEY_VAL", "MODULE_KEY_VAL", "MONITOR_KEY", "OPT_TYPE_KEY", "PUSH_TYPE_KEY", "getApiErr", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getApiErrMsg", ApiHandler.API_CALLBACK_ERRMSG, "getApiError", "errMsgJsonKV", "getApiMessage", "apiOpt", "messages", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getApiMsg", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getApiSuc", "getAssertMsg", "assertMsg", "getMonitorMsg", "monitorMsg", "getOptMsg", "optName", "getPushMsg", "pushName", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.c */
public final class LogMessageUtil {

    /* renamed from: a */
    public static final LogMessageUtil f139260a = new LogMessageUtil();

    private LogMessageUtil() {
    }

    /* renamed from: a */
    public final String mo191765a(String str) {
        String str2 = "{" + "\"module\":\"todo\"" + ", " + "\"opt_type\"" + ":\"" + str + "\"" + "}";
        Intrinsics.checkExpressionValueIsNotNull(str2, "messageJson.append(\"}\").toString()");
        return str2;
    }

    /* renamed from: b */
    public final String mo191769b(String str) {
        String str2 = "{" + "\"module\":\"todo\"" + ", " + "\"push_type\"" + ":\"" + str + "\"" + "}";
        Intrinsics.checkExpressionValueIsNotNull(str2, "messageJson.append(\"}\").toString()");
        return str2;
    }

    /* renamed from: c */
    public final String mo191771c(String str) {
        String str2 = "{" + "\"module\":\"todo\"" + ", " + "\"assert\"" + ":\"" + str + "\"" + "}";
        Intrinsics.checkExpressionValueIsNotNull(str2, "messageJson.append(\"}\").toString()");
        return str2;
    }

    /* renamed from: d */
    public final String mo191772d(String str) {
        String str2 = "{" + "\"module\":\"todo\"" + ", " + "\"monitor\"" + ":\"" + str + "\"" + "}";
        Intrinsics.checkExpressionValueIsNotNull(str2, "messageJson.append(\"}\").toString()");
        return str2;
    }

    /* renamed from: a */
    public final String mo191768a(String str, String str2, String... strArr) {
        Intrinsics.checkParameterIsNotNull(str, "contextId");
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(strArr, "messages");
        return m219595a(str, str2, "suc", (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public final String mo191770b(String str, String str2, String... strArr) {
        Intrinsics.checkParameterIsNotNull(str, "contextId");
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(strArr, "messages");
        return m219595a(str, str2, HiAnalyticsConstant.Direction.REQUEST, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    private final String m219596b(String str, String str2, String str3) {
        String str4 = "{" + "\"module\":\"todo\"" + ", " + "\"context_id\"" + ":\"" + str + "\", " + "\"api_name\"" + ":\"" + str2 + "\", " + "\"api_opt\"" + ":\"" + "err" + "\", " + str3 + "}";
        Intrinsics.checkExpressionValueIsNotNull(str4, "messageJson.append(\"}\").toString()");
        return str4;
    }

    /* renamed from: a */
    public final String mo191766a(String str, String str2, ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(str, "contextId");
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        StringBuilder sb = new StringBuilder();
        if (errorResult == null) {
            sb.append("\"error_result\":\"null\"");
        } else {
            sb.append("\"err_code\"");
            sb.append(":\"");
            sb.append(errorResult.getErrorCode());
            sb.append("\", ");
            sb.append("\"err_msg\"");
            sb.append(":\"");
            sb.append(errorResult.getDebugMsg());
            sb.append("\"");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "jsonKV.toString()");
        return m219596b(str, str2, sb2);
    }

    /* renamed from: a */
    public final String mo191767a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "contextId");
        Intrinsics.checkParameterIsNotNull(str2, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(str3, ApiHandler.API_CALLBACK_ERRMSG);
        return m219596b(str, str2, "\"err_msg\":\"" + str3 + '\"');
    }

    /* renamed from: a */
    private final String m219595a(String str, String str2, String str3, String... strArr) {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"module\":\"todo\"");
        sb.append(", ");
        sb.append("\"context_id\"");
        sb.append(":\"");
        sb.append(str);
        sb.append("\", ");
        sb.append("\"api_name\"");
        sb.append(":\"");
        sb.append(str2);
        sb.append("\", ");
        sb.append("\"api_opt\"");
        sb.append(":\"");
        sb.append(str3);
        sb.append("\"");
        if (strArr != null) {
            int i = 0;
            while (i < strArr.length - 1) {
                sb.append(", \"");
                int i2 = i + 1;
                sb.append(strArr[i]);
                sb.append("\"");
                sb.append(":");
                sb.append("\"");
                i = i2 + 1;
                sb.append(strArr[i2]);
                sb.append("\"");
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "messageJson.append(\"}\").toString()");
        return sb2;
    }
}

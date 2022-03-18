package com.bytedance.ee.lark.oryxgadget.utils;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.Arrays;

public class OryxHostMonitorUtil {

    public enum HookPoint {
        SoHook,
        DexHook
    }

    private static void addMonitorCommonParams(OPMonitor oPMonitor) {
        HostInterface hostInterface;
        if (oPMonitor != null && (hostInterface = HostExtensionManager.getInstance().getHostInterface()) != null) {
            oPMonitor.addCategoryValue("oryx_plugin_installed", Boolean.valueOf(hostInterface.isMiraPluginInstalled("com.bytedance.ee.lark.oryxplugin")));
        }
    }

    public static void monitorOryxPluginLoad(IAppContext iAppContext, long j) {
        OPMonitor generateOryxPluginLoadMonitor = generateOryxPluginLoadMonitor(iAppContext, j);
        if (generateOryxPluginLoadMonitor != null) {
            generateOryxPluginLoadMonitor.flush();
        }
    }

    public static void monitorProcessCrash(IAppContext iAppContext, Throwable th) {
        OPMonitor generateProcessCrashMonitor = generateProcessCrashMonitor(iAppContext, th);
        addMonitorCommonParams(generateProcessCrashMonitor);
        if (generateProcessCrashMonitor != null) {
            generateProcessCrashMonitor.flush();
        }
    }

    public static void monitorReflectOryxManagerException(IAppContext iAppContext, Throwable th) {
        OPMonitor generateReflectOryxManagerExceptionMonitor = generateReflectOryxManagerExceptionMonitor(iAppContext, th);
        addMonitorCommonParams(generateReflectOryxManagerExceptionMonitor);
        if (generateReflectOryxManagerExceptionMonitor != null) {
            generateReflectOryxManagerExceptionMonitor.flush();
        }
    }

    private static OPMonitor generateOryxPluginLoadMonitor(IAppContext iAppContext, long j) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, "op_oryx_performance", 10005, "load_oryx_plugin");
        opMonitor.addMetricValue("oryx_plugin_load_duration", Long.valueOf(j));
        return opMonitor;
    }

    private static OPMonitor generateProcessCrashMonitor(IAppContext iAppContext, Throwable th) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, "op_oryx_exception_event", 10004, "process_crash");
        opMonitor.setError(th);
        if (th != null) {
            opMonitor.addMetricValue("oryx_exception_detail", Arrays.toString(th.getStackTrace()));
        }
        opMonitor.addCategoryValue("process_info", ProcessUtil.getCurProcessName(iAppContext.getApplicationContext()));
        opMonitor.addCategoryValue("related_file", "process");
        return opMonitor;
    }

    private static OPMonitor generateReflectOryxManagerExceptionMonitor(IAppContext iAppContext, Throwable th) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, "op_oryx_exception_event", UpdateDialogStatusCode.DISMISS, "reflect_oryxmanager_exception");
        opMonitor.setError(th);
        opMonitor.setErrorMessage("reflect_oryxmanager_exception");
        if (th != null) {
            opMonitor.addMetricValue("oryx_exception_detail", Arrays.toString(th.getStackTrace()));
        }
        opMonitor.addCategoryValue("process_info", ProcessUtil.getCurProcessName(iAppContext.getApplicationContext()));
        opMonitor.addCategoryValue("related_file", "oryxmanagerproxy");
        return opMonitor;
    }

    public static void monitorHookException(IAppContext iAppContext, HookPoint hookPoint, Throwable th) {
        OPMonitor generateHookExceptionMonitor = generateHookExceptionMonitor(iAppContext, hookPoint, th);
        addMonitorCommonParams(generateHookExceptionMonitor);
        if (generateHookExceptionMonitor != null) {
            generateHookExceptionMonitor.flush();
        }
    }

    public static void monitorWrongPreloadOnProcessInit(IAppContext iAppContext, String str, String str2) {
        OPMonitor generateWrongPreloadOnProcessMonitor = generateWrongPreloadOnProcessMonitor(iAppContext, str, str2);
        if (generateWrongPreloadOnProcessMonitor != null) {
            generateWrongPreloadOnProcessMonitor.flush();
        }
    }

    private static OPMonitor generateWrongPreloadOnProcessMonitor(IAppContext iAppContext, String str, String str2) {
        OPMonitor opMonitor = getOpMonitor(iAppContext, "op_oryx_wrong_perload", 10007, "wrong_preload_on_process_init");
        opMonitor.addCategoryValue("oryx_preload_on_process_init_process_name", ProcessUtil.getCurProcessName(iAppContext.getApplicationContext()));
        opMonitor.addCategoryValue("oryx_preload_on_process_init_appid", str);
        opMonitor.addMetricValue("oryx_preload_on_process_init_call_trace", str2);
        return opMonitor;
    }

    private static OPMonitor generateHookExceptionMonitor(IAppContext iAppContext, HookPoint hookPoint, Throwable th) {
        String str;
        String str2;
        OPMonitor opMonitor = getOpMonitor(iAppContext, "op_oryx_exception_event", 10003, "hook_exception");
        if (hookPoint == HookPoint.DexHook) {
            str = "hook_dex_exception";
        } else {
            str = "hook_so_exception";
        }
        opMonitor.setError(th);
        opMonitor.setErrorMessage(str);
        if (th != null) {
            opMonitor.addMetricValue("oryx_exception_detail", Arrays.toString(th.getStackTrace()));
        }
        opMonitor.addCategoryValue("process_info", ProcessUtil.getCurProcessName(iAppContext.getApplicationContext()));
        if (hookPoint == HookPoint.DexHook) {
            str2 = "dex";
        } else {
            str2 = "so";
        }
        opMonitor.addCategoryValue("related_file", str2);
        return opMonitor;
    }

    private static OPMonitor getOpMonitor(IAppContext iAppContext, String str, int i, String str2) {
        return OPMonitorUtils.getOpMonitor(iAppContext, str, new OPMonitorCode("client.open_platform.oryx.common", i, OPMonitorLevel.ERROR, str2));
    }
}

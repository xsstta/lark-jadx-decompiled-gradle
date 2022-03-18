package com.ss.android.lark.dfcore.utils;

import android.text.TextUtils;
import com.bytedance.morpheus.C20207c;
import com.bytedance.morpheus.core.C20208a;
import com.bytedance.morpheus.p856a.C20195a;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.larksuite.framework.utils.C26317s;
import com.ss.android.lark.dfcore.p1801c.AbstractC36602a;
import com.ss.android.lark.dfcore.p1801c.C36605c;
import com.ss.android.lark.dfcore.p1801c.C36607e;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class DynamicFeatureUtils {
    static {
        C36617b.m144489c();
    }

    public static SplitInstallManager getSplitInstallManager() {
        return C20195a.m73710a();
    }

    public static Set<String> getInstalledLanguages() {
        return getSplitInstallManager().getInstalledLanguages();
    }

    public static List<String> getInstalledModules() {
        ArrayList arrayList = new ArrayList();
        Map<String, C20208a> c = C20207c.m73753c();
        if (c != null) {
            for (C20208a aVar : c.values()) {
                if (aVar.mo68385c() == 5) {
                    arrayList.add(getModuleName(aVar.mo68382b()));
                }
            }
        }
        return arrayList;
    }

    public static Set<String> getInstallingLanguages() {
        HashSet hashSet = new HashSet();
        for (AbstractC36602a aVar : C36605c.m144424a().mo135034b()) {
            DynamicFeatureTask a = aVar.mo135023a();
            if (isDynamicLanguageTask(a) && isStatusInstalling(aVar.mo135027b())) {
                hashSet.add(a.mo135056f().getLanguage());
            }
        }
        return hashSet;
    }

    public static List<String> getInstallingModules() {
        ArrayList arrayList = new ArrayList();
        Map<String, C20208a> c = C20207c.m73753c();
        if (c != null) {
            for (C20208a aVar : c.values()) {
                if (isStatusInstalling(aVar)) {
                    arrayList.add(getModuleName(aVar.mo68382b()));
                }
            }
        }
        return arrayList;
    }

    public static void addSplitInstallStateUpdatedListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        C20195a.m73712a(splitInstallStateUpdatedListener);
    }

    public static void removeSplitInstallStateUpdatedListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        C20195a.m73715b(splitInstallStateUpdatedListener);
    }

    public static String getModuleName(String str) {
        return C20195a.m73714b(str);
    }

    public static String getPackageName(String str) {
        return C20195a.m73711a(str);
    }

    public static boolean isDynamicLanguageTask(String str) {
        return TextUtils.equals(str, "com.ss.android.lark.dflanguage");
    }

    public static boolean isDynamicLanguageTask(DynamicFeatureTask dynamicFeatureTask) {
        return isDynamicLanguageTask(dynamicFeatureTask.mo135050b());
    }

    public static boolean isLanguageInstalled(Locale locale) {
        return isLanguageInstalled(locale.getLanguage());
    }

    public static boolean isLanguageInstalled(String str) {
        if (TextUtils.equals("en", str)) {
            return true;
        }
        return getSplitInstallManager().getInstalledLanguages().contains(str);
    }

    public static boolean isModuleInstalled(String str) {
        C20208a b = C20207c.m73751b(getPackageName(str));
        if (b == null || b.mo68385c() != 5) {
            return false;
        }
        return true;
    }

    public static int getSessionId(DynamicFeatureTask dynamicFeatureTask) {
        if (!isDynamicLanguageTask(dynamicFeatureTask.mo135050b()) || dynamicFeatureTask.mo135056f() == null) {
            return C20195a.m73716c(dynamicFeatureTask.mo135050b());
        }
        return C36607e.m144438b(dynamicFeatureTask.mo135056f().getLanguage());
    }

    public static boolean isAllModulesInstalled(List<String> list) {
        if (C26317s.m95316a(list)) {
            return false;
        }
        for (String str : list) {
            if (!isModuleInstalled(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStatusInstalling(C20208a aVar) {
        if (aVar == null) {
            return false;
        }
        if (aVar.mo68385c() == 1 || aVar.mo68385c() == 8 || aVar.mo68385c() == 2 || aVar.mo68385c() == 4) {
            return true;
        }
        return false;
    }

    public static C20208a buildState(String str, SplitInstallSessionState splitInstallSessionState) {
        C20208a aVar = new C20208a(str, C20207c.m73750b().mo68356b(), splitInstallSessionState.status());
        aVar.mo68379a(splitInstallSessionState.totalBytesToDownload());
        aVar.mo68384b(splitInstallSessionState.bytesDownloaded());
        aVar.mo68380a(splitInstallSessionState.resolutionIntent());
        aVar.mo68386c(splitInstallSessionState.errorCode());
        return aVar;
    }
}

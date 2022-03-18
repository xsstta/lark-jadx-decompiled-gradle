package com.ss.android.lark.integrator.ccm.p2005b;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4503d;
import com.bytedance.morpheus.core.C20208a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dfcore.p1800b.AbstractC36599a;
import com.ss.android.lark.dfcore.p1800b.AbstractC36600b;
import com.ss.android.lark.dfcore.p1800b.AbstractC36601c;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.integrator.ccm.b.a */
public class C39235a {
    /* renamed from: a */
    public static void m154732a(String str, final C4503d.AbstractC4506b bVar) {
        boolean a = C37239a.m146648b().mo136952a("spacekit.mobile.ttoffice_dynamic_feature_download_enable", false);
        Log.m165389i("[LFF]PluginUpdateHelper-us", "startUpdatePlugin, isDownloadFgEnable = " + a);
        if (!a) {
            Log.m165397w("[LFF]PluginUpdateHelper-us", "startUpdatePlugin, but isDownloadFgEnable for ttoffice is false ");
            return;
        }
        String moduleName = DynamicFeatureUtils.getModuleName(str);
        if (TextUtils.isEmpty(moduleName)) {
            Log.m165397w("[LFF]PluginUpdateHelper-us", "startUpdatePlugin, but this module can NOT support dynamic feature! module is : " + str);
            return;
        }
        DynamicFeatureTask dynamicFeatureTask = new DynamicFeatureTask(moduleName);
        dynamicFeatureTask.mo135042a((AbstractC36599a) new AbstractC36599a() {
            /* class com.ss.android.lark.integrator.ccm.p2005b.C39235a.C392361 */

            @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36599a
            /* renamed from: a */
            public void mo135016a(DynamicFeatureTask dynamicFeatureTask, long j, long j2) {
                Log.m165389i("[LFF]PluginUpdateHelper-us", "progress: " + j + "/" + j2);
            }
        });
        dynamicFeatureTask.mo135043a((AbstractC36600b) new AbstractC36600b() {
            /* class com.ss.android.lark.integrator.ccm.p2005b.C39235a.C392372 */

            @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36600b
            /* renamed from: a */
            public void mo135017a(DynamicFeatureTask dynamicFeatureTask) {
                if (dynamicFeatureTask == null) {
                    Log.m165397w("[LFF]PluginUpdateHelper-us", "onInstallSuccess, but task is null");
                    return;
                }
                Log.m165389i("[LFF]PluginUpdateHelper-us", "onInstallSuccess, task is : " + dynamicFeatureTask.mo135040a());
                bVar.mo17331a();
            }

            @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36600b
            /* renamed from: b */
            public void mo135019b(DynamicFeatureTask dynamicFeatureTask) {
                if (dynamicFeatureTask == null) {
                    Log.m165389i("[LFF]PluginUpdateHelper-us", "onInstallCanceled, but task is null !");
                    return;
                }
                Log.m165389i("[LFF]PluginUpdateHelper-us", "onInstallCanceled method, task is: " + dynamicFeatureTask.mo135040a());
                bVar.mo17332a(0, "plugin install has been canceled");
            }

            @Override // com.ss.android.lark.dfcore.p1800b.AbstractC36600b
            /* renamed from: a */
            public void mo135018a(DynamicFeatureTask dynamicFeatureTask, int i) {
                if (dynamicFeatureTask == null) {
                    Log.m165397w("[LFF]PluginUpdateHelper-us", "onInstallFailed, but task is null !");
                    return;
                }
                Log.m165389i("[LFF]PluginUpdateHelper-us", "onInstallFailed, errorCode: " + i + ", task is : " + dynamicFeatureTask.mo135040a());
                C4503d.AbstractC4506b bVar = bVar;
                StringBuilder sb = new StringBuilder();
                sb.append("plugin install failed, errorCode: ");
                sb.append(i);
                bVar.mo17332a(0, sb.toString());
            }
        });
        dynamicFeatureTask.mo135044a((AbstractC36601c) new AbstractC36601c() {
            /* class com.ss.android.lark.integrator.ccm.p2005b.C39235a.C392383 */

            @Override // com.bytedance.morpheus.core.AbstractC20209b
            /* renamed from: a */
            public void mo68394a(C20208a aVar) {
                Log.m165389i("[LFF]PluginUpdateHelper-us", "onStateChanged, state: " + aVar);
            }
        });
        DynamicFeatureCore.install(dynamicFeatureTask);
    }
}

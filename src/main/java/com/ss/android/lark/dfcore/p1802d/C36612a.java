package com.ss.android.lark.dfcore.p1802d;

import com.bytedance.morpheus.core.C20208a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dfcore.task.DynamicFeatureTask;
import com.ss.android.lark.dfcore.utils.DynamicFeatureUtils;
import com.ss.android.lark.log.Log;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.dfcore.d.a */
public class C36612a {
    /* renamed from: a */
    private static void m144445a(String str, JSONObject jSONObject) {
        DynamicFeatureCore.AbstractC36595a dependency = DynamicFeatureCore.getDependency();
        if (dependency != null) {
            dependency.mo103169a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m144443a(DynamicFeatureTask dynamicFeatureTask, int i) {
        if (dynamicFeatureTask != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (DynamicFeatureUtils.isDynamicLanguageTask(dynamicFeatureTask)) {
                    jSONObject.put("df_name", "df_language");
                    Locale f = dynamicFeatureTask.mo135056f();
                    if (f != null) {
                        jSONObject.put("df_language", f.getLanguage());
                    }
                } else {
                    jSONObject.put("df_name", dynamicFeatureTask.mo135040a());
                }
                jSONObject.put("df_status", i);
                m144445a("df_install", jSONObject);
            } catch (Exception e) {
                Log.m165384e("DFCore", "logInstall error, task: " + dynamicFeatureTask, e);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m144446b(DynamicFeatureTask dynamicFeatureTask, int i) {
        if (dynamicFeatureTask != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (DynamicFeatureUtils.isDynamicLanguageTask(dynamicFeatureTask)) {
                    jSONObject.put("df_name", "df_language");
                    Locale f = dynamicFeatureTask.mo135056f();
                    if (f != null) {
                        jSONObject.put("df_language", f.getLanguage());
                    }
                } else {
                    jSONObject.put("df_name", dynamicFeatureTask.mo135040a());
                }
                jSONObject.put("df_result_code", i);
                m144445a("df_click_permission_dialog", jSONObject);
            } catch (Exception e) {
                Log.m165384e("DFCore", "logClickPermissionDialog error, task: " + dynamicFeatureTask, e);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m144444a(DynamicFeatureTask dynamicFeatureTask, C20208a aVar) {
        String str;
        if (aVar != null && dynamicFeatureTask != null) {
            try {
                if (aVar.mo68385c() == 1) {
                    return;
                }
                if (aVar.mo68385c() != 2) {
                    JSONObject jSONObject = new JSONObject();
                    if (DynamicFeatureUtils.isDynamicLanguageTask(dynamicFeatureTask)) {
                        jSONObject.put("df_name", "df_language");
                        Locale f = dynamicFeatureTask.mo135056f();
                        if (f != null) {
                            jSONObject.put("df_language", f.getLanguage());
                        }
                    } else {
                        jSONObject.put("df_name", dynamicFeatureTask.mo135040a());
                    }
                    jSONObject.put("df_status", aVar.mo68385c());
                    if (aVar.mo68385c() == 4 || aVar.mo68385c() == 5) {
                        jSONObject.put("df_bytes_to_download", aVar.mo68388e());
                        jSONObject.put("df_download_duration", aVar.mo68377a());
                    } else if (aVar.mo68385c() == 6 || aVar.mo68385c() == 0) {
                        jSONObject.put("df_error_code", aVar.mo68390g());
                        if (aVar.mo68392i() != null) {
                            str = aVar.mo68392i().getMessage();
                        } else {
                            str = "";
                        }
                        jSONObject.put("df_error_msg", str);
                    }
                    m144445a("df_state_change", jSONObject);
                }
            } catch (Exception e) {
                Log.m165384e("DFCore", "logStateChange error, task: " + dynamicFeatureTask, e);
                e.printStackTrace();
            }
        }
    }
}

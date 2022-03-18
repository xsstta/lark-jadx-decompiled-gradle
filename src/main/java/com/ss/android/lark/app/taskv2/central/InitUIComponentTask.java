package com.ss.android.lark.app.taskv2.central;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.larksuite.component.ui.display.manager.IStore;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.p1355a.C28847a;
import com.ss.android.lark.app.task.InitAvatarLoaderTask;
import com.ss.android.lark.app.task.InitBaseFeatureTask;
import com.ss.android.lark.app.task.InitChatPreviewTask;
import com.ss.android.lark.app.task.InitFloatTask;
import com.ss.android.lark.app.task.InitImageModuleTask;
import com.ss.android.lark.app.task.InitReactionComponentTask;
import com.ss.android.lark.app.task.initor.AudioModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.EmojiModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.LarkPhotoEditorModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.RichTextModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.helper.CustomHitPointHeaderHolder;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

public class InitUIComponentTask extends InitBaseFeatureTask {
    /* renamed from: g */
    private void m106748g() {
        LKUIDisplayManager.m91873a(new IStore() {
            /* class com.ss.android.lark.app.taskv2.central.InitUIComponentTask.C290372 */

            @Override // com.larksuite.component.ui.display.manager.IStore
            /* renamed from: a */
            public boolean mo89310a() {
                return C37239a.m146648b().mo136952a("lark.mobile.display_textsize", false);
            }

            @Override // com.larksuite.component.ui.display.manager.IStore
            /* renamed from: a */
            public int mo89308a(String str) {
                return C57744a.m224104a().getInt(str);
            }

            @Override // com.larksuite.component.ui.display.manager.IStore
            /* renamed from: a */
            public void mo89309a(String str, int i) {
                C57744a.m224104a().putInt(str, i);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitKVDataStoreTask.class);
        arrayList.add(InitCrashMonitorTaskV2.class);
        arrayList.add(InitRustSdkTask.class);
        arrayList.add(InitCentralModuleTask.class);
        return arrayList;
    }

    /* renamed from: a */
    private void m106745a(Application application) {
        new InitFloatTask().mo43817a(application);
    }

    /* renamed from: b */
    public static String m106746b(Context context) {
        int currentDarkMode = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getCurrentDarkMode();
        if (currentDarkMode == 1) {
            return "dark";
        }
        if (currentDarkMode == 2) {
            return "light";
        }
        if (UDUiModeUtils.m93319a(context)) {
            return "default_dark";
        }
        return "default_light";
    }

    /* renamed from: c */
    private static void m106747c(Context context) {
        final Context applicationContext = context.getApplicationContext();
        String b = m106746b(applicationContext);
        CustomHitPointHeaderHolder.f135720a.mo187498i(b);
        Statistics.updateTeaAgentCustomHeaderAsync();
        Log.m165389i("InitUIComponentTask", "initDarkModeParamsInCustomHitPointHeader, dark mode is: " + b);
        applicationContext.registerComponentCallbacks(new ComponentCallbacks() {
            /* class com.ss.android.lark.app.taskv2.central.InitUIComponentTask.ComponentCallbacksC290361 */

            public void onLowMemory() {
            }

            public void onConfigurationChanged(Configuration configuration) {
                String b = CustomHitPointHeaderHolder.f135720a.mo187487b();
                String b2 = InitUIComponentTask.m106746b(applicationContext);
                if (!TextUtils.equals(b, b2)) {
                    CustomHitPointHeaderHolder.f135720a.mo187498i(b2);
                    Statistics.updateTeaAgentCustomHeaderAsync();
                    Log.m165389i("InitUIComponentTask", "onConfigurationChanged, initDarkModeParamsInCustomHitPointHeader: new dark mode is: " + b2);
                }
            }
        });
    }

    @Override // com.ss.android.lark.app.task.InitBaseFeatureTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        m106748g();
        AudioModuleDependencyInitor.m106341a(context);
        BaseModuleDependencyInitor.m106344a(context);
        WidgetModuleDependencyInitor.m106670a(context);
        PhotoPickerModuleDependencyInitor.m106412a(context);
        LarkPhotoEditorModuleDependencyInitor.m106402a(context);
        RichTextModuleDependencyInitor.m106518a(context);
        EmojiModuleDependencyInitor.m106397a(context);
        super.mo43817a(context);
        new InitImageModuleTask().mo43817a(context);
        new InitAvatarLoaderTask().mo43817a(context);
        new InitReactionComponentTask().mo43817a(context);
        new InitChatPreviewTask().mo43817a(context);
        if (context instanceof Application) {
            m106745a((Application) context);
        }
        C28847a.m105677a();
        m106747c(context);
    }
}

package com.bytedance.ee.bear.debug.bugtool;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BugSubmitAcitivity extends BaseActivity {

    /* renamed from: a */
    private EditText f15020a;

    /* renamed from: b */
    private EditText f15021b;

    /* renamed from: c */
    private EditText f15022c;

    /* renamed from: d */
    private Spinner f15023d;

    /* renamed from: e */
    private Spinner f15024e;

    /* renamed from: f */
    private Spinner f15025f;

    /* renamed from: g */
    private Spinner f15026g;

    /* renamed from: h */
    private List<String> f15027h = new ArrayList();

    /* renamed from: i */
    private List<String> f15028i = new ArrayList();

    /* renamed from: j */
    private List<String> f15029j = new ArrayList();

    /* renamed from: k */
    private List<String> f15030k = new ArrayList();

    /* renamed from: l */
    private Map<String, String> f15031l = new HashMap();

    /* renamed from: m */
    private Map<String, Map<String, String>> f15032m = new HashMap();

    /* renamed from: n */
    private C5256c f15033n = new C5256c(this);

    /* renamed from: o */
    private al f15034o = C4511g.m18594d();

    /* renamed from: a */
    public Context mo21185a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo21186a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo21187a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m21479a(this, context);
    }

    /* renamed from: b */
    public void mo21188b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo21189c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m21473a(this, configuration);
    }

    public AssetManager getAssets() {
        return m21488c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m21474a(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m21485b(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.bug_tool_activity_bug_submit);
        this.f15027h.add("请选择优先级");
        this.f15027h.add("请选择优先级");
        this.f15028i.add("请选择业务线");
        this.f15028i.add("请选择业务线");
        this.f15029j.add("请选择缺陷严重程度");
        this.f15029j.add("请选择缺陷严重程度");
        this.f15030k.add("请选择缺陷发现阶段");
        this.f15030k.add("请选择缺陷发现阶段");
        this.f15020a = (EditText) findViewById(R.id.bug_tool_et_title);
        this.f15021b = (EditText) findViewById(R.id.bug_tool_et_principal);
        this.f15022c = (EditText) findViewById(R.id.bug_tool_et_description);
        this.f15023d = (Spinner) findViewById(R.id.bug_tool_spn_priority);
        this.f15024e = (Spinner) findViewById(R.id.bug_tool_spn_business);
        this.f15025f = (Spinner) findViewById(R.id.bug_tool_spn_severity_level);
        this.f15026g = (Spinner) findViewById(R.id.bug_tool_spn_discover_stage);
        m21475a(this.f15023d, this.f15027h);
        m21475a(this.f15024e, this.f15028i);
        m21475a(this.f15025f, this.f15029j);
        m21475a(this.f15026g, this.f15030k);
        this.f15033n.mo21198a("chenzhenbiao", new AbstractC5255b() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$MDXfKCK43ZWlm2l6STTRz0lp8qc */

            @Override // com.bytedance.ee.bear.debug.bugtool.AbstractC5255b
            public final void onResponse(JsonObject jsonObject) {
                BugSubmitAcitivity.lambda$MDXfKCK43ZWlm2l6STTRz0lp8qc(BugSubmitAcitivity.this, jsonObject);
            }
        });
        this.f15033n.mo21200b("chenzhenbiao", new AbstractC5255b() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$WTtEFdoUSt4343HeESwe2zR5OF4 */

            @Override // com.bytedance.ee.bear.debug.bugtool.AbstractC5255b
            public final void onResponse(JsonObject jsonObject) {
                BugSubmitAcitivity.lambda$WTtEFdoUSt4343HeESwe2zR5OF4(BugSubmitAcitivity.this, jsonObject);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m21482a(String str, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
        finish();
    }

    /* renamed from: a */
    private void m21483a(List<Map<String, Object>> list, String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("field_key", str);
        hashMap.put("field_value", obj);
        list.add(hashMap);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m21489c(JsonObject jsonObject) {
        runOnUiThread(new Runnable(jsonObject) {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$dSZ74WGTGgJ2gESTdRgRQKKI3lg */
            public final /* synthetic */ JsonObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BugSubmitAcitivity.lambda$dSZ74WGTGgJ2gESTdRgRQKKI3lg(BugSubmitAcitivity.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m21491e(JsonObject jsonObject) {
        runOnUiThread(new Runnable(jsonObject) {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$RDw19tbajslGFOkAuDapECvEDys */
            public final /* synthetic */ JsonObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BugSubmitAcitivity.lambda$RDw19tbajslGFOkAuDapECvEDys(BugSubmitAcitivity.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static Resources m21474a(BugSubmitAcitivity bugSubmitAcitivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bugSubmitAcitivity);
        }
        return bugSubmitAcitivity.mo21186a();
    }

    /* renamed from: c */
    public static AssetManager m21488c(BugSubmitAcitivity bugSubmitAcitivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bugSubmitAcitivity);
        }
        return bugSubmitAcitivity.mo21189c();
    }

    /* renamed from: b */
    public static void m21485b(BugSubmitAcitivity bugSubmitAcitivity) {
        bugSubmitAcitivity.mo21188b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BugSubmitAcitivity bugSubmitAcitivity2 = bugSubmitAcitivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    bugSubmitAcitivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m21490d(JsonObject jsonObject) {
        List<String> arrayList = new ArrayList<>();
        Map<String, String> hashMap = new HashMap<>();
        JsonArray asJsonArray = jsonObject.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonArray();
        if (asJsonArray.size() != 0) {
            m21480a(asJsonArray, "", arrayList, hashMap);
        }
        this.f15032m.put("业务线", hashMap);
        arrayList.add(this.f15028i.get(0));
        m21475a(this.f15024e, arrayList);
        this.f15028i = arrayList;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m21486b(JsonObject jsonObject) {
        if (jsonObject.get(HiAnalyticsConstant.HaKey.BI_KEY_RESULT).getAsInt() == 0) {
            int asInt = jsonObject.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsInt();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("提单成功！Bug ID: " + asInt);
            String str = "https://bits.bytedance.net/meego/larksuite/issue/detail/" + asInt + "#detail";
            builder.setNeutralButton("关闭", new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$IGX25LYZz9tNPLfM5am8YFCYuAg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    BugSubmitAcitivity.lambda$IGX25LYZz9tNPLfM5am8YFCYuAg(BugSubmitAcitivity.this, dialogInterface, i);
                }
            });
            builder.setPositiveButton("复制Bug单链接", new DialogInterface.OnClickListener(str) {
                /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$aCz6LlYt7afxgQG7G7C1oleCg */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    BugSubmitAcitivity.m269147lambda$aCz6LlYt7afxgQG7G7C1oleCg(BugSubmitAcitivity.this, this.f$1, dialogInterface, i);
                }
            });
            builder.setNegativeButton("打开Bug单", new DialogInterface.OnClickListener(str) {
                /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$nPtBYuxbe5VDneODbDmYI2M81kE */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    BugSubmitAcitivity.lambda$nPtBYuxbe5VDneODbDmYI2M81kE(BugSubmitAcitivity.this, this.f$1, dialogInterface, i);
                }
            });
            builder.show();
            return;
        }
        Toast.showFailureText(this, "提单失败，请检查字段并重试", 1);
    }

    /* renamed from: a */
    private String m21476a(boolean z) {
        String n = this.f15034o.mo17364n();
        if (!z) {
            return n;
        }
        String[] split = n.split("\\.");
        if (split.length < 2) {
            return split[0];
        }
        return split[0] + "." + split[1];
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m21492f(JsonObject jsonObject) {
        Iterator<JsonElement> it = jsonObject.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonArray().iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            String asString = next.getAsJsonObject().get("name").getAsString();
            asString.hashCode();
            char c = 65535;
            switch (asString.hashCode()) {
                case -2005224384:
                    if (asString.equals("缺陷严重程度")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969561338:
                    if (asString.equals("缺陷发现手段")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1969435616:
                    if (asString.equals("缺陷发现版本")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1969149317:
                    if (asString.equals("缺陷发现阶段")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1456066473:
                    if (asString.equals("缺陷问题类型")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1110339329:
                    if (asString.equals("所属 App")) {
                        c = 5;
                        break;
                    }
                    break;
                case -931400610:
                    if (asString.equals("缺陷发现人角色")) {
                        c = 6;
                        break;
                    }
                    break;
                case -922940457:
                    if (asString.equals("缺陷发现版本号")) {
                        c = 7;
                        break;
                    }
                    break;
                case -778321060:
                    if (asString.equals("目标修复版本")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 698243:
                    if (asString.equals("名称")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 19902424:
                    if (asString.equals("业务线")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 20135799:
                    if (asString.equals("优先级")) {
                        c = 11;
                        break;
                    }
                    break;
                case 24957205:
                    if (asString.equals("报告人")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 31872747:
                    if (asString.equals("经办人")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1179062979:
                    if (asString.equals("需求描述")) {
                        c = 14;
                        break;
                    }
                    break;
                case 1367592754:
                    if (asString.equals("工作项类型")) {
                        c = 15;
                        break;
                    }
                    break;
                case 2023253553:
                    if (asString.equals("Bug发现端分类")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f15029j = m21477a(next, asString, this.f15029j, this.f15025f);
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case 15:
                case 16:
                    this.f15031l.put(asString, next.getAsJsonObject().get("key").getAsString());
                    HashMap hashMap = new HashMap();
                    Iterator<JsonElement> it2 = next.getAsJsonObject().get("options").getAsJsonArray().iterator();
                    while (it2.hasNext()) {
                        JsonElement next2 = it2.next();
                        hashMap.put(next2.getAsJsonObject().get("label").getAsString(), next2.getAsJsonObject().get("value").getAsString());
                    }
                    this.f15032m.put(asString, hashMap);
                    break;
                case 3:
                    this.f15030k = m21477a(next, asString, this.f15030k, this.f15026g);
                    break;
                case '\t':
                case '\n':
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                case '\r':
                case 14:
                    this.f15031l.put(asString, next.getAsJsonObject().get("key").getAsString());
                    break;
                case 11:
                    this.f15027h = m21477a(next, asString, this.f15027h, this.f15023d);
                    break;
            }
        }
    }

    public void onSubmit(View view) {
        if (this.f15031l.isEmpty() || this.f15032m.isEmpty()) {
            Toast.showFailureText(this, "请求失败，请检查网络并重试", 1);
            return;
        }
        String string = new PersistenceSharedPreference("bug_tool_sp").getString("bug_tool_reporter", "");
        if ("".equals(string)) {
            Toast.showText(this, "请配置缺陷报告人", 1);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        m21483a(arrayList, this.f15031l.get("名称"), this.f15020a.getText().toString());
        m21483a(arrayList, this.f15031l.get("优先级"), this.f15032m.get("优先级").get(this.f15023d.getSelectedItem().toString()));
        m21483a(arrayList, this.f15031l.get("经办人"), this.f15021b.getText().toString().trim() + "@bytedance.com");
        m21483a(arrayList, this.f15031l.get("业务线"), this.f15032m.get("业务线").get(this.f15024e.getSelectedItem().toString()));
        m21483a(arrayList, this.f15031l.get("缺陷严重程度"), this.f15032m.get("缺陷严重程度").get(this.f15025f.getSelectedItem().toString()));
        m21483a(arrayList, this.f15031l.get("缺陷发现阶段"), this.f15032m.get("缺陷发现阶段").get(this.f15026g.getSelectedItem().toString()));
        m21483a(arrayList, "description", this.f15022c.getText().toString());
        m21483a(arrayList, this.f15031l.get("报告人"), string + "@bytedance.com");
        m21483a(arrayList, this.f15031l.get("缺陷问题类型"), new String[]{this.f15032m.get("缺陷问题类型").get("功能逻辑问题")});
        m21483a(arrayList, this.f15031l.get("Bug发现端分类"), this.f15032m.get("Bug发现端分类").get("Android"));
        m21483a(arrayList, this.f15031l.get("缺陷发现手段"), this.f15032m.get("缺陷发现手段").get("手工测试"));
        m21483a(arrayList, this.f15031l.get("缺陷发现版本"), new String[]{this.f15032m.get("缺陷发现版本").get(m21476a(true))});
        m21483a(arrayList, this.f15031l.get("缺陷发现版本号"), this.f15032m.get("缺陷发现版本号").get(m21476a(false)));
        m21483a(arrayList, this.f15031l.get("目标修复版本"), new String[]{this.f15032m.get("目标修复版本").get(m21476a(true))});
        m21483a(arrayList, this.f15031l.get("缺陷发现人角色"), this.f15032m.get("缺陷发现人角色").get("测试"));
        m21483a(arrayList, this.f15031l.get("所属 App"), new String[]{this.f15032m.get("所属 App").get("飞书")});
        m21483a(arrayList, this.f15031l.get("工作项类型"), this.f15032m.get("工作项类型").get("普通缺陷"));
        hashMap.put("field_values", arrayList);
        this.f15033n.mo21199a(hashMap, "chenzhenbiao", new AbstractC5255b() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$WuSoHZMEYcf0xFjUhL9c0yYfO0 */

            @Override // com.bytedance.ee.bear.debug.bugtool.AbstractC5255b
            public final void onResponse(JsonObject jsonObject) {
                BugSubmitAcitivity.m269146lambda$WuSoHZMEYcf0xFjUhL9c0yYfO0(BugSubmitAcitivity.this, jsonObject);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m21481a(JsonObject jsonObject) {
        runOnUiThread(new Runnable(jsonObject) {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$q1m8HVIf8QNEFKL6QasLIFHpWfc */
            public final /* synthetic */ JsonObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BugSubmitAcitivity.lambda$q1m8HVIf8QNEFKL6QasLIFHpWfc(BugSubmitAcitivity.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m21478a(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m21484b(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* renamed from: a */
    public static void m21479a(BugSubmitAcitivity bugSubmitAcitivity, Context context) {
        bugSubmitAcitivity.mo21187a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(bugSubmitAcitivity);
        }
    }

    /* renamed from: a */
    public static Context m21473a(BugSubmitAcitivity bugSubmitAcitivity, Configuration configuration) {
        Context a = bugSubmitAcitivity.mo21185a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("是否退出编辑？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.debug.bugtool.$$Lambda$BugSubmitAcitivity$zYi1IY0oY3M2TDImBRFfGauf_44 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                BugSubmitAcitivity.lambda$zYi1IY0oY3M2TDImBRFfGauf_44(BugSubmitAcitivity.this, dialogInterface, i);
            }
        });
        builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
        builder.show();
        return true;
    }

    /* renamed from: a */
    private C5254a m21475a(Spinner spinner, List<String> list) {
        C5254a aVar = new C5254a(this, R.layout.bug_tool_item_spinner, list);
        aVar.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) aVar);
        spinner.setSelection(aVar.getCount());
        return aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m21487b(String str, DialogInterface dialogInterface, int i) {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", str));
        finish();
    }

    /* renamed from: a */
    private List<String> m21477a(JsonElement jsonElement, String str, List<String> list, Spinner spinner) {
        this.f15031l.put(str, jsonElement.getAsJsonObject().get("key").getAsString());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator<JsonElement> it = jsonElement.getAsJsonObject().get("options").getAsJsonArray().iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            String asString = next.getAsJsonObject().get("label").getAsString();
            arrayList.add(asString);
            hashMap.put(asString, next.getAsJsonObject().get("value").getAsString());
        }
        this.f15032m.put(str, hashMap);
        arrayList.add(list.get(0));
        m21475a(spinner, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private void m21480a(JsonArray jsonArray, String str, List<String> list, Map<String, String> map) {
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            String str2 = str + next.getAsJsonObject().get("name").getAsString();
            String asString = next.getAsJsonObject().get("value").getAsString();
            JsonArray asJsonArray = next.getAsJsonObject().get("children").getAsJsonArray();
            if (asJsonArray.size() == 0) {
                list.add(str2);
                map.put(str2, asString);
            } else {
                m21480a(asJsonArray, str2 + "/", list, map);
            }
        }
    }
}

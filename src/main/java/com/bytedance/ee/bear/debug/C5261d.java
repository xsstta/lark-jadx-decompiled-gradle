package com.bytedance.ee.bear.debug;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.MultiSelectListPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5087ae;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.debug.bugtool.FloatWindowService;
import com.bytedance.ee.bear.debug.doctest.AbstractC5279b;
import com.bytedance.ee.bear.debug.doctest.C5280c;
import com.bytedance.ee.bear.debug.doctest.DocAutoTestImpl;
import com.bytedance.ee.bear.debug.doctest.IDocAutoTest;
import com.bytedance.ee.bear.debug.doctest.WikiAutoTestImpl;
import com.bytedance.ee.bear.debug.fgpreview.FGPreviewActivity;
import com.bytedance.ee.bear.debug.net.RequestActivity;
import com.bytedance.ee.bear.debug.net.RequestActivityP0;
import com.bytedance.ee.bear.debug.p289a.C5251a;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.ak;
import com.bytedance.ee.bear.document.security.SecurityUtils;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p701d.C13615c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.debug.d */
public class C5261d extends AbstractC5250a implements Preference.OnPreferenceChangeListener {

    /* renamed from: A */
    private CheckBoxPreference f15059A;

    /* renamed from: B */
    private CheckBoxPreference f15060B;

    /* renamed from: C */
    private an f15061C = ((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: D */
    private AbstractC5279b f15062D = C5280c.m21602a();

    /* renamed from: E */
    private C10917c f15063E;

    /* renamed from: F */
    private AbstractC5089af f15064F = ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class));

    /* renamed from: G */
    private AbstractC7184l f15065G;

    /* renamed from: H */
    private C5251a f15066H;

    /* renamed from: I */
    private boolean f15067I;

    /* renamed from: J */
    private Preference f15068J;

    /* renamed from: K */
    private Preference f15069K;

    /* renamed from: L */
    private Preference f15070L;

    /* renamed from: M */
    private Preference f15071M;

    /* renamed from: N */
    private Preference f15072N;

    /* renamed from: c */
    al f15073c = C4511g.m18594d();

    /* renamed from: d */
    public Context f15074d;

    /* renamed from: e */
    public Preference f15075e;

    /* renamed from: f */
    private PersistenceSharedPreference f15076f = new PersistenceSharedPreference("debug_config");

    /* renamed from: g */
    private String f15077g = ((String) this.f15076f.mo34038b("login", "input"));

    /* renamed from: h */
    private String f15078h = ((String) this.f15076f.mo34038b("server", "publish"));

    /* renamed from: i */
    private PersistenceSharedPreference f15079i = new PersistenceSharedPreference("deviceinfo");

    /* renamed from: j */
    private NetService f15080j = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: k */
    private AbstractC10740f f15081k = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class));

    /* renamed from: l */
    private AbstractC5233x f15082l = C5234y.m21391b();

    /* renamed from: m */
    private ConnectionService f15083m = C5084ad.m20847d();

    /* renamed from: n */
    private an f15084n = ((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: o */
    private IDocAutoTest f15085o;

    /* renamed from: p */
    private IDocAutoTest f15086p;

    /* renamed from: q */
    private CheckBoxPreference f15087q;

    /* renamed from: r */
    private CheckBoxPreference f15088r;

    /* renamed from: s */
    private EditTextPreference f15089s;

    /* renamed from: t */
    private EditTextPreference f15090t;

    /* renamed from: u */
    private EditTextPreference f15091u;

    /* renamed from: v */
    private EditTextPreference f15092v;

    /* renamed from: w */
    private EditTextPreference f15093w;

    /* renamed from: x */
    private CheckBoxPreference f15094x;

    /* renamed from: y */
    private Preference f15095y;

    /* renamed from: z */
    private CheckBoxPreference f15096z;

    /* renamed from: a */
    public boolean mo21203a() {
        return false;
    }

    /* renamed from: b */
    public void mo21205b() {
        Context context = this.f15012a.getContext();
        if (context != null) {
            this.f15067I = SecurityUtils.m23555a(context, this.f15073c);
            this.f15012a.findPreference("app_version").setSummary(m21542d());
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f15012a.findPreference("sensitive_log_enable");
            if (checkBoxPreference != null) {
                checkBoxPreference.setOnPreferenceChangeListener(this);
                checkBoxPreference.setChecked(((Boolean) this.f15076f.mo34038b("sensitive_log_enable", true)).booleanValue());
                checkBoxPreference.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f15012a.findPreference("blockCanary");
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.setOnPreferenceChangeListener(this);
                checkBoxPreference2.setChecked(((Boolean) this.f15076f.mo34038b("blockCanary", true)).booleanValue());
                checkBoxPreference2.setEnabled(this.f15067I);
            }
            if (!m21553f()) {
                this.f15012a.removePreference(this.f15012a.findPreference("category_block"));
            }
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.f15012a.findPreference("appDebugConfig");
            if (checkBoxPreference3 != null) {
                checkBoxPreference3.setOnPreferenceChangeListener(this);
                checkBoxPreference3.setChecked(((Boolean) this.f15076f.mo34038b("isDebug", false)).booleanValue());
                checkBoxPreference3.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.f15012a.findPreference("enableFrontendEtTest");
            if (checkBoxPreference4 != null) {
                checkBoxPreference4.setOnPreferenceChangeListener(this);
                checkBoxPreference4.setChecked(((Boolean) this.f15076f.mo34038b("enable_frontend_et_test", false)).booleanValue());
                checkBoxPreference3.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.f15012a.findPreference("renderAccelerate");
            this.f15087q = checkBoxPreference5;
            if (checkBoxPreference5 != null) {
                checkBoxPreference5.setOnPreferenceChangeListener(this);
                this.f15087q.setChecked(((Boolean) this.f15076f.mo34038b("renderAccelerate", true)).booleanValue());
                this.f15087q.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) this.f15012a.findPreference("firstRenderNotAccelerate");
            this.f15088r = checkBoxPreference6;
            if (checkBoxPreference6 != null) {
                checkBoxPreference6.setOnPreferenceChangeListener(this);
                this.f15088r.setChecked(((Boolean) this.f15076f.mo34038b("firstRenderNotAccelerate", false)).booleanValue());
                this.f15088r.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) this.f15012a.findPreference("enable_statistics");
            if (checkBoxPreference7 != null) {
                checkBoxPreference7.setOnPreferenceChangeListener(this);
                checkBoxPreference7.setChecked(((Boolean) this.f15076f.mo34038b("enable_statistics", Boolean.FALSE)).booleanValue());
                checkBoxPreference7.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference8 = (CheckBoxPreference) this.f15012a.findPreference("attachment_type_support");
            if (checkBoxPreference8 != null) {
                checkBoxPreference8.setOnPreferenceChangeListener(this);
                checkBoxPreference8.setChecked(((Boolean) this.f15076f.mo34038b("attachment_type_support", C5087ae.AbstractC5088a.f14802a)).booleanValue());
                checkBoxPreference8.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference9 = (CheckBoxPreference) this.f15012a.findPreference("resourceIntercept");
            this.f15094x = checkBoxPreference9;
            if (checkBoxPreference9 != null) {
                checkBoxPreference9.setOnPreferenceChangeListener(this);
                this.f15094x.setChecked(((Boolean) this.f15076f.mo34038b("resourceIntercept", true)).booleanValue());
                this.f15094x.setEnabled(this.f15067I);
            }
            EditTextPreference editTextPreference = (EditTextPreference) this.f15012a.findPreference("ip_proxy");
            this.f15091u = editTextPreference;
            if (editTextPreference != null) {
                editTextPreference.setOnPreferenceChangeListener(this);
                this.f15091u.setSummary((CharSequence) this.f15076f.mo34038b("ip_proxy", ""));
                this.f15091u.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference10 = (CheckBoxPreference) this.f15012a.findPreference("syncDocs");
            if (checkBoxPreference10 != null) {
                checkBoxPreference10.setOnPreferenceChangeListener(this);
                checkBoxPreference10.setChecked(((Boolean) this.f15076f.mo34038b("syncDocs", true)).booleanValue());
                checkBoxPreference10.setEnabled(this.f15067I);
            }
            this.f15075e = this.f15012a.findPreference("scm_info");
            this.f15095y = this.f15012a.findPreference("bitable_jsbundle_info");
            CheckBoxPreference checkBoxPreference11 = (CheckBoxPreference) this.f15012a.findPreference("domain_enable");
            if (checkBoxPreference11 != null) {
                checkBoxPreference11.setOnPreferenceChangeListener(this);
                checkBoxPreference11.setChecked(((Boolean) this.f15076f.mo34038b("domain_enable", Boolean.TRUE)).booleanValue());
                checkBoxPreference11.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference12 = (CheckBoxPreference) this.f15012a.findPreference("ttwebview_enable");
            this.f15096z = checkBoxPreference12;
            if (checkBoxPreference12 != null) {
                checkBoxPreference12.setOnPreferenceChangeListener(this);
                this.f15096z.setChecked(((Boolean) this.f15076f.mo34038b("ttwebview_enable", Boolean.TRUE)).booleanValue());
                this.f15096z.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference13 = (CheckBoxPreference) this.f15012a.findPreference("ttwebview_m62_enable");
            this.f15059A = checkBoxPreference13;
            if (checkBoxPreference13 != null) {
                checkBoxPreference13.setOnPreferenceChangeListener(this);
                this.f15059A.setChecked(((Boolean) this.f15076f.mo34038b("ttwebview_m62_enable", Boolean.FALSE)).booleanValue());
                this.f15059A.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference14 = (CheckBoxPreference) this.f15012a.findPreference("docs_preload_class");
            this.f15060B = checkBoxPreference14;
            if (checkBoxPreference14 != null) {
                checkBoxPreference14.setOnPreferenceChangeListener(this);
                this.f15060B.setChecked(((Boolean) this.f15076f.mo34038b("docs_preload_class", Boolean.TRUE)).booleanValue());
                this.f15060B.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference15 = (CheckBoxPreference) this.f15012a.findPreference("ocr_enable");
            if (checkBoxPreference15 != null) {
                checkBoxPreference15.setOnPreferenceChangeListener(this);
                checkBoxPreference15.setChecked(((Boolean) this.f15076f.mo34038b("ocr_enable", Boolean.FALSE)).booleanValue());
                checkBoxPreference15.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference16 = (CheckBoxPreference) this.f15012a.findPreference("doc_rn_enabled");
            if (checkBoxPreference16 != null) {
                checkBoxPreference16.setOnPreferenceChangeListener(this);
                checkBoxPreference16.setChecked(((Boolean) this.f15076f.mo34038b("doc_rn_enabled", Boolean.TRUE)).booleanValue());
                checkBoxPreference16.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference17 = (CheckBoxPreference) this.f15012a.findPreference("offline_encrypt");
            if (checkBoxPreference17 != null) {
                checkBoxPreference17.setOnPreferenceChangeListener(this);
                checkBoxPreference17.setChecked(((Boolean) this.f15076f.mo34038b("offline_encrypt", Boolean.TRUE)).booleanValue());
                checkBoxPreference17.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference18 = (CheckBoxPreference) this.f15012a.findPreference("offline_support_change_resource");
            if (checkBoxPreference18 != null) {
                checkBoxPreference18.setOnPreferenceChangeListener(this);
                checkBoxPreference18.setChecked(((Boolean) this.f15076f.mo34038b("offline_support_change_resource", Boolean.FALSE)).booleanValue());
            }
            CheckBoxPreference checkBoxPreference19 = (CheckBoxPreference) this.f15012a.findPreference("initGecko");
            if (checkBoxPreference19 != null) {
                checkBoxPreference19.setOnPreferenceChangeListener(this);
                checkBoxPreference19.setChecked(((Boolean) this.f15076f.mo34038b("initGecko", true)).booleanValue());
                checkBoxPreference19.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference20 = (CheckBoxPreference) this.f15012a.findPreference("rn_doze");
            if (checkBoxPreference20 != null) {
                checkBoxPreference20.setOnPreferenceChangeListener(this);
                checkBoxPreference20.setChecked(((Boolean) this.f15076f.mo34038b("rn_doze", Boolean.FALSE)).booleanValue());
                checkBoxPreference20.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference21 = (CheckBoxPreference) this.f15012a.findPreference("rn_debug");
            if (checkBoxPreference21 != null) {
                checkBoxPreference21.setOnPreferenceChangeListener(this);
                checkBoxPreference21.setChecked(((Boolean) this.f15076f.mo34038b("rn_debug", Boolean.FALSE)).booleanValue());
                checkBoxPreference21.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference22 = (CheckBoxPreference) this.f15012a.findPreference("rn_debug_for_bitable");
            if (checkBoxPreference22 != null) {
                checkBoxPreference22.setOnPreferenceChangeListener(this);
                checkBoxPreference22.setChecked(((Boolean) this.f15076f.mo34038b("rn_debug_for_bitable", Boolean.FALSE)).booleanValue());
                checkBoxPreference22.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference23 = (CheckBoxPreference) this.f15012a.findPreference("rn_preload");
            if (checkBoxPreference23 != null) {
                checkBoxPreference23.setOnPreferenceChangeListener(this);
                checkBoxPreference23.setChecked(((Boolean) this.f15076f.mo34038b("rn_preload", Boolean.TRUE)).booleanValue());
                checkBoxPreference23.setEnabled(this.f15067I);
            }
            ListPreference listPreference = (ListPreference) this.f15012a.findPreference("build_login");
            if (listPreference != null) {
                listPreference.setOnPreferenceChangeListener(this);
                listPreference.setSummary(this.f15077g);
                listPreference.setEnabled(this.f15067I);
            }
            ListPreference listPreference2 = (ListPreference) this.f15012a.findPreference("build_server");
            if (listPreference2 != null) {
                listPreference2.setOnPreferenceChangeListener(this);
                listPreference2.setSummary(this.f15078h);
                listPreference2.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference24 = (CheckBoxPreference) this.f15012a.findPreference("test_switch");
            checkBoxPreference24.setChecked(false);
            if (checkBoxPreference24 != null) {
                checkBoxPreference24.setOnPreferenceChangeListener(this);
                checkBoxPreference24.setEnabled(this.f15067I);
                if (this.f15085o == null) {
                    this.f15085o = new DocAutoTestImpl((Context) this.f15013b.get(), this.f15080j, this.f15081k, this.f15062D, this.f15064F, this.f15065G, this.f15073c, this.f15061C);
                }
            }
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) this.f15012a.findPreference("doc_types");
            if (multiSelectListPreference != null) {
                multiSelectListPreference.setOnPreferenceChangeListener(this);
                multiSelectListPreference.setSummary(this.f15085o.getWhiteList().toString());
                multiSelectListPreference.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference25 = (CheckBoxPreference) this.f15012a.findPreference("wiki_test_switch");
            checkBoxPreference25.setChecked(false);
            if (checkBoxPreference25 != null) {
                checkBoxPreference25.setOnPreferenceChangeListener(this);
                checkBoxPreference25.setEnabled(this.f15067I);
                if (this.f15086p == null) {
                    this.f15086p = new WikiAutoTestImpl((Context) this.f15013b.get(), this.f15080j, this.f15081k, this.f15062D, this.f15064F, this.f15073c, this.f15061C);
                }
            }
            CheckBoxPreference checkBoxPreference26 = (CheckBoxPreference) this.f15012a.findPreference("offline_auto_download_full_res");
            if (checkBoxPreference26 != null) {
                checkBoxPreference26.setOnPreferenceChangeListener(this);
            }
            EditTextPreference editTextPreference2 = (EditTextPreference) this.f15012a.findPreference("offline_res_version");
            this.f15089s = editTextPreference2;
            if (editTextPreference2 != null) {
                editTextPreference2.setOnPreferenceChangeListener(this);
                this.f15089s.setSummary((CharSequence) this.f15076f.mo34038b("offline_res_version", ""));
                this.f15089s.setEnabled(this.f15067I);
            }
            EditTextPreference editTextPreference3 = (EditTextPreference) this.f15012a.findPreference("folder_token");
            this.f15090t = editTextPreference3;
            if (editTextPreference3 != null) {
                editTextPreference3.setOnPreferenceChangeListener(this);
                this.f15090t.setSummary((CharSequence) this.f15076f.mo34038b("folder_token", ""));
                this.f15090t.setEnabled(this.f15067I);
            }
            EditTextPreference editTextPreference4 = (EditTextPreference) this.f15012a.findPreference("http_request_id");
            this.f15093w = editTextPreference4;
            if (editTextPreference4 != null) {
                editTextPreference4.setOnPreferenceChangeListener(this);
                this.f15093w.setSummary((CharSequence) this.f15076f.mo34038b("http_request_id", ""));
                this.f15093w.setEnabled(this.f15067I);
            }
            m21556g();
            Preference findPreference = this.f15012a.findPreference("copy_data_to_sd");
            this.f15068J = findPreference;
            findPreference.setEnabled(this.f15067I);
            this.f15068J.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                /* class com.bytedance.ee.bear.debug.C5261d.C52621 */

                public boolean onPreferenceClick(Preference preference) {
                    AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48477a()).mo238020d(new Function<Boolean, Boolean>() {
                        /* class com.bytedance.ee.bear.debug.C5261d.C52621.C52653 */

                        /* renamed from: a */
                        public Boolean apply(Boolean bool) throws Exception {
                            return Boolean.valueOf(C5261d.this.mo21204a(C5261d.this.f15074d));
                        }
                    }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
                        /* class com.bytedance.ee.bear.debug.C5261d.C52621.C52631 */

                        /* renamed from: a */
                        public void accept(Boolean bool) throws Exception {
                            String str;
                            Context context = C5261d.this.f15074d;
                            if (bool.booleanValue()) {
                                str = "copy success";
                            } else {
                                str = "copy fail";
                            }
                            Toast.showSuccessText(context, str, 0);
                        }
                    }, new Consumer<Throwable>() {
                        /* class com.bytedance.ee.bear.debug.C5261d.C52621.C52642 */

                        /* renamed from: a */
                        public void accept(Throwable th) throws Exception {
                            C13479a.m54761a("GeneralDebugInfo", th);
                        }
                    });
                    return true;
                }
            });
            CheckBoxPreference checkBoxPreference27 = (CheckBoxPreference) this.f15012a.findPreference("database_encrypt");
            if (checkBoxPreference27 != null) {
                checkBoxPreference27.setOnPreferenceChangeListener(this);
                checkBoxPreference27.setChecked(((Boolean) this.f15076f.mo34038b("database_encrypt", Boolean.TRUE)).booleanValue());
                checkBoxPreference27.setEnabled(this.f15067I);
            }
            Preference findPreference2 = this.f15012a.findPreference("clean_drive_cache");
            this.f15069K = findPreference2;
            if (findPreference2 != null) {
                findPreference2.setEnabled(this.f15067I);
                this.f15069K.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$n15lzC31XH7rFGCh0gKnwDnFn6w */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21560h(preference);
                    }
                });
            }
            Preference findPreference3 = this.f15012a.findPreference("clean_cleanable_cache");
            this.f15070L = findPreference3;
            if (findPreference3 != null) {
                findPreference3.setEnabled(this.f15067I);
                this.f15070L.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$GJyCoU2N4qZqBRuS1WK7dL2XNi4 */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21558g(preference);
                    }
                });
            }
            Preference findPreference4 = this.f15012a.findPreference("get_cleanable_cache_size");
            this.f15071M = findPreference4;
            if (findPreference4 != null) {
                findPreference4.setEnabled(this.f15067I);
                this.f15071M.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$N4oZIB78A5YWhh96mdY91WaDT54 */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21555f(preference);
                    }
                });
            }
            Preference findPreference5 = this.f15012a.findPreference("get_doc_cache_size");
            if (findPreference5 != null) {
                findPreference5.setEnabled(this.f15067I);
                findPreference5.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$C_m60T7ceR5smMWzVDCVMuZ1Rw */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21550e(preference);
                    }
                });
            }
            Preference findPreference6 = this.f15012a.findPreference("clean_doc_cache");
            if (findPreference6 != null) {
                findPreference6.setEnabled(this.f15067I);
                findPreference6.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$CZCR7f7l2Vrjk0GxJJgjsI_SUWU */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21545d(preference);
                    }
                });
            }
            Preference findPreference7 = this.f15012a.findPreference("memory_gc");
            if (findPreference7 != null) {
                findPreference7.setEnabled(this.f15067I);
                findPreference7.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$84j3woQawcmNKO06EZC0sJZwL0I */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21540c(preference);
                    }
                });
            }
            Preference findPreference8 = this.f15012a.findPreference("open_drive_test_activity");
            this.f15072N = findPreference8;
            if (findPreference8 != null) {
                findPreference8.setEnabled(this.f15067I);
                this.f15072N.setOnPreferenceClickListener($$Lambda$d$fHSPw_6qhZg2E49mM5ENqqrNyfI.INSTANCE);
            }
            CheckBoxPreference checkBoxPreference28 = (CheckBoxPreference) this.f15012a.findPreference("wikitree_collab_enable");
            if (checkBoxPreference28 != null) {
                checkBoxPreference28.setOnPreferenceChangeListener(this);
                checkBoxPreference28.setChecked(((Boolean) this.f15076f.mo34038b("wikitree_collab_enable", true)).booleanValue());
                checkBoxPreference28.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference29 = (CheckBoxPreference) this.f15012a.findPreference("wikitree_show_areaId");
            if (checkBoxPreference29 != null) {
                checkBoxPreference29.setOnPreferenceChangeListener(this);
                checkBoxPreference29.setChecked(((Boolean) this.f15076f.mo34038b("wikitree_show_areaId", false)).booleanValue());
                checkBoxPreference29.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference30 = (CheckBoxPreference) this.f15012a.findPreference("wikitree_show_status");
            if (checkBoxPreference30 != null) {
                checkBoxPreference30.setOnPreferenceChangeListener(this);
                checkBoxPreference30.setChecked(((Boolean) this.f15076f.mo34038b("wikitree_show_status", false)).booleanValue());
                checkBoxPreference30.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference31 = (CheckBoxPreference) this.f15012a.findPreference("font_download_hint_enable");
            if (checkBoxPreference31 != null) {
                checkBoxPreference31.setChecked(((Boolean) this.f15076f.mo34038b("font_download_hint_enable", Boolean.FALSE)).booleanValue());
                checkBoxPreference31.setOnPreferenceChangeListener(this);
                checkBoxPreference31.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference32 = (CheckBoxPreference) this.f15012a.findPreference("mem_usage_analytic_for_auto_test_enable");
            if (checkBoxPreference32 != null) {
                checkBoxPreference32.setChecked(((Boolean) this.f15076f.mo34038b("mem_usage_analytic_for_auto_test_enable", Boolean.FALSE)).booleanValue());
                checkBoxPreference32.setOnPreferenceChangeListener(this);
                checkBoxPreference32.setEnabled(this.f15067I);
            }
            Preference findPreference9 = this.f15012a.findPreference("clean_slide_font_cache");
            if (findPreference9 != null) {
                findPreference9.setEnabled(this.f15067I);
                findPreference9.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$rJq1ItFPhmRW77fJI9pelcFAmfo */
                    public final /* synthetic */ Context f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21557g(this.f$1, preference);
                    }
                });
            }
            EditTextPreference editTextPreference5 = (EditTextPreference) this.f15012a.findPreference("ip_proxy_rust");
            this.f15092v = editTextPreference5;
            if (editTextPreference5 != null) {
                editTextPreference5.setOnPreferenceChangeListener(this);
                this.f15092v.setSummary((CharSequence) this.f15076f.mo34038b("ip_proxy_rust", ""));
                this.f15092v.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference33 = (CheckBoxPreference) this.f15012a.findPreference("tt_video_log_enable");
            if (checkBoxPreference33 != null) {
                checkBoxPreference33.setOnPreferenceChangeListener(this);
                checkBoxPreference33.setChecked(((Boolean) this.f15076f.mo34038b("tt_video_log_enable", false)).booleanValue());
                checkBoxPreference33.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference34 = (CheckBoxPreference) this.f15012a.findPreference("rust_net_enable");
            if (checkBoxPreference34 != null) {
                checkBoxPreference34.setOnPreferenceChangeListener(this);
                checkBoxPreference34.setChecked(((Boolean) this.f15076f.mo34038b("rust_net_enable", Boolean.TRUE)).booleanValue());
                checkBoxPreference34.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference35 = (CheckBoxPreference) this.f15012a.findPreference("lark_docs_newer_guide_switch");
            if (checkBoxPreference35 != null) {
                checkBoxPreference35.setOnPreferenceChangeListener(this);
                checkBoxPreference35.setChecked(((Boolean) this.f15076f.mo34038b("lark_docs_newer_guide_switch", false)).booleanValue());
                checkBoxPreference35.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference36 = (CheckBoxPreference) this.f15012a.findPreference("replace_base_enable");
            if (checkBoxPreference36 != null) {
                checkBoxPreference36.setOnPreferenceChangeListener(this);
                checkBoxPreference36.setChecked(((Boolean) this.f15076f.mo34038b("replace_base_enable", false)).booleanValue());
                checkBoxPreference36.setEnabled(this.f15067I);
            }
            CheckBoxPreference checkBoxPreference37 = (CheckBoxPreference) this.f15012a.findPreference("global_onboarding_enable");
            if (checkBoxPreference37 != null) {
                checkBoxPreference37.setEnabled(this.f15067I);
                checkBoxPreference37.setChecked(((Boolean) this.f15076f.mo34038b("global_onboarding_enable", false)).booleanValue());
                checkBoxPreference37.setOnPreferenceChangeListener(this);
            }
            CheckBoxPreference checkBoxPreference38 = (CheckBoxPreference) this.f15012a.findPreference("global_onboarding_native_only_enable");
            if (checkBoxPreference38 != null) {
                checkBoxPreference38.setEnabled(this.f15067I);
                checkBoxPreference38.setChecked(((Boolean) this.f15076f.mo34038b("global_onboarding_native_only_enable", false)).booleanValue());
                checkBoxPreference38.setOnPreferenceChangeListener(this);
            }
            Preference findPreference10 = this.f15012a.findPreference("clear_onboarding_cache");
            if (findPreference10 != null) {
                findPreference10.setEnabled(this.f15067I);
                findPreference10.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                    /* class com.bytedance.ee.bear.debug.$$Lambda$d$MmOx1o7g_f_snTipQhxJavAEvkk */

                    public final boolean onPreferenceClick(Preference preference) {
                        return C5261d.this.m21527a(preference);
                    }
                });
            }
            this.f15012a.findPreference("fg_preview").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$wtfMEtOwVLNC6niVd2YkuBV_Fjg */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onPreferenceClick(Preference preference) {
                    return C5261d.this.m21554f(this.f$1, preference);
                }
            });
            this.f15012a.findPreference("fg_mock").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$508_Zy7wOoX3tTQpBUN2ftKxYGg */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onPreferenceClick(Preference preference) {
                    return C5261d.this.m21549e(this.f$1, preference);
                }
            });
            CheckBoxPreference checkBoxPreference39 = (CheckBoxPreference) this.f15012a.findPreference("template_v4_ab_test");
            if (checkBoxPreference39 != null) {
                checkBoxPreference39.setEnabled(this.f15067I);
                checkBoxPreference39.setChecked(((Boolean) this.f15076f.mo34038b("template_v4_ab_test", false)).booleanValue());
                checkBoxPreference39.setOnPreferenceChangeListener(this);
            }
            CheckBoxPreference checkBoxPreference40 = (CheckBoxPreference) this.f15012a.findPreference("header_append_params_enable");
            if (checkBoxPreference40 != null) {
                checkBoxPreference40.setEnabled(this.f15067I);
                checkBoxPreference40.setChecked(((Boolean) this.f15076f.mo34038b("header_append_params_enable", false)).booleanValue());
                checkBoxPreference40.setOnPreferenceChangeListener(this);
            }
            this.f15012a.findPreference("header_append_params").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$ZEqTcxBpoxXyjGTlQ_WqxyVWfK0 */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onPreferenceClick(Preference preference) {
                    return C5261d.this.m21544d(this.f$1, preference);
                }
            });
            CheckBoxPreference checkBoxPreference41 = (CheckBoxPreference) this.f15012a.findPreference("admin_permission_mock");
            if (checkBoxPreference41 != null) {
                checkBoxPreference41.setEnabled(this.f15067I);
                checkBoxPreference41.setChecked(((Boolean) this.f15076f.mo34038b("admin_permission_mock", false)).booleanValue());
                checkBoxPreference41.setOnPreferenceChangeListener(this);
            }
            CheckBoxPreference checkBoxPreference42 = (CheckBoxPreference) this.f15012a.findPreference("watermark_enable");
            if (checkBoxPreference42 != null) {
                checkBoxPreference42.setEnabled(this.f15067I);
                checkBoxPreference42.setChecked(((Boolean) this.f15076f.mo34038b("watermark_enable", false)).booleanValue());
                checkBoxPreference42.setOnPreferenceChangeListener(this);
            }
            this.f15012a.findPreference("clear_more_badge").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$3cE45z0eevf3avby1tn1MtkTw */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onPreferenceClick(Preference preference) {
                    return C5261d.this.m21539c(this.f$1, preference);
                }
            });
            EditTextPreference editTextPreference6 = (EditTextPreference) this.f15012a.findPreference("sheet_preload_template");
            if (editTextPreference6 != null) {
                editTextPreference6.setOnPreferenceChangeListener(this);
                editTextPreference6.setEnabled(this.f15067I);
                editTextPreference6.setSummary((CharSequence) this.f15076f.mo34038b("sheet_preload_template", ""));
            }
            EditTextPreference editTextPreference7 = (EditTextPreference) this.f15012a.findPreference("sheet_template");
            if (editTextPreference7 != null) {
                editTextPreference7.setOnPreferenceChangeListener(this);
                editTextPreference7.setEnabled(this.f15067I);
                editTextPreference7.setSummary((CharSequence) this.f15076f.mo34038b("sheet_template", ""));
            }
            CheckBoxPreference checkBoxPreference43 = (CheckBoxPreference) this.f15012a.findPreference("net_interceptable");
            if (checkBoxPreference42 != null) {
                checkBoxPreference43.setEnabled(this.f15067I);
                checkBoxPreference43.setChecked(((Boolean) this.f15076f.mo34038b("net_interceptable", false)).booleanValue());
                checkBoxPreference43.setOnPreferenceChangeListener(this);
            }
            this.f15012a.findPreference("net_main_process").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$E60VYlB12oZmterdKbBe4C_u8 */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onPreferenceClick(Preference preference) {
                    return C5261d.this.m21534b(this.f$1, preference);
                }
            });
            this.f15012a.findPreference("net_p0_process").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(context) {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$GEB9IrzR2oBMLVPz9fxmFcP7fLo */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onPreferenceClick(Preference preference) {
                    return C5261d.this.m21525a(this.f$1, preference);
                }
            });
            CheckBoxPreference checkBoxPreference44 = (CheckBoxPreference) this.f15012a.findPreference("bug_tool_enable");
            if (checkBoxPreference44 != null) {
                boolean booleanValue = ((Boolean) this.f15076f.mo34038b("bug_tool_enable", false)).booleanValue();
                checkBoxPreference44.setEnabled(this.f15067I);
                checkBoxPreference44.setChecked(booleanValue);
                checkBoxPreference44.setOnPreferenceChangeListener(this);
                if (booleanValue && !m21526a(context, booleanValue)) {
                    checkBoxPreference44.setChecked(false);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m21527a(Preference preference) {
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39518b();
        Toast.showSuccessText(this.f15074d, "clear finish!重启生效～", 0);
        return true;
    }

    public boolean onPreferenceChange(Preference preference, Object obj) {
        String key = preference.getKey();
        if ("rn_debug".equals(key)) {
            this.f15076f.mo34037a("rn_debug", obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$3zvfsORmsk5SAFhsZ5FU_xiAbqo.INSTANCE, 1000);
        } else if ("rn_debug_for_bitable".equals(key)) {
            this.f15076f.mo34037a("rn_debug_for_bitable", obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$qMj_pyUbMdgs3g0GmTdSRf4yC8.INSTANCE, 1000);
        } else if ("build_login".equals(key)) {
            this.f15076f.mo34037a("login", obj.toString());
            preference.setSummary(obj.toString());
        } else if ("build_server".equals(key)) {
            String str = "bytedance.feishu-staging.cn";
            if (obj.toString().equals("inner")) {
                this.f15076f.mo34037a("serverType", 2);
            } else if (obj.toString().equals("staging")) {
                this.f15076f.mo34037a("serverType", 2);
            } else if (obj.toString().equals("oversea")) {
                this.f15076f.mo34037a("serverType", 4);
            } else if (obj.toString().equals("oversea-staging")) {
                this.f15076f.mo34037a("serverType", 5);
            } else {
                this.f15076f.mo34037a("serverType", 1);
                str = "bytedance.feishu.cn";
            }
            this.f15076f.mo34037a("server", obj.toString());
            this.f15076f.mo34037a("domain", str);
            preference.setSummary(obj.toString());
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$GP4yeXHqobBBxGkELhCBwHx0Cqk.INSTANCE, 1000);
        } else if ("blockCanary".equals(key)) {
            this.f15076f.mo34037a("blockCanary", obj);
            m21524a(((Boolean) obj).booleanValue());
        } else if ("renderAccelerate".equals(key)) {
            this.f15076f.mo34037a("renderAccelerate", obj);
        } else if ("firstRenderNotAccelerate".equals(key)) {
            this.f15076f.mo34037a("firstRenderNotAccelerate", obj);
        } else if ("enable_statistics".equals(key)) {
            this.f15076f.mo34037a("enable_statistics", obj);
        } else if ("attachment_type_support".equals(key)) {
            this.f15076f.mo34037a("attachment_type_support", obj);
        } else if ("resourceIntercept".equals(key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if ("ip_proxy".equals(key)) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2) && !str2.startsWith("http")) {
                str2 = "http://" + str2;
            }
            this.f15076f.mo34037a(key, str2);
            this.f15091u.setSummary(str2);
            this.f15087q.setChecked(false);
            this.f15076f.mo34037a("renderAccelerate", false);
            this.f15094x.setChecked(false);
            this.f15076f.mo34037a("resourceIntercept", Boolean.FALSE);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed(new Runnable() {
                /* class com.bytedance.ee.bear.debug.$$Lambda$d$qC4FPQ_opuHAbi12nAd8IxtOsc */

                public final void run() {
                    C5261d.this.m21566n();
                }
            }, 1000);
        } else if ("offline_res_version".equals(key)) {
            this.f15076f.mo34037a(key, obj);
            this.f15089s.setSummary((CharSequence) obj);
            this.f15066H.mo21165a((String) obj);
        } else if ("folder_token".equals(key)) {
            this.f15076f.mo34037a(key, obj);
            this.f15090t.setSummary((CharSequence) obj);
        } else if ("http_request_id".equals(key)) {
            this.f15076f.mo34037a(key, obj);
            this.f15093w.setSummary((CharSequence) obj);
        } else if ("doc_rn_enabled".equals(key)) {
            C13479a.m54772d("GeneralDebugInfo", "GeneralDebugInfo.onPreferenceChange: 135 " + obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            this.f15076f.mo34037a("doc_rn_enabled", obj);
        } else if (TextUtils.equals("offline_encrypt", key)) {
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            this.f15076f.mo34037a("offline_encrypt", obj);
        } else if (TextUtils.equals("appDebugConfig", key)) {
            this.f15076f.mo34037a("isDebug", obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("enableFrontendEtTest", key)) {
            this.f15076f.mo34037a("enable_frontend_et_test", obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("syncDocs", key)) {
            this.f15076f.mo34037a("syncDocs", obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("database_encrypt", key)) {
            this.f15076f.mo34037a("database_encrypt", obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("test_switch", key)) {
            Boolean bool = (Boolean) obj;
            C5087ae.f14801a = bool;
            if (bool.booleanValue()) {
                if (this.f15085o == null) {
                    this.f15085o = new DocAutoTestImpl((Context) this.f15013b.get(), this.f15080j, this.f15081k, this.f15062D, this.f15064F, this.f15065G, this.f15073c, this.f15061C);
                }
                this.f15085o.start();
                ((Activity) this.f15013b.get()).getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
            } else {
                IDocAutoTest dVar = this.f15085o;
                if (dVar != null) {
                    dVar.stop();
                }
                ((Activity) this.f15013b.get()).getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
            }
        } else if ("doc_types".equals(key)) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) preference;
            CharSequence[] entries = multiSelectListPreference.getEntries();
            ArrayList arrayList = new ArrayList();
            for (String str3 : (Set) obj) {
                int findIndexOfValue = multiSelectListPreference.findIndexOfValue(str3);
                C13479a.m54772d("TAG2", str3 + ((Object) entries[findIndexOfValue]));
                arrayList.add(entries[findIndexOfValue].toString());
            }
            this.f15085o.setWhiteList(arrayList);
            multiSelectListPreference.setSummary(arrayList.toString());
        } else if (TextUtils.equals("wiki_test_switch", key)) {
            Boolean bool2 = (Boolean) obj;
            C5087ae.f14801a = bool2;
            if (bool2.booleanValue()) {
                if (this.f15086p == null) {
                    this.f15086p = new DocAutoTestImpl((Context) this.f15013b.get(), this.f15080j, this.f15081k, this.f15062D, this.f15064F, this.f15065G, this.f15073c, this.f15061C);
                }
                this.f15086p.start();
                ((Activity) this.f15013b.get()).getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
            } else {
                IDocAutoTest dVar2 = this.f15086p;
                if (dVar2 != null) {
                    dVar2.stop();
                }
                ((Activity) this.f15013b.get()).getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
            }
        } else if (TextUtils.equals("offline_support_change_resource", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("rn_preload", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("domain_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("ttwebview_enable", key)) {
            this.f15076f.mo34037a(key, obj);
            if (obj == Boolean.FALSE && this.f15059A.isChecked()) {
                this.f15059A.setChecked(false);
            }
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("ttwebview_m62_enable", key)) {
            this.f15076f.mo34037a(key, obj);
            if (obj == Boolean.TRUE && !this.f15096z.isChecked()) {
                this.f15096z.setChecked(true);
            }
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("docs_preload_class", key)) {
            this.f15076f.mo34037a(key, obj);
            if (obj == Boolean.FALSE && this.f15060B.isChecked()) {
                this.f15060B.setChecked(false);
            }
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("ocr_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("rust_net_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("font_download_hint_enable", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$n79O20pTNsQytKlaT0rGd5UYfok.INSTANCE, 1000);
        } else if (TextUtils.equals("mem_usage_analytic_for_auto_test_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if ("ip_proxy_rust".equals(key)) {
            String str4 = (String) obj;
            if (!TextUtils.isEmpty(str4) && !str4.startsWith("http")) {
                str4 = "http://" + str4;
            }
            this.f15076f.mo34037a(key, str4);
            this.f15092v.setSummary(str4);
        } else if (TextUtils.equals("replace_base_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("lark_docs_newer_guide_switch", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("rn_doze", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("tt_video_log_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("global_onboarding_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("global_onboarding_native_only_enable", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("wikitree_collab_enable", key) || TextUtils.equals("initGecko", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$m1IpkUnXeUsxZPUHuIrTJ1pz61g.INSTANCE, 1000);
        } else if (TextUtils.equals("wikitree_show_areaId", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("wikitree_show_status", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("offline_auto_download_full_res", key)) {
            this.f15076f.mo34037a(key, obj);
        } else if (TextUtils.equals("template_v4_ab_test", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$cGHsvu8Re8g9PPn2ATgGVcCcsI.INSTANCE, 1000);
        } else if (TextUtils.equals("header_append_params_enable", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("admin_permission_mock", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$9uvIyWdQGXRJq8mMurOoKMZZk0w.INSTANCE, 1000);
        } else if (TextUtils.equals("watermark_enable", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("sheet_preload_template", key) || TextUtils.equals("sheet_template", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("sensitive_log_enable", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
            new Handler().postDelayed($$Lambda$d$xqoe7A5BLth1lLGMT3fnpfu84.INSTANCE, 1000);
        } else if (TextUtils.equals("net_interceptable", key)) {
            this.f15076f.mo34037a(key, obj);
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        } else if (TextUtils.equals("bug_tool_enable", key)) {
            if (m21526a((Context) this.f15013b.get(), ((Boolean) obj).booleanValue())) {
                this.f15076f.mo34037a(key, obj);
            } else {
                ((CheckBoxPreference) preference).setChecked(false);
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo21204a(Context context) {
        File parentFile = context.getFilesDir().getParentFile();
        File file = new File("/sdcard/Docs");
        if (file.exists()) {
            try {
                C13675f.m55498a(file);
            } catch (IOException e) {
                C13479a.m54761a("GeneralDebugInfo", e);
            }
        }
        file.mkdirs();
        try {
            C13675f.m55499a(parentFile, file);
            return true;
        } catch (IOException e2) {
            C13479a.m54761a("GeneralDebugInfo", e2);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m21561i() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m21562j() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m21563k() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m21564l() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m21565m() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m21567o() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m21568p() {
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m21569q() {
        Process.killProcess(Process.myPid());
    }

    /* renamed from: f */
    private boolean m21553f() {
        try {
            if (Class.forName("com.github.moduth.blockcanary.BlockCanary") != null) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            C13479a.m54761a("GeneralDebugInfo", e);
            return false;
        }
    }

    /* renamed from: g */
    private void m21556g() {
        new ak(this.f15074d, this.f15063E);
        DocBridgeWebViewV2 b = ak.m22924b();
        if (b != null && Build.VERSION.SDK_INT >= 19) {
            b.evaluateJavascript("window.scm", new ValueCallback<String>() {
                /* class com.bytedance.ee.bear.debug.C5261d.C52684 */

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    if (str != null && !TextUtils.isEmpty(str)) {
                        C13479a.m54758a("GeneralDebugInfo", "onReceiveValue:" + str);
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            String optString = jSONObject.optString("branch");
                            String optString2 = jSONObject.optString(ShareHitPoint.f121869d);
                            String optString3 = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                            String optString4 = jSONObject.optString("isSlimBundle", "null");
                            StringBuilder sb = new StringBuilder();
                            sb.append("version:\t");
                            if (TextUtils.isEmpty(optString3)) {
                                optString3 = "";
                            }
                            sb.append(optString3);
                            sb.append("\n");
                            sb.append("slimBundle:\t");
                            sb.append(optString4);
                            sb.append("\n");
                            sb.append("branch:\t");
                            if (TextUtils.isEmpty(optString)) {
                                optString = "";
                            }
                            sb.append(optString);
                            sb.append("\n");
                            sb.append("type:\t");
                            if (TextUtils.isEmpty(optString2)) {
                                optString2 = "";
                            }
                            sb.append(optString2);
                            C5261d.this.f15075e.setSummary(sb.toString());
                        } catch (JSONException e) {
                            C13479a.m54761a("GeneralDebugInfo", e);
                            C5261d.this.f15075e.setSummary("");
                        }
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private String m21546e() {
        String a = m21518a("FLAVOR_server");
        String a2 = m21518a("FLAVOR_login");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
            return null;
        }
        return a + "-" + a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m21566n() {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f15012a.getContext().getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: d */
    private String m21542d() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("versionName: ");
        stringBuffer.append(this.f15073c.mo17364n());
        stringBuffer.append("\n");
        stringBuffer.append("versionCode: ");
        stringBuffer.append(this.f15073c.mo17365o());
        stringBuffer.append("\n");
        stringBuffer.append("buildNumber: ");
        stringBuffer.append(37916021);
        stringBuffer.append("\n");
        stringBuffer.append("branch: ");
        stringBuffer.append("v/5.2.0");
        stringBuffer.append("\n");
        stringBuffer.append("flavor: ");
        stringBuffer.append(m21546e());
        stringBuffer.append("\n");
        stringBuffer.append("httpChannel: ");
        stringBuffer.append(C12617b.m52367d().toString());
        return stringBuffer.toString();
    }

    /* renamed from: h */
    private void m21559h() {
        File file = new File(C13615c.f35773a.getFilesDir().getAbsolutePath() + File.separator + "drive");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isFile()) {
                    listFiles[i].delete();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo21206c() {
        if (!TextUtils.equals(this.f15077g, (CharSequence) this.f15076f.mo34038b("login", "input"))) {
            an anVar = this.f15061C;
            if (anVar != null) {
                anVar.mo16407e().mo238001b(new Consumer<Boolean>() {
                    /* class com.bytedance.ee.bear.debug.C5261d.C52662 */

                    /* renamed from: a */
                    public void accept(Boolean bool) throws Exception {
                        C13479a.m54772d("GeneralDebugInfo", "accept: login result = " + bool);
                    }
                }, new Consumer<Throwable>() {
                    /* class com.bytedance.ee.bear.debug.C5261d.C52673 */

                    /* renamed from: a */
                    public void accept(Throwable th) throws Exception {
                        C13479a.m54773d("GeneralDebugInfo", "accept: login error", th);
                    }
                });
            }
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        }
        if (!TextUtils.equals(this.f15078h, (CharSequence) this.f15076f.mo34038b("server", "publish"))) {
            Toast.showSuccessText((Context) this.f15013b.get(), ((Activity) this.f15013b.get()).getString(R.string.Doc_Debug_RestartApp), 1);
        }
        IDocAutoTest dVar = this.f15085o;
        if (dVar != null) {
            dVar.stop();
            this.f15085o = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Boolean m21541d(Boolean bool) throws Exception {
        m21559h();
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Boolean m21551f(Boolean bool) throws Exception {
        m21559h();
        return bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC70020b m21529b(String str) throws Exception {
        return ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19645a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m21540c(Preference preference) {
        System.gc();
        Toast.showSuccessText(this.f15074d, "触发执行了一次回收，但系统不一定会立马回收，需要等待以及多执行几次 ", 0);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21521a(Boolean bool) throws Exception {
        String str;
        Context context = this.f15074d;
        if (bool.booleanValue()) {
            str = "clean finish";
        } else {
            str = "clean fail";
        }
        Toast.showSuccessText(context, str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21530b(Boolean bool) throws Exception {
        String str;
        Context context = this.f15074d;
        if (bool.booleanValue()) {
            str = "clean finish";
        } else {
            str = "clean fail";
        }
        Toast.showSuccessText(context, str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC70020b m21536c(String str) throws Exception {
        return ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19647a(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m21547e(Boolean bool) throws Exception {
        String str;
        Context context = this.f15074d;
        if (bool.booleanValue()) {
            str = "clean finish";
        } else {
            str = "clean fail";
        }
        Toast.showSuccessText(context, str, 0);
    }

    /* renamed from: a */
    private String m21518a(String str) {
        Field field;
        try {
            Class<?> cls = Class.forName("com.bytedance.ee.bear.BuildConfig");
            if (!(cls == null || (field = cls.getField(str)) == null)) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (obj != null && (obj instanceof String)) {
                    return (String) obj;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            C13479a.m54774d("GeneralDebugInfo", e);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21531b(Long l) throws Exception {
        Context context = this.f15074d;
        Toast.showSuccessText(context, "drive cleanable cache size: " + l, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21537c(Boolean bool) throws Exception {
        String str;
        Context context = this.f15074d;
        if (bool.booleanValue()) {
            str = "clean finish";
        } else {
            str = "clean fail";
        }
        Toast.showSuccessText(context, str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m21545d(Preference preference) {
        this.f15063E.mo41508c(AbstractC5094ag.class).mo238014c($$Lambda$d$MCVjfYj0_QwRynlQKOhLjLYLBg.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$P6tPJ7VO5_3F3k5QjcyI279dsWU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5261d.this.m21530b((C5261d) ((Boolean) obj));
            }
        }, $$Lambda$d$QkNMt944IEfsnA96KR7iKd4qIj8.INSTANCE);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ boolean m21555f(Preference preference) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c((Function) null).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$_8tnQ6yW1qb0ecm9lLHgNVy_Yw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5261d.this.m21531b((C5261d) ((Long) obj));
            }
        }, $$Lambda$d$ZuLwi4rPGWTmCHURm3CUWVgHLeg.INSTANCE);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ boolean m21560h(Preference preference) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c($$Lambda$d$lnDb_8CNcrQa9OgSb3qBxifVUjA.INSTANCE).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$NROsr7oGpznczpzPV_rk2Hv7jEk */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5261d.this.m21551f((Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$ID8rmdWhhdiDteTt1y6svGK32c */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5261d.this.m21547e((C5261d) ((Boolean) obj));
            }
        }, $$Lambda$d$U_UtCmekxYHLKDOQH73C7g6C20U.INSTANCE);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21522a(Long l) throws Exception {
        Context context = this.f15074d;
        Toast.showSuccessText(context, "doc cache size: " + l, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ boolean m21558g(Preference preference) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238014c($$Lambda$d$j5gBpPpa7nflQzekx7tAxLd2P8.INSTANCE).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$kHvZTlPFQqa5u0iKvd42o4YMeqM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5261d.this.m21541d((Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$MNOJLLAs5yKQBLG2WkcENoTrQU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5261d.this.m21537c((C5261d) ((Boolean) obj));
            }
        }, $$Lambda$d$ex2040pMOsTLpA86sZvDUkFOpow.INSTANCE);
        return true;
    }

    /* renamed from: b */
    private boolean m21533b(Context context) {
        try {
            C13675f.m55513b(new File(new File(context.getFilesDir().getAbsolutePath(), "font").getAbsolutePath()));
            context.getSharedPreferences("docs_slide_font", 0).edit().clear().commit();
            return true;
        } catch (Exception e) {
            C13479a.m54761a("GeneralDebugInfo", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m21550e(Preference preference) {
        this.f15063E.mo41508c(AbstractC5094ag.class).mo238014c($$Lambda$d$QUyGqTB4sbtvdNVU600Ir5X2qA.INSTANCE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$MKDp7S1ak_RHUXxa7M3ZMMbh9g */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5261d.this.m21522a((C5261d) ((Long) obj));
            }
        }, $$Lambda$d$SqDi6gx7Tc9TYA_tXapUxcZ32wA.INSTANCE);
        return true;
    }

    /* renamed from: a */
    private void m21524a(boolean z) {
        String str;
        try {
            Class<?> cls = Class.forName("com.github.moduth.blockcanary.BlockCanary");
            Object invoke = cls.getMethod("get", new Class[0]).invoke(cls, new Object[0]);
            if (z) {
                str = "start";
            } else {
                str = "stop";
            }
            cls.getMethod(str, new Class[0]).invoke(invoke, new Object[0]);
        } catch (ClassNotFoundException e) {
            C13479a.m54761a("GeneralDebugInfo", e);
        } catch (NoSuchMethodException e2) {
            C13479a.m54761a("GeneralDebugInfo", e2);
        } catch (IllegalAccessException e3) {
            C13479a.m54761a("GeneralDebugInfo", e3);
        } catch (InvocationTargetException e4) {
            C13479a.m54761a("GeneralDebugInfo", e4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m21535b(Preference preference) {
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19650a((Bundle) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21520a(Context context, AbstractC68323g gVar) throws Exception {
        gVar.onNext(Boolean.valueOf(m21533b(context)));
        gVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ boolean m21554f(Context context, Preference preference) {
        if (!this.f15067I) {
            return true;
        }
        context.startActivity(new Intent(context, FGPreviewActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m21544d(Context context, Preference preference) {
        if (!this.f15067I) {
            return true;
        }
        Intent intent = new Intent(context, AppendParamsActivity.class);
        intent.putExtra("key_title", "在网络请求Header中添加参数");
        intent.putExtra("key_sp_name", "header_append_params_sp_name");
        context.startActivity(intent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ boolean m21557g(Context context, Preference preference) {
        AbstractC68307f.m265080a(new AbstractC68324h(context) {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$L_mn1ZYV0d0s7P8SofrdSoGSHA */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.AbstractC68324h
            public final void subscribe(AbstractC68323g gVar) {
                C5261d.this.m21520a((C5261d) this.f$1, (Context) gVar);
            }
        }, BackpressureStrategy.ERROR).mo237985a(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.debug.$$Lambda$d$MTscZAOBU2EG9Zgwq0S_pawkPvI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5261d.this.m21521a((C5261d) ((Boolean) obj));
            }
        }, $$Lambda$d$KgPYfTCqsB5LFC_60OvwwoX7Ilc.INSTANCE);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m21539c(Context context, Preference preference) {
        if (!this.f15067I) {
            return true;
        }
        new PersistenceSharedPreference("moreNewItems").edit().clear().apply();
        Toast.showSuccessText(context, "清除成功");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m21549e(Context context, Preference preference) {
        if (!this.f15067I) {
            return true;
        }
        Intent intent = new Intent(context, AppendParamsActivity.class);
        intent.putExtra("key_sp_name", "mock_fg");
        intent.putExtra("key_title", "Mock FG");
        intent.putExtra("key_success_toast", "保存成功，配置将在重启后生效");
        context.startActivity(intent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m21534b(Context context, Preference preference) {
        if (!this.f15067I) {
            return true;
        }
        context.startActivity(new Intent(context, RequestActivity.class));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m21525a(Context context, Preference preference) {
        if (!this.f15067I) {
            return true;
        }
        if (C13595b.m55176a()) {
            context.startActivity(new Intent(context, RequestActivity.class));
            return true;
        }
        context.startActivity(new Intent(context, RequestActivityP0.class));
        return true;
    }

    /* renamed from: a */
    private boolean m21526a(Context context, boolean z) {
        if (!z) {
            context.stopService(new Intent(context, FloatWindowService.class));
            return true;
        } else if (Build.VERSION.SDK_INT < 23 || !Settings.canDrawOverlays(context)) {
            context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())));
            return false;
        } else {
            context.startService(new Intent(context, FloatWindowService.class));
            return true;
        }
    }

    public C5261d(PreferenceScreen preferenceScreen, Activity activity, C10917c cVar) {
        super(preferenceScreen, activity);
        this.f15063E = cVar;
        this.f15074d = activity.getApplicationContext();
        this.f15065G = (AbstractC7184l) cVar.mo41507b(AbstractC7184l.class).mo238017c();
        this.f15066H = new C5251a(activity);
    }
}

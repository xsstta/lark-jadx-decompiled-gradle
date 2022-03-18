package com.ss.android.lark.mail.impl.search;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.SearchRet;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.SearchMessageListIntentInfo;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42311s;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42312t;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42316u;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.search.C43238a;
import com.ss.android.lark.mail.impl.search.view.C43263d;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43977b;
import com.ss.android.lark.mail.impl.view.undo.UndoBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseMailFragmentActivity implements C43238a.AbstractC43251a, C43263d.AbstractC43273a, AbstractC43317d, AbstractC43328o {

    /* renamed from: a */
    public C43263d f109993a;

    /* renamed from: b */
    public C43238a f109994b;

    /* renamed from: c */
    public String f109995c;

    /* renamed from: d */
    public final String f109996d = (System.currentTimeMillis() + "_" + hashCode());

    /* renamed from: e */
    private final String f109997e = "SearchActivity";

    /* renamed from: f */
    private Bitmap f109998f;

    /* renamed from: g */
    private int f109999g;

    /* renamed from: a */
    public Context mo154801a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo154802a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o
    public void ah() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m171798a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m171796a(this, configuration);
    }

    public AssetManager getAssets() {
        return m171800c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m171797a(this);
    }

    /* renamed from: l */
    public Resources mo154820l() {
        return super.getResources();
    }

    /* renamed from: m */
    public void mo154821m() {
        super.onStop();
    }

    /* renamed from: n */
    public AssetManager mo154822n() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m171799b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107401d;
    }

    /* renamed from: o */
    private AbstractC42870h m171801o() {
        return new AbstractC42870h() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.C432357 */

            @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h
            /* renamed from: a */
            public ViewGroup mo152909a() {
                return (ViewGroup) SearchActivity.this.f109993a.mo154877b();
            }
        };
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    /* renamed from: p */
    private void m171802p() {
        C43383h.m172311a().mo155145a("SearchActivity", new C43383h.AbstractC43386b() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.C432303 */

            @Override // com.ss.android.lark.mail.impl.service.C43383h.AbstractC43386b
            /* renamed from: a */
            public void mo152948a(AbstractC43977b bVar) {
                if (bVar != null) {
                    SearchActivity searchActivity = SearchActivity.this;
                    bVar.mo156448a(new UndoBar.C43971a(searchActivity, searchActivity).mo156501a(true), new Runnable() {
                        /* class com.ss.android.lark.mail.impl.search.SearchActivity.C432303.RunnableC432311 */

                        public void run() {
                            if (!TextUtils.isEmpty(SearchActivity.this.f109995c)) {
                                SearchActivity.this.mo154812d(SearchActivity.this.f109995c);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: f */
    public void mo154813f() {
        Log.m165389i("SearchActivity", "onEnterAnimationEnd");
        this.f109994b.mo154835a();
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: g */
    public void mo154814g() {
        Log.m165389i("SearchActivity", "onExitAnimationEnd");
        finish();
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: h */
    public void mo154816h() {
        Log.m165389i("SearchActivity", "onStartScroll");
        this.f109993a.mo154881d();
    }

    @Override // com.ss.android.lark.mail.impl.search.C43238a.AbstractC43251a
    /* renamed from: j */
    public void mo154818j() {
        Log.m165389i("SearchActivity", "onSearchHistoryFetched");
        runOnUiThread(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.AnonymousClass12 */

            public void run() {
                SearchActivity.this.f109993a.mo154876a((List<MailThread>) SearchActivity.this.f109994b.mo154842c(), SearchActivity.this.f109994b.mo154843d(), false);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.search.C43238a.AbstractC43251a
    /* renamed from: k */
    public void mo154819k() {
        Log.m165389i("SearchActivity", "onSearchError");
        runOnUiThread(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.RunnableC432292 */

            public void run() {
                SearchActivity.this.f109993a.mo154876a((List<MailThread>) SearchActivity.this.f109994b.mo154842c(), SearchActivity.this.f109994b.mo154843d(), true);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.search.C43238a.AbstractC43251a
    /* renamed from: i */
    public void mo154817i() {
        Log.m165389i("SearchActivity", "onNewResultListGenerated");
        C42187a.m168525e(this.f109994b.mo154844e());
        runOnUiThread(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.AnonymousClass10 */

            public void run() {
                SearchActivity.this.f109993a.mo154880c();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        Log.m165389i("SearchActivity", "onDestroy");
        C43383h.m172311a().mo155144a("SearchActivity");
        Watchers.m167209b(this);
        this.f109993a.mo154884g();
        C42330c.f107632a = false;
        super.onDestroy();
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: d */
    public void mo154811d() {
        int i;
        Log.m165389i("SearchActivity", "onCancelButtonClick");
        this.f109993a.mo154881d();
        this.f109993a.mo154878b(this.f109998f, this.f109999g);
        String f = this.f109993a.mo154883f();
        String str = this.f109996d;
        String str2 = C42330c.C42334c.f107682i;
        if (f == null) {
            i = 0;
        } else {
            i = f.length();
        }
        C42330c.m169052a(str, str2, i, f, null, null, null, null, null);
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: e */
    public void mo150716e() {
        Log.m165389i("SearchActivity", "onClearSearchHistoryButtonClick");
        new C25639g(this).mo89254m(R.string.Mail_Alert_ClearSearchHistory).mo89224a(R.id.lkui_dialog_btn_left, R.string.Mail_Alert_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.DialogInterface$OnClickListenerC432335 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Mail_AdvancedSearch_Deletehistory, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.DialogInterface$OnClickListenerC432281 */

            public void onClick(DialogInterface dialogInterface, int i) {
                SearchActivity.this.f109994b.mo154840b();
            }
        }).mo89239c();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        int i;
        Log.m165389i("SearchActivity", "onBackPressed");
        if ((!C42871i.m170779b() || !C42871i.m170775a().mo153853a(m171801o(), this)) && !this.f109993a.mo154888k()) {
            this.f109993a.mo154881d();
            this.f109993a.mo154878b(this.f109998f, this.f109999g);
            ((C42311s) C42344d.m169091a(C42311s.class, this)).mo152316a();
            String f = this.f109993a.mo154883f();
            String str = this.f109996d;
            String str2 = C42330c.C42334c.f107682i;
            if (f == null) {
                i = 0;
            } else {
                i = f.length();
            }
            C42330c.m169052a(str, str2, i, f, null, null, null, null, null);
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o
    /* renamed from: c */
    public void mo154549c(List<String> list) {
        this.f109994b.mo154839a(list);
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: d */
    public void mo154812d(String str) {
        this.f109994b.mo154838a(str, false);
    }

    @Override // com.ss.android.lark.mail.impl.search.C43238a.AbstractC43251a
    /* renamed from: b */
    public void mo154808b(final List<String> list) {
        Log.m165389i("SearchActivity", "onSearchHistoryFetched");
        runOnUiThread(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.AnonymousClass11 */

            public void run() {
                SearchActivity.this.f109993a.mo154876a((List<MailThread>) SearchActivity.this.f109994b.mo154842c(), list, false);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: c */
    public void mo154809c(String str) {
        Log.m165389i("SearchActivity", "onLoadMoreResult");
        this.f109994b.mo154838a(str, true);
    }

    /* renamed from: a */
    public static Resources m171797a(SearchActivity searchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
        return searchActivity.mo154820l();
    }

    /* renamed from: c */
    public static AssetManager m171800c(SearchActivity searchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
        return searchActivity.mo154822n();
    }

    /* renamed from: b */
    public static void m171799b(SearchActivity searchActivity) {
        searchActivity.mo154821m();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchActivity searchActivity2 = searchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: b */
    public void mo154807b(String str) {
        int i;
        Log.m165389i("SearchActivity", "onHistoryKeywordSelected");
        this.f109993a.mo154879b(str);
        this.f109993a.mo154881d();
        String str2 = this.f109996d;
        String str3 = C42330c.C42334c.f107677d;
        if (str == null) {
            i = 0;
        } else {
            i = str.length();
        }
        C42330c.m169052a(str2, str3, i, str, null, null, null, null, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109994b = new C43238a(this, this, this.f109996d);
        C43263d dVar = new C43263d(this, this);
        this.f109993a = dVar;
        setContentView(dVar.mo154877b());
        Object a = al.m95028a().mo93365a("searchAnimationBitmap");
        if (a == null || !(a instanceof Bitmap)) {
            this.f109993a.mo154882e();
            this.f109994b.mo154835a();
        } else {
            this.f109998f = (Bitmap) a;
            int intExtra = getIntent().getIntExtra("searchAnimationBitmapHeight", 0);
            this.f109999g = intExtra;
            this.f109993a.mo154875a(this.f109998f, intExtra);
        }
        Watchers.m167206a(this);
        m171802p();
        C42330c.f107632a = true;
        C42330c.m169081g(this.f109996d);
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: a */
    public void mo154803a(String str) {
        Log.m165389i("SearchActivity", "onSearchInputChanged");
        if (TextUtils.isEmpty(str)) {
            this.f109994b.mo154835a();
            return;
        }
        this.f109995c = str;
        this.f109994b.mo154838a(str, false);
    }

    @Override // com.ss.android.lark.mail.impl.search.C43238a.AbstractC43251a
    /* renamed from: a */
    public void mo154805a(final List<MailThread> list) {
        Log.m165389i("SearchActivity", "onSearchResultChanged");
        runOnUiThread(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.RunnableC432379 */

            public void run() {
                SearchActivity.this.f109993a.mo154876a(list, SearchActivity.this.f109994b.mo154843d(), false);
            }
        });
    }

    /* renamed from: a */
    public static void m171798a(SearchActivity searchActivity, Context context) {
        searchActivity.mo154802a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
    }

    /* renamed from: a */
    public static Context m171796a(SearchActivity searchActivity, Configuration configuration) {
        Context a = searchActivity.mo154801a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d
    /* renamed from: a */
    public void mo152676a(final MailLabelEntity mailLabelEntity, final boolean z) {
        Log.m165389i("SearchActivity", "onLabelPropertyChange");
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.RunnableC432324 */

            public void run() {
                SearchActivity.this.f109994b.mo154836a(mailLabelEntity, z);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.search.C43238a.AbstractC43251a
    /* renamed from: a */
    public void mo154806a(final List<MailThread> list, final Boolean bool) {
        Log.m165389i("SearchActivity", "onSearchResultChanged");
        runOnUiThread(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.SearchActivity.RunnableC432368 */

            public void run() {
                SearchActivity.this.f109993a.mo154876a(list, SearchActivity.this.f109994b.mo154843d(), false);
                if (bool.booleanValue()) {
                    ((C42316u) C42344d.m169091a(C42316u.class, SearchActivity.this)).mo152372a((String) null, -1);
                } else {
                    ((C42312t) C42344d.m169091a(C42312t.class, SearchActivity.this)).mo152372a((String) null, -1);
                }
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43263d.AbstractC43273a
    /* renamed from: a */
    public void mo154804a(final String str, final MailThread mailThread, final int i) {
        int i2;
        String str2;
        boolean z = mailThread instanceof SearchRet;
        if (z) {
            CoreThreadPool.getDefault().getScheduleThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.mail.impl.search.SearchActivity.RunnableC432346 */

                public void run() {
                    String str;
                    String str2;
                    int i;
                    SearchRet searchRet = (SearchRet) mailThread;
                    ArrayList arrayList = new ArrayList();
                    String str3 = null;
                    if (searchRet.mo151752D() == null) {
                        str = null;
                    } else {
                        str = searchRet.mo151752D().toString();
                    }
                    arrayList.add(str);
                    if (searchRet.mo151753E() == null) {
                        str2 = null;
                    } else {
                        str2 = searchRet.mo151753E().toString();
                    }
                    arrayList.add(str2);
                    if (searchRet.mo151751C() != null) {
                        str3 = searchRet.mo151751C().toString();
                    }
                    arrayList.add(str3);
                    String str4 = SearchActivity.this.f109996d;
                    String str5 = C42330c.C42334c.f107678e;
                    String str6 = str;
                    if (str6 == null) {
                        i = 0;
                    } else {
                        i = str6.length();
                    }
                    C42330c.m169052a(str4, str5, i, str, mailThread.mo151676a(), searchRet.mo151755G(), C42330c.m169038a(str, arrayList), Integer.valueOf(i + 1), searchRet.mo151759K());
                }
            });
        }
        Log.m165389i("SearchActivity", "onClearSearchHistoryButtonClick");
        this.f109994b.mo154837a(str);
        int i3 = 1;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < this.f109994b.mo154842c().size()) {
            MailThread mailThread2 = this.f109994b.mo154842c().get(i4);
            if (mailThread2 instanceof MailThread) {
                MailThread mailThread3 = mailThread2;
                if (mailThread3 instanceof SearchRet) {
                    str2 = ((SearchRet) mailThread3).mo151751C().toString();
                } else {
                    str2 = "";
                }
                SearchMessageListIntentInfo searchMessageListIntentInfo = new SearchMessageListIntentInfo("SEARCH", mailThread3.mo151676a(), "", i3, str, str2);
                searchMessageListIntentInfo.mo154048a(false);
                arrayList.add(searchMessageListIntentInfo);
            }
            i4++;
            i3 = 1;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= arrayList.size()) {
                i2 = 0;
                break;
            } else if (((SearchMessageListIntentInfo) arrayList.get(i5)).mo154050c().equals(mailThread.mo151676a())) {
                i2 = i5;
                break;
            } else {
                i5++;
            }
        }
        SearchRet.C42082a aVar = null;
        if (z) {
            aVar = ((SearchRet) mailThread).mo151759K();
        }
        C42699a.m170244a(this, arrayList, i2, m171801o(), "SEARCH", mailThread, this.f109996d, aVar);
        C42187a.m168480a(this.f109994b.mo154844e(), i + 1);
    }
}

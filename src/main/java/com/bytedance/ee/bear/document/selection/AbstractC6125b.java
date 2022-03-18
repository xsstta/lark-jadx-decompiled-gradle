package com.bytedance.ee.bear.document.selection;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.selection.b */
public abstract class AbstractC6125b {

    /* renamed from: f */
    private static String f17017f = "javascript:window.lark.biz.selection.clearSelectionExcludeCursor";

    /* renamed from: g */
    private static final String[] f17018g = {"com.ss.android.article.news", "com.ss.android.article.lite", "com.qihoo.browser", "com.netease.newsreader.activity", "com.UCMobile", "com.hipu.yidian", "com.sina.news", "com.tencent.mtt"};

    /* renamed from: a */
    protected WebView f17019a;

    /* renamed from: b */
    protected int f17020b;

    /* renamed from: c */
    protected String f17021c;

    /* renamed from: d */
    protected int f17022d;

    /* renamed from: e */
    protected LinkedHashMap<MenuItem, Intent> f17023e = new LinkedHashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo24701a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo24702a(ResolveInfo resolveInfo);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo24705a(Intent intent);

    /* renamed from: a */
    public Boolean mo24703a(MenuItem menuItem) {
        C13479a.m54772d(this.f17021c, "jsClearSelectionExcludeCursor");
        C11755a.m48724a(this.f17019a, f17017f);
        return Boolean.valueOf(mo24705a(this.f17023e.get(menuItem)));
    }

    /* renamed from: a */
    public void mo24704a(Menu menu) {
        boolean z = true;
        if (menu.size() <= 0 || menu.getItem(0).getGroupId() != 1) {
            this.f17023e.clear();
            PackageManager packageManager = this.f17019a.getContext().getPackageManager();
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.addFlags(268435456);
            if (m24679a(this.f17019a.getContext(), intent, packageManager).size() == 0) {
                z = false;
            }
            if (z) {
                this.f17023e.put(menu.add(this.f17020b, 0, this.f17022d, R.string.lkui_navigation_search), intent);
                return;
            }
            List<ResolveInfo> a = m24679a(this.f17019a.getContext(), mo24701a(), packageManager);
            if (!C4511g.m18594d().mo17343D()) {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < a.size(); i++) {
                    hashMap.put(a.get(i).activityInfo.packageName, Integer.valueOf(i));
                }
                for (String str : f17018g) {
                    Integer num = (Integer) hashMap.get(str);
                    if (num != null) {
                        m24680a(menu, a.get(num.intValue()), num.intValue(), packageManager);
                        return;
                    }
                }
            }
            if (a.size() != 0) {
                m24680a(menu, a.get(0), 0, packageManager);
                return;
            }
            return;
        }
        C13479a.m54764b(this.f17021c, "group is hyper link, return");
    }

    /* renamed from: a */
    private boolean m24681a(ResolveInfo resolveInfo, Context context) {
        boolean z;
        if (!resolveInfo.activityInfo.exported) {
            return false;
        }
        if (resolveInfo.activityInfo.permission == null) {
            return true;
        }
        Boolean bool = true;
        if (Build.VERSION.SDK_INT >= 23) {
            if (context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        if (bool.booleanValue() || resolveInfo.activityInfo.permission == null) {
            return true;
        }
        return false;
    }

    AbstractC6125b(WebView webView, int i, String str) {
        this.f17019a = webView;
        this.f17020b = i;
        this.f17021c = str;
    }

    /* renamed from: a */
    private List<ResolveInfo> m24679a(Context context, Intent intent, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (m24681a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m24680a(Menu menu, ResolveInfo resolveInfo, int i, PackageManager packageManager) {
        this.f17023e.put(menu.add(this.f17020b, 0, this.f17022d + i, resolveInfo.loadLabel(packageManager)), mo24702a(resolveInfo));
    }
}

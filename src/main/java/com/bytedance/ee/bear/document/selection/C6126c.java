package com.bytedance.ee.bear.document.selection;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.util.common.C13606d;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.utils.C26326z;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.document.selection.c */
public class C6126c extends AbstractC6125b {

    /* renamed from: f */
    private static int f17024f = 100;

    /* renamed from: g */
    private String f17025g;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.selection.AbstractC6125b
    /* renamed from: a */
    public Intent mo24701a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    /* renamed from: a */
    private String m24687a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.replace("\\n", " ").trim();
        if (trim.length() > 1 && trim.charAt(0) == '\"' && trim.charAt(trim.length() - 1) == '\"') {
            return trim.substring(1, trim.length() - 1).trim();
        }
        return trim;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.selection.AbstractC6125b
    /* renamed from: a */
    public Intent mo24702a(ResolveInfo resolveInfo) {
        return mo24701a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true).addFlags(268435456).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.selection.AbstractC6125b
    /* renamed from: a */
    public boolean mo24705a(Intent intent) {
        String str;
        if (intent == null) {
            return false;
        }
        try {
            if (intent.getAction().equals("android.intent.action.WEB_SEARCH")) {
                str = SearchIntents.EXTRA_QUERY;
            } else {
                str = "android.intent.extra.PROCESS_TEXT";
            }
            intent.putExtra(str, this.f17025g);
            this.f17019a.getContext().startActivity(intent);
            return true;
        } catch (SecurityException e) {
            C13606d.m55245a("ProcessTextIntentItemManager", e);
            return false;
        }
    }

    C6126c(WebView webView, int i, String str) {
        super(webView, i, str);
        this.f17022d = f17024f;
    }

    /* renamed from: a */
    public void mo24706a(Menu menu, AbstractC5233x xVar, ActionMode actionMode) {
        if (actionMode != null) {
            this.f17019a.evaluateJavascript("(function(){return window.getSelection().toString()})()", new ValueCallback(menu, actionMode, xVar) {
                /* class com.bytedance.ee.bear.document.selection.$$Lambda$c$IJDo39IT7LQYYbvT4FewnnVI48s */
                public final /* synthetic */ Menu f$1;
                public final /* synthetic */ ActionMode f$2;
                public final /* synthetic */ AbstractC5233x f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    C6126c.lambda$IJDo39IT7LQYYbvT4FewnnVI48s(C6126c.this, this.f$1, this.f$2, this.f$3, (String) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24688a(Menu menu, ActionMode actionMode, AbstractC5233x xVar, String str) {
        String a = m24687a(str);
        this.f17025g = a;
        if (!TextUtils.isEmpty(a)) {
            mo24704a(menu);
            if (C26326z.m95340d()) {
                actionMode.invalidateContentRect();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("menu_item_total_num", Integer.valueOf(menu.size()));
            xVar.mo21079a("menu_item_total", hashMap);
        }
    }
}

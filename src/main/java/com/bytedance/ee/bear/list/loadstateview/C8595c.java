package com.bytedance.ee.bear.list.loadstateview;

import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.list.loadstateview.c */
public class C8595c {

    /* renamed from: a */
    private final LoadStateView f23327a;

    /* renamed from: b */
    private EmptyCategory f23328b;

    /* renamed from: c */
    private LoadingCategory f23329c;

    /* renamed from: d */
    private Map<String, Map<String, LoadStateView.C8571c>> f23330d;

    /* renamed from: e */
    private Map<String, LoadStateView.C8575g> f23331e;

    /* renamed from: f */
    private Map<String, LoadStateView.C8577i> f23332f;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33523c() {
        this.f23327a.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33516a() {
        LoadingCategory loadingCategory = this.f23329c;
        if (loadingCategory != null) {
            try {
                this.f23327a.mo33453a(this.f23332f.get(loadingCategory.getCategoryName()));
            } catch (Exception e) {
                C13479a.m54773d("load_state_view_module", "showLoadingView: You should init LoadStateView first.", e);
            }
        } else {
            C13479a.m54774d("load_state_view_module", new RuntimeException("You should init LoadStateView first. "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33522b() {
        EmptyCategory emptyCategory = this.f23328b;
        if (emptyCategory != null) {
            try {
                this.f23327a.mo33449a(emptyCategory.mo33442a(this.f23330d));
            } catch (Exception e) {
                C13479a.m54773d("load_state_view_module", "showEmptyView: You should init LoadStateView first.", e);
            }
        } else {
            C13479a.m54774d("load_state_view_module", new RuntimeException("You should init LoadStateView first. "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33524d() {
        try {
            if (this.f23332f == null) {
                this.f23332f = new HashMap();
                LoadingCategory[] values = LoadingCategory.values();
                for (LoadingCategory loadingCategory : values) {
                    String categoryName = loadingCategory.getCategoryName();
                    C13479a.m54764b("load_state_view_module", "loadViewConfig()...loadingCategoryName = " + categoryName);
                    LoadStateView.C8577i iVar = new LoadStateView.C8577i();
                    iVar.mo33479a(categoryName);
                    iVar.mo33478a(loadingCategory);
                    if (this.f23332f.get(categoryName) == null) {
                        this.f23332f.put(categoryName, iVar);
                    } else {
                        C13479a.m54758a("load_state_view_module", "LoadStateViewWrapperInternal.java.loadMimeTypes: loadingViewConfig has same module config");
                    }
                }
            }
            char c = 4;
            char c2 = 1;
            if (this.f23330d == null) {
                Properties properties = new Properties();
                properties.load(this.f23327a.getContext().getResources().openRawResource(R.raw.empty_view_config));
                this.f23330d = new HashMap();
                Enumeration keys = properties.keys();
                while (keys.hasMoreElements()) {
                    String str = (String) keys.nextElement();
                    String[] split = properties.getProperty(str).split(",");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String[] split2 = split[i].split("\\|");
                        LoadStateView.C8571c cVar = new LoadStateView.C8571c();
                        cVar.mo33458b(split2[c2].trim());
                        cVar.mo33459c(split2[2].trim());
                        cVar.mo33460d(split2[3].trim());
                        cVar.mo33461e(split2[c].trim());
                        cVar.mo33462f(split2[5].trim());
                        if (split2.length >= 7) {
                            cVar.mo33457a(split2[6].trim());
                        }
                        if (this.f23330d.get(str) == null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(split2[0].trim(), cVar);
                            this.f23330d.put(str, hashMap);
                        } else {
                            this.f23330d.get(str).put(split2[0].trim(), cVar);
                        }
                        i++;
                        c = 4;
                        c2 = 1;
                    }
                }
            }
            if (this.f23331e != null) {
                return true;
            }
            Properties properties2 = new Properties();
            properties2.load(this.f23327a.getContext().getResources().openRawResource(R.raw.loaded_fail_view_config));
            this.f23331e = new HashMap();
            Enumeration keys2 = properties2.keys();
            while (keys2.hasMoreElements()) {
                String str2 = (String) keys2.nextElement();
                String[] split3 = properties2.getProperty(str2).split("\\|");
                LoadStateView.C8575g gVar = new LoadStateView.C8575g();
                gVar.mo33469a(split3[0].trim());
                gVar.mo33470b(split3[1].trim());
                gVar.mo33471c(split3[2].trim());
                gVar.mo33472d(split3[3].trim());
                gVar.mo33473e(split3[4].trim());
                if (this.f23331e.get(str2) == null) {
                    this.f23331e.put(str2, gVar);
                } else {
                    C13479a.m54758a("load_state_view_module", "LoadStateViewWrapperInternal.java.loadMimeTypes: loadedFailViewConfig has same module config");
                }
            }
            return true;
        } catch (Exception e) {
            C13479a.m54759a("load_state_view_module", "Fail to load empty config raw file.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33517a(EmptyCategory emptyCategory) {
        this.f23328b = emptyCategory;
    }

    C8595c(LoadStateView loadStateView) {
        this.f23327a = loadStateView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33519a(LoadStateView.AbstractC8570b bVar) {
        this.f23327a.mo33448a(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33520a(LoadStateView.AbstractC8574f fVar) {
        this.f23327a.mo33451a(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33518a(LoadFailCategory loadFailCategory) {
        try {
            this.f23327a.mo33452a(this.f23331e.get(loadFailCategory.getmCategoryName()));
        } catch (Exception e) {
            C13479a.m54773d("load_state_view_module", "showLoadedFailView: You should init LoadStateView first.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33521a(LoadingCategory loadingCategory) {
        this.f23329c = loadingCategory;
    }
}

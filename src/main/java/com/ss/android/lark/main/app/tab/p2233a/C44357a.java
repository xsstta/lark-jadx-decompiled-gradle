package com.ss.android.lark.main.app.tab.p2233a;

import com.ss.android.lark.maincore.dto.TabAppInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.tab.a.a */
public class C44357a {

    /* renamed from: a */
    private List<TabAppInfo> f112504a;

    /* renamed from: b */
    private List<TabAppInfo> f112505b;

    /* renamed from: c */
    private List<TabAppInfo> f112506c;

    /* renamed from: d */
    private boolean f112507d;

    /* renamed from: b */
    public List<TabAppInfo> mo157546b() {
        return this.f112504a;
    }

    /* renamed from: c */
    public List<TabAppInfo> mo157548c() {
        return this.f112506c;
    }

    /* renamed from: d */
    public boolean mo157550d() {
        return this.f112507d;
    }

    /* renamed from: e */
    public List<TabAppInfo> mo157551e() {
        return this.f112505b;
    }

    /* renamed from: a */
    public boolean mo157545a() {
        List<TabAppInfo> list = this.f112504a;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List<TabAppInfo> list2 = this.f112506c;
        if (list2 == null || list2.isEmpty()) {
            return this.f112507d;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<TabAppInfo> list = this.f112504a;
        if (list != null && !list.isEmpty()) {
            sb.append("add:[");
            for (TabAppInfo tabAppInfo : this.f112504a) {
                sb.append(tabAppInfo.getKey());
                sb.append(" ");
            }
            sb.append("]");
        }
        List<TabAppInfo> list2 = this.f112506c;
        if (list2 != null && !list2.isEmpty()) {
            sb.append("missing:[");
            for (TabAppInfo tabAppInfo2 : this.f112506c) {
                sb.append(tabAppInfo2.getKey());
                sb.append(" ");
            }
            sb.append("]");
        }
        sb.append("orderUpdated:");
        sb.append(this.f112507d);
        List<TabAppInfo> list3 = this.f112505b;
        if (list3 != null && !list3.isEmpty()) {
            sb.append("navAdd:[");
            for (TabAppInfo tabAppInfo3 : this.f112505b) {
                sb.append(tabAppInfo3.getKey());
                sb.append(" ");
            }
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo157543a(List<TabAppInfo> list) {
        this.f112504a = list;
    }

    /* renamed from: a */
    public void mo157544a(boolean z) {
        this.f112507d = z;
    }

    /* renamed from: b */
    public void mo157547b(List<TabAppInfo> list) {
        this.f112506c = list;
    }

    /* renamed from: c */
    public void mo157549c(List<TabAppInfo> list) {
        this.f112505b = list;
    }
}

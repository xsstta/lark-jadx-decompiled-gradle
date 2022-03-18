package com.ss.android.lark.locationmessage.ui.navigation;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.locationmessage.ui.navigation.c */
public class C41637c {

    /* renamed from: a */
    private List<String> f105764a = new ArrayList();

    /* renamed from: b */
    private List<C41636b> f105765b = new ArrayList();

    /* renamed from: c */
    public List<String> mo149781c() {
        return new ArrayList(this.f105764a);
    }

    /* renamed from: a */
    public boolean mo149777a() {
        return !this.f105765b.isEmpty();
    }

    /* renamed from: b */
    public boolean mo149780b() {
        if (!mo149777a() || this.f105765b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo149779b(List<String> list) {
        this.f105764a = list;
    }

    /* renamed from: c */
    public void mo149782c(List<C41636b> list) {
        this.f105765b = list;
    }

    /* renamed from: a */
    public C41636b mo149776a(int i) {
        if (i >= this.f105765b.size()) {
            return null;
        }
        return this.f105765b.get(i);
    }

    /* renamed from: a */
    public String[] mo149778a(List<String> list) {
        return (String[]) list.toArray(new String[list.size()]);
    }
}

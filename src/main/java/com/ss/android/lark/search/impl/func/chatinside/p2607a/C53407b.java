package com.ss.android.lark.search.impl.func.chatinside.p2607a;

import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.a.b */
public class C53407b {

    /* renamed from: a */
    private long f132005a;

    /* renamed from: b */
    private String f132006b = "";

    /* renamed from: c */
    private boolean f132007c;

    /* renamed from: d */
    private String f132008d = "";

    /* renamed from: e */
    private final List<SearchBaseInfo> f132009e = new ArrayList();

    /* renamed from: d */
    public long mo182433d() {
        return this.f132005a;
    }

    /* renamed from: e */
    public List<SearchBaseInfo> mo182434e() {
        return this.f132009e;
    }

    /* renamed from: f */
    public String mo182435f() {
        return this.f132006b;
    }

    /* renamed from: g */
    public boolean mo182436g() {
        return this.f132007c;
    }

    /* renamed from: h */
    public String mo182437h() {
        return this.f132008d;
    }

    /* renamed from: a */
    public void mo182428a(long j) {
        this.f132005a = j;
    }

    /* renamed from: b */
    public void mo182431b(String str) {
        this.f132008d = str;
    }

    /* renamed from: a */
    public void mo182430a(boolean z) {
        this.f132007c = z;
    }

    /* renamed from: a */
    public void mo182429a(String str) {
        if (str == null) {
            this.f132006b = "";
        } else {
            this.f132006b = str;
        }
    }

    /* renamed from: b */
    public void mo182432b(List<SearchBaseInfo> list) {
        this.f132009e.clear();
        this.f132009e.addAll(list);
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import androidx.collection.C0513a;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C22066a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.c */
public final class C21740c {

    /* renamed from: a */
    private final Account f53050a;

    /* renamed from: b */
    private final Set<Scope> f53051b;

    /* renamed from: c */
    private final Set<Scope> f53052c;

    /* renamed from: d */
    private final Map<C21611a<?>, C21742b> f53053d;

    /* renamed from: e */
    private final int f53054e;

    /* renamed from: f */
    private final View f53055f;

    /* renamed from: g */
    private final String f53056g;

    /* renamed from: h */
    private final String f53057h;

    /* renamed from: i */
    private final C22066a f53058i;

    /* renamed from: j */
    private final boolean f53059j;

    /* renamed from: k */
    private Integer f53060k;

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public static final class C21742b {

        /* renamed from: a */
        public final Set<Scope> f53070a;
    }

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public static final class C21741a {

        /* renamed from: a */
        private Account f53061a;

        /* renamed from: b */
        private C0513a<Scope> f53062b;

        /* renamed from: c */
        private Map<C21611a<?>, C21742b> f53063c;

        /* renamed from: d */
        private int f53064d;

        /* renamed from: e */
        private View f53065e;

        /* renamed from: f */
        private String f53066f;

        /* renamed from: g */
        private String f53067g;

        /* renamed from: h */
        private C22066a f53068h = C22066a.f53669a;

        /* renamed from: i */
        private boolean f53069i;

        /* renamed from: a */
        public final C21741a mo73698a(Account account) {
            this.f53061a = account;
            return this;
        }

        /* renamed from: a */
        public final C21741a mo73700a(Collection<Scope> collection) {
            if (this.f53062b == null) {
                this.f53062b = new C0513a<>();
            }
            this.f53062b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C21741a mo73699a(String str) {
            this.f53066f = str;
            return this;
        }

        /* renamed from: b */
        public final C21741a mo73702b(String str) {
            this.f53067g = str;
            return this;
        }

        /* renamed from: a */
        public final C21740c mo73701a() {
            return new C21740c(this.f53061a, this.f53062b, this.f53063c, this.f53064d, this.f53065e, this.f53066f, this.f53067g, this.f53068h, this.f53069i);
        }
    }

    public C21740c(Account account, Set<Scope> set, Map<C21611a<?>, C21742b> map, int i, View view, String str, String str2, C22066a aVar, boolean z) {
        this.f53050a = account;
        Set<Scope> unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f53051b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f53053d = map;
        this.f53055f = view;
        this.f53054e = i;
        this.f53056g = str;
        this.f53057h = str2;
        this.f53058i = aVar;
        this.f53059j = z;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (C21742b bVar : map.values()) {
            hashSet.addAll(bVar.f53070a);
        }
        this.f53052c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public final String mo73685a() {
        Account account = this.f53050a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final Account mo73688b() {
        return this.f53050a;
    }

    /* renamed from: c */
    public final Account mo73689c() {
        Account account = this.f53050a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public final Set<Scope> mo73690d() {
        return this.f53051b;
    }

    /* renamed from: e */
    public final Set<Scope> mo73691e() {
        return this.f53052c;
    }

    /* renamed from: f */
    public final Map<C21611a<?>, C21742b> mo73692f() {
        return this.f53053d;
    }

    @Nullable
    /* renamed from: g */
    public final String mo73693g() {
        return this.f53056g;
    }

    @Nullable
    /* renamed from: h */
    public final String mo73694h() {
        return this.f53057h;
    }

    @Nullable
    /* renamed from: i */
    public final C22066a mo73695i() {
        return this.f53058i;
    }

    @Nullable
    /* renamed from: j */
    public final Integer mo73696j() {
        return this.f53060k;
    }

    /* renamed from: a */
    public final void mo73687a(Integer num) {
        this.f53060k = num;
    }

    /* renamed from: a */
    public final Set<Scope> mo73686a(C21611a<?> aVar) {
        C21742b bVar = this.f53053d.get(aVar);
        if (bVar == null || bVar.f53070a.isEmpty()) {
            return this.f53051b;
        }
        HashSet hashSet = new HashSet(this.f53051b);
        hashSet.addAll(bVar.f53070a);
        return hashSet;
    }

    /* renamed from: k */
    public final boolean mo73697k() {
        return this.f53059j;
    }
}

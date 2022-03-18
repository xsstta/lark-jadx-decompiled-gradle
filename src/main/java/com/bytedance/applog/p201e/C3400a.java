package com.bytedance.applog.p201e;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.applog.e.a */
public class C3400a extends AbstractC3403c {

    /* renamed from: a */
    public final AccountManager f10773a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, String> f10774b = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Account f10775d;

    public C3400a(Context context) {
        this.f10773a = AccountManager.get(context);
    }

    @Override // com.bytedance.applog.p201e.AbstractC3403c
    /* renamed from: a */
    public String mo13653a(String str) {
        Account account = this.f10775d;
        if (account == null) {
            return this.f10774b.get(str);
        }
        try {
            return this.f10773a.getUserData(account, str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.applog.p201e.AbstractC3403c
    /* renamed from: b */
    public void mo13656b(String str) {
        AccountManager accountManager;
        ConcurrentHashMap<String, String> concurrentHashMap = this.f10774b;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            this.f10774b.remove(str);
        }
        try {
            Account account = this.f10775d;
            if (!(account == null || (accountManager = this.f10773a) == null)) {
                accountManager.setUserData(account, str, null);
            }
        } catch (Exception unused) {
        }
        super.mo13656b(str);
    }

    /* renamed from: a */
    public void mo13654a(final Account account) {
        if (account != null) {
            this.f10775d = account;
            ConcurrentHashMap<String, String> concurrentHashMap = this.f10774b;
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                this.f10789c.post(new Runnable() {
                    /* class com.bytedance.applog.p201e.C3400a.RunnableC34011 */

                    public void run() {
                        try {
                            if (C3400a.this.f10774b != null && C3400a.this.f10774b.size() > 0) {
                                if (C3400a.this.f10773a != null) {
                                    for (Map.Entry<String, String> entry : C3400a.this.f10774b.entrySet()) {
                                        if (entry != null) {
                                            C3400a.this.f10773a.setUserData(account, entry.getKey(), entry.getValue());
                                        }
                                    }
                                    C3400a.this.f10774b.clear();
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.applog.p201e.AbstractC3403c
    /* renamed from: a */
    public void mo13655a(String str, String str2) {
        Account account = this.f10775d;
        if (account == null) {
            this.f10774b.put(str, str2);
        } else if (str != null && str2 != null) {
            try {
                this.f10773a.setUserData(account, str, str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

package com.ss.android.lark.passport.infra.util.storage;

import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.passport.infra.util.storage.a */
public class C49216a {

    /* renamed from: a */
    private static C49216a f123534a;

    /* renamed from: b */
    private final IPassportStorageService f123535b;

    /* renamed from: a */
    public static C49216a m194036a() {
        if (f123534a == null) {
            synchronized (C49216a.class) {
                if (f123534a == null) {
                    f123534a = new C49216a();
                }
            }
        }
        return f123534a;
    }

    private C49216a() {
        if (C49224w.m194054b(LarkContext.getApplication())) {
            this.f123535b = InternalPassportStorageServiceImpl.getInstance();
        } else {
            this.f123535b = (IPassportStorageService) C68183b.m264839a().mo237086a(LarkContext.getApplication(), IPassportStorageService.class);
        }
    }

    /* renamed from: a */
    public String mo171739a(String str) {
        IPassportStorageService iPassportStorageService = this.f123535b;
        if (iPassportStorageService != null) {
            return iPassportStorageService.getData(str);
        }
        return "";
    }

    /* renamed from: b */
    public String mo171741b(String str) {
        IPassportStorageService iPassportStorageService = this.f123535b;
        if (iPassportStorageService != null) {
            return iPassportStorageService.remove(str);
        }
        return "";
    }

    /* renamed from: a */
    public void mo171740a(String str, String str2) {
        IPassportStorageService iPassportStorageService = this.f123535b;
        if (iPassportStorageService != null) {
            iPassportStorageService.setData(str, str2);
        }
    }
}

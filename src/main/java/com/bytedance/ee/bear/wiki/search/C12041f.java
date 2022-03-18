package com.bytedance.ee.bear.wiki.search;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.search.f */
public class C12041f {
    /* renamed from: a */
    public static C12040e m49866a(Fragment fragment, NetService netService) {
        return (C12040e) aj.m5365a(fragment, C12032b.m49847a(new WikiSearchPuller(netService, fragment.getContext()))).mo6005a(C12040e.class);
    }

    /* renamed from: a */
    public static C12040e m49867a(FragmentActivity fragmentActivity, C10917c cVar) {
        return (C12040e) aj.m5367a(fragmentActivity, C12032b.m49847a(new WikiSearchPuller((NetService) KoinJavaComponent.m268610a(NetService.class), fragmentActivity.getApplicationContext()))).mo6005a(C12040e.class);
    }
}

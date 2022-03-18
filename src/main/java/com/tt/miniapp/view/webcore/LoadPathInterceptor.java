package com.tt.miniapp.view.webcore;

import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.LifeCycleManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class LoadPathInterceptor extends AppbrandServiceManager.ServiceBase {
    private ConcurrentHashMap<String, C67230a> mLockMap = new ConcurrentHashMap<>();
    private AtomicInteger placeHolderFramePageIdGenerator = new AtomicInteger(0);
    private AtomicInteger placeHolderIdGenerator = new AtomicInteger(0);

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_APP_INSTALL_SUCCESS})
    public void onAppInstallSuccess() {
        updateRealPath("page-frame.js", "page-frame.js");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.view.webcore.LoadPathInterceptor$a */
    public class C67230a {

        /* renamed from: a */
        String f169701a;

        /* renamed from: b */
        final Object f169702b = new Object();

        C67230a() {
        }
    }

    private String cutFrameJsSuffix(String str) {
        if (str.endsWith("-frame.js")) {
            return str.substring(0, str.length() - 9);
        }
        return str;
    }

    public boolean shouldIntercept(String str) {
        if (this.mLockMap.containsKey(str)) {
            return true;
        }
        return this.mLockMap.containsKey(cutFrameJsSuffix(str));
    }

    public LoadPathInterceptor(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
        this.mLockMap.put("page-frame.js", new C67230a());
    }

    public String interceptPath(String str) {
        C67230a aVar = this.mLockMap.get(str);
        if (aVar == null && (aVar = this.mLockMap.get(cutFrameJsSuffix(str))) == null) {
            return str;
        }
        if (aVar.f169701a != null) {
            return aVar.f169701a;
        }
        synchronized (aVar.f169702b) {
            while (aVar.f169701a == null) {
                try {
                    aVar.f169702b.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return aVar.f169701a;
    }

    @LifeCycleManager.LifecycleInterest({LifeCycleManager.LifeCycleEvent.ON_SUB_APP_INSTALL_SUCCESS})
    public void onAppInstallSuccess(LifeCycleManager.LifeCycleEvent lifeCycleEvent, String str) {
        String str2 = str + "/" + "page-frame.js";
        updateRealPath(str2, str2);
    }

    public String genPageFramePlaceHolder(String str, String str2) {
        String str3 = str + this.placeHolderFramePageIdGenerator.getAndIncrement() + str2;
        this.mLockMap.put(str3, new C67230a());
        return str3;
    }

    public String genPlaceHolder(String str, String str2) {
        String str3 = str + this.placeHolderIdGenerator.getAndIncrement() + str2;
        this.mLockMap.put(str3, new C67230a());
        return str3;
    }

    /* access modifiers changed from: package-private */
    public void updateRealPath(String str, String str2) {
        C67230a aVar = this.mLockMap.get(str);
        if (aVar == null) {
            C67230a aVar2 = new C67230a();
            aVar2.f169701a = str2;
            this.mLockMap.put(str, aVar2);
            return;
        }
        synchronized (aVar.f169702b) {
            aVar.f169701a = str2;
            aVar.f169702b.notifyAll();
        }
    }
}

package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.ee.bear.contract.BinderHostService;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderHostServiceImp extends BinderHostService.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private ak mHostService;

    @Override // com.bytedance.ee.bear.contract.BinderHostService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.BinderHostService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.BinderHostService.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void fetchEmojis() {
        lazyInit();
        this.mHostService.fetchEmojis();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public List<String> getRecentReactionList() {
        lazyInit();
        return this.mHostService.getRecentReactionList();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public List<String> getWholeReactionList() {
        lazyInit();
        return this.mHostService.getWholeReactionList();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void goToCustomService() {
        lazyInit();
        this.mHostService.goToCustomService();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void goToHelpCenter() {
        lazyInit();
        this.mHostService.goToHelpCenter();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void onProcessStart() {
        lazyInit();
        this.mHostService.onProcessStart();
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void routeToLarkAbout() {
        lazyInit();
        this.mHostService.routeToLarkAbout();
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mHostService;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderHostServiceImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void addProcessStartCallback(BinderIProcessStart binderIProcessStart) {
        lazyInit();
        this.mHostService.addProcessStartCallback(binderIProcessStart);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public Bundle doCommand(Bundle bundle) {
        lazyInit();
        return this.mHostService.doCommand(bundle);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public String getEmojiImageFromNet(String str) {
        lazyInit();
        return this.mHostService.getEmojiImageFromNet(str);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void handleQrResult(String str) {
        lazyInit();
        this.mHostService.handleQrResult(str);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public boolean isFeedCardShortcut(String str) {
        lazyInit();
        return this.mHostService.isFeedCardShortcut(str);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void jumpToLarkFeed(String str) {
        lazyInit();
        this.mHostService.jumpToLarkFeed(str);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public String recognizeQRCode(String str) {
        lazyInit();
        return this.mHostService.recognizeQRCode(str);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void removeProcessStartCallback(BinderIProcessStart binderIProcessStart) {
        lazyInit();
        this.mHostService.removeProcessStartCallback(binderIProcessStart);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void routeTabDocs(int i) {
        lazyInit();
        this.mHostService.routeTabDocs(i);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void updateOrder(String str) {
        lazyInit();
        this.mHostService.updateOrder(str);
    }

    public BinderHostServiceImp(ak akVar, Application application) {
        this.mHostService = akVar;
        this.mApplication = application;
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void getResMapFromNet(int i, List<String> list) {
        lazyInit();
        this.mHostService.getResMapFromNet(i, list);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void goToProfileMain(String str, String str2) {
        lazyInit();
        this.mHostService.goToProfileMain(str, str2);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void openExternalUrl(String str, Map<String, String> map) {
        lazyInit();
        this.mHostService.openExternalUrl(str, map);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareTextPlain(String str, String str2) {
        lazyInit();
        this.mHostService.shareTextPlain(str, str2);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareImages(String str, String str2, ArrayList<Uri> arrayList) {
        lazyInit();
        this.mHostService.shareImages(str, str2, arrayList);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareTextPlain(String str, String str2, boolean z) {
        lazyInit();
        this.mHostService.shareTextPlain(str, str2, z);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void markFeedCardShortcut(boolean z, int i, String str, BinderIMarkFeedCallback binderIMarkFeedCallback) {
        lazyInit();
        this.mHostService.markFeedCardShortcut(z, i, str, binderIMarkFeedCallback);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void shareImages(String str, String str2, ArrayList<Uri> arrayList, boolean z) {
        lazyInit();
        this.mHostService.shareImages(str, str2, arrayList, z);
    }

    @Override // com.bytedance.ee.bear.contract.ak
    public void notifyAnnouncementChange(String str, String str2, boolean z, String str3, IBinder iBinder) {
        lazyInit();
        this.mHostService.notifyAnnouncementChange(str, str2, z, str3, iBinder);
    }
}

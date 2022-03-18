package com.bytedance.ee.bear.drive.biz.save2space;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.drive.biz.save2space.C6743c;
import com.bytedance.ee.bear.drive.loader.download.model.imfile.SdkSaveToSpaceStatus;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.imfile.SaveToSpaceV2Puller;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.save2space.c */
public class C6743c {
    /* renamed from: a */
    public static AbstractC7064c<SaveToSpaceV2Puller.Params, SdkSaveToSpaceStatus> m26563a(NetService netService) {
        final SaveToSpaceV2Puller saveToSpaceV2Puller = new SaveToSpaceV2Puller(netService);
        return new AbstractC7064c<SaveToSpaceV2Puller.Params, SdkSaveToSpaceStatus>() {
            /* class com.bytedance.ee.bear.drive.biz.save2space.C6743c.C67441 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ SdkSaveToSpaceStatus m26564a(SaveToSpaceV2Puller.Result result) throws Exception {
                return new SdkSaveToSpaceStatus(0, result.file_token);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ AbstractC70020b m26565a(Throwable th) throws Exception {
                if (C5203d.m21235a(th, 90002101)) {
                    return AbstractC68307f.m265083a(new SdkSaveToSpaceStatus(90002101));
                }
                if (C5203d.m21235a(th, 90002103)) {
                    return AbstractC68307f.m265083a(new SdkSaveToSpaceStatus(90002103));
                }
                return AbstractC68307f.m265084a(th);
            }

            /* renamed from: a */
            public AbstractC68307f<SdkSaveToSpaceStatus> mo26542a(SaveToSpaceV2Puller.Params params) {
                return saveToSpaceV2Puller.mo27622a((BasePuller.Params) params).mo238020d($$Lambda$c$1$UgSyTeZRIdfDZUTMDJju1C0vAsE.INSTANCE).mo238026e($$Lambda$c$1$wtC6aQfrdAbNJX7AbmlqkI7ih5E.INSTANCE).mo237988a((Consumer<? super Throwable>) new Consumer() {
                    /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$c$1$N8LUM0bKrgMvnDgG5pmQMZFBMzc */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6743c.C67441.m26566a(SaveToSpaceV2Puller.Params.this, (Throwable) obj);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m26566a(SaveToSpaceV2Puller.Params params, Throwable th) throws Exception {
                C13479a.m54758a("DriveSdk", String.format("V2 saveToSpace error, msg: %s, params: ", th, params.toString()));
            }
        };
    }
}

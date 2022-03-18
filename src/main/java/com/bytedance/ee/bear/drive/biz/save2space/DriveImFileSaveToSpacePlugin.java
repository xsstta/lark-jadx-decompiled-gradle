package com.bytedance.ee.bear.drive.biz.save2space;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.OnlineOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.more.download.im.ImFileSave2SpacePushInfo;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.download.model.imfile.SdkSaveToSpaceStatus;
import com.bytedance.ee.bear.drive.loader.download.platform.api.imfile.SaveToSpaceV2Puller;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.jvm.functions.Function0;
import org.apache.commons.lang3.C69877e;
import org.koin.core.p3519d.C70039b;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public class DriveImFileSaveToSpacePlugin extends BasePlugin<DrivePluginHost> implements RnPushProtocol.AbstractC10622a {
    private RnPushProtocol mPushSDK;

    public /* synthetic */ void lambda$didReceivePush$5$DriveImFileSaveToSpacePlugin() {
        if (C13726a.m55676b(getActivity())) {
            Toast.showSuccessText(getContext(), getContext().getString(R.string.Drive_Sdk_SaveSuccessfully), 0);
        }
    }

    public void saveToSpace() {
        OnlineOpenEntity onlineOpenEntity = (OnlineOpenEntity) ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        AbstractC68307f.m265083a(Boolean.valueOf(C5084ad.m20847d().mo20038b().mo20041b())).mo238005b((Consumer) new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveImFileSaveToSpacePlugin$Jq5N9ad0URGgjFvFXBqhRlM0szk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DriveImFileSaveToSpacePlugin.this.lambda$saveToSpace$1$DriveImFileSaveToSpacePlugin((Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveImFileSaveToSpacePlugin$i_BiJMuWq1tpVG4XXxa8CJvyWQ */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DriveImFileSaveToSpacePlugin.lambda$saveToSpace$2(SaveToSpaceV2Puller.Params.this, (Boolean) obj);
            }
        }).mo238001b(new Consumer((DriveImFileSaveToSpaceVM) viewModel(DriveImFileSaveToSpaceVM.class)) {
            /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveImFileSaveToSpacePlugin$URNqhitExIoPEg6a5M0MvbFmTLM */
            public final /* synthetic */ DriveImFileSaveToSpaceVM f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DriveImFileSaveToSpacePlugin.this.lambda$saveToSpace$3$DriveImFileSaveToSpacePlugin(this.f$1, (SdkSaveToSpaceStatus) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveImFileSaveToSpacePlugin$5kQ51UiCjYCB6RzXpqzNjfzBbg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DriveImFileSaveToSpacePlugin.this.lambda$saveToSpace$4$DriveImFileSaveToSpacePlugin((Throwable) obj);
            }
        });
    }

    public /* synthetic */ void lambda$saveToSpace$1$DriveImFileSaveToSpacePlugin(Boolean bool) throws Exception {
        C6920b.m27342f().mo27166a().mo27930b(((DrivePluginHost) getHost()).mo27261l().getFileModel(), "attachment_more");
    }

    @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
    public void didReceivePush(String str) {
        try {
            ImFileSave2SpacePushInfo imFileSave2SpacePushInfo = (ImFileSave2SpacePushInfo) JSON.parseObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).toJavaObject(ImFileSave2SpacePushInfo.class);
            C13479a.m54764b("DriveSdk", "DriveSdkSaveToSpacePlugin#didReceivePush() pushInfo=" + imFileSave2SpacePushInfo);
            if (C69877e.m268162b(imFileSave2SpacePushInfo.getOperation(), "SAVE_TO_DRIVE") && !TextUtils.isEmpty(imFileSave2SpacePushInfo.getFileToken())) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveImFileSaveToSpacePlugin$ViWEwaxI7DPHO8jgJGxh__z2XGU */

                    public final void run() {
                        DriveImFileSaveToSpacePlugin.this.lambda$didReceivePush$5$DriveImFileSaveToSpacePlugin();
                    }
                });
                C13479a.m54764b("DriveSdk", "DriveSdkSaveToSpacePlugin#didReceivePush() save to drive push, set token!!!");
                ((DriveImFileSaveToSpaceVM) viewModel(DriveImFileSaveToSpaceVM.class)).getLiveFileToken().mo5926a(imFileSave2SpacePushInfo.getFileToken());
            }
        } catch (Exception e) {
            C13479a.m54759a("DriveSdk", "DriveSdkSaveToSpacePlugin#didReceivePush() error=", e);
        }
    }

    public /* synthetic */ void lambda$saveToSpace$4$DriveImFileSaveToSpacePlugin(Throwable th) throws Exception {
        C13479a.m54759a("DriveSdk", "DriveSdkSaveToSpacePlugin#saveToSpace() error=", th);
        if (!isUIContainerDetached()) {
            Long l = null;
            AbstractC6946a fileModel = ((DrivePluginHost) getHost()).mo27261l().getFileModel();
            if (fileModel != null) {
                l = Long.valueOf(fileModel.mo27322a().f18787c);
            }
            C13479a.m54758a("DriveSdk", "DriveSdkSaveToSpacePlugin#saveToSpace() fileSize = " + l);
            if (!SaveToSpaceErrorUtils.m26561a(th, (FragmentActivity) getContext(), l)) {
                Toast.showFailureText(getContext(), getContext().getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
            }
        }
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        RnPushProtocol rnPushProtocol = this.mPushSDK;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
        }
    }

    static /* synthetic */ AbstractC70020b lambda$saveToSpace$2(SaveToSpaceV2Puller.Params params, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return C6743c.m26563a((NetService) KoinJavaComponent.m268610a(NetService.class)).mo26542a(params);
        }
        return AbstractC68307f.m265084a((Throwable) new Exception("network disconnected !!!"));
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        DriveImFileSaveToSpaceVM aVar2 = (DriveImFileSaveToSpaceVM) viewModel(DriveImFileSaveToSpaceVM.class);
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f != null) {
            RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
                /* class com.bytedance.ee.bear.drive.biz.save2space.$$Lambda$DriveImFileSaveToSpacePlugin$ZzLi4Y4XEdsxYx6QFKI_Ecno_dA */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C70039b.m268661a("DRIVE_SDK_FILE_", AccountService.Account.this.f14584a);
                }
            });
            this.mPushSDK = rnPushProtocol;
            rnPushProtocol.mo40242a(this);
            return;
        }
        C13479a.m54758a("DriveSdk", "DriveSdkSaveToSpacePlugin#onAttachToUIContainer() account is null");
    }

    public /* synthetic */ void lambda$saveToSpace$3$DriveImFileSaveToSpacePlugin(DriveImFileSaveToSpaceVM aVar, SdkSaveToSpaceStatus sdkSaveToSpaceStatus) throws Exception {
        C13479a.m54764b("DriveSdk", "DriveSdkSaveToSpacePlugin#saveToSpace() pull result=" + sdkSaveToSpaceStatus);
        if (isUIContainerDetached()) {
            C13479a.m54775e("DriveSdk", "DriveSdkSaveToSpacePlugin#saveToSpace() accept in isUIContainerDetached. ignore");
        } else if (sdkSaveToSpaceStatus.getStatus() == 0) {
            if (sdkSaveToSpaceStatus.getFileToken() != null) {
                C13479a.m54764b("DriveSdk", "DriveSdkSaveToSpacePlugin#saveToSpace() pull result STATUS_SAVED setToken=" + C13721c.m55650d(sdkSaveToSpaceStatus.getFileToken()));
                aVar.getLiveFileToken().mo5926a(sdkSaveToSpaceStatus.getFileToken());
            }
            Toast.showSuccessText(getContext(), getContext().getString(R.string.Drive_Sdk_SaveSuccessfully), 0);
        } else if (sdkSaveToSpaceStatus.getStatus() == 90002101) {
            Toast.showSuccessText(getContext(), getContext().getString(R.string.Drive_Sdk_Saving), 0);
        } else if (sdkSaveToSpaceStatus.getStatus() == 90002103) {
            Toast.showSuccessText(getContext(), getContext().getString(R.string.Drive_Sdk_SaveFailedCantCrossTenant), 1);
        }
    }
}

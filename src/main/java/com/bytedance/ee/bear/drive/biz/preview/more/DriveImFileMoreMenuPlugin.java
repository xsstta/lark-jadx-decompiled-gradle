package com.bytedance.ee.bear.drive.biz.preview.more;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderProxyDownloadUpdater;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.preview.more.download.im.C6664a;
import com.bytedance.ee.bear.drive.biz.preview.more.download.im.DriveImFileDownloadVM;
import com.bytedance.ee.bear.drive.biz.save2space.DriveImFileSaveToSpacePlugin;
import com.bytedance.ee.bear.drive.biz.save2space.DriveImFileSaveToSpaceVM;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToSpaceMenu;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13726a;
import io.reactivex.disposables.C68289a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

public class DriveImFileMoreMenuPlugin extends AbsDriveMoreMenuPlugin {
    private C68289a compositeDisposable = new C68289a();
    private boolean enableMore = false;

    public /* synthetic */ void lambda$initMenuActions$2$DriveImFileMoreMenuPlugin() {
        new DriveAttachmentMoreMenuCreator(getActivity(), ((DrivePluginHost) getHost()).mo27261l(), this.compositeDisposable).mo26307a(SaveToSpaceMenu.class, new Action() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveImFileMoreMenuPlugin.C66152 */

            @Override // com.bytedance.ee.bear.drive.biz.preview.more.Action
            /* renamed from: a */
            public <T extends BaseMoreMenuAction> void mo26262a(T t) {
                DriveImFileMoreMenuPlugin.this.handleSave2SpaceCLick();
            }
        }).mo26311e().mo26312f();
    }

    public void handleSave2SpaceCLick() {
        if (!isUIContainerDetached()) {
            String b = ((DriveImFileSaveToSpaceVM) viewModel(DriveImFileSaveToSpaceVM.class)).getLiveFileToken().mo5927b();
            if (!TextUtils.isEmpty(b)) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#onClick() instanceof SaveToSpaceMenu, route drive file");
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C6313i.m25327a().mo25382a(C8275a.f22375h.mo32553a(), b, null));
                return;
            }
            C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#onClick() instanceof SaveToSpaceMenu, liveSaveToSpace postValue");
            DriveImFileSaveToSpacePlugin driveImFileSaveToSpacePlugin = (DriveImFileSaveToSpacePlugin) findPlugin(DriveImFileSaveToSpacePlugin.class);
            if (driveImFileSaveToSpacePlugin != null) {
                driveImFileSaveToSpacePlugin.saveToSpace();
            }
        }
    }

    public void initMenuActions() {
        boolean z;
        if (isUIContainerAttached()) {
            ArrayList arrayList = new ArrayList();
            if (titleBarViewModel().getOutlineEnable().mo5927b() == Boolean.TRUE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(createOutlineMenuItem());
            }
            if (!C13657b.m55421a(((DrivePluginHost) getHost()).mo27261l().getOpenEntity().getMoreMenuActions())) {
                MenuItem createMoreMenuItem = createMoreMenuItem(new Runnable() {
                    /* class com.bytedance.ee.bear.drive.biz.preview.more.$$Lambda$DriveImFileMoreMenuPlugin$E6FxkuX2Zim1G_9CLhE84quHIQk */

                    public final void run() {
                        DriveImFileMoreMenuPlugin.this.lambda$initMenuActions$2$DriveImFileMoreMenuPlugin();
                    }
                });
                createMoreMenuItem.setEnable(this.enableMore);
                arrayList.add(createMoreMenuItem);
            }
            if (C13657b.m55421a(arrayList)) {
                getTitleBar().mo19528h(false);
                return;
            }
            getTitleBar().mo19528h(true);
            showRightMenu(arrayList);
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        super.onDetachFromHost(aVar);
        this.compositeDisposable.mo237935a();
    }

    /* access modifiers changed from: private */
    public static class BinderDownloadUpdater extends BinderProxyDownloadUpdater.Stub {
        private WeakReference<DriveImFileMoreMenuPlugin> mRef;
        private WeakReference<DriveImFileDownloadVM> mVmRef;

        private void postViewState(C6664a aVar) {
            DriveImFileDownloadVM bVar = this.mVmRef.get();
            if (bVar != null) {
                bVar.getLiveDownload().mo5926a(aVar);
            }
        }

        public BinderDownloadUpdater(DriveImFileMoreMenuPlugin driveImFileMoreMenuPlugin, DriveImFileDownloadVM bVar) {
            this.mRef = new WeakReference<>(driveImFileMoreMenuPlugin);
            this.mVmRef = new WeakReference<>(bVar);
        }

        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
        public void hideDownloadingView(String str, String str2) {
            DriveImFileMoreMenuPlugin driveImFileMoreMenuPlugin = this.mRef.get();
            if (driveImFileMoreMenuPlugin != null) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#setBinderProxyDownloadUpdater hideDownloadingView() appId=" + str + " uniqueId=" + str2 + " isActive=" + C13726a.m55674a(driveImFileMoreMenuPlugin.getContext()));
                postViewState(new C6664a(3));
            }
        }

        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
        public void showDownloadingView(String str, String str2) {
            DriveImFileMoreMenuPlugin driveImFileMoreMenuPlugin = this.mRef.get();
            if (driveImFileMoreMenuPlugin != null) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#setBinderProxyDownloadUpdater showDownloadingView() appId=" + str + " uniqueId=" + str2 + " isActive=" + C13726a.m55674a(driveImFileMoreMenuPlugin.getContext()));
                postViewState(new C6664a(1));
            }
        }

        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
        public void onDownloadingProgressChange(String str, String str2, int i) {
            DriveImFileMoreMenuPlugin driveImFileMoreMenuPlugin = this.mRef.get();
            if (driveImFileMoreMenuPlugin != null) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#setBinderProxyDownloadUpdater onDownloadingProgressChange() appId=" + str + " uniqueId=" + str2 + " progress=" + i + " isActive=" + C13726a.m55674a(driveImFileMoreMenuPlugin.getContext()));
                postViewState(new C6664a(2, i));
            }
        }

        @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.AbstractC5150g.AbstractC5152b
        public void onFailed(String str, String str2, String str3) {
            DriveImFileMoreMenuPlugin driveImFileMoreMenuPlugin = this.mRef.get();
            if (driveImFileMoreMenuPlugin != null) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#setBinderProxyDownloadUpdater onFailed() appId=" + str + " uniqueId=" + str2 + " msg=" + str3 + " isActive=" + C13726a.m55674a(driveImFileMoreMenuPlugin.getContext()));
                postViewState(new C6664a(4, str3));
            }
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$1$DriveImFileMoreMenuPlugin(ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = false;
        } else {
            z = true;
        }
        this.enableMore = z;
        initMenuActions();
    }

    private void initMenuActionsInterface(ArrayList<BaseMoreMenuAction> arrayList) {
        Iterator<BaseMoreMenuAction> it = arrayList.iterator();
        while (it.hasNext()) {
            BaseMoreMenuAction next = it.next();
            if (next instanceof DownloadMenu) {
                ((DownloadMenu) next).mo29735a(new BinderDownloadUpdater(this, (DriveImFileDownloadVM) viewModel(DriveImFileDownloadVM.class)));
            } else if (next instanceof SaveToSpaceMenu) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#initMenuActionsInterface() setSaveToSpaceMenuState");
                setSaveToSpaceMenuState((SaveToSpaceMenu) next);
            }
        }
    }

    private void setSaveToSpaceMenuState(SaveToSpaceMenu saveToSpaceMenu) {
        saveToSpaceMenu.mo29770d(!TextUtils.isEmpty(((DriveImFileSaveToSpaceVM) viewModel(DriveImFileSaveToSpaceVM.class)).getLiveFileToken().mo5927b()));
        C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#setSaveToSpaceMenuState() setSaved=" + saveToSpaceMenu.mo29771j());
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        super.onAttachToHost(aVar);
        ((DriveImFileSaveToSpaceVM) viewModel(DriveImFileSaveToSpaceVM.class)).getLiveFileToken().mo5923a(aVar.mo19566h(), new AbstractC1178x(aVar.f18727b) {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.$$Lambda$DriveImFileMoreMenuPlugin$PqHycH22bjElCLAbRUgCPGSxgk */
            public final /* synthetic */ C6937b f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                DriveImFileMoreMenuPlugin.this.lambda$onAttachToHost$0$DriveImFileMoreMenuPlugin(this.f$1, (String) obj);
            }
        });
        initMenuActionsInterface(aVar.f18727b.getOpenEntity().getMoreMenuActions());
        titleBarViewModel().getOutlineEnable().mo5923a(getLifecycleOwner(), new AbstractC1178x<Boolean>() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.DriveImFileMoreMenuPlugin.C66141 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                DriveImFileMoreMenuPlugin.this.initMenuActions();
            }
        });
        C5084ad.m20847d().mo20037a().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.biz.preview.more.$$Lambda$DriveImFileMoreMenuPlugin$ZG7YmXkUCQj9ROnybYXbCjFTw0M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                DriveImFileMoreMenuPlugin.this.lambda$onAttachToHost$1$DriveImFileMoreMenuPlugin((ConnectionService.NetworkState) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAttachToHost$0$DriveImFileMoreMenuPlugin(C6937b bVar, String str) {
        boolean z;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DriveSdkTitleBarPlugin#liveFileToken() error state, fileToken is null?=");
            if (str == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54775e("DriveSdk", sb.toString());
            return;
        }
        Iterator<BaseMoreMenuAction> it = bVar.getOpenEntity().getMoreMenuActions().iterator();
        while (it.hasNext()) {
            BaseMoreMenuAction next = it.next();
            if (next instanceof SaveToSpaceMenu) {
                C13479a.m54764b("DriveSdk", "DriveSdkTitleBarPlugin#liveFileToken() setSaveToSpaceMenuState");
                setSaveToSpaceMenuState((SaveToSpaceMenu) next);
                return;
            }
        }
    }
}

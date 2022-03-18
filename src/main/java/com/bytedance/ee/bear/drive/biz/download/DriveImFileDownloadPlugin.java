package com.bytedance.ee.bear.drive.biz.download;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.drive.biz.preview.more.download.im.C6664a;
import com.bytedance.ee.bear.drive.biz.preview.more.download.im.DriveImFileDownloadVM;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.DownloadMenu;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;

public class DriveImFileDownloadPlugin extends BasePlugin<DrivePluginHost> {
    private View mDownloadRootView;
    private AbstractC1178x<C6664a> mObserver;

    private void showDownloadContentViewIfNeed(AbstractC4958n nVar) {
        if (this.mDownloadRootView.getVisibility() != 0) {
            this.mDownloadRootView.setVisibility(0);
            nVar.mo19588a(this, this.mDownloadRootView);
            return;
        }
        C13479a.m54775e("DriveSdk", "DriveSdkDownloadPlugin#liveDownload() show state, but current download view VISIBLE, ignore reshow");
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        C1177w<C6664a> liveDownload = ((DriveImFileDownloadVM) viewModel(DriveImFileDownloadVM.class)).getLiveDownload();
        LifecycleOwner h = aVar.mo19566h();
        $$Lambda$DriveImFileDownloadPlugin$qur6McbQYR0wke1EO7LUFMeeUw r1 = new AbstractC1178x(nVar) {
            /* class com.bytedance.ee.bear.drive.biz.download.$$Lambda$DriveImFileDownloadPlugin$qur6McbQYR0wke1EO7LUFMeeUw */
            public final /* synthetic */ AbstractC4958n f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                DriveImFileDownloadPlugin.this.lambda$onAttachToUIContainer$0$DriveImFileDownloadPlugin(this.f$1, (C6664a) obj);
            }
        };
        this.mObserver = r1;
        liveDownload.mo5923a(h, r1);
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        if (this.mObserver != null) {
            ((DriveImFileDownloadVM) viewModel(DriveImFileDownloadVM.class)).getLiveDownload().mo5928b(this.mObserver);
        }
    }

    private void showNormalTips(TextView textView, C6937b bVar) {
        String str;
        textView.setTextColor(textView.getResources().getColor(R.color.text_title));
        if (bVar.getIFileModel() != null) {
            str = C13672c.m55479a(getContext(), bVar.getIFileModel().mo27377g()) + " ";
        } else {
            C13479a.m54758a("DriveSdk", "DriveSdkDownloadPlugin#liveDownload() current filemodel null, so get file size empty");
            str = "";
        }
        textView.setText(str + getContext().getResources().getString(R.string.Drive_Sdk_Downloading));
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$DriveImFileDownloadPlugin(AbstractC4958n nVar, C6664a aVar) {
        if (aVar == null) {
            C13479a.m54758a("DriveSdk", "DriveSdkDownloadPlugin#liveDownload() state null");
            return;
        }
        if (this.mDownloadRootView == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.drive_sdk_download_pregress_view, (ViewGroup) null);
            this.mDownloadRootView = inflate;
            inflate.setVisibility(8);
            this.mDownloadRootView.findViewById(R.id.drive_sdk_downloading_close).setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.biz.download.DriveImFileDownloadPlugin.View$OnClickListenerC64081 */

                public void onClick(View view) {
                    ArrayList<BaseMoreMenuAction> moreMenuActions = ((DrivePluginHost) DriveImFileDownloadPlugin.this.getHost()).mo27261l().getOpenEntity().getMoreMenuActions();
                    if (moreMenuActions != null) {
                        Iterator<BaseMoreMenuAction> it = moreMenuActions.iterator();
                        while (it.hasNext()) {
                            BaseMoreMenuAction next = it.next();
                            if ((next instanceof DownloadMenu) && ((DownloadMenu) next).mo29740j() != null) {
                                try {
                                    ((DownloadMenu) next).mo29740j().cancel();
                                } catch (Exception e) {
                                    C13479a.m54759a("DriveSdk", "DriveSdkDownloadPlugin#liveDownload() click error=", e);
                                }
                            }
                        }
                    }
                }
            });
        }
        C13479a.m54764b("DriveSdk", "DriveSdkDownloadPlugin#liveDownload() state=" + aVar.mo26335a());
        try {
            TextView textView = (TextView) this.mDownloadRootView.findViewById(R.id.drive_sdk_downloading_tips_tv);
            UDProgress uDProgress = (UDProgress) this.mDownloadRootView.findViewById(R.id.progress_bar);
            int a = aVar.mo26335a();
            if (a == 1) {
                showNormalTips(textView, ((DrivePluginHost) getHost()).mo27261l());
                uDProgress.setIndicatorColor(ContextCompat.getColor(getContext(), R.color.ud_B500));
                showDownloadContentViewIfNeed(nVar);
            } else if (a == 2) {
                showNormalTips(textView, ((DrivePluginHost) getHost()).mo27261l());
                uDProgress.setIndicatorColor(ContextCompat.getColor(getContext(), R.color.ud_B500));
                uDProgress.setProgress(aVar.mo26336b());
                showDownloadContentViewIfNeed(nVar);
            } else if (a != 4) {
                this.mDownloadRootView.setVisibility(8);
                uDProgress.setProgress(0);
                nVar.mo19594b(this, this.mDownloadRootView);
            } else {
                showDownloadContentViewIfNeed(nVar);
                textView.setTextColor(textView.getResources().getColor(R.color.function_danger_500));
                uDProgress.setIndicatorColor(ContextCompat.getColor(getContext(), R.color.function_danger_500));
                textView.setText(aVar.mo26337c());
            }
        } catch (Exception e) {
            C13479a.m54759a("DriveSdk", "DriveSdkDownloadPlugin#liveDownload() switch state error=", e);
        }
    }
}

package com.bytedance.ee.bear.drive.module.nativepreview;

import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.drive.module.nativepreview.component.DriveNativeRenderComponent;
import com.bytedance.ee.bear.drive.module.nativepreview.p359a.C7104b;
import com.bytedance.ee.lark.component.C12733b;
import com.bytedance.ee.log.C13479a;

public class DriveSameRenderLifecyclePlugin extends DocumentPlugin {
    private LifecycleObserver lifecycleObserver = new LifecycleObserver() {
        /* class com.bytedance.ee.bear.drive.module.nativepreview.DriveSameRenderLifecyclePlugin.C70991 */

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public void onCreate() {
            WebView b;
            C13479a.m54764b("DriveSameRenderLifecyclePlugin", "onActivityCreated");
            int d = C7104b.m28436b().mo27759d();
            if (d == 0 && (b = DriveSameRenderLifecyclePlugin.this.getWeb().mo19435b()) != null && (b instanceof DocBridgeWebViewV2)) {
                DocBridgeWebViewV2 docBridgeWebViewV2 = (DocBridgeWebViewV2) b;
                C12733b.m52710a().mo48218a(DriveSameRenderLifecyclePlugin.this.getActivity(), docBridgeWebViewV2);
                C12733b.m52710a().mo48221a(docBridgeWebViewV2, "drive_file_block", DriveNativeRenderComponent.class);
            }
            C7104b.m28436b().mo27748a(d + 1);
            C13479a.m54772d("DriveSameRenderLifecyclePlugin", "onActivityCreated finished");
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            C13479a.m54764b("DriveSameRenderLifecyclePlugin", "onActivityDestroyed");
            int d = C7104b.m28436b().mo27759d();
            if (d == 1) {
                C7104b.m28436b().mo27762f(DriveSameRenderLifecyclePlugin.this.getActivity().toString());
                WebView b = DriveSameRenderLifecyclePlugin.this.getWeb().mo19435b();
                if (b != null && (b instanceof DocBridgeWebViewV2)) {
                    C12733b.m52710a().mo48220a((DocBridgeWebViewV2) b, "drive_file_block");
                }
            }
            C7104b.m28436b().mo27748a(d - 1);
        }
    };

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        getActivity().getLifecycle().addObserver(this.lifecycleObserver);
        C7104b.m28436b().mo27749a(sVar.mo24597l().getChildFragmentManager());
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        C7104b.m28436b().mo27756b(sVar.mo24597l().getChildFragmentManager());
        getActivity().getLifecycle().removeObserver(this.lifecycleObserver);
    }
}

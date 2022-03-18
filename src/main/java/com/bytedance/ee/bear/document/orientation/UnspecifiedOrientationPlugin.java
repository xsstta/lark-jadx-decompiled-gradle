package com.bytedance.ee.bear.document.orientation;

import android.content.res.Configuration;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p709l.AbstractC13696d;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.Stack;

public class UnspecifiedOrientationPlugin extends CommonOrientationPlugin {
    private AbstractC10550f mKeyboardHeightProvider;
    public C6055b mOrientationViewModel;
    protected SensorOrientationDetectorPlugin mSensorDetectorPlugin;

    /* access modifiers changed from: protected */
    public boolean shouldOverrideOrientationPerforming() {
        return false;
    }

    public void forceLandscape() {
        getActivity().setRequestedOrientation(0);
        this.mOrientationViewModel.setRequestOrientation(0);
        if (!this.mOrientationViewModel.isLock()) {
            final C1177w<AbstractC13696d> orientation = this.mSensorDetectorPlugin.getOrientation();
            orientation.mo5923a(getLifecycleOwner(), new AbstractC1178x<AbstractC13696d>() {
                /* class com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin.C60532 */

                /* renamed from: a */
                public void onChanged(AbstractC13696d dVar) {
                    if (UnspecifiedOrientationPlugin.this.mOrientationViewModel.isSwitchOrientationTemporarily()) {
                        UnspecifiedOrientationPlugin.this.getActivity().setRequestedOrientation(-1);
                        UnspecifiedOrientationPlugin.this.mOrientationViewModel.setRequestOrientation(-1);
                        UnspecifiedOrientationPlugin.this.mOrientationViewModel.setSwitchOrientationTemporarily(false);
                        orientation.mo5928b((AbstractC1178x) this);
                    }
                }
            });
            this.mOrientationViewModel.setSwitchOrientationTemporarily(true);
        }
    }

    public void forcePortrait() {
        getActivity().setRequestedOrientation(1);
        this.mOrientationViewModel.setRequestOrientation(1);
        if (!this.mOrientationViewModel.isLock()) {
            final C1177w<AbstractC13696d> orientation = this.mSensorDetectorPlugin.getOrientation();
            orientation.mo5923a(getLifecycleOwner(), new AbstractC1178x<AbstractC13696d>() {
                /* class com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin.C60521 */

                /* renamed from: a */
                public void onChanged(AbstractC13696d dVar) {
                    if (UnspecifiedOrientationPlugin.this.mOrientationViewModel.isSwitchOrientationTemporarily()) {
                        UnspecifiedOrientationPlugin.this.getActivity().setRequestedOrientation(-1);
                        UnspecifiedOrientationPlugin.this.mOrientationViewModel.setRequestOrientation(-1);
                        UnspecifiedOrientationPlugin.this.mOrientationViewModel.setSwitchOrientationTemporarily(false);
                        orientation.mo5928b((AbstractC1178x) this);
                    }
                }
            });
            this.mOrientationViewModel.setSwitchOrientationTemporarily(true);
        }
    }

    public void setAnalyticSource(String str) {
        this.mOrientationViewModel.setSource(str);
    }

    public /* synthetic */ void lambda$onConfigurationChanged$2$UnspecifiedOrientationPlugin(C6215b bVar) {
        bVar.onConfigurationChanged(this.mKeyboardHeightProvider);
        bVar.requestUpdateWebContentHeight();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C13742g.m55706a(new Runnable(((C6095s) getHost()).mo24599n()) {
            /* class com.bytedance.ee.bear.document.orientation.$$Lambda$UnspecifiedOrientationPlugin$p5JEDogUV52mSw_RzMiBUgQ5cI */
            public final /* synthetic */ C6215b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                UnspecifiedOrientationPlugin.this.lambda$onConfigurationChanged$2$UnspecifiedOrientationPlugin(this.f$1);
            }
        }, 500);
    }

    public void onOrientationSupportPanelDismiss(AbstractC6054a aVar) {
        C13479a.m54764b("UnspecifiedOrientationPlugin", "dismiss panel: " + aVar);
        this.mOrientationViewModel.onOrientationSupportPanelDismiss(aVar);
    }

    public void onOrientationSupportPanelShowing(AbstractC6054a aVar) {
        C13479a.m54764b("UnspecifiedOrientationPlugin", "showing panel: " + aVar);
        this.mOrientationViewModel.onOrientationSupportPanelShowing(aVar);
    }

    public /* synthetic */ void lambda$onAttachToHost$1$UnspecifiedOrientationPlugin(Stack stack) {
        if (stack != null) {
            if (stack.empty()) {
                this.mOrientationViewModel.enable();
            } else if (((AbstractC6054a) stack.peek()).shouldDisableLandscape()) {
                this.mOrientationViewModel.disable();
            } else {
                this.mOrientationViewModel.enable();
            }
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$UnspecifiedOrientationPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            C13479a.m54764b("UnspecifiedOrientationPlugin", "restore orientation, current orientation is " + this.mOrientationViewModel.getRequestOrientation());
            getActivity().setRequestedOrientation(this.mOrientationViewModel.getRequestOrientation());
            return;
        }
        C13479a.m54764b("UnspecifiedOrientationPlugin", "force portrait");
        this.mOrientationViewModel.setRequestOrientation(getActivity().getRequestedOrientation());
        getActivity().setRequestedOrientation(1);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C6055b bVar = (C6055b) viewModel(C6055b.class);
        this.mOrientationViewModel = bVar;
        bVar.setRequestOrientation(getActivity().getRequestedOrientation());
        this.mKeyboardHeightProvider = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
        this.mSensorDetectorPlugin = (SensorOrientationDetectorPlugin) findPlugin(SensorOrientationDetectorPlugin.class);
        this.mOrientationViewModel.registerLockObserver(getContext());
        this.mOrientationViewModel.getEnable().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.orientation.$$Lambda$UnspecifiedOrientationPlugin$d6IHMWOEx5Qv_1VDhPo9WU8zVK8 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                UnspecifiedOrientationPlugin.this.lambda$onAttachToHost$0$UnspecifiedOrientationPlugin((Boolean) obj);
            }
        });
        this.mOrientationViewModel.getPanels().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.orientation.$$Lambda$UnspecifiedOrientationPlugin$BkILLkCPiJgsVQL5BfMPoxCZhg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                UnspecifiedOrientationPlugin.this.lambda$onAttachToHost$1$UnspecifiedOrientationPlugin((Stack) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.orientation.CommonOrientationPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(sVar, nVar);
        if (!shouldOverrideOrientationPerforming()) {
            this.mOrientationViewModel.setRequestOrientation(-1);
            getActivity().setRequestedOrientation(-1);
        }
    }
}

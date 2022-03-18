package com.bytedance.ee.bear.sheet.orientation;

import android.content.res.Configuration;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.orientation.C11252a;
import com.bytedance.ee.util.p709l.AbstractC13696d;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.Stack;

public class SheetUnspecifiedOrientationPlugin extends UnspecifiedOrientationPlugin implements AbstractC5887o.AbstractC5888a, AbstractC7666d {
    public boolean isLoading;
    private C11088a mAnalytic;
    public C11252a mOrientationTipPresenter;
    private LiveData<AbstractC13696d> mSensorOrientationState;

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadFail(int i, Throwable th) {
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadStart() {
        this.mOrientationTipPresenter.mo43131c();
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadSuccess() {
        if (!C13749l.m55763g(getContext())) {
            this.mOrientationTipPresenter.mo43129b();
        }
    }

    @Override // com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin
    public void forcePortrait() {
        super.forcePortrait();
        AbstractC13696d b = this.mSensorOrientationState.mo5927b();
        if (this.mOrientationViewModel.isLock() && b != null) {
            this.mOrientationTipPresenter.mo43126a();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        if (getResources().getConfiguration().orientation != 2 || C13749l.m55763g(getContext())) {
            return false;
        }
        forcePortrait();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin
    public boolean shouldOverrideOrientationPerforming() {
        int requestedOrientation = getActivity().getRequestedOrientation();
        if (requestedOrientation != 8 && requestedOrientation != 0) {
            return super.shouldOverrideOrientationPerforming();
        }
        this.mOrientationViewModel.setRequestOrientation(requestedOrientation);
        return true;
    }

    public /* synthetic */ void lambda$onAttachToHost$1$SheetUnspecifiedOrientationPlugin(Stack stack) {
        if (stack != null) {
            if (!stack.empty() || C13749l.m55763g(getContext())) {
                this.mOrientationTipPresenter.mo43131c();
            } else {
                this.mOrientationTipPresenter.mo43129b();
            }
        }
    }

    private void onOrientationChangedToLandscape(boolean z) {
        if (!this.mOrientationViewModel.isLock()) {
            return;
        }
        if (getResources().getConfiguration().orientation == 1) {
            this.mOrientationTipPresenter.mo43128a(z);
            this.mAnalytic.mo42302w();
            return;
        }
        this.mOrientationTipPresenter.mo43126a();
    }

    private void onOrientationChangedToPortrait(boolean z) {
        boolean z2;
        if (!this.mOrientationViewModel.isLock()) {
            return;
        }
        if (getResources().getConfiguration().orientation != 2 || z) {
            this.mOrientationTipPresenter.mo43126a();
            return;
        }
        C11252a aVar = this.mOrientationTipPresenter;
        if (getActivity().getRequestedOrientation() == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar.mo43130b(z2);
        this.mAnalytic.mo42303x();
    }

    public /* synthetic */ void lambda$onAttachToHost$0$SheetUnspecifiedOrientationPlugin(AbstractC13696d dVar) {
        if (dVar != null || !this.isLoading) {
            this.mOrientationViewModel.setSource("mobile_rotation");
            if (dVar.mo50654c()) {
                onOrientationChangedToLandscape(dVar.mo50653b());
            } else {
                onOrientationChangedToPortrait(dVar.mo50653b());
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin, com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        PersistenceSharedPreference aVar;
        int i;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 && (i = (aVar = new PersistenceSharedPreference("sheet_enter_landscape_tip")).getInt("show_count", 0)) < 3) {
            aVar.mo34037a("show_count", Integer.valueOf(i + 1));
            Toast.showText(getContext(), getResources().getString(R.string.Doc_Sheet_ReadOnlyLandscape));
        }
    }

    @Override // com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin
    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost(sVar);
        C11088a aVar = new C11088a();
        this.mAnalytic = aVar;
        aVar.mo42260a(getDocViewModel().getBearUrl());
        this.mOrientationTipPresenter = new C11252a(new C11252a.AbstractC11255a() {
            /* class com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin.C112491 */

            @Override // com.bytedance.ee.bear.sheet.orientation.C11252a.AbstractC11255a
            /* renamed from: a */
            public void mo43122a() {
                SheetUnspecifiedOrientationPlugin.this.mOrientationViewModel.setSource("sheet_m_portrait_button");
                SheetUnspecifiedOrientationPlugin.this.getActivity().setRequestedOrientation(1);
                SheetUnspecifiedOrientationPlugin.this.mOrientationViewModel.setRequestOrientation(1);
            }

            @Override // com.bytedance.ee.bear.sheet.orientation.C11252a.AbstractC11255a
            /* renamed from: b */
            public void mo43124b() {
                WebView b = SheetUnspecifiedOrientationPlugin.this.getWeb().mo19435b();
                if (b instanceof DocBridgeWebViewV2) {
                    ((DocBridgeWebViewV2) b).mo19616a();
                }
            }

            @Override // com.bytedance.ee.bear.sheet.orientation.C11252a.AbstractC11255a
            /* renamed from: a */
            public void mo43123a(boolean z) {
                int i;
                SheetUnspecifiedOrientationPlugin.this.mOrientationViewModel.setSource("sheet_m_landscape_button");
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                SheetUnspecifiedOrientationPlugin.this.getActivity().setRequestedOrientation(i);
                SheetUnspecifiedOrientationPlugin.this.mOrientationViewModel.setRequestOrientation(i);
            }
        });
        if (this.mSensorDetectorPlugin != null) {
            C1177w<AbstractC13696d> orientation = this.mSensorDetectorPlugin.getOrientation();
            this.mSensorOrientationState = orientation;
            orientation.mo5923a(getLifecycleOwner(), new AbstractC1178x() {
                /* class com.bytedance.ee.bear.sheet.orientation.$$Lambda$SheetUnspecifiedOrientationPlugin$UTkMdbNqOdflpxyZhgZJgDwynQ */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    SheetUnspecifiedOrientationPlugin.this.lambda$onAttachToHost$0$SheetUnspecifiedOrientationPlugin((AbstractC13696d) obj);
                }
            });
        }
        this.mOrientationViewModel.getLocked().mo5923a(getLifecycleOwner(), new AbstractC1178x<Boolean>() {
            /* class com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin.C112502 */

            /* renamed from: b */
            private boolean f30270b;

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (this.f30270b && Boolean.FALSE.equals(bool)) {
                    SheetUnspecifiedOrientationPlugin.this.mOrientationTipPresenter.mo43126a();
                    if (Boolean.TRUE.equals(SheetUnspecifiedOrientationPlugin.this.mOrientationViewModel.getEnable().mo5927b())) {
                        SheetUnspecifiedOrientationPlugin.this.getActivity().setRequestedOrientation(-1);
                        SheetUnspecifiedOrientationPlugin.this.mOrientationViewModel.setRequestOrientation(-1);
                    }
                }
                this.f30270b = Boolean.TRUE.equals(bool);
            }
        });
        this.mOrientationViewModel.getPanels().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.orientation.$$Lambda$SheetUnspecifiedOrientationPlugin$_6eUbrYoe2vtwqSMLAf2HsOABo */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SheetUnspecifiedOrientationPlugin.this.lambda$onAttachToHost$1$SheetUnspecifiedOrientationPlugin((Stack) obj);
            }
        });
        SelectionPlugin selectionPlugin = (SelectionPlugin) findPlugin(SelectionPlugin.class);
        if (selectionPlugin != null) {
            selectionPlugin.registerActionModeObserver(this.mOrientationTipPresenter);
        }
        ((C6095s) getHost()).mo24600o().mo23796a(new AbstractC5887o.AbstractC5888a() {
            /* class com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin.C112513 */

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadStart() {
                SheetUnspecifiedOrientationPlugin.this.isLoading = true;
            }

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadSuccess() {
                SheetUnspecifiedOrientationPlugin.this.isLoading = false;
            }

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadFail(int i, Throwable th) {
                SheetUnspecifiedOrientationPlugin.this.isLoading = false;
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.orientation.CommonOrientationPlugin, com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(sVar, nVar);
        sVar.mo24600o().mo23796a(this);
        this.mOrientationTipPresenter.mo43127a(getUIContainer().mo19584a(this, R.layout.sheet_orientation_tip));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        sVar.mo24600o().mo23799b(this);
    }
}

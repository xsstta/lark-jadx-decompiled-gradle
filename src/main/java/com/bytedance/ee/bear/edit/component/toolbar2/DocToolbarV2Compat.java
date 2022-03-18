package com.bytedance.ee.bear.edit.component.toolbar2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.C0513a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6237b;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6261g;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i;
import com.bytedance.ee.bear.edit.component.toolbar2.insertblock.InsertNewBlockFragment;
import com.bytedance.ee.bear.fileselector.FileSelectFragment;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class DocToolbarV2Compat extends AbstractC1142af implements AbstractC7624i, NonProguard {
    private ArrayMap<String, FragmentManager.AbstractC1010b> callbacksMap = new ArrayMap<>(2);
    private final C1177w<Boolean> handleKeyboard = new C1177w<>();
    private AbstractC1178x<Boolean> handleKeyboardObserver;
    private C0513a<String> registerSet = new C0513a<>(4);
    private final C1177w<String> showingPanel = new C1177w<>();
    private AbstractC1178x<String> showingPanelObserver;
    public AbstractC7624i.AbstractC7625a toolbarV2Delegate;

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public void onToolbarItemClick(String str) {
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public void forceClearToolbar() {
        AbstractC7624i.AbstractC7625a aVar = this.toolbarV2Delegate;
        if (aVar != null) {
            aVar.mo22160d();
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public boolean hasShowingPanel() {
        if (this.showingPanel.mo5927b() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public boolean isShowingFunctionPanel() {
        if (this.showingPanel.mo5927b() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public boolean onKeyboardToolbarItemClick() {
        AbstractC7624i.AbstractC7625a aVar = this.toolbarV2Delegate;
        if (aVar == null || !aVar.mo22158b("insertImage")) {
            return false;
        }
        handleKeyboard(true);
        return true;
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public void onToolbarChanged() {
        AbstractC7624i.AbstractC7625a aVar = this.toolbarV2Delegate;
        if (aVar != null && aVar.mo22155a() && this.toolbarV2Delegate.mo22156a("insertImage") && this.showingPanel.mo5927b() == null) {
            C13479a.m54764b("DocToolbarV2Compat", "onToolbarChanged: keyboard arise");
            handleKeyboard(true);
        }
    }

    public DocToolbarV2Compat() {
        this.registerSet.add(C6237b.class.getName());
        this.registerSet.add(InsertNewBlockFragment.class.getName());
        this.registerSet.add(C6261g.class.getName());
        this.registerSet.add(FileSelectFragment.class.getName());
    }

    public static AbstractC7624i of(FragmentActivity fragmentActivity) {
        return (AbstractC7624i) aj.m5366a(fragmentActivity).mo6005a(DocToolbarV2Compat.class);
    }

    public void handleKeyboard(boolean z) {
        this.handleKeyboard.mo5929b(Boolean.valueOf(z));
    }

    private void registerFragmentLifecycleCallbacks(FragmentManager fragmentManager) {
        C76001 r0 = new FragmentManager.AbstractC1010b() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.DocToolbarV2Compat.C76001 */

            @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
            /* renamed from: e */
            public void mo5411e(FragmentManager fragmentManager, Fragment fragment) {
                super.mo5411e(fragmentManager, fragment);
                DocToolbarV2Compat.this.handleOnFragmentViewDestroyed(fragment);
            }

            @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
            /* renamed from: b */
            public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                super.mo5406b(fragmentManager, fragment, bundle);
                boolean z = false;
                if (fragment.getArguments() != null && fragment.getArguments().getInt("select_type") == 4) {
                    z = true;
                }
                DocToolbarV2Compat.this.handleOnFragmentCreated(fragment, z);
            }
        };
        fragmentManager.registerFragmentLifecycleCallbacks(r0, false);
        this.callbacksMap.put(String.valueOf(fragmentManager.hashCode()), r0);
    }

    private void unregisterFragmentLifecycleCallbacks(FragmentManager fragmentManager) {
        FragmentManager.AbstractC1010b bVar;
        if (fragmentManager != null && (bVar = this.callbacksMap.get(String.valueOf(fragmentManager.hashCode()))) != null) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(bVar);
        }
    }

    public void setShowingPanel(String str) {
        this.showingPanel.mo5929b(str);
        C13479a.m54764b("DocToolbarV2Compat", "showingPanel: " + str);
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public void detach(C4943e eVar) {
        unregisterFragmentLifecycleCallbacks(eVar.mo19564f().getSupportFragmentManager());
        unregisterFragmentLifecycleCallbacks(eVar.mo19565g().mo19602g());
        this.showingPanel.mo5928b(this.showingPanelObserver);
        this.handleKeyboard.mo5928b(this.handleKeyboardObserver);
        this.showingPanel.mo5929b((String) null);
        this.handleKeyboard.mo5929b((Boolean) null);
        this.toolbarV2Delegate = null;
    }

    public void handleOnFragmentViewDestroyed(Fragment fragment) {
        C13479a.m54772d("DocToolbarV2Compat", "onFragmentViewDestroyed: " + fragment.getClass().getName());
        try {
            if (this.registerSet.contains(fragment.getClass().getName()) && TextUtils.equals(this.showingPanel.mo5927b(), fragment.getClass().getName())) {
                setShowingPanel(null);
                if (fragment instanceof AbstractC7624i.AbstractC7626b) {
                    handleKeyboard(((AbstractC7624i.AbstractC7626b) fragment).s_());
                } else {
                    handleKeyboard(true);
                }
            }
        } catch (Exception e) {
            C13479a.m54759a("DocToolbarV2Compat", "onFragmentCreated: ", e);
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7624i
    public void attach(C4943e eVar, AbstractC7624i.AbstractC7625a aVar) {
        this.toolbarV2Delegate = aVar;
        final FragmentActivity f = eVar.mo19564f();
        registerFragmentLifecycleCallbacks(f.getSupportFragmentManager());
        registerFragmentLifecycleCallbacks(eVar.mo19565g().mo19602g());
        f.getLifecycle().addObserver(new AbstractC1164j() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.DocToolbarV2Compat.C76012 */

            @Override // androidx.lifecycle.AbstractC1168n
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    C10548d.m43696a((Context) f);
                } else if (event == Lifecycle.Event.ON_STOP) {
                    C13479a.m54764b("DocToolbarV2Compat", "hide all toolbar");
                    if (DocToolbarV2Compat.this.toolbarV2Delegate == null) {
                        return;
                    }
                    if (!DocToolbarV2Compat.this.hasShowingPanel()) {
                        DocToolbarV2Compat.this.toolbarV2Delegate.mo22157b();
                    } else {
                        C13479a.m54758a("DocToolbarV2Compat", "showing insert image");
                    }
                }
            }
        });
        C1177w<String> wVar = this.showingPanel;
        $$Lambda$DocToolbarV2Compat$2kO3JJ00YG8lXVBJVvQk89gZJo r0 = $$Lambda$DocToolbarV2Compat$2kO3JJ00YG8lXVBJVvQk89gZJo.INSTANCE;
        this.showingPanelObserver = r0;
        wVar.mo5925a(r0);
        C1177w<Boolean> wVar2 = this.handleKeyboard;
        $$Lambda$DocToolbarV2Compat$OqYp_QJBUTAcOaENtSZFLh_fak8 r02 = new AbstractC1178x(f) {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.$$Lambda$DocToolbarV2Compat$OqYp_QJBUTAcOaENtSZFLh_fak8 */
            public final /* synthetic */ FragmentActivity f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                DocToolbarV2Compat.this.lambda$attach$1$DocToolbarV2Compat(this.f$1, (Boolean) obj);
            }
        };
        this.handleKeyboardObserver = r02;
        wVar2.mo5925a(r02);
    }

    public /* synthetic */ void lambda$attach$1$DocToolbarV2Compat(FragmentActivity fragmentActivity, Boolean bool) {
        C13479a.m54758a("DocToolbarV2Compat", "handleKeyboardObserver onChanged: " + bool);
        if (bool != null) {
            if (bool.booleanValue()) {
                AbstractC7624i.AbstractC7625a aVar = this.toolbarV2Delegate;
                if (aVar == null || !aVar.mo22155a()) {
                    C13479a.m54764b("DocToolbarV2Compat", "toolbar dismiss");
                } else {
                    C10548d.m43702b(fragmentActivity);
                }
            } else {
                C10548d.m43696a((Context) fragmentActivity);
            }
            AbstractC7624i.AbstractC7625a aVar2 = this.toolbarV2Delegate;
            if (aVar2 != null) {
                aVar2.mo22159c();
            }
        }
    }

    public void handleOnFragmentCreated(Fragment fragment, boolean z) {
        C13479a.m54772d("DocToolbarV2Compat", "onFragmentCreated: " + fragment.getClass().getName());
        try {
            if (this.registerSet.contains(fragment.getClass().getName()) && !z) {
                setShowingPanel(fragment.getClass().getName());
                handleKeyboard(false);
            }
        } catch (Exception e) {
            C13479a.m54759a("DocToolbarV2Compat", "onFragmentCreated: ", e);
        }
    }
}

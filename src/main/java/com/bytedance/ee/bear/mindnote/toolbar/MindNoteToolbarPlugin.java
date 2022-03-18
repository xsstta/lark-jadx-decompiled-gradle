package com.bytedance.ee.bear.mindnote.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.C0513a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.NavBarBottomInsetCompatEntity;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.fileselector.FileSelectFragment;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.KeyboardUtils;

public class MindNoteToolbarPlugin extends BaseToolbarPlugin<MindNoteToolbar> {
    private ArrayMap<String, FragmentManager.AbstractC1010b> callbacksMap = new ArrayMap<>(2);
    private C0513a<String> registerSet = new C0513a<>(4);
    private String showingPanel;
    private C10192c viewModel;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public String getToolbarJSBinderName() {
        return "biz.navigation.setMindnoteToolbar";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public BaseToolbarPlugin.AbstractC6202a<MindNoteToolbar> onCreateToolbarJSHandler() {
        return new C10188a();
    }

    /* renamed from: com.bytedance.ee.bear.mindnote.toolbar.MindNoteToolbarPlugin$a */
    private class C10188a implements BaseToolbarPlugin.AbstractC6202a<MindNoteToolbar> {

        /* renamed from: b */
        private AbstractC7947h f27484b;

        private C10188a() {
        }

        @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin.AbstractC6202a
        /* renamed from: a */
        public void mo22125a(ItemId itemId, String str) {
            if (this.f27484b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) itemId.name());
                jSONObject.put("value", (Object) str);
                this.f27484b.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(MindNoteToolbar mindNoteToolbar, AbstractC7947h hVar) {
            C13479a.m54772d("MindNoteToolbarPlugin", "Js update toolbar:" + mindNoteToolbar);
            if (mindNoteToolbar != null) {
                mindNoteToolbar.initFromJsBridge(MindNoteItemId.values());
            }
            this.f27484b = hVar;
            MindNoteToolbarPlugin mindNoteToolbarPlugin = MindNoteToolbarPlugin.this;
            if (mindNoteToolbar == null || mindNoteToolbar.getChildren().length == 0) {
                mindNoteToolbar = null;
            }
            mindNoteToolbarPlugin.updateToolbar(mindNoteToolbar);
        }
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        unregisterFragmentLifecycleCallbacks(getActivity().getSupportFragmentManager());
    }

    private void registerFragmentLifecycleCallbacks(FragmentManager fragmentManager) {
        C101871 r0 = new FragmentManager.AbstractC1010b() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.MindNoteToolbarPlugin.C101871 */

            @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
            /* renamed from: e */
            public void mo5411e(FragmentManager fragmentManager, Fragment fragment) {
                MindNoteToolbarPlugin.this.handleOnFragmentViewDestroyed(fragment);
                super.mo5411e(fragmentManager, fragment);
            }

            @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
            /* renamed from: b */
            public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                super.mo5406b(fragmentManager, fragment, bundle);
                MindNoteToolbarPlugin.this.handleOnFragmentCreated(fragment);
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

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public AbstractC6212e<MindNoteToolbar> getToolbarViewModel(FragmentActivity fragmentActivity) {
        C10192c cVar = (C10192c) aj.m5366a(getActivity()).mo6005a(C10192c.class);
        this.viewModel = cVar;
        return cVar;
    }

    public void handleOnFragmentCreated(Fragment fragment) {
        C13479a.m54772d("MindNoteToolbarPlugin", "onFragmentCreated: " + fragment.getClass().getName());
        try {
            if (this.registerSet.contains(fragment.getClass().getName())) {
                this.viewModel.setShowingFunctionPanel(true);
                KeyboardUtils.hideKeyboard(getActivity());
                this.showingPanel = fragment.getClass().getName();
            }
        } catch (Exception e) {
            C13479a.m54759a("MindNoteToolbarPlugin", "onFragmentCreated: ", e);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost(sVar);
        C6218f.m25065a().mo25153a(getActivity(), (NavBarBottomInsetCompatEntity) C4211a.m17514a().mo16532a("doc_toolbar_android_compat", NavBarBottomInsetCompatEntity.class, new NavBarBottomInsetCompatEntity()));
        registerFragmentLifecycleCallbacks(getActivity().getSupportFragmentManager());
        this.registerSet.add(C10193d.class.getName());
        this.registerSet.add(FileSelectFragment.class.getName());
    }

    public void handleOnFragmentViewDestroyed(Fragment fragment) {
        C13479a.m54772d("MindNoteToolbarPlugin", "onFragmentDestroyed: " + fragment.getClass().getName());
        try {
            if (this.registerSet.contains(fragment.getClass().getName())) {
                this.viewModel.setShowingFunctionPanel(false);
                if (TextUtils.equals(this.showingPanel, fragment.getClass().getName()) && this.viewModel.getCurrItemId() != ItemId.ConstId.keyboard) {
                    if ((this.viewModel.getCurrItemId() == this.viewModel.getLastItemId() || this.viewModel.getLastItemId() == null) && this.viewModel.getToolbar().mo5927b() != null) {
                        KeyboardUtils.showKeyboard(getActivity());
                        this.showingPanel = null;
                    } else if (this.viewModel.getToolbar().mo5927b() != null && this.viewModel.getExpandedSubToolbars().mo5927b().empty()) {
                        KeyboardUtils.showKeyboard(getActivity());
                        this.showingPanel = null;
                    }
                }
            }
            if (fragment.getClass().getName().equals(FileSelectFragment.class.getName())) {
                this.showingPanel = C10193d.class.getName();
            }
        } catch (Exception e) {
            C13479a.m54759a("MindNoteToolbarPlugin", "onFragmentDestroyed: ", e);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(sVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39925a((Long) 200L);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(sVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39925a((Long) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.BaseToolbarPlugin
    public Fragment onCreateToolbarFragment(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        BearUrl bearUrl = ((C6095s) getHost()).mo24598m().getBearUrl();
        BearUrl originBearUrl = ((C6095s) getHost()).mo24598m().getOriginBearUrl();
        if (originBearUrl != null && "wiki".equals(originBearUrl.f17446a)) {
            bundle.putString("origin_bear_url", originBearUrl.f17447b);
        }
        bundle.putParcelable("bear_url", bearUrl);
        return instantiateFragment(C10190b.class, bundle);
    }
}

package com.bytedance.ee.bear.sheet.tab;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.actionsheet.ActionSheetFragment;
import com.bytedance.ee.bear.sheet.actionsheet.ActionSheetItem;
import com.bytedance.ee.bear.sheet.actionsheet.ActionSheetViewModel;
import com.bytedance.ee.bear.sheet.actionsheet.RightIcon;
import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetModalPanelData;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabData;
import com.bytedance.ee.bear.sheet.tab.jsdata.SheetTabItem;
import com.bytedance.ee.bear.sheet.tab.model.SheetActionSheetModel;
import com.bytedance.ee.bear.sheet.tab.p549b.C11310a;
import com.bytedance.ee.bear.sheet.tab.view.C11320e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.larksuite.suite.R;
import java.util.Map;

public class SheetTabPlugin extends DocumentPlugin implements AbstractC6054a {
    public ActionSheetViewModel actionSheetViewModel;
    public boolean isDraggingTab;
    private ISheetTabView.Delegate listener;
    public UnspecifiedOrientationPlugin orientationPlugin;
    public C11308a setSheetModalHandler;
    public C11309b setSheetTabHandler;
    public C11310a sheetTabPresenter;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return false;
    }

    /* renamed from: com.bytedance.ee.bear.sheet.tab.SheetTabPlugin$a */
    private class C11308a implements AbstractC7945d<SheetModalPanelData> {

        /* renamed from: b */
        private AbstractC7947h f30408b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43320a() {
            m46978a("exit", "", "");
        }

        private C11308a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43321a(ActionSheetItem cVar) {
            SheetModalPanelData.ModalItem modalItem = (SheetModalPanelData.ModalItem) cVar.mo42039d();
            m46978a(modalItem.getId(), modalItem.getTableId(), "");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43322a(ActionSheetItem cVar, RightIcon hVar) {
            SheetModalPanelData.ModalItem modalItem = (SheetModalPanelData.ModalItem) cVar.mo42039d();
            m46978a(modalItem.getId(), modalItem.getTableId(), hVar.mo42065c());
        }

        /* renamed from: a */
        public void handle(SheetModalPanelData sheetModalPanelData, AbstractC7947h hVar) {
            C13479a.m54772d("SheetTabPlugin", "SetSheetModelHandler receives SheetModalPanelData: " + sheetModalPanelData);
            this.f30408b = hVar;
            if (SheetModalPanelData.isValid(sheetModalPanelData)) {
                SheetTabPlugin.this.actionSheetViewModel.getSheetsActionSheetModel().mo5929b(SheetActionSheetModel.m47014a(sheetModalPanelData));
                SheetTabPlugin.this.actionSheetViewModel.setActive(true);
                return;
            }
            SheetTabPlugin.this.actionSheetViewModel.setActive(false);
        }

        /* renamed from: a */
        private void m46978a(String str, String str2, String str3) {
            AbstractC7947h hVar = this.f30408b;
            if (hVar != null) {
                hVar.mo17188a(m46979b(str, str2, str3));
            }
        }

        /* renamed from: b */
        private JSONObject m46979b(String str, String str2, String str3) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) str);
            jSONObject.put("tableId", (Object) str2);
            jSONObject.put("iconId", (Object) str3);
            return jSONObject;
        }
    }

    private void dismissActionSheet() {
        this.actionSheetViewModel.setActive(false);
    }

    private void hideActionSheetFragment() {
        ActionSheetFragment actionSheetFragment = getActionSheetFragment();
        if (actionSheetFragment != null) {
            actionSheetFragment.mo5513b();
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.tab.SheetTabPlugin$b */
    private class C11309b implements AbstractC7945d<SheetTabData> {

        /* renamed from: b */
        private AbstractC7947h f30410b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43324a() {
            m46984a("add", "", null, null);
        }

        private C11309b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43327a(String str) {
            m46984a("operate", str, null, null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43326a(SheetTabItem sheetTabItem) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sheetId", (Object) sheetTabItem.getId());
            SheetTabPlugin.this.getWeb().mo19428a("window.lark.biz.sheet.onSwitchSheet", jSONObject);
        }

        /* renamed from: a */
        public void handle(SheetTabData sheetTabData, AbstractC7947h hVar) {
            this.f30410b = hVar;
            C13479a.m54772d("SheetTabPlugin", "SetSheetTabHandler receives sheetTabData: " + sheetTabData);
            if (sheetTabData == null || sheetTabData.getData() == null || sheetTabData.getData().isEmpty()) {
                SheetTabPlugin.this.sheetTabPresenter.mo43346c();
                return;
            }
            SheetTabPlugin.this.sheetTabPresenter.mo43345b();
            if (!SheetTabPlugin.this.isDraggingTab) {
                SheetTabPlugin.this.sheetTabPresenter.mo43343a(sheetTabData);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43328a(String str, int i, int i2) {
            m46984a("reorder", str, Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: a */
        private void m46984a(String str, String str2, Integer num, Integer num2) {
            AbstractC7947h hVar = this.f30410b;
            if (hVar != null) {
                hVar.mo17188a(m46985b(str, str2, num, num2));
            }
        }

        /* renamed from: b */
        private JSONObject m46985b(String str, String str2, Integer num, Integer num2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventId", (Object) str);
            jSONObject.put("sheetId", (Object) str2);
            jSONObject.put("sourceIndex", (Object) num);
            jSONObject.put("targetIndex", (Object) num2);
            return jSONObject;
        }
    }

    private ActionSheetFragment getActionSheetFragment() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(ActionSheetFragment.f29650e.mo42028a());
        if (findFragmentByTag instanceof ActionSheetFragment) {
            return (ActionSheetFragment) findFragmentByTag;
        }
        return null;
    }

    private void registerObserver() {
        this.actionSheetViewModel.getActive().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.tab.$$Lambda$SheetTabPlugin$EDvb5tgVFdqSNLoIewNLrlYqwq4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SheetTabPlugin.this.lambda$registerObserver$0$SheetTabPlugin((Boolean) obj);
            }
        });
    }

    private void initListenerAndPresenter() {
        if (this.listener == null) {
            this.listener = new ISheetTabView.Delegate() {
                /* class com.bytedance.ee.bear.sheet.tab.SheetTabPlugin.C113072 */

                @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView.Delegate
                /* renamed from: a */
                public void mo43314a() {
                    C13479a.m54772d("SheetTabPlugin", "onClickAddView.");
                    if (SheetTabPlugin.this.setSheetTabHandler != null) {
                        SheetTabPlugin.this.setSheetTabHandler.mo43324a();
                    }
                }

                @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView.Delegate
                /* renamed from: b */
                public void mo43318b() {
                    if (SheetTabPlugin.this.orientationPlugin != null) {
                        SheetTabPlugin.this.orientationPlugin.setAnalyticSource("exit_landscape_btn");
                        SheetTabPlugin.this.orientationPlugin.forcePortrait();
                    }
                }

                @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView.Delegate
                /* renamed from: a */
                public void mo43317a(boolean z) {
                    SheetTabPlugin.this.isDraggingTab = z;
                }

                @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabAdapter.OnSheetTabItemActionListener
                /* renamed from: b */
                public void mo43319b(SheetTabItem sheetTabItem) {
                    C13479a.m54772d("SheetTabPlugin", "onDoubleClickTabItem : " + sheetTabItem);
                    if (SheetTabPlugin.this.setSheetTabHandler != null) {
                        SheetTabPlugin.this.setSheetTabHandler.mo43327a(sheetTabItem.getId());
                    }
                }

                @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabAdapter.OnSheetTabItemActionListener
                /* renamed from: a */
                public void mo43316a(SheetTabItem sheetTabItem) {
                    C13479a.m54772d("SheetTabPlugin", "onClickTabItem : " + sheetTabItem);
                    if (SheetTabPlugin.this.setSheetTabHandler != null) {
                        SheetTabPlugin.this.setSheetTabHandler.mo43326a(sheetTabItem);
                    }
                }

                @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabView.Delegate
                /* renamed from: a */
                public void mo43315a(int i, SheetTabItem sheetTabItem, int i2) {
                    C13479a.m54772d("SheetTabPlugin", "onMoveTabItem: srcPos=" + i + ", destPos=" + i2 + ", sheetId=" + sheetTabItem.getId());
                    if (SheetTabPlugin.this.setSheetTabHandler != null) {
                        SheetTabPlugin.this.setSheetTabHandler.mo43328a(sheetTabItem.getId(), i, i2);
                    }
                }
            };
        }
        if (this.sheetTabPresenter == null) {
            this.sheetTabPresenter = new C11310a(new C11320e(), C13653a.m55399c(getContext()));
        }
        this.sheetTabPresenter.mo43342a(getUIContainer().mo19583a(R.id.sheet_tab));
        this.sheetTabPresenter.mo43344a(this.listener);
    }

    private void showActionSheetFragment() {
        if (getActionSheetFragment() == null) {
            ((DialogInterface$OnCancelListenerC1021b) instantiateFragment(ActionSheetFragment.class)).mo5511a(getFragmentManager(), ActionSheetFragment.f29650e.mo42028a());
            C13608f.m55249a($$Lambda$REzVk7mugNfu651it_bs0ibKFLQ.INSTANCE);
            return;
        }
        C13479a.m54775e("SheetTabPlugin", "showActionSheetFragment, fragment exist");
    }

    private void updateSheetTab(Configuration configuration) {
        this.sheetTabPresenter.mo43341a(configuration);
    }

    public /* synthetic */ void lambda$registerObserver$0$SheetTabPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            showActionSheetFragment();
        } else {
            hideActionSheetFragment();
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismissActionSheet();
        updateSheetTab(configuration);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        C11309b bVar = new C11309b();
        this.setSheetTabHandler = bVar;
        map.put("biz.sheet.setSheetTabs", bVar);
        C11308a aVar = new C11308a();
        this.setSheetModalHandler = aVar;
        map.put("biz.sheet.setSheetModal", aVar);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        ActionSheetViewModel fVar = (ActionSheetViewModel) viewModel(ActionSheetViewModel.class);
        this.actionSheetViewModel = fVar;
        fVar.setDelegate(new ActionSheetViewModel.Delegate() {
            /* class com.bytedance.ee.bear.sheet.tab.SheetTabPlugin.C113061 */

            @Override // com.bytedance.ee.bear.sheet.actionsheet.ActionSheetViewModel.Delegate
            /* renamed from: a */
            public void mo42062a() {
                C13479a.m54772d("SheetTabPlugin", "SheetsActionSheetViewModel.onCancel");
                if (SheetTabPlugin.this.setSheetModalHandler != null) {
                    SheetTabPlugin.this.setSheetModalHandler.mo43320a();
                }
            }

            @Override // com.bytedance.ee.bear.sheet.actionsheet.ActionSheetViewModel.Delegate
            /* renamed from: a */
            public void mo42063a(ActionSheetItem cVar) {
                C13479a.m54772d("SheetTabPlugin", "SheetsActionSheetViewModel.onClickItem: " + cVar);
                if (SheetTabPlugin.this.setSheetModalHandler != null) {
                    SheetTabPlugin.this.setSheetModalHandler.mo43321a(cVar);
                }
            }

            @Override // com.bytedance.ee.bear.sheet.actionsheet.ActionSheetViewModel.Delegate
            /* renamed from: a */
            public void mo42064a(ActionSheetItem cVar, RightIcon hVar) {
                C13479a.m54772d("SheetTabPlugin", "SheetsActionSheetViewModel.onClickItemRightIcon: " + cVar);
                if (SheetTabPlugin.this.setSheetModalHandler != null) {
                    SheetTabPlugin.this.setSheetModalHandler.mo43322a(cVar, hVar);
                }
            }
        });
        registerObserver();
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        dismissActionSheet();
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        View.inflate(getContext(), R.layout.sheet_tab, (ViewGroup) nVar.mo19583a(R.id.titleContentLayout));
        this.orientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        initListenerAndPresenter();
        updateSheetTab(getResources().getConfiguration());
    }
}

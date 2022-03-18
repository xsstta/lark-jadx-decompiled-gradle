package com.bytedance.ee.bear.sheet.celldropdown;

import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.document.selection.AbstractC6124a;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.celldropdown.C11082c;
import com.bytedance.ee.bear.sheet.celldropdown.DropdownData;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class SheetDropdownPlugin extends DocumentPlugin implements AbstractC6054a, AbstractC6124a {
    private C11082c.AbstractC11083a delegate;
    private AbstractC1178x<Boolean> observer;
    public C11075b showDropdownHandler;
    public C11082c viewModel;

    @Override // com.bytedance.ee.bear.document.selection.AbstractC6124a
    public void onPrepareActionMode() {
    }

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return false;
    }

    private void hideDropDown() {
        C11080b dropdownFragment = getDropdownFragment();
        if (dropdownFragment != null) {
            dropdownFragment.mo5513b();
        }
    }

    private C11080b getDropdownFragment() {
        return (C11080b) getActivity().getSupportFragmentManager().findFragmentByTag("DropdownPopupFragment");
    }

    private void showDropdown() {
        if (getDropdownFragment() == null) {
            ((C11080b) instantiateFragment(C11080b.class)).mo5511a(getActivity().getSupportFragmentManager(), "DropdownPopupFragment");
        }
    }

    @Override // com.bytedance.ee.bear.document.selection.AbstractC6124a
    public void onDestroyActionMode() {
        C13479a.m54772d("SheetDropdownPlugin", "ActionModeObserver");
        execJS("window.lark.biz.sheet.onContextMenuHidden", new JSONObject());
    }

    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.SheetDropdownPlugin$a */
    private class C11074a implements AbstractC7945d<Void> {
        private C11074a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            C13479a.m54764b("SheetDropdownPlugin", "hide dropdown...");
            SheetDropdownPlugin.this.viewModel.setShowDropdown(false);
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.SheetDropdownPlugin$b */
    private class C11075b implements AbstractC7945d<DropdownData> {

        /* renamed from: a */
        public AbstractC7947h f29753a;

        private C11075b() {
        }

        /* renamed from: a */
        public void handle(DropdownData dropdownData, AbstractC7947h hVar) {
            C13479a.m54764b("SheetDropdownPlugin", "show dropdown, dropdown data.");
            if (dropdownData != null) {
                DropdownData.C11072a[] parseToDropdownArray = dropdownData.parseToDropdownArray();
                this.f29753a = hVar;
                SheetDropdownPlugin.this.viewModel.setShowDropdown(true);
                SheetDropdownPlugin.this.viewModel.setTextColor(dropdownData.getTextColor());
                SheetDropdownPlugin.this.viewModel.setData(parseToDropdownArray);
                SheetDropdownPlugin.this.viewModel.setIsMultiple(dropdownData.isMulti());
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        C11075b bVar = new C11075b();
        this.showDropdownHandler = bVar;
        map.put("biz.sheet.showDropdown", bVar);
        map.put("biz.sheet.hideDropdown", new C11074a());
    }

    public /* synthetic */ void lambda$onAttachToHost$0$SheetDropdownPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            showDropdown();
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
            if (unspecifiedOrientationPlugin != null) {
                unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
                return;
            }
            return;
        }
        hideDropDown();
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin2 = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin2 != null) {
            unspecifiedOrientationPlugin2.onOrientationSupportPanelDismiss(this);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.viewModel = (C11082c) viewModel(C11082c.class);
        this.delegate = new C11082c.AbstractC11083a() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.SheetDropdownPlugin.C110731 */

            @Override // com.bytedance.ee.bear.sheet.celldropdown.C11082c.AbstractC11083a
            /* renamed from: a */
            public void mo42218a() {
                C13479a.m54772d("SheetDropdownPlugin", "cancel dropdown...");
                SheetDropdownPlugin.this.execJS("window.lark.biz.sheet.dropdown.onCancel", new JSONObject());
            }

            @Override // com.bytedance.ee.bear.sheet.celldropdown.C11082c.AbstractC11083a
            /* renamed from: b */
            public void mo42220b() {
                C13479a.m54772d("SheetDropdownPlugin", "click keyboard icon...");
                SheetDropdownPlugin.this.viewModel.setShowDropdown(false);
                SheetDropdownPlugin.this.execJS("window.lark.biz.sheet.dropdown.onSwitchToKeyboard", new JSONObject());
            }

            @Override // com.bytedance.ee.bear.sheet.celldropdown.C11082c.AbstractC11083a
            /* renamed from: a */
            public void mo42219a(String str) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("val", (Object) str);
                C13479a.m54772d("SheetDropdownPlugin", "click dropdown item : " + jSONObject.toString());
                if (SheetDropdownPlugin.this.showDropdownHandler.f29753a != null) {
                    SheetDropdownPlugin.this.showDropdownHandler.f29753a.mo17188a(jSONObject);
                }
            }
        };
        this.observer = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.celldropdown.$$Lambda$SheetDropdownPlugin$v2YQ_GhJp1Ihv5WrVGLhjAoEtQQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SheetDropdownPlugin.this.lambda$onAttachToHost$0$SheetDropdownPlugin((Boolean) obj);
            }
        };
        SelectionPlugin selectionPlugin = (SelectionPlugin) findPlugin(SelectionPlugin.class);
        if (selectionPlugin != null) {
            selectionPlugin.registerActionModeObserver(this);
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.viewModel.getActive().mo5928b(this.observer);
        this.viewModel.setDelegate(null);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.viewModel.setDelegate(this.delegate);
        this.viewModel.getShowDropdown().mo5923a(getLifecycleOwner(), this.observer);
        sVar.mo24599n().registerEditPanel(getLifecycleOwner(), this.viewModel);
    }
}

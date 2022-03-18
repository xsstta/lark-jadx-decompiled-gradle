package com.bytedance.ee.bear.sheet.inputbar;

import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.at.C5664d;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.C11211a;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.EmbedImageSegment;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetInputData;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetUpdateData;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum;
import com.bytedance.ee.log.C13479a;
import java.util.List;

public class SheetEditPlugin extends DocumentPlugin implements AbstractC6054a {
    private AbstractC1178x<Boolean> mObserver;
    public C11219d mViewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    private void clearBadges() {
        String[] badges = this.mViewModel.getBadges();
        if (badges != null && badges.length > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("panelName", "toolbar");
            jSONObject.put("badges", (Object) badges);
            execJS("javascript:window.lark.biz.sheet.clearBadges", jSONObject);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.SheetEditPlugin$a */
    public class C11187a implements AbstractC7945d<SheetInputData> {
        private C11187a() {
        }

        /* renamed from: a */
        public void handle(SheetInputData sheetInputData, AbstractC7947h hVar) {
            C13479a.m54772d("SheetEditPlugin", "handle: inputData = " + sheetInputData);
            if (sheetInputData == null || sheetInputData.getData() == null) {
                SheetEditPlugin.this.mViewModel.setActive(false);
                return;
            }
            SheetInputData.InputData data = sheetInputData.getData();
            data.setSegments(C11211a.m46611a(data.getValue()));
            SheetEditPlugin.this.mViewModel.setSegment(data.getSegments());
            SheetEditPlugin.this.mViewModel.setActive(true);
            SheetEditPlugin.this.mViewModel.setToolbarItems(sheetInputData.getToolbarItems());
            SheetEditPlugin.this.mViewModel.updateInput(sheetInputData.getData());
            SheetEditPlugin.this.mViewModel.setHideFab(Boolean.valueOf(sheetInputData.isHideFAB()));
        }
    }

    private void notifyOrientationSupportPanelState(Boolean bool) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            if (Boolean.TRUE.equals(bool)) {
                unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
            } else {
                unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
            }
        }
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$2$SheetEditPlugin(ToolbarItemEnum toolbarItemEnum) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) toolbarItemEnum.name());
        execJS("javascript:lark.biz.sheet.onToolbarClick", jSONObject);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C5664d.m22980a();
        this.mViewModel = (C11219d) C4950k.m20478a(sVar, C11219d.class);
        this.mObserver = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$SheetEditPlugin$Yk5FY7h8LCSObnJera6uJRw3ZmM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SheetEditPlugin.this.lambda$onAttachToHost$0$SheetEditPlugin((Boolean) obj);
            }
        };
    }

    private boolean shouldHandleEmbedImageSegment(List<BaseSegment> list) {
        List<BaseSegment> segment = this.mViewModel.getSegment();
        if (segment == null || !list.isEmpty()) {
            return false;
        }
        for (BaseSegment baseSegment : segment) {
            if (baseSegment instanceof EmbedImageSegment) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void lambda$onAttachToHost$0$SheetEditPlugin(Boolean bool) {
        C13479a.m54772d("SheetEditPlugin", "observe active = " + bool);
        notifyOrientationSupportPanelState(bool);
        if (Boolean.TRUE.equals(bool)) {
            addOrReplaceFragment(C11215c.class);
            return;
        }
        removeFragment();
        clearBadges();
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.mViewModel.setEditDelegate(null);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        bindBridgeHandlerAutoUnbind("biz.sheet.showInput", new C11187a());
        sVar.mo24599n().registerEditPanel(getLifecycleOwner(), this.mViewModel);
        this.mViewModel.getActive().mo5923a(getLifecycleOwner(), this.mObserver);
        this.mViewModel.setEditDelegate(new AbstractC11188a() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$SheetEditPlugin$B4IRtRVPOHWj7wIJUzQPEdGAZM */

            @Override // com.bytedance.ee.bear.sheet.inputbar.AbstractC11188a
            public final void updateSheetEdit(int i, List list, String str, String str2) {
                SheetEditPlugin.this.lambda$onAttachToUIContainer$1$SheetEditPlugin(i, list, str, str2);
            }
        });
        this.mViewModel.onToolbarItemClicked().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$SheetEditPlugin$I6kkdvn2icWY8GQX2FIkZ8s6Cw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SheetEditPlugin.this.lambda$onAttachToUIContainer$2$SheetEditPlugin((ToolbarItemEnum) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$1$SheetEditPlugin(int i, List list, String str, String str2) {
        if (shouldHandleEmbedImageSegment(list)) {
            list = this.mViewModel.getSegment();
        } else {
            this.mViewModel.setSegment(null);
        }
        execJS("javascript:lark.biz.sheet.onUpdateEdit", new SheetUpdateData(i, list, str, str2));
    }
}

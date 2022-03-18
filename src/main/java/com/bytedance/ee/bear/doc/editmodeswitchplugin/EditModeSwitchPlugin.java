package com.bytedance.ee.bear.doc.editmodeswitchplugin;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelStoreOwner;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4940b;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.DocReport;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.edit.component.toolbar2.DocToolbarV2Compat;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.templates.AbstractC11437a;
import com.bytedance.ee.bear.templates.p552a.AbstractC11438a;
import com.bytedance.ee.bear.widgets.button.CommonEditButton;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class EditModeSwitchPlugin extends DocumentPluginV2 implements TitleBar.AbstractC4938a, AbstractC5887o.AbstractC5888a {
    private boolean isLoadDocSuccess;
    public DocReport mDocReport;
    private CommonEditButton mEditModeSwitchView;

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadStart() {
        hideButton();
        this.isLoadDocSuccess = false;
    }

    public void hideButton() {
        CommonEditButton commonEditButton = this.mEditModeSwitchView;
        if (commonEditButton != null && commonEditButton.getVisibility() == 0) {
            C13479a.m54764b("EditModeSwitchPlugin", "hide button");
            this.mEditModeSwitchView.setVisibility(8);
        }
    }

    public void observeEditSwitchHeight() {
        AbstractC11437a a = ((AbstractC11438a) KoinJavaComponent.m268610a(AbstractC11438a.class)).mo43931a((ViewModelStoreOwner) getActivity());
        a.getPanelActive().mo5923a(getLifecycleOwner(), new AbstractC1178x(a) {
            /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.$$Lambda$EditModeSwitchPlugin$1iUHZUcXno4poWcUeJDiN9uzAWU */
            public final /* synthetic */ AbstractC11437a f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                EditModeSwitchPlugin.this.lambda$observeEditSwitchHeight$0$EditModeSwitchPlugin(this.f$1, (Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadSuccess() {
        C13479a.m54764b("EditModeSwitchPlugin", "load success, token is " + C13598b.m55197d(getDocumentMetadata().getToken()));
        this.isLoadDocSuccess = true;
    }

    public void showButton() {
        CommonEditButton commonEditButton = this.mEditModeSwitchView;
        if (commonEditButton != null && commonEditButton.getVisibility() == 8) {
            C13479a.m54764b("EditModeSwitchPlugin", "show button");
            this.mEditModeSwitchView.setVisibility(0);
            if (getDocumentMetadata().isAnnounceDoc()) {
                this.mEditModeSwitchView.postDelayed(new Runnable() {
                    /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin.RunnableC54101 */

                    public void run() {
                        EditModeSwitchPlugin.this.observeEditSwitchHeight();
                    }
                }, 100);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin$a */
    public class C5411a implements AbstractC7945d<String> {

        /* renamed from: b */
        private Boolean f15466b;

        private C5411a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m21987a(View view) {
            EditModeSwitchPlugin.this.mDocReport.mo22999a("back");
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m21988b(View view) {
            EditModeSwitchPlugin.this.getActivity().onBackPressed();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m21989c(View view) {
            EditModeSwitchPlugin.this.mDocReport.mo22999a("done");
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m21990d(View view) {
            EditModeSwitchPlugin.this.dispatchBridgeMsg("window.lark.biz.completeButton.click", new JSONObject());
            EditModeSwitchPlugin.this.getTitleBar().mo19509a(R.color.text_title);
            DocToolbarV2Compat.of(EditModeSwitchPlugin.this.getActivity()).forceClearToolbar();
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            if (EditModeSwitchPlugin.this.isUIContainerDetached()) {
                C13479a.m54775e("EditModeSwitchPlugin", "CompleteButtonVisibleHandler receive h5 CompleteButtonVisibleHandler info, but isUIContainerDetached");
            } else if (str == null) {
                C13479a.m54775e("EditModeSwitchPlugin", "set complete button status failed, data is null");
            } else {
                try {
                    EditModeCompleteButtonVisibleInfo editModeCompleteButtonVisibleInfo = (EditModeCompleteButtonVisibleInfo) JSONObject.parseObject(str).toJavaObject(EditModeCompleteButtonVisibleInfo.class);
                    if (editModeCompleteButtonVisibleInfo == null) {
                        C13479a.m54775e("EditModeSwitchPlugin", "parse json failed");
                    } else if (editModeCompleteButtonVisibleInfo.isVisible()) {
                        Boolean valueOf = Boolean.valueOf(EditModeSwitchPlugin.this.getTitleBar().mo19520b());
                        this.f15466b = valueOf;
                        if (!valueOf.booleanValue()) {
                            EditModeSwitchPlugin.this.getTitleBar().mo19525e(true);
                        }
                        EditModeSwitchPlugin.this.getTitleBar().mo19508a().mo45075a(R.drawable.doc_edit_complete_icon, R.color.primary_pri_500);
                        EditModeSwitchPlugin.this.getTitleBar().mo19508a().setLeftClickListener(new View.OnClickListener() {
                            /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.$$Lambda$EditModeSwitchPlugin$a$sA2LoLW9NQ43tNNBkm3ix7ZWU4 */

                            public final void onClick(View view) {
                                EditModeSwitchPlugin.C5411a.this.m21990d(view);
                            }
                        });
                        EditModeSwitchPlugin.this.getTitleBar().mo19508a().setLeftExtraClickListener(new View.OnClickListener() {
                            /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.$$Lambda$EditModeSwitchPlugin$a$mkjOVe70GRxIo9dURQEaEtbsI1I */

                            public final void onClick(View view) {
                                EditModeSwitchPlugin.C5411a.this.m21989c(view);
                            }
                        });
                    } else {
                        if (this.f15466b != null) {
                            EditModeSwitchPlugin.this.getTitleBar().mo19525e(this.f15466b.booleanValue());
                        }
                        EditModeSwitchPlugin.this.getTitleBar().mo19508a().mo45075a(R.drawable.ud_icon_left_outlined, R.color.facade_selector_icon_n1);
                        EditModeSwitchPlugin.this.getTitleBar().mo19508a().setLeftClickListener(new View.OnClickListener() {
                            /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.$$Lambda$EditModeSwitchPlugin$a$faP37zduA8j8cxhvTl9_cPB0c */

                            public final void onClick(View view) {
                                EditModeSwitchPlugin.C5411a.this.m21988b(view);
                            }
                        });
                        EditModeSwitchPlugin.this.getTitleBar().mo19508a().setLeftExtraClickListener(new View.OnClickListener() {
                            /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.$$Lambda$EditModeSwitchPlugin$a$Ti86HtV1xuiT_NOUX6EVBYyg9ZQ */

                            public final void onClick(View view) {
                                EditModeSwitchPlugin.C5411a.this.m21987a(view);
                            }
                        });
                    }
                } catch (Exception e) {
                    C13479a.m54761a("EditModeSwitchPlugin", e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin$b */
    private class C5412b implements AbstractC7945d<String> {
        private C5412b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            EditModeSwitchButtonVisibleInfo editModeSwitchButtonVisibleInfo = (EditModeSwitchButtonVisibleInfo) JSONObject.parseObject(str, EditModeSwitchButtonVisibleInfo.class);
            if (editModeSwitchButtonVisibleInfo != null) {
                C13479a.m54764b("EditModeSwitchPlugin", "json visible info is " + editModeSwitchButtonVisibleInfo.isVisible() + " token " + C13598b.m55197d(EditModeSwitchPlugin.this.getDocumentMetadata().getToken()));
                if (editModeSwitchButtonVisibleInfo.isVisible()) {
                    EditModeSwitchPlugin.this.showButton();
                } else {
                    EditModeSwitchPlugin.this.hideButton();
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        getEditorAbility().mo24600o().mo23799b(this);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.editButton.setVisible", new C5412b());
        map.put("biz.completeButton.setVisible", new C5411a());
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$1$EditModeSwitchPlugin(View view) {
        C13479a.m54764b("EditModeSwitchPlugin", "click button enter edit mode");
        dispatchBridgeMsg("window.lark.biz.editButton.clickEdit", new JSONObject());
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        getEditorAbility().mo24600o().mo23796a(this);
        this.mDocReport = new DocReport(C5084ad.m20847d(), C5234y.m21391b(), C4511g.m18594d(), C5102ai.m20872j(), C4511g.m18594d().mo17367q());
        observeEditSwitchHeight();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar.AbstractC4938a
    public void onTitleBarStateChanged(C4940b bVar) {
        int i;
        if (this.isLoadDocSuccess && this.mEditModeSwitchView != null) {
            float f = (((float) C5413a.f15468a) * 1.0f) / ((float) (C5413a.f15468a - C5413a.f15469b));
            float f2 = 1.0f - f;
            if (bVar.f14504d > f2) {
                i = (int) (((f2 - bVar.f14504d) / (-f)) * ((float) C5413a.f15468a));
            } else {
                i = (int) (((f2 - bVar.f14504d) / f2) * ((float) C5413a.f15469b));
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mEditModeSwitchView.getLayoutParams();
            layoutParams.bottomMargin = i;
            this.mEditModeSwitchView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        getTitleBar().mo19517b(this);
        CommonEditButton commonEditButton = this.mEditModeSwitchView;
        if (commonEditButton != null) {
            nVar.mo19594b(this, commonEditButton);
            this.mEditModeSwitchView = null;
        }
    }

    public /* synthetic */ void lambda$observeEditSwitchHeight$0$EditModeSwitchPlugin(AbstractC11437a aVar, Boolean bool) {
        int i;
        if (this.mEditModeSwitchView != null && aVar.getPanelLocOnScreenS() != null) {
            int i2 = aVar.getPanelLocOnScreenS()[1];
            if (bool.booleanValue()) {
                i = i2 - 350;
            } else {
                i = i2 + LocationRequest.PRIORITY_HD_ACCURACY;
            }
            this.mEditModeSwitchView.setY((float) i);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        if (this.mEditModeSwitchView == null) {
            CommonEditButton commonEditButton = new CommonEditButton(getContext());
            this.mEditModeSwitchView = commonEditButton;
            commonEditButton.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.doc.editmodeswitchplugin.$$Lambda$EditModeSwitchPlugin$dwbfvDmiE89wkQqQlXQ2mnCWAXs */

                public final void onClick(View view) {
                    EditModeSwitchPlugin.this.lambda$onAttachToUIContainer$1$EditModeSwitchPlugin(view);
                }
            });
            nVar.mo19588a(this, this.mEditModeSwitchView);
        }
        getTitleBar().mo19511a(this);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadFail(int i, Throwable th) {
        C13479a.m54765b("EditModeSwitchPlugin", "load fail, token is " + C13598b.m55197d(getDocumentMetadata().getToken()) + " code is " + i, th);
        hideButton();
        this.isLoadDocSuccess = false;
    }
}

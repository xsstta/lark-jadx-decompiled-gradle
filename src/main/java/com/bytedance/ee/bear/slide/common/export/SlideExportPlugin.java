package com.bytedance.ee.bear.slide.common.export;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.menu.C5874b;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.slide.common.export.View$OnClickListenerC11415g;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class SlideExportPlugin extends DocumentPlugin implements AbstractC5089af.AbstractC5090a, AbstractC7664b, AbstractC7666d {
    public C11410f mExportPresenter;
    private View$OnClickListenerC11415g mExportSelectFragment;
    public SlideExportView mExportView;
    private C1177w<Integer> mPageStatus;
    private C11409e mSlideExportAnalytic;

    public C11410f getExportPresenter() {
        return this.mExportPresenter;
    }

    public void handleMultiPictureReady() {
        getUIContainer().mo19597c(this);
    }

    public /* synthetic */ void lambda$handleLongPictureReady$0$SlideExportPlugin() {
        this.mExportPresenter.mo43677h();
    }

    public void handleMultiPictureEnd() {
        getPageStatus().mo5929b((Integer) 0);
    }

    public C1177w<Integer> getPageStatus() {
        if (this.mPageStatus == null) {
            C1177w<Integer> wVar = new C1177w<>();
            this.mPageStatus = wVar;
            wVar.mo5929b((Integer) 0);
        }
        return this.mPageStatus;
    }

    public void handleLongPictureReady() {
        C10548d.m43696a((Context) getActivity());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$SlideExportPlugin$j0EwClmxSsND63LuxWhoSe1_yg */

            public final void run() {
                SlideExportPlugin.this.lambda$handleLongPictureReady$0$SlideExportPlugin();
            }
        }, 500);
    }

    public void initExport() {
        if (this.mExportPresenter == null) {
            this.mExportPresenter = new C11410f(getActivity(), getServiceProvider(), getWeb(), getDocViewModel(), this.mSlideExportAnalytic);
        }
        if (this.mExportView != null) {
            getUIContainer().mo19594b(this, this.mExportView);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        C13479a.m54764b("SlideExportPlugin", "slide export plugin onBackPressed()...");
        if (this.mExportPresenter == null) {
            return false;
        }
        if (getPageStatus().mo5927b() == null || getPageStatus().mo5927b().intValue() == 0) {
            this.mExportPresenter.mo43632d();
            return this.mExportPresenter.mo43633e();
        }
        this.mExportPresenter.mo43670a(new JSONObject());
        return true;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5089af.AbstractC5090a
    public void onRequestExport() {
        if (this.mSlideExportAnalytic == null) {
            this.mSlideExportAnalytic = new C11409e(getDocViewModel(), C5234y.m21391b());
        }
        View$OnClickListenerC11415g gVar = (View$OnClickListenerC11415g) instantiateFragment(View$OnClickListenerC11415g.class);
        getUIContainer().mo19589a(this, gVar);
        this.mExportSelectFragment = gVar;
        gVar.mo43680a(new View$OnClickListenerC11415g.AbstractC11416a() {
            /* class com.bytedance.ee.bear.slide.common.export.SlideExportPlugin.C113891 */

            @Override // com.bytedance.ee.bear.slide.common.export.View$OnClickListenerC11415g.AbstractC11416a
            /* renamed from: a */
            public void mo43614a(boolean z) {
                if (z) {
                    SlideExportPlugin.this.getPageStatus().mo5929b((Integer) 0);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pageStatus", (Object) "MAIN");
                    SlideExportPlugin.this.mExportPresenter.mo43670a(jSONObject);
                }
                SlideExportPlugin.this.getUIContainer().mo19597c(SlideExportPlugin.this);
            }

            @Override // com.bytedance.ee.bear.slide.common.export.View$OnClickListenerC11415g.AbstractC11416a
            /* renamed from: a */
            public void mo43613a(String str) {
                SlideExportPlugin.this.initExport();
                if (str.equals("pdf")) {
                    SlideExportPlugin slideExportPlugin = SlideExportPlugin.this;
                    slideExportPlugin.mExportView = (SlideExportView) slideExportPlugin.getUIContainer().mo19584a(SlideExportPlugin.this, R.layout.slide_export_fragment_layout);
                    SlideExportPlugin.this.mExportPresenter.mo43671a(SlideExportPlugin.this.mExportView);
                    SlideExportPlugin.this.mExportPresenter.mo43674a(str, "");
                } else if (str.equals("longPicture")) {
                    SlideExportPlugin slideExportPlugin2 = SlideExportPlugin.this;
                    slideExportPlugin2.mExportView = (SlideExportView) slideExportPlugin2.getUIContainer().mo19584a(SlideExportPlugin.this, R.layout.slide_export_fragment_layout);
                    SlideExportPlugin.this.mExportPresenter.mo43671a(SlideExportPlugin.this.mExportView);
                    SlideExportPlugin.this.mExportPresenter.mo43674a(str, "");
                } else if (str.equals("multiPicture")) {
                    SlideExportPlugin.this.getPageStatus().mo5929b((Integer) 2);
                    SlideExportPlugin.this.mExportPresenter.mo43673a(str);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.common.export.SlideExportPlugin$a */
    public class C11390a implements AbstractC7945d<SlideExportModel> {
        private C11390a() {
        }

        /* renamed from: a */
        public void handle(SlideExportModel slideExportModel, AbstractC7947h hVar) {
            if (slideExportModel == null) {
                if (!(SlideExportPlugin.this.getPageStatus().mo5927b() == null || SlideExportPlugin.this.getPageStatus().mo5927b().intValue() == 0)) {
                    SlideExportPlugin.this.getPageStatus().mo5929b((Integer) 0);
                }
                Toast.showFailureText(SlideExportPlugin.this.getContext(), SlideExportPlugin.this.getString(R.string.Slide_Slide_Export_Failed), 0);
            } else if (slideExportModel.getType() == 1 && slideExportModel.getStatus() == 1) {
                SlideExportPlugin.this.handleLongPictureReady();
            } else if (slideExportModel.getType() == 2) {
                if (slideExportModel.getStatus() == 1) {
                    SlideExportPlugin.this.handleMultiPictureReady();
                } else if (slideExportModel.getStatus() == 2 && slideExportModel.getExt() != null && slideExportModel.getExt().size() >= 1) {
                    SlideExportPlugin.this.handleMultiPictureStart(slideExportModel.parseExtToString());
                } else if (slideExportModel.getStatus() == 3) {
                    SlideExportPlugin.this.handleMultiPictureEnd();
                }
            } else if (slideExportModel.getType() == 3) {
                if (slideExportModel.getStatus() == 1) {
                    SlideExportPlugin.this.getPageStatus().mo5929b((Integer) 3);
                }
                if (slideExportModel.getStatus() == 3) {
                    SlideExportPlugin.this.getPageStatus().mo5929b((Integer) 2);
                }
            }
        }
    }

    public void handleMultiPictureStart(String str) {
        initExport();
        SlideExportView slideExportView = (SlideExportView) getUIContainer().mo19584a(this, R.layout.slide_export_fragment_layout);
        this.mExportView = slideExportView;
        this.mExportPresenter.mo43671a(slideExportView);
        this.mExportPresenter.mo43674a("multiPicture", str);
        getPageStatus().mo5929b((Integer) 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageStatus", (Object) "MAIN");
        this.mExportPresenter.mo43670a(jSONObject);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        bindBridgeHandler("biz.slide.exportResponse", new C11390a());
        C5874b.m23628a("SLIDE_EXPORT_CHECK_NOR", (int) R.drawable.icon_tool_check_nor, 0);
        C5874b.m23628a("SLIDE_EXPORT_CHECK_DOWN", (int) R.drawable.icon_tool_check_down, 0);
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20193b(this);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        C13479a.m54764b("SlideExportPlugin", "onDetachFromUIContainer()...");
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        SlideExportView slideExportView = this.mExportView;
        if (slideExportView != null) {
            nVar.mo19594b(this, slideExportView);
            this.mExportView = null;
        }
        if (this.mExportSelectFragment != null) {
            nVar.mo19597c(this);
            this.mExportSelectFragment = null;
        }
        this.mExportPresenter = null;
        this.mSlideExportAnalytic = null;
        ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20185a(this);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7664b
    public void onActivityResult(int i, int i2, Intent intent) {
        C11410f fVar;
        C13479a.m54764b("SlideExportPlugin", "onActivityResult()... requestCode: " + i + " resultCode: " + i2);
        if (i == 100 && (fVar = this.mExportPresenter) != null) {
            fVar.mo43632d();
        }
    }
}

package com.bytedance.ee.bear.document.onboarding;

import android.text.TextUtils;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.onboarding.export.AbstractC10398b;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class OnBoardingPlugin extends DocumentPlugin implements AbstractC10549e {
    private AbstractC6041b currentMission;
    private List<AbstractC6041b> missionList;
    private AbstractC6043d missionProvder;
    private AbstractC10396b statusListener;

    public AbstractC10396b getStatusListener() {
        if (this.statusListener == null) {
            this.statusListener = new AbstractC10396b() {
                /* class com.bytedance.ee.bear.document.onboarding.OnBoardingPlugin.C60351 */

                @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b
                /* renamed from: a */
                public void mo24386a(AbstractC10397d<? extends AbstractC10405c> dVar) {
                    OnBoardingPlugin.this.onDismissMission(dVar.mo21352b(), "skipped");
                }

                @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b
                /* renamed from: b */
                public void mo24388b(AbstractC10397d<? extends AbstractC10405c> dVar) {
                    OnBoardingPlugin.this.onDismissMission(dVar.mo21352b(), "success");
                }

                @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b
                /* renamed from: c */
                public void mo24389c(AbstractC10397d<? extends AbstractC10405c> dVar) {
                    OnBoardingPlugin.this.onDismissMission(dVar.mo21352b(), "success");
                }

                @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b
                /* renamed from: a */
                public void mo24387a(AbstractC10397d<? extends AbstractC10405c> dVar, String str) {
                    OnBoardingPlugin.this.onDismissMission(dVar.mo21352b(), "fail");
                }
            };
        }
        return this.statusListener;
    }

    private void dismissShowingMission() {
        if (this.currentMission != null) {
            ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39513a(this.currentMission);
            this.currentMission = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.onboarding.OnBoardingPlugin$a */
    public class C6036a implements AbstractC7945d<OnBoardingIdListData> {
        private C6036a() {
        }

        /* renamed from: a */
        private JSONObject m24491a(boolean z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_done", (Object) Boolean.valueOf(z));
            return jSONObject;
        }

        /* renamed from: a */
        public void handle(OnBoardingIdListData onBoardingIdListData, AbstractC7947h hVar) {
            if (hVar == null) {
                C13479a.m54758a("OnBoardingPlugin", "CallbackFunction is null");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (onBoardingIdListData == null || onBoardingIdListData.getIds() == null || onBoardingIdListData.getIds().length == 0) {
                for (Map.Entry<String, Boolean> entry : ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39512a().entrySet()) {
                    jSONObject.put(entry.getKey(), (Object) m24491a(entry.getValue().booleanValue()));
                }
            } else {
                String[] ids = onBoardingIdListData.getIds();
                for (String str : ids) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(str, (Object) m24491a(((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39517a(str)));
                    }
                }
            }
            C13479a.m54764b("OnBoardingPlugin", "getOnBoardingStatus: " + jSONObject);
            hVar.mo17188a(jSONObject);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.onboarding.OnBoardingPlugin$b */
    public class C6037b implements AbstractC7945d<OnBoardingIdListData> {
        private C6037b() {
        }

        /* renamed from: a */
        public void handle(OnBoardingIdListData onBoardingIdListData, AbstractC7947h hVar) {
            C13479a.m54764b("OnBoardingPlugin", "setOnBoardingFinished:" + onBoardingIdListData);
            if (!(onBoardingIdListData == null || onBoardingIdListData.getIds() == null)) {
                String[] ids = onBoardingIdListData.getIds();
                ArrayList arrayList = new ArrayList();
                for (String str : ids) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39516a(arrayList);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.onboarding.OnBoardingPlugin$c */
    public class C6038c implements AbstractC7945d<OnBoardingData> {
        private C6038c() {
        }

        /* renamed from: a */
        public void handle(OnBoardingData onBoardingData, AbstractC7947h hVar) {
            C13479a.m54764b("OnBoardingPlugin", "show OnBoarding:" + onBoardingData);
            if (onBoardingData != null) {
                onBoardingData.transformPositionsIfNeed();
                OnBoardingPlugin.this.dispatchMission(onBoardingData);
            }
        }
    }

    public OnBoardingPlugin(AbstractC6043d dVar) {
        this.missionProvder = dVar;
    }

    private AbstractC6041b getMission(String str) {
        if (this.missionList != null && !TextUtils.isEmpty(str)) {
            for (AbstractC6041b bVar : this.missionList) {
                if (str != null && str.equals(bVar.mo21352b())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public void dispatchMission(OnBoardingData onBoardingData) {
        WebView b;
        String str = onBoardingData.action;
        if (TextUtils.isEmpty(str)) {
            onDismissMission("mobile_illegal_onboarding_item", "fail");
            return;
        }
        AbstractC6041b mission = getMission(str);
        this.currentMission = mission;
        if (mission == null) {
            onDismissMission(str, "fail");
            return;
        }
        if (!(onBoardingData.position == null || (b = getWeb().mo19435b()) == null)) {
            int[] iArr = new int[2];
            b.getLocationInWindow(iArr);
            onBoardingData.position.f16905x += (float) iArr[0];
            onBoardingData.position.f16906y += (float) iArr[1];
        }
        this.currentMission.mo24397a(onBoardingData);
        this.currentMission.mo24398a((C6095s) getHost());
        ((AbstractC10398b) KoinJavaComponent.m268610a(AbstractC10398b.class)).mo39507a().mo39515a(this.currentMission, new C6042c(this.statusListener, getActivity(), getTitleBar(), ((C6095s) getHost()).mo24597l().getView()));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39928b(this);
        dismissShowingMission();
        C6039a.m24495a().mo24395b();
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.missionList = this.missionProvder.mo16903a();
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39924a(this);
        bindBridgeHandlerAutoUnbind("biz.util.showUserGuide", new C6038c());
        bindBridgeHandlerAutoUnbind("biz.onboarding.getStatuses", new C6036a());
        bindBridgeHandlerAutoUnbind("biz.onboarding.setFinished", new C6037b());
        getStatusListener();
    }

    public void onDismissMission(String str, String str2) {
        C13479a.m54772d("OnBoardingPlugin", "dismiss guide: " + str + "; status: " + str2);
        if (getWeb() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put(UpdateKey.STATUS, (Object) str2);
            getWeb().mo19428a("javascript:window.lark.biz.util.finishUserGuide", jSONObject);
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            dismissShowingMission();
        }
    }
}

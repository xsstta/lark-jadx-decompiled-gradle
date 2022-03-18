package com.bytedance.ee.bear.document.tips;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.ee.bear.facade.common.widget.ErrorTipsView;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.C68289a;
import java.util.Map;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;

public class TipsPlugin extends DocumentPluginV2 {
    public BottomDialog mBottomDialog;
    public C68289a mCompositeDisposable = new C68289a();
    public AbstractC7947h mErrorTipCallback;
    public C1177w<Boolean> mIsShowingAtTips = new C1177w<>();
    public AbstractC7947h mLinkCallback;
    public ErrorTipsView.AbstractC7725a mTipsClickCallback = new ErrorTipsView.AbstractC7725a() {
        /* class com.bytedance.ee.bear.document.tips.TipsPlugin.C61681 */

        @Override // com.bytedance.ee.bear.facade.common.widget.ErrorTipsView.AbstractC7725a
        /* renamed from: a */
        public void mo24919a(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            if ("linkUrl".equals(str)) {
                if (TipsPlugin.this.mLinkCallback == null || TextUtils.isEmpty(str2)) {
                    C13479a.m54758a("TipsPlugin", "link callback or linkurl is empty");
                    return;
                } else {
                    jSONObject.put("linkUrl", (Object) str2);
                    TipsPlugin.this.mLinkCallback.mo17188a(jSONObject);
                }
            } else if (TipsPlugin.this.mErrorTipCallback == null) {
                C13479a.m54758a("TipsPlugin", "error tip callback is null");
                return;
            } else {
                jSONObject.put("action", (Object) str);
                TipsPlugin.this.mErrorTipCallback.mo17188a(jSONObject);
            }
            if (TipsPlugin.this.tipsController != null) {
                TipsPlugin.this.tipsController.mo24910b();
            }
        }
    };
    public TipsController tipsController;

    public LiveData<Boolean> getIsShowingAtTips() {
        return this.mIsShowingAtTips;
    }

    public void reportAtAuthorizeCloseClick() {
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36657c();
    }

    public void reportAtAuthorizeView() {
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36656b();
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$a */
    private class C6169a implements AbstractC7945d<String> {
        private C6169a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            TipsPlugin.this.tipsController.mo24907a();
            TipsPlugin.this.mIsShowingAtTips.mo5929b((Boolean) false);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$b */
    private class C6170b implements AbstractC7945d<String> {
        private C6170b() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            TipsPlugin.this.tipsController.mo24908a(str, hVar);
            TipsPlugin.this.mIsShowingAtTips.mo5929b((Boolean) true);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$c */
    private class C6171c implements AbstractC7945d<String> {
        private C6171c() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("TipsPlugin", "err link handler triggered");
            TipsPlugin.this.mLinkCallback = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$d */
    private class C6172d implements AbstractC7945d<String> {
        private C6172d() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("TipsPlugin", "hide error tips view.");
            TipsPlugin.this.tipsController.mo24910b();
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$e */
    private class C6173e implements AbstractC7945d<String> {
        private C6173e() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            String str2;
            String str3;
            TipsPlugin.this.mErrorTipCallback = hVar;
            try {
                C13479a.m54764b("TipsPlugin", "show error tips view. data : " + str);
                if (TextUtils.isEmpty(str)) {
                    C13479a.m54758a("TipsPlugin", "show err tips with empty data");
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                String optString = jSONObject.optString("text");
                String optString2 = jSONObject.optString("linkText");
                String optString3 = jSONObject.optString("linkUrl");
                boolean optBoolean = jSONObject.optBoolean("canClose", false);
                ErrorTipsView.TipsType valueOf = ErrorTipsView.TipsType.valueOf(jSONObject.optString(ShareHitPoint.f121869d, "normal"));
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("textBtn");
                if (optJSONObject != null) {
                    String optString4 = optJSONObject.optString("action");
                    str2 = optJSONObject.optString("text");
                    str3 = optString4;
                } else {
                    str3 = "";
                    str2 = str3;
                }
                TipsPlugin.this.tipsController.mo24909a(optString, optString2, optString3, valueOf, optBoolean, str3, str2, TipsPlugin.this.mTipsClickCallback);
            } catch (JSONException e) {
                C13479a.m54759a("TipsPlugin", "ErrorTipViewShowHandler handle(): ", e);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$f */
    private class C6174f implements AbstractC7945d<String> {
        private C6174f() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            if (TipsPlugin.this.mBottomDialog != null && TipsPlugin.this.mBottomDialog.mo24935b()) {
                TipsPlugin.this.mBottomDialog.mo24932a();
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.tips.TipsPlugin$g */
    private class C6175g implements AbstractC7945d<BottomPopupData> {
        private C6175g() {
        }

        /* renamed from: a */
        public void handle(BottomPopupData bottomPopupData, final AbstractC7947h hVar) {
            if (bottomPopupData != null) {
                if (TipsPlugin.this.mBottomDialog == null) {
                    TipsPlugin tipsPlugin = TipsPlugin.this;
                    tipsPlugin.mBottomDialog = new BottomDialog(tipsPlugin.getActivity());
                }
                TipsPlugin.this.mBottomDialog.mo24933a(bottomPopupData);
                TipsPlugin.this.mBottomDialog.mo24934a(new BottomDialog.ClickCallback() {
                    /* class com.bytedance.ee.bear.document.tips.TipsPlugin.C6175g.C61761 */

                    @Override // com.bytedance.ee.bear.document.tips.BottomDialog.ClickCallback
                    /* renamed from: b */
                    public void mo24930b() {
                        TipsPlugin.this.reportAtAuthorizeCloseClick();
                    }

                    @Override // com.bytedance.ee.bear.document.tips.BottomDialog.ClickCallback
                    /* renamed from: a */
                    public void mo24927a() {
                        C13479a.m54764b("TipsPlugin", "onCancel(): ");
                        hVar.mo17189a(new TipCallBackData("cancel", false));
                    }

                    @Override // com.bytedance.ee.bear.document.tips.BottomDialog.ClickCallback
                    /* renamed from: a */
                    public void mo24929a(boolean z) {
                        C13479a.m54764b("TipsPlugin", "onConfirm(): sendToLark = " + z);
                        hVar.mo17189a(new TipCallBackData("confirm", z));
                        TipsPlugin.this.reportAtAuthorizeSendClick(z);
                    }

                    @Override // com.bytedance.ee.bear.document.tips.BottomDialog.ClickCallback
                    /* renamed from: a */
                    public void mo24928a(String str) {
                        String str2;
                        C13479a.m54764b("TipsPlugin", "onClickUser(): uid = " + str);
                        CharSequence b = ((EditorAbility) TipsPlugin.this.getHost().mo19551b(EditorAbility.class)).mo24602q().getTitle().mo5927b();
                        if (b != null) {
                            str2 = b.toString();
                        } else {
                            str2 = "";
                        }
                        TipsPlugin.this.mCompositeDisposable.mo237937a(((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, str2));
                    }
                });
                TipsPlugin.this.reportAtAuthorizeView();
                return;
            }
            C13479a.m54764b("TipsPlugin", "handle(): BottomPopupData is Null");
        }
    }

    public void reportAtAuthorizeSendClick(boolean z) {
        ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36641d().mo36655a(z);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.showTips", new C6170b());
        map.put("biz.util.hideTips", new C6169a());
        map.put("biz.util.showMessage", new C6173e());
        map.put("biz.util.hideMessage", new C6172d());
        map.put("biz.util.showBottomPopup", new C6175g());
        map.put("biz.util.hideBottomPopup", new C6174f());
        map.put("biz.appeal.show", new C6171c());
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        this.tipsController = new TipsController(eVar, nVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        this.tipsController.mo24907a();
        this.tipsController.mo24910b();
        this.mCompositeDisposable.mo237935a();
    }
}

package com.bytedance.ee.bear.lark.announcement;

import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

public class AnnouncePlugin extends DocumentPlugin implements DocBridgeWebViewV2.AbstractC5605c {
    public String announceName;
    public boolean isIllegal;
    private LiveData<ConnectionService.NetworkState> mNetworkState;
    public AnnouncementPresenter mPresenter;

    @Override // com.bytedance.ee.bear.document.DocBridgeWebViewV2.AbstractC5605c
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
    }

    public void refreshUI() {
        int i;
        DocViewModel docViewModel = getDocViewModel();
        if (this.mPresenter.mo30929a(docViewModel)) {
            i = R.string.Doc_Lark_Channel_Announcement;
        } else {
            i = R.string.Doc_Lark_Announcement;
        }
        this.announceName = getString(i);
        docViewModel.setTitle(getString(i));
    }

    public /* synthetic */ void lambda$onAttachToHost$0$AnnouncePlugin(DocumentInfo documentInfo) {
        refreshUI();
    }

    public /* synthetic */ void lambda$onAttachToHost$1$AnnouncePlugin(String str) {
        refreshUI();
    }

    /* renamed from: com.bytedance.ee.bear.lark.announcement.AnnouncePlugin$a */
    public class C7975a implements AbstractC7945d<String> {
        public C7975a() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            AnnouncePlugin.this.mPresenter.mo30931b(AnnouncePlugin.this.getTitleBar());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.announcement.AnnouncePlugin$b */
    public class C7976b implements AbstractC7945d<Void> {
        private C7976b() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            AnnouncePlugin announcePlugin = AnnouncePlugin.this;
            announcePlugin.notifyMember(announcePlugin.announceName);
        }
    }

    public void notifyMember(String str) {
        this.mPresenter.mo30928a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.announcement.AnnouncePlugin$c */
    public class C7977c implements AbstractC7945d<String> {

        /* renamed from: a */
        final int f21430a;

        private C7977c() {
            this.f21430a = 1;
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("AnnouncePlugin", str);
            try {
                JSONObject parseObject = JSONObject.parseObject(str);
                boolean z = true;
                if (parseObject.getInteger(ShareHitPoint.f121869d).intValue() == 1) {
                    AnnouncePlugin announcePlugin = AnnouncePlugin.this;
                    if (parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getBoolean("verified").booleanValue()) {
                        z = false;
                    }
                    announcePlugin.isIllegal = z;
                    AnnouncePlugin.this.refreshUI();
                }
            } catch (Exception e) {
                C13479a.m54761a("AnnouncePlugin", e);
            }
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.mPresenter = new AnnouncementPresenter(sVar);
        this.mNetworkState = C5084ad.m20847d().mo20037a();
        DocViewModel docViewModel = getDocViewModel();
        docViewModel.liveDocumentInfoData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncePlugin$jRHWza4SylGw9RwYO1b4caKVYa4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AnnouncePlugin.this.lambda$onAttachToHost$0$AnnouncePlugin((DocumentInfo) obj);
            }
        });
        docViewModel.liveDocObjToken().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncePlugin$V15tXSU5yAlHZ81TnKYbV17ME14 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AnnouncePlugin.this.lambda$onAttachToHost$1$AnnouncePlugin((String) obj);
            }
        });
        this.mNetworkState.mo5923a(getLifecycleOwner(), new AbstractC1178x(docViewModel) {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$AnnouncePlugin$J6T0LnfowF2dsywtWEOOJF5icUo */
            public final /* synthetic */ DocViewModel f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AnnouncePlugin.this.lambda$onAttachToHost$2$AnnouncePlugin(this.f$1, (ConnectionService.NetworkState) obj);
            }
        });
        bindBridgeHandler("biz.doc.beginEdit", new C7975a());
        bindBridgeHandler("biz.util.setStatus", new C7977c());
        bindBridgeHandler("biz.announcement.publish", new C7976b());
    }

    public /* synthetic */ void lambda$onAttachToHost$2$AnnouncePlugin(DocViewModel docViewModel, ConnectionService.NetworkState networkState) {
        docViewModel.requestDocumentInfo(getUrl());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.mPresenter.mo30933d();
        WebView b = sVar.mo19448b().mo19435b();
        if (b instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) b).mo22339b(this);
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        WebView b = sVar.mo19448b().mo19435b();
        if (b instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) b).mo22327a(this);
        }
        this.mPresenter.mo30927a(getTitleBar());
        refreshUI();
    }
}

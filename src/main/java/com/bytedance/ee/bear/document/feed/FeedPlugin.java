package com.bytedance.ee.bear.document.feed;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.comment.C5711a;
import com.bytedance.ee.bear.document.comment.bean.CommentJsRequestBean;
import com.bytedance.ee.bear.document.comment.bean.JSEventListener;
import com.bytedance.ee.bear.document.event.EventPlugin;
import com.bytedance.ee.bear.document.feed.C5798b;
import com.bytedance.ee.bear.document.feed.FeedPlugin;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.CommentAnimationListener;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9491c;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedBuilder;
import com.bytedance.ee.bear.middleground.feed.export.bean.IFeed;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageConfig;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.firebase.messaging.Constants;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;

public class FeedPlugin extends DocumentPlugin implements AbstractC6054a {
    public IFeed feed;
    private AbstractC9491c feedData;
    public C5797a feedPanelViewModel;
    public AbstractC7947h mFeedCallback;
    private EventPlugin.OnDeleteListener mOnDeleteListener = new EventPlugin.OnDeleteListener() {
        /* class com.bytedance.ee.bear.document.feed.FeedPlugin.C57881 */

        @Override // com.bytedance.ee.bear.document.event.EventPlugin.OnDeleteListener
        /* renamed from: a */
        public void mo23172a(String str) {
            C13742g.m55705a(new Runnable(str) {
                /* class com.bytedance.ee.bear.document.feed.$$Lambda$FeedPlugin$1$4NhTLhn6jWkcyglvtt8MDQoTiJM */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    FeedPlugin.C57881.this.m23357b(this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m23357b(String str) {
            if (FeedPlugin.this.feed != null) {
                FeedPlugin.this.feed.mo35885b(str);
                FeedPlugin.this.feed.mo35879a();
            }
        }
    };
    public boolean owner;
    private AbstractC1178x<Boolean> showObservable = new AbstractC1178x() {
        /* class com.bytedance.ee.bear.document.feed.$$Lambda$FeedPlugin$J_YQ8IsZVL0VOUxt7AcUDpzqxs */

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            FeedPlugin.this.lambda$new$0$FeedPlugin((Boolean) obj);
        }
    };
    public String token;
    public String type;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    private ViewGroup getParentView() {
        if (findPlugin(FollowPlugin.class) != null) {
            return (ViewGroup) getActivity().findViewById(16908290);
        }
        return getUIContainer().mo19598d(this);
    }

    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$a */
    private class C5790a implements AbstractC7945d {
        private C5790a() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54764b("FeedPlugin", "closeFeed");
            if (FeedPlugin.this.feed != null && FeedPlugin.this.feed.mo35887b()) {
                FeedPlugin.this.feed.mo35879a();
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$b */
    private class C5791b implements AbstractC7945d<JSEventListener> {
        private C5791b() {
        }

        /* renamed from: a */
        public void handle(JSEventListener jSEventListener, AbstractC7947h hVar) {
            FeedPlugin.this.mFeedCallback = hVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$c */
    public class C5792c implements AbstractC7945d<CommentJsRequestBean> {
        private C5792c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m23363a(AbstractC7947h hVar, String str) throws Exception {
            C13479a.m54764b("FeedPlugin", "fetchMessage success");
            hVar.mo17188a(JSON.parseObject(str));
        }

        /* renamed from: a */
        public void handle(CommentJsRequestBean commentJsRequestBean, AbstractC7947h hVar) {
            if (commentJsRequestBean == null || TextUtils.isEmpty(commentJsRequestBean.getAction())) {
                C13479a.m54775e("FeedPlugin", "JSCommentRequestNative is null");
                return;
            }
            C13479a.m54764b("FeedPlugin", "JSCommentRequestNative action = " + commentJsRequestBean.getAction());
            if ("fetchMessage".equals(commentJsRequestBean.getAction())) {
                FeedPlugin.this.owner = commentJsRequestBean.isOwner();
                FeedPlugin.this.showFeedPanel(false);
                FeedPlugin.this.feed.mo35888c().setOwner(FeedPlugin.this.owner);
                FeedPlugin.this.feed.mo35878a(FeedPlugin.this.owner, commentJsRequestBean.getOptions()).mo238020d($$Lambda$FeedPlugin$c$ahdEEfvFf7iccYoxcUiZmpQC3iA.INSTANCE).mo238004b(C11678b.m48478b()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.document.feed.$$Lambda$FeedPlugin$c$ZcC_6WHlaQuNYAj9zbY1dRRN2f0 */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        FeedPlugin.C5792c.m23363a(AbstractC7947h.this, (String) obj);
                    }
                }, $$Lambda$FeedPlugin$c$FhSFqq4tfaCRaTDycSkpeH7eEFY.INSTANCE);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$d */
    private class C5793d implements AbstractC7945d<String> {
        private C5793d() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            boolean z;
            if (FeedPlugin.this.feed == null || !FeedPlugin.this.feed.mo35887b()) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("show", (Object) Boolean.valueOf(z));
            C13479a.m54764b("FeedPlugin", "JS request feed panel status：" + jSONObject.toString());
            hVar.mo17188a(jSONObject);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$e */
    private class C5794e implements AbstractC7945d<String> {
        private C5794e() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            C13479a.m54764b("FeedPlugin", "JS notify feed refresh");
            if (FeedPlugin.this.feed != null && FeedPlugin.this.feed.mo35887b()) {
                if (TextUtils.isEmpty(str)) {
                    FeedPlugin.this.feed.mo35884a(false);
                } else {
                    FeedPlugin.this.feed.mo35882a(str);
                }
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$f */
    private class C5795f implements AbstractC7945d<ShowFeedModel> {
        private C5795f() {
        }

        /* renamed from: a */
        public void handle(ShowFeedModel showFeedModel, AbstractC7947h hVar) {
            C13479a.m54764b("FeedPlugin", "openFeed:" + showFeedModel);
            if (showFeedModel != null) {
                FeedPlugin.this.showFeedPanel(true);
                IFeed dVar = FeedPlugin.this.feed;
                C5797a aVar = FeedPlugin.this.feedPanelViewModel;
                FeedPlugin feedPlugin = FeedPlugin.this;
                dVar.mo35880a(aVar.jsConfig2MessageConfig(feedPlugin, feedPlugin.token, FeedPlugin.this.type, FeedPlugin.this.feed.mo35888c().isOwner(), FeedPlugin.this.feed.mo35888c().isAuto(), showFeedModel, ((C6095s) FeedPlugin.this.getHost()).mo24598m()));
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.feed.FeedPlugin$g */
    private class C5796g implements AbstractC7945d<ReadMessageBean> {
        private C5796g() {
        }

        /* renamed from: a */
        public void handle(ReadMessageBean readMessageBean, AbstractC7947h hVar) {
            C13479a.m54764b("FeedPlugin", "readMessages: " + readMessageBean);
            if (FeedPlugin.this.feed != null) {
                FeedPlugin.this.feed.mo35883a(readMessageBean.getMessageIds());
            }
        }
    }

    public void showFeedPanel(boolean z) {
        showFeedPanel(z, false);
    }

    public void readMessage(List<String> list) {
        IFeed dVar = this.feed;
        if (dVar != null) {
            dVar.mo35883a(list);
        } else {
            C13479a.m54758a("FeedPlugin", "readMessage failed! feed is null!");
        }
    }

    public static String getBodyWithJson(String str) throws JSONException {
        return new org.json.JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).get("body").toString();
    }

    /* access modifiers changed from: private */
    public void handleLandscape(boolean z) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin == null) {
            return;
        }
        if (z) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
        } else {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }

    public /* synthetic */ void lambda$new$0$FeedPlugin(Boolean bool) {
        if (bool != null) {
            C13479a.m54764b("FeedPlugin", "show feed panel");
            showFeedPanel(true, bool.booleanValue());
            return;
        }
        IFeed dVar = this.feed;
        if (dVar != null && dVar.mo35887b()) {
            this.feed.mo35879a();
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$2$FeedPlugin(String str) {
        IFeed dVar;
        if (str != null && (dVar = this.feed) != null && this.feedData != null && C5130a.m20997b(dVar.mo35888c().getToken()) && !C5130a.m20997b(str)) {
            C13479a.m54764b("FeedPlugin", "set new token");
            this.feed.mo35888c().setToken(str);
            this.feedData.mo36344a(str);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.feed.showMessages", new C5795f());
        map.put("biz.feed.notifyMessageChange", new C5794e());
        map.put("biz.feed.getMessageStatus", new C5793d());
        map.put("biz.feed.requestNative", new C5792c());
        map.put("biz.feed.addEventListener", new C5791b());
        map.put("biz.feed.closePanel", new C5790a());
        map.put("biz.feed.readMessages", new C5796g());
    }

    public /* synthetic */ void lambda$onAttachToHost$1$FeedPlugin(CommentAnimationListener aVar) {
        if (aVar != null && this.feed != null) {
            boolean c = aVar.mo34935c();
            boolean a = aVar.mo34933a();
            boolean b = aVar.mo34934b();
            C13479a.m54764b("FeedPlugin", "close:" + c + " enter: " + a + " start:" + b);
            if (c) {
                if (this.feed.mo35887b()) {
                    this.feed.mo35879a();
                }
            } else if (b) {
                this.feed.mo35886b(a);
            }
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C5797a aVar = (C5797a) viewModel(C5797a.class);
        this.feedPanelViewModel = aVar;
        aVar.getShowFeedPanel().mo5923a(getLifecycleOwner(), this.showObservable);
        ((C5711a) viewModel(C5711a.class)).getCommentAnimationLiveData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.feed.$$Lambda$FeedPlugin$z7_TiJUOZwxZ7Y8RrOH3Iz2CQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FeedPlugin.this.lambda$onAttachToHost$1$FeedPlugin((CommentAnimationListener) obj);
            }
        });
        getDocViewModel().liveDocObjToken().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.feed.$$Lambda$FeedPlugin$bpDHqNUSmOkkcIJZntc4eD9jdQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FeedPlugin.this.lambda$onAttachToHost$2$FeedPlugin((String) obj);
            }
        });
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        EventPlugin eventPlugin = (EventPlugin) findPlugin(EventPlugin.class);
        if (eventPlugin != null) {
            eventPlugin.addOnDeleteListener(this.mOnDeleteListener);
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        EventPlugin eventPlugin = (EventPlugin) findPlugin(EventPlugin.class);
        if (eventPlugin != null) {
            eventPlugin.removeOnDeleteListener(this.mOnDeleteListener);
        }
        this.feedPanelViewModel.resetValue();
        IFeed dVar = this.feed;
        if (dVar != null) {
            dVar.mo35889d();
            this.feed = null;
        }
    }

    private void showFeedPanel(boolean z, boolean z2) {
        BearUrl bearUrl = getDocViewModel().getBearUrl();
        if (bearUrl == null) {
            C13479a.m54758a("FeedPlugin", "showFeedPanel: bearUrl = null !");
        } else if (TextUtils.isEmpty(bearUrl.f17446a) || TextUtils.isEmpty(bearUrl.f17447b)) {
            C13479a.m54758a("FeedPlugin", "parse url:" + bearUrl.f17446a + "  " + C13598b.m55197d(bearUrl.f17447b));
        } else {
            this.type = bearUrl.f17446a;
            this.token = bearUrl.f17447b;
            createFeed(bearUrl.f17447b, bearUrl.f17446a, z2);
            if (z && !this.feed.mo35887b()) {
                this.feed.mo35884a(z2);
            }
        }
    }

    private void createFeed(String str, String str2, boolean z) {
        if (this.feed == null) {
            C10917c p = ((C6095s) getHost()).mo24601p();
            C5798b bVar = new C5798b(((C6095s) getHost()).mo24597l(), this.feedPanelViewModel, str, ((AbstractC9509b) KoinJavaComponent.m268610a(AbstractC9509b.class)).mo36369a(C8275a.m34055d(str2)));
            MessageConfig messageConfig = new MessageConfig();
            messageConfig.setDocumentType(C8275a.m34055d(str2));
            messageConfig.setToken(str);
            messageConfig.setAuto(z);
            messageConfig.setOwner(this.owner);
            messageConfig.setLoadingSuccess(false);
            this.feedData = ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35939b(str, C8275a.m34055d(str2));
            this.feed = ((AbstractC9493f) KoinJavaComponent.m268610a(AbstractC9493f.class)).mo35932a(new FeedBuilder().mo36339a(getActivity()).mo36338a(getParentView()).mo36341a(this.feedData).mo36342a(bVar).mo36343a(p).mo36340a(messageConfig));
            bVar.mo23341a(new C5798b.AbstractC5800b() {
                /* class com.bytedance.ee.bear.document.feed.$$Lambda$FeedPlugin$6UgthchRsTKFz1w4rPNCy4vd7oY */

                @Override // com.bytedance.ee.bear.document.feed.C5798b.AbstractC5800b
                public final void showChange(boolean z) {
                    FeedPlugin.this.handleLandscape(z);
                }
            });
            bVar.mo23340a(new C5798b.AbstractC5799a() {
                /* class com.bytedance.ee.bear.document.feed.FeedPlugin.C57892 */

                @Override // com.bytedance.ee.bear.document.feed.C5798b.AbstractC5799a
                /* renamed from: a */
                public void mo23298a(MessageResultBean messageResultBean) {
                    if (FeedPlugin.this.feed != null) {
                        FeedPlugin.this.feed.mo35881a(messageResultBean);
                    }
                }

                @Override // com.bytedance.ee.bear.document.feed.C5798b.AbstractC5799a
                /* renamed from: a */
                public void mo23299a(String str) {
                    try {
                        String bodyWithJson = FeedPlugin.getBodyWithJson(str);
                        if (FeedPlugin.this.mFeedCallback != null) {
                            C13479a.m54764b("FeedPlugin", "web callback");
                            FeedPlugin.this.mFeedCallback.mo17188a(JSON.parseObject(bodyWithJson));
                        }
                    } catch (JSONException unused) {
                        C13479a.m54758a("FeedPlugin", "parse json error");
                    } catch (Exception e) {
                        C13479a.m54761a("FeedPlugin", e);
                    }
                }
            });
        }
    }
}

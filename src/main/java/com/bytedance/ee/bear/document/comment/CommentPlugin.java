package com.bytedance.ee.bear.document.comment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.doc.toolbar2.AbstractC5556d;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.document.C5628ac;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.comment.adapter.Js2NativeComment;
import com.bytedance.ee.bear.document.comment.bean.C5714Entity;
import com.bytedance.ee.bear.document.comment.bean.ClipboardData;
import com.bytedance.ee.bear.document.comment.bean.CommentJsRequestBean;
import com.bytedance.ee.bear.document.comment.bean.CopyResult;
import com.bytedance.ee.bear.document.comment.bean.JSEventListener;
import com.bytedance.ee.bear.document.comment.bean.MenuCallbackData;
import com.bytedance.ee.bear.document.comment.bean.Per;
import com.bytedance.ee.bear.document.comment.bean.ReactionPanel;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.document.comment.bean.UpdateReaction;
import com.bytedance.ee.bear.document.feed.FeedPlugin;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.document.imageviewer.C5852b;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.document.search.C6106b;
import com.bytedance.ee.bear.document.search.SearchPlugin;
import com.bytedance.ee.bear.document.statistics.ReportEventHandler;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.CommentAnimationListener;
import com.bytedance.ee.bear.middleground.comment.export.CommentBuilder;
import com.bytedance.ee.bear.middleground.comment.export.IComment;
import com.bytedance.ee.bear.middleground.comment.export.ICommentConfig;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReactionDetail;
import com.bytedance.ee.bear.middleground.comment.export.bean.SwitchCardBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade;
import com.ss.android.lark.util.share_preference.UserSP;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.koin.java.KoinJavaComponent;

public class CommentPlugin extends DocumentPluginV2 {
    private final C6106b.AbstractC6107a closeKeyboardOnDestroyInterceptor = new C6106b.AbstractC6107a() {
        /* class com.bytedance.ee.bear.document.comment.$$Lambda$py7MDmpuPSNFxH6B231fPtagKlk */

        @Override // com.bytedance.ee.bear.document.search.C6106b.AbstractC6107a
        public final boolean intercept() {
            return CommentPlugin.this.isInputShowing();
        }
    };
    public C5711a commentViewModel;
    private ICommentConfig config;
    private C6215b editPanelsManager;
    public IComment mComment;
    public AbstractC7947h mListenerCb;
    PopupWindow mReaction;
    public Per per = new Per();
    private ShowCardsJsData showCardsJsData;

    public void closeCommentCards() {
        this.mComment.mo34321b(true);
    }

    public boolean isInputShowing() {
        return commentShow(true);
    }

    private boolean commentShow() {
        IComment eVar = this.mComment;
        if (eVar == null || !eVar.mo34313a(false)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$19$CommentPlugin() {
        handleOrientationWhenEnter(this.commentViewModel.getInputOrientationHandler());
        return Unit.INSTANCE;
    }

    public /* synthetic */ Boolean lambda$getNewCardComment$7$CommentPlugin() {
        return Boolean.valueOf(getDocumentMetadata().isOwner());
    }

    private void destroy() {
        IComment eVar = this.mComment;
        if (eVar != null) {
            if (eVar.mo34313a(false)) {
                this.mComment.mo34311a(false, true);
            }
            this.mComment.mo34346m();
            this.mComment = null;
        }
    }

    private CommentAnimationParam getEnterAnimatorInFeed() {
        return new CommentAnimationParam(true, (float) C13749l.m55736a(), BitmapDescriptorFactory.HUE_RED, false, true, true, new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.document.comment.CommentPlugin.C56871 */

            public void onAnimationEnd(Animator animator) {
                CommentPlugin.this.commentViewModel.getCommentAnimationLiveData().mo5929b(new CommentAnimationListener(true, false, false));
                super.onAnimationEnd(animator);
            }

            public void onAnimationStart(Animator animator) {
                CommentPlugin.this.commentViewModel.getCommentAnimationLiveData().mo5929b(new CommentAnimationListener(true, true, false));
                super.onAnimationStart(animator);
            }
        });
    }

    private CommentAnimationParam getExitAnimatorInFeed() {
        return new CommentAnimationParam(true, BitmapDescriptorFactory.HUE_RED, (float) C13749l.m55736a(), true, false, false, new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.document.comment.CommentPlugin.C56882 */

            public void onAnimationEnd(Animator animator) {
                CommentPlugin.this.commentViewModel.getCommentAnimationLiveData().mo5929b(new CommentAnimationListener(false, false, false));
                super.onAnimationEnd(animator);
            }

            public void onAnimationStart(Animator animator) {
                CommentPlugin.this.commentViewModel.getCommentAnimationLiveData().mo5929b(new CommentAnimationListener(false, true, false));
                super.onAnimationStart(animator);
            }
        });
    }

    private boolean isFromFeed() {
        ShowCardsJsData b;
        C5711a aVar = this.commentViewModel;
        if (aVar == null || (b = aVar.getCommentCardsRequest().mo5927b()) == null || !"feed".equals(b.getFrom())) {
            return false;
        }
        return true;
    }

    public boolean isCanCopy() {
        DocumentMetadata documentMetadata = getDocumentMetadata();
        if (documentMetadata != null || documentMetadata.canCopy()) {
            return true;
        }
        return false;
    }

    public void translate() {
        this.mComment.mo34312a(this.mComment.mo34332f().mo34715d("", "").mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$maCMKINvvh0ds7TeSPa5Fg0xmR0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CommentPlugin.this.lambda$translate$24$CommentPlugin((String) obj);
            }
        }, $$Lambda$CommentPlugin$GIesMfAEmnt64OeeJ9qlCTqaCM.INSTANCE));
    }

    private void setConfig() {
        ICommentConfig b = this.mComment.mo34314b();
        this.config = b;
        b.mo35285b(true);
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this.commentViewModel);
        this.commentViewModel.getTranslateConfig().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$kosXw4N86URKdhkRpdfu7uiUhSk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                CommentPlugin.this.lambda$setConfig$23$CommentPlugin((TranslateConfig) obj);
            }
        });
        if (this.commentViewModel.isChangePanelHeightFlag()) {
            this.config.mo35280a(this.commentViewModel.getChangeMinPanelHeight());
            this.config.mo35284b(this.commentViewModel.getChangeDefaultPanelHeight());
            this.config.mo35286c(this.commentViewModel.getChangeMaxPanelHeight());
        }
    }

    public IComment getNewCardComment() {
        String str;
        if (this.mComment == null) {
            BearUrl bearUrl = getDocumentMetadata().getBearUrl();
            AbstractC9224g gVar = (AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class);
            CommentBuilder bVar = new CommentBuilder(getActivity(), (FrameLayout) getUIContainer().mo19598d(this), getFragmentManager());
            String str2 = "";
            if (bearUrl.f17447b == null) {
                str = str2;
            } else {
                str = bearUrl.f17447b;
            }
            CommentBuilder a = bVar.mo34939a(str);
            if (bearUrl.f17450e != null) {
                str2 = bearUrl.f17450e;
            }
            boolean z = true;
            CommentBuilder a2 = a.mo34945b(str2).mo34937a(C8275a.m34055d(bearUrl.f17446a)).mo34942a(getDocumentMetadata().isType(C8275a.f22377j)).mo34936a(1).mo34944b(0).mo34953e(true).mo34950c(true).mo34952d(true).mo34957g("doc".equals(bearUrl.f17446a)).mo34940a(new Function0() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$bS9dXJze7tpSXucc5eULX166zY */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CommentPlugin.this.lambda$getNewCardComment$7$CommentPlugin();
                }
            });
            if (getDocumentMetadata().getOpenSource() == DocsOpenSource.vc) {
                z = false;
            }
            this.mComment = gVar.mo34610a(a2.mo34955f(z).mo34938a(new ICommentPermission() {
                /* class com.bytedance.ee.bear.document.comment.CommentPlugin.C56893 */

                @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
                /* renamed from: a */
                public boolean mo17183a() {
                    return CommentPlugin.this.isCanCopy();
                }

                @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
                /* renamed from: b */
                public boolean mo17184b() {
                    return CommentPlugin.this.per.comment;
                }

                @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
                /* renamed from: c */
                public boolean mo17185c() {
                    return CommentPlugin.this.per.resolve;
                }

                @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
                /* renamed from: d */
                public boolean mo17186d() {
                    return CommentPlugin.this.per.delete;
                }
            }).mo34941a(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$l2B2dc95O4Qia2Gm3qkwfpqYSdw */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$8$CommentPlugin((List) obj);
                }
            }));
            setConfig();
            this.mComment.mo34356w().add(new Function4() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$4fPbHnfuH8edJSOg4rQjA7Gras */

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return CommentPlugin.this.lambda$getNewCardComment$9$CommentPlugin((String) obj, (List) obj2, (Boolean) obj3, (String) obj4);
                }
            });
            this.mComment.mo34319b(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$x6ha_vwllFlB6KnhYQdP9e8vDxI */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$10$CommentPlugin((Boolean) obj);
                }
            });
            this.mComment.mo34337h(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$azHi51lwoLudVOq8FldKEzzLTt8 */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$11$CommentPlugin((String) obj);
                }
            });
            this.mComment.mo34338i(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$O4ff9nf049wH2L7BApdhcAOn_Q */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$12$CommentPlugin((String) obj);
                }
            });
            this.mComment.mo34335g(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$A9dHgDR3Dnnw0DtHmSQNnOMbVU */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$13$CommentPlugin((String) obj);
                }
            });
            this.mComment.mo34331e(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$c7sIV_nHVoKsBRPOpnb8zk4HQ */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$14$CommentPlugin((Boolean) obj);
                }
            });
            this.mComment.mo34310a(new Function3() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$vjcoVoA14X2WjRkZTHF9885K1Yk */

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CommentPlugin.this.lambda$getNewCardComment$15$CommentPlugin((String) obj, (String) obj2, (Integer) obj3);
                }
            });
            this.mComment.mo34329d(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$Rgt9ENhfsXNRwcmlYJXKKhNE8KU */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$16$CommentPlugin((String) obj);
                }
            });
            this.mComment.mo34341j(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$nhU_WrKU6ks1pbmnUdjs2RyN7I */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$17$CommentPlugin((Boolean) obj);
                }
            });
            this.mComment.mo34333f(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$NQyhvZ7cJqFrQfyNSoep6mKo3Q */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$18$CommentPlugin((Integer) obj);
                }
            });
            this.mComment.mo34325c(new Function0() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$mlQirHXeIibKVRi_b7SoOVQ57lE */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CommentPlugin.this.lambda$getNewCardComment$19$CommentPlugin();
                }
            });
            this.mComment.mo34359z().add(new Function2() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$4QR0ORPvYaeZf3VGdcPN3TItcRQ */

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommentPlugin.this.lambda$getNewCardComment$20$CommentPlugin((Integer) obj, (Boolean) obj2);
                }
            });
            this.mComment.mo34343k(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$VCQyTUirgEXATjISIiQzYirZj4Q */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$21$CommentPlugin((String) obj);
                }
            });
            this.mComment.mo34326c(new Function1() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$h2BUdbIPmOe7CL2ZmBjR_C0T9k */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommentPlugin.this.lambda$getNewCardComment$22$CommentPlugin((String) obj);
                }
            });
        }
        return this.mComment;
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$a */
    private class C5690a implements AbstractC7945d<ClipboardData> {
        private C5690a() {
        }

        /* renamed from: a */
        public void handle(ClipboardData clipboardData, AbstractC7947h hVar) {
            if (clipboardData != null && !TextUtils.isEmpty(clipboardData.getText())) {
                try {
                    ((ClipboardManager) CommentPlugin.this.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, clipboardData.getText().replaceFirst("<doc.at.~#_%=`>", "")));
                    hVar.mo17189a(new CopyResult(0));
                } catch (Exception e) {
                    hVar.mo17189a(new CopyResult(1));
                    C13479a.m54759a("CommentPlugin", "ClipboardCopyHandler (): copy failed", e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$b */
    private class C5691b implements AbstractC7945d {
        private C5691b() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54764b("CommentPlugin", "JS request comment close card !");
            if (CommentPlugin.this.mComment != null) {
                CommentPlugin.this.mComment.mo34311a(false, true);
            } else {
                C13479a.m54758a("CommentPlugin", "close Card but comment is null");
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$c */
    private class C5692c implements AbstractC7944c {
        private C5692c() {
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            JSONObject jSONObject = new JSONObject();
            boolean z = UserSP.getInstance().getBoolean("is_doc_smart_compose_enabled");
            C13479a.m54764b("CommentPlugin", "smart_compose_enabled = " + z);
            jSONObject.put("smart_compose_enabled", (Object) Boolean.valueOf(z));
            hVar.mo17188a(jSONObject);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$d */
    private class C5693d implements AbstractC7945d<String> {
        private C5693d() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            hVar.mo17189a(((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34609a(CommentPlugin.this.mComment));
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$e */
    private class C5694e implements AbstractC7945d<ShowCardsJsData> {
        private C5694e() {
        }

        /* renamed from: a */
        public void handle(ShowCardsJsData showCardsJsData, AbstractC7947h hVar) {
            C13479a.m54764b("CommentPlugin", "JS request hide comment cards");
            CommentPlugin.this.commentViewModel.updateCommentCardsRequest(null);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$f */
    private class C5695f implements AbstractC7945d<JSEventListener> {
        private C5695f() {
        }

        /* renamed from: a */
        public void handle(JSEventListener jSEventListener, AbstractC7947h hVar) {
            CommentPlugin.this.mListenerCb = hVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$g */
    private class C5696g implements AbstractC7945d<CommentJsRequestBean> {
        private C5696g() {
        }

        /* renamed from: a */
        public void handle(CommentJsRequestBean commentJsRequestBean, AbstractC7947h hVar) {
            if (commentJsRequestBean == null || TextUtils.isEmpty(commentJsRequestBean.getAction())) {
                C13479a.m54758a("CommentPlugin", "JSCommentRequestNative is null");
                return;
            }
            C13479a.m54764b("CommentPlugin", "JSCommentRequestNative action = " + commentJsRequestBean.getAction());
            CommentPlugin.this.getNewCardComment();
            String action = commentJsRequestBean.getAction();
            action.hashCode();
            char c = 65535;
            switch (action.hashCode()) {
                case -1072854300:
                    if (action.equals("beginSync")) {
                        c = 0;
                        break;
                    }
                    break;
                case -961740095:
                    if (action.equals("addTranslateComments")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114381373:
                    if (action.equals("setTranslateEnableLang")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1052832078:
                    if (action.equals("translate")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String token = commentJsRequestBean.getToken();
                    if ("beginSync".equals(commentJsRequestBean.getOptions())) {
                        CommentPlugin.this.mComment.mo34332f().mo34719d(token);
                        return;
                    }
                    return;
                case 1:
                    CommentPlugin.this.mComment.mo34332f().mo34716d();
                    return;
                case 2:
                    CommentPlugin.this.mComment.mo34332f().mo34717e();
                    return;
                case 3:
                    CommentPlugin.this.translate();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$h */
    private class C5697h implements AbstractC7945d<C5714Entity> {
        private C5697h() {
        }

        /* renamed from: a */
        public void handle(C5714Entity entity, AbstractC7947h hVar) {
            C13479a.m54758a("Sss", "sss");
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$i */
    private class C5698i implements AbstractC7945d<C5714Entity> {
        private C5698i() {
        }

        /* renamed from: a */
        public void handle(C5714Entity entity, AbstractC7947h hVar) {
            if (entity != null) {
                CommentPlugin.this.mComment.mo34304a(entity.getToken());
                CommentPlugin.this.mComment.mo34301a(C8275a.m34052b(entity.getType()));
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$j */
    private class C5699j implements AbstractC7945d<Per> {
        private C5699j() {
        }

        /* renamed from: a */
        public void handle(Per per, AbstractC7947h hVar) {
            C13479a.m54764b("CommentPlugin", " comment per = " + CommentPlugin.this.per);
            CommentPlugin.this.per = per;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$k */
    private class C5700k implements AbstractC7945d<ShowCardsJsData> {
        private C5700k() {
        }

        /* renamed from: a */
        public void handle(ShowCardsJsData showCardsJsData, AbstractC7947h hVar) {
            if (showCardsJsData == null) {
                C13479a.m54758a("CommentPlugin", "JS request comment cards , but no cards !");
                return;
            }
            C13479a.m54764b("CommentPlugin", "JS request comment cards");
            CommentPlugin.this.per = showCardsJsData.permission;
            CommentPlugin.this.commentViewModel.updateCommentCardsRequest(showCardsJsData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$l */
    public class C5701l implements AbstractC7945d<ReactionDetail> {
        private C5701l() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m23072a(DialogInterface dialogInterface) {
            CommentPlugin.this.commentViewModel.setDetailPanelStatus(0, "", "");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m23074a(String str) {
            CommentPlugin.this.mComment.mo34312a(((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, CommentPlugin.this.getDocumentMetadata().getTitle().mo5927b()));
        }

        /* renamed from: a */
        public void handle(ReactionDetail reactionDetail, AbstractC7947h hVar) {
            boolean z;
            List<ReactionDetailViewModel> a = ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34611a().mo35288a(reactionDetail.getData());
            Iterator<ReactionDetailViewModel> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                ReactionDetailViewModel next = it.next();
                if (next.getTotalCount() != next.getUserInfoList().size()) {
                    z = false;
                    break;
                }
            }
            C53002b a2 = C53002b.m205273a(a, reactionDetail.getReactionKey());
            a2.mo181046a(new C53002b.AbstractC53005b() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$l$nJy9MmsaKZr8fxFmm9Odb4TKb4 */

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                public final void onItemClicked(String str) {
                    CommentPlugin.C5701l.this.m23074a((CommentPlugin.C5701l) str);
                }
            });
            a2.mo181043a(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$l$ZS6itWIlmMhYJwBqtFuBBzTOGik */

                public final void onDismiss(DialogInterface dialogInterface) {
                    CommentPlugin.C5701l.this.m23072a((CommentPlugin.C5701l) dialogInterface);
                }
            });
            a2.mo5511a(CommentPlugin.this.getActivity().getSupportFragmentManager(), "REACTION_DETAIL");
            if (!z) {
                CommentPlugin.this.mComment.mo34312a(CommentPlugin.this.mComment.mo34332f().mo34713c(reactionDetail.getReferType(), reactionDetail.getReferKey()).mo238001b(new Consumer(reactionDetail) {
                    /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$l$1mIqDlbSBV7FQYa2KbEn6CRCTwQ */
                    public final /* synthetic */ ReactionDetail f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        CommentPlugin.C5701l.m23073a(C53002b.this, this.f$1, (String) obj);
                    }
                }, $$Lambda$CommentPlugin$l$MU5adavOgDZkxepjr9ymd7BzsWw.INSTANCE));
            }
            CommentPlugin.this.commentViewModel.setDetailPanelStatus(1, reactionDetail.getReferType(), reactionDetail.getReferKey());
            ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34611a().mo35290a(CommentPlugin.this.getDocumentMetadata().getToken(), CommentPlugin.this.getDocumentMetadata().getDocumentType(), CommentPlugin.this.getDocumentMetadata().isType(C8275a.f22377j), "", reactionDetail.getReferKey(), CommentPlugin.this.getDocumentMetadata().isOwner());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m23073a(C53002b bVar, ReactionDetail reactionDetail, String str) throws Exception {
            if (bVar.isResumed()) {
                bVar.mo181047a(((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34611a().mo35288a(reactionDetail.getData()));
            } else {
                C13479a.m54764b("CommentPlugin", "handle(): detailFragment is not resume");
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$m */
    private class C5702m implements AbstractC7945d<CommentInputRequest> {
        private C5702m() {
        }

        /* renamed from: a */
        public void handle(CommentInputRequest commentInputRequest, AbstractC7947h hVar) {
            C13479a.m54764b("CommentPlugin", "JS request comment input");
            if (commentInputRequest != null) {
                commentInputRequest.doc_url = CommentPlugin.this.getDocumentMetadata().getUrl();
            }
            CommentPlugin.this.commentViewModel.updateCommentInputRequest(commentInputRequest);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$n */
    public class C5703n implements AbstractC7945d<ReactionPanel> {
        private C5703n() {
        }

        /* renamed from: a */
        public void handle(ReactionPanel reactionPanel, final AbstractC7947h hVar) {
            if (!(reactionPanel == null || reactionPanel.getToolBar() == null || reactionPanel.getToolBar().isEmpty())) {
                if (CommentPlugin.this.mReaction != null && CommentPlugin.this.mReaction.isShowing()) {
                    CommentPlugin.this.mReaction.dismiss();
                }
                List<ReactionPanel.OperationItem> toolBar = reactionPanel.getToolBar();
                boolean equals = "REACTION".equals(toolBar.get(0).getId());
                if (equals) {
                    toolBar.remove(0);
                }
                ArrayList arrayList = new ArrayList();
                for (final ReactionPanel.OperationItem operationItem : toolBar) {
                    int a = ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34611a().mo35287a(operationItem.getId());
                    if (a == -1) {
                        C13479a.m54758a("CommentPlugin", "ShowOperationHandler: not Found tool resIcon");
                    } else {
                        arrayList.add(new C53085d(operationItem.getText(), a, new C53085d.AbstractC53086a() {
                            /* class com.bytedance.ee.bear.document.comment.CommentPlugin.C5703n.C57041 */

                            @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
                            public void onMenuItemClick() {
                                hVar.mo17189a(new MenuCallbackData(operationItem.getId()));
                            }
                        }));
                    }
                }
                ReactionPanelFacade.C53071a aVar = new ReactionPanelFacade.C53071a(CommentPlugin.this.getHost().mo19565g().mo19601f());
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                ReactionPanelFacade.C53071a c = aVar.mo181315c(arrayList);
                new C10917c(new C10929e()).mo41508c(ak.class).mo238020d(new Function(equals, c, hVar) {
                    /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$n$Pz8KbX0czBSlOvlVbM7onjepiLc */
                    public final /* synthetic */ boolean f$1;
                    public final /* synthetic */ ReactionPanelFacade.C53071a f$2;
                    public final /* synthetic */ AbstractC7947h f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return CommentPlugin.C5703n.this.m23078a(this.f$1, this.f$2, this.f$3, (ak) obj);
                    }
                }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(c, hVar, reactionPanel) {
                    /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$n$kAexhu2lYhjBgRsEljMw37RUSw */
                    public final /* synthetic */ ReactionPanelFacade.C53071a f$1;
                    public final /* synthetic */ AbstractC7947h f$2;
                    public final /* synthetic */ ReactionPanel f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        CommentPlugin.C5703n.this.m23079a((CommentPlugin.C5703n) this.f$1, (ReactionPanelFacade.C53071a) this.f$2, (AbstractC7947h) this.f$3, (ReactionPanel) ((String) obj));
                    }
                }, $$Lambda$CommentPlugin$n$NH37rC9UqVmV3Ls_SNWYYcwRmXA.INSTANCE);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ String m23078a(boolean z, ReactionPanelFacade.C53071a aVar, final AbstractC7947h hVar, ak akVar) throws Exception {
            if (!z) {
                return "";
            }
            aVar.mo181308a(new ReactionPanelFacade.AbstractC53072b() {
                /* class com.bytedance.ee.bear.document.comment.CommentPlugin.C5703n.C57063 */

                @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                /* renamed from: a */
                public void mo22763a() {
                }

                @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                /* renamed from: b */
                public void mo22765b() {
                }

                @Override // com.ss.android.lark.reaction.widget.panel.ReactionPanelFacade.AbstractC53072b
                /* renamed from: a */
                public void mo22764a(String str, int i) {
                    hVar.mo17189a(new MenuCallbackData("REACTION", str));
                }
            }).mo181309a(akVar.getRecentReactionList()).mo181313b(akVar.getWholeReactionList());
            return "";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m23079a(ReactionPanelFacade.C53071a aVar, final AbstractC7947h hVar, ReactionPanel reactionPanel, String str) throws Exception {
            ReactionPanelFacade a = aVar.mo181310a(true).mo181311a();
            a.mo181302a(new PopupWindow.OnDismissListener() {
                /* class com.bytedance.ee.bear.document.comment.CommentPlugin.C5703n.C57052 */

                public void onDismiss() {
                    hVar.mo17189a(new MenuCallbackData("CANCEL"));
                }
            });
            CommentPlugin.this.mReaction = a.mo181296a((float) C13749l.m55738a(reactionPanel.getPosition().getY()));
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$o */
    private class C5707o implements AbstractC7945d<SwitchCardBean> {
        private C5707o() {
        }

        /* renamed from: a */
        public void handle(SwitchCardBean switchCardBean, AbstractC7947h hVar) {
            if (switchCardBean == null) {
                C13479a.m54758a("CommentPlugin", "data == null");
            }
            C13479a.m54764b("CommentPlugin", "commentId = " + switchCardBean.getCommentId());
            if (CommentPlugin.this.mComment != null) {
                CommentPlugin.this.mComment.mo34350q().invoke(switchCardBean.getCommentId());
            } else {
                C13479a.m54758a("CommentPlugin", "switch card");
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$p */
    private class C5708p implements AbstractC7945d<TranslateConfig> {
        private C5708p() {
        }

        /* renamed from: a */
        public void handle(TranslateConfig translateConfig, AbstractC7947h hVar) {
            C13479a.m54764b("CommentPlugin", "JS set translate config:" + translateConfig);
            CommentPlugin.this.commentViewModel.getTranslateConfig().mo5929b(translateConfig);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$q */
    public class C5709q implements AbstractC7945d<UpdateReaction> {
        private C5709q() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ String m23087a(UpdateReaction updateReaction, ak akVar) throws Exception {
            akVar.updateOrder(updateReaction.getReactionKey());
            return "";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m23088a(UpdateReaction updateReaction, String str) throws Exception {
            C13479a.m54772d("CommentPlugin", "hostService updateOrder success key = " + updateReaction.getReactionKey());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m23089a(UpdateReaction updateReaction, Throwable th) throws Exception {
            C13479a.m54759a("CommentPlugin", "hostService updateOrder key = " + updateReaction.getReactionKey(), th);
        }

        /* renamed from: a */
        public void handle(UpdateReaction updateReaction, AbstractC7947h hVar) {
            C13479a.m54764b("CommentPlugin", "UpdateOrderHandler handle(): reactionKey = " + updateReaction);
            new C10917c(new C10929e()).mo41508c(ak.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$q$DdwGn1dnPABdDlg3xXDiEoJ1Mc */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CommentPlugin.C5709q.m23087a(UpdateReaction.this, (ak) obj);
                }
            }).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$q$mGe3dYviAFQLFFLGTQgSRsENpvs */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CommentPlugin.C5709q.m23088a(UpdateReaction.this, (String) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$q$k9qwaJKiPIRR_SvuWv4RaEvHsMU */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CommentPlugin.C5709q.m23089a(UpdateReaction.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.comment.CommentPlugin$r */
    private class C5710r implements AbstractC7945d<String> {
        private C5710r() {
        }

        /* renamed from: a */
        public void handle(String str, AbstractC7947h hVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isCardShow", (Object) Boolean.valueOf(CommentPlugin.this.getNewCardComment().mo34339i()));
            hVar.mo17188a(jSONObject);
        }
    }

    public void showCommentCards(ShowCardsJsData showCardsJsData2) {
        this.commentViewModel.updateCommentCardsRequest(showCardsJsData2);
    }

    public void showCommentInput(CommentInputRequest commentInputRequest) {
        this.commentViewModel.updateCommentInputRequest(commentInputRequest);
    }

    private void handleOrientationWhenEnter(AbstractC6054a aVar) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(aVar);
        }
    }

    private void handleOrientationWhenExit(AbstractC6054a aVar) {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(aVar);
        }
    }

    public /* synthetic */ Unit lambda$getNewCardComment$11$CommentPlugin(String str) {
        handleOrientationWhenEnter(this.commentViewModel.getFullOrientationHandler());
        return Unit.INSTANCE;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$12$CommentPlugin(String str) {
        handleOrientationWhenExit(this.commentViewModel.getFullOrientationHandler());
        return Unit.INSTANCE;
    }

    public /* synthetic */ void lambda$setConfig$23$CommentPlugin(TranslateConfig translateConfig) {
        ICommentConfig fVar;
        if (translateConfig != null && (fVar = this.config) != null) {
            fVar.mo35282a(translateConfig);
        }
    }

    public /* synthetic */ void lambda$translate$24$CommentPlugin(String str) throws Exception {
        this.mComment.mo34332f().mo34705a(str, Action.TRANSLATE);
    }

    private boolean commentShow(boolean z) {
        IComment eVar = this.mComment;
        if (eVar == null || !eVar.mo34313a(z)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$10$CommentPlugin(Boolean bool) {
        if (bool.booleanValue()) {
            handleOrientationWhenEnter(this.commentViewModel.getAtOrientationHandler());
        } else {
            handleOrientationWhenExit(this.commentViewModel.getAtOrientationHandler());
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$16$CommentPlugin(String str) {
        ((C5852b) aj.m5366a(getActivity()).mo6005a(C5852b.class)).setCloseImageViewer(true);
        return null;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$17$CommentPlugin(Boolean bool) {
        if (bool.booleanValue()) {
            handleOrientationWhenEnter(this.commentViewModel.getEditOrientationHandler());
            return null;
        }
        handleOrientationWhenExit(this.commentViewModel.getEditOrientationHandler());
        return null;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$18$CommentPlugin(Integer num) {
        if (!commentShow()) {
            return null;
        }
        this.commentViewModel.getPanelHeight().mo5929b(num);
        this.commentViewModel.getCommentCardsRequest().mo5927b();
        return null;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$21$CommentPlugin(String str) {
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, getDocumentMetadata().getTitle().mo5927b());
        return null;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$8$CommentPlugin(List list) {
        FeedPlugin feedPlugin = (FeedPlugin) findPlugin(FeedPlugin.class);
        if (feedPlugin != null) {
            feedPlugin.readMessage(list);
            return null;
        }
        C13479a.m54758a("CommentPlugin", "feedPlugin == null");
        return null;
    }

    public /* synthetic */ void lambda$onAttachToHost$4$CommentPlugin(SearchPlugin searchPlugin) {
        ((C6106b) aj.m5366a(getActivity()).mo6005a(searchPlugin.getModelClass())).addCloseKeyboardOnDestroyInterceptor(this.closeKeyboardOnDestroyInterceptor);
    }

    public /* synthetic */ void lambda$onDetachFromHost$5$CommentPlugin(SearchPlugin searchPlugin) {
        ((C6106b) aj.m5366a(getActivity()).mo6005a(searchPlugin.getModelClass())).removeCloseKeyboardOnDestroyInterceptor(this.closeKeyboardOnDestroyInterceptor);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromHost(C4943e eVar) {
        super.onDetachFromHost(eVar);
        getHost().mo19549a(SearchPlugin.class, new AbstractC4942d() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$dk8iZddfiexwEcu31VMk6AYNUI */

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                CommentPlugin.this.lambda$onDetachFromHost$5$CommentPlugin((SearchPlugin) cVar);
            }
        });
    }

    public /* synthetic */ Unit lambda$getNewCardComment$13$CommentPlugin(String str) {
        C13479a.m54764b("CommentPlugin", "comment switch, commentId = " + str + ", switchCb = " + this.mListenerCb);
        AbstractC7947h hVar = this.mListenerCb;
        if (hVar == null) {
            return null;
        }
        hVar.mo17188a(new C5713b().mo22806a(str, ""));
        return null;
    }

    public /* synthetic */ Boolean lambda$getNewCardComment$22$CommentPlugin(String str) {
        if (getHost() instanceof C6095s) {
            return Boolean.valueOf(C5628ac.m22844a(str, (C6095s) getHost()));
        }
        return Boolean.valueOf(C6313i.m25327a().mo25389b(getDocumentMetadata().getUrl(), str));
    }

    public /* synthetic */ void lambda$onAttachToHost$0$CommentPlugin(CommentInputRequest commentInputRequest) {
        C13479a.m54764b("CommentPlugin", "data: " + commentInputRequest);
        if (commentInputRequest != null) {
            getNewCardComment().mo34302a(commentInputRequest);
            ((AbstractC5556d) KoinJavaComponent.m268610a(AbstractC5556d.class)).mo22164a(getHost());
        } else if (commentShow(true)) {
            getNewCardComment().mo34311a(true, true);
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$3$CommentPlugin(Boolean bool) {
        if (this.mComment != null) {
            this.config.mo35280a(this.commentViewModel.getChangeMinPanelHeight());
            this.config.mo35284b(this.commentViewModel.getChangeDefaultPanelHeight());
            this.config.mo35286c(this.commentViewModel.getChangeMaxPanelHeight());
            this.mComment.mo34340j();
        }
    }

    public /* synthetic */ Unit lambda$getNewCardComment$14$CommentPlugin(Boolean bool) {
        C13479a.m54764b("CommentPlugin", "comment close, inputCancelCb = " + this.mListenerCb);
        if (this.mListenerCb != null && this.mComment.mo34339i()) {
            C13479a.m54764b("CommentPlugin", "comment send cancel");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) "show_cards");
            jSONObject.put("action", (Object) "cancel");
            this.mListenerCb.mo17188a(jSONObject);
        }
        this.commentViewModel.isShowingComment().mo5929b((Boolean) false);
        handleOrientationWhenExit(this.commentViewModel.getPartOrientationHandler());
        getNewCardComment().mo34327c(true);
        if (bool.booleanValue()) {
            return null;
        }
        this.commentViewModel.getCommentAnimationLiveData().mo5929b(new CommentAnimationListener(false, false, true));
        return null;
    }

    public /* synthetic */ void lambda$null$1$CommentPlugin(View view) {
        int b = C13749l.m55749b(view.getHeight() - ((C13749l.m55748b() * 2) / 5));
        C13479a.m54764b("CommentPlugin", "panelHeight2 = " + b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("height", (Object) Integer.valueOf(b));
        jSONObject.put("action", (Object) "panelHeightUpdate");
        AbstractC7947h hVar = this.mListenerCb;
        if (hVar != null) {
            hVar.mo17188a(jSONObject);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            i = Math.min(C13749l.m55736a(), C13749l.m55748b());
        } else {
            i = Math.max(C13749l.m55736a(), C13749l.m55748b());
        }
        double d = (double) i;
        this.commentViewModel.setChangeMinPanelHeight((int) (0.2d * d));
        this.commentViewModel.setChangeDefaultPanelHeight((int) (0.7d * d));
        this.commentViewModel.setChangeMaxPanelHeight((int) (d * 0.9d));
        this.commentViewModel.setChangePanelHeightFlag(true);
        this.commentViewModel.setChangeShowHeight(true);
        IComment eVar = this.mComment;
        if (eVar != null) {
            eVar.mo34342k();
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.comment.showInput", new C5702m());
        map.put("biz.comment.hideInput", new C5694e());
        map.put("biz.comment.showCards", new C5700k());
        map.put("biz.reaction.showDetail", new C5701l());
        map.put("biz.util.showOperationPanel", new C5703n());
        map.put("biz.reaction.updateOrder", new C5709q());
        map.put("biz.clipboard.setText", new C5690a());
        map.put("biz.translate.setConfig", new C5708p());
        map.put("biz.comment.requestNative", new C5696g());
        map.put("biz.comment.commonEventListener", new C5695f());
        map.put("biz.comment.closePanel", new C5691b());
        map.put("biz.comment.activeCards", new C5707o());
        map.put("biz.util.getAppSetting", new C5692c());
        map.put("biz.comment.getAdapte", new C5693d());
        map.put("biz.comment.setPermission", new C5699j());
        map.put("biz.comment.cardIsShow", new C5710r());
        map.put("biz.comment.setEntity", new C5698i());
        map.put("biz.comment.removeEntity", new C5697h());
        map.put("biz.statistics.reportEvent", new ReportEventHandler(C5234y.m21391b()));
    }

    public /* synthetic */ void lambda$onAttachToHost$2$CommentPlugin(ShowCardsJsData showCardsJsData2) {
        this.showCardsJsData = showCardsJsData2;
        if (showCardsJsData2 != null) {
            this.per = showCardsJsData2.permission;
            String cur_comment_id = this.showCardsJsData.getCur_comment_id();
            if (cur_comment_id == null) {
                cur_comment_id = "";
            }
            List<CommentBean> a = Js2NativeComment.f16092a.mo22805a(this.showCardsJsData);
            if (!getNewCardComment().mo34313a(false)) {
                C10548d.m43696a((Context) getActivity());
            }
            if (!a.isEmpty() || getNewCardComment().mo34313a(false)) {
                if (!getNewCardComment().mo34313a(false)) {
                    if (isFromFeed()) {
                        this.mComment.mo34303a(getEnterAnimatorInFeed());
                        this.mComment.mo34316b(getExitAnimatorInFeed());
                        this.config.mo35281a(1L);
                    } else {
                        this.mComment.mo34303a((CommentAnimationParam) null);
                        this.mComment.mo34316b((CommentAnimationParam) null);
                        this.config.mo35281a(0L);
                    }
                    handleOrientationWhenEnter(this.commentViewModel.getPartOrientationHandler());
                    getNewCardComment().mo34327c(!((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34614c().mo34622c());
                    int changeDefaultPanelHeight = this.commentViewModel.getChangeDefaultPanelHeight();
                    if (changeDefaultPanelHeight == 0 || !this.commentViewModel.isChangePanelHeightFlag()) {
                        getNewCardComment().mo34305a(cur_comment_id, (Integer) null);
                    } else {
                        this.commentViewModel.setChangePanelHeightFlag(false);
                        getNewCardComment().mo34305a(cur_comment_id, Integer.valueOf(changeDefaultPanelHeight));
                    }
                    this.commentViewModel.isShowingComment().mo5929b((Boolean) true);
                } else {
                    this.mComment.mo34324c(cur_comment_id);
                }
                this.mComment.mo34306a(a);
                View decorView = this.mComment.mo34314b().mo35279a().getWindow().getDecorView();
                decorView.post(new Runnable(decorView) {
                    /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$AMTZ31n5p4KppjcmRzoz_SwuB0 */
                    public final /* synthetic */ View f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        CommentPlugin.this.lambda$null$1$CommentPlugin(this.f$1);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.commentViewModel = (C5711a) C4950k.m20478a(eVar, C5711a.class);
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39924a(this.commentViewModel);
        C6215b bVar = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
        this.editPanelsManager = bVar;
        bVar.registerEditPanel(getLifecycleOwner(), this.commentViewModel);
        this.commentViewModel.getCommentInputRequest().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$R1eHLlQyR6YAoX7gQzf80mutykw */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                CommentPlugin.this.lambda$onAttachToHost$0$CommentPlugin((CommentInputRequest) obj);
            }
        });
        this.commentViewModel.getCommentCardsRequest().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$m8t2jEk5Ph7Hlh357qdbV_AZitQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                CommentPlugin.this.lambda$onAttachToHost$2$CommentPlugin((ShowCardsJsData) obj);
            }
        });
        this.commentViewModel.getChangeShowHeight().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$txA6AXIjTMDXJKU57yNt2M9fCXM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                CommentPlugin.this.lambda$onAttachToHost$3$CommentPlugin((Boolean) obj);
            }
        });
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39924a(this.commentViewModel);
        getHost().mo19549a(SearchPlugin.class, new AbstractC4942d() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$uB3TG0mZR4WK6KQ6nxq3zzRR8Q */

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                CommentPlugin.this.lambda$onAttachToHost$4$CommentPlugin((SearchPlugin) cVar);
            }
        });
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        this.commentViewModel.reset();
        destroy();
        AbstractC10550f.AbstractC10551a.m43717b(eVar.mo19564f()).mo39928b(this.commentViewModel);
        this.commentViewModel.onDetachFromUI();
    }

    public /* synthetic */ Unit lambda$onAttachToUIContainer$6$CommentPlugin(String str, Action action) {
        JSONObject c = ((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34613b().mo34618c(str);
        c.put("action", (Object) action.toString().toLowerCase());
        AbstractC7947h hVar = this.mListenerCb;
        if (hVar == null) {
            return null;
        }
        hVar.mo17188a(c);
        return null;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        boolean z;
        super.onAttachToUIContainer(eVar, nVar);
        getNewCardComment().mo34309a(new Function2() {
            /* class com.bytedance.ee.bear.document.comment.$$Lambda$CommentPlugin$__57ahMWraGIs8M8J_yAp4vfNmI */

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CommentPlugin.this.lambda$onAttachToUIContainer$6$CommentPlugin((String) obj, (Action) obj2);
            }
        });
        ICommentConfig b = this.mComment.mo34314b();
        if (findPlugin(FollowPlugin.class) != null) {
            z = true;
        } else {
            z = false;
        }
        b.mo35283a(z);
    }

    public /* synthetic */ Unit lambda$getNewCardComment$20$CommentPlugin(Integer num, Boolean bool) {
        if (num == null) {
            return null;
        }
        if (num.intValue() > 0) {
            if (Boolean.TRUE.equals(this.commentViewModel.getActive().mo5927b())) {
                this.editPanelsManager.requestUpdateWebContentHeight();
            } else {
                this.commentViewModel.setActive(true);
            }
        }
        if (bool.booleanValue() && num.intValue() >= 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", (Object) num);
            jSONObject.put("keyboardType", (Object) Comment.f24093e);
            jSONObject.put("position", (Object) Integer.valueOf(this.mComment.mo34295S()));
            getBridge().mo19350a("lark.biz.util.setPanelHeight", jSONObject, null);
        }
        return null;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$15$CommentPlugin(String str, String str2, Integer num) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("commentId", (Object) str);
        jSONObject.put("replyId", (Object) str2);
        jSONObject.put("index", (Object) num);
        jSONObject.put("action", (Object) "activateImageChange");
        AbstractC7947h hVar = this.mListenerCb;
        if (hVar == null) {
            return null;
        }
        hVar.mo17188a(jSONObject);
        return null;
    }

    public /* synthetic */ Unit lambda$getNewCardComment$9$CommentPlugin(String str, List list, Boolean bool, String str2) {
        AbstractC7947h hVar;
        boolean z = !bool.booleanValue();
        JSONObject inputCancelParam = this.commentViewModel.getInputCancelParam(z, str2);
        if (z && (hVar = this.mListenerCb) != null) {
            hVar.mo17188a(inputCancelParam);
        }
        handleOrientationWhenExit(this.commentViewModel.getInputOrientationHandler());
        if (commentShow(true)) {
            return null;
        }
        this.commentViewModel.setActive(false);
        return null;
    }
}

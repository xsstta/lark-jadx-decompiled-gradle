package com.ss.android.lark.chat.chatwindow.chat.message.text;

import android.app.Dialog;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33291a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell;
import com.ss.android.lark.chat.core.view.PostChatView;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.post.PostChatView2;
import com.ss.android.lark.chatthread.view.CopyMessagePopupWindow;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.p1724a.C35256c;
import com.ss.android.lark.chatwindow.view.photo_preview.ChatAlbumClickListenerImpl;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.p2851u.p2852a.C57308c;
import com.ss.android.lark.statistics.announce_opendoc.AnnounceOpenDocHitPoint;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IImageSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMediaSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.light.listener.ImageClickInfo;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.select.C59119d;
import com.ss.android.lark.widget.select.SelectedTextInfo;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PostMessageCell extends AbstractC33290a<PostContentVO, PostMessageViewHolder> {

    /* renamed from: a */
    public final IBrowserDependency f85916a = C29990c.m110930b().mo134593u();

    /* renamed from: b */
    public final AbstractC36474h.AbstractC36489o f85917b = C29990c.m110930b().mo134525X();

    /* renamed from: c */
    public final AbstractC33302l f85918c;

    /* renamed from: e */
    public boolean f85919e = false;

    /* renamed from: g */
    private final C35256c f85920g;

    /* renamed from: h */
    private final AbstractC33291a f85921h;

    /* renamed from: i */
    private C33240h.AbstractC33243b f85922i;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.post_content_light_item2;
    }

    public static class PostMessageViewHolder extends AbstractC59010e implements AbstractC32939b {

        /* renamed from: a */
        public View f85939a;

        /* renamed from: b */
        public PostChatView2 f85940b;

        /* renamed from: c */
        public View f85941c;

        /* renamed from: d */
        LinearLayout f85942d;
        @BindView(7603)
        ViewGroup docCardContainer;
        @BindView(9115)
        public TextView mGroupAnnounceDetail;
        @BindView(7389)
        public PostChatView2 mPostView;
        @BindView(8440)
        public ViewStub mTranslateStub;
        @BindView(9228)
        ViewGroup mUrlNetPreviewCardContainer;
        @BindView(9229)
        ViewGroup mUrlNetPreviewMarginContainer;
        @BindView(9231)
        ViewStub mUrlPreviewStub;

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: f */
        public int mo121631f() {
            return 30;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: a */
        public ViewGroup mo121626a() {
            return this.docCardContainer;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: b */
        public ViewGroup mo121627b() {
            return this.mUrlNetPreviewCardContainer;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: c */
        public ViewGroup mo121628c() {
            return this.mUrlNetPreviewMarginContainer;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: d */
        public ViewGroup mo121629d() {
            return this.f85942d;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: g */
        public LarkFont mo121632g() {
            return LarkFont.BODY1;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: h */
        public LarkFont mo121633h() {
            return LarkFont.BODY1;
        }

        @Override // com.ss.android.lark.chat.base.view.AbstractC32939b
        /* renamed from: e */
        public ViewGroup mo121630e() {
            if (this.f85942d == null) {
                this.f85942d = (LinearLayout) C36443k.m143598a(this.mUrlPreviewStub.getContext()).mo134315a(this.mUrlPreviewStub).findViewById(R.id.url_preview_layout);
            }
            return this.f85942d;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m129227a(this.mPostView);
        }

        /* renamed from: a */
        private void m129227a(PostChatView2 postChatView2) {
            postChatView2.setTitleTextSize(LKUIDisplayManager.m91864a(postChatView2.getContext(), 17));
            postChatView2.setTextSize((int) LKUIDisplayManager.m91864a(postChatView2.getContext(), 17));
            postChatView2.setShowMoreTextSize(LKUIDisplayManager.m91864a(postChatView2.getContext(), 14));
            C25649b.m91857a(this.mGroupAnnounceDetail, LarkFont.BODY1);
        }

        /* renamed from: a */
        public void mo122877a(boolean z, boolean z2) {
            if (!z || !z2) {
                View view = this.f85939a;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f85939a == null) {
                View a = C36443k.m143598a(this.mTranslateStub.getContext()).mo134315a(this.mTranslateStub);
                this.f85939a = a;
                this.f85940b = (PostChatView2) a.findViewById(R.id.translate_post);
                this.f85941c = this.f85939a.findViewById(R.id.translate_divider);
                TextView textView = (TextView) this.f85939a.findViewById(R.id.translate_label);
                m129227a(this.f85940b);
                if (!DesktopUtil.m144307b() && textView != null) {
                    C25649b.m91857a(textView, LarkFont.CAPTION0);
                }
            }
            this.f85939a.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<PostMessageViewHolder> mo122650b() {
        return PostMessageViewHolder.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return PostContentVO.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(PostMessageViewHolder postMessageViewHolder, AbsMessageVO<PostContentVO> aVar) {
        boolean z;
        PostContentVO iVar;
        super.mo122648a((AbstractC59010e) postMessageViewHolder, (AbsMessageVO) aVar);
        PostContentVO g = aVar.mo121699g();
        boolean z2 = !C35247g.m137634b((TranslatableContentVO) g);
        boolean z3 = g.mo121929x() == 3;
        boolean z4 = !z2 || z3;
        postMessageViewHolder.mo122877a(z4, z2);
        if (z4) {
            iVar = g;
            z = false;
        } else {
            iVar = (PostContentVO) g.mo121930y();
            z = true;
        }
        m129189a(postMessageViewHolder.mPostView, aVar.mo121695c(), iVar.mo121882n(), false);
        m129188a(postMessageViewHolder.mPostView, iVar.mo121772a(), postMessageViewHolder, aVar, !z4);
        m129186a(postMessageViewHolder.mPostView, iVar, postMessageViewHolder, aVar, z);
        if (C35247g.m137635b((ContentVO) g)) {
            m129183a(postMessageViewHolder.mGroupAnnounceDetail);
        } else {
            postMessageViewHolder.mGroupAnnounceDetail.setVisibility(8);
        }
        if (z2 && z3) {
            PostContentVO iVar2 = (PostContentVO) g.mo121930y();
            m129189a(postMessageViewHolder.f85940b, aVar.mo121695c(), iVar2.mo121882n(), true);
            m129188a(postMessageViewHolder.f85940b, iVar2.mo121772a(), postMessageViewHolder, aVar, true);
            m129186a(postMessageViewHolder.f85940b, iVar2, postMessageViewHolder, aVar, true);
            postMessageViewHolder.f85941c.setBackgroundColor(C33360a.m129175s(aVar.mo121695c()));
        }
        m129201d(postMessageViewHolder, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m129193a(PostChatView2 postChatView2, PostMessageViewHolder postMessageViewHolder, AbsMessageVO aVar, boolean z, View view) {
        if (!m129203f() || postChatView2.mo127191a()) {
            mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
            return true;
        }
        m129187a(postChatView2, postMessageViewHolder, aVar, z);
        return true;
    }

    /* renamed from: a */
    public void mo122863a(AbsMessageVO<PostContentVO> aVar) {
        if (!this.f85789d.mo122559w()) {
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "@someone", ChatHitPointNew.f135660c.mo187391b("@someone"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
        }
    }

    /* renamed from: a */
    public ActivityTransitionLauncher.LocationInfo mo122861a(ImageClickInfo kVar) {
        ActivityTransitionLauncher.LocationInfo locationInfo = new ActivityTransitionLauncher.LocationInfo();
        locationInfo.width = kVar.mo198121c();
        locationInfo.height = kVar.mo198124d();
        locationInfo.left = kVar.mo198126e();
        locationInfo.top = kVar.mo198127f();
        return locationInfo;
    }

    /* renamed from: a */
    public void mo122864a(AbsMessageVO<PostContentVO> aVar, String str) {
        String str2;
        DocType docType;
        PostContentVO g = aVar.mo121699g();
        DocResult p = g.mo121884p();
        PreviewHangPoint q = g.mo121885q();
        String str3 = "docs";
        String str4 = null;
        if (p != null) {
            str2 = p.getDoc().getId();
            docType = p.getDoc().getDocType();
        } else {
            if (CollectionUtils.isNotEmpty(((PostContent) g.mo126168z()).getDocEntityMap())) {
                Iterator it = new ArrayList(((PostContent) g.mo126168z()).getDocEntityMap().values()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Doc doc = (Doc) it.next();
                    if (TextUtils.equals(str, doc.getUrl())) {
                        str2 = doc.getId();
                        docType = doc.getDocType();
                        break;
                    }
                }
            } else if (q != null) {
                ChatHitPointNew.f135660c.mo187387a(q.getUrl(), q.getPreviewId(), "open_url");
            }
            str2 = null;
            docType = null;
            str3 = "url";
        }
        if (!this.f85789d.mo122559w()) {
            if (docType != null) {
                str4 = ChatHitPointNew.f135660c.mo187376a(docType);
            }
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), str3, ChatHitPointNew.f135660c.mo187391b(str3), ChatHitPointNew.f135660c.mo187378a(aVar, str2, str4));
        }
    }

    /* renamed from: j */
    private boolean m129205j() {
        return this.f85789d.mo122559w();
    }

    public class PostMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private PostMessageViewHolder f85943a;

        @Override // butterknife.Unbinder
        public void unbind() {
            PostMessageViewHolder postMessageViewHolder = this.f85943a;
            if (postMessageViewHolder != null) {
                this.f85943a = null;
                postMessageViewHolder.mPostView = null;
                postMessageViewHolder.mTranslateStub = null;
                postMessageViewHolder.mGroupAnnounceDetail = null;
                postMessageViewHolder.mUrlPreviewStub = null;
                postMessageViewHolder.docCardContainer = null;
                postMessageViewHolder.mUrlNetPreviewCardContainer = null;
                postMessageViewHolder.mUrlNetPreviewMarginContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public PostMessageViewHolder_ViewBinding(PostMessageViewHolder postMessageViewHolder, View view) {
            this.f85943a = postMessageViewHolder;
            postMessageViewHolder.mPostView = (PostChatView2) Utils.findRequiredViewAsType(view, R.id.chat_post, "field 'mPostView'", PostChatView2.class);
            postMessageViewHolder.mTranslateStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.post_translate_content, "field 'mTranslateStub'", ViewStub.class);
            postMessageViewHolder.mGroupAnnounceDetail = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_announcement_detail, "field 'mGroupAnnounceDetail'", TextView.class);
            postMessageViewHolder.mUrlPreviewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.url_preview_stub, "field 'mUrlPreviewStub'", ViewStub.class);
            postMessageViewHolder.docCardContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.doc_card_container, "field 'docCardContainer'", ViewGroup.class);
            postMessageViewHolder.mUrlNetPreviewCardContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.url_net_preview_container, "field 'mUrlNetPreviewCardContainer'", ViewGroup.class);
            postMessageViewHolder.mUrlNetPreviewMarginContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.url_net_preview_margin_container, "field 'mUrlNetPreviewMarginContainer'", ViewGroup.class);
        }
    }

    /* renamed from: f */
    private boolean m129203f() {
        if (DesktopUtil.m144301a((Context) this.f85789d.mo122543g()) || this.f85789d.mo122549m()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private ProcessParams m129204i() {
        ProcessParams a = TextLayoutProcessor.m128387a();
        if (this.f85789d.mo122559w()) {
            a.mo122463a(19);
        }
        return a;
    }

    /* renamed from: a */
    private void m129183a(TextView textView) {
        textView.setVisibility(8);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.View$OnClickListenerC333708 */

            public void onClick(View view) {
                String str;
                if (PostMessageCell.this.f85789d.mo122550n() != null) {
                    str = PostMessageCell.this.f85789d.mo122550n().getChatAnnouncement().getAnnounceUrl();
                    AnnounceOpenDocHitPoint.f135643a.mo187338a("message", PostMessageCell.this.f85789d.mo122544h());
                } else {
                    str = "";
                }
                PostMessageCell.this.f85916a.mo134330a(PostMessageCell.this.mo122719d(), str);
            }
        });
    }

    /* renamed from: a */
    private String m129182a(PostContentVO iVar) {
        if (!this.f85789d.mo122559w() || this.f85919e) {
            return iVar.mo121877a(C29990c.m110930b().mo134528a());
        }
        return "";
    }

    /* renamed from: c */
    private void m129199c(PostMessageViewHolder postMessageViewHolder, AbsMessageVO<PostContentVO> aVar) {
        if (this.f85789d.mo122559w()) {
            m129196b((AbstractC59010e) postMessageViewHolder, aVar);
        } else {
            mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(PostMessageViewHolder postMessageViewHolder, AbsMessageVO<PostContentVO> aVar) {
        if (!this.f85789d.mo122549m()) {
            postMessageViewHolder.mPostView.performClick();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129197b(C59119d dVar, AbsMessageVO aVar) {
        dVar.mo200867b();
        this.f85789d.mo122534a((int[]) null);
        ((PostContentVO) aVar.mo121699g()).mo121777a("");
        ((PostContentVO) aVar.mo121699g()).mo121783b(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129184a(AbsMessageVO aVar, View view) {
        this.f85921h.mo122756i(aVar.mo121681a());
    }

    /* renamed from: b */
    private void m129195b(AbsMessageVO<PostContentVO> aVar, String str) {
        if (aVar.mo121699g().mo121887s()) {
            PreviewHangPoint q = aVar.mo121699g().mo121885q();
            ChatHitPointNew.f135660c.mo187387a(q.getUrl(), q.getPreviewId(), str);
        }
    }

    /* renamed from: d */
    private void m129201d(PostMessageViewHolder postMessageViewHolder, AbsMessageVO<PostContentVO> aVar) {
        this.f85920g.mo129752a(postMessageViewHolder, new C33381b(aVar, this.f85789d.mo122550n(), this.f85789d.mo122551o()), m129205j(), new View.OnLongClickListener(postMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$VJs0PsVq1uOZQiu3av79u6s2Hc */
            public final /* synthetic */ PostMessageCell.PostMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return PostMessageCell.m270381lambda$VJs0PsVq1uOZQiu3av79u6s2Hc(PostMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        if (postMessageViewHolder.f85942d != null) {
            postMessageViewHolder.f85942d.setOnLongClickListener(new View.OnLongClickListener(postMessageViewHolder, aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$iy_TVbWlBHCcttkKDtVfhnNr7jw */
                public final /* synthetic */ PostMessageCell.PostMessageViewHolder f$1;
                public final /* synthetic */ AbsMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return PostMessageCell.lambda$iy_TVbWlBHCcttkKDtVfhnNr7jw(PostMessageCell.this, this.f$1, this.f$2, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129194b(AbsMessageVO aVar, View view) {
        String str;
        PostContentVO iVar = (PostContentVO) aVar.mo121699g();
        if (iVar.mo121887s()) {
            UrlPreviewEntity urlPreviewEntity = iVar.mo121885q().getUrlPreviewEntity();
            if (urlPreviewEntity instanceof NetUrlPreviewEntity) {
                NetUrlPreviewEntity netUrlPreviewEntity = (NetUrlPreviewEntity) urlPreviewEntity;
                if (!(netUrlPreviewEntity.getPreviewBody() == null || netUrlPreviewEntity.getPreviewBody().getCardUrl() == null)) {
                    Url cardUrl = netUrlPreviewEntity.getPreviewBody().getCardUrl();
                    if (cardUrl.getAndroidUrl() == null || cardUrl.getAndroidUrl().isEmpty()) {
                        str = cardUrl.getUrl();
                    } else {
                        str = cardUrl.getAndroidUrl();
                    }
                    C29990c.m110930b().mo134593u().mo134330a(mo122719d(), str);
                }
            }
        }
        m129195b(aVar, "page_click");
    }

    /* renamed from: b */
    private void m129196b(AbstractC59010e eVar, AbsMessageVO<PostContentVO> aVar) {
        View findViewById = eVar.f146209n.findViewById(R.id.post_content);
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$2ZBrVMbzVX4vJVV3JbtyTav3QLo */

                public final void onScrollChanged() {
                    PostMessageCell.lambda$2ZBrVMbzVX4vJVV3JbtyTav3QLo(CopyMessagePopupWindow.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129191a(C59119d dVar, AbsMessageVO aVar) {
        UICallbackExecutor.post(new Runnable(dVar, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$F8B9Rf013Mgr5_mk1PxN2kNr694 */
            public final /* synthetic */ C59119d f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                PostMessageCell.lambda$F8B9Rf013Mgr5_mk1PxN2kNr694(PostMessageCell.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m129200c(PostMessageViewHolder postMessageViewHolder, AbsMessageVO aVar, View view) {
        mo122683c(postMessageViewHolder, (AbsMessageVO<PostContentVO>) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m129192a(PostMessageViewHolder postMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m129198b(PostMessageViewHolder postMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m129202d(PostMessageViewHolder postMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
    }

    public PostMessageCell(AbstractC33342d dVar, AbstractC33302l lVar, AbstractC33291a aVar) {
        super(dVar);
        this.f85920g = new C35256c(dVar);
        this.f85918c = lVar;
        this.f85921h = aVar;
    }

    /* renamed from: a */
    private void m129187a(PostChatView2 postChatView2, PostMessageViewHolder postMessageViewHolder, AbsMessageVO<PostContentVO> aVar, boolean z) {
        C59119d a = new C59119d.C59121a(postChatView2.getContentView()).mo200875a(UIUtils.getColor(this.f85789d.mo122543g(), R.color.primary_pri_500)).mo200874a((float) UIHelper.dp2px(15.0f)).mo200876a();
        a.mo200866a(new C59119d.AbstractC59123c(aVar, z, a, postMessageViewHolder) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$MzuWCBM6JlF258y_Dacne3xC3o4 */
            public final /* synthetic */ AbsMessageVO f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ C59119d f$3;
            public final /* synthetic */ PostMessageCell.PostMessageViewHolder f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.ss.android.lark.widget.select.C59119d.AbstractC59123c
            public final void onTextSelected(SelectedTextInfo aVar) {
                PostMessageCell.lambda$MzuWCBM6JlF258y_Dacne3xC3o4(PostMessageCell.this, this.f$1, this.f$2, this.f$3, this.f$4, aVar);
            }
        });
        a.mo200864a();
    }

    /* renamed from: a */
    private void m129189a(PostChatView2 postChatView2, boolean z, boolean z2, boolean z3) {
        this.f85919e = z2;
        postChatView2.setTitleTextColor(UIUtils.getColor(mo122719d(), R.color.text_title));
        postChatView2.setShowMoreViewBg(C33360a.m129152a(mo122719d(), z));
        if (z2) {
            postChatView2.getTitleDivisionView().setBackground(null);
        } else {
            postChatView2.getTitleDivisionView().setBackgroundColor(C33360a.m129176t(z));
        }
        if (z3) {
            postChatView2.getTitleDivisionView().setBackgroundColor(this.f85789d.mo122543g().getResources().getColor(R.color.line_border_card));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129185a(AbsMessageVO aVar, boolean z, C59119d dVar, PostMessageViewHolder postMessageViewHolder, SelectedTextInfo aVar2) {
        Log.m165379d("PostMessageCell2", "copy text is:" + ((Object) aVar2.mo200855a()));
        ((PostContentVO) aVar.mo121699g()).mo121777a(aVar2.mo200855a());
        ((PostContentVO) aVar.mo121699g()).mo121783b(z);
        this.f85789d.mo122534a(new int[]{aVar2.mo200856b(), aVar2.mo200857c(), aVar2.mo200858d()});
        this.f85922i = new C33240h.AbstractC33243b(dVar, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$f67iKUlt04KsJJWl0BzmKkBYLX8 */
            public final /* synthetic */ C59119d f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.C33240h.AbstractC33243b
            public final void hideSelection() {
                PostMessageCell.lambda$f67iKUlt04KsJJWl0BzmKkBYLX8(PostMessageCell.this, this.f$1, this.f$2);
            }
        };
        C33240h.m128531a().mo122573a(this.f85922i);
        C33240h.m128531a().mo122574a(aVar2.mo200859e());
        m129199c(postMessageViewHolder, (AbsMessageVO<PostContentVO>) aVar);
    }

    /* renamed from: a */
    private void m129186a(PostChatView2 postChatView2, PostContentVO iVar, PostMessageViewHolder postMessageViewHolder, AbsMessageVO<PostContentVO> aVar, boolean z) {
        String str;
        String str2;
        if (!aVar.ai()) {
            postChatView2.setPreMessageOnClickListener(null);
        } else {
            postChatView2.setPreMessageOnClickListener(new View.OnClickListener(postMessageViewHolder, aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$zKeJFlpdumrLnucnzNH0iWjlSsc */
                public final /* synthetic */ PostMessageCell.PostMessageViewHolder f$1;
                public final /* synthetic */ AbsMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    PostMessageCell.lambda$zKeJFlpdumrLnucnzNH0iWjlSsc(PostMessageCell.this, this.f$1, this.f$2, view);
                }
            });
        }
        postChatView2.setOnLongTextClickListener(new PostChatView.AbstractC33970a(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$FY4nUXTyV6Wmpv7T_lIq80atfs */
            public final /* synthetic */ AbsMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.core.view.PostChatView.AbstractC33970a
            public final void onClick(View view) {
                PostMessageCell.m270380lambda$FY4nUXTyV6Wmpv7T_lIq80atfs(PostMessageCell.this, this.f$1, view);
            }
        });
        if (iVar != null) {
            postChatView2.setMaxHeightFactor(iVar.mo121787f());
            postChatView2.setEnableEllipsize(iVar.mo121786e());
            if (this.f85789d.mo122550n() != null) {
                str = this.f85789d.mo122550n().getChatAnnouncement().getAnnounceUrl();
            } else {
                str = "";
            }
            Layout j = iVar.mo121790j();
            if (j == null) {
                long currentTimeMillis = System.currentTimeMillis();
                Layout a = TextLayoutProcessor.m128384a(aVar, m129204i().mo122483i(z), this.f85789d.mo122543g());
                Log.m165389i("PostMessageCell2", "bind text layout is null, rebuild layout. Time cost:" + (System.currentTimeMillis() - currentTimeMillis));
                j = a;
            }
            String a2 = m129182a(iVar);
            boolean ai2 = aVar.ai();
            String b = aVar.mo121692b();
            String a3 = aVar.mo121681a();
            String h = aVar.mo121700h();
            boolean n = iVar.mo121882n();
            if (iVar.mo121882n()) {
                str2 = str;
            } else {
                str2 = "";
            }
            postChatView2.mo127190a(a2, j, ai2, b, a3, h, n, str2, this.f85789d.mo122549m(), this.f85789d.mo122546j());
            return;
        }
        Log.m165383e("PostMessageCell2", "Bind post message failed， empty postContent， msgId:" + aVar.mo121681a());
    }

    /* renamed from: a */
    private void m129188a(final PostChatView2 postChatView2, final RichText richText, PostMessageViewHolder postMessageViewHolder, final AbsMessageVO<PostContentVO> aVar, final boolean z) {
        postChatView2.setPhoneSpanClickListener(new IPhoneSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333621 */

            @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
            /* renamed from: b */
            public void mo122867b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
            /* renamed from: a */
            public void mo122866a(View view, String str) {
                PostMessageCell.this.f85917b.mo134641a(PostMessageCell.this.mo122719d(), str);
            }
        });
        postChatView2.setUrlSpanClickListener(new IUrlSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333632 */

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public boolean b_(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public void a_(View view, String str) {
                C29990c.m110930b().mo134577e().mo120961b();
                PostMessageCell.this.f85916a.mo134333b(PostMessageCell.this.mo122719d(), str, PostMessageCell.this.f85789d.mo122540d() ? 1 : 0);
                MessageHitPoint.f135779d.mo187533a("richtext", C35247g.m137626a(PostMessageCell.this.f85789d.mo122542f(), PostMessageCell.this.f85789d.mo122540d(), PostMessageCell.this.f85789d.mo122548l()), aVar.mo121681a());
                if (!PostMessageCell.this.f85789d.mo122546j()) {
                    C29990c.m110930b().mo134594v().mo134496a(str);
                }
                PostMessageCell.this.mo122864a(aVar, str);
            }
        });
        postChatView2.setAtSpanClickListener(new IAtSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333643 */

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: b */
            public boolean mo122871b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: a */
            public void mo122870a(View view, String str, String str2) {
                C29990c.m110930b().mo134523V().mo134436a(PostMessageCell.this.mo122719d(), new ProfileSource.C36868a().mo136066c(str2).mo136065b(aVar.mo121692b()).mo136060a(1).mo136062a(C34339g.m133170d(PostMessageCell.this.f85789d.mo122550n())).mo136063a());
                PostMessageCell.this.mo122863a(aVar);
            }
        });
        postChatView2.setMentionSpanClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333654 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                C29990c.m110930b().mo134548a(PostMessageCell.this.mo122719d(), str3);
            }
        });
        postChatView2.setOnLongClickListener(new View.OnLongClickListener(postChatView2, postMessageViewHolder, aVar, z) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$hfI2szD27ehfP0GSwW4q6OEQ2U */
            public final /* synthetic */ PostChatView2 f$1;
            public final /* synthetic */ PostMessageCell.PostMessageViewHolder f$2;
            public final /* synthetic */ AbsMessageVO f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final boolean onLongClick(View view) {
                return PostMessageCell.m270383lambda$hfI2szD27ehfP0GSwW4q6OEQ2U(PostMessageCell.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
        postChatView2.setImageClickListener(new IImageSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333665 */

            @Override // com.ss.android.lark.widget.light.listener.IImageSpanClickListener
            /* renamed from: a */
            public void mo122874a(View view, ImageClickInfo kVar) {
                PhotoItem a;
                if (PostMessageCell.this.f85919e) {
                    postChatView2.performClick();
                    return;
                }
                Image a2 = C59031e.m229175a(richText, kVar.mo198118b(), kVar.mo198115a());
                if (a2 == null) {
                    Log.m165383e("PostMessageCell2", "Can't find select image, token:" + kVar.mo198118b() + ", url:" + kVar.mo198115a());
                    return;
                }
                com.ss.android.lark.image.entity.Image a3 = C57305aa.m222055a(a2);
                if (a3 != null && (a = C34353s.m133242a(richText, a3, aVar.mo121681a(), aVar.mo121695c())) != null) {
                    a.getTranslateProperty().setTranslated(z);
                    PostMessageCell.this.f85918c.mo122772a(view, PostMessageCell.this.mo122861a(kVar), a, false, z, 2);
                }
            }
        });
        postChatView2.setVideoClickListener(new IMediaSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333676 */

            @Override // com.ss.android.lark.widget.light.listener.IMediaSpanClickListener
            /* renamed from: a */
            public void mo122875a(View view, MediaInfo mediaInfo) {
                Scene scene;
                List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(C57308c.m222071a(aVar.mo121681a(), aVar.mo121692b(), C59031e.m229177a(((BaseTextContentVO) aVar.mo121699g()).mo121772a(), mediaInfo))));
                if (!CollectionUtils.isEmpty(a)) {
                    DialogMenuClickListenerImpl dialogMenuClickListenerImpl = new DialogMenuClickListenerImpl(PostMessageCell.this.f85789d.mo122544h());
                    ChatAlbumClickListenerImpl chatAlbumClickListenerImpl = new ChatAlbumClickListenerImpl(PostMessageCell.this.f85789d.mo122544h(), PostMessageCell.this.f85789d.mo122558v());
                    if (PostMessageCell.this.f85789d.mo122546j()) {
                        scene = Scene.SecretChat;
                    } else if (PostMessageCell.this.f85789d.mo122558v() || PostMessageCell.this.f85789d.mo122560x()) {
                        scene = Scene.Thread;
                    } else {
                        scene = Scene.Chat;
                    }
                    C29990c.m110930b().mo134542a(PostMessageCell.this.mo122719d(), a, 0, view, null, false, !PostMessageCell.this.f85789d.mo122546j(), false, false, !PostMessageCell.this.f85789d.mo122546j(), false, false, false, dialogMenuClickListenerImpl, null, chatAlbumClickListenerImpl, scene, 2);
                }
            }
        });
        postChatView2.setAbbreviationsClickListener(new IAbbreviationClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333687 */

            @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener
            public void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                C29990c.m110930b().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, PostMessageCell.this.f85789d.mo122544h(), new AbstractC28533c() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell.C333687.C333691 */

                    @Override // com.ss.android.lark.ai.AbstractC28533c
                    /* renamed from: a */
                    public void mo101579a(Dialog dialog) {
                        WindowDialogManager.f91123a.mo129819a(dialog);
                    }

                    @Override // com.ss.android.lark.ai.AbstractC28533c
                    /* renamed from: a */
                    public void mo101580a(PopupWindow popupWindow) {
                        WindowDialogManager.f91123a.mo129820a(popupWindow);
                    }
                }, abbreviationInfo.messageId);
            }
        });
        postChatView2.setIntentionClickListener(new C33377a(mo122719d(), this.f85921h, this.f85789d));
        postMessageViewHolder.mUrlNetPreviewMarginContainer.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$XwFjzF5TRIkRIi8qXjcSouWM8s */
            public final /* synthetic */ AbsMessageVO f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                PostMessageCell.m270382lambda$XwFjzF5TRIkRIi8qXjcSouWM8s(PostMessageCell.this, this.f$1, view);
            }
        });
        postMessageViewHolder.mUrlNetPreviewMarginContainer.setOnLongClickListener(new View.OnLongClickListener(postMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$PostMessageCell$Q9_YTmV2hnXyg49L3TON9yJCZs8 */
            public final /* synthetic */ PostMessageCell.PostMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return PostMessageCell.lambda$Q9_YTmV2hnXyg49L3TON9yJCZs8(PostMessageCell.this, this.f$1, this.f$2, view);
            }
        });
    }
}

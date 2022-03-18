package com.ss.android.lark.chat.chatwindow.chat.message.text;

import android.app.Dialog;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
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
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.chat.base.view.AbstractC32939b;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ProcessParams;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33291a;
import com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell;
import com.ss.android.lark.chat.core.view.TextChatView;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.PreviewVideo;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.TextChatView2;
import com.ss.android.lark.chatthread.view.CopyMessagePopupWindow;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.chatwindow.view.p1724a.C35256c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.video_site.VideoSiteHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.select.C59119d;
import com.ss.android.lark.widget.select.SelectableView;
import com.ss.android.lark.widget.select.SelectedTextInfo;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class TextMessageCell extends AbstractC33290a<TextContentVO, TextMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC36474h.AbstractC36489o f85944a;

    /* renamed from: b */
    private final AbstractC33291a f85945b;

    /* renamed from: c */
    private final C35256c f85946c;

    /* renamed from: e */
    private final al f85947e = C29990c.m110930b().mo134596x();

    /* renamed from: g */
    private C33240h.AbstractC33243b f85948g;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.text_content_light_item2;
    }

    public static class TextMessageViewHolder extends AbstractC59010e implements AbstractC32939b {

        /* renamed from: a */
        public View f85959a;

        /* renamed from: b */
        public TextChatView2 f85960b;

        /* renamed from: c */
        public View f85961c;

        /* renamed from: d */
        LinearLayout f85962d;
        @BindView(7603)
        ViewGroup docCardContainer;

        /* renamed from: e */
        View f85963e;

        /* renamed from: f */
        TextView f85964f;

        /* renamed from: g */
        TextView f85965g;

        /* renamed from: h */
        ImageView f85966h;

        /* renamed from: i */
        ImageView f85967i;

        /* renamed from: j */
        ImageView f85968j;
        @BindView(8940)
        public TextChatView2 mMessageTextView;
        @BindView(8963)
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
            return this.f85962d;
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
            if (this.f85962d == null) {
                View inflate = this.mUrlPreviewStub.inflate();
                this.f85962d = (LinearLayout) inflate.findViewById(R.id.url_preview_layout);
                this.f85963e = inflate.findViewById(R.id.divider_preview);
                this.f85964f = (TextView) inflate.findViewById(R.id.url_title);
                this.f85965g = (TextView) inflate.findViewById(R.id.url_description);
                this.f85966h = (ImageView) inflate.findViewById(R.id.url_icon);
                this.f85967i = (ImageView) inflate.findViewById(R.id.video_preview);
                this.f85968j = (ImageView) inflate.findViewById(R.id.play_video);
                if (!DesktopUtil.m144307b()) {
                    C25649b.m91853a(this.f85966h, 30);
                    C25649b.m91857a(this.f85964f, LarkFont.BODY1);
                    C25649b.m91857a(this.f85965g, LarkFont.BODY1);
                }
            }
            return this.f85962d;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m129276a(this.mMessageTextView);
        }

        /* renamed from: a */
        private void m129276a(TextChatView2 textChatView2) {
            textChatView2.setTextSize(LKUIDisplayManager.m91864a(textChatView2.getContext(), 17));
            textChatView2.setShowMoreTextSize(LKUIDisplayManager.m91864a(textChatView2.getContext(), 14));
        }

        /* renamed from: a */
        public void mo122883a(Context context, boolean z, boolean z2) {
            if (!z || !z2) {
                View view = this.f85959a;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f85959a == null) {
                View a = C36443k.m143598a(context).mo134315a(this.mTranslateStub);
                this.f85959a = a;
                this.f85960b = (TextChatView2) a.findViewById(R.id.translate_content);
                this.f85961c = this.f85959a.findViewById(R.id.translate_divider);
                TextView textView = (TextView) this.f85959a.findViewById(R.id.translate_label);
                m129276a(this.f85960b);
                if (!DesktopUtil.m144307b() && textView != null) {
                    C25649b.m91857a(textView, LarkFont.CAPTION0);
                }
            }
            this.f85959a.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return TextContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<TextMessageViewHolder> mo122650b() {
        return TextMessageViewHolder.class;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122649a(com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.TextMessageViewHolder r15, com.ss.android.lark.chat.vo.AbsMessageVO<com.ss.android.lark.chat.base.view.vo.message.TextContentVO> r16) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.mo122649a(com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell$TextMessageViewHolder, com.ss.android.lark.chat.e.a):void");
    }

    /* renamed from: a */
    public void mo122879a(AbsMessageVO<TextContentVO> aVar) {
        if (!this.f85789d.mo122559w()) {
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "@someone", ChatHitPointNew.f135660c.mo187391b("@someone"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
        }
    }

    /* renamed from: a */
    public void mo122880a(AbsMessageVO<TextContentVO> aVar, String str) {
        String str2;
        DocType docType;
        TextContentVO g = aVar.mo121699g();
        DocResult n = g.mo121903n();
        PreviewHangPoint o = g.mo121904o();
        String str3 = "docs";
        String str4 = null;
        if (n != null) {
            str2 = n.getDoc().getId();
            docType = n.getDoc().getDocType();
        } else {
            if (CollectionUtils.isNotEmpty(((TextContent) g.mo126168z()).getDocEntityMap())) {
                Iterator it = new ArrayList(((TextContent) g.mo126168z()).getDocEntityMap().values()).iterator();
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
            } else if (o != null) {
                ChatHitPointNew.f135660c.mo187387a(o.getUrl(), o.getPreviewId(), "open_url");
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
    private boolean m129258j() {
        return this.f85789d.mo122559w();
    }

    public class TextMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TextMessageViewHolder f85969a;

        @Override // butterknife.Unbinder
        public void unbind() {
            TextMessageViewHolder textMessageViewHolder = this.f85969a;
            if (textMessageViewHolder != null) {
                this.f85969a = null;
                textMessageViewHolder.mMessageTextView = null;
                textMessageViewHolder.mTranslateStub = null;
                textMessageViewHolder.mUrlPreviewStub = null;
                textMessageViewHolder.docCardContainer = null;
                textMessageViewHolder.mUrlNetPreviewCardContainer = null;
                textMessageViewHolder.mUrlNetPreviewMarginContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TextMessageViewHolder_ViewBinding(TextMessageViewHolder textMessageViewHolder, View view) {
            this.f85969a = textMessageViewHolder;
            textMessageViewHolder.mMessageTextView = (TextChatView2) Utils.findRequiredViewAsType(view, R.id.text_content, "field 'mMessageTextView'", TextChatView2.class);
            textMessageViewHolder.mTranslateStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.text_translate_content, "field 'mTranslateStub'", ViewStub.class);
            textMessageViewHolder.mUrlPreviewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.url_preview_stub, "field 'mUrlPreviewStub'", ViewStub.class);
            textMessageViewHolder.docCardContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.doc_card_container, "field 'docCardContainer'", ViewGroup.class);
            textMessageViewHolder.mUrlNetPreviewCardContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.url_net_preview_container, "field 'mUrlNetPreviewCardContainer'", ViewGroup.class);
            textMessageViewHolder.mUrlNetPreviewMarginContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.url_net_preview_margin_container, "field 'mUrlNetPreviewMarginContainer'", ViewGroup.class);
        }
    }

    /* renamed from: i */
    private boolean m129257i() {
        if (DesktopUtil.m144301a((Context) this.f85789d.mo122543g()) || this.f85789d.mo122549m()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private ProcessParams m129256f() {
        ProcessParams a = TextLayoutProcessor.m128387a();
        if (this.f85789d.mo122559w()) {
            a.mo122463a(19);
        }
        if (this.f85789d.mo122550n() != null) {
            a.mo122464a(this.f85789d.mo122550n().getAnonymousId());
        }
        return a;
    }

    /* renamed from: c */
    private void m129255c(AbsMessageVO<TextContentVO> aVar) {
        TextContentVO g = aVar.mo121699g();
        if (g.mo121906q()) {
            PreviewHangPoint o = g.mo121904o();
            ChatHitPointNew.f135660c.mo187387a(o.getUrl(), o.getPreviewId(), "page_click");
        }
    }

    /* renamed from: b */
    public void mo122881b(AbsMessageVO<TextContentVO> aVar) {
        PreviewVideo previewVideo;
        MessageUrlPreview m = aVar.mo121699g().mo121902m();
        if (m != null && (previewVideo = m.getPreviewVideo()) != null) {
            VideoSiteHitPoint.f135914a.mo187770b(previewVideo.getSite());
        }
    }

    /* renamed from: a */
    private Layout m129238a(AbsMessageVO<TextContentVO> aVar, ProcessParams dVar) {
        return TextLayoutProcessor.m128384a(aVar, dVar, this.f85789d.mo122543g());
    }

    /* renamed from: b */
    private void m129248b(TextMessageViewHolder textMessageViewHolder, AbsMessageVO<TextContentVO> aVar) {
        if (this.f85789d.mo122559w()) {
            m129250b((AbstractC59010e) textMessageViewHolder, aVar);
        } else {
            mo122755b((AbstractC59010e) textMessageViewHolder, (Object) aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129240a(AbsMessageVO aVar, View view) {
        AbstractC33291a aVar2 = this.f85945b;
        if (aVar2 != null) {
            aVar2.mo122756i(aVar.mo121681a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129251b(C59119d dVar, AbsMessageVO aVar) {
        dVar.mo200867b();
        this.f85789d.mo122534a((int[]) null);
        ((TextContentVO) aVar.mo121699g()).mo121777a("");
        ((TextContentVO) aVar.mo121699g()).mo121783b(false);
    }

    public TextMessageCell(AbstractC33342d dVar, AbstractC33291a aVar) {
        super(dVar);
        this.f85945b = aVar;
        this.f85946c = new C35256c(dVar);
        this.f85944a = C29990c.m110930b().mo134525X();
    }

    /* renamed from: b */
    private void m129250b(AbstractC59010e eVar, AbsMessageVO<TextContentVO> aVar) {
        View findViewById = eVar.f146209n.findViewById(R.id.text_content);
        if (findViewById != null) {
            CopyMessagePopupWindow a = CopyMessagePopupWindow.m137451a(findViewById, this.f85789d, aVar).mo129643a();
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            a.getClass();
            viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$Sq9dbYraf3T5DcU9xpJr8bdsC8 */

                public final void onScrollChanged() {
                    CopyMessagePopupWindow.this.mo129644b();
                }
            });
        }
    }

    /* renamed from: c */
    private void m129253c(final TextMessageViewHolder textMessageViewHolder, final AbsMessageVO<TextContentVO> aVar) {
        this.f85946c.mo129752a(textMessageViewHolder, new C33381b(aVar, this.f85789d.mo122550n(), this.f85789d.mo122551o()), m129258j(), new View.OnLongClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.View$OnLongClickListenerC333766 */

            public boolean onLongClick(View view) {
                return TextMessageCell.this.mo122755b((AbstractC59010e) textMessageViewHolder, (Object) aVar);
            }
        });
        if (textMessageViewHolder.f85962d != null) {
            textMessageViewHolder.f85962d.setOnLongClickListener(new View.OnLongClickListener(textMessageViewHolder, aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$6P1Sv339U5woIbfZ4Z2kpjv4Zvs */
                public final /* synthetic */ TextMessageCell.TextMessageViewHolder f$1;
                public final /* synthetic */ AbsMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return TextMessageCell.lambda$6P1Sv339U5woIbfZ4Z2kpjv4Zvs(TextMessageCell.this, this.f$1, this.f$2, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m129249b(AbsMessageVO aVar, View view) {
        String str;
        TextContentVO mVar = (TextContentVO) aVar.mo121699g();
        if (mVar.mo121906q()) {
            UrlPreviewEntity urlPreviewEntity = mVar.mo121904o().getUrlPreviewEntity();
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
        m129255c(aVar);
    }

    /* renamed from: a */
    private void m129243a(TextChatView2 textChatView2, AbsMessageVO<TextContentVO> aVar) {
        if (aVar.mo121655A() == Message.Status.DELETED || (aVar.mo121706n() && aVar.mo121683a(this.f85947e.mo134462a()))) {
            textChatView2.setTextColor(C52990a.m205239c(this.f85789d.mo122543g(), R.color.text_placeholder));
        } else {
            textChatView2.setTextColor(C52990a.m205239c(this.f85789d.mo122543g(), R.color.text_title));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129245a(C59119d dVar, AbsMessageVO aVar) {
        UICallbackExecutor.post(new Runnable(dVar, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$KkcIWjeoTZlYuIPWYwpi806Rmhc */
            public final /* synthetic */ C59119d f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                TextMessageCell.lambda$KkcIWjeoTZlYuIPWYwpi806Rmhc(TextMessageCell.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m129254c(TextMessageViewHolder textMessageViewHolder, AbsMessageVO aVar, View view) {
        mo122683c((AbstractC59010e) textMessageViewHolder, (Object) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m129246a(TextMessageViewHolder textMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) textMessageViewHolder, (Object) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m129252b(TextMessageViewHolder textMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) textMessageViewHolder, (Object) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129239a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
        C29990c.m110930b().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, this.f85789d.mo122544h(), new AbstractC28533c() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.C333755 */

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

    /* renamed from: a */
    private void m129244a(SelectableView selectableView, TextMessageViewHolder textMessageViewHolder, AbsMessageVO<TextContentVO> aVar, boolean z) {
        C59119d a = new C59119d.C59121a(selectableView).mo200875a(C52990a.m205239c(this.f85789d.mo122543g(), R.color.primary_pri_500)).mo200874a((float) UIHelper.dp2px(15.0f)).mo200876a();
        a.mo200866a(new C59119d.AbstractC59123c(aVar, z, a, textMessageViewHolder) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$a23JvVh7Vg_hkypMMnpuvcYSzZY */
            public final /* synthetic */ AbsMessageVO f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ C59119d f$3;
            public final /* synthetic */ TextMessageCell.TextMessageViewHolder f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.ss.android.lark.widget.select.C59119d.AbstractC59123c
            public final void onTextSelected(SelectedTextInfo aVar) {
                TextMessageCell.lambda$a23JvVh7Vg_hkypMMnpuvcYSzZY(TextMessageCell.this, this.f$1, this.f$2, this.f$3, this.f$4, aVar);
            }
        });
        a.mo200864a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m129241a(AbsMessageVO aVar, boolean z, C59119d dVar, TextMessageViewHolder textMessageViewHolder, SelectedTextInfo aVar2) {
        Log.m165379d("TextMessageCell2", "copy text is:" + ((Object) aVar2.mo200855a()));
        ((TextContentVO) aVar.mo121699g()).mo121777a(aVar2.mo200855a());
        ((TextContentVO) aVar.mo121699g()).mo121783b(z);
        this.f85789d.mo122534a(new int[]{aVar2.mo200856b(), aVar2.mo200857c(), aVar2.mo200858d()});
        this.f85948g = new C33240h.AbstractC33243b(dVar, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$tDdD7gvR4OoKtHDwT9K2ngWHo */
            public final /* synthetic */ C59119d f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.C33240h.AbstractC33243b
            public final void hideSelection() {
                TextMessageCell.m270386lambda$tDdD7gvR4OoKtHDwT9K2ngWHo(TextMessageCell.this, this.f$1, this.f$2);
            }
        };
        C33240h.m128531a().mo122573a(this.f85948g);
        C33240h.m128531a().mo122574a(aVar2.mo200859e());
        m129248b(textMessageViewHolder, (AbsMessageVO<TextContentVO>) aVar);
    }

    /* renamed from: a */
    private void m129242a(TextChatView2 textChatView2, Layout layout, TextMessageViewHolder textMessageViewHolder, final AbsMessageVO<TextContentVO> aVar, boolean z) {
        boolean z2;
        textChatView2.setPhoneSpanClickListener(new IPhoneSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.C333711 */

            @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
            /* renamed from: b */
            public void mo122867b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
            /* renamed from: a */
            public void mo122866a(View view, String str) {
                TextMessageCell.this.f85944a.mo134641a(TextMessageCell.this.mo122719d(), str);
            }
        });
        textChatView2.setUrlSpanClickListener(new IUrlSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.C333722 */

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public boolean b_(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public void a_(View view, String str) {
                C29990c.m110930b().mo134577e().mo120961b();
                C29990c.m110930b().mo134593u().mo134333b(TextMessageCell.this.f85789d.mo122543g(), str, TextMessageCell.this.f85789d.mo122540d() ? 1 : 0);
                MessageHitPoint.f135779d.mo187533a("text", C35247g.m137626a(TextMessageCell.this.f85789d.mo122542f(), TextMessageCell.this.f85789d.mo122540d(), TextMessageCell.this.f85789d.mo122548l()), aVar.mo121681a());
                TextMessageCell.this.mo122881b(aVar);
                if (!TextMessageCell.this.f85789d.mo122546j()) {
                    C29990c.m110930b().mo134594v().mo134496a(str);
                }
                TextMessageCell.this.mo122880a(aVar, str);
            }
        });
        textChatView2.setAtSpanClickListener(new IAtSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.C333733 */

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: b */
            public boolean mo122871b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: a */
            public void mo122870a(View view, String str, String str2) {
                C29990c.m110930b().mo134523V().mo134436a(TextMessageCell.this.mo122719d(), new ProfileSource.C36868a().mo136066c(str2).mo136065b(aVar.mo121692b()).mo136060a(1).mo136062a(C34339g.m133170d(TextMessageCell.this.f85789d.mo122550n())).mo136063a());
                TextMessageCell.this.mo122879a(aVar);
            }
        });
        textChatView2.setMentionSpanClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell.C333744 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                C29990c.m110930b().mo134548a(TextMessageCell.this.mo122719d(), str3);
            }
        });
        textChatView2.setAbbreviationClickListener(new IAbbreviationClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$pmKRWit0Okb2szhuPneYiMGgzlM */

            @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener
            public final void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                TextMessageCell.lambda$pmKRWit0Okb2szhuPneYiMGgzlM(TextMessageCell.this, view, abbreviationInfo, f, f2);
            }
        });
        textChatView2.setIntentionClickListener(new C33377a(mo122719d(), this.f85945b, this.f85789d));
        textChatView2.getLightTextView().setOnClickListener(new View.OnClickListener(textMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$w7c7VplVRtxzCNLKghULdf9Rw8 */
            public final /* synthetic */ TextMessageCell.TextMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                TextMessageCell.m270387lambda$w7c7VplVRtxzCNLKghULdf9Rw8(TextMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        textMessageViewHolder.mUrlNetPreviewMarginContainer.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$7SzLQs1tocaSMolHFeiQRRz3c */
            public final /* synthetic */ AbsMessageVO f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                TextMessageCell.m270384lambda$7SzLQs1tocaSMolHFeiQRRz3c(TextMessageCell.this, this.f$1, view);
            }
        });
        textMessageViewHolder.mUrlNetPreviewMarginContainer.setOnLongClickListener(new View.OnLongClickListener(textMessageViewHolder, aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$24QlPKBgIHuJCz6RwfIoj0nqvlI */
            public final /* synthetic */ TextMessageCell.TextMessageViewHolder f$1;
            public final /* synthetic */ AbsMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return TextMessageCell.lambda$24QlPKBgIHuJCz6RwfIoj0nqvlI(TextMessageCell.this, this.f$1, this.f$2, view);
            }
        });
        textChatView2.getLightTextView().setOnLongClickListener(new View.OnLongClickListener(textChatView2, textMessageViewHolder, aVar, z) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$iD7J9aL0ZhxZ2dmnZ_PdBuImB4 */
            public final /* synthetic */ TextChatView2 f$1;
            public final /* synthetic */ TextMessageCell.TextMessageViewHolder f$2;
            public final /* synthetic */ AbsMessageVO f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final boolean onLongClick(View view) {
                return TextMessageCell.m270385lambda$iD7J9aL0ZhxZ2dmnZ_PdBuImB4(TextMessageCell.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
            }
        });
        textChatView2.setOnShoreMoreClickListener(new TextChatView.AbstractC33971a(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.text.$$Lambda$TextMessageCell$ZcgscSOWgkaA7k6366yvFl_MLOM */
            public final /* synthetic */ AbsMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.core.view.TextChatView.AbstractC33971a
            public final void onClick(View view) {
                TextMessageCell.lambda$ZcgscSOWgkaA7k6366yvFl_MLOM(TextMessageCell.this, this.f$1, view);
            }
        });
        TextContentVO g = aVar.mo121699g();
        if (this.f85789d.mo122549m() || !g.mo121786e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        textChatView2.mo127163a(layout, aVar.mo121695c(), z2, g.mo121787f());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m129247a(TextChatView2 textChatView2, TextMessageViewHolder textMessageViewHolder, AbsMessageVO aVar, boolean z, View view) {
        if (!m129257i() || textChatView2.mo127164a()) {
            mo122755b((AbstractC59010e) textMessageViewHolder, (Object) aVar);
            return true;
        }
        m129244a(textChatView2.getLightTextView(), textMessageViewHolder, aVar, z);
        return true;
    }
}

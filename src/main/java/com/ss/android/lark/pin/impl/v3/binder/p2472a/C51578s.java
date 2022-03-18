package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.avatar.AvatarType;
import com.larksuite.component.ui.avatar.DocAvatarModel;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.badge.miniicon.MiniIconModel;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.statistics.doc.DocHitPoint;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.TextViewHolder;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.s */
public class C51578s extends AbstractC51540b<TextViewHolder> {

    /* renamed from: a */
    AbstractC51472a.AbstractC51474b f128376a = PinModule.m199585b().mo144035i();

    /* renamed from: b */
    AbstractC51472a.AbstractC51477d f128377b = PinModule.m199585b().mo144036j();

    /* renamed from: a */
    private void m200161a(TextViewHolder textViewHolder) {
        textViewHolder.mContentTV.setEmojIconSize(LKUIDisplayManager.m91881c(this.f146181d, 19));
        C25649b.m91853a(textViewHolder.mUrlIconIV, 24);
        C25649b.m91857a(textViewHolder.mUrlTitleTV, LarkFont.HEADLINE);
        C25649b.m91857a(textViewHolder.mUrlDescTV, LarkFont.BODY1);
        C25649b.m91853a(textViewHolder.mDocIconIV, 32);
        C25649b.m91857a(textViewHolder.mDocTitleTV, LarkFont.HEADLINE);
        C25649b.m91857a(textViewHolder.mDocOwnerTV, LarkFont.BODY1);
    }

    /* renamed from: a */
    private boolean m200162a(Message message) {
        if (message.getType() != Message.Type.TEXT) {
            return false;
        }
        TextContent textContent = (TextContent) message.getContent();
        if (!CollectionUtils.isEmpty(textContent.getPreviewHangPoints()) || CollectionUtils.isEmpty(textContent.getUrlPreviewList()) || textContent.getUrlPreviewList().size() != 1 || textContent.getUrlPreviewList().get(0).isDeleted() || TextUtils.isEmpty(textContent.getUrlPreviewList().get(0).getTitle())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public TextViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return TextViewHolder.C51603a.m200239a(layoutInflater, viewGroup);
    }

    public C51578s(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(TextViewHolder textViewHolder, final PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) textViewHolder, bVar);
        textViewHolder.mContentTV.setRichTextListener(new RichTextView.AbstractC59025c() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.C515846 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124117a(TextView textView) {
                if (C51578s.this.f128306c != null) {
                    C51578s.this.f128306c.mo177363a(textView, bVar);
                }
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59025c
            /* renamed from: a */
            public void mo124118a(String str, TextView textView) {
                C51578s.this.mo177529a(bVar).onLongClick(textView);
            }
        });
        textViewHolder.mUrlPreviewLayout.setOnLongClickListener(mo177529a(bVar));
        textViewHolder.mDocsLayout.setOnLongClickListener(mo177529a(bVar));
    }

    /* renamed from: b */
    private void m200163b(TextViewHolder textViewHolder, int i, final PinInfo bVar) {
        C515791 r0 = new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.C515791 */

            /* renamed from: c */
            private final DuplicateEnterChecker f128380c = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                if (!this.f128380c.mo198450a()) {
                    C51578s.this.f128376a.mo144073a(C51578s.this.f146181d, str2, bVar.mo177396g().getChatId());
                }
            }
        };
        C515802 r1 = new LinkEmojiTextView.AbstractC58524i() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.C515802 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                PinModule.m199585b().mo144027b(C51578s.this.f146181d, str);
            }
        };
        C515813 r2 = new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.C515813 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                PinModule.m199585b().mo144019a(C51578s.this.f146181d, str);
                PinModule.m199585b().mo144041o().mo144052a(str);
            }
        };
        C515824 r3 = new LinkEmojiTextView.AbstractC58520e() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.C515824 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58520e
            /* renamed from: a */
            public void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                PinModule.m199585b().mo144021a(view, abbreviationInfo, f, f2);
            }
        };
        textViewHolder.mContentTV.setAtStringClickListner(r0);
        textViewHolder.mContentTV.setMentionListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.C515835 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                PinModule.m199585b().mo144024a(C51578s.this.f146181d, str3, 0);
            }
        });
        textViewHolder.mContentTV.setPhoneStringClickListener(r1);
        textViewHolder.mContentTV.setUrlStringClickListner(r2);
        textViewHolder.mContentTV.setAbbreviationListener(r3);
        textViewHolder.mContentTV.setNeedShowAtDot(false);
        textViewHolder.mContentTV.setMaxLines(5);
        this.f128376a.mo144076a(textViewHolder.mContentTV, bVar.mo177396g().isFromMe());
        textViewHolder.mContentTV.setNeedShowAtDot(false);
        textViewHolder.mContentTV.setShowImage(false);
        textViewHolder.mContentTV.setShowVideo(false);
        textViewHolder.mContentTV.setTextSize(LKUIDisplayManager.m91865a(this.f146181d, LarkFont.HEADLINE));
        textViewHolder.mContentTV.setInfo(((TextContent) bVar.mo177396g().getContent()).getRichText());
        textViewHolder.mContentTV.setVisibility(0);
    }

    /* renamed from: a */
    public void mo177520a(TextViewHolder textViewHolder, int i, PinInfo bVar) {
        super.mo31174a((AbstractC51540b.C51541a) textViewHolder, i, bVar);
        m200163b(textViewHolder, i, bVar);
        mo177596a(textViewHolder, bVar, false);
        if (bVar.mo177391b()) {
            textViewHolder.mUrlPreviewLayout.setBackgroundResource(R.drawable.item_bg_corner4_white);
            textViewHolder.mDocsLayout.setBackgroundResource(R.drawable.item_bg_corner4_white);
            textViewHolder.mDivider.setVisibility(8);
        }
        if (!DesktopUtil.m144307b()) {
            m200161a(textViewHolder);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177596a(TextViewHolder textViewHolder, PinInfo bVar, final boolean z) {
        boolean z2;
        final String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        LKUIRoundedImageView lKUIRoundedImageView;
        String str2;
        boolean z7;
        int i4;
        MessageUrlPreview messageUrlPreview;
        MessageUrlPreview messageUrlPreview2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z8 = true;
        int i9 = 0;
        if (bVar.mo177396g().getStatus() == Message.Status.DELETED) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            textViewHolder.mDocsLayout.setVisibility(8);
            textViewHolder.mUrlPreviewLayout.setVisibility(8);
            return;
        }
        int i10 = -1;
        DocResult f = bVar.mo177395f();
        String str3 = null;
        if (f == null || f.getDoc() == null) {
            str = null;
            z3 = false;
        } else {
            Doc doc = f.getDoc();
            String name = doc.getName();
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DocsPreviewOwner, "owner", doc.getOwnerName());
            str = doc.getUrl();
            if (doc.getDocType() == DocType.WIKI) {
                i10 = R.drawable.ic_icon_wiki_doc_pin;
            } else {
                i10 = this.f128377b.mo144086a(doc.getDocType(), doc.getName());
            }
            textViewHolder.mDocTitleTV.setText(name);
            TextView textView = textViewHolder.mDocTitleTV;
            if (!TextUtils.isEmpty(name)) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            textView.setVisibility(i7);
            textViewHolder.mDocOwnerTV.setText(mustacheFormat);
            TextView textView2 = textViewHolder.mDocOwnerTV;
            if (!C57782ag.m224241a(mustacheFormat)) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            textView2.setVisibility(i8);
            z3 = true;
        }
        TextContent textContent = (TextContent) bVar.mo177396g().getContent();
        List<MessageUrlPreview> urlPreviewList = textContent.getUrlPreviewList();
        if (z3 || !m200162a(bVar.mo177396g()) || (messageUrlPreview2 = urlPreviewList.get(0)) == null || messageUrlPreview2.isDeleted()) {
            z4 = false;
        } else {
            ImageSet icon = messageUrlPreview2.getIcon();
            if (icon != null && CollectionUtils.isNotEmpty(icon.getOrigin().getUrls())) {
                str3 = icon.getOrigin().getUrls().get(0);
                i10 = R.drawable.url_preview_icon;
            }
            String title = messageUrlPreview2.getTitle();
            String description = messageUrlPreview2.getDescription();
            String url = messageUrlPreview2.getUrl();
            textViewHolder.mUrlTitleTV.setText(title);
            TextView textView3 = textViewHolder.mUrlTitleTV;
            if (!TextUtils.isEmpty(title)) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            textView3.setVisibility(i5);
            textViewHolder.mUrlDescTV.setText(description);
            TextView textView4 = textViewHolder.mUrlDescTV;
            if (!TextUtils.isEmpty(description)) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            textView4.setVisibility(i6);
            str = url;
            z4 = true;
        }
        if (z3 || z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (!CollectionUtils.isNotEmpty(urlPreviewList) || (messageUrlPreview = urlPreviewList.get(0)) == null) {
                str2 = str;
            } else {
                str2 = messageUrlPreview.getUrl();
            }
            if (C57782ag.m224242a(str2, C59035h.m229214e(textContent.getRichText()).trim())) {
                z7 = false;
                z6 = false;
            } else {
                z7 = true;
                z6 = true;
            }
            textViewHolder.mContentTV.setPaddingRelative(0, 0, 0, (int) C25653b.m91892a(this.f146181d, 8.0f));
            if (bVar.mo177391b()) {
                textViewHolder.mContentTV.setMaxLines(1);
                int i11 = (int) (-C25653b.m91892a(this.f146181d, 8.0f));
                if (z7) {
                    i4 = 0;
                } else {
                    i4 = (int) (-C25653b.m91892a(this.f146181d, 8.0f));
                }
                int i12 = (int) (-C25653b.m91892a(this.f146181d, 8.0f));
                textViewHolder.mUrlPreviewLayout.setPaddingRelative(i11, i4, i12, 0);
                textViewHolder.mDocsLayout.setPaddingRelative(i11, i4, i12, 0);
            }
            z8 = z7;
        } else {
            z6 = true;
        }
        View view = textViewHolder.mDocsLayout;
        if (z3) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = textViewHolder.mUrlPreviewLayout;
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        RichTextView richTextView = textViewHolder.mContentTV;
        if (z8) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        richTextView.setVisibility(i3);
        View view3 = textViewHolder.mDivider;
        if (!z6) {
            i9 = 8;
        }
        view3.setVisibility(i9);
        if (z5) {
            if (!(this.f146181d instanceof Activity) || !((Activity) this.f146181d).isFinishing()) {
                if (LarkAvatar.m91600a()) {
                    if (z4) {
                        ImageLoader.with(this.f146181d).load(str3).error(i10).into(textViewHolder.mUrlIconIV);
                    }
                    if (z3) {
                        DocAvatarModel dVar = new DocAvatarModel();
                        dVar.mo89008b(f.getDoc().getIcon().getValue());
                        dVar.mo89002a(f.getDoc().getDocType().getNumber());
                        dVar.mo89003a(f.getDoc().getName());
                        LarkAvatar.m91597a(this.f146181d).mo89065a(dVar).mo89064a(new MiniIconModel(AvatarType.DOC)).mo89068a(textViewHolder.mDocIconIV);
                    }
                } else {
                    IRequestCreator error = ImageLoader.with(this.f146181d).load(str3).error(i10);
                    if (z3) {
                        lKUIRoundedImageView = textViewHolder.mDocIconIV;
                    } else {
                        lKUIRoundedImageView = textViewHolder.mUrlIconIV;
                    }
                    error.into(lKUIRoundedImageView);
                }
            }
            View$OnClickListenerC515857 r2 = new View.OnClickListener() {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51578s.View$OnClickListenerC515857 */

                public void onClick(View view) {
                    if (!TextUtils.isEmpty(str)) {
                        PinModule.m199585b().mo144025b();
                        PinModule.m199585b().mo144019a(C51578s.this.f146181d, str);
                        DocHitPoint.f128212a.mo177431a(z, 1);
                    }
                }
            };
            textViewHolder.mDocsLayout.setOnClickListener(r2);
            textViewHolder.mUrlPreviewLayout.setOnClickListener(r2);
        }
    }
}

package com.ss.android.lark.widget.richtext.preprocess;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.C59058i;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59153c;
import com.ss.android.lark.widget.span.EmojiconInfo;
import com.ss.android.lark.widget.span.EmptyHolderInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.PrefixInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpacingInfo;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.c */
public class C59045c implements AbstractC59043b, C59058i.AbstractC59061b {

    /* renamed from: a */
    private Context f146344a;

    /* renamed from: b */
    private C59049d f146345b;

    /* renamed from: c */
    private StringBuilder f146346c;

    /* renamed from: d */
    private List<UrlInfo> f146347d;

    /* renamed from: e */
    private List<AtInfo> f146348e;

    /* renamed from: f */
    private List<AbbreviationInfo> f146349f;

    /* renamed from: g */
    private List<ImageInfo> f146350g;

    /* renamed from: h */
    private List<SpacingInfo> f146351h;

    /* renamed from: i */
    private List<IntentionInfo> f146352i;

    /* renamed from: j */
    private List<MentionInfo> f146353j;

    /* renamed from: k */
    private List<MediaInfo> f146354k;

    /* renamed from: l */
    private List<EmojiconInfo> f146355l;

    /* renamed from: m */
    private List<TextStyleInfo> f146356m;

    /* renamed from: n */
    private List<PrefixInfo> f146357n;

    /* renamed from: o */
    private List<EmptyHolderInfo> f146358o;

    /* renamed from: p */
    private long f146359p;

    /* renamed from: q */
    private RichTextElement.RichTextTag f146360q;

    /* renamed from: r */
    private final C59058i f146361r = new C59058i(this);

    /* renamed from: s */
    private C59062j f146362s;

    /* renamed from: a */
    private int m229281a(int i) {
        return i == 1 ? 1 : 2;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200604a(RichTextElement.ButtonProperty buttonProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200605a(RichTextElement.CodeBlockProperty codeBlockProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200606a(RichTextElement.CodeProperty codeProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200607a(RichTextElement.DivProperty divProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200608a(RichTextElement.DocsProperty docsProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200610a(RichTextElement.FigureProperty figureProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200611a(RichTextElement.HRProperty hRProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200616a(RichTextElement.ParagraphProperty paragraphProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200617a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200619a(RichTextElement.SelectProperty selectProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200621a(RichTextElement.TextableAreaProperty textableAreaProperty, ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200624a(ElementExtra elementExtra) {
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200600a(RichText richText) {
        this.f146347d = new ArrayList();
        this.f146348e = new ArrayList();
        this.f146349f = new ArrayList();
        this.f146350g = new ArrayList();
        this.f146351h = new ArrayList();
        this.f146352i = new ArrayList();
        this.f146353j = new ArrayList();
        this.f146354k = new ArrayList();
        this.f146355l = new ArrayList();
        this.f146356m = new ArrayList();
        this.f146357n = new ArrayList();
        this.f146358o = new ArrayList();
        this.f146346c = null;
        this.f146359p = System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m229293a(String str) {
        if (this.f146346c == null) {
            if (TextUtils.equals(str, "\n")) {
                str = "";
            }
            this.f146346c = new StringBuilder(str);
            return;
        }
        if (this.f146345b.mo200631b() && str != null) {
            str = str.replace("\n", " ");
        }
        this.f146346c.append(str);
    }

    /* renamed from: a */
    private void m229292a(TextStyleInfo textStyleInfo) {
        if (textStyleInfo != null) {
            textStyleInfo.start = m229302e();
            textStyleInfo.end = textStyleInfo.start + (textStyleInfo.text == null ? 0 : textStyleInfo.text.length());
            this.f146356m.add(textStyleInfo);
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200623a(RichTextElement richTextElement) {
        m229301d();
        this.f146361r.mo200597a(richTextElement, this.f146346c, this.f146360q);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200618a(RichTextElement.RichTextTag richTextTag) {
        this.f146360q = richTextTag;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200620a(RichTextElement.TextProperty textProperty, ElementExtra elementExtra) {
        if (textProperty instanceof RichTextElement.DashedProperty) {
            m229285a((RichTextElement.DashedProperty) textProperty);
        } else if (textProperty instanceof RichTextElement.IntentionDashedProperty) {
            m229287a((RichTextElement.IntentionDashedProperty) textProperty);
        }
        m229290a(elementExtra, textProperty.getContent());
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200602a(RichTextElement.AtProperty atProperty, ElementExtra elementExtra) {
        String atContent = atProperty.getAtContent();
        if (this.f146345b.mo200630a()) {
            if (!atProperty.isOutChatUser() && EditTextLengthFilter.m224560a(atContent, 0, atContent.length()) > 18) {
                atContent = ((Object) EditTextLengthFilter.m224561b(atContent, 0, 18)) + "...";
            }
        }
        m229284a(atProperty, atContent);
        m229295b(elementExtra);
        m229290a(elementExtra, atContent);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200612a(RichTextElement.ImageProperty imageProperty, ElementExtra elementExtra) {
        if (CollectionUtils.isEmpty(imageProperty.getUrls()) && TextUtils.isEmpty(imageProperty.getOriginKey())) {
            Log.m165383e("RichElementParser2", "error richtext image data");
        } else if (this.f146345b.mo200633d()) {
            Image a = C59031e.m229176a(imageProperty, m229281a(this.f146345b.mo200636f()));
            if (a != null) {
                if (!TextUtils.isEmpty(this.f146346c) && !m229303f() && !m229304g()) {
                    m229293a("\n");
                }
                m229282a(a);
                m229293a(UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoPhoto));
                m229293a("\n");
                m229294b(UIHelper.dp2px(5.0f));
                m229293a("\n");
            }
        } else {
            m229293a(UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoPhoto));
        }
    }

    /* renamed from: a */
    private void m229291a(SpanInfo spanInfo) {
        if ((spanInfo instanceof ImageInfo) && this.f146345b.mo200637g()) {
            ((ImageInfo) spanInfo).borderProperty = new C59153c(UIUtils.getColor(this.f146344a, R.color.line_border_component), UIHelper.dp2px(0.5f), UIHelper.dp2px(4.0f));
        } else if (spanInfo instanceof MediaInfo) {
            ((MediaInfo) spanInfo).borderProperty = new C59153c(UIUtils.getColor(this.f146344a, R.color.line_border_card), UIHelper.dp2px(1.0f), UIHelper.dp2px(4.0f));
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200613a(RichTextElement.ItalicProperty italicProperty, ElementExtra elementExtra) {
        if (TextUtils.isEmpty(italicProperty.getContent())) {
            Log.m165383e("RichElementParser2", "error richtext italic data");
        } else {
            m229290a(elementExtra, italicProperty.getContent());
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200603a(RichTextElement.BoldProperty boldProperty, ElementExtra elementExtra) {
        if (TextUtils.isEmpty(boldProperty.getContent())) {
            Log.m165383e("RichElementParser2", "error richtext bold data");
        } else {
            m229290a(elementExtra, boldProperty.getContent());
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200622a(RichTextElement.UnderlineProperty underlineProperty, ElementExtra elementExtra) {
        if (TextUtils.isEmpty(underlineProperty.getContent())) {
            Log.m165383e("RichElementParser2", "error richtext underline data");
        } else {
            m229290a(elementExtra, underlineProperty.getContent());
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200601a(RichTextElement.AnchorProperty anchorProperty, ElementExtra elementExtra) {
        String str;
        if (TextUtils.isEmpty(anchorProperty.getContent())) {
            Log.m165383e("RichElementParser2", "error richtext anchor data");
            return;
        }
        m229283a(anchorProperty);
        m229295b(elementExtra);
        if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            str = "$" + anchorProperty.getDisplayTitle() + " ";
        } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            str = anchorProperty.getContent();
        } else {
            str = "$" + anchorProperty.getDisplayTitle() + " ";
        }
        m229292a(this.f146362s.mo200653a().mo200654a(elementExtra).mo200656a(str));
        m229293a(str);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200609a(RichTextElement.EmotionProperty emotionProperty, ElementExtra elementExtra) {
        if (emotionProperty != null && !TextUtils.isEmpty(emotionProperty.getKey())) {
            String b = EmojiHandler.m226949b(emotionProperty.getKey());
            m229286a(emotionProperty, b);
            m229293a(b);
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200614a(RichTextElement.MediaProperty mediaProperty, ElementExtra elementExtra) {
        if (mediaProperty == null || (TextUtils.isEmpty(mediaProperty.getOriginPath()) && TextUtils.isEmpty(mediaProperty.getUrl()))) {
            m229293a(UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoVideo));
            Log.m165382e("Error richtext media element");
        } else if (!this.f146345b.mo200634e()) {
            m229293a(UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoVideo));
        } else if (mediaProperty.getOriginImage() != null) {
            if (!TextUtils.isEmpty(this.f146346c) && !m229303f() && !m229304g()) {
                m229293a("\n");
            }
            m229288a(mediaProperty);
            m229293a(UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoVideo));
            m229293a("\n");
            m229294b(UIHelper.dp2px(5.0f));
            m229293a("\n");
        }
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public void mo200615a(RichTextElement.MentionProperty mentionProperty, ElementExtra elementExtra) {
        if (mentionProperty == null) {
            Log.m165382e("Error richtext mention element");
            return;
        }
        String str = "#" + mentionProperty.getContent();
        m229289a(mentionProperty, str);
        m229293a(str);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: a */
    public C59057h mo200599a() {
        RecogniseSpansResult a = new RecogniseSpansResult.C59147a().mo201042a(this.f146347d).mo201044b(this.f146348e).mo201050h(this.f146349f).mo201051i(this.f146350g).mo201052j(this.f146351h).mo201053k(this.f146352i).mo201054l(this.f146353j).mo201055m(this.f146354k).mo201056n(this.f146355l).mo201047e(this.f146356m).mo201048f(this.f146357n).mo201049g(this.f146358o).mo201043a();
        StringBuilder sb = this.f146346c;
        return new C59057h(sb == null ? "" : sb.toString(), a);
    }

    /* renamed from: a */
    private void m229289a(RichTextElement.MentionProperty mentionProperty, String str) {
        MentionInfo mentionInfo = new MentionInfo();
        mentionInfo.id = mentionProperty.getMentionItem().getId();
        mentionInfo.text = mentionProperty.getContent();
        StringBuilder sb = this.f146346c;
        mentionInfo.start = sb == null ? 0 : sb.toString().length();
        mentionInfo.end = mentionInfo.start + str.length();
        if (this.f146345b.mo200638h()) {
            mentionInfo.type = 11;
        } else {
            mentionInfo.type = 8;
            mentionInfo.isAuthorized = mentionProperty.isAuthorized();
            mentionInfo.url = mentionProperty.getRedirectUrl();
        }
        this.f146353j.add(mentionInfo);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.C59058i.AbstractC59061b
    /* renamed from: a */
    public void mo200627a(PrefixInfo prefixInfo) {
        this.f146357n.add(prefixInfo);
    }

    /* renamed from: d */
    private void m229301d() {
        if (this.f146346c == null) {
            this.f146346c = new StringBuilder();
        }
    }

    /* renamed from: e */
    private int m229302e() {
        StringBuilder sb = this.f146346c;
        if (sb == null) {
            return 0;
        }
        return sb.toString().length();
    }

    /* renamed from: f */
    private boolean m229303f() {
        if (!TextUtils.isEmpty(this.f146346c)) {
            StringBuilder sb = this.f146346c;
            if (sb.charAt(sb.length() - 1) == '\n') {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m229299c() {
        if (m229296b()) {
            StringBuilder sb = this.f146346c;
            sb.delete(sb.length() - 2, this.f146346c.length());
            List<SpacingInfo> list = this.f146351h;
            list.remove(list.size() - 1);
        }
    }

    /* renamed from: g */
    private boolean m229304g() {
        if (TextUtils.isEmpty(this.f146346c) || CollectionUtils.isEmpty(this.f146358o)) {
            return false;
        }
        List<EmptyHolderInfo> list = this.f146358o;
        if (list.get(list.size() - 1).end == this.f146346c.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m229296b() {
        StringBuilder sb = this.f146346c;
        if (sb == null || sb.length() == 0 || !this.f146346c.toString().endsWith("\n\n") || !CollectionUtils.isNotEmpty(this.f146351h)) {
            return false;
        }
        List<SpacingInfo> list = this.f146351h;
        if (list.get(list.size() - 1).end == this.f146346c.length()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.C59058i.AbstractC59061b
    /* renamed from: b */
    public void mo200628b(PrefixInfo prefixInfo) {
        if (prefixInfo != null) {
            this.f146357n.remove(prefixInfo);
        }
    }

    /* renamed from: b */
    private void m229295b(ElementExtra elementExtra) {
        Map<String, Integer> localStyle = elementExtra.getLocalStyle();
        if (CollectionUtils.isNotEmpty(localStyle)) {
            localStyle.remove("localFontColor");
        }
    }

    /* renamed from: c */
    private String m229298c(Image image) {
        if (TextUtils.isEmpty(image.getToken())) {
            return "";
        }
        return image.getKey();
    }

    /* renamed from: d */
    private String m229300d(Image image) {
        if (TextUtils.isEmpty(image.getToken()) || TextUtils.isEmpty(image.getKey())) {
            return image.getFirstUrl();
        }
        return "";
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: b */
    public void mo200626b(RichTextElement richTextElement) {
        m229301d();
        this.f146361r.mo200596a(richTextElement, this.f146346c);
    }

    /* renamed from: b */
    private void m229294b(int i) {
        SpacingInfo spacingInfo = new SpacingInfo();
        spacingInfo.type = 7;
        spacingInfo.text = "\n";
        spacingInfo.start = m229302e();
        spacingInfo.end = spacingInfo.start + spacingInfo.text.length();
        spacingInfo.spacingHeight = i;
        this.f146351h.add(spacingInfo);
    }

    /* renamed from: a */
    private void m229282a(Image image) {
        int[] b = m229297b(image);
        String c = m229298c(image);
        String d = m229300d(image);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.type = 6;
        imageInfo.text = UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoPhoto);
        imageInfo.start = m229302e();
        imageInfo.end = imageInfo.start + imageInfo.text.length();
        imageInfo.token = image.getToken();
        imageInfo.key = c;
        imageInfo.url = d;
        imageInfo.width = b[0];
        imageInfo.height = b[1];
        m229291a(imageInfo);
        this.f146350g.add(imageInfo);
    }

    /* renamed from: a */
    private void m229283a(RichTextElement.AnchorProperty anchorProperty) {
        UrlInfo urlInfo;
        if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            urlInfo = new KeyIconUrlInfo();
            KeyIconUrlInfo keyIconUrlInfo = (KeyIconUrlInfo) urlInfo;
            keyIconUrlInfo.iconKey = anchorProperty.getIconKey();
            keyIconUrlInfo.placeHolderRes = anchorProperty.getLocalIconRes();
            keyIconUrlInfo.greyPlaceHolderRes = anchorProperty.getLocalGrayIconRes();
            keyIconUrlInfo.isUrlPreview = anchorProperty.isUrlPreview();
            urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
            urlInfo.start = m229302e();
            urlInfo.end = urlInfo.start + urlInfo.text.length();
        } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            urlInfo = new UrlInfo();
            urlInfo.text = anchorProperty.getContent();
            urlInfo.start = m229302e();
            urlInfo.end = urlInfo.start + anchorProperty.getContent().length();
        } else {
            urlInfo = new RichUrlInfo();
            RichUrlInfo richUrlInfo = (RichUrlInfo) urlInfo;
            richUrlInfo.mLocalImageResId = anchorProperty.getLocalIconRes();
            richUrlInfo.mDisplayTitle = anchorProperty.getDisplayTitle();
            urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
            urlInfo.start = m229302e();
            urlInfo.end = urlInfo.start + urlInfo.text.length();
        }
        urlInfo.type = 1;
        urlInfo.href = anchorProperty.getHref();
        this.f146347d.add(urlInfo);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59043b
    /* renamed from: b */
    public void mo200625b(RichText richText) {
        m229299c();
        Log.m165379d("RichElementParser2", "Rich text parse total time: " + (System.currentTimeMillis() - this.f146359p));
    }

    /* renamed from: a */
    private void m229285a(RichTextElement.DashedProperty dashedProperty) {
        AbbreviationInfo abbreviationInfo = new AbbreviationInfo();
        int i = 0;
        abbreviationInfo.isIndependent = false;
        abbreviationInfo.id = dashedProperty.id;
        abbreviationInfo.desc = dashedProperty.i18nDesc;
        abbreviationInfo.fullName = dashedProperty.fullName;
        abbreviationInfo.name = dashedProperty.name;
        abbreviationInfo.text = dashedProperty.getContent();
        abbreviationInfo.start = m229302e();
        int i2 = abbreviationInfo.start;
        if (dashedProperty.getContent() != null) {
            i = dashedProperty.getContent().length();
        }
        abbreviationInfo.end = i2 + i;
        abbreviationInfo.textColor = UIUtils.getColor(this.f146344a, R.color.text_link_hover);
        abbreviationInfo.type = 5;
        abbreviationInfo.chatId = dashedProperty.chatId;
        abbreviationInfo.messageId = dashedProperty.messageId;
        abbreviationInfo.intervalOff = dashedProperty.intervalOff;
        abbreviationInfo.intervalOn = dashedProperty.intervalOn;
        this.f146349f.add(abbreviationInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m229297b(com.ss.android.lark.widget.richtext.Image r10) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.preprocess.C59045c.m229297b(com.ss.android.lark.widget.richtext.Image):int[]");
    }

    /* renamed from: a */
    private void m229287a(RichTextElement.IntentionDashedProperty intentionDashedProperty) {
        IntentionInfo intentionInfo = new IntentionInfo();
        intentionInfo.isIndependent = false;
        intentionInfo.chatId = intentionDashedProperty.chatId;
        intentionInfo.messageId = intentionDashedProperty.messageId;
        intentionInfo.startTime = intentionDashedProperty.startTime;
        intentionInfo.endTime = intentionDashedProperty.endTime;
        intentionInfo.duration = intentionDashedProperty.duration;
        intentionInfo.title = intentionDashedProperty.title;
        intentionInfo.chatterIds = intentionDashedProperty.chatterIds;
        intentionInfo.text = intentionDashedProperty.getContent();
        intentionInfo.isAtAll = intentionDashedProperty.isAtAll;
        intentionInfo.start = m229302e();
        intentionInfo.end = intentionInfo.start + intentionDashedProperty.getContent().length();
        intentionInfo.textColor = UIUtils.getColor(this.f146344a, R.color.text_link_hover);
        intentionInfo.type = 5;
        this.f146352i.add(intentionInfo);
    }

    /* renamed from: a */
    private void m229288a(RichTextElement.MediaProperty mediaProperty) {
        Image originImage = mediaProperty.getOriginImage();
        int[] b = m229297b(originImage);
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.type = 9;
        mediaInfo.text = UIUtils.getString(this.f146344a, R.string.Lark_Legacy_MessagePoVideo);
        mediaInfo.start = m229302e();
        mediaInfo.end = mediaInfo.start + mediaInfo.text.length();
        mediaInfo.width = b[0];
        mediaInfo.height = b[1];
        mediaInfo.key = mediaProperty.getKey();
        mediaInfo.originPath = mediaProperty.getOriginPath();
        mediaInfo.url = mediaProperty.getUrl();
        mediaInfo.duration = C26279i.m95149a(mediaProperty.getDuration());
        m229291a(mediaInfo);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.type = 6;
        imageInfo.key = originImage.getKey();
        imageInfo.url = originImage.getFirstUrl();
        imageInfo.width = b[0];
        imageInfo.height = b[1];
        mediaInfo.originImageInfo = imageInfo;
        this.f146354k.add(mediaInfo);
    }

    public C59045c(Context context, C59049d dVar) {
        this.f146344a = context;
        this.f146345b = dVar;
        this.f146362s = new C59062j(context);
    }

    /* renamed from: a */
    private void m229290a(ElementExtra elementExtra, String str) {
        if (str != null) {
            m229292a(this.f146362s.mo200653a().mo200654a(elementExtra).mo200656a(str));
            m229293a(str);
        }
    }

    /* renamed from: a */
    private void m229284a(RichTextElement.AtProperty atProperty, String str) {
        AtInfo atInfo = new AtInfo();
        atInfo.type = 0;
        atInfo.userId = atProperty.getUserId();
        atInfo.text = str;
        atInfo.start = m229302e();
        atInfo.end = atInfo.start + str.length();
        atInfo.isOutChatUser = atProperty.isOutChatUser();
        atInfo.isAnonymous = atProperty.isAnonymous();
        this.f146348e.add(atInfo);
    }

    /* renamed from: a */
    private void m229286a(RichTextElement.EmotionProperty emotionProperty, String str) {
        Drawable a = EmojiHandler.m226946a(emotionProperty.getKey());
        if (a != null) {
            EmojiconInfo emojiconInfo = new EmojiconInfo();
            emojiconInfo.type = 10;
            emojiconInfo.text = str;
            emojiconInfo.start = m229302e();
            emojiconInfo.end = emojiconInfo.start + emojiconInfo.text.length();
            emojiconInfo.key = emotionProperty.getKey();
            emojiconInfo.drawable = a;
            this.f146355l.add(emojiconInfo);
        }
    }
}

package com.ss.android.lark.widget.richtext.preprocess;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.AbstractC59028b;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59153c;
import com.ss.android.lark.widget.span.EmojiconInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpacingInfo;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.e */
public class C59051e implements AbstractC59028b {

    /* renamed from: a */
    private Context f146383a;

    /* renamed from: b */
    private C59049d f146384b;

    /* renamed from: c */
    private StringBuilder f146385c;

    /* renamed from: d */
    private List<UrlInfo> f146386d;

    /* renamed from: e */
    private List<AtInfo> f146387e;

    /* renamed from: f */
    private List<AbbreviationInfo> f146388f;

    /* renamed from: g */
    private List<ImageInfo> f146389g;

    /* renamed from: h */
    private List<SpacingInfo> f146390h;

    /* renamed from: i */
    private List<IntentionInfo> f146391i;

    /* renamed from: j */
    private List<MentionInfo> f146392j;

    /* renamed from: k */
    private List<MediaInfo> f146393k;

    /* renamed from: l */
    private List<EmojiconInfo> f146394l;

    /* renamed from: a */
    private int m229355a(int i) {
        return i == 1 ? 1 : 2;
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146967a() {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146972a(RichTextElement.ButtonProperty buttonProperty) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146973a(RichTextElement.CodeBlockProperty codeBlockProperty) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146974a(RichTextElement.DocsProperty docsProperty) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146976a(RichTextElement.FigureProperty figureProperty) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146977a(RichTextElement.H1Property h1Property) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146978a(RichTextElement.H2Property h2Property) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146979a(RichTextElement.H3Property h3Property) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146986a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146987a(RichTextElement.SelectProperty selectProperty) {
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146968a(RichText richText) {
        this.f146386d = new ArrayList();
        this.f146387e = new ArrayList();
        this.f146388f = new ArrayList();
        this.f146389g = new ArrayList();
        this.f146390h = new ArrayList();
        this.f146391i = new ArrayList();
        this.f146392j = new ArrayList();
        this.f146393k = new ArrayList();
        this.f146394l = new ArrayList();
        this.f146385c = null;
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146988a(RichTextElement.TextProperty textProperty, Map<String, String> map) {
        if (textProperty == null) {
            Log.m165382e("Error richtext text element");
            return;
        }
        if (textProperty instanceof RichTextElement.DashedProperty) {
            m229364a(map, (RichTextElement.DashedProperty) textProperty);
        } else if (textProperty instanceof RichTextElement.IntentionDashedProperty) {
            m229365a(map, (RichTextElement.IntentionDashedProperty) textProperty);
        }
        m229363a(textProperty.getContent());
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146980a(RichTextElement.ImageProperty imageProperty) {
        if (imageProperty == null || (CollectionUtils.isEmpty(imageProperty.getUrls()) && TextUtils.isEmpty(imageProperty.getOriginKey()))) {
            Log.m165382e("Error richtext image element");
        } else if (this.f146384b.mo200633d()) {
            Image a = C59031e.m229176a(imageProperty, m229355a(this.f146384b.mo200636f()));
            if (a != null) {
                if (!TextUtils.isEmpty(this.f146385c)) {
                    StringBuilder sb = this.f146385c;
                    if (sb.charAt(sb.length() - 1) != '\n') {
                        m229363a("\n");
                    }
                }
                m229357a(a);
                m229363a(UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoPhoto));
                m229363a("\n");
                m229367b(UIHelper.dp2px(5.0f));
                m229363a("\n");
            }
        } else {
            m229363a(UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoPhoto));
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146985a(RichTextElement.ParagraphProperty paragraphProperty) {
        if (!m229373d()) {
            m229363a("\n");
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146981a(RichTextElement.ItalicProperty italicProperty) {
        if (italicProperty == null || TextUtils.isEmpty(italicProperty.getContent())) {
            Log.m165382e("Error richtext italic element");
        } else {
            m229363a(italicProperty.getContent());
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146989a(RichTextElement.UnderlineProperty underlineProperty) {
        if (underlineProperty == null || TextUtils.isEmpty(underlineProperty.getContent())) {
            Log.m165382e("Error richtext underline element");
        } else {
            m229363a(underlineProperty.getContent());
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146969a(RichTextElement.AnchorProperty anchorProperty, Map<String, String> map) {
        if (anchorProperty == null || TextUtils.isEmpty(anchorProperty.getContent())) {
            Log.m165382e("Error richtext anchor element");
            return;
        }
        m229358a(anchorProperty);
        if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            m229363a("$" + anchorProperty.getDisplayTitle() + " ");
        } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            m229363a(anchorProperty.getContent());
        } else {
            m229363a("$" + anchorProperty.getDisplayTitle() + " ");
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146975a(RichTextElement.EmotionProperty emotionProperty) {
        if (emotionProperty != null && !TextUtils.isEmpty(emotionProperty.getKey())) {
            String b = EmojiHandler.m226949b(emotionProperty.getKey());
            m229360a(emotionProperty, b);
            m229363a(b);
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146983a(RichTextElement.MediaProperty mediaProperty) {
        if (mediaProperty == null || (TextUtils.isEmpty(mediaProperty.getOriginPath()) && TextUtils.isEmpty(mediaProperty.getUrl()))) {
            m229363a(UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoVideo));
            Log.m165382e("Error richtext media element");
        } else if (!this.f146384b.mo200634e()) {
            m229363a(UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoVideo));
        } else if (mediaProperty.getOriginImage() != null) {
            if (!TextUtils.isEmpty(this.f146385c)) {
                StringBuilder sb = this.f146385c;
                if (sb.charAt(sb.length() - 1) != '\n') {
                    m229363a("\n");
                }
            }
            m229368b(mediaProperty);
            m229363a(UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoVideo));
            m229363a("\n");
            m229367b(UIHelper.dp2px(5.0f));
            m229363a("\n");
        }
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146982a(RichTextElement.LIProperty lIProperty) {
        if (lIProperty == null) {
            Log.m165383e("RichTextProcess", "Error richtext li element");
            return;
        }
        if (!TextUtils.isEmpty(this.f146385c)) {
            m229363a("\n");
        }
        m229363a("- ");
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146984a(RichTextElement.MentionProperty mentionProperty) {
        if (mentionProperty == null) {
            Log.m165382e("Error richtext mention element");
            return;
        }
        String str = "#" + mentionProperty.getContent();
        m229361a(mentionProperty, str);
        m229363a(str);
    }

    /* renamed from: a */
    private void m229363a(String str) {
        if (this.f146385c == null) {
            if (str.equals("\n")) {
                str = "";
            }
            this.f146385c = new StringBuilder(str);
            return;
        }
        if (this.f146384b.mo200631b() && str != null) {
            str = str.replace("\n", " ");
        }
        this.f146385c.append(str);
    }

    /* renamed from: a */
    private void m229364a(Map<String, String> map, RichTextElement.DashedProperty dashedProperty) {
        AbbreviationInfo abbreviationInfo = new AbbreviationInfo();
        int i = 0;
        abbreviationInfo.isIndependent = false;
        abbreviationInfo.id = dashedProperty.id;
        abbreviationInfo.desc = dashedProperty.i18nDesc;
        abbreviationInfo.fullName = dashedProperty.fullName;
        abbreviationInfo.name = dashedProperty.name;
        abbreviationInfo.text = dashedProperty.getContent();
        abbreviationInfo.start = m229370c();
        int i2 = abbreviationInfo.start;
        if (dashedProperty.getContent() != null) {
            i = dashedProperty.getContent().length();
        }
        abbreviationInfo.end = i2 + i;
        abbreviationInfo.textColor = UIUtils.getColor(this.f146383a, R.color.text_link_hover);
        abbreviationInfo.type = 5;
        abbreviationInfo.chatId = dashedProperty.chatId;
        abbreviationInfo.messageId = dashedProperty.messageId;
        abbreviationInfo.textStyle = m229356a(map.get("fontWeight"), map.get("fontStyle"));
        abbreviationInfo.intervalOff = dashedProperty.intervalOff;
        abbreviationInfo.intervalOn = dashedProperty.intervalOn;
        this.f146388f.add(abbreviationInfo);
    }

    /* renamed from: a */
    private void m229365a(Map<String, String> map, RichTextElement.IntentionDashedProperty intentionDashedProperty) {
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
        intentionInfo.start = m229370c();
        intentionInfo.end = intentionInfo.start + intentionDashedProperty.getContent().length();
        intentionInfo.textColor = UIUtils.getColor(this.f146383a, R.color.text_link_hover);
        intentionInfo.type = 5;
        this.f146391i.add(intentionInfo);
    }

    /* renamed from: c */
    private int m229370c() {
        StringBuilder sb = this.f146385c;
        if (sb == null) {
            return 0;
        }
        return sb.toString().length();
    }

    /* renamed from: b */
    private void m229366b() {
        if (m229373d()) {
            StringBuilder sb = this.f146385c;
            sb.delete(sb.length() - 2, this.f146385c.length());
            List<SpacingInfo> list = this.f146390h;
            list.remove(list.size() - 1);
        }
    }

    /* renamed from: d */
    private boolean m229373d() {
        StringBuilder sb = this.f146385c;
        if (sb == null || sb.length() == 0 || !this.f146385c.toString().endsWith("\n\n") || !CollectionUtils.isNotEmpty(this.f146390h)) {
            return false;
        }
        List<SpacingInfo> list = this.f146390h;
        if (list.get(list.size() - 1).end == this.f146385c.length()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: b */
    public void mo146990b(RichText richText) {
        m229366b();
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146971a(RichTextElement.BoldProperty boldProperty) {
        m229363a(boldProperty.getContent());
    }

    /* renamed from: c */
    private String m229371c(Image image) {
        if (TextUtils.isEmpty(image.getToken())) {
            return "";
        }
        return image.getKey();
    }

    /* renamed from: d */
    private String m229372d(Image image) {
        if (TextUtils.isEmpty(image.getToken()) || TextUtils.isEmpty(image.getKey())) {
            return image.getFirstUrl();
        }
        return "";
    }

    /* renamed from: b */
    private void m229367b(int i) {
        SpacingInfo spacingInfo = new SpacingInfo();
        spacingInfo.type = 7;
        spacingInfo.text = "\n";
        spacingInfo.start = m229370c();
        spacingInfo.end = spacingInfo.start + spacingInfo.text.length();
        spacingInfo.spacingHeight = i;
        this.f146390h.add(spacingInfo);
    }

    /* renamed from: c */
    public C59057h mo200649c(RichText richText) {
        String str;
        C59033g.m229196a(richText, this);
        RecogniseSpansResult a = new RecogniseSpansResult.C59147a().mo201042a(this.f146386d).mo201044b(this.f146387e).mo201050h(this.f146388f).mo201051i(this.f146389g).mo201052j(this.f146390h).mo201053k(this.f146391i).mo201054l(this.f146392j).mo201055m(this.f146393k).mo201056n(this.f146394l).mo201043a();
        StringBuilder sb = this.f146385c;
        if (sb == null) {
            str = "";
        } else {
            str = sb.toString();
        }
        return new C59057h(str, a);
    }

    /* renamed from: a */
    private void m229357a(Image image) {
        int[] b = m229369b(image);
        String c = m229371c(image);
        String d = m229372d(image);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.type = 6;
        imageInfo.text = UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoPhoto);
        imageInfo.start = m229370c();
        imageInfo.end = imageInfo.start + imageInfo.text.length();
        imageInfo.token = image.getToken();
        imageInfo.key = c;
        imageInfo.url = d;
        imageInfo.width = b[0];
        imageInfo.height = b[1];
        m229362a(imageInfo);
        this.f146389g.add(imageInfo);
    }

    /* renamed from: b */
    private void m229368b(RichTextElement.MediaProperty mediaProperty) {
        Image originImage = mediaProperty.getOriginImage();
        int[] b = m229369b(originImage);
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.type = 9;
        mediaInfo.text = UIUtils.getString(this.f146383a, R.string.Lark_Legacy_MessagePoVideo);
        mediaInfo.start = m229370c();
        mediaInfo.end = mediaInfo.start + mediaInfo.text.length();
        mediaInfo.width = b[0];
        mediaInfo.height = b[1];
        mediaInfo.key = mediaProperty.getKey();
        mediaInfo.originPath = mediaProperty.getOriginPath();
        mediaInfo.url = mediaProperty.getUrl();
        mediaInfo.duration = C26279i.m95149a(mediaProperty.getDuration());
        m229362a(mediaInfo);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.type = 6;
        imageInfo.key = originImage.getKey();
        imageInfo.url = originImage.getFirstUrl();
        imageInfo.width = b[0];
        imageInfo.height = b[1];
        mediaInfo.originImageInfo = imageInfo;
        this.f146393k.add(mediaInfo);
    }

    /* renamed from: a */
    private void m229358a(RichTextElement.AnchorProperty anchorProperty) {
        UrlInfo urlInfo;
        if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            urlInfo = new KeyIconUrlInfo();
            KeyIconUrlInfo keyIconUrlInfo = (KeyIconUrlInfo) urlInfo;
            keyIconUrlInfo.iconKey = anchorProperty.getIconKey();
            keyIconUrlInfo.placeHolderRes = anchorProperty.getLocalIconRes();
            keyIconUrlInfo.greyPlaceHolderRes = anchorProperty.getLocalGrayIconRes();
            keyIconUrlInfo.isUrlPreview = anchorProperty.isUrlPreview();
            urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
            urlInfo.start = m229370c();
            urlInfo.end = urlInfo.start + urlInfo.text.length();
        } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
            urlInfo = new UrlInfo();
            urlInfo.text = anchorProperty.getContent();
            urlInfo.start = m229370c();
            urlInfo.end = urlInfo.start + anchorProperty.getContent().length();
        } else {
            urlInfo = new RichUrlInfo();
            RichUrlInfo richUrlInfo = (RichUrlInfo) urlInfo;
            richUrlInfo.mLocalImageResId = anchorProperty.getLocalIconRes();
            richUrlInfo.mDisplayTitle = anchorProperty.getDisplayTitle();
            urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
            urlInfo.start = m229370c();
            urlInfo.end = urlInfo.start + urlInfo.text.length();
        }
        urlInfo.type = 1;
        urlInfo.href = anchorProperty.getHref();
        this.f146386d.add(urlInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m229369b(com.ss.android.lark.widget.richtext.Image r10) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.preprocess.C59051e.m229369b(com.ss.android.lark.widget.richtext.Image):int[]");
    }

    /* renamed from: a */
    private void m229362a(SpanInfo spanInfo) {
        if ((spanInfo instanceof ImageInfo) && this.f146384b.mo200637g()) {
            ((ImageInfo) spanInfo).borderProperty = new C59153c(UIUtils.getColor(this.f146383a, R.color.line_border_component), UIHelper.dp2px(0.5f), UIHelper.dp2px(4.0f));
        } else if (spanInfo instanceof MediaInfo) {
            ((MediaInfo) spanInfo).borderProperty = new C59153c(UIUtils.getColor(this.f146383a, R.color.line_border_card), UIHelper.dp2px(1.0f), UIHelper.dp2px(4.0f));
        }
    }

    public C59051e(Context context, C59049d dVar) {
        this.f146383a = context;
        this.f146384b = dVar;
    }

    @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
    /* renamed from: a */
    public void mo146970a(RichTextElement.AtProperty atProperty, Map<String, String> map) {
        if (atProperty == null) {
            Log.m165382e("Error richtext at element");
            return;
        }
        String atContent = atProperty.getAtContent();
        m229359a(atProperty, atContent);
        m229363a(atContent);
    }

    /* renamed from: a */
    private void m229359a(RichTextElement.AtProperty atProperty, String str) {
        AtInfo atInfo = new AtInfo();
        atInfo.type = 0;
        atInfo.userId = atProperty.getUserId();
        atInfo.text = atProperty.getAtContent();
        atInfo.start = m229370c();
        atInfo.end = atInfo.start + str.length();
        atInfo.isOutChatUser = atProperty.isOutChatUser();
        atInfo.isAnonymous = atProperty.isAnonymous();
        this.f146387e.add(atInfo);
    }

    /* renamed from: a */
    private Typeface m229356a(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return Typeface.DEFAULT;
        }
        int i = 0;
        if (!TextUtils.isEmpty(str) && str.trim().equals("bold")) {
            i = 1;
        }
        if (!TextUtils.isEmpty(str2) && str2.trim().equals("italic")) {
            i += 2;
        }
        if (i == 0) {
            return Typeface.DEFAULT;
        }
        if (i == 1) {
            return Typeface.create(Typeface.DEFAULT, 1);
        }
        if (i == 2) {
            return Typeface.create(Typeface.DEFAULT, 2);
        }
        if (i != 3) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(Typeface.DEFAULT, 3);
    }

    /* renamed from: a */
    private void m229360a(RichTextElement.EmotionProperty emotionProperty, String str) {
        Drawable a = EmojiHandler.m226946a(emotionProperty.getKey());
        if (a != null) {
            EmojiconInfo emojiconInfo = new EmojiconInfo();
            emojiconInfo.type = 10;
            emojiconInfo.text = str;
            emojiconInfo.start = m229370c();
            emojiconInfo.end = emojiconInfo.start + emojiconInfo.text.length();
            emojiconInfo.key = emotionProperty.getKey();
            emojiconInfo.drawable = a;
            this.f146394l.add(emojiconInfo);
        }
    }

    /* renamed from: a */
    private void m229361a(RichTextElement.MentionProperty mentionProperty, String str) {
        int i;
        MentionInfo mentionInfo = new MentionInfo();
        mentionInfo.id = mentionProperty.getMentionItem().getId();
        mentionInfo.text = mentionProperty.getContent();
        StringBuilder sb = this.f146385c;
        if (sb == null) {
            i = 0;
        } else {
            i = sb.toString().length();
        }
        mentionInfo.start = i;
        mentionInfo.end = mentionInfo.start + str.length();
        if (this.f146384b.mo200638h()) {
            mentionInfo.type = 11;
        } else {
            mentionInfo.type = 8;
            mentionInfo.isAuthorized = mentionProperty.isAuthorized();
            mentionInfo.url = mentionProperty.getRedirectUrl();
        }
        this.f146392j.add(mentionInfo);
    }
}

package com.ss.android.lark.widget.richtext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.lark.widget.ComposeImageView;
import com.ss.android.lark.widget.light.C58475b;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IImageSpanClickListener;
import com.ss.android.lark.widget.light.listener.IIntentionClickListener;
import com.ss.android.lark.widget.light.listener.IMediaSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.light.listener.ImageClickInfo;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.media.RichTextVideoView;
import com.ss.android.lark.widget.richtext.preprocess.C59049d;
import com.ss.android.lark.widget.richtext.preprocess.C59054g;
import com.ss.android.lark.widget.richtext.preprocess.C59057h;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59173m;
import com.ss.android.lark.widget.span.C59176n;
import com.ss.android.lark.widget.span.ChatInfo;
import com.ss.android.lark.widget.span.EmojiconInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpacingInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RichTextView extends LinearLayout {
    private static Boolean al;

    /* renamed from: A */
    private List<String> f146215A;

    /* renamed from: B */
    private final List<String> f146216B;

    /* renamed from: C */
    private final boolean f146217C;

    /* renamed from: D */
    private int f146218D;

    /* renamed from: E */
    private boolean f146219E;

    /* renamed from: F */
    private float f146220F;

    /* renamed from: G */
    private float f146221G;

    /* renamed from: H */
    private int f146222H;

    /* renamed from: I */
    private int f146223I;

    /* renamed from: J */
    private int f146224J;

    /* renamed from: K */
    private int f146225K;

    /* renamed from: L */
    private int f146226L;

    /* renamed from: M */
    private int f146227M;

    /* renamed from: N */
    private int f146228N;

    /* renamed from: O */
    private int f146229O;

    /* renamed from: P */
    private int f146230P;

    /* renamed from: Q */
    private int f146231Q;

    /* renamed from: R */
    private int f146232R;

    /* renamed from: S */
    private int f146233S;

    /* renamed from: T */
    private int f146234T;

    /* renamed from: U */
    private int f146235U;

    /* renamed from: V */
    private float f146236V;

    /* renamed from: W */
    private float f146237W;

    /* renamed from: a */
    public int f146238a;
    private boolean aa;
    private boolean ab;
    private String ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;

    /* renamed from: ai  reason: collision with root package name */
    private boolean f175457ai;
    private boolean aj;
    private boolean ak;
    private final AbstractC59028b am;

    /* renamed from: b */
    public AbstractC59024b f146239b;

    /* renamed from: c */
    public AbstractC59026d f146240c;

    /* renamed from: d */
    public LinkEmojiTextView.AbstractC58525j f146241d;

    /* renamed from: e */
    public LinkEmojiTextView.AbstractC58521f f146242e;

    /* renamed from: f */
    public IMentionSpanClickListener f146243f;

    /* renamed from: g */
    public IMomentsHashTagSpanClickListener f146244g;

    /* renamed from: h */
    public LinkEmojiTextView.AbstractC58524i f146245h;

    /* renamed from: i */
    public LinkEmojiTextView.AbstractC58520e f146246i;

    /* renamed from: j */
    public LinkEmojiTextView.AbstractC58523h f146247j;

    /* renamed from: k */
    public AbstractC59025c f146248k;

    /* renamed from: l */
    public StringBuilder f146249l;

    /* renamed from: m */
    public int f146250m;

    /* renamed from: n */
    public int f146251n;

    /* renamed from: o */
    public float f146252o;

    /* renamed from: p */
    public AbstractC59023a f146253p;

    /* renamed from: q */
    public boolean f146254q;

    /* renamed from: r */
    public boolean f146255r;

    /* renamed from: s */
    public boolean f146256s;

    /* renamed from: t */
    public boolean f146257t;

    /* renamed from: u */
    public boolean f146258u;

    /* renamed from: v */
    public boolean f146259v;

    /* renamed from: w */
    private boolean f146260w;

    /* renamed from: x */
    private RichText f146261x;

    /* renamed from: y */
    private int f146262y;

    /* renamed from: z */
    private boolean f146263z;

    /* renamed from: com.ss.android.lark.widget.richtext.RichTextView$a */
    public interface AbstractC59023a {
        /* renamed from: a */
        void mo136816a(boolean z);
    }

    /* renamed from: com.ss.android.lark.widget.richtext.RichTextView$b */
    public interface AbstractC59024b {
        /* renamed from: a */
        void mo136819a(Image image, View view);

        /* renamed from: a */
        boolean mo136820a(View view);

        /* renamed from: a */
        boolean mo136821a(Image image, View view, MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.lark.widget.richtext.RichTextView$c */
    public interface AbstractC59025c {
        /* renamed from: a */
        void mo124117a(TextView textView);

        /* renamed from: a */
        void mo124118a(String str, TextView textView);
    }

    /* renamed from: com.ss.android.lark.widget.richtext.RichTextView$d */
    public interface AbstractC59026d {
        /* renamed from: a */
        void mo136822a(View view, RichTextElement.MediaProperty mediaProperty);

        /* renamed from: a */
        boolean mo136823a(View view, RichTextElement.MediaProperty mediaProperty, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo136824b(View view, RichTextElement.MediaProperty mediaProperty);
    }

    /* renamed from: a */
    public void mo200506a() {
        this.aj = true;
    }

    /* renamed from: b */
    public void mo200512b() {
        this.ak = true;
    }

    /* renamed from: a */
    public void mo200509a(RichText richText, String str, boolean z) {
        if (m229057d()) {
            setupLightTextView(richText);
            return;
        }
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.f146216B);
        RichText richText2 = this.f146261x;
        boolean z2 = richText2 != null && richText2.equals(richText) && C26325y.m95335a(this.ac, str);
        if (z || isNotEmpty || !z2 || m229053a(richText)) {
            if (!z2 || this.f146262y != -1) {
                this.f146250m = 0;
                this.f146257t = false;
                this.f146261x = richText;
                removeAllViews();
            } else {
                this.f146250m = 0;
                this.f146257t = true;
            }
            this.f146258u = z;
            this.f146263z = true;
            this.ac = str;
            C59033g.m229196a(richText, this.am);
        }
    }

    /* renamed from: a */
    public void mo200507a(LinkEmojiTextView linkEmojiTextView) {
        linkEmojiTextView.getHelper().mo198436a(this.aa);
        linkEmojiTextView.getHelper().mo198439b(this.f146215A);
        linkEmojiTextView.getHelper().mo198435a(this.f146216B);
    }

    /* renamed from: a */
    public void mo200510a(String str) {
        if (this.f146249l == null) {
            if (str.equals("\n")) {
                str = "";
            }
            this.f146249l = new StringBuilder(str);
            return;
        }
        if (this.ak && str != null) {
            str = str.replace("\n", " ");
        }
        this.f146249l.append(str);
    }

    /* renamed from: a */
    public void mo200511a(boolean z) {
        this.f146219E = z;
    }

    private int getFontSize() {
        return (int) LKUIDisplayManager.m91864a(getContext(), UIHelper.px2dp(this.f146252o));
    }

    private int getImageFlag() {
        int i = this.f146238a;
        if (i == 2) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return 2;
    }

    /* renamed from: f */
    private int m229059f() {
        int i = this.f146238a;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return 0;
        }
        return 5;
    }

    /* renamed from: d */
    private boolean m229057d() {
        if (al == null) {
            al = Boolean.valueOf(C58377d.m226286a().mo102880c());
            Log.m165389i("RichTextView", "useLightTextView:" + al);
        }
        return al.booleanValue();
    }

    /* renamed from: c */
    private boolean m229056c() {
        int i = this.f146262y;
        if (i == -1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (z) {
                childAt.setVisibility(8);
            } else {
                childAt.setVisibility(0);
                if (childAt instanceof LinkEmojiTextView) {
                    LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) childAt;
                    if (i >= linkEmojiTextView.getLineCount()) {
                        i -= linkEmojiTextView.getLineCount();
                    } else {
                        linkEmojiTextView.setShowTail(true);
                        linkEmojiTextView.setShowShortTailText(this.f146260w);
                        linkEmojiTextView.setMaxLines(i);
                    }
                } else if (childAt instanceof ComposeImageView) {
                    if (i > 3) {
                        i -= 3;
                    }
                }
                z = true;
            }
        }
        AbstractC59023a aVar = this.f146253p;
        if (aVar != null) {
            aVar.mo136816a(z);
        }
        return z;
    }

    /* renamed from: e */
    private C59049d m229058e() {
        boolean z;
        C59049d.C59050a c = new C59049d.C59050a().mo200641a(this.f146254q).mo200644b(this.f146255r).mo200646d(this.f146256s).mo200645c(this.ak);
        boolean z2 = true;
        if (this.f146236V != BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        C59049d.C59050a a = c.mo200647e(z).mo200640a(m229059f());
        if (!this.aa || this.aj) {
            z2 = false;
        }
        return a.mo200648f(z2).mo200642a();
    }

    private LKUILightTextView getLKUILightTextView() {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof LKUILightTextView) {
                return (LKUILightTextView) childAt;
            }
        }
        LKUILightTextView lKUILightTextView = new LKUILightTextView(getContext());
        lKUILightTextView.setTextSize(getFontSize());
        lKUILightTextView.setTextColor(this.f146251n);
        lKUILightTextView.setSpacingMulti(this.f146221G);
        lKUILightTextView.setSpacingExtra(this.f146220F);
        lKUILightTextView.setHighlightedColor(this.f146226L);
        lKUILightTextView.setIncludeFontPadding(this.af);
        lKUILightTextView.setFakeBoldText(this.ae);
        addView(lKUILightTextView);
        return lKUILightTextView;
    }

    /* renamed from: g */
    private SpannableStringExtraParams m229060g() {
        boolean z;
        String str;
        SpannableStringExtraParams.Builder aVar = new SpannableStringExtraParams.Builder(getContext());
        if (!this.aa || this.aj) {
            z = false;
        } else {
            z = true;
        }
        SpannableStringExtraParams.Builder b = aVar.mo198082c(z).mo198073a(this.f146216B).mo198078b(this.f146215A).mo198076b(LKUIDisplayManager.m91881c(getContext(), 20));
        if (this.f146228N != 0) {
            b.mo198086e(UIUtils.getColor(getContext(), this.f146228N));
        }
        if (this.f146229O != 0) {
            b.mo198084d(UIUtils.getColor(getContext(), this.f146229O));
        }
        if (this.f146230P != 0) {
            b.mo198088f(UIUtils.getColor(getContext(), this.f146230P));
        }
        if (this.f146231Q != 0) {
            b.mo198081c(UIUtils.getColor(getContext(), this.f146231Q));
        }
        if (this.f146234T != 0) {
            b.mo198090g(UIUtils.getColor(getContext(), this.f146234T));
        }
        if (this.f146235U != 0) {
            b.mo198092h(UIUtils.getColor(getContext(), this.f146235U));
        }
        b.mo198071a(getFontSize());
        if (this.aj) {
            str = "";
        } else {
            str = C58377d.m226286a().mo102878a();
        }
        b.mo198072a(str);
        if (this.f175457ai) {
            b.mo198074a(true);
        }
        return b.mo198107v();
    }

    public void setAbbreviationListener(LinkEmojiTextView.AbstractC58520e eVar) {
        this.f146246i = eVar;
    }

    public void setAtOtherChatUserBgColor(int i) {
        this.f146232R = i;
    }

    public void setAtOtherChatUserTextColor(int i) {
        this.f146231Q = i;
    }

    public void setAtSelfBgColor(int i) {
        this.f146228N = i;
    }

    public void setAtSelfTextColor(int i) {
        this.f146229O = i;
    }

    public void setAtStringClickListner(LinkEmojiTextView.AbstractC58521f fVar) {
        this.f146242e = fVar;
    }

    public void setAtTextColor(int i) {
        this.f146230P = i;
    }

    public void setBotIdList(List<String> list) {
        this.f146215A = list;
    }

    public void setDefaultAtUserColor(int i) {
        this.f146227M = i;
    }

    public void setDotReadColor(int i) {
        this.f146234T = i;
    }

    public void setDotUnreadColor(int i) {
        this.f146235U = i;
    }

    public void setEmojIconSize(int i) {
        this.f146222H = i;
    }

    public void setEnableSelectText(boolean z) {
        this.ab = z;
    }

    public void setFakeBoldText(boolean z) {
        this.ae = z;
    }

    public void setHighlightColor(int i) {
        this.f146226L = i;
    }

    public void setImageBoarderRadius(float f) {
        this.f146237W = f;
    }

    public void setImageBorderColor(int i) {
        this.f146233S = i;
    }

    public void setImageBorderWidth(float f) {
        this.f146236V = f;
    }

    public void setImageMode(int i) {
        this.f146238a = i;
    }

    public void setIncludeFontPadding(boolean z) {
        this.af = z;
    }

    public void setIntentionClickListener(LinkEmojiTextView.AbstractC58523h hVar) {
        this.f146247j = hVar;
    }

    public void setIsTextStrikeThrough(boolean z) {
        this.f175457ai = z;
    }

    public void setIsUrlShowUnderLine(boolean z) {
        this.f146259v = z;
    }

    public void setMentionListener(IMentionSpanClickListener fVar) {
        this.f146243f = fVar;
    }

    public void setMomentsHashTagListener(IMomentsHashTagSpanClickListener gVar) {
        this.f146244g = gVar;
    }

    public void setNeedShowAtDot(boolean z) {
        this.aa = z;
    }

    public void setNeedToRecognizePhone(boolean z) {
        this.ag = z;
    }

    public void setOnEllipsizeListener(AbstractC59023a aVar) {
        this.f146253p = aVar;
    }

    public void setPhoneStringClickListener(LinkEmojiTextView.AbstractC58524i iVar) {
        this.f146245h = iVar;
    }

    public void setPhoneTextColor(int i) {
        this.f146225K = i;
    }

    public void setRichTextImageListener(AbstractC59024b bVar) {
        this.f146239b = bVar;
    }

    public void setRichTextListener(AbstractC59025c cVar) {
        this.f146248k = cVar;
    }

    public void setRichTextVideoListener(AbstractC59026d dVar) {
        this.f146240c = dVar;
    }

    public void setShowImage(boolean z) {
        this.f146254q = z;
    }

    public void setShowMomentsHashtag(boolean z) {
        this.f146256s = z;
    }

    public void setShowShortTailText(boolean z) {
        this.f146260w = z;
    }

    public void setShowVideo(boolean z) {
        this.f146255r = z;
    }

    public void setTextColor(int i) {
        this.f146251n = i;
    }

    public void setTextSize(float f) {
        this.f146252o = f;
    }

    public void setTranslateEmojiText(boolean z) {
        this.ah = z;
    }

    public void setUrlStringClickListner(LinkEmojiTextView.AbstractC58525j jVar) {
        this.f146241d = jVar;
    }

    public void setUrlTextColor(int i) {
        this.f146223I = i;
    }

    public void setUseNewAtStyle(boolean z) {
        this.ad = z;
    }

    public RichTextView(Context context) {
        this(context, null);
    }

    public void setAtReadUserIdList(List<String> list) {
        if (list != null) {
            CollectionUtils.resetToList(this.f146216B, list);
        }
    }

    public void setInfo(RichText richText) {
        mo200508a(richText, "");
    }

    public void setMaxLines(int i) {
        if (i > 0) {
            this.f146262y = i;
        }
    }

    public void setUserLightTextView(boolean z) {
        al = Boolean.valueOf(z);
    }

    /* renamed from: a */
    private C59173m m229049a(C59057h hVar) {
        return new C59173m.C59175a().mo201124c(this.ag).mo201120a(hVar.f146398b.getAllSpanInfos()).mo201122a();
    }

    private void setTextStrikeThrough(LinkEmojiTextView linkEmojiTextView) {
        if (this.f175457ai && linkEmojiTextView.getPaint() != null) {
            linkEmojiTextView.getPaint().setFlags(17);
        }
    }

    private void setLinkEmojiTextViewListener(LinkEmojiTextView linkEmojiTextView) {
        LinkEmojiTextView.AbstractC58524i iVar = this.f146245h;
        if (iVar != null) {
            linkEmojiTextView.setPhoneStringClickListener(iVar);
        }
        LinkEmojiTextView.AbstractC58525j jVar = this.f146241d;
        if (jVar != null) {
            linkEmojiTextView.setUrlStringClickListner(jVar);
        }
        LinkEmojiTextView.AbstractC58521f fVar = this.f146242e;
        if (fVar != null) {
            linkEmojiTextView.setAtStringClickListner(fVar);
        }
        IMentionSpanClickListener fVar2 = this.f146243f;
        if (fVar2 != null) {
            linkEmojiTextView.setMentionSpanClickListener(fVar2);
        }
        IMomentsHashTagSpanClickListener gVar = this.f146244g;
        if (gVar != null) {
            linkEmojiTextView.setHashTagSpanClickListener(gVar);
        }
        LinkEmojiTextView.AbstractC58520e eVar = this.f146246i;
        if (eVar != null) {
            linkEmojiTextView.setAbbreviationClickListener(eVar);
        }
        LinkEmojiTextView.AbstractC58523h hVar = this.f146247j;
        if (hVar != null) {
            linkEmojiTextView.setIntentionClickListener(hVar);
        }
    }

    /* renamed from: a */
    private boolean m229053a(RichText richText) {
        RichTextElement richTextElement;
        int version;
        List<String> anchorIds = richText.getAnchorIds();
        if (anchorIds == null || anchorIds.size() <= 0 || (richTextElement = richText.getElements().getDictionary().get(anchorIds.get(0))) == null || !(richTextElement.getProperty() instanceof RichTextElement.AnchorProperty) || (version = ((RichTextElement.AnchorProperty) richTextElement.getProperty()).getVersion()) < this.f146218D) {
            return false;
        }
        this.f146218D = version;
        return true;
    }

    private void setupLightTextView(RichText richText) {
        if (C59035h.m229210a(richText)) {
            getLKUILightTextView().setContentText("");
            return;
        }
        C59057h a = C59054g.m229403a().mo200650a(getContext(), richText, m229058e());
        CharSequence a2 = C58475b.m226783a().mo198109a(getContext(), a.f146397a, C59176n.m229853a().mo201128a(a.f146397a, m229049a(a)), m229060g());
        LKUILightTextView lKUILightTextView = getLKUILightTextView();
        m229051a(lKUILightTextView, this.f146262y);
        m229052a(lKUILightTextView, richText, a2.toString());
        lKUILightTextView.setContentText(a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] mo200513b(com.ss.android.lark.widget.richtext.Image r10) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.RichTextView.mo200513b(com.ss.android.lark.widget.richtext.Image):int[]");
    }

    /* renamed from: a */
    public View mo200503a(final Image image) {
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(getContext(), null);
        lKUIRoundableLayout.setBackground(null);
        lKUIRoundableLayout.setBorderColor(this.f146233S);
        lKUIRoundableLayout.setBorderWidthInPx(this.f146236V);
        lKUIRoundableLayout.setRadiusInPx((int) this.f146237W);
        final ImageView imageView = new ImageView(getContext());
        lKUIRoundableLayout.addView(imageView);
        int[] b = mo200513b(image);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.bottomMargin = UIUtils.dp2px(getContext(), 5.0f);
        layoutParams.width = b[0];
        layoutParams.height = b[1];
        lKUIRoundableLayout.setLayoutParams(layoutParams);
        C59032f.m229191a().mo200569a(image, b[0], b[1], imageView);
        imageView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.C590207 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (RichTextView.this.f146239b != null) {
                    RichTextView.this.f146239b.mo136819a(image, imageView);
                }
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.View$OnLongClickListenerC590218 */

            public boolean onLongClick(View view) {
                if (RichTextView.this.f146239b != null) {
                    return RichTextView.this.f146239b.mo136820a(view);
                }
                return false;
            }
        });
        imageView.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.View$OnGenericMotionListenerC590229 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() == 2 && RichTextView.this.f146239b != null) {
                    return RichTextView.this.f146239b.mo136821a(image, imageView, motionEvent);
                }
                return false;
            }
        });
        return lKUIRoundableLayout;
    }

    /* renamed from: a */
    public View mo200504a(final RichTextElement.MediaProperty mediaProperty) {
        RichTextVideoView richTextVideoView = new RichTextVideoView(getContext());
        int[] a = richTextVideoView.mo200572a(mediaProperty.getOriginImage());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.bottomMargin = UIUtils.dp2px(getContext(), 5.0f);
        layoutParams.width = a[0];
        layoutParams.height = a[1];
        richTextVideoView.setLayoutParams(layoutParams);
        richTextVideoView.setInfo(new RichTextVideoView.C59036a(mediaProperty.getOriginImage(), mediaProperty.getOriginPath(), mediaProperty.getCompressPath(), mediaProperty.getUrl(), (long) mediaProperty.getDuration()));
        richTextVideoView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (RichTextView.this.f146240c != null) {
                    RichTextView.this.f146240c.mo136822a(view, mediaProperty);
                }
            }
        });
        richTextVideoView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass11 */

            public boolean onLongClick(View view) {
                if (RichTextView.this.f146240c != null) {
                    return RichTextView.this.f146240c.mo136824b(view, mediaProperty);
                }
                return false;
            }
        });
        richTextVideoView.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass13 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() == 2 && RichTextView.this.f146240c != null) {
                    return RichTextView.this.f146240c.mo136823a(view, mediaProperty, motionEvent);
                }
                return false;
            }
        });
        return richTextVideoView;
    }

    /* renamed from: a */
    public void mo200508a(RichText richText, String str) {
        mo200509a(richText, str, false);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m229051a(LKUILightTextView lKUILightTextView, int i) {
        if (i != -1) {
            lKUILightTextView.setMaxLines(i);
            lKUILightTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f146263z && m229056c()) {
            super.onMeasure(i, i2);
            this.f146263z = false;
        }
    }

    /* renamed from: a */
    private void m229050a(Context context, AttributeSet attributeSet) {
        this.f146251n = UIUtils.getColor(context, R.color.text_title);
        this.f146252o = UIUtils.sp2px(context, 16.0f);
        m229055b(context, attributeSet);
        setOrientation(1);
        setDividerDrawable(getContext().getResources().getDrawable(R.drawable.divider_linearlayout_vertical));
        setShowDividers(2);
    }

    /* renamed from: b */
    private void m229055b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconSize, R.attr.highlightColor, R.attr.imageBorderColor, R.attr.imageBorderRadius, R.attr.imageBorderWidthDp, R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier, R.attr.phoneTextColor, R.attr.richTextColor, R.attr.richTextSize, R.attr.showImage, R.attr.showUrlUnderLine, R.attr.urlBackGroundColor, R.attr.urlTextColor});
        this.f146252o = (float) obtainStyledAttributes.getDimensionPixelSize(9, (int) UIUtils.sp2px(context, 16.0f));
        this.f146220F = (float) obtainStyledAttributes.getDimensionPixelSize(5, UIUtils.getDimens(context, R.dimen.text_default_line_spacing));
        this.f146221G = obtainStyledAttributes.getFloat(6, 1.0f);
        this.f146222H = obtainStyledAttributes.getDimensionPixelSize(0, LKUIDisplayManager.m91881c(context, 19));
        this.f146251n = obtainStyledAttributes.getColor(8, UIUtils.getColor(context, R.color.text_title));
        this.f146223I = obtainStyledAttributes.getColor(13, UIUtils.getColor(context, R.color.text_link_normal));
        this.f146224J = obtainStyledAttributes.getColor(12, UIUtils.getColor(context, R.color.bg_base));
        this.f146225K = obtainStyledAttributes.getColor(7, UIUtils.getColor(context, R.color.text_link_normal));
        this.f146219E = obtainStyledAttributes.getBoolean(11, true);
        this.f146254q = obtainStyledAttributes.getBoolean(10, true);
        this.f146226L = obtainStyledAttributes.getColor(1, 1714664933);
        this.f146233S = obtainStyledAttributes.getColor(2, UIUtils.getColor(getContext(), R.color.static_white));
        this.f146236V = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        this.f146237W = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public View mo200505a(String str, RecogniseSpansResult recogniseSpansResult) {
        String str2;
        final LinkEmojiTextView a = C59027a.m229130a(getContext(), this.f146241d, this.f146242e);
        a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        a.setTextIsSelectable(this.ab);
        a.setUseNewAtStyle(this.ad);
        a.setTextSize(0, this.f146252o);
        a.setLineSpacing(this.f146220F, this.f146221G);
        a.setEmojiconSize(this.f146222H);
        a.setEmojiconTextSize((int) this.f146252o);
        a.setTranslateEmojiCode(this.ah);
        setTextStrikeThrough(a);
        a.setTextColor(this.f146251n);
        a.setHighlightColor(this.f146226L);
        a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        a.setUrlTextColor(this.f146223I);
        a.setUrlBackGroundColor(this.f146224J);
        if (this.aj) {
            str2 = "";
        } else {
            str2 = C58377d.m226286a().mo102878a();
        }
        a.setCurrentUserId(str2);
        a.setPhoneTextColor(this.f146225K);
        a.setShowUrlUnderLine(this.f146219E);
        a.setIsUrlShowUnderLine(this.f146259v);
        a.setAtTextColor(this.f146230P);
        a.setAtSelfTextColor(this.f146229O);
        a.setAtSelfBgColor(this.f146228N);
        a.setAtOtherChatUserTextColor(this.f146231Q);
        a.setAtOtherChatUserBgColor(this.f146232R);
        a.setDefaultAtUserColor(this.f146227M);
        int i = this.f146234T;
        if (i != 0) {
            a.setDotReadColor(i);
        }
        int i2 = this.f146235U;
        if (i2 != 0) {
            a.setDotUnreadColor(i2);
        }
        if (this.ae && a.getPaint() != null) {
            a.getPaint().setFakeBoldText(this.ae);
        }
        a.setIncludeFontPadding(this.af);
        a.setNeedToRecognizePhone(this.ag);
        setLinkEmojiTextViewListener(a);
        mo200507a(a);
        a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.View$OnClickListenerC590196 */

            public void onClick(View view) {
                boolean z;
                if (RichTextView.this.f146248k != null) {
                    int selectionStart = a.getSelectionStart();
                    int selectionEnd = a.getSelectionEnd();
                    boolean z2 = true;
                    boolean z3 = false;
                    if (selectionStart == -1 && selectionEnd == -1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        z3 = z;
                    } else if (a.getText() instanceof SpannableString) {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) a.getText()).getSpans(selectionStart, selectionEnd, ClickableSpan.class);
                        if (clickableSpanArr == null || clickableSpanArr.length <= 0) {
                            z2 = false;
                        }
                        z3 = z2;
                    }
                    if (!z3) {
                        RichTextView.this.f146248k.mo124117a(a);
                    }
                }
            }
        });
        a.setOnLongClickListener(new View.OnLongClickListener(str, a) {
            /* class com.ss.android.lark.widget.richtext.$$Lambda$RichTextView$3FirmLP5h6JZWplxTuXtWI1UcjQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ LinkEmojiTextView f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final boolean onLongClick(View view) {
                return RichTextView.this.m229054a(this.f$1, this.f$2, view);
            }
        });
        a.setImageFetcher(C59032f.m229191a().mo200571b());
        a.mo198365a(str, recogniseSpansResult);
        return a;
    }

    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146260w = true;
        this.f146262y = -1;
        this.f146215A = new ArrayList();
        this.f146216B = new ArrayList();
        this.f146254q = true;
        this.f146255r = true;
        this.f146256s = false;
        this.f146257t = false;
        this.f146217C = false;
        this.f146258u = false;
        this.f146218D = -1;
        this.f146219E = true;
        this.aa = false;
        this.ab = C58377d.m226286a().mo102879b();
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.af = true;
        this.ag = true;
        this.ah = false;
        this.f175457ai = false;
        this.aj = false;
        this.ak = false;
        this.am = new AbstractC59028b() {
            /* class com.ss.android.lark.widget.richtext.RichTextView.C590141 */

            /* renamed from: b */
            private List<UrlInfo> f146265b = new ArrayList();

            /* renamed from: c */
            private List<AtInfo> f146266c = new ArrayList();

            /* renamed from: d */
            private List<MentionInfo> f146267d = new ArrayList();

            /* renamed from: e */
            private final List<PhoneInfo> f146268e = new ArrayList();

            /* renamed from: f */
            private final List<ChatInfo> f146269f = new ArrayList();

            /* renamed from: g */
            private List<TextStyleInfo> f146270g = new ArrayList();

            /* renamed from: h */
            private List<AbbreviationInfo> f146271h = new ArrayList();

            /* renamed from: i */
            private final List<IntentionInfo> f146272i = new ArrayList();

            /* renamed from: j */
            private List<ImageInfo> f146273j = new ArrayList();

            /* renamed from: k */
            private List<SpacingInfo> f146274k = new ArrayList();

            /* renamed from: l */
            private List<EmojiconInfo> f146275l = new ArrayList();

            /* renamed from: c */
            private void m229082c() {
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146968a(RichText richText) {
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
            public void mo146982a(RichTextElement.LIProperty lIProperty) {
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146986a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) {
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146987a(RichTextElement.SelectProperty selectProperty) {
            }

            /* renamed from: a */
            private void m229080a(Map<String, String> map, String str) {
                if (!CollectionUtils.isEmpty(map) && !TextUtils.isEmpty(str)) {
                    TextStyleInfo textStyleInfo = new TextStyleInfo();
                    int i = 0;
                    textStyleInfo.isIndependent = false;
                    textStyleInfo.text = str;
                    if (RichTextView.this.f146249l != null) {
                        i = RichTextView.this.f146249l.toString().length();
                    }
                    textStyleInfo.start = i;
                    textStyleInfo.end = textStyleInfo.start + str.length();
                    textStyleInfo.textColor = UIUtils.getColor(RichTextView.this.getContext(), R.color.primary_pri_500);
                    textStyleInfo.textSize = (int) RichTextView.this.f146252o;
                    textStyleInfo.type = 4;
                    textStyleInfo.textStyle = m229072a(map.get("fontWeight"), map.get("fontStyle"));
                    this.f146270g.add(textStyleInfo);
                }
            }

            /* renamed from: a */
            private void m229078a(Map<String, String> map, RichTextElement.DashedProperty dashedProperty) {
                AbbreviationInfo abbreviationInfo = new AbbreviationInfo();
                int i = 0;
                abbreviationInfo.isIndependent = false;
                abbreviationInfo.id = dashedProperty.id;
                abbreviationInfo.desc = dashedProperty.i18nDesc;
                abbreviationInfo.fullName = dashedProperty.fullName;
                abbreviationInfo.name = dashedProperty.name;
                abbreviationInfo.text = dashedProperty.content;
                if (RichTextView.this.f146249l != null) {
                    i = RichTextView.this.f146249l.toString().length();
                }
                abbreviationInfo.start = i;
                abbreviationInfo.end = abbreviationInfo.start + dashedProperty.content.length();
                abbreviationInfo.textColor = UIUtils.getColor(RichTextView.this.getContext(), R.color.primary_pri_500);
                abbreviationInfo.textSize = (int) RichTextView.this.f146252o;
                abbreviationInfo.type = 5;
                abbreviationInfo.chatId = dashedProperty.chatId;
                abbreviationInfo.messageId = dashedProperty.messageId;
                abbreviationInfo.textStyle = m229072a(map.get("fontWeight"), map.get("fontStyle"));
                abbreviationInfo.intervalOff = dashedProperty.intervalOff;
                abbreviationInfo.intervalOn = dashedProperty.intervalOn;
                this.f146271h.add(abbreviationInfo);
            }

            /* renamed from: a */
            private void m229079a(Map<String, String> map, RichTextElement.IntentionDashedProperty intentionDashedProperty) {
                IntentionInfo intentionInfo = new IntentionInfo();
                int i = 0;
                intentionInfo.isIndependent = false;
                intentionInfo.chatId = intentionDashedProperty.chatId;
                intentionInfo.messageId = intentionDashedProperty.messageId;
                intentionInfo.startTime = intentionDashedProperty.startTime;
                intentionInfo.endTime = intentionDashedProperty.endTime;
                intentionInfo.duration = intentionDashedProperty.duration;
                intentionInfo.title = intentionDashedProperty.title;
                intentionInfo.chatterIds = intentionDashedProperty.chatterIds;
                intentionInfo.text = intentionDashedProperty.content;
                intentionInfo.isAtAll = intentionDashedProperty.isAtAll;
                intentionInfo.isMeetting = intentionDashedProperty.isMetting;
                if (RichTextView.this.f146249l != null) {
                    i = RichTextView.this.f146249l.toString().length();
                }
                intentionInfo.start = i;
                intentionInfo.end = intentionInfo.start + intentionDashedProperty.content.length();
                intentionInfo.textColor = UIUtils.getColor(RichTextView.this.getContext(), R.color.primary_pri_500);
                intentionInfo.textSize = (int) RichTextView.this.f146252o;
                intentionInfo.type = 5;
                this.f146272i.add(intentionInfo);
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146988a(RichTextElement.TextProperty textProperty, Map<String, String> map) {
                if (textProperty == null) {
                    Log.m165382e("Error richtext text element");
                    return;
                }
                if (textProperty instanceof RichTextElement.DashedProperty) {
                    m229078a(map, (RichTextElement.DashedProperty) textProperty);
                } else if (textProperty instanceof RichTextElement.IntentionDashedProperty) {
                    m229079a(map, (RichTextElement.IntentionDashedProperty) textProperty);
                }
                RichTextView.this.mo200510a(textProperty.getContent());
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146970a(RichTextElement.AtProperty atProperty, Map<String, String> map) {
                if (atProperty == null) {
                    Log.m165382e("Error richtext at element");
                    return;
                }
                String b = C57814c.m224350b(atProperty.getUserId(), atProperty.getAtContent().substring(1));
                m229074a(atProperty, b);
                RichTextView.this.mo200510a(b);
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146980a(RichTextElement.ImageProperty imageProperty) {
                if (imageProperty == null || (CollectionUtils.isEmpty(imageProperty.getUrls()) && TextUtils.isEmpty(imageProperty.getOriginKey()))) {
                    Log.m165382e("Error richtext image element");
                } else if (RichTextView.this.f146254q) {
                    int i = 2;
                    if (RichTextView.this.f146238a == 2) {
                        i = 0;
                    } else if (RichTextView.this.f146238a == 1) {
                        i = 1;
                    }
                    Image a = C59031e.m229176a(imageProperty, i);
                    if (a != null) {
                        m229081b();
                        if (!RichTextView.this.f146257t) {
                            RichTextView richTextView = RichTextView.this;
                            richTextView.addView(richTextView.mo200503a(a));
                        }
                        RichTextView.this.f146250m++;
                    }
                } else {
                    RichTextView richTextView2 = RichTextView.this;
                    richTextView2.mo200510a(UIUtils.getString(richTextView2.getContext(), R.string.Lark_Legacy_MessagePoPhoto));
                }
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146985a(RichTextElement.ParagraphProperty paragraphProperty) {
                RichTextView.this.mo200510a("\n");
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146981a(RichTextElement.ItalicProperty italicProperty) {
                if (italicProperty == null || TextUtils.isEmpty(italicProperty.getContent())) {
                    Log.m165382e("Error richtext italic element");
                    return;
                }
                m229077a((RichTextElement.RichTextProperty) italicProperty);
                RichTextView.this.mo200510a(italicProperty.getContent());
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146989a(RichTextElement.UnderlineProperty underlineProperty) {
                if (underlineProperty == null || TextUtils.isEmpty(underlineProperty.getContent())) {
                    Log.m165382e("Error richtext underline element");
                    return;
                }
                m229077a((RichTextElement.RichTextProperty) underlineProperty);
                RichTextView.this.mo200510a(underlineProperty.getContent());
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146969a(RichTextElement.AnchorProperty anchorProperty, Map<String, String> map) {
                if (anchorProperty == null || TextUtils.isEmpty(anchorProperty.getContent())) {
                    Log.m165382e("Error richtext anchor element");
                    return;
                }
                m229073a(anchorProperty);
                m229080a(map, anchorProperty.getContent());
                if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    RichTextView richTextView = RichTextView.this;
                    richTextView.mo200510a("$" + anchorProperty.getDisplayTitle() + " ");
                } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    RichTextView.this.mo200510a(anchorProperty.getContent());
                } else {
                    RichTextView richTextView2 = RichTextView.this;
                    richTextView2.mo200510a("$" + anchorProperty.getDisplayTitle() + " ");
                }
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146975a(RichTextElement.EmotionProperty emotionProperty) {
                if (emotionProperty != null && !TextUtils.isEmpty(emotionProperty.getKey())) {
                    String b = EmojiHandler.m226949b(emotionProperty.getKey());
                    m229075a(emotionProperty, b);
                    RichTextView.this.mo200510a(b);
                }
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146983a(RichTextElement.MediaProperty mediaProperty) {
                if (mediaProperty == null) {
                    RichTextView richTextView = RichTextView.this;
                    richTextView.mo200510a(UIUtils.getString(richTextView.getContext(), R.string.Lark_Legacy_MessagePoVideo));
                    Log.m165382e("Error richtext media element");
                } else if (RichTextView.this.f146255r) {
                    m229081b();
                    if (!RichTextView.this.f146257t) {
                        RichTextView.this.addView(RichTextView.this.mo200504a(mediaProperty));
                    }
                    RichTextView.this.f146250m++;
                } else {
                    RichTextView richTextView2 = RichTextView.this;
                    richTextView2.mo200510a(UIUtils.getString(richTextView2.getContext(), R.string.Lark_Legacy_MessagePoVideo));
                }
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146984a(RichTextElement.MentionProperty mentionProperty) {
                if (mentionProperty == null) {
                    Log.m165382e("Error richtext mention element");
                    return;
                }
                String content = mentionProperty.getContent();
                m229076a(mentionProperty, content);
                RichTextView.this.mo200510a(content);
            }

            /* renamed from: b */
            private void m229081b() {
                if (RichTextView.this.f146249l != null) {
                    m229082c();
                    if (!RichTextView.this.f146257t) {
                        m229084e();
                    } else {
                        m229085f();
                    }
                    RichTextView.this.f146250m++;
                    m229083d();
                }
            }

            /* renamed from: d */
            private void m229083d() {
                RichTextView.this.f146249l = null;
                this.f146266c = new ArrayList();
                this.f146267d = new ArrayList();
                this.f146265b = new ArrayList();
                this.f146270g = new ArrayList();
                this.f146271h = new ArrayList();
                this.f146273j = new ArrayList();
                this.f146274k = new ArrayList();
                this.f146275l = new ArrayList();
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146967a() {
                RichTextView richTextView = RichTextView.this;
                richTextView.mo200510a("\n" + UIUtils.getString(RichTextView.this.getContext(), R.string.Lark_Legacy_UnknownRichTextTag) + "\n");
            }

            /* renamed from: e */
            private void m229084e() {
                if (!CollectionUtils.isEmpty(this.f146266c) || !CollectionUtils.isEmpty(this.f146265b) || !CollectionUtils.isEmpty(this.f146270g) || !CollectionUtils.isEmpty(this.f146271h) || !CollectionUtils.isEmpty(this.f146273j) || !CollectionUtils.isEmpty(this.f146274k) || !CollectionUtils.isEmpty(this.f146272i) || !CollectionUtils.isEmpty(this.f146267d) || !CollectionUtils.isEmpty(this.f146275l)) {
                    RecogniseSpansResult a = new RecogniseSpansResult.C59147a().mo201042a(this.f146265b).mo201044b(this.f146266c).mo201045c(this.f146268e).mo201046d(this.f146269f).mo201047e(this.f146270g).mo201050h(this.f146271h).mo201051i(this.f146273j).mo201052j(this.f146274k).mo201053k(this.f146272i).mo201054l(this.f146267d).mo201056n(this.f146275l).mo201043a();
                    RichTextView richTextView = RichTextView.this;
                    richTextView.addView(richTextView.mo200505a(richTextView.f146249l.toString(), a));
                    return;
                }
                RichTextView richTextView2 = RichTextView.this;
                richTextView2.addView(richTextView2.mo200505a(richTextView2.f146249l.toString(), (RecogniseSpansResult) null));
            }

            /* renamed from: f */
            private void m229085f() {
                if (RichTextView.this.f146250m >= RichTextView.this.getChildCount()) {
                    Log.m165383e("RichTextView", "Failed to refresh textview, it's not same richtext");
                    return;
                }
                RichTextView richTextView = RichTextView.this;
                if (!(richTextView.getChildAt(richTextView.f146250m) instanceof LinkEmojiTextView)) {
                    Log.m165383e("RichTextView", "Failed to get LinkEmojiTextView, it's not same richtext");
                    return;
                }
                RecogniseSpansResult recogniseSpansResult = null;
                if (!CollectionUtils.isEmpty(this.f146266c) || !CollectionUtils.isEmpty(this.f146265b)) {
                    recogniseSpansResult = new RecogniseSpansResult.C59147a().mo201042a(this.f146265b).mo201044b(this.f146266c).mo201045c(this.f146268e).mo201046d(this.f146269f).mo201047e(this.f146270g).mo201050h(this.f146271h).mo201051i(this.f146273j).mo201052j(this.f146274k).mo201053k(this.f146272i).mo201054l(this.f146267d).mo201056n(this.f146275l).mo201043a();
                }
                if (RichTextView.this.f146258u) {
                    RichTextView richTextView2 = RichTextView.this;
                    LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) richTextView2.mo200505a(richTextView2.f146249l.toString(), recogniseSpansResult);
                    RichTextView.this.mo200507a(linkEmojiTextView);
                    RichTextView richTextView3 = RichTextView.this;
                    richTextView3.removeViewAt(richTextView3.f146250m);
                    RichTextView richTextView4 = RichTextView.this;
                    richTextView4.addView(linkEmojiTextView, richTextView4.f146250m);
                    return;
                }
                RichTextView richTextView5 = RichTextView.this;
                LinkEmojiTextView linkEmojiTextView2 = (LinkEmojiTextView) richTextView5.getChildAt(richTextView5.f146250m);
                RichTextView.this.mo200507a(linkEmojiTextView2);
                linkEmojiTextView2.mo198365a(RichTextView.this.f146249l.toString(), recogniseSpansResult);
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: b */
            public void mo146990b(RichText richText) {
                m229081b();
            }

            @Override // com.ss.android.lark.widget.richtext.AbstractC59028b
            /* renamed from: a */
            public void mo146971a(RichTextElement.BoldProperty boldProperty) {
                if (boldProperty == null || TextUtils.isEmpty(boldProperty.getContent())) {
                    Log.m165382e("Error richtext bold element");
                    return;
                }
                m229077a((RichTextElement.RichTextProperty) boldProperty);
                RichTextView.this.mo200510a(boldProperty.getContent());
            }

            /* renamed from: a */
            private void m229073a(RichTextElement.AnchorProperty anchorProperty) {
                UrlInfo urlInfo;
                int i = 0;
                if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    urlInfo = new KeyIconUrlInfo();
                    KeyIconUrlInfo keyIconUrlInfo = (KeyIconUrlInfo) urlInfo;
                    keyIconUrlInfo.iconKey = anchorProperty.getIconKey();
                    keyIconUrlInfo.placeHolderRes = anchorProperty.getLocalIconRes();
                    keyIconUrlInfo.greyPlaceHolderRes = anchorProperty.getLocalGrayIconRes();
                    keyIconUrlInfo.isUrlPreview = anchorProperty.isUrlPreview();
                    urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
                    if (RichTextView.this.f146249l != null) {
                        i = RichTextView.this.f146249l.toString().length();
                    }
                    urlInfo.start = i;
                    urlInfo.end = urlInfo.start + urlInfo.text.length();
                } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    urlInfo = new UrlInfo();
                    urlInfo.text = anchorProperty.getContent();
                    if (RichTextView.this.f146249l != null) {
                        i = RichTextView.this.f146249l.toString().length();
                    }
                    urlInfo.start = i;
                    urlInfo.end = urlInfo.start + anchorProperty.getContent().length();
                } else {
                    urlInfo = new RichUrlInfo();
                    RichUrlInfo richUrlInfo = (RichUrlInfo) urlInfo;
                    richUrlInfo.mLocalImageResId = anchorProperty.getLocalIconRes();
                    richUrlInfo.mDisplayTitle = anchorProperty.getDisplayTitle();
                    urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
                    if (RichTextView.this.f146249l != null) {
                        i = RichTextView.this.f146249l.toString().length();
                    }
                    urlInfo.start = i;
                    urlInfo.end = urlInfo.start + urlInfo.text.length();
                }
                urlInfo.type = 1;
                urlInfo.href = anchorProperty.getHref();
                urlInfo.isUnderlineText = RichTextView.this.f146259v;
                this.f146265b.add(urlInfo);
            }

            /* renamed from: a */
            private void m229077a(RichTextElement.RichTextProperty richTextProperty) {
                int i;
                TextStyleInfo textStyleInfo = new TextStyleInfo();
                textStyleInfo.isIndependent = true;
                int i2 = 0;
                if (RichTextView.this.f146249l == null) {
                    i = 0;
                } else {
                    i = RichTextView.this.f146249l.toString().length();
                }
                textStyleInfo.start = i;
                textStyleInfo.textSize = (int) RichTextView.this.f146252o;
                textStyleInfo.textColor = RichTextView.this.f146251n;
                textStyleInfo.type = 4;
                if (richTextProperty instanceof RichTextElement.BoldProperty) {
                    textStyleInfo.textStyle = Typeface.create(Typeface.DEFAULT, 1);
                    textStyleInfo.text = ((RichTextElement.BoldProperty) richTextProperty).getContent();
                } else if (richTextProperty instanceof RichTextElement.ItalicProperty) {
                    textStyleInfo.textStyle = Typeface.create(Typeface.DEFAULT, 2);
                    textStyleInfo.text = ((RichTextElement.ItalicProperty) richTextProperty).getContent();
                } else if (richTextProperty instanceof RichTextElement.UnderlineProperty) {
                    textStyleInfo.textStyle = Typeface.create(Typeface.DEFAULT, 0);
                    textStyleInfo.text = ((RichTextElement.UnderlineProperty) richTextProperty).getContent();
                    textStyleInfo.isUnderlineText = true;
                } else if (richTextProperty instanceof RichTextElement.DashedProperty) {
                    textStyleInfo.textStyle = Typeface.create(Typeface.DEFAULT, 0);
                    textStyleInfo.text = ((RichTextElement.DashedProperty) richTextProperty).getContent();
                }
                int i3 = textStyleInfo.start;
                if (textStyleInfo.text != null) {
                    i2 = textStyleInfo.text.length();
                }
                textStyleInfo.end = i3 + i2;
                this.f146270g.add(textStyleInfo);
            }

            /* renamed from: a */
            private Typeface m229072a(String str, String str2) {
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
            private void m229074a(RichTextElement.AtProperty atProperty, String str) {
                AtInfo atInfo = new AtInfo();
                int i = 0;
                atInfo.type = 0;
                atInfo.userId = atProperty.getUserId();
                atInfo.text = atProperty.getAtContent();
                if (RichTextView.this.f146249l != null) {
                    i = RichTextView.this.f146249l.toString().length();
                }
                atInfo.start = i;
                atInfo.end = atInfo.start + str.length();
                atInfo.isOutChatUser = atProperty.isOutChatUser();
                atInfo.isAnonymous = atProperty.isAnonymous();
                this.f146266c.add(atInfo);
            }

            /* renamed from: a */
            private void m229075a(RichTextElement.EmotionProperty emotionProperty, String str) {
                int i;
                Drawable a = EmojiHandler.m226946a(emotionProperty.getKey());
                if (a != null) {
                    EmojiconInfo emojiconInfo = new EmojiconInfo();
                    emojiconInfo.type = 10;
                    emojiconInfo.text = str;
                    if (RichTextView.this.f146249l == null) {
                        i = 0;
                    } else {
                        i = RichTextView.this.f146249l.toString().length();
                    }
                    emojiconInfo.start = i;
                    emojiconInfo.end = emojiconInfo.start + emojiconInfo.text.length();
                    emojiconInfo.key = emotionProperty.getKey();
                    emojiconInfo.drawable = a;
                    this.f146275l.add(emojiconInfo);
                }
            }

            /* renamed from: a */
            private void m229076a(RichTextElement.MentionProperty mentionProperty, String str) {
                int i;
                MentionInfo mentionInfo = new MentionInfo();
                mentionInfo.id = mentionProperty.getMentionItem().getId();
                mentionInfo.text = mentionProperty.getContent();
                if (RichTextView.this.f146249l == null) {
                    i = 0;
                } else {
                    i = RichTextView.this.f146249l.toString().length();
                }
                mentionInfo.start = i;
                mentionInfo.end = mentionInfo.start + str.length();
                if (RichTextView.this.f146256s) {
                    mentionInfo.type = 11;
                } else {
                    mentionInfo.type = 8;
                    mentionInfo.isAuthorized = mentionProperty.isAuthorized();
                    mentionInfo.url = mentionProperty.getRedirectUrl();
                }
                this.f146267d.add(mentionInfo);
            }
        };
        this.f146259v = false;
        m229050a(context, attributeSet);
    }

    /* renamed from: a */
    private void m229052a(final LKUILightTextView lKUILightTextView, final RichText richText, final String str) {
        if (this.f146245h != null) {
            lKUILightTextView.setPhoneSpanClickListener(new IPhoneSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass12 */

                @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
                /* renamed from: a */
                public void mo122866a(View view, String str) {
                    RichTextView.this.f146245h.mo122808a(view, str);
                }

                @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
                /* renamed from: b */
                public void mo122867b(View view, String str) {
                    RichTextView.this.f146245h.mo122809b(view, str);
                }
            });
        }
        if (this.f146241d != null) {
            lKUILightTextView.setUrlSpanClickListener(new IUrlSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass14 */

                @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
                public void a_(View view, String str) {
                    RichTextView.this.f146241d.mo122806a(view, str);
                }

                @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
                public boolean b_(View view, String str) {
                    return RichTextView.this.f146241d.mo122807b(view, str);
                }
            });
        }
        if (this.f146242e != null) {
            lKUILightTextView.setAtSpanClickListener(new IAtSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass15 */

                @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
                /* renamed from: a */
                public void mo122870a(View view, String str, String str2) {
                    RichTextView.this.f146242e.mo120297c(view, str, str2);
                }

                @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
                /* renamed from: b */
                public boolean mo122871b(View view, String str, String str2) {
                    return RichTextView.this.f146242e.mo117507b(view, str, str2);
                }
            });
        }
        if (this.f146243f != null) {
            lKUILightTextView.setMentionSpanClickListener(new IMentionSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass16 */

                @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
                /* renamed from: a */
                public boolean mo122873a(View view, String str, String str2, boolean z) {
                    return RichTextView.this.f146243f.mo122873a(view, str, str2, z);
                }

                @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
                /* renamed from: a */
                public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                    RichTextView.this.f146243f.mo122872a(view, str, str2, z, str3);
                }
            });
        }
        if (this.f146244g != null) {
            lKUILightTextView.setHashTagSpanClickListener(new IMomentsHashTagSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass17 */

                @Override // com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener
                public void a_(View view, String str, String str2) {
                    RichTextView.this.f146244g.a_(view, str, str2);
                }

                @Override // com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener
                public boolean b_(View view, String str, String str2) {
                    return RichTextView.this.f146244g.b_(view, str, str2);
                }
            });
        }
        if (this.f146246i != null) {
            lKUILightTextView.setAbbreviationClickListener(new IAbbreviationClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass18 */

                @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener
                public void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                    RichTextView.this.f146246i.mo136825a(view, abbreviationInfo, f, f2);
                }
            });
        }
        if (this.f146247j != null) {
            lKUILightTextView.setIntentionClickListener(new IIntentionClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass19 */

                @Override // com.ss.android.lark.widget.light.listener.IIntentionClickListener
                /* renamed from: a */
                public void mo122884a(View view, IntentionInfo intentionInfo) {
                    RichTextView.this.f146247j.mo122884a(view, intentionInfo);
                }
            });
        }
        if (this.f146253p != null) {
            lKUILightTextView.setOnEllipsizeListener(new LKUILightTextView.OnEllipsizeListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.AnonymousClass20 */

                @Override // com.ss.android.lark.widget.light.LKUILightTextView.OnEllipsizeListener
                /* renamed from: a */
                public void mo198050a(boolean z) {
                    RichTextView.this.f146253p.mo136816a(z);
                }
            });
        }
        if (this.f146239b != null) {
            lKUILightTextView.setImageSpanClickListener(new IImageSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.C590152 */

                @Override // com.ss.android.lark.widget.light.listener.IImageSpanClickListener
                /* renamed from: a */
                public void mo122874a(View view, ImageClickInfo kVar) {
                    Image a = C59031e.m229175a(richText, kVar.mo198118b(), kVar.mo198115a());
                    if (a == null) {
                        Log.m165383e("RichTextView", "Can't find select image, token:" + kVar.mo198118b() + ", url:" + kVar.mo198115a());
                        return;
                    }
                    RichTextView.this.f146239b.mo136819a(a, lKUILightTextView);
                }
            });
        }
        if (this.f146240c != null) {
            lKUILightTextView.setMediaSpanClickListener(new IMediaSpanClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.C590163 */

                @Override // com.ss.android.lark.widget.light.listener.IMediaSpanClickListener
                /* renamed from: a */
                public void mo122875a(View view, MediaInfo mediaInfo) {
                    RichTextView.this.f146240c.mo136822a(view, C59031e.m229177a(richText, mediaInfo));
                }
            });
        }
        if (this.f146248k != null) {
            final TextView textView = new TextView(getContext());
            lKUILightTextView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.View$OnClickListenerC590174 */

                public void onClick(View view) {
                    RichTextView.this.f146248k.mo124117a(textView);
                }
            });
            lKUILightTextView.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.widget.richtext.RichTextView.View$OnLongClickListenerC590185 */

                public boolean onLongClick(View view) {
                    RichTextView.this.f146248k.mo124118a(str, textView);
                    return true;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m229054a(String str, LinkEmojiTextView linkEmojiTextView, View view) {
        AbstractC59025c cVar = this.f146248k;
        if (cVar == null) {
            return true;
        }
        cVar.mo124118a(str, linkEmojiTextView);
        return true;
    }
}

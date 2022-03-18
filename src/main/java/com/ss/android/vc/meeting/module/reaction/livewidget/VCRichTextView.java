package com.ss.android.vc.meeting.module.reaction.livewidget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
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
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.lark.widget.ComposeImageView;
import com.ss.android.lark.widget.emoji.EmojiData;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59032f;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.media.RichTextVideoView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.ChatInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpacingInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VCRichTextView extends LinearLayout {

    /* renamed from: A */
    private AbstractC62832a f158120A;

    /* renamed from: B */
    private boolean f158121B;

    /* renamed from: C */
    private float f158122C;

    /* renamed from: D */
    private float f158123D;

    /* renamed from: E */
    private int f158124E;

    /* renamed from: F */
    private int f158125F;

    /* renamed from: G */
    private int f158126G;

    /* renamed from: H */
    private int f158127H;

    /* renamed from: I */
    private int f158128I;

    /* renamed from: J */
    private int f158129J;

    /* renamed from: K */
    private int f158130K;

    /* renamed from: L */
    private int f158131L;

    /* renamed from: M */
    private int f158132M;

    /* renamed from: N */
    private int f158133N;

    /* renamed from: O */
    private int f158134O;

    /* renamed from: P */
    private int f158135P;

    /* renamed from: Q */
    private int f158136Q;

    /* renamed from: R */
    private int f158137R;

    /* renamed from: S */
    private float f158138S;

    /* renamed from: T */
    private float f158139T;

    /* renamed from: U */
    private boolean f158140U;

    /* renamed from: V */
    private boolean f158141V;

    /* renamed from: W */
    private String f158142W;

    /* renamed from: a */
    public int f158143a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private AbstractC62843d ae;

    /* renamed from: b */
    public AbstractC62833b f158144b;

    /* renamed from: c */
    public AbstractC62835d f158145c;

    /* renamed from: d */
    public AbstractC62834c f158146d;

    /* renamed from: e */
    public StringBuilder f158147e;

    /* renamed from: f */
    public int f158148f;

    /* renamed from: g */
    public int f158149g;

    /* renamed from: h */
    public float f158150h;

    /* renamed from: i */
    public boolean f158151i;

    /* renamed from: j */
    public boolean f158152j;

    /* renamed from: k */
    public boolean f158153k;

    /* renamed from: l */
    public boolean f158154l;

    /* renamed from: m */
    public boolean f158155m;

    /* renamed from: n */
    public boolean f158156n;

    /* renamed from: o */
    private boolean f158157o;

    /* renamed from: p */
    private VCLinkEmojiTextView.AbstractC62815i f158158p;

    /* renamed from: q */
    private VCLinkEmojiTextView.AbstractC62811e f158159q;

    /* renamed from: r */
    private IMentionSpanClickListener f158160r;

    /* renamed from: s */
    private VCLinkEmojiTextView.AbstractC62814h f158161s;

    /* renamed from: t */
    private VCLinkEmojiTextView.AbstractC62810d f158162t;

    /* renamed from: u */
    private VCLinkEmojiTextView.AbstractC62813g f158163u;

    /* renamed from: v */
    private RichText f158164v;

    /* renamed from: w */
    private int f158165w;

    /* renamed from: x */
    private boolean f158166x;

    /* renamed from: y */
    private List<String> f158167y;

    /* renamed from: z */
    private List<String> f158168z;

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView$a */
    public interface AbstractC62832a {
        /* renamed from: a */
        void mo217127a(boolean z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView$b */
    public interface AbstractC62833b {
        /* renamed from: a */
        void mo217128a(Image image, View view);

        /* renamed from: a */
        boolean mo217129a(View view);

        /* renamed from: a */
        boolean mo217130a(Image image, View view, MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView$c */
    public interface AbstractC62834c {
        /* renamed from: a */
        void mo217131a(TextView textView);

        /* renamed from: a */
        void mo217132a(String str, TextView textView);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView$d */
    public interface AbstractC62835d {
        /* renamed from: a */
        void mo217133a(View view, RichTextElement.MediaProperty mediaProperty);

        /* renamed from: a */
        boolean mo217134a(View view, RichTextElement.MediaProperty mediaProperty, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo217135b(View view, RichTextElement.MediaProperty mediaProperty);
    }

    /* renamed from: a */
    public void mo217049a(RichText richText, String str, boolean z) {
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.f158168z);
        RichText richText2 = this.f158164v;
        boolean z2 = richText2 != null && richText2.equals(richText) && C26325y.m95335a(this.f158142W, str);
        if (z || isNotEmpty || !z2) {
            if (z2) {
                this.f158148f = 0;
                this.f158153k = true;
            } else {
                this.f158148f = 0;
                this.f158153k = false;
                this.f158164v = richText;
                removeAllViews();
            }
            this.f158155m = z;
            this.f158166x = true;
            this.f158142W = str;
            C62845f.m246018a(richText, this.ae);
        }
    }

    /* renamed from: a */
    public void mo217050a(VCLinkEmojiTextView vCLinkEmojiTextView) {
        vCLinkEmojiTextView.getHelper().mo217150a(this.f158140U);
        vCLinkEmojiTextView.getHelper().mo217153b(this.f158167y);
        vCLinkEmojiTextView.getHelper().mo217149a(this.f158168z);
    }

    /* renamed from: a */
    public void mo217051a(String str) {
        StringBuilder sb = this.f158147e;
        if (sb == null) {
            if (str.equals("\n")) {
                str = "";
            }
            this.f158147e = new StringBuilder(str);
            return;
        }
        sb.append(str);
    }

    private int getImageFlag() {
        int i = this.f158143a;
        if (i == 2) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private boolean m245908a() {
        int i = this.f158165w;
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
                if (childAt instanceof VCLinkEmojiTextView) {
                    VCLinkEmojiTextView vCLinkEmojiTextView = (VCLinkEmojiTextView) childAt;
                    if (i >= vCLinkEmojiTextView.getLineCount()) {
                        i -= vCLinkEmojiTextView.getLineCount();
                    } else {
                        vCLinkEmojiTextView.setShowTail(true);
                        vCLinkEmojiTextView.setShowShortTailText(this.f158157o);
                        vCLinkEmojiTextView.setMaxLines(i);
                    }
                } else if (childAt instanceof ComposeImageView) {
                    if (i > 3) {
                        i -= 3;
                    }
                }
                z = true;
            }
        }
        AbstractC62832a aVar = this.f158120A;
        if (aVar != null) {
            aVar.mo217127a(z);
        }
        return z;
    }

    public void setAbbreviationListener(VCLinkEmojiTextView.AbstractC62810d dVar) {
        this.f158162t = dVar;
    }

    public void setAtOtherChatUserBgColor(int i) {
        this.f158134O = i;
    }

    public void setAtOtherChatUserTextColor(int i) {
        this.f158133N = i;
    }

    public void setAtSelfBgColor(int i) {
        this.f158130K = i;
    }

    public void setAtSelfTextColor(int i) {
        this.f158131L = i;
    }

    public void setAtStringClickListner(VCLinkEmojiTextView.AbstractC62811e eVar) {
        this.f158159q = eVar;
    }

    public void setAtTextColor(int i) {
        this.f158132M = i;
    }

    public void setBotIdList(List<String> list) {
        this.f158167y = list;
    }

    public void setDefaultAtUserColor(int i) {
        this.f158129J = i;
    }

    public void setDotReadColor(int i) {
        this.f158136Q = i;
    }

    public void setDotUnreadColor(int i) {
        this.f158137R = i;
    }

    public void setEmojIconSize(int i) {
        this.f158124E = i;
    }

    public void setEnableSelectText(boolean z) {
        this.f158141V = z;
    }

    public void setFakeBoldText(boolean z) {
        this.ab = z;
    }

    public void setHighlightColor(int i) {
        this.f158128I = i;
    }

    public void setImageBoarderRadius(float f) {
        this.f158139T = f;
    }

    public void setImageBorderColor(int i) {
        this.f158135P = i;
    }

    public void setImageBorderWidth(float f) {
        this.f158138S = f;
    }

    public void setImageMode(int i) {
        this.f158143a = i;
    }

    public void setIncludeFontPadding(boolean z) {
        this.ac = z;
    }

    public void setIntentionClickListener(VCLinkEmojiTextView.AbstractC62813g gVar) {
        this.f158163u = gVar;
    }

    public void setIsUrlShowUnderLine(boolean z) {
        this.f158156n = z;
    }

    public void setMentionListener(IMentionSpanClickListener fVar) {
        this.f158160r = fVar;
    }

    public void setNeedShowAtDot(boolean z) {
        this.f158140U = z;
    }

    public void setNeedToRecognizePhone(boolean z) {
        this.ad = z;
    }

    public void setOnEllipsizeListener(AbstractC62832a aVar) {
        this.f158120A = aVar;
    }

    public void setPhoneStringClickListener(VCLinkEmojiTextView.AbstractC62814h hVar) {
        this.f158161s = hVar;
    }

    public void setPhoneTextColor(int i) {
        this.f158127H = i;
    }

    public void setRichTextImageListener(AbstractC62833b bVar) {
        this.f158144b = bVar;
    }

    public void setRichTextListener(AbstractC62834c cVar) {
        this.f158146d = cVar;
    }

    public void setRichTextVideoListener(AbstractC62835d dVar) {
        this.f158145c = dVar;
    }

    public void setShowImage(boolean z) {
        this.f158151i = z;
    }

    public void setShowShortTailText(boolean z) {
        this.f158157o = z;
    }

    public void setShowVideo(boolean z) {
        this.f158152j = z;
    }

    public void setTextColor(int i) {
        this.f158149g = i;
    }

    public void setTextSize(float f) {
        this.f158150h = f;
    }

    public void setUrlStringClickListner(VCLinkEmojiTextView.AbstractC62815i iVar) {
        this.f158158p = iVar;
    }

    public void setUrlTextColor(int i) {
        this.f158125F = i;
    }

    public void setUseNewAtStyle(boolean z) {
        this.aa = z;
    }

    public VCRichTextView(Context context) {
        this(context, null);
    }

    public void setAtReadUserIdList(List<String> list) {
        if (list != null) {
            CollectionUtils.resetToList(this.f158168z, list);
        }
    }

    public void setInfo(RichText richText) {
        mo217048a(richText, "");
    }

    public void setMaxLines(int i) {
        if (i > 0) {
            this.f158165w = i;
        }
    }

    /* renamed from: b */
    public String mo217052b(Image image) {
        if (TextUtils.isEmpty(image.getToken()) || TextUtils.isEmpty(image.getKey())) {
            return image.getFirstUrl();
        }
        return "";
    }

    private void setVCLinkEmojiTextViewListener(VCLinkEmojiTextView vCLinkEmojiTextView) {
        VCLinkEmojiTextView.AbstractC62814h hVar = this.f158161s;
        if (hVar != null) {
            vCLinkEmojiTextView.setPhoneStringClickListener(hVar);
        }
        VCLinkEmojiTextView.AbstractC62815i iVar = this.f158158p;
        if (iVar != null) {
            vCLinkEmojiTextView.setUrlStringClickListner(iVar);
        }
        VCLinkEmojiTextView.AbstractC62811e eVar = this.f158159q;
        if (eVar != null) {
            vCLinkEmojiTextView.setAtStringClickListner(eVar);
        }
        IMentionSpanClickListener fVar = this.f158160r;
        if (fVar != null) {
            vCLinkEmojiTextView.setMentionSpanClickListener(fVar);
        }
        VCLinkEmojiTextView.AbstractC62810d dVar = this.f158162t;
        if (dVar != null) {
            vCLinkEmojiTextView.setAbbreviationClickListener(dVar);
        }
        VCLinkEmojiTextView.AbstractC62813g gVar = this.f158163u;
        if (gVar != null) {
            vCLinkEmojiTextView.setIntentionClickListener(gVar);
        }
    }

    /* renamed from: c */
    public View mo217053c(final Image image) {
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(getContext(), null);
        lKUIRoundableLayout.setBackground(null);
        lKUIRoundableLayout.setBorderColor(this.f158135P);
        lKUIRoundableLayout.setBorderWidthInPx(this.f158138S);
        lKUIRoundableLayout.setRadiusInPx((int) this.f158139T);
        final ImageView imageView = new ImageView(getContext());
        lKUIRoundableLayout.addView(imageView);
        int[] d = mo217054d(image);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.bottomMargin = UIUtils.dp2px(getContext(), 5.0f);
        layoutParams.width = d[0];
        layoutParams.height = d[1];
        lKUIRoundableLayout.setLayoutParams(layoutParams);
        C59032f.m229191a().mo200569a(image, d[0], d[1], imageView);
        imageView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.C628263 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (VCRichTextView.this.f158144b != null) {
                    VCRichTextView.this.f158144b.mo217128a(image, imageView);
                }
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.View$OnLongClickListenerC628274 */

            public boolean onLongClick(View view) {
                if (VCRichTextView.this.f158144b != null) {
                    return VCRichTextView.this.f158144b.mo217129a(view);
                }
                return false;
            }
        });
        imageView.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.View$OnGenericMotionListenerC628285 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() == 2 && VCRichTextView.this.f158144b != null) {
                    return VCRichTextView.this.f158144b.mo217130a(image, imageView, motionEvent);
                }
                return false;
            }
        });
        return lKUIRoundableLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] mo217054d(com.ss.android.lark.widget.richtext.Image r10) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.mo217054d(com.ss.android.lark.widget.richtext.Image):int[]");
    }

    /* renamed from: a */
    public View mo217045a(final RichTextElement.MediaProperty mediaProperty) {
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
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.C628296 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (VCRichTextView.this.f158145c != null) {
                    VCRichTextView.this.f158145c.mo217133a(view, mediaProperty);
                }
            }
        });
        richTextVideoView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.View$OnLongClickListenerC628307 */

            public boolean onLongClick(View view) {
                if (VCRichTextView.this.f158145c != null) {
                    return VCRichTextView.this.f158145c.mo217135b(view, mediaProperty);
                }
                return false;
            }
        });
        richTextVideoView.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.View$OnGenericMotionListenerC628318 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() == 2 && VCRichTextView.this.f158145c != null) {
                    return VCRichTextView.this.f158145c.mo217134a(view, mediaProperty, motionEvent);
                }
                return false;
            }
        });
        return richTextVideoView;
    }

    /* renamed from: a */
    public String mo217047a(Image image) {
        if (TextUtils.isEmpty(image.getToken())) {
            return "";
        }
        return image.getKey();
    }

    /* renamed from: a */
    public void mo217048a(RichText richText, String str) {
        mo217049a(richText, str, false);
    }

    public VCRichTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f158166x && m245908a()) {
            super.onMeasure(i, i2);
            this.f158166x = false;
        }
    }

    /* renamed from: a */
    private Image m245905a(String str, String str2) {
        if (this.f158164v == null) {
            return null;
        }
        int imageFlag = getImageFlag();
        Map<String, RichTextElement> dictionary = this.f158164v.getElements().getDictionary();
        List<String> imageIds = this.f158164v.getImageIds();
        if (!CollectionUtils.isEmpty(imageIds)) {
            for (String str3 : imageIds) {
                Image a = m245904a(dictionary.get(str3), str, str2, imageFlag);
                if (a != null) {
                    return a;
                }
            }
        }
        for (RichTextElement richTextElement : dictionary.values()) {
            Image a2 = m245904a(richTextElement, str, str2, imageFlag);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m245906a(Context context, AttributeSet attributeSet) {
        this.f158149g = UIUtils.getColor(context, R.color.ud_N900);
        this.f158150h = UIUtils.sp2px(context, 16.0f);
        m245910b(context, attributeSet);
        setOrientation(1);
        setDividerDrawable(C60773o.m236128f(R.drawable.divider_linearlayout_vertical));
        setShowDividers(2);
    }

    /* renamed from: b */
    private void m245910b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.emojiconSize, R.attr.highlightColor, R.attr.imageBorderColor, R.attr.imageBorderRadius, R.attr.imageBorderWidthDp, R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier, R.attr.phoneTextColor, R.attr.richTextColor, R.attr.richTextSize, R.attr.showImage, R.attr.showUrlUnderLine, R.attr.urlBackGroundColor, R.attr.urlTextColor});
        this.f158150h = (float) obtainStyledAttributes.getDimensionPixelSize(9, (int) UIUtils.sp2px(context, 16.0f));
        this.f158122C = (float) obtainStyledAttributes.getDimensionPixelSize(5, UIUtils.getDimens(context, R.dimen.text_default_line_spacing));
        this.f158123D = obtainStyledAttributes.getFloat(6, 1.0f);
        this.f158124E = obtainStyledAttributes.getDimensionPixelSize(0, LKUIDisplayManager.m91881c(context, 19));
        this.f158149g = obtainStyledAttributes.getColor(8, UIUtils.getColor(context, R.color.ud_N900));
        this.f158125F = obtainStyledAttributes.getColor(13, UIUtils.getColor(context, R.color.ud_B500));
        this.f158126G = obtainStyledAttributes.getColor(12, UIUtils.getColor(context, R.color.ud_N50));
        this.f158127H = obtainStyledAttributes.getColor(7, UIUtils.getColor(context, R.color.ud_B500));
        this.f158121B = obtainStyledAttributes.getBoolean(11, true);
        this.f158151i = obtainStyledAttributes.getBoolean(10, true);
        this.f158128I = obtainStyledAttributes.getColor(1, 1714664933);
        this.f158135P = obtainStyledAttributes.getColor(2, 16777215);
        this.f158138S = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        this.f158139T = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public View mo217046a(String str, RecogniseSpansResult recogniseSpansResult) {
        final VCLinkEmojiTextView a = C62841b.m245980a(getContext(), this.f158158p, this.f158159q);
        a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        a.setTextIsSelectable(this.f158141V);
        a.setUseNewAtStyle(this.aa);
        a.setTextSize(0, this.f158150h);
        a.setLineSpacing(this.f158122C, this.f158123D);
        a.setEmojiconSize(this.f158124E);
        a.setEmojiconTextSize((int) this.f158150h);
        a.setTextColor(this.f158149g);
        a.setHighlightColor(this.f158128I);
        a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        a.setUrlTextColor(this.f158125F);
        a.setUrlBackGroundColor(this.f158126G);
        a.setCurrentUserId(C58377d.m226286a().mo102878a());
        a.setPhoneTextColor(this.f158127H);
        a.setShowUrlUnderLine(this.f158121B);
        a.setIsUrlShowUnderLine(this.f158156n);
        a.setAtTextColor(this.f158132M);
        a.setAtSelfTextColor(this.f158131L);
        a.setAtSelfBgColor(this.f158130K);
        a.setAtOtherChatUserTextColor(this.f158133N);
        a.setAtOtherChatUserBgColor(this.f158134O);
        a.setDefaultAtUserColor(this.f158129J);
        int i = this.f158136Q;
        if (i != 0) {
            a.setDotReadColor(i);
        }
        int i2 = this.f158137R;
        if (i2 != 0) {
            a.setDotUnreadColor(i2);
        }
        if (this.ab && a.getPaint() != null) {
            a.getPaint().setFakeBoldText(this.ab);
        }
        a.setIncludeFontPadding(this.ac);
        a.setNeedToRecognizePhone(this.ad);
        setVCLinkEmojiTextViewListener(a);
        mo217050a(a);
        a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.View$OnClickListenerC628252 */

            public void onClick(View view) {
                boolean z;
                if (VCRichTextView.this.f158146d != null) {
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
                        VCRichTextView.this.f158146d.mo217131a(a);
                    }
                }
            }
        });
        if (!this.f158154l) {
            a.setOnLongClickListener(new View.OnLongClickListener(str, a) {
                /* class com.ss.android.vc.meeting.module.reaction.livewidget.$$Lambda$VCRichTextView$o5bUQ1O3e6KkYY9WZv5h3Cz1aE */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ VCLinkEmojiTextView f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return VCRichTextView.this.m245909a(this.f$1, this.f$2, view);
                }
            });
        } else {
            a.setImageClickListener(new VCLinkEmojiTextView.AbstractC62812f(a) {
                /* class com.ss.android.vc.meeting.module.reaction.livewidget.$$Lambda$VCRichTextView$m7NlcSceI96Sz62Nlosvuui6H0Y */
                public final /* synthetic */ VCLinkEmojiTextView f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView.AbstractC62812f
                public final void onImageClick(View view, String str, String str2) {
                    VCRichTextView.this.m245907a((VCRichTextView) this.f$1, (VCLinkEmojiTextView) view, (View) str, str2);
                }
            });
        }
        a.setImageFetcher(C59032f.m229191a().mo200571b());
        a.mo216975a(str, recogniseSpansResult);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m245909a(String str, VCLinkEmojiTextView vCLinkEmojiTextView, View view) {
        AbstractC62834c cVar = this.f158146d;
        if (cVar == null) {
            return true;
        }
        cVar.mo217132a(str, vCLinkEmojiTextView);
        return true;
    }

    public VCRichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158157o = true;
        this.f158165w = -1;
        this.f158167y = new ArrayList();
        this.f158168z = new ArrayList();
        this.f158151i = true;
        this.f158152j = false;
        this.f158153k = false;
        this.f158154l = false;
        this.f158155m = false;
        this.f158121B = true;
        this.f158140U = false;
        this.f158141V = C58377d.m226286a().mo102879b();
        this.f158142W = "";
        this.aa = false;
        this.ab = false;
        this.ac = true;
        this.ad = true;
        this.ae = new AbstractC62843d() {
            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCRichTextView.C628241 */

            /* renamed from: b */
            private List<UrlInfo> f158170b = new ArrayList();

            /* renamed from: c */
            private List<AtInfo> f158171c = new ArrayList();

            /* renamed from: d */
            private List<MentionInfo> f158172d = new ArrayList();

            /* renamed from: e */
            private List<PhoneInfo> f158173e = new ArrayList();

            /* renamed from: f */
            private List<ChatInfo> f158174f = new ArrayList();

            /* renamed from: g */
            private List<TextStyleInfo> f158175g = new ArrayList();

            /* renamed from: h */
            private List<AbbreviationInfo> f158176h = new ArrayList();

            /* renamed from: i */
            private List<IntentionInfo> f158177i = new ArrayList();

            /* renamed from: j */
            private List<ImageInfo> f158178j = new ArrayList();

            /* renamed from: k */
            private List<SpacingInfo> f158179k = new ArrayList();

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217099a(RichText richText) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217103a(RichTextElement.ButtonProperty buttonProperty) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217104a(RichTextElement.CodeBlockProperty codeBlockProperty) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217105a(RichTextElement.DocsProperty docsProperty) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217107a(RichTextElement.FigureProperty figureProperty) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217108a(RichTextElement.H1Property h1Property) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217109a(RichTextElement.H2Property h2Property) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217110a(RichTextElement.H3Property h3Property) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217113a(RichTextElement.LIProperty lIProperty) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217117a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) {
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217118a(RichTextElement.SelectProperty selectProperty) {
            }

            /* renamed from: a */
            private void m245930a(Map<String, String> map, String str) {
                if (!CollectionUtils.isEmpty(map) && !TextUtils.isEmpty(str)) {
                    TextStyleInfo textStyleInfo = new TextStyleInfo();
                    int i = 0;
                    textStyleInfo.isIndependent = false;
                    textStyleInfo.text = str;
                    if (VCRichTextView.this.f158147e != null) {
                        i = VCRichTextView.this.f158147e.toString().length();
                    }
                    textStyleInfo.start = i;
                    textStyleInfo.end = textStyleInfo.start + str.length();
                    textStyleInfo.textColor = UIUtils.getColor(VCRichTextView.this.getContext(), R.color.ud_B500);
                    textStyleInfo.textSize = (int) VCRichTextView.this.f158150h;
                    textStyleInfo.type = 4;
                    textStyleInfo.textStyle = m245921a(map.get("fontWeight"), map.get("fontStyle"));
                    this.f158175g.add(textStyleInfo);
                }
            }

            /* renamed from: a */
            private void m245928a(Map<String, String> map, RichTextElement.DashedProperty dashedProperty) {
                AbbreviationInfo abbreviationInfo = new AbbreviationInfo();
                int i = 0;
                abbreviationInfo.isIndependent = false;
                abbreviationInfo.id = dashedProperty.id;
                abbreviationInfo.desc = dashedProperty.i18nDesc;
                abbreviationInfo.fullName = dashedProperty.fullName;
                abbreviationInfo.name = dashedProperty.name;
                abbreviationInfo.text = dashedProperty.getContent();
                if (VCRichTextView.this.f158147e != null) {
                    i = VCRichTextView.this.f158147e.toString().length();
                }
                abbreviationInfo.start = i;
                abbreviationInfo.end = abbreviationInfo.start + dashedProperty.getContent().length();
                abbreviationInfo.textColor = UIUtils.getColor(VCRichTextView.this.getContext(), R.color.ud_B500);
                abbreviationInfo.textSize = (int) VCRichTextView.this.f158150h;
                abbreviationInfo.type = 5;
                abbreviationInfo.chatId = dashedProperty.chatId;
                abbreviationInfo.messageId = dashedProperty.messageId;
                abbreviationInfo.textStyle = m245921a(map.get("fontWeight"), map.get("fontStyle"));
                abbreviationInfo.intervalOff = dashedProperty.intervalOff;
                abbreviationInfo.intervalOn = dashedProperty.intervalOn;
                this.f158176h.add(abbreviationInfo);
            }

            /* renamed from: a */
            private void m245929a(Map<String, String> map, RichTextElement.IntentionDashedProperty intentionDashedProperty) {
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
                intentionInfo.text = intentionDashedProperty.getContent();
                intentionInfo.isAtAll = intentionDashedProperty.isAtAll;
                intentionInfo.isMeetting = intentionDashedProperty.isMetting;
                if (VCRichTextView.this.f158147e != null) {
                    i = VCRichTextView.this.f158147e.toString().length();
                }
                intentionInfo.start = i;
                intentionInfo.end = intentionInfo.start + intentionDashedProperty.getContent().length();
                intentionInfo.textColor = UIUtils.getColor(VCRichTextView.this.getContext(), R.color.ud_B500);
                intentionInfo.textSize = (int) VCRichTextView.this.f158150h;
                intentionInfo.type = 5;
                this.f158177i.add(intentionInfo);
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217098a() {
                VCRichTextView vCRichTextView = VCRichTextView.this;
                vCRichTextView.mo217051a("\n" + UIUtils.getString(VCRichTextView.this.getContext(), R.string.Lark_Legacy_UnknownRichTextTag) + "\n");
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217119a(RichTextElement.TextProperty textProperty, Map<String, String> map) {
                if (textProperty == null) {
                    Log.m165382e("Error richtext text element");
                    return;
                }
                if (textProperty instanceof RichTextElement.DashedProperty) {
                    m245928a(map, (RichTextElement.DashedProperty) textProperty);
                } else if (textProperty instanceof RichTextElement.IntentionDashedProperty) {
                    m245929a(map, (RichTextElement.IntentionDashedProperty) textProperty);
                }
                VCRichTextView.this.mo217051a(textProperty.getContent());
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217101a(RichTextElement.AtProperty atProperty) {
                if (atProperty == null) {
                    Log.m165382e("Error richtext at element");
                    return;
                }
                String b = C57814c.m224350b(atProperty.getUserId(), atProperty.getAtContent().substring(1));
                m245925a(atProperty, b);
                VCRichTextView.this.mo217051a(b);
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217111a(RichTextElement.ImageProperty imageProperty) {
                if (imageProperty == null || (CollectionUtils.isEmpty(imageProperty.getUrls()) && TextUtils.isEmpty(imageProperty.getOriginKey()))) {
                    Log.m165382e("Error richtext image element");
                } else if (VCRichTextView.this.f158151i) {
                    int i = 2;
                    if (VCRichTextView.this.f158143a == 2) {
                        i = 0;
                    } else if (VCRichTextView.this.f158143a == 1) {
                        i = 1;
                    }
                    Image a = C59031e.m229176a(imageProperty, i);
                    if (a != null) {
                        if (VCRichTextView.this.f158154l) {
                            if (!TextUtils.isEmpty(VCRichTextView.this.f158147e) && VCRichTextView.this.f158147e.charAt(VCRichTextView.this.f158147e.length() - 1) != '\n') {
                                VCRichTextView.this.mo217051a("\n");
                            }
                            m245923a(a);
                            VCRichTextView vCRichTextView = VCRichTextView.this;
                            vCRichTextView.mo217051a(UIUtils.getString(vCRichTextView.getContext(), R.string.Lark_Legacy_MessagePoPhoto));
                            VCRichTextView.this.mo217051a("\n");
                            m245922a(UIHelper.dp2px(5.0f));
                            VCRichTextView.this.mo217051a("\n");
                            return;
                        }
                        m245931b();
                        if (!VCRichTextView.this.f158153k) {
                            VCRichTextView vCRichTextView2 = VCRichTextView.this;
                            vCRichTextView2.addView(vCRichTextView2.mo217053c(a));
                        }
                        VCRichTextView.this.f158148f++;
                    }
                } else {
                    VCRichTextView vCRichTextView3 = VCRichTextView.this;
                    vCRichTextView3.mo217051a(UIUtils.getString(vCRichTextView3.getContext(), R.string.Lark_Legacy_MessagePoPhoto));
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217116a(RichTextElement.ParagraphProperty paragraphProperty) {
                if (!VCRichTextView.this.f158154l || !m245936g()) {
                    VCRichTextView.this.mo217051a("\n");
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217112a(RichTextElement.ItalicProperty italicProperty) {
                if (italicProperty == null || TextUtils.isEmpty(italicProperty.getContent())) {
                    Log.m165382e("Error richtext italic element");
                    return;
                }
                m245927a((RichTextElement.RichTextProperty) italicProperty);
                VCRichTextView.this.mo217051a(italicProperty.getContent());
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217120a(RichTextElement.UnderlineProperty underlineProperty) {
                if (underlineProperty == null || TextUtils.isEmpty(underlineProperty.getContent())) {
                    Log.m165382e("Error richtext underline element");
                    return;
                }
                m245927a((RichTextElement.RichTextProperty) underlineProperty);
                VCRichTextView.this.mo217051a(underlineProperty.getContent());
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217100a(RichTextElement.AnchorProperty anchorProperty, Map<String, String> map) {
                if (anchorProperty == null || TextUtils.isEmpty(anchorProperty.getContent())) {
                    Log.m165382e("Error richtext anchor element");
                    return;
                }
                m245924a(anchorProperty);
                m245930a(map, anchorProperty.getContent());
                if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    VCRichTextView.this.mo217051a(anchorProperty.getContent());
                    return;
                }
                VCRichTextView vCRichTextView = VCRichTextView.this;
                vCRichTextView.mo217051a("$" + anchorProperty.getDisplayTitle() + " ");
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217106a(RichTextElement.EmotionProperty emotionProperty) {
                if (emotionProperty != null && !TextUtils.isEmpty(emotionProperty.getKey())) {
                    VCRichTextView.this.mo217051a(EmojiData.getEmojiCodeFromKey(emotionProperty.getKey()));
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217114a(RichTextElement.MediaProperty mediaProperty) {
                if (mediaProperty == null || (TextUtils.isEmpty(mediaProperty.getOriginPath()) && TextUtils.isEmpty(mediaProperty.getUrl()))) {
                    VCRichTextView vCRichTextView = VCRichTextView.this;
                    vCRichTextView.mo217051a(UIUtils.getString(vCRichTextView.getContext(), R.string.Lark_Legacy_MessagePoVideo));
                    Log.m165382e("Error richtext media element");
                } else if (VCRichTextView.this.f158152j) {
                    m245931b();
                    if (!VCRichTextView.this.f158153k) {
                        VCRichTextView.this.addView(VCRichTextView.this.mo217045a(mediaProperty));
                    }
                    VCRichTextView.this.f158148f++;
                } else {
                    VCRichTextView vCRichTextView2 = VCRichTextView.this;
                    vCRichTextView2.mo217051a(UIUtils.getString(vCRichTextView2.getContext(), R.string.Lark_Legacy_MessagePoVideo));
                }
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217115a(RichTextElement.MentionProperty mentionProperty) {
                if (mentionProperty == null) {
                    Log.m165382e("Error richtext mention element");
                    return;
                }
                String content = mentionProperty.getContent();
                m245926a(mentionProperty, content);
                VCRichTextView.this.mo217051a(content);
            }

            /* renamed from: b */
            private void m245931b() {
                if (VCRichTextView.this.f158147e != null) {
                    m245932c();
                    if (!VCRichTextView.this.f158153k) {
                        m245934e();
                    } else {
                        m245935f();
                    }
                    VCRichTextView.this.f158148f++;
                    m245933d();
                }
            }

            /* renamed from: c */
            private void m245932c() {
                if (VCRichTextView.this.f158154l && m245936g()) {
                    VCRichTextView.this.f158147e.delete(VCRichTextView.this.f158147e.length() - 2, VCRichTextView.this.f158147e.length());
                    List<SpacingInfo> list = this.f158179k;
                    list.remove(list.size() - 1);
                }
            }

            /* renamed from: d */
            private void m245933d() {
                VCRichTextView.this.f158147e = null;
                this.f158171c = new ArrayList();
                this.f158172d = new ArrayList();
                this.f158170b = new ArrayList();
                this.f158175g = new ArrayList();
                this.f158176h = new ArrayList();
                this.f158178j = new ArrayList();
                this.f158179k = new ArrayList();
            }

            /* renamed from: e */
            private void m245934e() {
                if (!CollectionUtils.isEmpty(this.f158171c) || !CollectionUtils.isEmpty(this.f158170b) || !CollectionUtils.isEmpty(this.f158175g) || !CollectionUtils.isEmpty(this.f158176h) || !CollectionUtils.isEmpty(this.f158178j) || !CollectionUtils.isEmpty(this.f158179k) || !CollectionUtils.isEmpty(this.f158177i) || !CollectionUtils.isEmpty(this.f158172d)) {
                    RecogniseSpansResult recogniseSpansResult = new RecogniseSpansResult(this.f158170b, this.f158171c, this.f158173e, this.f158174f, this.f158175g, this.f158176h, this.f158178j, this.f158179k, this.f158177i, this.f158172d);
                    VCRichTextView vCRichTextView = VCRichTextView.this;
                    vCRichTextView.addView(vCRichTextView.mo217046a(vCRichTextView.f158147e.toString(), recogniseSpansResult));
                    return;
                }
                VCRichTextView vCRichTextView2 = VCRichTextView.this;
                vCRichTextView2.addView(vCRichTextView2.mo217046a(vCRichTextView2.f158147e.toString(), (RecogniseSpansResult) null));
            }

            /* renamed from: g */
            private boolean m245936g() {
                if (VCRichTextView.this.f158147e == null || VCRichTextView.this.f158147e.length() == 0 || !VCRichTextView.this.f158147e.toString().endsWith("\n\n") || !CollectionUtils.isNotEmpty(this.f158179k)) {
                    return false;
                }
                List<SpacingInfo> list = this.f158179k;
                if (list.get(list.size() - 1).end == VCRichTextView.this.f158147e.length()) {
                    return true;
                }
                return false;
            }

            /* renamed from: f */
            private void m245935f() {
                if (VCRichTextView.this.f158148f >= VCRichTextView.this.getChildCount()) {
                    Log.m165383e("RichTextView", "Failed to refresh textview, it's not same richtext");
                    return;
                }
                VCRichTextView vCRichTextView = VCRichTextView.this;
                if (!(vCRichTextView.getChildAt(vCRichTextView.f158148f) instanceof VCLinkEmojiTextView)) {
                    Log.m165383e("RichTextView", "Failed to get VCLinkEmojiTextView, it's not same richtext");
                    return;
                }
                RecogniseSpansResult recogniseSpansResult = null;
                if (!CollectionUtils.isEmpty(this.f158171c) || !CollectionUtils.isEmpty(this.f158170b)) {
                    recogniseSpansResult = new RecogniseSpansResult(this.f158170b, this.f158171c, this.f158173e, this.f158174f, this.f158175g, this.f158176h, this.f158178j, this.f158179k, this.f158177i, this.f158172d);
                }
                if (VCRichTextView.this.f158155m) {
                    VCRichTextView vCRichTextView2 = VCRichTextView.this;
                    VCLinkEmojiTextView vCLinkEmojiTextView = (VCLinkEmojiTextView) vCRichTextView2.mo217046a(vCRichTextView2.f158147e.toString(), recogniseSpansResult);
                    VCRichTextView.this.mo217050a(vCLinkEmojiTextView);
                    VCRichTextView vCRichTextView3 = VCRichTextView.this;
                    vCRichTextView3.removeViewAt(vCRichTextView3.f158148f);
                    VCRichTextView vCRichTextView4 = VCRichTextView.this;
                    vCRichTextView4.addView(vCLinkEmojiTextView, vCRichTextView4.f158148f);
                    return;
                }
                VCRichTextView vCRichTextView5 = VCRichTextView.this;
                VCLinkEmojiTextView vCLinkEmojiTextView2 = (VCLinkEmojiTextView) vCRichTextView5.getChildAt(vCRichTextView5.f158148f);
                VCRichTextView.this.mo217050a(vCLinkEmojiTextView2);
                vCLinkEmojiTextView2.mo216975a(VCRichTextView.this.f158147e.toString(), recogniseSpansResult);
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: b */
            public void mo217121b(RichText richText) {
                m245931b();
            }

            @Override // com.ss.android.vc.meeting.module.reaction.livewidget.AbstractC62843d
            /* renamed from: a */
            public void mo217102a(RichTextElement.BoldProperty boldProperty) {
                if (boldProperty == null || TextUtils.isEmpty(boldProperty.getContent())) {
                    Log.m165382e("Error richtext bold element");
                    return;
                }
                m245927a((RichTextElement.RichTextProperty) boldProperty);
                VCRichTextView.this.mo217051a(boldProperty.getContent());
            }

            /* renamed from: a */
            private void m245922a(int i) {
                int i2;
                SpacingInfo spacingInfo = new SpacingInfo();
                spacingInfo.type = 7;
                spacingInfo.text = "\n";
                if (VCRichTextView.this.f158147e == null) {
                    i2 = 0;
                } else {
                    i2 = VCRichTextView.this.f158147e.toString().length();
                }
                spacingInfo.start = i2;
                spacingInfo.end = spacingInfo.start + spacingInfo.text.length();
                spacingInfo.spacingHeight = i;
                this.f158179k.add(spacingInfo);
            }

            /* renamed from: a */
            private void m245923a(Image image) {
                int i;
                int[] d = VCRichTextView.this.mo217054d(image);
                String a = VCRichTextView.this.mo217047a(image);
                String b = VCRichTextView.this.mo217052b(image);
                ImageInfo imageInfo = new ImageInfo();
                imageInfo.type = 6;
                imageInfo.text = UIUtils.getString(VCRichTextView.this.getContext(), R.string.Lark_Legacy_MessagePoPhoto);
                if (VCRichTextView.this.f158147e == null) {
                    i = 0;
                } else {
                    i = VCRichTextView.this.f158147e.toString().length();
                }
                imageInfo.start = i;
                imageInfo.end = imageInfo.start + imageInfo.text.length();
                imageInfo.key = a;
                imageInfo.url = b;
                imageInfo.width = d[0];
                imageInfo.height = d[1];
                this.f158178j.add(imageInfo);
            }

            /* renamed from: a */
            private void m245924a(RichTextElement.AnchorProperty anchorProperty) {
                UrlInfo urlInfo;
                int i = 0;
                if (!TextUtils.isEmpty(anchorProperty.getIconKey()) && !TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    urlInfo = new KeyIconUrlInfo();
                    KeyIconUrlInfo keyIconUrlInfo = (KeyIconUrlInfo) urlInfo;
                    keyIconUrlInfo.iconKey = anchorProperty.getIconKey();
                    keyIconUrlInfo.placeHolderRes = anchorProperty.getLocalIconRes();
                    keyIconUrlInfo.greyPlaceHolderRes = anchorProperty.getLocalGrayIconRes();
                    urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
                    if (VCRichTextView.this.f158147e != null) {
                        i = VCRichTextView.this.f158147e.toString().length();
                    }
                    urlInfo.start = i;
                    urlInfo.end = urlInfo.start + urlInfo.text.length();
                } else if (anchorProperty.getLocalIconRes() <= 0 || TextUtils.isEmpty(anchorProperty.getDisplayTitle())) {
                    urlInfo = new UrlInfo();
                    urlInfo.text = anchorProperty.getContent();
                    if (VCRichTextView.this.f158147e != null) {
                        i = VCRichTextView.this.f158147e.toString().length();
                    }
                    urlInfo.start = i;
                    urlInfo.end = urlInfo.start + anchorProperty.getContent().length();
                } else {
                    urlInfo = new RichUrlInfo();
                    RichUrlInfo richUrlInfo = (RichUrlInfo) urlInfo;
                    richUrlInfo.mLocalImageResId = anchorProperty.getLocalIconRes();
                    richUrlInfo.mDisplayTitle = anchorProperty.getDisplayTitle();
                    urlInfo.text = "$" + anchorProperty.getDisplayTitle() + " ";
                    if (VCRichTextView.this.f158147e != null) {
                        i = VCRichTextView.this.f158147e.toString().length();
                    }
                    urlInfo.start = i;
                    urlInfo.end = urlInfo.start + urlInfo.text.length();
                }
                urlInfo.type = 1;
                urlInfo.href = anchorProperty.getHref();
                urlInfo.isUnderlineText = VCRichTextView.this.f158156n;
                this.f158170b.add(urlInfo);
            }

            /* renamed from: a */
            private void m245927a(RichTextElement.RichTextProperty richTextProperty) {
                int i;
                TextStyleInfo textStyleInfo = new TextStyleInfo();
                textStyleInfo.isIndependent = true;
                int i2 = 0;
                if (VCRichTextView.this.f158147e == null) {
                    i = 0;
                } else {
                    i = VCRichTextView.this.f158147e.toString().length();
                }
                textStyleInfo.start = i;
                textStyleInfo.textSize = (int) VCRichTextView.this.f158150h;
                textStyleInfo.textColor = VCRichTextView.this.f158149g;
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
                this.f158175g.add(textStyleInfo);
            }

            /* renamed from: a */
            private Typeface m245921a(String str, String str2) {
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
            private void m245925a(RichTextElement.AtProperty atProperty, String str) {
                AtInfo atInfo = new AtInfo();
                int i = 0;
                atInfo.type = 0;
                atInfo.userId = atProperty.getUserId();
                atInfo.text = atProperty.getAtContent();
                if (VCRichTextView.this.f158147e != null) {
                    i = VCRichTextView.this.f158147e.toString().length();
                }
                atInfo.start = i;
                atInfo.end = atInfo.start + str.length();
                atInfo.isOutChatUser = atProperty.isOutChatUser();
                atInfo.isAnonymous = atProperty.isAnonymous();
                this.f158171c.add(atInfo);
            }

            /* renamed from: a */
            private void m245926a(RichTextElement.MentionProperty mentionProperty, String str) {
                int i;
                MentionInfo mentionInfo = new MentionInfo();
                mentionInfo.type = 8;
                mentionInfo.id = mentionProperty.getMentionItem().getId();
                mentionInfo.text = mentionProperty.getContent();
                if (VCRichTextView.this.f158147e == null) {
                    i = 0;
                } else {
                    i = VCRichTextView.this.f158147e.toString().length();
                }
                mentionInfo.start = i;
                mentionInfo.end = mentionInfo.start + str.length();
                mentionInfo.isAuthorized = mentionProperty.isAuthorized();
                mentionInfo.url = mentionProperty.getRedirectUrl();
                this.f158172d.add(mentionInfo);
            }
        };
        this.f158156n = false;
        m245906a(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245907a(VCLinkEmojiTextView vCLinkEmojiTextView, View view, String str, String str2) {
        Image a;
        if (this.f158144b != null && (a = m245905a(str, str2)) != null) {
            this.f158144b.mo217128a(a, vCLinkEmojiTextView);
        }
    }

    /* renamed from: a */
    private Image m245904a(RichTextElement richTextElement, String str, String str2, int i) {
        boolean z;
        if (!(richTextElement.getProperty() instanceof RichTextElement.ImageProperty)) {
            return null;
        }
        Image a = C59031e.m229176a((RichTextElement.ImageProperty) richTextElement.getProperty(), i);
        String a2 = mo217047a(a);
        String b = mo217052b(a);
        if (!C57782ag.m224242a(a2, str) || !C57782ag.m224242a(b, str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return a;
        }
        return null;
    }
}

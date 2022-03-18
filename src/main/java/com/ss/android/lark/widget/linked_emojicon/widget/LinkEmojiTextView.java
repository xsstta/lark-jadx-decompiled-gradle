package com.ss.android.lark.widget.linked_emojicon.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.avatar.IconKeyDrawable;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.Reflect;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.C58512f;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.linked_emojicon.TextViewFixTouchConsume;
import com.ss.android.lark.widget.linked_emojicon.base.C58504c;
import com.ss.android.lark.widget.linked_emojicon.p2942b.C58500b;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59159i;
import com.ss.android.lark.widget.span.C59160j;
import com.ss.android.lark.widget.span.C59166k;
import com.ss.android.lark.widget.span.C59176n;
import com.ss.android.lark.widget.span.EmojiconInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpacingInfo;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class LinkEmojiTextView extends TextViewFixTouchConsume {

    /* renamed from: k */
    public static final Pattern f144412k = Pattern.compile("<figure>[\\s]*?<img[\\s]*?src=\\\"(.*?)\"[\\s]*?origin-width=\\\"(\\d+)\"[\\s]*?origin-height=\\\"(\\d+)\"[\\s]*?/>[\\s]*?</figure>");

    /* renamed from: A */
    public AbstractC58523h f144413A;

    /* renamed from: B */
    public AbstractC58522g f144414B;

    /* renamed from: C */
    public boolean f144415C;

    /* renamed from: D */
    TextViewFixTouchConsume.C58493a f144416D;

    /* renamed from: E */
    private boolean f144417E;

    /* renamed from: F */
    private boolean f144418F;

    /* renamed from: G */
    private C58535b f144419G;

    /* renamed from: H */
    private int f144420H;

    /* renamed from: I */
    private int f144421I;

    /* renamed from: J */
    private int f144422J;

    /* renamed from: K */
    private int f144423K;

    /* renamed from: L */
    private int f144424L;

    /* renamed from: M */
    private int f144425M;

    /* renamed from: N */
    private int f144426N;

    /* renamed from: O */
    private int f144427O;

    /* renamed from: P */
    private int f144428P;

    /* renamed from: Q */
    private String f144429Q;

    /* renamed from: R */
    private String f144430R;

    /* renamed from: S */
    private Context f144431S;

    /* renamed from: T */
    private boolean f144432T;

    /* renamed from: U */
    private AbstractC58529n f144433U;

    /* renamed from: V */
    private String f144434V;

    /* renamed from: W */
    private AbstractC58530o f144435W;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private int ag;
    private float ah;

    /* renamed from: ai  reason: collision with root package name */
    private float f175455ai;
    private boolean aj;
    private C59160j.AbstractC59162a ak;
    private boolean al;
    private C59159i am;
    private boolean an;

    /* renamed from: l */
    protected int f144436l;

    /* renamed from: m */
    protected boolean f144437m;

    /* renamed from: n */
    protected boolean f144438n;

    /* renamed from: o */
    protected boolean f144439o;

    /* renamed from: p */
    int f144440p;

    /* renamed from: q */
    public int f144441q;

    /* renamed from: r */
    public int f144442r;

    /* renamed from: s */
    public int f144443s;

    /* renamed from: t */
    public int f144444t;

    /* renamed from: u */
    public AbstractC58524i f144445u;

    /* renamed from: v */
    public AbstractC58525j f144446v;

    /* renamed from: w */
    public AbstractC58521f f144447w;

    /* renamed from: x */
    public IMentionSpanClickListener f144448x;

    /* renamed from: y */
    public IMomentsHashTagSpanClickListener f144449y;

    /* renamed from: z */
    public AbstractC58520e f144450z;

    public static class UrlImageInfo extends SpanInfo {
        public String imageUrl;
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$e */
    public interface AbstractC58520e {
        /* renamed from: a */
        void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$f */
    public interface AbstractC58521f {
        /* renamed from: b */
        boolean mo117507b(View view, String str, String str2);

        /* renamed from: c */
        void mo120297c(View view, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$g */
    public interface AbstractC58522g {
        /* renamed from: a */
        void mo198421a(View view, String str, String str2);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$h */
    public interface AbstractC58523h {
        /* renamed from: a */
        void mo122884a(View view, IntentionInfo intentionInfo);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$i */
    public interface AbstractC58524i {
        /* renamed from: a */
        void mo122808a(View view, String str);

        /* renamed from: b */
        void mo122809b(View view, String str);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$j */
    public interface AbstractC58525j {
        /* renamed from: a */
        void mo122806a(View view, String str);

        /* renamed from: b */
        boolean mo122807b(View view, String str);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$n */
    public interface AbstractC58529n {
        /* renamed from: a */
        void mo198427a(boolean z);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$o */
    public interface AbstractC58530o {
        /* renamed from: a */
        void mo117505a(SpannableStringBuilder spannableStringBuilder);
    }

    public String getCurrentUserId() {
        return this.f144429Q;
    }

    public C58535b getHelper() {
        return this.f144419G;
    }

    public AbstractC58529n getOnEllipsizeListener() {
        return this.f144433U;
    }

    /* renamed from: a */
    public void mo198363a(RecogniseSpansResult recogniseSpansResult, String str, boolean z) {
        m227026b();
        if (recogniseSpansResult == null || !this.f144417E) {
            m227020a(str, z);
            return;
        }
        this.f144438n = true;
        this.f144437m = false;
        this.f144432T = z;
        m227014a(m227010a(recogniseSpansResult));
        super.setText(m227012a(recogniseSpansResult.getAllSpanInfos(), (CharSequence) null, str));
        if (this.al) {
            setMovementMethod(this.f144416D);
        } else {
            setMovementMethod(null);
        }
    }

    /* renamed from: a */
    private void m227020a(CharSequence charSequence, boolean z) {
        m227026b();
        this.f144438n = true;
        this.f144437m = false;
        this.f144432T = z;
        if (this.f144417E) {
            RecogniseSpansResult a = C59176n.m229853a().mo201126a((String) charSequence, this.f144418F);
            CharSequence b = m227024b(charSequence);
            List<SpanInfo> arrayList = a == null ? new ArrayList<>() : a.getAllSpanInfos();
            m227014a(m227010a(a));
            super.setText(m227012a(arrayList, b, charSequence.toString()));
            setMovementMethod(TextViewFixTouchConsume.C58493a.m226905a());
            return;
        }
        super.setText(charSequence);
    }

    /* renamed from: a */
    public void mo198365a(String str, RecogniseSpansResult recogniseSpansResult) {
        mo198366a(str, recogniseSpansResult, false);
    }

    /* renamed from: a */
    public void mo198366a(String str, RecogniseSpansResult recogniseSpansResult, boolean z) {
        mo198367a(str, recogniseSpansResult, z, true, null);
    }

    /* renamed from: a */
    public void mo198367a(final String str, final RecogniseSpansResult recogniseSpansResult, final boolean z, boolean z2, String str2) {
        m227026b();
        this.f144438n = true;
        this.f144437m = false;
        this.al = z2;
        this.f144432T = z;
        if (!this.f144417E) {
            super.setText(str);
        } else if (recogniseSpansResult != null) {
            m227014a(m227010a(recogniseSpansResult));
            super.setText(m227012a(recogniseSpansResult.getAllSpanInfos(), (CharSequence) null, str));
            if (z2) {
                setMovementMethod(TextViewFixTouchConsume.C58493a.m226905a());
            } else {
                setMovementMethod(null);
            }
            if (this.f144418F) {
                C58536c.m227060a().mo198444a(str, recogniseSpansResult.getAllSpanInfos(), new IGetDataCallback<List<PhoneInfo>>() {
                    /* class com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.C585151 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(List<PhoneInfo> list) {
                        if (CollectionUtils.isNotEmpty(list)) {
                            recogniseSpansResult.addPhoneSpanInfos(list);
                            LinkEmojiTextView.this.mo198363a(recogniseSpansResult, str, z);
                        }
                    }
                });
            }
        } else {
            super.setText(str);
            C58536c.m227060a().mo198443a(new C58532q(this, str, z), str, this.f144418F, str2);
        }
    }

    /* renamed from: a */
    private void m227021a(String str, C58513g gVar, SpanInfo spanInfo, SpanInfo spanInfo2) {
        String str2 = spanInfo.text;
        if (spanInfo.type == 1) {
            if (spanInfo instanceof KeyIconUrlInfo) {
                m227016a(gVar, (KeyIconUrlInfo) spanInfo);
            } else if (spanInfo instanceof RichUrlInfo) {
                m227017a(gVar, (RichUrlInfo) spanInfo);
            } else {
                gVar.append(str2, m227013a(spanInfo), this.f144440p);
                m227031e(gVar, spanInfo, str2);
            }
        } else if (spanInfo.type == 0) {
            if (spanInfo instanceof AtInfo) {
                AtInfo atInfo = (AtInfo) spanInfo;
                String str3 = atInfo.userId;
                gVar.mo198348a((CharSequence) str2, mo198360a(this.f144431S, str2, atInfo), this.f144440p);
                m227031e(gVar, spanInfo, str2);
                if (this.ag == -1 && getHelper().mo198441c(str3)) {
                    this.ag = gVar.toString().length();
                }
            } else {
                Log.m165383e("LinkEmojiTextView", "Span info error:" + spanInfo);
                gVar.append(str2);
            }
        } else if (spanInfo.type == 3) {
            gVar.append(str2, new C58517b(), this.f144440p);
        } else if (spanInfo.type == 2) {
            gVar.append(str2, new C58531p(str2, this.an), this.f144440p);
        } else if (spanInfo.type == 4) {
            m227031e(gVar, spanInfo, str2);
        } else if (spanInfo.type == 5) {
            m227018a(gVar, spanInfo, str2);
        } else if (spanInfo.type == 6) {
            m227027b(gVar, spanInfo, str2);
        } else if (spanInfo.type == 7) {
            m227029c(gVar, spanInfo, str2);
        } else if (spanInfo.type == 8) {
            if (spanInfo instanceof MentionInfo) {
                MentionInfo mentionInfo = (MentionInfo) spanInfo;
                gVar.append(str2, new C58528m(mentionInfo.id, str2, mentionInfo.isAuthorized, mentionInfo.url), this.f144440p);
            } else {
                Log.m165383e("LinkEmojiTextView", "mention Span info error:" + spanInfo);
                gVar.append(str2);
            }
        } else if (spanInfo.type == 11) {
            if (spanInfo instanceof MentionInfo) {
                gVar.append(str2, new C58519d(((MentionInfo) spanInfo).id, str2), this.f144440p);
            } else {
                Log.m165383e("LinkEmojiTextView", "moments hashtag Span info error:" + spanInfo);
                gVar.append(str2);
            }
        } else if (spanInfo.type == 10) {
            m227030d(gVar, spanInfo, str2);
        }
        m227028b(str, gVar, spanInfo, spanInfo2);
    }

    /* renamed from: a */
    private void m227022a(List<SpanInfo> list, String str, C58513g gVar) {
        gVar.append(str.substring(0, Math.min(list.get(0).start, str.length())));
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x013c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m227019a(com.ss.android.lark.widget.linked_emojicon.C58513g r9, java.lang.String r10, com.ss.android.lark.widget.span.SpanInfo r11) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.m227019a(com.ss.android.lark.widget.linked_emojicon.g, java.lang.String, com.ss.android.lark.widget.span.SpanInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Object> mo198360a(Context context, String str, AtInfo atInfo) {
        int i;
        int i2;
        int i3;
        String str2 = atInfo.userId;
        boolean z = atInfo.isAnonymous;
        ArrayMap arrayMap = new ArrayMap();
        int i4 = R.color.text_title;
        if (z) {
            if (this.f144424L != 0) {
                i4 = this.f144423K;
            }
            arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(context.getResources().getColor(i4)));
            return arrayMap;
        }
        boolean z2 = atInfo.isOutChatUser;
        int i5 = R.color.text_caption;
        if (!z2 || this.f144423K == 0) {
            i = z2 ? context.getResources().getColor(R.color.text_caption) : 0;
        } else {
            i = context.getResources().getColor(this.f144423K);
        }
        C58516a aVar = new C58516a(str, str2, i);
        arrayMap.put("AtClick", aVar);
        if (z2) {
            int i6 = this.f144423K;
            if (i6 != 0) {
                i5 = i6;
            }
            arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(context.getResources().getColor(i5)));
        } else if (TextUtils.isEmpty(this.f144429Q) || !this.f144429Q.equals(str2)) {
            boolean c = getHelper().mo198441c(str2);
            int i7 = R.color.imtoken_message_text_bubbles_blue;
            if (c) {
                int i8 = this.f144443s;
                if (i8 != 0) {
                    i7 = i8;
                }
                boolean a = getHelper().mo198438a(str2);
                arrayMap.put("ReadStatusSpan", new C58512f(UIUtils.getColor(context, a ? this.ac : this.ad), UIUtils.getColor(context, i7), a ? Paint.Style.FILL : Paint.Style.STROKE));
                arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(context.getResources().getColor(i7)));
            } else {
                String str3 = this.f144430R;
                if (str3 == null || !str3.equals(str2)) {
                    int i9 = this.f144420H;
                    if (i9 == 0) {
                        i9 = context.getResources().getColor(R.color.imtoken_message_text_bubbles_blue);
                    }
                    arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(i9));
                    aVar.f144455a = i9;
                } else {
                    int i10 = this.f144426N;
                    if (i10 != 0) {
                        i4 = i10;
                    }
                    int i11 = this.f144427O;
                    if (i11 == 0) {
                        i2 = UIUtils.getColor(context, R.color.lkui_transparent);
                    } else {
                        i2 = UIUtils.getColor(context, i11);
                    }
                    arrayMap.put("RoundedTagSpan", C58500b.m226945a(context, Math.round(getTextSize()), atInfo.textStyle, Math.round(getTextSize()), UIUtils.getColor(context, i4), i2));
                }
            }
        } else {
            int i12 = this.f144422J;
            if (i12 == 0) {
                i12 = R.color.static_white;
            }
            int i13 = this.f144421I;
            if (i13 == 0) {
                i3 = UIUtils.getColor(context, R.color.primary_pri_500);
            } else {
                i3 = UIUtils.getColor(context, i13);
            }
            arrayMap.put("RoundedTagSpan", C58500b.m226945a(context, Math.round(getTextSize()), atInfo.textStyle, Math.round(getTextSize()), UIUtils.getColor(context, i12), i3));
        }
        return arrayMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo198362a(int i, int i2) {
        CharSequence charSequence;
        boolean z = this.aa == i && this.ab == i2;
        if (!this.f144439o) {
            return;
        }
        if (!this.f144437m || !z) {
            this.aa = i;
            this.ab = i2;
            int lineCount = getLineCount();
            Layout layout = getLayout();
            int maxLines = getMaxLines();
            if (maxLines != 0 && lineCount >= maxLines && !TextUtils.isEmpty(getText())) {
                int i3 = maxLines - 1;
                int lineEnd = layout.getLineEnd(i3);
                int lineStart = layout.getLineStart(i3);
                if (lineEnd < getText().length()) {
                    if (!this.af || !TextUtils.equals(this.f144434V, UIUtils.getString(getContext(), R.string.Lark_Legacy_EllipseShortText))) {
                        CharSequence subSequence = getText().subSequence(0, lineStart);
                        String str = this.f144434V;
                        float measureText = getPaint().measureText(str);
                        int windowWidth = UIHelper.getWindowWidth(getContext());
                        int i4 = lineEnd - 1;
                        if ("\n".equals(String.valueOf(getText().charAt(i4)))) {
                            charSequence = getText().subSequence(lineStart, i4);
                        } else {
                            charSequence = getText().subSequence(lineStart, lineEnd);
                        }
                        CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), Math.max(((float) windowWidth) * 0.6f, (float) getMeasuredWidth()) - measureText, TextUtils.TruncateAt.END);
                        if (ellipsize.length() > 2 && ellipsize != charSequence) {
                            charSequence = ellipsize.subSequence(0, ellipsize.length() - 1);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        AbstractC58530o oVar = this.f144435W;
                        if (oVar != null) {
                            oVar.mo117505a(spannableStringBuilder);
                        } else {
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) str);
                            if (!this.af) {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f144436l), length + 1, length + str.length(), 18);
                            }
                        }
                        setText(spannableStringBuilder);
                    } else {
                        setText(new SpannableStringBuilder(getText().subSequence(0, lineEnd - 1)).append((CharSequence) this.f144434V));
                    }
                    this.f144437m = true;
                    mo198361a();
                    measure(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo198361a() {
        AbstractC58529n nVar = this.f144433U;
        if (nVar != null && this.f144438n) {
            nVar.mo198427a(true);
            this.f144438n = false;
        }
    }

    /* renamed from: b */
    private void m227026b() {
        this.ag = -1;
        this.f175455ai = -1.0f;
        this.ah = -1.0f;
    }

    public float[] getFirstSpanDotLocation() {
        return new float[]{this.ah, this.f175455ai};
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$c */
    public class C58518c extends ClickableSpan {

        /* renamed from: b */
        private AbbreviationInfo f144461b;

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
        }

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144450z != null && view.getTag(R.id.tag_long_press) == null) {
                LinkEmojiTextView.this.f144450z.mo136825a(view, this.f144461b, (float) LinkEmojiTextView.this.f144416D.mo198222b(), (float) LinkEmojiTextView.this.f144416D.mo198223c());
            }
        }

        public C58518c(AbbreviationInfo abbreviationInfo) {
            this.f144461b = abbreviationInfo;
        }
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$l */
    public class C58527l extends ClickableSpan {

        /* renamed from: b */
        private IntentionInfo f144468b;

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
        }

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144413A != null && view.getTag(R.id.tag_long_press) == null) {
                LinkEmojiTextView.this.f144413A.mo122884a(view, this.f144468b);
            }
        }

        public C58527l(IntentionInfo intentionInfo) {
            this.f144468b = intentionInfo;
        }
    }

    public void setAbbreviationClickListener(AbstractC58520e eVar) {
        this.f144450z = eVar;
    }

    public void setAtAnonymousUserTextColor(int i) {
        this.f144424L = i;
    }

    public void setAtOtherChatUserBgColor(int i) {
        this.f144425M = i;
    }

    public void setAtOtherChatUserTextColor(int i) {
        this.f144423K = i;
    }

    public void setAtSelfBgColor(int i) {
        this.f144421I = i;
    }

    public void setAtSelfTextColor(int i) {
        this.f144422J = i;
    }

    public void setAtStringClickListner(AbstractC58521f fVar) {
        this.f144447w = fVar;
    }

    public void setAtTextColor(int i) {
        this.f144443s = i;
    }

    public void setChatTextColor(int i) {
        this.f144444t = i;
    }

    public void setCurrentUserId(String str) {
        this.f144429Q = str;
    }

    public void setDefaultAtUserColor(int i) {
        this.f144420H = i;
    }

    public void setDotReadColor(int i) {
        this.ac = i;
    }

    public void setDotUnreadColor(int i) {
        this.ad = i;
    }

    public void setHashTagSpanClickListener(IMomentsHashTagSpanClickListener gVar) {
        this.f144449y = gVar;
    }

    public void setImageClickListener(AbstractC58522g gVar) {
        this.f144414B = gVar;
    }

    public void setImageFetcher(C59160j.AbstractC59162a aVar) {
        this.ak = aVar;
    }

    public void setIntentionClickListener(AbstractC58523h hVar) {
        this.f144413A = hVar;
    }

    public void setIsUrlShowUnderLine(boolean z) {
        this.an = z;
    }

    public void setLinkClickable(boolean z) {
        this.al = z;
    }

    public void setMentionSpanClickListener(IMentionSpanClickListener fVar) {
        this.f144448x = fVar;
    }

    public void setNeedToRecognize(boolean z) {
        this.f144417E = z;
    }

    public void setNeedToRecognizePhone(boolean z) {
        this.f144418F = z;
    }

    public void setOnEllipsizeListener(AbstractC58529n nVar) {
        this.f144433U = nVar;
    }

    public void setOnSetTailSpanListener(AbstractC58530o oVar) {
        this.f144435W = oVar;
    }

    public void setPhoneStringClickListener(AbstractC58524i iVar) {
        this.f144445u = iVar;
    }

    public void setPhoneTextColor(int i) {
        this.f144442r = i;
    }

    public void setShowTail(boolean z) {
        this.f144439o = z;
    }

    public void setShowUrlUnderLine(boolean z) {
        this.ae = z;
    }

    public void setTailColor(int i) {
        this.f144436l = i;
    }

    public void setTailContent(String str) {
        this.f144434V = str;
    }

    public void setUnClickGroupBgColor(int i) {
        this.f144427O = i;
    }

    public void setUnClickGroupTextColor(int i) {
        this.f144426N = i;
    }

    public void setUnclickGroupId(String str) {
        this.f144430R = str;
    }

    public void setUrlBackGroundColor(int i) {
        this.f144428P = i;
    }

    public void setUrlBoldText(boolean z) {
        this.f144415C = z;
    }

    public void setUrlStringClickListner(AbstractC58525j jVar) {
        this.f144446v = jVar;
    }

    public void setUrlTextColor(int i) {
        this.f144441q = i;
    }

    public void setUseNewAtStyle(boolean z) {
        this.aj = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$b */
    public class C58517b extends ClickableSpan {
        public void onClick(View view) {
        }

        public C58517b() {
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (LinkEmojiTextView.this.f144444t == 0) {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.primary_pri_500));
            } else {
                textPaint.setColor(LinkEmojiTextView.this.f144444t);
            }
            textPaint.setUnderlineText(false);
        }
    }

    public LinkEmojiTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo198364a(String str) {
        mo198365a(str, (RecogniseSpansResult) null);
    }

    /* renamed from: a */
    private C58533r m227013a(SpanInfo spanInfo) {
        return new C58533r(((UrlInfo) spanInfo).href, this.an);
    }

    public void setTextIsSelectable(boolean z) {
        super.setTextIsSelectable(z);
        this.f144416D.mo198221a(!z);
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$d */
    public class C58519d extends ClickableSpan {

        /* renamed from: b */
        private final String f144463b;

        /* renamed from: c */
        private final String f144464c;

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144449y != null) {
                LinkEmojiTextView.this.f144449y.a_(view, this.f144463b, this.f144464c);
            }
            if (view instanceof TextView) {
                ((TextView) view).setHighlightColor(0);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }

        public C58519d(String str, String str2) {
            this.f144463b = str;
            this.f144464c = str2;
        }
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$m */
    public class C58528m extends ClickableSpan {

        /* renamed from: b */
        private String f144470b;

        /* renamed from: c */
        private String f144471c;

        /* renamed from: d */
        private boolean f144472d;

        /* renamed from: e */
        private String f144473e;

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144448x != null) {
                LinkEmojiTextView.this.f144448x.mo122872a(view, this.f144470b, this.f144471c, this.f144472d, this.f144473e);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (this.f144472d) {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.primary_pri_500));
            } else {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.ud_N650));
            }
            textPaint.setUnderlineText(false);
        }

        public C58528m(String str, String str2, boolean z, String str3) {
            this.f144470b = str;
            this.f144471c = str2;
            this.f144472d = z;
            this.f144473e = str3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$q */
    public static class C58532q implements IGetDataCallback<RecogniseSpansResult> {

        /* renamed from: a */
        private WeakReference<LinkEmojiTextView> f144477a;

        /* renamed from: b */
        private String f144478b;

        /* renamed from: c */
        private boolean f144479c;

        /* renamed from: a */
        public void onSuccess(RecogniseSpansResult recogniseSpansResult) {
            LinkEmojiTextView linkEmojiTextView = this.f144477a.get();
            List<SpanInfo> allSpanInfos = recogniseSpansResult.getAllSpanInfos();
            if (linkEmojiTextView != null && CollectionUtils.isNotEmpty(allSpanInfos)) {
                linkEmojiTextView.mo198363a(recogniseSpansResult, this.f144478b, this.f144479c);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Log.m165382e("LinkEmojiTextview preload failed: " + errorResult.toString());
        }

        public C58532q(LinkEmojiTextView linkEmojiTextView, String str, boolean z) {
            this.f144477a = new WeakReference<>(linkEmojiTextView);
            this.f144478b = str;
            this.f144479c = z;
        }
    }

    /* renamed from: a */
    private int m227010a(RecogniseSpansResult recogniseSpansResult) {
        if (recogniseSpansResult == null) {
            return 0;
        }
        List<ImageInfo> imageSpanInfos = recogniseSpansResult.getImageSpanInfos();
        if (CollectionUtils.isEmpty(imageSpanInfos)) {
            return 0;
        }
        return imageSpanInfos.size();
    }

    public void setShowShortTailText(boolean z) {
        this.af = z;
        if (z) {
            this.f144434V = UIUtils.getString(getContext(), R.string.Lark_Legacy_EllipseShortText);
        } else {
            this.f144434V = UIUtils.getString(getContext(), R.string.Lark_Legacy_EllipseViewFullTextTip);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$a */
    public class C58516a extends ClickableSpan {

        /* renamed from: a */
        public int f144455a;

        /* renamed from: c */
        private String f144457c;

        /* renamed from: d */
        private String f144458d;

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144447w == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (LinkEmojiTextView.this.f144447w.mo117507b(view, this.f144457c, this.f144458d)) {
                    LinkEmojiTextView.this.performHapticFeedback(0);
                    return;
                }
                return;
            }
            LinkEmojiTextView.this.f144447w.mo120297c(view, this.f144457c, this.f144458d);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            int i = this.f144455a;
            if (i != 0) {
                textPaint.setColor(i);
            } else if (LinkEmojiTextView.this.f144443s != 0) {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(LinkEmojiTextView.this.f144443s));
            } else {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.imtoken_message_text_bubbles_blue));
            }
            textPaint.setUnderlineText(false);
        }

        public C58516a(String str, String str2, int i) {
            this.f144457c = str;
            this.f144458d = str2;
            this.f144455a = i;
        }
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$k */
    public class C58526k extends ClickableSpan {

        /* renamed from: b */
        private ImageInfo f144466b;

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144414B == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
            } else {
                LinkEmojiTextView.this.f144414B.mo198421a(view, this.f144466b.key, this.f144466b.url);
            }
        }

        public C58526k(ImageInfo imageInfo) {
            this.f144466b = imageInfo;
        }
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$p */
    public class C58531p extends ClickableSpan {

        /* renamed from: b */
        private String f144475b;

        /* renamed from: c */
        private boolean f144476c;

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144445u == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                LinkEmojiTextView.this.f144445u.mo122809b(view, this.f144475b);
                return;
            }
            LinkEmojiTextView.this.f144445u.mo122808a(view, this.f144475b);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (LinkEmojiTextView.this.f144442r == 0) {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.text_link_normal));
            } else {
                textPaint.setColor(LinkEmojiTextView.this.f144442r);
            }
            textPaint.setUnderlineText(this.f144476c);
        }

        public C58531p(String str, boolean z) {
            this.f144475b = str;
            this.f144476c = z;
        }
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView$r */
    public class C58533r extends ClickableSpan {

        /* renamed from: b */
        private String f144481b;

        /* renamed from: c */
        private boolean f144482c;

        public void onClick(View view) {
            if (LinkEmojiTextView.this.f144446v == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (LinkEmojiTextView.this.f144446v.mo122807b(view, this.f144481b)) {
                    LinkEmojiTextView.this.performHapticFeedback(0);
                    return;
                }
                return;
            }
            LinkEmojiTextView.this.f144446v.mo122806a(view, this.f144481b);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (LinkEmojiTextView.this.f144441q == 0) {
                textPaint.setColor(LinkEmojiTextView.this.getResources().getColor(R.color.text_link_normal));
            } else {
                textPaint.setColor(LinkEmojiTextView.this.f144441q);
            }
            textPaint.setUnderlineText(this.f144482c);
            textPaint.setFakeBoldText(LinkEmojiTextView.this.f144415C);
        }

        public C58533r(String str, boolean z) {
            this.f144481b = str;
            this.f144482c = z;
        }
    }

    /* renamed from: a */
    private C58513g m227011a(CharSequence charSequence) {
        if (charSequence != null) {
            return new C58513g(getContext(), charSequence);
        }
        return new C58513g(getContext());
    }

    /* renamed from: b */
    private CharSequence m227024b(CharSequence charSequence) {
        C58513g gVar = new C58513g(getContext(), charSequence);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) gVar.getSpans(0, charSequence.length(), ClickableSpan.class);
        if (clickableSpanArr.length <= 0) {
            return null;
        }
        int spanStart = gVar.getSpanStart(clickableSpanArr[0]);
        int i = 0;
        for (ClickableSpan clickableSpan : clickableSpanArr) {
            i = gVar.getSpanEnd(clickableSpan);
        }
        return charSequence.subSequence(spanStart, i);
    }

    /* renamed from: b */
    private String m227025b(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray[0] != '\n') {
            return str;
        }
        return UIUtils.getString(getContext(), R.string.Lark_Legacy_PlaceHolderChar) + str;
    }

    /* renamed from: a */
    private void m227014a(int i) {
        C59159i iVar = this.am;
        if (iVar != null) {
            iVar.mo201098c();
            this.am = null;
        }
        this.am = new C59159i(this);
    }

    /* renamed from: a */
    private void m227015a(DynamicLayout dynamicLayout) {
        try {
            Reflect.m94918a(dynamicLayout).mo93334a("sStaticLayout", (Object) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo198362a(i, i2);
    }

    public LinkEmojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // com.ss.android.lark.widget.linked_emojicon.base.EmojiconTextView, com.ss.android.lark.widget.EllipsizedEmojiconTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int maxLines = getMaxLines();
        if (this.f144439o && maxLines >= 1) {
            CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), (float) (UIHelper.getWindowWidth(getContext()) * maxLines), TextUtils.TruncateAt.END);
            if (ellipsize != charSequence) {
                mo198361a();
            }
            charSequence = ellipsize;
        }
        super.setText(charSequence, bufferType);
    }

    /* renamed from: a */
    private void m227016a(C58513g gVar, KeyIconUrlInfo keyIconUrlInfo) {
        Drawable drawable;
        int length = gVar.length();
        int i = this.f144441q;
        if (i == 0) {
            i = getResources().getColor(R.color.text_link_normal);
        }
        if (keyIconUrlInfo.placeHolderRes != 0) {
            drawable = ContextCompat.getDrawable(this.f144431S, keyIconUrlInfo.placeHolderRes);
        } else {
            drawable = null;
        }
        IconKeyDrawable oVar = new IconKeyDrawable(this.f144431S);
        oVar.mo89035a(keyIconUrlInfo.iconKey, null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, !keyIconUrlInfo.isUrlPreview, Integer.valueOf(i));
        C58508e a = new C58508e.C58510a(getContext(), new C58508e.C58511b(keyIconUrlInfo.href)).mo198336a("").mo198338b((int) getTextSize()).mo198335a(oVar).mo198337a();
        a.mo198322a(new C58507d(this));
        gVar.append(keyIconUrlInfo.text.substring(0, 1), a, this.f144440p);
        gVar.append(keyIconUrlInfo.text.substring(1), new ForegroundColorSpan(i), this.f144440p);
        gVar.setSpan(new C58533r(keyIconUrlInfo.href, this.an), length, keyIconUrlInfo.text.length() + length, this.f144440p);
    }

    /* renamed from: a */
    private void m227017a(C58513g gVar, RichUrlInfo richUrlInfo) {
        int length = gVar.length();
        int i = this.f144441q;
        if (i == 0) {
            i = getResources().getColor(R.color.text_link_normal);
        }
        Drawable drawable = this.f144431S.getDrawable(richUrlInfo.mLocalImageResId);
        drawable.mutate();
        drawable.setTint(i);
        gVar.append(richUrlInfo.text.substring(0, 1), new C58508e.C58510a(getContext(), new C58508e.C58511b(richUrlInfo.href)).mo198336a("").mo198338b((int) getTextSize()).mo198335a(drawable).mo198337a(), this.f144440p);
        gVar.append(richUrlInfo.text.substring(1), new ForegroundColorSpan(i), this.f144440p);
        gVar.setSpan(new C58533r(richUrlInfo.href, this.an), length, richUrlInfo.text.length() + length, this.f144440p);
    }

    /* renamed from: c */
    private void m227029c(C58513g gVar, SpanInfo spanInfo, String str) {
        if (spanInfo instanceof SpacingInfo) {
            gVar.append(str, new C59166k.C59168a().mo201114a((float) ((SpacingInfo) spanInfo).spacingHeight).mo201115a(), this.f144440p);
        }
    }

    /* renamed from: d */
    private void m227030d(C58513g gVar, SpanInfo spanInfo, String str) {
        if (spanInfo instanceof EmojiconInfo) {
            EmojiconInfo emojiconInfo = (EmojiconInfo) spanInfo;
            gVar.append(str, new C58504c(this.f144431S, emojiconInfo.drawable, emojiconInfo.key, getEmojiconSize(), getEmojiconAlignment(), getEmojiconTextSize()), this.f144440p);
        }
    }

    public LinkEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f144438n = true;
        this.f144440p = 33;
        this.f144417E = true;
        this.f144418F = true;
        this.ac = R.color.imtoken_message_icon_read_dot;
        this.ad = R.color.imtoken_message_icon_unread_dot;
        this.ae = true;
        this.f144416D = TextViewFixTouchConsume.C58493a.m226905a();
        this.aj = false;
        this.al = true;
        this.an = false;
        this.f144431S = context;
        this.f144419G = new C58535b(this);
        this.f144436l = UIUtils.getColor(context, R.color.text_link_normal);
        this.f144434V = getResources().getString(R.string.Lark_Legacy_EllipseViewFullTextTip);
        setShouldEllipsized(false);
    }

    /* renamed from: a */
    private C58513g m227012a(List<SpanInfo> list, CharSequence charSequence, String str) {
        try {
            return m227023b(list, charSequence, str);
        } catch (Exception e) {
            Log.m165387e("LinkEmojiTextView", e.getCause(), true);
            C58513g gVar = new C58513g(getContext());
            gVar.append(str);
            return gVar;
        }
    }

    /* renamed from: e */
    private void m227031e(C58513g gVar, SpanInfo spanInfo, String str) {
        TextStyleInfo textStyleInfo = (TextStyleInfo) spanInfo;
        if ((getPaintFlags() & 16) == 16) {
            textStyleInfo.isStrikeThruText = true;
        }
        if (textStyleInfo.isIndependent) {
            gVar.append(str, new C58514h(textStyleInfo), this.f144440p);
            return;
        }
        int length = gVar.length();
        if (str == null || length < str.length()) {
            Log.m165383e("LinkEmojiTextView", "Span info error:" + spanInfo);
            return;
        }
        int length2 = length - str.length();
        if (length2 < gVar.length() && length <= gVar.length()) {
            gVar.setSpan(new C58514h(textStyleInfo), length2, length, this.f144440p);
        }
    }

    /* renamed from: b */
    private C58513g m227023b(List<SpanInfo> list, CharSequence charSequence, String str) {
        C58513g a = m227011a(charSequence);
        if (CollectionUtils.isEmpty(list)) {
            a.append(str);
            return a;
        } else if (list.size() == 1) {
            m227022a(list, str, a);
            m227019a(a, str, list.get(0));
            return a;
        } else {
            m227022a(list, str, a);
            int i = 0;
            while (i < list.size() - 1) {
                SpanInfo spanInfo = list.get(i);
                i++;
                SpanInfo spanInfo2 = list.get(i);
                if (spanInfo.end <= spanInfo2.start) {
                    m227021a(str, a, spanInfo, spanInfo2);
                } else if (!(spanInfo2 instanceof TextStyleInfo) || ((TextStyleInfo) spanInfo2).isIndependent) {
                    spanInfo.end = spanInfo2.start;
                    int i2 = spanInfo.end - spanInfo.start;
                    if (i2 <= spanInfo.text.length()) {
                        spanInfo.text = spanInfo.text.substring(0, i2);
                        m227021a(str, a, spanInfo, spanInfo2);
                    }
                } else {
                    m227021a(str, a, spanInfo, spanInfo2);
                }
            }
            m227019a(a, str, list.get(list.size() - 1));
            return a;
        }
    }

    /* renamed from: b */
    private void m227027b(C58513g gVar, SpanInfo spanInfo, String str) {
        C59160j jVar;
        if (spanInfo instanceof ImageInfo) {
            ImageInfo imageInfo = (ImageInfo) spanInfo;
            String str2 = imageInfo.key;
            String str3 = imageInfo.url;
            C59160j.C59164c a = new C59160j.C59164c().mo201103a(imageInfo.width).mo201109b(imageInfo.height).mo201107a(this.am);
            if (!TextUtils.isEmpty(str2)) {
                a.mo201106a(this.ak);
                jVar = a.mo201108a(getContext(), str2);
            } else {
                jVar = a.mo201108a(getContext(), str3);
            }
            gVar.append(str, jVar, this.f144440p);
            int length = gVar.length();
            gVar.setSpan(new C58526k(imageInfo), length - str.length(), length, this.f144440p);
        }
    }

    /* renamed from: a */
    private void m227018a(C58513g gVar, SpanInfo spanInfo, String str) {
        if (spanInfo instanceof AbbreviationInfo) {
            AbbreviationInfo abbreviationInfo = (AbbreviationInfo) spanInfo;
            gVar.append(str, new C58534a(str, getContext(), abbreviationInfo.intervalOff, abbreviationInfo.intervalOn, 0.6f), this.f144440p);
            int length = gVar.length();
            gVar.setSpan(new C58518c(abbreviationInfo), length - str.length(), length, this.f144440p);
        } else if (spanInfo instanceof IntentionInfo) {
            gVar.append(str, new C58534a(str, getContext()), this.f144440p);
            int length2 = gVar.length();
            gVar.setSpan(new C58527l((IntentionInfo) spanInfo), length2 - str.length(), length2, this.f144440p);
        }
    }

    /* renamed from: b */
    private void m227028b(String str, C58513g gVar, SpanInfo spanInfo, SpanInfo spanInfo2) {
        if ((spanInfo2 instanceof AtInfo) || (spanInfo2 instanceof UrlInfo) || !(spanInfo2 instanceof TextStyleInfo) || ((TextStyleInfo) spanInfo2).isIndependent || (spanInfo2 instanceof AbbreviationInfo) || (spanInfo2 instanceof IntentionInfo) || (spanInfo2 instanceof MentionInfo)) {
            String substring = str.substring(spanInfo.end, spanInfo2.start);
            if (spanInfo.type == 1 || spanInfo.type == 2) {
                substring = m227025b(substring);
            }
            gVar.append(substring);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        Layout layout = getLayout();
        if (Build.VERSION.SDK_INT == 26 && (layout instanceof DynamicLayout)) {
            m227015a((DynamicLayout) layout);
        }
        Rect rect = new Rect();
        if (layout == null || (i5 = this.ag) == -1) {
            this.f175455ai = -1.0f;
            this.ah = -1.0f;
            return;
        }
        int lineForOffset = layout.getLineForOffset(i5);
        try {
            layout.getLineBounds(lineForOffset, rect);
            if (getMaxLines() != -1) {
                if (lineForOffset >= getMaxLines() - 1) {
                    this.f175455ai = -1.0f;
                    this.ah = -1.0f;
                    return;
                }
            }
            this.f175455ai = (float) rect.top;
            this.ah = layout.getSecondaryHorizontal(this.ag);
        } catch (IndexOutOfBoundsException unused) {
            this.f175455ai = -1.0f;
            this.ah = -1.0f;
        }
    }
}

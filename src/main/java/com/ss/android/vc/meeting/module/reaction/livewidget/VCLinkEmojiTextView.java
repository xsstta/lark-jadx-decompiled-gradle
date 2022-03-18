package com.ss.android.vc.meeting.module.reaction.livewidget;

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
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.C58512f;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.linked_emojicon.p2942b.C58500b;
import com.ss.android.lark.widget.linked_emojicon.widget.C58534a;
import com.ss.android.lark.widget.linked_emojicon.widget.C58536c;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.C59159i;
import com.ss.android.lark.widget.span.C59160j;
import com.ss.android.lark.widget.span.C59166k;
import com.ss.android.lark.widget.span.C59176n;
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
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.reaction.livewidget.VCTextViewFixTouchConsume;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class VCLinkEmojiTextView extends VCTextViewFixTouchConsume {

    /* renamed from: b */
    public static final Pattern f158052b = Pattern.compile("<figure>[\\s]*?<img[\\s]*?src=\\\"(.*?)\"[\\s]*?origin-width=\\\"(\\d+)\"[\\s]*?origin-height=\\\"(\\d+)\"[\\s]*?/>[\\s]*?</figure>");

    /* renamed from: D */
    private boolean f158053D;

    /* renamed from: E */
    private boolean f158054E;

    /* renamed from: F */
    private C62844e f158055F;

    /* renamed from: G */
    private int f158056G;

    /* renamed from: H */
    private int f158057H;

    /* renamed from: I */
    private int f158058I;

    /* renamed from: J */
    private int f158059J;

    /* renamed from: K */
    private int f158060K;

    /* renamed from: L */
    private int f158061L;

    /* renamed from: M */
    private int f158062M;

    /* renamed from: N */
    private int f158063N;

    /* renamed from: O */
    private int f158064O;

    /* renamed from: P */
    private String f158065P;

    /* renamed from: Q */
    private String f158066Q;

    /* renamed from: R */
    private Context f158067R;

    /* renamed from: S */
    private boolean f158068S;

    /* renamed from: T */
    private AbstractC62819m f158069T;

    /* renamed from: U */
    private String f158070U;

    /* renamed from: V */
    private AbstractC62820n f158071V;

    /* renamed from: W */
    private int f158072W;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae;
    private int af;
    private float ag;
    private float ah;

    /* renamed from: ai  reason: collision with root package name */
    private boolean f175460ai;
    private C59160j.AbstractC59162a aj;
    private C59159i ak;
    private boolean al;

    /* renamed from: c */
    protected int f158073c;

    /* renamed from: e */
    protected boolean f158074e;

    /* renamed from: f */
    protected boolean f158075f;

    /* renamed from: g */
    protected boolean f158076g;

    /* renamed from: h */
    int f158077h;

    /* renamed from: i */
    public int f158078i;

    /* renamed from: j */
    public int f158079j;

    /* renamed from: k */
    public int f158080k;

    /* renamed from: l */
    public int f158081l;

    /* renamed from: m */
    public AbstractC62814h f158082m;

    /* renamed from: n */
    public AbstractC62815i f158083n;

    /* renamed from: o */
    public AbstractC62811e f158084o;

    /* renamed from: p */
    public IMentionSpanClickListener f158085p;

    /* renamed from: q */
    public AbstractC62810d f158086q;

    /* renamed from: r */
    public AbstractC62813g f158087r;

    /* renamed from: s */
    public AbstractC62812f f158088s;

    /* renamed from: t */
    public boolean f158089t;

    /* renamed from: u */
    VCTextViewFixTouchConsume.C62836a f158090u;

    public static class UrlImageInfo extends SpanInfo {
        public String imageUrl;
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$d */
    public interface AbstractC62810d {
        /* renamed from: a */
        void mo217027a(View view, AbbreviationInfo abbreviationInfo, float f, float f2);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$e */
    public interface AbstractC62811e {
        /* renamed from: a */
        void mo217028a(View view, String str, String str2);

        /* renamed from: b */
        boolean mo217029b(View view, String str, String str2);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$f */
    public interface AbstractC62812f {
        void onImageClick(View view, String str, String str2);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$g */
    public interface AbstractC62813g {
        /* renamed from: a */
        void mo217030a(View view, IntentionInfo intentionInfo);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$h */
    public interface AbstractC62814h {
        /* renamed from: a */
        void mo217031a(View view, String str);

        /* renamed from: b */
        void mo217032b(View view, String str);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$i */
    public interface AbstractC62815i {
        /* renamed from: a */
        void mo213393a(View view, String str);

        /* renamed from: b */
        boolean mo213394b(View view, String str);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$m */
    public interface AbstractC62819m {
        /* renamed from: a */
        void mo217038a(boolean z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$n */
    public interface AbstractC62820n {
        /* renamed from: a */
        void mo217039a(SpannableStringBuilder spannableStringBuilder);
    }

    public String getCurrentUserId() {
        return this.f158065P;
    }

    public C62844e getHelper() {
        return this.f158055F;
    }

    public AbstractC62819m getOnEllipsizeListener() {
        return this.f158069T;
    }

    /* renamed from: a */
    public void mo216973a(RecogniseSpansResult recogniseSpansResult, String str, boolean z) {
        m245882c();
        if (recogniseSpansResult == null || !this.f158053D) {
            m245875a(str, z);
            return;
        }
        this.f158075f = true;
        this.f158074e = false;
        this.f158068S = z;
        m245869a(m245865a(recogniseSpansResult));
        super.setText(m245867a(recogniseSpansResult.getAllSpanInfos(), (CharSequence) null, str));
        setMovementMethod(this.f158090u);
    }

    /* renamed from: a */
    private void m245875a(CharSequence charSequence, boolean z) {
        m245882c();
        this.f158075f = true;
        this.f158074e = false;
        this.f158068S = z;
        if (this.f158053D) {
            RecogniseSpansResult a = C59176n.m229853a().mo201126a((String) charSequence, this.f158054E);
            CharSequence b = m245878b(charSequence);
            List<SpanInfo> arrayList = a == null ? new ArrayList<>() : a.getAllSpanInfos();
            m245869a(m245865a(a));
            super.setText(m245867a(arrayList, b, charSequence.toString()));
            setMovementMethod(VCTextViewFixTouchConsume.C62836a.m245971a());
            return;
        }
        super.setText(C62842c.m245982a(charSequence));
    }

    /* renamed from: a */
    public void mo216975a(String str, RecogniseSpansResult recogniseSpansResult) {
        mo216976a(str, recogniseSpansResult, false);
    }

    /* renamed from: a */
    public void mo216976a(final String str, final RecogniseSpansResult recogniseSpansResult, final boolean z) {
        m245882c();
        this.f158075f = true;
        this.f158074e = false;
        this.f158068S = z;
        if (!this.f158053D) {
            super.setText(C62842c.m245982a((CharSequence) str));
        } else if (recogniseSpansResult != null) {
            m245869a(m245865a(recogniseSpansResult));
            super.setText(m245867a(recogniseSpansResult.getAllSpanInfos(), (CharSequence) null, str));
            setMovementMethod(VCTextViewFixTouchConsume.C62836a.m245971a());
            if (this.f158054E) {
                C58536c.m227060a().mo198444a(str, recogniseSpansResult.getAllSpanInfos(), new IGetDataCallback<List<PhoneInfo>>() {
                    /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView.C628061 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(List<PhoneInfo> list) {
                        if (CollectionUtils.isNotEmpty(list)) {
                            recogniseSpansResult.addPhoneSpanInfos(list);
                            VCLinkEmojiTextView.this.mo216973a(recogniseSpansResult, str, z);
                        }
                    }
                });
            }
        } else {
            super.setText(C62842c.m245982a((CharSequence) str));
            C58536c.m227060a().mo198442a(new C62822p(this, str, z), str, this.f158054E);
        }
    }

    /* renamed from: a */
    private void m245876a(String str, C58513g gVar, SpanInfo spanInfo, SpanInfo spanInfo2) {
        String str2 = spanInfo.text;
        if (spanInfo.type == 1) {
            if (spanInfo instanceof KeyIconUrlInfo) {
                m245871a(gVar, (KeyIconUrlInfo) spanInfo);
            } else if (spanInfo instanceof RichUrlInfo) {
                m245872a(gVar, (RichUrlInfo) spanInfo);
            } else {
                gVar.append(str2, m245868a(spanInfo), this.f158077h);
                m245884d(gVar, spanInfo, str2);
            }
        } else if (spanInfo.type == 0) {
            if (spanInfo instanceof AtInfo) {
                AtInfo atInfo = (AtInfo) spanInfo;
                String str3 = atInfo.userId;
                gVar.mo198348a((CharSequence) str2, mo216971a(this.f158067R, str2, atInfo), this.f158077h);
                m245884d(gVar, spanInfo, str2);
                if (this.af == -1 && getHelper().mo217155c(str3)) {
                    this.af = gVar.toString().length();
                }
            } else {
                Log.m165383e("LinkEmojiTextView", "Span info error:" + spanInfo);
                gVar.append(str2);
            }
        } else if (spanInfo.type == 3) {
            gVar.append(str2, new C62808b(), this.f158077h);
        } else if (spanInfo.type == 2) {
            gVar.append(str2, new C62821o(str2, this.al), this.f158077h);
        } else if (spanInfo.type == 4) {
            m245884d(gVar, spanInfo, str2);
        } else if (spanInfo.type == 5) {
            m245873a(gVar, spanInfo, str2);
        } else if (spanInfo.type == 6) {
            m245880b(gVar, spanInfo, str2);
        } else if (spanInfo.type == 7) {
            m245883c(gVar, spanInfo, str2);
        } else if (spanInfo.type == 8) {
            if (spanInfo instanceof MentionInfo) {
                MentionInfo mentionInfo = (MentionInfo) spanInfo;
                gVar.append(str2, new C62818l(str2, mentionInfo.id, mentionInfo.isAuthorized, mentionInfo.url), this.f158077h);
            } else {
                Log.m165383e("LinkEmojiTextView", "mention Span info error:" + spanInfo);
                gVar.append(str2);
            }
        }
        m245881b(str, gVar, spanInfo, spanInfo2);
    }

    /* renamed from: a */
    private void m245877a(List<SpanInfo> list, String str, C58513g gVar) {
        gVar.append(C62842c.m245982a((CharSequence) str.substring(0, Math.min(list.get(0).start, str.length()))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m245874a(com.ss.android.lark.widget.linked_emojicon.C58513g r9, java.lang.String r10, com.ss.android.lark.widget.span.SpanInfo r11) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView.m245874a(com.ss.android.lark.widget.linked_emojicon.g, java.lang.String, com.ss.android.lark.widget.span.SpanInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Object> mo216971a(Context context, String str, AtInfo atInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        String str2 = atInfo.userId;
        boolean z = atInfo.isAnonymous;
        ArrayMap arrayMap = new ArrayMap();
        int i5 = R.color.ud_N900;
        if (z) {
            if (this.f158060K != 0) {
                i5 = this.f158059J;
            }
            arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(C60773o.m236126d(i5)));
            return arrayMap;
        }
        boolean z2 = atInfo.isOutChatUser;
        int i6 = R.color.ud_N600;
        if (!z2 || (i4 = this.f158059J) == 0) {
            i = z2 ? C60773o.m236126d(R.color.ud_N600) : 0;
        } else {
            i = C60773o.m236126d(i4);
        }
        C62807a aVar = new C62807a(str, str2, i);
        arrayMap.put("AtClick", aVar);
        if (z2) {
            int i7 = this.f158059J;
            if (i7 != 0) {
                i6 = i7;
            }
            arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(C60773o.m236126d(i6)));
        } else {
            boolean isEmpty = TextUtils.isEmpty(this.f158065P);
            int i8 = R.color.ud_B500;
            if (!isEmpty && this.f158065P.equals(str2)) {
                int i9 = this.f158058I;
                if (i9 == 0) {
                    i9 = R.color.ud_N00;
                }
                int i10 = this.f158057H;
                if (i10 == 0) {
                    i3 = C60773o.m236126d(R.color.ud_B500);
                } else {
                    i3 = C60773o.m236126d(i10);
                }
                arrayMap.put("RoundedTagSpan", C58500b.m226945a(context, Math.round(getTextSize()), atInfo.textStyle, Math.round(getTextSize()), C60773o.m236126d(i9), i3));
            } else if (getHelper().mo217155c(str2)) {
                int i11 = this.f158080k;
                if (i11 != 0) {
                    i8 = i11;
                }
                boolean a = getHelper().mo217152a(str2);
                arrayMap.put("ReadStatusSpan", new C58512f(C60773o.m236126d(a ? this.ab : this.ac), C60773o.m236126d(i8), a ? Paint.Style.FILL : Paint.Style.STROKE));
                arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(C60773o.m236126d(i8)));
            } else {
                String str3 = this.f158066Q;
                if (str3 == null || !str3.equals(str2)) {
                    int i12 = this.f158056G;
                    if (i12 == 0) {
                        i12 = C60773o.m236126d(R.color.ud_B500);
                    }
                    arrayMap.put("ForegroundColorSpan", new ForegroundColorSpan(i12));
                    aVar.f158095a = i12;
                } else {
                    int i13 = this.f158062M;
                    if (i13 != 0) {
                        i5 = i13;
                    }
                    int i14 = this.f158063N;
                    if (i14 == 0) {
                        i2 = UIUtils.getColor(context, R.color.lkui_transparent);
                    } else {
                        i2 = UIUtils.getColor(context, i14);
                    }
                    arrayMap.put("RoundedTagSpan", C58500b.m226945a(context, Math.round(getTextSize()), atInfo.textStyle, Math.round(getTextSize()), C60773o.m236126d(i5), i2));
                }
            }
        }
        return arrayMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo216972a(int i, int i2) {
        CharSequence charSequence;
        boolean z = this.f158072W == i && this.aa == i2;
        if (!this.f158076g) {
            return;
        }
        if (!this.f158074e || !z) {
            this.f158072W = i;
            this.aa = i2;
            int lineCount = getLineCount();
            Layout layout = getLayout();
            int maxLines = getMaxLines();
            if (maxLines != 0 && lineCount >= maxLines && !TextUtils.isEmpty(getText())) {
                int i3 = maxLines - 1;
                int lineEnd = layout.getLineEnd(i3);
                int lineStart = layout.getLineStart(i3);
                if (lineEnd < getText().length()) {
                    CharSequence subSequence = getText().subSequence(0, lineStart);
                    String str = this.f158070U;
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
                    AbstractC62820n nVar = this.f158071V;
                    if (nVar != null) {
                        nVar.mo217039a(spannableStringBuilder);
                    } else {
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str);
                        if (!this.ae) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f158073c), length + 1, length + str.length(), 18);
                        }
                    }
                    setText(spannableStringBuilder);
                    this.f158074e = true;
                    mo216977b();
                    measure(i, i2);
                }
            }
        }
    }

    /* renamed from: c */
    private void m245882c() {
        this.af = -1;
        this.ah = -1.0f;
        this.ag = -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo216977b() {
        AbstractC62819m mVar = this.f158069T;
        if (mVar != null && this.f158075f) {
            mVar.mo217038a(true);
            this.f158075f = false;
        }
    }

    public float[] getFirstSpanDotLocation() {
        return new float[]{this.ag, this.ah};
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$c */
    public class C62809c extends ClickableSpan {

        /* renamed from: b */
        private AbbreviationInfo f158101b;

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
        }

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158086q != null && view.getTag(R.id.tag_long_press) == null) {
                VCLinkEmojiTextView.this.f158086q.mo217027a(view, this.f158101b, (float) VCLinkEmojiTextView.this.f158090u.mo217141b(), (float) VCLinkEmojiTextView.this.f158090u.mo217142c());
            }
        }

        public C62809c(AbbreviationInfo abbreviationInfo) {
            this.f158101b = abbreviationInfo;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$k */
    public class C62817k extends ClickableSpan {

        /* renamed from: b */
        private IntentionInfo f158105b;

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
        }

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158087r != null && view.getTag(R.id.tag_long_press) == null) {
                VCLinkEmojiTextView.this.f158087r.mo217030a(view, this.f158105b);
            }
        }

        public C62817k(IntentionInfo intentionInfo) {
            this.f158105b = intentionInfo;
        }
    }

    public void setAbbreviationClickListener(AbstractC62810d dVar) {
        this.f158086q = dVar;
    }

    public void setAtAnonymousUserTextColor(int i) {
        this.f158060K = i;
    }

    public void setAtOtherChatUserBgColor(int i) {
        this.f158061L = i;
    }

    public void setAtOtherChatUserTextColor(int i) {
        this.f158059J = i;
    }

    public void setAtSelfBgColor(int i) {
        this.f158057H = i;
    }

    public void setAtSelfTextColor(int i) {
        this.f158058I = i;
    }

    public void setAtStringClickListner(AbstractC62811e eVar) {
        this.f158084o = eVar;
    }

    public void setAtTextColor(int i) {
        this.f158080k = i;
    }

    public void setChatTextColor(int i) {
        this.f158081l = i;
    }

    public void setCurrentUserId(String str) {
        this.f158065P = str;
    }

    public void setDefaultAtUserColor(int i) {
        this.f158056G = i;
    }

    public void setDotReadColor(int i) {
        this.ab = i;
    }

    public void setDotUnreadColor(int i) {
        this.ac = i;
    }

    public void setImageClickListener(AbstractC62812f fVar) {
        this.f158088s = fVar;
    }

    public void setImageFetcher(C59160j.AbstractC59162a aVar) {
        this.aj = aVar;
    }

    public void setIntentionClickListener(AbstractC62813g gVar) {
        this.f158087r = gVar;
    }

    public void setIsUrlShowUnderLine(boolean z) {
        this.al = z;
    }

    public void setMentionSpanClickListener(IMentionSpanClickListener fVar) {
        this.f158085p = fVar;
    }

    public void setNeedToRecognize(boolean z) {
        this.f158053D = z;
    }

    public void setNeedToRecognizePhone(boolean z) {
        this.f158054E = z;
    }

    public void setOnEllipsizeListener(AbstractC62819m mVar) {
        this.f158069T = mVar;
    }

    public void setOnSetTailSpanListener(AbstractC62820n nVar) {
        this.f158071V = nVar;
    }

    public void setPhoneStringClickListener(AbstractC62814h hVar) {
        this.f158082m = hVar;
    }

    public void setPhoneTextColor(int i) {
        this.f158079j = i;
    }

    public void setShowTail(boolean z) {
        this.f158076g = z;
    }

    public void setShowUrlUnderLine(boolean z) {
        this.ad = z;
    }

    public void setTailColor(int i) {
        this.f158073c = i;
    }

    public void setTailContent(String str) {
        this.f158070U = str;
    }

    public void setUnClickGroupBgColor(int i) {
        this.f158063N = i;
    }

    public void setUnClickGroupTextColor(int i) {
        this.f158062M = i;
    }

    public void setUnclickGroupId(String str) {
        this.f158066Q = str;
    }

    public void setUrlBackGroundColor(int i) {
        this.f158064O = i;
    }

    public void setUrlBoldText(boolean z) {
        this.f158089t = z;
    }

    public void setUrlStringClickListner(AbstractC62815i iVar) {
        this.f158083n = iVar;
    }

    public void setUrlTextColor(int i) {
        this.f158078i = i;
    }

    public void setUseNewAtStyle(boolean z) {
        this.f175460ai = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$b */
    public class C62808b extends ClickableSpan {
        public void onClick(View view) {
        }

        public C62808b() {
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (VCLinkEmojiTextView.this.f158081l == 0) {
                textPaint.setColor(C60773o.m236126d(R.color.ud_B500));
            } else {
                textPaint.setColor(VCLinkEmojiTextView.this.f158081l);
            }
            textPaint.setUnderlineText(false);
        }
    }

    public VCLinkEmojiTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo216974a(String str) {
        mo216975a(str, (RecogniseSpansResult) null);
    }

    /* renamed from: a */
    private C62823q m245868a(SpanInfo spanInfo) {
        return new C62823q(((UrlInfo) spanInfo).href, this.al);
    }

    public void setTextIsSelectable(boolean z) {
        super.setTextIsSelectable(z);
        this.f158090u.mo217140a(!z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$l */
    public class C62818l extends ClickableSpan {

        /* renamed from: b */
        private String f158107b;

        /* renamed from: c */
        private String f158108c;

        /* renamed from: d */
        private boolean f158109d;

        /* renamed from: e */
        private String f158110e;

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158085p != null) {
                VCLinkEmojiTextView.this.f158085p.mo122872a(view, this.f158107b, this.f158108c, this.f158109d, this.f158110e);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (this.f158109d) {
                textPaint.setColor(C60773o.m236126d(R.color.ud_B500));
            } else {
                textPaint.setColor(C60773o.m236126d(R.color.ud_N650));
            }
            textPaint.setUnderlineText(false);
        }

        public C62818l(String str, String str2, boolean z, String str3) {
            this.f158107b = str;
            this.f158108c = str2;
            this.f158109d = z;
            this.f158110e = str3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$p */
    public static class C62822p implements IGetDataCallback<RecogniseSpansResult> {

        /* renamed from: a */
        private WeakReference<VCLinkEmojiTextView> f158114a;

        /* renamed from: b */
        private String f158115b;

        /* renamed from: c */
        private boolean f158116c;

        /* renamed from: a */
        public void onSuccess(RecogniseSpansResult recogniseSpansResult) {
            VCLinkEmojiTextView vCLinkEmojiTextView = this.f158114a.get();
            List<SpanInfo> allSpanInfos = recogniseSpansResult.getAllSpanInfos();
            if (vCLinkEmojiTextView != null && CollectionUtils.isNotEmpty(allSpanInfos)) {
                vCLinkEmojiTextView.mo216973a(recogniseSpansResult, this.f158115b, this.f158116c);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Log.m165382e("LinkEmojiTextview preload failed: " + errorResult.toString());
        }

        public C62822p(VCLinkEmojiTextView vCLinkEmojiTextView, String str, boolean z) {
            this.f158114a = new WeakReference<>(vCLinkEmojiTextView);
            this.f158115b = str;
            this.f158116c = z;
        }
    }

    /* renamed from: a */
    private int m245865a(RecogniseSpansResult recogniseSpansResult) {
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
        this.ae = z;
        if (z) {
            this.f158070U = UIUtils.getString(getContext(), R.string.Lark_Legacy_EllipseShortText);
        } else {
            this.f158070U = UIUtils.getString(getContext(), R.string.Lark_Legacy_EllipseViewFullTextTip);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$a */
    public class C62807a extends ClickableSpan {

        /* renamed from: a */
        public int f158095a;

        /* renamed from: c */
        private String f158097c;

        /* renamed from: d */
        private String f158098d;

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158084o == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (VCLinkEmojiTextView.this.f158084o.mo217029b(view, this.f158097c, this.f158098d)) {
                    VCLinkEmojiTextView.this.performHapticFeedback(0);
                    return;
                }
                return;
            }
            VCLinkEmojiTextView.this.f158084o.mo217028a(view, this.f158097c, this.f158098d);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            int i = this.f158095a;
            if (i != 0) {
                textPaint.setColor(i);
            } else if (VCLinkEmojiTextView.this.f158080k != 0) {
                textPaint.setColor(C60773o.m236126d(VCLinkEmojiTextView.this.f158080k));
            } else {
                textPaint.setColor(C60773o.m236126d(R.color.ud_B500));
            }
            textPaint.setUnderlineText(false);
        }

        public C62807a(String str, String str2, int i) {
            this.f158097c = str;
            this.f158098d = str2;
            this.f158095a = i;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$j */
    public class C62816j extends ClickableSpan {

        /* renamed from: b */
        private ImageInfo f158103b;

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158088s == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
            } else {
                VCLinkEmojiTextView.this.f158088s.onImageClick(view, this.f158103b.key, this.f158103b.url);
            }
        }

        public C62816j(ImageInfo imageInfo) {
            this.f158103b = imageInfo;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$o */
    public class C62821o extends ClickableSpan {

        /* renamed from: b */
        private String f158112b;

        /* renamed from: c */
        private boolean f158113c;

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158082m == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                VCLinkEmojiTextView.this.f158082m.mo217032b(view, this.f158112b);
                return;
            }
            VCLinkEmojiTextView.this.f158082m.mo217031a(view, this.f158112b);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (VCLinkEmojiTextView.this.f158079j == 0) {
                textPaint.setColor(C60773o.m236126d(R.color.ud_B500));
            } else {
                textPaint.setColor(VCLinkEmojiTextView.this.f158079j);
            }
            textPaint.setUnderlineText(this.f158113c);
        }

        public C62821o(String str, boolean z) {
            this.f158112b = str;
            this.f158113c = z;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCLinkEmojiTextView$q */
    public class C62823q extends ClickableSpan {

        /* renamed from: b */
        private String f158118b;

        /* renamed from: c */
        private boolean f158119c;

        public void onClick(View view) {
            if (VCLinkEmojiTextView.this.f158083n == null) {
                return;
            }
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
                if (VCLinkEmojiTextView.this.f158083n.mo213394b(view, this.f158118b)) {
                    VCLinkEmojiTextView.this.performHapticFeedback(0);
                    return;
                }
                return;
            }
            VCLinkEmojiTextView.this.f158083n.mo213393a(view, this.f158118b);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (VCLinkEmojiTextView.this.f158078i == 0) {
                textPaint.setColor(C60773o.m236126d(R.color.ud_B500));
            } else {
                textPaint.setColor(VCLinkEmojiTextView.this.f158078i);
            }
            textPaint.setUnderlineText(this.f158119c);
            textPaint.setFakeBoldText(VCLinkEmojiTextView.this.f158089t);
        }

        public C62823q(String str, boolean z) {
            this.f158118b = str;
            this.f158119c = z;
        }
    }

    /* renamed from: a */
    private C58513g m245866a(CharSequence charSequence) {
        if (charSequence != null) {
            return new C58513g(getContext(), charSequence);
        }
        return new C58513g(getContext());
    }

    /* renamed from: b */
    private CharSequence m245878b(CharSequence charSequence) {
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

    /* renamed from: a */
    private void m245869a(int i) {
        C59159i iVar = this.ak;
        if (iVar != null) {
            iVar.mo201098c();
            this.ak = null;
        }
        this.ak = new C59159i(this);
    }

    /* renamed from: b */
    private String m245879b(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray[0] != '\n') {
            return str;
        }
        return UIUtils.getString(getContext(), R.string.Lark_Legacy_PlaceHolderChar) + str;
    }

    /* renamed from: a */
    private void m245870a(DynamicLayout dynamicLayout) {
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
        mo216972a(i, i2);
    }

    public VCLinkEmojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // com.ss.android.vc.meeting.module.reaction.livewidget.VCEllipsizedEmojiconTextView, com.ss.android.vc.meeting.module.reaction.livewidget.VCEmojiconTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int maxLines = getMaxLines();
        if (this.f158076g && maxLines >= 1) {
            CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), (float) (UIHelper.getWindowWidth(getContext()) * maxLines), TextUtils.TruncateAt.END);
            if (ellipsize != charSequence) {
                mo216977b();
            }
            charSequence = ellipsize;
        }
        super.setText(charSequence, bufferType);
    }

    /* renamed from: a */
    private void m245871a(C58513g gVar, KeyIconUrlInfo keyIconUrlInfo) {
        int length = gVar.length();
        Drawable drawable = ContextCompat.getDrawable(this.f158067R, keyIconUrlInfo.placeHolderRes);
        IconKeyDrawable oVar = new IconKeyDrawable(this.f158067R);
        oVar.mo89034a(keyIconUrlInfo.iconKey, null, UIHelper.dp2px(14.0f), UIHelper.dp2px(14.0f), drawable, true);
        C58508e a = new C58508e.C58510a(getContext(), new C58508e.C58511b(keyIconUrlInfo.href)).mo198336a("").mo198338b((int) getTextSize()).mo198335a(oVar).mo198337a();
        a.mo198322a(new C58507d(this));
        gVar.append(keyIconUrlInfo.text.substring(0, 1), a, this.f158077h);
        gVar.append(keyIconUrlInfo.text.substring(1), new ForegroundColorSpan(C60773o.m236126d(R.color.ud_B700)), this.f158077h);
        gVar.setSpan(new C62823q(keyIconUrlInfo.href, this.al), length, keyIconUrlInfo.text.length() + length, this.f158077h);
    }

    /* renamed from: a */
    private void m245872a(C58513g gVar, RichUrlInfo richUrlInfo) {
        int length = gVar.length();
        gVar.append(richUrlInfo.text.substring(0, 1), new C58508e.C58510a(getContext(), new C58508e.C58511b(richUrlInfo.href)).mo198336a("").mo198338b((int) getTextSize()).mo198333a(richUrlInfo.mLocalImageResId).mo198337a(), this.f158077h);
        gVar.append(richUrlInfo.text.substring(1), new ForegroundColorSpan(C60773o.m236126d(R.color.ud_B700)), this.f158077h);
        gVar.setSpan(new C62823q(richUrlInfo.href, this.al), length, richUrlInfo.text.length() + length, this.f158077h);
    }

    /* renamed from: c */
    private void m245883c(C58513g gVar, SpanInfo spanInfo, String str) {
        if (spanInfo instanceof SpacingInfo) {
            gVar.append(str, new C59166k.C59168a().mo201114a((float) ((SpacingInfo) spanInfo).spacingHeight).mo201115a(), this.f158077h);
        }
    }

    public VCLinkEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158075f = true;
        this.f158077h = 33;
        this.f158053D = true;
        this.f158054E = true;
        this.ab = R.color.ud_T600;
        this.ac = R.color.ud_N400;
        this.ad = true;
        this.f158090u = VCTextViewFixTouchConsume.C62836a.m245971a();
        this.f175460ai = false;
        this.al = false;
        this.f158067R = context;
        this.f158055F = new C62844e(this);
        this.f158073c = UIUtils.getColor(context, R.color.ud_B500);
        this.f158070U = getResources().getString(R.string.Lark_Legacy_EllipseViewFullTextTip);
        setShouldEllipsized(false);
    }

    /* renamed from: d */
    private void m245884d(C58513g gVar, SpanInfo spanInfo, String str) {
        TextStyleInfo textStyleInfo = (TextStyleInfo) spanInfo;
        if (textStyleInfo.isIndependent) {
            gVar.append(str, new C58514h(textStyleInfo), this.f158077h);
            return;
        }
        int length = gVar.length();
        if (str == null || length < str.length()) {
            Log.m165383e("LinkEmojiTextView", "Span info error:" + spanInfo);
            return;
        }
        int length2 = length - str.length();
        if (length2 < gVar.length() && length <= gVar.length()) {
            gVar.setSpan(new C58514h(textStyleInfo), length2, length, this.f158077h);
        }
    }

    /* renamed from: a */
    private C58513g m245867a(List<SpanInfo> list, CharSequence charSequence, String str) {
        C58513g a = m245866a(charSequence);
        if (CollectionUtils.isEmpty(list)) {
            a.append(C62842c.m245982a((CharSequence) str));
            return a;
        } else if (list.size() == 1) {
            m245877a(list, str, a);
            m245874a(a, str, list.get(0));
            return a;
        } else {
            m245877a(list, str, a);
            int i = 0;
            while (i < list.size() - 1) {
                SpanInfo spanInfo = list.get(i);
                i++;
                SpanInfo spanInfo2 = list.get(i);
                if (spanInfo.end <= spanInfo2.start) {
                    m245876a(str, a, spanInfo, spanInfo2);
                } else if (!(spanInfo2 instanceof TextStyleInfo) || ((TextStyleInfo) spanInfo2).isIndependent) {
                    spanInfo.end = spanInfo2.start;
                    int i2 = spanInfo.end - spanInfo.start;
                    if (i2 <= spanInfo.text.length()) {
                        spanInfo.text = spanInfo.text.substring(0, i2);
                        m245876a(str, a, spanInfo, spanInfo2);
                    }
                } else {
                    m245876a(str, a, spanInfo, spanInfo2);
                }
            }
            m245874a(a, str, list.get(list.size() - 1));
            return a;
        }
    }

    /* renamed from: b */
    private void m245880b(C58513g gVar, SpanInfo spanInfo, String str) {
        C59160j jVar;
        if (spanInfo instanceof ImageInfo) {
            ImageInfo imageInfo = (ImageInfo) spanInfo;
            String str2 = imageInfo.key;
            String str3 = imageInfo.url;
            C59160j.C59164c a = new C59160j.C59164c().mo201103a(imageInfo.width).mo201109b(imageInfo.height).mo201107a(this.ak);
            if (!TextUtils.isEmpty(str2)) {
                a.mo201106a(this.aj);
                jVar = a.mo201108a(getContext(), str2);
            } else {
                jVar = a.mo201108a(getContext(), str3);
            }
            gVar.append(str, jVar, this.f158077h);
            int length = gVar.length();
            gVar.setSpan(new C62816j(imageInfo), length - str.length(), length, this.f158077h);
        }
    }

    /* renamed from: a */
    private void m245873a(C58513g gVar, SpanInfo spanInfo, String str) {
        if (spanInfo instanceof AbbreviationInfo) {
            AbbreviationInfo abbreviationInfo = (AbbreviationInfo) spanInfo;
            gVar.append(str, new C58534a(str, getContext(), abbreviationInfo.intervalOff, abbreviationInfo.intervalOn, 0.6f), this.f158077h);
            int length = gVar.length();
            gVar.setSpan(new C62809c(abbreviationInfo), length - str.length(), length, this.f158077h);
        } else if (spanInfo instanceof IntentionInfo) {
            gVar.append(str, new C58534a(str, getContext()), this.f158077h);
            int length2 = gVar.length();
            gVar.setSpan(new C62817k((IntentionInfo) spanInfo), length2 - str.length(), length2, this.f158077h);
        }
    }

    /* renamed from: b */
    private void m245881b(String str, C58513g gVar, SpanInfo spanInfo, SpanInfo spanInfo2) {
        if ((spanInfo2 instanceof AtInfo) || (spanInfo2 instanceof UrlInfo) || !(spanInfo2 instanceof TextStyleInfo) || ((TextStyleInfo) spanInfo2).isIndependent || (spanInfo2 instanceof AbbreviationInfo) || (spanInfo2 instanceof IntentionInfo)) {
            String substring = str.substring(spanInfo.end, spanInfo2.start);
            if (spanInfo.type == 1 || spanInfo.type == 2) {
                substring = m245879b(substring);
            }
            gVar.append(C62842c.m245982a((CharSequence) substring));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        Layout layout = getLayout();
        if (Build.VERSION.SDK_INT == 26 && (layout instanceof DynamicLayout)) {
            m245870a((DynamicLayout) layout);
        }
        Rect rect = new Rect();
        if (layout == null || (i5 = this.af) == -1) {
            this.ah = -1.0f;
            this.ag = -1.0f;
            return;
        }
        int lineForOffset = layout.getLineForOffset(i5);
        try {
            layout.getLineBounds(lineForOffset, rect);
            if (getMaxLines() != -1) {
                if (lineForOffset >= getMaxLines() - 1) {
                    this.ah = -1.0f;
                    this.ag = -1.0f;
                    return;
                }
            }
            this.ah = (float) rect.top;
            this.ag = layout.getSecondaryHorizontal(this.af);
        } catch (IndexOutOfBoundsException unused) {
            this.ah = -1.0f;
            this.ag = -1.0f;
        }
    }
}

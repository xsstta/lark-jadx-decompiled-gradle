package com.bytedance.ee.bear.middleground.comment.widget;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import com.bytedance.ee.bear.middleground.comment.audio.C9040d;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u001e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/widget/CommentEditText;", "Lcom/bytedance/ee/bear/widget/AtEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initialStringBuilder", "Landroid/text/SpannableStringBuilder;", "isStop", "", "mAudio2TextContent", "", "mIsLoading", "mKeyboardLoadingCallback", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordSpannableStringUtil$TextDrawableCallback;", "mLastAudio2TextContent", "mOriginTextIndex", "originHint", "getOriginHint", "()Ljava/lang/String;", "setOriginHint", "(Ljava/lang/String;)V", "reset", "", "stopUpdateAudioText", "updateAudioText", "recognizedText", "isFinish", "diffIndex", "", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommentEditText extends AtEditText {

    /* renamed from: a */
    public static final Companion f24999a = new Companion(null);

    /* renamed from: f */
    private C9040d.C9041a f25000f;

    /* renamed from: g */
    private String f25001g;

    /* renamed from: h */
    private SpannableStringBuilder f25002h;

    /* renamed from: i */
    private String f25003i;

    /* renamed from: j */
    private int f25004j;

    /* renamed from: k */
    private boolean f25005k;

    /* renamed from: l */
    private boolean f25006l;

    /* renamed from: m */
    private String f25007m;

    public CommentEditText(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/widget/CommentEditText$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.CommentEditText$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getOriginHint() {
        return this.f25007m;
    }

    /* renamed from: c */
    public final void mo35489c() {
        this.f25002h = null;
        this.f25003i = "";
        this.f25006l = false;
        this.f25005k = false;
    }

    /* renamed from: d */
    public final void mo35490d() {
        mo35488a("", true, new int[2]);
        this.f25006l = true;
    }

    public final void setOriginHint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f25007m = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f25001g = "";
        this.f25003i = "";
        this.f25007m = "";
    }

    /* renamed from: a */
    public final void mo35488a(String str, boolean z, int[] iArr) {
        boolean z2;
        int i;
        ForegroundColorSpan[] foregroundColorSpanArr;
        boolean z3;
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(str, "recognizedText");
        Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
        boolean z4 = true;
        if (this.f25003i.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.areEqual(this.f25003i, str) && !z) {
            return;
        }
        if (this.f25006l) {
            C13479a.m54772d("CommentEditText", "updateAudioText: is stop");
            return;
        }
        C13479a.m54772d("CommentEditText", "updateAudioText: recognizedText String: " + str + "  isFinish:" + z);
        if (!TextUtils.isEmpty(str)) {
            this.f25003i = str;
        }
        if (this.f25000f == null) {
            this.f25000f = new C9040d.C9041a(this);
        }
        if (this.f25002h == null) {
            Editable text = getText();
            if (text != null) {
                this.f25002h = (SpannableStringBuilder) text;
                String valueOf = String.valueOf(getText());
                this.f25001g = valueOf;
                this.f25004j = valueOf.length();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.text.SpannableStringBuilder");
            }
        }
        String str2 = this.f25001g + this.f25003i;
        SpannableStringBuilder spannableStringBuilder = this.f25002h;
        if (spannableStringBuilder != null) {
            i = spannableStringBuilder.length();
        } else {
            i = 0;
        }
        int i4 = this.f25004j;
        if (i4 > i) {
            C13606d.m55245a("CommentEditText", new Throwable());
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f25002h;
        if (spannableStringBuilder2 != null) {
            spannableStringBuilder2.replace(i4, i, (CharSequence) this.f25003i);
        }
        SpannableStringBuilder spannableStringBuilder3 = this.f25002h;
        if (spannableStringBuilder3 != null) {
            if (spannableStringBuilder3 != null) {
                i3 = spannableStringBuilder3.length();
            } else {
                i3 = 0;
            }
            foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(0, i3, ForegroundColorSpan.class);
        } else {
            foregroundColorSpanArr = null;
        }
        if (foregroundColorSpanArr != null) {
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                SpannableStringBuilder spannableStringBuilder4 = this.f25002h;
                if (spannableStringBuilder4 != null) {
                    spannableStringBuilder4.removeSpan(foregroundColorSpan);
                }
            }
        }
        if (z) {
            C13479a.m54772d("CommentEditText", "updateAudioText finish:" + z + ",res = " + str2);
            this.f25005k = false;
            if (str2.length() != 0) {
                z4 = false;
            }
            if (z4) {
                Editable text2 = getText();
                if (text2 == null) {
                    Intrinsics.throwNpe();
                }
                text2.clear();
            }
            setHint(this.f25007m);
            return;
        }
        if (iArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i2 = iArr[0];
        } else {
            i2 = this.f25003i.length();
        }
        int max = Math.max(i2, this.f25003i.length() - 3);
        SpannableStringBuilder a = C9040d.m37595a(getContext(), this.f25002h, this.f25004j + max);
        C13479a.m54772d("CommentEditText", "updateAudioText spannable:" + ((Object) a) + " partIndex:" + max);
        if (!this.f25005k) {
            this.f25005k = true;
            String string = getContext().getString(R.string.Doc_Comment_SpeakNow);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Comment_SpeakNow)");
            SpannableStringBuilder a2 = C9040d.m37597a(getContext(), string, this.f25000f);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            a2.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.space_kit_n500)), 0, a2.length(), 33);
            setHint(a2);
            setText(str2);
        }
        Editable text3 = getText();
        if (text3 == null) {
            Intrinsics.throwNpe();
        }
        setSelection(text3.length());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

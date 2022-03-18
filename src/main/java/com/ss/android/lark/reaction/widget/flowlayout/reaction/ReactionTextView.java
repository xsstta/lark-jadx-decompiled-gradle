package com.ss.android.lark.reaction.widget.flowlayout.reaction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.p2557b.C52986b;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53062b;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 T2\u00020\u0001:\u0004STUVB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00110\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002JX\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001d2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002JH\u0010+\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020!H\u0002J\u0010\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u000bH\u0002J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0018\u00105\u001a\u0002022\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0014J\u000e\u00108\u001a\u0002022\u0006\u00109\u001a\u00020\u000bJ\u000e\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020\u0011J\u0010\u0010<\u001a\u0002022\b\u0010=\u001a\u0004\u0018\u00010\tJ\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020\u000bH\u0016J\u0012\u0010@\u001a\u0002022\n\u0010A\u001a\u00060\u000eR\u00020\u000fJ\u000e\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u0011J\u000e\u0010D\u001a\u0002022\u0006\u0010E\u001a\u00020\u0013J\u0016\u0010F\u001a\u0002022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u000e\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u000bJ\u0010\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0002J\"\u0010L\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010J\u001a\u00020K2\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0002J(\u0010M\u001a\u0002022\u0006\u0010J\u001a\u00020K2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u000bH\u0002J\u0018\u0010O\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0011H\u0002J \u0010Q\u001a\u0002022\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\u001bH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0018\u00010\u000eR\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/ReactionTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "mDividerColor", "", "Ljava/lang/Integer;", "mOnContributorClickNew", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout$OnContributorClickNew;", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout;", "mOnlyShowCount", "", "mReactionClickListener", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionBaseFlowLayout$OnReactionItemClickListener;", "mViewDataList", "", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "shownNamesNumberLimit", "sizeChanged", "getDisplayWidth", "reactionKey", "", "getOriginalLineText", "Lkotlin/Pair;", "reaction", "nameSeparator", "getSpannableResult", "Landroid/text/SpannableStringBuilder;", "viewDataList", "handleLineText", "realEmojiWidth", "measuredWidth", "", "lineMaxWidth", "usedWidth", "suffix", "lineOriginal", "handleNewLine", "dataSeparatorWidth", "firstReaction", "result", "needAdjustLineHeight", "startLine", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setDividerColor", "dividerColor", "setEnableLongClick", "enableLongClick", "setLineBackground", "lineBackground", "setMaxWidth", "maxPixels", "setOnContributorClickNew", "onContributorClickNew", "setOnlyShowCount", "onlyShowCount", "setReactionClickListener", "listener", "setReactionData", "setShownNamesNumberLimit", "limit", "setupBackgroundSpan", "lineSpannable", "Landroid/text/SpannableString;", "setupClickSpan", "setupEmojiSpan", "emoji", "setupSeparatorDrawable", "forceUpdateColor", "setupSeparatorSpan", "emojiSeparator", "BackgroundSpan", "Companion", "ReactionClickableSpan", "SeparatorDrawableSpan", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReactionTextView extends AppCompatTextView {

    /* renamed from: a */
    public static int f131142a = -1;

    /* renamed from: b */
    public static int f131143b = -1;

    /* renamed from: c */
    public static Drawable f131144c;

    /* renamed from: e */
    public static final Companion f131145e = new Companion(null);

    /* renamed from: n */
    private static int f131146n = -1;

    /* renamed from: o */
    private static int f131147o = -1;

    /* renamed from: p */
    private static int f131148p = -1;

    /* renamed from: q */
    private static int f131149q = -1;

    /* renamed from: r */
    private static int f131150r = -1;

    /* renamed from: s */
    private static int f131151s = -1;

    /* renamed from: t */
    private static String f131152t = "       ";

    /* renamed from: u */
    private static Drawable f131153u;

    /* renamed from: f */
    private boolean f131154f;

    /* renamed from: g */
    private List<? extends C53061a> f131155g;

    /* renamed from: h */
    private Integer f131156h;

    /* renamed from: i */
    private Drawable f131157i;

    /* renamed from: j */
    private ReactionBaseFlowLayout.AbstractC53049d f131158j;

    /* renamed from: k */
    private ReactionFlowLayout.C53054b f131159k;

    /* renamed from: l */
    private int f131160l;

    /* renamed from: m */
    private boolean f131161m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/ReactionTextView$BackgroundSpan;", "Landroid/text/style/CharacterStyle;", "()V", "updateDrawState", "", "p0", "Landroid/text/TextPaint;", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.ReactionTextView$a */
    public static final class BackgroundSpan extends CharacterStyle {
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/ReactionTextView$Companion;", "", "()V", "DATA_SEPARATOR", "", "EMOJI_HEIGHT", "", "getEMOJI_HEIGHT$reaction_component_release", "()I", "setEMOJI_HEIGHT$reaction_component_release", "(I)V", "EMOJI_WIDTH", "getEMOJI_WIDTH$reaction_component_release", "setEMOJI_WIDTH$reaction_component_release", "HORIZONTAL_BACKGROUND_OFFSET", "SEPARATOR_LINE_BOTTOM_PADDING", "SEPARATOR_LINE_TOP_PADDING", "SEPARATOR_LINE_WIDTH", "SEPARATOR_WIDTH", "TAG", "VERTICAL_BACKGROUND_OFFSET", "sBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "sEmojiSeparator", "sSeparatorDrawable", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.ReactionTextView$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo181254a() {
            return ReactionTextView.f131143b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m205429a(SpannableString spannableString, String str, String str2) {
        if (!this.f131154f) {
            spannableString.setSpan(new SeparatorDrawableSpan(), str.length(), str.length() + str2.length(), 18);
        }
    }

    /* renamed from: a */
    private final void m205430a(C53061a aVar, SpannableString spannableString, String str) {
        int indexOf$default;
        if (!this.f131154f) {
            Iterator<C53062b> it = aVar.f131135c.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C53062b next = it.next();
                SpannableString spannableString2 = spannableString;
                String str2 = next.f131137b;
                Intrinsics.checkExpressionValueIsNotNull(str2, "reactionInfo.userName");
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableString2, str2, i, false, 4, (Object) null);
                if (indexOf$default2 > 0) {
                    i = indexOf$default2 + next.f131137b.length();
                    String str3 = aVar.f131133a;
                    Intrinsics.checkExpressionValueIsNotNull(str3, "reaction.reactionKey");
                    spannableString.setSpan(new ReactionClickableSpan(str3, next, false, this.f131159k), indexOf$default2, next.f131137b.length() + indexOf$default2, 33);
                } else if (i != -1 && i < spannableString.length() - 1) {
                    int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) spannableString2, '+', 0, false, 6, (Object) null);
                    if (lastIndexOf$default == -1) {
                        String str4 = aVar.f131133a;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "reaction.reactionKey");
                        spannableString.setSpan(new ReactionClickableSpan(str4, next, false, this.f131159k), i + 1, spannableString.length() - 1, 33);
                    } else {
                        int i2 = lastIndexOf$default - 1;
                        if (i < i2) {
                            String str5 = aVar.f131133a;
                            Intrinsics.checkExpressionValueIsNotNull(str5, "reaction.reactionKey");
                            spannableString.setSpan(new ReactionClickableSpan(str5, next, false, this.f131159k), i + 1, i2, 33);
                        }
                    }
                }
            }
            if (str != null && (indexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null)) != -1) {
                String str6 = aVar.f131133a;
                Intrinsics.checkExpressionValueIsNotNull(str6, "reaction.reactionKey");
                spannableString.setSpan(new ReactionClickableSpan(str6, null, true, this.f131159k), indexOf$default + 1, indexOf$default + str.length(), 33);
            }
        }
    }

    /* renamed from: a */
    private final boolean m205431a(int i) {
        return ((float) (getLayout().getLineBottom(i) - getLayout().getLineBaseline(i))) < getLineSpacingExtra();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/ReactionTextView$SeparatorDrawableSpan;", "Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/OffsetDynamicDrawableSpan;", "()V", "getDrawable", "Landroid/graphics/drawable/Drawable;", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.ReactionTextView$d */
    public static final class SeparatorDrawableSpan extends OffsetDynamicDrawableSpan {
        public SeparatorDrawableSpan() {
            super(1);
        }

        public Drawable getDrawable() {
            Drawable drawable = ReactionTextView.f131144c;
            if (drawable != null) {
                return drawable;
            }
            return new ShapeDrawable();
        }
    }

    public final void setOnlyShowCount(boolean z) {
        this.f131154f = z;
    }

    public final void setShownNamesNumberLimit(int i) {
        this.f131160l = i;
    }

    public final void setLineBackground(Drawable drawable) {
        if (drawable != null) {
            this.f131157i = drawable;
        }
    }

    public final void setOnContributorClickNew(ReactionFlowLayout.C53054b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onContributorClickNew");
        this.f131159k = bVar;
    }

    public final void setReactionClickListener(ReactionBaseFlowLayout.AbstractC53049d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f131158j = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.ReactionTextView$e */
    public static final class View$OnLongClickListenerC53064e implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ ReactionTextView f131166a;

        View$OnLongClickListenerC53064e(ReactionTextView reactionTextView) {
            this.f131166a = reactionTextView;
        }

        public final boolean onLongClick(View view) {
            return C52990a.m205240c(this.f131166a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReactionTextView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    private final void setupBackgroundSpan(SpannableString spannableString) {
        spannableString.setSpan(new BackgroundSpan(), 0, spannableString.length(), 17);
    }

    public void setMaxWidth(int i) {
        if (getMaxWidth() != i) {
            this.f131161m = true;
        }
        super.setMaxWidth(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0018\u00010\tR\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0018\u00010\tR\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/reaction/widget/flowlayout/reaction/ReactionTextView$ReactionClickableSpan;", "Landroid/text/style/ClickableSpan;", "reactionType", "", "info", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/SimpleUserInfo;", "isMore", "", "onContributorClickNew", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout$OnContributorClickNew;", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout;", "(Ljava/lang/String;Lcom/ss/android/lark/reaction/widget/flowlayout/bean/SimpleUserInfo;ZLcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout$OnContributorClickNew;)V", "mInfo", "mIsMore", "mOnContributorClickNew", "mReactionType", "onClick", "", "p0", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "reaction-component_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.ReactionTextView$c */
    public static final class ReactionClickableSpan extends ClickableSpan {

        /* renamed from: a */
        private final String f131162a;

        /* renamed from: b */
        private final C53062b f131163b;

        /* renamed from: c */
        private final boolean f131164c;

        /* renamed from: d */
        private final ReactionFlowLayout.C53054b f131165d;

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        }

        public void onClick(View view) {
            String str;
            Intrinsics.checkParameterIsNotNull(view, "p0");
            ReactionFlowLayout.C53054b bVar = this.f131165d;
            if (bVar != null) {
                C53062b bVar2 = this.f131163b;
                if (bVar2 != null) {
                    str = bVar2.f131136a;
                } else {
                    str = null;
                }
                bVar.mo181206a(str, this.f131162a, this.f131164c);
            }
        }

        public ReactionClickableSpan(String str, C53062b bVar, boolean z, ReactionFlowLayout.C53054b bVar2) {
            Intrinsics.checkParameterIsNotNull(str, "reactionType");
            this.f131162a = str;
            this.f131163b = bVar;
            this.f131164c = z;
            this.f131165d = bVar2;
        }
    }

    /* renamed from: a */
    private final int m205423a(String str) {
        Drawable a = C52986b.m205216a(getContext(), str);
        if (a == null) {
            return f131143b;
        }
        return (f131143b * a.getIntrinsicWidth()) / a.getIntrinsicHeight();
    }

    public final void setDividerColor(int i) {
        this.f131156h = Integer.valueOf(i);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        m205427a(context, true);
    }

    public final void setEnableLongClick(boolean z) {
        if (z) {
            setOnLongClickListener(new View$OnLongClickListenerC53064e(this));
        } else {
            setOnLongClickListener(null);
        }
    }

    public final void setReactionData(List<? extends C53061a> list) {
        if (!Intrinsics.areEqual(this.f131155g, list) || this.f131161m) {
            this.f131155g = list;
            if (list == null) {
                setText((CharSequence) null);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Pair<SpannableStringBuilder, Boolean> a = m205426a(list);
            Log.m165379d("ReactionView", "getSpanableResult cost:" + (System.currentTimeMillis() - currentTimeMillis));
            if (Intrinsics.areEqual(this.f131155g, list)) {
                if (a.getSecond().booleanValue()) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    layoutParams.width = getMaxWidth();
                    setLayoutParams(layoutParams);
                }
                this.f131161m = false;
                setText(a.getFirst());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        int i3;
        if (!(!(getText() instanceof SpannableString) || canvas == null || getLayout() == null)) {
            CharSequence text = getText();
            if (text != null) {
                SpannableString spannableString = (SpannableString) text;
                CharSequence text2 = getText();
                if (text2 != null) {
                    int i4 = 1;
                    BackgroundSpan[] aVarArr = (BackgroundSpan[]) ((SpannableString) text2).getSpans(0, getText().length() - 1, BackgroundSpan.class);
                    if (aVarArr != null) {
                        int length = aVarArr.length;
                        int i5 = 0;
                        while (i5 < length) {
                            BackgroundSpan aVar = aVarArr[i5];
                            int spanStart = spannableString.getSpanStart(aVar);
                            int spanEnd = spannableString.getSpanEnd(aVar);
                            int lineForOffset = getLayout().getLineForOffset(spanStart);
                            int lineForOffset2 = getLayout().getLineForOffset(spanEnd);
                            int primaryHorizontal = (int) (getLayout().getPrimaryHorizontal(spanStart) + ((float) (getLayout().getParagraphDirection(lineForOffset) * -1 * f131150r)) + ((float) getPaddingLeft()));
                            int primaryHorizontal2 = (int) (getLayout().getPrimaryHorizontal(spanEnd) + ((float) (getLayout().getParagraphDirection(lineForOffset2) * f131150r)) + ((float) getPaddingLeft()));
                            if (lineForOffset != getLineCount() - i4 || !m205431a(lineForOffset)) {
                                i = getLayout().getLineTop(lineForOffset) + getPaddingTop() + (f131151s * 4);
                                i2 = getLayout().getLineBottom(lineForOffset) + getPaddingTop();
                            } else {
                                i = (int) ((((float) (getLayout().getLineTop(lineForOffset) + getPaddingTop())) + getLineSpacingExtra()) - ((float) (f131151s / 2)));
                                i2 = (int) ((((float) (getLayout().getLineBottom(lineForOffset) + getPaddingTop())) + getLineSpacingExtra()) - ((float) f131151s));
                                CharSequence text3 = getText();
                                if (text3 != null) {
                                    ClickableDrawableSpan[] aVarArr2 = (ClickableDrawableSpan[]) ((SpannableString) text3).getSpans(spanStart, spanEnd, ClickableDrawableSpan.class);
                                    if (aVarArr2 != null) {
                                        if (aVarArr2.length == 0) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                        if ((i3 ^ i4) != 0) {
                                            aVarArr2[0].mo181279a(BitmapDescriptorFactory.HUE_RED, getLineSpacingExtra());
                                        }
                                    }
                                    CharSequence text4 = getText();
                                    if (text4 != null) {
                                        SeparatorDrawableSpan[] dVarArr = (SeparatorDrawableSpan[]) ((SpannableString) text4).getSpans(spanStart, spanEnd, SeparatorDrawableSpan.class);
                                        if (dVarArr != null) {
                                            if (dVarArr.length == 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (!z) {
                                                dVarArr[0].mo181279a(BitmapDescriptorFactory.HUE_RED, getLineSpacingExtra());
                                            }
                                        }
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type android.text.SpannableString");
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type android.text.SpannableString");
                                }
                            }
                            int min = Math.min(primaryHorizontal, primaryHorizontal2);
                            int max = Math.max(primaryHorizontal, primaryHorizontal2);
                            Drawable drawable = this.f131157i;
                            if (drawable != null) {
                                drawable.setBounds(min, i, max, i2);
                            }
                            Drawable drawable2 = this.f131157i;
                            if (drawable2 != null) {
                                drawable2.draw(canvas);
                            }
                            i5++;
                            i4 = 1;
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.text.SpannableString");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.text.SpannableString");
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private final Pair<SpannableStringBuilder, Boolean> m205426a(List<? extends C53061a> list) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        SpannableString spannableString;
        Log.m165389i("ReactionView", "use new reaction view");
        String a = C52990a.m205228a(getContext(), (int) R.string.Lark_Legacy_ReactionSeparator);
        float measureText = getPaint().measureText(f131152t);
        float maxWidth = (((float) getMaxWidth()) - ((float) getPaddingLeft())) - ((float) getPaddingRight());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        for (T t : list) {
            String str = '[' + t.f131133a + ']';
            String str2 = t.f131133a;
            Intrinsics.checkExpressionValueIsNotNull(str2, "reaction.reactionKey");
            int a2 = m205423a(str2);
            String str3 = null;
            Intrinsics.checkExpressionValueIsNotNull(a, "nameSeparator");
            Pair<String, Integer> a3 = m205425a(t, a);
            if (a3.getSecond().intValue() != this.f131160l || t.f131135c.size() <= this.f131160l) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str3 = C52990a.m205229a(getContext(), R.string.Lark_Legacy_PostReactionAppend, "count", String.valueOf(t.f131134b - a3.getSecond().intValue()));
                f2 = ((float) (f131146n + a2)) + getPaint().measureText(a3.getFirst());
                f = getPaint().measureText(str3);
            } else {
                f2 = (float) (f131146n + a2);
                f = getPaint().measureText(a3.getFirst());
            }
            float f3 = f2 + f;
            if (f3 >= ((float) getMaxWidth())) {
                z2 = true;
            } else {
                z2 = z4;
            }
            if (i2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int a4 = m205422a(a2, f3, i, maxWidth, t, measureText, z3, spannableStringBuilder);
            Pair<String, String> a5 = m205424a(a2, f3, maxWidth, a4, str3, t, a3.getFirst(), a);
            String first = a5.getFirst();
            String second = a5.getSecond();
            int measureText2 = a4 + ((int) getPaint().measureText(first)) + a2 + f131146n;
            if (this.f131154f) {
                spannableString = new SpannableString(str + first);
            } else {
                spannableString = new SpannableString(str + "|" + first);
            }
            m205428a(spannableString, t, str, a2);
            m205429a(spannableString, str, "|");
            m205430a(t, spannableString, second);
            setupBackgroundSpan(spannableString);
            spannableStringBuilder.append((CharSequence) spannableString);
            i2++;
            i = measureText2;
            z4 = z2;
        }
        return new Pair<>(spannableStringBuilder, Boolean.valueOf(z4));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0 && getLineCount() > 0 && m205431a(getLineCount() - 1)) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + ((int) getLineSpacingExtra()));
        }
    }

    /* renamed from: a */
    private final Pair<String, Integer> m205425a(C53061a aVar, String str) {
        if (this.f131154f) {
            return new Pair<>("", Integer.valueOf(aVar.f131134b));
        }
        StringBuilder sb = new StringBuilder();
        List<C53062b> list = aVar.f131135c;
        Intrinsics.checkExpressionValueIsNotNull(list, "reaction.userInfoList");
        Iterator<T> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            sb.append(it.next().f131137b);
            i++;
            if (i == this.f131160l) {
                break;
            }
            if (i2 < aVar.f131135c.size() - 1) {
                sb.append(str);
            }
            i2++;
        }
        return new Pair<>(sb.toString(), Integer.valueOf(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f131160l = 12;
        if (f131142a == -1) {
            f131142a = C52990a.m205224a(context, 20.0f);
        }
        if (f131143b == -1) {
            f131143b = C52990a.m205224a(context, 20.0f);
        }
        if (f131146n == -1) {
            f131146n = C52990a.m205224a(context, 14.5f);
        }
        if (f131147o == -1) {
            f131147o = C52990a.m205224a(context, 0.5f);
        }
        if (f131148p == -1) {
            f131148p = C52990a.m205224a(context, 5.0f);
        }
        if (f131149q == -1) {
            f131149q = C52990a.m205224a(context, 2.0f);
        }
        if (f131151s == -1) {
            f131151s = C52990a.m205224a(context, 1.0f);
        }
        if (f131150r == -1) {
            f131150r = C52990a.m205224a(context, 7.0f);
        }
        if (f131153u == null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            f131153u = shapeDrawable;
            float[] fArr = new float[8];
            C69043h.m265718a(fArr, 100.0f, 0, 8);
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            Drawable drawable = f131153u;
            if (drawable != null) {
                Paint paint = ((ShapeDrawable) drawable).getPaint();
                if (paint != null) {
                    paint.setColor(167772160);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.ShapeDrawable");
            }
        }
        this.f131157i = f131153u;
        m205427a(context, false);
        TextPaint paint2 = getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint2, "paint");
        paint2.setAntiAlias(true);
        setHighlightColor(0);
        setMovementMethod(C53068b.m205438a());
        setLineSpacing((float) C52990a.m205224a(context, 5.0f), 1.0f);
        setPadding(getPaddingLeft() + f131150r, getPaddingTop(), getPaddingRight() + f131150r, getPaddingBottom());
    }

    /* renamed from: a */
    private final void m205427a(Context context, boolean z) {
        int i;
        if (f131144c == null || z) {
            Bitmap createBitmap = Bitmap.createBitmap(f131146n, f131143b, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            Integer num = this.f131156h;
            if (num != null) {
                i = num.intValue();
            } else {
                i = C52990a.m205239c(context, R.color.line_divider_default);
            }
            paint.setColor(i);
            paint.setStrokeWidth(1.0f);
            float f = ((float) (f131146n - f131147o)) / 2.0f;
            canvas.drawLine(f, (float) f131148p, f, ((float) f131143b) - ((float) f131149q), paint);
            canvas.save();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
            f131144c = bitmapDrawable;
            if (bitmapDrawable != null) {
                bitmapDrawable.setBounds(0, 0, f131146n, f131143b);
            }
        }
    }

    /* renamed from: a */
    private final void m205428a(SpannableString spannableString, C53061a aVar, String str, int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        String str2 = aVar.f131133a;
        Intrinsics.checkExpressionValueIsNotNull(str2, "reaction.reactionKey");
        ReactionBaseFlowLayout.AbstractC53049d dVar = this.f131158j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReactionClickListener");
        }
        spannableString.setSpan(new ClickableDrawableSpan(context, str2, dVar, i), 0, str.length(), 18);
    }

    /* renamed from: a */
    private final int m205422a(int i, float f, int i2, float f2, C53061a aVar, float f3, boolean z, SpannableStringBuilder spannableStringBuilder) {
        String str;
        float f4 = (float) i2;
        boolean z2 = false;
        if (f + f4 + f3 > f2) {
            List<C53062b> list = aVar.f131135c;
            Intrinsics.checkExpressionValueIsNotNull(list, "reaction.userInfoList");
            if (!list.isEmpty()) {
                str = aVar.f131135c.get(0).f131137b;
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder(str);
            if (aVar.f131135c.size() > 1) {
                sb.append(C52990a.m205229a(getContext(), R.string.Lark_Legacy_PostReactionAppend, "count", String.valueOf(aVar.f131135c.size() - 1)));
            }
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "lineMinBuilder.toString()");
            float measureText = getPaint().measureText(sb2) + ((float) i) + ((float) f131146n);
            if ((f4 > f2 / ((float) 2) || measureText > (f2 - f4) - f3) && !z) {
                spannableStringBuilder.append("\n");
                i2 = 0;
                z2 = true;
            }
        }
        if (z2 || z) {
            return i2;
        }
        spannableStringBuilder.append((CharSequence) f131152t);
        return i2 + ((int) f3);
    }

    /* renamed from: a */
    private final Pair<String, String> m205424a(int i, float f, float f2, int i2, String str, C53061a aVar, String str2, String str3) {
        String str4;
        String str5;
        boolean z;
        String str6;
        float f3;
        String str7;
        int i3;
        boolean z2;
        boolean z3;
        String str8;
        if (this.f131154f) {
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(aVar.f131134b);
            return new Pair<>(sb.toString(), String.valueOf(aVar.f131134b));
        }
        float f4 = (float) i2;
        float f5 = f2 - f4;
        String str9 = "";
        if (f > f5) {
            String str10 = str;
            boolean z4 = true;
            if (str10 == null || str10.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || aVar.f131135c.size() <= 1) {
                str6 = str;
            } else {
                str6 = C52990a.m205229a(getContext(), R.string.Lark_Legacy_PostReactionAppend, "count", String.valueOf(aVar.f131134b));
            }
            if (str6 != null) {
                f3 = getPaint().measureText(str6);
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            String str11 = str2;
            float f6 = (f2 - f3) - f4;
            float f7 = (float) i;
            CharSequence ellipsize = TextUtils.ellipsize(str11, getPaint(), (f6 - f7) - ((float) f131146n), TextUtils.TruncateAt.END);
            if (aVar.f131135c.size() <= 1) {
                return new Pair<>(ellipsize.toString(), str6);
            }
            List<C53062b> list = aVar.f131135c;
            Intrinsics.checkExpressionValueIsNotNull(list, "reaction.userInfoList");
            Iterator<T> it = list.iterator();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    str7 = null;
                    i3 = 0;
                    break;
                }
                T next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(ellipsize, "ellipsizedLine");
                String str12 = next.f131137b;
                Intrinsics.checkExpressionValueIsNotNull(str12, "reactionInfo.userName");
                int indexOf$default = StringsKt.indexOf$default(ellipsize, str12, i5, false, 4, (Object) null);
                i5 = (next.f131137b.length() + indexOf$default) - 1;
                if (indexOf$default == -1) {
                    i3 = aVar.f131134b - i4;
                    if (ellipsize.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (str3.length() > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && ellipsize.length() >= str3.length() + 1) {
                            if (Intrinsics.areEqual(str3, ellipsize.subSequence((ellipsize.length() - 1) - str3.length(), ellipsize.length() - 1))) {
                                i3 = aVar.f131134b - i4;
                                ellipsize = StringsKt.removeRange(ellipsize, (ellipsize.length() - 1) - str3.length(), ellipsize.length() - 1);
                            }
                            if (i4 > 0) {
                                C53062b bVar = aVar.f131135c.get(i4 - 1);
                                if (!(bVar == null || (str8 = bVar.f131137b) == null)) {
                                    str9 = str8;
                                }
                                if (str9.length() <= 0) {
                                    z4 = false;
                                }
                                if (z4) {
                                    Intrinsics.checkExpressionValueIsNotNull(ellipsize, "ellipsizedLine");
                                    str7 = null;
                                    if (!StringsKt.endsWith$default(ellipsize, (CharSequence) (str9 + (char) 8230), false, 2, (Object) null)) {
                                        i3--;
                                    }
                                }
                            }
                        }
                    }
                    str7 = null;
                } else {
                    i4++;
                }
            }
            if (i3 > 0) {
                str5 = C52990a.m205229a(getContext(), R.string.Lark_Legacy_PostReactionAppend, "count", String.valueOf(i3));
                str4 = ellipsize.toString() + str5;
            } else {
                str5 = str7;
                str4 = TextUtils.ellipsize(str11, getPaint(), (f5 - f7) - ((float) f131146n), TextUtils.TruncateAt.END).toString();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (str != null) {
                str9 = str;
            }
            sb2.append(str9);
            str4 = sb2.toString();
            str5 = str;
        }
        return new Pair<>(str4, str5);
    }
}

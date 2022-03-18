package com.ss.android.lark.mm.widget.texthighlightbg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Annotation;
import android.text.Layout;
import android.text.Spanned;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Comparator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C69043h;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(R\u000e\u0010\n\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR\u000e\u0010\u001e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/MmTextHighlightBgHelper;", "", "horizontalPadding", "", "verticalPadding", "syncDrawable", "Landroid/graphics/drawable/Drawable;", "findDrawable", "findHighlightDrawable", "(IILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "commentDottedLineDrawable", "commentDottedUnderlineDrawable", "getFindDrawable", "()Landroid/graphics/drawable/Drawable;", "getFindHighlightDrawable", "getHorizontalPadding", "()I", "mentionBgDrawable", "multiLineRenderer", "Lcom/ss/android/lark/mm/widget/texthighlightbg/TextRoundedBgRenderer;", "getMultiLineRenderer", "()Lcom/ss/android/lark/mm/widget/texthighlightbg/TextRoundedBgRenderer;", "multiLineRenderer$delegate", "Lkotlin/Lazy;", "postCommentSelectionBgDrawable", "postCommentSelectionUnderlineDrawable", "singleLineRenderer", "getSingleLineRenderer", "singleLineRenderer$delegate", "getSyncDrawable", "viewOriginalTextSelectionBgDrawable", "draw", "", "context", "Landroid/content/Context;", "canvas", "Landroid/graphics/Canvas;", "text", "Landroid/text/Spanned;", "layout", "Landroid/text/Layout;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.b */
public final class MmTextHighlightBgHelper {

    /* renamed from: a */
    private final Drawable f118980a;

    /* renamed from: b */
    private final Drawable f118981b;

    /* renamed from: c */
    private final Drawable f118982c;

    /* renamed from: d */
    private final Drawable f118983d;

    /* renamed from: e */
    private final Drawable f118984e;

    /* renamed from: f */
    private final Drawable f118985f;

    /* renamed from: g */
    private final Lazy f118986g;

    /* renamed from: h */
    private final Lazy f118987h;

    /* renamed from: i */
    private final int f118988i;

    /* renamed from: j */
    private final Drawable f118989j;

    /* renamed from: k */
    private final Drawable f118990k;

    /* renamed from: l */
    private final Drawable f118991l;

    /* renamed from: b */
    private final TextRoundedBgRenderer m186888b() {
        return (TextRoundedBgRenderer) this.f118986g.getValue();
    }

    /* renamed from: c */
    private final TextRoundedBgRenderer m186889c() {
        return (TextRoundedBgRenderer) this.f118987h.getValue();
    }

    /* renamed from: a */
    public final int mo165875a() {
        return this.f118988i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/widget/texthighlightbg/MultiLineRenderer;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.b$b */
    static final class C47176b extends Lambda implements Function0<MultiLineRenderer> {
        final /* synthetic */ int $verticalPadding;
        final /* synthetic */ MmTextHighlightBgHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47176b(MmTextHighlightBgHelper bVar, int i) {
            super(0);
            this.this$0 = bVar;
            this.$verticalPadding = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MultiLineRenderer invoke() {
            return new MultiLineRenderer(this.this$0.mo165875a(), this.$verticalPadding);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/widget/texthighlightbg/SingleLineRenderer;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.b$c */
    static final class C47177c extends Lambda implements Function0<SingleLineRenderer> {
        final /* synthetic */ int $verticalPadding;
        final /* synthetic */ MmTextHighlightBgHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47177c(MmTextHighlightBgHelper bVar, int i) {
            super(0);
            this.this$0 = bVar;
            this.$verticalPadding = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SingleLineRenderer invoke() {
            return new SingleLineRenderer(this.this$0.mo165875a(), this.$verticalPadding);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.texthighlightbg.b$a */
    public static final class C47175a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            T t3 = t;
            Intrinsics.checkExpressionValueIsNotNull(t3, "it");
            String value = t3.getValue();
            Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
            T t4 = t2;
            Intrinsics.checkExpressionValueIsNotNull(t4, "it");
            String value2 = t4.getValue();
            Intrinsics.checkExpressionValueIsNotNull(value2, "it.value");
            return ComparisonsKt.compareValues(Integer.valueOf(Integer.parseInt(value)), Integer.valueOf(Integer.parseInt(value2)));
        }
    }

    /* renamed from: a */
    public final void mo165876a(Context context, Canvas canvas, Spanned spanned, Layout layout) {
        boolean z;
        int i;
        int spanStart;
        int spanEnd;
        TextRoundedBgRenderer eVar;
        Pair<Integer, ? extends Drawable> pair;
        Pair<Integer, ? extends Drawable> pair2;
        Pair<Integer, ? extends Drawable> pair3;
        Spanned spanned2 = spanned;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(spanned2, "text");
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned.length(), Annotation.class);
        Intrinsics.checkExpressionValueIsNotNull(annotationArr, "spans");
        if (annotationArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (annotationArr.length > 1) {
                C69043h.m265720a((Object[]) annotationArr, (Comparator) new C47175a());
            }
            int length = annotationArr.length;
            int i2 = 0;
            while (i2 < length) {
                Annotation annotation = annotationArr[i2];
                if (!(annotation instanceof MmAnnotationSpan) || (spanStart = spanned2.getSpanStart(annotation)) >= (spanEnd = spanned2.getSpanEnd(annotation)) || spanStart < 0 || spanEnd > spanned.length()) {
                    i = i2;
                } else {
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    int lineForOffset2 = layout.getLineForOffset(spanEnd);
                    int primaryHorizontal = (int) (layout.getPrimaryHorizontal(spanStart) + ((float) (layout.getParagraphDirection(lineForOffset) * -1 * this.f118988i)));
                    int primaryHorizontal2 = (int) (layout.getPrimaryHorizontal(spanEnd) + ((float) (layout.getParagraphDirection(lineForOffset2) * this.f118988i)));
                    if (lineForOffset == lineForOffset2) {
                        eVar = m186888b();
                    } else {
                        eVar = m186889c();
                    }
                    MmAnnotationSpan mmAnnotationSpan = (MmAnnotationSpan) annotation;
                    String value = mmAnnotationSpan.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "span.value");
                    int parseInt = Integer.parseInt(value);
                    if (parseInt == HighlightStyle.SYNC.getValue()) {
                        String value2 = mmAnnotationSpan.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value2, "span.value");
                        pair3 = new Pair<>(Integer.valueOf(Integer.parseInt(value2)), this.f118989j);
                    } else if (parseInt == HighlightStyle.KEYWORD_FIND.getValue()) {
                        String value3 = mmAnnotationSpan.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value3, "span.value");
                        pair3 = new Pair<>(Integer.valueOf(Integer.parseInt(value3)), this.f118990k);
                    } else if (parseInt == HighlightStyle.INDEX_KEYWORD_FIND.getValue()) {
                        String value4 = mmAnnotationSpan.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value4, "span.value");
                        pair3 = new Pair<>(Integer.valueOf(Integer.parseInt(value4)), this.f118991l);
                    } else {
                        if (parseInt == HighlightStyle.COMMENT_DOTTED_LINE.getValue()) {
                            pair2 = new Pair<>(Integer.valueOf(HighlightStyle.COMMENT_DOTTED_LINE.getValue()), this.f118980a);
                        } else if (parseInt == HighlightStyle.COMMENT_SELECTION_BG.getValue()) {
                            pair2 = new Pair<>(Integer.valueOf(HighlightStyle.COMMENT_SELECTION_BG.getValue()), this.f118981b);
                        } else if (parseInt == HighlightStyle.COMMENT_SELECTION_UNDERLINE.getValue()) {
                            pair2 = new Pair<>(Integer.valueOf(HighlightStyle.COMMENT_SELECTION_UNDERLINE.getValue()), this.f118982c);
                        } else if (parseInt == HighlightStyle.ORIGINAL_TEXT_BG.getValue()) {
                            pair2 = new Pair<>(Integer.valueOf(HighlightStyle.ORIGINAL_TEXT_BG.getValue()), this.f118983d);
                        } else if (parseInt == HighlightStyle.MENTION.getValue()) {
                            pair2 = new Pair<>(Integer.valueOf(HighlightStyle.MENTION.getValue()), this.f118984e);
                        } else {
                            pair2 = new Pair<>(Integer.valueOf(HighlightStyle.COMMENT_DOTTED_LINE.getValue()), this.f118985f);
                        }
                        pair = pair2;
                        i = i2;
                        eVar.mo165878a(context, canvas, pair, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2);
                    }
                    pair = pair3;
                    i = i2;
                    eVar.mo165878a(context, canvas, pair, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2);
                }
                i2 = i + 1;
                spanned2 = spanned;
            }
        }
    }

    public MmTextHighlightBgHelper(int i, int i2, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        Intrinsics.checkParameterIsNotNull(drawable, "syncDrawable");
        Intrinsics.checkParameterIsNotNull(drawable2, "findDrawable");
        Intrinsics.checkParameterIsNotNull(drawable3, "findHighlightDrawable");
        this.f118988i = i;
        this.f118989j = drawable;
        this.f118990k = drawable2;
        this.f118991l = drawable3;
        Context a = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
        this.f118980a = UDIconUtils.getIconDrawable(a, R.drawable.mm_comment_dotted_underline);
        Context a2 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmContext.getContext()");
        this.f118981b = UDIconUtils.getIconDrawable(a2, R.drawable.mm_post_comment_selection_bg);
        Context a3 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "MmContext.getContext()");
        this.f118982c = UDIconUtils.getIconDrawable(a3, R.drawable.mm_post_comment_selection_underline);
        Context a4 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MmContext.getContext()");
        this.f118983d = UDIconUtils.getIconDrawable(a4, R.drawable.mm_view_original_text_selection_bg);
        Context a5 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "MmContext.getContext()");
        this.f118984e = UDIconUtils.getIconDrawable(a5, R.drawable.mm_bg_mention);
        Context a6 = C45851c.m181646a();
        Intrinsics.checkExpressionValueIsNotNull(a6, "MmContext.getContext()");
        this.f118985f = UDIconUtils.getIconDrawable(a6, R.drawable.mm_comment_dotted_underline);
        this.f118986g = LazyKt.lazy(new C47177c(this, i2));
        this.f118987h = LazyKt.lazy(new C47176b(this, i2));
    }
}

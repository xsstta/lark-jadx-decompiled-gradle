package com.ss.android.lark.ai.textcorrection;

import android.text.Layout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextPositionHelper;", "", "()V", "Companion", "TextPositionData", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.i */
public final class TextPositionHelper {

    /* renamed from: a */
    public static final Companion f71767a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextPositionHelper$Companion;", "", "()V", "calTextPositionData", "Lcom/ss/android/lark/ai/textcorrection/TextPositionHelper$TextPositionData;", "view", "Landroid/widget/TextView;", "start", "", "end", "viewLoc", "", "calTextPositionDataAbs", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TextPositionData mo101659a(TextView textView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(textView, "view");
            int[] iArr = new int[2];
            textView.getLocationOnScreen(iArr);
            return mo101660a(textView, i, i2, iArr);
        }

        /* renamed from: a */
        public final TextPositionData mo101660a(TextView textView, int i, int i2, int[] iArr) {
            Intrinsics.checkParameterIsNotNull(textView, "view");
            Intrinsics.checkParameterIsNotNull(iArr, "viewLoc");
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            int[] iArr4 = new int[2];
            Layout layout = textView.getLayout();
            if (layout != null) {
                int lineForOffset = layout.getLineForOffset(i);
                int lineForOffset2 = layout.getLineForOffset(i2 - 1);
                iArr2[0] = ((int) layout.getPrimaryHorizontal(i)) + iArr[0];
                iArr2[1] = ((int) layout.getLineRight(lineForOffset)) + iArr[0];
                iArr3[0] = ((int) layout.getLineLeft(lineForOffset2)) + iArr[0];
                if (lineForOffset2 == layout.getLineForOffset(i2)) {
                    iArr3[1] = ((int) layout.getSecondaryHorizontal(i2)) + iArr[0];
                } else {
                    iArr3[1] = ((int) layout.getLineRight(lineForOffset2)) + iArr[0];
                }
                if (lineForOffset == lineForOffset2) {
                    iArr2[1] = iArr3[1];
                    iArr3[0] = iArr2[0];
                }
                iArr4[0] = (layout.getLineTop(lineForOffset) + iArr[1]) - textView.getScrollY();
                iArr4[1] = (layout.getLineBottom(lineForOffset2) + iArr[1]) - textView.getScrollY();
            }
            return new TextPositionData(i, i2, iArr2, iArr3, iArr4);
        }

        /* renamed from: a */
        public static /* synthetic */ TextPositionData m104687a(Companion aVar, TextView textView, int i, int i2, int[] iArr, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                iArr = new int[2];
            }
            return aVar.mo101660a(textView, i, i2, iArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextPositionHelper$TextPositionData;", "", "start", "", "end", "firstLineH", "", "lastLineH", "vertical", "(II[I[I[I)V", "getEnd", "()I", "setEnd", "(I)V", "getFirstLineH", "()[I", "setFirstLineH", "([I)V", "getLastLineH", "setLastLineH", "getStart", "setStart", "getVertical", "setVertical", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.i$b */
    public static final class TextPositionData {

        /* renamed from: a */
        private int f71768a;

        /* renamed from: b */
        private int f71769b;

        /* renamed from: c */
        private int[] f71770c;

        /* renamed from: d */
        private int[] f71771d;

        /* renamed from: e */
        private int[] f71772e;

        /* renamed from: a */
        public final int[] mo101661a() {
            return this.f71770c;
        }

        /* renamed from: b */
        public final int[] mo101662b() {
            return this.f71771d;
        }

        /* renamed from: c */
        public final int[] mo101663c() {
            return this.f71772e;
        }

        public TextPositionData(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            Intrinsics.checkParameterIsNotNull(iArr, "firstLineH");
            Intrinsics.checkParameterIsNotNull(iArr2, "lastLineH");
            Intrinsics.checkParameterIsNotNull(iArr3, "vertical");
            this.f71768a = i;
            this.f71769b = i2;
            this.f71770c = iArr;
            this.f71771d = iArr2;
            this.f71772e = iArr3;
        }
    }
}

package com.ss.android.lark.utils;

import android.text.InputFilter;
import android.text.Spanned;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J>\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/utils/EditTextLengthFilter;", "Landroid/text/InputFilter;", "mLength", "", "listener", "Lcom/ss/android/lark/utils/EditTextLengthFilter$ExceedLengthListener;", "(ILcom/ss/android/lark/utils/EditTextLengthFilter$ExceedLengthListener;)V", "filter", "", ShareHitPoint.f121868c, "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "Companion", "ExceedLengthListener", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.p */
public final class EditTextLengthFilter implements InputFilter {

    /* renamed from: a */
    public static final Companion f142484a = new Companion(null);

    /* renamed from: b */
    private final int f142485b;

    /* renamed from: c */
    private final ExceedLengthListener f142486c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/utils/EditTextLengthFilter$ExceedLengthListener;", "", "onExceed", "", "originString", "", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.p$b */
    public interface ExceedLengthListener {
        /* renamed from: a */
        void mo134006a(CharSequence charSequence);
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m224560a(CharSequence charSequence, int i, int i2) {
        return f142484a.mo196212a(charSequence, i, i2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final CharSequence m224561b(CharSequence charSequence, int i, int i2) {
        return f142484a.mo196213b(charSequence, i, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J$\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/utils/EditTextLengthFilter$Companion;", "", "()V", "THRESHOLD", "", "getLength", ShareHitPoint.f121868c, "", "start", "end", "subString", "maxLength", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.p$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final int mo196212a(CharSequence charSequence, int i, int i2) {
            int i3;
            int i4;
            int i5 = 0;
            if (charSequence != null && i <= i2 && i < charSequence.length()) {
                int min = Math.min(i2, charSequence.length());
                for (int max = Math.max(i, 0); max < min; max = i3) {
                    i3 = max + 1;
                    char charAt = charSequence.charAt(max);
                    boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                    int i6 = charAt;
                    i6 = charAt;
                    if (isHighSurrogate && i3 < min) {
                        char charAt2 = charSequence.charAt(i3);
                        i6 = charAt;
                        if (Character.isLowSurrogate(charAt2)) {
                            i3++;
                            i6 = Character.toCodePoint(charAt, charAt2);
                        }
                    }
                    if (i6 >= 2048) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    i5 += i4;
                }
            }
            return i5;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.CharSequence mo196213b(java.lang.CharSequence r9, int r10, int r11) {
            /*
                r8 = this;
                if (r9 == 0) goto L_0x004e
                if (r10 >= 0) goto L_0x0005
                goto L_0x004e
            L_0x0005:
                r0 = 0
                int r1 = java.lang.Math.max(r10, r0)
                int r2 = r9.length()
            L_0x000e:
                if (r1 >= r2) goto L_0x004d
                int r3 = r1 + 1
                char r1 = r9.charAt(r1)
                boolean r4 = java.lang.Character.isHighSurrogate(r1)
                r5 = 2
                r6 = 1
                if (r4 == 0) goto L_0x0032
                if (r3 >= r2) goto L_0x0032
                char r4 = r9.charAt(r3)
                boolean r7 = java.lang.Character.isLowSurrogate(r4)
                if (r7 == 0) goto L_0x0032
                int r3 = r3 + 1
                int r1 = java.lang.Character.toCodePoint(r1, r4)
                r4 = 2
                goto L_0x0033
            L_0x0032:
                r4 = 1
            L_0x0033:
                r7 = 2048(0x800, float:2.87E-42)
                if (r1 < r7) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r5 = 1
            L_0x0039:
                int r0 = r0 + r5
                if (r0 != r11) goto L_0x0041
                java.lang.CharSequence r9 = r9.subSequence(r10, r3)
                return r9
            L_0x0041:
                int r1 = r11 + 1
                if (r0 != r1) goto L_0x004b
                int r3 = r3 - r4
                java.lang.CharSequence r9 = r9.subSequence(r10, r3)
                return r9
            L_0x004b:
                r1 = r3
                goto L_0x000e
            L_0x004d:
                return r9
            L_0x004e:
                r9 = 0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.EditTextLengthFilter.Companion.mo196213b(java.lang.CharSequence, int, int):java.lang.CharSequence");
        }
    }

    public EditTextLengthFilter(int i, ExceedLengthListener bVar) {
        this.f142485b = i;
        this.f142486c = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditTextLengthFilter(int i, ExceedLengthListener bVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bVar);
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        int i6 = this.f142485b;
        Companion aVar = f142484a;
        Spanned spanned2 = spanned;
        if (spanned != null) {
            i5 = spanned.length();
        } else {
            i5 = 0;
        }
        int a = i6 - (aVar.mo196212a(spanned2, 0, i5) - aVar.mo196212a(spanned2, i3, i4));
        if (a <= 0) {
            ExceedLengthListener bVar = this.f142486c;
            if (bVar != null) {
                bVar.mo134006a(spanned2);
            }
            return "";
        } else if (a >= aVar.mo196212a(charSequence, i, i2)) {
            return null;
        } else {
            ExceedLengthListener bVar2 = this.f142486c;
            if (bVar2 != null) {
                bVar2.mo134006a(spanned2);
            }
            return aVar.mo196213b(charSequence, i, a);
        }
    }
}

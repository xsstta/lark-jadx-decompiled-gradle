package com.ss.android.lark.moments.impl.publish.hashtag;

import android.text.Editable;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n0\tj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n`\u000b2\u0006\u0010\f\u001a\u00020\u0003\u001a\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0001\u001aV\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032.\u0010\u001b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n0\tj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n`\u000b\u001a\u0016\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u0012\u0010\u001d\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"HASH_TAG_PREFIX", "", "HTTP", "", "HTTPS", "MAX_TOPIC_COUNT", "", "MAX_TOPIC_LENGTH", "findTopic", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "text", "isAfterAUrl", "", "s", "", "selection", "isUrlCharAt", C60375c.f150914a, "replace", "", "start", "end", "editable", "Landroid/text/Editable;", "hashTag", "currentHashTags", "validHashTagStart", "skipUrl", "im_moments-wrapper_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.hashtag.c */
public final class C47987c {
    /* renamed from: a */
    public static final ArrayList<Pair<Integer, Integer>> m189445a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        ArrayList<Pair<Integer, Integer>> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            int a = m189444a(str, i);
            if (a >= str.length()) {
                break;
            } else if (str.charAt(a) != '#') {
                i = a + 1;
            } else {
                int i3 = a + 1;
                while (i3 < str.length() && Character.isLetterOrDigit(str.charAt(i3)) && i3 < a + 51 && !StringsKt.startsWith$default(str, "https://", i3, false, 4, (Object) null) && !StringsKt.startsWith$default(str, "http://", i3, false, 4, (Object) null)) {
                    i3++;
                }
                if (i3 - a > 1) {
                    arrayList.add(new Pair<>(Integer.valueOf(a), Integer.valueOf(i3)));
                    i2++;
                    if (i2 >= 100) {
                        break;
                    }
                }
                i = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final boolean m189447a(char c) {
        if (('a' > c || 'z' < c) && (('A' > c || 'Z' < c) && (('0' > c || '9' < c) && !StringsKt.contains$default((CharSequence) ";:@&=+$,/?-_.~!*'()[]{}|\\^`#%", c, false, 2, (Object) null)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m189444a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "$this$skipUrl");
        if (StringsKt.startsWith$default(str, "https://", i, false, 4, (Object) null)) {
            i += 8;
            while (i < str.length() && m189447a(str.charAt(i))) {
                i++;
            }
        } else if (StringsKt.startsWith$default(str, "http://", i, false, 4, (Object) null)) {
            i += 7;
            while (i < str.length()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static final boolean m189449b(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        if (i > charSequence.length()) {
            return false;
        }
        do {
            i--;
            if (i < 0 || !m189447a(charSequence.charAt(i))) {
                return false;
            }
            if (StringsKt.startsWith$default(charSequence, (CharSequence) "https://", i, false, 4, (Object) null)) {
                return true;
            }
        } while (!StringsKt.startsWith$default(charSequence, (CharSequence) "http://", i, false, 4, (Object) null));
        return true;
    }

    /* renamed from: a */
    public static final boolean m189448a(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        if (i <= 0 || i > charSequence.length()) {
            return false;
        }
        int i2 = i - 1;
        if (charSequence.charAt(i2) != '#') {
            return false;
        }
        return !m189449b(charSequence, i2);
    }

    /* renamed from: a */
    public static final void m189446a(int i, int i2, Editable editable, String str, ArrayList<Pair<Integer, Integer>> arrayList) {
        Intrinsics.checkParameterIsNotNull(editable, "editable");
        Intrinsics.checkParameterIsNotNull(str, "hashTag");
        Intrinsics.checkParameterIsNotNull(arrayList, "currentHashTags");
        for (T t : arrayList) {
            if (i > ((Number) t.getFirst()).intValue() && i2 <= ((Number) t.getSecond()).intValue()) {
                if ((((Number) t.getSecond()).intValue() < 0 || ((Number) t.getSecond()).intValue() >= editable.length() || editable.charAt(((Number) t.getSecond()).intValue()) == ' ') && i != editable.length()) {
                    editable.replace(((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue(), str);
                    return;
                }
                editable.replace(((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue(), str + ' ');
                return;
            }
        }
        if (i == i2 && i > 0 && i <= editable.length()) {
            int i3 = i - 1;
            if (editable.charAt(i3) != '#') {
                return;
            }
            if ((i < 0 || i >= editable.length() || editable.charAt(i) == ' ') && i != editable.length()) {
                editable.replace(i3, i, str);
                return;
            }
            editable.replace(i3, i, str + ' ');
        }
    }
}

package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.emoji.EmojiData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.base.b */
public final class C58503b {

    /* renamed from: a */
    private static final Map<Integer, Integer> f144345a = EmojiMapHandler.m226959b();

    /* renamed from: b */
    private static final Map<String, Integer> f144346b = EmojiMapHandler.m226958a();

    /* renamed from: c */
    private static final SparseIntArray f144347c;

    /* renamed from: d */
    private static Map<String, Integer> f144348d = new HashMap((int) DynamicModule.f58006b);

    /* renamed from: e */
    private static Map<String, String> f144349e = new ConcurrentHashMap((int) DynamicModule.f58006b);

    /* renamed from: f */
    private static Pattern f144350f = Pattern.compile("(?<=\\[)([^\\[]\\S*?)(?=\\])");

    /* renamed from: g */
    private static final int f144351g = UIHelper.dp2px(1.0f);

    /* renamed from: b */
    private static int m226967b(int i) {
        if (i == 35) {
            return R.drawable.emoji_0023;
        }
        if (i == 42) {
            return R.drawable.emoji_002a_20e3;
        }
        switch (i) {
            case 48:
                return R.drawable.emoji_0030;
            case 49:
                return R.drawable.emoji_0031;
            case MmListControl.f116813f:
                return R.drawable.emoji_0032;
            case 51:
                return R.drawable.emoji_0033;
            case 52:
                return R.drawable.emoji_0034;
            case 53:
                return R.drawable.emoji_0035;
            case 54:
                return R.drawable.emoji_0036;
            case 55:
                return R.drawable.emoji_0037;
            case 56:
                return R.drawable.emoji_0038;
            case 57:
                return R.drawable.emoji_0039;
            default:
                return 0;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f144347c = sparseIntArray;
        sparseIntArray.put(127995, 1);
        sparseIntArray.put(127996, 1);
        sparseIntArray.put(127997, 1);
        sparseIntArray.put(127998, 1);
        sparseIntArray.put(127999, 1);
    }

    /* renamed from: a */
    private static int m226962a(int i) {
        Integer num = f144345a.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public static int m226968b(String str) {
        Integer num;
        Integer num2;
        if (TextUtils.isEmpty(str) || (num = f144346b.get(EmojiData.getEmojiKeyFromReactionKey(str))) == null || (num2 = f144345a.get(num)) == null) {
            return 0;
        }
        return num2.intValue();
    }

    /* renamed from: a */
    public static CharSequence m226963a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = f144350f.matcher(charSequence);
        if (!matcher.find()) {
            return charSequence;
        }
        matcher.reset();
        StringBuilder sb = new StringBuilder(charSequence);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.start(1);
            matcher.end(1);
            if (!TextUtils.isEmpty(group)) {
                String str = "[" + group + "]";
                Map<String, Integer> map = f144346b;
                if (map.get(str) == null) {
                    continue;
                } else {
                    int[] iArr = {map.get(str).intValue()};
                    int indexOf = sb.indexOf(str);
                    int length = str.length() + indexOf;
                    if (indexOf >= 0 && length <= sb.length()) {
                        sb = sb.replace(indexOf, length, new String(iArr, 0, 1));
                        i++;
                        if (i >= 200) {
                            break;
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m226964a(String str) {
        int codePointAt;
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int charCount = Character.charCount(Character.codePointAt(str, i));
            int i2 = i + charCount;
            if (i2 < length) {
                int codePointAt2 = Character.codePointAt(str, i2);
                if (codePointAt2 == 65039) {
                    int charCount2 = Character.charCount(codePointAt2);
                    int i3 = i2 + charCount2;
                    if (i3 < length && (codePointAt = Character.codePointAt(str, i3)) == 8419) {
                        charCount += charCount2 + Character.charCount(codePointAt);
                    }
                } else if (codePointAt2 == 8419) {
                    charCount += Character.charCount(codePointAt2);
                }
            }
            int i4 = charCount + i;
            CharSequence subSequence = str.subSequence(i, i4);
            int length2 = subSequence.length();
            for (int i5 = 0; i5 < length2; i5 += Character.charCount(subSequence.toString().codePointAt(i5))) {
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : hashMap.keySet()) {
            int indexOf = sb.indexOf(str2);
            int length3 = str2.length();
            while (true) {
                int i6 = length3 + indexOf;
                if (indexOf != -1 && i6 <= sb.length()) {
                    sb = sb.replace(indexOf, i6, (String) hashMap.get(str2));
                    indexOf = sb.indexOf(str2);
                    length3 = str2.length();
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m226966a(Context context, Spannable spannable, int i, int i2, int i3, boolean z) {
        m226965a(context, spannable, i, i2, i3, 0, -1, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        if (r2 == 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        if (r2 == 0) goto L_0x0095;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m226965a(android.content.Context r15, android.text.Spannable r16, int r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.linked_emojicon.base.C58503b.m226965a(android.content.Context, android.text.Spannable, int, int, int, int, int, boolean):void");
    }
}

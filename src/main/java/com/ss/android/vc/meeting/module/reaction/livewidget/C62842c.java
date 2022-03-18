package com.ss.android.vc.meeting.module.reaction.livewidget;

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

/* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.c */
public final class C62842c {

    /* renamed from: a */
    private static final Map<Integer, Integer> f158215a = VCEmojiMapHandler.m245976b();

    /* renamed from: b */
    private static final Map<String, Integer> f158216b = VCEmojiMapHandler.m245975a();

    /* renamed from: c */
    private static final SparseIntArray f158217c;

    /* renamed from: d */
    private static Map<String, Integer> f158218d = new HashMap((int) DynamicModule.f58006b);

    /* renamed from: e */
    private static Map<String, String> f158219e = new ConcurrentHashMap((int) DynamicModule.f58006b);

    /* renamed from: f */
    private static Pattern f158220f = Pattern.compile("(?<=\\[)([^\\[]\\S*?)(?=\\])");

    /* renamed from: g */
    private static final int f158221g = UIHelper.dp2px(1.0f);

    /* renamed from: b */
    private static int m245985b(int i) {
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
        f158217c = sparseIntArray;
        sparseIntArray.put(127995, 1);
        sparseIntArray.put(127996, 1);
        sparseIntArray.put(127997, 1);
        sparseIntArray.put(127998, 1);
        sparseIntArray.put(127999, 1);
    }

    /* renamed from: a */
    private static int m245981a(int i) {
        Integer num = f158215a.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public static int m245986b(String str) {
        Integer num;
        Integer num2;
        if (TextUtils.isEmpty(str) || (num = f158216b.get(EmojiData.getEmojiKeyFromReactionKey(str))) == null || (num2 = f158215a.get(num)) == null) {
            return 0;
        }
        return num2.intValue();
    }

    /* renamed from: a */
    public static CharSequence m245982a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = f158220f.matcher(charSequence);
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
                Map<String, Integer> map = f158216b;
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
    public static String m245983a(String str) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        if (r2 == 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        if (r2 == 0) goto L_0x0095;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m245984a(android.content.Context r15, android.text.Spannable r16, int r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.reaction.livewidget.C62842c.m245984a(android.content.Context, android.text.Spannable, int, int, int, int, int, boolean):void");
    }
}

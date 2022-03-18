package com.bytedance.ee.bear.lark.p417e;

import android.util.LongSparseArray;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.lark.e.a */
public class C8033a {

    /* renamed from: a */
    private static final LongSparseArray<Integer> f21524a;

    /* renamed from: a */
    public static boolean m32094a(long j) {
        return j == 6 || j == 7;
    }

    /* renamed from: b */
    public static int m32095b() {
        return R.string.Lark_Chat_CardPart3CurrentSubPage;
    }

    /* renamed from: b */
    public static boolean m32096b(long j) {
        return j >= 6 && j <= 12;
    }

    /* renamed from: c */
    public static int m32097c() {
        return R.string.Lark_Chat_CardPart3CurrentPage;
    }

    /* renamed from: a */
    public static LongSparseArray<Integer> m32093a() {
        return f21524a;
    }

    static {
        LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
        f21524a = longSparseArray;
        longSparseArray.put(2, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus2));
        longSparseArray.put(3, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus3));
        longSparseArray.put(4, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus4));
        longSparseArray.put(5, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus5));
        longSparseArray.put(6, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus6));
        longSparseArray.put(7, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus7));
        longSparseArray.put(8, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus8));
        longSparseArray.put(9, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus9));
        longSparseArray.put(10, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus10));
        longSparseArray.put(11, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus11));
        longSparseArray.put(12, Integer.valueOf((int) R.string.Lark_Docs_ShareDocs_DefaultInfo));
        longSparseArray.put(13, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus13));
        longSparseArray.put(14, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus14));
        longSparseArray.put(15, Integer.valueOf((int) R.string.Lark_Docs_ChatDocsPermissionStatus15));
    }
}

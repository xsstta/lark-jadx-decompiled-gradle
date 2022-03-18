package com.ss.android.lark.utils.p2906c;

import android.content.Context;
import com.larksuite.framework.utils.C26308n;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.utils.c.a */
public class C57815a {
    /* renamed from: b */
    public static String m224354b(Context context) {
        return C26308n.m95257c(context) + "/span";
    }

    /* renamed from: c */
    private static String m224355c(Context context) {
        return C26308n.m95257c(context) + "/share_temp/";
    }

    /* renamed from: d */
    private static String m224356d(Context context) {
        return C26308n.m95258d(context) + "/zip/";
    }

    /* renamed from: e */
    private static String m224357e(Context context) {
        return C26308n.m95257c(context) + "/update/";
    }

    /* renamed from: f */
    private static String m224358f(Context context) {
        return C26308n.m95257c(context) + "/audio/";
    }

    /* renamed from: g */
    private static String m224359g(Context context) {
        return C26308n.m95257c(context) + "/download/";
    }

    /* renamed from: h */
    private static String m224360h(Context context) {
        return C26308n.m95257c(context) + "/MediaCover/";
    }

    /* renamed from: i */
    private static String m224361i(Context context) {
        return C26308n.m95257c(context) + "/picture/rust/";
    }

    /* renamed from: j */
    private static String m224362j(Context context) {
        return C26308n.m95257c(context) + "/nativeCrash/";
    }

    /* renamed from: k */
    private static String m224363k(Context context) {
        return C26308n.m95257c(context) + "/log/";
    }

    /* renamed from: l */
    private static String m224364l(Context context) {
        return C26308n.m95257c(context) + "/crashLog/";
    }

    /* renamed from: m */
    private static String m224365m(Context context) {
        return C26308n.m95257c(context) + "/zip/";
    }

    /* renamed from: n */
    private static String m224366n(Context context) {
        return C57881t.m224616a(context) + "/docs/";
    }

    /* renamed from: o */
    private static String m224367o(Context context) {
        return C26308n.m95256b(context) + "/rich_text/";
    }

    /* renamed from: p */
    private static String m224368p(Context context) {
        return C26308n.m95258d(context) + "/so_decompressed/";
    }

    /* renamed from: q */
    private static String m224369q(Context context) {
        return C26308n.m95256b(context) + "/video_thumb_cache/";
    }

    /* renamed from: a */
    public static List<File> m224353a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new File(m224363k(context)));
        arrayList.add(new File(m224364l(context)));
        arrayList.add(new File(m224362j(context)));
        arrayList.add(new File(m224365m(context)));
        arrayList.add(new File(m224367o(context)));
        arrayList.add(new File(m224366n(context)));
        arrayList.add(new File(m224369q(context)));
        arrayList.add(new File(m224368p(context)));
        arrayList.add(new File(m224361i(context)));
        arrayList.add(new File(m224360h(context)));
        arrayList.add(new File(m224359g(context)));
        arrayList.add(new File(m224358f(context)));
        arrayList.add(new File(m224357e(context)));
        arrayList.add(new File(m224356d(context)));
        arrayList.add(new File(m224355c(context)));
        arrayList.add(new File(m224354b(context)));
        return arrayList;
    }
}

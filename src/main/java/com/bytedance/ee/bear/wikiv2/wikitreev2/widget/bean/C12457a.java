package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import android.text.TextUtils;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.a */
public class C12457a {

    /* renamed from: a */
    public final String f33392a;

    /* renamed from: b */
    public boolean f33393b;

    /* renamed from: c */
    public int f33394c;

    public String toString() {
        return "Ns{uid='" + C13721c.m55650d(this.f33392a) + '\'' + ", expand=" + this.f33393b + ", level=" + this.f33394c + '}';
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.a$a */
    public static final class C12458a {
        /* renamed from: b */
        public static String m51812b(String str) {
            return m51809a(str, 1);
        }

        /* renamed from: c */
        public static String m51813c(String str) {
            return m51809a(str, 0);
        }

        /* renamed from: a */
        public static boolean m51811a(String str) {
            return C12459b.m51816a(m51813c(str));
        }

        /* renamed from: a */
        private static String m51809a(String str, int i) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!str.contains("-")) {
                return str;
            }
            String[] split = str.split("-");
            if (split == null || i < 0 || i >= split.length) {
                return "";
            }
            return split[i];
        }

        /* renamed from: a */
        public static String m51810a(String str, TreeNode treeNode, int i) {
            if (i <= 0 || !C12459b.m51816a(str)) {
                return treeNode.wiki_token;
            }
            return str + "-" + treeNode.wiki_token + "-" + i;
        }
    }

    public C12457a(String str) {
        this.f33392a = str;
    }
}

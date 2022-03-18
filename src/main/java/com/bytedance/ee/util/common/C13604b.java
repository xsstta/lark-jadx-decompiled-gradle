package com.bytedance.ee.util.common;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.common.b */
public class C13604b {

    /* renamed from: a */
    private static boolean f35766a;

    /* renamed from: a */
    public static void m55234a(boolean z) {
        f35766a = z;
    }

    /* renamed from: a */
    public static int m55233a(Map<String, String> map) {
        if (map != null) {
            return C13721c.m55641a(map.get("unread_badge_count"), 0);
        }
        return 0;
    }

    /* renamed from: b */
    public static String m55238b(Uri uri) {
        if (uri == null || !TextUtils.equals(uri.getQueryParameter("from"), "docs_feed")) {
            return "unknown";
        }
        return "docs_feed";
    }

    /* renamed from: c */
    public static String m55241c(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return "";
        }
        return parse.getQueryParameter("docId");
    }

    /* renamed from: a */
    public static boolean m55236a(Uri uri) {
        if (uri == null || !TextUtils.equals(uri.getQueryParameter("sourceType"), "feed")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m55239b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return m55238b(Uri.parse(str));
        }
        return "unknown";
    }

    /* renamed from: a */
    public static boolean m55237a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return m55236a(Uri.parse(str));
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m55240b(Map<String, String> map) {
        int a = m55233a(map);
        if (m55235a(a, m55242c(map))) {
            C13479a.m54764b("FeedUtils", "is a share count, so don't show feed panel.");
            return false;
        } else if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static String m55242c(Map<String, String> map) {
        if (map != null) {
            String str = map.get("doc_message_type");
            if (!TextUtils.isEmpty(str)) {
                switch (C13721c.m55641a(str, 0)) {
                    case 0:
                        return "unknown";
                    case 1:
                        return "mention";
                    case 2:
                        return Comment.f24093e;
                    case 3:
                        return "reply";
                    case 4:
                        return "solve";
                    case 5:
                        return "share";
                    case 6:
                        return "reopen";
                    case 7:
                        return "reaction";
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m55235a(int i, String str) {
        if (i != 1 || !TextUtils.equals("share", str)) {
            return false;
        }
        return true;
    }
}

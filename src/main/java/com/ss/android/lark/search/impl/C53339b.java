package com.ss.android.lark.search.impl;

import com.ss.android.lark.search.C53258a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.b */
public class C53339b {

    /* renamed from: a */
    private static final Map<String, Boolean> f131836a;

    /* renamed from: b */
    private static boolean f131837b = false;

    /* renamed from: e */
    public static void m206445e() {
        f131837b = true;
    }

    /* renamed from: d */
    public static boolean m206444d() {
        return f131837b;
    }

    /* renamed from: a */
    public static boolean m206441a() {
        return C53258a.m205939a().mo181745a("lark.search.api.main.local.disable");
    }

    /* renamed from: c */
    public static boolean m206443c() {
        return C53258a.m205939a().mo181745a("group.role.obeserver");
    }

    /* renamed from: f */
    public static boolean m206446f() {
        return C53258a.m205939a().mo181745a("lark.search.feedback.ui.redesign");
    }

    /* renamed from: j */
    public static boolean m206450j() {
        return C53258a.m205939a().mo181745a("search.filter.docs_slide");
    }

    /* renamed from: k */
    public static boolean m206451k() {
        return C53258a.m205939a().mo181745a("search.filter.docs_mindnote");
    }

    /* renamed from: l */
    public static boolean m206452l() {
        return C53258a.m205939a().mo181745a("search.doc.bitablefilter");
    }

    /* renamed from: m */
    public static boolean m206453m() {
        return C53258a.m205939a().mo181745a("search.doc.share");
    }

    /* renamed from: n */
    public static boolean m206454n() {
        return C53258a.m205939a().mo181745a("lark.search.doc.wiki.filter");
    }

    /* renamed from: b */
    public static boolean m206442b() {
        if (C53258a.m205939a().mo181745a("lark.search.main.tab.more.disable") || C53329a.m206412b()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m206447g() {
        if (!m206446f() || C53258a.m205939a().mo181745a("lark.search.feedback.ui.redesign.bottom.disable")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m206448h() {
        if (C53329a.m206412b() || C53258a.m205939a().mo181745a("lark.search.common.recommend.disable")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m206449i() {
        if (C53258a.m205939a().mo181745a("oncall.enable") || C53258a.m205939a().mo181745a("oncall.enable.pre_ga")) {
            return true;
        }
        return false;
    }

    static {
        HashMap hashMap = new HashMap();
        f131836a = hashMap;
        hashMap.put("search.filter.docs_slide", false);
        hashMap.put("search.filter.docs_mindnote", false);
        hashMap.put("search.doc.bitablefilter", false);
        hashMap.put("search.doc.share", false);
        hashMap.put("app.join.group.chat", false);
        hashMap.put("oncall.enable", false);
        hashMap.put("oncall.enable.pre_ga", false);
        hashMap.put("lark.feed.openapp.v2", false);
        hashMap.put("search.topic.enabled", false);
        hashMap.put("lark.search.toastoff", false);
        hashMap.put("suite.search.patch.chatinside.msg.empty", true);
        hashMap.put("lark.search.main.smart", true);
        hashMap.put("lark.search.v2.api", false);
        hashMap.put("lark.search.v2.api.local", true);
        hashMap.put("lark.search.api.main.local.disable", false);
        hashMap.put("lark.search.main.tab.more.disable", false);
        hashMap.put("group.role.obeserver", false);
        hashMap.put("messenger.message_folder_receive", false);
        hashMap.put("lark.search.feedback.ui.redesign", true);
        hashMap.put("lark.search.feedback.ui.redesign.bottom.disable", false);
        hashMap.put("lark.search.erase.invisible.char.disable", false);
        hashMap.put("lark.search.display.num.of.chars.disable", false);
        hashMap.put("lark.search.mobile.qa.card", false);
        hashMap.put("lark.search.mobile.service.card", false);
        hashMap.put("lark.search.common.recommend.disable", false);
        hashMap.put("lark.search.common.recommend.smart_search", false);
        hashMap.put("lark.search.common.recommend.message", false);
        hashMap.put("lark.search.common.recommend.group", false);
        hashMap.put("lark.search.common.recommend.contact", false);
        hashMap.put("lark.search.common.recommend.doc", false);
        hashMap.put("lark.search.common.recommend.app", false);
        hashMap.put("lark.search.common.recommend.oncall", false);
        hashMap.put("lark.search.common.recommend.hasmore", false);
        hashMap.put("lark.search.doc.tab", false);
    }
}

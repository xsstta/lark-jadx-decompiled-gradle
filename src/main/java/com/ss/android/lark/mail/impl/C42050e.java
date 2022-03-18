package com.ss.android.lark.mail.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.e */
public class C42050e {

    /* renamed from: a */
    private static final Map<String, Boolean> f106713a;

    static {
        HashMap hashMap = new HashMap();
        f106713a = hashMap;
        hashMap.put("larkmail.cli.largefile.phase2", false);
        hashMap.put("larkmail.cli.auto_translate_attachment", false);
        hashMap.put("larkmail.cli.harmfulattachment", false);
        hashMap.put("larkmail.cli.quicklabel", false);
        hashMap.put("larkmail.cli.coedit", false);
        hashMap.put("larkmail.cli.alerttabicon", false);
        hashMap.put("larkmail.cli.prestartweb", false);
        hashMap.put("larkmail.cli.jsblockreload", false);
        hashMap.put("larkmail.cli.webprocess", false);
        hashMap.put("larkmail.cli.readmail.firstframe", false);
        hashMap.put("larkmail.cli.readmail.pushoptimize", false);
        hashMap.put("larkmail.cli.bigmailkillprocess", false);
        hashMap.put("larkmail.cli.movelabel", false);
        hashMap.put("larkmail.cli.clientonboarding.phase1", false);
        hashMap.put("larkmail.cli.clientonboarding.phase2b", false);
        hashMap.put("larkmail.cli.maillinglist.setting", false);
        hashMap.put("larkmail.cli.mobile.readmail.lazyloaditem", false);
        hashMap.put("larkmail.cli.readmail.unreadpreload", false);
        hashMap.put("larkmail.cli.readmail.contentsearch", false);
        hashMap.put("larkmail.cli.autotranslation", false);
        hashMap.put("larkmail.cli.send_separately", false);
        hashMap.put("lark.mail.send_status", false);
        hashMap.put("contact.contactcards.email", false);
        hashMap.put("larkmail.cli.deleteexternaladdress", false);
        hashMap.put("larkmail.cli.atuser", true);
        hashMap.put("larkmail.cli.mobile_editor_kit", false);
        hashMap.put("larkmail.cli.column_quote_style", false);
        hashMap.put("larkmail.cli.support_more_fonts", false);
        hashMap.put("larkmail.cli.mention.addto", false);
        hashMap.put("larkmail.cli.translaterecommend", false);
        hashMap.put("larkmail.cli.folder", false);
        hashMap.put("larkmail.cli.folder_gmail", false);
        hashMap.put("larkmail.cli.mobile.process.over.stretch", true);
        hashMap.put("larkmail.cli.mobile.thread.list.page.size", false);
        hashMap.put("larkmail.cli.mobile.message.list.reuse.downloaded.images", false);
        hashMap.put("larkmail.cli.image.multi.copy", false);
        hashMap.put("larkmail.cli.non_conversation_mode", false);
        hashMap.put("larkmail.cli.non_conversation_mode_internal", false);
        hashMap.put("larkmail.cli.conversation_onboarding", false);
        hashMap.put("larkmail.cli.conversation_setting", false);
        hashMap.put("larkmail.cli.hide_ai_point", false);
        hashMap.put("larkmail.cli.home.preload_with_unread_mail", false);
        hashMap.put("larkmail.cli.new_bot_notification", false);
        hashMap.put("larkmail.cli.enterprise.signature", false);
    }

    /* renamed from: a */
    public static boolean m167247a(String str) {
        Map<String, Boolean> map = f106713a;
        if (map.containsKey(str)) {
            return map.get(str).booleanValue();
        }
        return false;
    }
}

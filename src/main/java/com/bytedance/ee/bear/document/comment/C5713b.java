package com.bytedance.ee.bear.document.comment;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.comment.b */
public class C5713b {
    /* renamed from: a */
    public JSONObject mo22806a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("comment_id", (Object) str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        jSONObject.put("from", (Object) str2);
        jSONObject.put("action", (Object) "switchCard");
        return jSONObject;
    }

    /* renamed from: a */
    public void mo22807a(AbstractC4931i iVar, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("height", (Object) Integer.valueOf(i));
        iVar.mo19428a("javascript:lark.biz.util.setPanelHeight", jSONObject);
    }

    /* renamed from: a */
    public void mo22811a(AbstractC4931i iVar, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("commentPanelOpen", (Object) Boolean.valueOf(z));
        iVar.mo19428a("javascript:lark.biz.feed.hideMessages", jSONObject);
    }

    /* renamed from: a */
    public void mo22808a(AbstractC4931i iVar, String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", "feed");
        jSONObject.put("referType", (Object) Integer.valueOf(i));
        jSONObject.put("token", (Object) str);
        C13479a.m54772d("PublishCommentHandler", "dumpToLikeList:" + jSONObject.toString());
        iVar.mo19428a("javascript:lark.biz.util.openlikesList", jSONObject);
    }

    /* renamed from: a */
    public void mo22809a(AbstractC4931i iVar, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("commentId", (Object) str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        jSONObject.put("replyId", (Object) str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        jSONObject.put("from", (Object) str3);
        C13479a.m54772d("PublishCommentHandler", "scrollToCommentFromFeed:" + jSONObject.toString());
        iVar.mo19428a("javascript:lark.biz.comment.activate", jSONObject);
    }

    /* renamed from: a */
    public void mo22810a(AbstractC4931i iVar, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isGlobalComment", (Object) Boolean.valueOf(z));
        jSONObject.put("mentionId", (Object) str);
        jSONObject.put("replyId", (Object) str2);
        C13479a.m54772d("PublishCommentHandler", "scrollToMention:" + jSONObject.toString());
        iVar.mo19428a("javascript:lark.biz.feed.scrollToMessage", jSONObject);
    }

    /* renamed from: a */
    public void mo22812a(AbstractC4931i iVar, boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isGlobalComment", (Object) Boolean.valueOf(z));
        jSONObject.put("commentId", (Object) str);
        jSONObject.put("replyId", (Object) str2);
        iVar.mo19428a("javascript:lark.biz.feed.scrollToMessage", jSONObject);
    }
}

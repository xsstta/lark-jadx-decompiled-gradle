package com.bytedance.ee.bear.document.comment.bean;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.text.C69981e;

public class ShowCardsJsData extends NetService.Result implements Serializable {
    private List<Card> cards;
    private String cur_comment_id;
    private String cur_reply_id;
    private String from = "";
    private List<Card> globalComments;
    public Per permission = new Per();
    private int position = -1;
    private String tmpCommentId;
    private String token;

    public List<Card> getCards() {
        return this.cards;
    }

    public String getCur_comment_id() {
        return this.cur_comment_id;
    }

    public String getCur_reply_id() {
        return this.cur_reply_id;
    }

    public String getFrom() {
        return this.from;
    }

    public List<Card> getGlobalComments() {
        return this.globalComments;
    }

    public int getPosition() {
        return this.position;
    }

    public String getTmpCommentId() {
        return this.tmpCommentId;
    }

    public String getToken() {
        return this.token;
    }

    public boolean hasCards() {
        List<Card> list = this.cards;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ShowCardsJsData{, cur_comment_id='" + this.cur_comment_id + '\'' + ", cur_reply_id='" + this.cur_reply_id + '\'' + ", token='" + C13598b.m55197d(this.token) + '\'' + ", position=" + this.position + ", tmpCommentId=" + this.tmpCommentId + '}';
    }

    public void setCards(List<Card> list) {
        this.cards = list;
    }

    public void setCur_comment_id(String str) {
        this.cur_comment_id = str;
    }

    public void setCur_reply_id(String str) {
        this.cur_reply_id = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setGlobalComments(List<Card> list) {
        this.globalComments = list;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setTmpCommentId(String str) {
        this.tmpCommentId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public static String decodeString(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return C69981e.m268411d(str);
            } catch (Exception e) {
                C13479a.m54759a("ShowCardsJsData", "parse exception!", e);
            }
        }
        return str;
    }
}

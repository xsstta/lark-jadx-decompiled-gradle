package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class CardBean implements NonProguard {

    public static class ContentBean implements NonProguard {
        public Content content;

        public static class Content implements NonProguard {
            public List<List<Content2>> content;
            public Header header;

            public static class Content2 implements NonProguard {
                public I18n i18n;
                public String tag = "text";
                public String text;

                public static class I18n implements NonProguard {
                    public String en_us;
                    public String ja_jp;
                    public String zh_cn;
                }
            }

            public static class Header implements NonProguard {
                public String href;
                public String tag;
                public String user_id;
            }
        }
    }

    public static ContentBean parseContent(MessageBean messageBean) {
        return (ContentBean) JSON.parseObject(messageBean.getContent(), ContentBean.class);
    }

    public static boolean isComment(MessageBean messageBean) {
        if ("comment_solve".equals(messageBean.getSubType()) || "comment_reopen".equals(messageBean.getSubType()) || "reaction".equals(messageBean.getSubType())) {
            return true;
        }
        return false;
    }
}

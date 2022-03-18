package com.bytedance.ee.bear.lark.notification.docfeed.entity;

import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.notification.export.entity.Notice;
import java.util.Map;

public class DocFeedNotice extends Notice {
    private DocFeed docFeed;
    private Map<String, DocMessage> docMessageMap;

    public DocFeed getDocFeed() {
        return this.docFeed;
    }

    public Map<String, DocMessage> getDocMessageMap() {
        return this.docMessageMap;
    }

    public DocFeedNotice(DocFeed docFeed2, Map<String, DocMessage> map, Notice notice) {
        super(notice);
        this.docFeed = docFeed2;
        this.docMessageMap = map;
    }
}

package com.bytedance.ee.bear.lark.notification.docfeed;

import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.c */
public class C8047c {

    /* renamed from: a */
    DocFeed f21565a;

    /* renamed from: b */
    List<DocMessage> f21566b;

    /* renamed from: b */
    public String mo31121b() {
        DocFeed docFeed = this.f21565a;
        if (docFeed != null) {
            return docFeed.getTitle();
        }
        return "";
    }

    /* renamed from: c */
    public String mo31122c() {
        DocFeed docFeed = this.f21565a;
        if (docFeed == null) {
            return "";
        }
        return docFeed.getUrl();
    }

    /* renamed from: d */
    public String mo31123d() {
        DocFeed docFeed = this.f21565a;
        if (docFeed == null) {
            return "";
        }
        return docFeed.getId();
    }

    /* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.c$1 */
    static /* synthetic */ class C80481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21567a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.doc.entity.DocMessage$Type[] r0 = com.ss.android.lark.doc.entity.DocMessage.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.f21567a = r0
                com.ss.android.lark.doc.entity.DocMessage$Type r1 = com.ss.android.lark.doc.entity.DocMessage.Type.REPLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.f21567a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.doc.entity.DocMessage$Type r1 = com.ss.android.lark.doc.entity.DocMessage.Type.COMMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.f21567a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.doc.entity.DocMessage$Type r1 = com.ss.android.lark.doc.entity.DocMessage.Type.MENTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.f21567a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.doc.entity.DocMessage$Type r1 = com.ss.android.lark.doc.entity.DocMessage.Type.SOLVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.f21567a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.doc.entity.DocMessage$Type r1 = com.ss.android.lark.doc.entity.DocMessage.Type.SHARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.f21567a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.doc.entity.DocMessage$Type r1 = com.ss.android.lark.doc.entity.DocMessage.Type.REOPEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.lark.notification.docfeed.C8047c.C80481.<clinit>():void");
        }
    }

    /* renamed from: a */
    public String mo31119a() {
        List<DocMessage> list = this.f21566b;
        if (list == null || list.isEmpty()) {
            return "";
        }
        DocMessage docMessage = this.f21566b.get(0);
        DocMessage.Type type = docMessage.getType();
        String fromName = docMessage.getFromName();
        String content = docMessage.getContent();
        if (((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30986a() == null) {
            return "";
        }
        switch (C80481.f21567a[type.ordinal()]) {
            case 1:
                HashMap hashMap = new HashMap();
                hashMap.put("name", fromName);
                hashMap.put("content", content);
                return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedDocMessageReplayTp, hashMap);
            case 2:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", fromName);
                hashMap2.put("content", content);
                return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedDocMessageCommentTp, hashMap2);
            case 3:
                return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedDocMessageAtTp, "name", fromName);
            case 4:
                return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedDocMessageSolveTp, "name", fromName);
            case 5:
                return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedDocMessageShareTp, "name", fromName);
            case 6:
                return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedDocMessageReopen, "name", fromName);
            default:
                return "";
        }
    }

    /* renamed from: a */
    public List<DocMessage> mo31120a(Map<String, DocMessage> map) {
        if (map == null) {
            return new ArrayList();
        }
        List<String> docMessageIds = this.f21565a.getDocMessageIds();
        if (docMessageIds == null || docMessageIds.isEmpty()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        for (String str : docMessageIds) {
            DocMessage docMessage = map.get(str);
            if (docMessage != null) {
                linkedList.add(docMessage);
            }
        }
        return linkedList;
    }

    public C8047c(DocFeed docFeed, Map<String, DocMessage> map) {
        this.f21565a = docFeed;
        this.f21566b = mo31120a(map);
    }
}

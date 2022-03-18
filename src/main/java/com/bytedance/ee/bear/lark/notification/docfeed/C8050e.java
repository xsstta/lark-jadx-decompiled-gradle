package com.bytedance.ee.bear.lark.notification.docfeed;

import com.bytedance.ee.bear.lark.notification.docfeed.entity.DocFeedNotice;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsRequest;
import com.bytedance.lark.pb.space.doc.v1.MGetDocFeedsResponse;
import com.ss.android.lark.doc.entity.C36836a;
import com.ss.android.lark.doc.entity.DocFeed;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.lark.notification.docfeed.e */
public class C8050e implements AbstractNotification.AbstractC48495b<DocFeedNotice> {
    @Override // com.ss.android.lark.notification.export.AbstractNotification.AbstractC48495b
    /* renamed from: b */
    public int mo31139b(Notice notice) {
        return 0;
    }

    /* renamed from: a */
    private C36836a m32177a(List<String> list) {
        C36836a aVar = (C36836a) SdkSender.sendRequest(Command.MGET_DOC_FEEDS, new MGetDocFeedsRequest.C19269a().mo65737a(list), new SdkSender.IParser<C36836a>() {
            /* class com.bytedance.ee.bear.lark.notification.docfeed.C8050e.C80511 */

            /* renamed from: a */
            public C36836a parse(byte[] bArr) throws IOException {
                return C8056h.m32195a(MGetDocFeedsResponse.ADAPTER.decode(bArr).entity);
            }
        });
        if (aVar == null) {
            return new C36836a(new HashMap(), new HashMap());
        }
        return new C36836a(aVar.mo135951a(), aVar.mo135953b());
    }

    /* renamed from: a */
    public DocFeedNotice mo31140c(Notice notice) {
        if (notice.extra.f122013l != 3) {
            C13479a.m54758a("DocNotification", "channel is null or channel NoticeType is not doc");
            return null;
        }
        String str = notice.extra.f122014m;
        C36836a a = m32177a(Collections.singletonList(str));
        if (a == null) {
            C13479a.m54758a("DocNotification", "docFeedsResult is null !");
            return null;
        }
        DocFeed docFeed = a.mo135951a().get(str);
        if (docFeed != null) {
            return new DocFeedNotice(docFeed, a.mo135953b(), notice);
        }
        C13479a.m54758a("DocNotification", "docFeed is null !");
        return null;
    }
}

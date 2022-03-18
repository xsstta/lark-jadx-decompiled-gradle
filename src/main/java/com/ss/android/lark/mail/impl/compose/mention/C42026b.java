package com.ss.android.lark.mail.impl.compose.mention;

import com.bytedance.lark.pb.email.client.v1.MailAtContactResponse;
import com.bytedance.lark.pb.email.client.v1.SearchMemberInfo;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.compose.mention.b */
public class C42026b {

    /* renamed from: a */
    public AbstractC42028a f106651a;

    /* renamed from: b */
    public long f106652b;

    /* renamed from: c */
    private final String f106653c = "MentionHandler";

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.mention.b$a */
    public interface AbstractC42028a {
        /* renamed from: a */
        void mo151025a(List<SearchMemberInfo> list);
    }

    /* renamed from: a */
    public void mo151041a() {
        AbstractC42028a aVar = this.f106651a;
        if (aVar != null) {
            aVar.mo151025a(null);
        }
    }

    C42026b(AbstractC42028a aVar) {
        this.f106651a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo151042a(String str) {
        Log.m165389i("MentionHandler", "fetchMentionContactList");
        this.f106652b = System.currentTimeMillis();
        C42176e.m168344a().mo152257g(str, String.valueOf(this.f106652b), new IGetDataCallback<MailAtContactResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.C42026b.C420271 */

            /* renamed from: a */
            long f106654a;

            {
                this.f106654a = C42026b.this.f106652b;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("MentionHandler", "fetchMentionContactList onError");
                C42026b.this.mo151041a();
            }

            /* renamed from: a */
            public void onSuccess(MailAtContactResponse mailAtContactResponse) {
                Log.m165389i("MentionHandler", "fetchMentionContactList onSuccess");
                if (this.f106654a < C42026b.this.f106652b) {
                    Log.m165389i("MentionHandler", "fetchMentionContactList obsolete response");
                } else if (mailAtContactResponse == null) {
                    Log.m165383e("MentionHandler", "fetchMentionContactList empty response");
                    C42026b.this.mo151041a();
                } else if (C42026b.this.f106651a != null) {
                    C42026b.this.f106651a.mo151025a(mailAtContactResponse.members);
                }
            }
        });
    }
}

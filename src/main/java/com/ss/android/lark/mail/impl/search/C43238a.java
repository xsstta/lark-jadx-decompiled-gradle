package com.ss.android.lark.mail.impl.search;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.email.client.v1.MailSearchHistoryRequest;
import com.bytedance.lark.pb.email.client.v1.MailSearchHistoryResponse;
import com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderRequest;
import com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailSimpleSearchRequest;
import com.bytedance.lark.pb.email.client.v1.MailSimpleSearchResponse;
import com.bytedance.lark.pb.email.client.v1.MessagesSummary;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.action.PushMultiThreadAction;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.SearchRet;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42311s;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42312t;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42316u;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.search.p2214a.C43254b;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vesdk.utils.C64078a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.search.a */
public class C43238a {

    /* renamed from: a */
    public final Context f110022a;

    /* renamed from: b */
    public AbstractC43251a f110023b;

    /* renamed from: c */
    public final ArrayList<MailThread> f110024c = new ArrayList<>();

    /* renamed from: d */
    public List<String> f110025d;

    /* renamed from: e */
    public C43256b f110026e;

    /* renamed from: f */
    public final String f110027f;

    /* renamed from: g */
    private final String f110028g = "SearchDataManager";

    /* renamed from: h */
    private final String f110029h = "_";

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.search.a$a */
    public interface AbstractC43251a {
        /* renamed from: a */
        void mo154805a(List<MailThread> list);

        /* renamed from: a */
        void mo154806a(List<MailThread> list, Boolean bool);

        /* renamed from: b */
        void mo154808b(List<String> list);

        /* renamed from: i */
        void mo154817i();

        /* renamed from: j */
        void mo154818j();

        /* renamed from: k */
        void mo154819k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<MailThread> mo154842c() {
        return this.f110024c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<String> mo154843d() {
        return this.f110025d;
    }

    /* renamed from: e */
    public String mo154844e() {
        C43256b bVar = this.f110026e;
        if (bVar == null) {
            return "";
        }
        return bVar.mo154868d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154835a() {
        MailSearchHistoryRequest.C16866a aVar = new MailSearchHistoryRequest.C16866a();
        aVar.f43331b = MailSearchHistoryRequest.SerchHistoryAction.QUERY;
        SdkSender.asynSendRequestNonWrap(Command.MAIL_SEARCH_HISTORY_REQUEST, aVar, new IGetDataCallback<MailSearchHistoryResponse>() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.C432487 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SearchDataManager", "fetchSearchHistory onError");
            }

            /* renamed from: a */
            public void onSuccess(MailSearchHistoryResponse mailSearchHistoryResponse) {
                Log.m165389i("SearchDataManager", "fetchSearchHistory onSuccess");
                C43238a.this.f110025d = mailSearchHistoryResponse.keywords;
                if (C43238a.this.f110023b != null) {
                    C43238a.this.f110023b.mo154808b(C43238a.this.f110025d);
                }
            }
        }, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.C432498 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return MailSearchHistoryResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo154840b() {
        MailSearchHistoryRequest.C16866a aVar = new MailSearchHistoryRequest.C16866a();
        aVar.f43331b = MailSearchHistoryRequest.SerchHistoryAction.DELETE_ALL;
        SdkSender.asynSendRequestNonWrap(Command.MAIL_SEARCH_HISTORY_REQUEST, aVar, new IGetDataCallback<MailSearchHistoryResponse>() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SearchDataManager", "clearSearchHistory onError");
            }

            /* renamed from: a */
            public void onSuccess(MailSearchHistoryResponse mailSearchHistoryResponse) {
                Log.m165389i("SearchDataManager", "clearSearchHistory onSuccess");
                if (C43238a.this.f110023b != null) {
                    C43238a.this.f110025d = null;
                    C43238a.this.f110023b.mo154818j();
                }
            }
        }, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.AnonymousClass12 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return MailSearchHistoryResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo154841b(List<MailThread> list) {
        SearchRet searchRet;
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (MailThread mailThread : list) {
            if (mailThread instanceof SearchRet) {
                searchRet = (SearchRet) mailThread;
            } else {
                searchRet = null;
            }
            if (!(searchRet == null || searchRet.mo151757I() == null)) {
                hashMap.put(searchRet.mo151757I(), searchRet);
                arrayList.add(searchRet.mo151757I());
            }
        }
        MailSearchInWhichFolderRequest.C16870a aVar = new MailSearchInWhichFolderRequest.C16870a();
        aVar.mo59692a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.MAIL_SEARCH_FOLDER, aVar, new IGetDataCallback<MailSearchInWhichFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.C432423 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SearchDataManager", "updateFolder onError");
            }

            /* renamed from: a */
            public void onSuccess(final MailSearchInWhichFolderResponse mailSearchInWhichFolderResponse) {
                Log.m165389i("SearchDataManager", "updateFolder onSuccess");
                if (mailSearchInWhichFolderResponse == null || mailSearchInWhichFolderResponse.message_folders == null) {
                    Log.m165383e("SearchDataManager", "updateFolder onSuccess but got invalid response");
                } else {
                    CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.search.C43238a.C432423.RunnableC432431 */

                        public void run() {
                            SearchRet searchRet;
                            for (MailSearchInWhichFolderResponse.MessageInFolders messageInFolders : mailSearchInWhichFolderResponse.message_folders) {
                                if (messageInFolders != null) {
                                    C43254b bVar = new C43254b();
                                    bVar.mo154860a(messageInFolders.folders);
                                    MailLabelEntity mailLabelEntity = (MailLabelEntity) bVar.mo154856a();
                                    if (messageInFolders.message_id == null) {
                                        searchRet = null;
                                    } else {
                                        searchRet = (SearchRet) hashMap.get(messageInFolders.message_id);
                                    }
                                    if (!(searchRet == null || mailLabelEntity == null)) {
                                        searchRet.mo151764g(mailLabelEntity.mo151527k());
                                    }
                                }
                            }
                            if (C43238a.this.f110023b != null) {
                                C43238a.this.f110023b.mo154805a(C43238a.this.f110024c);
                            }
                        }
                    });
                }
            }
        }, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.C432444 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return MailSearchInWhichFolderResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154837a(String str) {
        MailSearchHistoryRequest.C16866a aVar = new MailSearchHistoryRequest.C16866a();
        aVar.f43331b = MailSearchHistoryRequest.SerchHistoryAction.INSERT;
        aVar.f43330a = str;
        SdkSender.asynSendRequestNonWrap(Command.MAIL_SEARCH_HISTORY_REQUEST, aVar, new IGetDataCallback<MailSearchHistoryResponse>() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.C432509 */

            /* renamed from: a */
            public void onSuccess(MailSearchHistoryResponse mailSearchHistoryResponse) {
                Log.m165389i("SearchDataManager", "addSearchHistory onSuccess");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SearchDataManager", "addSearchHistory onError");
            }
        }, new SdkSender.IParser() {
            /* class com.ss.android.lark.mail.impl.search.C43238a.AnonymousClass10 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return MailSearchHistoryResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo154839a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f110024c.size(); i++) {
            MailThread mailThread = this.f110024c.get(i);
            if (!(mailThread == null || mailThread.mo151676a() == null || !list.contains(mailThread.mo151676a()))) {
                arrayList.add(mailThread.mo151676a());
            }
        }
        if (arrayList.size() > 0) {
            C42176e.m168344a().mo152215a("SEARCH", arrayList, 0, new IGetDataCallback<PushMultiThreadAction.C41799a>() {
                /* class com.ss.android.lark.mail.impl.search.C43238a.C432402 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(final PushMultiThreadAction.C41799a aVar) {
                    if (aVar != null) {
                        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.search.C43238a.C432402.RunnableC432411 */

                            public void run() {
                                HashMap hashMap;
                                HashMap hashMap2 = null;
                                if (aVar.mo150330b() != null) {
                                    hashMap = new HashMap();
                                    for (String str : aVar.mo150330b()) {
                                        hashMap.put(str, str);
                                    }
                                } else {
                                    hashMap = null;
                                }
                                if (aVar.mo150329a() != null) {
                                    hashMap2 = new HashMap();
                                    for (MailThread mailThread : aVar.mo150329a()) {
                                        hashMap2.put(mailThread.mo151676a(), mailThread);
                                    }
                                }
                                if (C432402.this.mo154848a(hashMap, hashMap2) && C43238a.this.f110023b != null) {
                                    C43238a.this.f110023b.mo154805a(C43238a.this.f110024c);
                                }
                                C43238a.this.mo154841b(C43238a.this.f110024c);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public boolean mo154848a(Map<String, String> map, Map<String, MailThread> map2) {
                    boolean z = false;
                    if (!((map == null || map.size() == 0) && (map2 == null || map2.size() == 0))) {
                        for (int size = C43238a.this.f110024c.size() - 1; size >= 0; size--) {
                            MailThread mailThread = C43238a.this.f110024c.get(size);
                            MailThread mailThread2 = null;
                            if ((map != null ? map.get(mailThread.mo151676a()) : null) != null) {
                                C43238a.this.f110024c.remove(size);
                            } else {
                                if (map2 != null) {
                                    mailThread2 = map2.get(mailThread.mo151676a());
                                }
                                if (mailThread2 != null) {
                                    AbsChangeMailAction.m165925a(mailThread2, mailThread);
                                    if (mailThread instanceof SearchRet) {
                                        ((SearchRet) mailThread).mo151765g(mailThread2.mo151723r());
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    return z;
                }
            });
        }
    }

    /* renamed from: a */
    public ArrayList<MailThread> mo154834a(List<MessagesSummary> list, String str) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList<MailThread> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            SearchRet searchRet = new SearchRet(list.get(i), str);
            arrayList.add(searchRet);
            Log.m165389i("SearchDataManager", "changeToSearchRetList  folder id: " + searchRet.mo151756H() + "   labels: " + searchRet.mo151755G());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154836a(MailLabelEntity mailLabelEntity, boolean z) {
        Log.m165389i("SearchDataManager", "updateLabel");
        if (mailLabelEntity != null && !TextUtils.isEmpty(mailLabelEntity.mo151527k()) && !CollectionUtils.isEmpty(this.f110024c)) {
            String k = mailLabelEntity.mo151527k();
            Iterator<MailThread> it = this.f110024c.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                MailThread next = it.next();
                if (next != null && !CollectionUtils.isEmpty(next.mo151723r())) {
                    int size = next.mo151723r().size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        MailLabelEntity mailLabelEntity2 = next.mo151723r().get(i);
                        if (mailLabelEntity2 == null || TextUtils.isEmpty(mailLabelEntity2.mo151527k()) || !mailLabelEntity2.mo151527k().equals(k)) {
                            i++;
                        } else {
                            if (z) {
                                next.mo151723r().remove(i);
                            } else {
                                mailLabelEntity2.mo151503b(mailLabelEntity.mo151526j());
                                mailLabelEntity2.mo151497a(mailLabelEntity.mo151518f());
                                mailLabelEntity2.mo151512d(mailLabelEntity.mo151528l());
                            }
                            z2 = true;
                        }
                    }
                }
            }
            if (z2 && this.f110023b != null) {
                Log.m165389i("SearchDataManager", "updateLabel changed");
                this.f110023b.mo154805a(this.f110024c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154838a(final String str, final boolean z) {
        long j;
        Log.m165389i("SearchDataManager", "fetchSearchData");
        Context context = this.f110022a;
        String str2 = null;
        if (context != null) {
            if (z) {
                ((C42316u) C42344d.m169091a(C42316u.class, context)).mo152380b((String) null);
            } else {
                ((C42312t) C42344d.m169091a(C42312t.class, context)).mo152380b((String) null);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                C43256b bVar = this.f110026e;
                if (bVar == null) {
                    Log.m165383e("SearchDataManager", "fetchSearchData invalid search tag, can not be load more");
                    return;
                } else if (!str.equals(bVar.mo154862a())) {
                    Log.m165383e("SearchDataManager", "fetchSearchData invalid search tag, can not be load more");
                    return;
                } else if (TextUtils.isEmpty(this.f110026e.mo154868d())) {
                    Log.m165383e("SearchDataManager", "fetchSearchData empty search session");
                    return;
                } else if (!this.f110026e.mo154866b()) {
                    Log.m165383e("SearchDataManager", "fetchSearchData no more");
                    return;
                } else if (this.f110026e.mo154869e() == this.f110026e.mo154867c()) {
                    Log.m165383e("SearchDataManager", "fetchSearchData duplicate request");
                    return;
                } else {
                    j = this.f110026e.mo154867c();
                    str2 = this.f110026e.mo154868d();
                }
            } else {
                j = 0;
                CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.search.C43238a.RunnableC432391 */

                    public void run() {
                        C43238a.this.f110024c.clear();
                    }
                });
            }
            m171829a(str, j, str2);
            C43257c.m171869a(this.f110026e.mo154868d());
            MailSimpleSearchRequest.C16900a aVar = new MailSimpleSearchRequest.C16900a();
            aVar.f43381a = this.f110026e.mo154868d();
            aVar.f43382b = this.f110026e.mo154862a();
            aVar.f43383c = Long.valueOf(this.f110026e.mo154867c());
            C432455 r1 = new IGetDataCallback<MailSimpleSearchResponse>() {
                /* class com.ss.android.lark.mail.impl.search.C43238a.C432455 */

                /* renamed from: a */
                C43256b f110042a;

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C42311s) C42344d.m169091a(C42311s.class, C43238a.this.f110022a)).mo152318a("rust_fail", 0);
                    Log.m165383e("SearchDataManager", "fetchSearchData onError");
                    if (this.f110042a != C43238a.this.f110026e) {
                        Log.m165389i("SearchDataManager", "onError obsolete response");
                        return;
                    }
                    this.f110042a.mo154863a(-1);
                    if (C43238a.this.f110023b != null && !z) {
                        C43238a.this.f110023b.mo154819k();
                    }
                }

                /* renamed from: a */
                public void onSuccess(final MailSimpleSearchResponse mailSimpleSearchResponse) {
                    boolean z;
                    ((C42311s) C42344d.m169091a(C42311s.class, C43238a.this.f110022a)).mo152318a("success", 0);
                    Log.m165389i("SearchDataManager", "fetchSearchData onSuccess");
                    if (mailSimpleSearchResponse == null || TextUtils.isEmpty(mailSimpleSearchResponse.keyword)) {
                        Log.m165383e("SearchDataManager", "onSuccess invalid response");
                        return;
                    }
                    C43256b bVar = this.f110042a;
                    if (bVar == null || bVar != C43238a.this.f110026e) {
                        Log.m165383e("SearchDataManager", "onSuccess obsolete response");
                    } else if (!mailSimpleSearchResponse.keyword.equals(this.f110042a.mo154862a()) || !mailSimpleSearchResponse.search_session.equals(this.f110042a.mo154868d())) {
                        Log.m165383e("SearchDataManager", "onSuccess data not matched");
                    } else {
                        int length = mailSimpleSearchResponse.keyword.length();
                        String a = C64078a.m251460a(mailSimpleSearchResponse.keyword);
                        int i = 0;
                        if (mailSimpleSearchResponse.msg_summary == null || mailSimpleSearchResponse.msg_summary.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C42330c.m169043a(length, a, z, mailSimpleSearchResponse.msg_summary, str, C43238a.this.f110027f);
                        Integer b = C43257c.m171870b(mailSimpleSearchResponse.search_session);
                        if (b != null) {
                            int intValue = b.intValue();
                            String str = mailSimpleSearchResponse.search_session;
                            if (this.f110042a.mo154862a() != null) {
                                i = this.f110042a.mo154862a().length();
                            }
                            C42330c.m169042a(intValue, str, i, C43238a.this.f110027f);
                        }
                        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.search.C43238a.C432455.RunnableC432461 */

                            public void run() {
                                ArrayList<MailThread> a = C43238a.this.mo154834a(mailSimpleSearchResponse.msg_summary, mailSimpleSearchResponse.keyword);
                                if (a != null) {
                                    C43238a.this.f110024c.addAll(a);
                                }
                                C432455.this.f110042a.mo154864a(mailSimpleSearchResponse.next_begin.longValue());
                                C432455.this.f110042a.mo154865a(mailSimpleSearchResponse.has_more.booleanValue());
                                if (C43238a.this.f110023b != null) {
                                    C43238a.this.f110023b.mo154806a(C43238a.this.f110024c, Boolean.valueOf(z));
                                    if (!z) {
                                        C43238a.this.f110023b.mo154817i();
                                    }
                                }
                                C43238a.this.mo154841b(C43238a.this.f110024c);
                            }
                        });
                    }
                }

                {
                    this.f110042a = C43238a.this.f110026e;
                }
            };
            C432476 r7 = new SdkSender.IParser() {
                /* class com.ss.android.lark.mail.impl.search.C43238a.C432476 */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public Object parse(byte[] bArr) throws IOException {
                    return MailSimpleSearchResponse.ADAPTER.decode(bArr);
                }
            };
            ((C42311s) C42344d.m169091a(C42311s.class, this.f110022a)).mo152321b("");
            SdkSender.asynSendRequestNonWrap(Command.MAIL_SIMPLE_SEARCH_REQUEST, aVar, r1, r7);
        }
    }

    C43238a(AbstractC43251a aVar, Context context, String str) {
        this.f110022a = context;
        this.f110023b = aVar;
        this.f110027f = str;
    }

    /* renamed from: a */
    private void m171829a(String str, long j, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = System.currentTimeMillis() + "_" + str.hashCode();
        }
        this.f110026e = new C43256b(str, str2, j);
    }
}

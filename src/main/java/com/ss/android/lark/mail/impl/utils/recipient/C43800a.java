package com.ss.android.lark.mail.impl.utils.recipient;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailAtContactResponse;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchResponse;
import com.bytedance.lark.pb.email.client.v1.MailContactSearchResult;
import com.bytedance.lark.pb.email.client.v1.SearchMemberInfo;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.ContactSearchType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a;
import com.ss.android.lark.mail.impl.utils.C43783o;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3454b.AbstractC68272b;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.lark.mail.impl.utils.recipient.a */
public class C43800a {

    /* renamed from: a */
    public Disposable f111130a;

    /* renamed from: b */
    public long f111131b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.a$a */
    public static class C43811a {

        /* renamed from: a */
        public static C43800a f111155a = new C43800a();
    }

    /* renamed from: a */
    public static C43800a m173635a() {
        return C43811a.f111155a;
    }

    private C43800a() {
        Watchers.m167206a(new AbstractC43313a() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438011 */

            @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43313a
            /* renamed from: a */
            public void mo153312a(C42093e eVar, boolean z) {
                if (C43800a.this.f111130a != null && !C43800a.this.f111130a.isDisposed()) {
                    C43800a.this.f111130a.dispose();
                }
            }
        });
    }

    /* renamed from: a */
    private Observable m173636a(List<String> list) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Observable.fromIterable(list).groupBy(new Function<String, Integer>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.AnonymousClass10 */

            /* renamed from: a */
            public Integer apply(String str) throws Exception {
                return Integer.valueOf(atomicInteger.getAndIncrement() % 5);
            }
        }).flatMap(new Function<AbstractC68272b<Integer, String>, ObservableSource<MailAddress>>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438099 */

            /* renamed from: a */
            public ObservableSource<MailAddress> apply(AbstractC68272b<Integer, String> bVar) throws Exception {
                return bVar.observeOn(C68279a.m265023b()).map(new Function<String, MailAddress>() {
                    /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438099.C438101 */

                    /* renamed from: a */
                    public MailAddress apply(String str) throws Exception {
                        Log.m165389i("RecipientSelectView", "address: " + str + ", thread:" + C43849u.m173830c());
                        return C43800a.this.mo156042a(str);
                    }
                });
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: a */
    public SearchAddress mo156042a(String str) {
        String str2;
        Log.m165389i("ComposeRecipientSearchS", "fetchContact");
        if (!str.contains("<") || !str.contains(">") || !str.endsWith(">") || str.indexOf("<") >= str.indexOf("@") || str.indexOf("@") >= str.indexOf(">")) {
            str2 = str;
        } else {
            str2 = str.substring(str.indexOf("<") + 1, str.indexOf(">"));
        }
        String str3 = "";
        MailContactSearchResponse a = C42176e.m168344a().mo152189a(str2, 0, 1, str3);
        SearchAddress.C43799a aVar = new SearchAddress.C43799a();
        aVar.mo151212b(str2);
        if (a == null || a.results == null || a.results.size() <= 0) {
            MailAddress a2 = MailAddress.m167321a(str);
            aVar.mo151212b(a2.mo151182e()).mo151209a(a2.mo151176a());
        } else {
            MailContactSearchResult mailContactSearchResult = a.results.get(0);
            if (!TextUtils.isEmpty(mailContactSearchResult.avatar_key) && mailContactSearchResult.avatar_urls.size() > 0) {
                str3 = mailContactSearchResult.avatar_urls.get(0);
            }
            aVar.mo151209a(mailContactSearchResult.title).mo151212b(mailContactSearchResult.email).mo151213c(mailContactSearchResult.lark_id).mo151215e(str3);
            if (mailContactSearchResult.type != null) {
                aVar.mo156035a(ContactSearchType.fromValue(mailContactSearchResult.type.getValue()));
            }
            if (mailContactSearchResult.tenant_id != null) {
                aVar.mo151216f(mailContactSearchResult.tenant_id);
            }
            aVar.mo151217g(mailContactSearchResult.display_name);
            aVar.mo156041h(mailContactSearchResult.subtitle);
            aVar.mo156037a(mailContactSearchResult.title_hit_terms);
            aVar.mo156039b(mailContactSearchResult.email_hit_terms);
            if (!TextUtils.isEmpty(aVar.f106776c) || ContactSearchType.EXTERNAL_CONTACT != aVar.f111125m) {
                aVar.mo151214d(mailContactSearchResult.avatar_key);
            }
        }
        return aVar.mo151210a();
    }

    /* renamed from: b */
    private Disposable m173637b(String str, final IGetDataCallback<MailAddress> iGetDataCallback) {
        return m173636a(Arrays.asList(str)).subscribe(new Consumer<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438066 */

            /* renamed from: a */
            public void accept(MailAddress mailAddress) throws Exception {
                Log.m165389i("RecipientSelectView", "result: " + mailAddress + ", thread:" + C43849u.m173830c());
                iGetDataCallback.onSuccess(mailAddress);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438077 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                iGetDataCallback.onError((ErrorResult) null);
            }
        }, new AbstractC68309a() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438088 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
            }
        });
    }

    /* renamed from: a */
    public void mo156043a(String str, IGetDataCallback<MailAddress> iGetDataCallback) {
        if (!str.contains("@")) {
            iGetDataCallback.onSuccess(null);
            return;
        }
        Disposable disposable = this.f111130a;
        if (disposable != null && !disposable.isDisposed()) {
            this.f111130a.dispose();
        }
        this.f111130a = m173637b(str, iGetDataCallback);
    }

    /* renamed from: b */
    public void mo156047b(List<String> list, final IGetDataCallback<List<MailAddress>> iGetDataCallback) {
        if (list == null || list.isEmpty()) {
            iGetDataCallback.onSuccess(null);
            return;
        }
        Disposable disposable = this.f111130a;
        if (disposable != null && !disposable.isDisposed()) {
            this.f111130a.dispose();
        }
        this.f111130a = m173636a(list).toList().subscribe(new Consumer<List<MailAddress>>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438044 */

            /* renamed from: a */
            public void accept(List<MailAddress> list) throws Exception {
                Log.m165389i("RecipientSelectView", "result: " + list + ", thread:" + C43849u.m173830c());
                iGetDataCallback.onSuccess(list);
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438055 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                iGetDataCallback.onError((ErrorResult) null);
            }
        });
    }

    /* renamed from: a */
    public void mo156046a(List<MailAddress> list, IGetDataCallback<List<MailAddress>> iGetDataCallback) {
        if (list == null || list.isEmpty()) {
            iGetDataCallback.onSuccess(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (MailAddress mailAddress : list) {
            if (TextUtils.isEmpty(mailAddress.mo151189j())) {
                arrayList.add(mailAddress.mo151182e());
            }
        }
        if (arrayList.isEmpty()) {
            iGetDataCallback.onSuccess(list);
        } else {
            mo156047b(arrayList, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo156044a(final String str, final String str2, final IGetDataCallback<MailAddress> iGetDataCallback) {
        C43783o a;
        MailAddress mailAddress;
        if (TextUtils.isEmpty(str)) {
            iGetDataCallback.onSuccess(null);
            return;
        }
        if (str.contains("?") && (a = C43783o.m173515a(Uri.parse(str), false)) != null && a.mo155944a() != null && !a.mo155944a().isEmpty() && (mailAddress = a.mo155944a().get(0)) != null && !TextUtils.isEmpty(mailAddress.mo151182e())) {
            str = mailAddress.mo151182e();
        }
        Disposable disposable = this.f111130a;
        if (disposable != null && !disposable.isDisposed()) {
            this.f111130a.dispose();
        }
        this.f111130a = m173637b(str, new IGetDataCallback<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438033 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C43800a.this.mo156045a(str2, str, "", iGetDataCallback);
            }

            /* renamed from: a */
            public void onSuccess(MailAddress mailAddress) {
                if (mailAddress != null) {
                    iGetDataCallback.onSuccess(mailAddress);
                } else {
                    C43800a.this.mo156045a(str2, str, "", iGetDataCallback);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo156045a(String str, final String str2, final String str3, final IGetDataCallback<MailAddress> iGetDataCallback) {
        Log.m165389i("ComposeRecipientSearchS", "fetchMentionContactList");
        if (TextUtils.isEmpty(str) || (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3))) {
            Log.m165383e("ComposeRecipientSearchS", "showMentionedUserInfo empty address or name");
            iGetDataCallback.onSuccess(null);
            return;
        }
        this.f111131b = System.currentTimeMillis();
        C42176e.m168344a().mo152257g(str, String.valueOf(this.f111131b), new IGetDataCallback<MailAtContactResponse>() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43800a.C438022 */

            /* renamed from: a */
            long f111135a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ComposeRecipientSearchS", "fetchMentionContactList onError");
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            private MailAddress m173646a(SearchMemberInfo searchMemberInfo) {
                String str;
                SearchAddress.C43799a aVar = new SearchAddress.C43799a();
                if (TextUtils.isEmpty(searchMemberInfo.tenant_id)) {
                    str = C41816b.m166115a().mo150137d();
                } else {
                    str = searchMemberInfo.tenant_id;
                }
                return aVar.mo151212b(searchMemberInfo.email_address).mo151209a(searchMemberInfo.name).mo151213c(searchMemberInfo.user_id).mo151216f(str).mo151210a();
            }

            /* renamed from: a */
            public void onSuccess(MailAtContactResponse mailAtContactResponse) {
                Log.m165389i("ComposeRecipientSearchS", "fetchMentionContactList onSuccess");
                if (this.f111135a < C43800a.this.f111131b) {
                    Log.m165389i("ComposeRecipientSearchS", "fetchMentionContactList obsolete response");
                    return;
                }
                MailAddress mailAddress = null;
                if (mailAtContactResponse == null) {
                    Log.m165383e("ComposeRecipientSearchS", "fetchMentionContactList empty response");
                    iGetDataCallback.onSuccess(null);
                    return;
                }
                Iterator<SearchMemberInfo> it = mailAtContactResponse.members.iterator();
                while (true) {
                    if (it.hasNext()) {
                        SearchMemberInfo next = it.next();
                        if (next != null) {
                            if (TextUtils.isEmpty(str2)) {
                                if (!TextUtils.isEmpty(str3) && str3.equals(next.user_id)) {
                                    mailAddress = m173646a(next);
                                    break;
                                }
                            } else if (str2.equals(next.email_address)) {
                                mailAddress = m173646a(next);
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                iGetDataCallback.onSuccess(mailAddress);
            }

            {
                this.f111135a = C43800a.this.f111131b;
            }
        });
    }
}

package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.ReadThreadListMailAction;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.message.framework.AbstractC42924a;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.SearchMessageListIntentInfo;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchResultMessageListView extends MailMessageListView implements AbstractC43328o {
    private final String ad = "SearchResultMessageList";

    /* renamed from: ai  reason: collision with root package name */
    private volatile String f175451ai;

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o
    public void ah() {
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    public int getThreadType() {
        return 6;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.MailMessageListView
    public void getDataFinish() {
        super.getDataFinish();
        this.f109694b.mo152014a(this.f175451ai);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: W */
    public void mo154438W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f109694b.mo152010a());
        C42699a.m170245a((Context) this.f109706n, (ArrayList<String>) arrayList, "SEARCH");
    }

    public SearchResultMessageListView(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43328o
    /* renamed from: c */
    public void mo154549c(List<String> list) {
        Log.m165389i("SearchResultMessageList", "onThreadListUpdate");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("SearchResultMessageList", "onThreadListUpdate no thread id");
            return;
        }
        boolean z = false;
        Iterator<String> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next(), this.f109699g)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Log.m165389i("SearchResultMessageList", "onThreadListUpdate no matched updated thread");
        } else {
            C42176e.m168344a().mo152243c(this.f109699g, this.f109700h, new IGetDataCallback<MailThread>() {
                /* class com.ss.android.lark.mail.impl.message.view.SearchResultMessageListView.C431721 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("SearchResultMessageList", "onThreadListUpdate onError");
                }

                /* renamed from: a */
                public void onSuccess(final MailThread mailThread) {
                    Log.m165389i("SearchResultMessageList", "onThreadListUpdate onSuccess");
                    SearchResultMessageListView searchResultMessageListView = SearchResultMessageListView.this;
                    if (searchResultMessageListView.mo154461b(searchResultMessageListView.f109694b.mo152018b(), mailThread.mo151723r())) {
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.message.view.SearchResultMessageListView.C431721.RunnableC431731 */

                            public void run() {
                                Log.m165389i("SearchResultMessageList", "onThreadListUpdate update labels");
                                if (C43752b.m173436b(SearchResultMessageListView.this.f109706n)) {
                                    SearchResultMessageListView.this.mo154450a(mailThread.mo151723r(), mailThread.mo151725t());
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.view.BaseMailMessageListView
    /* renamed from: d */
    public void mo154465d(C42099l lVar) {
        Log.m165389i("SearchResultMessageList", "doReadAction");
        if (!this.f109701i) {
            List<C42097j> a = lVar.mo151973a();
            ArrayList arrayList = new ArrayList();
            if (a != null && !a.isEmpty()) {
                for (C42097j jVar : a) {
                    arrayList.add(jVar.mo151964g().mo151581b());
                }
            } else if (lVar.mo151979b() != null) {
                for (MailDraft mailDraft : lVar.mo151979b()) {
                    arrayList.add(mailDraft.mo151321a());
                }
            }
            C43307b.m172030a().mo154977a(new ReadThreadListMailAction(this.f109699g, this.f109700h, true));
        }
    }

    public SearchResultMessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView
    /* renamed from: a */
    public void mo154321a(C42844a aVar, boolean z, AbstractC42924a aVar2, int i) {
        this.f175451ai = ((SearchMessageListIntentInfo) aVar.mo153785b()).mo154064a();
        super.mo154321a(aVar, z, aVar2, i);
    }
}

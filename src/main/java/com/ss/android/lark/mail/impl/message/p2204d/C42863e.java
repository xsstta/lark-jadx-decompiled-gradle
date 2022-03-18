package com.ss.android.lark.mail.impl.message.p2204d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailOpenEmlResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.p2202b.C42835a;
import com.ss.android.lark.mail.impl.message.p2202b.C42836b;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.p2204d.C42851b;
import com.ss.android.lark.mail.impl.message.pageroute.C42942a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.p2168g.C42150b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.d.e */
public class C42863e extends C42851b {
    /* renamed from: b */
    public void mo153842b(C42851b.C42858b bVar) {
        if (bVar != null) {
            bVar.f109138b = "";
            bVar.f109139c = 0;
            bVar.f109140d = 0;
            bVar.f109141e = 0;
        }
        if (this.f109095d != null) {
            int i = 2;
            if (bVar != null && bVar.f109142f) {
                i = 1;
            }
            this.f109095d.mo153834a(null, null, i);
            this.f109095d = null;
        }
    }

    /* renamed from: a */
    public void mo153839a(final C42851b.AbstractC42857a aVar, String str) {
        Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData threadID:" + str);
        if (aVar == null) {
            Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData messageDataCallback == null:");
            return;
        }
        boolean z = false;
        final C42851b.C42858b bVar = (C42851b.C42858b) this.f109092a.get(str);
        Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData preLoadInfo " + bVar);
        if (bVar == null) {
            Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData preLoadInfo == null:");
            aVar.mo153834a("", null, 3);
            this.f109095d = null;
        } else {
            int i = 1;
            if (bVar.f109137a != null) {
                List<MailDraft> b = bVar.f109137a.mo151979b();
                if (CollectionUtils.isEmpty(bVar.f109137a.mo151973a()) && !CollectionUtils.isEmpty(b)) {
                    z = true;
                }
            }
            if (TextUtils.isEmpty(bVar.f109138b)) {
                Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData preLoadInfo.mHtmlData isEmpty");
                C43849u.m173827a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.p2204d.C42863e.RunnableC428663 */

                    public void run() {
                        Log.m165389i("ClickDataPreLoader", bVar + " testAsynRender getMailHtmlData xxxxxxxxxxxx Again xxxxxxxxxxxx mHasSetData:" + bVar.f109144h + " mHasRender:" + bVar.f109143g);
                        if (bVar.f109144h && !bVar.f109143g) {
                            boolean z = false;
                            int i = 1;
                            if (bVar.f109137a != null) {
                                List<MailDraft> b = bVar.f109137a.mo151979b();
                                if (CollectionUtils.isEmpty(bVar.f109137a.mo151973a()) && !CollectionUtils.isEmpty(b)) {
                                    z = true;
                                }
                            }
                            if (TextUtils.isEmpty(bVar.f109138b)) {
                                Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData Again preLoadInfo.mHtmlData isEmpty:");
                            }
                            if (bVar.f109138b != null || z) {
                                Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData Again mHtmlData != null");
                                bVar.f109143g = true;
                                if (!bVar.f109142f) {
                                    i = 2;
                                }
                                aVar.mo153834a(bVar.f109138b, bVar.f109137a, i);
                                bVar.mo153835a();
                                C42863e.this.f109095d = null;
                            }
                        }
                    }
                }, 10);
            }
            if (bVar.f109138b != null || z) {
                Log.m165389i("ClickDataPreLoader", "testAsynRender getMailHtmlData mHtmlData != null");
                bVar.f109143g = true;
                if (!bVar.f109142f) {
                    i = 2;
                }
                aVar.mo153834a(bVar.f109138b, bVar.f109137a, i);
                bVar.mo153835a();
                this.f109095d = null;
                return;
            }
        }
        this.f109095d = aVar;
    }

    /* renamed from: a */
    public void mo153840a(final C42851b.C42858b bVar, final String str, final String str2, final String str3, final C42844a aVar, final MessageListIntenInfo messageListIntenInfo) {
        C42176e.m168344a().mo152242c(str, new IGetDataCallback<MailOpenEmlResponse>() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42863e.C428652 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("ClickDataPreLoader", "testAsynRender requestEmlFromAttachment onError ");
                C42863e.this.mo153842b(bVar);
            }

            /* renamed from: a */
            public void onSuccess(MailOpenEmlResponse mailOpenEmlResponse) {
                String str;
                MailMessage a = C42130j.m168150a().mo152080a(mailOpenEmlResponse.message);
                Log.m165389i("ClickDataPreLoader", "testAsynRender requestEmlFromAttachment onSuccess ");
                String str2 = str2;
                if (str2 == null || !str2.equals(C42863e.this.f109093b)) {
                    Log.m165389i("ClickDataPreLoader", "testAsynRender requestEmlFromAttachment onSuccess finalLastLabelID return");
                    return;
                }
                C42099l lVar = new C42099l();
                ArrayList arrayList = new ArrayList();
                C42097j jVar = new C42097j();
                jVar.mo151954a(new ArrayList());
                jVar.mo151951a(0);
                jVar.mo151953a(a);
                arrayList.add(jVar);
                lVar.mo151977a(arrayList);
                lVar.mo151981b(new ArrayList());
                lVar.mo151984c(new ArrayList());
                lVar.mo151987d(new ArrayList());
                lVar.mo151974a(PermissionCode.NONE);
                lVar.mo151975a(a.mo151565a());
                lVar.mo151980b(a.mo151604g());
                lVar.mo151985c(true);
                if (!CollectionUtils.isEmpty(lVar.mo151973a())) {
                    for (int i = 0; i < lVar.mo151973a().size(); i++) {
                        lVar.mo151973a().get(i).mo151964g().mo151585b(false);
                    }
                }
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    String substring = str.substring(lastIndexOf);
                    int lastIndexOf2 = substring.lastIndexOf(".");
                    if (lastIndexOf2 > 0) {
                        str = substring.substring(1, lastIndexOf2);
                    } else {
                        str = substring.substring(1);
                    }
                } else {
                    str = "_eml";
                }
                C42863e eVar = C42863e.this;
                String str3 = str2;
                eVar.mo153814a(str3, str + "_eml", str3, aVar, lVar, messageListIntenInfo);
            }
        });
    }

    /* renamed from: a */
    public void mo153841a(ArrayList<? extends MessageListIntenInfo> arrayList, int i, int i2, String str, Context context, boolean z) {
        super.mo153817b();
        Log.m165389i("ClickDataPreLoader", "testAsynRender startLoad");
        mo153810a();
        if (CollectionUtils.isEmpty(arrayList) || arrayList.size() <= i) {
            Log.m165389i("ClickDataPreLoader", "testAsynRender messageListItemList isEmpty return");
            return;
        }
        MessageListIntenInfo messageListIntenInfo = (MessageListIntenInfo) arrayList.get(i);
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (!TextUtils.isEmpty(messageListIntenInfo.mo154055f())) {
            arrayList2.add(messageListIntenInfo.mo154055f());
        }
        C42844a a = new C42942a().mo154040a(i2).mo154011a();
        a.mo153781a((MessageListIntenInfo) arrayList.get(i));
        a.mo153779a(i);
        Log.m165389i("ClickDataPreLoader", "testAsynRender startLoad createPreLoadInfo threadID:" + messageListIntenInfo.mo154050c());
        C42851b.C42858b j = mo153826j(messageListIntenInfo.mo154050c());
        j.f109139c = System.currentTimeMillis();
        if (arrayList.size() != 1 || !"EML".equals(((MessageListIntenInfo) arrayList.get(0)).mo154052d())) {
            mo153815a(this.f109093b, messageListIntenInfo.mo154050c(), arrayList2, messageListIntenInfo.mo154052d(), a, messageListIntenInfo);
        } else if (z) {
            mo153840a(j, str, this.f109093b, messageListIntenInfo.mo154052d(), a, messageListIntenInfo);
        } else {
            m170759a(j, str, context, this.f109093b, messageListIntenInfo.mo154052d(), a, messageListIntenInfo);
        }
    }

    /* renamed from: a */
    private void m170759a(final C42851b.C42858b bVar, String str, Context context, final String str2, final String str3, final C42844a aVar, final MessageListIntenInfo messageListIntenInfo) {
        if (!(context instanceof Activity)) {
            Log.m165389i("ClickDataPreLoader", "testAsynRender requestEmlFromAttachment not Activity");
            mo153842b(bVar);
            return;
        }
        final C42835a aVar2 = new C42835a();
        aVar2.mo153755b(str);
        aVar2.mo153753a(C42150b.m168218a().mo152115a((Activity) context));
        new C42836b(aVar2).mo153762a(new C42836b.AbstractC42838a() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42863e.C428641 */

            @Override // com.ss.android.lark.mail.impl.message.p2202b.C42836b.AbstractC42838a
            /* renamed from: c */
            public void mo153765c() {
                Log.m165389i("ClickDataPreLoader", "testAsynRender downloadEml onStart ");
            }

            @Override // com.ss.android.lark.mail.impl.message.p2202b.C42836b.AbstractC42838a
            /* renamed from: b */
            public void mo153764b() {
                Log.m165389i("ClickDataPreLoader", "testAsynRender downloadEml onError ");
                C42863e.this.mo153842b(bVar);
            }

            @Override // com.ss.android.lark.mail.impl.message.p2202b.C42836b.AbstractC42838a
            /* renamed from: a */
            public void mo153763a() {
                Log.m165389i("ClickDataPreLoader", "testAsynRender downloadEml onSuccess ");
                C42863e.this.mo153840a(bVar, aVar2.mo153758d(), str2, str3, aVar, messageListIntenInfo);
            }
        });
    }
}

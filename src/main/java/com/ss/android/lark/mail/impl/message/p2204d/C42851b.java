package com.ss.android.lark.mail.impl.message.p2204d;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.SearchMessageListIntentInfo;
import com.ss.android.lark.mail.impl.message.template.C43081v;
import com.ss.android.lark.mail.impl.message.template.C43089z;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.mail.impl.message.d.b */
public class C42851b {

    /* renamed from: f */
    private static Pattern f109091f = Pattern.compile("<[^>]*style\\s*=\\s*\"[^>]*(white-space\\s*:\\s*pre)[;\\s]*\"[^>]*>");

    /* renamed from: a */
    protected HashMap<String, C42858b> f109092a = new HashMap<>();

    /* renamed from: b */
    protected String f109093b = "";

    /* renamed from: c */
    public boolean f109094c;

    /* renamed from: d */
    protected volatile AbstractC42857a f109095d;

    /* renamed from: e */
    private final String f109096e = "BaseDataPreLoader";

    /* renamed from: com.ss.android.lark.mail.impl.message.d.b$a */
    public interface AbstractC42857a {
        /* renamed from: a */
        void mo153834a(String str, C42099l lVar, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo153817b() {
        MailLabelEntity r = C43374f.m172264f().mo155130r();
        if (r == null) {
            Log.m165389i("BaseDataPreLoader", "testAsynRender currentLabel == null return");
        } else {
            this.f109093b = r.mo151527k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.mail.impl.message.d.b$b */
    public class C42858b {

        /* renamed from: a */
        public volatile C42099l f109137a;

        /* renamed from: b */
        public volatile String f109138b;

        /* renamed from: c */
        public long f109139c;

        /* renamed from: d */
        public long f109140d;

        /* renamed from: e */
        public long f109141e;

        /* renamed from: f */
        public boolean f109142f;

        /* renamed from: g */
        public boolean f109143g;

        /* renamed from: h */
        public boolean f109144h;

        /* renamed from: a */
        public void mo153835a() {
            this.f109137a = null;
            this.f109138b = null;
            this.f109139c = 0;
            this.f109140d = 0;
            this.f109141e = 0;
            this.f109142f = false;
            this.f109143g = false;
            this.f109144h = false;
            Log.m165389i("BaseDataPreLoader", "testAsynRender PreLoadInfo clear " + this);
        }

        protected C42858b() {
        }
    }

    /* renamed from: a */
    public void mo153810a() {
        Log.m165389i("BaseDataPreLoader", "testAsynRender clearAll");
        for (Map.Entry<String, C42858b> entry : this.f109092a.entrySet()) {
            if (entry != null) {
                mo153825i(entry.getKey());
            }
        }
        this.f109092a.clear();
        this.f109095d = null;
    }

    /* renamed from: a */
    public String mo153809a(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar != null) {
            return bVar.f109138b;
        }
        return null;
    }

    /* renamed from: b */
    public C42099l mo153816b(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar != null) {
            return bVar.f109137a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo153824h(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar != null) {
            return bVar.f109142f;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C42858b mo153826j(String str) {
        C42858b bVar = new C42858b();
        this.f109092a.put(str, bVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo153819c(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar == null || bVar.f109139c > 100000) {
            return 0;
        }
        return bVar.f109139c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo153820d(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar == null || bVar.f109140d > 100000) {
            return 0;
        }
        return bVar.f109140d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo153821e(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar == null || bVar.f109141e > 100000) {
            return 0;
        }
        return bVar.f109141e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo153822f(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar != null) {
            bVar.f109141e = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo153823g(String str) {
        C42858b bVar = this.f109092a.get(str);
        if (bVar != null) {
            bVar.f109141e = System.currentTimeMillis() - bVar.f109141e;
        }
    }

    /* renamed from: i */
    public void mo153825i(String str) {
        Log.m165389i("BaseDataPreLoader", "testAsynRender clear");
        C42858b bVar = this.f109092a.get(str);
        if (bVar != null) {
            bVar.mo153835a();
        }
        this.f109095d = null;
    }

    /* renamed from: a */
    public void mo153811a(C42858b bVar) {
        if (bVar != null) {
            bVar.f109138b = "";
            Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromNet onError preLoadInfo.mHtmlData set null:" + bVar);
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

    /* renamed from: k */
    public String mo153827k(String str) {
        if (str == null) {
            return "";
        }
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mobile.process.over.stretch")) {
            return str;
        }
        Log.m165389i("BaseDataPreLoader", "processOverStretch");
        Matcher matcher = f109091f.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group();
            if (!TextUtils.isEmpty(group)) {
                matcher.appendReplacement(stringBuffer, group.replaceAll("white-space\\s*:\\s*pre", "white-space: pre-wrap"));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public void mo153818b(final String str, final String str2, final ArrayList<String> arrayList, final String str3, final C42844a aVar, final MessageListIntenInfo messageListIntenInfo) {
        Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromNet");
        final C42858b bVar = this.f109092a.get(str2);
        if (bVar != null) {
            bVar.f109142f = true;
        } else {
            bVar = mo153826j(str2);
            bVar.f109142f = true;
        }
        C42176e.m168345b(str2, arrayList, str3, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42851b.C428532 */

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromNet onSuccess ");
                String str = str;
                if (str == null || !str.equals(C42851b.this.f109093b)) {
                    Log.m165389i("BaseDataPreLoader", " requestMessageListDataFromDB onSuccess finalLastLabelID return");
                } else {
                    C42851b.this.mo153814a(str, str2, str3, aVar, lVar, messageListIntenInfo);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromNet onError mHasPushGetDataRetry:" + C42851b.this.f109094c);
                if (C42851b.this.f109094c || !C42871i.m170783d()) {
                    C42851b.this.mo153811a(bVar);
                } else {
                    C42851b.this.mo153812a(bVar, str, str2, arrayList, str3, aVar, messageListIntenInfo);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153814a(final String str, final String str2, final String str3, final C42844a aVar, final C42099l lVar, final MessageListIntenInfo messageListIntenInfo) {
        Log.m165389i("BaseDataPreLoader", "testAsynRender parseData");
        final C42858b bVar = this.f109092a.get(str2);
        if (bVar != null) {
            bVar.f109139c = System.currentTimeMillis() - bVar.f109139c;
        } else {
            bVar = mo153826j(str2);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        C43089z.m171291a().mo154275b(new C43089z.AbstractC43092a() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42851b.C428543 */

            @Override // com.ss.android.lark.mail.impl.message.template.C43089z.AbstractC43092a
            /* renamed from: b */
            public void mo153831b() {
                Log.m165389i("BaseDataPreLoader", "testAsynRender loadTemplateSyn onFailed");
                if (C42851b.this.f109095d != null) {
                    C42858b bVar = bVar;
                    int i = 2;
                    if (bVar != null && bVar.f109142f) {
                        i = 1;
                    }
                    C42851b.this.f109095d.mo153834a(null, null, i);
                    C42851b.this.f109095d = null;
                } else if (bVar != null) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender parseData onFailed preLoadInfo.mHtmlData set null:" + bVar);
                    bVar.f109138b = "";
                    bVar.f109139c = 0;
                    bVar.f109140d = 0;
                    bVar.f109141e = 0;
                }
            }

            @Override // com.ss.android.lark.mail.impl.message.template.C43089z.AbstractC43092a
            /* renamed from: a */
            public void mo153830a() {
                String str;
                Log.m165389i("BaseDataPreLoader", "testAsynRender loadH5Page onComplete");
                String str2 = str;
                if (str2 == null || !str2.equals(C42851b.this.f109093b)) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromNet onSuccess 11 finalLastLabelID return");
                    return;
                }
                C43081v vVar = new C43081v();
                int i = 1;
                try {
                    C42104p pVar = new C42104p(str2, lVar.mo151983c(), lVar.mo151986d(), lVar.mo151988e(), lVar.mo151989f(), lVar.mo151990g(), lVar.mo151991h(), lVar.mo151994k());
                    MessageListIntenInfo messageListIntenInfo = messageListIntenInfo;
                    if (messageListIntenInfo instanceof SearchMessageListIntentInfo) {
                        pVar.mo152014a(((SearchMessageListIntentInfo) messageListIntenInfo).mo154064a());
                    }
                    aVar.mo153780a(lVar);
                    str = C42851b.this.mo153827k(vVar.mo154263a(lVar.mo151973a(), true, pVar, str3, aVar, 0));
                } catch (Throwable th) {
                    Log.m165385e("BaseDataPreLoader", "testAsynRender TemplateParseError", th, true);
                    str = "";
                }
                C42858b bVar = bVar;
                if (bVar != null) {
                    bVar.f109140d = System.currentTimeMillis() - currentTimeMillis;
                }
                String str3 = str;
                if (str3 == null || !str3.equals(C42851b.this.f109093b)) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromNet onSuccess 22 finalLastLabelID return");
                } else if (C42851b.this.f109095d != null) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender parseData done onReturnMailHtmlData:");
                    bVar.f109143g = true;
                    C42858b bVar2 = bVar;
                    int i2 = 2;
                    if (bVar2 != null) {
                        if (!bVar2.f109142f) {
                            i = 2;
                        }
                        i2 = i;
                    }
                    C42851b.this.f109095d.mo153834a(str, lVar, i2);
                    C42851b.this.f109095d = null;
                } else {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender loadTemplateSyn preLoadInfo " + bVar);
                    if (TextUtils.isEmpty(str)) {
                        Log.m165389i("BaseDataPreLoader", "testAsynRender loadTemplateSyn htmlData isEmpty ");
                    }
                    C42858b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.f109144h = true;
                        bVar.f109138b = str;
                        bVar.f109137a = lVar;
                    }
                    Log.m165389i("BaseDataPreLoader", "testAsynRender loadTemplateSyn onSuccess ");
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153815a(final String str, final String str2, final ArrayList<String> arrayList, final String str3, final C42844a aVar, final MessageListIntenInfo messageListIntenInfo) {
        this.f109094c = false;
        Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromDB threadID:" + str2);
        final C42858b bVar = this.f109092a.get(str2);
        if (bVar != null) {
            bVar.f109139c = System.currentTimeMillis();
        }
        C42176e.m168344a().mo152213a(str2, arrayList, str3, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.p2204d.C42851b.C428521 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BaseDataPreLoader", "testAsynRender getThreadInfoFromDB onError ");
                C42851b.this.mo153818b(str, str2, arrayList, str3, aVar, messageListIntenInfo);
            }

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                String str = str;
                if (str == null || !str.equals(C42851b.this.f109093b)) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromDB onSuccess finalLastLabelID return");
                    return;
                }
                List<MailDraft> b = lVar.mo151979b();
                if (!CollectionUtils.isEmpty(lVar.mo151973a()) || CollectionUtils.isEmpty(b)) {
                    if (CollectionUtils.isEmpty(lVar.mo151973a())) {
                        Log.m165389i("BaseDataPreLoader", "testAsynRender getThreadInfoFromDB getMessageItems empty");
                        C42851b.this.mo153818b(str, str2, arrayList, str3, aVar, messageListIntenInfo);
                        return;
                    }
                    C42851b.this.mo153814a(str, str2, str3, aVar, lVar, messageListIntenInfo);
                } else if (C42851b.this.f109095d != null) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender parseData done onReturnMailHtmlData:");
                    C42851b.this.f109095d.mo153834a("", lVar, 2);
                    C42851b.this.f109095d = null;
                } else if (bVar != null) {
                    Log.m165389i("BaseDataPreLoader", "testAsynRender requestMessageListDataFromDB preLoadInfo.mHtmlData set null: " + bVar);
                    bVar.f109138b = "";
                    bVar.f109137a = lVar;
                    bVar.f109139c = 0;
                    bVar.f109140d = 0;
                    bVar.f109141e = 0;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo153812a(final C42858b bVar, final String str, String str2, final ArrayList<String> arrayList, final String str3, final C42844a aVar, final MessageListIntenInfo messageListIntenInfo) {
        String str4;
        Log.m165389i("BaseDataPreLoader", "handleNotifyIntent");
        this.f109094c = true;
        Boolean b = C43350d.m172098a().mo155055u().mo5927b();
        if (b == null) {
            Log.m165389i("BaseDataPreLoader", "handleNotifyIntent, wait for setting");
            C43350d.m172098a().mo155071b(new AbsDataManager.AbstractC43360b<C42094f>() {
                /* class com.ss.android.lark.mail.impl.message.p2204d.C42851b.C428554 */

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                /* renamed from: a */
                public void mo152964a() {
                }

                @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                /* renamed from: a */
                public void mo152965a(ErrorResult errorResult) {
                    Log.m165389i("BaseDataPreLoader", "handleNotifyIntent, handle with setting onLoadError");
                    C42851b.this.mo153811a(bVar);
                }

                /* renamed from: a */
                public void mo152967a(C42094f fVar) {
                    Log.m165389i("BaseDataPreLoader", "handleNotifyIntent, handle with setting onSucceedLoad");
                    boolean v = C43350d.m172098a().mo155056v();
                    if (!CollectionUtils.isEmpty(arrayList)) {
                        String str = (String) arrayList.get(0);
                        Log.m165389i("BaseDataPreLoader", "handleNotifyIntent has 11 setting mid:" + str + " conversationModeSwitch:" + v);
                        if (!v && !TextUtils.isEmpty(str)) {
                            C42851b.this.mo153813a(bVar, v, C42871i.f109173e, str, str, arrayList, str3, aVar, messageListIntenInfo);
                            return;
                        }
                    }
                    C42851b.this.mo153811a(bVar);
                }
            });
        } else if (!CollectionUtils.isEmpty(arrayList)) {
            if (!b.booleanValue()) {
                str4 = arrayList.get(0);
            } else {
                str4 = str2;
            }
            Log.m165389i("BaseDataPreLoader", "handleNotifyIntent has 22 setting tid:" + str4 + " conversationModeSwitch:" + b);
            if (!TextUtils.isEmpty(str4)) {
                mo153813a(bVar, b.booleanValue(), C42871i.f109173e, str4, str, arrayList, str3, aVar, messageListIntenInfo);
            } else {
                mo153811a(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo153813a(final C42858b bVar, boolean z, String str, final String str2, final String str3, final ArrayList<String> arrayList, final String str4, final C42844a aVar, final MessageListIntenInfo messageListIntenInfo) {
        String n = C43277a.m171921a().mo154950n();
        Log.m165389i("BaseDataPreLoader", "tryToNetThread conversationModeSwitch:" + z);
        if (!z || !TextUtils.equals(n, str)) {
            C42699a.m170255a(str, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.mail.impl.message.p2204d.C42851b.C428565 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("BaseDataPreLoader", "tryToNetThread, switch account error");
                    C42851b.this.mo153811a(bVar);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i("BaseDataPreLoader", "tryToNetThread, switch account success");
                    C42851b.this.mo153818b(str3, str2, arrayList, str4, aVar, messageListIntenInfo);
                }
            });
        } else {
            Log.m165389i("BaseDataPreLoader", "tryToNetThread, requestMessageListDataFromNet next");
        }
    }
}

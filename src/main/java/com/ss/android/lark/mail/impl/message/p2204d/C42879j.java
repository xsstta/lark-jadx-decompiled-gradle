package com.ss.android.lark.mail.impl.message.p2204d;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a;
import com.ss.android.lark.mail.impl.message.p2204d.C42851b;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.d.j */
public class C42879j {

    /* renamed from: a */
    public static boolean f109205a;

    /* renamed from: b */
    private AbstractC42849a f109206b;

    /* renamed from: c */
    private C42851b f109207c;

    /* renamed from: d */
    private C42862d f109208d;

    /* renamed from: e */
    private C42883l f109209e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.d.j$a */
    public static class C42881a {

        /* renamed from: a */
        public static C42879j f109210a = new C42879j();
    }

    /* renamed from: a */
    public static C42879j m170799a() {
        return C42881a.f109210a;
    }

    /* renamed from: e */
    public JSONObject mo153880e() {
        return this.f109206b.mo153804b();
    }

    private C42879j() {
        this.f109208d = new C42862d();
        this.f109209e = new C42883l();
    }

    /* renamed from: d */
    public void mo153878d() {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender resetAllVar");
        C42883l lVar = this.f109209e;
        if (lVar != null) {
            lVar.mo153805c();
            C42862d dVar = this.f109208d;
            if (dVar != null) {
                dVar.mo153805c();
            }
        }
    }

    /* renamed from: f */
    public boolean mo153882f() {
        AbstractC42849a aVar = this.f109206b;
        if (aVar == null) {
            return false;
        }
        return aVar.mo153807e();
    }

    /* renamed from: g */
    public boolean mo153884g() {
        AbstractC42849a aVar = this.f109206b;
        if (aVar == null) {
            return false;
        }
        return aVar.mo153806d();
    }

    /* renamed from: c */
    public void mo153876c() {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender clearAll");
        C42883l lVar = this.f109209e;
        if (lVar != null) {
            lVar.f109085d.mo153810a();
            C42862d dVar = this.f109208d;
            if (dVar != null) {
                dVar.f109085d.mo153810a();
            }
        }
    }

    /* renamed from: b */
    public boolean mo153874b() {
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.readmail.unreadpreload") || C42871i.m170782c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C43194a mo153863a(Context context) {
        return C42859c.m170753a().mo153837b(context);
    }

    /* renamed from: d */
    public long mo153877d(String str) {
        C42851b bVar = this.f109207c;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo153819c(str);
    }

    /* renamed from: e */
    public long mo153879e(String str) {
        C42851b bVar = this.f109207c;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo153820d(str);
    }

    /* renamed from: f */
    public long mo153881f(String str) {
        AbstractC42849a aVar = this.f109206b;
        if (aVar == null) {
            return 0;
        }
        return aVar.f109085d.mo153821e(str);
    }

    /* renamed from: g */
    public void mo153883g(String str) {
        AbstractC42849a aVar = this.f109206b;
        if (aVar != null) {
            aVar.f109085d.mo153823g(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo153885h(String str) {
        AbstractC42849a aVar = this.f109206b;
        if (aVar != null) {
            aVar.f109085d.mo153822f(str);
        }
    }

    /* renamed from: i */
    public boolean mo153886i(String str) {
        AbstractC42849a aVar = this.f109206b;
        if (aVar == null) {
            return false;
        }
        return aVar.f109085d.mo153824h(str);
    }

    /* renamed from: a */
    public void mo153866a(AbstractC42849a.AbstractC42850a aVar) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender setWebViewRenderCallback");
        AbstractC42849a aVar2 = this.f109206b;
        if (aVar2 == null) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender mCurrentAsynWebViewRender null return");
        } else {
            aVar2.mo153799a(aVar);
        }
    }

    /* renamed from: b */
    public String mo153872b(String str) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender getHtmlData");
        AbstractC42849a aVar = this.f109206b;
        if (aVar != null) {
            return aVar.f109085d.mo153809a(str);
        }
        Log.m165389i("MessageListPreLoadManager", "testAsynRender getHtmlData mCurrentAsynWebViewRender null ");
        return "";
    }

    /* renamed from: c */
    public C42099l mo153875c(String str) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender getMailThreadInfo");
        AbstractC42849a aVar = this.f109206b;
        if (aVar != null) {
            return aVar.f109085d.mo153816b(str);
        }
        Log.m165389i("MessageListPreLoadManager", "testAsynRender getMailThreadInfo mCurrentAsynWebViewRender null ");
        return null;
    }

    /* renamed from: a */
    public void mo153868a(String str) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender clear");
        AbstractC42849a aVar = this.f109206b;
        if (aVar != null) {
            aVar.mo153800a(str);
        }
    }

    /* renamed from: a */
    public void mo153865a(MailThread mailThread, Context context) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToUnReadPreLoad 2");
        if (!m170799a().mo153874b()) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToUnReadPreLoad 2 FG return");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(mailThread);
        mo153871a(arrayList, context);
    }

    /* renamed from: a */
    public void mo153867a(C42851b.AbstractC42857a aVar, String str) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToRegClickPreDataCall");
        if (this.f109209e.mo153807e()) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToRegClickPreDataCall isStartCacheWebViewRender return");
        } else {
            ((C42863e) this.f109208d.f109085d).mo153839a(aVar, str);
        }
    }

    /* renamed from: a */
    public void mo153871a(List<MailThread> list, Context context) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToUnReadPreLoad 1");
        if (!m170799a().mo153874b()) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToUnReadPreLoad 1 FG return");
            return;
        }
        C42859c.m170753a().mo153836a(context);
        C42884m mVar = (C42884m) this.f109209e.f109085d;
        this.f109207c = mVar;
        mVar.mo153890a(list);
    }

    /* renamed from: a */
    public void mo153864a(Activity activity, String str, String str2) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToClickAsynWebViewRender");
        C43194a b = C42859c.m170753a().mo153837b(activity);
        if (b.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) b.getContext()).setBaseContext(activity);
        }
        if (this.f109209e.mo153807e()) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToClickAsynWebViewRender isStartCacheWebViewRender return");
            return;
        }
        C42862d dVar = this.f109208d;
        this.f109206b = dVar;
        this.f109207c = dVar.f109085d;
        this.f109208d.mo153801a(str, activity, str2);
    }

    /* renamed from: a */
    public void mo153869a(String str, Context context, String str2) {
        f109205a = false;
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToUnReadAsynWebViewRender");
        C42883l lVar = this.f109209e;
        this.f109206b = lVar;
        this.f109207c = lVar.f109085d;
        this.f109209e.mo153801a(str, context, str2);
    }

    /* renamed from: b */
    public void mo153873b(ArrayList<? extends MessageListIntenInfo> arrayList, int i, int i2, String str, Context context) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToClickPreLoadForEml");
        if (this.f109209e.mo153807e()) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToClickPreLoadForEml isStartCacheWebViewRender return");
            return;
        }
        C42863e eVar = (C42863e) this.f109208d.f109085d;
        this.f109207c = eVar;
        eVar.mo153841a(arrayList, i, i2, str, context, true);
    }

    /* renamed from: a */
    public void mo153870a(ArrayList<? extends MessageListIntenInfo> arrayList, int i, int i2, String str, Context context) {
        Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToClickPreLoad");
        if (this.f109209e.mo153807e()) {
            Log.m165389i("MessageListPreLoadManager", "testAsynRender tryToClickPreLoad isStartCacheWebViewRender return");
            return;
        }
        C42863e eVar = (C42863e) this.f109208d.f109085d;
        this.f109207c = eVar;
        eVar.mo153841a(arrayList, i, i2, str, context, false);
    }
}

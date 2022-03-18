package com.bytedance.ee.bear.list.p424c;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.list.AbstractC8454g;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.create.CreateErrorDialogUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.offlinecache.ManualOfflineConfig;
import com.bytedance.ee.bear.list.ownertype.OwnerTypeFetcher;
import com.bytedance.ee.bear.list.p426d.C8263g;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.c.b */
public class C8150b implements AbstractC8149a {

    /* renamed from: a */
    private AbstractC8454g f21744a;

    /* renamed from: b */
    private C10917c f21745b = new C10917c(new C10929e());

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: d */
    public AbstractC8454g mo31520d() {
        return this.f21744a;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public String mo31490a(Context context, Document document) {
        return C8292f.m34130a(context, document);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public String mo31511b(Context context, Document document) {
        return C8292f.m34191f(context, document);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31497a(C10917c cVar, Context context, Document document, String str, boolean z, ImageView imageView) {
        new C8263g(cVar, context, document, str, z, imageView).mo32361a();
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public RouteBean mo31482a(Context context, Document document, String str, List<Document> list, String str2, String str3) {
        return new C8706f(context, document, str, list, str2, str3).mo33741a();
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public String mo31489a(Context context, int i) {
        return C8292f.m34129a(context, i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public String mo31510b(Context context, int i) {
        return C8292f.m34168b(context, i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo31486a(Context context, int i, String str, String str2, boolean z) {
        return this.f21745b.mo41508c(am.class).mo238014c(new Function(i, str, str2, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$MVg0LwW2wWDsE8tIiXwaS54qxys */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((am) obj).createDocument(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        }).mo237985a(C11678b.m48481e()).mo237988a((Consumer<? super Throwable>) new Consumer(str, str2, context, i) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$pGZxZXn_V3E6J9fElnhPRxFgeJw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ Context f$3;
            public final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.this.m32713a((C8150b) this.f$1, this.f$2, (String) this.f$3, (Context) this.f$4, (int) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32713a(String str, String str2, Context context, int i, Throwable th) throws Exception {
        C8241g.m33835a(context, new C8237e(this.f21745b, str, str2, "docs_manage"), C8275a.m34050a(i), null, this.f21745b, th);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public AbstractC68307f<OfflineDoc> mo31484a(int i, String str, String str2, boolean z) {
        return this.f21745b.mo41508c(am.class).mo238014c(new Function(i, str, str2, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$n_r6RQHotjXKXy7ZSVu7HM32zE */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((am) obj).createOfflineDocument(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31495a(OfflineRenameData offlineRenameData) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$yST2svDd29KwabHmizbECLeW0PM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32694a(OfflineRenameData.this, (am) obj);
            }
        }).mo238001b($$Lambda$b$vO29wihDyCskoRPH1sC2x_SkR_I.INSTANCE, $$Lambda$b$22SNIDvyXZ_SJY1GeH7zx_oVzEE.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public AbstractC68307f<OfflineDoc> mo31487a(String str) {
        return this.f21745b.mo41508c(am.class).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$0d85f6oR9EZ6TLaNaML0M4i94 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((am) obj).getOfflineDoc(this.f$0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31494a(OfflineDoc offlineDoc) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$slWNjOyXgIHlNEcOq_n2YkOvrek */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32693a(OfflineDoc.this, (am) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$wYt6vbw6U154nJ52vzWRjCEClxc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32710a(OfflineDoc.this, (Boolean) obj);
            }
        }, $$Lambda$b$BvpZSxMq0SxDNBqJU5Djyv7UkU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32710a(OfflineDoc offlineDoc, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "handleSyncedDoc()...doc = " + offlineDoc);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public void mo31513b(String str) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$Z6SkwLA9vkvIepVEuA0ZJ82OIo */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32734e(this.f$0, (am) obj);
            }
        }).mo238001b($$Lambda$b$_lfI1KVTo8RI3sMgREZmmaEmjA.INSTANCE, $$Lambda$b$FdR4ve84UaDrH9emIWrPuArmTM.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31505a(List<String> list) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(list) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$bLDyxIGRU6XmNg2qEMoYi6xoXLY */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32727c(this.f$0, (am) obj);
            }
        }).mo238001b($$Lambda$b$cHdJcxHdKQN27F6Do93kQHqMfs4.INSTANCE, $$Lambda$b$x1dxLkzbRlIsJYAJWRmz9YF4uA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32712a(Integer num) throws Exception {
        C13479a.m54764b("ListImpl", "deleteDocStatusList()...size = " + num);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31491a() {
        this.f21745b.mo41508c(am.class).mo238020d($$Lambda$b$tdEQyZe0xMUqt0PUFPLkoLIfIZk.INSTANCE).mo238001b($$Lambda$b$zrRS4ee9KySU5lpIHwuvVUiX1wg.INSTANCE, $$Lambda$b$rMKQJCMJQB1eQdyfxxUe50CLrM.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public Disposable mo31483a(BinderListDataChangeCallback binderListDataChangeCallback) {
        return this.f21745b.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$GNrsl7dCnml_TiIgFxNMfJcKUM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32715b(BinderListDataChangeCallback.this, (am) obj);
            }
        }).mo238001b($$Lambda$b$brHtIDudCnIWJ0vfUVioX67nyM.INSTANCE, $$Lambda$b$nXbf57TNi05KWF25Yfq5Lodtyk.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public Disposable mo31508b(BinderListDataChangeCallback binderListDataChangeCallback) {
        return this.f21745b.mo41508c(am.class).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$iZtE2wYV1HXMp6ggKFCjmWeuBw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32691a(BinderListDataChangeCallback.this, (am) obj);
            }
        }).mo238001b($$Lambda$b$iTwu_9D7fkJX8bty2BXQZmy1L8.INSTANCE, $$Lambda$b$alqT0R6P0gDZaYJie3YWjgDa8as.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public void mo31512b() {
        this.f21745b.mo41508c(am.class).mo238020d($$Lambda$b$Ykd5XWoZVju1LsuaJ_cU1DVns8.INSTANCE).mo238001b($$Lambda$b$vstUcR9M9QDrrRimS3hvlVKwoU.INSTANCE, $$Lambda$b$KepFfaiZNm1unH37ck0b180YzH8.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: c */
    public void mo31519c() {
        this.f21745b.mo41508c(am.class).mo238020d($$Lambda$b$WvVzmnu2qrHKKaKnU8ruMoHEtSI.INSTANCE).mo238001b($$Lambda$b$xrisWLfjjiXP5oHgO3xow_eMQ.INSTANCE, $$Lambda$b$qvEWHrz8NYpqqgenZdfvNQQ49w.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31504a(String str, String str2) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, str2) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$ASk0nCEQy6aXZUh3jE51b3YW5GA */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32701a(this.f$0, this.f$1, (am) obj);
            }
        }).mo238001b($$Lambda$b$0NPZc11eN4Uc_T7fZuawPeURAxc.INSTANCE, $$Lambda$b$3C_CMUnmtpL8GxgVO6iy_x5V5o.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32701a(String str, String str2, am amVar) throws Exception {
        amVar.notifyListRename(str, str2);
        return true;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31498a(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, i, i2, binderIDeleteDocCallback) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$hO1cJHCK5VzmjKwgCQoDfqdPWU */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ BinderIDeleteDocCallback f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32695a(this.f$0, this.f$1, this.f$2, this.f$3, (am) obj);
            }
        }).mo238001b(new Consumer(i) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$Wa2iuLcimGIXlna5OxnAXgpCsL8 */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32721b(this.f$0, (Boolean) obj);
            }
        }, $$Lambda$b$ALAIOJAFGvg8OmjHKgYh8pm2aL8.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31503a(String str, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, binderIDeleteDocCallback) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$C9sXhumaKGNBwYH8V9TLBxA7cH4 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ BinderIDeleteDocCallback f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32700a(this.f$0, this.f$1, (am) obj);
            }
        }).mo238001b($$Lambda$b$9ZsTsZnloVtOjui8loV0rZ79dnE.INSTANCE, $$Lambda$b$5Of4Rok5N_On4BUfELW_NIzkJL4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32700a(String str, BinderIDeleteDocCallback binderIDeleteDocCallback, am amVar) throws Exception {
        amVar.delOfflineDoc(str, binderIDeleteDocCallback);
        return true;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31500a(String str, int i, boolean z) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, i, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$hbOu3CiTqAjKX_vlGw8OuUfmUjM */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32717b(this.f$0, this.f$1, this.f$2, (am) obj);
            }
        }).mo238001b(new Consumer(i, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$woKO8ZIoz9slOz1f4n1UKN8CnXc */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32728c(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$b$sXmBhu3GmVMjhnpUgVkwanCEwFM.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public void mo31514b(String str, int i, boolean z) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, i, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$lKEt6Dny91XAGnk451EfBgU4j4 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32698a(this.f$0, this.f$1, this.f$2, (am) obj);
            }
        }).mo238001b(new Consumer(i, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$7eapt6189_uKwnG6RzNk3bNrnQ */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32722b(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$b$ERZYWGxJMtMWnQCics8hK6bIlGo.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31501a(String str, int i, boolean z, BinderOnRequestCallback binderOnRequestCallback) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, i, z, binderOnRequestCallback) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$QQnbnforjB6cedGcNb407kqF44 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ BinderOnRequestCallback f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32697a(this.f$0, this.f$1, this.f$2, this.f$3, (am) obj);
            }
        }).mo238001b(new Consumer(i, z) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$3AFR8SfXAe3y5U4E0R0KH8U8SUM */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32709a(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$b$kT9ISF_y5fpAroIvTJX1wAQG14.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32709a(int i, boolean z, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "subscribeDoc()...success, type = " + i + ", isSubscribe = " + z);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo31485a(long j) {
        return this.f21745b.mo41508c(am.class).mo238014c(new Function(j) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$LDRN1YRo_Zi1XAcPV7ZOE0cdM7g */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((am) obj).clearDocsCacheDataFlowable(this.f$0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31506a(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(z, z2, str, z3, document, binderIManualOfflineCallback) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$OlHPiW9TwgVam0POdpNm5idhAnQ */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ Document f$4;
            public final /* synthetic */ BinderIManualOfflineCallback f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32702a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (am) obj);
            }
        }).mo238001b($$Lambda$b$fgmGqDV90kVD52UiDzXzrzESLjk.INSTANCE, $$Lambda$b$tiYOua_wE1HId9_qHAHjyhKquwI.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32702a(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback, am amVar) throws Exception {
        amVar.manualOfflineDownload(z, z2, str, z3, document, binderIManualOfflineCallback);
        return true;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31502a(String str, int i, boolean z, String str2) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, i, z, str2) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$JDb4gAfIMLLXlKQkPBUmU_9a3B4 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32699a(this.f$0, this.f$1, this.f$2, this.f$3, (am) obj);
            }
        }).mo238001b(new Consumer(i) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$FozpJ2DOp7HersIvVfAvRGlcjA */
            public final /* synthetic */ int f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32707a(this.f$0, (Boolean) obj);
            }
        }, $$Lambda$b$V2TW8YvS76g1aYWmbxLDgSyHzX0.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32707a(int i, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "cancelManualOffline()...success, type = " + i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: b */
    public AbstractC68307f<Integer> mo31509b(List<String> list) {
        return this.f21745b.mo41508c(am.class).mo238020d(new Function(list) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$wrcyoR91GkxeBfGD9JMDFq8EXEQ */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32718b(this.f$0, (am) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m32703a(List list, am amVar) throws Exception {
        return Integer.valueOf(amVar.delCachedStatus(list));
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31499a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str, i, str2, str3, str4, str5, str6, i2, binderIMakeCopyCallback) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$kpFXD1Usj1nP2wDUpBwaQccGpQ */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ int f$7;
            public final /* synthetic */ BinderIMakeCopyCallback f$8;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32696a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (am) obj);
            }
        }).mo238001b(new Consumer(i, str2) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$XEUK7DosR25pMq3im2uMjFZCYFU */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8150b.m32708a(this.f$0, this.f$1, (Boolean) obj);
            }
        }, $$Lambda$b$VZkdzbWLnYwEXV4MOyYnReLNsg.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32708a(int i, String str, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "makeCopy()...success, type = " + i + ", subType = " + str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32714a(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "makeCopy()...throwable = " + th);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31492a(Context context) {
        CreateErrorDialogUtils.m33809a(context, this.f21745b);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public boolean mo31507a(int i) {
        return ManualOfflineConfig.isEnable(i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31496a(AbstractC8454g gVar) {
        this.f21744a = gVar;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public AbstractC68307f<DocVersion> mo31488a(String str, int i) {
        if (str == null) {
            str = "";
        }
        return OwnerTypeFetcher.m36177a(str, i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: e */
    public boolean mo31523e() {
        return C8292f.m34174b();
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: f */
    public boolean mo31525f() {
        SpaceFeatureGatingV2 aVar = SpaceFeatureGatingV2.f21741a;
        return SpaceFeatureGatingV2.m32622a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Boolean m32725c(am amVar) throws Exception {
        amVar.deleteAllDocStatus();
        return true;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: h */
    public String mo31527h(String str) {
        return ListAnalysis.m32525b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32692a(am amVar) throws Exception {
        amVar.notifyFileClose();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m32716b(am amVar) throws Exception {
        amVar.notifyFileOpen();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m32733d(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "onDocNotFound()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m32736e(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "subscribeDoc()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m32739f(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "pinDoc()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m32741g(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "starDoc()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m32743h(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "delOfflineDoc()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m32745i(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "deleteDocByObjToken()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m32747j(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "notifyListRename()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m32749k(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "notifyFileClose()...throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m32750l(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "notifyFileOpen()...throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m32751m(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "registerChangeCallback()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m32752n(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "registerChangeCallback()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m32753o(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "deleteAllDocStatus()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m32754p(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "deleteDocStatusList()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m32755q(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "setDocDataCached()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m32757s(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "updateFileName()...failed, throwable = " + th);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: d */
    public void mo31521d(String str) {
        C8674q.m36243f().mo33643a(str);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: e */
    public void mo31522e(String str) {
        this.f21745b.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$wR8MN7tLoaqPYYnvaMrA2_1S5N0 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32726c(this.f$0, (am) obj);
            }
        }).mo238001b($$Lambda$b$KSkb0lf_A304403Nu_wuELDHM.INSTANCE, $$Lambda$b$PGy5qPVQPcQic3bJeFgFjzO8FU.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: f */
    public AbstractC68307f<Boolean> mo31524f(String str) {
        return this.f21745b.mo41508c(am.class).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$JHEbO9Rr3hFXQBcOtl5kF1JkbU */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((am) obj).isManualOffline(this.f$0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: g */
    public AbstractC68307f<Boolean> mo31526g(String str) {
        return this.f21745b.mo41508c(am.class).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$NtmtKkeiCeDEsxzgd0S17h5hsRc */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((am) obj).hasCached(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m32730c(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "manualOfflineDownload()...failed, throwable = " + th);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: c */
    public AbstractC68307f<Boolean> mo31515c(String str) {
        return this.f21745b.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$4oMgCfpUEO2n0UUm2NkFrC6c0Os */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32731d(this.f$0, (am) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: c */
    public AbstractC68307f<Integer> mo31516c(List<String> list) {
        return this.f21745b.mo41508c(am.class).mo238020d(new Function(list) {
            /* class com.bytedance.ee.bear.list.p424c.$$Lambda$b$Jy_5IrALN8uRzd2W8rBpcWyffI */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8150b.m32703a(this.f$0, (am) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m32724b(Throwable th) throws Exception {
        C13479a.m54758a("ListImpl", "cancelManualOffline()...failed, throwable = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32691a(BinderListDataChangeCallback binderListDataChangeCallback, am amVar) throws Exception {
        amVar.unRegisterChangeCallback(binderListDataChangeCallback);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m32715b(BinderListDataChangeCallback binderListDataChangeCallback, am amVar) throws Exception {
        amVar.registerChangeCallback(binderListDataChangeCallback);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Boolean m32731d(String str, am amVar) throws Exception {
        amVar.notifyListDocDelete(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ Boolean m32734e(String str, am amVar) throws Exception {
        amVar.setDocDataCached(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Boolean m32726c(String str, am amVar) throws Exception {
        amVar.onDocNotFound(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32693a(OfflineDoc offlineDoc, am amVar) throws Exception {
        amVar.handleSyncedDoc(offlineDoc);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Integer m32727c(List list, am amVar) throws Exception {
        return Integer.valueOf(amVar.deleteDocStatusList(list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32694a(OfflineRenameData offlineRenameData, am amVar) throws Exception {
        amVar.updateFileName(offlineRenameData);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Integer m32718b(List list, am amVar) throws Exception {
        return Integer.valueOf(amVar.saveCachedStatus(list));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m32721b(int i, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "deleteDocByObjToken()...success, type = " + i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: c */
    public String mo31517c(Context context, int i) {
        return C8292f.m34178c(context, i);
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: c */
    public String mo31518c(Context context, Document document) {
        return C8292f.m34193g(context, document);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m32728c(int i, boolean z, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "starDoc()...success, type = " + i + ", isStar = " + z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m32722b(int i, boolean z, Boolean bool) throws Exception {
        C13479a.m54764b("ListImpl", "pinDoc()...success, type = " + i + ", isPin = " + z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m32717b(String str, int i, boolean z, am amVar) throws Exception {
        amVar.starDoc(str, i, z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32698a(String str, int i, boolean z, am amVar) throws Exception {
        amVar.pinDoc(str, i, z);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32695a(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback, am amVar) throws Exception {
        amVar.deleteDocByObjToken(str, i, i2, binderIDeleteDocCallback);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32697a(String str, int i, boolean z, BinderOnRequestCallback binderOnRequestCallback, am amVar) throws Exception {
        amVar.subscribeDoc(str, i, z, binderOnRequestCallback);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32699a(String str, int i, boolean z, String str2, am amVar) throws Exception {
        amVar.cancelManualOffline(str, i, z, str2);
        return true;
    }

    @Override // com.bytedance.ee.bear.list.p424c.AbstractC8149a
    /* renamed from: a */
    public void mo31493a(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, String str3) {
        C8292f.m34147a(fragmentActivity, cVar, document, account, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32696a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback, am amVar) throws Exception {
        amVar.makeCopy(str, i, str2, str3, str4, str5, str6, i2, binderIMakeCopyCallback);
        return true;
    }
}

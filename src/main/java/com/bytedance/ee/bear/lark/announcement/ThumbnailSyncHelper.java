package com.bytedance.ee.bear.lark.announcement;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.lark.announcement.ThumbnailSyncHelper;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class ThumbnailSyncHelper {

    /* renamed from: a */
    public AbstractC68323g<String> f21444a;

    /* renamed from: b */
    private NetService f21445b = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: c */
    private String f21446c;

    /* renamed from: d */
    private Disposable f21447d;

    /* renamed from: e */
    private String f21448e;

    public static class ThumbSyncResult extends NetService.Result {
    }

    /* renamed from: b */
    public String mo30940b() {
        return "https://" + C6313i.f17509a + "/space/file/f/cdp-" + this.f21448e + "-" + this.f21446c + "~noop/";
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo30939a() {
        Disposable disposable = this.f21447d;
        if (disposable != null) {
            disposable.dispose();
        }
        AbstractC68307f<String> a = AbstractC68307f.m265080a(new AbstractC68324h<String>() {
            /* class com.bytedance.ee.bear.lark.announcement.ThumbnailSyncHelper.C79801 */

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(AbstractC68323g<String> gVar) throws Exception {
                ThumbnailSyncHelper.this.f21444a = gVar;
            }
        }, BackpressureStrategy.BUFFER);
        NetService.C5077f fVar = new NetService.C5077f("/space/api/thumbnail/sync/");
        HashMap hashMap = new HashMap();
        hashMap.put("token", this.f21446c);
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        this.f21447d = this.f21445b.mo20117a(new NetService.AbstractC5074c<ThumbSyncResult>() {
            /* class com.bytedance.ee.bear.lark.announcement.ThumbnailSyncHelper.C79812 */

            /* renamed from: a */
            public ThumbSyncResult parse(String str) throws NetService.ParseException {
                return new ThumbSyncResult();
            }
        }).mo20141a(fVar).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$ThumbnailSyncHelper$eszvowRCE4nw0Bbc45m2HeNc3Qw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ThumbnailSyncHelper.this.m31872a((ThumbnailSyncHelper) ((ThumbnailSyncHelper.ThumbSyncResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.lark.announcement.$$Lambda$ThumbnailSyncHelper$5WKVSEq4RPE2254g1fCZPiCKSM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ThumbnailSyncHelper.this.m31873a((ThumbnailSyncHelper) ((Throwable) obj));
            }
        });
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31873a(Throwable th) throws Exception {
        C13479a.m54759a("ThumbnailSyncHelper", "accept: ", th);
        AbstractC68323g<String> gVar = this.f21444a;
        if (gVar != null && !gVar.isCancelled()) {
            this.f21444a.onError(th);
            this.f21444a.onComplete();
            this.f21444a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31872a(ThumbSyncResult thumbSyncResult) throws Exception {
        C13479a.m54764b("ThumbnailSyncHelper", "accept: ");
        AbstractC68323g<String> gVar = this.f21444a;
        if (gVar != null && !gVar.isCancelled()) {
            this.f21444a.onNext(mo30940b());
            this.f21444a.onComplete();
            this.f21444a = null;
        }
    }

    ThumbnailSyncHelper(AbstractC4928g gVar, BearUrl bearUrl) {
        String str;
        String str2 = "";
        if (bearUrl == null) {
            str = str2;
        } else {
            str = bearUrl.f17446a;
        }
        this.f21448e = str;
        this.f21446c = bearUrl != null ? bearUrl.f17447b : str2;
    }
}

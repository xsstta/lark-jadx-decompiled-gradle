package com.ss.android.lark.share.impl.p2682a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.impl.p2682a.p2683a.C54726b;
import com.ss.android.lark.utils.rxjava.C57865c;
import io.reactivex.functions.Consumer;

/* renamed from: com.ss.android.lark.share.impl.a.c */
public class C54734c extends AbstractC54724a {

    /* renamed from: h */
    private static final String[] f135168h = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: f */
    private String f135169f = "";

    /* renamed from: g */
    private final C51331a f135170g;

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public boolean mo186868c() {
        if (!"share.lark.com".equals(this.f135148e) || !"/im/forward.html".equals(this.f135169f)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: c */
    public void mo186867c(Intent intent) {
        m212376e(intent);
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: d */
    public void mo186869d(Intent intent) {
        m212376e(intent);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ C54726b m212374a(Bundle bundle) {
        return C54726b.C54727a.m212364a(this.f135145b, bundle);
    }

    public C54734c(Activity activity) {
        super(activity);
        this.f135170g = new C51331a(activity);
    }

    /* renamed from: e */
    private void m212376e(Intent intent) {
        m212375b(intent.getExtras(), new IGetDataCallback<C54726b>() {
            /* class com.ss.android.lark.share.impl.p2682a.C54734c.C547384 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                C54734c.this.mo186861a();
                if (errorResult == null) {
                    str = "parseMediaMessage";
                } else {
                    str = errorResult.getDebugMsg();
                }
                Log.m165383e("ForwardHandler", str);
            }

            /* renamed from: a */
            public void onSuccess(C54726b bVar) {
                CommonShareData commonShareData;
                String str;
                if (bVar == null) {
                    commonShareData = null;
                } else {
                    commonShareData = bVar.mo186866a();
                }
                C54713a.m212321a().mo178390c().mo178395a(C54734c.this.f135145b, commonShareData, false);
                ShareHitPoint.Companion aVar = ShareHitPoint.f121870e;
                String str2 = "";
                if (commonShareData == null) {
                    str = str2;
                } else {
                    str = commonShareData.getSource();
                }
                if (commonShareData != null) {
                    str2 = C54726b.m212362a(commonShareData.getType());
                }
                aVar.mo169315b(str, str2);
            }
        });
    }

    @Override // com.ss.android.lark.share.impl.p2682a.AbstractC54724a, com.ss.android.lark.share.impl.AbstractC54723a
    /* renamed from: b */
    public void mo186864b(Intent intent) {
        String str;
        super.mo186864b(intent);
        if (this.f135147d == null) {
            str = "";
        } else {
            str = this.f135147d.getPath();
        }
        this.f135169f = str;
    }

    /* renamed from: a */
    public void mo186870a(Bundle bundle, final IGetDataCallback<C54726b> iGetDataCallback) {
        C57865c.m224575a(new C57865c.AbstractC57873d(bundle) {
            /* class com.ss.android.lark.share.impl.p2682a.$$Lambda$c$dpY8Hs55M25L0OaumcwU_Nppak */
            public final /* synthetic */ Bundle f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C54734c.m270982lambda$dpY8Hs55M25L0OaumcwU_Nppak(C54734c.this, this.f$1);
            }
        }, new C57865c.AbstractC57871b<C54726b>() {
            /* class com.ss.android.lark.share.impl.p2682a.C54734c.C547362 */

            /* renamed from: a */
            public void consume(C54726b bVar) {
                iGetDataCallback.onSuccess(bVar);
            }
        }, new C57865c.AbstractC57871b<Throwable>() {
            /* class com.ss.android.lark.share.impl.p2682a.C54734c.C547373 */

            /* renamed from: a */
            public void consume(Throwable th) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                iGetDataCallback.onError(new ErrorResult("parseMediaMessageAsync exception:" + th.toString()));
            }
        });
    }

    /* renamed from: b */
    private void m212375b(final Bundle bundle, final IGetDataCallback<C54726b> iGetDataCallback) {
        if (bundle != null) {
            int i = bundle.getInt("android.intent.lark.EXTRA_COMMAMD_TYPE");
            if (i == 3 || i == 4) {
                this.f135170g.mo176924c(f135168h).subscribe(new Consumer<Boolean>() {
                    /* class com.ss.android.lark.share.impl.p2682a.C54734c.C547351 */

                    /* renamed from: a */
                    public void accept(Boolean bool) {
                        if (bool.booleanValue()) {
                            C54734c.this.mo186870a(bundle, iGetDataCallback);
                        } else {
                            iGetDataCallback.onError(new ErrorResult("request external storage rw permission failed"));
                        }
                    }
                });
            } else {
                mo186870a(bundle, iGetDataCallback);
            }
        }
    }
}

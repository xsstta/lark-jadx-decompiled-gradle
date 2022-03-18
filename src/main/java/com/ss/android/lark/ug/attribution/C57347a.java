package com.ss.android.lark.ug.attribution;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.apm.UGAppreciable;
import com.ss.android.lark.ug.attribution.bean.Attribution;
import com.ss.android.lark.ug.attribution.bean.C57357a;
import com.ss.android.lark.ug.attribution.bean.C57358b;
import com.ss.android.lark.ug.attribution.p2854a.AbstractC57352b;
import com.ss.android.lark.ug.attribution.p2854a.C57351a;
import com.ss.android.lark.ug.attribution.p2855b.C57354a;
import com.ss.android.lark.ug.attribution.p2856c.AbstractC57360b;
import com.ss.android.lark.ug.attribution.p2856c.C57359a;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.lark.ug.attribution.a */
public class C57347a implements AbstractC57353b {

    /* renamed from: a */
    public C57351a f141203a = new C57351a();

    /* renamed from: b */
    public AbstractC57360b f141204b = new C57359a();

    /* renamed from: c */
    private AbstractC57392a f141205c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ug.attribution.a$a */
    public static class C57350a {

        /* renamed from: a */
        public static final C57347a f141211a = new C57347a();
    }

    /* renamed from: a */
    public static C57347a m222308a() {
        return C57350a.f141211a;
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: d */
    public Boolean mo194495d() {
        boolean z;
        if (this.f141204b.mo194519a() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: b */
    public void mo194491b() {
        if (this.f141204b.mo194519a() != null) {
            Log.m165389i("AttributionFacade", "already got install attribution; current attribution=" + this.f141204b.mo194519a());
            return;
        }
        final C57354a aVar = new C57354a(this.f141205c);
        this.f141203a.mo194499a(new AbstractC57352b() {
            /* class com.ss.android.lark.ug.attribution.C57347a.C573481 */

            @Override // com.ss.android.lark.ug.attribution.p2854a.AbstractC57352b
            /* renamed from: a */
            public void mo194497a(C57357a aVar) {
                if (aVar.mo194512a() == null || aVar.mo194515b() == null) {
                    Log.m165389i("AttributionFacade", "attribution param is not ready");
                    return;
                }
                C57347a.this.f141203a.mo194502b(this);
                Log.m165389i("AttributionFacade", "attribution param is ready, try to load attribution from server, attribution param=" + aVar);
                final long uptimeMillis = SystemClock.uptimeMillis();
                final UGAppreciable.NetPoint c = OnBoardingAppreciable.f141195a.mo194465c();
                c.mo194485a();
                aVar.mo194505a(new C57358b(aVar.mo194512a(), JSON.toJSONString(aVar.mo194515b())), new IGetDataCallback<Attribution>() {
                    /* class com.ss.android.lark.ug.attribution.C57347a.C573481.C573491 */

                    /* renamed from: a */
                    public void onSuccess(Attribution attribution) {
                        if (attribution != null) {
                            C57347a.this.f141204b.mo194520a(attribution);
                        }
                        Log.m165389i("AttributionFacade", "load install attribution success, attribution=" + attribution);
                        UGApm.f141196a.mo194469a(true, 0, SystemClock.uptimeMillis() - uptimeMillis);
                        c.mo194487b();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        UGApm.f141196a.mo194469a(false, Integer.valueOf(errorResult.getErrorCode()), SystemClock.uptimeMillis() - uptimeMillis);
                        Log.m165383e("AttributionFacade", "load install failed, err=" + errorResult);
                        c.mo194486a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: c */
    public String mo194493c() {
        Attribution b = this.f141204b.mo194521b();
        if (b == null || TextUtils.isEmpty(b.getSource())) {
            b = this.f141204b.mo194519a();
        }
        if (b == null || b.getSource() == null) {
            return "";
        }
        return b.getSource();
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: a */
    public void mo194488a(AbstractC57392a aVar) {
        this.f141205c = aVar;
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: a */
    public void mo194490a(Map<String, Object> map) {
        this.f141203a.mo194501a(map);
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: a */
    public void mo194489a(String str) {
        this.f141203a.mo194500a(str);
        Log.m165383e("AttributionFacade", "get af data failed, err=" + str);
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: b */
    public void mo194492b(String str) {
        this.f141203a.mo194503b(str);
        Log.m165389i("AttributionFacade", "get device id success, device id=" + str);
    }

    /* renamed from: c */
    public void mo194494c(String str) {
        this.f141204b.mo194522b(new Attribution(str, Collections.emptyMap()));
        Log.m165389i("AttributionFacade", "on user attribution changed, user attribution=" + str);
    }

    @Override // com.ss.android.lark.ug.attribution.AbstractC57353b
    /* renamed from: d */
    public String mo194496d(String str) {
        Attribution b = this.f141204b.mo194521b();
        if (b == null || !b.getConfigs().containsKey(str)) {
            Attribution a = this.f141204b.mo194519a();
            if (a == null || !a.getConfigs().containsKey(str)) {
                Log.m165389i("AttributionFacade", "get attribution config failed, key=" + str + ", value=null");
                return "";
            }
            String str2 = a.getConfigs().get(str);
            Log.m165389i("AttributionFacade", "get attribution config from install, key=" + str + ", value=" + str2);
            return str2;
        }
        String str3 = b.getConfigs().get(str);
        Log.m165389i("AttributionFacade", "get attribution config from user, key=" + str + ", value=" + str3);
        return str3;
    }
}

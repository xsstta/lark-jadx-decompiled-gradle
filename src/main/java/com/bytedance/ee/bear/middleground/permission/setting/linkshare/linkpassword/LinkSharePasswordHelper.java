package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

public class LinkSharePasswordHelper {

    /* renamed from: a */
    private NetService f27141a = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    public static class Data implements NonProguard {
        private String password;

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String str) {
            this.password = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ NetService.Result m41789a(String str) throws NetService.ParseException {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<Data>>() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.LinkSharePasswordHelper.C100423 */
        }, new Feature[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ NetService.Result m41790b(String str) throws NetService.ParseException {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<String>>() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.LinkSharePasswordHelper.C100412 */
        }, new Feature[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ NetService.Result m41791c(String str) throws NetService.ParseException {
        return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<Data>>() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.LinkSharePasswordHelper.C100401 */
        }, new Feature[0]);
    }

    /* renamed from: a */
    public AbstractC68307f<NetService.Result<Data>> mo38363a(String str, int i, boolean z) {
        NetService.C5077f fVar = new NetService.C5077f(LinkPwdAPISelector.m41825a(z));
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", (Object) str);
        jSONObject.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        fVar.mo20153c(jSONObject.toJSONString());
        return this.f27141a.mo20117a(new NetService.AbstractC5074c() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$LinkSharePasswordHelper$81VmYS4nFNPiA0TQPXKjfEbl7Z8 */

            @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
            public final NetService.Result parse(String str) {
                return LinkSharePasswordHelper.lambda$81VmYS4nFNPiA0TQPXKjfEbl7Z8(LinkSharePasswordHelper.this, str);
            }
        }).mo20141a(fVar);
    }

    /* renamed from: b */
    public AbstractC68307f<NetService.Result<String>> mo38364b(String str, int i, boolean z) {
        NetService.C5077f fVar = new NetService.C5077f(LinkPwdAPISelector.m41828d(z));
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", (Object) str);
        jSONObject.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        fVar.mo20153c(jSONObject.toJSONString());
        return this.f27141a.mo20117a(new NetService.AbstractC5074c() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$LinkSharePasswordHelper$GpC2tb6lkYxHqN5jQEhMWnAzMuo */

            @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
            public final NetService.Result parse(String str) {
                return LinkSharePasswordHelper.lambda$GpC2tb6lkYxHqN5jQEhMWnAzMuo(LinkSharePasswordHelper.this, str);
            }
        }).mo20141a(fVar);
    }

    /* renamed from: c */
    public AbstractC68307f<NetService.Result<Data>> mo38365c(String str, int i, boolean z) {
        NetService.C5077f fVar = new NetService.C5077f(LinkPwdAPISelector.m41826b(z));
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", (Object) str);
        jSONObject.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(i));
        fVar.mo20153c(jSONObject.toJSONString());
        return this.f27141a.mo20117a(new NetService.AbstractC5074c() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$LinkSharePasswordHelper$titKRIaHguIDA2_tbu8I6iR16A */

            @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
            public final NetService.Result parse(String str) {
                return LinkSharePasswordHelper.m269867lambda$titKRIaHguIDA2_tbu8I6iR16A(LinkSharePasswordHelper.this, str);
            }
        }).mo20141a(fVar);
    }
}

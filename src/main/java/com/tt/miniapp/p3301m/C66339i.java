package com.tt.miniapp.p3301m;

import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.share.AbstractC67678b;
import com.tt.option.share.AbstractC67681d;
import com.tt.option.share.AbstractC67682e;
import com.tt.option.share.AbstractC67684g;
import com.tt.option.share.ShareInfoModel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.m.i */
public class C66339i implements AbstractC67678b, AbstractC67684g {

    /* renamed from: a */
    public AbstractC67678b.AbstractC67679a f167416a;

    /* renamed from: b */
    public AbstractC67684g f167417b;

    /* renamed from: c */
    public ShareInfoModel f167418c;

    @Override // com.tt.option.share.AbstractC67678b
    public ShareInfoModel obtainShareInfo() {
        return this.f167418c;
    }

    @Override // com.tt.option.share.AbstractC67678b
    public AbstractC67678b.AbstractC67679a obtainShareInfoCallback() {
        return this.f167416a;
    }

    @Override // com.tt.option.share.AbstractC67684g
    /* renamed from: a */
    public void mo88408a(String str) {
        AbstractC67684g gVar = this.f167417b;
        if (gVar != null) {
            gVar.mo88408a(str);
            this.f167417b = null;
        }
        this.f167418c = null;
    }

    @Override // com.tt.option.share.AbstractC67678b
    public void getShareToken(final ShareInfoModel shareInfoModel, final AbstractC67682e eVar) {
        Observable.create(new Function<Map>() {
            /* class com.tt.miniapp.p3301m.C66339i.C663433 */

            /* renamed from: a */
            public Map fun() {
                try {
                    C66339i.this.f167418c = null;
                    return new C25277a(null, 0, null).mo88388a(shareInfoModel);
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "HostOptionShareDependImpl", e.getStackTrace());
                    return null;
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<Map>() {
            /* class com.tt.miniapp.p3301m.C66339i.C663422 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                AbstractC67682e eVar = eVar;
                if (eVar != null) {
                    eVar.mo88407a(th.getMessage());
                }
            }

            /* renamed from: a */
            public void onSuccess(Map map) {
                AbstractC67682e eVar = eVar;
                if (eVar == null) {
                    return;
                }
                if (map == null) {
                    eVar.mo88407a(ApiCallResultHelper.generateDataNullExtraInfo("shareInfo"));
                    return;
                }
                ShareInfoModel shareInfoModel = shareInfoModel;
                shareInfoModel.title = (String) map.get("title");
                shareInfoModel.imageUrl = (String) map.get("imageUrl");
                shareInfoModel.token = (String) map.get("token");
                shareInfoModel.ugUrl = (String) map.get("ugUrl");
                shareInfoModel.miniImageUrl = (String) map.get("miniImageUrl");
                shareInfoModel.linkTitle = (String) map.get("linkTitle");
                shareInfoModel.desc = (String) map.get("desc");
                C66339i.this.f167418c = shareInfoModel;
                eVar.mo88406a(shareInfoModel);
            }
        });
    }

    @Override // com.tt.option.share.AbstractC67678b
    public void getShareBaseInfo(final String str, final AbstractC67681d dVar, final IAppContext iAppContext) {
        try {
            final Dialog c = new C25277a(null, 0, null).mo88396c(C67590h.m263073a((int) R.string.microapp_m_generating_publish_content));
            if (c != null) {
                c.show();
            }
            this.f167416a = new AbstractC67678b.AbstractC67679a() {
                /* class com.tt.miniapp.p3301m.C66339i.C663401 */

                @Override // com.tt.option.share.AbstractC67678b.AbstractC67679a
                /* renamed from: a */
                public void mo231837a(String str, final AbstractC67684g gVar) {
                    C66339i.this.f167416a = null;
                    C66339i.this.f167418c = null;
                    C66339i.this.f167417b = gVar;
                    ShareInfoModel parse = ShareInfoModel.parse(str, iAppContext);
                    parse.channel = str;
                    C66339i.this.getShareToken(parse, new AbstractC67682e() {
                        /* class com.tt.miniapp.p3301m.C66339i.C663401.C663411 */

                        @Override // com.tt.option.share.AbstractC67682e
                        /* renamed from: a */
                        public void mo88406a(ShareInfoModel shareInfoModel) {
                            if (c != null && c.isShowing()) {
                                c.dismiss();
                            }
                            if (dVar != null) {
                                dVar.mo234945a(shareInfoModel, C66339i.this);
                            }
                        }

                        @Override // com.tt.option.share.AbstractC67682e
                        /* renamed from: a */
                        public void mo88407a(String str) {
                            if (c != null && c.isShowing()) {
                                c.dismiss();
                            }
                            if (dVar != null) {
                                dVar.mo234944a();
                            }
                            AbstractC67684g gVar = gVar;
                            if (gVar != null) {
                                gVar.mo88408a(str);
                            }
                        }
                    });
                }
            };
            HashMap hashMap = new HashMap();
            hashMap.put("channel", str);
            if (!TextUtils.isEmpty(AppbrandApplicationImpl.getInst(iAppContext).getCurrentWebViewUrl())) {
                hashMap.put("webViewUrl", AppbrandApplicationImpl.getInst(iAppContext).getCurrentWebViewUrl());
            }
            C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onShareAppMessage", new JSONObject(hashMap).toString());
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "HostOptionShareDependImpl", e.getStackTrace());
        }
    }
}

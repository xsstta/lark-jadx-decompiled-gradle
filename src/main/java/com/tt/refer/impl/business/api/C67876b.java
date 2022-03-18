package com.tt.refer.impl.business.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13322k;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24459a;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.littleapp.C41300b;
import com.ss.android.lark.littleapp.entity.ChatModel;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65796b;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67439g;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.option.ui.C67697b;
import com.tt.refer.common.base.AbstractC67743a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.file.AbstractC67918a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.AbstractC67712c;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3401a.p3402a.C67705d;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3400a.p3403b.AbstractC67717a;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3413b.p3414a.AbstractC67737a;
import io.reactivex.Observable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.refer.impl.business.api.b */
public class C67876b extends AbstractC67743a<AbstractC67709b.AbstractC67710a> implements AbstractC67709b {

    /* renamed from: a */
    private AbstractC65796b f170948a;

    /* renamed from: b */
    private Map<String, AbstractC67439g> f170949b = new HashMap();

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67709b.AbstractC67710a mo235129h() {
        final C678771 r0 = new AbstractC67712c() {
            /* class com.tt.refer.impl.business.api.C67876b.C678771 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c
            /* renamed from: a */
            public ChatModel mo235063a(String str) {
                CrossProcessDataEntity a = ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50436a("get_chat_by_tc", CrossProcessDataEntity.C67574a.m263013a().mo234760a("triggerCode", (Object) str).mo234763b());
                if (a != null) {
                    return new ChatModel(a.mo234740a("chat_id", ""), a.mo234740a("chat_name", ""), a.mo234740a("chat_biz_type", ""));
                }
                return new ChatModel();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c
            /* renamed from: a */
            public void mo235067a(List<String> list, final AbstractC67712c.AbstractC67713a aVar) {
                ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50446a("get_chat_avatar", CrossProcessDataEntity.C67574a.m263013a().mo234762a("chat_ids", list).mo234763b(), new AbstractC67727a() {
                    /* class com.tt.refer.impl.business.api.C67876b.C678771.C678792 */

                    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
                    /* renamed from: a */
                    public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                        AppBrandLogger.m52830i("GADGET_SENG_MSG", "onIpcCallback getChatAvatarUrls");
                        if (crossProcessDataEntity != null) {
                            aVar.onResult(crossProcessDataEntity.mo234750g("chat_avatar_urls"), crossProcessDataEntity.mo234750g("chat_names"));
                            return;
                        }
                        aVar.onResult(null, null);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c
            /* renamed from: a */
            public void mo235066a(String str, String str2, String str3, final AbstractC67712c.AbstractC67714b bVar) {
                ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50446a("send_card_json_to_pb", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234760a("chat_id", (Object) str2).mo234760a("card_json", (Object) str3).mo234763b(), new AbstractC67727a() {
                    /* class com.tt.refer.impl.business.api.C67876b.C678771.C678781 */

                    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
                    /* renamed from: a */
                    public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                        Bundle bundle;
                        AppBrandLogger.m52830i("GADGET_SENG_MSG", "onIpcCallback sendCardJsonToPb");
                        if (!(crossProcessDataEntity == null || (bundle = (Bundle) crossProcessDataEntity.mo234751h("send_card_json_to_pb_response")) == null)) {
                            byte[] byteArray = bundle.getByteArray("send_card_json_to_pb_card_content_bytes");
                            try {
                                bVar.onResult(bundle.getString("send_card_json_to_pb_card_key", null), CardContent.ADAPTER.decode(byteArray));
                                return;
                            } catch (IOException unused) {
                                AppBrandLogger.m52830i("GADGET_SENG_MSG", "decode bytes throw exception");
                            }
                        }
                        bVar.onResult(null, null);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c
            /* renamed from: a */
            public void mo235068a(List<String> list, String str, String str2, final AbstractC67712c.AbstractC67715c cVar) {
                ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50446a("send_preview_card", CrossProcessDataEntity.C67574a.m263013a().mo234762a("chat_ids", list).mo234760a("card_key", (Object) str).mo234760a("leave_message", (Object) str2).mo234763b(), new AbstractC67727a() {
                    /* class com.tt.refer.impl.business.api.C67876b.C678771.C678825 */

                    @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
                    /* renamed from: a */
                    public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                        String b;
                        AppBrandLogger.m52830i("GADGET_SENG_MSG", "onIpcCallback sendPreviewCard");
                        if (crossProcessDataEntity == null || (b = crossProcessDataEntity.mo234744b("send_preview_card_response")) == null) {
                            cVar.onResult(null);
                        } else {
                            cVar.onResult(b);
                        }
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c
            /* renamed from: a */
            public void mo235065a(Context context, List<String> list, CardContent cardContent, boolean z, final AbstractC67712c.AbstractC67716d dVar) {
                LarkExtensionManager.getInstance().getExtension().mo49597a(context, list, cardContent, z, new AbstractC13322k.AbstractC13324b() {
                    /* class com.tt.refer.impl.business.api.C67876b.C678771.C678814 */

                    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13322k.AbstractC13324b
                    /* renamed from: a */
                    public void mo49598a(boolean z, boolean z2, String str) {
                        dVar.onResult(z, z2, str);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67712c
            /* renamed from: a */
            public void mo235064a(Context context, String str, String str2, CardContent cardContent, boolean z, final AbstractC67712c.AbstractC67716d dVar) {
                LarkExtensionManager.getInstance().getExtension().mo49596a(context, str, str2, cardContent, z, new AbstractC13322k.AbstractC13324b() {
                    /* class com.tt.refer.impl.business.api.C67876b.C678771.C678803 */

                    @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13322k.AbstractC13324b
                    /* renamed from: a */
                    public void mo49598a(boolean z, boolean z2, String str) {
                        dVar.onResult(z, z2, str);
                    }
                });
            }
        };
        return new AbstractC67709b.AbstractC67710a() {
            /* class com.tt.refer.impl.business.api.C67876b.C678832 */

            /* renamed from: c */
            private Map<String, String> f170963c = new HashMap();

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public AbstractC67712c mo235014a() {
                return r0;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235037a(String str, String str2) {
                if (C67876b.this.f170082d.getAppType() == AppType.GadgetAPP) {
                    return C67053q.m261326a(str, str2, C67876b.this.f170082d);
                }
                AbstractC24459a aVar = (AbstractC24459a) C67876b.this.f170082d.findServiceByInterface(AbstractC24459a.class);
                if (aVar != null) {
                    return aVar.mo87273a(str, str2, C67876b.this.f170082d);
                }
                return true;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235035a(File file) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235080a(file);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235031a(long j) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235079a(j);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235028a(C67706e eVar) {
                if (C67876b.this.f170082d.getAppType() != AppType.GadgetAPP) {
                    ((AbstractC67717a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67717a.class)).mo50162a(eVar);
                } else if (eVar.mo235004b()) {
                    C67432a.m262319a(C67876b.this.f170082d).getJsBridge().sendMsgToJsCore2(eVar.mo235006d(), new C67705d(eVar.mo235007e()), false);
                } else if (eVar.mo235005c() >= 0) {
                    C67432a.m262319a(C67876b.this.f170082d).getJsBridge().sendMsgToJsCore(eVar.mo235006d(), eVar.mo235007e().toString(), eVar.mo235005c(), eVar.mo235003a());
                } else {
                    C67432a.m262319a(C67876b.this.f170082d).getJsBridge().sendMsgToJsCore(eVar.mo235006d(), eVar.mo235007e().toString());
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235032a(Activity activity, String str, String str2, String str3, boolean z) {
                return ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50449a(activity, str, str2, str3, z);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235029a(Object obj) {
                if (obj == null) {
                    AppBrandLogger.m52829e("APIServiceImpl", "requestParams is null");
                    return;
                }
                try {
                    m264071b(obj);
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("APIServiceImpl", "Throwable", th);
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235033a(Activity activity, String str, List<String> list, int i) {
                return HostDependManager.getInst().startImagePreviewActivity(activity, str, list, i);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235034a(Activity activity, List<ImageRequest> list, int i, AbstractC67668a aVar) {
                return HostDependManager.getInst().startImagePreviewActivity(activity, list, i, aVar);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235024a(Context context, String str, String str2, long j, String str3) {
                HostDependManager.getInst().showToast(context, str, str2, j, str3);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235025a(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, boolean z2, AbstractC67550j.AbstractC67551a<Integer> aVar) {
                C67697b bVar = new C67697b();
                bVar.mo234954a(context).mo234956a(str).mo234958b(str2).mo234961c(str3).mo234957a(z).mo234963d(str4).mo234965e(str5).mo234967f(str6).mo234969g(str7).mo234959b(z2).mo234955a(aVar).mo234953a(mo235051f());
                HostExtensionManager.getInstance().getHostInterface().showModal(bVar);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235026a(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar) {
                ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50444a(context, str, strArr, aVar);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235027a(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
                AppBrandLogger.m52830i("APIServiceImpl", "chooseVideo, maxDuration: ", Integer.valueOf(i), ", containsAlbum: ", Boolean.valueOf(z), ", containsCamera: ", Boolean.valueOf(z2), ", args: ", str);
                HostDependManager.getInst().chooseVideo(iAppContext, i, z, z2, str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235030a(int i) {
                return mo235036a(C67876b.this.f170082d.getAppId(), i);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public boolean mo235036a(String str, int i) {
                AbstractC67733a aVar = (AbstractC67733a) C67876b.this.f170082d.findServiceByInterface(AbstractC67733a.class);
                if (aVar != null) {
                    return aVar.mo50182a(str, i);
                }
                return true;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: j */
            public void mo235059j() {
                HostDependManager.getInst().hideToast();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: d */
            public File mo235047d() {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235085c();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: e */
            public File mo235049e() {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235081b();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: f */
            public Activity mo235051f() {
                if (C67876b.this.f170082d != null) {
                    return C67876b.this.f170082d.getCurrentActivity();
                }
                return null;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: g */
            public String mo235053g() {
                return ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50459d();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: h */
            public boolean mo235056h() {
                return ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50465g();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: k */
            public boolean mo235060k() {
                if (C67876b.this.f170082d.getAppType() != AppType.GadgetAPP || !HostDependManager.getInst().isDesktop()) {
                    return false;
                }
                return true;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: l */
            public boolean mo235061l() {
                return ((AbstractC67720a) C67876b.this.f170082d.findServiceByInterface(AbstractC67720a.class)).mo235074d();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: m */
            public void mo235062m() {
                if (C67876b.this.getAppContext().getAppType() == AppType.GadgetAPP) {
                    AppbrandApplicationImpl.getInst(C67876b.this.f170082d).setJumpToApp(true);
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: b */
            public String mo235039b() {
                AppInfoEntity appInfo;
                if ((C67876b.this.f170082d.getAppType() == AppType.GadgetAPP || C67876b.this.f170082d.getAppType() == AppType.WebGadgetAPP) && (appInfo = C67432a.m262319a(C67876b.this.getAppContext()).getAppInfo()) != null) {
                    return appInfo.bdpLaunchQuery;
                }
                return "";
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: c */
            public List<AbstractC67918a.C67921a> mo235045c() {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235078a();
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: i */
            public boolean mo235058i() {
                if (C67876b.this.f170082d.getAppType() == AppType.GadgetAPP) {
                    return C66236a.m259228c(C67876b.this.f170082d);
                }
                return false;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235018a(Activity activity) {
                C13175a.m53847a(activity);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public AbstractC67918a.C67921a mo235015a(String str) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235084c(str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: b */
            public File mo235038b(String str) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235076a(str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: c */
            public String mo235044c(String str) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235082b(str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: i */
            public List<C66578b.C66579a> mo235057i(String str) {
                AbstractC67733a aVar = (AbstractC67733a) C67876b.this.f170082d.findServiceByInterface(AbstractC67733a.class);
                if (aVar != null) {
                    return aVar.mo50176a(str);
                }
                return null;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: d */
            public String mo235048d(String str) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235088d(str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: e */
            public boolean mo235050e(String str) {
                return ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50450a(str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: f */
            public boolean mo235052f(String str) {
                return ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50456b(str);
            }

            /* renamed from: b */
            private void m264071b(Object obj) throws JSONException {
                String str;
                String g = mo235054g(C67876b.this.f170082d.getAppId());
                if (C67876b.this.f170082d.getAppType() == AppType.WebAPP) {
                    str = "h5Session";
                } else if (AppType.GadgetAPP == C67876b.this.f170082d.getAppType()) {
                    str = "minaSession";
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str) && g != null) {
                    if (obj instanceof JSONObject) {
                        ((JSONObject) obj).put(str, g);
                    } else if (obj instanceof Map) {
                        ((Map) obj).put(str, g);
                    }
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: c */
            public boolean mo235046c(File file) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235083b(file);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: g */
            public String mo235054g(String str) {
                if (C67876b.this.f170082d.getAppType() == AppType.GadgetAPP || C67876b.this.f170082d.getAppType() == AppType.BlockitApp) {
                    return C66612a.m260219a(C67876b.this.f170082d.getAppId());
                }
                if (C67876b.this.f170082d.getAppType() == AppType.WebAPP) {
                    return ((AbstractC67737a) C67876b.this.f170082d.findServiceByInterface(AbstractC67717a.class)).mo50165c();
                }
                AppBrandLogger.m52830i("APIServiceImpl", "getPlatformSession:platform session is empty!");
                return this.f170963c.get(str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: h */
            public void mo235055h(String str) {
                if (C67876b.this.f170082d.getAppType() != AppType.GadgetAPP && C67876b.this.f170082d.getAppType() != AppType.WebGadgetAPP && C67876b.this.f170082d.getAppType() != AppType.BlockitApp) {
                    this.f170963c.put(C67876b.this.f170082d.getAppId(), str);
                } else if (C67876b.this.f170082d.getAppId() == null) {
                    AppBrandLogger.m52829e("APIServiceImpl", "app id is null");
                } else {
                    C66612a.m260224a(str, C67876b.this.f170082d.getAppId());
                    C25529d.m91132a(C67876b.this.f170082d, "onAppSessionChanged");
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: b */
            public boolean mo235042b(File file) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235086c(file);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: b */
            public void mo235041b(String str, String str2) {
                ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50448a(str, str2);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: b */
            public boolean mo235043b(String str, int i) {
                AbstractC67733a aVar = (AbstractC67733a) C67876b.this.f170082d.findServiceByInterface(AbstractC67733a.class);
                if (aVar != null) {
                    return aVar.mo50185b(str, i);
                }
                return true;
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235023a(Context context, String str) {
                ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50442a(context, str);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public String mo235017a(String str, String str2, StringBuilder sb) {
                return ((AbstractC67722a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235077a(str, str2, sb);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public Observable<String> mo235016a(String str, Map<String, String> map, JSONObject jSONObject, boolean z) {
                return ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50437a(str, map, jSONObject, C67876b.this.f170082d, z);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235021a(Activity activity, String str, C66578b.C66579a aVar, final AbstractC67709b.AbstractC67711b bVar) {
                AbstractC67733a aVar2 = (AbstractC67733a) C67876b.this.f170082d.findServiceByInterface(AbstractC67733a.class);
                if (aVar2 != null) {
                    aVar2.mo235103a(activity, str, aVar, new AbstractC67540b() {
                        /* class com.tt.refer.impl.business.api.C67876b.C678832.C678841 */

                        @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                        /* renamed from: a */
                        public void mo87199a() {
                            bVar.mo87574a();
                        }

                        @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                        /* renamed from: a */
                        public void mo87200a(String str) {
                            bVar.mo87575a(str);
                        }
                    });
                } else {
                    bVar.mo87574a();
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235022a(Activity activity, String str, Set<String> set, AbstractC67709b.AbstractC67711b bVar) {
                AbstractC67733a aVar = (AbstractC67733a) C67876b.this.f170082d.findServiceByInterface(AbstractC67733a.class);
                if (aVar != null) {
                    aVar.mo232184a(activity, str, set, bVar);
                    return;
                }
                ((AbstractC67724a) C67876b.this.getAppContext().findServiceByInterface(AbstractC67724a.class)).mo50441a(activity, (String[]) set.toArray(new String[0]), bVar);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235020a(Activity activity, int i, boolean z, boolean z2, boolean z3) {
                C41300b.m163742a(activity, i, z, z2, z3);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: a */
            public void mo235019a(Activity activity, int i, int i2, String str, String str2) {
                ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50439a(activity, i, i2, str, str2);
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67710a
            /* renamed from: b */
            public void mo235040b(Activity activity, int i, int i2, String str, String str2) {
                ((AbstractC67724a) C67876b.this.f170082d.findServiceByInterface(AbstractC67724a.class)).mo50453b(activity, i, i2, str, str2);
            }
        };
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67439g
    /* renamed from: b */
    public void mo50164b() {
        for (Map.Entry<String, AbstractC67439g> entry : this.f170949b.entrySet()) {
            entry.getValue().mo50164b();
        }
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b
    /* renamed from: a */
    public AbstractC67439g mo235010a(String str) {
        return this.f170949b.get(str);
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b
    /* renamed from: a */
    public C67700a mo235011a(C67701b bVar) {
        C67700a a = this.f170948a.mo230478a(bVar);
        if (a == null) {
            return C67700a.f170530a;
        }
        return a;
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b
    /* renamed from: a */
    public void mo235012a(C67706e eVar) {
        ((AbstractC67709b.AbstractC67710a) mo235130i()).mo235028a(eVar);
    }

    public C67876b(IAppContext iAppContext, AbstractC65796b bVar) {
        super(iAppContext);
        this.f170948a = bVar;
    }

    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b
    /* renamed from: a */
    public void mo235013a(String str, AbstractC67439g gVar) {
        AbstractC67439g gVar2 = this.f170949b.get(str);
        if (gVar2 != null) {
            gVar2.mo50164b();
        }
        this.f170949b.put(str, gVar);
    }
}

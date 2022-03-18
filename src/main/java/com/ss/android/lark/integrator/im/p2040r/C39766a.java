package com.ss.android.lark.integrator.im.p2040r;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.biz.core.api.resource.ResourceRequestBaseSet;
import com.ss.android.lark.biz.core.api.resource.StickerSetDownloadState;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.dependency.IStickerModuleDependency;
import com.ss.android.lark.sticker.dto.C55077c;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.r.a */
public class C39766a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.r.a$a */
    public static class C39775a {

        /* renamed from: a */
        public static final IStickerModuleDependency f101329a = C39766a.m157869a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C54996a m157868a() {
        return new C54996a(C39775a.f101329a);
    }

    /* renamed from: a */
    public static IStickerModuleDependency m157869a(final Context context) {
        return new IStickerModuleDependency() {
            /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671 */

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: a */
            public Context mo144097a() {
                return context;
            }

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: b */
            public IStickerModuleDependency.AbstractC55074e mo144098b() {
                return new IStickerModuleDependency.AbstractC55074e() {
                    /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397681 */

                    /* renamed from: a */
                    private C55077c m157877a(Resource resource) {
                        if (resource != null) {
                            return new C55077c(resource.mo105842a(), resource.mo105845b());
                        }
                        return null;
                    }

                    /* renamed from: a */
                    public Map<String, C55077c> mo144105a(Map<String, Resource> map) {
                        HashMap hashMap = new HashMap();
                        if (map != null) {
                            for (String str : map.keySet()) {
                                C55077c a = m157877a(map.get(str));
                                if (a != null) {
                                    hashMap.put(str, a);
                                }
                            }
                        }
                        return hashMap;
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55074e
                    /* renamed from: a */
                    public Map<String, C55077c> mo144104a(String str, List<String> list) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : list) {
                            arrayList.add(new ResourceRequestBaseSet(str2, str));
                        }
                        return mo144105a(C39603g.m157159a().getCoreDependency().mo143377C().mo105869a(arrayList));
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55074e
                    /* renamed from: b */
                    public Map<String, C55077c> mo144107b(String str, List<String> list) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : list) {
                            arrayList.add(new ResourceRequestBaseSet(str2, str));
                        }
                        return mo144105a(C39603g.m157159a().getCoreDependency().mo143377C().mo105879b(arrayList));
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55074e
                    /* renamed from: a */
                    public void mo144106a(String str, List<String> list, final IGetDataCallback<Map<String, C55077c>> iGetDataCallback) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : list) {
                            arrayList.add(new ResourceRequestBaseSet(str2, str));
                        }
                        C39603g.m157159a().getCoreDependency().mo143377C().mo105875a(arrayList, -99, new IGetDataCallback<Map<String, Resource>>() {
                            /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397681.C397691 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(Map<String, Resource> map) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(C397681.this.mo144105a(map));
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: c */
            public IStickerModuleDependency.IForwardDependency mo144099c() {
                return new IStickerModuleDependency.IForwardDependency() {
                    /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397702 */

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.IForwardDependency
                    /* renamed from: a */
                    public void mo144109a(Activity activity, String str) {
                        C39603g.m157159a().getCoreDependency().mo143417a(activity, str);
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.IForwardDependency
                    /* renamed from: b */
                    public void mo144111b(Activity activity, String str) {
                        C39603g.m157159a().getCoreDependency().mo143522b(activity, str);
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.IForwardDependency
                    /* renamed from: a */
                    public void mo144110a(Context context, Message message, String str, String str2) {
                        C39603g.m157159a().getCoreDependency().mo143432a(context, message, str, str2, "");
                    }
                };
            }

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: d */
            public IStickerModuleDependency.AbstractC55071b mo144100d() {
                return new IStickerModuleDependency.AbstractC55071b() {
                    /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397713 */

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55071b
                    /* renamed from: a */
                    public void mo144112a(AbstractC29579a aVar) {
                        C39603g.m157159a().getCoreDependency().mo143476a(aVar);
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55071b
                    /* renamed from: a */
                    public void mo144113a(AbstractC29580b bVar) {
                        C39603g.m157159a().getCoreDependency().mo143477a(bVar);
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55071b
                    /* renamed from: a */
                    public void mo144114a(String str, String str2, String str3) {
                        C39603g.m157159a().getCoreDependency().mo143377C().mo105881b(str, str2, str3);
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55071b
                    /* renamed from: a */
                    public void mo144115a(List<String> list, String str, IGetDataCallback<StickerSetDownloadState> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143377C().mo105876a(list, str, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: e */
            public IStickerModuleDependency.AbstractC55073d mo144101e() {
                return new IStickerModuleDependency.AbstractC55073d() {
                    /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397724 */

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55073d
                    /* renamed from: a */
                    public void mo144116a(Context context, ImageView imageView, String str, LoadParams loadParams) {
                        C39603g.m157159a().getCoreDependency().mo143524b(context, imageView, str, loadParams);
                    }
                };
            }

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: f */
            public IStickerModuleDependency.AbstractC55072c mo144102f() {
                return new IStickerModuleDependency.AbstractC55072c() {
                    /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397735 */

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55072c
                    /* renamed from: a */
                    public int mo144117a() {
                        return AbstractC39484a.m156004a().mo104187N();
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55072c
                    /* renamed from: b */
                    public String mo144119b() {
                        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104067a();
                    }

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55072c
                    /* renamed from: a */
                    public void mo144118a(Context context, String str) {
                        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, (DialogInterface.OnDismissListener) null);
                    }
                };
            }

            @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency
            /* renamed from: g */
            public IStickerModuleDependency.AbstractC55070a mo144103g() {
                return new IStickerModuleDependency.AbstractC55070a() {
                    /* class com.ss.android.lark.integrator.im.p2040r.C39766a.C397671.C397746 */

                    @Override // com.ss.android.lark.sticker.dependency.IStickerModuleDependency.AbstractC55070a
                    /* renamed from: a */
                    public boolean mo144120a(long j, long j2, String str) {
                        return AbstractC39484a.m156004a().mo104231a(j, j2, str);
                    }
                };
            }
        };
    }
}

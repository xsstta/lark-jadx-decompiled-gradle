package com.ss.android.lark.integrator.im.p2035m;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.api.service.p1597a.p1598a.p1599a.C32817a;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2028h.AbstractC39636b;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.m.b */
public class C39718b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.m.b$a */
    public static class C39728a {

        /* renamed from: a */
        public static final IMessageLocationDependency f101271a = C39718b.m157700a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C41597c m157699a() {
        return new C41597c(C39728a.f101271a);
    }

    /* renamed from: a */
    public static IMessageLocationDependency m157700a(final Context context) {
        return new IMessageLocationDependency() {
            /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191 */

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: a */
            public Context mo143908a() {
                return context;
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: d */
            public C41597c mo143911d() {
                return C39718b.m157699a();
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: e */
            public IMessageLocationDependency.AbstractC41602a mo143912e() {
                return new IMessageLocationDependency.AbstractC41602a() {
                    /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397201 */

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41602a
                    /* renamed from: a */
                    public void mo143917a(String str, String str2, String str3, LocationContent locationContent, final String str4, int i, int i2) {
                        AbstractC39484a.m156004a().mo104258i().mo121090a(((C32817a.C32818a) ((C32817a.C32818a) ((C32817a.C32818a) C32817a.m126093a().mo125332j(str)).mo125330h(str2)).mo125331i(str3)).mo121116a(locationContent).mo121117a(str4).mo121115a(i).mo121119b(i2).mo121118a(), new IGetDataCallback<String>() {
                            /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397201.C397211 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                            }

                            /* renamed from: a */
                            public void onSuccess(String str) {
                                CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                                    /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397201.C397211.RunnableC397221 */

                                    public void run() {
                                        File file = new File(str4);
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                    }
                                });
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: f */
            public IMessageLocationDependency.AbstractC41604c mo143913f() {
                return new IMessageLocationDependency.AbstractC41604c() {
                    /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397232 */

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41604c
                    /* renamed from: a */
                    public Image mo143920a(com.bytedance.lark.pb.basic.v1.Image image) {
                        return C39603g.m157159a().getCoreDependency().mo143407a(image);
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41604c
                    /* renamed from: b */
                    public Image mo143923b(ImageSet imageSet) {
                        return C39603g.m157159a().getCoreDependency().mo143518b(imageSet);
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41604c
                    /* renamed from: a */
                    public Image mo143921a(ImageSet imageSet) {
                        return C39603g.m157159a().getCoreDependency().mo143408a(imageSet);
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41604c
                    /* renamed from: a */
                    public void mo143922a(Context context, ImageView imageView, Image image, LoadParams loadParams) {
                        C39603g.m157159a().getCoreDependency().mo143424a(context, imageView, image.getKey(), loadParams);
                    }
                };
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: g */
            public IMessageLocationDependency.AbstractC41603b mo143914g() {
                return new IMessageLocationDependency.AbstractC41603b() {
                    /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397243 */

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41603b
                    /* renamed from: a */
                    public void mo143924a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
                        AbstractC39636b.m157290a().mo136709b().mo136714a(list, "", iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41603b
                    /* renamed from: b */
                    public void mo143925b(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
                        AbstractC39636b.m157290a().mo136709b().mo136713a(list, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: h */
            public IMessageLocationDependency.IForwardDependency mo143915h() {
                return new IMessageLocationDependency.IForwardDependency() {
                    /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397254 */

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.IForwardDependency
                    /* renamed from: a */
                    public void mo143926a(Context context, Message message) {
                        C39603g.m157159a().getCoreDependency().mo143432a(context, message, "click", "location", "");
                    }
                };
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: i */
            public IMessageLocationDependency.AbstractC41605d mo143916i() {
                return new IMessageLocationDependency.AbstractC41605d() {
                    /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397265 */

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41605d
                    /* renamed from: a */
                    public AbstractC41561d mo143927a() {
                        return C39603g.m157159a().getCoreDependency().mo143388N();
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41605d
                    /* renamed from: b */
                    public AbstractC41569h mo143930b() {
                        return C39603g.m157159a().getCoreDependency().mo143389O();
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41605d
                    /* renamed from: c */
                    public AbstractC41562e mo143932c() {
                        return C39603g.m157159a().getCoreDependency().mo143390P();
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41605d
                    /* renamed from: a */
                    public boolean mo143928a(Context context, final C41597c.AbstractC41601a aVar) {
                        return C39603g.m157159a().getCoreDependency().mo143500a(context, new AbstractC41567g.AbstractC41568a() {
                            /* class com.ss.android.lark.integrator.im.p2035m.C39718b.C397191.C397265.C397271 */

                            @Override // com.ss.android.lark.location.p2146b.AbstractC41567g.AbstractC41568a
                            public void onLocationChange(LarkLocation larkLocation) {
                                aVar.mo149722a(larkLocation);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41605d
                    /* renamed from: b */
                    public boolean mo143931b(double d, double d2) {
                        return C39603g.m157159a().getCoreDependency().mo143556b(d, d2);
                    }

                    @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency.AbstractC41605d
                    /* renamed from: a */
                    public double[] mo143929a(double d, double d2) {
                        return C39603g.m157159a().getCoreDependency().mo143504a(d, d2);
                    }
                };
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: b */
            public boolean mo143909b() {
                return C39603g.m157160b().isUsPackage();
            }

            @Override // com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency
            /* renamed from: c */
            public String mo143910c() {
                return AbstractC39484a.m156004a().mo104235b();
            }
        };
    }
}

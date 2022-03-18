package com.ss.android.lark.platform.p2508x;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.platform.p2483d.C51795a;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.C54722a;
import com.ss.android.lark.share.p2681a.AbstractC54714a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* renamed from: com.ss.android.lark.platform.x.a */
public class C52054a {

    /* renamed from: com.ss.android.lark.platform.x.a$a */
    public static class C52062a {

        /* renamed from: a */
        public static final AbstractC54714a f129217a = C52054a.m201946a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C54713a m201947a() {
        return new C54713a(C52062a.f129217a);
    }

    /* renamed from: a */
    public static AbstractC54714a m201946a(final Context context) {
        return new AbstractC54714a() {
            /* class com.ss.android.lark.platform.p2508x.C52054a.C520551 */

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: a */
            public Context mo178386a() {
                return context;
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: c */
            public AbstractC54714a.AbstractC54716b mo178390c() {
                return new AbstractC54714a.AbstractC54716b() {
                    /* class com.ss.android.lark.platform.p2508x.C52054a.C520551.C520561 */

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54716b
                    /* renamed from: a */
                    public void mo178396a(Context context, Message message, ShareModel shareModel) {
                        C51838a.m200992a().mo140407a(context, message, shareModel);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54716b
                    /* renamed from: b */
                    public void mo178397b(Context context, CommonShareData commonShareData, boolean z) {
                        C51838a.m200992a().mo140399a(context, new ShareTextForwardData(commonShareData.getTitle(), commonShareData.getContent(), commonShareData.getSource(), commonShareData.isLocalShare(), z));
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54716b
                    /* renamed from: a */
                    public void mo178395a(Context context, CommonShareData commonShareData, boolean z) {
                        boolean z2;
                        ShareDataForwardData shareDataForwardData = new ShareDataForwardData();
                        shareDataForwardData.setImages(commonShareData.getImages());
                        int shareFileScene = commonShareData.getShareFileScene();
                        if (shareFileScene == 2 || shareFileScene == 4) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        shareDataForwardData.setSystemShare(z2);
                        shareDataForwardData.setSourceData(commonShareData);
                        shareDataForwardData.setForceStandAlone(z);
                        shareDataForwardData.setCanAddExtraInfo(commonShareData.isSupportAdditionNote());
                        shareDataForwardData.setTitle(commonShareData.getTitle());
                        shareDataForwardData.setContent(commonShareData.getContent());
                        shareDataForwardData.setSdkShare(commonShareData.isSdkShare());
                        shareDataForwardData.setSource(commonShareData.getSource());
                        shareDataForwardData.setVideos(commonShareData.getVideos());
                        C51838a.m200992a().mo140397a(context, shareDataForwardData);
                    }
                };
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: d */
            public AbstractC54714a.AbstractC54717c mo178391d() {
                return new AbstractC54714a.AbstractC54717c() {
                    /* class com.ss.android.lark.platform.p2508x.C52054a.C520551.C520572 */

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54717c
                    /* renamed from: a */
                    public boolean mo178398a() {
                        return C36083a.m141486a().getPassportDependency().mo133082b();
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54717c
                    /* renamed from: b */
                    public String mo178399b() {
                        return C36083a.m141486a().getPassportDependency().mo133085d();
                    }
                };
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: e */
            public AbstractC54714a.AbstractC54715a mo178392e() {
                return new AbstractC54714a.AbstractC54715a() {
                    /* class com.ss.android.lark.platform.p2508x.C52054a.C520551.C520583 */

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178408a(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132870a(str, list, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public Message mo178400a(String str) {
                        return C36083a.m141486a().getIMDependency().mo132885b(str);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178401a(String str, IGetDataCallback<Chat> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132858a(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178403a(String str, Integer num, C54722a aVar, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132850a(((C29631w.C29633a) ((C29631w.C29633a) C29631w.m109564a().mo125332j(str)).mo125328c(num.intValue())).mo106767a(aVar.f135141a).mo106768a(aVar.f135142b).mo106766a(aVar.f135143c).mo106769a(), iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178402a(String str, Integer num, Uri uri, IGetDataCallback<String> iGetDataCallback) {
                        C29613e.C29615a a = ((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(str)).mo125328c(num.intValue())).mo106700a(uri);
                        Application application = LarkContext.getApplication();
                        if (application != null) {
                            String f = LarkUriUtil.m95310f(application, uri);
                            if (f == null) {
                                f = "*/*";
                            }
                            a.mo106706d(f);
                            Pair<String, Long> e = LarkUriUtil.m95308e(application, uri);
                            if (e != null) {
                                a.mo106704b(e.getFirst()).mo106699a(e.getSecond().longValue());
                            }
                        }
                        C36083a.m141486a().getIMDependency().mo132843a(a.mo106703a(), iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178404a(String str, Integer num, RichText richText, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132841a(((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125328c(num.intValue())).mo106659a(richText).mo106660a(), iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178405a(String str, Integer num, File file, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132843a(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(str)).mo125328c(num.intValue())).mo106704b(file.getName()).mo106702a(file.getPath()).mo106699a(C26311p.m95281c(file)).mo106706d(C26311p.m95279b(file)).mo106703a(), iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178407a(String str, String str2, String str3, int i, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132840a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125331i(str3)).mo125330h(str3)).mo125333k(str3)).mo125328c(i)).mo106659a(C59029c.m229161b(str2)).mo106660a());
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54715a
                    /* renamed from: a */
                    public void mo178406a(final String str, Integer num, final String str2, final String str3, String str4, String str5, final IGetDataCallback<String> iGetDataCallback) {
                        final ShareAppCardLink abVar = new ShareAppCardLink(str4, str4, str4, str4);
                        if (TextUtils.isEmpty(str5)) {
                            C36083a.m141486a().getIMDependency().mo132871a(Collections.singletonList(str), 3, "", abVar, str2, null, str3, iGetDataCallback);
                        } else {
                            C51854a.m201094a().mo142163a(C520551.this.mo178386a(), str5, false, false, (AbstractC25974h) null, (IGetDataCallback<EncryptImageData>) new IGetDataCallback<EncryptImageData>() {
                                /* class com.ss.android.lark.platform.p2508x.C52054a.C520551.C520583.C520591 */

                                /* renamed from: a */
                                public void onSuccess(EncryptImageData encryptImageData) {
                                    m201971a(encryptImageData.f73838b);
                                }

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    m201971a((String) null);
                                }

                                /* renamed from: a */
                                private void m201971a(String str) {
                                    C36083a.m141486a().getIMDependency().mo132871a(Collections.singletonList(str), 3, "", abVar, str2, str, str3, iGetDataCallback);
                                }
                            });
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: f */
            public AbstractC54714a.AbstractC54719e mo178393f() {
                return new AbstractC54714a.AbstractC54719e() {
                    /* class com.ss.android.lark.platform.p2508x.C52054a.C520551.C520604 */

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54719e
                    /* renamed from: a */
                    public boolean mo178410a(Context context) {
                        return UIUtils.isActivityAlive(context, MainActivity.class.getName());
                    }

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54719e
                    /* renamed from: b */
                    public void mo178411b(Context context) {
                        C36149a.m142162a().mo157098b().mo105705b(context);
                    }
                };
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: g */
            public AbstractC54714a.AbstractC54718d mo178394g() {
                return new AbstractC54714a.AbstractC54718d() {
                    /* class com.ss.android.lark.platform.p2508x.C52054a.C520551.C520615 */

                    @Override // com.ss.android.lark.share.p2681a.AbstractC54714a.AbstractC54718d
                    /* renamed from: a */
                    public void mo178412a(Context context, String str) {
                        C36083a.m141486a().getMailDependency().mo132972b(context, str);
                    }
                };
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: b */
            public boolean mo178389b() {
                return C51795a.m200798a().mo104163b();
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: a */
            public void mo178387a(Context context) {
                C51795a.m200798a().mo104161a(context);
            }

            @Override // com.ss.android.lark.share.p2681a.AbstractC54714a
            /* renamed from: a */
            public void mo178388a(Context context, Intent intent) {
                C36149a.m142162a().mo157098b().mo105700a(context, intent);
            }
        };
    }
}

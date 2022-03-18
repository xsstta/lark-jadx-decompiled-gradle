package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.core.dependency.AbstractC36132s;
import com.ss.android.lark.integrator.core.p2016a.C39351a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.vc.api.AbstractC57899a;
import com.ss.android.lark.vc.api.AbstractC57900b;
import com.ss.android.lark.vc.api.AbstractC57902d;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.android.vc.dto.VCLaunchError;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.integrator.core.s */
public class C39391s implements AbstractC36132s {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m155592a(Boolean bool) {
    }

    C39391s() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public boolean mo133138a() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).hasMeetingOngoingOnCurrentProcess();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public boolean mo133140a(String str) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isVCUrl(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public boolean mo133139a(Context context, String str, int i) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).handleSaysUrl(context, str, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133137a(final String str, boolean z, final boolean z2, final IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback) {
        final IVCApi iVCApi = (IVCApi) ApiUtils.getApi(IVCApi.class);
        final IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        C57865c.m224574a(new C57865c.AbstractC57873d<Chatter>() {
            /* class com.ss.android.lark.integrator.core.C39391s.C393954 */

            /* renamed from: a */
            public Chatter produce() {
                return iIMApi.getChatterById(str);
            }
        }, new C57865c.AbstractC57871b<Chatter>() {
            /* class com.ss.android.lark.integrator.core.C39391s.C393965 */

            /* renamed from: a */
            public void consume(Chatter chatter) {
                iVCApi.launchVideoChat(chatter, z2, new IGetDataCallback<VCLaunchError>() {
                    /* class com.ss.android.lark.integrator.core.C39391s.C393965.C393971 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(VCLaunchError vCLaunchError) {
                        if (iVCLaunchCallback != null) {
                            iVCLaunchCallback.mo178828a(C39391s.this.mo143233a(vCLaunchError));
                        }
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: h */
    public AbstractC44136a.AbstractC44139aa mo133151h() {
        return new C39351a();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: c */
    public boolean mo133144c() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).shouldShowVcInternalFeedbackDialog();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: d */
    public boolean mo133146d() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isEnterprisePhoneAuthorized();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: e */
    public boolean mo133148e() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isVideoChatSettingEnable();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: f */
    public void mo133149f() {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).otherOpenCamera();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: g */
    public boolean mo133150g() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isInMeeting();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.integrator.core.s$6 */
    public static /* synthetic */ class C393986 {

        /* renamed from: a */
        static final /* synthetic */ int[] f100730a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.dto.VCLaunchError[] r0 = com.ss.android.vc.dto.VCLaunchError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.integrator.core.C39391s.C393986.f100730a = r0
                com.ss.android.vc.dto.VCLaunchError r1 = com.ss.android.vc.dto.VCLaunchError.COLLABORATION_AUTH_FAILED_BLOCKED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.integrator.core.C39391s.C393986.f100730a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.dto.VCLaunchError r1 = com.ss.android.vc.dto.VCLaunchError.COLLABORATION_AUTH_FAILED_NO_RIGHTS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.integrator.core.C39391s.C393986.f100730a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.dto.VCLaunchError r1 = com.ss.android.vc.dto.VCLaunchError.COLLABORATION_AUTH_FAILED_BE_BLOCKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.core.C39391s.C393986.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: b */
    public boolean mo133142b() {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).hasMeetingOngoingOnVcVoip();
    }

    /* renamed from: a */
    public int mo143233a(VCLaunchError vCLaunchError) {
        int i = C393986.f100730a[vCLaunchError.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: b */
    public void mo133141b(String str) {
        C57865c.m224574a(new C57865c.AbstractC57873d(str) {
            /* class com.ss.android.lark.integrator.core.$$Lambda$s$7dfTKt1eZWoXBsor6hE3b9jSvI8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return IIMApi.this.getChatterById(this.f$1);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.integrator.core.$$Lambda$s$cdhbLjCMyLsW_zEHUp6ejm_Eoc */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C39391s.m155591a(IVCApi.this, (Chatter) obj);
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: c */
    public boolean mo133145c(String str) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isSaysUrl(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: d */
    public boolean mo133147d(String str) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).isVcLiveUrl(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133131a(Activity activity) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).startVideoChatSettingActivity(activity);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133135a(final AbstractC48230h.AbstractC48231a aVar) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).setRtcStatsListener(new AbstractC57899a() {
            /* class com.ss.android.lark.integrator.core.C39391s.C393921 */

            @Override // com.ss.android.lark.vc.api.AbstractC57899a
            /* renamed from: a */
            public void mo143234a(long j, long j2) {
                aVar.mo168774a(j, j2);
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133136a(final C48246q qVar) {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            IVCApi iVCApi = (IVCApi) ApiUtils.getApi(IVCApi.class);
            iVCApi.addVideoChatStatusChangedListener(new AbstractC57900b() {
                /* class com.ss.android.lark.integrator.core.C39391s.C393932 */

                @Override // com.ss.android.lark.vc.api.AbstractC57900b
                /* renamed from: a */
                public void mo143235a() {
                    qVar.mo168810a(true);
                }

                @Override // com.ss.android.lark.vc.api.AbstractC57900b
                /* renamed from: b */
                public void mo143236b() {
                    qVar.mo168810a(false);
                }
            });
            iVCApi.addVoipStatusChangedListener(new AbstractC57902d() {
                /* class com.ss.android.lark.integrator.core.C39391s.C393943 */

                @Override // com.ss.android.lark.vc.api.AbstractC57902d
                /* renamed from: a */
                public void mo143237a() {
                    qVar.mo168810a(true);
                }

                @Override // com.ss.android.lark.vc.api.AbstractC57902d
                /* renamed from: b */
                public void mo143238b() {
                    qVar.mo168810a(false);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m155591a(IVCApi iVCApi, Chatter chatter) {
        C57865c.m224574a(new C57865c.AbstractC57873d(chatter) {
            /* class com.ss.android.lark.integrator.core.$$Lambda$s$xVBYlLgyxiPyjeqjIagrTldGLbg */
            public final /* synthetic */ Chatter f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C39391s.m155593b(IVCApi.this, this.f$1);
            }
        }, $$Lambda$s$GR0FX4imbKoVfiI_V66_7sXoxTw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m155593b(IVCApi iVCApi, Chatter chatter) {
        iVCApi.openEnterprisePhonePage(chatter, "", "profile");
        return true;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133132a(Context context, String str) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).openVCUrl(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133134a(ErrorResult errorResult, IGetDataCallback<String> iGetDataCallback) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).getViewI18nTemplate(errorResult, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: b */
    public boolean mo133143b(Context context, String str, int i) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).handleVcLiveUrl(context, str, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36132s
    /* renamed from: a */
    public void mo133133a(TextView textView, TextView textView2, ImageView imageView, Content content) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).bindViewWithVCMsg(textView, textView2, imageView, content);
    }
}

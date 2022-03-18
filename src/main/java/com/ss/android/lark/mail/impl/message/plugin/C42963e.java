package com.ss.android.lark.mail.impl.message.plugin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lark.pb.email.client.v1.UserInfo;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ShareButton;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.mail.impl.message.plugin.e */
public class C42963e {

    /* renamed from: a */
    public Activity f109400a;

    /* renamed from: b */
    public String f109401b;

    /* renamed from: c */
    public boolean f109402c;

    /* renamed from: d */
    public boolean f109403d;

    /* renamed from: e */
    private final String f109404e = "ShareThreadHandler";

    /* renamed from: f */
    private PermissionCode f109405f = PermissionCode.NONE;

    /* renamed from: g */
    private String f109406g = "";

    /* renamed from: h */
    private int f109407h;

    /* renamed from: i */
    private int f109408i;

    /* renamed from: com.ss.android.lark.mail.impl.message.plugin.e$a */
    public interface AbstractC42967a {
        /* renamed from: b */
        void mo154091b(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.plugin.e$b */
    public interface AbstractC42968b {
        /* renamed from: a */
        void mo154092a(UserInfo userInfo);
    }

    /* renamed from: a */
    public PermissionCode mo154082a() {
        return this.f109405f;
    }

    /* renamed from: b */
    public String mo154087b() {
        return this.f109406g;
    }

    /* renamed from: c */
    public boolean mo154088c() {
        return this.f109402c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.plugin.e$3 */
    public static /* synthetic */ class C429663 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109413a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.PermissionCode[] r0 = com.bytedance.lark.pb.email.client.v1.PermissionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.plugin.C42963e.C429663.f109413a = r0
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.OWNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.plugin.C42963e.C429663.f109413a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.plugin.C42963e.C429663.f109413a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.EDIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.plugin.C42963e.C429663.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo154084a(PermissionCode permissionCode) {
        if (permissionCode == null) {
            this.f109405f = PermissionCode.NONE;
        } else {
            this.f109405f = permissionCode;
        }
    }

    /* renamed from: a */
    public boolean mo154086a(final AbstractC42968b bVar) {
        Log.m165389i("ShareThreadHandler", "fetchOwnerInfoIfNeeded");
        if (this.f109405f == PermissionCode.VIEW || this.f109405f == PermissionCode.EDIT) {
            C42176e.m168344a().mo152262k(this.f109401b, new IGetDataCallback<MailGetShareThreadOwnerInfoResponse>() {
                /* class com.ss.android.lark.mail.impl.message.plugin.C42963e.C429641 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("ShareThreadHandler", "fetchOwnerInfoIfNeeded onError");
                    AbstractC42968b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo154092a(null);
                    }
                }

                /* renamed from: a */
                public void onSuccess(MailGetShareThreadOwnerInfoResponse mailGetShareThreadOwnerInfoResponse) {
                    UserInfo userInfo;
                    Log.m165389i("ShareThreadHandler", "fetchOwnerInfoIfNeeded onSuccess");
                    if (mailGetShareThreadOwnerInfoResponse != null) {
                        userInfo = mailGetShareThreadOwnerInfoResponse.owner;
                    } else {
                        userInfo = null;
                    }
                    if (userInfo == null || TextUtils.isEmpty(userInfo.email_address)) {
                        Log.m165389i("ShareThreadHandler", "fetchOwnerInfoIfNeeded onSuccess invalid owner info");
                        C42963e.this.f109403d = false;
                    } else {
                        C42963e.this.f109403d = true;
                    }
                    AbstractC42968b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo154092a(userInfo);
                    }
                }
            });
            return true;
        }
        Log.m165389i("ShareThreadHandler", "fetchOwnerInfoIfNeeded no need to fetch");
        return false;
    }

    /* renamed from: a */
    public void mo154085a(final AbstractC42967a aVar) {
        Log.m165389i("ShareThreadHandler", "fetchShareTipsIfNeeded");
        if (this.f109403d) {
            Log.m165389i("ShareThreadHandler", "fetchShareTipsIfNeeded no need to fetch again");
            return;
        }
        PermissionCode permissionCode = this.f109405f;
        if (permissionCode == null || permissionCode == PermissionCode.NONE) {
            Log.m165389i("ShareThreadHandler", "fetchShareTipsIfNeeded no need to show share tips");
            return;
        }
        int i = C429663.f109413a[this.f109405f.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                C42176e.m168344a().mo152260i(this.f109401b, new IGetDataCallback<MailGetThreadCollaboratorsInfoResponse>() {
                    /* class com.ss.android.lark.mail.impl.message.plugin.C42963e.C429652 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("ShareThreadHandler", "fetchShareTips onError");
                    }

                    /* renamed from: a */
                    public void onSuccess(MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) {
                        String str;
                        Log.m165389i("ShareThreadHandler", "fetchShareTips onSuccess");
                        if (mailGetThreadCollaboratorsInfoResponse == null) {
                            Log.m165383e("ShareThreadHandler", "fetchShareTips onSuccess empty response");
                        } else if (TextUtils.isEmpty(mailGetThreadCollaboratorsInfoResponse.threadId) || !mailGetThreadCollaboratorsInfoResponse.threadId.equals(C42963e.this.f109401b)) {
                            Log.m165383e("ShareThreadHandler", "fetchShareTips onSuccess thread id not match");
                        } else if (CollectionUtils.isEmpty(mailGetThreadCollaboratorsInfoResponse.users)) {
                            Log.m165383e("ShareThreadHandler", "fetchShareTips onSuccess invalid data");
                        } else {
                            for (UserInfo userInfo : mailGetThreadCollaboratorsInfoResponse.users) {
                                if (userInfo != null && userInfo.code == PermissionCode.OWNER) {
                                    if (C43785p.m173548c()) {
                                        str = userInfo.cn_name;
                                    } else {
                                        str = userInfo.en_name;
                                    }
                                    if (aVar != null && !TextUtils.isEmpty(str)) {
                                        aVar.mo154091b(C43819s.m173684a((int) R.string.Mail_Share_HintSharedBy).replace("{{who}}", str), "98");
                                    }
                                }
                            }
                        }
                    }
                });
            } else {
                Log.m165383e("ShareThreadHandler", "fetchShareTips switch to default");
            }
        } else if (aVar != null) {
            aVar.mo154091b(C43819s.m173684a((int) R.string.Mail_Share_HintSharedByYourself), "99");
        }
    }

    /* renamed from: a */
    public void mo154083a(Context context, AbsButton absButton) {
        Log.m165389i("ShareThreadHandler", "showShareButtonGuidingIfNeeded");
        C43849u.m173826a(new Runnable(absButton, context) {
            /* class com.ss.android.lark.mail.impl.message.plugin.$$Lambda$e$UWT9euuoSkVGB5sT0A7sS_vDyLI */
            public final /* synthetic */ AbsButton f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C42963e.lambda$UWT9euuoSkVGB5sT0A7sS_vDyLI(C42963e.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m171038a(AbsButton absButton, Context context) {
        if (!(absButton instanceof ShareButton) || absButton.getView() == null) {
            Log.m165383e("ShareThreadHandler", "showShareButtonGuidingIfNeeded invalid view");
            return;
        }
        int[] iArr = new int[2];
        absButton.getView().getLocationOnScreen(iArr);
        if (iArr[0] >= 0 && iArr[0] <= this.f109407h && iArr[1] >= 0 && iArr[1] <= this.f109408i) {
            Log.m165389i("ShareThreadHandler", "showShareButtonGuidingIfNeeded enqueue");
            C41816b.m166115a().mo150118H().mo150197a("all_email_feedread", new C38708a((Activity) context, (AbstractC38707a) null, new TextBubbleConfig(new AnchorConfig(new WeakReference(absButton.getView()), AnchorConfig.AnchorGravity.TOP), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), C43819s.m173684a((int) R.string.Mail_Share_ShareEmailOnboardingMobile), C43819s.m173690b((int) R.string.Mail_Share_ShareEmailOnboardingMobileDesc))));
        }
    }

    public C42963e(Activity activity, String str, PermissionCode permissionCode) {
        this.f109400a = activity;
        this.f109401b = str;
        mo154084a(permissionCode);
        this.f109407h = DeviceUtils.getScreenWidth(activity);
        this.f109408i = DeviceUtils.getScreenHeight(activity);
    }
}

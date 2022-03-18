package com.ss.android.lark.phone;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.phone.impl.C51348a;
import com.ss.android.lark.phone.impl.common.C51355a;
import com.ss.android.lark.phone.impl.common.PhoneControlStatus;
import com.ss.android.lark.phone.impl.service.C51413a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;
import com.ss.android.lark.phone.p2459a.AbstractC51337a;
import com.ss.android.lark.phone.statistics.IPhoneHitPoint;
import com.ss.android.lark.phone.statistics.PhoneHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.phone.b */
public class C51341b {

    /* renamed from: a */
    private static volatile AbstractC51337a f127841a;

    /* renamed from: b */
    private final C51413a f127842b = C51413a.m199326a();

    /* renamed from: a */
    public static AbstractC51337a m199137a() {
        return f127841a;
    }

    /* renamed from: b */
    public IPhoneHitPoint mo176936b() {
        return PhoneHitPoint.f127860a;
    }

    /* renamed from: a */
    private static void m199138a(AbstractC51337a aVar) {
        f127841a = aVar;
    }

    public C51341b(AbstractC51337a aVar) {
        m199138a(aVar);
    }

    /* renamed from: a */
    public void mo176930a(final Activity activity, String str) {
        C51348a.m199179a(activity, str, (C51348a.AbstractC51354b) new C51348a.AbstractC51354b() {
            /* class com.ss.android.lark.phone.C51341b.C513421 */

            @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
            /* renamed from: a */
            public void mo176941a() {
            }

            @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
            /* renamed from: a */
            public void mo176942a(List<C51348a.C51352a> list, String str) {
                C51355a.m199196a(activity, list, str);
            }
        });
    }

    /* renamed from: b */
    public void mo176937b(final Activity activity, String str) {
        C51348a.m199180a((Context) activity, str, (C51348a.AbstractC51354b) new C51348a.AbstractC51354b() {
            /* class com.ss.android.lark.phone.C51341b.C513432 */

            @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
            /* renamed from: a */
            public void mo176941a() {
            }

            @Override // com.ss.android.lark.phone.impl.C51348a.AbstractC51354b
            /* renamed from: a */
            public void mo176942a(List<C51348a.C51352a> list, String str) {
                C51355a.m199196a(activity, list, str);
            }
        });
    }

    /* renamed from: c */
    public void mo176939c(final Activity activity, final String str) {
        this.f127842b.mo177045a(str, new UIGetDataCallback(new IGetDataCallback<PhoneQueryControlInfo>() {
            /* class com.ss.android.lark.phone.C51341b.C513443 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Activity activity = activity;
                LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed));
                Log.m165383e("PhoneModule", "get phone query control info failed: " + errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(PhoneQueryControlInfo phoneQueryControlInfo) {
                if (!C51341b.this.mo176935a(phoneQueryControlInfo, activity)) {
                    PhoneControlStatus controlStatus = phoneQueryControlInfo.getControlStatus();
                    if (controlStatus == PhoneControlStatus.CAN_CALL) {
                        if (TextUtils.isEmpty(phoneQueryControlInfo.getPhoneNum())) {
                            Activity activity = activity;
                            LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed));
                            return;
                        }
                        C51341b.this.mo176932a(activity, str, phoneQueryControlInfo.getPhoneNum());
                    } else if (controlStatus == PhoneControlStatus.NO_PERMISSION_BY_EXECUTIVE) {
                        LKUIToast.show(activity, phoneQueryControlInfo.getAnnouncement());
                    } else {
                        C51341b.this.mo176934a(activity, str, phoneQueryControlInfo);
                    }
                }
            }
        }));
    }

    /* renamed from: d */
    public void mo176940d(final Activity activity, final String str) {
        String a = C51348a.m199176a();
        if (!TextUtils.isEmpty(a)) {
            C51355a.m199198b(activity, str, a);
        } else {
            m199137a().mo144005e().mo144015a(new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.phone.C51341b.C513476 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (UIUtils.isActivityRunning(activity)) {
                        C51355a.m199198b(activity, str, str);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (UIUtils.isActivityRunning(activity)) {
                        C51355a.m199198b(activity, str, "");
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    public void mo176933a(Context context, String str) {
        C51336a.m199117a(context, str);
    }

    /* renamed from: a */
    public boolean mo176935a(PhoneQueryControlInfo phoneQueryControlInfo, Activity activity) {
        if (phoneQueryControlInfo != null) {
            return false;
        }
        LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed));
        Log.m165383e("PhoneModule", "failed to get phone query control info, PhoneQueryControlInfo is null.");
        return true;
    }

    /* renamed from: a */
    public void mo176931a(final Activity activity, final String str, final IGetDataCallback<String> iGetDataCallback) {
        this.f127842b.mo177045a(str, new UIGetDataCallback(new IGetDataCallback<PhoneQueryControlInfo>() {
            /* class com.ss.android.lark.phone.C51341b.C513454 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("PhoneModule", errorResult.getDebugMsg());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(PhoneQueryControlInfo phoneQueryControlInfo) {
                if (!C51341b.this.mo176935a(phoneQueryControlInfo, activity)) {
                    PhoneControlStatus controlStatus = phoneQueryControlInfo.getControlStatus();
                    if (controlStatus == PhoneControlStatus.CAN_CALL) {
                        if (TextUtils.isEmpty(phoneQueryControlInfo.getPhoneNum())) {
                            Activity activity = activity;
                            LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed));
                            return;
                        }
                    } else if (controlStatus == PhoneControlStatus.NO_PERMISSION_BY_EXECUTIVE) {
                        LKUIToast.show(activity, phoneQueryControlInfo.getAnnouncement());
                    } else {
                        C51341b.this.mo176934a(activity, str, phoneQueryControlInfo);
                    }
                    if (iGetDataCallback != null && !TextUtils.isEmpty(phoneQueryControlInfo.getPhoneNum())) {
                        iGetDataCallback.onSuccess(phoneQueryControlInfo.getPhoneNum());
                    }
                }
            }
        }));
    }

    /* renamed from: b */
    public void mo176938b(Activity activity, String str, String str2) {
        C51355a.m199194a(activity, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PhoneCallDialogTitleTemplet, "call_name", str2), str2);
    }

    /* renamed from: a */
    public void mo176932a(final Activity activity, String str, final String str2) {
        if (m199137a().mo144000a()) {
            LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_Legacy_ChatViewNotifyOtherCall));
        }
        m199137a().mo144004d().mo144010a(str, new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.phone.C51341b.C513465 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C51341b.this.mo176938b(activity, str, str2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Activity activity = activity;
                LKUIToast.show(activity, UIUtils.getString(activity, R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed));
                Log.m165383e("PhoneModule", "getUserDisplayNameByAliasName failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: a */
    public void mo176934a(Context context, String str, PhoneQueryControlInfo phoneQueryControlInfo) {
        C51336a.m199118a(context, str, phoneQueryControlInfo);
    }
}

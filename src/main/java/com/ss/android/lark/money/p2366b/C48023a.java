package com.ss.android.lark.money.p2366b;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.MoneyModule;
import com.ss.android.lark.money.p2364a.p2365a.C48022a;
import com.ss.android.lark.money.redpacket.detail.RedPacketDetailActivity;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money.redpacket.widget.DialogC48191a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.navigation.Navigation;

/* renamed from: com.ss.android.lark.money.b.a */
public class C48023a {

    /* renamed from: a */
    private final AbstractC48037a f120887a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.money.b.a$a */
    public static final class C48032a {

        /* renamed from: a */
        public static final C48023a f120923a = new C48023a();
    }

    /* renamed from: a */
    public static C48023a m189561a() {
        return C48032a.f120923a;
    }

    private C48023a() {
        this.f120887a = C48040d.m189602a();
    }

    /* renamed from: a */
    public void mo168194a(Context context) {
        mo168195a(context, C48022a.m189560b());
    }

    /* renamed from: a */
    public void mo168195a(final Context context, final String str) {
        C48040d.m189602a().mo168231a(context);
        C48040d.m189602a().mo168218a(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.money.p2366b.C48023a.C480241 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C48022a.m189557a(context, str, C48040d.m189602a().mo168233b());
                MoneyModule.getDependency().openBulletSchema(context, str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("RedPacketLauncherManager", "getPayToken: onError: " + errorResult);
            }
        });
    }

    /* renamed from: a */
    private void m189562a(Activity activity, String str, RedPacketInfo redPacketInfo) {
        Intent a = RedPacketDetailActivity.m189863a(activity, str, redPacketInfo);
        Navigation from = Navigation.from(activity);
        if (Build.VERSION.SDK_INT >= 21) {
            from.openActivity(a, ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[0]).toBundle());
        } else {
            from.openActivity(a);
        }
    }

    /* renamed from: a */
    public void mo168196a(Context context, String str, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail) {
        Navigation.from(context).openActivity(RedPacketDetailActivity.m189864a(context, str, redPacketInfo, redPacketDetail));
    }

    /* renamed from: a */
    private void m189563a(final String str, boolean z, boolean z2, boolean z3) {
        if (!TextUtils.isEmpty(str)) {
            this.f120887a.mo168221a(str, z, z2, z3, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.money.p2366b.C48023a.C480316 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165398w("chatwindow", "updateRedPacket onError", errorResult);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i("chatwindow", "updateRedPacket onSuccess id:" + str);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo168193a(final Activity activity, final String str, final boolean z, final boolean z2) {
        final DialogC48191a aVar = new DialogC48191a(activity);
        aVar.show();
        this.f120887a.mo168223b(str, z2, new UIGetDataCallback(new IGetDataCallback<RedPacketInfo>() {
            /* class com.ss.android.lark.money.p2366b.C48023a.C480273 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                if (!UIUtils.isActivityRunning(activity)) {
                    aVar.dismiss();
                } else {
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.money.p2366b.C48023a.C480273.RunnableC480281 */

                        public void run() {
                            aVar.dismiss();
                            LKUIToast.show(activity, errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
                        }
                    }, 1000);
                }
            }

            /* renamed from: a */
            public void onSuccess(RedPacketInfo redPacketInfo) {
                if (!UIUtils.isActivityRunning(activity)) {
                    aVar.dismiss();
                } else if (redPacketInfo != null) {
                    C48023a.this.mo168190a(activity, aVar, redPacketInfo, z, z2);
                } else {
                    aVar.dismiss();
                    Log.m165383e("redpacket", "getRedPacketInfo info NULL，id is：" + str);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo168190a(final Activity activity, final DialogC48191a aVar, final RedPacketInfo redPacketInfo, boolean z, final boolean z2) {
        if (redPacketInfo.type == RedPacketContent.Type.P2P) {
            redPacketInfo.isFromMe = z;
            aVar.dismiss();
            mo168196a(activity, "", redPacketInfo, (RedPacketDetail) null);
            return;
        }
        this.f120887a.mo168219a(redPacketInfo.redPacketId, "", z2, new UIGetDataCallback(new IGetDataCallback<RedPacketDetail>() {
            /* class com.ss.android.lark.money.p2366b.C48023a.C480305 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.dismiss();
                if (UIUtils.isActivityRunning(activity)) {
                    C48023a.this.mo168196a(activity, "", redPacketInfo, (RedPacketDetail) null);
                }
            }

            /* renamed from: a */
            public void onSuccess(RedPacketDetail redPacketDetail) {
                aVar.dismiss();
                if (UIUtils.isActivityRunning(activity)) {
                    if (redPacketDetail != null && !z2) {
                        redPacketInfo.grabNum = redPacketDetail.grabNum;
                        redPacketInfo.totalGrabAmount = redPacketDetail.totalGrabAmount;
                        redPacketInfo.luckyUserId = redPacketDetail.luckyUserId;
                    }
                    C48023a.this.mo168196a(activity, "", redPacketInfo, redPacketDetail);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo168192a(final Activity activity, final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        final DialogC48191a aVar = new DialogC48191a(activity);
        aVar.show();
        this.f120887a.mo168223b(str, z4, new UIGetDataCallback(new IGetDataCallback<RedPacketInfo>() {
            /* class com.ss.android.lark.money.p2366b.C48023a.C480252 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                if (!UIUtils.isActivityRunning(activity)) {
                    aVar.dismiss();
                } else {
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.money.p2366b.C48023a.C480252.RunnableC480261 */

                        public void run() {
                            aVar.dismiss();
                            LKUIToast.show(activity, errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_UnknownError)));
                        }
                    }, 1000);
                }
            }

            /* renamed from: a */
            public void onSuccess(RedPacketInfo redPacketInfo) {
                if (!UIUtils.isActivityRunning(activity)) {
                    aVar.dismiss();
                } else if (redPacketInfo != null) {
                    C48023a.this.mo168191a(activity, aVar, str2, redPacketInfo, z, z2, z3, z4);
                } else {
                    aVar.dismiss();
                    Log.m165383e("redpacket", "getRedPacketInfo info NULL，id is：" + str);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo168191a(final Activity activity, final DialogC48191a aVar, final String str, final RedPacketInfo redPacketInfo, boolean z, boolean z2, boolean z3, final boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = true;
        if (redPacketInfo.type == RedPacketContent.Type.P2P && z) {
            redPacketInfo.isFromMe = true;
            if (redPacketInfo.grabNum != 0) {
                m189563a(str, z4, true, true);
            }
            if (!redPacketInfo.isExpired || redPacketInfo.grabNum != 0) {
                aVar.dismiss();
                mo168196a(activity, str, redPacketInfo, (RedPacketDetail) null);
                return;
            }
        }
        boolean z9 = z3 | redPacketInfo.isExpired;
        if (redPacketInfo.grabAmount > 0 || z9) {
            this.f120887a.mo168219a(redPacketInfo.redPacketId, "", z4, new UIGetDataCallback(new IGetDataCallback<RedPacketDetail>() {
                /* class com.ss.android.lark.money.p2366b.C48023a.C480294 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    aVar.dismiss();
                    if (UIUtils.isActivityRunning(activity)) {
                        C48023a.this.mo168196a(activity, str, redPacketInfo, (RedPacketDetail) null);
                    }
                }

                /* renamed from: a */
                public void onSuccess(RedPacketDetail redPacketDetail) {
                    aVar.dismiss();
                    if (UIUtils.isActivityRunning(activity)) {
                        if (redPacketDetail != null && !z4) {
                            redPacketInfo.grabNum = redPacketDetail.grabNum;
                            redPacketInfo.totalGrabAmount = redPacketDetail.totalGrabAmount;
                            redPacketInfo.luckyUserId = redPacketDetail.luckyUserId;
                        }
                        C48023a.this.mo168196a(activity, str, redPacketInfo, redPacketDetail);
                    }
                }
            }));
            if (redPacketInfo.grabAmount != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (redPacketInfo.totalNum == redPacketInfo.grabNum) {
                z6 = true;
            } else {
                z6 = false;
            }
            m189563a(str, z4, z5, z6);
        } else if (redPacketInfo.totalNum == redPacketInfo.grabNum) {
            aVar.dismiss();
            m189562a(activity, str, redPacketInfo);
            if (redPacketInfo.grabAmount != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (redPacketInfo.totalNum != redPacketInfo.grabNum) {
                z8 = false;
            }
            m189563a(str, z4, z7, z8);
        } else {
            aVar.dismiss();
            m189562a(activity, str, redPacketInfo);
        }
    }
}

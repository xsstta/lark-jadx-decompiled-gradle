package com.ss.android.lark.p1425c.p1427b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.ArrayMap;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.GetGuideToRateStateRequest;
import com.bytedance.lark.pb.settings.v1.GetGuideToRateStateResponse;
import com.bytedance.lark.pb.settings.v1.PushGuideToRateState;
import com.bytedance.lark.pb.settings.v1.SetGuideToRateEventRequest;
import com.bytedance.lark.pb.settings.v1.SetGuideToRateEventResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1425c.C29992a;
import com.ss.android.lark.p1425c.p1426a.AbstractC29994a;
import com.ss.android.lark.p1425c.p1428c.C30011a;
import com.ss.android.lark.p1425c.p1429d.C30012a;
import com.ss.android.lark.p1425c.p1429d.C30016d;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.lark.c.b.b */
public class C30002b {

    /* renamed from: a */
    public Boolean f74836a;

    /* renamed from: b */
    private int f74837b;

    /* renamed from: c */
    private boolean f74838c;

    /* renamed from: d */
    private boolean f74839d;

    /* renamed from: e */
    private boolean f74840e;

    /* renamed from: f */
    private final ArrayMap<String, String> f74841f;

    /* renamed from: g */
    private C53248k.AbstractC53250a f74842g;

    /* renamed from: com.ss.android.lark.c.b.b$a */
    private static class C30010a {

        /* renamed from: a */
        public static final C30002b f74851a = new C30002b();
    }

    /* renamed from: a */
    public static C30002b m110947a() {
        return C30010a.f74851a;
    }

    /* renamed from: g */
    private boolean m110953g() {
        return this.f74839d;
    }

    /* renamed from: h */
    private boolean m110954h() {
        return this.f74840e;
    }

    /* renamed from: c */
    public int mo108094c() {
        return C29992a.m110932a().mo108075c().mo108079a();
    }

    /* renamed from: d */
    private synchronized void m110950d() {
        if (this.f74842g == null) {
            this.f74842g = new C53248k.AbstractC53250a() {
                /* class com.ss.android.lark.p1425c.p1427b.C30002b.C300031 */

                @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                    try {
                        C30002b.this.f74836a = PushGuideToRateState.ADAPTER.decode(bArr).switches.get("default");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            C53248k.m205912a().mo181697a(Command.PUSH_GUIDE_TO_RATE_STATE, this.f74842g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo108093b() {
        Log.m165389i("AppRating", "getActionType -> type: " + this.f74837b);
        return this.f74837b;
    }

    /* renamed from: e */
    private boolean m110951e() {
        Boolean bool = this.f74836a;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f74836a = null;
            return booleanValue;
        }
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_GUIDE_TO_RATE_STATE, new GetGuideToRateStateRequest.C19139a(), new SdkSender.IParser<Map<String, Boolean>>() {
            /* class com.ss.android.lark.p1425c.p1427b.C30002b.C300042 */

            /* renamed from: a */
            public Map<String, Boolean> parse(byte[] bArr) throws IOException {
                return GetGuideToRateStateResponse.ADAPTER.decode(bArr).switches;
            }
        });
        if (syncSendMayError.f131573b != null) {
            Log.m165383e("AppRating", "checkLimitationSwitch -> error: " + syncSendMayError.f131573b);
            return false;
        }
        T t = syncSendMayError.f131572a;
        if (t == null) {
            Log.m165383e("AppRating", "checkLimitationSwitch -> error: map is null.");
            return false;
        }
        Boolean bool2 = (Boolean) t.get("default");
        if (bool2 == null) {
            Log.m165383e("AppRating", "checkLimitationSwitch -> error: limitation is null.");
            return false;
        }
        Log.m165389i("AppRating", "checkLimitationSwitch -> limitation: " + bool2);
        return bool2.booleanValue();
    }

    /* renamed from: f */
    private boolean m110952f() {
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_GUIDE_TO_RATE_STATE, new GetGuideToRateStateRequest.C19139a(), new SdkSender.IParser<Map<String, Boolean>>() {
            /* class com.ss.android.lark.p1425c.p1427b.C30002b.C300053 */

            /* renamed from: a */
            public Map<String, Boolean> parse(byte[] bArr) throws IOException {
                return GetGuideToRateStateResponse.ADAPTER.decode(bArr).switches;
            }
        });
        if (syncSendMayError.f131573b != null) {
            Log.m165383e("AppRating", "checkAgeValid -> error: " + syncSendMayError.f131573b);
            return false;
        }
        T t = syncSendMayError.f131572a;
        if (t == null) {
            Log.m165383e("AppRating", "checkAgeValid -> error: map is null.");
            return false;
        }
        Boolean bool = (Boolean) t.get("age_valid");
        if (bool == null) {
            Log.m165383e("AppRating", "checkAgeValid -> error: ageValid is null.");
            return false;
        }
        Log.m165389i("AppRating", "checkAgeValid -> ageValid: " + bool);
        return bool.booleanValue();
    }

    private C30002b() {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        this.f74841f = arrayMap;
        arrayMap.put("THUMBSUP", "[赞]");
        arrayMap.put("HEART", "[爱心]");
        arrayMap.put("APPLAUSE", "[鼓掌]");
        arrayMap.put("BLUSH", "[呲牙]");
        arrayMap.put("FINGERHEART", "[比心]");
        arrayMap.put("LOVE", "[送心]");
        arrayMap.put("WITTY", "[灵光一闪]");
        arrayMap.put("LAUGH", "[大笑]");
        arrayMap.put("PARTY", "[撒花]");
        arrayMap.put("CLAP", "[小鼓掌]");
        arrayMap.put("LOL", "[笑哭]");
        arrayMap.put("PROUD", "[得意]");
        arrayMap.put("YEAH", "[耶]");
        arrayMap.put("SMOOCH", "[飞吻]");
        arrayMap.put("BEER", "[啤酒]");
        arrayMap.put("DROOL", "[爱慕]");
        arrayMap.put("WINK", "[可爱]");
        arrayMap.put("CHUCKLE", "[偷笑]");
        arrayMap.put("TRICK", "[憨笑]");
        arrayMap.put("MONEY", "[钱]");
        arrayMap.put("KISS", "[吻]");
        arrayMap.put("JOYFUL", "[笑]");
        arrayMap.put("OBSESSED", "[舔屏]");
        arrayMap.put("WOW", "[惊喜]");
        arrayMap.put("GIFT", "[礼物]");
        arrayMap.put("CAKE", "[蛋糕]");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo108086a(int i) {
        this.f74837b = i;
    }

    /* renamed from: a */
    public void mo108087a(final Activity activity) {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.p1425c.p1427b.C30002b.RunnableC300064 */

            public void run() {
                Activity activity = activity;
                if (activity != null && C30002b.this.mo108091a((Context) activity)) {
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.p1425c.p1427b.C30002b.RunnableC300064.RunnableC300071 */

                        public void run() {
                            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                                Log.m165383e("AppRating", "activity is not alive.");
                            } else if (!activity.hasWindowFocus()) {
                                Log.m165383e("AppRating", "activity doesn't have window focus.");
                            } else {
                                Intent a = C30012a.m110975a();
                                if (a != null) {
                                    new DialogC29997a(activity, a).show();
                                } else if (C29992a.m110932a().mo108076d()) {
                                    C30011a.m110972c();
                                } else {
                                    C30011a.m110973d();
                                }
                            }
                        }
                    }, 32);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo108089a(SetGuideToRateEventRequest.EventType eventType) {
        SdkSender.asynSendRequestNonWrap(Command.SET_GUIDE_TO_RATE_EVENT, new SetGuideToRateEventRequest.C19205a().mo65577a(eventType), new IGetDataCallback<SetGuideToRateEventResponse>() {
            /* class com.ss.android.lark.p1425c.p1427b.C30002b.C300085 */

            /* renamed from: a */
            public void onSuccess(SetGuideToRateEventResponse setGuideToRateEventResponse) {
                Log.m165389i("AppRating", "pushDialogStatus2Server success.");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AppRating", "pushDialogStatus2Server error: " + errorResult);
            }
        }, new SdkSender.IParser<SetGuideToRateEventResponse>() {
            /* class com.ss.android.lark.p1425c.p1427b.C30002b.C300096 */

            /* renamed from: a */
            public SetGuideToRateEventResponse parse(byte[] bArr) throws IOException {
                return SetGuideToRateEventResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    private boolean m110948b(Context context) {
        boolean a = C29992a.m110932a().mo108073a("lark.guide_to_rate");
        Log.m165389i("AppRating", "featureSwitch: " + a);
        if (a) {
            m110950d();
        }
        return a;
    }

    /* renamed from: c */
    private boolean m110949c(Context context) {
        int b = C29992a.m110932a().mo108074b().mo108078b();
        Log.m165389i("AppRating", "checkTimeSatisfy -> delayHours: " + b);
        if (b < 0) {
            return false;
        }
        int a = C30016d.m110993a(context);
        Log.m165389i("AppRating", "checkTimeSatisfy -> hoursAfterInstallOrUpdate: " + a);
        if (a >= b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo108090a(boolean z) {
        boolean z2;
        Log.m165389i("AppRating", "setEnterChatFromFeed -> isEnterChatFromFeed: " + z);
        this.f74839d = z;
        if (z) {
            AbstractC29994a.AbstractC29996b c = C29992a.m110932a().mo108075c();
            if (c == null) {
                Log.m165383e("AppRating", "setEnterChatFromFeed -> feedDependency is null");
                return;
            }
            int a = c.mo108079a();
            Log.m165389i("AppRating", "setEnterChatFromFeed -> badgeCount: " + a);
            if (a > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f74840e = z2;
        }
    }

    /* renamed from: a */
    public boolean mo108091a(Context context) {
        if (!m110953g()) {
            Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> enterChatFromFeed is false.");
            return false;
        }
        mo108090a(false);
        if (!mo108092a(context, false)) {
            Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> canCheckAction is false.");
            return false;
        } else if (mo108093b() == 1) {
            return true;
        } else {
            if (!m110952f()) {
                Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> lark age is invalid.");
                return false;
            } else if (!m110954h()) {
                Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> all msg has been read before enter chat.");
                return false;
            } else {
                AbstractC29994a.AbstractC29996b c = C29992a.m110932a().mo108075c();
                if (c == null) {
                    Log.m165383e("AppRating", "checkNeedShowAppRatingDialog -> feedDependency is null");
                    return false;
                }
                int b = c.mo108080b();
                Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> inboxFeedCardSize: " + b);
                if (b <= 20) {
                    Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> feed card size is no more than 20.");
                    return false;
                }
                int c2 = mo108094c();
                Log.m165389i("AppRating", "checkNeedShowAppRatingDialog -> badgeCount: " + c2);
                if (c2 > 0) {
                    return false;
                }
                mo108086a(2);
                return true;
            }
        }
    }

    /* renamed from: a */
    public boolean mo108092a(Context context, boolean z) {
        boolean z2;
        if (z) {
            return this.f74838c;
        }
        if (!m110948b(context) || !m110949c(context) || !m110951e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f74838c = z2;
        return z2;
    }

    /* renamed from: a */
    public void mo108088a(Context context, boolean z, String str) {
        if (!m110953g()) {
            Log.m165379d("AppRating", "processReaction -> isEnterChatFromFeed is false.");
        } else if (!mo108092a(context, true)) {
            Log.m165389i("AppRating", "processReaction -> canCheckAction is false.");
        } else if (z) {
            mo108086a(0);
            Log.m165389i("AppRating", "processReaction -> cancel reaction.");
        } else if (this.f74841f.containsKey(str)) {
            mo108086a(1);
            Log.m165389i("AppRating", "processReaction -> happy reaction: " + str);
        } else {
            mo108086a(0);
            Log.m165389i("AppRating", "processReaction -> reaction: " + str);
        }
    }
}

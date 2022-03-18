package com.ss.android.lark.ai.enterpriseTopic.p1340c;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.enterpriseTopic.listpage.EntityWordsActivity;
import com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a;
import com.ss.android.lark.ai.enterpriseTopic.p1337a.p1338a.C28553a;
import com.ss.android.lark.ai.enterpriseTopic.view.C28568a;
import com.ss.android.lark.ai.p1330d.p1332b.C28540a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.EntityCard;
import com.ss.android.lark.pb.ai.EntityCardData;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicResponse;
import com.ss.android.lark.pb.ai.MGetEntityCardResponse;
import com.ss.android.lark.pb.ai.UserCardActionRequest;
import com.ss.android.lark.pb.ai.UserCardActionResponse;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.view.general.lynx.IReportListener;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.c.a */
public class C28557a {

    /* renamed from: a */
    public static boolean f71798a = C28522a.m104531a().mo101558a("ai.abbr.mobile_card_expand");

    /* renamed from: c */
    private static boolean f71799c = C28522a.m104531a().mo101558a("ai.abbr.mobile.card_v2");

    /* renamed from: b */
    public final C28540a f71800b = new C28540a();

    /* renamed from: d */
    private final AbstractC28552a f71801d = new C28553a();

    /* renamed from: e */
    private WeakReference<PopupWindow> f71802e = new WeakReference<>(null);

    /* renamed from: f */
    private WeakReference<Dialog> f71803f = new WeakReference<>(null);

    /* renamed from: g */
    private String f71804g;

    /* renamed from: a */
    public void mo101690a(String str, String str2, String str3, RectF rectF, View view, String str4, GetEnterpriseTopicRequest.Scene scene, IGetDataCallback<Object> iGetDataCallback, String str5, IGetDataCallback<String> iGetDataCallback2, String str6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f71800b.mo101587a(str4);
        if (f71799c) {
            long currentTimeMillis = System.currentTimeMillis();
            SearchCommonModuleDependency.f133119a.mo183785a();
            Log.m165379d("EnterpriseTopicService", "preload lynx cost: " + (System.currentTimeMillis() - currentTimeMillis));
            int i = C285625.f71831a[scene.ordinal()];
            this.f71801d.mo101669a(str3, str, i != 1 ? i != 2 ? i != 3 ? "unknow" : "search" : "doc" : "im", "click", new IGetDataCallback<MGetEntityCardResponse>(view, str, iGetDataCallback, scene, elapsedRealtime, str4, str5, iGetDataCallback2, str3, str6) {
                /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285581 */

                /* renamed from: a */
                final WeakReference<View> f71805a;

                /* renamed from: b */
                final /* synthetic */ View f71806b;

                /* renamed from: c */
                final /* synthetic */ String f71807c;

                /* renamed from: d */
                final /* synthetic */ IGetDataCallback f71808d;

                /* renamed from: e */
                final /* synthetic */ GetEnterpriseTopicRequest.Scene f71809e;

                /* renamed from: f */
                final /* synthetic */ long f71810f;

                /* renamed from: g */
                final /* synthetic */ String f71811g;

                /* renamed from: h */
                final /* synthetic */ String f71812h;

                /* renamed from: i */
                final /* synthetic */ IGetDataCallback f71813i;

                /* renamed from: j */
                final /* synthetic */ String f71814j;

                /* renamed from: k */
                final /* synthetic */ String f71815k;

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165384e("EnterpriseTopicService", "getEnterpriseTopic error", errorResult);
                    if (this.f71805a.get() != null) {
                        C28557a.this.mo101682a(LarkContext.getApplication());
                    }
                }

                /* renamed from: a */
                public void onSuccess(MGetEntityCardResponse mGetEntityCardResponse) {
                    String str;
                    View view = this.f71805a.get();
                    if (view != null) {
                        if (mGetEntityCardResponse.merr_code != null && mGetEntityCardResponse.merr_code.intValue() != 0) {
                            C28557a.this.mo101688a(mGetEntityCardResponse.merr_msg);
                            str = "error";
                        } else if (mGetEntityCardResponse.mcards == null || mGetEntityCardResponse.mcards.isEmpty()) {
                            C28557a.this.mo101683a(LarkContext.getApplication(), UIHelper.getString(R.string.Lark_ASL_NoEntryFound));
                            str = "blank";
                        } else {
                            EntityCardData entityCardData = mGetEntityCardResponse.mcards.get(0);
                            if (entityCardData.mcard == null || entityCardData.mcard.isEmpty()) {
                                C28557a.this.mo101683a(LarkContext.getApplication(), UIHelper.getString(R.string.Lark_ASL_NoEntryFound));
                            } else {
                                C28557a.this.mo101686a(view, entityCardData, this.f71807c, this.f71808d, this.f71809e, this.f71810f, this.f71811g, this.f71812h, this.f71813i, this.f71814j, this.f71815k);
                            }
                            str = "success";
                        }
                        C28557a.this.f71800b.mo101588a(this.f71814j, this.f71809e, str, this.f71811g);
                    }
                }

                {
                    this.f71806b = r2;
                    this.f71807c = r3;
                    this.f71808d = r4;
                    this.f71809e = r5;
                    this.f71810f = r6;
                    this.f71811g = r8;
                    this.f71812h = r9;
                    this.f71813i = r10;
                    this.f71814j = r11;
                    this.f71815k = r12;
                    this.f71805a = new WeakReference<>(r2);
                }
            });
            return;
        }
        this.f71801d.mo101668a(str, str2 == null ? C28522a.m104531a().mo101566g() : str2, str3, GetEnterpriseTopicRequest.Method.CLICK, scene, new IGetDataCallback<GetEnterpriseTopicResponse>(view, str, iGetDataCallback, scene, elapsedRealtime, rectF) {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285592 */

            /* renamed from: a */
            final WeakReference<View> f71817a;

            /* renamed from: b */
            final /* synthetic */ View f71818b;

            /* renamed from: c */
            final /* synthetic */ String f71819c;

            /* renamed from: d */
            final /* synthetic */ IGetDataCallback f71820d;

            /* renamed from: e */
            final /* synthetic */ GetEnterpriseTopicRequest.Scene f71821e;

            /* renamed from: f */
            final /* synthetic */ long f71822f;

            /* renamed from: g */
            final /* synthetic */ RectF f71823g;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("EnterpriseTopicService", "getEnterpriseTopic error", errorResult);
                if (this.f71817a.get() != null) {
                    C28557a.this.mo101682a(LarkContext.getApplication());
                }
            }

            /* renamed from: a */
            public void onSuccess(GetEnterpriseTopicResponse getEnterpriseTopicResponse) {
                List<EntityCard> list;
                View view = this.f71817a.get();
                if (view == null) {
                    return;
                }
                if (getEnterpriseTopicResponse.merr_code != null && getEnterpriseTopicResponse.merr_code.intValue() != 0) {
                    C28557a.this.mo101681a(getEnterpriseTopicResponse.merr_code.intValue());
                } else if (getEnterpriseTopicResponse.mcard != null || (getEnterpriseTopicResponse.mmulti_cards != null && !getEnterpriseTopicResponse.mmulti_cards.isEmpty())) {
                    if (getEnterpriseTopicResponse.mmulti_cards == null || getEnterpriseTopicResponse.mmulti_cards.size() <= 0) {
                        List<EntityCard> arrayList = new ArrayList<>();
                        arrayList.add(getEnterpriseTopicResponse.mcard);
                        list = arrayList;
                    } else {
                        list = getEnterpriseTopicResponse.mmulti_cards;
                    }
                    if (C28557a.f71798a) {
                        C28557a.this.mo101687a(view, list, this.f71819c, this.f71820d, this.f71821e, this.f71822f);
                    } else {
                        C28557a.this.mo101685a(view, this.f71823g, list, this.f71819c, this.f71820d, this.f71821e, this.f71822f);
                    }
                } else {
                    C28557a.this.mo101683a(LarkContext.getApplication(), UIHelper.getString(R.string.Lark_ASL_NoEntryFound));
                }
            }

            {
                this.f71818b = r2;
                this.f71819c = r3;
                this.f71820d = r4;
                this.f71821e = r5;
                this.f71822f = r6;
                this.f71823g = r8;
                this.f71817a = new WeakReference<>(r2);
            }
        });
    }

    /* renamed from: a */
    public void mo101688a(String str) {
        Application application = LarkContext.getApplication();
        if (application != null) {
            mo101683a(application, str);
        }
    }

    /* renamed from: a */
    public void mo101689a(String str, int i) {
        this.f71801d.mo101667a(str, UserCardActionRequest.ActionType.fromValue(i), new IGetDataCallback<UserCardActionResponse>() {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285614 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("EnterpriseTopicService", "onError, " + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(UserCardActionResponse userCardActionResponse) {
                Log.m165379d("EnterpriseTopicService", "onSuccess, " + userCardActionResponse.msuccess + ", " + userCardActionResponse.merror);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.c.a$5 */
    public static /* synthetic */ class C285625 {

        /* renamed from: a */
        static final /* synthetic */ int[] f71831a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene[] r0 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285625.f71831a = r0
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene r1 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.MESSENGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285625.f71831a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene r1 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.DOCS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285625.f71831a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene r1 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.SEARCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285625.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo101680a() {
        PopupWindow popupWindow = this.f71802e.get();
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
        Dialog dialog = this.f71803f.get();
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    /* renamed from: a */
    public void mo101682a(Context context) {
        if (context != null) {
            mo101683a(context, context.getString(R.string.Lark_Legacy_NetworkErrorRetry));
        }
    }

    /* renamed from: a */
    public void mo101681a(int i) {
        int i2;
        if (i != 8) {
            i2 = R.string.Lark_ASL_NoEntryFound;
        } else {
            i2 = R.string.Lark_ASL_EncyclopediaDisableByAdmin;
        }
        Application application = LarkContext.getApplication();
        if (application != null) {
            mo101683a(application, application.getString(i2));
        }
    }

    /* renamed from: a */
    public void mo101683a(Context context, String str) {
        LKUIToast.show(context, str);
    }

    /* renamed from: a */
    public void mo101684a(Context context, String str, String str2) {
        EntityWordsActivity.m104733a(context, str, str2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m104715a(String str, View view, List list, GetEnterpriseTopicRequest.Scene scene, long j, IGetDataCallback iGetDataCallback) {
        Dialog dialog = this.f71803f.get();
        if (dialog != null && dialog.isShowing()) {
            if (TextUtils.equals(str, this.f71804g)) {
                Log.m165379d("EnterpriseTopicService", "Ignore redundant click");
                return;
            }
            dialog.dismiss();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Dialog a = new C28568a(view.getContext(), this.f71801d, this.f71800b).mo101709a(list);
        this.f71800b.mo101586a(scene, elapsedRealtime - j);
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(a);
        }
        this.f71803f = new WeakReference<>(a);
        this.f71804g = str;
    }

    /* renamed from: a */
    public void mo101687a(View view, List<EntityCard> list, String str, IGetDataCallback<Object> iGetDataCallback, GetEnterpriseTopicRequest.Scene scene, long j) {
        C26171w.m94675a(new Runnable(str, view, list, scene, j, iGetDataCallback) {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.$$Lambda$a$r7QhYXL0Dh3Aekan_fAs3WO7rI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ List f$3;
            public final /* synthetic */ GetEnterpriseTopicRequest.Scene f$4;
            public final /* synthetic */ long f$5;
            public final /* synthetic */ IGetDataCallback f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r8;
            }

            public final void run() {
                C28557a.this.m104715a((C28557a) this.f$1, (String) this.f$2, (View) this.f$3, (List) this.f$4, (GetEnterpriseTopicRequest.Scene) this.f$5, (long) this.f$6);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m104713a(String str, View view, RectF rectF, List list, GetEnterpriseTopicRequest.Scene scene, long j, IGetDataCallback iGetDataCallback) {
        PopupWindow popupWindow = this.f71802e.get();
        if (popupWindow != null && popupWindow.isShowing()) {
            if (TextUtils.equals(str, this.f71804g)) {
                Log.m165379d("EnterpriseTopicService", "Ignore redundant click");
                return;
            }
            popupWindow.dismiss();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        PopupWindow a = new C28568a(view.getContext(), this.f71801d, this.f71800b).mo101710a(view, rectF, list);
        this.f71800b.mo101586a(scene, elapsedRealtime - j);
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(a);
        }
        this.f71802e = new WeakReference<>(a);
        this.f71804g = str;
    }

    /* renamed from: a */
    public void mo101685a(View view, RectF rectF, List<EntityCard> list, String str, IGetDataCallback<Object> iGetDataCallback, GetEnterpriseTopicRequest.Scene scene, long j) {
        C26171w.m94675a(new Runnable(str, view, rectF, list, scene, j, iGetDataCallback) {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.$$Lambda$a$lZ42kwG_q8uah6VWzworjhRUXq8 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ RectF f$3;
            public final /* synthetic */ List f$4;
            public final /* synthetic */ GetEnterpriseTopicRequest.Scene f$5;
            public final /* synthetic */ long f$6;
            public final /* synthetic */ IGetDataCallback f$7;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r9;
            }

            public final void run() {
                C28557a.this.m104713a((C28557a) this.f$1, (String) this.f$2, (View) this.f$3, (RectF) this.f$4, (List) this.f$5, (GetEnterpriseTopicRequest.Scene) this.f$6, (long) this.f$7);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m104714a(String str, View view, EntityCardData entityCardData, final String str2, final GetEnterpriseTopicRequest.Scene scene, final String str3, final String str4, String str5, IGetDataCallback iGetDataCallback, long j, IGetDataCallback iGetDataCallback2) {
        boolean z;
        Dialog dialog = this.f71803f.get();
        StringBuilder sb = new StringBuilder();
        sb.append("lastDialog is null? ");
        boolean z2 = true;
        if (dialog == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" is showing? ");
        if (dialog == null || !dialog.isShowing()) {
            z2 = false;
        }
        sb.append(z2);
        Log.m165379d("EnterpriseTopicService", sb.toString());
        Log.m165379d("EnterpriseTopicService", "lastQuery: " + this.f71804g);
        if (dialog != null && dialog.isShowing()) {
            if (TextUtils.equals(str, this.f71804g)) {
                Log.m165379d("EnterpriseTopicService", "Ignore redundant click");
                return;
            }
            dialog.dismiss();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Dialog a = new C28568a(view.getContext(), this.f71801d, this.f71800b).mo101708a(entityCardData, new IReportListener() {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.C28557a.C285603 */

            @Override // com.ss.android.lark.searchcommon.view.general.lynx.IReportListener
            /* renamed from: a */
            public void mo101693a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        Statistics.sendEvent("asl_abbr_card_click", jSONObject.put("abbr_id", str2).put("card_source", C28540a.m104606a(scene)).put("card_scene", scene.getValue()).put("chat_id", str3).put("msg_id", str4));
                    } catch (JSONException unused) {
                    }
                }
            }
        }, str5, iGetDataCallback);
        this.f71800b.mo101586a(scene, elapsedRealtime - j);
        if (iGetDataCallback2 != null) {
            iGetDataCallback2.onSuccess(a);
        }
        this.f71803f = new WeakReference<>(a);
        this.f71804g = str;
    }

    /* renamed from: a */
    public void mo101686a(View view, EntityCardData entityCardData, String str, IGetDataCallback<Object> iGetDataCallback, GetEnterpriseTopicRequest.Scene scene, long j, String str2, String str3, IGetDataCallback<String> iGetDataCallback2, String str4, String str5) {
        C26171w.m94675a(new Runnable(str, view, entityCardData, str4, scene, str2, str5, str3, iGetDataCallback2, j, iGetDataCallback) {
            /* class com.ss.android.lark.ai.enterpriseTopic.p1340c.$$Lambda$a$okCVRNT01oxHeOuwbuO8wf2T0ac */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$10;
            public final /* synthetic */ IGetDataCallback f$11;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ EntityCardData f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ GetEnterpriseTopicRequest.Scene f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ String f$8;
            public final /* synthetic */ IGetDataCallback f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
                this.f$10 = r11;
                this.f$11 = r13;
            }

            public final void run() {
                C28557a.this.m104714a((C28557a) this.f$1, (String) this.f$2, (View) this.f$3, (EntityCardData) this.f$4, (String) this.f$5, (GetEnterpriseTopicRequest.Scene) this.f$6, this.f$7, this.f$8, (String) this.f$9, (IGetDataCallback) this.f$10, (long) this.f$11);
            }
        });
    }
}

package com.ss.android.lark.tour;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.chatwindow.C35242f;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tour.spotlight.TourSpotlightChatActivity;
import com.ss.android.lark.utils.C57858o;

/* renamed from: com.ss.android.lark.tour.b */
public class C57292b implements AbstractC57291a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.tour.b$a */
    public static final class C57296a {

        /* renamed from: a */
        public static final C57292b f141149a = new C57292b();
    }

    private C57292b() {
    }

    /* renamed from: a */
    public static C57292b m221991a() {
        return C57296a.f141149a;
    }

    @Override // com.ss.android.lark.tour.AbstractC57291a
    /* renamed from: a */
    public void mo194387a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        C35242f.m137613a().mo129706a(str, new IGetDataCallback<ChatWindowPrepareData>() {
            /* class com.ss.android.lark.tour.C57292b.C572931 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(ChatWindowPrepareData chatWindowPrepareData) {
                boolean z;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    if (chatWindowPrepareData != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @Override // com.ss.android.lark.tour.AbstractC57291a
    /* renamed from: a */
    public void mo194386a(final String str, final int i) {
        final Context a = C29990c.m110930b().mo134528a();
        C35242f.m137613a().mo129706a(str, new UIGetDataCallback<ChatWindowPrepareData>() {
            /* class com.ss.android.lark.tour.C57292b.C572942 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165384e("OnboardingTourService", "getChatLauncherInfo err", errorResult);
            }

            /* renamed from: a */
            public void onSuccessed(ChatWindowPrepareData chatWindowPrepareData) {
                C57858o.m224559a(TourSpotlightChatActivity.class).mo196052a(ChatBundle.m109259a().mo105927a(str).mo105925a(chatWindowPrepareData).mo105942i(true).mo105929a().mo105916a(new ChatBundle.AbstractC29591b() {
                    /* class com.ss.android.lark.tour.C57292b.C572942.C572951 */

                    @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
                    public void inject(Bundle bundle) {
                        bundle.putInt("key_chat_type", i);
                    }
                })).mo196064a(a);
            }
        });
    }
}

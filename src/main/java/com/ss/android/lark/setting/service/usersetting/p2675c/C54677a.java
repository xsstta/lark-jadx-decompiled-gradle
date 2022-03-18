package com.ss.android.lark.setting.service.usersetting.p2675c;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsRequest;
import com.bytedance.lark.pb.feed.v1.GetFeedFilterSettingsResponse;
import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest;
import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsResponse;
import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.dto.C54123c;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.io.IOException;

/* renamed from: com.ss.android.lark.setting.service.usersetting.c.a */
public class C54677a {

    /* renamed from: com.ss.android.lark.setting.service.usersetting.c.a$a */
    private static class C54682a {

        /* renamed from: a */
        public static C54677a f135087a = new C54677a();
    }

    private C54677a() {
    }

    /* renamed from: a */
    public static C54677a m212243a() {
        return C54682a.f135087a;
    }

    /* renamed from: b */
    private void m212245b(final IGetDataCallback<C54123c> iGetDataCallback) {
        C54667c.m212228a().mo186759a(new IGetDataCallback<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2675c.C54677a.C546792 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(UserSetting userSetting) {
                C54123c cVar = new C54123c(userSetting.isAutoAudioToText(), userSetting.isAutoUpdateWorkStatus());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(cVar);
                }
            }
        });
    }

    /* renamed from: a */
    private void m212244a(final IGetDataCallback<C54123c> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2675c.C54677a.RunnableC546781 */

            public void run() {
                UserSetting f = C54667c.m212228a().mo186765f();
                if (f == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("user setting is null"));
                        return;
                    }
                    return;
                }
                C54123c cVar = new C54123c(f.isAutoAudioToText(), f.isAutoUpdateWorkStatus());
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(cVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186774a(UpdateFeedFilterSettingsRequest.C17242a aVar, IGetDataCallback<Long> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_FEED_FILTER_SETTING, aVar, iGetDataCallback, new SdkSender.IParser<Long>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2675c.C54677a.C546814 */

            /* renamed from: a */
            public Long parse(byte[] bArr) throws IOException {
                return UpdateFeedFilterSettingsResponse.ADAPTER.decode(bArr).version;
            }
        });
    }

    /* renamed from: c */
    public void mo186778c(boolean z, IGetDataCallback<C54123c> iGetDataCallback) {
        if (z) {
            m212245b(iGetDataCallback);
        } else {
            m212244a(iGetDataCallback);
        }
    }

    /* renamed from: b */
    public void mo186777b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65590a(Boolean.valueOf(z)), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo186775a(IGetDataCallback<FeedFilterTabInfo> iGetDataCallback, Boolean bool) {
        SyncDataStrategy syncDataStrategy;
        GetFeedFilterSettingsRequest.C17164a a = new GetFeedFilterSettingsRequest.C17164a().mo60449a((Boolean) true);
        if (bool.booleanValue()) {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        } else {
            syncDataStrategy = SyncDataStrategy.LOCAL;
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_FEED_FILTER_SETTING, a.mo60448a(syncDataStrategy), iGetDataCallback, new SdkSender.IParser<FeedFilterTabInfo>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2675c.C54677a.C546803 */

            /* renamed from: a */
            public FeedFilterTabInfo parse(byte[] bArr) throws IOException {
                GetFeedFilterSettingsResponse decode = GetFeedFilterSettingsResponse.ADAPTER.decode(bArr);
                return new FeedFilterTabInfo(decode.filter_enable.booleanValue(), decode.used_filters, decode.all_filters, decode.show_mute.booleanValue(), decode.show_at_all_in_at_filter.booleanValue(), decode.version.longValue());
            }
        });
    }

    /* renamed from: a */
    public void mo186776a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65593b(Boolean.valueOf(z)), iGetDataCallback);
    }
}

package com.ss.android.lark.setting.page.content.general.feedfilter.model;

import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.service.usersetting.p2675c.C54677a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/model/FeedFilterSettingModel;", "", "()V", "requestFeedFilterSetting", "", "forceServer", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "updateFeedFilterSetting", "requestBuilder", "Lcom/bytedance/lark/pb/feed/v1/UpdateFeedFilterSettingsRequest$Builder;", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.b.a */
public final class FeedFilterSettingModel {
    /* renamed from: a */
    public final void mo186234a(UpdateFeedFilterSettingsRequest.C17242a aVar, IGetDataCallback<Long> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(aVar, "requestBuilder");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C54677a.m212243a().mo186774a(aVar, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo186235a(boolean z, IGetDataCallback<FeedFilterTabInfo> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C54677a.m212243a().mo186775a(iGetDataCallback, Boolean.valueOf(z));
    }
}

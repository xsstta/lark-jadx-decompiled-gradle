package com.ss.android.lark.setting.page.content.general.feedfilter;

import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.service.usersetting.p2675c.C54677a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016J,\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IModel;", "()V", "getFeedFilterSetting", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "forceServer", "", "updateFeedFilterSetting", "requestBuilder", "Lcom/bytedance/lark/pb/feed/v1/UpdateFeedFilterSettingsRequest$Builder;", "", "feedFilterEnabled", "myFilterSelectionsWithoutAll", "", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.g */
public final class FeedMessageFilterModel extends BaseModel implements IFeedMessageFilterContract.IModel {
    @Override // com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract.IModel
    /* renamed from: a */
    public void mo186329a(UpdateFeedFilterSettingsRequest.C17242a aVar, IGetDataCallback<Long> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(aVar, "requestBuilder");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C54677a.m212243a().mo186774a(aVar, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract.IModel
    /* renamed from: a */
    public void mo186330a(IGetDataCallback<FeedFilterTabInfo> iGetDataCallback, boolean z) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C54677a.m212243a().mo186775a(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), Boolean.valueOf(z));
    }
}

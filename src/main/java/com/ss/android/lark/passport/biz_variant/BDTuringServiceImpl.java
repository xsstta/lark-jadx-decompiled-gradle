package com.ss.android.lark.passport.biz_variant;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IBDTuringService;
import kotlin.Metadata;

@ClaymoreImpl(IBDTuringService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/biz_variant/BDTuringServiceImpl;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IBDTuringService;", "()V", "handleBDTuringResp", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "init", "passport-biz-variant_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class BDTuringServiceImpl implements IBDTuringService {
    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IBDTuringService
    public void init() {
        BdTuringHelper.m192814a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IBDTuringService
    public void handleBDTuringResp(JSONObject jSONObject) {
        BdTuringHelper.m192816a(jSONObject);
    }
}

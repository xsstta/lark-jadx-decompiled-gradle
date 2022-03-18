package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&JD\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J.\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH&J&\u0010\u0019\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\nH&J&\u0010\u001a\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\nH&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IQRLoginService;", "", "qrLoginCancel", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "token", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "qrLoginCheck", "qrLoginConfirm", "scopeList", "", "isMultiLogin", "", "startAuthConfirmActivity", "", "context", "Landroid/content/Context;", "qrcodeToken", ShareHitPoint.f121868c, "", "baseStepData", "startQRCodeConfirmActivity", "startSSOUrlConfirmActivity", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.n */
public interface IQRLoginService {
    AbstractC49347c qrLoginCancel(UniContext uniContext, String str, IGetDataCallback<BaseStepData> iGetDataCallback);

    AbstractC49347c qrLoginCheck(String str, IGetDataCallback<BaseStepData> iGetDataCallback);

    AbstractC49347c qrLoginConfirm(UniContext uniContext, String str, List<String> list, boolean z, IGetDataCallback<BaseStepData> iGetDataCallback);

    void startQRCodeConfirmActivity(Context context, String str, BaseStepData baseStepData);

    void startSSOUrlConfirmActivity(Context context, String str, BaseStepData baseStepData);
}

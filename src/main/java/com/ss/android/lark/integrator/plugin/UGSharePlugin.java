package com.ss.android.lark.integrator.plugin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.UG;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.utils.ApiUtils;
import com.tt.miniapp.errorcode.ApiCode;
import java.util.HashMap;

public class UGSharePlugin extends AbstractC25889a {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    private Bitmap stringToBitmap(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            Log.m165384e("OPThirdSharePlugin", "Exception", e);
            return null;
        }
    }

    private ShareEntity.C55696a generateShareBuilder(UG.ShareRequest shareRequest, AbstractC25897h<UG.ShareResponse> hVar) {
        String str;
        Log.m165389i("OPThirdSharePlugin", "content type:" + shareRequest.mChannelType.size());
        ShareEntity.C55696a aVar = null;
        if (UG.ShareContentType.TEXT.mValue.equals(shareRequest.mContentType)) {
            if (!TextUtils.isEmpty(shareRequest.mContent)) {
                aVar = new ShareEntity.C55696a(shareRequest.mContent);
            } else {
                Log.m165383e("OPThirdSharePlugin", "content type is text,but content is empty.");
                callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "content is empty");
                return null;
            }
        } else if (UG.ShareContentType.IMAGE.mValue.equals(shareRequest.mContentType)) {
            if (!TextUtils.isEmpty(shareRequest.mImage)) {
                Bitmap stringToBitmap = stringToBitmap(shareRequest.mImage);
                if (stringToBitmap != null) {
                    aVar = new ShareEntity.C55696a(stringToBitmap);
                } else {
                    Log.m165383e("OPThirdSharePlugin", "content type is image,but image invalid.");
                    callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "image base64 invalid!");
                    return null;
                }
            } else {
                Log.m165383e("OPThirdSharePlugin", "content type is image,but image is empty.");
                callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "image is empty");
                return null;
            }
        } else if (UG.ShareContentType.WEB_URL.mValue.equals(shareRequest.mContentType)) {
            if (TextUtils.isEmpty(shareRequest.mUrl) || TextUtils.isEmpty(shareRequest.mTitle)) {
                Log.m165383e("OPThirdSharePlugin", "content type is url,but url is empty.");
                callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "url is empty");
                return null;
            }
            if (!TextUtils.isEmpty(shareRequest.mContent)) {
                str = shareRequest.mTitle + "\n" + shareRequest.mContent + "\n" + shareRequest.mUrl;
            } else {
                str = shareRequest.mTitle + "\n" + shareRequest.mUrl;
            }
            if (!TextUtils.isEmpty(shareRequest.mImage)) {
                aVar = new ShareEntity.C55696a(shareRequest.mTitle, shareRequest.mContent, shareRequest.mUrl, str, stringToBitmap(shareRequest.mImage));
            } else {
                aVar = new ShareEntity.C55696a(shareRequest.mTitle, shareRequest.mContent, shareRequest.mUrl, str);
            }
        }
        if (aVar == null) {
            Log.m165383e("OPThirdSharePlugin", "generate build error.");
            callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "content type not support");
        }
        return aVar;
    }

    public void callbackFail(AbstractC25897h<UG.ShareResponse> hVar, int i, String str) {
        UG.ShareResponse shareResponse = new UG.ShareResponse();
        shareResponse.mErrorCode = i;
        shareResponse.mErrorMessage = str;
        hVar.callback(shareResponse);
    }

    @LKPluginFunction(async = true, eventName = {"share"})
    public void shareAsync(UG.ShareRequest shareRequest, AbstractC25905b bVar, final AbstractC25897h<UG.ShareResponse> hVar) {
        if (shareRequest.mChannelType.isEmpty()) {
            Log.m165383e("OPThirdSharePlugin", "channel type empty.");
            callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "channel type empty.");
            return;
        }
        ShareEntity.C55696a generateShareBuilder = generateShareBuilder(shareRequest, hVar);
        if (generateShareBuilder != null) {
            C400181 r2 = new HashMap<String, String>() {
                /* class com.ss.android.lark.integrator.plugin.UGSharePlugin.C400181 */

                {
                    put(UG.ShareChannelType.WX.mValue, "lark.op.wx");
                    put(UG.ShareChannelType.WX_TIMELINE.mValue, "lark.op.wx_timeline");
                    put(UG.ShareChannelType.SYSTEM.mValue, "lark.op.system");
                }
            };
            String str = shareRequest.mChannelType.get(0);
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("OPThirdSharePlugin", "channel type empty. ");
                callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "share error. channel type is empty.");
            } else if (r2.containsKey(str)) {
                generateShareBuilder.mo189775b((String) r2.get(str));
                ShareEntity a = generateShareBuilder.mo189769a();
                a.setCallback(new OnShareCallback() {
                    /* class com.ss.android.lark.integrator.plugin.UGSharePlugin.C400192 */

                    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                    public void onSuccess(ShareActionType shareActionType) {
                        UG.ShareResponse shareResponse = new UG.ShareResponse();
                        Log.m165389i("OPThirdSharePlugin", "success:" + shareActionType.name());
                        hVar.callback(shareResponse);
                    }

                    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                    public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                        Log.m165389i("OPThirdSharePlugin", "onFailed:" + shareError.toString() + " type:" + shareActionType.getShareItemInfo().getName());
                        UGSharePlugin.this.callbackFail(hVar, shareError.getCode(), shareError.getMsg());
                    }
                });
                ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(bVar.mo92207a(), a);
            } else {
                Log.m165383e("OPThirdSharePlugin", "share error.");
                callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "share error. not support this channel type");
            }
        }
    }
}

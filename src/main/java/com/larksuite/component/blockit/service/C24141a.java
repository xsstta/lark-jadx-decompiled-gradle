package com.larksuite.component.blockit.service;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockEntityResp;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.BlockitIdResponse;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.MGetBlockRequest;
import com.larksuite.component.blockit.entity.MGetBlockResponseWrap;
import com.larksuite.component.blockit.entity.MGetOpenMessageResponseWrap;
import com.larksuite.component.blockit.entity.OpenMessageResp;
import com.larksuite.component.blockit.p1067b.C24050a;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.request.AbstractC26011b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.FormBody;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.larksuite.framework.http.response.ErrorResult;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.larksuite.component.blockit.service.a */
public class C24141a {

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.blockit.service.a$a */
    public static final class C24148a {

        /* renamed from: a */
        public static final C24141a f59721a = new C24141a();
    }

    /* renamed from: a */
    public static C24141a m88173a() {
        return C24148a.f59721a;
    }

    /* renamed from: c */
    private String m88176c() {
        try {
            return DynamicConfigModule.m145552b().mo136165a("open");
        } catch (Exception e) {
            AppBrandLogger.m52829e("BlockitService", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.service.a$6 */
    public static /* synthetic */ class C241476 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59720a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.larksuite.component.blockit.entity.BlockitEnv[] r0 = com.larksuite.component.blockit.entity.BlockitEnv.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.blockit.service.C24141a.C241476.f59720a = r0
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.BOE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.blockit.service.C24141a.C241476.f59720a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.STAGING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.blockit.service.C24141a.C241476.f59720a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.blockit.entity.BlockitEnv r1 = com.larksuite.component.blockit.entity.BlockitEnv.ONLINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.service.C24141a.C241476.<clinit>():void");
        }
    }

    /* renamed from: b */
    private String m88175b() {
        String c = m88176c();
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        int i = C241476.f59720a[C24050a.m87868c().ordinal()];
        if (i == 1 || i == 2) {
            return String.format("open.%s.cn", "feishu-boe");
        }
        return String.format("open.%s.cn", "feishu");
    }

    /* renamed from: a */
    private C26010a<BaseResponse> m88174a(String str) {
        MGetBlockRequest mGetBlockRequest = new MGetBlockRequest();
        mGetBlockRequest.blockIDs = Collections.singletonList(str);
        mGetBlockRequest.locale = C24050a.m87867b();
        String jSONString = JSONObject.toJSONString(mGetBlockRequest);
        return new C26010a(HttpMethod.POST, "https://" + m88175b() + "/open-apis/block/server/api/MGetBlockEntityV2").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d());
    }

    /* renamed from: b */
    public void mo86656b(final String str, final IGetDataCallback<BlockEntityResp> iGetDataCallback) {
        m88174a(str).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.service.C24141a.C241454 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                iGetDataCallback.onSuccess(null);
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        MGetBlockResponseWrap mGetBlockResponseWrap = (MGetBlockResponseWrap) JSONObject.parseObject(baseResponse.message(), MGetBlockResponseWrap.class);
                        if (mGetBlockResponseWrap.code == 0) {
                            iGetDataCallback.onSuccess(mGetBlockResponseWrap.data.blocks.get(str));
                            return;
                        }
                        iGetDataCallback.onSuccess(null);
                    } catch (Exception unused) {
                        iGetDataCallback.onSuccess(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public String mo86654a(final String str, final IGetDataCallback<BlockEntity> iGetDataCallback) {
        Log.m165389i("BlockitService", "getBlock: " + str);
        if (iGetDataCallback == null) {
            Log.m165389i("BlockitService", "callback: null");
            return null;
        }
        m88174a(str).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.service.C24141a.C241443 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("BlockitService", errorResult.toString());
                iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    String str = null;
                    try {
                        str = baseResponse.message();
                        MGetBlockResponseWrap mGetBlockResponseWrap = (MGetBlockResponseWrap) JSONObject.parseObject(str, MGetBlockResponseWrap.class);
                        if (mGetBlockResponseWrap.code == 0) {
                            BlockEntityResp blockEntityResp = mGetBlockResponseWrap.data.blocks.get(str);
                            if (blockEntityResp == null) {
                                iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(-1, "no entity this block "));
                            } else if (blockEntityResp.status != 0) {
                                iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult((int) blockEntityResp.status, blockEntityResp.errMessage));
                            } else {
                                BlockEntity blockEntity = blockEntityResp.entity;
                                if (blockEntity != null) {
                                    iGetDataCallback.onSuccess(blockEntity);
                                    return;
                                }
                                Log.m165397w("BlockitService", "result:" + str);
                                iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(mGetBlockResponseWrap.code, mGetBlockResponseWrap.msg));
                            }
                        } else {
                            Log.m165397w("BlockitService", "result:" + str);
                            iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(mGetBlockResponseWrap.code, mGetBlockResponseWrap.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("BlockitService", "getBlock " + str, e);
                        iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(100, e.toString()));
                    }
                }
            }
        });
        return null;
    }

    /* renamed from: c */
    public void mo86657c(final String str, final IGetDataCallback<OpenMessageResp> iGetDataCallback) {
        MGetBlockRequest mGetBlockRequest = new MGetBlockRequest();
        mGetBlockRequest.blockIDs = Collections.singletonList(str);
        mGetBlockRequest.locale = C24050a.m87867b();
        String jSONString = JSONObject.toJSONString(mGetBlockRequest);
        new C26010a(HttpMethod.POST, "https://" + m88175b() + "/open-apis/block/server/api/MGetOpenMessage").mo92471a(RequestBody.create("application/json", jSONString)).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.service.C24141a.C241465 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                iGetDataCallback.onSuccess(null);
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    try {
                        MGetOpenMessageResponseWrap mGetOpenMessageResponseWrap = (MGetOpenMessageResponseWrap) JSONObject.parseObject(baseResponse.message(), MGetOpenMessageResponseWrap.class);
                        if (mGetOpenMessageResponseWrap.code == 0) {
                            iGetDataCallback.onSuccess(mGetOpenMessageResponseWrap.data.messages.get(str));
                        } else {
                            iGetDataCallback.onSuccess(null);
                        }
                    } catch (Exception unused) {
                        iGetDataCallback.onSuccess(null);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo86655a(final BlockEntity blockEntity, JsonObject jsonObject, final IGetDataCallback<BlockEntity> iGetDataCallback) {
        String str = "https://" + m88175b() + "/open-apis/block/server/api/CreateBlockEntity";
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("blockTypeID", blockEntity.getBlockTypeID());
        jsonObject2.addProperty("sourceMeta", blockEntity.getSourceMeta());
        jsonObject2.addProperty("sourceData", blockEntity.getSourceData());
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.add("Entity", jsonObject2);
        if (jsonObject != null) {
            for (String str2 : jsonObject.keySet()) {
                jsonObject3.add(str2, jsonObject.get(str2));
            }
        }
        new C26010a(HttpMethod.POST, str).mo92471a(RequestBody.create("application/json", jsonObject3.toString())).mo92468a(C24050a.m87869d()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.service.C24141a.C241421 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                AppBrandLogger.m52829e("BlockitService", "onError:", errorResult.getErrorMessage());
                iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(-1, errorResult.getErrorMessage()));
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                try {
                    AppBrandLogger.m52830i("BlockitService", "onSuccess: resp code ", Integer.valueOf(baseResponse.code()));
                    if (baseResponse.isSuccessful()) {
                        String message = baseResponse.message();
                        AppBrandLogger.m52830i("BlockitService", "onSuccess:", message);
                        JsonObject asJsonObject = new JsonParser().parse(message).getAsJsonObject();
                        int asInt = asJsonObject.get("code").getAsInt();
                        if (asInt == 0) {
                            blockEntity.setBlockID(asJsonObject.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAsJsonObject().get("BlockId").getAsString());
                            iGetDataCallback.onSuccess(blockEntity);
                            return;
                        }
                        iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(asInt, message));
                        return;
                    }
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(baseResponse.code()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: a */
    public String mo86653a(Domain domain, String str, BlockTypeID blockTypeID, boolean z, final IGetDataCallback<String> iGetDataCallback) {
        Log.m165389i("BlockitService", "generateBlockID: " + domain + ":" + str + ":" + blockTypeID + ":" + z);
        if (iGetDataCallback != null && z) {
            iGetDataCallback.onSuccess(domain + "-" + str);
            iGetDataCallback = null;
        }
        FormBody.C26008a aVar = new FormBody.C26008a();
        aVar.mo92430a("domain", domain.name());
        aVar.mo92430a("uuid", str);
        aVar.mo92430a("blockTypeID", blockTypeID.getValue());
        new C26010a(HttpMethod.POST, "https://" + m88175b() + "/open-apis/block/server/api/GenerateBlockID").mo92471a(aVar.mo92431a()).mo92475a(new AbstractC26011b<BaseResponse>() {
            /* class com.larksuite.component.blockit.service.C24141a.C241432 */

            @Override // com.larksuite.framework.http.request.AbstractC26011b
            /* renamed from: a */
            public void mo86433a(ErrorResult errorResult) {
                Log.m165397w("BlockitService", errorResult.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new com.larksuite.framework.callback.Entity.ErrorResult(errorResult.getHttpStatusCode(), errorResult.getErrorMessage()));
                }
            }

            /* renamed from: a */
            public void mo86434a(BaseResponse baseResponse) {
                if (baseResponse != null) {
                    String str = null;
                    try {
                        str = baseResponse.message();
                        BlockitIdResponse blockitIdResponse = (BlockitIdResponse) JSONObject.parseObject(str, BlockitIdResponse.class);
                        if (blockitIdResponse.code == 0) {
                            String str2 = blockitIdResponse.data.BlockID;
                            if (!TextUtils.isEmpty(str2)) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(str2);
                                    return;
                                }
                                return;
                            }
                            Log.m165397w("BlockitService", "result:" + str);
                            IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                            if (iGetDataCallback2 != null) {
                                iGetDataCallback2.onError(new com.larksuite.framework.callback.Entity.ErrorResult(blockitIdResponse.code, blockitIdResponse.msg));
                                return;
                            }
                            return;
                        }
                        Log.m165397w("BlockitService", "result:" + str);
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new com.larksuite.framework.callback.Entity.ErrorResult(blockitIdResponse.code, blockitIdResponse.msg));
                        }
                    } catch (Exception e) {
                        Log.m165398w("BlockitService", "generateBlockID " + str, e);
                    }
                }
            }
        });
        return null;
    }
}

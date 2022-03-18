package com.ss.android.lark.appstrategy.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.appstrategy.p240a.C4143a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus;
import com.bytedance.lark.pb.openplatform.v1.GetDataStrategy;
import com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoRequest;
import com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse;
import com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest;
import com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse;
import com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateRequest;
import com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeRequest;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper;
import com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.sdk.SdkSender;

@RemoteServiceImpl(service = IAppStrategyManisService.class)
public class AppStrategyManisServiceImpl implements IAppStrategyManisService {
    private Context mContext;

    public AppStrategyManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenApp(String str, final IAppStrategyManisService.AbstractC29241a aVar) {
        GetOpenAppStateRequest.C18665a a = new GetOpenAppStateRequest.C18665a().mo64258a(str).mo64257a((Boolean) true);
        Command command = Command.GET_OPEN_APP;
        C292461 r1 = new IGetDataCallback<GetOpenAppStateResponse>() {
            /* class com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.C292461 */

            /* renamed from: a */
            public void onSuccess(GetOpenAppStateResponse getOpenAppStateResponse) {
                aVar.onSuccess(new SuccessResultWrapper(getOpenAppStateResponse));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.onError(new ErrorResultWrapper(errorResult));
            }
        };
        ProtoAdapter<GetOpenAppStateResponse> protoAdapter = GetOpenAppStateResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r1, new SdkSender.IParser() {
            /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$_aSg7ZbAVvwasXqkzqMMeCqGipE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetOpenAppStateResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenAppInfoV2(final String str, int i, final IAppStrategyManisService.AbstractC29241a aVar) {
        if (TextUtils.isEmpty(str)) {
            Log.m165397w("AppStrategyManisServiceImpl", "appId null");
            aVar.onSuccess(new SuccessResultWrapper(null, C4143a.m17242a(10103, "client.open_platform.gadget.app_strategy.middle.manis", 0, 0, 0, "manis service appId null", null, "ma", false, null)));
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (i == IAppStrategyManisService.OpenAppInfoType.MiniApp.getType()) {
            final GetMiniAppControlInfoRequest.C18661a a = new GetMiniAppControlInfoRequest.C18661a().mo64248a(str).mo64247a(GetDataStrategy.LocalOnly);
            Command command = Command.GET_MINI_APP_INFO_WITH_TIPS;
            C292472 r9 = new IGetDataCallback<GetMiniAppControlInfoResponse>() {
                /* class com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.C292472 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("AppStrategyManisServiceImpl", "get mini app info from local err=" + errorResult.getDebugMsg());
                    aVar.onError(new ErrorResultWrapper(errorResult));
                }

                /* renamed from: a */
                public void onSuccess(GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) {
                    boolean z;
                    if (getMiniAppControlInfoResponse.app_info == null || getMiniAppControlInfoResponse.app_info.status != CommonUsageStatus.USABLE) {
                        Log.m165389i("AppStrategyManisServiceImpl", "get mini app info from net");
                        final long currentTimeMillis = System.currentTimeMillis();
                        a.mo64247a(GetDataStrategy.NetOnly);
                        Command command = Command.GET_MINI_APP_INFO_WITH_TIPS;
                        GetMiniAppControlInfoRequest.C18661a aVar = a;
                        C292481 r5 = new IGetDataCallback<GetMiniAppControlInfoResponse>() {
                            /* class com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.C292472.C292481 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165383e("AppStrategyManisServiceImpl", "get mini app info from net err=" + errorResult.getDebugMsg());
                                aVar.onError(new ErrorResultWrapper(errorResult));
                            }

                            /* renamed from: a */
                            public void onSuccess(GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) {
                                boolean z;
                                long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                String str = str;
                                if (getMiniAppControlInfoResponse.app_info == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                aVar.onSuccess(new SuccessResultWrapper(getMiniAppControlInfoResponse, C4143a.m17242a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "client.open_platform.gadget.app_strategy.middle.manis", 0, currentTimeMillis, currentTimeMillis2, null, str, "ma", z, "net")));
                            }
                        };
                        ProtoAdapter<GetMiniAppControlInfoResponse> protoAdapter = GetMiniAppControlInfoResponse.ADAPTER;
                        protoAdapter.getClass();
                        SdkSender.asynSendRequestNonWrap(command, aVar, r5, new SdkSender.IParser() {
                            /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$o3YBW33NIykt1pSfhEsr30ibCQ */

                            @Override // com.ss.android.lark.sdk.SdkSender.IParser
                            public final Object parse(byte[] bArr) {
                                return (GetMiniAppControlInfoResponse) ProtoAdapter.this.decode(bArr);
                            }
                        });
                        return;
                    }
                    Log.m165389i("AppStrategyManisServiceImpl", "get mini app info from local usable");
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    String str = str;
                    if (getMiniAppControlInfoResponse.app_info == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.onSuccess(new SuccessResultWrapper(getMiniAppControlInfoResponse, C4143a.m17242a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "client.open_platform.gadget.app_strategy.middle.manis", 0, currentTimeMillis2, 0, null, str, "ma", z, "local")));
                    a.mo64247a(GetDataStrategy.NetOnly);
                    SdkSender.asynSendRequestNonWrap(Command.GET_MINI_APP_INFO_WITH_TIPS, a, null, null);
                }
            };
            ProtoAdapter<GetMiniAppControlInfoResponse> protoAdapter = GetMiniAppControlInfoResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, a, r9, new SdkSender.IParser() {
                /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$o3YBW33NIykt1pSfhEsr30ibCQ */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (GetMiniAppControlInfoResponse) ProtoAdapter.this.decode(bArr);
                }
            });
            return;
        }
        final GetH5ControlInfoRequest.C18657a a2 = new GetH5ControlInfoRequest.C18657a().mo64238a(str).mo64237a(GetDataStrategy.LocalOnly);
        Command command2 = Command.GET_H5_INFO_WITH_TIPS;
        C292493 r92 = new IGetDataCallback<GetH5ControlInfoResponse>() {
            /* class com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.C292493 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AppStrategyManisServiceImpl", "get h5 info from local err=" + errorResult.getDebugMsg());
                aVar.onError(new ErrorResultWrapper(errorResult));
            }

            /* renamed from: a */
            public void onSuccess(GetH5ControlInfoResponse getH5ControlInfoResponse) {
                if (getH5ControlInfoResponse.h5_info == null || getH5ControlInfoResponse.h5_info.status != CommonUsageStatus.USABLE) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    Log.m165389i("AppStrategyManisServiceImpl", "get h5 info from net");
                    a2.mo64237a(GetDataStrategy.NetOnly);
                    Command command = Command.GET_H5_INFO_WITH_TIPS;
                    GetH5ControlInfoRequest.C18657a aVar = a2;
                    C292501 r5 = new IGetDataCallback<GetH5ControlInfoResponse>() {
                        /* class com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.C292493.C292501 */

                        /* renamed from: a */
                        public void onSuccess(GetH5ControlInfoResponse getH5ControlInfoResponse) {
                            aVar.onSuccess(new SuccessResultWrapper(getH5ControlInfoResponse, C4143a.m17242a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "client.open_platform.gadget.app_strategy.middle.manis", 0, System.currentTimeMillis() - currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, null, str, "h5", false, "net")));
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("AppStrategyManisServiceImpl", "get h5 info from net err=" + errorResult.getDebugMsg());
                            aVar.onError(new ErrorResultWrapper(errorResult));
                        }
                    };
                    ProtoAdapter<GetH5ControlInfoResponse> protoAdapter = GetH5ControlInfoResponse.ADAPTER;
                    protoAdapter.getClass();
                    SdkSender.asynSendRequestNonWrap(command, aVar, r5, new SdkSender.IParser() {
                        /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$5dTpo5fXUs7y3oGDfWbi64C4uXo */

                        @Override // com.ss.android.lark.sdk.SdkSender.IParser
                        public final Object parse(byte[] bArr) {
                            return (GetH5ControlInfoResponse) ProtoAdapter.this.decode(bArr);
                        }
                    });
                    return;
                }
                Log.m165389i("AppStrategyManisServiceImpl", "get h5 info from local usable");
                aVar.onSuccess(new SuccessResultWrapper(getH5ControlInfoResponse, C4143a.m17242a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "client.open_platform.gadget.app_strategy.middle.manis", 0, System.currentTimeMillis() - currentTimeMillis, 0, null, str, "h5", false, "local")));
                a2.mo64237a(GetDataStrategy.NetOnly);
                SdkSender.asynSendRequestNonWrap(Command.GET_H5_INFO_WITH_TIPS, a2, null, null);
            }
        };
        ProtoAdapter<GetH5ControlInfoResponse> protoAdapter2 = GetH5ControlInfoResponse.ADAPTER;
        protoAdapter2.getClass();
        SdkSender.asynSendRequestNonWrap(command2, a2, r92, new SdkSender.IParser() {
            /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$5dTpo5fXUs7y3oGDfWbi64C4uXo */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetH5ControlInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void updateLastUseTime(String str, String str2, long j, final IAppStrategyManisService.AbstractC29241a aVar) {
        UpdateOpenAppLastHappenTimeRequest.C18719a c = new UpdateOpenAppLastHappenTimeRequest.C18719a().mo64386a(str).mo64388b(str2).mo64389c(String.valueOf(j));
        Command command = Command.UPDATE_OPEN_APP_LAST_HAPPEN;
        C292514 r4 = new IGetDataCallback<UpdateOpenAppLastHappenTimeResponse>() {
            /* class com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.C292514 */

            /* renamed from: a */
            public void onSuccess(UpdateOpenAppLastHappenTimeResponse updateOpenAppLastHappenTimeResponse) {
                aVar.onSuccess(new SuccessResultWrapper(updateOpenAppLastHappenTimeResponse));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.onError(new ErrorResultWrapper(errorResult));
            }
        };
        ProtoAdapter<UpdateOpenAppLastHappenTimeResponse> protoAdapter = UpdateOpenAppLastHappenTimeResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, c, r4, new SdkSender.IParser() {
            /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$AydZUIim7ahUtNIwDIukZejKtXs */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (UpdateOpenAppLastHappenTimeResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }
}

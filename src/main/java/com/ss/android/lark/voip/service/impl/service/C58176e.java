package com.ss.android.lark.voip.service.impl.service;

import com.bytedance.lark.pb.basic.v1.AppConfig;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetAppConfigRequest;
import com.bytedance.lark.pb.basic.v1.GetAppConfigResponse;
import com.bytedance.lark.pb.tool.v1.SetLogBySDKRequest;
import com.bytedance.lark.pb.tool.v1.SetLogBySDKResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceCallRequest;
import com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceCallResponse;
import com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall;
import com.ss.android.lark.pb.videoconference.v1.GetE2EEVoiceCallsRequest;
import com.ss.android.lark.pb.videoconference.v1.GetE2EEVoiceCallsResponse;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatRequest;
import com.ss.android.lark.pb.videoconference.v1.StartByteviewHeartbeatResponse;
import com.ss.android.lark.pb.videoconference.v1.StartE2EEVoiceCallPollingRequest;
import com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatRequest;
import com.ss.android.lark.pb.videoconference.v1.StopByteviewHeartbeatResponse;
import com.ss.android.lark.pb.videoconference.v1.StopE2EEVoiceCallPollingRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.AbstractC58046e;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.VoiceCallConfig;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.CalleeToCallTimeClockEvent;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.ss.android.lark.voip.service.impl.service.e */
public class C58176e implements AbstractC58173c {

    /* renamed from: a */
    private static volatile boolean f143089a = true;

    @Override // com.ss.android.lark.voip.service.impl.service.AbstractC58173c
    /* renamed from: a */
    public void mo197134a(final String str, byte[] bArr, VoiceCall.Status status, IGetDataCallback<String> iGetDataCallback) {
        C58151d.m225578a("ui", "rust", "update voice call id = " + str + ", status = " + status, "[VoIpCallService] patchE2EEVoiceCall: update voice call id = " + str + ", status = " + status);
        UpdateE2EEVoiceCallRequest.C51126a aVar = new UpdateE2EEVoiceCallRequest.C51126a();
        long a = CalleeToCallTimeClockEvent.m225581a(str);
        if (a != 0) {
            aVar.mo176414a(Long.valueOf(a));
        }
        aVar.mo176415a(str).mo176416a(ByteString.of(bArr)).mo176412a(E2EEVoiceCall.Status.fromValue(status.getNumber())).mo176413a((Boolean) true);
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_E2EE_VOICE_CALL, aVar, iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581859 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                UpdateE2EEVoiceCallResponse.ADAPTER.decode(bArr);
                return str;
            }
        });
    }

    /* renamed from: b */
    public static void m225721b() {
        SdkSender.asynSendRequestNonWrap(Command.STOP_E2EE_VOICE_CALL_POLLING, new StopE2EEVoiceCallPollingRequest.C51102a(), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581826 */

            /* renamed from: a */
            public void onSuccess(String str) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        }, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581837 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    /* renamed from: a */
    public static void m225720a() {
        VoiceCall a;
        AbstractC58046e f = C58103o.m225371a().mo196949f();
        if (f != null && (a = f.mo196802a()) != null && !C57782ag.m224241a(a.getId())) {
            StartE2EEVoiceCallPollingRequest.C51094a aVar = new StartE2EEVoiceCallPollingRequest.C51094a();
            aVar.mo176340a(a.getId());
            SdkSender.asynSendRequestNonWrap(Command.START_E2EE_VOICE_CALL_POLLING, aVar, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581771 */

                /* renamed from: a */
                public void onSuccess(String str) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }
            }, new SdkSender.IParser<String>() {
                /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581815 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return null;
                }
            });
        }
    }

    /* renamed from: b */
    private void m225722b(IGetDataCallback<VoiceCallConfig> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_APP_CONFIG, new GetAppConfigRequest.C14959a(), iGetDataCallback, new SdkSender.IParser<VoiceCallConfig>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581793 */

            /* renamed from: a */
            public VoiceCallConfig parse(byte[] bArr) throws IOException {
                AppConfig appConfig = GetAppConfigResponse.ADAPTER.decode(bArr).app_config;
                if (appConfig != null && appConfig.voice_call_config != null) {
                    return new VoiceCallConfig(appConfig.voice_call_config.heartbeat_cycle.intValue(), appConfig.voice_call_config.heartbeat_expired_time.intValue());
                }
                C58151d.m225579b("rust", "ui", "parse voice config fail", "[VoIpCallService] pullVoiceConfig: fail");
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.voip.service.impl.service.AbstractC58173c
    /* renamed from: a */
    public void mo197130a(IGetDataCallback<List<VoiceCall>> iGetDataCallback) {
        C58151d.m225578a("ui", "rust", "get voice call list", "[VoIpCallService] pullE2EEVoiceCalls");
        GetE2EEVoiceCallsRequest.C50635a aVar = new GetE2EEVoiceCallsRequest.C50635a();
        if (f143089a) {
            aVar.f126373a = GetE2EEVoiceCallsRequest.SourceType.STARTUP;
            f143089a = false;
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_E2EE_VOICE_CALLS, aVar, iGetDataCallback, new SdkSender.IParser<List<VoiceCall>>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.AnonymousClass10 */

            /* renamed from: a */
            public List<VoiceCall> parse(byte[] bArr) throws IOException {
                return C58174d.m225718a(GetE2EEVoiceCallsResponse.ADAPTER.decode(bArr).calls);
            }
        });
    }

    @Override // com.ss.android.lark.voip.service.impl.service.AbstractC58173c
    /* renamed from: b */
    public void mo197135b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        StopByteviewHeartbeatRequest.C51096a aVar = new StopByteviewHeartbeatRequest.C51096a();
        aVar.mo176345a(StartByteviewHeartbeatRequest.ServiceType.VOIP).mo176346a(str);
        SdkSender.asynSendRequestNonWrap(Command.STOP_BYTEVIEW_HEARTBEAT, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581782 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                boolean z;
                if (StopByteviewHeartbeatResponse.ADAPTER.decode(bArr) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // com.ss.android.lark.voip.service.impl.service.AbstractC58173c
    /* renamed from: a */
    public void mo197131a(final String str, final IGetDataCallback iGetDataCallback) {
        C58151d.m225578a("ui", "rust", "pull config token = " + str, "[VoIpCallService] startVoIpHeartBeat: pull config token = " + str);
        m225722b(new IGetDataCallback<VoiceCallConfig>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.AnonymousClass12 */

            /* renamed from: a */
            public void onSuccess(VoiceCallConfig voiceCallConfig) {
                C58151d.m225578a("rust", "ui", "pull config success", "[VoIpCallService] startVoIpHeartBeat: pull config onSuccess");
                if (voiceCallConfig != null) {
                    C58176e.this.mo197137a(str, voiceCallConfig.getHeartBeatCycle(), voiceCallConfig.getHeartBeatExpireTime(), iGetDataCallback);
                } else {
                    C58176e.this.mo197137a(str, 3, 12, iGetDataCallback);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C58151d.m225578a("rust", "ui", "pull config fail " + errorResult.getDebugMsg(), "[VoIpCallService] startVoIpHeartBeat: pull config onError errCode = " + errorResult.getErrorCode());
                C58176e.this.mo197137a(str, 3, 12, iGetDataCallback);
            }
        });
    }

    @Override // com.ss.android.lark.voip.service.impl.service.AbstractC58173c
    /* renamed from: a */
    public void mo197132a(String str, String str2, Map<String, String> map) {
        SetLogBySDKRequest.C19755a aVar = new SetLogBySDKRequest.C19755a();
        aVar.mo66918a(map).mo66917a(str).mo66916a(SetLogBySDKRequest.Level.Info).mo66920b(str2);
        SdkSender.asynSendRequestNonWrap(Command.SET_LOG_BY_SDK, aVar, null, new SdkSender.IParser() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.AnonymousClass11 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                SetLogBySDKResponse decode = SetLogBySDKResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    C58151d.m225578a("rust", "ui", "set log response parse fail", "[VoIpCallService] setLogBySdk: response parse fail");
                }
                return decode;
            }
        });
    }

    /* renamed from: a */
    public void mo197137a(String str, int i, int i2, IGetDataCallback<Boolean> iGetDataCallback) {
        StartByteviewHeartbeatRequest.C51088a aVar = new StartByteviewHeartbeatRequest.C51088a();
        aVar.mo176322a(StartByteviewHeartbeatRequest.ServiceType.VOIP).mo176326b(Integer.valueOf(i2)).mo176323a(Integer.valueOf(i)).mo176324a(str);
        SdkSender.asynSendRequestNonWrap(Command.START_BYTEVIEW_HEARTBEAT, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581804 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                boolean z;
                if (StartByteviewHeartbeatResponse.ADAPTER.decode(bArr) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // com.ss.android.lark.voip.service.impl.service.AbstractC58173c
    /* renamed from: a */
    public void mo197133a(String str, String str2, byte[] bArr, IGetDataCallback<VoiceCall> iGetDataCallback) {
        CreateE2EEVoiceCallRequest.C50513a aVar = new CreateE2EEVoiceCallRequest.C50513a();
        aVar.mo174946a(str).mo174949b(str2).mo174947a(ByteString.of(bArr)).mo174944a((Boolean) true);
        AbstractC57987d.AbstractC57996g settingDependency = C57977a.m224905c().getSettingDependency();
        if (settingDependency != null) {
            aVar.mo174945a(Long.valueOf(settingDependency.mo145507a()));
        }
        SdkSender.asynSendRequestNonWrap(Command.CREATE_E2EE_VOICE_CALL, aVar, iGetDataCallback, new SdkSender.IParser<VoiceCall>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58176e.C581848 */

            /* renamed from: a */
            public VoiceCall parse(byte[] bArr) throws IOException {
                VoiceCall a = C58174d.m225717a(CreateE2EEVoiceCallResponse.ADAPTER.decode(bArr).call);
                int i = 0;
                if (a != null) {
                    String str = "get call info id = " + a.getId() + ", fromUserId = " + a.getFromUserId() + ", toUserId = " + a.getToUserId();
                    StringBuilder sb = new StringBuilder();
                    sb.append("[VoIpCallService] putE2EEVoiceCall: parse data length = ");
                    if (bArr != null) {
                        i = bArr.length;
                    }
                    sb.append(i);
                    sb.append("call = ");
                    sb.append(a.toString());
                    C58151d.m225578a("rust", "ui", str, sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[VoIpCallService] putE2EEVoiceCall: parse data length = ");
                    if (bArr != null) {
                        i = bArr.length;
                    }
                    sb2.append(i);
                    C58151d.m225579b("rust", "ui", "get invalid call info", sb2.toString());
                }
                return a;
            }
        });
    }
}

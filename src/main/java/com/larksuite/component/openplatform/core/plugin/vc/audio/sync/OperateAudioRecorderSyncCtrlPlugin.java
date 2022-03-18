package com.larksuite.component.openplatform.core.plugin.vc.audio.sync;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.authorization.C24588a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.audio.C65754b;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class OperateAudioRecorderSyncCtrlPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class OnRecorderChanged extends C25921b {
        @JSONField(name = "frameBuffer")
        public String mFrameBuffer;
        @JSONField(name = "isLastFrame")
        public boolean mIsLastFrame;
        @JSONField(name = "state")
        public String mState;
        @JSONField(name = "tempFilePath")
        public String mTempFilePath;

        private OnRecorderChanged() {
        }
    }

    /* access modifiers changed from: private */
    public static class OperateAudioRecorderRequest extends C25920a {
        @JSONField(name = "duration")
        public long mDuration;
        @JSONField(name = "encodeBitRate")
        public int mEncodeBitRate;
        @JSONField(name = "format")
        public String mFormat;
        @JSONField(name = "frameSize")
        public int mFrameSize;
        @JSONField(name = "numberOfChannels")
        public int mNumberOfChannels;
        @JSONField(name = "operationType")
        @LKRequiredParam
        public String mOperationType;
        @JSONField(name = "sampleRate")
        public int mSampleRate;

        private OperateAudioRecorderRequest() {
        }
    }

    private static class OperateAudioRecorderResponse extends C25921b {
        private OperateAudioRecorderResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private void registerRecorderCallback(final AbstractC25905b bVar) {
        C65754b.m257769a(getAppContext()).mo230390a(new C65754b.AbstractC65760d() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255125 */

            @Override // com.tt.miniapp.audio.C65754b.AbstractC65760d
            /* renamed from: a */
            public void mo88645a(String str, String str2) {
                AppBrandLogger.m52828d("tma_OperateAudioRecorderSyncCtrl", "onRecorderStateChange state = ", str, " , args = ", str2);
                OperateAudioRecorderSyncCtrlPlugin.this.setState(str, str2, bVar);
            }

            @Override // com.tt.miniapp.audio.C65754b.AbstractC65760d
            /* renamed from: a */
            public void mo88646a(byte[] bArr, boolean z) {
                OnRecorderChanged onRecorderChanged = new OnRecorderChanged();
                onRecorderChanged.mState = "frameRecorded";
                onRecorderChanged.mFrameBuffer = Base64.encodeToString(bArr, 0);
                onRecorderChanged.mIsLastFrame = z;
                bVar.mo92214a("onRecorderStateChange", onRecorderChanged);
            }
        });
    }

    @LKPluginFunction(eventName = {"operateRecorder"})
    public OperateAudioRecorderResponse operateAudioRecorderSync(final OperateAudioRecorderRequest operateAudioRecorderRequest, final AbstractC25905b bVar) {
        OperateAudioRecorderResponse operateAudioRecorderResponse = new OperateAudioRecorderResponse();
        final Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52829e("tma_OperateAudioRecorderSyncCtrl", "activity is null");
            operateAudioRecorderResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            operateAudioRecorderResponse.mErrorMessage = "activity is null";
            return operateAudioRecorderResponse;
        }
        final boolean b = ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo50184b(13);
        Observable.create(new Function<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255072 */

            /* renamed from: a */
            public Boolean fun() {
                return C24588a.m89632c();
            }
        }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Boolean>() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255061 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
            public void onError(Throwable th) {
                OperateAudioRecorderSyncCtrlPlugin.this.operateAudioRecorder(currentActivity, b, operateAudioRecorderRequest, bVar);
                AppBrandLogger.eWithThrowable("tma_OperateAudioRecorderSyncCtrl", "onError", th);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    OperateAudioRecorderSyncCtrlPlugin.this.operateAudioRecorderNew(currentActivity, b, operateAudioRecorderRequest, bVar);
                } else {
                    OperateAudioRecorderSyncCtrlPlugin.this.operateAudioRecorder(currentActivity, b, operateAudioRecorderRequest, bVar);
                }
            }
        });
        return operateAudioRecorderResponse;
    }

    public void runApi(OperateAudioRecorderRequest operateAudioRecorderRequest, AbstractC25905b bVar) {
        registerRecorderCallback(bVar);
        try {
            AppBrandLogger.m52828d("tma_OperateAudioRecorderSyncCtrl", "mParams = ", operateAudioRecorderRequest.toString());
            String str = operateAudioRecorderRequest.mOperationType;
            if ("start".equals(str)) {
                C65754b.m257769a(getAppContext()).mo230389a(new C65754b.C65759c(operateAudioRecorderRequest.mDuration, operateAudioRecorderRequest.mSampleRate, operateAudioRecorderRequest.mEncodeBitRate, (short) operateAudioRecorderRequest.mNumberOfChannels, operateAudioRecorderRequest.mFormat, operateAudioRecorderRequest.mFrameSize));
            } else if ("pause".endsWith(str)) {
                C65754b.m257769a(getAppContext()).mo230392b();
            } else if ("resume".endsWith(str)) {
                C65754b.m257769a(getAppContext()).mo230388a();
            } else if ("stop".endsWith(str)) {
                C65754b.m257769a(getAppContext()).mo230393c();
            } else {
                setState("error", ApiCallResultHelper.generateIllegalParamExtraInfo("operationType"), bVar);
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_OperateAudioRecorderSyncCtrl", "runApi", e);
            setState("error", "parse error", bVar);
        }
    }

    public void setState(String str, String str2, AbstractC25905b bVar) {
        String str3;
        if (TTFileHelper.m264259a("operateRecorder", getAppContext())) {
            standardSetState(str, str2, bVar);
            return;
        }
        OnRecorderChanged onRecorderChanged = new OnRecorderChanged();
        onRecorderChanged.mState = str;
        str.hashCode();
        if (str.equals("stop")) {
            onRecorderChanged.mTempFilePath = getApiDependency().mo235048d(str2);
        } else if (str.equals("error")) {
            onRecorderChanged.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            StringBuilder sb = new StringBuilder();
            sb.append("operateRecorder:fail");
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " " + str2;
            }
            sb.append(str3);
            onRecorderChanged.mErrorMessage = sb.toString();
        }
        bVar.mo92214a("onRecorderStateChange", onRecorderChanged);
    }

    private void standardSetState(String str, String str2, AbstractC25905b bVar) {
        OnRecorderChanged onRecorderChanged = new OnRecorderChanged();
        onRecorderChanged.mState = str;
        str.hashCode();
        String str3 = "";
        if (str.equals("stop")) {
            try {
                File file = new File(str2);
                TTFile a = TTFile.f171100b.mo235646a(file.getName());
                ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235605a(file, a, new TTFileContext(null, "operateRecorder"));
                onRecorderChanged.mTempFilePath = a.mo235647a();
            } catch (TTFileException e) {
                AppBrandLogger.m52829e("tma_OperateAudioRecorderSyncCtrl", "copySystemFile exception", e);
                onRecorderChanged.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                StringBuilder sb = new StringBuilder();
                sb.append("operateRecorder:fail");
                if (!TextUtils.isEmpty(str2)) {
                    str3 = " " + str2;
                }
                sb.append(str3);
                onRecorderChanged.mErrorMessage = sb.toString();
            }
        } else if (str.equals("error")) {
            onRecorderChanged.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("operateRecorder:fail");
            if (!TextUtils.isEmpty(str2)) {
                str3 = " " + str2;
            }
            sb2.append(str3);
            onRecorderChanged.mErrorMessage = sb2.toString();
        }
        bVar.mo92214a("onRecorderStateChange", onRecorderChanged);
    }

    public void operateAudioRecorder(final Activity activity, final boolean z, final OperateAudioRecorderRequest operateAudioRecorderRequest, final AbstractC25905b bVar) {
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235103a(activity, "operateRecorder", C66578b.C66579a.m260118d(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255104 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.RECORD_AUDIO");
                OperateAudioRecorderSyncCtrlPlugin.this.getApiDependency().mo235022a(activity, "operateRecorder", hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255104.C255111 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", OperateAudioRecorderSyncCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "success").mo231092a();
                        }
                        OperateAudioRecorderSyncCtrlPlugin.this.runApi(operateAudioRecorderRequest, bVar);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", OperateAudioRecorderSyncCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        OperateAudioRecorderSyncCtrlPlugin.this.setState("error", "system auth deny", bVar);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", OperateAudioRecorderSyncCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "old").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                OperateAudioRecorderSyncCtrlPlugin.this.setState("error", "auth deny", bVar);
            }
        });
    }

    public void operateAudioRecorderNew(final Activity activity, final boolean z, final OperateAudioRecorderRequest operateAudioRecorderRequest, final AbstractC25905b bVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(C66578b.C66579a.m260118d(getAppContext()));
        final AbstractC67733a aVar = (AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class);
        aVar.mo235101a(activity, "operateRecorder", hashSet, new LinkedHashMap<>(), new AbstractC67539a() {
            /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255083 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: a */
            public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.RECORD_AUDIO");
                OperateAudioRecorderSyncCtrlPlugin.this.getApiDependency().mo235022a(activity, "operateRecorder", hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.OperateAudioRecorderSyncCtrlPlugin.C255083.C255091 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", OperateAudioRecorderSyncCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "success").mo231092a();
                        }
                        OperateAudioRecorderSyncCtrlPlugin.this.runApi(operateAudioRecorderRequest, bVar);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        if (!z) {
                            C66020b.m258530a("mp_auth_alert_result", OperateAudioRecorderSyncCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "system_reject").mo231092a();
                        }
                        OperateAudioRecorderSyncCtrlPlugin.this.setState("error", "system auth deny", bVar);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67539a
            /* renamed from: b */
            public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                if (!z) {
                    C66020b.m258530a("mp_auth_alert_result", OperateAudioRecorderSyncCtrlPlugin.this.getAppContext()).mo231090a("alert_type", "new").mo231090a("auth_type", aVar.mo50175a(13)).mo231090a("result", "fail").mo231090a("fail_type", "mp_reject").mo231092a();
                }
                OperateAudioRecorderSyncCtrlPlugin.this.setState("error", "auth deny", bVar);
            }
        }, null);
    }
}

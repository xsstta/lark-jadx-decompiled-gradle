package com.larksuite.component.openplatform.plugins.device.nfc;

import android.nfc.Tag;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.plugins.device.nfc.model.NfcCallbackResponseModel;
import com.larksuite.component.openplatform.plugins.device.nfc.model.NfcRequestModel;
import com.larksuite.component.openplatform.plugins.device.nfc.model.NfcResponseModel;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.log.Log;
import okio.ByteString;

public class NfcPlugin extends AbstractC25889a {
    public AbstractC25593a mNfcManagerService;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin$a */
    public interface AbstractC25592a {
        /* renamed from: a */
        void mo88791a(AbstractC25594b bVar);
    }

    public String getNfcTech() {
        return "NFC-A";
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mNfcManagerService = null;
    }

    @LKPluginFunction(async = true, eventName = {"nfcStopDiscovery"})
    public void stopDiscovery(AbstractC25905b bVar, AbstractC25897h<NfcResponseModel> hVar) {
        if (this.mNfcManagerService == null) {
            this.mNfcManagerService = new C25598f(bVar);
        }
        this.mNfcManagerService.mo88798a((AbstractC25597e) null);
        hVar.callback(new NfcResponseModel());
        bVar.mo92214a("nfcFoundDevice", new NfcCallbackResponseModel());
    }

    @LKPluginFunction(async = true, eventName = {"nfcGetAtqa"})
    public void getAtqa(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255853 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                String str;
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                byte[] d = bVar.mo88805d();
                if (d == null || d.length <= 0) {
                    str = null;
                } else {
                    str = ByteString.of(d).base64();
                }
                NfcResponseModel.NativeBuffers nativeBuffers = new NfcResponseModel.NativeBuffers();
                nativeBuffers.mKey = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                nativeBuffers.mBase64 = str;
                nfcResponseModel.mNativeBuffers.add(nativeBuffers);
                hVar.callback(nfcResponseModel);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcMaxTransceiveLength"})
    public void getMaxTransceiveLength(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255875 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                nfcResponseModel.mLength = bVar.mo88804c();
                hVar.callback(nfcResponseModel);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcGetSak"})
    public void getSak(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255864 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                nfcResponseModel.mSak = Short.valueOf(bVar.mo88806e());
                hVar.callback(nfcResponseModel);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcClose"})
    public void nfcClose(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255831 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                if (!bVar.mo88803b()) {
                    NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, "close error");
                }
                hVar.callback(nfcResponseModel);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcConnect"})
    public void nfcConnect(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255842 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                if (!bVar.mo88801a()) {
                    NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, "connect error");
                }
                hVar.callback(nfcResponseModel);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcSetTimeout"})
    public void setTimeOut(final NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255886 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                bVar.mo88800a(nfcRequestModel.mTimeOut);
                hVar.callback(new NfcResponseModel());
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcTransceive"})
    public void transceive(final NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar) {
        handleAPI(nfcRequestModel, hVar, bVar, new AbstractC25592a() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255908 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.AbstractC25592a
            /* renamed from: a */
            public void mo88791a(AbstractC25594b bVar) {
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                if (nfcRequestModel.mNativeBuffers == null) {
                    Log.m165389i("NfcPlugin", "data is null");
                    NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, "data is null");
                    hVar.callback(nfcResponseModel);
                    return;
                }
                NfcResponseModel.NativeBuffers nativeBuffers = nfcRequestModel.mNativeBuffers.get(0);
                if (nativeBuffers == null) {
                    Log.m165389i("NfcPlugin", "arraybuffer is empty");
                    NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, "arraybuffer is empty");
                    hVar.callback(nfcResponseModel);
                    return;
                }
                byte[] decode = Base64.decode(nativeBuffers.mBase64, 0);
                if (decode == null) {
                    NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, "key or data is empty");
                    hVar.callback(nfcResponseModel);
                    Log.m165389i("NfcPlugin", "key or data is empty");
                    return;
                }
                byte[] a = bVar.mo88802a(decode);
                String str = null;
                if (a != null && a.length > 0) {
                    str = ByteString.of(a).base64();
                }
                NfcResponseModel.NativeBuffers nativeBuffers2 = new NfcResponseModel.NativeBuffers();
                nativeBuffers2.mKey = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                nativeBuffers2.mBase64 = str;
                nfcResponseModel.mNativeBuffers.add(nativeBuffers2);
                hVar.callback(nfcResponseModel);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"nfcStartDiscovery"})
    public void startDiscovery(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, final AbstractC25905b bVar) {
        if (this.mNfcManagerService == null) {
            this.mNfcManagerService = new C25598f(bVar);
        }
        this.mNfcManagerService.mo88798a(new AbstractC25597e() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.C255897 */

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25597e
            /* renamed from: a */
            public void mo88792a() {
                hVar.callback(new NfcResponseModel());
            }

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25597e
            /* renamed from: a */
            public void mo88794a(String str) {
                NfcResponseModel nfcResponseModel = new NfcResponseModel();
                NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, str);
                hVar.callback(nfcResponseModel);
            }

            @Override // com.larksuite.component.openplatform.plugins.device.nfc.AbstractC25597e
            /* renamed from: a */
            public void mo88793a(Tag tag) {
                NfcCallbackResponseModel nfcCallbackResponseModel = new NfcCallbackResponseModel();
                String str = null;
                String[] techList = tag != null ? tag.getTechList() : null;
                if (techList != null) {
                    for (int i = 0; i < techList.length; i++) {
                        if (!TextUtils.isEmpty(techList[i])) {
                            nfcCallbackResponseModel.mTechList.add(C25596d.m91337a(techList[i]));
                        }
                    }
                }
                byte[] id = tag != null ? tag.getId() : null;
                if (id != null && id.length > 0) {
                    str = ByteString.of(id).base64();
                }
                NfcResponseModel.NativeBuffers nativeBuffers = new NfcResponseModel.NativeBuffers();
                nativeBuffers.mKey = "uid";
                nativeBuffers.mBase64 = str;
                nfcCallbackResponseModel.mNativeBuffers.add(nativeBuffers);
                bVar.mo92214a("nfcFoundDevice", nfcCallbackResponseModel);
            }
        });
    }

    public void handleAPI(NfcRequestModel nfcRequestModel, final AbstractC25897h<NfcResponseModel> hVar, AbstractC25905b bVar, final AbstractC25592a aVar) {
        final String str = nfcRequestModel.mAppIdentify;
        final NfcResponseModel nfcResponseModel = new NfcResponseModel();
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("NfcPlugin", "appid is empty");
            fillFailedResponse(nfcResponseModel, C25906a.f64080j, "appid is empty");
            hVar.callback(nfcResponseModel);
            return;
        }
        final String str2 = nfcRequestModel.mType;
        if (TextUtils.isEmpty(str2)) {
            str2 = getNfcTech();
        }
        if (TextUtils.isEmpty(str2)) {
            Log.m165389i("NfcPlugin", "nfc type is empty");
            fillFailedResponse(nfcResponseModel, C25906a.f64080j, "nfc type is empty");
            hVar.callback(nfcResponseModel);
            return;
        }
        if (this.mNfcManagerService == null) {
            this.mNfcManagerService = new C25598f(bVar);
        }
        this.mNfcManagerService.mo88799a(new Runnable() {
            /* class com.larksuite.component.openplatform.plugins.device.nfc.NfcPlugin.RunnableC255919 */

            public void run() {
                AbstractC25593a aVar = NfcPlugin.this.mNfcManagerService;
                AbstractC25594b a = aVar.mo88796a(str + "_" + str2);
                if (a == null) {
                    Log.m165389i("NfcPlugin", "nfc is null, now create one");
                    a = NfcPlugin.this.mNfcManagerService.mo88797a(str2, str);
                }
                if (a == null) {
                    NfcPlugin.this.fillFailedResponse(nfcResponseModel, C25906a.f64080j, "nfc is null");
                    Log.m165389i("NfcPlugin", "nfc is null");
                    hVar.callback(nfcResponseModel);
                    return;
                }
                aVar.mo88791a(a);
            }
        });
    }
}

package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25912g;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.chooser.C65817a;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.io.C69104g;
import org.json.JSONException;

public class ChooseVideoHandlerPlugin extends OPPlugin {
    public boolean containsAlbum;
    public boolean containsCamera;
    public ILogger mILogger;
    public AbstractC25897h<ChooseVideoHandlerResponse> mInvokeCallback;
    public LKEvent mLKEvent;
    public int maxDuration = 60;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    /* access modifiers changed from: private */
    public static class ChooseVideoHandlerRequest extends C25920a {
        @JSONField(name = "maxDuration")
        public int maxDuration;
        @JSONField(name = "sourceType")
        @LKRequiredParam
        public String[] sourceType;

        private ChooseVideoHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ChooseVideoHandlerResponse extends C25921b {
        @JSONField(name = "duration")
        public long duration;
        @JSONField(name = "height")
        public int height;
        @JSONField(name = "size")
        public long size;
        @JSONField(name = "tempFilePath")
        public String tempFilePath;
        @JSONField(name = "width")
        public int width;

        private ChooseVideoHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mInvokeCallback = null;
        this.mLKEvent = null;
        super.onRelease();
    }

    private void standardInvokeCallback(final String str) {
        final ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.media.ChooseVideoHandlerPlugin.C250194 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                int i;
                int i2;
                try {
                    File file = new File(str);
                    TTFile gVar = TTFile.f171100b;
                    TTFile a = gVar.mo235646a(System.currentTimeMillis() + "." + C69104g.m265935d(file));
                    ((AbstractC67722a) ChooseVideoHandlerPlugin.this.getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235605a(file, a, new TTFileContext(ChooseVideoHandlerPlugin.this.mLKEvent.mo92134c().mo92188a(), ChooseVideoHandlerPlugin.this.mLKEvent.mo92146m()));
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    if (frameAtTime != null) {
                        i = frameAtTime.getWidth();
                        i2 = frameAtTime.getHeight();
                    } else {
                        i2 = 0;
                        i = 0;
                    }
                    try {
                        long parseLong = Long.parseLong(extractMetadata) / 1000;
                        if (parseLong > ((long) ChooseVideoHandlerPlugin.this.maxDuration)) {
                            ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25912g.f64146d, C25912g.f64146d.f64117J);
                            ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                            return;
                        }
                        chooseVideoHandlerResponse.duration = parseLong;
                        chooseVideoHandlerResponse.tempFilePath = a.mo235647a();
                        chooseVideoHandlerResponse.size = file.length();
                        chooseVideoHandlerResponse.width = i;
                        chooseVideoHandlerResponse.height = i2;
                        if (ChooseVideoHandlerPlugin.this.mInvokeCallback != null) {
                            ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                        }
                    } catch (NumberFormatException e) {
                        ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, e.getMessage());
                        ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                        ILogger aVar = ChooseVideoHandlerPlugin.this.mILogger;
                        aVar.mo92224i("ChooseVideoHandlerPlugin", "act exception:" + e);
                    }
                } catch (Exception e2) {
                    ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, e2.getMessage());
                    ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                    ILogger aVar2 = ChooseVideoHandlerPlugin.this.mILogger;
                    aVar2.mo92224i("ChooseVideoHandlerPlugin", "act exception:" + e2);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public String getFileType(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(".")) <= 0 || lastIndexOf >= str.length()) {
            return "";
        }
        return str.substring(lastIndexOf);
    }

    private void initArgs(ChooseVideoHandlerRequest chooseVideoHandlerRequest) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String[] strArr = chooseVideoHandlerRequest.sourceType;
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        this.containsCamera = arrayList.contains("camera");
        this.containsAlbum = arrayList.contains("album");
        int i = chooseVideoHandlerRequest.maxDuration;
        this.maxDuration = i;
        if (i > 180) {
            this.maxDuration = 180;
        }
        if (this.maxDuration <= 0) {
            this.maxDuration = 60;
        }
    }

    private void invokeCallBack(final String str) {
        final ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "videoPath is empty or not exist");
            this.mInvokeCallback.callback(chooseVideoHandlerResponse);
        } else if (TTFileHelper.m264259a("chooseVideo", getAppContext())) {
            standardInvokeCallback(str);
        } else {
            Observable.create(new Action() {
                /* class com.larksuite.component.openplatform.core.plugin.media.ChooseVideoHandlerPlugin.C250183 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    int i;
                    int i2;
                    try {
                        ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
                        File d = ChooseVideoHandlerPlugin.this.getApiDependency().mo235047d();
                        File file = new File(d, System.currentTimeMillis() + ChooseVideoHandlerPlugin.this.getFileType(str));
                        IOUtils.copyFile(new File(str), file, false);
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(str);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                        if (frameAtTime != null) {
                            i = frameAtTime.getWidth();
                            i2 = frameAtTime.getHeight();
                        } else {
                            i2 = 0;
                            i = 0;
                        }
                        try {
                            long parseLong = Long.parseLong(extractMetadata) / 1000;
                            if (parseLong > ((long) ChooseVideoHandlerPlugin.this.maxDuration)) {
                                ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25912g.f64146d, C25912g.f64146d.f64117J);
                                ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                                return;
                            }
                            chooseVideoHandlerResponse.duration = parseLong;
                            chooseVideoHandlerResponse.tempFilePath = ChooseVideoHandlerPlugin.this.getApiDependency().mo235048d(file.getCanonicalPath());
                            chooseVideoHandlerResponse.size = file.length();
                            chooseVideoHandlerResponse.width = i;
                            chooseVideoHandlerResponse.height = i2;
                            if (ChooseVideoHandlerPlugin.this.mInvokeCallback != null) {
                                ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                            }
                        } catch (NumberFormatException e) {
                            ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, e.getMessage());
                            ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                            ILogger aVar = ChooseVideoHandlerPlugin.this.mILogger;
                            aVar.mo92224i("ChooseVideoHandlerPlugin", "act exception:" + e);
                        }
                    } catch (Exception e2) {
                        ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, e2.getMessage());
                        ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                        ILogger aVar2 = ChooseVideoHandlerPlugin.this.mILogger;
                        aVar2.mo92224i("ChooseVideoHandlerPlugin", "act exception:" + e2);
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    public void requestAlbum(final LKEvent lKEvent, AbstractC25895f fVar, final Activity activity) {
        final ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
        getApiDependency().mo235021a(activity, lKEvent.mo92146m(), C66578b.C66579a.m260121f(getAppContext()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.ChooseVideoHandlerPlugin.C250162 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                ChooseVideoHandlerPlugin.this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), "ALBUM permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                ChooseVideoHandlerPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.ChooseVideoHandlerPlugin.C250162.C250171 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        ChooseVideoHandlerPlugin.this.getApiDependency().mo235027a(ChooseVideoHandlerPlugin.this.getAppContext(), ChooseVideoHandlerPlugin.this.maxDuration, ChooseVideoHandlerPlugin.this.containsAlbum, ChooseVideoHandlerPlugin.this.containsCamera, lKEvent.mo92147n().toString());
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        ChooseVideoHandlerPlugin.this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), "ALBUM permission denied");
                        ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64075e, "ALBUM system permission denied");
                        ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                ChooseVideoHandlerPlugin.this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), "ALBUM permission denied");
                ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64076f, "ALBUM auth permission denied");
                ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
            }
        });
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        ILogger aVar = this.mILogger;
        aVar.mo92224i("ChooseVideoHandlerPlugin", "handleActivityResult requestCode:" + i + " resultCode:" + i2);
        ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
        if (i == 4) {
            if (i2 != 19901026 || intent == null) {
                fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "result code error or data is null");
                this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                this.mILogger.mo92224i("ChooseVideoHandlerPlugin", "result code error or data is null");
            } else {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("select_result");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() <= 0) {
                    fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64073c, "selected media is empty");
                    this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                } else {
                    invokeCallBack(((MediaEntity) parcelableArrayListExtra.get(0)).f170268a);
                }
            }
            return true;
        } else if (i == 9) {
            if (i2 == -1) {
                String str = C65817a.f165869a;
                if (TextUtils.isEmpty(str)) {
                    fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "current Camera VideoPath is empty");
                    this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                    this.mILogger.mo92224i("ChooseVideoHandlerPlugin", "currentCamerVideoPath is empty");
                } else if (new File(str).exists()) {
                    invokeCallBack(str);
                } else {
                    fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "file is not exist");
                    this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                    this.mILogger.mo92224i("ChooseVideoHandlerPlugin", ApiCallResultHelper.generateFileNotExistInfo(str));
                }
            } else {
                fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64073c, C25906a.f64073c.f64117J);
                this.mInvokeCallback.callback(chooseVideoHandlerResponse);
            }
            return true;
        } else {
            fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "handle activityResult fail");
            this.mInvokeCallback.callback(chooseVideoHandlerResponse);
            this.mILogger.mo92224i("ChooseVideoHandlerPlugin", ApiCallResultHelper.generateUnknownErrorExtraInfo("handleActivityResult"));
            return false;
        }
    }

    private void requestVideoCap(final LKEvent lKEvent, ChooseVideoHandlerRequest chooseVideoHandlerRequest, final AbstractC25895f fVar, final Activity activity) {
        final ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
        getApiDependency().mo235021a(activity, lKEvent.mo92146m(), C66578b.C66579a.m260120e(getAppContext()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.ChooseVideoHandlerPlugin.C250141 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                ChooseVideoHandlerPlugin.this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), "CAMERA permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.CAMERA");
                ChooseVideoHandlerPlugin.this.getApiDependency().mo235022a(activity, lKEvent.mo92146m(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.ChooseVideoHandlerPlugin.C250141.C250151 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (ChooseVideoHandlerPlugin.this.containsAlbum) {
                            ChooseVideoHandlerPlugin.this.requestAlbum(lKEvent, fVar, activity);
                        } else {
                            ChooseVideoHandlerPlugin.this.getApiDependency().mo235027a(ChooseVideoHandlerPlugin.this.getAppContext(), ChooseVideoHandlerPlugin.this.maxDuration, ChooseVideoHandlerPlugin.this.containsAlbum, ChooseVideoHandlerPlugin.this.containsCamera, lKEvent.mo92147n().toString());
                        }
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        ChooseVideoHandlerPlugin.this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), "CAMERA system permission granted");
                        ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64076f, "CAMERA system permission denied");
                        ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                ChooseVideoHandlerPlugin.this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), "CAMERA permission denied");
                ChooseVideoHandlerPlugin.this.fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64076f, "CAMERA permission denied");
                ChooseVideoHandlerPlugin.this.mInvokeCallback.callback(chooseVideoHandlerResponse);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"chooseVideo"})
    public void chooseVideoHandlerAsync(LKEvent lKEvent, ChooseVideoHandlerRequest chooseVideoHandlerRequest, AbstractC25895f fVar, AbstractC25897h<ChooseVideoHandlerResponse> hVar) {
        this.mInvokeCallback = hVar;
        this.mILogger = fVar.mo92190b();
        this.mLKEvent = lKEvent;
        ChooseVideoHandlerResponse chooseVideoHandlerResponse = new ChooseVideoHandlerResponse();
        if (getAppContext() == null) {
            this.mILogger.mo92223e("ChooseVideoHandlerPlugin", "app context is null");
            fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(chooseVideoHandlerResponse);
            return;
        }
        Activity f = getApiDependency().mo235051f();
        if (f == null) {
            this.mILogger.mo92223e("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), " handleAPI, activity is null");
            fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, "activity is null");
            hVar.callback(chooseVideoHandlerResponse);
            return;
        }
        try {
            initArgs(chooseVideoHandlerRequest);
            this.mILogger.mo92224i("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), ": handleAPI, containsCamera: ", Boolean.valueOf(this.containsCamera), ", containsAlbum: ", Boolean.valueOf(this.containsAlbum));
            if (this.containsCamera) {
                requestVideoCap(lKEvent, chooseVideoHandlerRequest, fVar, f);
            } else if (this.containsAlbum) {
                requestAlbum(lKEvent, fVar, f);
            } else {
                requestVideoCap(lKEvent, chooseVideoHandlerRequest, fVar, f);
            }
        } catch (Exception e) {
            ILogger aVar = this.mILogger;
            aVar.mo92223e("ChooseVideoHandlerPlugin", lKEvent.mo92146m(), " handleAPI init error: " + e.getMessage(), e);
            fillFailedResponse(chooseVideoHandlerResponse, C25906a.f64080j, e.getMessage());
            hVar.callback(chooseVideoHandlerResponse);
        }
    }
}

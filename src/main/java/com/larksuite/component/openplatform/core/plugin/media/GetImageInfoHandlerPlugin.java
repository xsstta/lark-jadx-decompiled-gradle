package com.larksuite.component.openplatform.core.plugin.media;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25912g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.refer.impl.business.file.TTBizError;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileError;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import kotlin.io.C69104g;

public class GetImageInfoHandlerPlugin extends OPPlugin {
    private ILogger mILogger;

    /* access modifiers changed from: private */
    public static class GetImageInfoHandlerRequest extends C25920a {
        @JSONField(name = "src")
        @LKRequiredParam
        public String src;

        private GetImageInfoHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class GetImageInfoHandlerResponse extends C25921b {
        @JSONField(name = "height")
        public int height;
        @JSONField(name = "path")
        public String path;
        @JSONField(name = ShareHitPoint.f121869d)
        public String type;
        @JSONField(name = "width")
        public int width;

        private GetImageInfoHandlerResponse() {
        }
    }

    private GetImageInfoHandlerResponse standardGetImageInfo(LKEvent lKEvent, GetImageInfoHandlerRequest getImageInfoHandlerRequest, ILogger aVar) {
        this.mILogger = aVar;
        String str = getImageInfoHandlerRequest.src;
        ILogger aVar2 = this.mILogger;
        aVar2.mo92224i("GetImageInfoHandlerPlugin", "parseImageInfo:" + str);
        GetImageInfoHandlerResponse getImageInfoHandlerResponse = new GetImageInfoHandlerResponse();
        TTFile gVar = new TTFile(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            byte[] b = ((AbstractC67722a) getAppContext().findServiceByInterface(AbstractC67722a.class)).mo235613b(gVar, new TTFileContext(lKEvent.mo92134c().mo92188a(), lKEvent.mo92146m()));
            if (b == null) {
                this.mILogger.mo92223e("GetImageInfoHandlerPlugin", "data is null");
                C25906a aVar3 = C25906a.f64080j;
                fillFailedResponse(getImageInfoHandlerResponse, aVar3, "data is null, ttfile:" + gVar);
                return getImageInfoHandlerResponse;
            }
            BitmapFactory.decodeByteArray(b, 0, b.length, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    getImageInfoHandlerResponse.width = options.outWidth;
                    getImageInfoHandlerResponse.height = options.outHeight;
                    getImageInfoHandlerResponse.path = gVar.mo235647a();
                    getImageInfoHandlerResponse.type = C69104g.m265935d(new File(gVar.mo235654h()));
                    return getImageInfoHandlerResponse;
                }
            }
            this.mILogger.mo92223e("GetImageInfoHandlerPlugin", "decode image error");
            C25906a aVar4 = C25906a.f64080j;
            fillFailedResponse(getImageInfoHandlerResponse, aVar4, "file cannot decode to image" + gVar);
            return getImageInfoHandlerResponse;
        } catch (TTFileException e) {
            if (e.getTtFileError() == TTBizError.f171093b) {
                ILogger aVar5 = this.mILogger;
                aVar5.mo92224i("GetImageInfoHandlerPlugin", "ttfile invalid, ttfile:" + gVar);
                C25906a aVar6 = C25906a.f64072b;
                fillFailedResponse(getImageInfoHandlerResponse, aVar6, "path is invalid, ttfile:" + gVar);
            } else if (e.getTtFileError() == TTFileError.f171110l) {
                this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "file is not exists");
                C25912g gVar2 = C25912g.f64147e;
                fillFailedResponse(getImageInfoHandlerResponse, gVar2, "file is not exists, ttfile:" + gVar);
            } else if (e.getTtFileError() == TTFileError.f171108j) {
                this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "file is not exists");
                C25906a aVar7 = C25906a.f64080j;
                fillFailedResponse(getImageInfoHandlerResponse, aVar7, "file is not exists, ttfile:" + gVar);
            } else {
                this.mILogger.mo92223e("GetImageInfoHandlerPlugin", "other error", e);
                C25906a aVar8 = C25906a.f64080j;
                fillFailedResponse(getImageInfoHandlerResponse, aVar8, "internal error, ttfile:" + gVar);
            }
            return getImageInfoHandlerResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getImageInfo"})
    public void GetImageInfoHandlerAsync(LKEvent lKEvent, GetImageInfoHandlerRequest getImageInfoHandlerRequest, ILogger aVar, AbstractC25897h<GetImageInfoHandlerResponse> hVar) {
        if (TTFileHelper.m264259a(lKEvent.mo92146m(), getAppContext())) {
            hVar.callback(standardGetImageInfo(lKEvent, getImageInfoHandlerRequest, aVar));
            return;
        }
        this.mILogger = aVar;
        String str = getImageInfoHandlerRequest.src;
        ILogger aVar2 = this.mILogger;
        aVar2.mo92224i("GetImageInfoHandlerPlugin", "parseImageInfo:" + str);
        GetImageInfoHandlerResponse getImageInfoHandlerResponse = new GetImageInfoHandlerResponse();
        if (TextUtils.isEmpty(str)) {
            fillFailedResponse(getImageInfoHandlerResponse, C25906a.f64072b, "path is empty");
            hVar.callback(getImageInfoHandlerResponse);
            return;
        }
        String c = getApiDependency().mo235044c(str);
        TTAPkgFile findFile = StreamLoader.findFile(c, getAppContext());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (findFile != null) {
            this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "ttaPkgFile != null");
            byte[] loadByteFromStream = StreamLoader.loadByteFromStream(c, getAppContext());
            if (loadByteFromStream == null) {
                this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "loadByteFromStream bytes = null");
                fillFailedResponse(getImageInfoHandlerResponse, C25912g.f64147e, "loadByteFromStream bytes = null");
                hVar.callback(getImageInfoHandlerResponse);
                return;
            }
            BitmapFactory.decodeByteArray(loadByteFromStream, 0, loadByteFromStream.length, options);
        } else {
            this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "ttaPkgFile = null");
            File file = new File(c);
            if (!file.exists()) {
                this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "file is not exists");
                fillFailedResponse(getImageInfoHandlerResponse, C25912g.f64147e, "file is not exists");
                hVar.callback(getImageInfoHandlerResponse);
                return;
            } else if (!getApiDependency().mo235035a(file)) {
                this.mILogger.mo92224i("GetImageInfoHandlerPlugin", "file can not read");
                fillFailedResponse(getImageInfoHandlerResponse, C25906a.f64080j, "file can not read");
                hVar.callback(getImageInfoHandlerResponse);
                return;
            } else {
                BitmapFactory.decodeFile(c, options);
            }
        }
        getImageInfoHandlerResponse.width = options.outWidth;
        getImageInfoHandlerResponse.height = options.outHeight;
        getImageInfoHandlerResponse.path = getApiDependency().mo235048d(c);
        int lastIndexOf = c.lastIndexOf(46);
        if (lastIndexOf <= -1 || lastIndexOf >= c.length() - 1) {
            getImageInfoHandlerResponse.type = "";
        } else {
            getImageInfoHandlerResponse.type = c.substring(lastIndexOf + 1);
        }
        hVar.callback(getImageInfoHandlerResponse);
    }
}

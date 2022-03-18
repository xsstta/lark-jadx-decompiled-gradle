package com.larksuite.component.openplatform.core.plugin.media;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"getImageInfo"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.d */
public class C25040d extends AbstractC65797c {

    /* renamed from: com.larksuite.component.openplatform.core.plugin.media.d$a */
    public static class C25041a {

        /* renamed from: a */
        public int f61174a;

        /* renamed from: b */
        public int f61175b;

        /* renamed from: c */
        public String f61176c;

        /* renamed from: d */
        public String f61177d;
    }

    public C25040d() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getImageInfo");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        String str = (String) this.f165820j.mo234984a("src");
        AppBrandLogger.m52830i("GetImageInfoHandler", "parseImageInfo:" + str);
        if (TextUtils.isEmpty(str)) {
            mo230481a(ApiCode.GETIMAGEINFO_INVALID_SRC);
            return;
        }
        String c = mo230475h().mo235044c(str);
        TTAPkgFile findFile = StreamLoader.findFile(c, mo230473f());
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (findFile != null) {
            byte[] loadByteFromStream = StreamLoader.loadByteFromStream(c, mo230473f());
            if (loadByteFromStream == null) {
                AppBrandLogger.m52830i("GetImageInfoHandler", "loadByteFromStream bytes = null");
                mo230481a(ApiCode.GETIMAGEINFO_FILE_NOT_EXIST);
                return;
            }
            BitmapFactory.decodeByteArray(loadByteFromStream, 0, loadByteFromStream.length, options);
        } else {
            File file = new File(c);
            if (!file.exists()) {
                AppBrandLogger.m52830i("GetImageInfoHandler", "file is not exists");
                mo230481a(ApiCode.GETIMAGEINFO_FILE_NOT_EXIST);
                return;
            } else if (!mo230475h().mo235035a(file)) {
                AppBrandLogger.m52830i("GetImageInfoHandler", "file can not read");
                mo230481a(ApiCode.GENERAL_FILE_CAN_NOT_READ);
                return;
            } else {
                BitmapFactory.decodeFile(c, options);
            }
        }
        C25041a aVar = new C25041a();
        aVar.f61174a = options.outWidth;
        aVar.f61175b = options.outHeight;
        aVar.f61176c = mo230475h().mo235048d(c);
        int lastIndexOf = c.lastIndexOf(46);
        if (lastIndexOf <= -1 || lastIndexOf >= c.length() - 1) {
            aVar.f61177d = "";
        } else {
            aVar.f61177d = c.substring(lastIndexOf + 1);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", aVar.f61174a);
            jSONObject.put("height", aVar.f61175b);
            jSONObject.put("path", aVar.f61176c);
            jSONObject.put(ShareHitPoint.f121869d, aVar.f61177d);
        } catch (JSONException e) {
            AppBrandLogger.m52830i("GetImageInfoHandler", "build resp exception:" + e);
        }
        mo230492b(jSONObject);
    }

    public C25040d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}

package com.bytedance.ee.bear.document.offline.file.paste;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.offline.file.FileResultModel;
import com.bytedance.ee.bear.document.offline.file.paste.PasteFileHelper;
import com.bytedance.ee.bear.document.offline.file.upload.FileUploadModel;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PasteFileHelper {

    /* renamed from: a */
    private NetService f16645a;

    /* renamed from: b */
    private ConnectionService f16646b;

    /* access modifiers changed from: private */
    public static class InnerData implements NonProguard {
        private Map<String, String> token;

        private InnerData() {
        }

        public Map<String, String> getToken() {
            return this.token;
        }

        public void setToken(Map<String, String> map) {
            this.token = map;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.file.paste.PasteFileHelper$a */
    public static class C5940a implements NetService.AbstractC5074c<C5941b> {
        private C5940a() {
        }

        /* renamed from: a */
        public C5941b parse(String str) throws NetService.ParseException {
            return (C5941b) JSON.parseObject(str, C5941b.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.offline.file.paste.PasteFileHelper$b */
    public static class C5941b extends NetService.Result<InnerData> {
        private C5941b() {
        }
    }

    public static class CopyFileException extends Exception {
        public CopyFileException(String str) {
            super(str);
        }
    }

    /* renamed from: b */
    private String m23943b(FileUploadModel fileUploadModel) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_type", (Object) Integer.valueOf(fileUploadModel.getObjType()));
        jSONObject.put("obj_token", (Object) fileUploadModel.getToken());
        if (fileUploadModel.getToken() != null && fileUploadModel.getToken().contains("fake")) {
            C13479a.m54758a("PasteFileHelper", "fake token !!! = " + fileUploadModel.getToken());
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(fileUploadModel.getDriveToken());
        if (!TextUtils.isEmpty(fileUploadModel.getPencilKitToken())) {
            jSONArray.add(fileUploadModel.getPencilKitToken());
        }
        jSONObject2.put("files", (Object) jSONArray);
        jSONObject2.put("dest", (Object) jSONObject);
        return jSONObject2.toJSONString();
    }

    /* renamed from: a */
    public AbstractC68307f<FileResultModel> mo23975a(FileUploadModel fileUploadModel) {
        if (fileUploadModel == null || this.f16646b.mo20038b() == null || !this.f16646b.mo20038b().mo20041b()) {
            return AbstractC68307f.m265083a(new FileResultModel());
        }
        NetService.C5077f fVar = new NetService.C5077f("/api/image/copy_to.v3/");
        fVar.mo20143a(1);
        fVar.mo20153c(m23943b(fileUploadModel));
        return this.f16645a.mo20117a(new C5940a()).mo20141a(fVar).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.offline.file.paste.$$Lambda$PasteFileHelper$ZJuC6BhHiKK9zepXMC5GRapznY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PasteFileHelper.m269261lambda$ZJuC6BhHiKK9zepXMC5GRapznY(FileUploadModel.this, (PasteFileHelper.C5941b) obj);
            }
        }).mo237985a(C11678b.m48478b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.offline.file.paste.$$Lambda$PasteFileHelper$XhuCnFGLQyd9msGeJb3iiI9YNzo */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PasteFileHelper.lambda$XhuCnFGLQyd9msGeJb3iiI9YNzo(FileUploadModel.this, (List) obj);
            }
        });
    }

    public PasteFileHelper(NetService netService, ConnectionService connectionService) {
        this.f16645a = netService;
        this.f16646b = connectionService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ FileResultModel m23941a(FileUploadModel fileUploadModel, List list) throws Exception {
        String str = (String) list.get(0);
        FileResultModel fileResultModel = new FileResultModel();
        fileResultModel.setData(new FileResultModel.Data(str, str, fileUploadModel.getUploadType()));
        if (list.size() > 1) {
            fileResultModel.getData().setPencilKitToken((String) list.get(1));
        }
        fileResultModel.setCode(0);
        fileResultModel.setUuid(fileUploadModel.fetchFirstUuid());
        return fileResultModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m23942a(FileUploadModel fileUploadModel, C5941b bVar) throws Exception {
        String str;
        Map<String, String> token;
        String str2;
        if (bVar.code == 0) {
            ArrayList arrayList = new ArrayList();
            String driveToken = fileUploadModel.getDriveToken();
            String pencilKitToken = fileUploadModel.getPencilKitToken();
            String str3 = "";
            if (bVar.getData() == null || (token = ((InnerData) bVar.getData()).getToken()) == null) {
                str = str3;
            } else {
                if (TextUtils.isEmpty(driveToken) || !token.containsKey(driveToken)) {
                    str2 = str3;
                } else {
                    str2 = token.get(driveToken);
                }
                if (!TextUtils.isEmpty(pencilKitToken) && token.containsKey(pencilKitToken)) {
                    str3 = token.get(pencilKitToken);
                }
                str = str3;
                str3 = str2;
            }
            if (TextUtils.isEmpty(str3)) {
                throw new CopyFileException("copy result empty driveToken!");
            } else if (TextUtils.isEmpty(pencilKitToken) || !TextUtils.isEmpty(str)) {
                arrayList.add(str3);
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
                return arrayList;
            } else {
                throw new CopyFileException("copy result empty pencilKitToken!");
            }
        } else {
            throw new CopyFileException("code = " + bVar.code + ", msg = " + bVar.msg);
        }
    }
}

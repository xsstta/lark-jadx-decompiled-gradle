package com.bytedance.ee.bear.document.offline.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import java.io.Serializable;

public class OfflineTransferModel implements Serializable {
    private Object data;
    private int dataType;
    private String key;
    private boolean needSync;
    private String objToken;
    private int type;
    private String uri;

    public int getDataType() {
        return this.dataType;
    }

    public String getKey() {
        return this.key;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public int getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isNeedSync() {
        return this.needSync;
    }

    public String getData() {
        Object obj = this.data;
        if (obj instanceof JSONObject) {
            return JSONObject.toJSONString(obj, SerializerFeature.WriteMapNullValue);
        } else if (obj == null) {
            return null;
        } else {
            C13479a.m54764b("OfflineTransferModel", obj.getClass().getSimpleName());
            return this.data.toString();
        }
    }

    public C5968f parseResourceData() {
        C5968f fVar = new C5968f();
        fVar.mo24128a(this.key);
        fVar.mo24129a(this.needSync);
        fVar.mo24138d(getData());
        fVar.mo24136c(this.objToken);
        fVar.mo24146h(this.uri);
        fVar.mo24127a(Long.valueOf(System.currentTimeMillis()));
        fVar.mo24135c(this.dataType);
        if (!(this.type == C8275a.f22369b.mo32555b() || this.type == C8275a.f22370c.mo32555b())) {
            fVar.mo24133b(C8275a.m34050a(this.type));
        }
        return fVar;
    }

    public String toString() {
        return "OfflineTransferModel{key='" + this.key + '\'' + ", data='" + this.data + '\'' + ", needSync=" + this.needSync + ", objToken='" + this.objToken + '\'' + ", uri='" + this.uri + '\'' + ", dataType='" + this.dataType + '\'' + ", type='" + this.type + '\'' + '}';
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setNeedSync(boolean z) {
        this.needSync = z;
    }

    public void setObjToken(String str) {
        this.objToken = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUri(String str) {
        this.uri = str;
    }
}

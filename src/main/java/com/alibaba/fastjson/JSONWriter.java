package com.alibaba.fastjson;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class JSONWriter implements Closeable, Flushable {
    private JSONStreamContext context;
    private JSONSerializer serializer;
    private SerializeWriter writer;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.writer.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    public void endArray() {
        this.writer.write(93);
        endStructure();
    }

    public void endObject() {
        this.writer.write(SmActions.ACTION_RINGING_ENTRY);
        endStructure();
    }

    public void startArray() {
        if (this.context != null) {
            beginStructure();
        }
        this.context = new JSONStreamContext(this.context, 1004);
        this.writer.write(91);
    }

    public void startObject() {
        if (this.context != null) {
            beginStructure();
        }
        this.context = new JSONStreamContext(this.context, CommonCode.StatusCode.API_CLIENT_EXPIRED);
        this.writer.write(SmActions.ACTION_CALLING_ENTRY);
    }

    private void afterWriter() {
        int i;
        JSONStreamContext jSONStreamContext = this.context;
        if (jSONStreamContext != null) {
            switch (jSONStreamContext.state) {
                case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                case 1003:
                    i = 1002;
                    break;
                case 1002:
                    i = 1003;
                    break;
                case 1004:
                    i = 1005;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i != -1) {
                this.context.state = i;
            }
        }
    }

    private void beforeWrite() {
        JSONStreamContext jSONStreamContext = this.context;
        if (jSONStreamContext != null) {
            int i = jSONStreamContext.state;
            if (i == 1002) {
                this.writer.write(58);
            } else if (i == 1003) {
                this.writer.write(44);
            } else if (i == 1005) {
                this.writer.write(44);
            }
        }
    }

    private void beginStructure() {
        int i = this.context.state;
        switch (this.context.state) {
            case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
            case 1004:
                return;
            case 1002:
                this.writer.write(58);
                return;
            case 1003:
            default:
                throw new JSONException("illegal state : " + i);
            case 1005:
                this.writer.write(44);
                return;
        }
    }

    private void endStructure() {
        JSONStreamContext jSONStreamContext = this.context.parent;
        this.context = jSONStreamContext;
        if (jSONStreamContext != null) {
            int i = jSONStreamContext.state;
            int i2 = 1002;
            if (i != 1001) {
                if (i == 1002) {
                    i2 = 1003;
                } else if (i != 1004) {
                    i2 = -1;
                } else {
                    i2 = 1005;
                }
            }
            if (i2 != -1) {
                this.context.state = i2;
            }
        }
    }

    public void writeKey(String str) {
        writeObject(str);
    }

    public void writeValue(Object obj) {
        writeObject(obj);
    }

    public void writeObject(Object obj) {
        beforeWrite();
        this.serializer.write(obj);
        afterWriter();
    }

    public JSONWriter(Writer writer2) {
        SerializeWriter serializeWriter = new SerializeWriter(writer2);
        this.writer = serializeWriter;
        this.serializer = new JSONSerializer(serializeWriter);
    }

    public void writeObject(String str) {
        beforeWrite();
        this.serializer.write(str);
        afterWriter();
    }

    public void config(SerializerFeature serializerFeature, boolean z) {
        this.writer.config(serializerFeature, z);
    }
}

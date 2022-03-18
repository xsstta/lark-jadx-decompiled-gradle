package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoSettingResponse extends Message<GetTodoSettingResponse, C19561a> {
    public static final ProtoAdapter<GetTodoSettingResponse> ADAPTER = new C19562b();
    private static final long serialVersionUID = 0;
    public final TodoSetting setting;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoSettingResponse$b */
    private static final class C19562b extends ProtoAdapter<GetTodoSettingResponse> {
        C19562b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoSettingResponse getTodoSettingResponse) {
            int i;
            if (getTodoSettingResponse.setting != null) {
                i = TodoSetting.ADAPTER.encodedSizeWithTag(1, getTodoSettingResponse.setting);
            } else {
                i = 0;
            }
            return i + getTodoSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoSettingResponse decode(ProtoReader protoReader) throws IOException {
            C19561a aVar = new C19561a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47910a = TodoSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoSettingResponse getTodoSettingResponse) throws IOException {
            if (getTodoSettingResponse.setting != null) {
                TodoSetting.ADAPTER.encodeWithTag(protoWriter, 1, getTodoSettingResponse.setting);
            }
            protoWriter.writeBytes(getTodoSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoSettingResponse$a */
    public static final class C19561a extends Message.Builder<GetTodoSettingResponse, C19561a> {

        /* renamed from: a */
        public TodoSetting f47910a;

        /* renamed from: a */
        public GetTodoSettingResponse build() {
            return new GetTodoSettingResponse(this.f47910a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19561a newBuilder() {
        C19561a aVar = new C19561a();
        aVar.f47910a = this.setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.setting != null) {
            sb.append(", setting=");
            sb.append(this.setting);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoSettingResponse(TodoSetting todoSetting) {
        this(todoSetting, ByteString.EMPTY);
    }

    public GetTodoSettingResponse(TodoSetting todoSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = todoSetting;
    }
}

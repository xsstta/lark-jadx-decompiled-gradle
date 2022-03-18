package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoRequest extends Message<GetTodoRequest, C19555a> {
    public static final ProtoAdapter<GetTodoRequest> ADAPTER = new C19556b();
    private static final long serialVersionUID = 0;
    public final String guid;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoRequest$b */
    private static final class C19556b extends ProtoAdapter<GetTodoRequest> {
        C19556b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoRequest getTodoRequest) {
            int i;
            if (getTodoRequest.guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getTodoRequest.guid);
            } else {
                i = 0;
            }
            return i + getTodoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoRequest decode(ProtoReader protoReader) throws IOException {
            C19555a aVar = new C19555a();
            aVar.f47907a = "";
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
                    aVar.f47907a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTodoRequest getTodoRequest) throws IOException {
            if (getTodoRequest.guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTodoRequest.guid);
            }
            protoWriter.writeBytes(getTodoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoRequest$a */
    public static final class C19555a extends Message.Builder<GetTodoRequest, C19555a> {

        /* renamed from: a */
        public String f47907a;

        /* renamed from: a */
        public GetTodoRequest build() {
            return new GetTodoRequest(this.f47907a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19555a mo66429a(String str) {
            this.f47907a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19555a newBuilder() {
        C19555a aVar = new C19555a();
        aVar.f47907a = this.guid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.guid != null) {
            sb.append(", guid=");
            sb.append(this.guid);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTodoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetTodoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.guid = str;
    }
}

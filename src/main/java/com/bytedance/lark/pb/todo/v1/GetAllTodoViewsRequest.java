package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllTodoViewsRequest extends Message<GetAllTodoViewsRequest, C19505a> {
    public static final ProtoAdapter<GetAllTodoViewsRequest> ADAPTER = new C19506b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetAllTodoViewsRequest$b */
    private static final class C19506b extends ProtoAdapter<GetAllTodoViewsRequest> {
        C19506b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllTodoViewsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllTodoViewsRequest getAllTodoViewsRequest) {
            return getAllTodoViewsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllTodoViewsRequest decode(ProtoReader protoReader) throws IOException {
            C19505a aVar = new C19505a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllTodoViewsRequest getAllTodoViewsRequest) throws IOException {
            protoWriter.writeBytes(getAllTodoViewsRequest.unknownFields());
        }
    }

    public GetAllTodoViewsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetAllTodoViewsRequest$a */
    public static final class C19505a extends Message.Builder<GetAllTodoViewsRequest, C19505a> {
        /* renamed from: a */
        public GetAllTodoViewsRequest build() {
            return new GetAllTodoViewsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19505a newBuilder() {
        C19505a aVar = new C19505a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetAllTodoViewsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAllTodoViewsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllTodoViewsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTodoBadgeRequest extends Message<GetTodoBadgeRequest, C19539a> {
    public static final ProtoAdapter<GetTodoBadgeRequest> ADAPTER = new C19540b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoBadgeRequest$b */
    private static final class C19540b extends ProtoAdapter<GetTodoBadgeRequest> {
        C19540b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTodoBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTodoBadgeRequest getTodoBadgeRequest) {
            return getTodoBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTodoBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C19539a aVar = new C19539a();
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
        public void encode(ProtoWriter protoWriter, GetTodoBadgeRequest getTodoBadgeRequest) throws IOException {
            protoWriter.writeBytes(getTodoBadgeRequest.unknownFields());
        }
    }

    public GetTodoBadgeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetTodoBadgeRequest$a */
    public static final class C19539a extends Message.Builder<GetTodoBadgeRequest, C19539a> {
        /* renamed from: a */
        public GetTodoBadgeRequest build() {
            return new GetTodoBadgeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19539a newBuilder() {
        C19539a aVar = new C19539a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetTodoBadgeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetTodoBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTodoBadgeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

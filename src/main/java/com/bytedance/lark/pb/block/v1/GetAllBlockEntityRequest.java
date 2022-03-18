package com.bytedance.lark.pb.block.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllBlockEntityRequest extends Message<GetAllBlockEntityRequest, C15474a> {
    public static final ProtoAdapter<GetAllBlockEntityRequest> ADAPTER = new C15475b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.block.v1.GetAllBlockEntityRequest$b */
    private static final class C15475b extends ProtoAdapter<GetAllBlockEntityRequest> {
        C15475b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllBlockEntityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllBlockEntityRequest getAllBlockEntityRequest) {
            return getAllBlockEntityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllBlockEntityRequest decode(ProtoReader protoReader) throws IOException {
            C15474a aVar = new C15474a();
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
        public void encode(ProtoWriter protoWriter, GetAllBlockEntityRequest getAllBlockEntityRequest) throws IOException {
            protoWriter.writeBytes(getAllBlockEntityRequest.unknownFields());
        }
    }

    public GetAllBlockEntityRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.block.v1.GetAllBlockEntityRequest$a */
    public static final class C15474a extends Message.Builder<GetAllBlockEntityRequest, C15474a> {
        /* renamed from: a */
        public GetAllBlockEntityRequest build() {
            return new GetAllBlockEntityRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15474a newBuilder() {
        C15474a aVar = new C15474a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("block", "GetAllBlockEntityRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAllBlockEntityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllBlockEntityRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

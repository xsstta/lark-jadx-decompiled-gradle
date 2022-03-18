package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllDraftsRequest extends Message<GetAllDraftsRequest, C17466a> {
    public static final ProtoAdapter<GetAllDraftsRequest> ADAPTER = new C17467b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAllDraftsRequest$b */
    private static final class C17467b extends ProtoAdapter<GetAllDraftsRequest> {
        C17467b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllDraftsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllDraftsRequest getAllDraftsRequest) {
            return getAllDraftsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllDraftsRequest decode(ProtoReader protoReader) throws IOException {
            C17466a aVar = new C17466a();
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
        public void encode(ProtoWriter protoWriter, GetAllDraftsRequest getAllDraftsRequest) throws IOException {
            protoWriter.writeBytes(getAllDraftsRequest.unknownFields());
        }
    }

    public GetAllDraftsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAllDraftsRequest$a */
    public static final class C17466a extends Message.Builder<GetAllDraftsRequest, C17466a> {
        /* renamed from: a */
        public GetAllDraftsRequest build() {
            return new GetAllDraftsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17466a newBuilder() {
        C17466a aVar = new C17466a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAllDraftsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAllDraftsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllDraftsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

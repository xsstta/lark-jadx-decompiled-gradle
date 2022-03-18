package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllBadgeRequest extends Message<GetAllBadgeRequest, C17144a> {
    public static final ProtoAdapter<GetAllBadgeRequest> ADAPTER = new C17145b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetAllBadgeRequest$b */
    private static final class C17145b extends ProtoAdapter<GetAllBadgeRequest> {
        C17145b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllBadgeRequest getAllBadgeRequest) {
            return getAllBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C17144a aVar = new C17144a();
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
        public void encode(ProtoWriter protoWriter, GetAllBadgeRequest getAllBadgeRequest) throws IOException {
            protoWriter.writeBytes(getAllBadgeRequest.unknownFields());
        }
    }

    public GetAllBadgeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetAllBadgeRequest$a */
    public static final class C17144a extends Message.Builder<GetAllBadgeRequest, C17144a> {
        /* renamed from: a */
        public GetAllBadgeRequest build() {
            return new GetAllBadgeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17144a newBuilder() {
        C17144a aVar = new C17144a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetAllBadgeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAllBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllBadgeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

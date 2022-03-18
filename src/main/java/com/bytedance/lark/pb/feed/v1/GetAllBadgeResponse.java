package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllBadgeResponse extends Message<GetAllBadgeResponse, C17146a> {
    public static final ProtoAdapter<GetAllBadgeResponse> ADAPTER = new C17147b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetAllBadgeResponse$b */
    private static final class C17147b extends ProtoAdapter<GetAllBadgeResponse> {
        C17147b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllBadgeResponse getAllBadgeResponse) {
            return getAllBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C17146a aVar = new C17146a();
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
        public void encode(ProtoWriter protoWriter, GetAllBadgeResponse getAllBadgeResponse) throws IOException {
            protoWriter.writeBytes(getAllBadgeResponse.unknownFields());
        }
    }

    public GetAllBadgeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetAllBadgeResponse$a */
    public static final class C17146a extends Message.Builder<GetAllBadgeResponse, C17146a> {
        /* renamed from: a */
        public GetAllBadgeResponse build() {
            return new GetAllBadgeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17146a newBuilder() {
        C17146a aVar = new C17146a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetAllBadgeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetAllBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllBadgeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

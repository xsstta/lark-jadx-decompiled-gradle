package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetDelayedCardsRequest extends Message<GetDelayedCardsRequest, C17148a> {
    public static final ProtoAdapter<GetDelayedCardsRequest> ADAPTER = new C17149b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetDelayedCardsRequest$b */
    private static final class C17149b extends ProtoAdapter<GetDelayedCardsRequest> {
        C17149b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDelayedCardsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDelayedCardsRequest getDelayedCardsRequest) {
            return getDelayedCardsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetDelayedCardsRequest decode(ProtoReader protoReader) throws IOException {
            C17148a aVar = new C17148a();
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
        public void encode(ProtoWriter protoWriter, GetDelayedCardsRequest getDelayedCardsRequest) throws IOException {
            protoWriter.writeBytes(getDelayedCardsRequest.unknownFields());
        }
    }

    public GetDelayedCardsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetDelayedCardsRequest$a */
    public static final class C17148a extends Message.Builder<GetDelayedCardsRequest, C17148a> {
        /* renamed from: a */
        public GetDelayedCardsRequest build() {
            return new GetDelayedCardsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17148a newBuilder() {
        C17148a aVar = new C17148a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetDelayedCardsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetDelayedCardsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetDelayedCardsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

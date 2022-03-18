package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutStickerSetsResponse extends Message<PutStickerSetsResponse, C17981a> {
    public static final ProtoAdapter<PutStickerSetsResponse> ADAPTER = new C17982b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutStickerSetsResponse$b */
    private static final class C17982b extends ProtoAdapter<PutStickerSetsResponse> {
        C17982b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutStickerSetsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutStickerSetsResponse putStickerSetsResponse) {
            return putStickerSetsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutStickerSetsResponse decode(ProtoReader protoReader) throws IOException {
            C17981a aVar = new C17981a();
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
        public void encode(ProtoWriter protoWriter, PutStickerSetsResponse putStickerSetsResponse) throws IOException {
            protoWriter.writeBytes(putStickerSetsResponse.unknownFields());
        }
    }

    public PutStickerSetsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutStickerSetsResponse$a */
    public static final class C17981a extends Message.Builder<PutStickerSetsResponse, C17981a> {
        /* renamed from: a */
        public PutStickerSetsResponse build() {
            return new PutStickerSetsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17981a newBuilder() {
        C17981a aVar = new C17981a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutStickerSetsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutStickerSetsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutStickerSetsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

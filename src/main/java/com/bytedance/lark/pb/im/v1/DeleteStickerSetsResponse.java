package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteStickerSetsResponse extends Message<DeleteStickerSetsResponse, C17428a> {
    public static final ProtoAdapter<DeleteStickerSetsResponse> ADAPTER = new C17429b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteStickerSetsResponse$b */
    private static final class C17429b extends ProtoAdapter<DeleteStickerSetsResponse> {
        C17429b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStickerSetsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteStickerSetsResponse deleteStickerSetsResponse) {
            return deleteStickerSetsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteStickerSetsResponse decode(ProtoReader protoReader) throws IOException {
            C17428a aVar = new C17428a();
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
        public void encode(ProtoWriter protoWriter, DeleteStickerSetsResponse deleteStickerSetsResponse) throws IOException {
            protoWriter.writeBytes(deleteStickerSetsResponse.unknownFields());
        }
    }

    public DeleteStickerSetsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteStickerSetsResponse$a */
    public static final class C17428a extends Message.Builder<DeleteStickerSetsResponse, C17428a> {
        /* renamed from: a */
        public DeleteStickerSetsResponse build() {
            return new DeleteStickerSetsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17428a newBuilder() {
        C17428a aVar = new C17428a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteStickerSetsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteStickerSetsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteStickerSetsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

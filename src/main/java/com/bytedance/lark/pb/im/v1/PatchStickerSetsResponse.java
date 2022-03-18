package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchStickerSetsResponse extends Message<PatchStickerSetsResponse, C17839a> {
    public static final ProtoAdapter<PatchStickerSetsResponse> ADAPTER = new C17840b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchStickerSetsResponse$b */
    private static final class C17840b extends ProtoAdapter<PatchStickerSetsResponse> {
        C17840b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchStickerSetsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchStickerSetsResponse patchStickerSetsResponse) {
            return patchStickerSetsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchStickerSetsResponse decode(ProtoReader protoReader) throws IOException {
            C17839a aVar = new C17839a();
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
        public void encode(ProtoWriter protoWriter, PatchStickerSetsResponse patchStickerSetsResponse) throws IOException {
            protoWriter.writeBytes(patchStickerSetsResponse.unknownFields());
        }
    }

    public PatchStickerSetsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchStickerSetsResponse$a */
    public static final class C17839a extends Message.Builder<PatchStickerSetsResponse, C17839a> {
        /* renamed from: a */
        public PatchStickerSetsResponse build() {
            return new PatchStickerSetsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17839a newBuilder() {
        C17839a aVar = new C17839a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchStickerSetsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PatchStickerSetsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchStickerSetsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

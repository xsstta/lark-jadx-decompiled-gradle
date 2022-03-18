package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PutStickerSetsRequest extends Message<PutStickerSetsRequest, C17979a> {
    public static final ProtoAdapter<PutStickerSetsRequest> ADAPTER = new C17980b();
    private static final long serialVersionUID = 0;
    public final List<String> sticker_set_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.PutStickerSetsRequest$b */
    private static final class C17980b extends ProtoAdapter<PutStickerSetsRequest> {
        C17980b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutStickerSetsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutStickerSetsRequest putStickerSetsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, putStickerSetsRequest.sticker_set_ids) + putStickerSetsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutStickerSetsRequest decode(ProtoReader protoReader) throws IOException {
            C17979a aVar = new C17979a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45077a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutStickerSetsRequest putStickerSetsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, putStickerSetsRequest.sticker_set_ids);
            protoWriter.writeBytes(putStickerSetsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PutStickerSetsRequest$a */
    public static final class C17979a extends Message.Builder<PutStickerSetsRequest, C17979a> {

        /* renamed from: a */
        public List<String> f45077a = Internal.newMutableList();

        /* renamed from: a */
        public PutStickerSetsRequest build() {
            return new PutStickerSetsRequest(this.f45077a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17979a mo62482a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45077a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17979a newBuilder() {
        C17979a aVar = new C17979a();
        aVar.f45077a = Internal.copyOf("sticker_set_ids", this.sticker_set_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PutStickerSetsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_set_ids.isEmpty()) {
            sb.append(", sticker_set_ids=");
            sb.append(this.sticker_set_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PutStickerSetsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutStickerSetsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PutStickerSetsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_set_ids = Internal.immutableCopyOf("sticker_set_ids", list);
    }
}

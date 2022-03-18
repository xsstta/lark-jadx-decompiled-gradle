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

public final class GetStickerSetsResponse extends Message<GetStickerSetsResponse, C17687a> {
    public static final ProtoAdapter<GetStickerSetsResponse> ADAPTER = new C17688b();
    private static final long serialVersionUID = 0;
    public final List<StickerSet> sticker_sets;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsResponse$b */
    private static final class C17688b extends ProtoAdapter<GetStickerSetsResponse> {
        C17688b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetsResponse getStickerSetsResponse) {
            return StickerSet.ADAPTER.asRepeated().encodedSizeWithTag(1, getStickerSetsResponse.sticker_sets) + getStickerSetsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetsResponse decode(ProtoReader protoReader) throws IOException {
            C17687a aVar = new C17687a();
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
                    aVar.f44705a.add(StickerSet.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetsResponse getStickerSetsResponse) throws IOException {
            StickerSet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getStickerSetsResponse.sticker_sets);
            protoWriter.writeBytes(getStickerSetsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsResponse$a */
    public static final class C17687a extends Message.Builder<GetStickerSetsResponse, C17687a> {

        /* renamed from: a */
        public List<StickerSet> f44705a = Internal.newMutableList();

        /* renamed from: a */
        public GetStickerSetsResponse build() {
            return new GetStickerSetsResponse(this.f44705a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17687a newBuilder() {
        C17687a aVar = new C17687a();
        aVar.f44705a = Internal.copyOf("sticker_sets", this.sticker_sets);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetStickerSetsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_sets.isEmpty()) {
            sb.append(", sticker_sets=");
            sb.append(this.sticker_sets);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetsResponse(List<StickerSet> list) {
        this(list, ByteString.EMPTY);
    }

    public GetStickerSetsResponse(List<StickerSet> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_sets = Internal.immutableCopyOf("sticker_sets", list);
    }
}

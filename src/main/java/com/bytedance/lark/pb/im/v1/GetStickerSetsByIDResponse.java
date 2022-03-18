package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetStickerSetsByIDResponse extends Message<GetStickerSetsByIDResponse, C17683a> {
    public static final ProtoAdapter<GetStickerSetsByIDResponse> ADAPTER = new C17684b();
    private static final long serialVersionUID = 0;
    public final Map<String, StickerSet> sticker_sets;
    public final Map<String, Boolean> visibility;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsByIDResponse$a */
    public static final class C17683a extends Message.Builder<GetStickerSetsByIDResponse, C17683a> {

        /* renamed from: a */
        public Map<String, StickerSet> f44700a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Boolean> f44701b = Internal.newMutableMap();

        /* renamed from: a */
        public GetStickerSetsByIDResponse build() {
            return new GetStickerSetsByIDResponse(this.f44700a, this.f44701b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsByIDResponse$b */
    private static final class C17684b extends ProtoAdapter<GetStickerSetsByIDResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, StickerSet>> f44702a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, StickerSet.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Boolean>> f44703b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C17684b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetsByIDResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetsByIDResponse getStickerSetsByIDResponse) {
            return this.f44702a.encodedSizeWithTag(1, getStickerSetsByIDResponse.sticker_sets) + this.f44703b.encodedSizeWithTag(2, getStickerSetsByIDResponse.visibility) + getStickerSetsByIDResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetsByIDResponse decode(ProtoReader protoReader) throws IOException {
            C17683a aVar = new C17683a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44700a.putAll(this.f44702a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44701b.putAll(this.f44703b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetsByIDResponse getStickerSetsByIDResponse) throws IOException {
            this.f44702a.encodeWithTag(protoWriter, 1, getStickerSetsByIDResponse.sticker_sets);
            this.f44703b.encodeWithTag(protoWriter, 2, getStickerSetsByIDResponse.visibility);
            protoWriter.writeBytes(getStickerSetsByIDResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17683a newBuilder() {
        C17683a aVar = new C17683a();
        aVar.f44700a = Internal.copyOf("sticker_sets", this.sticker_sets);
        aVar.f44701b = Internal.copyOf("visibility", this.visibility);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetStickerSetsByIDResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_sets.isEmpty()) {
            sb.append(", sticker_sets=");
            sb.append(this.sticker_sets);
        }
        if (!this.visibility.isEmpty()) {
            sb.append(", visibility=");
            sb.append(this.visibility);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetsByIDResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetsByIDResponse(Map<String, StickerSet> map, Map<String, Boolean> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public GetStickerSetsByIDResponse(Map<String, StickerSet> map, Map<String, Boolean> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_sets = Internal.immutableCopyOf("sticker_sets", map);
        this.visibility = Internal.immutableCopyOf("visibility", map2);
    }
}

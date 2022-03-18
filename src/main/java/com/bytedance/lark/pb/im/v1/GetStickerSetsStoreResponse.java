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

public final class GetStickerSetsStoreResponse extends Message<GetStickerSetsStoreResponse, C17691a> {
    public static final ProtoAdapter<GetStickerSetsStoreResponse> ADAPTER = new C17692b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final Integer position;
    public final List<StickerSet> sticker_sets;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsStoreResponse$b */
    private static final class C17692b extends ProtoAdapter<GetStickerSetsStoreResponse> {
        C17692b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetsStoreResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetsStoreResponse getStickerSetsStoreResponse) {
            int i;
            int encodedSizeWithTag = StickerSet.ADAPTER.asRepeated().encodedSizeWithTag(1, getStickerSetsStoreResponse.sticker_sets);
            int i2 = 0;
            if (getStickerSetsStoreResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getStickerSetsStoreResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getStickerSetsStoreResponse.position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getStickerSetsStoreResponse.position);
            }
            return i3 + i2 + getStickerSetsStoreResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetsStoreResponse decode(ProtoReader protoReader) throws IOException {
            C17691a aVar = new C17691a();
            aVar.f44710b = false;
            aVar.f44711c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44709a.add(StickerSet.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44710b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44711c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetsStoreResponse getStickerSetsStoreResponse) throws IOException {
            StickerSet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getStickerSetsStoreResponse.sticker_sets);
            if (getStickerSetsStoreResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStickerSetsStoreResponse.has_more);
            }
            if (getStickerSetsStoreResponse.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getStickerSetsStoreResponse.position);
            }
            protoWriter.writeBytes(getStickerSetsStoreResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsStoreResponse$a */
    public static final class C17691a extends Message.Builder<GetStickerSetsStoreResponse, C17691a> {

        /* renamed from: a */
        public List<StickerSet> f44709a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44710b;

        /* renamed from: c */
        public Integer f44711c;

        /* renamed from: a */
        public GetStickerSetsStoreResponse build() {
            return new GetStickerSetsStoreResponse(this.f44709a, this.f44710b, this.f44711c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17691a newBuilder() {
        C17691a aVar = new C17691a();
        aVar.f44709a = Internal.copyOf("sticker_sets", this.sticker_sets);
        aVar.f44710b = this.has_more;
        aVar.f44711c = this.position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetStickerSetsStoreResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_sets.isEmpty()) {
            sb.append(", sticker_sets=");
            sb.append(this.sticker_sets);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetsStoreResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetsStoreResponse(List<StickerSet> list, Boolean bool, Integer num) {
        this(list, bool, num, ByteString.EMPTY);
    }

    public GetStickerSetsStoreResponse(List<StickerSet> list, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_sets = Internal.immutableCopyOf("sticker_sets", list);
        this.has_more = bool;
        this.position = num;
    }
}

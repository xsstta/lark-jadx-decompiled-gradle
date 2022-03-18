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

public final class PatchStickerSetsRequest extends Message<PatchStickerSetsRequest, C17837a> {
    public static final ProtoAdapter<PatchStickerSetsRequest> ADAPTER = new C17838b();
    private static final long serialVersionUID = 0;
    public final Rank rank;

    public static final class Rank extends Message<Rank, C17835a> {
        public static final ProtoAdapter<Rank> ADAPTER = new C17836b();
        private static final long serialVersionUID = 0;
        public final List<String> sticker_set_ids;

        /* renamed from: com.bytedance.lark.pb.im.v1.PatchStickerSetsRequest$Rank$b */
        private static final class C17836b extends ProtoAdapter<Rank> {
            C17836b() {
                super(FieldEncoding.LENGTH_DELIMITED, Rank.class);
            }

            /* renamed from: a */
            public int encodedSize(Rank rank) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, rank.sticker_set_ids) + rank.unknownFields().size();
            }

            /* renamed from: a */
            public Rank decode(ProtoReader protoReader) throws IOException {
                C17835a aVar = new C17835a();
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
                        aVar.f44898a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Rank rank) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, rank.sticker_set_ids);
                protoWriter.writeBytes(rank.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PatchStickerSetsRequest$Rank$a */
        public static final class C17835a extends Message.Builder<Rank, C17835a> {

            /* renamed from: a */
            public List<String> f44898a = Internal.newMutableList();

            /* renamed from: a */
            public Rank build() {
                return new Rank(this.f44898a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17835a newBuilder() {
            C17835a aVar = new C17835a();
            aVar.f44898a = Internal.copyOf("sticker_set_ids", this.sticker_set_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "Rank");
            StringBuilder sb = new StringBuilder();
            if (!this.sticker_set_ids.isEmpty()) {
                sb.append(", sticker_set_ids=");
                sb.append(this.sticker_set_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "Rank{");
            replace.append('}');
            return replace.toString();
        }

        public Rank(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public Rank(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.sticker_set_ids = Internal.immutableCopyOf("sticker_set_ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchStickerSetsRequest$b */
    private static final class C17838b extends ProtoAdapter<PatchStickerSetsRequest> {
        C17838b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchStickerSetsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchStickerSetsRequest patchStickerSetsRequest) {
            int i;
            if (patchStickerSetsRequest.rank != null) {
                i = Rank.ADAPTER.encodedSizeWithTag(1, patchStickerSetsRequest.rank);
            } else {
                i = 0;
            }
            return i + patchStickerSetsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PatchStickerSetsRequest decode(ProtoReader protoReader) throws IOException {
            C17837a aVar = new C17837a();
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
                    aVar.f44899a = Rank.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchStickerSetsRequest patchStickerSetsRequest) throws IOException {
            if (patchStickerSetsRequest.rank != null) {
                Rank.ADAPTER.encodeWithTag(protoWriter, 1, patchStickerSetsRequest.rank);
            }
            protoWriter.writeBytes(patchStickerSetsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PatchStickerSetsRequest$a */
    public static final class C17837a extends Message.Builder<PatchStickerSetsRequest, C17837a> {

        /* renamed from: a */
        public Rank f44899a;

        /* renamed from: a */
        public PatchStickerSetsRequest build() {
            return new PatchStickerSetsRequest(this.f44899a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17837a mo62166a(Rank rank) {
            this.f44899a = rank;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17837a newBuilder() {
        C17837a aVar = new C17837a();
        aVar.f44899a = this.rank;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PatchStickerSetsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        StringBuilder replace = sb.replace(0, 2, "PatchStickerSetsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PatchStickerSetsRequest(Rank rank2) {
        this(rank2, ByteString.EMPTY);
    }

    public PatchStickerSetsRequest(Rank rank2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rank = rank2;
    }
}

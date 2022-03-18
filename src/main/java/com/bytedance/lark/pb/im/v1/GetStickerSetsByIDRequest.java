package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetStickerSetsByIDRequest extends Message<GetStickerSetsByIDRequest, C17681a> {
    public static final ProtoAdapter<GetStickerSetsByIDRequest> ADAPTER = new C17682b();
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    private static final long serialVersionUID = 0;
    public final List<String> sticker_sets_ids;
    public final SyncDataStrategy sync_data_strategy;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsByIDRequest$b */
    private static final class C17682b extends ProtoAdapter<GetStickerSetsByIDRequest> {
        C17682b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetsByIDRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetsByIDRequest getStickerSetsByIDRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getStickerSetsByIDRequest.sticker_sets_ids);
            if (getStickerSetsByIDRequest.sync_data_strategy != null) {
                i = SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getStickerSetsByIDRequest.sync_data_strategy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getStickerSetsByIDRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetsByIDRequest decode(ProtoReader protoReader) throws IOException {
            C17681a aVar = new C17681a();
            aVar.f44699b = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44698a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44699b = SyncDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetsByIDRequest getStickerSetsByIDRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getStickerSetsByIDRequest.sticker_sets_ids);
            if (getStickerSetsByIDRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getStickerSetsByIDRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getStickerSetsByIDRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetStickerSetsByIDRequest$a */
    public static final class C17681a extends Message.Builder<GetStickerSetsByIDRequest, C17681a> {

        /* renamed from: a */
        public List<String> f44698a = Internal.newMutableList();

        /* renamed from: b */
        public SyncDataStrategy f44699b;

        /* renamed from: a */
        public GetStickerSetsByIDRequest build() {
            return new GetStickerSetsByIDRequest(this.f44698a, this.f44699b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17681a mo61774a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44698a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17681a newBuilder() {
        C17681a aVar = new C17681a();
        aVar.f44698a = Internal.copyOf("sticker_sets_ids", this.sticker_sets_ids);
        aVar.f44699b = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetStickerSetsByIDRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_sets_ids.isEmpty()) {
            sb.append(", sticker_sets_ids=");
            sb.append(this.sticker_sets_ids);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetsByIDRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetsByIDRequest(List<String> list, SyncDataStrategy syncDataStrategy) {
        this(list, syncDataStrategy, ByteString.EMPTY);
    }

    public GetStickerSetsByIDRequest(List<String> list, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_sets_ids = Internal.immutableCopyOf("sticker_sets_ids", list);
        this.sync_data_strategy = syncDataStrategy;
    }
}

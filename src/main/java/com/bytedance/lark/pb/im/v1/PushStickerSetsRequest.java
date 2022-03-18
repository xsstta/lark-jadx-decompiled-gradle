package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushStickerSetsRequest extends Message<PushStickerSetsRequest, C17947a> {
    public static final ProtoAdapter<PushStickerSetsRequest> ADAPTER = new C17948b();
    public static final Operation DEFAULT_OPERATION = Operation.UNKNOWN;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Operation operation;
    public final List<StickerSet> sticker_sets;
    public final Long update_time;

    public enum Operation implements WireEnum {
        UNKNOWN(0),
        ADD(1),
        DELETE(2),
        REORDER(3);
        
        public static final ProtoAdapter<Operation> ADAPTER = ProtoAdapter.newEnumAdapter(Operation.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Operation fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i != 3) {
                return null;
            }
            return REORDER;
        }

        private Operation(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushStickerSetsRequest$b */
    private static final class C17948b extends ProtoAdapter<PushStickerSetsRequest> {
        C17948b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushStickerSetsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushStickerSetsRequest pushStickerSetsRequest) {
            int i;
            int i2 = 0;
            if (pushStickerSetsRequest.operation != null) {
                i = Operation.ADAPTER.encodedSizeWithTag(1, pushStickerSetsRequest.operation);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + StickerSet.ADAPTER.asRepeated().encodedSizeWithTag(2, pushStickerSetsRequest.sticker_sets);
            if (pushStickerSetsRequest.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, pushStickerSetsRequest.update_time);
            }
            return encodedSizeWithTag + i2 + pushStickerSetsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushStickerSetsRequest decode(ProtoReader protoReader) throws IOException {
            C17947a aVar = new C17947a();
            aVar.f45037a = Operation.UNKNOWN;
            aVar.f45039c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45037a = Operation.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f45038b.add(StickerSet.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45039c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushStickerSetsRequest pushStickerSetsRequest) throws IOException {
            if (pushStickerSetsRequest.operation != null) {
                Operation.ADAPTER.encodeWithTag(protoWriter, 1, pushStickerSetsRequest.operation);
            }
            StickerSet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushStickerSetsRequest.sticker_sets);
            if (pushStickerSetsRequest.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pushStickerSetsRequest.update_time);
            }
            protoWriter.writeBytes(pushStickerSetsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushStickerSetsRequest$a */
    public static final class C17947a extends Message.Builder<PushStickerSetsRequest, C17947a> {

        /* renamed from: a */
        public Operation f45037a;

        /* renamed from: b */
        public List<StickerSet> f45038b = Internal.newMutableList();

        /* renamed from: c */
        public Long f45039c;

        /* renamed from: a */
        public PushStickerSetsRequest build() {
            return new PushStickerSetsRequest(this.f45037a, this.f45038b, this.f45039c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17947a newBuilder() {
        C17947a aVar = new C17947a();
        aVar.f45037a = this.operation;
        aVar.f45038b = Internal.copyOf("sticker_sets", this.sticker_sets);
        aVar.f45039c = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushStickerSetsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.operation != null) {
            sb.append(", operation=");
            sb.append(this.operation);
        }
        if (!this.sticker_sets.isEmpty()) {
            sb.append(", sticker_sets=");
            sb.append(this.sticker_sets);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        StringBuilder replace = sb.replace(0, 2, "PushStickerSetsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushStickerSetsRequest(Operation operation2, List<StickerSet> list, Long l) {
        this(operation2, list, l, ByteString.EMPTY);
    }

    public PushStickerSetsRequest(Operation operation2, List<StickerSet> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operation = operation2;
        this.sticker_sets = Internal.immutableCopyOf("sticker_sets", list);
        this.update_time = l;
    }
}

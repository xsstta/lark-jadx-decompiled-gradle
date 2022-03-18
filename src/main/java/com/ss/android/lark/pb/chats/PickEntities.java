package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PickEntities extends Message<PickEntities, C49582a> {
    public static final ProtoAdapter<PickEntities> ADAPTER = new C49583b();
    private static final long serialVersionUID = 0;
    public final List<String> mpick_ids;
    public final PickType mpick_type;

    /* renamed from: com.ss.android.lark.pb.chats.PickEntities$b */
    private static final class C49583b extends ProtoAdapter<PickEntities> {
        C49583b() {
            super(FieldEncoding.LENGTH_DELIMITED, PickEntities.class);
        }

        /* renamed from: a */
        public int encodedSize(PickEntities pickEntities) {
            return PickType.ADAPTER.encodedSizeWithTag(1, pickEntities.mpick_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pickEntities.mpick_ids) + pickEntities.unknownFields().size();
        }

        /* renamed from: a */
        public PickEntities decode(ProtoReader protoReader) throws IOException {
            C49582a aVar = new C49582a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124197a = PickType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124198b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PickEntities pickEntities) throws IOException {
            PickType.ADAPTER.encodeWithTag(protoWriter, 1, pickEntities.mpick_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pickEntities.mpick_ids);
            protoWriter.writeBytes(pickEntities.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PickEntities$a */
    public static final class C49582a extends Message.Builder<PickEntities, C49582a> {

        /* renamed from: a */
        public PickType f124197a;

        /* renamed from: b */
        public List<String> f124198b = Internal.newMutableList();

        /* renamed from: a */
        public PickEntities build() {
            PickType pickType = this.f124197a;
            if (pickType != null) {
                return new PickEntities(pickType, this.f124198b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(pickType, "mpick_type");
        }

        /* renamed from: a */
        public C49582a mo172879a(PickType pickType) {
            this.f124197a = pickType;
            return this;
        }

        /* renamed from: a */
        public C49582a mo172880a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f124198b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49582a newBuilder() {
        C49582a aVar = new C49582a();
        aVar.f124197a = this.mpick_type;
        aVar.f124198b = Internal.copyOf("mpick_ids", this.mpick_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", pick_type=");
        sb.append(this.mpick_type);
        if (!this.mpick_ids.isEmpty()) {
            sb.append(", pick_ids=");
            sb.append(this.mpick_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PickEntities{");
        replace.append('}');
        return replace.toString();
    }

    public PickEntities(PickType pickType, List<String> list) {
        this(pickType, list, ByteString.EMPTY);
    }

    public PickEntities(PickType pickType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpick_type = pickType;
        this.mpick_ids = Internal.immutableCopyOf("mpick_ids", list);
    }
}

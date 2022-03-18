package com.bytedance.lark.pb.basic.v1;

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

public final class PickEntities extends Message<PickEntities, C15113a> {
    public static final ProtoAdapter<PickEntities> ADAPTER = new C15114b();
    public static final PickType DEFAULT_PICK_TYPE = PickType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> pick_ids;
    public final PickType pick_type;

    public enum PickType implements WireEnum {
        UNKNOWN(0),
        USER(1),
        CHAT(2),
        DEPT(3);
        
        public static final ProtoAdapter<PickType> ADAPTER = ProtoAdapter.newEnumAdapter(PickType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PickType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USER;
            }
            if (i == 2) {
                return CHAT;
            }
            if (i != 3) {
                return null;
            }
            return DEPT;
        }

        private PickType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PickEntities$b */
    private static final class C15114b extends ProtoAdapter<PickEntities> {
        C15114b() {
            super(FieldEncoding.LENGTH_DELIMITED, PickEntities.class);
        }

        /* renamed from: a */
        public int encodedSize(PickEntities pickEntities) {
            return PickType.ADAPTER.encodedSizeWithTag(1, pickEntities.pick_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pickEntities.pick_ids) + pickEntities.unknownFields().size();
        }

        /* renamed from: a */
        public PickEntities decode(ProtoReader protoReader) throws IOException {
            C15113a aVar = new C15113a();
            aVar.f40077a = PickType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40077a = PickType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40078b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PickEntities pickEntities) throws IOException {
            PickType.ADAPTER.encodeWithTag(protoWriter, 1, pickEntities.pick_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pickEntities.pick_ids);
            protoWriter.writeBytes(pickEntities.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PickEntities$a */
    public static final class C15113a extends Message.Builder<PickEntities, C15113a> {

        /* renamed from: a */
        public PickType f40077a;

        /* renamed from: b */
        public List<String> f40078b = Internal.newMutableList();

        /* renamed from: a */
        public PickEntities build() {
            PickType pickType = this.f40077a;
            if (pickType != null) {
                return new PickEntities(pickType, this.f40078b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(pickType, "pick_type");
        }

        /* renamed from: a */
        public C15113a mo55121a(PickType pickType) {
            this.f40077a = pickType;
            return this;
        }

        /* renamed from: a */
        public C15113a mo55122a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40078b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15113a newBuilder() {
        C15113a aVar = new C15113a();
        aVar.f40077a = this.pick_type;
        aVar.f40078b = Internal.copyOf("pick_ids", this.pick_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PickEntities");
        StringBuilder sb = new StringBuilder();
        sb.append(", pick_type=");
        sb.append(this.pick_type);
        if (!this.pick_ids.isEmpty()) {
            sb.append(", pick_ids=");
            sb.append(this.pick_ids);
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
        this.pick_type = pickType;
        this.pick_ids = Internal.immutableCopyOf("pick_ids", list);
    }
}

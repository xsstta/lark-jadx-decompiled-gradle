package com.google.protobuf.server;

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

public final class MethodOptions extends Message<MethodOptions, C23171a> {
    public static final ProtoAdapter<MethodOptions> ADAPTER = new C23172b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mdeprecated;
    public final IdempotencyLevel midempotency_level;
    public final List<UninterpretedOption> muninterpreted_option;

    public enum IdempotencyLevel implements WireEnum {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);
        
        public static final ProtoAdapter<IdempotencyLevel> ADAPTER = ProtoAdapter.newEnumAdapter(IdempotencyLevel.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static IdempotencyLevel fromValue(int i) {
            if (i == 0) {
                return IDEMPOTENCY_UNKNOWN;
            }
            if (i == 1) {
                return NO_SIDE_EFFECTS;
            }
            if (i != 2) {
                return null;
            }
            return IDEMPOTENT;
        }

        private IdempotencyLevel(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.google.protobuf.server.MethodOptions$b */
    private static final class C23172b extends ProtoAdapter<MethodOptions> {
        C23172b() {
            super(FieldEncoding.LENGTH_DELIMITED, MethodOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(MethodOptions methodOptions) {
            int i;
            int i2 = 0;
            if (methodOptions.mdeprecated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(33, methodOptions.mdeprecated);
            } else {
                i = 0;
            }
            if (methodOptions.midempotency_level != null) {
                i2 = IdempotencyLevel.ADAPTER.encodedSizeWithTag(34, methodOptions.midempotency_level);
            }
            return i + i2 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, methodOptions.muninterpreted_option) + methodOptions.unknownFields().size();
        }

        /* renamed from: a */
        public MethodOptions decode(ProtoReader protoReader) throws IOException {
            C23171a aVar = new C23171a();
            aVar.f57180a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 33) {
                    aVar.f57180a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 34) {
                    try {
                        aVar.f57181b = IdempotencyLevel.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57182c.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MethodOptions methodOptions) throws IOException {
            if (methodOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, methodOptions.mdeprecated);
            }
            if (methodOptions.midempotency_level != null) {
                IdempotencyLevel.ADAPTER.encodeWithTag(protoWriter, 34, methodOptions.midempotency_level);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, methodOptions.muninterpreted_option);
            protoWriter.writeBytes(methodOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.MethodOptions$a */
    public static final class C23171a extends Message.Builder<MethodOptions, C23171a> {

        /* renamed from: a */
        public Boolean f57180a;

        /* renamed from: b */
        public IdempotencyLevel f57181b;

        /* renamed from: c */
        public List<UninterpretedOption> f57182c = Internal.newMutableList();

        /* renamed from: a */
        public MethodOptions build() {
            return new MethodOptions(this.f57180a, this.f57181b, this.f57182c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23171a newBuilder() {
        C23171a aVar = new C23171a();
        aVar.f57180a = this.mdeprecated;
        aVar.f57181b = this.midempotency_level;
        aVar.f57182c = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mdeprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.mdeprecated);
        }
        if (this.midempotency_level != null) {
            sb.append(", idempotency_level=");
            sb.append(this.midempotency_level);
        }
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "MethodOptions{");
        replace.append('}');
        return replace.toString();
    }

    public MethodOptions(Boolean bool, IdempotencyLevel idempotencyLevel, List<UninterpretedOption> list) {
        this(bool, idempotencyLevel, list, ByteString.EMPTY);
    }

    public MethodOptions(Boolean bool, IdempotencyLevel idempotencyLevel, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdeprecated = bool;
        this.midempotency_level = idempotencyLevel;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}

package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class EnumValueOptions extends Message<EnumValueOptions, C23149a> {
    public static final ProtoAdapter<EnumValueOptions> ADAPTER = new C23150b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mdeprecated;
    public final List<UninterpretedOption> muninterpreted_option;

    /* renamed from: com.google.protobuf.server.EnumValueOptions$b */
    private static final class C23150b extends ProtoAdapter<EnumValueOptions> {
        C23150b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumValueOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumValueOptions enumValueOptions) {
            int i;
            if (enumValueOptions.mdeprecated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, enumValueOptions.mdeprecated);
            } else {
                i = 0;
            }
            return i + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, enumValueOptions.muninterpreted_option) + enumValueOptions.unknownFields().size();
        }

        /* renamed from: a */
        public EnumValueOptions decode(ProtoReader protoReader) throws IOException {
            C23149a aVar = new C23149a();
            aVar.f57110a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57110a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57111b.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumValueOptions enumValueOptions) throws IOException {
            if (enumValueOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, enumValueOptions.mdeprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, enumValueOptions.muninterpreted_option);
            protoWriter.writeBytes(enumValueOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.EnumValueOptions$a */
    public static final class C23149a extends Message.Builder<EnumValueOptions, C23149a> {

        /* renamed from: a */
        public Boolean f57110a;

        /* renamed from: b */
        public List<UninterpretedOption> f57111b = Internal.newMutableList();

        /* renamed from: a */
        public EnumValueOptions build() {
            return new EnumValueOptions(this.f57110a, this.f57111b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23149a newBuilder() {
        C23149a aVar = new C23149a();
        aVar.f57110a = this.mdeprecated;
        aVar.f57111b = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
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
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "EnumValueOptions{");
        replace.append('}');
        return replace.toString();
    }

    public EnumValueOptions(Boolean bool, List<UninterpretedOption> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public EnumValueOptions(Boolean bool, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdeprecated = bool;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}

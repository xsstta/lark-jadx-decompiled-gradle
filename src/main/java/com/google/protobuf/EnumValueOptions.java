package com.google.protobuf;

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

public final class EnumValueOptions extends Message<EnumValueOptions, C23055a> {
    public static final ProtoAdapter<EnumValueOptions> ADAPTER = new C23056b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean deprecated;
    public final List<UninterpretedOption> uninterpreted_option;

    /* renamed from: com.google.protobuf.EnumValueOptions$b */
    private static final class C23056b extends ProtoAdapter<EnumValueOptions> {
        C23056b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumValueOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumValueOptions enumValueOptions) {
            int i;
            if (enumValueOptions.deprecated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, enumValueOptions.deprecated);
            } else {
                i = 0;
            }
            return i + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, enumValueOptions.uninterpreted_option) + enumValueOptions.unknownFields().size();
        }

        /* renamed from: a */
        public EnumValueOptions decode(ProtoReader protoReader) throws IOException {
            C23055a aVar = new C23055a();
            aVar.f56933a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f56933a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56934b.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumValueOptions enumValueOptions) throws IOException {
            if (enumValueOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, enumValueOptions.deprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, enumValueOptions.uninterpreted_option);
            protoWriter.writeBytes(enumValueOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.EnumValueOptions$a */
    public static final class C23055a extends Message.Builder<EnumValueOptions, C23055a> {

        /* renamed from: a */
        public Boolean f56933a;

        /* renamed from: b */
        public List<UninterpretedOption> f56934b = Internal.newMutableList();

        /* renamed from: a */
        public EnumValueOptions build() {
            return new EnumValueOptions(this.f56933a, this.f56934b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23055a newBuilder() {
        C23055a aVar = new C23055a();
        aVar.f56933a = this.deprecated;
        aVar.f56934b = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "EnumValueOptions");
        StringBuilder sb = new StringBuilder();
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
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
        this.deprecated = bool;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
    }
}

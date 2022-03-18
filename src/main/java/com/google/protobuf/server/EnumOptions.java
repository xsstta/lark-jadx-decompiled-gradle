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

public final class EnumOptions extends Message<EnumOptions, C23145a> {
    public static final ProtoAdapter<EnumOptions> ADAPTER = new C23146b();
    public static final Boolean DEFAULT_ALLOW_ALIAS = false;
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mallow_alias;
    public final Boolean mdeprecated;
    public final List<UninterpretedOption> muninterpreted_option;

    /* renamed from: com.google.protobuf.server.EnumOptions$b */
    private static final class C23146b extends ProtoAdapter<EnumOptions> {
        C23146b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumOptions enumOptions) {
            int i;
            int i2 = 0;
            if (enumOptions.mallow_alias != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, enumOptions.mallow_alias);
            } else {
                i = 0;
            }
            if (enumOptions.mdeprecated != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, enumOptions.mdeprecated);
            }
            return i + i2 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, enumOptions.muninterpreted_option) + enumOptions.unknownFields().size();
        }

        /* renamed from: a */
        public EnumOptions decode(ProtoReader protoReader) throws IOException {
            C23145a aVar = new C23145a();
            aVar.f57104a = false;
            aVar.f57105b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f57104a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f57105b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57106c.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumOptions enumOptions) throws IOException {
            if (enumOptions.mallow_alias != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, enumOptions.mallow_alias);
            }
            if (enumOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, enumOptions.mdeprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, enumOptions.muninterpreted_option);
            protoWriter.writeBytes(enumOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.EnumOptions$a */
    public static final class C23145a extends Message.Builder<EnumOptions, C23145a> {

        /* renamed from: a */
        public Boolean f57104a;

        /* renamed from: b */
        public Boolean f57105b;

        /* renamed from: c */
        public List<UninterpretedOption> f57106c = Internal.newMutableList();

        /* renamed from: a */
        public EnumOptions build() {
            return new EnumOptions(this.f57104a, this.f57105b, this.f57106c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C23145a mo80329a(Boolean bool) {
            this.f57104a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C23145a newBuilder() {
        C23145a aVar = new C23145a();
        aVar.f57104a = this.mallow_alias;
        aVar.f57105b = this.mdeprecated;
        aVar.f57106c = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mallow_alias != null) {
            sb.append(", allow_alias=");
            sb.append(this.mallow_alias);
        }
        if (this.mdeprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.mdeprecated);
        }
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "EnumOptions{");
        replace.append('}');
        return replace.toString();
    }

    public EnumOptions(Boolean bool, Boolean bool2, List<UninterpretedOption> list) {
        this(bool, bool2, list, ByteString.EMPTY);
    }

    public EnumOptions(Boolean bool, Boolean bool2, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mallow_alias = bool;
        this.mdeprecated = bool2;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}

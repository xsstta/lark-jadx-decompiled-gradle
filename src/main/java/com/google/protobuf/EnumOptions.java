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

public final class EnumOptions extends Message<EnumOptions, C23051a> {
    public static final ProtoAdapter<EnumOptions> ADAPTER = new C23052b();
    public static final Boolean DEFAULT_ALLOW_ALIAS = false;
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean allow_alias;
    public final Boolean deprecated;
    public final List<UninterpretedOption> uninterpreted_option;

    /* renamed from: com.google.protobuf.EnumOptions$b */
    private static final class C23052b extends ProtoAdapter<EnumOptions> {
        C23052b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnumOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(EnumOptions enumOptions) {
            int i;
            int i2 = 0;
            if (enumOptions.allow_alias != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, enumOptions.allow_alias);
            } else {
                i = 0;
            }
            if (enumOptions.deprecated != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, enumOptions.deprecated);
            }
            return i + i2 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, enumOptions.uninterpreted_option) + enumOptions.unknownFields().size();
        }

        /* renamed from: a */
        public EnumOptions decode(ProtoReader protoReader) throws IOException {
            C23051a aVar = new C23051a();
            aVar.f56927a = false;
            aVar.f56928b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f56927a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f56928b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56929c.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnumOptions enumOptions) throws IOException {
            if (enumOptions.allow_alias != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, enumOptions.allow_alias);
            }
            if (enumOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, enumOptions.deprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, enumOptions.uninterpreted_option);
            protoWriter.writeBytes(enumOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.EnumOptions$a */
    public static final class C23051a extends Message.Builder<EnumOptions, C23051a> {

        /* renamed from: a */
        public Boolean f56927a;

        /* renamed from: b */
        public Boolean f56928b;

        /* renamed from: c */
        public List<UninterpretedOption> f56929c = Internal.newMutableList();

        /* renamed from: a */
        public EnumOptions build() {
            return new EnumOptions(this.f56927a, this.f56928b, this.f56929c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23051a newBuilder() {
        C23051a aVar = new C23051a();
        aVar.f56927a = this.allow_alias;
        aVar.f56928b = this.deprecated;
        aVar.f56929c = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "EnumOptions");
        StringBuilder sb = new StringBuilder();
        if (this.allow_alias != null) {
            sb.append(", allow_alias=");
            sb.append(this.allow_alias);
        }
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
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
        this.allow_alias = bool;
        this.deprecated = bool2;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
    }
}

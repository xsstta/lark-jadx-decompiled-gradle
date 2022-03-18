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

public final class MethodOptions extends Message<MethodOptions, C23082a> {
    public static final ProtoAdapter<MethodOptions> ADAPTER = new C23083b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean deprecated;
    public final List<UninterpretedOption> uninterpreted_option;

    /* renamed from: com.google.protobuf.MethodOptions$b */
    private static final class C23083b extends ProtoAdapter<MethodOptions> {
        C23083b() {
            super(FieldEncoding.LENGTH_DELIMITED, MethodOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(MethodOptions methodOptions) {
            int i;
            if (methodOptions.deprecated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(33, methodOptions.deprecated);
            } else {
                i = 0;
            }
            return i + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, methodOptions.uninterpreted_option) + methodOptions.unknownFields().size();
        }

        /* renamed from: a */
        public MethodOptions decode(ProtoReader protoReader) throws IOException {
            C23082a aVar = new C23082a();
            aVar.f57006a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 33) {
                    aVar.f57006a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57007b.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MethodOptions methodOptions) throws IOException {
            if (methodOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, methodOptions.deprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, methodOptions.uninterpreted_option);
            protoWriter.writeBytes(methodOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.MethodOptions$a */
    public static final class C23082a extends Message.Builder<MethodOptions, C23082a> {

        /* renamed from: a */
        public Boolean f57006a;

        /* renamed from: b */
        public List<UninterpretedOption> f57007b = Internal.newMutableList();

        /* renamed from: a */
        public MethodOptions build() {
            return new MethodOptions(this.f57006a, this.f57007b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23082a newBuilder() {
        C23082a aVar = new C23082a();
        aVar.f57006a = this.deprecated;
        aVar.f57007b = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "MethodOptions");
        StringBuilder sb = new StringBuilder();
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "MethodOptions{");
        replace.append('}');
        return replace.toString();
    }

    public MethodOptions(Boolean bool, List<UninterpretedOption> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public MethodOptions(Boolean bool, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.deprecated = bool;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
    }
}

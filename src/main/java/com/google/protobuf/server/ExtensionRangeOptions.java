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

public final class ExtensionRangeOptions extends Message<ExtensionRangeOptions, C23151a> {
    public static final ProtoAdapter<ExtensionRangeOptions> ADAPTER = new C23152b();
    private static final long serialVersionUID = 0;
    public final List<UninterpretedOption> muninterpreted_option;

    /* renamed from: com.google.protobuf.server.ExtensionRangeOptions$b */
    private static final class C23152b extends ProtoAdapter<ExtensionRangeOptions> {
        C23152b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtensionRangeOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtensionRangeOptions extensionRangeOptions) {
            return UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, extensionRangeOptions.muninterpreted_option) + extensionRangeOptions.unknownFields().size();
        }

        /* renamed from: a */
        public ExtensionRangeOptions decode(ProtoReader protoReader) throws IOException {
            C23151a aVar = new C23151a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57112a.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtensionRangeOptions extensionRangeOptions) throws IOException {
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, extensionRangeOptions.muninterpreted_option);
            protoWriter.writeBytes(extensionRangeOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.ExtensionRangeOptions$a */
    public static final class C23151a extends Message.Builder<ExtensionRangeOptions, C23151a> {

        /* renamed from: a */
        public List<UninterpretedOption> f57112a = Internal.newMutableList();

        /* renamed from: a */
        public ExtensionRangeOptions build() {
            return new ExtensionRangeOptions(this.f57112a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23151a newBuilder() {
        C23151a aVar = new C23151a();
        aVar.f57112a = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtensionRangeOptions{");
        replace.append('}');
        return replace.toString();
    }

    public ExtensionRangeOptions(List<UninterpretedOption> list) {
        this(list, ByteString.EMPTY);
    }

    public ExtensionRangeOptions(List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}

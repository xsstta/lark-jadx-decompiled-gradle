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

public final class OneofOptions extends Message<OneofOptions, C23175a> {
    public static final ProtoAdapter<OneofOptions> ADAPTER = new C23176b();
    private static final long serialVersionUID = 0;
    public final List<UninterpretedOption> muninterpreted_option;

    /* renamed from: com.google.protobuf.server.OneofOptions$b */
    private static final class C23176b extends ProtoAdapter<OneofOptions> {
        C23176b() {
            super(FieldEncoding.LENGTH_DELIMITED, OneofOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(OneofOptions oneofOptions) {
            return UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, oneofOptions.muninterpreted_option) + oneofOptions.unknownFields().size();
        }

        /* renamed from: a */
        public OneofOptions decode(ProtoReader protoReader) throws IOException {
            C23175a aVar = new C23175a();
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
                    aVar.f57185a.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OneofOptions oneofOptions) throws IOException {
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, oneofOptions.muninterpreted_option);
            protoWriter.writeBytes(oneofOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.OneofOptions$a */
    public static final class C23175a extends Message.Builder<OneofOptions, C23175a> {

        /* renamed from: a */
        public List<UninterpretedOption> f57185a = Internal.newMutableList();

        /* renamed from: a */
        public OneofOptions build() {
            return new OneofOptions(this.f57185a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23175a newBuilder() {
        C23175a aVar = new C23175a();
        aVar.f57185a = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
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
        StringBuilder replace = sb.replace(0, 2, "OneofOptions{");
        replace.append('}');
        return replace.toString();
    }

    public OneofOptions(List<UninterpretedOption> list) {
        this(list, ByteString.EMPTY);
    }

    public OneofOptions(List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}

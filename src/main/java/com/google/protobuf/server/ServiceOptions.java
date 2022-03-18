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

public final class ServiceOptions extends Message<ServiceOptions, C23179a> {
    public static final ProtoAdapter<ServiceOptions> ADAPTER = new C23180b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mdeprecated;
    public final List<UninterpretedOption> muninterpreted_option;

    /* renamed from: com.google.protobuf.server.ServiceOptions$b */
    private static final class C23180b extends ProtoAdapter<ServiceOptions> {
        C23180b() {
            super(FieldEncoding.LENGTH_DELIMITED, ServiceOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(ServiceOptions serviceOptions) {
            int i;
            if (serviceOptions.mdeprecated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(33, serviceOptions.mdeprecated);
            } else {
                i = 0;
            }
            return i + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, serviceOptions.muninterpreted_option) + serviceOptions.unknownFields().size();
        }

        /* renamed from: a */
        public ServiceOptions decode(ProtoReader protoReader) throws IOException {
            C23179a aVar = new C23179a();
            aVar.f57189a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 33) {
                    aVar.f57189a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57190b.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ServiceOptions serviceOptions) throws IOException {
            if (serviceOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, serviceOptions.mdeprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, serviceOptions.muninterpreted_option);
            protoWriter.writeBytes(serviceOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.ServiceOptions$a */
    public static final class C23179a extends Message.Builder<ServiceOptions, C23179a> {

        /* renamed from: a */
        public Boolean f57189a;

        /* renamed from: b */
        public List<UninterpretedOption> f57190b = Internal.newMutableList();

        /* renamed from: a */
        public ServiceOptions build() {
            return new ServiceOptions(this.f57189a, this.f57190b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23179a newBuilder() {
        C23179a aVar = new C23179a();
        aVar.f57189a = this.mdeprecated;
        aVar.f57190b = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
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
        StringBuilder replace = sb.replace(0, 2, "ServiceOptions{");
        replace.append('}');
        return replace.toString();
    }

    public ServiceOptions(Boolean bool, List<UninterpretedOption> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public ServiceOptions(Boolean bool, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdeprecated = bool;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}

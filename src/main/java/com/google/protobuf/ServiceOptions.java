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

public final class ServiceOptions extends Message<ServiceOptions, C23088a> {
    public static final ProtoAdapter<ServiceOptions> ADAPTER = new C23089b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean deprecated;
    public final List<UninterpretedOption> uninterpreted_option;

    /* renamed from: com.google.protobuf.ServiceOptions$b */
    private static final class C23089b extends ProtoAdapter<ServiceOptions> {
        C23089b() {
            super(FieldEncoding.LENGTH_DELIMITED, ServiceOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(ServiceOptions serviceOptions) {
            int i;
            if (serviceOptions.deprecated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(33, serviceOptions.deprecated);
            } else {
                i = 0;
            }
            return i + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, serviceOptions.uninterpreted_option) + serviceOptions.unknownFields().size();
        }

        /* renamed from: a */
        public ServiceOptions decode(ProtoReader protoReader) throws IOException {
            C23088a aVar = new C23088a();
            aVar.f57012a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 33) {
                    aVar.f57012a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57013b.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ServiceOptions serviceOptions) throws IOException {
            if (serviceOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, serviceOptions.deprecated);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, serviceOptions.uninterpreted_option);
            protoWriter.writeBytes(serviceOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.ServiceOptions$a */
    public static final class C23088a extends Message.Builder<ServiceOptions, C23088a> {

        /* renamed from: a */
        public Boolean f57012a;

        /* renamed from: b */
        public List<UninterpretedOption> f57013b = Internal.newMutableList();

        /* renamed from: a */
        public ServiceOptions build() {
            return new ServiceOptions(this.f57012a, this.f57013b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23088a newBuilder() {
        C23088a aVar = new C23088a();
        aVar.f57012a = this.deprecated;
        aVar.f57013b = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "ServiceOptions");
        StringBuilder sb = new StringBuilder();
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
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
        this.deprecated = bool;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
    }
}

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

public final class ServiceDescriptorProto extends Message<ServiceDescriptorProto, C23086a> {
    public static final ProtoAdapter<ServiceDescriptorProto> ADAPTER = new C23087b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final List<MethodDescriptorProto> method;
    public final String name;
    public final ServiceOptions options;

    /* renamed from: com.google.protobuf.ServiceDescriptorProto$b */
    private static final class C23087b extends ProtoAdapter<ServiceDescriptorProto> {
        C23087b() {
            super(FieldEncoding.LENGTH_DELIMITED, ServiceDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(ServiceDescriptorProto serviceDescriptorProto) {
            int i;
            int i2 = 0;
            if (serviceDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, serviceDescriptorProto.name);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + MethodDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, serviceDescriptorProto.method);
            if (serviceDescriptorProto.options != null) {
                i2 = ServiceOptions.ADAPTER.encodedSizeWithTag(3, serviceDescriptorProto.options);
            }
            return encodedSizeWithTag + i2 + serviceDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public ServiceDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23086a aVar = new C23086a();
            aVar.f57009a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57009a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f57010b.add(MethodDescriptorProto.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57011c = ServiceOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ServiceDescriptorProto serviceDescriptorProto) throws IOException {
            if (serviceDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serviceDescriptorProto.name);
            }
            MethodDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, serviceDescriptorProto.method);
            if (serviceDescriptorProto.options != null) {
                ServiceOptions.ADAPTER.encodeWithTag(protoWriter, 3, serviceDescriptorProto.options);
            }
            protoWriter.writeBytes(serviceDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.ServiceDescriptorProto$a */
    public static final class C23086a extends Message.Builder<ServiceDescriptorProto, C23086a> {

        /* renamed from: a */
        public String f57009a;

        /* renamed from: b */
        public List<MethodDescriptorProto> f57010b = Internal.newMutableList();

        /* renamed from: c */
        public ServiceOptions f57011c;

        /* renamed from: a */
        public ServiceDescriptorProto build() {
            return new ServiceDescriptorProto(this.f57009a, this.f57010b, this.f57011c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23086a newBuilder() {
        C23086a aVar = new C23086a();
        aVar.f57009a = this.name;
        aVar.f57010b = Internal.copyOf("method", this.method);
        aVar.f57011c = this.options;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "ServiceDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.method.isEmpty()) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder replace = sb.replace(0, 2, "ServiceDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public ServiceDescriptorProto(String str, List<MethodDescriptorProto> list, ServiceOptions serviceOptions) {
        this(str, list, serviceOptions, ByteString.EMPTY);
    }

    public ServiceDescriptorProto(String str, List<MethodDescriptorProto> list, ServiceOptions serviceOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.method = Internal.immutableCopyOf("method", list);
        this.options = serviceOptions;
    }
}

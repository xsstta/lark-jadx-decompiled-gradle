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

public final class ServiceDescriptorProto extends Message<ServiceDescriptorProto, C23177a> {
    public static final ProtoAdapter<ServiceDescriptorProto> ADAPTER = new C23178b();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final List<MethodDescriptorProto> mmethod;
    public final String mname;
    public final ServiceOptions moptions;

    /* renamed from: com.google.protobuf.server.ServiceDescriptorProto$b */
    private static final class C23178b extends ProtoAdapter<ServiceDescriptorProto> {
        C23178b() {
            super(FieldEncoding.LENGTH_DELIMITED, ServiceDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(ServiceDescriptorProto serviceDescriptorProto) {
            int i;
            int i2 = 0;
            if (serviceDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, serviceDescriptorProto.mname);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + MethodDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, serviceDescriptorProto.mmethod);
            if (serviceDescriptorProto.moptions != null) {
                i2 = ServiceOptions.ADAPTER.encodedSizeWithTag(3, serviceDescriptorProto.moptions);
            }
            return encodedSizeWithTag + i2 + serviceDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public ServiceDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23177a aVar = new C23177a();
            aVar.f57186a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57186a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f57187b.add(MethodDescriptorProto.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57188c = ServiceOptions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ServiceDescriptorProto serviceDescriptorProto) throws IOException {
            if (serviceDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serviceDescriptorProto.mname);
            }
            MethodDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, serviceDescriptorProto.mmethod);
            if (serviceDescriptorProto.moptions != null) {
                ServiceOptions.ADAPTER.encodeWithTag(protoWriter, 3, serviceDescriptorProto.moptions);
            }
            protoWriter.writeBytes(serviceDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.ServiceDescriptorProto$a */
    public static final class C23177a extends Message.Builder<ServiceDescriptorProto, C23177a> {

        /* renamed from: a */
        public String f57186a;

        /* renamed from: b */
        public List<MethodDescriptorProto> f57187b = Internal.newMutableList();

        /* renamed from: c */
        public ServiceOptions f57188c;

        /* renamed from: a */
        public ServiceDescriptorProto build() {
            return new ServiceDescriptorProto(this.f57186a, this.f57187b, this.f57188c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23177a newBuilder() {
        C23177a aVar = new C23177a();
        aVar.f57186a = this.mname;
        aVar.f57187b = Internal.copyOf("mmethod", this.mmethod);
        aVar.f57188c = this.moptions;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (!this.mmethod.isEmpty()) {
            sb.append(", method=");
            sb.append(this.mmethod);
        }
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
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
        this.mname = str;
        this.mmethod = Internal.immutableCopyOf("mmethod", list);
        this.moptions = serviceOptions;
    }
}

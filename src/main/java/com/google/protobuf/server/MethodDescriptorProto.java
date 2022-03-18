package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MethodDescriptorProto extends Message<MethodDescriptorProto, C23169a> {
    public static final ProtoAdapter<MethodDescriptorProto> ADAPTER = new C23170b();
    public static final Boolean DEFAULT_CLIENT_STREAMING = false;
    public static final String DEFAULT_INPUT_TYPE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_OUTPUT_TYPE = "";
    public static final Boolean DEFAULT_SERVER_STREAMING = false;
    private static final long serialVersionUID = 0;
    public final Boolean mclient_streaming;
    public final String minput_type;
    public final String mname;
    public final MethodOptions moptions;
    public final String moutput_type;
    public final Boolean mserver_streaming;

    /* renamed from: com.google.protobuf.server.MethodDescriptorProto$b */
    private static final class C23170b extends ProtoAdapter<MethodDescriptorProto> {
        C23170b() {
            super(FieldEncoding.LENGTH_DELIMITED, MethodDescriptorProto.class);
        }

        /* renamed from: a */
        public int encodedSize(MethodDescriptorProto methodDescriptorProto) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (methodDescriptorProto.mname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, methodDescriptorProto.mname);
            } else {
                i = 0;
            }
            if (methodDescriptorProto.minput_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, methodDescriptorProto.minput_type);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (methodDescriptorProto.moutput_type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, methodDescriptorProto.moutput_type);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (methodDescriptorProto.moptions != null) {
                i4 = MethodOptions.ADAPTER.encodedSizeWithTag(4, methodDescriptorProto.moptions);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (methodDescriptorProto.mclient_streaming != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, methodDescriptorProto.mclient_streaming);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (methodDescriptorProto.mserver_streaming != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, methodDescriptorProto.mserver_streaming);
            }
            return i10 + i6 + methodDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public MethodDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23169a aVar = new C23169a();
            aVar.f57174a = "";
            aVar.f57175b = "";
            aVar.f57176c = "";
            aVar.f57178e = false;
            aVar.f57179f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f57174a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f57175b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f57176c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f57177d = MethodOptions.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f57178e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f57179f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MethodDescriptorProto methodDescriptorProto) throws IOException {
            if (methodDescriptorProto.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, methodDescriptorProto.mname);
            }
            if (methodDescriptorProto.minput_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, methodDescriptorProto.minput_type);
            }
            if (methodDescriptorProto.moutput_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, methodDescriptorProto.moutput_type);
            }
            if (methodDescriptorProto.moptions != null) {
                MethodOptions.ADAPTER.encodeWithTag(protoWriter, 4, methodDescriptorProto.moptions);
            }
            if (methodDescriptorProto.mclient_streaming != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, methodDescriptorProto.mclient_streaming);
            }
            if (methodDescriptorProto.mserver_streaming != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, methodDescriptorProto.mserver_streaming);
            }
            protoWriter.writeBytes(methodDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.MethodDescriptorProto$a */
    public static final class C23169a extends Message.Builder<MethodDescriptorProto, C23169a> {

        /* renamed from: a */
        public String f57174a;

        /* renamed from: b */
        public String f57175b;

        /* renamed from: c */
        public String f57176c;

        /* renamed from: d */
        public MethodOptions f57177d;

        /* renamed from: e */
        public Boolean f57178e;

        /* renamed from: f */
        public Boolean f57179f;

        /* renamed from: a */
        public MethodDescriptorProto build() {
            return new MethodDescriptorProto(this.f57174a, this.f57175b, this.f57176c, this.f57177d, this.f57178e, this.f57179f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23169a newBuilder() {
        C23169a aVar = new C23169a();
        aVar.f57174a = this.mname;
        aVar.f57175b = this.minput_type;
        aVar.f57176c = this.moutput_type;
        aVar.f57177d = this.moptions;
        aVar.f57178e = this.mclient_streaming;
        aVar.f57179f = this.mserver_streaming;
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
        if (this.minput_type != null) {
            sb.append(", input_type=");
            sb.append(this.minput_type);
        }
        if (this.moutput_type != null) {
            sb.append(", output_type=");
            sb.append(this.moutput_type);
        }
        if (this.moptions != null) {
            sb.append(", options=");
            sb.append(this.moptions);
        }
        if (this.mclient_streaming != null) {
            sb.append(", client_streaming=");
            sb.append(this.mclient_streaming);
        }
        if (this.mserver_streaming != null) {
            sb.append(", server_streaming=");
            sb.append(this.mserver_streaming);
        }
        StringBuilder replace = sb.replace(0, 2, "MethodDescriptorProto{");
        replace.append('}');
        return replace.toString();
    }

    public MethodDescriptorProto(String str, String str2, String str3, MethodOptions methodOptions, Boolean bool, Boolean bool2) {
        this(str, str2, str3, methodOptions, bool, bool2, ByteString.EMPTY);
    }

    public MethodDescriptorProto(String str, String str2, String str3, MethodOptions methodOptions, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.minput_type = str2;
        this.moutput_type = str3;
        this.moptions = methodOptions;
        this.mclient_streaming = bool;
        this.mserver_streaming = bool2;
    }
}

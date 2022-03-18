package com.google.protobuf;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MethodDescriptorProto extends Message<MethodDescriptorProto, C23080a> {
    public static final ProtoAdapter<MethodDescriptorProto> ADAPTER = new C23081b();
    public static final Boolean DEFAULT_CLIENT_STREAMING = false;
    public static final String DEFAULT_INPUT_TYPE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_OUTPUT_TYPE = "";
    public static final Boolean DEFAULT_SERVER_STREAMING = false;
    private static final long serialVersionUID = 0;
    public final Boolean client_streaming;
    public final String input_type;
    public final String name;
    public final MethodOptions options;
    public final String output_type;
    public final Boolean server_streaming;

    /* renamed from: com.google.protobuf.MethodDescriptorProto$b */
    private static final class C23081b extends ProtoAdapter<MethodDescriptorProto> {
        C23081b() {
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
            if (methodDescriptorProto.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, methodDescriptorProto.name);
            } else {
                i = 0;
            }
            if (methodDescriptorProto.input_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, methodDescriptorProto.input_type);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (methodDescriptorProto.output_type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, methodDescriptorProto.output_type);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (methodDescriptorProto.options != null) {
                i4 = MethodOptions.ADAPTER.encodedSizeWithTag(4, methodDescriptorProto.options);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (methodDescriptorProto.client_streaming != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, methodDescriptorProto.client_streaming);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (methodDescriptorProto.server_streaming != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, methodDescriptorProto.server_streaming);
            }
            return i10 + i6 + methodDescriptorProto.unknownFields().size();
        }

        /* renamed from: a */
        public MethodDescriptorProto decode(ProtoReader protoReader) throws IOException {
            C23080a aVar = new C23080a();
            aVar.f57000a = "";
            aVar.f57001b = "";
            aVar.f57002c = "";
            aVar.f57004e = false;
            aVar.f57005f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f57000a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f57001b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f57002c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f57003d = MethodOptions.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f57004e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f57005f = ProtoAdapter.BOOL.decode(protoReader);
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
            if (methodDescriptorProto.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, methodDescriptorProto.name);
            }
            if (methodDescriptorProto.input_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, methodDescriptorProto.input_type);
            }
            if (methodDescriptorProto.output_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, methodDescriptorProto.output_type);
            }
            if (methodDescriptorProto.options != null) {
                MethodOptions.ADAPTER.encodeWithTag(protoWriter, 4, methodDescriptorProto.options);
            }
            if (methodDescriptorProto.client_streaming != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, methodDescriptorProto.client_streaming);
            }
            if (methodDescriptorProto.server_streaming != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, methodDescriptorProto.server_streaming);
            }
            protoWriter.writeBytes(methodDescriptorProto.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.MethodDescriptorProto$a */
    public static final class C23080a extends Message.Builder<MethodDescriptorProto, C23080a> {

        /* renamed from: a */
        public String f57000a;

        /* renamed from: b */
        public String f57001b;

        /* renamed from: c */
        public String f57002c;

        /* renamed from: d */
        public MethodOptions f57003d;

        /* renamed from: e */
        public Boolean f57004e;

        /* renamed from: f */
        public Boolean f57005f;

        /* renamed from: a */
        public MethodDescriptorProto build() {
            return new MethodDescriptorProto(this.f57000a, this.f57001b, this.f57002c, this.f57003d, this.f57004e, this.f57005f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23080a newBuilder() {
        C23080a aVar = new C23080a();
        aVar.f57000a = this.name;
        aVar.f57001b = this.input_type;
        aVar.f57002c = this.output_type;
        aVar.f57003d = this.options;
        aVar.f57004e = this.client_streaming;
        aVar.f57005f = this.server_streaming;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "MethodDescriptorProto");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.input_type != null) {
            sb.append(", input_type=");
            sb.append(this.input_type);
        }
        if (this.output_type != null) {
            sb.append(", output_type=");
            sb.append(this.output_type);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (this.client_streaming != null) {
            sb.append(", client_streaming=");
            sb.append(this.client_streaming);
        }
        if (this.server_streaming != null) {
            sb.append(", server_streaming=");
            sb.append(this.server_streaming);
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
        this.name = str;
        this.input_type = str2;
        this.output_type = str3;
        this.options = methodOptions;
        this.client_streaming = bool;
        this.server_streaming = bool2;
    }
}

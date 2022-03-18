package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class OnFetchResponse extends Message<OnFetchResponse, C19743a> {
    public static final ProtoAdapter<OnFetchResponse> ADAPTER = new C19744b();
    private static final long serialVersionUID = 0;
    public final OnBodyResponse body_response;
    public final OnCancelResponse cancel_response;
    public final OnErrorResponse error_response;
    public final OnHeaderResponse header_response;
    public final OnProgressResponse progress_response;
    public final OnSuccessResponse success_response;

    public static final class OnErrorResponse extends Message<OnErrorResponse, C19733a> {
        public static final ProtoAdapter<OnErrorResponse> ADAPTER = new C19734b();
        public static final Code DEFAULT_CODE = Code.TIMEOUT;
        private static final long serialVersionUID = 0;
        public final Code code;
        public final String message;
        public final StageCost stage_cost;

        public enum Code implements WireEnum {
            TIMEOUT(1),
            OTHERS(2),
            SDK(3),
            OFFLINE(4),
            IO(5);
            
            public static final ProtoAdapter<Code> ADAPTER = ProtoAdapter.newEnumAdapter(Code.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Code fromValue(int i) {
                if (i == 1) {
                    return TIMEOUT;
                }
                if (i == 2) {
                    return OTHERS;
                }
                if (i == 3) {
                    return SDK;
                }
                if (i == 4) {
                    return OFFLINE;
                }
                if (i != 5) {
                    return null;
                }
                return IO;
            }

            private Code(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnErrorResponse$b */
        private static final class C19734b extends ProtoAdapter<OnErrorResponse> {
            C19734b() {
                super(FieldEncoding.LENGTH_DELIMITED, OnErrorResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(OnErrorResponse onErrorResponse) {
                int i;
                int i2;
                int i3 = 0;
                if (onErrorResponse.code != null) {
                    i = Code.ADAPTER.encodedSizeWithTag(1, onErrorResponse.code);
                } else {
                    i = 0;
                }
                if (onErrorResponse.message != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, onErrorResponse.message);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (onErrorResponse.stage_cost != null) {
                    i3 = StageCost.ADAPTER.encodedSizeWithTag(3, onErrorResponse.stage_cost);
                }
                return i4 + i3 + onErrorResponse.unknownFields().size();
            }

            /* renamed from: a */
            public OnErrorResponse decode(ProtoReader protoReader) throws IOException {
                C19733a aVar = new C19733a();
                aVar.f48192a = Code.TIMEOUT;
                aVar.f48193b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f48192a = Code.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f48193b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48194c = StageCost.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OnErrorResponse onErrorResponse) throws IOException {
                if (onErrorResponse.code != null) {
                    Code.ADAPTER.encodeWithTag(protoWriter, 1, onErrorResponse.code);
                }
                if (onErrorResponse.message != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, onErrorResponse.message);
                }
                if (onErrorResponse.stage_cost != null) {
                    StageCost.ADAPTER.encodeWithTag(protoWriter, 3, onErrorResponse.stage_cost);
                }
                protoWriter.writeBytes(onErrorResponse.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnErrorResponse$a */
        public static final class C19733a extends Message.Builder<OnErrorResponse, C19733a> {

            /* renamed from: a */
            public Code f48192a;

            /* renamed from: b */
            public String f48193b;

            /* renamed from: c */
            public StageCost f48194c;

            /* renamed from: a */
            public OnErrorResponse build() {
                return new OnErrorResponse(this.f48192a, this.f48193b, this.f48194c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19733a newBuilder() {
            C19733a aVar = new C19733a();
            aVar.f48192a = this.code;
            aVar.f48193b = this.message;
            aVar.f48194c = this.stage_cost;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "OnErrorResponse");
            StringBuilder sb = new StringBuilder();
            if (this.code != null) {
                sb.append(", code=");
                sb.append(this.code);
            }
            if (this.message != null) {
                sb.append(", message=");
                sb.append(this.message);
            }
            if (this.stage_cost != null) {
                sb.append(", stage_cost=");
                sb.append(this.stage_cost);
            }
            StringBuilder replace = sb.replace(0, 2, "OnErrorResponse{");
            replace.append('}');
            return replace.toString();
        }

        public OnErrorResponse(Code code2, String str, StageCost stageCost) {
            this(code2, str, stageCost, ByteString.EMPTY);
        }

        public OnErrorResponse(Code code2, String str, StageCost stageCost, ByteString byteString) {
            super(ADAPTER, byteString);
            this.code = code2;
            this.message = str;
            this.stage_cost = stageCost;
        }
    }

    public static final class OnHeaderResponse extends Message<OnHeaderResponse, C19735a> {
        public static final ProtoAdapter<OnHeaderResponse> ADAPTER = new C19736b();
        public static final Protocol DEFAULT_PROTOCOL = Protocol.UNKNOWN;
        public static final Integer DEFAULT_STATUS_CODE = 0;
        private static final long serialVersionUID = 0;
        public final List<HttpHeader> headers;
        public final Protocol protocol;
        public final Integer status_code;

        public enum Protocol implements WireEnum {
            UNKNOWN(0),
            HTTP_1_1(1),
            HTTP_2(2),
            QUIC(3);
            
            public static final ProtoAdapter<Protocol> ADAPTER = ProtoAdapter.newEnumAdapter(Protocol.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Protocol fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return HTTP_1_1;
                }
                if (i == 2) {
                    return HTTP_2;
                }
                if (i != 3) {
                    return null;
                }
                return QUIC;
            }

            private Protocol(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnHeaderResponse$b */
        private static final class C19736b extends ProtoAdapter<OnHeaderResponse> {
            C19736b() {
                super(FieldEncoding.LENGTH_DELIMITED, OnHeaderResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(OnHeaderResponse onHeaderResponse) {
                int i;
                int encodedSizeWithTag = HttpHeader.ADAPTER.asRepeated().encodedSizeWithTag(1, onHeaderResponse.headers);
                int i2 = 0;
                if (onHeaderResponse.status_code != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(2, onHeaderResponse.status_code);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (onHeaderResponse.protocol != null) {
                    i2 = Protocol.ADAPTER.encodedSizeWithTag(3, onHeaderResponse.protocol);
                }
                return i3 + i2 + onHeaderResponse.unknownFields().size();
            }

            /* renamed from: a */
            public OnHeaderResponse decode(ProtoReader protoReader) throws IOException {
                C19735a aVar = new C19735a();
                aVar.f48196b = 0;
                aVar.f48197c = Protocol.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48195a.add(HttpHeader.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f48196b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f48197c = Protocol.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OnHeaderResponse onHeaderResponse) throws IOException {
                HttpHeader.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, onHeaderResponse.headers);
                if (onHeaderResponse.status_code != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, onHeaderResponse.status_code);
                }
                if (onHeaderResponse.protocol != null) {
                    Protocol.ADAPTER.encodeWithTag(protoWriter, 3, onHeaderResponse.protocol);
                }
                protoWriter.writeBytes(onHeaderResponse.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnHeaderResponse$a */
        public static final class C19735a extends Message.Builder<OnHeaderResponse, C19735a> {

            /* renamed from: a */
            public List<HttpHeader> f48195a = Internal.newMutableList();

            /* renamed from: b */
            public Integer f48196b;

            /* renamed from: c */
            public Protocol f48197c;

            /* renamed from: a */
            public OnHeaderResponse build() {
                return new OnHeaderResponse(this.f48195a, this.f48196b, this.f48197c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19735a newBuilder() {
            C19735a aVar = new C19735a();
            aVar.f48195a = Internal.copyOf("headers", this.headers);
            aVar.f48196b = this.status_code;
            aVar.f48197c = this.protocol;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "OnHeaderResponse");
            StringBuilder sb = new StringBuilder();
            if (!this.headers.isEmpty()) {
                sb.append(", headers=");
                sb.append(this.headers);
            }
            if (this.status_code != null) {
                sb.append(", status_code=");
                sb.append(this.status_code);
            }
            if (this.protocol != null) {
                sb.append(", protocol=");
                sb.append(this.protocol);
            }
            StringBuilder replace = sb.replace(0, 2, "OnHeaderResponse{");
            replace.append('}');
            return replace.toString();
        }

        public OnHeaderResponse(List<HttpHeader> list, Integer num, Protocol protocol2) {
            this(list, num, protocol2, ByteString.EMPTY);
        }

        public OnHeaderResponse(List<HttpHeader> list, Integer num, Protocol protocol2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.headers = Internal.immutableCopyOf("headers", list);
            this.status_code = num;
            this.protocol = protocol2;
        }
    }

    public static final class OnBodyResponse extends Message<OnBodyResponse, C19729a> {
        public static final ProtoAdapter<OnBodyResponse> ADAPTER = new C19730b();
        public static final ByteString DEFAULT_BODY = ByteString.EMPTY;
        private static final long serialVersionUID = 0;
        public final ByteString body;

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnBodyResponse$b */
        private static final class C19730b extends ProtoAdapter<OnBodyResponse> {
            C19730b() {
                super(FieldEncoding.LENGTH_DELIMITED, OnBodyResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(OnBodyResponse onBodyResponse) {
                int i;
                if (onBodyResponse.body != null) {
                    i = ProtoAdapter.BYTES.encodedSizeWithTag(1, onBodyResponse.body);
                } else {
                    i = 0;
                }
                return i + onBodyResponse.unknownFields().size();
            }

            /* renamed from: a */
            public OnBodyResponse decode(ProtoReader protoReader) throws IOException {
                C19729a aVar = new C19729a();
                aVar.f48191a = ByteString.EMPTY;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48191a = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OnBodyResponse onBodyResponse) throws IOException {
                if (onBodyResponse.body != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, onBodyResponse.body);
                }
                protoWriter.writeBytes(onBodyResponse.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnBodyResponse$a */
        public static final class C19729a extends Message.Builder<OnBodyResponse, C19729a> {

            /* renamed from: a */
            public ByteString f48191a;

            /* renamed from: a */
            public OnBodyResponse build() {
                return new OnBodyResponse(this.f48191a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19729a newBuilder() {
            C19729a aVar = new C19729a();
            aVar.f48191a = this.body;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "OnBodyResponse");
            StringBuilder sb = new StringBuilder();
            if (this.body != null) {
                sb.append(", body=");
                sb.append(this.body);
            }
            StringBuilder replace = sb.replace(0, 2, "OnBodyResponse{");
            replace.append('}');
            return replace.toString();
        }

        public OnBodyResponse(ByteString byteString) {
            this(byteString, ByteString.EMPTY);
        }

        public OnBodyResponse(ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.body = byteString;
        }
    }

    public static final class OnCancelResponse extends Message<OnCancelResponse, C19731a> {
        public static final ProtoAdapter<OnCancelResponse> ADAPTER = new C19732b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnCancelResponse$b */
        private static final class C19732b extends ProtoAdapter<OnCancelResponse> {
            C19732b() {
                super(FieldEncoding.LENGTH_DELIMITED, OnCancelResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(OnCancelResponse onCancelResponse) {
                return onCancelResponse.unknownFields().size();
            }

            /* renamed from: a */
            public OnCancelResponse decode(ProtoReader protoReader) throws IOException {
                C19731a aVar = new C19731a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OnCancelResponse onCancelResponse) throws IOException {
                protoWriter.writeBytes(onCancelResponse.unknownFields());
            }
        }

        public OnCancelResponse() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnCancelResponse$a */
        public static final class C19731a extends Message.Builder<OnCancelResponse, C19731a> {
            /* renamed from: a */
            public OnCancelResponse build() {
                return new OnCancelResponse(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19731a newBuilder() {
            C19731a aVar = new C19731a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "OnCancelResponse");
            StringBuilder replace = new StringBuilder().replace(0, 2, "OnCancelResponse{");
            replace.append('}');
            return replace.toString();
        }

        public OnCancelResponse(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class OnProgressResponse extends Message<OnProgressResponse, C19737a> {
        public static final ProtoAdapter<OnProgressResponse> ADAPTER = new C19738b();
        public static final Integer DEFAULT_CONTENT_LENGTH = 0;
        public static final Integer DEFAULT_RECV_LENGTH = 0;
        private static final long serialVersionUID = 0;
        public final Integer content_length;
        public final Integer recv_length;

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnProgressResponse$b */
        private static final class C19738b extends ProtoAdapter<OnProgressResponse> {
            C19738b() {
                super(FieldEncoding.LENGTH_DELIMITED, OnProgressResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(OnProgressResponse onProgressResponse) {
                int i;
                int i2 = 0;
                if (onProgressResponse.recv_length != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, onProgressResponse.recv_length);
                } else {
                    i = 0;
                }
                if (onProgressResponse.content_length != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, onProgressResponse.content_length);
                }
                return i + i2 + onProgressResponse.unknownFields().size();
            }

            /* renamed from: a */
            public OnProgressResponse decode(ProtoReader protoReader) throws IOException {
                C19737a aVar = new C19737a();
                aVar.f48198a = 0;
                aVar.f48199b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48198a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48199b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OnProgressResponse onProgressResponse) throws IOException {
                if (onProgressResponse.recv_length != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, onProgressResponse.recv_length);
                }
                if (onProgressResponse.content_length != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, onProgressResponse.content_length);
                }
                protoWriter.writeBytes(onProgressResponse.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnProgressResponse$a */
        public static final class C19737a extends Message.Builder<OnProgressResponse, C19737a> {

            /* renamed from: a */
            public Integer f48198a;

            /* renamed from: b */
            public Integer f48199b;

            /* renamed from: a */
            public OnProgressResponse build() {
                return new OnProgressResponse(this.f48198a, this.f48199b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19737a newBuilder() {
            C19737a aVar = new C19737a();
            aVar.f48198a = this.recv_length;
            aVar.f48199b = this.content_length;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "OnProgressResponse");
            StringBuilder sb = new StringBuilder();
            if (this.recv_length != null) {
                sb.append(", recv_length=");
                sb.append(this.recv_length);
            }
            if (this.content_length != null) {
                sb.append(", content_length=");
                sb.append(this.content_length);
            }
            StringBuilder replace = sb.replace(0, 2, "OnProgressResponse{");
            replace.append('}');
            return replace.toString();
        }

        public OnProgressResponse(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public OnProgressResponse(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.recv_length = num;
            this.content_length = num2;
        }
    }

    public static final class OnSuccessResponse extends Message<OnSuccessResponse, C19739a> {
        public static final ProtoAdapter<OnSuccessResponse> ADAPTER = new C19740b();
        private static final long serialVersionUID = 0;
        public final String peer_addr;
        public final StageCost stage_cost;

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnSuccessResponse$b */
        private static final class C19740b extends ProtoAdapter<OnSuccessResponse> {
            C19740b() {
                super(FieldEncoding.LENGTH_DELIMITED, OnSuccessResponse.class);
            }

            /* renamed from: a */
            public int encodedSize(OnSuccessResponse onSuccessResponse) {
                int i;
                int i2 = 0;
                if (onSuccessResponse.stage_cost != null) {
                    i = StageCost.ADAPTER.encodedSizeWithTag(1, onSuccessResponse.stage_cost);
                } else {
                    i = 0;
                }
                if (onSuccessResponse.peer_addr != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, onSuccessResponse.peer_addr);
                }
                return i + i2 + onSuccessResponse.unknownFields().size();
            }

            /* renamed from: a */
            public OnSuccessResponse decode(ProtoReader protoReader) throws IOException {
                C19739a aVar = new C19739a();
                aVar.f48201b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48200a = StageCost.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48201b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OnSuccessResponse onSuccessResponse) throws IOException {
                if (onSuccessResponse.stage_cost != null) {
                    StageCost.ADAPTER.encodeWithTag(protoWriter, 1, onSuccessResponse.stage_cost);
                }
                if (onSuccessResponse.peer_addr != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, onSuccessResponse.peer_addr);
                }
                protoWriter.writeBytes(onSuccessResponse.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$OnSuccessResponse$a */
        public static final class C19739a extends Message.Builder<OnSuccessResponse, C19739a> {

            /* renamed from: a */
            public StageCost f48200a;

            /* renamed from: b */
            public String f48201b;

            /* renamed from: a */
            public OnSuccessResponse build() {
                return new OnSuccessResponse(this.f48200a, this.f48201b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19739a newBuilder() {
            C19739a aVar = new C19739a();
            aVar.f48200a = this.stage_cost;
            aVar.f48201b = this.peer_addr;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "OnSuccessResponse");
            StringBuilder sb = new StringBuilder();
            if (this.stage_cost != null) {
                sb.append(", stage_cost=");
                sb.append(this.stage_cost);
            }
            if (this.peer_addr != null) {
                sb.append(", peer_addr=");
                sb.append(this.peer_addr);
            }
            StringBuilder replace = sb.replace(0, 2, "OnSuccessResponse{");
            replace.append('}');
            return replace.toString();
        }

        public OnSuccessResponse(StageCost stageCost, String str) {
            this(stageCost, str, ByteString.EMPTY);
        }

        public OnSuccessResponse(StageCost stageCost, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.stage_cost = stageCost;
            this.peer_addr = str;
        }
    }

    public static final class StageCost extends Message<StageCost, C19741a> {
        public static final ProtoAdapter<StageCost> ADAPTER = new C19742b();
        public static final Integer DEFAULT_DNS_COST = 0;
        public static final Integer DEFAULT_TCP_CONNECT_COST = 0;
        public static final Integer DEFAULT_TLS_COST = 0;
        private static final long serialVersionUID = 0;
        public final Integer dns_cost;
        public final Integer tcp_connect_cost;
        public final Integer tls_cost;

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$StageCost$b */
        private static final class C19742b extends ProtoAdapter<StageCost> {
            C19742b() {
                super(FieldEncoding.LENGTH_DELIMITED, StageCost.class);
            }

            /* renamed from: a */
            public int encodedSize(StageCost stageCost) {
                int i;
                int i2;
                int i3 = 0;
                if (stageCost.dns_cost != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, stageCost.dns_cost);
                } else {
                    i = 0;
                }
                if (stageCost.tcp_connect_cost != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, stageCost.tcp_connect_cost);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (stageCost.tls_cost != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, stageCost.tls_cost);
                }
                return i4 + i3 + stageCost.unknownFields().size();
            }

            /* renamed from: a */
            public StageCost decode(ProtoReader protoReader) throws IOException {
                C19741a aVar = new C19741a();
                aVar.f48202a = 0;
                aVar.f48203b = 0;
                aVar.f48204c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48202a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f48203b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48204c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, StageCost stageCost) throws IOException {
                if (stageCost.dns_cost != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, stageCost.dns_cost);
                }
                if (stageCost.tcp_connect_cost != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, stageCost.tcp_connect_cost);
                }
                if (stageCost.tls_cost != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, stageCost.tls_cost);
                }
                protoWriter.writeBytes(stageCost.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$StageCost$a */
        public static final class C19741a extends Message.Builder<StageCost, C19741a> {

            /* renamed from: a */
            public Integer f48202a;

            /* renamed from: b */
            public Integer f48203b;

            /* renamed from: c */
            public Integer f48204c;

            /* renamed from: a */
            public StageCost build() {
                return new StageCost(this.f48202a, this.f48203b, this.f48204c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19741a newBuilder() {
            C19741a aVar = new C19741a();
            aVar.f48202a = this.dns_cost;
            aVar.f48203b = this.tcp_connect_cost;
            aVar.f48204c = this.tls_cost;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("tool", "StageCost");
            StringBuilder sb = new StringBuilder();
            if (this.dns_cost != null) {
                sb.append(", dns_cost=");
                sb.append(this.dns_cost);
            }
            if (this.tcp_connect_cost != null) {
                sb.append(", tcp_connect_cost=");
                sb.append(this.tcp_connect_cost);
            }
            if (this.tls_cost != null) {
                sb.append(", tls_cost=");
                sb.append(this.tls_cost);
            }
            StringBuilder replace = sb.replace(0, 2, "StageCost{");
            replace.append('}');
            return replace.toString();
        }

        public StageCost(Integer num, Integer num2, Integer num3) {
            this(num, num2, num3, ByteString.EMPTY);
        }

        public StageCost(Integer num, Integer num2, Integer num3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.dns_cost = num;
            this.tcp_connect_cost = num2;
            this.tls_cost = num3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$b */
    private static final class C19744b extends ProtoAdapter<OnFetchResponse> {
        C19744b() {
            super(FieldEncoding.LENGTH_DELIMITED, OnFetchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(OnFetchResponse onFetchResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (onFetchResponse.header_response != null) {
                i = OnHeaderResponse.ADAPTER.encodedSizeWithTag(1, onFetchResponse.header_response);
            } else {
                i = 0;
            }
            if (onFetchResponse.body_response != null) {
                i2 = OnBodyResponse.ADAPTER.encodedSizeWithTag(2, onFetchResponse.body_response);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (onFetchResponse.error_response != null) {
                i3 = OnErrorResponse.ADAPTER.encodedSizeWithTag(3, onFetchResponse.error_response);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (onFetchResponse.success_response != null) {
                i4 = OnSuccessResponse.ADAPTER.encodedSizeWithTag(4, onFetchResponse.success_response);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (onFetchResponse.cancel_response != null) {
                i5 = OnCancelResponse.ADAPTER.encodedSizeWithTag(5, onFetchResponse.cancel_response);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (onFetchResponse.progress_response != null) {
                i6 = OnProgressResponse.ADAPTER.encodedSizeWithTag(6, onFetchResponse.progress_response);
            }
            return i10 + i6 + onFetchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public OnFetchResponse decode(ProtoReader protoReader) throws IOException {
            C19743a aVar = new C19743a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.mo66886a(OnHeaderResponse.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.mo66883a(OnBodyResponse.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.mo66885a(OnErrorResponse.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.mo66888a(OnSuccessResponse.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.mo66884a(OnCancelResponse.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo66887a(OnProgressResponse.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, OnFetchResponse onFetchResponse) throws IOException {
            if (onFetchResponse.header_response != null) {
                OnHeaderResponse.ADAPTER.encodeWithTag(protoWriter, 1, onFetchResponse.header_response);
            }
            if (onFetchResponse.body_response != null) {
                OnBodyResponse.ADAPTER.encodeWithTag(protoWriter, 2, onFetchResponse.body_response);
            }
            if (onFetchResponse.error_response != null) {
                OnErrorResponse.ADAPTER.encodeWithTag(protoWriter, 3, onFetchResponse.error_response);
            }
            if (onFetchResponse.success_response != null) {
                OnSuccessResponse.ADAPTER.encodeWithTag(protoWriter, 4, onFetchResponse.success_response);
            }
            if (onFetchResponse.cancel_response != null) {
                OnCancelResponse.ADAPTER.encodeWithTag(protoWriter, 5, onFetchResponse.cancel_response);
            }
            if (onFetchResponse.progress_response != null) {
                OnProgressResponse.ADAPTER.encodeWithTag(protoWriter, 6, onFetchResponse.progress_response);
            }
            protoWriter.writeBytes(onFetchResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19743a newBuilder() {
        C19743a aVar = new C19743a();
        aVar.f48205a = this.header_response;
        aVar.f48206b = this.body_response;
        aVar.f48207c = this.error_response;
        aVar.f48208d = this.success_response;
        aVar.f48209e = this.cancel_response;
        aVar.f48210f = this.progress_response;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "OnFetchResponse");
        StringBuilder sb = new StringBuilder();
        if (this.header_response != null) {
            sb.append(", header_response=");
            sb.append(this.header_response);
        }
        if (this.body_response != null) {
            sb.append(", body_response=");
            sb.append(this.body_response);
        }
        if (this.error_response != null) {
            sb.append(", error_response=");
            sb.append(this.error_response);
        }
        if (this.success_response != null) {
            sb.append(", success_response=");
            sb.append(this.success_response);
        }
        if (this.cancel_response != null) {
            sb.append(", cancel_response=");
            sb.append(this.cancel_response);
        }
        if (this.progress_response != null) {
            sb.append(", progress_response=");
            sb.append(this.progress_response);
        }
        StringBuilder replace = sb.replace(0, 2, "OnFetchResponse{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.OnFetchResponse$a */
    public static final class C19743a extends Message.Builder<OnFetchResponse, C19743a> {

        /* renamed from: a */
        public OnHeaderResponse f48205a;

        /* renamed from: b */
        public OnBodyResponse f48206b;

        /* renamed from: c */
        public OnErrorResponse f48207c;

        /* renamed from: d */
        public OnSuccessResponse f48208d;

        /* renamed from: e */
        public OnCancelResponse f48209e;

        /* renamed from: f */
        public OnProgressResponse f48210f;

        /* renamed from: a */
        public OnFetchResponse build() {
            return new OnFetchResponse(this.f48205a, this.f48206b, this.f48207c, this.f48208d, this.f48209e, this.f48210f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19743a mo66883a(OnBodyResponse onBodyResponse) {
            this.f48206b = onBodyResponse;
            this.f48205a = null;
            this.f48207c = null;
            this.f48208d = null;
            this.f48209e = null;
            this.f48210f = null;
            return this;
        }

        /* renamed from: a */
        public C19743a mo66884a(OnCancelResponse onCancelResponse) {
            this.f48209e = onCancelResponse;
            this.f48205a = null;
            this.f48206b = null;
            this.f48207c = null;
            this.f48208d = null;
            this.f48210f = null;
            return this;
        }

        /* renamed from: a */
        public C19743a mo66885a(OnErrorResponse onErrorResponse) {
            this.f48207c = onErrorResponse;
            this.f48205a = null;
            this.f48206b = null;
            this.f48208d = null;
            this.f48209e = null;
            this.f48210f = null;
            return this;
        }

        /* renamed from: a */
        public C19743a mo66886a(OnHeaderResponse onHeaderResponse) {
            this.f48205a = onHeaderResponse;
            this.f48206b = null;
            this.f48207c = null;
            this.f48208d = null;
            this.f48209e = null;
            this.f48210f = null;
            return this;
        }

        /* renamed from: a */
        public C19743a mo66887a(OnProgressResponse onProgressResponse) {
            this.f48210f = onProgressResponse;
            this.f48205a = null;
            this.f48206b = null;
            this.f48207c = null;
            this.f48208d = null;
            this.f48209e = null;
            return this;
        }

        /* renamed from: a */
        public C19743a mo66888a(OnSuccessResponse onSuccessResponse) {
            this.f48208d = onSuccessResponse;
            this.f48205a = null;
            this.f48206b = null;
            this.f48207c = null;
            this.f48209e = null;
            this.f48210f = null;
            return this;
        }
    }

    public OnFetchResponse(OnHeaderResponse onHeaderResponse, OnBodyResponse onBodyResponse, OnErrorResponse onErrorResponse, OnSuccessResponse onSuccessResponse, OnCancelResponse onCancelResponse, OnProgressResponse onProgressResponse) {
        this(onHeaderResponse, onBodyResponse, onErrorResponse, onSuccessResponse, onCancelResponse, onProgressResponse, ByteString.EMPTY);
    }

    public OnFetchResponse(OnHeaderResponse onHeaderResponse, OnBodyResponse onBodyResponse, OnErrorResponse onErrorResponse, OnSuccessResponse onSuccessResponse, OnCancelResponse onCancelResponse, OnProgressResponse onProgressResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(onHeaderResponse, onBodyResponse, onErrorResponse, onSuccessResponse, onCancelResponse, onProgressResponse) <= 1) {
            this.header_response = onHeaderResponse;
            this.body_response = onBodyResponse;
            this.error_response = onErrorResponse;
            this.success_response = onSuccessResponse;
            this.cancel_response = onCancelResponse;
            this.progress_response = onProgressResponse;
            return;
        }
        throw new IllegalArgumentException("at most one of header_response, body_response, error_response, success_response, cancel_response, progress_response may be non-null");
    }
}

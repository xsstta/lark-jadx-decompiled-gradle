package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class UrlPreviewAction extends Message<UrlPreviewAction, C15426a> {
    public static final ProtoAdapter<UrlPreviewAction> ADAPTER = new C15427b();
    public static final Integer DEFAULT_CMD = 0;
    public static final Method DEFAULT_METHOD = Method.GET;
    private static final long serialVersionUID = 0;
    public final Integer cmd;
    public final String fallback_action_id;
    public final Method method;
    public final URL open_url;
    public final CardActionPacket packet;
    public final Parameters parameters;
    public final String url;

    public enum Method implements WireEnum {
        GET(1),
        POST(2),
        LARK_COMMAND(3),
        OPEN_URL(4);
        
        public static final ProtoAdapter<Method> ADAPTER = ProtoAdapter.newEnumAdapter(Method.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            if (i == 1) {
                return GET;
            }
            if (i == 2) {
                return POST;
            }
            if (i == 3) {
                return LARK_COMMAND;
            }
            if (i != 4) {
                return null;
            }
            return OPEN_URL;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewAction$b */
    private static final class C15427b extends ProtoAdapter<UrlPreviewAction> {
        C15427b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlPreviewAction.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlPreviewAction urlPreviewAction) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, urlPreviewAction.url) + Method.ADAPTER.encodedSizeWithTag(2, urlPreviewAction.method);
            int i5 = 0;
            if (urlPreviewAction.parameters != null) {
                i = Parameters.ADAPTER.encodedSizeWithTag(3, urlPreviewAction.parameters);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (urlPreviewAction.cmd != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, urlPreviewAction.cmd);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (urlPreviewAction.packet != null) {
                i3 = CardActionPacket.ADAPTER.encodedSizeWithTag(5, urlPreviewAction.packet);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (urlPreviewAction.open_url != null) {
                i4 = URL.ADAPTER.encodedSizeWithTag(6, urlPreviewAction.open_url);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (urlPreviewAction.fallback_action_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, urlPreviewAction.fallback_action_id);
            }
            return i9 + i5 + urlPreviewAction.unknownFields().size();
        }

        /* renamed from: a */
        public UrlPreviewAction decode(ProtoReader protoReader) throws IOException {
            C15426a aVar = new C15426a();
            aVar.f40818a = "";
            aVar.f40819b = Method.GET;
            aVar.f40821d = 0;
            aVar.f40824g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40818a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f40819b = Method.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f40820c = Parameters.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f40821d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f40822e = CardActionPacket.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f40823f = URL.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f40824g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UrlPreviewAction urlPreviewAction) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlPreviewAction.url);
            Method.ADAPTER.encodeWithTag(protoWriter, 2, urlPreviewAction.method);
            if (urlPreviewAction.parameters != null) {
                Parameters.ADAPTER.encodeWithTag(protoWriter, 3, urlPreviewAction.parameters);
            }
            if (urlPreviewAction.cmd != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, urlPreviewAction.cmd);
            }
            if (urlPreviewAction.packet != null) {
                CardActionPacket.ADAPTER.encodeWithTag(protoWriter, 5, urlPreviewAction.packet);
            }
            if (urlPreviewAction.open_url != null) {
                URL.ADAPTER.encodeWithTag(protoWriter, 6, urlPreviewAction.open_url);
            }
            if (urlPreviewAction.fallback_action_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, urlPreviewAction.fallback_action_id);
            }
            protoWriter.writeBytes(urlPreviewAction.unknownFields());
        }
    }

    public static final class Parameters extends Message<Parameters, C15424a> {
        public static final ProtoAdapter<Parameters> ADAPTER = new C15425b();
        private static final long serialVersionUID = 0;
        public final Map<String, String> parameters;
        public final String preview_id;
        public final String source_id;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewAction$Parameters$a */
        public static final class C15424a extends Message.Builder<Parameters, C15424a> {

            /* renamed from: a */
            public Map<String, String> f40813a = Internal.newMutableMap();

            /* renamed from: b */
            public String f40814b;

            /* renamed from: c */
            public String f40815c;

            /* renamed from: d */
            public String f40816d;

            /* renamed from: a */
            public Parameters build() {
                return new Parameters(this.f40813a, this.f40814b, this.f40815c, this.f40816d, super.buildUnknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewAction$Parameters$b */
        private static final class C15425b extends ProtoAdapter<Parameters> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, String>> f40817a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

            C15425b() {
                super(FieldEncoding.LENGTH_DELIMITED, Parameters.class);
            }

            /* renamed from: a */
            public int encodedSize(Parameters parameters) {
                int i;
                int i2;
                int encodedSizeWithTag = this.f40817a.encodedSizeWithTag(1, parameters.parameters);
                int i3 = 0;
                if (parameters.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, parameters.user_id);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (parameters.source_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, parameters.source_id);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (parameters.preview_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, parameters.preview_id);
                }
                return i5 + i3 + parameters.unknownFields().size();
            }

            /* renamed from: a */
            public Parameters decode(ProtoReader protoReader) throws IOException {
                C15424a aVar = new C15424a();
                aVar.f40814b = "";
                aVar.f40815c = "";
                aVar.f40816d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40813a.putAll(this.f40817a.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.f40814b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f40815c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40816d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Parameters parameters) throws IOException {
                this.f40817a.encodeWithTag(protoWriter, 1, parameters.parameters);
                if (parameters.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, parameters.user_id);
                }
                if (parameters.source_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, parameters.source_id);
                }
                if (parameters.preview_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, parameters.preview_id);
                }
                protoWriter.writeBytes(parameters.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15424a newBuilder() {
            C15424a aVar = new C15424a();
            aVar.f40813a = Internal.copyOf("parameters", this.parameters);
            aVar.f40814b = this.user_id;
            aVar.f40815c = this.source_id;
            aVar.f40816d = this.preview_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Parameters");
            StringBuilder sb = new StringBuilder();
            if (!this.parameters.isEmpty()) {
                sb.append(", parameters=");
                sb.append(this.parameters);
            }
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            if (this.source_id != null) {
                sb.append(", source_id=");
                sb.append(this.source_id);
            }
            if (this.preview_id != null) {
                sb.append(", preview_id=");
                sb.append(this.preview_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Parameters{");
            replace.append('}');
            return replace.toString();
        }

        public Parameters(Map<String, String> map, String str, String str2, String str3) {
            this(map, str, str2, str3, ByteString.EMPTY);
        }

        public Parameters(Map<String, String> map, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.parameters = Internal.immutableCopyOf("parameters", map);
            this.user_id = str;
            this.source_id = str2;
            this.preview_id = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UrlPreviewAction$a */
    public static final class C15426a extends Message.Builder<UrlPreviewAction, C15426a> {

        /* renamed from: a */
        public String f40818a;

        /* renamed from: b */
        public Method f40819b;

        /* renamed from: c */
        public Parameters f40820c;

        /* renamed from: d */
        public Integer f40821d;

        /* renamed from: e */
        public CardActionPacket f40822e;

        /* renamed from: f */
        public URL f40823f;

        /* renamed from: g */
        public String f40824g;

        /* renamed from: a */
        public UrlPreviewAction build() {
            Method method;
            String str = this.f40818a;
            if (str != null && (method = this.f40819b) != null) {
                return new UrlPreviewAction(str, method, this.f40820c, this.f40821d, this.f40822e, this.f40823f, this.f40824g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url", this.f40819b, "method");
        }
    }

    @Override // com.squareup.wire.Message
    public C15426a newBuilder() {
        C15426a aVar = new C15426a();
        aVar.f40818a = this.url;
        aVar.f40819b = this.method;
        aVar.f40820c = this.parameters;
        aVar.f40821d = this.cmd;
        aVar.f40822e = this.packet;
        aVar.f40823f = this.open_url;
        aVar.f40824g = this.fallback_action_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "UrlPreviewAction");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        if (this.parameters != null) {
            sb.append(", parameters=");
            sb.append(this.parameters);
        }
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.packet != null) {
            sb.append(", packet=");
            sb.append(this.packet);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        if (this.fallback_action_id != null) {
            sb.append(", fallback_action_id=");
            sb.append(this.fallback_action_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlPreviewAction{");
        replace.append('}');
        return replace.toString();
    }

    public UrlPreviewAction(String str, Method method2, Parameters parameters2, Integer num, CardActionPacket cardActionPacket, URL url2, String str2) {
        this(str, method2, parameters2, num, cardActionPacket, url2, str2, ByteString.EMPTY);
    }

    public UrlPreviewAction(String str, Method method2, Parameters parameters2, Integer num, CardActionPacket cardActionPacket, URL url2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.method = method2;
        this.parameters = parameters2;
        this.cmd = num;
        this.packet = cardActionPacket;
        this.open_url = url2;
        this.fallback_action_id = str2;
    }
}

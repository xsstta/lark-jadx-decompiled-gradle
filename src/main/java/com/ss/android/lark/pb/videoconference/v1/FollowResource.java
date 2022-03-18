package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FollowResource extends Message<FollowResource, C50575a> {
    public static final ProtoAdapter<FollowResource> ADAPTER = new C50576b();
    public static final Boolean DEFAULT_IS_ENTRY = false;
    public static final JsContext DEFAULT_JS_CONTEXT = JsContext.UNKNOWN_CONTEXT;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final String content;
    public final String id;
    public final Boolean is_entry;
    public final JsContext js_context;
    public final String path;
    public final Type type;
    public final String version;

    public enum JsContext implements WireEnum {
        UNKNOWN_CONTEXT(0),
        PREFER_PRELOAD(1),
        WEBVIEW(2);
        
        public static final ProtoAdapter<JsContext> ADAPTER = ProtoAdapter.newEnumAdapter(JsContext.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JsContext fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_CONTEXT;
            }
            if (i == 1) {
                return PREFER_PRELOAD;
            }
            if (i != 2) {
                return null;
            }
            return WEBVIEW;
        }

        private JsContext(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        JS_TYPE(1),
        JSON_STRING_TYPE(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return JS_TYPE;
            }
            if (i != 2) {
                return null;
            }
            return JSON_STRING_TYPE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowResource$b */
    private static final class C50576b extends ProtoAdapter<FollowResource> {
        C50576b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowResource.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowResource followResource) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, followResource.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, followResource.version);
            int i5 = 0;
            if (followResource.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(3, followResource.type);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (followResource.content != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, followResource.content);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (followResource.path != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, followResource.path);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (followResource.is_entry != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, followResource.is_entry);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (followResource.js_context != null) {
                i5 = JsContext.ADAPTER.encodedSizeWithTag(7, followResource.js_context);
            }
            return i9 + i5 + followResource.unknownFields().size();
        }

        /* renamed from: a */
        public FollowResource decode(ProtoReader protoReader) throws IOException {
            C50575a aVar = new C50575a();
            aVar.f126253a = "";
            aVar.f126254b = "";
            aVar.f126255c = Type.UNKNOWN_TYPE;
            aVar.f126256d = "";
            aVar.f126257e = "";
            aVar.f126258f = false;
            aVar.f126259g = JsContext.UNKNOWN_CONTEXT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126253a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126254b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f126255c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f126256d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126257e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126258f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f126259g = JsContext.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, FollowResource followResource) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followResource.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followResource.version);
            if (followResource.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, followResource.type);
            }
            if (followResource.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, followResource.content);
            }
            if (followResource.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, followResource.path);
            }
            if (followResource.is_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, followResource.is_entry);
            }
            if (followResource.js_context != null) {
                JsContext.ADAPTER.encodeWithTag(protoWriter, 7, followResource.js_context);
            }
            protoWriter.writeBytes(followResource.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowResource$a */
    public static final class C50575a extends Message.Builder<FollowResource, C50575a> {

        /* renamed from: a */
        public String f126253a;

        /* renamed from: b */
        public String f126254b;

        /* renamed from: c */
        public Type f126255c;

        /* renamed from: d */
        public String f126256d;

        /* renamed from: e */
        public String f126257e;

        /* renamed from: f */
        public Boolean f126258f;

        /* renamed from: g */
        public JsContext f126259g;

        /* renamed from: a */
        public FollowResource build() {
            String str;
            String str2 = this.f126253a;
            if (str2 != null && (str = this.f126254b) != null) {
                return new FollowResource(str2, str, this.f126255c, this.f126256d, this.f126257e, this.f126258f, this.f126259g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f126254b, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        }
    }

    @Override // com.squareup.wire.Message
    public C50575a newBuilder() {
        C50575a aVar = new C50575a();
        aVar.f126253a = this.id;
        aVar.f126254b = this.version;
        aVar.f126255c = this.type;
        aVar.f126256d = this.content;
        aVar.f126257e = this.path;
        aVar.f126258f = this.is_entry;
        aVar.f126259g = this.js_context;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowResource");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", version=");
        sb.append(this.version);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.is_entry != null) {
            sb.append(", is_entry=");
            sb.append(this.is_entry);
        }
        if (this.js_context != null) {
            sb.append(", js_context=");
            sb.append(this.js_context);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowResource{");
        replace.append('}');
        return replace.toString();
    }

    public FollowResource(String str, String str2, Type type2, String str3, String str4, Boolean bool, JsContext jsContext) {
        this(str, str2, type2, str3, str4, bool, jsContext, ByteString.EMPTY);
    }

    public FollowResource(String str, String str2, Type type2, String str3, String str4, Boolean bool, JsContext jsContext, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.version = str2;
        this.type = type2;
        this.content = str3;
        this.path = str4;
        this.is_entry = bool;
        this.js_context = jsContext;
    }
}

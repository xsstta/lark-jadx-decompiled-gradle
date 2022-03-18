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
import java.util.Map;
import okio.ByteString;

public final class SetLogBySDKRequest extends Message<SetLogBySDKRequest, C19755a> {
    public static final ProtoAdapter<SetLogBySDKRequest> ADAPTER = new C19756b();
    public static final Level DEFAULT_LEVEL = Level.Unknown;
    private static final long serialVersionUID = 0;
    public final Map<String, String> extra;
    public final Level level;
    public final String message;
    public final String tag;

    public enum Level implements WireEnum {
        Unknown(0),
        Error(1),
        Warn(2),
        Info(3),
        Debug(4),
        Trace(5);
        
        public static final ProtoAdapter<Level> ADAPTER = ProtoAdapter.newEnumAdapter(Level.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Level fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return Error;
            }
            if (i == 2) {
                return Warn;
            }
            if (i == 3) {
                return Info;
            }
            if (i == 4) {
                return Debug;
            }
            if (i != 5) {
                return null;
            }
            return Trace;
        }

        private Level(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetLogBySDKRequest$b */
    private static final class C19756b extends ProtoAdapter<SetLogBySDKRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f48224a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C19756b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetLogBySDKRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetLogBySDKRequest setLogBySDKRequest) {
            return Level.ADAPTER.encodedSizeWithTag(1, setLogBySDKRequest.level) + ProtoAdapter.STRING.encodedSizeWithTag(2, setLogBySDKRequest.tag) + ProtoAdapter.STRING.encodedSizeWithTag(3, setLogBySDKRequest.message) + this.f48224a.encodedSizeWithTag(4, setLogBySDKRequest.extra) + setLogBySDKRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetLogBySDKRequest decode(ProtoReader protoReader) throws IOException {
            C19755a aVar = new C19755a();
            aVar.f48220a = Level.Unknown;
            aVar.f48221b = "";
            aVar.f48222c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f48220a = Level.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f48221b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48222c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48223d.putAll(this.f48224a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetLogBySDKRequest setLogBySDKRequest) throws IOException {
            Level.ADAPTER.encodeWithTag(protoWriter, 1, setLogBySDKRequest.level);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setLogBySDKRequest.tag);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setLogBySDKRequest.message);
            this.f48224a.encodeWithTag(protoWriter, 4, setLogBySDKRequest.extra);
            protoWriter.writeBytes(setLogBySDKRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetLogBySDKRequest$a */
    public static final class C19755a extends Message.Builder<SetLogBySDKRequest, C19755a> {

        /* renamed from: a */
        public Level f48220a;

        /* renamed from: b */
        public String f48221b;

        /* renamed from: c */
        public String f48222c;

        /* renamed from: d */
        public Map<String, String> f48223d = Internal.newMutableMap();

        /* renamed from: a */
        public SetLogBySDKRequest build() {
            String str;
            String str2;
            Level level = this.f48220a;
            if (level != null && (str = this.f48221b) != null && (str2 = this.f48222c) != null) {
                return new SetLogBySDKRequest(level, str, str2, this.f48223d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(level, "level", this.f48221b, "tag", this.f48222c, "message");
        }

        /* renamed from: a */
        public C19755a mo66916a(Level level) {
            this.f48220a = level;
            return this;
        }

        /* renamed from: b */
        public C19755a mo66920b(String str) {
            this.f48222c = str;
            return this;
        }

        /* renamed from: a */
        public C19755a mo66917a(String str) {
            this.f48221b = str;
            return this;
        }

        /* renamed from: a */
        public C19755a mo66918a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f48223d = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19755a newBuilder() {
        C19755a aVar = new C19755a();
        aVar.f48220a = this.level;
        aVar.f48221b = this.tag;
        aVar.f48222c = this.message;
        aVar.f48223d = Internal.copyOf("extra", this.extra);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetLogBySDKRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", message=");
        sb.append(this.message);
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "SetLogBySDKRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetLogBySDKRequest(Level level2, String str, String str2, Map<String, String> map) {
        this(level2, str, str2, map, ByteString.EMPTY);
    }

    public SetLogBySDKRequest(Level level2, String str, String str2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.level = level2;
        this.tag = str;
        this.message = str2;
        this.extra = Internal.immutableCopyOf("extra", map);
    }
}

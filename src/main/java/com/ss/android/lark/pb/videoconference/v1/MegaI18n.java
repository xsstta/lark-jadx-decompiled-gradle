package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MegaI18n extends Message<MegaI18n, C50875a> {
    public static final ProtoAdapter<MegaI18n> ADAPTER = new C50876b();
    private static final long serialVersionUID = 0;
    public final Map<String, i18nData> data;
    public final String key;

    public static final class i18nData extends Message<i18nData, C50877a> {
        public static final ProtoAdapter<i18nData> ADAPTER = new C50878b();
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String payload;
        public final Type type;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            STRING(1),
            LINK(2),
            CLICK(3),
            EM(4);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return STRING;
                }
                if (i == 2) {
                    return LINK;
                }
                if (i == 3) {
                    return CLICK;
                }
                if (i != 4) {
                    return null;
                }
                return EM;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MegaI18n$i18nData$b */
        private static final class C50878b extends ProtoAdapter<i18nData> {
            C50878b() {
                super(FieldEncoding.LENGTH_DELIMITED, i18nData.class);
            }

            /* renamed from: a */
            public int encodedSize(i18nData i18ndata) {
                int i;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, i18ndata.type);
                if (i18ndata.payload != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, i18ndata.payload);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + i18ndata.unknownFields().size();
            }

            /* renamed from: a */
            public i18nData decode(ProtoReader protoReader) throws IOException {
                C50877a aVar = new C50877a();
                aVar.f126801a = Type.UNKNOWN;
                aVar.f126802b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126801a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126802b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, i18nData i18ndata) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, i18ndata.type);
                if (i18ndata.payload != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, i18ndata.payload);
                }
                protoWriter.writeBytes(i18ndata.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MegaI18n$i18nData$a */
        public static final class C50877a extends Message.Builder<i18nData, C50877a> {

            /* renamed from: a */
            public Type f126801a;

            /* renamed from: b */
            public String f126802b;

            /* renamed from: a */
            public i18nData build() {
                Type type = this.f126801a;
                if (type != null) {
                    return new i18nData(type, this.f126802b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
            }
        }

        @Override // com.squareup.wire.Message
        public C50877a newBuilder() {
            C50877a aVar = new C50877a();
            aVar.f126801a = this.type;
            aVar.f126802b = this.payload;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "i18nData");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            if (this.payload != null) {
                sb.append(", payload=");
                sb.append(this.payload);
            }
            StringBuilder replace = sb.replace(0, 2, "i18nData{");
            replace.append('}');
            return replace.toString();
        }

        public i18nData(Type type2, String str) {
            this(type2, str, ByteString.EMPTY);
        }

        public i18nData(Type type2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.payload = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MegaI18n$a */
    public static final class C50875a extends Message.Builder<MegaI18n, C50875a> {

        /* renamed from: a */
        public String f126798a;

        /* renamed from: b */
        public Map<String, i18nData> f126799b = Internal.newMutableMap();

        /* renamed from: a */
        public MegaI18n build() {
            String str = this.f126798a;
            if (str != null) {
                return new MegaI18n(str, this.f126799b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MegaI18n$b */
    private static final class C50876b extends ProtoAdapter<MegaI18n> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, i18nData>> f126800a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, i18nData.ADAPTER);

        C50876b() {
            super(FieldEncoding.LENGTH_DELIMITED, MegaI18n.class);
        }

        /* renamed from: a */
        public int encodedSize(MegaI18n megaI18n) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, megaI18n.key) + this.f126800a.encodedSizeWithTag(2, megaI18n.data) + megaI18n.unknownFields().size();
        }

        /* renamed from: a */
        public MegaI18n decode(ProtoReader protoReader) throws IOException {
            C50875a aVar = new C50875a();
            aVar.f126798a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126798a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126799b.putAll(this.f126800a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MegaI18n megaI18n) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, megaI18n.key);
            this.f126800a.encodeWithTag(protoWriter, 2, megaI18n.data);
            protoWriter.writeBytes(megaI18n.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50875a newBuilder() {
        C50875a aVar = new C50875a();
        aVar.f126798a = this.key;
        aVar.f126799b = Internal.copyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.data);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MegaI18n");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (!this.data.isEmpty()) {
            sb.append(", data=");
            sb.append(this.data);
        }
        StringBuilder replace = sb.replace(0, 2, "MegaI18n{");
        replace.append('}');
        return replace.toString();
    }

    public MegaI18n(String str, Map<String, i18nData> map) {
        this(str, map, ByteString.EMPTY);
    }

    public MegaI18n(String str, Map<String, i18nData> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.data = Internal.immutableCopyOf(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
    }
}

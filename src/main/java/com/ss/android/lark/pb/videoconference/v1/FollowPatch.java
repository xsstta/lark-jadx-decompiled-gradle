package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FollowPatch extends Message<FollowPatch, C50573a> {
    public static final ProtoAdapter<FollowPatch> ADAPTER = new C50574b();
    public static final FollowDataType DEFAULT_DATA_TYPE = FollowDataType.FOLLOW_DATA_UNKNOWN;
    public static final Type DEFAULT_OP_TYPE = Type.UNKNOWN_PATCH_TYPE;
    private static final long serialVersionUID = 0;
    public final FollowDataType data_type;
    public final Type op_type;
    public final String sender;
    public final FollowWebData web_data;

    public enum Type implements WireEnum {
        UNKNOWN_PATCH_TYPE(0),
        APPEND_TYPE(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_PATCH_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return APPEND_TYPE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowPatch$b */
    private static final class C50574b extends ProtoAdapter<FollowPatch> {
        C50574b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowPatch.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowPatch followPatch) {
            int i;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, followPatch.op_type) + FollowDataType.ADAPTER.encodedSizeWithTag(2, followPatch.data_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, followPatch.sender);
            if (followPatch.web_data != null) {
                i = FollowWebData.ADAPTER.encodedSizeWithTag(10, followPatch.web_data);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + followPatch.unknownFields().size();
        }

        /* renamed from: a */
        public FollowPatch decode(ProtoReader protoReader) throws IOException {
            C50573a aVar = new C50573a();
            aVar.f126249a = Type.UNKNOWN_PATCH_TYPE;
            aVar.f126250b = FollowDataType.FOLLOW_DATA_UNKNOWN;
            aVar.f126251c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126249a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        aVar.f126250b = FollowDataType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126251c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 10) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126252d = FollowWebData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowPatch followPatch) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, followPatch.op_type);
            FollowDataType.ADAPTER.encodeWithTag(protoWriter, 2, followPatch.data_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, followPatch.sender);
            if (followPatch.web_data != null) {
                FollowWebData.ADAPTER.encodeWithTag(protoWriter, 10, followPatch.web_data);
            }
            protoWriter.writeBytes(followPatch.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50573a newBuilder() {
        C50573a aVar = new C50573a();
        aVar.f126249a = this.op_type;
        aVar.f126250b = this.data_type;
        aVar.f126251c = this.sender;
        aVar.f126252d = this.web_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowPatch$a */
    public static final class C50573a extends Message.Builder<FollowPatch, C50573a> {

        /* renamed from: a */
        public Type f126249a;

        /* renamed from: b */
        public FollowDataType f126250b;

        /* renamed from: c */
        public String f126251c;

        /* renamed from: d */
        public FollowWebData f126252d;

        /* renamed from: a */
        public FollowPatch build() {
            FollowDataType followDataType;
            String str;
            Type type = this.f126249a;
            if (type != null && (followDataType = this.f126250b) != null && (str = this.f126251c) != null) {
                return new FollowPatch(type, followDataType, str, this.f126252d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, "op_type", this.f126250b, "data_type", this.f126251c, "sender");
        }

        /* renamed from: a */
        public C50573a mo175100a(FollowDataType followDataType) {
            this.f126250b = followDataType;
            return this;
        }

        /* renamed from: a */
        public C50573a mo175101a(Type type) {
            this.f126249a = type;
            return this;
        }

        /* renamed from: a */
        public C50573a mo175102a(FollowWebData followWebData) {
            this.f126252d = followWebData;
            return this;
        }

        /* renamed from: a */
        public C50573a mo175103a(String str) {
            this.f126251c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowPatch");
        StringBuilder sb = new StringBuilder();
        sb.append(", op_type=");
        sb.append(this.op_type);
        sb.append(", data_type=");
        sb.append(this.data_type);
        sb.append(", sender=");
        sb.append(this.sender);
        if (this.web_data != null) {
            sb.append(", web_data=");
            sb.append(this.web_data);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowPatch{");
        replace.append('}');
        return replace.toString();
    }

    public FollowPatch(Type type, FollowDataType followDataType, String str, FollowWebData followWebData) {
        this(type, followDataType, str, followWebData, ByteString.EMPTY);
    }

    public FollowPatch(Type type, FollowDataType followDataType, String str, FollowWebData followWebData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.op_type = type;
        this.data_type = followDataType;
        this.sender = str;
        this.web_data = followWebData;
    }
}

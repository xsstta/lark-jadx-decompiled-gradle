package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SystemMessageContent extends Message<SystemMessageContent, C51112a> {
    public static final ProtoAdapter<SystemMessageContent> ADAPTER = new C51113b();
    public static final SystemMessageType DEFAULT_TYPE = SystemMessageType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final SystemMessageType type;

    public enum SystemMessageType implements WireEnum {
        UNKNOWN(0),
        JOIN_MEETING(1);
        
        public static final ProtoAdapter<SystemMessageType> ADAPTER = ProtoAdapter.newEnumAdapter(SystemMessageType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SystemMessageType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return JOIN_MEETING;
        }

        private SystemMessageType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SystemMessageContent$b */
    private static final class C51113b extends ProtoAdapter<SystemMessageContent> {
        C51113b() {
            super(FieldEncoding.LENGTH_DELIMITED, SystemMessageContent.class);
        }

        /* renamed from: a */
        public int encodedSize(SystemMessageContent systemMessageContent) {
            int i;
            if (systemMessageContent.type != null) {
                i = SystemMessageType.ADAPTER.encodedSizeWithTag(1, systemMessageContent.type);
            } else {
                i = 0;
            }
            return i + systemMessageContent.unknownFields().size();
        }

        /* renamed from: a */
        public SystemMessageContent decode(ProtoReader protoReader) throws IOException {
            C51112a aVar = new C51112a();
            aVar.f127227a = SystemMessageType.UNKNOWN;
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
                    try {
                        aVar.f127227a = SystemMessageType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SystemMessageContent systemMessageContent) throws IOException {
            if (systemMessageContent.type != null) {
                SystemMessageType.ADAPTER.encodeWithTag(protoWriter, 1, systemMessageContent.type);
            }
            protoWriter.writeBytes(systemMessageContent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SystemMessageContent$a */
    public static final class C51112a extends Message.Builder<SystemMessageContent, C51112a> {

        /* renamed from: a */
        public SystemMessageType f127227a;

        /* renamed from: a */
        public SystemMessageContent build() {
            return new SystemMessageContent(this.f127227a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51112a newBuilder() {
        C51112a aVar = new C51112a();
        aVar.f127227a = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SystemMessageContent");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "SystemMessageContent{");
        replace.append('}');
        return replace.toString();
    }

    public SystemMessageContent(SystemMessageType systemMessageType) {
        this(systemMessageType, ByteString.EMPTY);
    }

    public SystemMessageContent(SystemMessageType systemMessageType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = systemMessageType;
    }
}

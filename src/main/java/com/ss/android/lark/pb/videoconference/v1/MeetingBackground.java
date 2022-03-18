package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class MeetingBackground extends Message<MeetingBackground, C50855a> {
    public static final ProtoAdapter<MeetingBackground> ADAPTER = new C50856b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String name;
    public final Type type;
    public final String url;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        IMAGE(1),
        VIDEO(2);
        
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
                return IMAGE;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingBackground$b */
    private static final class C50856b extends ProtoAdapter<MeetingBackground> {
        C50856b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingBackground.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingBackground meetingBackground) {
            return Type.ADAPTER.encodedSizeWithTag(1, meetingBackground.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, meetingBackground.name) + ProtoAdapter.STRING.encodedSizeWithTag(3, meetingBackground.url) + meetingBackground.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingBackground decode(ProtoReader protoReader) throws IOException {
            C50855a aVar = new C50855a();
            aVar.f126760a = Type.UNKNOWN;
            aVar.f126761b = "";
            aVar.f126762c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126760a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126761b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126762c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingBackground meetingBackground) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, meetingBackground.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, meetingBackground.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, meetingBackground.url);
            protoWriter.writeBytes(meetingBackground.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50855a newBuilder() {
        C50855a aVar = new C50855a();
        aVar.f126760a = this.type;
        aVar.f126761b = this.name;
        aVar.f126762c = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingBackground$a */
    public static final class C50855a extends Message.Builder<MeetingBackground, C50855a> {

        /* renamed from: a */
        public Type f126760a;

        /* renamed from: b */
        public String f126761b;

        /* renamed from: c */
        public String f126762c;

        /* renamed from: a */
        public MeetingBackground build() {
            String str;
            String str2;
            Type type = this.f126760a;
            if (type != null && (str = this.f126761b) != null && (str2 = this.f126762c) != null) {
                return new MeetingBackground(type, str, str2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f126761b, "name", this.f126762c, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MeetingBackground");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        StringBuilder replace = sb.replace(0, 2, "MeetingBackground{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingBackground(Type type2, String str, String str2) {
        this(type2, str, str2, ByteString.EMPTY);
    }

    public MeetingBackground(Type type2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.name = str;
        this.url = str2;
    }
}

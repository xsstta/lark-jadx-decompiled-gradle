package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SetWayToFindMeSettingRequest extends Message<SetWayToFindMeSettingRequest, C19215a> {
    public static final ProtoAdapter<SetWayToFindMeSettingRequest> ADAPTER = new C19216b();
    public static final Boolean DEFAULT_ENABLE = false;
    public static final VersionType DEFAULT_VERSION = VersionType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean enable;
    public final String id;
    public final String verify_token;
    public final VersionType version;

    public enum VersionType implements WireEnum {
        UNKNOWN(0),
        FIRST_VERSION(1);
        
        public static final ProtoAdapter<VersionType> ADAPTER = ProtoAdapter.newEnumAdapter(VersionType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static VersionType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return FIRST_VERSION;
        }

        private VersionType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetWayToFindMeSettingRequest$b */
    private static final class C19216b extends ProtoAdapter<SetWayToFindMeSettingRequest> {
        C19216b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetWayToFindMeSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetWayToFindMeSettingRequest setWayToFindMeSettingRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (setWayToFindMeSettingRequest.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setWayToFindMeSettingRequest.id);
            } else {
                i = 0;
            }
            if (setWayToFindMeSettingRequest.enable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, setWayToFindMeSettingRequest.enable);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (setWayToFindMeSettingRequest.version != null) {
                i3 = VersionType.ADAPTER.encodedSizeWithTag(3, setWayToFindMeSettingRequest.version);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (setWayToFindMeSettingRequest.verify_token != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, setWayToFindMeSettingRequest.verify_token);
            }
            return i6 + i4 + setWayToFindMeSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetWayToFindMeSettingRequest decode(ProtoReader protoReader) throws IOException {
            C19215a aVar = new C19215a();
            aVar.f47385a = "";
            aVar.f47386b = false;
            aVar.f47387c = VersionType.UNKNOWN;
            aVar.f47388d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47385a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47386b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f47387c = VersionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47388d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetWayToFindMeSettingRequest setWayToFindMeSettingRequest) throws IOException {
            if (setWayToFindMeSettingRequest.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setWayToFindMeSettingRequest.id);
            }
            if (setWayToFindMeSettingRequest.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setWayToFindMeSettingRequest.enable);
            }
            if (setWayToFindMeSettingRequest.version != null) {
                VersionType.ADAPTER.encodeWithTag(protoWriter, 3, setWayToFindMeSettingRequest.version);
            }
            if (setWayToFindMeSettingRequest.verify_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setWayToFindMeSettingRequest.verify_token);
            }
            protoWriter.writeBytes(setWayToFindMeSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.SetWayToFindMeSettingRequest$a */
    public static final class C19215a extends Message.Builder<SetWayToFindMeSettingRequest, C19215a> {

        /* renamed from: a */
        public String f47385a;

        /* renamed from: b */
        public Boolean f47386b;

        /* renamed from: c */
        public VersionType f47387c;

        /* renamed from: d */
        public String f47388d;

        /* renamed from: a */
        public SetWayToFindMeSettingRequest build() {
            return new SetWayToFindMeSettingRequest(this.f47385a, this.f47386b, this.f47387c, this.f47388d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19215a mo65608a(VersionType versionType) {
            this.f47387c = versionType;
            return this;
        }

        /* renamed from: b */
        public C19215a mo65612b(String str) {
            this.f47388d = str;
            return this;
        }

        /* renamed from: a */
        public C19215a mo65609a(Boolean bool) {
            this.f47386b = bool;
            return this;
        }

        /* renamed from: a */
        public C19215a mo65610a(String str) {
            this.f47385a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19215a newBuilder() {
        C19215a aVar = new C19215a();
        aVar.f47385a = this.id;
        aVar.f47386b = this.enable;
        aVar.f47387c = this.version;
        aVar.f47388d = this.verify_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "SetWayToFindMeSettingRequest");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.verify_token != null) {
            sb.append(", verify_token=");
            sb.append(this.verify_token);
        }
        StringBuilder replace = sb.replace(0, 2, "SetWayToFindMeSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetWayToFindMeSettingRequest(String str, Boolean bool, VersionType versionType, String str2) {
        this(str, bool, versionType, str2, ByteString.EMPTY);
    }

    public SetWayToFindMeSettingRequest(String str, Boolean bool, VersionType versionType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.enable = bool;
        this.version = versionType;
        this.verify_token = str2;
    }
}

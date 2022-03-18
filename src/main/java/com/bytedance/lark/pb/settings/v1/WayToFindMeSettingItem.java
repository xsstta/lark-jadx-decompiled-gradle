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

public final class WayToFindMeSettingItem extends Message<WayToFindMeSettingItem, C19233a> {
    public static final ProtoAdapter<WayToFindMeSettingItem> ADAPTER = new C19234b();
    public static final Boolean DEFAULT_ENABLE = false;
    public static final Boolean DEFAULT_HAS_VERIFIED = false;
    public static final Boolean DEFAULT_NEED_CP_VERIFY = false;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String display_contact;
    public final Boolean enable;
    public final Boolean has_verified;
    public final String id;
    public final Boolean need_cp_verify;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        MOBILE(1),
        EMAIL(2);
        
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
                return MOBILE;
            }
            if (i != 2) {
                return null;
            }
            return EMAIL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.WayToFindMeSettingItem$b */
    private static final class C19234b extends ProtoAdapter<WayToFindMeSettingItem> {
        C19234b() {
            super(FieldEncoding.LENGTH_DELIMITED, WayToFindMeSettingItem.class);
        }

        /* renamed from: a */
        public int encodedSize(WayToFindMeSettingItem wayToFindMeSettingItem) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (wayToFindMeSettingItem.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, wayToFindMeSettingItem.type);
            } else {
                i = 0;
            }
            if (wayToFindMeSettingItem.id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, wayToFindMeSettingItem.id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (wayToFindMeSettingItem.enable != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, wayToFindMeSettingItem.enable);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (wayToFindMeSettingItem.has_verified != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, wayToFindMeSettingItem.has_verified);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (wayToFindMeSettingItem.display_contact != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, wayToFindMeSettingItem.display_contact);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (wayToFindMeSettingItem.need_cp_verify != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, wayToFindMeSettingItem.need_cp_verify);
            }
            return i10 + i6 + wayToFindMeSettingItem.unknownFields().size();
        }

        /* renamed from: a */
        public WayToFindMeSettingItem decode(ProtoReader protoReader) throws IOException {
            C19233a aVar = new C19233a();
            aVar.f47403a = Type.UNKNOWN;
            aVar.f47404b = "";
            aVar.f47405c = false;
            aVar.f47406d = false;
            aVar.f47407e = "";
            aVar.f47408f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f47403a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f47404b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47405c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47406d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47407e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47408f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, WayToFindMeSettingItem wayToFindMeSettingItem) throws IOException {
            if (wayToFindMeSettingItem.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, wayToFindMeSettingItem.type);
            }
            if (wayToFindMeSettingItem.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, wayToFindMeSettingItem.id);
            }
            if (wayToFindMeSettingItem.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, wayToFindMeSettingItem.enable);
            }
            if (wayToFindMeSettingItem.has_verified != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, wayToFindMeSettingItem.has_verified);
            }
            if (wayToFindMeSettingItem.display_contact != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, wayToFindMeSettingItem.display_contact);
            }
            if (wayToFindMeSettingItem.need_cp_verify != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, wayToFindMeSettingItem.need_cp_verify);
            }
            protoWriter.writeBytes(wayToFindMeSettingItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.WayToFindMeSettingItem$a */
    public static final class C19233a extends Message.Builder<WayToFindMeSettingItem, C19233a> {

        /* renamed from: a */
        public Type f47403a;

        /* renamed from: b */
        public String f47404b;

        /* renamed from: c */
        public Boolean f47405c;

        /* renamed from: d */
        public Boolean f47406d;

        /* renamed from: e */
        public String f47407e;

        /* renamed from: f */
        public Boolean f47408f;

        /* renamed from: a */
        public WayToFindMeSettingItem build() {
            return new WayToFindMeSettingItem(this.f47403a, this.f47404b, this.f47405c, this.f47406d, this.f47407e, this.f47408f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19233a newBuilder() {
        C19233a aVar = new C19233a();
        aVar.f47403a = this.type;
        aVar.f47404b = this.id;
        aVar.f47405c = this.enable;
        aVar.f47406d = this.has_verified;
        aVar.f47407e = this.display_contact;
        aVar.f47408f = this.need_cp_verify;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "WayToFindMeSettingItem");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.has_verified != null) {
            sb.append(", has_verified=");
            sb.append(this.has_verified);
        }
        if (this.display_contact != null) {
            sb.append(", display_contact=");
            sb.append(this.display_contact);
        }
        if (this.need_cp_verify != null) {
            sb.append(", need_cp_verify=");
            sb.append(this.need_cp_verify);
        }
        StringBuilder replace = sb.replace(0, 2, "WayToFindMeSettingItem{");
        replace.append('}');
        return replace.toString();
    }

    public WayToFindMeSettingItem(Type type2, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3) {
        this(type2, str, bool, bool2, str2, bool3, ByteString.EMPTY);
    }

    public WayToFindMeSettingItem(Type type2, String str, Boolean bool, Boolean bool2, String str2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.id = str;
        this.enable = bool;
        this.has_verified = bool2;
        this.display_contact = str2;
        this.need_cp_verify = bool3;
    }
}

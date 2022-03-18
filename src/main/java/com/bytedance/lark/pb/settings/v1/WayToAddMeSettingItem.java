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

public final class WayToAddMeSettingItem extends Message<WayToAddMeSettingItem, C19231a> {
    public static final ProtoAdapter<WayToAddMeSettingItem> ADAPTER = new C19232b();
    public static final Boolean DEFAULT_ENABLE = true;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean enable;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CHAT(1),
        CONTACT_TOKEN(2),
        PROFILE(3),
        DOCS(4),
        CALENDAR(5),
        VIDEO_CONFERENCE(6),
        EMAIL(7),
        NAME_CARD(8);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return CHAT;
                case 2:
                    return CONTACT_TOKEN;
                case 3:
                    return PROFILE;
                case 4:
                    return DOCS;
                case 5:
                    return CALENDAR;
                case 6:
                    return VIDEO_CONFERENCE;
                case 7:
                    return EMAIL;
                case 8:
                    return NAME_CARD;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.WayToAddMeSettingItem$b */
    private static final class C19232b extends ProtoAdapter<WayToAddMeSettingItem> {
        C19232b() {
            super(FieldEncoding.LENGTH_DELIMITED, WayToAddMeSettingItem.class);
        }

        /* renamed from: a */
        public int encodedSize(WayToAddMeSettingItem wayToAddMeSettingItem) {
            int i;
            int i2 = 0;
            if (wayToAddMeSettingItem.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, wayToAddMeSettingItem.type);
            } else {
                i = 0;
            }
            if (wayToAddMeSettingItem.enable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, wayToAddMeSettingItem.enable);
            }
            return i + i2 + wayToAddMeSettingItem.unknownFields().size();
        }

        /* renamed from: a */
        public WayToAddMeSettingItem decode(ProtoReader protoReader) throws IOException {
            C19231a aVar = new C19231a();
            aVar.f47401a = Type.UNKNOWN;
            aVar.f47402b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47401a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47402b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WayToAddMeSettingItem wayToAddMeSettingItem) throws IOException {
            if (wayToAddMeSettingItem.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, wayToAddMeSettingItem.type);
            }
            if (wayToAddMeSettingItem.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, wayToAddMeSettingItem.enable);
            }
            protoWriter.writeBytes(wayToAddMeSettingItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.WayToAddMeSettingItem$a */
    public static final class C19231a extends Message.Builder<WayToAddMeSettingItem, C19231a> {

        /* renamed from: a */
        public Type f47401a;

        /* renamed from: b */
        public Boolean f47402b;

        /* renamed from: a */
        public WayToAddMeSettingItem build() {
            return new WayToAddMeSettingItem(this.f47401a, this.f47402b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19231a mo65646a(Type type) {
            this.f47401a = type;
            return this;
        }

        /* renamed from: a */
        public C19231a mo65647a(Boolean bool) {
            this.f47402b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19231a newBuilder() {
        C19231a aVar = new C19231a();
        aVar.f47401a = this.type;
        aVar.f47402b = this.enable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "WayToAddMeSettingItem");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        StringBuilder replace = sb.replace(0, 2, "WayToAddMeSettingItem{");
        replace.append('}');
        return replace.toString();
    }

    public WayToAddMeSettingItem(Type type2, Boolean bool) {
        this(type2, bool, ByteString.EMPTY);
    }

    public WayToAddMeSettingItem(Type type2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.enable = bool;
    }
}

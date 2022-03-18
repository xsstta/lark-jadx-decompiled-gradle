package com.bytedance.lark.pb.ai.v1;

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

public final class SmartReplyItem extends Message<SmartReplyItem, C14633a> {
    public static final ProtoAdapter<SmartReplyItem> ADAPTER = new C14634b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final AppActionParams app_action_params;
    public final CalendarActionParams calendar_action_params;
    public final String icon_key;
    public final String item_id;
    public final String label;
    public final String text_reply;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        TEXT(1),
        APP_ACTION(2),
        ATTACHMENT(3),
        DOCS(4),
        VOTE(5),
        HONGBAO(6),
        LOCATION(7),
        PROFILE(8),
        CALENDAR(9);
        
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
                    return TEXT;
                case 2:
                    return APP_ACTION;
                case 3:
                    return ATTACHMENT;
                case 4:
                    return DOCS;
                case 5:
                    return VOTE;
                case 6:
                    return HONGBAO;
                case 7:
                    return LOCATION;
                case 8:
                    return PROFILE;
                case 9:
                    return CALENDAR;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.SmartReplyItem$b */
    private static final class C14634b extends ProtoAdapter<SmartReplyItem> {
        C14634b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartReplyItem.class);
        }

        /* renamed from: a */
        public int encodedSize(SmartReplyItem smartReplyItem) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, smartReplyItem.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, smartReplyItem.item_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, smartReplyItem.label);
            int i4 = 0;
            if (smartReplyItem.text_reply != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, smartReplyItem.text_reply);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (smartReplyItem.app_action_params != null) {
                i2 = AppActionParams.ADAPTER.encodedSizeWithTag(5, smartReplyItem.app_action_params);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (smartReplyItem.calendar_action_params != null) {
                i3 = CalendarActionParams.ADAPTER.encodedSizeWithTag(6, smartReplyItem.calendar_action_params);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (smartReplyItem.icon_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, smartReplyItem.icon_key);
            }
            return i7 + i4 + smartReplyItem.unknownFields().size();
        }

        /* renamed from: a */
        public SmartReplyItem decode(ProtoReader protoReader) throws IOException {
            C14633a aVar = new C14633a();
            aVar.f38728a = Type.UNKNOWN;
            aVar.f38729b = "";
            aVar.f38730c = "";
            aVar.f38731d = "";
            aVar.f38734g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f38728a = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f38729b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f38730c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f38731d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f38732e = AppActionParams.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f38733f = CalendarActionParams.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f38734g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SmartReplyItem smartReplyItem) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, smartReplyItem.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, smartReplyItem.item_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, smartReplyItem.label);
            if (smartReplyItem.text_reply != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, smartReplyItem.text_reply);
            }
            if (smartReplyItem.app_action_params != null) {
                AppActionParams.ADAPTER.encodeWithTag(protoWriter, 5, smartReplyItem.app_action_params);
            }
            if (smartReplyItem.calendar_action_params != null) {
                CalendarActionParams.ADAPTER.encodeWithTag(protoWriter, 6, smartReplyItem.calendar_action_params);
            }
            if (smartReplyItem.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, smartReplyItem.icon_key);
            }
            protoWriter.writeBytes(smartReplyItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14633a newBuilder() {
        C14633a aVar = new C14633a();
        aVar.f38728a = this.type;
        aVar.f38729b = this.item_id;
        aVar.f38730c = this.label;
        aVar.f38731d = this.text_reply;
        aVar.f38732e = this.app_action_params;
        aVar.f38733f = this.calendar_action_params;
        aVar.f38734g = this.icon_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.SmartReplyItem$a */
    public static final class C14633a extends Message.Builder<SmartReplyItem, C14633a> {

        /* renamed from: a */
        public Type f38728a;

        /* renamed from: b */
        public String f38729b;

        /* renamed from: c */
        public String f38730c;

        /* renamed from: d */
        public String f38731d;

        /* renamed from: e */
        public AppActionParams f38732e;

        /* renamed from: f */
        public CalendarActionParams f38733f;

        /* renamed from: g */
        public String f38734g;

        /* renamed from: a */
        public SmartReplyItem build() {
            String str;
            String str2;
            Type type = this.f38728a;
            if (type != null && (str = this.f38729b) != null && (str2 = this.f38730c) != null) {
                return new SmartReplyItem(type, str, str2, this.f38731d, this.f38732e, this.f38733f, this.f38734g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f38729b, "item_id", this.f38730c, "label");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "SmartReplyItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", item_id=");
        sb.append(this.item_id);
        sb.append(", label=");
        sb.append(this.label);
        if (this.text_reply != null) {
            sb.append(", text_reply=");
            sb.append(this.text_reply);
        }
        if (this.app_action_params != null) {
            sb.append(", app_action_params=");
            sb.append(this.app_action_params);
        }
        if (this.calendar_action_params != null) {
            sb.append(", calendar_action_params=");
            sb.append(this.calendar_action_params);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartReplyItem{");
        replace.append('}');
        return replace.toString();
    }

    public SmartReplyItem(Type type2, String str, String str2, String str3, AppActionParams appActionParams, CalendarActionParams calendarActionParams, String str4) {
        this(type2, str, str2, str3, appActionParams, calendarActionParams, str4, ByteString.EMPTY);
    }

    public SmartReplyItem(Type type2, String str, String str2, String str3, AppActionParams appActionParams, CalendarActionParams calendarActionParams, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.item_id = str;
        this.label = str2;
        this.text_reply = str3;
        this.app_action_params = appActionParams;
        this.calendar_action_params = calendarActionParams;
        this.icon_key = str4;
    }
}

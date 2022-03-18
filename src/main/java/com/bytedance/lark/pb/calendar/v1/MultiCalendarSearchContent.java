package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MultiCalendarSearchContent extends Message<MultiCalendarSearchContent, C15880a> {
    public static final ProtoAdapter<MultiCalendarSearchContent> ADAPTER = new C15881b();
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_DISABLED = false;
    public static final Boolean DEFAULT_IS_DISMISSED = false;
    public static final Boolean DEFAULT_IS_MEMBER = false;
    public static final Boolean DEFAULT_IS_PRIVATE = false;
    public static final MultiCalendarSearchContentType DEFAULT_TYPE = MultiCalendarSearchContentType.CHATTER;
    private static final long serialVersionUID = 0;
    public final String avatar_url;
    public final String calendar_id;
    public final String calendar_tenant_id;
    public final Boolean is_cross_tenant;
    public final Boolean is_disabled;
    public final Boolean is_dismissed;
    public final Boolean is_member;
    public final Boolean is_private;
    public final String subtitle;
    public final String title;
    public final MultiCalendarSearchContentType type;

    public enum MultiCalendarSearchContentType implements WireEnum {
        CHATTER(1),
        MEETING_ROOM(2),
        SHARED_CALENDAR(3);
        
        public static final ProtoAdapter<MultiCalendarSearchContentType> ADAPTER = ProtoAdapter.newEnumAdapter(MultiCalendarSearchContentType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MultiCalendarSearchContentType fromValue(int i) {
            if (i == 1) {
                return CHATTER;
            }
            if (i == 2) {
                return MEETING_ROOM;
            }
            if (i != 3) {
                return null;
            }
            return SHARED_CALENDAR;
        }

        private MultiCalendarSearchContentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchContent$b */
    private static final class C15881b extends ProtoAdapter<MultiCalendarSearchContent> {
        C15881b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiCalendarSearchContent.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiCalendarSearchContent multiCalendarSearchContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, multiCalendarSearchContent.calendar_id);
            int i10 = 0;
            if (multiCalendarSearchContent.type != null) {
                i = MultiCalendarSearchContentType.ADAPTER.encodedSizeWithTag(2, multiCalendarSearchContent.type);
            } else {
                i = 0;
            }
            int i11 = encodedSizeWithTag + i;
            if (multiCalendarSearchContent.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, multiCalendarSearchContent.title);
            } else {
                i2 = 0;
            }
            int i12 = i11 + i2;
            if (multiCalendarSearchContent.subtitle != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, multiCalendarSearchContent.subtitle);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (multiCalendarSearchContent.avatar_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, multiCalendarSearchContent.avatar_url);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (multiCalendarSearchContent.is_private != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, multiCalendarSearchContent.is_private);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (multiCalendarSearchContent.is_member != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, multiCalendarSearchContent.is_member);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (multiCalendarSearchContent.is_disabled != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(9, multiCalendarSearchContent.is_disabled);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (multiCalendarSearchContent.is_dismissed != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(10, multiCalendarSearchContent.is_dismissed);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (multiCalendarSearchContent.is_cross_tenant != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(11, multiCalendarSearchContent.is_cross_tenant);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (multiCalendarSearchContent.calendar_tenant_id != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(12, multiCalendarSearchContent.calendar_tenant_id);
            }
            return i19 + i10 + multiCalendarSearchContent.unknownFields().size();
        }

        /* renamed from: a */
        public MultiCalendarSearchContent decode(ProtoReader protoReader) throws IOException {
            C15880a aVar = new C15880a();
            aVar.f41730a = "";
            aVar.f41731b = MultiCalendarSearchContentType.CHATTER;
            aVar.f41732c = "";
            aVar.f41733d = "";
            aVar.f41734e = "";
            aVar.f41735f = false;
            aVar.f41736g = false;
            aVar.f41737h = false;
            aVar.f41738i = false;
            aVar.f41739j = false;
            aVar.f41740k = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41730a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f41731b = MultiCalendarSearchContentType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f41732c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41733d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41734e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41735f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41736g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 9:
                            aVar.f41737h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41738i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41739j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41740k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MultiCalendarSearchContent multiCalendarSearchContent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, multiCalendarSearchContent.calendar_id);
            if (multiCalendarSearchContent.type != null) {
                MultiCalendarSearchContentType.ADAPTER.encodeWithTag(protoWriter, 2, multiCalendarSearchContent.type);
            }
            if (multiCalendarSearchContent.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, multiCalendarSearchContent.title);
            }
            if (multiCalendarSearchContent.subtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, multiCalendarSearchContent.subtitle);
            }
            if (multiCalendarSearchContent.avatar_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, multiCalendarSearchContent.avatar_url);
            }
            if (multiCalendarSearchContent.is_private != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, multiCalendarSearchContent.is_private);
            }
            if (multiCalendarSearchContent.is_member != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, multiCalendarSearchContent.is_member);
            }
            if (multiCalendarSearchContent.is_disabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, multiCalendarSearchContent.is_disabled);
            }
            if (multiCalendarSearchContent.is_dismissed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, multiCalendarSearchContent.is_dismissed);
            }
            if (multiCalendarSearchContent.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, multiCalendarSearchContent.is_cross_tenant);
            }
            if (multiCalendarSearchContent.calendar_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, multiCalendarSearchContent.calendar_tenant_id);
            }
            protoWriter.writeBytes(multiCalendarSearchContent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchContent$a */
    public static final class C15880a extends Message.Builder<MultiCalendarSearchContent, C15880a> {

        /* renamed from: a */
        public String f41730a;

        /* renamed from: b */
        public MultiCalendarSearchContentType f41731b;

        /* renamed from: c */
        public String f41732c;

        /* renamed from: d */
        public String f41733d;

        /* renamed from: e */
        public String f41734e;

        /* renamed from: f */
        public Boolean f41735f;

        /* renamed from: g */
        public Boolean f41736g;

        /* renamed from: h */
        public Boolean f41737h;

        /* renamed from: i */
        public Boolean f41738i;

        /* renamed from: j */
        public Boolean f41739j;

        /* renamed from: k */
        public String f41740k;

        /* renamed from: a */
        public MultiCalendarSearchContent build() {
            String str = this.f41730a;
            if (str != null) {
                return new MultiCalendarSearchContent(str, this.f41731b, this.f41732c, this.f41733d, this.f41734e, this.f41735f, this.f41736g, this.f41737h, this.f41738i, this.f41739j, this.f41740k, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "calendar_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15880a newBuilder() {
        C15880a aVar = new C15880a();
        aVar.f41730a = this.calendar_id;
        aVar.f41731b = this.type;
        aVar.f41732c = this.title;
        aVar.f41733d = this.subtitle;
        aVar.f41734e = this.avatar_url;
        aVar.f41735f = this.is_private;
        aVar.f41736g = this.is_member;
        aVar.f41737h = this.is_disabled;
        aVar.f41738i = this.is_dismissed;
        aVar.f41739j = this.is_cross_tenant;
        aVar.f41740k = this.calendar_tenant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MultiCalendarSearchContent");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.is_private != null) {
            sb.append(", is_private=");
            sb.append(this.is_private);
        }
        if (this.is_member != null) {
            sb.append(", is_member=");
            sb.append(this.is_member);
        }
        if (this.is_disabled != null) {
            sb.append(", is_disabled=");
            sb.append(this.is_disabled);
        }
        if (this.is_dismissed != null) {
            sb.append(", is_dismissed=");
            sb.append(this.is_dismissed);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.calendar_tenant_id != null) {
            sb.append(", calendar_tenant_id=");
            sb.append(this.calendar_tenant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiCalendarSearchContent{");
        replace.append('}');
        return replace.toString();
    }

    public MultiCalendarSearchContent(String str, MultiCalendarSearchContentType multiCalendarSearchContentType, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str5) {
        this(str, multiCalendarSearchContentType, str2, str3, str4, bool, bool2, bool3, bool4, bool5, str5, ByteString.EMPTY);
    }

    public MultiCalendarSearchContent(String str, MultiCalendarSearchContentType multiCalendarSearchContentType, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.type = multiCalendarSearchContentType;
        this.title = str2;
        this.subtitle = str3;
        this.avatar_url = str4;
        this.is_private = bool;
        this.is_member = bool2;
        this.is_disabled = bool3;
        this.is_dismissed = bool4;
        this.is_cross_tenant = bool5;
        this.calendar_tenant_id = str5;
    }
}

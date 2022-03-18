package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CalendarEventDisplayInfo extends Message<CalendarEventDisplayInfo, C15532a> {
    public static final ProtoAdapter<CalendarEventDisplayInfo> ADAPTER = new C15533b();
    public static final ButtonDisplayType DEFAULT_DELETE_BTN_DISPLAY_TYPE = ButtonDisplayType.UNKNOWN_TYPE;
    public static final ButtonDisplayType DEFAULT_EDIT_BTN_DISPLAY_TYPE = ButtonDisplayType.UNKNOWN_TYPE;
    public static final Boolean DEFAULT_IS_DELETABLE_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_EDITABLE_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_EVENT_CREATOR_SHOW = true;
    public static final Boolean DEFAULT_IS_EVENT_ORGANIZER_SHOW = true;
    public static final Boolean DEFAULT_IS_MEETING_CHAT_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_MEETING_MINUTES_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_REPORT_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_SHARABLE_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_TRANSFER_BTN_SHOW = false;
    public static final Boolean DEFAULT_IS_VIDEO_MEETING_BTN_SHOW = false;
    public static final ButtonDisplayType DEFAULT_MEETING_CHAT_BTN_DISPLAY_TYPE = ButtonDisplayType.UNKNOWN_TYPE;
    public static final ButtonDisplayType DEFAULT_MEETING_MINUTES_BTN_DISPLAY_TYPE = ButtonDisplayType.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final ButtonDisplayType delete_btn_display_type;
    public final CalendarEventDisplayExtraData display_extra_data;
    public final ButtonDisplayType edit_btn_display_type;
    public final Boolean is_deletable_btn_show;
    public final Boolean is_editable_btn_show;
    public final Boolean is_event_creator_show;
    public final Boolean is_event_organizer_show;
    public final Boolean is_meeting_chat_btn_show;
    public final Boolean is_meeting_minutes_btn_show;
    public final Boolean is_report_btn_show;
    public final Boolean is_sharable_btn_show;
    public final Boolean is_transfer_btn_show;
    public final Boolean is_video_meeting_btn_show;
    public final ButtonDisplayType meeting_chat_btn_display_type;
    public final ButtonDisplayType meeting_minutes_btn_display_type;

    public enum ButtonDisplayType implements WireEnum {
        UNKNOWN_TYPE(0),
        HIDDEN(1),
        SHOWN(2),
        SHOWN_EXTERNAL_ACCOUNT_EXPIRED(3),
        SHOWN_ATTENDEE_LIST_INVISIBLE(4);
        
        public static final ProtoAdapter<ButtonDisplayType> ADAPTER = ProtoAdapter.newEnumAdapter(ButtonDisplayType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ButtonDisplayType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return HIDDEN;
            }
            if (i == 2) {
                return SHOWN;
            }
            if (i == 3) {
                return SHOWN_EXTERNAL_ACCOUNT_EXPIRED;
            }
            if (i != 4) {
                return null;
            }
            return SHOWN_ATTENDEE_LIST_INVISIBLE;
        }

        private ButtonDisplayType(int i) {
            this.value = i;
        }
    }

    public static final class CalendarEventDisplayExtraData extends Message<CalendarEventDisplayExtraData, C15530a> {
        public static final ProtoAdapter<CalendarEventDisplayExtraData> ADAPTER = new C15531b();
        public static final Boolean DEFAULT_HAS_EVENT_CREATOR_RESIGNED = false;
        private static final long serialVersionUID = 0;
        public final Boolean has_event_creator_resigned;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo$CalendarEventDisplayExtraData$b */
        private static final class C15531b extends ProtoAdapter<CalendarEventDisplayExtraData> {
            C15531b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarEventDisplayExtraData.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarEventDisplayExtraData calendarEventDisplayExtraData) {
                int i;
                if (calendarEventDisplayExtraData.has_event_creator_resigned != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, calendarEventDisplayExtraData.has_event_creator_resigned);
                } else {
                    i = 0;
                }
                return i + calendarEventDisplayExtraData.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarEventDisplayExtraData decode(ProtoReader protoReader) throws IOException {
                C15530a aVar = new C15530a();
                aVar.f41136a = false;
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
                        aVar.f41136a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CalendarEventDisplayExtraData calendarEventDisplayExtraData) throws IOException {
                if (calendarEventDisplayExtraData.has_event_creator_resigned != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, calendarEventDisplayExtraData.has_event_creator_resigned);
                }
                protoWriter.writeBytes(calendarEventDisplayExtraData.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo$CalendarEventDisplayExtraData$a */
        public static final class C15530a extends Message.Builder<CalendarEventDisplayExtraData, C15530a> {

            /* renamed from: a */
            public Boolean f41136a;

            /* renamed from: a */
            public CalendarEventDisplayExtraData build() {
                return new CalendarEventDisplayExtraData(this.f41136a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15530a newBuilder() {
            C15530a aVar = new C15530a();
            aVar.f41136a = this.has_event_creator_resigned;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CalendarEventDisplayExtraData");
            StringBuilder sb = new StringBuilder();
            if (this.has_event_creator_resigned != null) {
                sb.append(", has_event_creator_resigned=");
                sb.append(this.has_event_creator_resigned);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarEventDisplayExtraData{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarEventDisplayExtraData(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public CalendarEventDisplayExtraData(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.has_event_creator_resigned = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo$b */
    private static final class C15533b extends ProtoAdapter<CalendarEventDisplayInfo> {
        C15533b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventDisplayInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventDisplayInfo calendarEventDisplayInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (calendarEventDisplayInfo.is_editable_btn_show != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, calendarEventDisplayInfo.is_editable_btn_show);
            } else {
                i = 0;
            }
            if (calendarEventDisplayInfo.is_sharable_btn_show != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, calendarEventDisplayInfo.is_sharable_btn_show);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (calendarEventDisplayInfo.is_deletable_btn_show != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, calendarEventDisplayInfo.is_deletable_btn_show);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (calendarEventDisplayInfo.is_transfer_btn_show != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, calendarEventDisplayInfo.is_transfer_btn_show);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (calendarEventDisplayInfo.is_meeting_chat_btn_show != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, calendarEventDisplayInfo.is_meeting_chat_btn_show);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (calendarEventDisplayInfo.is_video_meeting_btn_show != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, calendarEventDisplayInfo.is_video_meeting_btn_show);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (calendarEventDisplayInfo.is_meeting_minutes_btn_show != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, calendarEventDisplayInfo.is_meeting_minutes_btn_show);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (calendarEventDisplayInfo.is_report_btn_show != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, calendarEventDisplayInfo.is_report_btn_show);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (calendarEventDisplayInfo.is_event_creator_show != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, calendarEventDisplayInfo.is_event_creator_show);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (calendarEventDisplayInfo.is_event_organizer_show != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, calendarEventDisplayInfo.is_event_organizer_show);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (calendarEventDisplayInfo.edit_btn_display_type != null) {
                i11 = ButtonDisplayType.ADAPTER.encodedSizeWithTag(11, calendarEventDisplayInfo.edit_btn_display_type);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (calendarEventDisplayInfo.delete_btn_display_type != null) {
                i12 = ButtonDisplayType.ADAPTER.encodedSizeWithTag(12, calendarEventDisplayInfo.delete_btn_display_type);
            } else {
                i12 = 0;
            }
            int i26 = i25 + i12;
            if (calendarEventDisplayInfo.meeting_chat_btn_display_type != null) {
                i13 = ButtonDisplayType.ADAPTER.encodedSizeWithTag(13, calendarEventDisplayInfo.meeting_chat_btn_display_type);
            } else {
                i13 = 0;
            }
            int i27 = i26 + i13;
            if (calendarEventDisplayInfo.meeting_minutes_btn_display_type != null) {
                i14 = ButtonDisplayType.ADAPTER.encodedSizeWithTag(14, calendarEventDisplayInfo.meeting_minutes_btn_display_type);
            } else {
                i14 = 0;
            }
            int i28 = i27 + i14;
            if (calendarEventDisplayInfo.display_extra_data != null) {
                i15 = CalendarEventDisplayExtraData.ADAPTER.encodedSizeWithTag(100, calendarEventDisplayInfo.display_extra_data);
            }
            return i28 + i15 + calendarEventDisplayInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventDisplayInfo decode(ProtoReader protoReader) throws IOException {
            C15532a aVar = new C15532a();
            aVar.f41137a = false;
            aVar.f41138b = false;
            aVar.f41139c = false;
            aVar.f41140d = false;
            aVar.f41141e = false;
            aVar.f41142f = false;
            aVar.f41143g = false;
            aVar.f41144h = false;
            aVar.f41145i = true;
            aVar.f41146j = true;
            aVar.f41147k = ButtonDisplayType.UNKNOWN_TYPE;
            aVar.f41148l = ButtonDisplayType.UNKNOWN_TYPE;
            aVar.f41149m = ButtonDisplayType.UNKNOWN_TYPE;
            aVar.f41150n = ButtonDisplayType.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41137a = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f41138b = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f41139c = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f41140d = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f41141e = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f41142f = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f41143g = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f41144h = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f41145i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f41146j = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 11:
                            try {
                                aVar.f41147k = ButtonDisplayType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f41148l = ButtonDisplayType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            try {
                                aVar.f41149m = ButtonDisplayType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 14:
                            try {
                                aVar.f41150n = ButtonDisplayType.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f41151o = CalendarEventDisplayExtraData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEventDisplayInfo calendarEventDisplayInfo) throws IOException {
            if (calendarEventDisplayInfo.is_editable_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, calendarEventDisplayInfo.is_editable_btn_show);
            }
            if (calendarEventDisplayInfo.is_sharable_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, calendarEventDisplayInfo.is_sharable_btn_show);
            }
            if (calendarEventDisplayInfo.is_deletable_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, calendarEventDisplayInfo.is_deletable_btn_show);
            }
            if (calendarEventDisplayInfo.is_transfer_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, calendarEventDisplayInfo.is_transfer_btn_show);
            }
            if (calendarEventDisplayInfo.is_meeting_chat_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, calendarEventDisplayInfo.is_meeting_chat_btn_show);
            }
            if (calendarEventDisplayInfo.is_video_meeting_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, calendarEventDisplayInfo.is_video_meeting_btn_show);
            }
            if (calendarEventDisplayInfo.is_meeting_minutes_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, calendarEventDisplayInfo.is_meeting_minutes_btn_show);
            }
            if (calendarEventDisplayInfo.is_report_btn_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, calendarEventDisplayInfo.is_report_btn_show);
            }
            if (calendarEventDisplayInfo.is_event_creator_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, calendarEventDisplayInfo.is_event_creator_show);
            }
            if (calendarEventDisplayInfo.is_event_organizer_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, calendarEventDisplayInfo.is_event_organizer_show);
            }
            if (calendarEventDisplayInfo.edit_btn_display_type != null) {
                ButtonDisplayType.ADAPTER.encodeWithTag(protoWriter, 11, calendarEventDisplayInfo.edit_btn_display_type);
            }
            if (calendarEventDisplayInfo.delete_btn_display_type != null) {
                ButtonDisplayType.ADAPTER.encodeWithTag(protoWriter, 12, calendarEventDisplayInfo.delete_btn_display_type);
            }
            if (calendarEventDisplayInfo.meeting_chat_btn_display_type != null) {
                ButtonDisplayType.ADAPTER.encodeWithTag(protoWriter, 13, calendarEventDisplayInfo.meeting_chat_btn_display_type);
            }
            if (calendarEventDisplayInfo.meeting_minutes_btn_display_type != null) {
                ButtonDisplayType.ADAPTER.encodeWithTag(protoWriter, 14, calendarEventDisplayInfo.meeting_minutes_btn_display_type);
            }
            if (calendarEventDisplayInfo.display_extra_data != null) {
                CalendarEventDisplayExtraData.ADAPTER.encodeWithTag(protoWriter, 100, calendarEventDisplayInfo.display_extra_data);
            }
            protoWriter.writeBytes(calendarEventDisplayInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo$a */
    public static final class C15532a extends Message.Builder<CalendarEventDisplayInfo, C15532a> {

        /* renamed from: a */
        public Boolean f41137a;

        /* renamed from: b */
        public Boolean f41138b;

        /* renamed from: c */
        public Boolean f41139c;

        /* renamed from: d */
        public Boolean f41140d;

        /* renamed from: e */
        public Boolean f41141e;

        /* renamed from: f */
        public Boolean f41142f;

        /* renamed from: g */
        public Boolean f41143g;

        /* renamed from: h */
        public Boolean f41144h;

        /* renamed from: i */
        public Boolean f41145i;

        /* renamed from: j */
        public Boolean f41146j;

        /* renamed from: k */
        public ButtonDisplayType f41147k;

        /* renamed from: l */
        public ButtonDisplayType f41148l;

        /* renamed from: m */
        public ButtonDisplayType f41149m;

        /* renamed from: n */
        public ButtonDisplayType f41150n;

        /* renamed from: o */
        public CalendarEventDisplayExtraData f41151o;

        /* renamed from: a */
        public CalendarEventDisplayInfo build() {
            return new CalendarEventDisplayInfo(this.f41137a, this.f41138b, this.f41139c, this.f41140d, this.f41141e, this.f41142f, this.f41143g, this.f41144h, this.f41145i, this.f41146j, this.f41147k, this.f41148l, this.f41149m, this.f41150n, this.f41151o, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15532a mo56313a(ButtonDisplayType buttonDisplayType) {
            this.f41149m = buttonDisplayType;
            return this;
        }

        /* renamed from: b */
        public C15532a mo56316b(ButtonDisplayType buttonDisplayType) {
            this.f41150n = buttonDisplayType;
            return this;
        }

        /* renamed from: c */
        public C15532a mo56318c(Boolean bool) {
            this.f41139c = bool;
            return this;
        }

        /* renamed from: d */
        public C15532a mo56319d(Boolean bool) {
            this.f41140d = bool;
            return this;
        }

        /* renamed from: e */
        public C15532a mo56320e(Boolean bool) {
            this.f41142f = bool;
            return this;
        }

        /* renamed from: f */
        public C15532a mo56321f(Boolean bool) {
            this.f41144h = bool;
            return this;
        }

        /* renamed from: g */
        public C15532a mo56322g(Boolean bool) {
            this.f41145i = bool;
            return this;
        }

        /* renamed from: a */
        public C15532a mo56314a(Boolean bool) {
            this.f41137a = bool;
            return this;
        }

        /* renamed from: b */
        public C15532a mo56317b(Boolean bool) {
            this.f41138b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15532a newBuilder() {
        C15532a aVar = new C15532a();
        aVar.f41137a = this.is_editable_btn_show;
        aVar.f41138b = this.is_sharable_btn_show;
        aVar.f41139c = this.is_deletable_btn_show;
        aVar.f41140d = this.is_transfer_btn_show;
        aVar.f41141e = this.is_meeting_chat_btn_show;
        aVar.f41142f = this.is_video_meeting_btn_show;
        aVar.f41143g = this.is_meeting_minutes_btn_show;
        aVar.f41144h = this.is_report_btn_show;
        aVar.f41145i = this.is_event_creator_show;
        aVar.f41146j = this.is_event_organizer_show;
        aVar.f41147k = this.edit_btn_display_type;
        aVar.f41148l = this.delete_btn_display_type;
        aVar.f41149m = this.meeting_chat_btn_display_type;
        aVar.f41150n = this.meeting_minutes_btn_display_type;
        aVar.f41151o = this.display_extra_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventDisplayInfo");
        StringBuilder sb = new StringBuilder();
        if (this.is_editable_btn_show != null) {
            sb.append(", is_editable_btn_show=");
            sb.append(this.is_editable_btn_show);
        }
        if (this.is_sharable_btn_show != null) {
            sb.append(", is_sharable_btn_show=");
            sb.append(this.is_sharable_btn_show);
        }
        if (this.is_deletable_btn_show != null) {
            sb.append(", is_deletable_btn_show=");
            sb.append(this.is_deletable_btn_show);
        }
        if (this.is_transfer_btn_show != null) {
            sb.append(", is_transfer_btn_show=");
            sb.append(this.is_transfer_btn_show);
        }
        if (this.is_meeting_chat_btn_show != null) {
            sb.append(", is_meeting_chat_btn_show=");
            sb.append(this.is_meeting_chat_btn_show);
        }
        if (this.is_video_meeting_btn_show != null) {
            sb.append(", is_video_meeting_btn_show=");
            sb.append(this.is_video_meeting_btn_show);
        }
        if (this.is_meeting_minutes_btn_show != null) {
            sb.append(", is_meeting_minutes_btn_show=");
            sb.append(this.is_meeting_minutes_btn_show);
        }
        if (this.is_report_btn_show != null) {
            sb.append(", is_report_btn_show=");
            sb.append(this.is_report_btn_show);
        }
        if (this.is_event_creator_show != null) {
            sb.append(", is_event_creator_show=");
            sb.append(this.is_event_creator_show);
        }
        if (this.is_event_organizer_show != null) {
            sb.append(", is_event_organizer_show=");
            sb.append(this.is_event_organizer_show);
        }
        if (this.edit_btn_display_type != null) {
            sb.append(", edit_btn_display_type=");
            sb.append(this.edit_btn_display_type);
        }
        if (this.delete_btn_display_type != null) {
            sb.append(", delete_btn_display_type=");
            sb.append(this.delete_btn_display_type);
        }
        if (this.meeting_chat_btn_display_type != null) {
            sb.append(", meeting_chat_btn_display_type=");
            sb.append(this.meeting_chat_btn_display_type);
        }
        if (this.meeting_minutes_btn_display_type != null) {
            sb.append(", meeting_minutes_btn_display_type=");
            sb.append(this.meeting_minutes_btn_display_type);
        }
        if (this.display_extra_data != null) {
            sb.append(", display_extra_data=");
            sb.append(this.display_extra_data);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEventDisplayInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventDisplayInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, ButtonDisplayType buttonDisplayType, ButtonDisplayType buttonDisplayType2, ButtonDisplayType buttonDisplayType3, ButtonDisplayType buttonDisplayType4, CalendarEventDisplayExtraData calendarEventDisplayExtraData) {
        this(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, buttonDisplayType, buttonDisplayType2, buttonDisplayType3, buttonDisplayType4, calendarEventDisplayExtraData, ByteString.EMPTY);
    }

    public CalendarEventDisplayInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, ButtonDisplayType buttonDisplayType, ButtonDisplayType buttonDisplayType2, ButtonDisplayType buttonDisplayType3, ButtonDisplayType buttonDisplayType4, CalendarEventDisplayExtraData calendarEventDisplayExtraData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_editable_btn_show = bool;
        this.is_sharable_btn_show = bool2;
        this.is_deletable_btn_show = bool3;
        this.is_transfer_btn_show = bool4;
        this.is_meeting_chat_btn_show = bool5;
        this.is_video_meeting_btn_show = bool6;
        this.is_meeting_minutes_btn_show = bool7;
        this.is_report_btn_show = bool8;
        this.is_event_creator_show = bool9;
        this.is_event_organizer_show = bool10;
        this.edit_btn_display_type = buttonDisplayType;
        this.delete_btn_display_type = buttonDisplayType2;
        this.meeting_chat_btn_display_type = buttonDisplayType3;
        this.meeting_minutes_btn_display_type = buttonDisplayType4;
        this.display_extra_data = calendarEventDisplayExtraData;
    }
}

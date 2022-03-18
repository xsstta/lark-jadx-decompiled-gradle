package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarSaveInfo extends Message<CalendarSaveInfo, C15558a> {
    public static final ProtoAdapter<CalendarSaveInfo> ADAPTER = new C15559b();
    private static final long serialVersionUID = 0;
    public final String cover_image_key;
    public final String default_timezone;
    public final String description;
    public final String id;
    public final UserCalendarInfo individual_calendar_info;
    public final CalendarMemberCommits member_commits;
    public final Calendar.CalendarShareOptions share_options;
    public final String summary;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo$b */
    private static final class C15559b extends ProtoAdapter<CalendarSaveInfo> {
        C15559b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarSaveInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarSaveInfo calendarSaveInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (calendarSaveInfo.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarSaveInfo.id);
            } else {
                i = 0;
            }
            if (calendarSaveInfo.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarSaveInfo.summary);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (calendarSaveInfo.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, calendarSaveInfo.description);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (calendarSaveInfo.default_timezone != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, calendarSaveInfo.default_timezone);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (calendarSaveInfo.cover_image_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, calendarSaveInfo.cover_image_key);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (calendarSaveInfo.share_options != null) {
                i6 = Calendar.CalendarShareOptions.ADAPTER.encodedSizeWithTag(6, calendarSaveInfo.share_options);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (calendarSaveInfo.member_commits != null) {
                i7 = CalendarMemberCommits.ADAPTER.encodedSizeWithTag(7, calendarSaveInfo.member_commits);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (calendarSaveInfo.individual_calendar_info != null) {
                i8 = UserCalendarInfo.ADAPTER.encodedSizeWithTag(8, calendarSaveInfo.individual_calendar_info);
            }
            return i14 + i8 + calendarSaveInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarSaveInfo decode(ProtoReader protoReader) throws IOException {
            C15558a aVar = new C15558a();
            aVar.f41255a = "0";
            aVar.f41256b = "";
            aVar.f41257c = "";
            aVar.f41258d = "";
            aVar.f41259e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41255a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41256b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41257c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41258d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41259e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41260f = Calendar.CalendarShareOptions.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41261g = CalendarMemberCommits.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41262h = UserCalendarInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarSaveInfo calendarSaveInfo) throws IOException {
            if (calendarSaveInfo.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarSaveInfo.id);
            }
            if (calendarSaveInfo.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarSaveInfo.summary);
            }
            if (calendarSaveInfo.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarSaveInfo.description);
            }
            if (calendarSaveInfo.default_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendarSaveInfo.default_timezone);
            }
            if (calendarSaveInfo.cover_image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendarSaveInfo.cover_image_key);
            }
            if (calendarSaveInfo.share_options != null) {
                Calendar.CalendarShareOptions.ADAPTER.encodeWithTag(protoWriter, 6, calendarSaveInfo.share_options);
            }
            if (calendarSaveInfo.member_commits != null) {
                CalendarMemberCommits.ADAPTER.encodeWithTag(protoWriter, 7, calendarSaveInfo.member_commits);
            }
            if (calendarSaveInfo.individual_calendar_info != null) {
                UserCalendarInfo.ADAPTER.encodeWithTag(protoWriter, 8, calendarSaveInfo.individual_calendar_info);
            }
            protoWriter.writeBytes(calendarSaveInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo$a */
    public static final class C15558a extends Message.Builder<CalendarSaveInfo, C15558a> {

        /* renamed from: a */
        public String f41255a;

        /* renamed from: b */
        public String f41256b;

        /* renamed from: c */
        public String f41257c;

        /* renamed from: d */
        public String f41258d;

        /* renamed from: e */
        public String f41259e;

        /* renamed from: f */
        public Calendar.CalendarShareOptions f41260f;

        /* renamed from: g */
        public CalendarMemberCommits f41261g;

        /* renamed from: h */
        public UserCalendarInfo f41262h;

        /* renamed from: a */
        public CalendarSaveInfo build() {
            return new CalendarSaveInfo(this.f41255a, this.f41256b, this.f41257c, this.f41258d, this.f41259e, this.f41260f, this.f41261g, this.f41262h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15558a mo56436a(Calendar.CalendarShareOptions calendarShareOptions) {
            this.f41260f = calendarShareOptions;
            return this;
        }

        /* renamed from: b */
        public C15558a mo56441b(String str) {
            this.f41256b = str;
            return this;
        }

        /* renamed from: c */
        public C15558a mo56442c(String str) {
            this.f41257c = str;
            return this;
        }

        /* renamed from: d */
        public C15558a mo56443d(String str) {
            this.f41259e = str;
            return this;
        }

        /* renamed from: a */
        public C15558a mo56437a(CalendarMemberCommits calendarMemberCommits) {
            this.f41261g = calendarMemberCommits;
            return this;
        }

        /* renamed from: a */
        public C15558a mo56438a(UserCalendarInfo userCalendarInfo) {
            this.f41262h = userCalendarInfo;
            return this;
        }

        /* renamed from: a */
        public C15558a mo56439a(String str) {
            this.f41255a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15558a newBuilder() {
        C15558a aVar = new C15558a();
        aVar.f41255a = this.id;
        aVar.f41256b = this.summary;
        aVar.f41257c = this.description;
        aVar.f41258d = this.default_timezone;
        aVar.f41259e = this.cover_image_key;
        aVar.f41260f = this.share_options;
        aVar.f41261g = this.member_commits;
        aVar.f41262h = this.individual_calendar_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarSaveInfo");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.default_timezone != null) {
            sb.append(", default_timezone=");
            sb.append(this.default_timezone);
        }
        if (this.cover_image_key != null) {
            sb.append(", cover_image_key=");
            sb.append(this.cover_image_key);
        }
        if (this.share_options != null) {
            sb.append(", share_options=");
            sb.append(this.share_options);
        }
        if (this.member_commits != null) {
            sb.append(", member_commits=");
            sb.append(this.member_commits);
        }
        if (this.individual_calendar_info != null) {
            sb.append(", individual_calendar_info=");
            sb.append(this.individual_calendar_info);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarSaveInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarSaveInfo(String str, String str2, String str3, String str4, String str5, Calendar.CalendarShareOptions calendarShareOptions, CalendarMemberCommits calendarMemberCommits, UserCalendarInfo userCalendarInfo) {
        this(str, str2, str3, str4, str5, calendarShareOptions, calendarMemberCommits, userCalendarInfo, ByteString.EMPTY);
    }

    public CalendarSaveInfo(String str, String str2, String str3, String str4, String str5, Calendar.CalendarShareOptions calendarShareOptions, CalendarMemberCommits calendarMemberCommits, UserCalendarInfo userCalendarInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.summary = str2;
        this.description = str3;
        this.default_timezone = str4;
        this.cover_image_key = str5;
        this.share_options = calendarShareOptions;
        this.member_commits = calendarMemberCommits;
        this.individual_calendar_info = userCalendarInfo;
    }
}

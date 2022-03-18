package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MultiCalendarSearchRequest extends Message<MultiCalendarSearchRequest, C15882a> {
    public static final ProtoAdapter<MultiCalendarSearchRequest> ADAPTER = new C15883b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final Boolean DEFAULT_NEED_SEARCH_EXTERNAL_PRIMARY_CALENDAR = false;
    public static final Boolean DEFAULT_NEED_SEARCH_MEETING_ROOM = true;
    public static final Boolean DEFAULT_NEED_SEARCH_PRIMARY_CALENDAR = true;
    public static final Boolean DEFAULT_NEED_SEARCH_SHARED_CALENDAR = true;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Boolean need_search_external_primary_calendar;
    public final Boolean need_search_meeting_room;
    public final Boolean need_search_primary_calendar;
    public final Boolean need_search_shared_calendar;
    public final Integer offset;
    public final String query;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchRequest$b */
    private static final class C15883b extends ProtoAdapter<MultiCalendarSearchRequest> {
        C15883b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiCalendarSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiCalendarSearchRequest multiCalendarSearchRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, multiCalendarSearchRequest.query);
            int i6 = 0;
            if (multiCalendarSearchRequest.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, multiCalendarSearchRequest.offset);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (multiCalendarSearchRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, multiCalendarSearchRequest.count);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (multiCalendarSearchRequest.need_search_meeting_room != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, multiCalendarSearchRequest.need_search_meeting_room);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (multiCalendarSearchRequest.need_search_shared_calendar != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, multiCalendarSearchRequest.need_search_shared_calendar);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (multiCalendarSearchRequest.need_search_primary_calendar != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, multiCalendarSearchRequest.need_search_primary_calendar);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (multiCalendarSearchRequest.need_search_external_primary_calendar != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, multiCalendarSearchRequest.need_search_external_primary_calendar);
            }
            return i11 + i6 + multiCalendarSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MultiCalendarSearchRequest decode(ProtoReader protoReader) throws IOException {
            C15882a aVar = new C15882a();
            aVar.f41741a = "";
            aVar.f41742b = 0;
            aVar.f41743c = 10;
            aVar.f41744d = true;
            aVar.f41745e = true;
            aVar.f41746f = true;
            aVar.f41747g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41741a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41742b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41743c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41744d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41745e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41746f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41747g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MultiCalendarSearchRequest multiCalendarSearchRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, multiCalendarSearchRequest.query);
            if (multiCalendarSearchRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, multiCalendarSearchRequest.offset);
            }
            if (multiCalendarSearchRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, multiCalendarSearchRequest.count);
            }
            if (multiCalendarSearchRequest.need_search_meeting_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, multiCalendarSearchRequest.need_search_meeting_room);
            }
            if (multiCalendarSearchRequest.need_search_shared_calendar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, multiCalendarSearchRequest.need_search_shared_calendar);
            }
            if (multiCalendarSearchRequest.need_search_primary_calendar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, multiCalendarSearchRequest.need_search_primary_calendar);
            }
            if (multiCalendarSearchRequest.need_search_external_primary_calendar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, multiCalendarSearchRequest.need_search_external_primary_calendar);
            }
            protoWriter.writeBytes(multiCalendarSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchRequest$a */
    public static final class C15882a extends Message.Builder<MultiCalendarSearchRequest, C15882a> {

        /* renamed from: a */
        public String f41741a;

        /* renamed from: b */
        public Integer f41742b;

        /* renamed from: c */
        public Integer f41743c;

        /* renamed from: d */
        public Boolean f41744d;

        /* renamed from: e */
        public Boolean f41745e;

        /* renamed from: f */
        public Boolean f41746f;

        /* renamed from: g */
        public Boolean f41747g;

        /* renamed from: a */
        public MultiCalendarSearchRequest build() {
            String str = this.f41741a;
            if (str != null) {
                return new MultiCalendarSearchRequest(str, this.f41742b, this.f41743c, this.f41744d, this.f41745e, this.f41746f, this.f41747g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY);
        }
    }

    @Override // com.squareup.wire.Message
    public C15882a newBuilder() {
        C15882a aVar = new C15882a();
        aVar.f41741a = this.query;
        aVar.f41742b = this.offset;
        aVar.f41743c = this.count;
        aVar.f41744d = this.need_search_meeting_room;
        aVar.f41745e = this.need_search_shared_calendar;
        aVar.f41746f = this.need_search_primary_calendar;
        aVar.f41747g = this.need_search_external_primary_calendar;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MultiCalendarSearchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.need_search_meeting_room != null) {
            sb.append(", need_search_meeting_room=");
            sb.append(this.need_search_meeting_room);
        }
        if (this.need_search_shared_calendar != null) {
            sb.append(", need_search_shared_calendar=");
            sb.append(this.need_search_shared_calendar);
        }
        if (this.need_search_primary_calendar != null) {
            sb.append(", need_search_primary_calendar=");
            sb.append(this.need_search_primary_calendar);
        }
        if (this.need_search_external_primary_calendar != null) {
            sb.append(", need_search_external_primary_calendar=");
            sb.append(this.need_search_external_primary_calendar);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiCalendarSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MultiCalendarSearchRequest(String str, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(str, num, num2, bool, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public MultiCalendarSearchRequest(String str, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.offset = num;
        this.count = num2;
        this.need_search_meeting_room = bool;
        this.need_search_shared_calendar = bool2;
        this.need_search_primary_calendar = bool3;
        this.need_search_external_primary_calendar = bool4;
    }
}

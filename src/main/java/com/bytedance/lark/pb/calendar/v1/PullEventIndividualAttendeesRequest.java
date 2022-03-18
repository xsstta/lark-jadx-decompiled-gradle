package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullEventIndividualAttendeesRequest extends Message<PullEventIndividualAttendeesRequest, C15934a> {
    public static final ProtoAdapter<PullEventIndividualAttendeesRequest> ADAPTER = new C15935b();
    public static final Boolean DEFAULT_NEEDS_ALL_ATTENDEES = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Integer DEFAULT_PAGE_SIZE = 0;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String event_version;
    public final String key;
    public final Boolean needs_all_attendees;
    public final Long original_time;
    public final Integer page_size;
    public final String page_token;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesRequest$b */
    private static final class C15935b extends ProtoAdapter<PullEventIndividualAttendeesRequest> {
        C15935b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullEventIndividualAttendeesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullEventIndividualAttendeesRequest pullEventIndividualAttendeesRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (pullEventIndividualAttendeesRequest.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullEventIndividualAttendeesRequest.calendar_id);
            } else {
                i = 0;
            }
            if (pullEventIndividualAttendeesRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullEventIndividualAttendeesRequest.key);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (pullEventIndividualAttendeesRequest.original_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, pullEventIndividualAttendeesRequest.original_time);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (pullEventIndividualAttendeesRequest.event_version != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pullEventIndividualAttendeesRequest.event_version);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (pullEventIndividualAttendeesRequest.page_size != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, pullEventIndividualAttendeesRequest.page_size);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (pullEventIndividualAttendeesRequest.page_token != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pullEventIndividualAttendeesRequest.page_token);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (pullEventIndividualAttendeesRequest.needs_all_attendees != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, pullEventIndividualAttendeesRequest.needs_all_attendees);
            }
            return i12 + i7 + pullEventIndividualAttendeesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullEventIndividualAttendeesRequest decode(ProtoReader protoReader) throws IOException {
            C15934a aVar = new C15934a();
            aVar.f41910a = "";
            aVar.f41911b = "";
            aVar.f41912c = 0L;
            aVar.f41913d = "";
            aVar.f41914e = 0;
            aVar.f41915f = "";
            aVar.f41916g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41910a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41911b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41912c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41913d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41914e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41915f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41916g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PullEventIndividualAttendeesRequest pullEventIndividualAttendeesRequest) throws IOException {
            if (pullEventIndividualAttendeesRequest.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullEventIndividualAttendeesRequest.calendar_id);
            }
            if (pullEventIndividualAttendeesRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullEventIndividualAttendeesRequest.key);
            }
            if (pullEventIndividualAttendeesRequest.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullEventIndividualAttendeesRequest.original_time);
            }
            if (pullEventIndividualAttendeesRequest.event_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pullEventIndividualAttendeesRequest.event_version);
            }
            if (pullEventIndividualAttendeesRequest.page_size != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, pullEventIndividualAttendeesRequest.page_size);
            }
            if (pullEventIndividualAttendeesRequest.page_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pullEventIndividualAttendeesRequest.page_token);
            }
            if (pullEventIndividualAttendeesRequest.needs_all_attendees != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, pullEventIndividualAttendeesRequest.needs_all_attendees);
            }
            protoWriter.writeBytes(pullEventIndividualAttendeesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesRequest$a */
    public static final class C15934a extends Message.Builder<PullEventIndividualAttendeesRequest, C15934a> {

        /* renamed from: a */
        public String f41910a;

        /* renamed from: b */
        public String f41911b;

        /* renamed from: c */
        public Long f41912c;

        /* renamed from: d */
        public String f41913d;

        /* renamed from: e */
        public Integer f41914e;

        /* renamed from: f */
        public String f41915f;

        /* renamed from: g */
        public Boolean f41916g;

        /* renamed from: a */
        public PullEventIndividualAttendeesRequest build() {
            return new PullEventIndividualAttendeesRequest(this.f41910a, this.f41911b, this.f41912c, this.f41913d, this.f41914e, this.f41915f, this.f41916g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15934a mo57426a(Boolean bool) {
            this.f41916g = bool;
            return this;
        }

        /* renamed from: b */
        public C15934a mo57431b(String str) {
            this.f41911b = str;
            return this;
        }

        /* renamed from: c */
        public C15934a mo57432c(String str) {
            this.f41913d = str;
            return this;
        }

        /* renamed from: d */
        public C15934a mo57433d(String str) {
            this.f41915f = str;
            return this;
        }

        /* renamed from: a */
        public C15934a mo57427a(Integer num) {
            this.f41914e = num;
            return this;
        }

        /* renamed from: a */
        public C15934a mo57428a(Long l) {
            this.f41912c = l;
            return this;
        }

        /* renamed from: a */
        public C15934a mo57429a(String str) {
            this.f41910a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15934a newBuilder() {
        C15934a aVar = new C15934a();
        aVar.f41910a = this.calendar_id;
        aVar.f41911b = this.key;
        aVar.f41912c = this.original_time;
        aVar.f41913d = this.event_version;
        aVar.f41914e = this.page_size;
        aVar.f41915f = this.page_token;
        aVar.f41916g = this.needs_all_attendees;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullEventIndividualAttendeesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.event_version != null) {
            sb.append(", event_version=");
            sb.append(this.event_version);
        }
        if (this.page_size != null) {
            sb.append(", page_size=");
            sb.append(this.page_size);
        }
        if (this.page_token != null) {
            sb.append(", page_token=");
            sb.append(this.page_token);
        }
        if (this.needs_all_attendees != null) {
            sb.append(", needs_all_attendees=");
            sb.append(this.needs_all_attendees);
        }
        StringBuilder replace = sb.replace(0, 2, "PullEventIndividualAttendeesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullEventIndividualAttendeesRequest(String str, String str2, Long l, String str3, Integer num, String str4, Boolean bool) {
        this(str, str2, l, str3, num, str4, bool, ByteString.EMPTY);
    }

    public PullEventIndividualAttendeesRequest(String str, String str2, Long l, String str3, Integer num, String str4, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.event_version = str3;
        this.page_size = num;
        this.page_token = str4;
        this.needs_all_attendees = bool;
    }
}

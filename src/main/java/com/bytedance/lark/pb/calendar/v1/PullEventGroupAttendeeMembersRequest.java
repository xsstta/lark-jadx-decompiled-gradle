package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullEventGroupAttendeeMembersRequest extends Message<PullEventGroupAttendeeMembersRequest, C15926a> {
    public static final ProtoAdapter<PullEventGroupAttendeeMembersRequest> ADAPTER = new C15927b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final Integer DEFAULT_PAGE_COUNT = 100;
    public static final Boolean DEFAULT_PULL_ALL_ATTENDEE = false;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String chat_id;
    public final String key;
    public final Long original_time;
    public final Integer page_count;
    public final String page_offset;
    public final Boolean pull_all_attendee;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersRequest$b */
    private static final class C15927b extends ProtoAdapter<PullEventGroupAttendeeMembersRequest> {
        C15927b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullEventGroupAttendeeMembersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullEventGroupAttendeeMembersRequest pullEventGroupAttendeeMembersRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (pullEventGroupAttendeeMembersRequest.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullEventGroupAttendeeMembersRequest.calendar_id);
            } else {
                i = 0;
            }
            if (pullEventGroupAttendeeMembersRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullEventGroupAttendeeMembersRequest.key);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (pullEventGroupAttendeeMembersRequest.original_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, pullEventGroupAttendeeMembersRequest.original_time);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (pullEventGroupAttendeeMembersRequest.chat_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pullEventGroupAttendeeMembersRequest.chat_id);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (pullEventGroupAttendeeMembersRequest.pull_all_attendee != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pullEventGroupAttendeeMembersRequest.pull_all_attendee);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (pullEventGroupAttendeeMembersRequest.page_offset != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pullEventGroupAttendeeMembersRequest.page_offset);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (pullEventGroupAttendeeMembersRequest.page_count != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(7, pullEventGroupAttendeeMembersRequest.page_count);
            }
            return i12 + i7 + pullEventGroupAttendeeMembersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullEventGroupAttendeeMembersRequest decode(ProtoReader protoReader) throws IOException {
            C15926a aVar = new C15926a();
            aVar.f41895a = "";
            aVar.f41896b = "";
            aVar.f41897c = 0L;
            aVar.f41898d = "";
            aVar.f41899e = false;
            aVar.f41900f = "";
            aVar.f41901g = 100;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41895a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41896b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41897c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41898d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41899e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41900f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41901g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PullEventGroupAttendeeMembersRequest pullEventGroupAttendeeMembersRequest) throws IOException {
            if (pullEventGroupAttendeeMembersRequest.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullEventGroupAttendeeMembersRequest.calendar_id);
            }
            if (pullEventGroupAttendeeMembersRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullEventGroupAttendeeMembersRequest.key);
            }
            if (pullEventGroupAttendeeMembersRequest.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullEventGroupAttendeeMembersRequest.original_time);
            }
            if (pullEventGroupAttendeeMembersRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pullEventGroupAttendeeMembersRequest.chat_id);
            }
            if (pullEventGroupAttendeeMembersRequest.pull_all_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pullEventGroupAttendeeMembersRequest.pull_all_attendee);
            }
            if (pullEventGroupAttendeeMembersRequest.page_offset != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pullEventGroupAttendeeMembersRequest.page_offset);
            }
            if (pullEventGroupAttendeeMembersRequest.page_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, pullEventGroupAttendeeMembersRequest.page_count);
            }
            protoWriter.writeBytes(pullEventGroupAttendeeMembersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullEventGroupAttendeeMembersRequest$a */
    public static final class C15926a extends Message.Builder<PullEventGroupAttendeeMembersRequest, C15926a> {

        /* renamed from: a */
        public String f41895a;

        /* renamed from: b */
        public String f41896b;

        /* renamed from: c */
        public Long f41897c;

        /* renamed from: d */
        public String f41898d;

        /* renamed from: e */
        public Boolean f41899e;

        /* renamed from: f */
        public String f41900f;

        /* renamed from: g */
        public Integer f41901g;

        /* renamed from: a */
        public PullEventGroupAttendeeMembersRequest build() {
            return new PullEventGroupAttendeeMembersRequest(this.f41895a, this.f41896b, this.f41897c, this.f41898d, this.f41899e, this.f41900f, this.f41901g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15926a mo57400a(Boolean bool) {
            this.f41899e = bool;
            return this;
        }

        /* renamed from: b */
        public C15926a mo57405b(String str) {
            this.f41896b = str;
            return this;
        }

        /* renamed from: c */
        public C15926a mo57406c(String str) {
            this.f41898d = str;
            return this;
        }

        /* renamed from: d */
        public C15926a mo57407d(String str) {
            this.f41900f = str;
            return this;
        }

        /* renamed from: a */
        public C15926a mo57401a(Integer num) {
            this.f41901g = num;
            return this;
        }

        /* renamed from: a */
        public C15926a mo57402a(Long l) {
            this.f41897c = l;
            return this;
        }

        /* renamed from: a */
        public C15926a mo57403a(String str) {
            this.f41895a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15926a newBuilder() {
        C15926a aVar = new C15926a();
        aVar.f41895a = this.calendar_id;
        aVar.f41896b = this.key;
        aVar.f41897c = this.original_time;
        aVar.f41898d = this.chat_id;
        aVar.f41899e = this.pull_all_attendee;
        aVar.f41900f = this.page_offset;
        aVar.f41901g = this.page_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullEventGroupAttendeeMembersRequest");
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
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.pull_all_attendee != null) {
            sb.append(", pull_all_attendee=");
            sb.append(this.pull_all_attendee);
        }
        if (this.page_offset != null) {
            sb.append(", page_offset=");
            sb.append(this.page_offset);
        }
        if (this.page_count != null) {
            sb.append(", page_count=");
            sb.append(this.page_count);
        }
        StringBuilder replace = sb.replace(0, 2, "PullEventGroupAttendeeMembersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullEventGroupAttendeeMembersRequest(String str, String str2, Long l, String str3, Boolean bool, String str4, Integer num) {
        this(str, str2, l, str3, bool, str4, num, ByteString.EMPTY);
    }

    public PullEventGroupAttendeeMembersRequest(String str, String str2, Long l, String str3, Boolean bool, String str4, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.chat_id = str3;
        this.pull_all_attendee = bool;
        this.page_offset = str4;
        this.page_count = num;
    }
}

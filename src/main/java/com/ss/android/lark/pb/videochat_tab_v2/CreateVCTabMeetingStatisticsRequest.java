package com.ss.android.lark.pb.videochat_tab_v2;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateVCTabMeetingStatisticsRequest extends Message<CreateVCTabMeetingStatisticsRequest, C50439a> {
    public static final ProtoAdapter<CreateVCTabMeetingStatisticsRequest> ADAPTER = new C50440b();
    public static final Boolean DEFAULT_IS_TWELVE_HOUR_TIME = false;
    private static final long serialVersionUID = 0;
    public final Boolean mis_twelve_hour_time;
    public final String mlocale;
    public final String mmeeting_id;
    public final String mtime_zone;

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.CreateVCTabMeetingStatisticsRequest$b */
    private static final class C50440b extends ProtoAdapter<CreateVCTabMeetingStatisticsRequest> {
        C50440b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateVCTabMeetingStatisticsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateVCTabMeetingStatisticsRequest createVCTabMeetingStatisticsRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (createVCTabMeetingStatisticsRequest.mmeeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createVCTabMeetingStatisticsRequest.mmeeting_id);
            } else {
                i = 0;
            }
            if (createVCTabMeetingStatisticsRequest.mtime_zone != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createVCTabMeetingStatisticsRequest.mtime_zone);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (createVCTabMeetingStatisticsRequest.mis_twelve_hour_time != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, createVCTabMeetingStatisticsRequest.mis_twelve_hour_time);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (createVCTabMeetingStatisticsRequest.mlocale != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, createVCTabMeetingStatisticsRequest.mlocale);
            }
            return i6 + i4 + createVCTabMeetingStatisticsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateVCTabMeetingStatisticsRequest decode(ProtoReader protoReader) throws IOException {
            C50439a aVar = new C50439a();
            aVar.f125981a = "";
            aVar.f125982b = "";
            aVar.f125983c = false;
            aVar.f125984d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125981a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125982b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125983c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125984d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateVCTabMeetingStatisticsRequest createVCTabMeetingStatisticsRequest) throws IOException {
            if (createVCTabMeetingStatisticsRequest.mmeeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createVCTabMeetingStatisticsRequest.mmeeting_id);
            }
            if (createVCTabMeetingStatisticsRequest.mtime_zone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createVCTabMeetingStatisticsRequest.mtime_zone);
            }
            if (createVCTabMeetingStatisticsRequest.mis_twelve_hour_time != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, createVCTabMeetingStatisticsRequest.mis_twelve_hour_time);
            }
            if (createVCTabMeetingStatisticsRequest.mlocale != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createVCTabMeetingStatisticsRequest.mlocale);
            }
            protoWriter.writeBytes(createVCTabMeetingStatisticsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat_tab_v2.CreateVCTabMeetingStatisticsRequest$a */
    public static final class C50439a extends Message.Builder<CreateVCTabMeetingStatisticsRequest, C50439a> {

        /* renamed from: a */
        public String f125981a;

        /* renamed from: b */
        public String f125982b;

        /* renamed from: c */
        public Boolean f125983c;

        /* renamed from: d */
        public String f125984d;

        /* renamed from: a */
        public CreateVCTabMeetingStatisticsRequest build() {
            return new CreateVCTabMeetingStatisticsRequest(this.f125981a, this.f125982b, this.f125983c, this.f125984d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50439a mo174771a(Boolean bool) {
            this.f125983c = bool;
            return this;
        }

        /* renamed from: b */
        public C50439a mo174774b(String str) {
            this.f125982b = str;
            return this;
        }

        /* renamed from: c */
        public C50439a mo174775c(String str) {
            this.f125984d = str;
            return this;
        }

        /* renamed from: a */
        public C50439a mo174772a(String str) {
            this.f125981a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50439a newBuilder() {
        C50439a aVar = new C50439a();
        aVar.f125981a = this.mmeeting_id;
        aVar.f125982b = this.mtime_zone;
        aVar.f125983c = this.mis_twelve_hour_time;
        aVar.f125984d = this.mlocale;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mmeeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.mmeeting_id);
        }
        if (this.mtime_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.mtime_zone);
        }
        if (this.mis_twelve_hour_time != null) {
            sb.append(", is_twelve_hour_time=");
            sb.append(this.mis_twelve_hour_time);
        }
        if (this.mlocale != null) {
            sb.append(", locale=");
            sb.append(this.mlocale);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateVCTabMeetingStatisticsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateVCTabMeetingStatisticsRequest(String str, String str2, Boolean bool, String str3) {
        this(str, str2, bool, str3, ByteString.EMPTY);
    }

    public CreateVCTabMeetingStatisticsRequest(String str, String str2, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmeeting_id = str;
        this.mtime_zone = str2;
        this.mis_twelve_hour_time = bool;
        this.mlocale = str3;
    }
}

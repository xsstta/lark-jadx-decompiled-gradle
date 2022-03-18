package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class InterviewCodingData extends Message<InterviewCodingData, C50805a> {
    public static final ProtoAdapter<InterviewCodingData> ADAPTER = new C50806b();
    public static final Long DEFAULT_DEVICE_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long device_id;
    public final String url;
    public final Long user_id;
    public final Long version;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InterviewCodingData$b */
    private static final class C50806b extends ProtoAdapter<InterviewCodingData> {
        C50806b() {
            super(FieldEncoding.LENGTH_DELIMITED, InterviewCodingData.class);
        }

        /* renamed from: a */
        public int encodedSize(InterviewCodingData interviewCodingData) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (interviewCodingData.user_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, interviewCodingData.user_id);
            } else {
                i = 0;
            }
            if (interviewCodingData.device_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, interviewCodingData.device_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (interviewCodingData.url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, interviewCodingData.url);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (interviewCodingData.version != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, interviewCodingData.version);
            }
            return i6 + i4 + interviewCodingData.unknownFields().size();
        }

        /* renamed from: a */
        public InterviewCodingData decode(ProtoReader protoReader) throws IOException {
            C50805a aVar = new C50805a();
            aVar.f126661a = 0L;
            aVar.f126662b = 0L;
            aVar.f126663c = "";
            aVar.f126664d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126661a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126662b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126663c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126664d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InterviewCodingData interviewCodingData) throws IOException {
            if (interviewCodingData.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, interviewCodingData.user_id);
            }
            if (interviewCodingData.device_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, interviewCodingData.device_id);
            }
            if (interviewCodingData.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, interviewCodingData.url);
            }
            if (interviewCodingData.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, interviewCodingData.version);
            }
            protoWriter.writeBytes(interviewCodingData.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.InterviewCodingData$a */
    public static final class C50805a extends Message.Builder<InterviewCodingData, C50805a> {

        /* renamed from: a */
        public Long f126661a;

        /* renamed from: b */
        public Long f126662b;

        /* renamed from: c */
        public String f126663c;

        /* renamed from: d */
        public Long f126664d;

        /* renamed from: a */
        public InterviewCodingData build() {
            return new InterviewCodingData(this.f126661a, this.f126662b, this.f126663c, this.f126664d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50805a newBuilder() {
        C50805a aVar = new C50805a();
        aVar.f126661a = this.user_id;
        aVar.f126662b = this.device_id;
        aVar.f126663c = this.url;
        aVar.f126664d = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "InterviewCodingData");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "InterviewCodingData{");
        replace.append('}');
        return replace.toString();
    }

    public InterviewCodingData(Long l, Long l2, String str, Long l3) {
        this(l, l2, str, l3, ByteString.EMPTY);
    }

    public InterviewCodingData(Long l, Long l2, String str, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
        this.device_id = l2;
        this.url = str;
        this.version = l3;
    }
}

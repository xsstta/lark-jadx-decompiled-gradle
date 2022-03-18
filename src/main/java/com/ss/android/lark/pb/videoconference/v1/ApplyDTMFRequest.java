package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ApplyDTMFRequest extends Message<ApplyDTMFRequest, C50465a> {
    public static final ProtoAdapter<ApplyDTMFRequest> ADAPTER = new C50466b();
    public static final Long DEFAULT_SEQ_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String dtmf_cmd;
    public final String meeting_id;
    public final Long seq_id;
    public final String user_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyDTMFRequest$b */
    private static final class C50466b extends ProtoAdapter<ApplyDTMFRequest> {
        C50466b() {
            super(FieldEncoding.LENGTH_DELIMITED, ApplyDTMFRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ApplyDTMFRequest applyDTMFRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, applyDTMFRequest.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, applyDTMFRequest.meeting_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, applyDTMFRequest.dtmf_cmd);
            if (applyDTMFRequest.seq_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(4, applyDTMFRequest.seq_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + applyDTMFRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ApplyDTMFRequest decode(ProtoReader protoReader) throws IOException {
            C50465a aVar = new C50465a();
            aVar.f126004a = "";
            aVar.f126005b = "";
            aVar.f126006c = "";
            aVar.f126007d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126004a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126005b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126006c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126007d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ApplyDTMFRequest applyDTMFRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, applyDTMFRequest.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, applyDTMFRequest.meeting_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, applyDTMFRequest.dtmf_cmd);
            if (applyDTMFRequest.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, applyDTMFRequest.seq_id);
            }
            protoWriter.writeBytes(applyDTMFRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50465a newBuilder() {
        C50465a aVar = new C50465a();
        aVar.f126004a = this.user_id;
        aVar.f126005b = this.meeting_id;
        aVar.f126006c = this.dtmf_cmd;
        aVar.f126007d = this.seq_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ApplyDTMFRequest$a */
    public static final class C50465a extends Message.Builder<ApplyDTMFRequest, C50465a> {

        /* renamed from: a */
        public String f126004a;

        /* renamed from: b */
        public String f126005b;

        /* renamed from: c */
        public String f126006c;

        /* renamed from: d */
        public Long f126007d;

        /* renamed from: a */
        public ApplyDTMFRequest build() {
            String str;
            String str2;
            String str3 = this.f126004a;
            if (str3 != null && (str = this.f126005b) != null && (str2 = this.f126006c) != null) {
                return new ApplyDTMFRequest(str3, str, str2, this.f126007d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "user_id", this.f126005b, "meeting_id", this.f126006c, "dtmf_cmd");
        }

        /* renamed from: a */
        public C50465a mo174831a(Long l) {
            this.f126007d = l;
            return this;
        }

        /* renamed from: b */
        public C50465a mo174834b(String str) {
            this.f126005b = str;
            return this;
        }

        /* renamed from: c */
        public C50465a mo174835c(String str) {
            this.f126006c = str;
            return this;
        }

        /* renamed from: a */
        public C50465a mo174832a(String str) {
            this.f126004a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ApplyDTMFRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", dtmf_cmd=");
        sb.append(this.dtmf_cmd);
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ApplyDTMFRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ApplyDTMFRequest(String str, String str2, String str3, Long l) {
        this(str, str2, str3, l, ByteString.EMPTY);
    }

    public ApplyDTMFRequest(String str, String str2, String str3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.meeting_id = str2;
        this.dtmf_cmd = str3;
        this.seq_id = l;
    }
}

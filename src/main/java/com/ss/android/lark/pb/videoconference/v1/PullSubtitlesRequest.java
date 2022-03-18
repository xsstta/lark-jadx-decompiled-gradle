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

public final class PullSubtitlesRequest extends Message<PullSubtitlesRequest, C50928a> {
    public static final ProtoAdapter<PullSubtitlesRequest> ADAPTER = new C50929b();
    public static final Integer DEFAULT_BACKWARD_BUFFER_COUNT = 0;
    public static final Long DEFAULT_COUNT = 10L;
    public static final Integer DEFAULT_FORWARD_BUFFER_COUNT = 0;
    public static final Boolean DEFAULT_IS_FORWARD = false;
    public static final Long DEFAULT_TARGET_SEG_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Integer backward_buffer_count;
    public final Long count;
    public final Integer forward_buffer_count;
    public final Boolean is_forward;
    public final String language;
    public final String meeting_id;
    public final Long target_seg_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullSubtitlesRequest$b */
    private static final class C50929b extends ProtoAdapter<PullSubtitlesRequest> {
        C50929b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullSubtitlesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullSubtitlesRequest pullSubtitlesRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullSubtitlesRequest.meeting_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, pullSubtitlesRequest.language);
            int i5 = 0;
            if (pullSubtitlesRequest.target_seg_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(3, pullSubtitlesRequest.target_seg_id);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (pullSubtitlesRequest.count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(4, pullSubtitlesRequest.count);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (pullSubtitlesRequest.is_forward != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, pullSubtitlesRequest.is_forward);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pullSubtitlesRequest.forward_buffer_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, pullSubtitlesRequest.forward_buffer_count);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pullSubtitlesRequest.backward_buffer_count != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, pullSubtitlesRequest.backward_buffer_count);
            }
            return i9 + i5 + pullSubtitlesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullSubtitlesRequest decode(ProtoReader protoReader) throws IOException {
            C50928a aVar = new C50928a();
            aVar.f126920a = "";
            aVar.f126921b = "";
            aVar.f126922c = 0L;
            aVar.f126923d = 10L;
            aVar.f126924e = false;
            aVar.f126925f = 0;
            aVar.f126926g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126920a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126921b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126922c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126923d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126924e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126925f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126926g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PullSubtitlesRequest pullSubtitlesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullSubtitlesRequest.meeting_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullSubtitlesRequest.language);
            if (pullSubtitlesRequest.target_seg_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullSubtitlesRequest.target_seg_id);
            }
            if (pullSubtitlesRequest.count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, pullSubtitlesRequest.count);
            }
            if (pullSubtitlesRequest.is_forward != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, pullSubtitlesRequest.is_forward);
            }
            if (pullSubtitlesRequest.forward_buffer_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, pullSubtitlesRequest.forward_buffer_count);
            }
            if (pullSubtitlesRequest.backward_buffer_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, pullSubtitlesRequest.backward_buffer_count);
            }
            protoWriter.writeBytes(pullSubtitlesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullSubtitlesRequest$a */
    public static final class C50928a extends Message.Builder<PullSubtitlesRequest, C50928a> {

        /* renamed from: a */
        public String f126920a;

        /* renamed from: b */
        public String f126921b;

        /* renamed from: c */
        public Long f126922c;

        /* renamed from: d */
        public Long f126923d;

        /* renamed from: e */
        public Boolean f126924e;

        /* renamed from: f */
        public Integer f126925f;

        /* renamed from: g */
        public Integer f126926g;

        /* renamed from: a */
        public PullSubtitlesRequest build() {
            String str;
            String str2 = this.f126920a;
            if (str2 != null && (str = this.f126921b) != null) {
                return new PullSubtitlesRequest(str2, str, this.f126922c, this.f126923d, this.f126924e, this.f126925f, this.f126926g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "meeting_id", this.f126921b, "language");
        }

        /* renamed from: a */
        public C50928a mo175925a(Boolean bool) {
            this.f126924e = bool;
            return this;
        }

        /* renamed from: b */
        public C50928a mo175930b(Integer num) {
            this.f126926g = num;
            return this;
        }

        /* renamed from: a */
        public C50928a mo175926a(Integer num) {
            this.f126925f = num;
            return this;
        }

        /* renamed from: b */
        public C50928a mo175931b(Long l) {
            this.f126923d = l;
            return this;
        }

        /* renamed from: a */
        public C50928a mo175927a(Long l) {
            this.f126922c = l;
            return this;
        }

        /* renamed from: b */
        public C50928a mo175932b(String str) {
            this.f126921b = str;
            return this;
        }

        /* renamed from: a */
        public C50928a mo175928a(String str) {
            this.f126920a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50928a newBuilder() {
        C50928a aVar = new C50928a();
        aVar.f126920a = this.meeting_id;
        aVar.f126921b = this.language;
        aVar.f126922c = this.target_seg_id;
        aVar.f126923d = this.count;
        aVar.f126924e = this.is_forward;
        aVar.f126925f = this.forward_buffer_count;
        aVar.f126926g = this.backward_buffer_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullSubtitlesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", language=");
        sb.append(this.language);
        if (this.target_seg_id != null) {
            sb.append(", target_seg_id=");
            sb.append(this.target_seg_id);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.is_forward != null) {
            sb.append(", is_forward=");
            sb.append(this.is_forward);
        }
        if (this.forward_buffer_count != null) {
            sb.append(", forward_buffer_count=");
            sb.append(this.forward_buffer_count);
        }
        if (this.backward_buffer_count != null) {
            sb.append(", backward_buffer_count=");
            sb.append(this.backward_buffer_count);
        }
        StringBuilder replace = sb.replace(0, 2, "PullSubtitlesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullSubtitlesRequest(String str, String str2, Long l, Long l2, Boolean bool, Integer num, Integer num2) {
        this(str, str2, l, l2, bool, num, num2, ByteString.EMPTY);
    }

    public PullSubtitlesRequest(String str, String str2, Long l, Long l2, Boolean bool, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.language = str2;
        this.target_seg_id = l;
        this.count = l2;
        this.is_forward = bool;
        this.forward_buffer_count = num;
        this.backward_buffer_count = num2;
    }
}

package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatLivePreCheckRequest extends Message<VideoChatLivePreCheckRequest, C51258a> {
    public static final ProtoAdapter<VideoChatLivePreCheckRequest> ADAPTER = new C51259b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final String meeting_number;
    public final String unique_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckRequest$b */
    private static final class C51259b extends ProtoAdapter<VideoChatLivePreCheckRequest> {
        C51259b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatLivePreCheckRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatLivePreCheckRequest videoChatLivePreCheckRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (videoChatLivePreCheckRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatLivePreCheckRequest.meeting_id);
            } else {
                i = 0;
            }
            if (videoChatLivePreCheckRequest.meeting_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, videoChatLivePreCheckRequest.meeting_number);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (videoChatLivePreCheckRequest.unique_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatLivePreCheckRequest.unique_id);
            }
            return i4 + i3 + videoChatLivePreCheckRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatLivePreCheckRequest decode(ProtoReader protoReader) throws IOException {
            C51258a aVar = new C51258a();
            aVar.f127647a = "";
            aVar.f127648b = "";
            aVar.f127649c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127647a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127648b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127649c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatLivePreCheckRequest videoChatLivePreCheckRequest) throws IOException {
            if (videoChatLivePreCheckRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatLivePreCheckRequest.meeting_id);
            }
            if (videoChatLivePreCheckRequest.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoChatLivePreCheckRequest.meeting_number);
            }
            if (videoChatLivePreCheckRequest.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatLivePreCheckRequest.unique_id);
            }
            protoWriter.writeBytes(videoChatLivePreCheckRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLivePreCheckRequest$a */
    public static final class C51258a extends Message.Builder<VideoChatLivePreCheckRequest, C51258a> {

        /* renamed from: a */
        public String f127647a;

        /* renamed from: b */
        public String f127648b;

        /* renamed from: c */
        public String f127649c;

        /* renamed from: a */
        public VideoChatLivePreCheckRequest build() {
            return new VideoChatLivePreCheckRequest(this.f127647a, this.f127648b, this.f127649c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51258a mo176733a(String str) {
            this.f127647a = str;
            return this;
        }

        /* renamed from: b */
        public C51258a mo176735b(String str) {
            this.f127648b = str;
            return this;
        }

        /* renamed from: c */
        public C51258a mo176736c(String str) {
            this.f127649c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51258a newBuilder() {
        C51258a aVar = new C51258a();
        aVar.f127647a = this.meeting_id;
        aVar.f127648b = this.meeting_number;
        aVar.f127649c = this.unique_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatLivePreCheckRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatLivePreCheckRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatLivePreCheckRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public VideoChatLivePreCheckRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.meeting_number = str2;
        this.unique_id = str3;
    }
}

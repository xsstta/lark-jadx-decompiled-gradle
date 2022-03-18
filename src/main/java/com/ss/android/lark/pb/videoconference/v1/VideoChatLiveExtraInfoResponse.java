package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatLiveExtraInfoResponse extends Message<VideoChatLiveExtraInfoResponse, C51256a> {
    public static final ProtoAdapter<VideoChatLiveExtraInfoResponse> ADAPTER = new C51257b();
    public static final Integer DEFAULT_ONLINE_USERS_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer online_users_count;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveExtraInfoResponse$b */
    private static final class C51257b extends ProtoAdapter<VideoChatLiveExtraInfoResponse> {
        C51257b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatLiveExtraInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatLiveExtraInfoResponse videoChatLiveExtraInfoResponse) {
            int i;
            if (videoChatLiveExtraInfoResponse.online_users_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, videoChatLiveExtraInfoResponse.online_users_count);
            } else {
                i = 0;
            }
            return i + videoChatLiveExtraInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatLiveExtraInfoResponse decode(ProtoReader protoReader) throws IOException {
            C51256a aVar = new C51256a();
            aVar.f127646a = 0;
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
                    aVar.f127646a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatLiveExtraInfoResponse videoChatLiveExtraInfoResponse) throws IOException {
            if (videoChatLiveExtraInfoResponse.online_users_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, videoChatLiveExtraInfoResponse.online_users_count);
            }
            protoWriter.writeBytes(videoChatLiveExtraInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveExtraInfoResponse$a */
    public static final class C51256a extends Message.Builder<VideoChatLiveExtraInfoResponse, C51256a> {

        /* renamed from: a */
        public Integer f127646a;

        /* renamed from: a */
        public VideoChatLiveExtraInfoResponse build() {
            return new VideoChatLiveExtraInfoResponse(this.f127646a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51256a newBuilder() {
        C51256a aVar = new C51256a();
        aVar.f127646a = this.online_users_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatLiveExtraInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.online_users_count != null) {
            sb.append(", online_users_count=");
            sb.append(this.online_users_count);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatLiveExtraInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatLiveExtraInfoResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public VideoChatLiveExtraInfoResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.online_users_count = num;
    }
}

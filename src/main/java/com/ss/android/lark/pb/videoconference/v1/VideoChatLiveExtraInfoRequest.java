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

public final class VideoChatLiveExtraInfoRequest extends Message<VideoChatLiveExtraInfoRequest, C51254a> {
    public static final ProtoAdapter<VideoChatLiveExtraInfoRequest> ADAPTER = new C51255b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final ByteviewUser requester;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveExtraInfoRequest$b */
    private static final class C51255b extends ProtoAdapter<VideoChatLiveExtraInfoRequest> {
        C51255b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatLiveExtraInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatLiveExtraInfoRequest videoChatLiveExtraInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatLiveExtraInfoRequest.meeting_id);
            if (videoChatLiveExtraInfoRequest.requester != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(2, videoChatLiveExtraInfoRequest.requester);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + videoChatLiveExtraInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatLiveExtraInfoRequest decode(ProtoReader protoReader) throws IOException {
            C51254a aVar = new C51254a();
            aVar.f127644a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127644a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127645b = ByteviewUser.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatLiveExtraInfoRequest videoChatLiveExtraInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatLiveExtraInfoRequest.meeting_id);
            if (videoChatLiveExtraInfoRequest.requester != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, videoChatLiveExtraInfoRequest.requester);
            }
            protoWriter.writeBytes(videoChatLiveExtraInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveExtraInfoRequest$a */
    public static final class C51254a extends Message.Builder<VideoChatLiveExtraInfoRequest, C51254a> {

        /* renamed from: a */
        public String f127644a;

        /* renamed from: b */
        public ByteviewUser f127645b;

        /* renamed from: a */
        public VideoChatLiveExtraInfoRequest build() {
            String str = this.f127644a;
            if (str != null) {
                return new VideoChatLiveExtraInfoRequest(str, this.f127645b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51254a newBuilder() {
        C51254a aVar = new C51254a();
        aVar.f127644a = this.meeting_id;
        aVar.f127645b = this.requester;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatLiveExtraInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.requester != null) {
            sb.append(", requester=");
            sb.append(this.requester);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatLiveExtraInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatLiveExtraInfoRequest(String str, ByteviewUser byteviewUser) {
        this(str, byteviewUser, ByteString.EMPTY);
    }

    public VideoChatLiveExtraInfoRequest(String str, ByteviewUser byteviewUser, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.requester = byteviewUser;
    }
}

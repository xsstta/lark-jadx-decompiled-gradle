package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ShareScreenToRoomResponse extends Message<ShareScreenToRoomResponse, C51052a> {
    public static final ProtoAdapter<ShareScreenToRoomResponse> ADAPTER = new C51053b();
    private static final long serialVersionUID = 0;
    public final VideoChatInfo info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomResponse$b */
    private static final class C51053b extends ProtoAdapter<ShareScreenToRoomResponse> {
        C51053b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareScreenToRoomResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareScreenToRoomResponse shareScreenToRoomResponse) {
            int i;
            if (shareScreenToRoomResponse.info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, shareScreenToRoomResponse.info);
            } else {
                i = 0;
            }
            return i + shareScreenToRoomResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareScreenToRoomResponse decode(ProtoReader protoReader) throws IOException {
            C51052a aVar = new C51052a();
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
                    aVar.f127132a = VideoChatInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareScreenToRoomResponse shareScreenToRoomResponse) throws IOException {
            if (shareScreenToRoomResponse.info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, shareScreenToRoomResponse.info);
            }
            protoWriter.writeBytes(shareScreenToRoomResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenToRoomResponse$a */
    public static final class C51052a extends Message.Builder<ShareScreenToRoomResponse, C51052a> {

        /* renamed from: a */
        public VideoChatInfo f127132a;

        /* renamed from: a */
        public ShareScreenToRoomResponse build() {
            return new ShareScreenToRoomResponse(this.f127132a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51052a newBuilder() {
        C51052a aVar = new C51052a();
        aVar.f127132a = this.info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareScreenToRoomResponse");
        StringBuilder sb = new StringBuilder();
        if (this.info != null) {
            sb.append(", info=");
            sb.append(this.info);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareScreenToRoomResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareScreenToRoomResponse(VideoChatInfo videoChatInfo) {
        this(videoChatInfo, ByteString.EMPTY);
    }

    public ShareScreenToRoomResponse(VideoChatInfo videoChatInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.info = videoChatInfo;
    }
}

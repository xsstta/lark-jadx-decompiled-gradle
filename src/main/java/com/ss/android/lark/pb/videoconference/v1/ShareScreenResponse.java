package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.videoconference.v1.InMeetingData;
import java.io.IOException;
import okio.ByteString;

public final class ShareScreenResponse extends Message<ShareScreenResponse, C51044a> {
    public static final ProtoAdapter<ShareScreenResponse> ADAPTER = new C51045b();
    private static final long serialVersionUID = 0;
    public final String share_screen_id;
    public final InMeetingData.ScreenSharedData share_screen_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenResponse$b */
    private static final class C51045b extends ProtoAdapter<ShareScreenResponse> {
        C51045b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareScreenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareScreenResponse shareScreenResponse) {
            int i;
            int i2 = 0;
            if (shareScreenResponse.share_screen_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, shareScreenResponse.share_screen_id);
            } else {
                i = 0;
            }
            if (shareScreenResponse.share_screen_info != null) {
                i2 = InMeetingData.ScreenSharedData.ADAPTER.encodedSizeWithTag(2, shareScreenResponse.share_screen_info);
            }
            return i + i2 + shareScreenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareScreenResponse decode(ProtoReader protoReader) throws IOException {
            C51044a aVar = new C51044a();
            aVar.f127117a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127117a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127118b = InMeetingData.ScreenSharedData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareScreenResponse shareScreenResponse) throws IOException {
            if (shareScreenResponse.share_screen_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareScreenResponse.share_screen_id);
            }
            if (shareScreenResponse.share_screen_info != null) {
                InMeetingData.ScreenSharedData.ADAPTER.encodeWithTag(protoWriter, 2, shareScreenResponse.share_screen_info);
            }
            protoWriter.writeBytes(shareScreenResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenResponse$a */
    public static final class C51044a extends Message.Builder<ShareScreenResponse, C51044a> {

        /* renamed from: a */
        public String f127117a;

        /* renamed from: b */
        public InMeetingData.ScreenSharedData f127118b;

        /* renamed from: a */
        public ShareScreenResponse build() {
            return new ShareScreenResponse(this.f127117a, this.f127118b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51044a newBuilder() {
        C51044a aVar = new C51044a();
        aVar.f127117a = this.share_screen_id;
        aVar.f127118b = this.share_screen_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareScreenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.share_screen_id != null) {
            sb.append(", share_screen_id=");
            sb.append(this.share_screen_id);
        }
        if (this.share_screen_info != null) {
            sb.append(", share_screen_info=");
            sb.append(this.share_screen_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareScreenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareScreenResponse(String str, InMeetingData.ScreenSharedData screenSharedData) {
        this(str, screenSharedData, ByteString.EMPTY);
    }

    public ShareScreenResponse(String str, InMeetingData.ScreenSharedData screenSharedData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_screen_id = str;
        this.share_screen_info = screenSharedData;
    }
}

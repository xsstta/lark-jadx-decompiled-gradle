package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ShareFollowResponse extends Message<ShareFollowResponse, C51040a> {
    public static final ProtoAdapter<ShareFollowResponse> ADAPTER = new C51041b();
    public static final Boolean DEFAULT_OPEN_IN_BROWSER = false;
    private static final long serialVersionUID = 0;
    public final FollowInfo follow_info;
    public final Boolean open_in_browser;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowResponse$b */
    private static final class C51041b extends ProtoAdapter<ShareFollowResponse> {
        C51041b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareFollowResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareFollowResponse shareFollowResponse) {
            int i;
            int i2 = 0;
            if (shareFollowResponse.follow_info != null) {
                i = FollowInfo.ADAPTER.encodedSizeWithTag(1, shareFollowResponse.follow_info);
            } else {
                i = 0;
            }
            if (shareFollowResponse.open_in_browser != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, shareFollowResponse.open_in_browser);
            }
            return i + i2 + shareFollowResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareFollowResponse decode(ProtoReader protoReader) throws IOException {
            C51040a aVar = new C51040a();
            aVar.f127107b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127106a = FollowInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127107b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareFollowResponse shareFollowResponse) throws IOException {
            if (shareFollowResponse.follow_info != null) {
                FollowInfo.ADAPTER.encodeWithTag(protoWriter, 1, shareFollowResponse.follow_info);
            }
            if (shareFollowResponse.open_in_browser != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, shareFollowResponse.open_in_browser);
            }
            protoWriter.writeBytes(shareFollowResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareFollowResponse$a */
    public static final class C51040a extends Message.Builder<ShareFollowResponse, C51040a> {

        /* renamed from: a */
        public FollowInfo f127106a;

        /* renamed from: b */
        public Boolean f127107b;

        /* renamed from: a */
        public ShareFollowResponse build() {
            return new ShareFollowResponse(this.f127106a, this.f127107b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51040a newBuilder() {
        C51040a aVar = new C51040a();
        aVar.f127106a = this.follow_info;
        aVar.f127107b = this.open_in_browser;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareFollowResponse");
        StringBuilder sb = new StringBuilder();
        if (this.follow_info != null) {
            sb.append(", follow_info=");
            sb.append(this.follow_info);
        }
        if (this.open_in_browser != null) {
            sb.append(", open_in_browser=");
            sb.append(this.open_in_browser);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareFollowResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareFollowResponse(FollowInfo followInfo, Boolean bool) {
        this(followInfo, bool, ByteString.EMPTY);
    }

    public ShareFollowResponse(FollowInfo followInfo, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.follow_info = followInfo;
        this.open_in_browser = bool;
    }
}

package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatPullLiveSettingRequest extends Message<VideoChatPullLiveSettingRequest, C50429a> {
    public static final ProtoAdapter<VideoChatPullLiveSettingRequest> ADAPTER = new C50430b();
    private static final long serialVersionUID = 0;
    public final String mmeeting_id;

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingRequest$b */
    private static final class C50430b extends ProtoAdapter<VideoChatPullLiveSettingRequest> {
        C50430b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatPullLiveSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatPullLiveSettingRequest videoChatPullLiveSettingRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatPullLiveSettingRequest.mmeeting_id) + videoChatPullLiveSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatPullLiveSettingRequest decode(ProtoReader protoReader) throws IOException {
            C50429a aVar = new C50429a();
            aVar.f125937a = "";
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
                    aVar.f125937a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatPullLiveSettingRequest videoChatPullLiveSettingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatPullLiveSettingRequest.mmeeting_id);
            protoWriter.writeBytes(videoChatPullLiveSettingRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatPullLiveSettingRequest$a */
    public static final class C50429a extends Message.Builder<VideoChatPullLiveSettingRequest, C50429a> {

        /* renamed from: a */
        public String f125937a;

        /* renamed from: a */
        public VideoChatPullLiveSettingRequest build() {
            String str = this.f125937a;
            if (str != null) {
                return new VideoChatPullLiveSettingRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmeeting_id");
        }

        /* renamed from: a */
        public C50429a mo174750a(String str) {
            this.f125937a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50429a newBuilder() {
        C50429a aVar = new C50429a();
        aVar.f125937a = this.mmeeting_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.mmeeting_id);
        StringBuilder replace = sb.replace(0, 2, "VideoChatPullLiveSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatPullLiveSettingRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public VideoChatPullLiveSettingRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmeeting_id = str;
    }
}

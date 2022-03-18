package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullPreVideoChatSettingResponse extends Message<PullPreVideoChatSettingResponse, C50926a> {
    public static final ProtoAdapter<PullPreVideoChatSettingResponse> ADAPTER = new C50927b();
    public static final Integer DEFAULT_MAX_PARTICIPANT_NUM = 0;
    private static final long serialVersionUID = 0;
    public final Integer max_participant_num;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingResponse$b */
    private static final class C50927b extends ProtoAdapter<PullPreVideoChatSettingResponse> {
        C50927b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullPreVideoChatSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullPreVideoChatSettingResponse pullPreVideoChatSettingResponse) {
            int i;
            if (pullPreVideoChatSettingResponse.max_participant_num != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, pullPreVideoChatSettingResponse.max_participant_num);
            } else {
                i = 0;
            }
            return i + pullPreVideoChatSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullPreVideoChatSettingResponse decode(ProtoReader protoReader) throws IOException {
            C50926a aVar = new C50926a();
            aVar.f126919a = 0;
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
                    aVar.f126919a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullPreVideoChatSettingResponse pullPreVideoChatSettingResponse) throws IOException {
            if (pullPreVideoChatSettingResponse.max_participant_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pullPreVideoChatSettingResponse.max_participant_num);
            }
            protoWriter.writeBytes(pullPreVideoChatSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingResponse$a */
    public static final class C50926a extends Message.Builder<PullPreVideoChatSettingResponse, C50926a> {

        /* renamed from: a */
        public Integer f126919a;

        /* renamed from: a */
        public PullPreVideoChatSettingResponse build() {
            return new PullPreVideoChatSettingResponse(this.f126919a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50926a newBuilder() {
        C50926a aVar = new C50926a();
        aVar.f126919a = this.max_participant_num;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullPreVideoChatSettingResponse");
        StringBuilder sb = new StringBuilder();
        if (this.max_participant_num != null) {
            sb.append(", max_participant_num=");
            sb.append(this.max_participant_num);
        }
        StringBuilder replace = sb.replace(0, 2, "PullPreVideoChatSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullPreVideoChatSettingResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public PullPreVideoChatSettingResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.max_participant_num = num;
    }
}

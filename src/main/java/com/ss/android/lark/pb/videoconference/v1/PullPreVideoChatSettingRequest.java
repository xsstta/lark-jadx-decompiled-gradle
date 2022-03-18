package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullPreVideoChatSettingRequest extends Message<PullPreVideoChatSettingRequest, C50924a> {
    public static final ProtoAdapter<PullPreVideoChatSettingRequest> ADAPTER = new C50925b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingRequest$b */
    private static final class C50925b extends ProtoAdapter<PullPreVideoChatSettingRequest> {
        C50925b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullPreVideoChatSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullPreVideoChatSettingRequest pullPreVideoChatSettingRequest) {
            return pullPreVideoChatSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullPreVideoChatSettingRequest decode(ProtoReader protoReader) throws IOException {
            C50924a aVar = new C50924a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullPreVideoChatSettingRequest pullPreVideoChatSettingRequest) throws IOException {
            protoWriter.writeBytes(pullPreVideoChatSettingRequest.unknownFields());
        }
    }

    public PullPreVideoChatSettingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullPreVideoChatSettingRequest$a */
    public static final class C50924a extends Message.Builder<PullPreVideoChatSettingRequest, C50924a> {
        /* renamed from: a */
        public PullPreVideoChatSettingRequest build() {
            return new PullPreVideoChatSettingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50924a newBuilder() {
        C50924a aVar = new C50924a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullPreVideoChatSettingRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullPreVideoChatSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullPreVideoChatSettingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

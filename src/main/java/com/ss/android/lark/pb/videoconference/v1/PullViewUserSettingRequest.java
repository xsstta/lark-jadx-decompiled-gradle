package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullViewUserSettingRequest extends Message<PullViewUserSettingRequest, C50942a> {
    public static final ProtoAdapter<PullViewUserSettingRequest> ADAPTER = new C50943b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullViewUserSettingRequest$b */
    private static final class C50943b extends ProtoAdapter<PullViewUserSettingRequest> {
        C50943b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullViewUserSettingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullViewUserSettingRequest pullViewUserSettingRequest) {
            return pullViewUserSettingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullViewUserSettingRequest decode(ProtoReader protoReader) throws IOException {
            C50942a aVar = new C50942a();
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
        public void encode(ProtoWriter protoWriter, PullViewUserSettingRequest pullViewUserSettingRequest) throws IOException {
            protoWriter.writeBytes(pullViewUserSettingRequest.unknownFields());
        }
    }

    public PullViewUserSettingRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullViewUserSettingRequest$a */
    public static final class C50942a extends Message.Builder<PullViewUserSettingRequest, C50942a> {
        /* renamed from: a */
        public PullViewUserSettingRequest build() {
            return new PullViewUserSettingRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50942a newBuilder() {
        C50942a aVar = new C50942a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullViewUserSettingRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullViewUserSettingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullViewUserSettingRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

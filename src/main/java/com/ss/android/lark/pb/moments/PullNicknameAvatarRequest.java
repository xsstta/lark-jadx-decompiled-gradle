package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullNicknameAvatarRequest extends Message<PullNicknameAvatarRequest, C49934a> {
    public static final ProtoAdapter<PullNicknameAvatarRequest> ADAPTER = new C49935b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknameAvatarRequest$b */
    private static final class C49935b extends ProtoAdapter<PullNicknameAvatarRequest> {
        C49935b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullNicknameAvatarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullNicknameAvatarRequest pullNicknameAvatarRequest) {
            return pullNicknameAvatarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullNicknameAvatarRequest decode(ProtoReader protoReader) throws IOException {
            C49934a aVar = new C49934a();
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
        public void encode(ProtoWriter protoWriter, PullNicknameAvatarRequest pullNicknameAvatarRequest) throws IOException {
            protoWriter.writeBytes(pullNicknameAvatarRequest.unknownFields());
        }
    }

    public PullNicknameAvatarRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknameAvatarRequest$a */
    public static final class C49934a extends Message.Builder<PullNicknameAvatarRequest, C49934a> {
        /* renamed from: a */
        public PullNicknameAvatarRequest build() {
            return new PullNicknameAvatarRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49934a newBuilder() {
        C49934a aVar = new C49934a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullNicknameAvatarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullNicknameAvatarRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

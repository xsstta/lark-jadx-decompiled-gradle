package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullNicknameAvatarResponse extends Message<PullNicknameAvatarResponse, C49936a> {
    public static final ProtoAdapter<PullNicknameAvatarResponse> ADAPTER = new C49937b();
    private static final long serialVersionUID = 0;
    public final String mavatar_key;

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknameAvatarResponse$b */
    private static final class C49937b extends ProtoAdapter<PullNicknameAvatarResponse> {
        C49937b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullNicknameAvatarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullNicknameAvatarResponse pullNicknameAvatarResponse) {
            int i;
            if (pullNicknameAvatarResponse.mavatar_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullNicknameAvatarResponse.mavatar_key);
            } else {
                i = 0;
            }
            return i + pullNicknameAvatarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullNicknameAvatarResponse decode(ProtoReader protoReader) throws IOException {
            C49936a aVar = new C49936a();
            aVar.f124946a = "";
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
                    aVar.f124946a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullNicknameAvatarResponse pullNicknameAvatarResponse) throws IOException {
            if (pullNicknameAvatarResponse.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullNicknameAvatarResponse.mavatar_key);
            }
            protoWriter.writeBytes(pullNicknameAvatarResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.PullNicknameAvatarResponse$a */
    public static final class C49936a extends Message.Builder<PullNicknameAvatarResponse, C49936a> {

        /* renamed from: a */
        public String f124946a;

        /* renamed from: a */
        public PullNicknameAvatarResponse build() {
            return new PullNicknameAvatarResponse(this.f124946a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49936a newBuilder() {
        C49936a aVar = new C49936a();
        aVar.f124946a = this.mavatar_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        StringBuilder replace = sb.replace(0, 2, "PullNicknameAvatarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullNicknameAvatarResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public PullNicknameAvatarResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mavatar_key = str;
    }
}

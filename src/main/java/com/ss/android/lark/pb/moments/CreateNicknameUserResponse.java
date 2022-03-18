package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import java.io.IOException;
import okio.ByteString;

public final class CreateNicknameUserResponse extends Message<CreateNicknameUserResponse, C49906a> {
    public static final ProtoAdapter<CreateNicknameUserResponse> ADAPTER = new C49907b();
    private static final long serialVersionUID = 0;
    public final MomentUser muser;

    /* renamed from: com.ss.android.lark.pb.moments.CreateNicknameUserResponse$b */
    private static final class C49907b extends ProtoAdapter<CreateNicknameUserResponse> {
        C49907b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateNicknameUserResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateNicknameUserResponse createNicknameUserResponse) {
            int i;
            if (createNicknameUserResponse.muser != null) {
                i = MomentUser.ADAPTER.encodedSizeWithTag(1, createNicknameUserResponse.muser);
            } else {
                i = 0;
            }
            return i + createNicknameUserResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateNicknameUserResponse decode(ProtoReader protoReader) throws IOException {
            C49906a aVar = new C49906a();
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
                    aVar.f124927a = MomentUser.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateNicknameUserResponse createNicknameUserResponse) throws IOException {
            if (createNicknameUserResponse.muser != null) {
                MomentUser.ADAPTER.encodeWithTag(protoWriter, 1, createNicknameUserResponse.muser);
            }
            protoWriter.writeBytes(createNicknameUserResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.CreateNicknameUserResponse$a */
    public static final class C49906a extends Message.Builder<CreateNicknameUserResponse, C49906a> {

        /* renamed from: a */
        public MomentUser f124927a;

        /* renamed from: a */
        public CreateNicknameUserResponse build() {
            return new CreateNicknameUserResponse(this.f124927a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49906a newBuilder() {
        C49906a aVar = new C49906a();
        aVar.f124927a = this.muser;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.muser != null) {
            sb.append(", user=");
            sb.append(this.muser);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateNicknameUserResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateNicknameUserResponse(MomentUser momentUser) {
        this(momentUser, ByteString.EMPTY);
    }

    public CreateNicknameUserResponse(MomentUser momentUser, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser = momentUser;
    }
}

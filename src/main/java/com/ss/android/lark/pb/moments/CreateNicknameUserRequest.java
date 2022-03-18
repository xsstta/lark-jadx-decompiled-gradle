package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.moments_entities.AnonymousNickname;
import java.io.IOException;
import okio.ByteString;

public final class CreateNicknameUserRequest extends Message<CreateNicknameUserRequest, C49904a> {
    public static final ProtoAdapter<CreateNicknameUserRequest> ADAPTER = new C49905b();
    private static final long serialVersionUID = 0;
    public final String mavatar_key;
    public final String mcircle_id;
    public final AnonymousNickname mnickname;

    /* renamed from: com.ss.android.lark.pb.moments.CreateNicknameUserRequest$b */
    private static final class C49905b extends ProtoAdapter<CreateNicknameUserRequest> {
        C49905b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateNicknameUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateNicknameUserRequest createNicknameUserRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (createNicknameUserRequest.mcircle_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createNicknameUserRequest.mcircle_id);
            } else {
                i = 0;
            }
            if (createNicknameUserRequest.mavatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createNicknameUserRequest.mavatar_key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (createNicknameUserRequest.mnickname != null) {
                i3 = AnonymousNickname.ADAPTER.encodedSizeWithTag(3, createNicknameUserRequest.mnickname);
            }
            return i4 + i3 + createNicknameUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateNicknameUserRequest decode(ProtoReader protoReader) throws IOException {
            C49904a aVar = new C49904a();
            aVar.f124924a = "";
            aVar.f124925b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124924a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124925b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124926c = AnonymousNickname.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateNicknameUserRequest createNicknameUserRequest) throws IOException {
            if (createNicknameUserRequest.mcircle_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createNicknameUserRequest.mcircle_id);
            }
            if (createNicknameUserRequest.mavatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createNicknameUserRequest.mavatar_key);
            }
            if (createNicknameUserRequest.mnickname != null) {
                AnonymousNickname.ADAPTER.encodeWithTag(protoWriter, 3, createNicknameUserRequest.mnickname);
            }
            protoWriter.writeBytes(createNicknameUserRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.CreateNicknameUserRequest$a */
    public static final class C49904a extends Message.Builder<CreateNicknameUserRequest, C49904a> {

        /* renamed from: a */
        public String f124924a;

        /* renamed from: b */
        public String f124925b;

        /* renamed from: c */
        public AnonymousNickname f124926c;

        /* renamed from: a */
        public CreateNicknameUserRequest build() {
            return new CreateNicknameUserRequest(this.f124924a, this.f124925b, this.f124926c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49904a mo173576a(AnonymousNickname anonymousNickname) {
            this.f124926c = anonymousNickname;
            return this;
        }

        /* renamed from: b */
        public C49904a mo173579b(String str) {
            this.f124925b = str;
            return this;
        }

        /* renamed from: a */
        public C49904a mo173577a(String str) {
            this.f124924a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49904a newBuilder() {
        C49904a aVar = new C49904a();
        aVar.f124924a = this.mcircle_id;
        aVar.f124925b = this.mavatar_key;
        aVar.f124926c = this.mnickname;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcircle_id != null) {
            sb.append(", circle_id=");
            sb.append(this.mcircle_id);
        }
        if (this.mavatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
        }
        if (this.mnickname != null) {
            sb.append(", nickname=");
            sb.append(this.mnickname);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateNicknameUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateNicknameUserRequest(String str, String str2, AnonymousNickname anonymousNickname) {
        this(str, str2, anonymousNickname, ByteString.EMPTY);
    }

    public CreateNicknameUserRequest(String str, String str2, AnonymousNickname anonymousNickname, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcircle_id = str;
        this.mavatar_key = str2;
        this.mnickname = anonymousNickname;
    }
}

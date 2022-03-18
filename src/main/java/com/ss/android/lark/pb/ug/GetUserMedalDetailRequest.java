package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserMedalDetailRequest extends Message<GetUserMedalDetailRequest, C50086a> {
    public static final ProtoAdapter<GetUserMedalDetailRequest> ADAPTER = new C50087b();
    private static final long serialVersionUID = 0;
    public final String mgrant_id;
    public final String mmedal_id;
    public final String muser_id;

    /* renamed from: com.ss.android.lark.pb.ug.GetUserMedalDetailRequest$b */
    private static final class C50087b extends ProtoAdapter<GetUserMedalDetailRequest> {
        C50087b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserMedalDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserMedalDetailRequest getUserMedalDetailRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getUserMedalDetailRequest.muser_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, getUserMedalDetailRequest.mmedal_id);
            if (getUserMedalDetailRequest.mgrant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getUserMedalDetailRequest.mgrant_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getUserMedalDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserMedalDetailRequest decode(ProtoReader protoReader) throws IOException {
            C50086a aVar = new C50086a();
            aVar.f125204a = "";
            aVar.f125205b = "";
            aVar.f125206c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125204a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125205b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125206c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserMedalDetailRequest getUserMedalDetailRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUserMedalDetailRequest.muser_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getUserMedalDetailRequest.mmedal_id);
            if (getUserMedalDetailRequest.mgrant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getUserMedalDetailRequest.mgrant_id);
            }
            protoWriter.writeBytes(getUserMedalDetailRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50086a newBuilder() {
        C50086a aVar = new C50086a();
        aVar.f125204a = this.muser_id;
        aVar.f125205b = this.mmedal_id;
        aVar.f125206c = this.mgrant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ug.GetUserMedalDetailRequest$a */
    public static final class C50086a extends Message.Builder<GetUserMedalDetailRequest, C50086a> {

        /* renamed from: a */
        public String f125204a;

        /* renamed from: b */
        public String f125205b;

        /* renamed from: c */
        public String f125206c;

        /* renamed from: a */
        public GetUserMedalDetailRequest build() {
            String str;
            String str2 = this.f125204a;
            if (str2 != null && (str = this.f125205b) != null) {
                return new GetUserMedalDetailRequest(str2, str, this.f125206c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "muser_id", this.f125205b, "mmedal_id");
        }

        /* renamed from: a */
        public C50086a mo173981a(String str) {
            this.f125204a = str;
            return this;
        }

        /* renamed from: b */
        public C50086a mo173983b(String str) {
            this.f125205b = str;
            return this;
        }

        /* renamed from: c */
        public C50086a mo173984c(String str) {
            this.f125206c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        sb.append(", medal_id=");
        sb.append(this.mmedal_id);
        if (this.mgrant_id != null) {
            sb.append(", grant_id=");
            sb.append(this.mgrant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserMedalDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserMedalDetailRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public GetUserMedalDetailRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
        this.mmedal_id = str2;
        this.mgrant_id = str3;
    }
}

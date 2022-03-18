package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserTakingMedalRequest extends Message<GetUserTakingMedalRequest, C50090a> {
    public static final ProtoAdapter<GetUserTakingMedalRequest> ADAPTER = new C50091b();
    private static final long serialVersionUID = 0;
    public final String muser_id;

    /* renamed from: com.ss.android.lark.pb.ug.GetUserTakingMedalRequest$b */
    private static final class C50091b extends ProtoAdapter<GetUserTakingMedalRequest> {
        C50091b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserTakingMedalRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserTakingMedalRequest getUserTakingMedalRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getUserTakingMedalRequest.muser_id) + getUserTakingMedalRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserTakingMedalRequest decode(ProtoReader protoReader) throws IOException {
            C50090a aVar = new C50090a();
            aVar.f125214a = "";
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
                    aVar.f125214a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserTakingMedalRequest getUserTakingMedalRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUserTakingMedalRequest.muser_id);
            protoWriter.writeBytes(getUserTakingMedalRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.GetUserTakingMedalRequest$a */
    public static final class C50090a extends Message.Builder<GetUserTakingMedalRequest, C50090a> {

        /* renamed from: a */
        public String f125214a;

        /* renamed from: a */
        public GetUserTakingMedalRequest build() {
            String str = this.f125214a;
            if (str != null) {
                return new GetUserTakingMedalRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "muser_id");
        }

        /* renamed from: a */
        public C50090a mo173992a(String str) {
            this.f125214a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50090a newBuilder() {
        C50090a aVar = new C50090a();
        aVar.f125214a = this.muser_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        StringBuilder replace = sb.replace(0, 2, "GetUserTakingMedalRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserTakingMedalRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetUserTakingMedalRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
    }
}

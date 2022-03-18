package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserProfileRequest extends Message<GetUserProfileRequest, C18400a> {
    public static final ProtoAdapter<GetUserProfileRequest> ADAPTER = new C18401b();
    public static final Boolean DEFAULT_USE_LOCAL = false;
    private static final long serialVersionUID = 0;
    public final Boolean use_local;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserProfileRequest$b */
    private static final class C18401b extends ProtoAdapter<GetUserProfileRequest> {
        C18401b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserProfileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserProfileRequest getUserProfileRequest) {
            int i;
            int i2 = 0;
            if (getUserProfileRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUserProfileRequest.user_id);
            } else {
                i = 0;
            }
            if (getUserProfileRequest.use_local != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserProfileRequest.use_local);
            }
            return i + i2 + getUserProfileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserProfileRequest decode(ProtoReader protoReader) throws IOException {
            C18400a aVar = new C18400a();
            aVar.f45781a = "";
            aVar.f45782b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45781a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45782b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserProfileRequest getUserProfileRequest) throws IOException {
            if (getUserProfileRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUserProfileRequest.user_id);
            }
            if (getUserProfileRequest.use_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUserProfileRequest.use_local);
            }
            protoWriter.writeBytes(getUserProfileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetUserProfileRequest$a */
    public static final class C18400a extends Message.Builder<GetUserProfileRequest, C18400a> {

        /* renamed from: a */
        public String f45781a;

        /* renamed from: b */
        public Boolean f45782b;

        /* renamed from: a */
        public GetUserProfileRequest build() {
            return new GetUserProfileRequest(this.f45781a, this.f45782b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18400a mo63621a(Boolean bool) {
            this.f45782b = bool;
            return this;
        }

        /* renamed from: a */
        public C18400a mo63622a(String str) {
            this.f45781a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18400a newBuilder() {
        C18400a aVar = new C18400a();
        aVar.f45781a = this.user_id;
        aVar.f45782b = this.use_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetUserProfileRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.use_local != null) {
            sb.append(", use_local=");
            sb.append(this.use_local);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserProfileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserProfileRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public GetUserProfileRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.use_local = bool;
    }
}

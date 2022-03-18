package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UnfollowUserRequest extends Message<UnfollowUserRequest, C18554a> {
    public static final ProtoAdapter<UnfollowUserRequest> ADAPTER = new C18555b();
    private static final long serialVersionUID = 0;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.UnfollowUserRequest$b */
    private static final class C18555b extends ProtoAdapter<UnfollowUserRequest> {
        C18555b() {
            super(FieldEncoding.LENGTH_DELIMITED, UnfollowUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UnfollowUserRequest unfollowUserRequest) {
            int i;
            if (unfollowUserRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, unfollowUserRequest.user_id);
            } else {
                i = 0;
            }
            return i + unfollowUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UnfollowUserRequest decode(ProtoReader protoReader) throws IOException {
            C18554a aVar = new C18554a();
            aVar.f46044a = "";
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
                    aVar.f46044a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UnfollowUserRequest unfollowUserRequest) throws IOException {
            if (unfollowUserRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unfollowUserRequest.user_id);
            }
            protoWriter.writeBytes(unfollowUserRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.UnfollowUserRequest$a */
    public static final class C18554a extends Message.Builder<UnfollowUserRequest, C18554a> {

        /* renamed from: a */
        public String f46044a;

        /* renamed from: a */
        public UnfollowUserRequest build() {
            return new UnfollowUserRequest(this.f46044a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18554a mo63994a(String str) {
            this.f46044a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18554a newBuilder() {
        C18554a aVar = new C18554a();
        aVar.f46044a = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "UnfollowUserRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "UnfollowUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UnfollowUserRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UnfollowUserRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
    }
}

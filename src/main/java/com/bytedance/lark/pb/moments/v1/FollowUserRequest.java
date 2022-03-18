package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FollowUserRequest extends Message<FollowUserRequest, C18370a> {
    public static final ProtoAdapter<FollowUserRequest> ADAPTER = new C18371b();
    private static final long serialVersionUID = 0;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.FollowUserRequest$b */
    private static final class C18371b extends ProtoAdapter<FollowUserRequest> {
        C18371b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowUserRequest followUserRequest) {
            int i;
            if (followUserRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, followUserRequest.user_id);
            } else {
                i = 0;
            }
            return i + followUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FollowUserRequest decode(ProtoReader protoReader) throws IOException {
            C18370a aVar = new C18370a();
            aVar.f45755a = "";
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
                    aVar.f45755a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowUserRequest followUserRequest) throws IOException {
            if (followUserRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followUserRequest.user_id);
            }
            protoWriter.writeBytes(followUserRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.FollowUserRequest$a */
    public static final class C18370a extends Message.Builder<FollowUserRequest, C18370a> {

        /* renamed from: a */
        public String f45755a;

        /* renamed from: a */
        public FollowUserRequest build() {
            return new FollowUserRequest(this.f45755a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18370a mo63552a(String str) {
            this.f45755a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18370a newBuilder() {
        C18370a aVar = new C18370a();
        aVar.f45755a = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "FollowUserRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FollowUserRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public FollowUserRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
    }
}

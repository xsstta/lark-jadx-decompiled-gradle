package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullChangeGroupMemberAuthorizationResponse extends Message<PullChangeGroupMemberAuthorizationResponse, C49586a> {
    public static final ProtoAdapter<PullChangeGroupMemberAuthorizationResponse> ADAPTER = new C49587b();
    public static final Boolean DEFAULT_PASS = false;
    private static final long serialVersionUID = 0;
    public final String mmsg_description;
    public final Boolean mpass;

    /* renamed from: com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationResponse$b */
    private static final class C49587b extends ProtoAdapter<PullChangeGroupMemberAuthorizationResponse> {
        C49587b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChangeGroupMemberAuthorizationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChangeGroupMemberAuthorizationResponse pullChangeGroupMemberAuthorizationResponse) {
            int i;
            int i2 = 0;
            if (pullChangeGroupMemberAuthorizationResponse.mpass != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pullChangeGroupMemberAuthorizationResponse.mpass);
            } else {
                i = 0;
            }
            if (pullChangeGroupMemberAuthorizationResponse.mmsg_description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullChangeGroupMemberAuthorizationResponse.mmsg_description);
            }
            return i + i2 + pullChangeGroupMemberAuthorizationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChangeGroupMemberAuthorizationResponse decode(ProtoReader protoReader) throws IOException {
            C49586a aVar = new C49586a();
            aVar.f124202a = false;
            aVar.f124203b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124202a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124203b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChangeGroupMemberAuthorizationResponse pullChangeGroupMemberAuthorizationResponse) throws IOException {
            if (pullChangeGroupMemberAuthorizationResponse.mpass != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullChangeGroupMemberAuthorizationResponse.mpass);
            }
            if (pullChangeGroupMemberAuthorizationResponse.mmsg_description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullChangeGroupMemberAuthorizationResponse.mmsg_description);
            }
            protoWriter.writeBytes(pullChangeGroupMemberAuthorizationResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChangeGroupMemberAuthorizationResponse$a */
    public static final class C49586a extends Message.Builder<PullChangeGroupMemberAuthorizationResponse, C49586a> {

        /* renamed from: a */
        public Boolean f124202a;

        /* renamed from: b */
        public String f124203b;

        /* renamed from: a */
        public PullChangeGroupMemberAuthorizationResponse build() {
            return new PullChangeGroupMemberAuthorizationResponse(this.f124202a, this.f124203b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49586a newBuilder() {
        C49586a aVar = new C49586a();
        aVar.f124202a = this.mpass;
        aVar.f124203b = this.mmsg_description;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mpass != null) {
            sb.append(", pass=");
            sb.append(this.mpass);
        }
        if (this.mmsg_description != null) {
            sb.append(", msg_description=");
            sb.append(this.mmsg_description);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChangeGroupMemberAuthorizationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChangeGroupMemberAuthorizationResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public PullChangeGroupMemberAuthorizationResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpass = bool;
        this.mmsg_description = str;
    }
}

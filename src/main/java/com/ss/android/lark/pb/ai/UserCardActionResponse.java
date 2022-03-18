package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UserCardActionResponse extends Message<UserCardActionResponse, C49535a> {
    public static final ProtoAdapter<UserCardActionResponse> ADAPTER = new C49536b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final String merror;
    public final Boolean msuccess;

    /* renamed from: com.ss.android.lark.pb.ai.UserCardActionResponse$b */
    private static final class C49536b extends ProtoAdapter<UserCardActionResponse> {
        C49536b() {
            super(FieldEncoding.LENGTH_DELIMITED, UserCardActionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UserCardActionResponse userCardActionResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, userCardActionResponse.msuccess);
            if (userCardActionResponse.merror != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, userCardActionResponse.merror);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + userCardActionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UserCardActionResponse decode(ProtoReader protoReader) throws IOException {
            C49535a aVar = new C49535a();
            aVar.f124131a = false;
            aVar.f124132b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124131a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124132b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UserCardActionResponse userCardActionResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, userCardActionResponse.msuccess);
            if (userCardActionResponse.merror != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userCardActionResponse.merror);
            }
            protoWriter.writeBytes(userCardActionResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.UserCardActionResponse$a */
    public static final class C49535a extends Message.Builder<UserCardActionResponse, C49535a> {

        /* renamed from: a */
        public Boolean f124131a;

        /* renamed from: b */
        public String f124132b;

        /* renamed from: a */
        public UserCardActionResponse build() {
            Boolean bool = this.f124131a;
            if (bool != null) {
                return new UserCardActionResponse(bool, this.f124132b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "msuccess");
        }
    }

    @Override // com.squareup.wire.Message
    public C49535a newBuilder() {
        C49535a aVar = new C49535a();
        aVar.f124131a = this.msuccess;
        aVar.f124132b = this.merror;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.msuccess);
        if (this.merror != null) {
            sb.append(", error=");
            sb.append(this.merror);
        }
        StringBuilder replace = sb.replace(0, 2, "UserCardActionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UserCardActionResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public UserCardActionResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msuccess = bool;
        this.merror = str;
    }
}

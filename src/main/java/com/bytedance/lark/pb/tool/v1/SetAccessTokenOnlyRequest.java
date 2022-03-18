package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetAccessTokenOnlyRequest extends Message<SetAccessTokenOnlyRequest, C19747a> {
    public static final ProtoAdapter<SetAccessTokenOnlyRequest> ADAPTER = new C19748b();
    private static final long serialVersionUID = 0;
    public final String access_token;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetAccessTokenOnlyRequest$b */
    private static final class C19748b extends ProtoAdapter<SetAccessTokenOnlyRequest> {
        C19748b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetAccessTokenOnlyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetAccessTokenOnlyRequest setAccessTokenOnlyRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, setAccessTokenOnlyRequest.access_token);
            if (setAccessTokenOnlyRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, setAccessTokenOnlyRequest.user_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setAccessTokenOnlyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetAccessTokenOnlyRequest decode(ProtoReader protoReader) throws IOException {
            C19747a aVar = new C19747a();
            aVar.f48215a = "";
            aVar.f48216b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48215a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48216b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetAccessTokenOnlyRequest setAccessTokenOnlyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setAccessTokenOnlyRequest.access_token);
            if (setAccessTokenOnlyRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setAccessTokenOnlyRequest.user_id);
            }
            protoWriter.writeBytes(setAccessTokenOnlyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetAccessTokenOnlyRequest$a */
    public static final class C19747a extends Message.Builder<SetAccessTokenOnlyRequest, C19747a> {

        /* renamed from: a */
        public String f48215a;

        /* renamed from: b */
        public String f48216b;

        /* renamed from: a */
        public SetAccessTokenOnlyRequest build() {
            String str = this.f48215a;
            if (str != null) {
                return new SetAccessTokenOnlyRequest(str, this.f48216b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "access_token");
        }

        /* renamed from: a */
        public C19747a mo66897a(String str) {
            this.f48215a = str;
            return this;
        }

        /* renamed from: b */
        public C19747a mo66899b(String str) {
            this.f48216b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19747a newBuilder() {
        C19747a aVar = new C19747a();
        aVar.f48215a = this.access_token;
        aVar.f48216b = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetAccessTokenOnlyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", access_token=");
        sb.append(this.access_token);
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SetAccessTokenOnlyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetAccessTokenOnlyRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SetAccessTokenOnlyRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.access_token = str;
        this.user_id = str2;
    }
}

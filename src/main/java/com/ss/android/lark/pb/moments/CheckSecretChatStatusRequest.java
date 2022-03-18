package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckSecretChatStatusRequest extends Message<CheckSecretChatStatusRequest, C49900a> {
    public static final ProtoAdapter<CheckSecretChatStatusRequest> ADAPTER = new C49901b();
    private static final long serialVersionUID = 0;
    public final String mcomment_id;
    public final String mpost_id;

    /* renamed from: com.ss.android.lark.pb.moments.CheckSecretChatStatusRequest$b */
    private static final class C49901b extends ProtoAdapter<CheckSecretChatStatusRequest> {
        C49901b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckSecretChatStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckSecretChatStatusRequest checkSecretChatStatusRequest) {
            int i;
            int i2 = 0;
            if (checkSecretChatStatusRequest.mpost_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, checkSecretChatStatusRequest.mpost_id);
            } else {
                i = 0;
            }
            if (checkSecretChatStatusRequest.mcomment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, checkSecretChatStatusRequest.mcomment_id);
            }
            return i + i2 + checkSecretChatStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckSecretChatStatusRequest decode(ProtoReader protoReader) throws IOException {
            C49900a aVar = new C49900a();
            aVar.f124919a = "";
            aVar.f124920b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124919a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124920b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckSecretChatStatusRequest checkSecretChatStatusRequest) throws IOException {
            if (checkSecretChatStatusRequest.mpost_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkSecretChatStatusRequest.mpost_id);
            }
            if (checkSecretChatStatusRequest.mcomment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, checkSecretChatStatusRequest.mcomment_id);
            }
            protoWriter.writeBytes(checkSecretChatStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.CheckSecretChatStatusRequest$a */
    public static final class C49900a extends Message.Builder<CheckSecretChatStatusRequest, C49900a> {

        /* renamed from: a */
        public String f124919a;

        /* renamed from: b */
        public String f124920b;

        /* renamed from: a */
        public CheckSecretChatStatusRequest build() {
            return new CheckSecretChatStatusRequest(this.f124919a, this.f124920b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49900a mo173566a(String str) {
            this.f124919a = str;
            return this;
        }

        /* renamed from: b */
        public C49900a mo173568b(String str) {
            this.f124920b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49900a newBuilder() {
        C49900a aVar = new C49900a();
        aVar.f124919a = this.mpost_id;
        aVar.f124920b = this.mcomment_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mpost_id != null) {
            sb.append(", post_id=");
            sb.append(this.mpost_id);
        }
        if (this.mcomment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.mcomment_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckSecretChatStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckSecretChatStatusRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CheckSecretChatStatusRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpost_id = str;
        this.mcomment_id = str2;
    }
}

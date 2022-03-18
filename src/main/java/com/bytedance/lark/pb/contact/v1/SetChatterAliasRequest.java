package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetChatterAliasRequest extends Message<SetChatterAliasRequest, C16394a> {
    public static final ProtoAdapter<SetChatterAliasRequest> ADAPTER = new C16395b();
    private static final long serialVersionUID = 0;
    public final String alias;
    public final String target_id;
    public final String target_token;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetChatterAliasRequest$b */
    private static final class C16395b extends ProtoAdapter<SetChatterAliasRequest> {
        C16395b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetChatterAliasRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetChatterAliasRequest setChatterAliasRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, setChatterAliasRequest.target_id);
            int i2 = 0;
            if (setChatterAliasRequest.alias != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, setChatterAliasRequest.alias);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (setChatterAliasRequest.target_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, setChatterAliasRequest.target_token);
            }
            return i3 + i2 + setChatterAliasRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetChatterAliasRequest decode(ProtoReader protoReader) throws IOException {
            C16394a aVar = new C16394a();
            aVar.f42656a = "";
            aVar.f42657b = "";
            aVar.f42658c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42656a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42657b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42658c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetChatterAliasRequest setChatterAliasRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setChatterAliasRequest.target_id);
            if (setChatterAliasRequest.alias != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setChatterAliasRequest.alias);
            }
            if (setChatterAliasRequest.target_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setChatterAliasRequest.target_token);
            }
            protoWriter.writeBytes(setChatterAliasRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16394a newBuilder() {
        C16394a aVar = new C16394a();
        aVar.f42656a = this.target_id;
        aVar.f42657b = this.alias;
        aVar.f42658c = this.target_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetChatterAliasRequest$a */
    public static final class C16394a extends Message.Builder<SetChatterAliasRequest, C16394a> {

        /* renamed from: a */
        public String f42656a;

        /* renamed from: b */
        public String f42657b;

        /* renamed from: c */
        public String f42658c;

        /* renamed from: a */
        public SetChatterAliasRequest build() {
            String str = this.f42656a;
            if (str != null) {
                return new SetChatterAliasRequest(str, this.f42657b, this.f42658c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "target_id");
        }

        /* renamed from: a */
        public C16394a mo58536a(String str) {
            this.f42656a = str;
            return this;
        }

        /* renamed from: b */
        public C16394a mo58538b(String str) {
            this.f42657b = str;
            return this;
        }

        /* renamed from: c */
        public C16394a mo58539c(String str) {
            this.f42658c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetChatterAliasRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", target_id=");
        sb.append(this.target_id);
        if (this.alias != null) {
            sb.append(", alias=");
            sb.append(this.alias);
        }
        if (this.target_token != null) {
            sb.append(", target_token=");
            sb.append(this.target_token);
        }
        StringBuilder replace = sb.replace(0, 2, "SetChatterAliasRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetChatterAliasRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public SetChatterAliasRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_id = str;
        this.alias = str2;
        this.target_token = str3;
    }
}

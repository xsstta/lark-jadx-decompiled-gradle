package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAppDetailRequest extends Message<GetAppDetailRequest, C18649a> {
    public static final ProtoAdapter<GetAppDetailRequest> ADAPTER = new C18650b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String bot_id;
    public final String mini_program_version;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetAppDetailRequest$b */
    private static final class C18650b extends ProtoAdapter<GetAppDetailRequest> {
        C18650b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAppDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAppDetailRequest getAppDetailRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getAppDetailRequest.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAppDetailRequest.app_id);
            } else {
                i = 0;
            }
            if (getAppDetailRequest.bot_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getAppDetailRequest.bot_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getAppDetailRequest.mini_program_version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getAppDetailRequest.mini_program_version);
            }
            return i4 + i3 + getAppDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAppDetailRequest decode(ProtoReader protoReader) throws IOException {
            C18649a aVar = new C18649a();
            aVar.f46173a = "";
            aVar.f46174b = "";
            aVar.f46175c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46173a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46174b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46175c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAppDetailRequest getAppDetailRequest) throws IOException {
            if (getAppDetailRequest.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAppDetailRequest.app_id);
            }
            if (getAppDetailRequest.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAppDetailRequest.bot_id);
            }
            if (getAppDetailRequest.mini_program_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getAppDetailRequest.mini_program_version);
            }
            protoWriter.writeBytes(getAppDetailRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetAppDetailRequest$a */
    public static final class C18649a extends Message.Builder<GetAppDetailRequest, C18649a> {

        /* renamed from: a */
        public String f46173a;

        /* renamed from: b */
        public String f46174b;

        /* renamed from: c */
        public String f46175c;

        /* renamed from: a */
        public GetAppDetailRequest build() {
            return new GetAppDetailRequest(this.f46173a, this.f46174b, this.f46175c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18649a mo64215a(String str) {
            this.f46173a = str;
            return this;
        }

        /* renamed from: b */
        public C18649a mo64217b(String str) {
            this.f46174b = str;
            return this;
        }

        /* renamed from: c */
        public C18649a mo64218c(String str) {
            this.f46175c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18649a newBuilder() {
        C18649a aVar = new C18649a();
        aVar.f46173a = this.app_id;
        aVar.f46174b = this.bot_id;
        aVar.f46175c = this.mini_program_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetAppDetailRequest");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.mini_program_version != null) {
            sb.append(", mini_program_version=");
            sb.append(this.mini_program_version);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAppDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAppDetailRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public GetAppDetailRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.bot_id = str2;
        this.mini_program_version = str3;
    }
}

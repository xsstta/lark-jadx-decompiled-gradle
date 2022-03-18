package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateUserCustomStatusRequest extends Message<CreateUserCustomStatusRequest, C16152a> {
    public static final ProtoAdapter<CreateUserCustomStatusRequest> ADAPTER = new C16153b();
    public static final Boolean DEFAULT_IS_NOT_DISTURB_MODE = false;
    private static final long serialVersionUID = 0;
    public final String icon_key;
    public final Boolean is_not_disturb_mode;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusRequest$b */
    private static final class C16153b extends ProtoAdapter<CreateUserCustomStatusRequest> {
        C16153b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateUserCustomStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateUserCustomStatusRequest createUserCustomStatusRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (createUserCustomStatusRequest.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createUserCustomStatusRequest.title);
            } else {
                i = 0;
            }
            if (createUserCustomStatusRequest.icon_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createUserCustomStatusRequest.icon_key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (createUserCustomStatusRequest.is_not_disturb_mode != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, createUserCustomStatusRequest.is_not_disturb_mode);
            }
            return i4 + i3 + createUserCustomStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateUserCustomStatusRequest decode(ProtoReader protoReader) throws IOException {
            C16152a aVar = new C16152a();
            aVar.f42275a = "";
            aVar.f42276b = "";
            aVar.f42277c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42275a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42276b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42277c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateUserCustomStatusRequest createUserCustomStatusRequest) throws IOException {
            if (createUserCustomStatusRequest.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createUserCustomStatusRequest.title);
            }
            if (createUserCustomStatusRequest.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createUserCustomStatusRequest.icon_key);
            }
            if (createUserCustomStatusRequest.is_not_disturb_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, createUserCustomStatusRequest.is_not_disturb_mode);
            }
            protoWriter.writeBytes(createUserCustomStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusRequest$a */
    public static final class C16152a extends Message.Builder<CreateUserCustomStatusRequest, C16152a> {

        /* renamed from: a */
        public String f42275a;

        /* renamed from: b */
        public String f42276b;

        /* renamed from: c */
        public Boolean f42277c;

        /* renamed from: a */
        public CreateUserCustomStatusRequest build() {
            return new CreateUserCustomStatusRequest(this.f42275a, this.f42276b, this.f42277c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16152a mo57966a(Boolean bool) {
            this.f42277c = bool;
            return this;
        }

        /* renamed from: b */
        public C16152a mo57969b(String str) {
            this.f42276b = str;
            return this;
        }

        /* renamed from: a */
        public C16152a mo57967a(String str) {
            this.f42275a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16152a newBuilder() {
        C16152a aVar = new C16152a();
        aVar.f42275a = this.title;
        aVar.f42276b = this.icon_key;
        aVar.f42277c = this.is_not_disturb_mode;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CreateUserCustomStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.is_not_disturb_mode != null) {
            sb.append(", is_not_disturb_mode=");
            sb.append(this.is_not_disturb_mode);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateUserCustomStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateUserCustomStatusRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public CreateUserCustomStatusRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.icon_key = str2;
        this.is_not_disturb_mode = bool;
    }
}

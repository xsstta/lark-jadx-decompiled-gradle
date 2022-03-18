package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserProfileRequest extends Message<GetUserProfileRequest, C16280a> {
    public static final ProtoAdapter<GetUserProfileRequest> ADAPTER = new C16281b();
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    public static final Boolean DEFAULT_IS_SELF = false;
    private static final long serialVersionUID = 0;
    public final String contact_token;
    public final Boolean is_from_server;
    public final Boolean is_self;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileRequest$b */
    private static final class C16281b extends ProtoAdapter<GetUserProfileRequest> {
        C16281b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserProfileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserProfileRequest getUserProfileRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getUserProfileRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUserProfileRequest.user_id);
            } else {
                i = 0;
            }
            if (getUserProfileRequest.contact_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getUserProfileRequest.contact_token);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getUserProfileRequest.is_self != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getUserProfileRequest.is_self);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getUserProfileRequest.is_from_server != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getUserProfileRequest.is_from_server);
            }
            return i6 + i4 + getUserProfileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserProfileRequest decode(ProtoReader protoReader) throws IOException {
            C16280a aVar = new C16280a();
            aVar.f42475a = "";
            aVar.f42476b = "";
            aVar.f42477c = false;
            aVar.f42478d = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42475a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42476b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42477c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42478d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserProfileRequest getUserProfileRequest) throws IOException {
            if (getUserProfileRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUserProfileRequest.user_id);
            }
            if (getUserProfileRequest.contact_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getUserProfileRequest.contact_token);
            }
            if (getUserProfileRequest.is_self != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getUserProfileRequest.is_self);
            }
            if (getUserProfileRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getUserProfileRequest.is_from_server);
            }
            protoWriter.writeBytes(getUserProfileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetUserProfileRequest$a */
    public static final class C16280a extends Message.Builder<GetUserProfileRequest, C16280a> {

        /* renamed from: a */
        public String f42475a;

        /* renamed from: b */
        public String f42476b;

        /* renamed from: c */
        public Boolean f42477c;

        /* renamed from: d */
        public Boolean f42478d;

        /* renamed from: a */
        public GetUserProfileRequest build() {
            return new GetUserProfileRequest(this.f42475a, this.f42476b, this.f42477c, this.f42478d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16280a mo58276a(Boolean bool) {
            this.f42477c = bool;
            return this;
        }

        /* renamed from: b */
        public C16280a mo58279b(Boolean bool) {
            this.f42478d = bool;
            return this;
        }

        /* renamed from: a */
        public C16280a mo58277a(String str) {
            this.f42475a = str;
            return this;
        }

        /* renamed from: b */
        public C16280a mo58280b(String str) {
            this.f42476b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16280a newBuilder() {
        C16280a aVar = new C16280a();
        aVar.f42475a = this.user_id;
        aVar.f42476b = this.contact_token;
        aVar.f42477c = this.is_self;
        aVar.f42478d = this.is_from_server;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserProfileRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.contact_token != null) {
            sb.append(", contact_token=");
            sb.append(this.contact_token);
        }
        if (this.is_self != null) {
            sb.append(", is_self=");
            sb.append(this.is_self);
        }
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserProfileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserProfileRequest(String str, String str2, Boolean bool, Boolean bool2) {
        this(str, str2, bool, bool2, ByteString.EMPTY);
    }

    public GetUserProfileRequest(String str, String str2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.contact_token = str2;
        this.is_self = bool;
        this.is_from_server = bool2;
    }
}

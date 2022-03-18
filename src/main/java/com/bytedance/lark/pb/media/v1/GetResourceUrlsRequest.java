package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetResourceUrlsRequest extends Message<GetResourceUrlsRequest, C18254a> {
    public static final ProtoAdapter<GetResourceUrlsRequest> ADAPTER = new C18255b();
    private static final long serialVersionUID = 0;
    public final AvatarFsUnitParams avatar_fs_unit_params;
    public final String fs_unit;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourceUrlsRequest$b */
    private static final class C18255b extends ProtoAdapter<GetResourceUrlsRequest> {
        C18255b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceUrlsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceUrlsRequest getResourceUrlsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getResourceUrlsRequest.key);
            int i2 = 0;
            if (getResourceUrlsRequest.avatar_fs_unit_params != null) {
                i = AvatarFsUnitParams.ADAPTER.encodedSizeWithTag(2, getResourceUrlsRequest.avatar_fs_unit_params);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getResourceUrlsRequest.fs_unit != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getResourceUrlsRequest.fs_unit);
            }
            return i3 + i2 + getResourceUrlsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceUrlsRequest decode(ProtoReader protoReader) throws IOException {
            C18254a aVar = new C18254a();
            aVar.f45505a = "";
            aVar.f45507c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45505a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45506b = AvatarFsUnitParams.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45507c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetResourceUrlsRequest getResourceUrlsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getResourceUrlsRequest.key);
            if (getResourceUrlsRequest.avatar_fs_unit_params != null) {
                AvatarFsUnitParams.ADAPTER.encodeWithTag(protoWriter, 2, getResourceUrlsRequest.avatar_fs_unit_params);
            }
            if (getResourceUrlsRequest.fs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getResourceUrlsRequest.fs_unit);
            }
            protoWriter.writeBytes(getResourceUrlsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18254a newBuilder() {
        C18254a aVar = new C18254a();
        aVar.f45505a = this.key;
        aVar.f45506b = this.avatar_fs_unit_params;
        aVar.f45507c = this.fs_unit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetResourceUrlsRequest$a */
    public static final class C18254a extends Message.Builder<GetResourceUrlsRequest, C18254a> {

        /* renamed from: a */
        public String f45505a;

        /* renamed from: b */
        public AvatarFsUnitParams f45506b;

        /* renamed from: c */
        public String f45507c;

        /* renamed from: a */
        public GetResourceUrlsRequest build() {
            String str = this.f45505a;
            if (str != null) {
                return new GetResourceUrlsRequest(str, this.f45506b, this.f45507c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C18254a mo63247a(AvatarFsUnitParams avatarFsUnitParams) {
            this.f45506b = avatarFsUnitParams;
            return this;
        }

        /* renamed from: b */
        public C18254a mo63250b(String str) {
            this.f45507c = str;
            return this;
        }

        /* renamed from: a */
        public C18254a mo63248a(String str) {
            this.f45505a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetResourceUrlsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (this.avatar_fs_unit_params != null) {
            sb.append(", avatar_fs_unit_params=");
            sb.append(this.avatar_fs_unit_params);
        }
        if (this.fs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.fs_unit);
        }
        StringBuilder replace = sb.replace(0, 2, "GetResourceUrlsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceUrlsRequest(String str, AvatarFsUnitParams avatarFsUnitParams, String str2) {
        this(str, avatarFsUnitParams, str2, ByteString.EMPTY);
    }

    public GetResourceUrlsRequest(String str, AvatarFsUnitParams avatarFsUnitParams, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.avatar_fs_unit_params = avatarFsUnitParams;
        this.fs_unit = str2;
    }
}

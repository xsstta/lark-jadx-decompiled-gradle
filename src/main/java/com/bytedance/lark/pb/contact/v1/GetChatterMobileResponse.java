package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatterMobileResponse extends Message<GetChatterMobileResponse, C16196a> {
    public static final ProtoAdapter<GetChatterMobileResponse> ADAPTER = new C16197b();
    public static final Boolean DEFAULT_NO_PERMISSION = false;
    private static final long serialVersionUID = 0;
    public final String mobile;
    public final Boolean no_permission;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterMobileResponse$b */
    private static final class C16197b extends ProtoAdapter<GetChatterMobileResponse> {
        C16197b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterMobileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterMobileResponse getChatterMobileResponse) {
            int i;
            int i2 = 0;
            if (getChatterMobileResponse.mobile != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatterMobileResponse.mobile);
            } else {
                i = 0;
            }
            if (getChatterMobileResponse.no_permission != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatterMobileResponse.no_permission);
            }
            return i + i2 + getChatterMobileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterMobileResponse decode(ProtoReader protoReader) throws IOException {
            C16196a aVar = new C16196a();
            aVar.f42353a = "";
            aVar.f42354b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42353a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42354b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterMobileResponse getChatterMobileResponse) throws IOException {
            if (getChatterMobileResponse.mobile != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatterMobileResponse.mobile);
            }
            if (getChatterMobileResponse.no_permission != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatterMobileResponse.no_permission);
            }
            protoWriter.writeBytes(getChatterMobileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterMobileResponse$a */
    public static final class C16196a extends Message.Builder<GetChatterMobileResponse, C16196a> {

        /* renamed from: a */
        public String f42353a;

        /* renamed from: b */
        public Boolean f42354b;

        /* renamed from: a */
        public GetChatterMobileResponse build() {
            return new GetChatterMobileResponse(this.f42353a, this.f42354b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16196a newBuilder() {
        C16196a aVar = new C16196a();
        aVar.f42353a = this.mobile;
        aVar.f42354b = this.no_permission;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterMobileResponse");
        StringBuilder sb = new StringBuilder();
        if (this.mobile != null) {
            sb.append(", mobile=");
            sb.append(this.mobile);
        }
        if (this.no_permission != null) {
            sb.append(", no_permission=");
            sb.append(this.no_permission);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterMobileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterMobileResponse(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public GetChatterMobileResponse(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mobile = str;
        this.no_permission = bool;
    }
}

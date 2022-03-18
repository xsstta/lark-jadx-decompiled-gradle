package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateUserCustomStatusResponse extends Message<CreateUserCustomStatusResponse, C16154a> {
    public static final ProtoAdapter<CreateUserCustomStatusResponse> ADAPTER = new C16155b();
    private static final long serialVersionUID = 0;
    public final UserCustomStatus status;

    /* renamed from: com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusResponse$b */
    private static final class C16155b extends ProtoAdapter<CreateUserCustomStatusResponse> {
        C16155b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateUserCustomStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateUserCustomStatusResponse createUserCustomStatusResponse) {
            int i;
            if (createUserCustomStatusResponse.status != null) {
                i = UserCustomStatus.ADAPTER.encodedSizeWithTag(1, createUserCustomStatusResponse.status);
            } else {
                i = 0;
            }
            return i + createUserCustomStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateUserCustomStatusResponse decode(ProtoReader protoReader) throws IOException {
            C16154a aVar = new C16154a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42278a = UserCustomStatus.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateUserCustomStatusResponse createUserCustomStatusResponse) throws IOException {
            if (createUserCustomStatusResponse.status != null) {
                UserCustomStatus.ADAPTER.encodeWithTag(protoWriter, 1, createUserCustomStatusResponse.status);
            }
            protoWriter.writeBytes(createUserCustomStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusResponse$a */
    public static final class C16154a extends Message.Builder<CreateUserCustomStatusResponse, C16154a> {

        /* renamed from: a */
        public UserCustomStatus f42278a;

        /* renamed from: a */
        public CreateUserCustomStatusResponse build() {
            return new CreateUserCustomStatusResponse(this.f42278a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16154a newBuilder() {
        C16154a aVar = new C16154a();
        aVar.f42278a = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "CreateUserCustomStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateUserCustomStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateUserCustomStatusResponse(UserCustomStatus userCustomStatus) {
        this(userCustomStatus, ByteString.EMPTY);
    }

    public CreateUserCustomStatusResponse(UserCustomStatus userCustomStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = userCustomStatus;
    }
}

package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateFaceToFaceApplicationResponse extends Message<CreateFaceToFaceApplicationResponse, C17358a> {
    public static final ProtoAdapter<CreateFaceToFaceApplicationResponse> ADAPTER = new C17359b();
    private static final long serialVersionUID = 0;
    public final List<FaceToFaceApplicant> applicants;
    public final String application_id;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationResponse$b */
    private static final class C17359b extends ProtoAdapter<CreateFaceToFaceApplicationResponse> {
        C17359b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateFaceToFaceApplicationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateFaceToFaceApplicationResponse createFaceToFaceApplicationResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createFaceToFaceApplicationResponse.application_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, createFaceToFaceApplicationResponse.token) + FaceToFaceApplicant.ADAPTER.asRepeated().encodedSizeWithTag(3, createFaceToFaceApplicationResponse.applicants) + createFaceToFaceApplicationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateFaceToFaceApplicationResponse decode(ProtoReader protoReader) throws IOException {
            C17358a aVar = new C17358a();
            aVar.f44237a = "";
            aVar.f44238b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44237a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44238b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44239c.add(FaceToFaceApplicant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateFaceToFaceApplicationResponse createFaceToFaceApplicationResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createFaceToFaceApplicationResponse.application_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createFaceToFaceApplicationResponse.token);
            FaceToFaceApplicant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, createFaceToFaceApplicationResponse.applicants);
            protoWriter.writeBytes(createFaceToFaceApplicationResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17358a newBuilder() {
        C17358a aVar = new C17358a();
        aVar.f44237a = this.application_id;
        aVar.f44238b = this.token;
        aVar.f44239c = Internal.copyOf("applicants", this.applicants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationResponse$a */
    public static final class C17358a extends Message.Builder<CreateFaceToFaceApplicationResponse, C17358a> {

        /* renamed from: a */
        public String f44237a;

        /* renamed from: b */
        public String f44238b;

        /* renamed from: c */
        public List<FaceToFaceApplicant> f44239c = Internal.newMutableList();

        /* renamed from: a */
        public CreateFaceToFaceApplicationResponse build() {
            String str;
            String str2 = this.f44237a;
            if (str2 != null && (str = this.f44238b) != null) {
                return new CreateFaceToFaceApplicationResponse(str2, str, this.f44239c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "application_id", this.f44238b, "token");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateFaceToFaceApplicationResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", application_id=");
        sb.append(this.application_id);
        sb.append(", token=");
        sb.append(this.token);
        if (!this.applicants.isEmpty()) {
            sb.append(", applicants=");
            sb.append(this.applicants);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateFaceToFaceApplicationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateFaceToFaceApplicationResponse(String str, String str2, List<FaceToFaceApplicant> list) {
        this(str, str2, list, ByteString.EMPTY);
    }

    public CreateFaceToFaceApplicationResponse(String str, String str2, List<FaceToFaceApplicant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.application_id = str;
        this.token = str2;
        this.applicants = Internal.immutableCopyOf("applicants", list);
    }
}

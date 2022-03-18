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

public final class PushFaceToFaceApplicants extends Message<PushFaceToFaceApplicants, C17893a> {
    public static final ProtoAdapter<PushFaceToFaceApplicants> ADAPTER = new C17894b();
    private static final long serialVersionUID = 0;
    public final List<FaceToFaceApplicant> applicants;
    public final String application_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushFaceToFaceApplicants$b */
    private static final class C17894b extends ProtoAdapter<PushFaceToFaceApplicants> {
        C17894b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushFaceToFaceApplicants.class);
        }

        /* renamed from: a */
        public int encodedSize(PushFaceToFaceApplicants pushFaceToFaceApplicants) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushFaceToFaceApplicants.application_id) + FaceToFaceApplicant.ADAPTER.asRepeated().encodedSizeWithTag(2, pushFaceToFaceApplicants.applicants) + pushFaceToFaceApplicants.unknownFields().size();
        }

        /* renamed from: a */
        public PushFaceToFaceApplicants decode(ProtoReader protoReader) throws IOException {
            C17893a aVar = new C17893a();
            aVar.f44970a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44970a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44971b.add(FaceToFaceApplicant.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushFaceToFaceApplicants pushFaceToFaceApplicants) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushFaceToFaceApplicants.application_id);
            FaceToFaceApplicant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushFaceToFaceApplicants.applicants);
            protoWriter.writeBytes(pushFaceToFaceApplicants.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushFaceToFaceApplicants$a */
    public static final class C17893a extends Message.Builder<PushFaceToFaceApplicants, C17893a> {

        /* renamed from: a */
        public String f44970a;

        /* renamed from: b */
        public List<FaceToFaceApplicant> f44971b = Internal.newMutableList();

        /* renamed from: a */
        public PushFaceToFaceApplicants build() {
            String str = this.f44970a;
            if (str != null) {
                return new PushFaceToFaceApplicants(str, this.f44971b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "application_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C17893a newBuilder() {
        C17893a aVar = new C17893a();
        aVar.f44970a = this.application_id;
        aVar.f44971b = Internal.copyOf("applicants", this.applicants);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushFaceToFaceApplicants");
        StringBuilder sb = new StringBuilder();
        sb.append(", application_id=");
        sb.append(this.application_id);
        if (!this.applicants.isEmpty()) {
            sb.append(", applicants=");
            sb.append(this.applicants);
        }
        StringBuilder replace = sb.replace(0, 2, "PushFaceToFaceApplicants{");
        replace.append('}');
        return replace.toString();
    }

    public PushFaceToFaceApplicants(String str, List<FaceToFaceApplicant> list) {
        this(str, list, ByteString.EMPTY);
    }

    public PushFaceToFaceApplicants(String str, List<FaceToFaceApplicant> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.application_id = str;
        this.applicants = Internal.immutableCopyOf("applicants", list);
    }
}

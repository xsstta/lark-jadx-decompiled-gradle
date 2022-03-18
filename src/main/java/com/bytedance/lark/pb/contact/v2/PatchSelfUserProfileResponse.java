package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PatchSelfUserProfileResponse extends Message<PatchSelfUserProfileResponse, C16550a> {
    public static final ProtoAdapter<PatchSelfUserProfileResponse> ADAPTER = new C16551b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileResponse$b */
    private static final class C16551b extends ProtoAdapter<PatchSelfUserProfileResponse> {
        C16551b() {
            super(FieldEncoding.LENGTH_DELIMITED, PatchSelfUserProfileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PatchSelfUserProfileResponse patchSelfUserProfileResponse) {
            return patchSelfUserProfileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PatchSelfUserProfileResponse decode(ProtoReader protoReader) throws IOException {
            C16550a aVar = new C16550a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PatchSelfUserProfileResponse patchSelfUserProfileResponse) throws IOException {
            protoWriter.writeBytes(patchSelfUserProfileResponse.unknownFields());
        }
    }

    public PatchSelfUserProfileResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.PatchSelfUserProfileResponse$a */
    public static final class C16550a extends Message.Builder<PatchSelfUserProfileResponse, C16550a> {
        /* renamed from: a */
        public PatchSelfUserProfileResponse build() {
            return new PatchSelfUserProfileResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16550a newBuilder() {
        C16550a aVar = new C16550a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PatchSelfUserProfileResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PatchSelfUserProfileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PatchSelfUserProfileResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}

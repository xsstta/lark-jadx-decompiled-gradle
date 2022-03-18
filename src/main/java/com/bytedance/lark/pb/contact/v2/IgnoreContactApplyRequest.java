package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class IgnoreContactApplyRequest extends Message<IgnoreContactApplyRequest, C16538a> {
    public static final ProtoAdapter<IgnoreContactApplyRequest> ADAPTER = new C16539b();
    private static final long serialVersionUID = 0;
    public final String target_user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.IgnoreContactApplyRequest$b */
    private static final class C16539b extends ProtoAdapter<IgnoreContactApplyRequest> {
        C16539b() {
            super(FieldEncoding.LENGTH_DELIMITED, IgnoreContactApplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(IgnoreContactApplyRequest ignoreContactApplyRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, ignoreContactApplyRequest.target_user_id) + ignoreContactApplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public IgnoreContactApplyRequest decode(ProtoReader protoReader) throws IOException {
            C16538a aVar = new C16538a();
            aVar.f42900a = "";
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
                    aVar.f42900a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, IgnoreContactApplyRequest ignoreContactApplyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ignoreContactApplyRequest.target_user_id);
            protoWriter.writeBytes(ignoreContactApplyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.IgnoreContactApplyRequest$a */
    public static final class C16538a extends Message.Builder<IgnoreContactApplyRequest, C16538a> {

        /* renamed from: a */
        public String f42900a;

        /* renamed from: a */
        public IgnoreContactApplyRequest build() {
            String str = this.f42900a;
            if (str != null) {
                return new IgnoreContactApplyRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "target_user_id");
        }

        /* renamed from: a */
        public C16538a mo58878a(String str) {
            this.f42900a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16538a newBuilder() {
        C16538a aVar = new C16538a();
        aVar.f42900a = this.target_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "IgnoreContactApplyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", target_user_id=");
        sb.append(this.target_user_id);
        StringBuilder replace = sb.replace(0, 2, "IgnoreContactApplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public IgnoreContactApplyRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public IgnoreContactApplyRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_user_id = str;
    }
}

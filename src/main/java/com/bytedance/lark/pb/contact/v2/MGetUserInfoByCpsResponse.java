package com.bytedance.lark.pb.contact.v2;

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

public final class MGetUserInfoByCpsResponse extends Message<MGetUserInfoByCpsResponse, C16542a> {
    public static final ProtoAdapter<MGetUserInfoByCpsResponse> ADAPTER = new C16543b();
    private static final long serialVersionUID = 0;
    public final List<ContactPointUserInfo> cp_user_infos;

    /* renamed from: com.bytedance.lark.pb.contact.v2.MGetUserInfoByCpsResponse$b */
    private static final class C16543b extends ProtoAdapter<MGetUserInfoByCpsResponse> {
        C16543b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetUserInfoByCpsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetUserInfoByCpsResponse mGetUserInfoByCpsResponse) {
            return ContactPointUserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetUserInfoByCpsResponse.cp_user_infos) + mGetUserInfoByCpsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetUserInfoByCpsResponse decode(ProtoReader protoReader) throws IOException {
            C16542a aVar = new C16542a();
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
                    aVar.f42902a.add(ContactPointUserInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetUserInfoByCpsResponse mGetUserInfoByCpsResponse) throws IOException {
            ContactPointUserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetUserInfoByCpsResponse.cp_user_infos);
            protoWriter.writeBytes(mGetUserInfoByCpsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.MGetUserInfoByCpsResponse$a */
    public static final class C16542a extends Message.Builder<MGetUserInfoByCpsResponse, C16542a> {

        /* renamed from: a */
        public List<ContactPointUserInfo> f42902a = Internal.newMutableList();

        /* renamed from: a */
        public MGetUserInfoByCpsResponse build() {
            return new MGetUserInfoByCpsResponse(this.f42902a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16542a newBuilder() {
        C16542a aVar = new C16542a();
        aVar.f42902a = Internal.copyOf("cp_user_infos", this.cp_user_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MGetUserInfoByCpsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.cp_user_infos.isEmpty()) {
            sb.append(", cp_user_infos=");
            sb.append(this.cp_user_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetUserInfoByCpsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetUserInfoByCpsResponse(List<ContactPointUserInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetUserInfoByCpsResponse(List<ContactPointUserInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cp_user_infos = Internal.immutableCopyOf("cp_user_infos", list);
    }
}

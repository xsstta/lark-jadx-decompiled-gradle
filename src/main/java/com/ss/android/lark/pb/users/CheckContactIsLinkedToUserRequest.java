package com.ss.android.lark.pb.users;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CheckContactIsLinkedToUserRequest extends Message<CheckContactIsLinkedToUserRequest, C50256a> {
    public static final ProtoAdapter<CheckContactIsLinkedToUserRequest> ADAPTER = new C50257b();
    private static final long serialVersionUID = 0;
    public final List<String> memails;
    public final List<String> mmobiles;

    /* renamed from: com.ss.android.lark.pb.users.CheckContactIsLinkedToUserRequest$b */
    private static final class C50257b extends ProtoAdapter<CheckContactIsLinkedToUserRequest> {
        C50257b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckContactIsLinkedToUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckContactIsLinkedToUserRequest checkContactIsLinkedToUserRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, checkContactIsLinkedToUserRequest.mmobiles) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, checkContactIsLinkedToUserRequest.memails) + checkContactIsLinkedToUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckContactIsLinkedToUserRequest decode(ProtoReader protoReader) throws IOException {
            C50256a aVar = new C50256a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125603a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125604b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckContactIsLinkedToUserRequest checkContactIsLinkedToUserRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, checkContactIsLinkedToUserRequest.mmobiles);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, checkContactIsLinkedToUserRequest.memails);
            protoWriter.writeBytes(checkContactIsLinkedToUserRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.users.CheckContactIsLinkedToUserRequest$a */
    public static final class C50256a extends Message.Builder<CheckContactIsLinkedToUserRequest, C50256a> {

        /* renamed from: a */
        public List<String> f125603a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f125604b = Internal.newMutableList();

        /* renamed from: a */
        public CheckContactIsLinkedToUserRequest build() {
            return new CheckContactIsLinkedToUserRequest(this.f125603a, this.f125604b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50256a mo174379a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f125603a = list;
            return this;
        }

        /* renamed from: b */
        public C50256a mo174381b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f125604b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50256a newBuilder() {
        C50256a aVar = new C50256a();
        aVar.f125603a = Internal.copyOf("mmobiles", this.mmobiles);
        aVar.f125604b = Internal.copyOf("memails", this.memails);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mmobiles.isEmpty()) {
            sb.append(", mobiles=");
            sb.append(this.mmobiles);
        }
        if (!this.memails.isEmpty()) {
            sb.append(", emails=");
            sb.append(this.memails);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckContactIsLinkedToUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckContactIsLinkedToUserRequest(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public CheckContactIsLinkedToUserRequest(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmobiles = Internal.immutableCopyOf("mmobiles", list);
        this.memails = Internal.immutableCopyOf("memails", list2);
    }
}

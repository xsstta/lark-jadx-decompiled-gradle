package com.ss.android.lark.pb.users;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CheckContactIsLinkedToUserResponse extends Message<CheckContactIsLinkedToUserResponse, C50258a> {
    public static final ProtoAdapter<CheckContactIsLinkedToUserResponse> ADAPTER = new C50259b();
    private static final long serialVersionUID = 0;
    public final Map<String, Boolean> mcontact_is_linked_to_user;

    /* renamed from: com.ss.android.lark.pb.users.CheckContactIsLinkedToUserResponse$a */
    public static final class C50258a extends Message.Builder<CheckContactIsLinkedToUserResponse, C50258a> {

        /* renamed from: a */
        public Map<String, Boolean> f125605a = Internal.newMutableMap();

        /* renamed from: a */
        public CheckContactIsLinkedToUserResponse build() {
            return new CheckContactIsLinkedToUserResponse(this.f125605a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.users.CheckContactIsLinkedToUserResponse$b */
    private static final class C50259b extends ProtoAdapter<CheckContactIsLinkedToUserResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f125606a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        C50259b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckContactIsLinkedToUserResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckContactIsLinkedToUserResponse checkContactIsLinkedToUserResponse) {
            return this.f125606a.encodedSizeWithTag(1, checkContactIsLinkedToUserResponse.mcontact_is_linked_to_user) + checkContactIsLinkedToUserResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckContactIsLinkedToUserResponse decode(ProtoReader protoReader) throws IOException {
            C50258a aVar = new C50258a();
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
                    aVar.f125605a.putAll(this.f125606a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckContactIsLinkedToUserResponse checkContactIsLinkedToUserResponse) throws IOException {
            this.f125606a.encodeWithTag(protoWriter, 1, checkContactIsLinkedToUserResponse.mcontact_is_linked_to_user);
            protoWriter.writeBytes(checkContactIsLinkedToUserResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50258a newBuilder() {
        C50258a aVar = new C50258a();
        aVar.f125605a = Internal.copyOf("mcontact_is_linked_to_user", this.mcontact_is_linked_to_user);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mcontact_is_linked_to_user.isEmpty()) {
            sb.append(", contact_is_linked_to_user=");
            sb.append(this.mcontact_is_linked_to_user);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckContactIsLinkedToUserResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckContactIsLinkedToUserResponse(Map<String, Boolean> map) {
        this(map, ByteString.EMPTY);
    }

    public CheckContactIsLinkedToUserResponse(Map<String, Boolean> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcontact_is_linked_to_user = Internal.immutableCopyOf("mcontact_is_linked_to_user", map);
    }
}

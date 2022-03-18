package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ListUserMedalsRequest extends Message<ListUserMedalsRequest, C50096a> {
    public static final ProtoAdapter<ListUserMedalsRequest> ADAPTER = new C50097b();
    private static final long serialVersionUID = 0;
    public final String muser_id;

    /* renamed from: com.ss.android.lark.pb.ug.ListUserMedalsRequest$b */
    private static final class C50097b extends ProtoAdapter<ListUserMedalsRequest> {
        C50097b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserMedalsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserMedalsRequest listUserMedalsRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, listUserMedalsRequest.muser_id) + listUserMedalsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserMedalsRequest decode(ProtoReader protoReader) throws IOException {
            C50096a aVar = new C50096a();
            aVar.f125225a = "";
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
                    aVar.f125225a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserMedalsRequest listUserMedalsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listUserMedalsRequest.muser_id);
            protoWriter.writeBytes(listUserMedalsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.ListUserMedalsRequest$a */
    public static final class C50096a extends Message.Builder<ListUserMedalsRequest, C50096a> {

        /* renamed from: a */
        public String f125225a;

        /* renamed from: a */
        public ListUserMedalsRequest build() {
            String str = this.f125225a;
            if (str != null) {
                return new ListUserMedalsRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "muser_id");
        }

        /* renamed from: a */
        public C50096a mo174005a(String str) {
            this.f125225a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50096a newBuilder() {
        C50096a aVar = new C50096a();
        aVar.f125225a = this.muser_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        StringBuilder replace = sb.replace(0, 2, "ListUserMedalsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserMedalsRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public ListUserMedalsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
    }
}

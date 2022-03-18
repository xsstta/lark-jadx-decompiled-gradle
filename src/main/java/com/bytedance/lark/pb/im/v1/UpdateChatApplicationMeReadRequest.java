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

public final class UpdateChatApplicationMeReadRequest extends Message<UpdateChatApplicationMeReadRequest, C18133a> {
    public static final ProtoAdapter<UpdateChatApplicationMeReadRequest> ADAPTER = new C18134b();
    public static final Boolean DEFAULT_READ_ALL_APPLICATIONS = false;
    private static final long serialVersionUID = 0;
    public final List<String> application_ids;
    public final Boolean read_all_applications;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatApplicationMeReadRequest$b */
    private static final class C18134b extends ProtoAdapter<UpdateChatApplicationMeReadRequest> {
        C18134b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatApplicationMeReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatApplicationMeReadRequest updateChatApplicationMeReadRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, updateChatApplicationMeReadRequest.application_ids);
            if (updateChatApplicationMeReadRequest.read_all_applications != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, updateChatApplicationMeReadRequest.read_all_applications);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + updateChatApplicationMeReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatApplicationMeReadRequest decode(ProtoReader protoReader) throws IOException {
            C18133a aVar = new C18133a();
            aVar.f45293b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45292a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45293b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatApplicationMeReadRequest updateChatApplicationMeReadRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, updateChatApplicationMeReadRequest.application_ids);
            if (updateChatApplicationMeReadRequest.read_all_applications != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, updateChatApplicationMeReadRequest.read_all_applications);
            }
            protoWriter.writeBytes(updateChatApplicationMeReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatApplicationMeReadRequest$a */
    public static final class C18133a extends Message.Builder<UpdateChatApplicationMeReadRequest, C18133a> {

        /* renamed from: a */
        public List<String> f45292a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f45293b;

        /* renamed from: a */
        public UpdateChatApplicationMeReadRequest build() {
            return new UpdateChatApplicationMeReadRequest(this.f45292a, this.f45293b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18133a mo62883a(Boolean bool) {
            this.f45293b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18133a newBuilder() {
        C18133a aVar = new C18133a();
        aVar.f45292a = Internal.copyOf("application_ids", this.application_ids);
        aVar.f45293b = this.read_all_applications;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatApplicationMeReadRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.application_ids.isEmpty()) {
            sb.append(", application_ids=");
            sb.append(this.application_ids);
        }
        if (this.read_all_applications != null) {
            sb.append(", read_all_applications=");
            sb.append(this.read_all_applications);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatApplicationMeReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatApplicationMeReadRequest(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public UpdateChatApplicationMeReadRequest(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.application_ids = Internal.immutableCopyOf("application_ids", list);
        this.read_all_applications = bool;
    }
}

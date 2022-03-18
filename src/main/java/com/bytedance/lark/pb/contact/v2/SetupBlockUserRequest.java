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

public final class SetupBlockUserRequest extends Message<SetupBlockUserRequest, C16562a> {
    public static final ProtoAdapter<SetupBlockUserRequest> ADAPTER = new C16563b();
    public static final Boolean DEFAULT_BLOCK_STATUS = false;
    private static final long serialVersionUID = 0;
    public final Boolean block_status;
    public final String block_user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetupBlockUserRequest$b */
    private static final class C16563b extends ProtoAdapter<SetupBlockUserRequest> {
        C16563b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetupBlockUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetupBlockUserRequest setupBlockUserRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setupBlockUserRequest.block_user_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, setupBlockUserRequest.block_status) + setupBlockUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetupBlockUserRequest decode(ProtoReader protoReader) throws IOException {
            C16562a aVar = new C16562a();
            aVar.f42929a = "";
            aVar.f42930b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42929a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42930b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetupBlockUserRequest setupBlockUserRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setupBlockUserRequest.block_user_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setupBlockUserRequest.block_status);
            protoWriter.writeBytes(setupBlockUserRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16562a newBuilder() {
        C16562a aVar = new C16562a();
        aVar.f42929a = this.block_user_id;
        aVar.f42930b = this.block_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.SetupBlockUserRequest$a */
    public static final class C16562a extends Message.Builder<SetupBlockUserRequest, C16562a> {

        /* renamed from: a */
        public String f42929a;

        /* renamed from: b */
        public Boolean f42930b;

        /* renamed from: a */
        public SetupBlockUserRequest build() {
            Boolean bool;
            String str = this.f42929a;
            if (str != null && (bool = this.f42930b) != null) {
                return new SetupBlockUserRequest(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "block_user_id", this.f42930b, "block_status");
        }

        /* renamed from: a */
        public C16562a mo58949a(Boolean bool) {
            this.f42930b = bool;
            return this;
        }

        /* renamed from: a */
        public C16562a mo58950a(String str) {
            this.f42929a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetupBlockUserRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", block_user_id=");
        sb.append(this.block_user_id);
        sb.append(", block_status=");
        sb.append(this.block_status);
        StringBuilder replace = sb.replace(0, 2, "SetupBlockUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetupBlockUserRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public SetupBlockUserRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.block_user_id = str;
        this.block_status = bool;
    }
}

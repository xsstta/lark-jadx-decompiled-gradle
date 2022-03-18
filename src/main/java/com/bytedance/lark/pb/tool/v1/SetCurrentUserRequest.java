package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetCurrentUserRequest extends Message<SetCurrentUserRequest, C19749a> {
    public static final ProtoAdapter<SetCurrentUserRequest> ADAPTER = new C19750b();
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long user_id;

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetCurrentUserRequest$b */
    private static final class C19750b extends ProtoAdapter<SetCurrentUserRequest> {
        C19750b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCurrentUserRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCurrentUserRequest setCurrentUserRequest) {
            int i;
            if (setCurrentUserRequest.user_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, setCurrentUserRequest.user_id);
            } else {
                i = 0;
            }
            return i + setCurrentUserRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetCurrentUserRequest decode(ProtoReader protoReader) throws IOException {
            C19749a aVar = new C19749a();
            aVar.f48217a = 0L;
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
                    aVar.f48217a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetCurrentUserRequest setCurrentUserRequest) throws IOException {
            if (setCurrentUserRequest.user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, setCurrentUserRequest.user_id);
            }
            protoWriter.writeBytes(setCurrentUserRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.SetCurrentUserRequest$a */
    public static final class C19749a extends Message.Builder<SetCurrentUserRequest, C19749a> {

        /* renamed from: a */
        public Long f48217a;

        /* renamed from: a */
        public SetCurrentUserRequest build() {
            return new SetCurrentUserRequest(this.f48217a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19749a mo66903a(Long l) {
            this.f48217a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19749a newBuilder() {
        C19749a aVar = new C19749a();
        aVar.f48217a = this.user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "SetCurrentUserRequest");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SetCurrentUserRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetCurrentUserRequest(Long l) {
        this(l, ByteString.EMPTY);
    }

    public SetCurrentUserRequest(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = l;
    }
}

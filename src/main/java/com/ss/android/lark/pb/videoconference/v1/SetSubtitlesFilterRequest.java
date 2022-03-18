package com.ss.android.lark.pb.videoconference.v1;

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

public final class SetSubtitlesFilterRequest extends Message<SetSubtitlesFilterRequest, C51020a> {
    public static final ProtoAdapter<SetSubtitlesFilterRequest> ADAPTER = new C51021b();
    private static final long serialVersionUID = 0;
    public final List<ByteviewUser> users;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetSubtitlesFilterRequest$b */
    private static final class C51021b extends ProtoAdapter<SetSubtitlesFilterRequest> {
        C51021b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSubtitlesFilterRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSubtitlesFilterRequest setSubtitlesFilterRequest) {
            return ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(1, setSubtitlesFilterRequest.users) + setSubtitlesFilterRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetSubtitlesFilterRequest decode(ProtoReader protoReader) throws IOException {
            C51020a aVar = new C51020a();
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
                    aVar.f127081a.add(ByteviewUser.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSubtitlesFilterRequest setSubtitlesFilterRequest) throws IOException {
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setSubtitlesFilterRequest.users);
            protoWriter.writeBytes(setSubtitlesFilterRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetSubtitlesFilterRequest$a */
    public static final class C51020a extends Message.Builder<SetSubtitlesFilterRequest, C51020a> {

        /* renamed from: a */
        public List<ByteviewUser> f127081a = Internal.newMutableList();

        /* renamed from: a */
        public SetSubtitlesFilterRequest build() {
            return new SetSubtitlesFilterRequest(this.f127081a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51020a newBuilder() {
        C51020a aVar = new C51020a();
        aVar.f127081a = Internal.copyOf("users", this.users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SetSubtitlesFilterRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        StringBuilder replace = sb.replace(0, 2, "SetSubtitlesFilterRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetSubtitlesFilterRequest(List<ByteviewUser> list) {
        this(list, ByteString.EMPTY);
    }

    public SetSubtitlesFilterRequest(List<ByteviewUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = Internal.immutableCopyOf("users", list);
    }
}

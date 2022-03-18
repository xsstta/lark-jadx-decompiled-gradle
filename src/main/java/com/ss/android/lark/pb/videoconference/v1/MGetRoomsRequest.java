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

public final class MGetRoomsRequest extends Message<MGetRoomsRequest, C50851a> {
    public static final ProtoAdapter<MGetRoomsRequest> ADAPTER = new C50852b();
    public static final Boolean DEFAULT_IS_FROM_SERVER = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_from_server;
    public final List<String> room_ids;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MGetRoomsRequest$b */
    private static final class C50852b extends ProtoAdapter<MGetRoomsRequest> {
        C50852b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetRoomsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetRoomsRequest mGetRoomsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetRoomsRequest.room_ids);
            if (mGetRoomsRequest.is_from_server != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetRoomsRequest.is_from_server);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mGetRoomsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetRoomsRequest decode(ProtoReader protoReader) throws IOException {
            C50851a aVar = new C50851a();
            aVar.f126757b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126756a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126757b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetRoomsRequest mGetRoomsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetRoomsRequest.room_ids);
            if (mGetRoomsRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetRoomsRequest.is_from_server);
            }
            protoWriter.writeBytes(mGetRoomsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MGetRoomsRequest$a */
    public static final class C50851a extends Message.Builder<MGetRoomsRequest, C50851a> {

        /* renamed from: a */
        public List<String> f126756a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f126757b;

        /* renamed from: a */
        public MGetRoomsRequest build() {
            return new MGetRoomsRequest(this.f126756a, this.f126757b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50851a mo175742a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126756a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50851a newBuilder() {
        C50851a aVar = new C50851a();
        aVar.f126756a = Internal.copyOf("room_ids", this.room_ids);
        aVar.f126757b = this.is_from_server;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MGetRoomsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.room_ids.isEmpty()) {
            sb.append(", room_ids=");
            sb.append(this.room_ids);
        }
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetRoomsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetRoomsRequest(List<String> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public MGetRoomsRequest(List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_ids = Internal.immutableCopyOf("room_ids", list);
        this.is_from_server = bool;
    }
}

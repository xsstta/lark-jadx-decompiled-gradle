package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BreakoutRoomJoinRequest extends Message<BreakoutRoomJoinRequest, C50475a> {
    public static final ProtoAdapter<BreakoutRoomJoinRequest> ADAPTER = new C50476b();
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final String to_breakout_room_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinRequest$b */
    private static final class C50476b extends ProtoAdapter<BreakoutRoomJoinRequest> {
        C50476b() {
            super(FieldEncoding.LENGTH_DELIMITED, BreakoutRoomJoinRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(BreakoutRoomJoinRequest breakoutRoomJoinRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, breakoutRoomJoinRequest.meeting_id);
            if (breakoutRoomJoinRequest.to_breakout_room_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, breakoutRoomJoinRequest.to_breakout_room_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + breakoutRoomJoinRequest.unknownFields().size();
        }

        /* renamed from: a */
        public BreakoutRoomJoinRequest decode(ProtoReader protoReader) throws IOException {
            C50475a aVar = new C50475a();
            aVar.f126028a = "";
            aVar.f126029b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126028a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126029b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BreakoutRoomJoinRequest breakoutRoomJoinRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, breakoutRoomJoinRequest.meeting_id);
            if (breakoutRoomJoinRequest.to_breakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, breakoutRoomJoinRequest.to_breakout_room_id);
            }
            protoWriter.writeBytes(breakoutRoomJoinRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.BreakoutRoomJoinRequest$a */
    public static final class C50475a extends Message.Builder<BreakoutRoomJoinRequest, C50475a> {

        /* renamed from: a */
        public String f126028a;

        /* renamed from: b */
        public String f126029b;

        /* renamed from: a */
        public BreakoutRoomJoinRequest build() {
            String str = this.f126028a;
            if (str != null) {
                return new BreakoutRoomJoinRequest(str, this.f126029b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }

        /* renamed from: a */
        public C50475a mo174859a(String str) {
            this.f126028a = str;
            return this;
        }

        /* renamed from: b */
        public C50475a mo174861b(String str) {
            this.f126029b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50475a newBuilder() {
        C50475a aVar = new C50475a();
        aVar.f126028a = this.meeting_id;
        aVar.f126029b = this.to_breakout_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "BreakoutRoomJoinRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.to_breakout_room_id != null) {
            sb.append(", to_breakout_room_id=");
            sb.append(this.to_breakout_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BreakoutRoomJoinRequest{");
        replace.append('}');
        return replace.toString();
    }

    public BreakoutRoomJoinRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public BreakoutRoomJoinRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.to_breakout_room_id = str2;
    }
}

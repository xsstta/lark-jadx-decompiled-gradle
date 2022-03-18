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

public final class SyncFollowActionRequest extends Message<SyncFollowActionRequest, C51104a> {
    public static final ProtoAdapter<SyncFollowActionRequest> ADAPTER = new C51105b();
    private static final long serialVersionUID = 0;
    public final List<FollowAction> follow_actions;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncFollowActionRequest$b */
    private static final class C51105b extends ProtoAdapter<SyncFollowActionRequest> {
        C51105b() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncFollowActionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SyncFollowActionRequest syncFollowActionRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, syncFollowActionRequest.meeting_id) + FollowAction.ADAPTER.asRepeated().encodedSizeWithTag(2, syncFollowActionRequest.follow_actions) + syncFollowActionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SyncFollowActionRequest decode(ProtoReader protoReader) throws IOException {
            C51104a aVar = new C51104a();
            aVar.f127222a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127222a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127223b.add(FollowAction.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SyncFollowActionRequest syncFollowActionRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncFollowActionRequest.meeting_id);
            FollowAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, syncFollowActionRequest.follow_actions);
            protoWriter.writeBytes(syncFollowActionRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SyncFollowActionRequest$a */
    public static final class C51104a extends Message.Builder<SyncFollowActionRequest, C51104a> {

        /* renamed from: a */
        public String f127222a;

        /* renamed from: b */
        public List<FollowAction> f127223b = Internal.newMutableList();

        /* renamed from: a */
        public SyncFollowActionRequest build() {
            String str = this.f127222a;
            if (str != null) {
                return new SyncFollowActionRequest(str, this.f127223b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C51104a newBuilder() {
        C51104a aVar = new C51104a();
        aVar.f127222a = this.meeting_id;
        aVar.f127223b = Internal.copyOf("follow_actions", this.follow_actions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SyncFollowActionRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (!this.follow_actions.isEmpty()) {
            sb.append(", follow_actions=");
            sb.append(this.follow_actions);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncFollowActionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SyncFollowActionRequest(String str, List<FollowAction> list) {
        this(str, list, ByteString.EMPTY);
    }

    public SyncFollowActionRequest(String str, List<FollowAction> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.follow_actions = Internal.immutableCopyOf("follow_actions", list);
    }
}

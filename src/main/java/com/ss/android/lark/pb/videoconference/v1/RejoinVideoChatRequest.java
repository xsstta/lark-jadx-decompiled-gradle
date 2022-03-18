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

public final class RejoinVideoChatRequest extends Message<RejoinVideoChatRequest, C50966a> {
    public static final ProtoAdapter<RejoinVideoChatRequest> ADAPTER = new C50967b();
    public static final Boolean DEFAULT_FORCE = false;
    private static final long serialVersionUID = 0;
    public final Boolean force;
    public final String meeting_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatRequest$b */
    private static final class C50967b extends ProtoAdapter<RejoinVideoChatRequest> {
        C50967b() {
            super(FieldEncoding.LENGTH_DELIMITED, RejoinVideoChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RejoinVideoChatRequest rejoinVideoChatRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, rejoinVideoChatRequest.meeting_id);
            if (rejoinVideoChatRequest.force != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, rejoinVideoChatRequest.force);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + rejoinVideoChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RejoinVideoChatRequest decode(ProtoReader protoReader) throws IOException {
            C50966a aVar = new C50966a();
            aVar.f126996a = "";
            aVar.f126997b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126996a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126997b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RejoinVideoChatRequest rejoinVideoChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rejoinVideoChatRequest.meeting_id);
            if (rejoinVideoChatRequest.force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, rejoinVideoChatRequest.force);
            }
            protoWriter.writeBytes(rejoinVideoChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RejoinVideoChatRequest$a */
    public static final class C50966a extends Message.Builder<RejoinVideoChatRequest, C50966a> {

        /* renamed from: a */
        public String f126996a;

        /* renamed from: b */
        public Boolean f126997b;

        /* renamed from: a */
        public RejoinVideoChatRequest build() {
            String str = this.f126996a;
            if (str != null) {
                return new RejoinVideoChatRequest(str, this.f126997b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }

        /* renamed from: a */
        public C50966a mo176020a(Boolean bool) {
            this.f126997b = bool;
            return this;
        }

        /* renamed from: a */
        public C50966a mo176021a(String str) {
            this.f126996a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50966a newBuilder() {
        C50966a aVar = new C50966a();
        aVar.f126996a = this.meeting_id;
        aVar.f126997b = this.force;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RejoinVideoChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.force != null) {
            sb.append(", force=");
            sb.append(this.force);
        }
        StringBuilder replace = sb.replace(0, 2, "RejoinVideoChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RejoinVideoChatRequest(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public RejoinVideoChatRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.force = bool;
    }
}

package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullVideoChatInteractionMessagesRequest extends Message<PullVideoChatInteractionMessagesRequest, C50938a> {
    public static final ProtoAdapter<PullVideoChatInteractionMessagesRequest> ADAPTER = new C50939b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Boolean DEFAULT_IS_PREVIOUS = false;
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Boolean is_previous;
    public final String meeting_id;
    public final Integer position;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesRequest$b */
    private static final class C50939b extends ProtoAdapter<PullVideoChatInteractionMessagesRequest> {
        C50939b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullVideoChatInteractionMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullVideoChatInteractionMessagesRequest pullVideoChatInteractionMessagesRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pullVideoChatInteractionMessagesRequest.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullVideoChatInteractionMessagesRequest.meeting_id);
            } else {
                i = 0;
            }
            if (pullVideoChatInteractionMessagesRequest.position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, pullVideoChatInteractionMessagesRequest.position);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pullVideoChatInteractionMessagesRequest.is_previous != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, pullVideoChatInteractionMessagesRequest.is_previous);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pullVideoChatInteractionMessagesRequest.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, pullVideoChatInteractionMessagesRequest.count);
            }
            return i6 + i4 + pullVideoChatInteractionMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullVideoChatInteractionMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C50938a aVar = new C50938a();
            aVar.f126960a = "";
            aVar.f126961b = 0;
            aVar.f126962c = false;
            aVar.f126963d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126960a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126961b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126962c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126963d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullVideoChatInteractionMessagesRequest pullVideoChatInteractionMessagesRequest) throws IOException {
            if (pullVideoChatInteractionMessagesRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullVideoChatInteractionMessagesRequest.meeting_id);
            }
            if (pullVideoChatInteractionMessagesRequest.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullVideoChatInteractionMessagesRequest.position);
            }
            if (pullVideoChatInteractionMessagesRequest.is_previous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, pullVideoChatInteractionMessagesRequest.is_previous);
            }
            if (pullVideoChatInteractionMessagesRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, pullVideoChatInteractionMessagesRequest.count);
            }
            protoWriter.writeBytes(pullVideoChatInteractionMessagesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.PullVideoChatInteractionMessagesRequest$a */
    public static final class C50938a extends Message.Builder<PullVideoChatInteractionMessagesRequest, C50938a> {

        /* renamed from: a */
        public String f126960a;

        /* renamed from: b */
        public Integer f126961b;

        /* renamed from: c */
        public Boolean f126962c;

        /* renamed from: d */
        public Integer f126963d;

        /* renamed from: a */
        public PullVideoChatInteractionMessagesRequest build() {
            return new PullVideoChatInteractionMessagesRequest(this.f126960a, this.f126961b, this.f126962c, this.f126963d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50938a mo175952a(Boolean bool) {
            this.f126962c = bool;
            return this;
        }

        /* renamed from: b */
        public C50938a mo175956b(Integer num) {
            this.f126963d = num;
            return this;
        }

        /* renamed from: a */
        public C50938a mo175953a(Integer num) {
            this.f126961b = num;
            return this;
        }

        /* renamed from: a */
        public C50938a mo175954a(String str) {
            this.f126960a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50938a newBuilder() {
        C50938a aVar = new C50938a();
        aVar.f126960a = this.meeting_id;
        aVar.f126961b = this.position;
        aVar.f126962c = this.is_previous;
        aVar.f126963d = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "PullVideoChatInteractionMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        if (this.is_previous != null) {
            sb.append(", is_previous=");
            sb.append(this.is_previous);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "PullVideoChatInteractionMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullVideoChatInteractionMessagesRequest(String str, Integer num, Boolean bool, Integer num2) {
        this(str, num, bool, num2, ByteString.EMPTY);
    }

    public PullVideoChatInteractionMessagesRequest(String str, Integer num, Boolean bool, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.position = num;
        this.is_previous = bool;
        this.count = num2;
    }
}

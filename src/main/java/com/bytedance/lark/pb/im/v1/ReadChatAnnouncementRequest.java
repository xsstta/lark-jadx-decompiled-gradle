package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ReadChatAnnouncementRequest extends Message<ReadChatAnnouncementRequest, C17989a> {
    public static final ProtoAdapter<ReadChatAnnouncementRequest> ADAPTER = new C17990b();
    public static final Long DEFAULT_ANNOUNCE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long announce_time;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.ReadChatAnnouncementRequest$b */
    private static final class C17990b extends ProtoAdapter<ReadChatAnnouncementRequest> {
        C17990b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReadChatAnnouncementRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReadChatAnnouncementRequest readChatAnnouncementRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, readChatAnnouncementRequest.chat_id);
            if (readChatAnnouncementRequest.announce_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, readChatAnnouncementRequest.announce_time);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + readChatAnnouncementRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReadChatAnnouncementRequest decode(ProtoReader protoReader) throws IOException {
            C17989a aVar = new C17989a();
            aVar.f45086a = "";
            aVar.f45087b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45086a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45087b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReadChatAnnouncementRequest readChatAnnouncementRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, readChatAnnouncementRequest.chat_id);
            if (readChatAnnouncementRequest.announce_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, readChatAnnouncementRequest.announce_time);
            }
            protoWriter.writeBytes(readChatAnnouncementRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ReadChatAnnouncementRequest$a */
    public static final class C17989a extends Message.Builder<ReadChatAnnouncementRequest, C17989a> {

        /* renamed from: a */
        public String f45086a;

        /* renamed from: b */
        public Long f45087b;

        /* renamed from: a */
        public ReadChatAnnouncementRequest build() {
            String str = this.f45086a;
            if (str != null) {
                return new ReadChatAnnouncementRequest(str, this.f45087b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17989a mo62508a(Long l) {
            this.f45087b = l;
            return this;
        }

        /* renamed from: a */
        public C17989a mo62509a(String str) {
            this.f45086a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17989a newBuilder() {
        C17989a aVar = new C17989a();
        aVar.f45086a = this.chat_id;
        aVar.f45087b = this.announce_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ReadChatAnnouncementRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.announce_time != null) {
            sb.append(", announce_time=");
            sb.append(this.announce_time);
        }
        StringBuilder replace = sb.replace(0, 2, "ReadChatAnnouncementRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReadChatAnnouncementRequest(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public ReadChatAnnouncementRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.announce_time = l;
    }
}

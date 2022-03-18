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

public final class PullChatShareHistoryRequest extends Message<PullChatShareHistoryRequest, C17857a> {
    public static final ProtoAdapter<PullChatShareHistoryRequest> ADAPTER = new C17858b();
    public static final Integer DEFAULT_COUNT = 20;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.PullChatShareHistoryRequest$b */
    private static final class C17858b extends ProtoAdapter<PullChatShareHistoryRequest> {
        C17858b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatShareHistoryRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatShareHistoryRequest pullChatShareHistoryRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullChatShareHistoryRequest.chat_id);
            int i2 = 0;
            if (pullChatShareHistoryRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, pullChatShareHistoryRequest.cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pullChatShareHistoryRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, pullChatShareHistoryRequest.count);
            }
            return i3 + i2 + pullChatShareHistoryRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatShareHistoryRequest decode(ProtoReader protoReader) throws IOException {
            C17857a aVar = new C17857a();
            aVar.f44922a = "";
            aVar.f44923b = "";
            aVar.f44924c = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44922a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44923b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44924c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatShareHistoryRequest pullChatShareHistoryRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullChatShareHistoryRequest.chat_id);
            if (pullChatShareHistoryRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullChatShareHistoryRequest.cursor);
            }
            if (pullChatShareHistoryRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, pullChatShareHistoryRequest.count);
            }
            protoWriter.writeBytes(pullChatShareHistoryRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17857a newBuilder() {
        C17857a aVar = new C17857a();
        aVar.f44922a = this.chat_id;
        aVar.f44923b = this.cursor;
        aVar.f44924c = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PullChatShareHistoryRequest$a */
    public static final class C17857a extends Message.Builder<PullChatShareHistoryRequest, C17857a> {

        /* renamed from: a */
        public String f44922a;

        /* renamed from: b */
        public String f44923b;

        /* renamed from: c */
        public Integer f44924c;

        /* renamed from: a */
        public PullChatShareHistoryRequest build() {
            String str = this.f44922a;
            if (str != null) {
                return new PullChatShareHistoryRequest(str, this.f44923b, this.f44924c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17857a mo62226a(Integer num) {
            this.f44924c = num;
            return this;
        }

        /* renamed from: b */
        public C17857a mo62229b(String str) {
            this.f44923b = str;
            return this;
        }

        /* renamed from: a */
        public C17857a mo62227a(String str) {
            this.f44922a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PullChatShareHistoryRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatShareHistoryRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatShareHistoryRequest(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public PullChatShareHistoryRequest(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.cursor = str2;
        this.count = num;
    }
}

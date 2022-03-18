package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetUnreadCountRequest extends Message<MailGetUnreadCountRequest, C16812a> {
    public static final ProtoAdapter<MailGetUnreadCountRequest> ADAPTER = new C16813b();
    public static final Boolean DEFAULT_FETCH_UNREAD_COUNT_MAP = false;
    private static final long serialVersionUID = 0;
    public final Boolean fetch_unread_count_map;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountRequest$b */
    private static final class C16813b extends ProtoAdapter<MailGetUnreadCountRequest> {
        C16813b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetUnreadCountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetUnreadCountRequest mailGetUnreadCountRequest) {
            int i;
            if (mailGetUnreadCountRequest.fetch_unread_count_map != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailGetUnreadCountRequest.fetch_unread_count_map);
            } else {
                i = 0;
            }
            return i + mailGetUnreadCountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetUnreadCountRequest decode(ProtoReader protoReader) throws IOException {
            C16812a aVar = new C16812a();
            aVar.f43281a = false;
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
                    aVar.f43281a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetUnreadCountRequest mailGetUnreadCountRequest) throws IOException {
            if (mailGetUnreadCountRequest.fetch_unread_count_map != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailGetUnreadCountRequest.fetch_unread_count_map);
            }
            protoWriter.writeBytes(mailGetUnreadCountRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetUnreadCountRequest$a */
    public static final class C16812a extends Message.Builder<MailGetUnreadCountRequest, C16812a> {

        /* renamed from: a */
        public Boolean f43281a;

        /* renamed from: a */
        public MailGetUnreadCountRequest build() {
            return new MailGetUnreadCountRequest(this.f43281a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16812a newBuilder() {
        C16812a aVar = new C16812a();
        aVar.f43281a = this.fetch_unread_count_map;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetUnreadCountRequest");
        StringBuilder sb = new StringBuilder();
        if (this.fetch_unread_count_map != null) {
            sb.append(", fetch_unread_count_map=");
            sb.append(this.fetch_unread_count_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetUnreadCountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetUnreadCountRequest(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailGetUnreadCountRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fetch_unread_count_map = bool;
    }
}

package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRefreshThreadListResponse extends Message<MailRefreshThreadListResponse, C16860a> {
    public static final ProtoAdapter<MailRefreshThreadListResponse> ADAPTER = new C16861b();
    public static final Long DEFAULT_NEW_THREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final Long new_thread_count;
    public final MailGetThreadListResponse response;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListResponse$b */
    private static final class C16861b extends ProtoAdapter<MailRefreshThreadListResponse> {
        C16861b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRefreshThreadListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRefreshThreadListResponse mailRefreshThreadListResponse) {
            int i;
            int i2 = 0;
            if (mailRefreshThreadListResponse.response != null) {
                i = MailGetThreadListResponse.ADAPTER.encodedSizeWithTag(1, mailRefreshThreadListResponse.response);
            } else {
                i = 0;
            }
            if (mailRefreshThreadListResponse.new_thread_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, mailRefreshThreadListResponse.new_thread_count);
            }
            return i + i2 + mailRefreshThreadListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailRefreshThreadListResponse decode(ProtoReader protoReader) throws IOException {
            C16860a aVar = new C16860a();
            aVar.f43327b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43326a = MailGetThreadListResponse.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43327b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRefreshThreadListResponse mailRefreshThreadListResponse) throws IOException {
            if (mailRefreshThreadListResponse.response != null) {
                MailGetThreadListResponse.ADAPTER.encodeWithTag(protoWriter, 1, mailRefreshThreadListResponse.response);
            }
            if (mailRefreshThreadListResponse.new_thread_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mailRefreshThreadListResponse.new_thread_count);
            }
            protoWriter.writeBytes(mailRefreshThreadListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailRefreshThreadListResponse$a */
    public static final class C16860a extends Message.Builder<MailRefreshThreadListResponse, C16860a> {

        /* renamed from: a */
        public MailGetThreadListResponse f43326a;

        /* renamed from: b */
        public Long f43327b;

        /* renamed from: a */
        public MailRefreshThreadListResponse build() {
            return new MailRefreshThreadListResponse(this.f43326a, this.f43327b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16860a newBuilder() {
        C16860a aVar = new C16860a();
        aVar.f43326a = this.response;
        aVar.f43327b = this.new_thread_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRefreshThreadListResponse");
        StringBuilder sb = new StringBuilder();
        if (this.response != null) {
            sb.append(", response=");
            sb.append(this.response);
        }
        if (this.new_thread_count != null) {
            sb.append(", new_thread_count=");
            sb.append(this.new_thread_count);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRefreshThreadListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailRefreshThreadListResponse(MailGetThreadListResponse mailGetThreadListResponse, Long l) {
        this(mailGetThreadListResponse, l, ByteString.EMPTY);
    }

    public MailRefreshThreadListResponse(MailGetThreadListResponse mailGetThreadListResponse, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.response = mailGetThreadListResponse;
        this.new_thread_count = l;
    }
}

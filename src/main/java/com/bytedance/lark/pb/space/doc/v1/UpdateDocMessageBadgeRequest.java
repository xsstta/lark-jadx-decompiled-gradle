package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateDocMessageBadgeRequest extends Message<UpdateDocMessageBadgeRequest, C19285a> {
    public static final ProtoAdapter<UpdateDocMessageBadgeRequest> ADAPTER = new C19286b();
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Integer new_message_count;
    public final String token;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMessageBadgeRequest$b */
    private static final class C19286b extends ProtoAdapter<UpdateDocMessageBadgeRequest> {
        C19286b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocMessageBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocMessageBadgeRequest updateDocMessageBadgeRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (updateDocMessageBadgeRequest.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateDocMessageBadgeRequest.token);
            } else {
                i = 0;
            }
            if (updateDocMessageBadgeRequest.new_message_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, updateDocMessageBadgeRequest.new_message_count);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (updateDocMessageBadgeRequest.version != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, updateDocMessageBadgeRequest.version);
            }
            return i4 + i3 + updateDocMessageBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocMessageBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C19285a aVar = new C19285a();
            aVar.f47473a = "";
            aVar.f47474b = 0;
            aVar.f47475c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47473a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47474b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47475c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateDocMessageBadgeRequest updateDocMessageBadgeRequest) throws IOException {
            if (updateDocMessageBadgeRequest.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateDocMessageBadgeRequest.token);
            }
            if (updateDocMessageBadgeRequest.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateDocMessageBadgeRequest.new_message_count);
            }
            if (updateDocMessageBadgeRequest.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, updateDocMessageBadgeRequest.version);
            }
            protoWriter.writeBytes(updateDocMessageBadgeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocMessageBadgeRequest$a */
    public static final class C19285a extends Message.Builder<UpdateDocMessageBadgeRequest, C19285a> {

        /* renamed from: a */
        public String f47473a;

        /* renamed from: b */
        public Integer f47474b;

        /* renamed from: c */
        public Integer f47475c;

        /* renamed from: a */
        public UpdateDocMessageBadgeRequest build() {
            return new UpdateDocMessageBadgeRequest(this.f47473a, this.f47474b, this.f47475c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19285a mo65776a(Integer num) {
            this.f47474b = num;
            return this;
        }

        /* renamed from: b */
        public C19285a mo65779b(Integer num) {
            this.f47475c = num;
            return this;
        }

        /* renamed from: a */
        public C19285a mo65777a(String str) {
            this.f47473a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19285a newBuilder() {
        C19285a aVar = new C19285a();
        aVar.f47473a = this.token;
        aVar.f47474b = this.new_message_count;
        aVar.f47475c = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocMessageBadgeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateDocMessageBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocMessageBadgeRequest(String str, Integer num, Integer num2) {
        this(str, num, num2, ByteString.EMPTY);
    }

    public UpdateDocMessageBadgeRequest(String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.new_message_count = num;
        this.version = num2;
    }
}

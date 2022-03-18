package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ProcessChatApplicationRequest extends Message<ProcessChatApplicationRequest, C17851a> {
    public static final ProtoAdapter<ProcessChatApplicationRequest> ADAPTER = new C17852b();
    public static final Boolean DEFAULT_AUTH_SYNC = false;
    public static final ChatApplication.Status DEFAULT_STATUS = ChatApplication.Status.UNKNOWN_STATUS;
    private static final long serialVersionUID = 0;
    public final Boolean auth_sync;
    public final String id;
    public final ChatApplication.Status status;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.ProcessChatApplicationRequest$b */
    private static final class C17852b extends ProtoAdapter<ProcessChatApplicationRequest> {
        C17852b() {
            super(FieldEncoding.LENGTH_DELIMITED, ProcessChatApplicationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ProcessChatApplicationRequest processChatApplicationRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (processChatApplicationRequest.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, processChatApplicationRequest.id);
            } else {
                i = 0;
            }
            if (processChatApplicationRequest.status != null) {
                i2 = ChatApplication.Status.ADAPTER.encodedSizeWithTag(2, processChatApplicationRequest.status);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (processChatApplicationRequest.user_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, processChatApplicationRequest.user_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (processChatApplicationRequest.auth_sync != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, processChatApplicationRequest.auth_sync);
            }
            return i6 + i4 + processChatApplicationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ProcessChatApplicationRequest decode(ProtoReader protoReader) throws IOException {
            C17851a aVar = new C17851a();
            aVar.f44916a = "";
            aVar.f44917b = ChatApplication.Status.UNKNOWN_STATUS;
            aVar.f44918c = "";
            aVar.f44919d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44916a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f44917b = ChatApplication.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f44918c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44919d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ProcessChatApplicationRequest processChatApplicationRequest) throws IOException {
            if (processChatApplicationRequest.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, processChatApplicationRequest.id);
            }
            if (processChatApplicationRequest.status != null) {
                ChatApplication.Status.ADAPTER.encodeWithTag(protoWriter, 2, processChatApplicationRequest.status);
            }
            if (processChatApplicationRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, processChatApplicationRequest.user_id);
            }
            if (processChatApplicationRequest.auth_sync != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, processChatApplicationRequest.auth_sync);
            }
            protoWriter.writeBytes(processChatApplicationRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ProcessChatApplicationRequest$a */
    public static final class C17851a extends Message.Builder<ProcessChatApplicationRequest, C17851a> {

        /* renamed from: a */
        public String f44916a;

        /* renamed from: b */
        public ChatApplication.Status f44917b;

        /* renamed from: c */
        public String f44918c;

        /* renamed from: d */
        public Boolean f44919d;

        /* renamed from: a */
        public ProcessChatApplicationRequest build() {
            return new ProcessChatApplicationRequest(this.f44916a, this.f44917b, this.f44918c, this.f44919d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17851a mo62209a(ChatApplication.Status status) {
            this.f44917b = status;
            return this;
        }

        /* renamed from: b */
        public C17851a mo62213b(String str) {
            this.f44918c = str;
            return this;
        }

        /* renamed from: a */
        public C17851a mo62210a(Boolean bool) {
            this.f44919d = bool;
            return this;
        }

        /* renamed from: a */
        public C17851a mo62211a(String str) {
            this.f44916a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17851a newBuilder() {
        C17851a aVar = new C17851a();
        aVar.f44916a = this.id;
        aVar.f44917b = this.status;
        aVar.f44918c = this.user_id;
        aVar.f44919d = this.auth_sync;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ProcessChatApplicationRequest");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.auth_sync != null) {
            sb.append(", auth_sync=");
            sb.append(this.auth_sync);
        }
        StringBuilder replace = sb.replace(0, 2, "ProcessChatApplicationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ProcessChatApplicationRequest(String str, ChatApplication.Status status2, String str2, Boolean bool) {
        this(str, status2, str2, bool, ByteString.EMPTY);
    }

    public ProcessChatApplicationRequest(String str, ChatApplication.Status status2, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.status = status2;
        this.user_id = str2;
        this.auth_sync = bool;
    }
}

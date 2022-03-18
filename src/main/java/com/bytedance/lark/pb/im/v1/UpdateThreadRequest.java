package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ThreadState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateThreadRequest extends Message<UpdateThreadRequest, C18160a> {
    public static final ProtoAdapter<UpdateThreadRequest> ADAPTER = new C18161b();
    public static final Boolean DEFAULT_IS_FOLLOW = false;
    public static final ThreadState DEFAULT_THREAD_STATE = ThreadState.UNKNOWN_STATE;
    private static final long serialVersionUID = 0;
    public final Boolean is_follow;
    public final String thread_id;
    public final ThreadState thread_state;
    public final String topic;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateThreadRequest$b */
    private static final class C18161b extends ProtoAdapter<UpdateThreadRequest> {
        C18161b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateThreadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateThreadRequest updateThreadRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateThreadRequest.thread_id);
            int i3 = 0;
            if (updateThreadRequest.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, updateThreadRequest.topic);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (updateThreadRequest.is_follow != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, updateThreadRequest.is_follow);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (updateThreadRequest.thread_state != null) {
                i3 = ThreadState.ADAPTER.encodedSizeWithTag(4, updateThreadRequest.thread_state);
            }
            return i5 + i3 + updateThreadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateThreadRequest decode(ProtoReader protoReader) throws IOException {
            C18160a aVar = new C18160a();
            aVar.f45360a = "";
            aVar.f45361b = "";
            aVar.f45362c = false;
            aVar.f45363d = ThreadState.UNKNOWN_STATE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45360a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45361b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45362c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45363d = ThreadState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateThreadRequest updateThreadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateThreadRequest.thread_id);
            if (updateThreadRequest.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateThreadRequest.topic);
            }
            if (updateThreadRequest.is_follow != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateThreadRequest.is_follow);
            }
            if (updateThreadRequest.thread_state != null) {
                ThreadState.ADAPTER.encodeWithTag(protoWriter, 4, updateThreadRequest.thread_state);
            }
            protoWriter.writeBytes(updateThreadRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18160a newBuilder() {
        C18160a aVar = new C18160a();
        aVar.f45360a = this.thread_id;
        aVar.f45361b = this.topic;
        aVar.f45362c = this.is_follow;
        aVar.f45363d = this.thread_state;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateThreadRequest$a */
    public static final class C18160a extends Message.Builder<UpdateThreadRequest, C18160a> {

        /* renamed from: a */
        public String f45360a;

        /* renamed from: b */
        public String f45361b;

        /* renamed from: c */
        public Boolean f45362c;

        /* renamed from: d */
        public ThreadState f45363d;

        /* renamed from: a */
        public UpdateThreadRequest build() {
            String str = this.f45360a;
            if (str != null) {
                return new UpdateThreadRequest(str, this.f45361b, this.f45362c, this.f45363d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "thread_id");
        }

        /* renamed from: a */
        public C18160a mo62992a(ThreadState threadState) {
            this.f45363d = threadState;
            return this;
        }

        /* renamed from: a */
        public C18160a mo62993a(Boolean bool) {
            this.f45362c = bool;
            return this;
        }

        /* renamed from: a */
        public C18160a mo62994a(String str) {
            this.f45360a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateThreadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", thread_id=");
        sb.append(this.thread_id);
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.is_follow != null) {
            sb.append(", is_follow=");
            sb.append(this.is_follow);
        }
        if (this.thread_state != null) {
            sb.append(", thread_state=");
            sb.append(this.thread_state);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateThreadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateThreadRequest(String str, String str2, Boolean bool, ThreadState threadState) {
        this(str, str2, bool, threadState, ByteString.EMPTY);
    }

    public UpdateThreadRequest(String str, String str2, Boolean bool, ThreadState threadState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.topic = str2;
        this.is_follow = bool;
        this.thread_state = threadState;
    }
}

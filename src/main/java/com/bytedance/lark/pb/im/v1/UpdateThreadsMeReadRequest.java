package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UpdateThreadsMeReadRequest extends Message<UpdateThreadsMeReadRequest, C18162a> {
    public static final ProtoAdapter<UpdateThreadsMeReadRequest> ADAPTER = new C18163b();
    public static final Integer DEFAULT_READ_POSITION = 0;
    public static final Integer DEFAULT_READ_POSITION_BADGE_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Integer read_position;
    public final Integer read_position_badge_count;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateThreadsMeReadRequest$b */
    private static final class C18163b extends ProtoAdapter<UpdateThreadsMeReadRequest> {
        C18163b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateThreadsMeReadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateThreadsMeReadRequest updateThreadsMeReadRequest) {
            return Channel.ADAPTER.encodedSizeWithTag(1, updateThreadsMeReadRequest.channel) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, updateThreadsMeReadRequest.thread_ids) + ProtoAdapter.INT32.encodedSizeWithTag(3, updateThreadsMeReadRequest.read_position) + ProtoAdapter.INT32.encodedSizeWithTag(4, updateThreadsMeReadRequest.read_position_badge_count) + updateThreadsMeReadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateThreadsMeReadRequest decode(ProtoReader protoReader) throws IOException {
            C18162a aVar = new C18162a();
            aVar.f45366c = 0;
            aVar.f45367d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45364a = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45365b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f45366c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45367d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateThreadsMeReadRequest updateThreadsMeReadRequest) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, updateThreadsMeReadRequest.channel);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, updateThreadsMeReadRequest.thread_ids);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, updateThreadsMeReadRequest.read_position);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, updateThreadsMeReadRequest.read_position_badge_count);
            protoWriter.writeBytes(updateThreadsMeReadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateThreadsMeReadRequest$a */
    public static final class C18162a extends Message.Builder<UpdateThreadsMeReadRequest, C18162a> {

        /* renamed from: a */
        public Channel f45364a;

        /* renamed from: b */
        public List<String> f45365b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f45366c;

        /* renamed from: d */
        public Integer f45367d;

        /* renamed from: a */
        public UpdateThreadsMeReadRequest build() {
            Integer num;
            Integer num2;
            Channel channel = this.f45364a;
            if (channel != null && (num = this.f45366c) != null && (num2 = this.f45367d) != null) {
                return new UpdateThreadsMeReadRequest(channel, this.f45365b, num, num2, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel", this.f45366c, "read_position", this.f45367d, "read_position_badge_count");
        }

        /* renamed from: a */
        public C18162a mo62999a(Channel channel) {
            this.f45364a = channel;
            return this;
        }

        /* renamed from: b */
        public C18162a mo63003b(Integer num) {
            this.f45367d = num;
            return this;
        }

        /* renamed from: a */
        public C18162a mo63000a(Integer num) {
            this.f45366c = num;
            return this;
        }

        /* renamed from: a */
        public C18162a mo63001a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45365b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18162a newBuilder() {
        C18162a aVar = new C18162a();
        aVar.f45364a = this.channel;
        aVar.f45365b = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f45366c = this.read_position;
        aVar.f45367d = this.read_position_badge_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateThreadsMeReadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        sb.append(", read_position=");
        sb.append(this.read_position);
        sb.append(", read_position_badge_count=");
        sb.append(this.read_position_badge_count);
        StringBuilder replace = sb.replace(0, 2, "UpdateThreadsMeReadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateThreadsMeReadRequest(Channel channel2, List<String> list, Integer num, Integer num2) {
        this(channel2, list, num, num2, ByteString.EMPTY);
    }

    public UpdateThreadsMeReadRequest(Channel channel2, List<String> list, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.read_position = num;
        this.read_position_badge_count = num2;
    }
}

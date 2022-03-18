package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Follower extends Message<Follower, C18372a> {
    public static final ProtoAdapter<Follower> ADAPTER = new C18373b();
    public static final Long DEFAULT_UPDATE_TIME_MSEC = 0L;
    private static final long serialVersionUID = 0;
    public final Long update_time_msec;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Follower$b */
    private static final class C18373b extends ProtoAdapter<Follower> {
        C18373b() {
            super(FieldEncoding.LENGTH_DELIMITED, Follower.class);
        }

        /* renamed from: a */
        public int encodedSize(Follower follower) {
            int i;
            int i2 = 0;
            if (follower.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, follower.user_id);
            } else {
                i = 0;
            }
            if (follower.update_time_msec != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, follower.update_time_msec);
            }
            return i + i2 + follower.unknownFields().size();
        }

        /* renamed from: a */
        public Follower decode(ProtoReader protoReader) throws IOException {
            C18372a aVar = new C18372a();
            aVar.f45756a = "";
            aVar.f45757b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45756a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45757b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Follower follower) throws IOException {
            if (follower.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, follower.user_id);
            }
            if (follower.update_time_msec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, follower.update_time_msec);
            }
            protoWriter.writeBytes(follower.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Follower$a */
    public static final class C18372a extends Message.Builder<Follower, C18372a> {

        /* renamed from: a */
        public String f45756a;

        /* renamed from: b */
        public Long f45757b;

        /* renamed from: a */
        public Follower build() {
            return new Follower(this.f45756a, this.f45757b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18372a newBuilder() {
        C18372a aVar = new C18372a();
        aVar.f45756a = this.user_id;
        aVar.f45757b = this.update_time_msec;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Follower");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.update_time_msec != null) {
            sb.append(", update_time_msec=");
            sb.append(this.update_time_msec);
        }
        StringBuilder replace = sb.replace(0, 2, "Follower{");
        replace.append('}');
        return replace.toString();
    }

    public Follower(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public Follower(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.update_time_msec = l;
    }
}

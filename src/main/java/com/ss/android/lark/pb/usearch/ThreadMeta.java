package com.ss.android.lark.pb.usearch;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ThreadMeta extends Message<ThreadMeta, C50246a> {
    public static final ProtoAdapter<ThreadMeta> ADAPTER = new C50247b();
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final String mid;
    public final Long mupdate_time;

    /* renamed from: com.ss.android.lark.pb.usearch.ThreadMeta$b */
    private static final class C50247b extends ProtoAdapter<ThreadMeta> {
        C50247b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThreadMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ThreadMeta threadMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, threadMeta.mid);
            int i2 = 0;
            if (threadMeta.mchat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, threadMeta.mchat_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (threadMeta.mupdate_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, threadMeta.mupdate_time);
            }
            return i3 + i2 + threadMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ThreadMeta decode(ProtoReader protoReader) throws IOException {
            C50246a aVar = new C50246a();
            aVar.f125559a = "";
            aVar.f125560b = "";
            aVar.f125561c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125559a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125560b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125561c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ThreadMeta threadMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, threadMeta.mid);
            if (threadMeta.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, threadMeta.mchat_id);
            }
            if (threadMeta.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, threadMeta.mupdate_time);
            }
            protoWriter.writeBytes(threadMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50246a newBuilder() {
        C50246a aVar = new C50246a();
        aVar.f125559a = this.mid;
        aVar.f125560b = this.mchat_id;
        aVar.f125561c = this.mupdate_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.usearch.ThreadMeta$a */
    public static final class C50246a extends Message.Builder<ThreadMeta, C50246a> {

        /* renamed from: a */
        public String f125559a;

        /* renamed from: b */
        public String f125560b;

        /* renamed from: c */
        public Long f125561c;

        /* renamed from: a */
        public ThreadMeta build() {
            String str = this.f125559a;
            if (str != null) {
                return new ThreadMeta(str, this.f125560b, this.f125561c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        StringBuilder replace = sb.replace(0, 2, "ThreadMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ThreadMeta(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public ThreadMeta(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mchat_id = str2;
        this.mupdate_time = l;
    }
}

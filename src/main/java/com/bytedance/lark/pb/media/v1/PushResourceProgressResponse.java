package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PushResourceProgressResponse extends Message<PushResourceProgressResponse, C18278a> {
    public static final ProtoAdapter<PushResourceProgressResponse> ADAPTER = new C18279b();
    public static final Link DEFAULT_LINK = Link.UPLOAD;
    public static final Integer DEFAULT_PROGRESS = 0;
    public static final Long DEFAULT_TOTAL_SIZE = 0L;
    public static final Long DEFAULT_TRANSFERRED_SIZE = 0L;
    private static final long serialVersionUID = 0;
    public final String key;
    public final Link link;
    public final Integer progress;
    public final Long total_size;
    public final Long transferred_size;

    public enum Link implements WireEnum {
        UPLOAD(1),
        DOWNLOAD(2);
        
        public static final ProtoAdapter<Link> ADAPTER = ProtoAdapter.newEnumAdapter(Link.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Link fromValue(int i) {
            if (i == 1) {
                return UPLOAD;
            }
            if (i != 2) {
                return null;
            }
            return DOWNLOAD;
        }

        private Link(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushResourceProgressResponse$b */
    private static final class C18279b extends ProtoAdapter<PushResourceProgressResponse> {
        C18279b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushResourceProgressResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushResourceProgressResponse pushResourceProgressResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushResourceProgressResponse.key) + ProtoAdapter.UINT32.encodedSizeWithTag(2, pushResourceProgressResponse.progress) + Link.ADAPTER.encodedSizeWithTag(3, pushResourceProgressResponse.link);
            int i2 = 0;
            if (pushResourceProgressResponse.total_size != null) {
                i = ProtoAdapter.UINT64.encodedSizeWithTag(4, pushResourceProgressResponse.total_size);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (pushResourceProgressResponse.transferred_size != null) {
                i2 = ProtoAdapter.UINT64.encodedSizeWithTag(5, pushResourceProgressResponse.transferred_size);
            }
            return i3 + i2 + pushResourceProgressResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushResourceProgressResponse decode(ProtoReader protoReader) throws IOException {
            C18278a aVar = new C18278a();
            aVar.f45549a = "";
            aVar.f45550b = 0;
            aVar.f45551c = Link.UPLOAD;
            aVar.f45552d = 0L;
            aVar.f45553e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45549a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45550b = ProtoAdapter.UINT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f45551c = Link.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f45552d = ProtoAdapter.UINT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45553e = ProtoAdapter.UINT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushResourceProgressResponse pushResourceProgressResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushResourceProgressResponse.key);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, pushResourceProgressResponse.progress);
            Link.ADAPTER.encodeWithTag(protoWriter, 3, pushResourceProgressResponse.link);
            if (pushResourceProgressResponse.total_size != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 4, pushResourceProgressResponse.total_size);
            }
            if (pushResourceProgressResponse.transferred_size != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 5, pushResourceProgressResponse.transferred_size);
            }
            protoWriter.writeBytes(pushResourceProgressResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.PushResourceProgressResponse$a */
    public static final class C18278a extends Message.Builder<PushResourceProgressResponse, C18278a> {

        /* renamed from: a */
        public String f45549a;

        /* renamed from: b */
        public Integer f45550b;

        /* renamed from: c */
        public Link f45551c;

        /* renamed from: d */
        public Long f45552d;

        /* renamed from: e */
        public Long f45553e;

        /* renamed from: a */
        public PushResourceProgressResponse build() {
            Integer num;
            Link link;
            String str = this.f45549a;
            if (str != null && (num = this.f45550b) != null && (link = this.f45551c) != null) {
                return new PushResourceProgressResponse(str, num, link, this.f45552d, this.f45553e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key", this.f45550b, "progress", this.f45551c, "link");
        }
    }

    @Override // com.squareup.wire.Message
    public C18278a newBuilder() {
        C18278a aVar = new C18278a();
        aVar.f45549a = this.key;
        aVar.f45550b = this.progress;
        aVar.f45551c = this.link;
        aVar.f45552d = this.total_size;
        aVar.f45553e = this.transferred_size;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "PushResourceProgressResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", link=");
        sb.append(this.link);
        if (this.total_size != null) {
            sb.append(", total_size=");
            sb.append(this.total_size);
        }
        if (this.transferred_size != null) {
            sb.append(", transferred_size=");
            sb.append(this.transferred_size);
        }
        StringBuilder replace = sb.replace(0, 2, "PushResourceProgressResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushResourceProgressResponse(String str, Integer num, Link link2, Long l, Long l2) {
        this(str, num, link2, l, l2, ByteString.EMPTY);
    }

    public PushResourceProgressResponse(String str, Integer num, Link link2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.progress = num;
        this.link = link2;
        this.total_size = l;
        this.transferred_size = l2;
    }
}

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

public final class PushTopicGroupTabBadge extends Message<PushTopicGroupTabBadge, C17957a> {
    public static final ProtoAdapter<PushTopicGroupTabBadge> ADAPTER = new C17958b();
    public static final Boolean DEFAULT_HAS_NEW_CONTENT = false;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_new_content;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTopicGroupTabBadge$b */
    private static final class C17958b extends ProtoAdapter<PushTopicGroupTabBadge> {
        C17958b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushTopicGroupTabBadge.class);
        }

        /* renamed from: a */
        public int encodedSize(PushTopicGroupTabBadge pushTopicGroupTabBadge) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, pushTopicGroupTabBadge.has_new_content) + ProtoAdapter.INT64.encodedSizeWithTag(2, pushTopicGroupTabBadge.update_time) + pushTopicGroupTabBadge.unknownFields().size();
        }

        /* renamed from: a */
        public PushTopicGroupTabBadge decode(ProtoReader protoReader) throws IOException {
            C17957a aVar = new C17957a();
            aVar.f45048a = false;
            aVar.f45049b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45048a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45049b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushTopicGroupTabBadge pushTopicGroupTabBadge) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pushTopicGroupTabBadge.has_new_content);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pushTopicGroupTabBadge.update_time);
            protoWriter.writeBytes(pushTopicGroupTabBadge.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17957a newBuilder() {
        C17957a aVar = new C17957a();
        aVar.f45048a = this.has_new_content;
        aVar.f45049b = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushTopicGroupTabBadge$a */
    public static final class C17957a extends Message.Builder<PushTopicGroupTabBadge, C17957a> {

        /* renamed from: a */
        public Boolean f45048a;

        /* renamed from: b */
        public Long f45049b;

        /* renamed from: a */
        public PushTopicGroupTabBadge build() {
            Long l;
            Boolean bool = this.f45048a;
            if (bool != null && (l = this.f45049b) != null) {
                return new PushTopicGroupTabBadge(bool, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_new_content", this.f45049b, "update_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushTopicGroupTabBadge");
        StringBuilder sb = new StringBuilder();
        sb.append(", has_new_content=");
        sb.append(this.has_new_content);
        sb.append(", update_time=");
        sb.append(this.update_time);
        StringBuilder replace = sb.replace(0, 2, "PushTopicGroupTabBadge{");
        replace.append('}');
        return replace.toString();
    }

    public PushTopicGroupTabBadge(Boolean bool, Long l) {
        this(bool, l, ByteString.EMPTY);
    }

    public PushTopicGroupTabBadge(Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_new_content = bool;
        this.update_time = l;
    }
}

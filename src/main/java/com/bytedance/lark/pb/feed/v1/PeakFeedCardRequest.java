package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.FeedCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PeakFeedCardRequest extends Message<PeakFeedCardRequest, C17198a> {
    public static final ProtoAdapter<PeakFeedCardRequest> ADAPTER = new C17199b();
    public static final FeedCard.EntityType DEFAULT_ENTITY_TYPE = FeedCard.EntityType.UNKNOWN_ENTITY;
    private static final long serialVersionUID = 0;
    public final FeedCard.EntityType entity_type;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PeakFeedCardRequest$b */
    private static final class C17199b extends ProtoAdapter<PeakFeedCardRequest> {
        C17199b() {
            super(FieldEncoding.LENGTH_DELIMITED, PeakFeedCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PeakFeedCardRequest peakFeedCardRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, peakFeedCardRequest.id) + FeedCard.EntityType.ADAPTER.encodedSizeWithTag(2, peakFeedCardRequest.entity_type) + peakFeedCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PeakFeedCardRequest decode(ProtoReader protoReader) throws IOException {
            C17198a aVar = new C17198a();
            aVar.f43983a = "";
            aVar.f43984b = FeedCard.EntityType.UNKNOWN_ENTITY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43983a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43984b = FeedCard.EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PeakFeedCardRequest peakFeedCardRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, peakFeedCardRequest.id);
            FeedCard.EntityType.ADAPTER.encodeWithTag(protoWriter, 2, peakFeedCardRequest.entity_type);
            protoWriter.writeBytes(peakFeedCardRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17198a newBuilder() {
        C17198a aVar = new C17198a();
        aVar.f43983a = this.id;
        aVar.f43984b = this.entity_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PeakFeedCardRequest$a */
    public static final class C17198a extends Message.Builder<PeakFeedCardRequest, C17198a> {

        /* renamed from: a */
        public String f43983a;

        /* renamed from: b */
        public FeedCard.EntityType f43984b;

        /* renamed from: a */
        public PeakFeedCardRequest build() {
            FeedCard.EntityType entityType;
            String str = this.f43983a;
            if (str != null && (entityType = this.f43984b) != null) {
                return new PeakFeedCardRequest(str, entityType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f43984b, "entity_type");
        }

        /* renamed from: a */
        public C17198a mo60525a(FeedCard.EntityType entityType) {
            this.f43984b = entityType;
            return this;
        }

        /* renamed from: a */
        public C17198a mo60526a(String str) {
            this.f43983a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PeakFeedCardRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", entity_type=");
        sb.append(this.entity_type);
        StringBuilder replace = sb.replace(0, 2, "PeakFeedCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PeakFeedCardRequest(String str, FeedCard.EntityType entityType) {
        this(str, entityType, ByteString.EMPTY);
    }

    public PeakFeedCardRequest(String str, FeedCard.EntityType entityType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.entity_type = entityType;
    }
}

package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedRecommendation extends Message<FeedRecommendation, C17134a> {
    public static final ProtoAdapter<FeedRecommendation> ADAPTER = new C17135b();
    public static final Boolean DEFAULT_IS_NEW_BOX = false;
    private static final long serialVersionUID = 0;
    public final String impr_id;
    public final Boolean is_new_box;
    public final String scene;

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedRecommendation$b */
    private static final class C17135b extends ProtoAdapter<FeedRecommendation> {
        C17135b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedRecommendation.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedRecommendation feedRecommendation) {
            int i;
            int i2;
            int i3 = 0;
            if (feedRecommendation.impr_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, feedRecommendation.impr_id);
            } else {
                i = 0;
            }
            if (feedRecommendation.scene != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, feedRecommendation.scene);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (feedRecommendation.is_new_box != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, feedRecommendation.is_new_box);
            }
            return i4 + i3 + feedRecommendation.unknownFields().size();
        }

        /* renamed from: a */
        public FeedRecommendation decode(ProtoReader protoReader) throws IOException {
            C17134a aVar = new C17134a();
            aVar.f43881a = "";
            aVar.f43882b = "";
            aVar.f43883c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43881a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43882b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43883c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedRecommendation feedRecommendation) throws IOException {
            if (feedRecommendation.impr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedRecommendation.impr_id);
            }
            if (feedRecommendation.scene != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedRecommendation.scene);
            }
            if (feedRecommendation.is_new_box != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, feedRecommendation.is_new_box);
            }
            protoWriter.writeBytes(feedRecommendation.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedRecommendation$a */
    public static final class C17134a extends Message.Builder<FeedRecommendation, C17134a> {

        /* renamed from: a */
        public String f43881a;

        /* renamed from: b */
        public String f43882b;

        /* renamed from: c */
        public Boolean f43883c;

        /* renamed from: a */
        public FeedRecommendation build() {
            return new FeedRecommendation(this.f43881a, this.f43882b, this.f43883c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17134a newBuilder() {
        C17134a aVar = new C17134a();
        aVar.f43881a = this.impr_id;
        aVar.f43882b = this.scene;
        aVar.f43883c = this.is_new_box;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedRecommendation");
        StringBuilder sb = new StringBuilder();
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.is_new_box != null) {
            sb.append(", is_new_box=");
            sb.append(this.is_new_box);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedRecommendation{");
        replace.append('}');
        return replace.toString();
    }

    public FeedRecommendation(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public FeedRecommendation(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
        this.scene = str2;
        this.is_new_box = bool;
    }
}

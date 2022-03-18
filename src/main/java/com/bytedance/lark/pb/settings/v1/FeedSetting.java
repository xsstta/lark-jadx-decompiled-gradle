package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class FeedSetting extends Message<FeedSetting, C19133a> {
    public static final ProtoAdapter<FeedSetting> ADAPTER = new C19134b();
    public static final Boolean DEFAULT_IS_OPEN_AUTO_BOX = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_open_auto_box;

    /* renamed from: com.bytedance.lark.pb.settings.v1.FeedSetting$b */
    private static final class C19134b extends ProtoAdapter<FeedSetting> {
        C19134b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedSetting feedSetting) {
            int i;
            if (feedSetting.is_open_auto_box != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, feedSetting.is_open_auto_box);
            } else {
                i = 0;
            }
            return i + feedSetting.unknownFields().size();
        }

        /* renamed from: a */
        public FeedSetting decode(ProtoReader protoReader) throws IOException {
            C19133a aVar = new C19133a();
            aVar.f47273a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47273a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedSetting feedSetting) throws IOException {
            if (feedSetting.is_open_auto_box != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, feedSetting.is_open_auto_box);
            }
            protoWriter.writeBytes(feedSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.FeedSetting$a */
    public static final class C19133a extends Message.Builder<FeedSetting, C19133a> {

        /* renamed from: a */
        public Boolean f47273a;

        /* renamed from: a */
        public FeedSetting build() {
            return new FeedSetting(this.f47273a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19133a newBuilder() {
        C19133a aVar = new C19133a();
        aVar.f47273a = this.is_open_auto_box;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "FeedSetting");
        StringBuilder sb = new StringBuilder();
        if (this.is_open_auto_box != null) {
            sb.append(", is_open_auto_box=");
            sb.append(this.is_open_auto_box);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedSetting{");
        replace.append('}');
        return replace.toString();
    }

    public FeedSetting(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public FeedSetting(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_open_auto_box = bool;
    }
}

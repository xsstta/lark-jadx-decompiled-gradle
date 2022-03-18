package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class LiveSettingLayoutType extends Message<LiveSettingLayoutType, C50378a> {
    public static final ProtoAdapter<LiveSettingLayoutType> ADAPTER = new C50379b();
    private static final long serialVersionUID = 0;
    public final LiveSettingElement mlayout_full;
    public final LiveSettingElement mlayout_gallery;
    public final LiveSettingElement mlayout_list;

    /* renamed from: com.ss.android.lark.pb.videochat.LiveSettingLayoutType$b */
    private static final class C50379b extends ProtoAdapter<LiveSettingLayoutType> {
        C50379b() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveSettingLayoutType.class);
        }

        /* renamed from: a */
        public int encodedSize(LiveSettingLayoutType liveSettingLayoutType) {
            int i;
            int i2;
            int i3 = 0;
            if (liveSettingLayoutType.mlayout_list != null) {
                i = LiveSettingElement.ADAPTER.encodedSizeWithTag(1, liveSettingLayoutType.mlayout_list);
            } else {
                i = 0;
            }
            if (liveSettingLayoutType.mlayout_gallery != null) {
                i2 = LiveSettingElement.ADAPTER.encodedSizeWithTag(2, liveSettingLayoutType.mlayout_gallery);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (liveSettingLayoutType.mlayout_full != null) {
                i3 = LiveSettingElement.ADAPTER.encodedSizeWithTag(3, liveSettingLayoutType.mlayout_full);
            }
            return i4 + i3 + liveSettingLayoutType.unknownFields().size();
        }

        /* renamed from: a */
        public LiveSettingLayoutType decode(ProtoReader protoReader) throws IOException {
            C50378a aVar = new C50378a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125784a = LiveSettingElement.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125785b = LiveSettingElement.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125786c = LiveSettingElement.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LiveSettingLayoutType liveSettingLayoutType) throws IOException {
            if (liveSettingLayoutType.mlayout_list != null) {
                LiveSettingElement.ADAPTER.encodeWithTag(protoWriter, 1, liveSettingLayoutType.mlayout_list);
            }
            if (liveSettingLayoutType.mlayout_gallery != null) {
                LiveSettingElement.ADAPTER.encodeWithTag(protoWriter, 2, liveSettingLayoutType.mlayout_gallery);
            }
            if (liveSettingLayoutType.mlayout_full != null) {
                LiveSettingElement.ADAPTER.encodeWithTag(protoWriter, 3, liveSettingLayoutType.mlayout_full);
            }
            protoWriter.writeBytes(liveSettingLayoutType.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.LiveSettingLayoutType$a */
    public static final class C50378a extends Message.Builder<LiveSettingLayoutType, C50378a> {

        /* renamed from: a */
        public LiveSettingElement f125784a;

        /* renamed from: b */
        public LiveSettingElement f125785b;

        /* renamed from: c */
        public LiveSettingElement f125786c;

        /* renamed from: a */
        public LiveSettingLayoutType build() {
            return new LiveSettingLayoutType(this.f125784a, this.f125785b, this.f125786c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50378a newBuilder() {
        C50378a aVar = new C50378a();
        aVar.f125784a = this.mlayout_list;
        aVar.f125785b = this.mlayout_gallery;
        aVar.f125786c = this.mlayout_full;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mlayout_list != null) {
            sb.append(", layout_list=");
            sb.append(this.mlayout_list);
        }
        if (this.mlayout_gallery != null) {
            sb.append(", layout_gallery=");
            sb.append(this.mlayout_gallery);
        }
        if (this.mlayout_full != null) {
            sb.append(", layout_full=");
            sb.append(this.mlayout_full);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveSettingLayoutType{");
        replace.append('}');
        return replace.toString();
    }

    public LiveSettingLayoutType(LiveSettingElement liveSettingElement, LiveSettingElement liveSettingElement2, LiveSettingElement liveSettingElement3) {
        this(liveSettingElement, liveSettingElement2, liveSettingElement3, ByteString.EMPTY);
    }

    public LiveSettingLayoutType(LiveSettingElement liveSettingElement, LiveSettingElement liveSettingElement2, LiveSettingElement liveSettingElement3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlayout_list = liveSettingElement;
        this.mlayout_gallery = liveSettingElement2;
        this.mlayout_full = liveSettingElement3;
    }
}

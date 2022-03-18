package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class LiveSettingElement extends Message<LiveSettingElement, C50376a> {
    public static final ProtoAdapter<LiveSettingElement> ADAPTER = new C50377b();
    public static final Boolean DEFAULT_IS_DISABLED = false;
    public static final Boolean DEFAULT_IS_SELECTED = false;
    private static final long serialVersionUID = 0;
    public final String mdisable_hover_key;
    public final Boolean mis_disabled;
    public final Boolean mis_selected;

    /* renamed from: com.ss.android.lark.pb.videochat.LiveSettingElement$b */
    private static final class C50377b extends ProtoAdapter<LiveSettingElement> {
        C50377b() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveSettingElement.class);
        }

        /* renamed from: a */
        public int encodedSize(LiveSettingElement liveSettingElement) {
            int i;
            int i2;
            int i3 = 0;
            if (liveSettingElement.mis_selected != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, liveSettingElement.mis_selected);
            } else {
                i = 0;
            }
            if (liveSettingElement.mis_disabled != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, liveSettingElement.mis_disabled);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (liveSettingElement.mdisable_hover_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, liveSettingElement.mdisable_hover_key);
            }
            return i4 + i3 + liveSettingElement.unknownFields().size();
        }

        /* renamed from: a */
        public LiveSettingElement decode(ProtoReader protoReader) throws IOException {
            C50376a aVar = new C50376a();
            aVar.f125781a = false;
            aVar.f125782b = false;
            aVar.f125783c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125781a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125782b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125783c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LiveSettingElement liveSettingElement) throws IOException {
            if (liveSettingElement.mis_selected != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, liveSettingElement.mis_selected);
            }
            if (liveSettingElement.mis_disabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, liveSettingElement.mis_disabled);
            }
            if (liveSettingElement.mdisable_hover_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, liveSettingElement.mdisable_hover_key);
            }
            protoWriter.writeBytes(liveSettingElement.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.LiveSettingElement$a */
    public static final class C50376a extends Message.Builder<LiveSettingElement, C50376a> {

        /* renamed from: a */
        public Boolean f125781a;

        /* renamed from: b */
        public Boolean f125782b;

        /* renamed from: c */
        public String f125783c;

        /* renamed from: a */
        public LiveSettingElement build() {
            return new LiveSettingElement(this.f125781a, this.f125782b, this.f125783c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50376a newBuilder() {
        C50376a aVar = new C50376a();
        aVar.f125781a = this.mis_selected;
        aVar.f125782b = this.mis_disabled;
        aVar.f125783c = this.mdisable_hover_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mis_selected != null) {
            sb.append(", is_selected=");
            sb.append(this.mis_selected);
        }
        if (this.mis_disabled != null) {
            sb.append(", is_disabled=");
            sb.append(this.mis_disabled);
        }
        if (this.mdisable_hover_key != null) {
            sb.append(", disable_hover_key=");
            sb.append(this.mdisable_hover_key);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveSettingElement{");
        replace.append('}');
        return replace.toString();
    }

    public LiveSettingElement(Boolean bool, Boolean bool2, String str) {
        this(bool, bool2, str, ByteString.EMPTY);
    }

    public LiveSettingElement(Boolean bool, Boolean bool2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_selected = bool;
        this.mis_disabled = bool2;
        this.mdisable_hover_key = str;
    }
}

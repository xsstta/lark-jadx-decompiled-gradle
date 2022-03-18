package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class VCTabStatisticsInfo extends Message<VCTabStatisticsInfo, C51204a> {
    public static final ProtoAdapter<VCTabStatisticsInfo> ADAPTER = new C51205b();
    public static final Status DEFAULT_STATUS = Status.UNAVAILABLE;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final String statistics_file_title;
    public final String statistics_url;
    public final Status status;
    public final Integer version;

    public enum Status implements WireEnum {
        UNAVAILABLE(0),
        READY(1),
        WAITING(2),
        SUCCEEDED(3),
        FAILED(4);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 0) {
                return UNAVAILABLE;
            }
            if (i == 1) {
                return READY;
            }
            if (i == 2) {
                return WAITING;
            }
            if (i == 3) {
                return SUCCEEDED;
            }
            if (i != 4) {
                return null;
            }
            return FAILED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$b */
    private static final class C51205b extends ProtoAdapter<VCTabStatisticsInfo> {
        C51205b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabStatisticsInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabStatisticsInfo vCTabStatisticsInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (vCTabStatisticsInfo.status != null) {
                i = Status.ADAPTER.encodedSizeWithTag(1, vCTabStatisticsInfo.status);
            } else {
                i = 0;
            }
            if (vCTabStatisticsInfo.statistics_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, vCTabStatisticsInfo.statistics_url);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (vCTabStatisticsInfo.statistics_file_title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, vCTabStatisticsInfo.statistics_file_title);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (vCTabStatisticsInfo.meeting_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, vCTabStatisticsInfo.meeting_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (vCTabStatisticsInfo.version != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, vCTabStatisticsInfo.version);
            }
            return i8 + i5 + vCTabStatisticsInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabStatisticsInfo decode(ProtoReader protoReader) throws IOException {
            C51204a aVar = new C51204a();
            aVar.f127459a = Status.UNAVAILABLE;
            aVar.f127460b = "";
            aVar.f127461c = "";
            aVar.f127462d = "";
            aVar.f127463e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127459a = Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f127460b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127461c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f127462d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127463e = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabStatisticsInfo vCTabStatisticsInfo) throws IOException {
            if (vCTabStatisticsInfo.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 1, vCTabStatisticsInfo.status);
            }
            if (vCTabStatisticsInfo.statistics_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCTabStatisticsInfo.statistics_url);
            }
            if (vCTabStatisticsInfo.statistics_file_title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, vCTabStatisticsInfo.statistics_file_title);
            }
            if (vCTabStatisticsInfo.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, vCTabStatisticsInfo.meeting_id);
            }
            if (vCTabStatisticsInfo.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, vCTabStatisticsInfo.version);
            }
            protoWriter.writeBytes(vCTabStatisticsInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabStatisticsInfo$a */
    public static final class C51204a extends Message.Builder<VCTabStatisticsInfo, C51204a> {

        /* renamed from: a */
        public Status f127459a;

        /* renamed from: b */
        public String f127460b;

        /* renamed from: c */
        public String f127461c;

        /* renamed from: d */
        public String f127462d;

        /* renamed from: e */
        public Integer f127463e;

        /* renamed from: a */
        public VCTabStatisticsInfo build() {
            return new VCTabStatisticsInfo(this.f127459a, this.f127460b, this.f127461c, this.f127462d, this.f127463e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51204a newBuilder() {
        C51204a aVar = new C51204a();
        aVar.f127459a = this.status;
        aVar.f127460b = this.statistics_url;
        aVar.f127461c = this.statistics_file_title;
        aVar.f127462d = this.meeting_id;
        aVar.f127463e = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabStatisticsInfo");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.statistics_url != null) {
            sb.append(", statistics_url=");
            sb.append(this.statistics_url);
        }
        if (this.statistics_file_title != null) {
            sb.append(", statistics_file_title=");
            sb.append(this.statistics_file_title);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabStatisticsInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabStatisticsInfo(Status status2, String str, String str2, String str3, Integer num) {
        this(status2, str, str2, str3, num, ByteString.EMPTY);
    }

    public VCTabStatisticsInfo(Status status2, String str, String str2, String str3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.statistics_url = str;
        this.statistics_file_title = str2;
        this.meeting_id = str3;
        this.version = num;
    }
}

package com.ss.android.lark.image.impl;

import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.p1959b.AbstractC38820a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J \u0010-\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bJ3\u0010-\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u001b2\b\u00100\u001a\u0004\u0018\u00010\u001b2\b\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00102J \u00103\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bJ3\u00103\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u001b2\b\u00100\u001a\u0004\u0018\u00010\u001b2\b\u0010.\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00102J\u000e\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u000e\u0010\u0019\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001bXD¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00067"}, d2 = {"Lcom/ss/android/lark/image/impl/PerfLoadPicHitPoint;", "", "()V", "EVENT_PERF_LOAD_PIC", "", "getEVENT_PERF_LOAD_PIC", "()Ljava/lang/String;", "KEY_IS_THUMBNAIL", "getKEY_IS_THUMBNAIL", "KEY_LOAD_DIFF_TIME", "getKEY_LOAD_DIFF_TIME", "KEY_LOAD_END_TIME", "getKEY_LOAD_END_TIME", "KEY_LOAD_START_TIME", "getKEY_LOAD_START_TIME", "KEY_LOAD_STATE", "getKEY_LOAD_STATE", "KEY_PIC_HEIGHT", "getKEY_PIC_HEIGHT", "KEY_PIC_KEY", "getKEY_PIC_KEY", "KEY_PIC_TYPE", "getKEY_PIC_TYPE", "KEY_PIC_WIDTH", "getKEY_PIC_WIDTH", "TAG", "VALUE_IS_THUMBNAIL_ORIGIN", "", "getVALUE_IS_THUMBNAIL_ORIGIN", "()I", "VALUE_IS_THUMBNAIL_THUMBNAIL", "getVALUE_IS_THUMBNAIL_THUMBNAIL", "VALUE_LOAD_STATE_FAIL", "getVALUE_LOAD_STATE_FAIL", "VALUE_LOAD_STATE_SUCCESS", "getVALUE_LOAD_STATE_SUCCESS", "defaultParamsMap", "Ljava/util/HashMap;", "getDefaultParamsMap", "()Ljava/util/HashMap;", "setDefaultParamsMap", "(Ljava/util/HashMap;)V", "computeEndTime", "", "innerSend", "loadPicFail", "picId", "width", "height", "format", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "loadPicSuccess", "startLoadPic", "isThumbnail", "", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.image.impl.e */
public final class PerfLoadPicHitPoint {

    /* renamed from: a */
    private String f99905a = "PerfLoadPicMonitor";

    /* renamed from: b */
    private HashMap<String, Object> f99906b = new HashMap<>();

    /* renamed from: c */
    private final String f99907c = "perf_load_pic";

    /* renamed from: d */
    private final String f99908d = "load_start_time";

    /* renamed from: e */
    private final String f99909e = "load_end_time";

    /* renamed from: f */
    private final String f99910f = "load_diff_time";

    /* renamed from: g */
    private final String f99911g = "load_state";

    /* renamed from: h */
    private final String f99912h = "pic_type";

    /* renamed from: i */
    private final String f99913i = "pic_key";

    /* renamed from: j */
    private final String f99914j = "is_thumbnail";

    /* renamed from: k */
    private final String f99915k = "width";

    /* renamed from: l */
    private final String f99916l = "height";

    /* renamed from: m */
    private final int f99917m = 1;

    /* renamed from: n */
    private final int f99918n = 2;

    /* renamed from: o */
    private final int f99919o;

    /* renamed from: p */
    private final int f99920p = 1;

    /* renamed from: a */
    private final void m153474a() {
        this.f99906b.put(this.f99909e, Long.valueOf(System.currentTimeMillis()));
        HashMap<String, Object> hashMap = this.f99906b;
        HashMap<String, Object> hashMap2 = hashMap;
        String str = this.f99910f;
        Object obj = hashMap.get(this.f99909e);
        if (obj != null) {
            long longValue = ((Long) obj).longValue();
            Object obj2 = this.f99906b.get(this.f99908d);
            if (obj2 != null) {
                hashMap2.put(str, Long.valueOf(longValue - ((Long) obj2).longValue()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
    }

    /* renamed from: b */
    private final void m153475b() {
        AbstractC38820a a = C38792a.m153106a();
        JSONObject jSONObject = new JSONObject();
        String str = this.f99908d;
        JSONObject put = jSONObject.put(str, this.f99906b.get(str));
        String str2 = this.f99909e;
        JSONObject put2 = put.put(str2, this.f99906b.get(str2));
        String str3 = this.f99910f;
        JSONObject put3 = put2.put(str3, this.f99906b.get(str3));
        String str4 = this.f99911g;
        JSONObject put4 = put3.put(str4, this.f99906b.get(str4));
        String str5 = this.f99912h;
        JSONObject put5 = put4.put(str5, this.f99906b.get(str5));
        String str6 = this.f99914j;
        JSONObject put6 = put5.put(str6, this.f99906b.get(str6));
        String str7 = this.f99915k;
        JSONObject put7 = put6.put(str7, this.f99906b.get(str7));
        String str8 = this.f99916l;
        JSONObject put8 = put7.put(str8, this.f99906b.get(str8));
        String str9 = this.f99913i;
        a.mo142260a("perf_load_pic", put8.put(str9, this.f99906b.get(str9)));
    }

    /* renamed from: a */
    public final void mo142408a(boolean z) {
        this.f99906b.put(this.f99908d, Long.valueOf(System.currentTimeMillis()));
        int i = this.f99919o;
        if (z) {
            i = this.f99920p;
        }
        this.f99906b.put(this.f99914j, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo142407a(String str, int i, int i2) {
        m153474a();
        this.f99906b.put(this.f99915k, Integer.valueOf(i));
        this.f99906b.put(this.f99916l, Integer.valueOf(i2));
        this.f99906b.put(this.f99911g, Integer.valueOf(this.f99917m));
        m153475b();
    }
}

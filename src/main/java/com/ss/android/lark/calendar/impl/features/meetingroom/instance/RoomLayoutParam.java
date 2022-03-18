package com.ss.android.lark.calendar.impl.features.meetingroom.instance;

import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomLayoutParam;", "", "()V", "dayHeight", "", "getDayHeight", "()I", "dayLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam;", "getDayLayoutParam", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam;", "hourTextWidth", "getHourTextWidth", "mGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "mHeight", "mLayerWidth", "mWidth", "oneHourHeight", "oneMinuteHeight", "", "getOneMinuteHeight", "()F", "timeLayerHeight", "timeLayerMarginTop", "timeLineParam", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;", "getTimeLineParam", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;", "getGridLine", "getHeight", "getLayerHeight", "getLayerWidth", "getScrollMinOffsetY", "getWidth", "update", "", "width", "height", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.e */
public final class RoomLayoutParam {

    /* renamed from: a */
    public int f82101a;

    /* renamed from: b */
    public int f82102b;

    /* renamed from: c */
    public int f82103c;

    /* renamed from: d */
    public C30167c f82104d;

    /* renamed from: e */
    private final int f82105e;

    /* renamed from: f */
    private final int f82106f;

    /* renamed from: g */
    private final int f82107g;

    /* renamed from: h */
    private final int f82108h = UIHelper.dp2px(56.0f);

    /* renamed from: i */
    private final int f82109i;

    /* renamed from: j */
    private final float f82110j;

    /* renamed from: k */
    private final IDayLayoutParam f82111k;

    /* renamed from: l */
    private final ITimeLayoutParam f82112l;

    /* renamed from: a */
    public final int mo117189a() {
        return this.f82108h;
    }

    /* renamed from: b */
    public final int mo117191b() {
        return this.f82109i;
    }

    /* renamed from: c */
    public final float mo117192c() {
        return this.f82110j;
    }

    /* renamed from: d */
    public final int mo117193d() {
        return this.f82101a;
    }

    /* renamed from: e */
    public final int mo117194e() {
        return this.f82102b;
    }

    /* renamed from: f */
    public final int mo117195f() {
        return this.f82103c;
    }

    /* renamed from: g */
    public final int mo117196g() {
        return this.f82102b;
    }

    /* renamed from: h */
    public final C30167c mo117197h() {
        return this.f82104d;
    }

    /* renamed from: j */
    public final IDayLayoutParam mo117199j() {
        return this.f82111k;
    }

    /* renamed from: k */
    public final ITimeLayoutParam mo117200k() {
        return this.f82112l;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomLayoutParam$dayLayoutParam$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam;", "getLayerHeight", "", "getLayerInfo", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam$LayersInfo;", "getLayerWidth", "getLeftMargin", "getShowRect", "Landroid/graphics/Rect;", "getTopMargin", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.e$a */
    public static final class C32127a implements IDayLayoutParam {

        /* renamed from: a */
        final /* synthetic */ RoomLayoutParam f82113a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam
        /* renamed from: d */
        public int mo113326d() {
            return 0;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam
        /* renamed from: a */
        public int mo113323a() {
            return this.f82113a.f82103c;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam
        /* renamed from: b */
        public int mo113324b() {
            return this.f82113a.mo117191b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam
        /* renamed from: c */
        public int mo113325c() {
            return this.f82113a.mo117189a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam
        /* renamed from: e */
        public IDayLayoutParam.LayersInfo mo113327e() {
            return new IDayLayoutParam.LayersInfo(1, 1);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam
        /* renamed from: f */
        public Rect mo113328f() {
            if (this.f82113a.f82101a == 0 || this.f82113a.f82102b == 0) {
                return null;
            }
            return new Rect(this.f82113a.mo117189a(), 0, this.f82113a.f82101a, this.f82113a.f82102b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32127a(RoomLayoutParam eVar) {
            this.f82113a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/RoomLayoutParam$timeLineParam$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/timelayout/ITimeLayoutParam;", "getGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "getHeight", "", "getHourTextWidth", "getShowRect", "Landroid/graphics/Rect;", "getWidth", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.e$b */
    public static final class C32128b implements ITimeLayoutParam {

        /* renamed from: a */
        final /* synthetic */ RoomLayoutParam f82114a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam
        /* renamed from: a */
        public C30167c mo113297a() {
            return this.f82114a.f82104d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam
        /* renamed from: b */
        public int mo113298b() {
            return this.f82114a.mo117189a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam
        /* renamed from: c */
        public int mo113299c() {
            return this.f82114a.f82101a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam
        /* renamed from: d */
        public int mo113300d() {
            return this.f82114a.f82102b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.timelayout.ITimeLayoutParam
        /* renamed from: e */
        public Rect mo113301e() {
            if (this.f82114a.f82101a == 0 || this.f82114a.f82102b == 0) {
                return null;
            }
            return new Rect(0, 0, this.f82114a.f82101a, this.f82114a.f82102b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32128b(RoomLayoutParam eVar) {
            this.f82114a = eVar;
        }
    }

    /* renamed from: i */
    public final int mo117198i() {
        return (-this.f82109i) + this.f82102b;
    }

    public RoomLayoutParam() {
        int dp2px = UIHelper.dp2px(50.0f);
        this.f82105e = dp2px;
        int dp2px2 = UIHelper.dp2px(7.0f);
        this.f82106f = dp2px2;
        this.f82107g = (dp2px * 24) + (dp2px2 * 2);
        this.f82109i = (dp2px * 24) + (dp2px2 * 2);
        this.f82110j = ((float) dp2px) / 60.0f;
        this.f82111k = new C32127a(this);
        this.f82112l = new C32128b(this);
    }

    /* renamed from: a */
    public final void mo117190a(int i, int i2) {
        if (this.f82101a != i || this.f82102b != i2) {
            this.f82101a = i;
            this.f82102b = i2;
            this.f82103c = (i - this.f82108h) / 1;
            this.f82104d = new C30167c.C30168a().mo108787g(1).mo108782b(this.f82107g).mo108780a(this.f82101a - this.f82108h).mo108781a();
        }
    }
}

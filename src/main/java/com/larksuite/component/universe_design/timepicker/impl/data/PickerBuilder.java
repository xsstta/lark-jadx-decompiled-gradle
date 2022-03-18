package com.larksuite.component.universe_design.timepicker.impl.data;

import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001'B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder;", "", "adapter", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "(Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;)V", "getAdapter", "()Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "setAdapter", "isLoop", "", "()Z", "setLoop", "(Z)V", "layoutParams", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder$LayoutParams;", "getLayoutParams", "()Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder$LayoutParams;", "setLayoutParams", "(Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder$LayoutParams;)V", "outerTextSize", "", "getOuterTextSize", "()F", "showTwoFigure", "getShowTwoFigure", "setShowTwoFigure", "textColorCenter", "", "getTextColorCenter", "()I", "setTextColorCenter", "(I)V", "textSize", "getTextSize", "setTextSize", "(F)V", "visibleItemNum", "getVisibleItemNum", "setVisibleItemNum", "LayoutParams", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PickerBuilder {
    private BaseWheelAdapter<?> adapter;
    private boolean isLoop;
    private LayoutParams layoutParams = new LayoutParams();
    private final float outerTextSize = 14.0f;
    private boolean showTwoFigure;
    private int textColorCenter;
    private float textSize = 17.0f;
    private int visibleItemNum = 3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerBuilder$LayoutParams;", "", "()V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "leftMargin", "getLeftMargin", "setLeftMargin", "rightMargin", "getRightMargin", "setRightMargin", "weight", "", "getWeight", "()F", "setWeight", "(F)V", "width", "getWidth", "setWidth", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.data.PickerBuilder$a */
    public static final class LayoutParams {

        /* renamed from: a */
        private int f63733a;

        /* renamed from: b */
        private int f63734b = -2;

        /* renamed from: c */
        private float f63735c = 1.0f;

        /* renamed from: d */
        private int f63736d;

        /* renamed from: e */
        private int f63737e;

        /* renamed from: a */
        public final int mo91593a() {
            return this.f63733a;
        }

        /* renamed from: b */
        public final int mo91595b() {
            return this.f63734b;
        }

        /* renamed from: c */
        public final float mo91596c() {
            return this.f63735c;
        }

        /* renamed from: d */
        public final int mo91597d() {
            return this.f63736d;
        }

        /* renamed from: e */
        public final int mo91598e() {
            return this.f63737e;
        }

        /* renamed from: a */
        public final void mo91594a(float f) {
            this.f63735c = f;
        }
    }

    public final BaseWheelAdapter<?> getAdapter() {
        return this.adapter;
    }

    public final LayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    public final float getOuterTextSize() {
        return this.outerTextSize;
    }

    public final boolean getShowTwoFigure() {
        return this.showTwoFigure;
    }

    public final int getTextColorCenter() {
        return this.textColorCenter;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final int getVisibleItemNum() {
        return this.visibleItemNum;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setShowTwoFigure(boolean z) {
        this.showTwoFigure = z;
    }

    public final void setTextColorCenter(int i) {
        this.textColorCenter = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setVisibleItemNum(int i) {
        this.visibleItemNum = i;
    }

    public final void setAdapter(BaseWheelAdapter<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.adapter = aVar;
    }

    public final void setLayoutParams(LayoutParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.layoutParams = aVar;
    }

    public PickerBuilder(BaseWheelAdapter<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "adapter");
        this.adapter = aVar;
    }
}

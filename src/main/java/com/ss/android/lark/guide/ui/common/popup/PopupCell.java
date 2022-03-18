package com.ss.android.lark.guide.ui.common.popup;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J \u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/PopupCell;", "Lcom/ss/android/lark/guide/ui/common/popup/IPopupCell;", "component", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "(Lcom/ss/android/lark/guide/ui/common/popup/Component;)V", "computePopupCoordinate", "Landroid/graphics/Point;", "containerView", "Landroid/widget/LinearLayout;", "containerWH", "Landroid/util/Size;", "anchorRect", "Landroid/graphics/Rect;", "getCenterPoint", "rect", "gravity", "", "onAlignChanged", "", "offset", "onCreateView", "context", "Landroid/content/Context;", "guide", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "Companion", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.popup.i */
public final class PopupCell implements IPopupCell {

    /* renamed from: a */
    public static final Companion f99487a = new Companion(null);

    /* renamed from: b */
    private final Component f99488b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/PopupCell$Companion;", "", "()V", "from", "Lcom/ss/android/lark/guide/ui/common/popup/PopupCell;", "component", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PopupCell mo141733a(Component bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "component");
            return new PopupCell(bVar);
        }
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.IPopupCell
    /* renamed from: a */
    public int mo141729a() {
        int a = this.f99488b.mo141300a();
        if (a == 1) {
            return 3;
        }
        if (a == 2) {
            return 48;
        }
        if (a == 3) {
            return 5;
        }
        if (a != 4) {
            return 0;
        }
        return 80;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"calX", "", "fit", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.i$b */
    static final class C38692b extends Lambda implements Function1<Integer, Integer> {
        final /* synthetic */ Rect $anchorRect;
        final /* synthetic */ Size $containerWH;
        final /* synthetic */ int $mainOffset;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38692b(Rect rect, int i, Size size) {
            super(1);
            this.$anchorRect = rect;
            this.$mainOffset = i;
            this.$containerWH = size;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(invoke(num.intValue()));
        }

        public final int invoke(int i) {
            int i2;
            int i3;
            if (i == 16) {
                i2 = this.$anchorRect.left;
                i3 = this.$mainOffset;
            } else if (i == 32) {
                i2 = this.$anchorRect.left + this.$mainOffset;
                i3 = ((this.$anchorRect.right - this.$anchorRect.left) - this.$containerWH.getWidth()) / 2;
            } else if (i != 48) {
                i2 = this.$anchorRect.left;
                i3 = this.$mainOffset;
            } else {
                i2 = this.$anchorRect.left + this.$mainOffset;
                i3 = (this.$anchorRect.right - this.$anchorRect.left) - this.$containerWH.getWidth();
            }
            return i2 + i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"calY", "", "fit", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.popup.i$c */
    static final class C38693c extends Lambda implements Function1<Integer, Integer> {
        final /* synthetic */ Rect $anchorRect;
        final /* synthetic */ Size $containerWH;
        final /* synthetic */ int $mainOffset;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38693c(Rect rect, int i, Size size) {
            super(1);
            this.$anchorRect = rect;
            this.$mainOffset = i;
            this.$containerWH = size;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(invoke(num.intValue()));
        }

        public final int invoke(int i) {
            int i2;
            int i3;
            if (i == 16) {
                i2 = this.$anchorRect.top;
                i3 = this.$mainOffset;
            } else if (i == 32) {
                i2 = this.$anchorRect.top + this.$mainOffset;
                i3 = ((this.$anchorRect.bottom - this.$anchorRect.top) - this.$containerWH.getHeight()) / 2;
            } else if (i != 48) {
                i2 = this.$anchorRect.top;
                i3 = this.$mainOffset;
            } else {
                i2 = this.$anchorRect.top + this.$mainOffset;
                i3 = (this.$anchorRect.bottom - this.$anchorRect.top) - this.$containerWH.getHeight();
            }
            return i2 + i3;
        }
    }

    public PopupCell(Component bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "component");
        this.f99488b = bVar;
    }

    /* renamed from: a */
    private final Point m152756a(Rect rect) {
        Point point = new Point();
        point.x = (rect.left + rect.right) / 2;
        point.y = (rect.top + rect.bottom) / 2;
        return point;
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.IPopupCell
    /* renamed from: a */
    public void mo141731a(LinearLayout linearLayout, Size size, int i) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        this.f99488b.mo141303a(linearLayout, size, i);
    }

    @Override // com.ss.android.lark.guide.ui.common.popup.IPopupCell
    /* renamed from: a */
    public void mo141730a(Context context, LinearLayout linearLayout, IGuide fVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "guide");
        this.f99488b.mo141302a(context, linearLayout, fVar);
    }

    /* renamed from: a */
    public Point mo141732a(LinearLayout linearLayout, Size size, Rect rect) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "containerView");
        Intrinsics.checkParameterIsNotNull(size, "containerWH");
        Intrinsics.checkParameterIsNotNull(rect, "anchorRect");
        int a = this.f99488b.mo141300a();
        int b = this.f99488b.mo141304b();
        int a2 = this.f99488b.mo141301a(linearLayout, size, rect);
        int b2 = this.f99488b.mo141305b(linearLayout, size, rect);
        C38692b bVar = new C38692b(rect, a2, size);
        C38693c cVar = new C38693c(rect, a2, size);
        Point point = new Point();
        if (a == 1) {
            int invoke = cVar.invoke(b);
            point.x = (rect.left - size.getWidth()) - b2;
            point.y = invoke;
        } else if (a == 2) {
            point.x = bVar.invoke(b);
            point.y = (rect.top - size.getHeight()) - b2;
        } else if (a == 3) {
            int invoke2 = cVar.invoke(b);
            point.x = rect.right + b2;
            point.y = invoke2;
        } else if (a == 4) {
            point.x = bVar.invoke(b);
            point.y = rect.bottom + b2;
        } else if (a != 5) {
            m152756a(rect);
        } else {
            point.x = ((rect.left + rect.right) / 2) + a2;
            point.y = ((rect.top + rect.bottom) / 2) + b2;
        }
        return point;
    }
}

package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewParent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ignition.widget.message_card_header.MessageCardHeaderDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.drawable.GroupDrawable;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J@\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J8\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J@\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/utils/MsgBubbleUtil;", "", "()V", "generateMessageCardHeader", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "headerColorType", "", "groupMode", "isRTL", "", "getBubbleDrawable", "view", "Landroid/view/View;", "colorType", "isTop", "gradientColor", "", "getY", "target", "refView", "setBgForMsgBubble", "", "bubbleColor", "headerView", "GroupMode", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MsgBubbleUtil {

    /* renamed from: a */
    public static final MsgBubbleUtil f88655a = new MsgBubbleUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/utils/MsgBubbleUtil$GroupMode;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface GroupMode {
        public static final Companion Companion = Companion.f88656a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chat/utils/MsgBubbleUtil$GroupMode$Companion;", "", "()V", "ALONE", "", "BOTTOM", "MIDDLE", "TOP", GrsBaseInfo.CountryCodeSource.UNKNOWN, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.utils.MsgBubbleUtil$GroupMode$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f88656a = new Companion();

            private Companion() {
            }
        }
    }

    private MsgBubbleUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/utils/MsgBubbleUtil$setBgForMsgBubble$groupDrawable$1", "Lcom/ss/android/lark/chat/drawable/GroupDrawable$DivideYProvider;", "getDivideY", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.utils.MsgBubbleUtil$a */
    public static final class C34329a implements GroupDrawable.DivideYProvider {

        /* renamed from: a */
        final /* synthetic */ View f88657a;

        /* renamed from: b */
        final /* synthetic */ View f88658b;

        @Override // com.ss.android.lark.chat.drawable.GroupDrawable.DivideYProvider
        /* renamed from: a */
        public float mo121501a() {
            int i;
            if (this.f88657a != null) {
                i = MsgBubbleUtil.f88655a.mo126907a(this.f88657a, this.f88658b) + this.f88657a.getHeight();
            } else {
                i = UIUtils.dp2px(this.f88658b.getContext(), 20.0f);
            }
            return (float) i;
        }

        C34329a(View view, View view2) {
            this.f88657a = view;
            this.f88658b = view2;
        }
    }

    /* renamed from: a */
    public final int mo126907a(View view, View view2) {
        if (view == view2 || view2 == null || view == null) {
            return 0;
        }
        int y = (int) view.getY();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return y + mo126907a((View) parent, view2);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    private final Drawable m133100a(Context context, @BubbleStyle.ColorType int i, @GroupMode int i2, boolean z) {
        int i3;
        float f;
        MessageCardHeaderDrawable aVar = new MessageCardHeaderDrawable();
        int i4 = R.color.udtoken_message_card_bg_neutral;
        switch (i) {
            case 101:
                i4 = R.color.udtoken_message_card_bg_blue;
                break;
            case 102:
                i4 = R.color.udtoken_message_card_bg_wathet;
                break;
            case 103:
                i4 = R.color.udtoken_message_card_bg_turquoise;
                break;
            case 104:
                i4 = R.color.udtoken_message_card_bg_green;
                break;
            case LocationRequest.PRIORITY_NO_POWER:
                i4 = R.color.udtoken_message_card_bg_lime;
                break;
            case 106:
                i4 = R.color.udtoken_message_card_bg_yellow;
                break;
            case ActivityIdentificationData.WALKING:
                i4 = R.color.udtoken_message_card_bg_orange;
                break;
            case 108:
                i4 = R.color.udtoken_message_card_bg_red;
                break;
            case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                i4 = R.color.udtoken_message_card_bg_carmine;
                break;
            case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                i4 = R.color.udtoken_message_card_bg_violet;
                break;
            case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                i4 = R.color.udtoken_message_card_bg_purple;
                break;
            case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                i4 = R.color.udtoken_message_card_bg_indigo;
                break;
        }
        aVar.setColor(UDColorUtils.getColor(context, i4));
        if (i != 100) {
            i3 = R.color.udtoken_message_card_bg_mask_general;
        } else {
            i3 = R.color.udtoken_message_card_bg_mask_special;
        }
        aVar.mo87034a(UDColorUtils.getColor(context, i3));
        aVar.mo87033a(DeviceUtils.getScreenDensity(context));
        float a = UDDimenUtils.m93307a(context, 10.0f);
        float a2 = UDDimenUtils.m93307a(context, 2.0f);
        if ((i2 == 2 || i2 == 3) && !z) {
            f = a2;
        } else {
            f = a;
        }
        if ((i2 == 2 || i2 == 3) && z) {
            a = a2;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(UIHelper.dp2px(1.0f), UDColorUtils.getColor(context, R.color.imtoken_message_card_border));
        gradientDrawable.setCornerRadii(new float[]{f, f, a, a, 0.0f, 0.0f, 0.0f, 0.0f});
        return new LayerDrawable(new Drawable[]{aVar, new InsetDrawable((Drawable) gradientDrawable, 0, 0, 0, -2)});
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m133102a(View view, @BubbleStyle.ColorType int i, View view2, @GroupMode int i2, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m133103a(view, i, view2, i2, iArr, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x016f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.drawable.Drawable m133101a(android.view.View r20, @com.ss.android.lark.chat.export.ui.message.style.BubbleStyle.ColorType int r21, boolean r22, @com.ss.android.lark.chat.utils.MsgBubbleUtil.GroupMode int r23, int[] r24, boolean r25) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.MsgBubbleUtil.m133101a(android.view.View, int, boolean, int, int[], boolean):android.graphics.drawable.Drawable");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m133103a(View view, @BubbleStyle.ColorType int i, View view2, @GroupMode int i2, int[] iArr, boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (i == 3) {
            MsgBubbleUtil msgBubbleUtil = f88655a;
            drawable2 = msgBubbleUtil.m133101a(view, 8, true, i2, (int[]) null, z);
            drawable = msgBubbleUtil.m133101a(view, 2, false, i2, (int[]) null, z);
        } else if (i != 4) {
            if (i == 6) {
                MsgBubbleUtil msgBubbleUtil2 = f88655a;
                drawable4 = msgBubbleUtil2.m133101a(view, i, true, i2, iArr, z);
                drawable3 = msgBubbleUtil2.m133101a(view, 2, false, i2, (int[]) null, z);
            } else if (i == 11) {
                MsgBubbleUtil msgBubbleUtil3 = f88655a;
                drawable4 = msgBubbleUtil3.m133101a(view, i, true, i2, iArr, z);
                drawable3 = msgBubbleUtil3.m133101a(view, 10, false, i2, (int[]) null, z);
            } else if (i == 13) {
                MsgBubbleUtil msgBubbleUtil4 = f88655a;
                drawable4 = msgBubbleUtil4.m133101a(view, i, true, i2, iArr, z);
                drawable3 = msgBubbleUtil4.m133101a(view, 12, false, i2, (int[]) null, z);
            } else if (i != 14) {
                switch (i) {
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case LocationRequest.PRIORITY_NO_POWER:
                    case 106:
                    case ActivityIdentificationData.WALKING:
                    case 108:
                    case SmEvents.EVENT_NR /*{ENCODED_INT: 109}*/:
                    case SmEvents.EVENT_NO /*{ENCODED_INT: 110}*/:
                    case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                    case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                        MsgBubbleUtil msgBubbleUtil5 = f88655a;
                        Context context = view.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                        drawable2 = msgBubbleUtil5.m133100a(context, i, i2, z);
                        drawable = msgBubbleUtil5.m133101a(view, 12, false, i2, (int[]) null, z);
                        break;
                    default:
                        MsgBubbleUtil msgBubbleUtil6 = f88655a;
                        drawable2 = msgBubbleUtil6.m133101a(view, i, true, i2, (int[]) null, z);
                        if (i == 0 && view2 != null) {
                            drawable = msgBubbleUtil6.m133101a(view, 2, false, i2, (int[]) null, z);
                            break;
                        } else {
                            drawable = msgBubbleUtil6.m133101a(view, i, false, i2, (int[]) null, z);
                            break;
                        }
                }
            } else {
                MsgBubbleUtil msgBubbleUtil7 = f88655a;
                drawable2 = msgBubbleUtil7.m133101a(view, 15, true, i2, (int[]) null, z);
                drawable = msgBubbleUtil7.m133101a(view, 12, false, i2, (int[]) null, z);
            }
            drawable2 = drawable4;
            drawable = drawable3;
        } else {
            MsgBubbleUtil msgBubbleUtil8 = f88655a;
            drawable2 = msgBubbleUtil8.m133101a(view, 7, true, i2, (int[]) null, z);
            drawable = msgBubbleUtil8.m133101a(view, 2, false, i2, (int[]) null, z);
        }
        view.setBackground(new GroupDrawable(drawable2, drawable, new C34329a(view2, view)));
    }
}

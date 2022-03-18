package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.VirtualYogaLayout;
import com.facebook.yoga.android.YogaLayout;
import com.larksuite.framework.flyfish.FlyFishYogaLayout;
import com.larksuite.framework.utils.C26254af;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J(\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010H\u0002J\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u000eJ\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0015\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/message/card/view/richtext/YogaLayoutHolder;", "", "context", "Landroid/content/Context;", "asyncMeasureEnable", "", "(Landroid/content/Context;Z)V", "(Landroid/content/Context;)V", "mAsynMeasureEnable", "mContext", "mVirtualYogaLayout", "Lcom/facebook/yoga/android/VirtualYogaLayout;", "mVirtualYogaNodes", "Ljava/util/HashMap;", "Landroid/view/View;", "Lcom/facebook/yoga/YogaNode;", "Lkotlin/collections/HashMap;", "mYogaLayout", "Lcom/facebook/yoga/android/YogaLayout;", "addChildView", "", "child", "getContentView", "Landroid/view/ViewGroup;", "getVirtualYogaNodes", "getYogaNode", "getYogaNodeForView", "view", "initIfNeed", "newYogaLayout", "setBackgroundColor", "bgColor", "", "(Ljava/lang/Integer;)V", "setYogaLayout", "yogaLayout", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.card.view.richtext.f */
public final class YogaLayoutHolder {

    /* renamed from: a */
    private final Context f114923a;

    /* renamed from: b */
    private YogaLayout f114924b;

    /* renamed from: c */
    private VirtualYogaLayout f114925c;

    /* renamed from: d */
    private HashMap<View, YogaNode> f114926d;

    /* renamed from: e */
    private boolean f114927e;

    /* renamed from: a */
    public final ViewGroup mo160202a() {
        ViewGroup viewGroup = this.f114924b;
        if (viewGroup == null) {
            viewGroup = this.f114925c;
        }
        return viewGroup;
    }

    /* renamed from: c */
    private final HashMap<View, YogaNode> m180192c() {
        VirtualYogaLayout virtualYogaLayout;
        if (this.f114926d == null && (virtualYogaLayout = this.f114925c) != null) {
            this.f114926d = (HashMap) C26254af.m95008b(virtualYogaLayout, "mYogaNodes");
        }
        return this.f114926d;
    }

    /* renamed from: b */
    public final YogaNode mo160206b() {
        YogaLayout yogaLayout = this.f114924b;
        if (yogaLayout == null) {
            VirtualYogaLayout virtualYogaLayout = this.f114925c;
            if (virtualYogaLayout != null) {
                return virtualYogaLayout.getYogaNode();
            }
            return null;
        } else if (yogaLayout != null) {
            return yogaLayout.getYogaNode();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo160204a(YogaLayout yogaLayout) {
        Intrinsics.checkParameterIsNotNull(yogaLayout, "yogaLayout");
        this.f114924b = yogaLayout;
    }

    public YogaLayoutHolder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f114923a = context;
    }

    /* renamed from: a */
    private final YogaLayout m180191a(Context context) {
        if (this.f114927e) {
            return new FlyFishYogaLayout(context, null, 0, 6, null);
        }
        return new YogaLayout(context);
    }

    /* renamed from: a */
    public final void mo160203a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        m180193c(view);
        ViewGroup a = mo160202a();
        if (a != null) {
            a.addView(view);
        }
    }

    /* renamed from: b */
    public final YogaNode mo160207b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        YogaLayout yogaLayout = this.f114924b;
        if (yogaLayout == null) {
            HashMap<View, YogaNode> c = m180192c();
            if (c != null) {
                return c.get(view);
            }
            return null;
        } else if (yogaLayout != null) {
            return yogaLayout.getYogaNodeForView(view);
        } else {
            return null;
        }
    }

    /* renamed from: c */
    private final void m180193c(View view) {
        YogaNode yogaNode;
        boolean z = view instanceof YogaLayout;
        if (z && this.f114925c != null) {
            YogaLayout a = m180191a(this.f114923a);
            VirtualYogaLayout virtualYogaLayout = this.f114925c;
            VirtualYogaLayout virtualYogaLayout2 = virtualYogaLayout;
            if (virtualYogaLayout != null) {
                yogaNode = virtualYogaLayout.getYogaNode();
            } else {
                yogaNode = null;
            }
            a.addView(virtualYogaLayout2, yogaNode);
            this.f114925c = null;
            this.f114924b = a;
        } else if (this.f114924b != null || this.f114925c != null) {
        } else {
            if (z) {
                this.f114924b = m180191a(this.f114923a);
            } else {
                this.f114925c = new VirtualYogaLayout(this.f114923a);
            }
        }
    }

    /* renamed from: a */
    public final void mo160205a(Integer num) {
        if (num != null && num.intValue() != 0) {
            if (this.f114924b == null) {
                this.f114924b = m180191a(this.f114923a);
            }
            YogaLayout yogaLayout = this.f114924b;
            if (yogaLayout != null) {
                yogaLayout.setBackgroundColor(num.intValue());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YogaLayoutHolder(Context context, boolean z) {
        this(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f114927e = z;
    }
}

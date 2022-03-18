package com.ss.android.lark.mm.module.player.speed.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\tH\u0014J\b\u0010\u000e\u001a\u00020\tH\u0014J\b\u0010\u000f\u001a\u00020\tH\u0014J\b\u0010\u0010\u001a\u00020\tH\u0014J\b\u0010\u0011\u001a\u00020\tH\u0014¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/view/PodCastSpeedItem;", "Lcom/ss/android/lark/mm/module/player/speed/view/SpeedItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getLargeImageResource", "getMiddleImageResource", "getNormalColor", "getSelectedColor", "getSmallImageResource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PodCastSpeedItem extends SpeedItem {

    /* renamed from: c */
    private HashMap f117532c;

    @Override // com.ss.android.lark.mm.module.player.speed.view.SpeedItem
    /* renamed from: a */
    public View mo164107a(int i) {
        if (this.f117532c == null) {
            this.f117532c = new HashMap();
        }
        View view = (View) this.f117532c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117532c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.player.speed.view.SpeedItem
    public int getLargeImageResource() {
        return R.drawable.mm_pod_cast_speed_item_bar_large;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.player.speed.view.SpeedItem
    public int getMiddleImageResource() {
        return R.drawable.mm_pod_cast_speed_item_bar_middle;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.player.speed.view.SpeedItem
    public int getSmallImageResource() {
        return R.drawable.mm_pod_cast_speed_item_bar_small;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.player.speed.view.SpeedItem
    public int getNormalColor() {
        return Color.parseColor("#4DFFFFFF");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.player.speed.view.SpeedItem
    public int getSelectedColor() {
        return Color.parseColor("#FFFFFF");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PodCastSpeedItem(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PodCastSpeedItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PodCastSpeedItem(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PodCastSpeedItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}

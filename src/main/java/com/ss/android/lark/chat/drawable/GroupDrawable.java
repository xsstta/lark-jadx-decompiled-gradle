package com.ss.android.lark.chat.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/drawable/GroupDrawable;", "Landroid/graphics/drawable/Drawable;", "mTopDrawable", "mBottomDrawable", "mDivideYProvider", "Lcom/ss/android/lark/chat/drawable/GroupDrawable$DivideYProvider;", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcom/ss/android/lark/chat/drawable/GroupDrawable$DivideYProvider;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "DivideYProvider", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.b.a */
public final class GroupDrawable extends Drawable {

    /* renamed from: a */
    private final Drawable f84566a;

    /* renamed from: b */
    private final Drawable f84567b;

    /* renamed from: c */
    private final DivideYProvider f84568c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chat/drawable/GroupDrawable$DivideYProvider;", "", "getDivideY", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.b.a$a */
    public interface DivideYProvider {
        /* renamed from: a */
        float mo121501a();
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        float a = this.f84568c.mo121501a();
        Drawable drawable = this.f84566a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getBounds().width(), (int) a);
        }
        Drawable drawable2 = this.f84566a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (this.f84567b != null) {
            canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, a);
            this.f84567b.setBounds(0, 0, getBounds().width(), getBounds().height() - ((int) a));
            this.f84567b.draw(canvas);
            canvas.restore();
        }
    }

    public GroupDrawable(Drawable drawable, Drawable drawable2, DivideYProvider aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mDivideYProvider");
        this.f84566a = drawable;
        this.f84567b = drawable2;
        this.f84568c = aVar;
    }
}

package com.larksuite.component.decoration.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.PassThroughImage;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u001a\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ,\u0010\u001e\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001f*\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u0002H\u001f0\"H\b¢\u0006\u0002\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006%"}, d2 = {"Lcom/larksuite/component/decoration/avatar/DecoratedAvatar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avatarView", "Landroid/widget/ImageView;", "getAvatarView", "()Landroid/widget/ImageView;", "setAvatarView", "(Landroid/widget/ImageView;)V", "decorationElevation", "", "decorationView", "getDecorationView", "setDecorationView", "addAvatarView", "", "clearDecoration", "initAvatarView", "initDecorationView", "loadPassThroughDecoration", "imageKey", "", "fsUnit", "loadSdkDecoration", "use", "R", "Landroid/content/res/TypedArray;", "block", "Lkotlin/Function1;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "avatar-decoration_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DecoratedAvatar extends FrameLayout {

    /* renamed from: a */
    public static final Companion f59722a = new Companion(null);

    /* renamed from: b */
    private ImageView f59723b;

    /* renamed from: c */
    private ImageView f59724c;

    /* renamed from: d */
    private final float f59725d;

    public DecoratedAvatar(Context context) {
        this(context, null, 0, 6, null);
    }

    public DecoratedAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/decoration/avatar/DecoratedAvatar$Companion;", "", "()V", "decorationExtendRatio", "", "avatar-decoration_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.decoration.avatar.DecoratedAvatar$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ImageView getAvatarView() {
        return this.f59724c;
    }

    public final ImageView getDecorationView() {
        return this.f59723b;
    }

    /* renamed from: a */
    public final void mo86669a() {
        ImageView imageView = this.f59723b;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
    }

    /* renamed from: b */
    private final void m88200b() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setElevation(this.f59725d);
        this.f59723b = imageView;
        addView(imageView);
    }

    /* renamed from: a */
    public final void mo86670a(ImageView imageView) {
        m88201b(imageView);
    }

    public final void setAvatarView(ImageView imageView) {
        this.f59724c = imageView;
    }

    public final void setDecorationView(ImageView imageView) {
        this.f59723b = imageView;
    }

    /* renamed from: b */
    private final void m88201b(ImageView imageView) {
        if (imageView != null) {
            ImageView imageView2 = this.f59724c;
            if (imageView2 != null) {
                removeView(imageView2);
            }
            imageView.getParent();
            this.f59724c = imageView;
            addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: a */
    public final void mo86671a(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                ImageLoader.with(getContext()).load(new C38824b(str)).override(getMeasuredWidth(), getMeasuredHeight()).into(this.f59723b);
            }
        }
    }

    /* renamed from: a */
    public final void mo86672a(String str, String str2) {
        boolean z;
        String str3;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str3 = str;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                ImageLoader.with(getContext()).load(new PassThroughImage(str, str2)).override(getMeasuredWidth(), getMeasuredHeight()).into(this.f59723b);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecoratedAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f59725d = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.decoratedAvatar_avatarLayout}, i, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "arr");
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (-1 != resourceId) {
            View inflate = LayoutInflater.from(context).inflate(resourceId, (ViewGroup) this, false);
            if (inflate != null) {
                mo86670a((ImageView) inflate);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
            }
        }
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
        m88200b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DecoratedAvatar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

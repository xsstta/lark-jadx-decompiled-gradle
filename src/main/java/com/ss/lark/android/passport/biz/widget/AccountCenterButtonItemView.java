package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/AccountCenterButtonItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "btnImg", "Landroid/widget/ImageView;", "tvText", "Landroid/widget/TextView;", "setImg", "", ShareHitPoint.f121869d, "", "setText", "text", "", "ButtonType", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AccountCenterButtonItemView extends RelativeLayout {

    /* renamed from: a */
    private TextView f164319a;

    /* renamed from: b */
    private ImageView f164320b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/AccountCenterButtonItemView$ButtonType;", "", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ButtonType {
        public static final Companion Companion = Companion.f164321a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/AccountCenterButtonItemView$ButtonType$Companion;", "", "()V", "CREATE_TEAM", "", "JOIN_TEAM", "PERSONAL", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.widget.AccountCenterButtonItemView$ButtonType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f164321a = new Companion();

            private Companion() {
            }
        }
    }

    public final void setText(String str) {
        boolean z;
        TextView textView;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (textView = this.f164319a) != null) {
            textView.setText(str2);
        }
    }

    public AccountCenterButtonItemView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_center_button_item, (ViewGroup) this, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…_button_item, this, true)");
        this.f164319a = (TextView) inflate.findViewById(R.id.tv_dispatch_btn);
        this.f164320b = (ImageView) inflate.findViewById(R.id.img_dispatch_btn);
    }

    public final void setImg(int i) {
        ImageView imageView = this.f164320b;
        if (imageView == null) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && imageView != null) {
                    imageView.setImageResource(R.drawable.ic_svg_personal);
                }
            } else if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_svg_create_team);
            }
        } else if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_svg_join_team);
        }
    }
}

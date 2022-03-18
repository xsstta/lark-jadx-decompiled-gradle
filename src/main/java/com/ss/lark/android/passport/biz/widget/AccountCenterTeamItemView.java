package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.lark.android.passport.biz.entity.UserItem;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/AccountCenterTeamItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "image", "Landroid/widget/ImageView;", "imgRight", "tvAppeal", "Landroid/widget/TextView;", "tvName", "tvStatus", "tvTitle", "setAppealOnClickListener", "", "listener", "Landroid/view/View$OnClickListener;", "setData", "title", "", "name", "setImage", "img", "Landroid/graphics/Bitmap;", "setMaxLines", "line", "", "setName", "setStatus", "userItem", "Lcom/ss/lark/android/passport/biz/entity/UserItem;", "setTitle", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.widget.a */
public final class AccountCenterTeamItemView extends ConstraintLayout {

    /* renamed from: a */
    private ImageView f164410a;

    /* renamed from: b */
    private TextView f164411b;

    /* renamed from: c */
    private TextView f164412c;

    /* renamed from: d */
    private TextView f164413d;

    /* renamed from: e */
    private TextView f164414e;

    /* renamed from: f */
    private ImageView f164415f;

    private final void setTitle(String str) {
        TextView textView = this.f164411b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setAppealOnClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        TextView textView = this.f164414e;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setImage(Bitmap bitmap) {
        ImageView imageView;
        if (bitmap != null && (imageView = this.f164410a) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    private final void setName(String str) {
        TextView textView = this.f164412c;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f164412c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    public final void setMaxLines(int i) {
        TextView textView = this.f164411b;
        if (textView != null) {
            textView.setMaxLines(i);
        }
        TextView textView2 = this.f164411b;
        if (textView2 != null) {
            textView2.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountCenterTeamItemView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_center_team_item, (ViewGroup) this, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…er_team_item, this, true)");
        this.f164410a = (ImageView) inflate.findViewById(R.id.img);
        this.f164411b = (TextView) inflate.findViewById(R.id.tv_title);
        this.f164412c = (TextView) inflate.findViewById(R.id.tv_name);
        this.f164413d = (TextView) inflate.findViewById(R.id.tv_status);
        this.f164414e = (TextView) inflate.findViewById(R.id.tvAppeal);
        this.f164415f = (ImageView) inflate.findViewById(R.id.img_right);
    }

    public final void setStatus(UserItem userItem) {
        boolean z;
        Integer num;
        Intrinsics.checkParameterIsNotNull(userItem, "userItem");
        TextView textView = this.f164413d;
        if (textView != null) {
            textView.setText(userItem.tagDesc);
        }
        TextView textView2 = this.f164413d;
        int i = 0;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (userItem.user != null) {
            User user = userItem.user;
            if (user == null || user.getStatus() != 1 || userItem.button == null) {
                z = false;
            } else {
                z = true;
            }
            User user2 = userItem.user;
            String str = null;
            if (user2 != null) {
                num = Integer.valueOf(user2.getStatus());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                ImageView imageView = this.f164415f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                TextView textView3 = this.f164414e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.f164413d;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            } else if (num != null && num.intValue() == 1) {
                TextView textView5 = this.f164413d;
                if (textView5 != null) {
                    textView5.setTextColor(getResources().getColor(R.color.function_danger_600));
                }
                TextView textView6 = this.f164413d;
                if (textView6 != null) {
                    textView6.setBackground(getResources().getDrawable(R.drawable.signin_sdk_user_status_bg_forbidden));
                }
                ImageView imageView2 = this.f164415f;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                TextView textView7 = this.f164414e;
                if (textView7 != null) {
                    if (!z) {
                        i = 8;
                    }
                    textView7.setVisibility(i);
                }
                TextView textView8 = this.f164414e;
                if (textView8 != null) {
                    ButtonInfo buttonInfo = userItem.button;
                    if (buttonInfo != null) {
                        str = buttonInfo.text;
                    }
                    textView8.setText(str);
                }
            } else if (num != null && num.intValue() == 2) {
                TextView textView9 = this.f164413d;
                if (textView9 != null) {
                    textView9.setTextColor(getResources().getColor(R.color.text_caption));
                }
                TextView textView10 = this.f164413d;
                if (textView10 != null) {
                    textView10.setBackground(getResources().getDrawable(R.drawable.signin_sdk_user_status_bg_disable));
                }
                ImageView imageView3 = this.f164415f;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                TextView textView11 = this.f164414e;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
            } else if (num != null && num.intValue() == 3) {
                TextView textView12 = this.f164413d;
                if (textView12 != null) {
                    textView12.setTextColor(getResources().getColor(R.color.primary_pri_600));
                }
                TextView textView13 = this.f164413d;
                if (textView13 != null) {
                    textView13.setBackground(getResources().getDrawable(R.drawable.signin_sdk_user_status_bg_inactive));
                }
                ImageView imageView4 = this.f164415f;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                }
                TextView textView14 = this.f164414e;
                if (textView14 != null) {
                    textView14.setVisibility(8);
                }
            } else if (num != null && num.intValue() == 4) {
                ImageView imageView5 = this.f164415f;
                if (imageView5 != null) {
                    imageView5.setVisibility(8);
                }
                TextView textView15 = this.f164414e;
                if (textView15 != null) {
                    textView15.setVisibility(8);
                }
            } else if (num != null && num.intValue() == 5) {
                TextView textView16 = this.f164413d;
                if (textView16 != null) {
                    textView16.setTextColor(getResources().getColor(R.color.udtoken_tag_text_s_blue));
                }
                TextView textView17 = this.f164413d;
                if (textView17 != null) {
                    textView17.setBackground(getResources().getDrawable(R.drawable.signin_sdk_user_status_bg_pending));
                }
                ImageView imageView6 = this.f164415f;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
                TextView textView18 = this.f164414e;
                if (textView18 != null) {
                    textView18.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo224639a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        setTitle(str);
        ViewGroup.LayoutParams layoutParams = null;
        if (str2 != null) {
            setName(str2);
            TextView textView = this.f164411b;
            if (textView != null) {
                layoutParams = textView.getLayoutParams();
            }
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.f2819k = -1;
                layoutParams2.f2816h = R.id.img;
                TextView textView2 = this.f164411b;
                if (textView2 != null) {
                    textView2.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        TextView textView3 = this.f164411b;
        if (textView3 != null) {
            layoutParams = textView3.getLayoutParams();
        }
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams3.f2819k = R.id.container;
            layoutParams3.f2816h = R.id.container;
            TextView textView4 = this.f164411b;
            if (textView4 != null) {
                textView4.setLayoutParams(layoutParams3);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}

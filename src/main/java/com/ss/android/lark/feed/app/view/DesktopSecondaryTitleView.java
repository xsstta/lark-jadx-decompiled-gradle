package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0012R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/ss/android/lark/feed/app/view/DesktopSecondaryTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBackBT", "Landroid/view/ViewGroup;", "getMBackBT", "()Landroid/view/ViewGroup;", "setMBackBT", "(Landroid/view/ViewGroup;)V", "mBackListener", "Lcom/ss/android/lark/feed/app/view/DesktopSecondaryTitleView$OnClickBackListener;", "mRightLabel", "Landroid/widget/TextView;", "getMRightLabel", "()Landroid/widget/TextView;", "setMRightLabel", "(Landroid/widget/TextView;)V", "setLabelText", "", "text", "", "setOnBackListener", "listener", "OnClickBackListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DesktopSecondaryTitleView extends ConstraintLayout {

    /* renamed from: a */
    public OnClickBackListener f97259a;
    @BindView(6166)
    public ViewGroup mBackBT;
    @BindView(6527)
    public TextView mRightLabel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/feed/app/view/DesktopSecondaryTitleView$OnClickBackListener;", "", "onClickBack", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView$a */
    public interface OnClickBackListener {
        /* renamed from: a */
        void mo137378a();
    }

    public final ViewGroup getMBackBT() {
        ViewGroup viewGroup = this.mBackBT;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackBT");
        }
        return viewGroup;
    }

    public final TextView getMRightLabel() {
        TextView textView = this.mRightLabel;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightLabel");
        }
        return textView;
    }

    public DesktopSecondaryTitleView(Context context) {
        this(context, null);
    }

    public final void setMBackBT(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "<set-?>");
        this.mBackBT = viewGroup;
    }

    public final void setMRightLabel(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.mRightLabel = textView;
    }

    public final void setOnBackListener(OnClickBackListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f97259a = aVar;
    }

    public final void setLabelText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        TextView textView = this.mRightLabel;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightLabel");
        }
        textView.setText(str);
    }

    public DesktopSecondaryTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DesktopSecondaryTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, LayoutInflater.from(context).inflate(R.layout.view_title_secondary_desktop, this));
        ViewGroup viewGroup = this.mBackBT;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackBT");
        }
        viewGroup.setOnClickListener(new OnSingleClickListener(this) {
            /* class com.ss.android.lark.feed.app.view.DesktopSecondaryTitleView.C379091 */

            /* renamed from: a */
            final /* synthetic */ DesktopSecondaryTitleView f97260a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f97260a = r1;
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                OnClickBackListener aVar = this.f97260a.f97259a;
                if (aVar != null) {
                    aVar.mo137378a();
                }
            }
        });
    }
}

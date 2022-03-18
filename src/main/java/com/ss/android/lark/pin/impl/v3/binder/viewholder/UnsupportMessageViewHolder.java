package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.widget.richtext.RichTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/viewholder/UnsupportMessageViewHolder;", "Lcom/ss/android/lark/pin/impl/v3/binder/holderview/BaseHolderView2$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "content", "Lcom/ss/android/lark/widget/richtext/RichTextView;", "getContent", "()Lcom/ss/android/lark/widget/richtext/RichTextView;", "setContent", "(Lcom/ss/android/lark/widget/richtext/RichTextView;)V", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "postDate", "getPostDate", "setPostDate", "Factory", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UnsupportMessageViewHolder extends AbstractC51540b.C51541a {
    @BindView(7514)
    public RichTextView content;
    @BindView(7530)
    public TextView name;
    @BindView(7545)
    public TextView postDate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/viewholder/UnsupportMessageViewHolder$Factory;", "", "()V", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.UnsupportMessageViewHolder$a */
    public static final class Factory {

        /* renamed from: a */
        public static final Companion f128422a = new Companion(null);

        @JvmStatic
        /* renamed from: a */
        public static final UnsupportMessageViewHolder m200240a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return f128422a.mo177618a(layoutInflater, viewGroup);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/viewholder/UnsupportMessageViewHolder$Factory$Companion;", "", "()V", "create", "Lcom/ss/android/lark/pin/impl/v3/binder/viewholder/UnsupportMessageViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.UnsupportMessageViewHolder$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final UnsupportMessageViewHolder mo177618a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
                Intrinsics.checkParameterIsNotNull(viewGroup, "container");
                View inflate = layoutInflater.inflate(R.layout.chatpin_item_text2, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…_text2, container, false)");
                return new UnsupportMessageViewHolder(inflate, null);
            }
        }
    }

    private UnsupportMessageViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public /* synthetic */ UnsupportMessageViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}

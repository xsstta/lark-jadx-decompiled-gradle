package com.ss.android.lark.create.groupchat.impl.f2f.customview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0015\u0018\u0000 -2\u00020\u0001:\u0007+,-./01B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0001H\u0002J\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0013J\b\u0010(\u001a\u00020\u000fH\u0002J\f\u0010)\u001a\u00020**\u00020*H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u00062"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "childRV", "Landroidx/recyclerview/widget/RecyclerView;", "container", "containerHorizontalPadding", "containerVerticalPadding", "enableInput", "", "itemHorizontalPadding", "itemVerticalPadding", "numberListener", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;", "numberListenerWrapper", "com/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$numberListenerWrapper$1", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$numberListenerWrapper$1;", "adjustItemViewSize", "", "item", "Landroid/view/View;", "createBackIV", "Landroid/widget/ImageView;", "createHolderByType", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$BaseHolder;", ShareHitPoint.f121869d, "createNumberTextView", "Landroid/widget/TextView;", "createWrapperView", "notifySizeChanged", "setEnableInput", "enable", "setNumberClickListener", "listener", "setupRecyclerView", "dp", "", "BackHolder", "BaseHolder", "Companion", "ItemType", "NumberAdapter", "NumberClickListener", "NumberHolder", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NumberInputView extends FrameLayout {

    /* renamed from: e */
    public static final Companion f93674e = new Companion(null);

    /* renamed from: a */
    public boolean f93675a;

    /* renamed from: b */
    public NumberClickListener f93676b;

    /* renamed from: c */
    public final NumberInputView f93677c;

    /* renamed from: d */
    public final RecyclerView f93678d;

    /* renamed from: f */
    private final int f93679f;

    /* renamed from: g */
    private final int f93680g;

    /* renamed from: h */
    private final int f93681h;

    /* renamed from: i */
    private final int f93682i;

    /* renamed from: j */
    private final C36311i f93683j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;", "", "onBack", "", "onNumber", "value", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$f */
    public interface NumberClickListener {
        /* renamed from: a */
        void mo133941a();

        /* renamed from: a */
        void mo133942a(int i);
    }

    public NumberInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NumberInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$Companion;", "", "()V", "CONTAINER_PADDING_HORIZONTAL", "", "CONTAINER_PADDING_VERTICAL", "ITEM_PADDING_HORIZONTAL", "ITEM_PADDING_VERTICAL", "ITEM_TYPE_BACK", "", "ITEM_TYPE_BLANK", "ITEM_TYPE_NUMBER", "MATCH_PARENT", "NUMBER_SIZE", "TOTAL_ITEM_COUNT", "WRAP_CONTENT", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$ItemType;", "", "value", "", ShareHitPoint.f121869d, "(II)V", "getType", "()I", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$d */
    public static final class ItemType {

        /* renamed from: a */
        private final int f93688a;

        /* renamed from: b */
        private final int f93689b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemType)) {
                return false;
            }
            ItemType dVar = (ItemType) obj;
            return this.f93688a == dVar.f93688a && this.f93689b == dVar.f93689b;
        }

        public int hashCode() {
            return (this.f93688a * 31) + this.f93689b;
        }

        public String toString() {
            return "ItemType(value=" + this.f93688a + ", type=" + this.f93689b + ")";
        }

        /* renamed from: a */
        public final int mo133963a() {
            return this.f93688a;
        }

        /* renamed from: b */
        public final int mo133964b() {
            return this.f93689b;
        }

        public ItemType(int i, int i2) {
            this.f93688a = i;
            this.f93689b = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ItemType(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$numberListenerWrapper$1", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;", "onBack", "", "onNumber", "value", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$i */
    public static final class C36311i implements NumberClickListener {

        /* renamed from: a */
        final /* synthetic */ NumberInputView f93698a;

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView.NumberClickListener
        /* renamed from: a */
        public void mo133941a() {
            NumberClickListener fVar;
            if (this.f93698a.f93675a && (fVar = this.f93698a.f93676b) != null) {
                fVar.mo133941a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36311i(NumberInputView numberInputView) {
            this.f93698a = numberInputView;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView.NumberClickListener
        /* renamed from: a */
        public void mo133942a(int i) {
            NumberClickListener fVar;
            if (this.f93698a.f93675a && (fVar = this.f93698a.f93676b) != null) {
                fVar.mo133942a(i);
            }
        }
    }

    /* renamed from: b */
    private final boolean m142971b() {
        return post(new RunnableC36312j(this));
    }

    /* renamed from: c */
    private final FrameLayout m142972c() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        mo133959a(frameLayout);
        return frameLayout;
    }

    /* renamed from: d */
    private final ImageView m142973d() {
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$h */
    public static final class RunnableC36310h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NumberInputView f93697a;

        RunnableC36310h(NumberInputView numberInputView) {
            this.f93697a = numberInputView;
        }

        public final void run() {
            int i;
            View view;
            RecyclerView.Adapter adapter = this.f93697a.f93678d.getAdapter();
            int i2 = 0;
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            if (i >= 0) {
                while (true) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f93697a.f93678d.findViewHolderForAdapterPosition(i2);
                    if (findViewHolderForAdapterPosition != null) {
                        view = findViewHolderForAdapterPosition.itemView;
                    } else {
                        view = null;
                    }
                    this.f93697a.mo133959a(view);
                    if (i2 != i) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$j */
    public static final class RunnableC36312j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NumberInputView f93699a;

        RunnableC36312j(NumberInputView numberInputView) {
            this.f93699a = numberInputView;
        }

        public final void run() {
            RecyclerView recyclerView = this.f93699a.f93678d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            recyclerView.setAdapter(new NumberAdapter());
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
            recyclerView.setLayoutParams(layoutParams);
            this.f93699a.f93677c.addView(recyclerView, recyclerView.getLayoutParams());
            recyclerView.setOverScrollMode(2);
        }
    }

    /* renamed from: e */
    private final TextView m142974e() {
        TextView textView = new TextView(getContext());
        textView.setTextSize(24.0f);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.text_caption));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* renamed from: a */
    public final boolean mo133960a() {
        return post(new RunnableC36310h(this));
    }

    /* renamed from: a */
    public final NumberInputView mo133958a(boolean z) {
        NumberInputView numberInputView = this;
        numberInputView.f93675a = z;
        return numberInputView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$BackHolder;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$BaseHolder;", "itemWrapper", "Landroid/view/View;", "backIV", "Landroid/widget/ImageView;", "numberClickListener", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;", "(Landroid/view/View;Landroid/widget/ImageView;Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;)V", "bindItem", "", "itemType", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$ItemType;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$a */
    public static final class BackHolder extends BaseHolder {

        /* renamed from: a */
        public final NumberClickListener f93684a;

        /* renamed from: b */
        private final View f93685b;

        /* renamed from: c */
        private final ImageView f93686c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$a$a */
        static final class View$OnClickListenerC36308a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BackHolder f93687a;

            View$OnClickListenerC36308a(BackHolder aVar) {
                this.f93687a = aVar;
            }

            public final void onClick(View view) {
                NumberClickListener fVar = this.f93687a.f93684a;
                if (fVar != null) {
                    fVar.mo133941a();
                }
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView.BaseHolder
        /* renamed from: a */
        public void mo133961a(ItemType dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "itemType");
            this.f93686c.setImageResource(R.drawable.ic_icon_delete_outlined);
            View view = this.f93685b;
            Context context = this.f93685b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemWrapper.context");
            view.setBackground(new NumberSelectorBackground(context));
            this.f93685b.setOnClickListener(new View$OnClickListenerC36308a(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BackHolder(View view, ImageView imageView, NumberClickListener fVar) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemWrapper");
            Intrinsics.checkParameterIsNotNull(imageView, "backIV");
            this.f93685b = view;
            this.f93686c = imageView;
            this.f93684a = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberHolder;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$BaseHolder;", "itemWrapper", "Landroid/view/View;", "numberTV", "Landroid/widget/TextView;", "numberClickListener", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;", "(Landroid/view/View;Landroid/widget/TextView;Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;)V", "bindItem", "", "itemType", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$ItemType;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$g */
    public static final class NumberHolder extends BaseHolder {

        /* renamed from: a */
        public final NumberClickListener f93692a;

        /* renamed from: b */
        private final View f93693b;

        /* renamed from: c */
        private final TextView f93694c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$g$a */
        static final class View$OnClickListenerC36309a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ NumberHolder f93695a;

            /* renamed from: b */
            final /* synthetic */ ItemType f93696b;

            View$OnClickListenerC36309a(NumberHolder gVar, ItemType dVar) {
                this.f93695a = gVar;
                this.f93696b = dVar;
            }

            public final void onClick(View view) {
                NumberClickListener fVar = this.f93695a.f93692a;
                if (fVar != null) {
                    fVar.mo133942a(this.f93696b.mo133963a());
                }
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView.BaseHolder
        /* renamed from: a */
        public void mo133961a(ItemType dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "itemType");
            this.f93694c.setText(String.valueOf(dVar.mo133963a()));
            View view = this.f93693b;
            Context context = this.f93693b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemWrapper.context");
            view.setBackground(new NumberSelectorBackground(context));
            this.f93693b.setOnClickListener(new View$OnClickListenerC36309a(this, dVar));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NumberHolder(View view, TextView textView, NumberClickListener fVar) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemWrapper");
            Intrinsics.checkParameterIsNotNull(textView, "numberTV");
            this.f93693b = view;
            this.f93694c = textView;
            this.f93692a = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$BaseHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemWrapper", "Landroid/view/View;", "(Landroid/view/View;)V", "bindItem", "", "itemType", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$ItemType;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$b */
    public static class BaseHolder extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public void mo133961a(ItemType dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "itemType");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BaseHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemWrapper");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$BaseHolder;", "(Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView;)V", "items", "", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$ItemType;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView$e */
    public final class NumberAdapter extends RecyclerView.Adapter<BaseHolder> {

        /* renamed from: b */
        private final List<ItemType> f93691b = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f93691b.get(i).mo133964b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public NumberAdapter() {
            for (int i = 1; i <= 9; i++) {
                this.f93691b.add(new ItemType(i, 34));
            }
            List<ItemType> list = this.f93691b;
            list.add(new ItemType(0, 35, 1, null));
            list.add(new ItemType(0, 34));
            list.add(new ItemType(0, 36, 1, null));
        }

        /* renamed from: a */
        public BaseHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return NumberInputView.this.mo133956a(i);
        }

        /* renamed from: a */
        public void onBindViewHolder(BaseHolder bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "holder");
            bVar.mo133961a(this.f93691b.get(i));
        }
    }

    /* renamed from: a */
    public final NumberInputView mo133957a(NumberClickListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        NumberInputView numberInputView = this;
        numberInputView.f93676b = fVar;
        return numberInputView;
    }

    /* renamed from: a */
    private final float m142970a(float f) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return f * resources.getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final void mo133959a(View view) {
        if (view != null) {
            int height = this.f93677c.getHeight() - (this.f93679f * 2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = this.f93681h;
                marginLayoutParams.rightMargin = this.f93681h;
                marginLayoutParams.topMargin = this.f93682i;
                marginLayoutParams.bottomMargin = this.f93682i;
                marginLayoutParams.height = (height / 4) - (this.f93682i * 2);
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: a */
    public final BaseHolder mo133956a(int i) {
        FrameLayout c = m142972c();
        if (i == 34) {
            TextView e = m142974e();
            c.addView(e);
            return new NumberHolder(c, e, this.f93683j);
        } else if (i != 36) {
            return new BaseHolder(c);
        } else {
            ImageView d = m142973d();
            c.addView(d);
            return new BackHolder(c, d, this.f93683j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumberInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f93675a = true;
        this.f93677c = this;
        this.f93678d = new RecyclerView(context);
        int a = (int) m142970a(30.0f);
        this.f93679f = a;
        int a2 = (int) m142970a(20.0f);
        this.f93680g = a2;
        this.f93681h = (int) m142970a(16.0f);
        this.f93682i = (int) m142970a(8.0f);
        setBackgroundResource(R.color.bg_body);
        m142971b();
        setPadding(a2, a, a2, a);
        this.f93683j = new C36311i(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NumberInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

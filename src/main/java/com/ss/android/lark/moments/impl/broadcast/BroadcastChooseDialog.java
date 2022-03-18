package com.ss.android.lark.moments.impl.broadcast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.utils.TimeLabelUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "broadcastList", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "selectedPostId", "", "listener", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "rootView", "Landroid/view/View;", "initRecyclerView", "", "initView", "BroadcastListAdapter", "BroadcastListHolder", "OnBroadcastSelectedListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.broadcast.a */
public final class BroadcastChooseDialog extends BaseDialog {

    /* renamed from: a */
    private View f119033a;

    /* renamed from: b */
    private final List<Broadcast> f119034b;

    /* renamed from: c */
    private final String f119035c;

    /* renamed from: d */
    private final OnBroadcastSelectedListener f119036d;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$BroadcastListHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "Landroid/view/View;", "itemView", "selectedPostId", "", "(Landroid/view/View;Ljava/lang/String;)V", "getSelectedPostId", "()Ljava/lang/String;", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.a$b */
    public static final class BroadcastListHolder extends AbstractC58967a<Broadcast, View> {

        /* renamed from: a */
        public static final Companion f119042a = new Companion(null);

        /* renamed from: b */
        private final String f119043b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$BroadcastListHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$BroadcastListHolder;", "parent", "Landroid/view/ViewGroup;", "selectedPostId", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.a$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final BroadcastListHolder mo165945a(ViewGroup viewGroup, String str) {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                Intrinsics.checkParameterIsNotNull(str, "selectedPostId");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_broadcast_choose_list, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
                return new BroadcastListHolder(inflate, str);
            }
        }

        /* renamed from: a */
        public void mo165944a(Broadcast broadcast) {
            Intrinsics.checkParameterIsNotNull(broadcast, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super.mo165944a((Object) broadcast);
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.broadcast_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.broadcast_title");
            textView.setText(broadcast.title);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(R.id.broadcast_time);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.broadcast_time");
            StringBuilder sb = new StringBuilder();
            sb.append(UIHelper.getString(R.string.Lark_Community_PinnedUntil));
            TimeLabelUtils jVar = TimeLabelUtils.f119256a;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            Context context = view3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            sb.append(jVar.mo166218a(context, broadcast.end_time_sec.longValue() * ((long) 1000)));
            textView2.setText(sb.toString());
            if (Intrinsics.areEqual(broadcast.post_id, this.f119043b)) {
                View view4 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                ImageView imageView = (ImageView) view4.findViewById(R.id.broadcast_checked_iv);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.broadcast_checked_iv");
                imageView.setVisibility(0);
                return;
            }
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            ImageView imageView2 = (ImageView) view5.findViewById(R.id.broadcast_checked_iv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.broadcast_checked_iv");
            imageView2.setVisibility(8);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BroadcastListHolder(View view, String str) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(str, "selectedPostId");
            this.f119043b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "", "onBroadcastSelected", "", "broadcast", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.a$c */
    public interface OnBroadcastSelectedListener {
        /* renamed from: a */
        void mo165936a(Broadcast broadcast);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0010\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\"\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$BroadcastListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "broadcastList", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "selectedPostId", "", "listener", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "(Ljava/util/List;Ljava/lang/String;Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;)V", "getBroadcastList", "()Ljava/util/List;", "getListener", "()Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "getSelectedPostId", "()Ljava/lang/String;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.a$a */
    public static final class BroadcastListAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

        /* renamed from: a */
        private final List<Broadcast> f119037a;

        /* renamed from: b */
        private final String f119038b;

        /* renamed from: c */
        private final OnBroadcastSelectedListener f119039c;

        /* renamed from: a */
        public final List<Broadcast> mo165940a() {
            return this.f119037a;
        }

        /* renamed from: b */
        public final OnBroadcastSelectedListener mo165942b() {
            return this.f119039c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f119037a.size();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$BroadcastListAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.a$a$a */
        public static final class C47195a extends OnSingleClickListener {

            /* renamed from: a */
            final /* synthetic */ BroadcastListAdapter f119040a;

            /* renamed from: b */
            final /* synthetic */ int f119041b;

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                this.f119040a.mo165942b().mo165936a(this.f119040a.mo165940a().get(this.f119041b));
            }

            C47195a(BroadcastListAdapter aVar, int i) {
                this.f119040a = aVar;
                this.f119041b = i;
            }
        }

        /* renamed from: a */
        public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return BroadcastListHolder.f119042a.mo165945a(viewGroup, this.f119038b);
        }

        /* renamed from: a */
        public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            ((BroadcastListHolder) aVar).mo165944a(this.f119037a.get(i));
            aVar.itemView.setOnClickListener(new C47195a(this, i));
        }

        public BroadcastListAdapter(List<Broadcast> list, String str, OnBroadcastSelectedListener cVar) {
            Intrinsics.checkParameterIsNotNull(list, "broadcastList");
            Intrinsics.checkParameterIsNotNull(str, "selectedPostId");
            Intrinsics.checkParameterIsNotNull(cVar, "listener");
            this.f119037a = list;
            this.f119038b = str;
            this.f119039c = cVar;
        }
    }

    /* renamed from: a */
    public final OnBroadcastSelectedListener mo165938a() {
        return this.f119036d;
    }

    /* renamed from: c */
    private final void m187013c() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recycler");
        recyclerView2.setAdapter(new BroadcastListAdapter(this.f119034b, this.f119035c, new C47196d(this)));
    }

    /* renamed from: b */
    private final void m187012b() {
        WindowManager.LayoutParams attributes;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_moments_broadcast_choose, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…s_broadcast_choose, null)");
        this.f119033a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        if (inflate != null) {
            View view = this.f119033a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            setContentView(view);
            View view2 = this.f119033a;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = UIHelper.getWindowWidth(getContext());
            View view3 = this.f119033a;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            view3.setLayoutParams(layoutParams);
            Window window = getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            Window window2 = getWindow();
            if (!(window2 == null || (attributes = window2.getAttributes()) == null)) {
                attributes.windowAnimations = R.style.BottomInAndOutAnim;
            }
            setCanceledOnTouchOutside(true);
            View view4 = this.f119033a;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            if (view4 != null) {
                ((LKUIRoundLinearLayout) view4).mo89623a(12.0f, BitmapDescriptorFactory.HUE_RED, 12.0f, BitmapDescriptorFactory.HUE_RED);
                m187013c();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.layout.LKUIRoundLinearLayout");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$initRecyclerView$1", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastChooseDialog$OnBroadcastSelectedListener;", "onBroadcastSelected", "", "broadcast", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.a$d */
    public static final class C47196d implements OnBroadcastSelectedListener {

        /* renamed from: a */
        final /* synthetic */ BroadcastChooseDialog f119044a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47196d(BroadcastChooseDialog aVar) {
            this.f119044a = aVar;
        }

        @Override // com.ss.android.lark.moments.impl.broadcast.BroadcastChooseDialog.OnBroadcastSelectedListener
        /* renamed from: a */
        public void mo165936a(Broadcast broadcast) {
            Intrinsics.checkParameterIsNotNull(broadcast, "broadcast");
            this.f119044a.mo165938a().mo165936a(broadcast);
            this.f119044a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastChooseDialog(Context context, List<Broadcast> list, String str, OnBroadcastSelectedListener cVar) {
        super(context, R.style.BottomDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "broadcastList");
        Intrinsics.checkParameterIsNotNull(str, "selectedPostId");
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f119034b = list;
        this.f119035c = str;
        this.f119036d = cVar;
        m187012b();
    }
}

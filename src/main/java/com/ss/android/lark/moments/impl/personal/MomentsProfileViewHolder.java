package com.ss.android.lark.moments.impl.personal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.UserProfile;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.BorderOvalImageView;
import com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.hitpoint.MomentsAppreciableHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J2\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J(\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/personal/IMomentsProfile;", "Landroid/view/View;", "itemView", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "mData", "bindColumn", "", "context", "Landroid/content/Context;", "dynamicLayout", "followerLayout", "followingLayout", "profile", "Lcom/bytedance/lark/pb/moments/v1/UserProfile;", "bindFollowingsAvatar", "avatarList", "followingAvatarImage", "", "Lcom/ss/android/lark/image/entity/AvatarImage;", "availableWidth", "", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.l */
public final class MomentsProfileViewHolder extends AbstractC58967a<IMomentsProfile, View> {

    /* renamed from: b */
    public static final int f120576b = UIHelper.dp2px(26.0f);

    /* renamed from: c */
    public static final Companion f120577c = new Companion(null);

    /* renamed from: e */
    private static final int f120578e = UIHelper.dp2px(92.0f);

    /* renamed from: a */
    public IMomentsProfile f120579a;

    /* renamed from: d */
    private final IMomentClickListener f120580d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder$Companion;", "", "()V", "AVATAR_SIZE", "", "FOLLOW_AVATAR_SIZE", "getFOLLOW_AVATAR_SIZE", "()I", "create", "Lcom/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo167737a() {
            return MomentsProfileViewHolder.f120576b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfileViewHolder mo167738a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_profile_header_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsProfileViewHolder(inflate, aVar);
        }
    }

    /* renamed from: a */
    public final IMomentClickListener mo167735a() {
        return this.f120580d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDraw"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$g */
    public static final class ViewTreeObserver$OnDrawListenerC47878g implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public static final ViewTreeObserver$OnDrawListenerC47878g f120591a = new ViewTreeObserver$OnDrawListenerC47878g();

        ViewTreeObserver$OnDrawListenerC47878g() {
        }

        public final void onDraw() {
            MomentsAppreciableHitPoint.f119684a.mo166733R();
            MomentsAppreciableHitPoint.f119684a.mo166736U();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder$onBind$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$d */
    public static final class C47874d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileViewHolder f120583a;

        /* renamed from: b */
        final /* synthetic */ MomentsUserVM f120584b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.personal.l$d$a */
        static final class RunnableC47875a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47874d f120585a;

            RunnableC47875a(C47874d dVar) {
                this.f120585a = dVar;
            }

            public final void run() {
                MomentsUserVM b;
                IMomentsProfile aVar = this.f120585a.f120583a.f120579a;
                if (aVar != null && (b = aVar.mo167651b()) != null) {
                    View view = this.f120585a.f120583a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    ((MomentsFollowButton) view.findViewById(R.id.btFollow)).mo166233a(b.mo166366e(), b.mo166367f());
                    MomentsHitPoint.f119720a.mo166839a("community_profile", b.mo166366e(), b.mo166364c());
                }
            }
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120583a.itemView.postDelayed(new RunnableC47875a(this), 500);
            MomentsUserVM gVar = this.f120584b;
            if (gVar != null) {
                gVar.mo166369h();
            }
        }

        C47874d(MomentsProfileViewHolder lVar, MomentsUserVM gVar) {
            this.f120583a = lVar;
            this.f120584b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder$bindColumn$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$b */
    public static final class C47872b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileViewHolder f120581a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47872b(MomentsProfileViewHolder lVar) {
            this.f120581a = lVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120581a.mo167735a().mo166626d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder$bindColumn$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$c */
    public static final class C47873c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileViewHolder f120582a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47873c(MomentsProfileViewHolder lVar) {
            this.f120582a = lVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120582a.mo167735a().mo166624c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder$onBind$5", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$f */
    public static final class C47877f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileViewHolder f120589a;

        /* renamed from: b */
        final /* synthetic */ String f120590b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            MomentsHitPoint.f119720a.mo166849f("community_profile");
            IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
            View view2 = this.f120589a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            profileModuleDependency.mo144727a(context, this.f120590b);
        }

        C47877f(MomentsProfileViewHolder lVar, String str) {
            this.f120589a = lVar;
            this.f120590b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/MomentsProfileViewHolder$onBind$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.l$e */
    public static final class C47876e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileViewHolder f120586a;

        /* renamed from: b */
        final /* synthetic */ UserProfile f120587b;

        /* renamed from: c */
        final /* synthetic */ boolean f120588c;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ImageSet imageSet;
            String str;
            UserProfile userProfile = this.f120587b;
            if (userProfile != null && (imageSet = userProfile.background_image) != null && (str = imageSet.key) != null) {
                if (this.f120588c) {
                    IMomentClickListener a = this.f120586a.mo167735a();
                    View view2 = this.f120586a.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    ImageView imageView = (ImageView) view2.findViewById(R.id.ivBackground);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.ivBackground");
                    a.mo166617a(str, imageView);
                    return;
                }
                ArrayList<PhotoItem> arrayList = new ArrayList<>();
                arrayList.add(new PhotoItem().setPaths(CollectionsKt.listOf(str)).setImageKey(str).setType(3));
                IMomentClickListener a2 = this.f120586a.mo167735a();
                View view3 = this.f120586a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                ImageView imageView2 = (ImageView) view3.findViewById(R.id.ivBackground);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.ivBackground");
                a2.mo166621a(arrayList, imageView2);
            }
        }

        C47876e(MomentsProfileViewHolder lVar, UserProfile userProfile, boolean z) {
            this.f120586a = lVar;
            this.f120587b = userProfile;
            this.f120588c = z;
        }
    }

    /* renamed from: a */
    public void mo165944a(IMomentsProfile aVar) {
        String str;
        boolean z;
        int i;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String str5;
        float f;
        int i2;
        int i3;
        UserProfile userProfile;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String str6;
        int i10;
        String str7;
        Integer num7;
        Integer num8;
        String valueOf;
        Integer num9;
        Integer num10;
        String valueOf2;
        MomentUser i11;
        ImageSet imageSet;
        String str8;
        MomentUser i12;
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        this.f120579a = aVar;
        UserProfile c = aVar.mo167652c();
        MomentsUserVM b = aVar.mo167651b();
        boolean e = aVar.mo167654e();
        if (b == null || (i12 = b.mo166471i()) == null || (str = i12.user_id) == null) {
            str = "";
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        MomentsFollowButton momentsFollowButton = (MomentsFollowButton) view.findViewById(R.id.btFollow);
        Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton, "itemView.btFollow");
        MomentsFollowButton momentsFollowButton2 = momentsFollowButton;
        int i13 = 0;
        if (aVar.mo167655f() || e) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        momentsFollowButton2.setVisibility(i);
        if (b != null) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((MomentsFollowButton) view2.findViewById(R.id.btFollow)).mo166233a(b.mo166366e(), b.mo166367f());
            Unit unit = Unit.INSTANCE;
        }
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((MomentsFollowButton) view3.findViewById(R.id.btFollow)).setOnClickListener(new C47874d(this, b));
        if (b != null) {
            String str9 = b.mo166471i().avatar_key;
            String str10 = b.mo166471i().user_id;
            int i14 = f120578e;
            AvatarImage build = AvatarImage.Builder.obtain(str9, str10, i14, i14).build();
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            IRequestCreator override = ImageLoader.with(view4.getContext()).load(build).placeholder(R.drawable.common_chat_window_image_item_holder).override(i14, i14);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…AVATAR_SIZE, AVATAR_SIZE)");
            IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, i14, i14, false, null, 24, null);
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            a.into((BorderOvalImageView) view5.findViewById(R.id.avatar));
            if (!(c == null || (imageSet = c.background_image) == null || (str8 = imageSet.key) == null)) {
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                int screenWidth = DeviceUtils.getScreenWidth(view6.getContext());
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                IRequestCreator dontAnimate = ImageLoader.with(view7.getContext()).load(new C38824b(str8)).override(screenWidth, screenWidth).dontAnimate(false);
                Intrinsics.checkExpressionValueIsNotNull(dontAnimate, "ImageLoader.with(itemVie…      .dontAnimate(false)");
                IRequestCreator a2 = C47282k.m187256a(dontAnimate, ListenerParams.FromType.COVER, screenWidth, screenWidth, false, null, 24, null);
                View view8 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                a2.into((ImageView) view8.findViewById(R.id.ivBackground));
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((BorderOvalImageView) view9.findViewById(R.id.avatar)).setImageResource(R.drawable.common_chat_window_image_item_holder);
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            ((ImageView) view10.findViewById(R.id.ivBackground)).setImageResource(R.drawable.common_chat_window_image_item_holder);
        }
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        ((ImageView) view11.findViewById(R.id.ivBackground)).setOnClickListener(new C47876e(this, c, e));
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        ((BorderOvalImageView) view12.findViewById(R.id.avatar)).setOnClickListener(new C47877f(this, str));
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        TextView textView = (TextView) view13.findViewById(R.id.profileName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.profileName");
        FakeBoldSpan.Companion aVar2 = FakeBoldSpan.f119246a;
        if (b == null || (i11 = b.mo166471i()) == null || (str2 = i11.name) == null) {
            str2 = "";
        }
        textView.setText(aVar2.mo166167a(str2));
        if (!aVar.mo167655f()) {
            if (e || !MomentsDependencyHolder.f118998b.mo165901b().mo166495g()) {
                z2 = false;
            } else {
                z2 = true;
            }
            View view14 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
            int screenWidth2 = DeviceUtils.getScreenWidth(view14.getContext());
            View view15 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
            int dp2px = UIUtils.dp2px(view15.getContext(), 120.0f);
            View view16 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
            View findViewById = view16.findViewById(R.id.longDynamic);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.longDynamic");
            TextView textView2 = (TextView) findViewById.findViewById(R.id.count);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv");
            View view17 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            Context context = view17.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            textView2.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DINAlternateBold.ttf"));
            TextPaint paint = textView2.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "tv.paint");
            View view18 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
            View findViewById2 = view18.findViewById(R.id.longDynamic);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.longDynamic");
            TextView textView3 = (TextView) findViewById2.findViewById(R.id.label);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.longDynamic.label");
            TextPaint paint2 = textView3.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint2, "itemView.longDynamic.label.paint");
            if (c == null || (num6 = c.posts_count) == null || (str3 = String.valueOf(num6.intValue())) == null) {
                str3 = "";
            }
            if (c == null || (num5 = c.follower_count) == null || (str4 = String.valueOf(num5.intValue())) == null) {
                str4 = "";
            }
            if (c == null || (num4 = c.following_count) == null || (str5 = String.valueOf(num4.intValue())) == null) {
                str5 = "";
            }
            if (z2) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = paint.measureText(str3);
            }
            int measureText = (int) (f + paint.measureText(str4) + paint.measureText(str5));
            if (c == null || (num3 = c.posts_count) == null) {
                i2 = 0;
            } else {
                i2 = num3.intValue();
            }
            String quantityString = UIHelper.getQuantityString(R.plurals.Lark_Community_Dynamic, i2);
            if (c == null || (num2 = c.follower_count) == null) {
                i3 = 0;
            } else {
                i3 = num2.intValue();
            }
            String quantityString2 = UIHelper.getQuantityString(R.plurals.Lark_Community_Followers, i3);
            if (c == null || (num = c.following_count) == null) {
                userProfile = c;
                i5 = R.plurals.Lark_Community_Following;
                i4 = 0;
            } else {
                i4 = num.intValue();
                userProfile = c;
                i5 = R.plurals.Lark_Community_Following;
            }
            String quantityString3 = UIHelper.getQuantityString(i5, i4);
            if (z2) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = paint2.measureText(quantityString);
            }
            int measureText2 = ((screenWidth2 - dp2px) - measureText) - ((int) ((f2 + paint2.measureText(quantityString2)) + paint2.measureText(quantityString3)));
            if (measureText2 > 0) {
                View view19 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
                LinearLayout linearLayout = (LinearLayout) view19.findViewById(R.id.longColumn);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.longColumn");
                linearLayout.setVisibility(0);
                View view20 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view20, "itemView");
                LinearLayout linearLayout2 = (LinearLayout) view20.findViewById(R.id.shortColumn);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "itemView.shortColumn");
                linearLayout2.setVisibility(8);
                View view21 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view21, "itemView");
                View findViewById3 = view21.findViewById(R.id.longDynamic);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.longDynamic");
                if (!z2) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                findViewById3.setVisibility(i8);
                View view22 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view22, "itemView");
                View findViewById4 = view22.findViewById(R.id.longDynamicDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.longDynamicDivider");
                if (!z2) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                findViewById4.setVisibility(i9);
                View view23 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view23, "itemView");
                Context context2 = view23.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
                View view24 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view24, "itemView");
                View findViewById5 = view24.findViewById(R.id.longDynamic);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.longDynamic");
                View view25 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view25, "itemView");
                View findViewById6 = view25.findViewById(R.id.longFollower);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.longFollower");
                View view26 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view26, "itemView");
                View findViewById7 = view26.findViewById(R.id.longFollowing);
                Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.longFollowing");
                m189118a(context2, findViewById5, findViewById6, findViewById7, userProfile);
                View view27 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view27, "itemView");
                View findViewById8 = view27.findViewById(R.id.longFollowing);
                Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.longFollowing");
                m189119a(findViewById8, aVar.mo167653d(), measureText2);
            } else {
                View view28 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view28, "itemView");
                LinearLayout linearLayout3 = (LinearLayout) view28.findViewById(R.id.shortColumn);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "itemView.shortColumn");
                linearLayout3.setVisibility(0);
                View view29 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view29, "itemView");
                LinearLayout linearLayout4 = (LinearLayout) view29.findViewById(R.id.longColumn);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "itemView.longColumn");
                linearLayout4.setVisibility(8);
                View view30 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view30, "itemView");
                View findViewById9 = view30.findViewById(R.id.shortDynamic);
                Intrinsics.checkExpressionValueIsNotNull(findViewById9, "itemView.shortDynamic");
                if (!z2) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                findViewById9.setVisibility(i6);
                View view31 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view31, "itemView");
                View findViewById10 = view31.findViewById(R.id.shortDynamicDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById10, "itemView.shortDynamicDivider");
                if (!z2) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                findViewById10.setVisibility(i7);
                View view32 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view32, "itemView");
                Context context3 = view32.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "itemView.context");
                View view33 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view33, "itemView");
                View findViewById11 = view33.findViewById(R.id.shortDynamic);
                Intrinsics.checkExpressionValueIsNotNull(findViewById11, "itemView.shortDynamic");
                View view34 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view34, "itemView");
                View findViewById12 = view34.findViewById(R.id.shortFollower);
                Intrinsics.checkExpressionValueIsNotNull(findViewById12, "itemView.shortFollower");
                View view35 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view35, "itemView");
                View findViewById13 = view35.findViewById(R.id.shortFollowing);
                Intrinsics.checkExpressionValueIsNotNull(findViewById13, "itemView.shortFollowing");
                m189118a(context3, findViewById11, findViewById12, findViewById13, userProfile);
                View view36 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view36, "itemView");
                View findViewById14 = view36.findViewById(R.id.shortFollowing);
                Intrinsics.checkExpressionValueIsNotNull(findViewById14, "itemView.shortFollowing");
                m189119a(findViewById14, aVar.mo167653d(), Integer.MAX_VALUE);
            }
        } else if (e) {
            View view37 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view37, "itemView");
            LinearLayout linearLayout5 = (LinearLayout) view37.findViewById(R.id.longColumn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "itemView.longColumn");
            linearLayout5.setVisibility(0);
            View view38 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view38, "itemView");
            LinearLayout linearLayout6 = (LinearLayout) view38.findViewById(R.id.shortColumn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "itemView.shortColumn");
            linearLayout6.setVisibility(8);
            View view39 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view39, "itemView");
            View findViewById15 = view39.findViewById(R.id.longFollowing);
            Intrinsics.checkExpressionValueIsNotNull(findViewById15, "itemView.longFollowing");
            findViewById15.setVisibility(8);
            View view40 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view40, "itemView");
            Context context4 = view40.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "itemView.context");
            View view41 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view41, "itemView");
            View findViewById16 = view41.findViewById(R.id.longDynamic);
            Intrinsics.checkExpressionValueIsNotNull(findViewById16, "itemView.longDynamic");
            View view42 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view42, "itemView");
            View findViewById17 = view42.findViewById(R.id.longFollower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById17, "itemView.longFollower");
            View view43 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view43, "itemView");
            View findViewById18 = view43.findViewById(R.id.longFollowing);
            Intrinsics.checkExpressionValueIsNotNull(findViewById18, "itemView.longFollowing");
            m189118a(context4, findViewById16, findViewById17, findViewById18, c);
            View view44 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view44, "itemView");
            Context context5 = view44.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            Typeface createFromAsset = Typeface.createFromAsset(context5.getAssets(), "fonts/DINAlternateBold.ttf");
            View view45 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view45, "itemView");
            View findViewById19 = view45.findViewById(R.id.longDynamic);
            View view46 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view46, "itemView");
            View findViewById20 = view46.findViewById(R.id.longFollower);
            Intrinsics.checkExpressionValueIsNotNull(findViewById19, "dynamicLayout");
            TextView textView4 = (TextView) findViewById19.findViewById(R.id.count);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "dynamicLayout.count");
            textView4.setTypeface(createFromAsset);
            TextView textView5 = (TextView) findViewById19.findViewById(R.id.count);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "dynamicLayout.count");
            if (c != null && (num10 = c.posts_count) != null && (valueOf2 = String.valueOf(num10.intValue())) != null) {
                str6 = valueOf2;
            }
            textView5.setText(str6);
            TextView textView6 = (TextView) findViewById19.findViewById(R.id.label);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "dynamicLayout.label");
            if (c == null || (num9 = c.posts_count) == null) {
                i10 = 0;
            } else {
                i10 = num9.intValue();
            }
            textView6.setText(UIHelper.getQuantityString(R.plurals.Lark_Community_Dynamic, i10));
            Intrinsics.checkExpressionValueIsNotNull(findViewById20, "reactionsLayout");
            TextView textView7 = (TextView) findViewById20.findViewById(R.id.count);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "reactionsLayout.count");
            textView7.setTypeface(createFromAsset);
            TextView textView8 = (TextView) findViewById20.findViewById(R.id.count);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "reactionsLayout.count");
            if (c != null && (num8 = c.reactions_count) != null && (valueOf = String.valueOf(num8.intValue())) != null) {
                str7 = valueOf;
            }
            textView8.setText(str7);
            TextView textView9 = (TextView) findViewById20.findViewById(R.id.label);
            Intrinsics.checkExpressionValueIsNotNull(textView9, "reactionsLayout.label");
            if (!(c == null || (num7 = c.reactions_count) == null)) {
                i13 = num7.intValue();
            }
            textView9.setText(UIHelper.getQuantityString(R.plurals.Lark_ProfilePage_ReationgNumber, i13));
            View view47 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view47, "itemView");
            View findViewById21 = view47.findViewById(R.id.divider_2);
            Intrinsics.checkExpressionValueIsNotNull(findViewById21, "itemView.divider_2");
            findViewById21.setVisibility(8);
            View view48 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view48, "itemView");
            View findViewById22 = view48.findViewById(R.id.longFollowing);
            Intrinsics.checkExpressionValueIsNotNull(findViewById22, "itemView.longFollowing");
            findViewById22.setVisibility(8);
        } else {
            View view49 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view49, "itemView");
            LinearLayout linearLayout7 = (LinearLayout) view49.findViewById(R.id.longColumn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "itemView.longColumn");
            linearLayout7.setVisibility(8);
            View view50 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view50, "itemView");
            LinearLayout linearLayout8 = (LinearLayout) view50.findViewById(R.id.shortColumn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "itemView.shortColumn");
            linearLayout8.setVisibility(8);
        }
        View view51 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view51, "itemView");
        view51.getViewTreeObserver().addOnDrawListener(ViewTreeObserver$OnDrawListenerC47878g.f120591a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfileViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f120580d = aVar;
    }

    /* renamed from: a */
    private final void m189119a(View view, List<? extends AvatarImage> list, int i) {
        ArrayList<BorderOvalImageView> arrayList = new ArrayList();
        arrayList.add((BorderOvalImageView) view.findViewById(R.id.avatar1));
        arrayList.add((BorderOvalImageView) view.findViewById(R.id.avatar2));
        arrayList.add((BorderOvalImageView) view.findViewById(R.id.avatar3));
        arrayList.add((BorderOvalImageView) view.findViewById(R.id.avatar4));
        for (BorderOvalImageView borderOvalImageView : arrayList) {
            borderOvalImageView.setVisibility(8);
        }
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                if (i2 <= 3) {
                    View view2 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    int dp2px = UIUtils.dp2px(view2.getContext(), 26.0f);
                    View view3 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                    if (dp2px + (UIUtils.dp2px(view3.getContext(), 16.0f) * i2) <= i) {
                        View view4 = this.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                        IRequestCreator placeholder = ImageLoader.with(view4.getContext()).load(t).placeholder(R.drawable.common_chat_window_image_item_holder);
                        int i3 = f120576b;
                        IRequestCreator override = placeholder.override(i3, i3);
                        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…SIZE, FOLLOW_AVATAR_SIZE)");
                        C47282k.m187256a(override, ListenerParams.FromType.AVATAR, i3, i3, false, null, 24, null).into((ImageView) arrayList.get(i2));
                        Object obj = arrayList.get(i2);
                        Intrinsics.checkExpressionValueIsNotNull(obj, "followAvatarView[count]");
                        ((BorderOvalImageView) obj).setVisibility(0);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m189118a(Context context, View view, View view2, View view3, UserProfile userProfile) {
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        Integer num;
        Integer num2;
        String valueOf;
        Integer num3;
        Integer num4;
        String valueOf2;
        Integer num5;
        Integer num6;
        String valueOf3;
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/DINAlternateBold.ttf");
        TextView textView = (TextView) view.findViewById(R.id.count);
        Intrinsics.checkExpressionValueIsNotNull(textView, "dynamicLayout.count");
        textView.setTypeface(createFromAsset);
        TextView textView2 = (TextView) view.findViewById(R.id.count);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "dynamicLayout.count");
        if (userProfile != null && (num6 = userProfile.posts_count) != null && (valueOf3 = String.valueOf(num6.intValue())) != null) {
            str = valueOf3;
        }
        textView2.setText(str);
        TextView textView3 = (TextView) view.findViewById(R.id.label);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "dynamicLayout.label");
        int i3 = 0;
        if (userProfile == null || (num5 = userProfile.posts_count) == null) {
            i = 0;
        } else {
            i = num5.intValue();
        }
        textView3.setText(UIHelper.getQuantityString(R.plurals.Lark_Community_Dynamic, i));
        TextView textView4 = (TextView) view2.findViewById(R.id.count);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "followerLayout.count");
        textView4.setTypeface(createFromAsset);
        TextView textView5 = (TextView) view2.findViewById(R.id.count);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "followerLayout.count");
        if (userProfile != null && (num4 = userProfile.follower_count) != null && (valueOf2 = String.valueOf(num4.intValue())) != null) {
            str2 = valueOf2;
        }
        textView5.setText(str2);
        TextView textView6 = (TextView) view2.findViewById(R.id.label);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "followerLayout.label");
        if (userProfile == null || (num3 = userProfile.follower_count) == null) {
            i2 = 0;
        } else {
            i2 = num3.intValue();
        }
        textView6.setText(UIHelper.getQuantityString(R.plurals.Lark_Community_Followers, i2));
        view2.setOnClickListener(new C47872b(this));
        TextView textView7 = (TextView) view3.findViewById(R.id.count);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "followingLayout.count");
        textView7.setTypeface(createFromAsset);
        TextView textView8 = (TextView) view3.findViewById(R.id.count);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "followingLayout.count");
        if (userProfile != null && (num2 = userProfile.following_count) != null && (valueOf = String.valueOf(num2.intValue())) != null) {
            str3 = valueOf;
        }
        textView8.setText(str3);
        TextView textView9 = (TextView) view3.findViewById(R.id.label);
        Intrinsics.checkExpressionValueIsNotNull(textView9, "followingLayout.label");
        if (!(userProfile == null || (num = userProfile.following_count) == null)) {
            i3 = num.intValue();
        }
        textView9.setText(UIHelper.getQuantityString(R.plurals.Lark_Community_Following, i3));
        view3.setOnClickListener(new C47873c(this));
    }
}

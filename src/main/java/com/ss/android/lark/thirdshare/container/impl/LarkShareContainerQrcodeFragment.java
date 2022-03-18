package com.ss.android.lark.thirdshare.container.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.container.LarkShareContainer;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.p2743a.AbstractC55729a;
import com.ss.android.lark.thirdshare.container.p2745c.C55731a;
import com.ss.android.lark.thirdshare.container.p2745c.C55732b;
import com.ss.android.lark.thirdshare.container.p2745c.C55735c;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\u0012\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0012\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u000102H\u0016J&\u00103\u001a\u0004\u0018\u00010$2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0006H\u0002J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\u0006H\u0016J\u0010\u0010>\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u0010?\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u0010@\u001a\u00020(2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\u0010\u0010C\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerQrcodeFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "iconShape", "", "isFetchData", "", "lscDisableRl", "Landroid/widget/RelativeLayout;", "lscDisableTipTv", "Landroid/widget/TextView;", "lscErrorRetryTv", "lscErrorRl", "lscErrorTipTv", "lscLoadingRl", "lscQrcodeRl", "lscqAvatarIv", "Lcom/joooonho/SelectableRoundedImageView;", "lscqDescTv", "lscqExpiredTipTv", "lscqHeadLl", "Landroid/widget/LinearLayout;", "lscqNameTv", "lscqQrcodeIv", "Landroid/widget/ImageView;", "lscqSaveAvatarIv", "lscqSaveDescTv", "lscqSaveExpiredTipTv", "lscqSaveLl", "lscqSaveNameTv", "lscqSaveQrcodeIv", "lscqSaveTipTv", "lscqSaveTv", "lscqShareTv", "lscqTipTv", "rootView", "Landroid/view/View;", "saveResReadyRest", "", "fetchData", "", "getQrcodeImage", "Landroid/graphics/Bitmap;", "initFindView", "initSaveViewIfReady", "initView", "qrcodeConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setBottomBtnEnabled", "enabled", "setUserVisibleHint", "isVisibleToUser", "showDisableView", "showErrorView", "showHead", "head", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "showSuccessView", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.thirdshare.container.impl.d */
public final class LarkShareContainerQrcodeFragment extends BaseFragment {

    /* renamed from: c */
    public static final Companion f137544c = new Companion(null);

    /* renamed from: A */
    private TextView f137545A;

    /* renamed from: B */
    private TextView f137546B;

    /* renamed from: C */
    private HashMap f137547C;

    /* renamed from: a */
    public int f137548a = 2;

    /* renamed from: b */
    public ImageView f137549b;

    /* renamed from: d */
    private String f137550d;

    /* renamed from: e */
    private boolean f137551e;

    /* renamed from: f */
    private View f137552f;

    /* renamed from: g */
    private RelativeLayout f137553g;

    /* renamed from: h */
    private RelativeLayout f137554h;

    /* renamed from: i */
    private TextView f137555i;

    /* renamed from: j */
    private TextView f137556j;

    /* renamed from: k */
    private RelativeLayout f137557k;

    /* renamed from: l */
    private TextView f137558l;

    /* renamed from: m */
    private LinearLayout f137559m;

    /* renamed from: n */
    private SelectableRoundedImageView f137560n;

    /* renamed from: o */
    private TextView f137561o;

    /* renamed from: p */
    private TextView f137562p;

    /* renamed from: q */
    private RelativeLayout f137563q;

    /* renamed from: r */
    private TextView f137564r;

    /* renamed from: s */
    private TextView f137565s;

    /* renamed from: t */
    private TextView f137566t;

    /* renamed from: u */
    private TextView f137567u;

    /* renamed from: v */
    private LinearLayout f137568v;

    /* renamed from: w */
    private ImageView f137569w;

    /* renamed from: x */
    private TextView f137570x;

    /* renamed from: y */
    private TextView f137571y;

    /* renamed from: z */
    private ImageView f137572z;

    /* renamed from: d */
    public void mo189988d() {
        HashMap hashMap = this.f137547C;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo189988d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerQrcodeFragment$Companion;", "", "()V", "ARGS_ICON_SHAPE", "", "newInstance", "Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerQrcodeFragment;", "iconShape", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LarkShareContainerQrcodeFragment mo189989a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "iconShape");
            Bundle bundle = new Bundle();
            bundle.putString("ARGS_ICON_SHAPE", str);
            LarkShareContainerQrcodeFragment dVar = new LarkShareContainerQrcodeFragment();
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "get"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$b */
    public static final class C55747b<T> implements ApiUtils.AbstractC57749b<LarkShareContainerConfig.QrcodeConfig> {

        /* renamed from: a */
        public static final C55747b f137573a = new C55747b();

        C55747b() {
        }

        /* renamed from: b */
        public final LarkShareContainerConfig.QrcodeConfig mo189978a() {
            LarkShareContainerConfig b;
            LarkShareContainerConfig.QrcodeConfigSupplier c;
            LarkShareContainer b2 = LarkShareContainer.f137484c.mo189942b();
            if (b2 == null || (b = b2.mo189937b()) == null || (c = b.mo189880c()) == null) {
                return null;
            }
            return c.mo146278a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$f */
    public static final class RunnableC55751f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerQrcodeFragment f137577a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.QrcodeConfig f137578b;

        RunnableC55751f(LarkShareContainerQrcodeFragment dVar, LarkShareContainerConfig.QrcodeConfig fVar) {
            this.f137577a = dVar;
            this.f137578b = fVar;
        }

        public final void run() {
            C55735c.m215923a(new ApiUtils.AbstractC57749b<Bitmap>(this) {
                /* class com.ss.android.lark.thirdshare.container.impl.LarkShareContainerQrcodeFragment.RunnableC55751f.C557521 */

                /* renamed from: a */
                final /* synthetic */ RunnableC55751f f137579a;

                /* renamed from: b */
                public Bitmap mo189978a() {
                    return ((AbstractC55729a) ApiUtils.getApi(AbstractC55729a.class)).encodeQRCode(this.f137579a.f137578b.mo189916d(), LarkShareContainerQrcodeFragment.m215965a(this.f137579a.f137577a).getWidth(), LarkShareContainerQrcodeFragment.m215965a(this.f137579a.f137577a).getHeight(), UIHelper.dp2px(2.0f));
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f137579a = r1;
                }
            }, new ApiUtils.AbstractC57748a<Bitmap>(this) {
                /* class com.ss.android.lark.thirdshare.container.impl.LarkShareContainerQrcodeFragment.RunnableC55751f.C557532 */

                /* renamed from: a */
                final /* synthetic */ RunnableC55751f f137580a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f137580a = r1;
                }

                /* renamed from: a */
                public void consume(Bitmap bitmap) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        Log.m165383e("LarkShareContainer", "encode qrcode failed.");
                        return;
                    }
                    LarkShareContainerQrcodeFragment.m215965a(this.f137580a.f137577a).setImageBitmap(bitmap);
                    this.f137580a.f137577a.mo189987c();
                }
            });
        }
    }

    /* renamed from: b */
    public final Bitmap mo189986b() {
        LinearLayout linearLayout = this.f137568v;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqSaveLl");
        }
        Bitmap a = C55731a.m215909a(linearLayout);
        Intrinsics.checkExpressionValueIsNotNull(a, "LscBitmapUtils.view2Bitmap(lscqSaveLl)");
        return a;
    }

    /* renamed from: a */
    public final void mo189984a() {
        RelativeLayout relativeLayout = this.f137553g;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscLoadingRl");
        }
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f137554h;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorRl");
        }
        relativeLayout2.setVisibility(8);
        RelativeLayout relativeLayout3 = this.f137557k;
        if (relativeLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscDisableRl");
        }
        relativeLayout3.setVisibility(8);
        RelativeLayout relativeLayout4 = this.f137563q;
        if (relativeLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscQrcodeRl");
        }
        relativeLayout4.setVisibility(8);
        C55735c.m215923a(C55747b.f137573a, new C55757e(new C55748c(this)));
    }

    /* renamed from: c */
    public final void mo189987c() {
        int i = this.f137548a - 1;
        this.f137548a = i;
        if (i == 0) {
            ImageView imageView = this.f137569w;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveAvatarIv");
            }
            SelectableRoundedImageView selectableRoundedImageView = this.f137560n;
            if (selectableRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqAvatarIv");
            }
            imageView.setImageDrawable(selectableRoundedImageView.getDrawable());
            TextView textView = this.f137570x;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveNameTv");
            }
            TextView textView2 = this.f137561o;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqNameTv");
            }
            textView.setText(textView2.getText());
            TextView textView3 = this.f137571y;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveDescTv");
            }
            TextView textView4 = this.f137562p;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqDescTv");
            }
            textView3.setVisibility(textView4.getVisibility());
            TextView textView5 = this.f137571y;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveDescTv");
            }
            TextView textView6 = this.f137562p;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqDescTv");
            }
            textView5.setText(textView6.getText());
            ImageView imageView2 = this.f137572z;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveQrcodeIv");
            }
            ImageView imageView3 = this.f137549b;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqQrcodeIv");
            }
            imageView2.setImageDrawable(imageView3.getDrawable());
            TextView textView7 = this.f137545A;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveExpiredTipTv");
            }
            TextView textView8 = this.f137564r;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqExpiredTipTv");
            }
            textView7.setVisibility(textView8.getVisibility());
            TextView textView9 = this.f137545A;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveExpiredTipTv");
            }
            TextView textView10 = this.f137564r;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqExpiredTipTv");
            }
            textView9.setText(textView10.getText());
            TextView textView11 = this.f137546B;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveTipTv");
            }
            TextView textView12 = this.f137565s;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqTipTv");
            }
            textView11.setVisibility(textView12.getVisibility());
            TextView textView13 = this.f137546B;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqSaveTipTv");
            }
            TextView textView14 = this.f137565s;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqTipTv");
            }
            textView13.setText(textView14.getText());
        }
    }

    /* renamed from: e */
    private final void m215971e() {
        View view = this.f137552f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById = view.findViewById(R.id.lscLoadingRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.lscLoadingRl)");
        this.f137553g = (RelativeLayout) findViewById;
        View view2 = this.f137552f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.lscErrorRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.lscErrorRl)");
        this.f137554h = (RelativeLayout) findViewById2;
        View view3 = this.f137552f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.lscErrorTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.lscErrorTipTv)");
        this.f137555i = (TextView) findViewById3;
        View view4 = this.f137552f;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById4 = view4.findViewById(R.id.lscErrorRetryTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.lscErrorRetryTv)");
        this.f137556j = (TextView) findViewById4;
        View view5 = this.f137552f;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById5 = view5.findViewById(R.id.lscDisableRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.lscDisableRl)");
        this.f137557k = (RelativeLayout) findViewById5;
        View view6 = this.f137552f;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById6 = view6.findViewById(R.id.lscDisableTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.lscDisableTipTv)");
        this.f137558l = (TextView) findViewById6;
        View view7 = this.f137552f;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById7 = view7.findViewById(R.id.lscqHeadLl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.lscqHeadLl)");
        this.f137559m = (LinearLayout) findViewById7;
        View view8 = this.f137552f;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById8 = view8.findViewById(R.id.lscqAvatarIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.lscqAvatarIv)");
        this.f137560n = (SelectableRoundedImageView) findViewById8;
        View view9 = this.f137552f;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById9 = view9.findViewById(R.id.lscqNameTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.lscqNameTv)");
        this.f137561o = (TextView) findViewById9;
        View view10 = this.f137552f;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById10 = view10.findViewById(R.id.lscqDescTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.lscqDescTv)");
        this.f137562p = (TextView) findViewById10;
        View view11 = this.f137552f;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById11 = view11.findViewById(R.id.lscQrcodeRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.id.lscQrcodeRl)");
        this.f137563q = (RelativeLayout) findViewById11;
        View view12 = this.f137552f;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById12 = view12.findViewById(R.id.lscqQrcodeIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.id.lscqQrcodeIv)");
        this.f137549b = (ImageView) findViewById12;
        View view13 = this.f137552f;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById13 = view13.findViewById(R.id.lscqExpiredTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.id.lscqExpiredTipTv)");
        this.f137564r = (TextView) findViewById13;
        View view14 = this.f137552f;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById14 = view14.findViewById(R.id.lscqTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "rootView.findViewById(R.id.lscqTipTv)");
        this.f137565s = (TextView) findViewById14;
        View view15 = this.f137552f;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById15 = view15.findViewById(R.id.lscqSaveTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "rootView.findViewById(R.id.lscqSaveTv)");
        this.f137566t = (TextView) findViewById15;
        View view16 = this.f137552f;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById16 = view16.findViewById(R.id.lscqShareTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById16, "rootView.findViewById(R.id.lscqShareTv)");
        this.f137567u = (TextView) findViewById16;
        View view17 = this.f137552f;
        if (view17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById17 = view17.findViewById(R.id.lscqSaveLl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById17, "rootView.findViewById(R.id.lscqSaveLl)");
        this.f137568v = (LinearLayout) findViewById17;
        View view18 = this.f137552f;
        if (view18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById18 = view18.findViewById(R.id.lscqSaveAvatarIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById18, "rootView.findViewById(R.id.lscqSaveAvatarIv)");
        this.f137569w = (ImageView) findViewById18;
        View view19 = this.f137552f;
        if (view19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById19 = view19.findViewById(R.id.lscqSaveNameTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById19, "rootView.findViewById(R.id.lscqSaveNameTv)");
        this.f137570x = (TextView) findViewById19;
        View view20 = this.f137552f;
        if (view20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById20 = view20.findViewById(R.id.lscqSaveDescTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById20, "rootView.findViewById(R.id.lscqSaveDescTv)");
        this.f137571y = (TextView) findViewById20;
        View view21 = this.f137552f;
        if (view21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById21 = view21.findViewById(R.id.lscqSaveQrcodeIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById21, "rootView.findViewById(R.id.lscqSaveQrcodeIv)");
        this.f137572z = (ImageView) findViewById21;
        View view22 = this.f137552f;
        if (view22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById22 = view22.findViewById(R.id.lscqSaveExpiredTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById22, "rootView.findViewById(R.id.lscqSaveExpiredTipTv)");
        this.f137545A = (TextView) findViewById22;
        View view23 = this.f137552f;
        if (view23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById23 = view23.findViewById(R.id.lscqSaveTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById23, "rootView.findViewById(R.id.lscqSaveTipTv)");
        this.f137546B = (TextView) findViewById23;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "Lkotlin/ParameterName;", "name", "qrcodeConfig", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$c */
    public static final /* synthetic */ class C55748c extends FunctionReference implements Function1<LarkShareContainerConfig.QrcodeConfig, Unit> {
        C55748c(LarkShareContainerQrcodeFragment dVar) {
            super(1, dVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "initView";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(LarkShareContainerQrcodeFragment.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "initView(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LarkShareContainerConfig.QrcodeConfig fVar) {
            invoke(fVar);
            return Unit.INSTANCE;
        }

        public final void invoke(LarkShareContainerConfig.QrcodeConfig fVar) {
            ((LarkShareContainerQrcodeFragment) this.receiver).mo189985a(fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/thirdshare/container/impl/LarkShareContainerQrcodeFragment$showHead$consumer$1", "Lcom/ss/android/lark/utils/ApiUtils$Consumer;", "Landroid/graphics/Bitmap;", "consume", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$e */
    public static final class C55750e implements ApiUtils.AbstractC57748a<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerQrcodeFragment f137576a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55750e(LarkShareContainerQrcodeFragment dVar) {
            this.f137576a = dVar;
        }

        /* renamed from: a */
        public void consume(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m165383e("LarkShareContainer", "encode qrcode failed.");
            } else {
                this.f137576a.mo189987c();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m215965a(LarkShareContainerQrcodeFragment dVar) {
        ImageView imageView = dVar.f137549b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqQrcodeIv");
        }
        return imageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$d */
    public static final class View$OnClickListenerC55749d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerQrcodeFragment f137574a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.QrcodeConfig f137575b;

        View$OnClickListenerC55749d(LarkShareContainerQrcodeFragment dVar, LarkShareContainerConfig.QrcodeConfig fVar) {
            this.f137574a = dVar;
            this.f137575b = fVar;
        }

        public final void onClick(View view) {
            this.f137574a.mo189984a();
            LarkShareContainerConfig.RetryCallback i = this.f137575b.mo189921i();
            if (i != null) {
                i.mo146277a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$g */
    public static final class View$OnClickListenerC55754g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerQrcodeFragment f137581a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.QrcodeConfig f137582b;

        View$OnClickListenerC55754g(LarkShareContainerQrcodeFragment dVar, LarkShareContainerConfig.QrcodeConfig fVar) {
            this.f137581a = dVar;
            this.f137582b = fVar;
        }

        public final void onClick(View view) {
            if (this.f137581a.f137548a == 0) {
                C55680a.m215698a(this.f137581a.getContext(), this.f137581a.mo189986b(), new C55680a.AbstractC55692a(this) {
                    /* class com.ss.android.lark.thirdshare.container.impl.LarkShareContainerQrcodeFragment.View$OnClickListenerC55754g.C557551 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC55754g f137583a;

                    @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
                    public void noNoPermission() {
                        LarkShareContainerConfig.QrcodeCallback g = this.f137583a.f137582b.mo189919g();
                        if (g != null) {
                            g.noNoPermission();
                        }
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f137583a = r1;
                    }

                    @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
                    public void onSaveFailed(String str) {
                        Intrinsics.checkParameterIsNotNull(str, "msg");
                        LarkShareContainerConfig.QrcodeCallback g = this.f137583a.f137582b.mo189919g();
                        if (g != null) {
                            g.onSaveFailed(str);
                        }
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
                    }

                    @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
                    public void onSaveSuccess(File file) {
                        Intrinsics.checkParameterIsNotNull(file, "file");
                        LarkShareContainerConfig.QrcodeCallback g = this.f137583a.f137582b.mo189919g();
                        if (g != null) {
                            g.onSaveSuccess(file);
                        }
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_QrCodeSaveAlbum);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private final void m215967a(boolean z) {
        TextView textView = this.f137566t;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqSaveTv");
        }
        textView.setEnabled(z);
        TextView textView2 = this.f137567u;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqShareTv");
        }
        textView2.setEnabled(z);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("ARGS_ICON_SHAPE")) == null) {
            str = "circle";
        }
        this.f137550d = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.d$h */
    public static final class View$OnClickListenerC55756h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerQrcodeFragment f137584a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.QrcodeConfig f137585b;

        View$OnClickListenerC55756h(LarkShareContainerQrcodeFragment dVar, LarkShareContainerConfig.QrcodeConfig fVar) {
            this.f137584a = dVar;
            this.f137585b = fVar;
        }

        public final void onClick(View view) {
            ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(this.f137584a.getContext(), new ShareEntity.C55696a(this.f137584a.mo189986b()).mo189775b(this.f137585b.mo189913b()).mo189764a(new LarkShareContainerQrcodeFragment$showSuccessView$3$shareEntity$1(this)).mo189769a());
        }
    }

    /* renamed from: c */
    private final void m215969c(LarkShareContainerConfig.QrcodeConfig fVar) {
        RelativeLayout relativeLayout = this.f137554h;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorRl");
        }
        relativeLayout.setVisibility(0);
        TextView textView = this.f137555i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorTipTv");
        }
        textView.setText(fVar.mo189920h());
        TextView textView2 = this.f137556j;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorRetryTv");
        }
        textView2.setOnClickListener(new View$OnClickListenerC55749d(this, fVar));
        m215967a(false);
    }

    /* renamed from: d */
    private final void m215970d(LarkShareContainerConfig.QrcodeConfig fVar) {
        RelativeLayout relativeLayout = this.f137557k;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscDisableRl");
        }
        relativeLayout.setVisibility(0);
        TextView textView = this.f137558l;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscDisableTipTv");
        }
        textView.setText(fVar.mo189922j());
        m215967a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && !this.f137551e) {
            this.f137551e = true;
            mo189984a();
        }
        Log.m165379d("LarkShareContainer", "LarkShareContainerQrcodeFragment setUserVisibleHint:" + z);
    }

    /* renamed from: a */
    private final void m215966a(LarkShareContainerConfig.Head head) {
        if (head != null) {
            LinearLayout linearLayout = this.f137559m;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqHeadLl");
            }
            linearLayout.setVisibility(0);
            String str = this.f137550d;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconShape");
            }
            if (Intrinsics.areEqual(str, "round_rect")) {
                SelectableRoundedImageView selectableRoundedImageView = this.f137560n;
                if (selectableRoundedImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lscqAvatarIv");
                }
                selectableRoundedImageView.setOval(false);
                float dp2px = (float) UIHelper.dp2px(4.0f);
                SelectableRoundedImageView selectableRoundedImageView2 = this.f137560n;
                if (selectableRoundedImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lscqAvatarIv");
                }
                selectableRoundedImageView2.mo85893a(dp2px, dp2px, dp2px, dp2px);
            }
            C55750e eVar = new C55750e(this);
            String avatarEntityId = head.getAvatarEntityId();
            if (avatarEntityId != null) {
                String avatar = head.getAvatar();
                SelectableRoundedImageView selectableRoundedImageView3 = this.f137560n;
                if (selectableRoundedImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lscqAvatarIv");
                }
                C55732b.m215914a(avatar, avatarEntityId, selectableRoundedImageView3, eVar);
            } else {
                String avatar2 = head.getAvatar();
                SelectableRoundedImageView selectableRoundedImageView4 = this.f137560n;
                if (selectableRoundedImageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lscqAvatarIv");
                }
                C55732b.m215912a(avatar2, selectableRoundedImageView4, eVar);
            }
            TextView textView = this.f137561o;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqNameTv");
            }
            textView.setText(head.getName());
            if (!TextUtils.isEmpty(head.getDesc())) {
                TextView textView2 = this.f137562p;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lscqDescTv");
                }
                textView2.setVisibility(0);
                TextView textView3 = this.f137562p;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lscqDescTv");
                }
                textView3.setText(head.getDesc());
            }
        }
    }

    /* renamed from: b */
    private final void m215968b(LarkShareContainerConfig.QrcodeConfig fVar) {
        RelativeLayout relativeLayout = this.f137563q;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscQrcodeRl");
        }
        relativeLayout.setVisibility(0);
        m215966a(fVar.mo189915c());
        ImageView imageView = this.f137549b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqQrcodeIv");
        }
        imageView.post(new RunnableC55751f(this, fVar));
        if (!TextUtils.isEmpty(fVar.mo189917e())) {
            TextView textView = this.f137564r;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqExpiredTipTv");
            }
            textView.setVisibility(0);
            TextView textView2 = this.f137564r;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqExpiredTipTv");
            }
            textView2.setText(fVar.mo189917e());
        }
        if (!TextUtils.isEmpty(fVar.mo189918f())) {
            TextView textView3 = this.f137565s;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqTipTv");
            }
            textView3.setVisibility(0);
            TextView textView4 = this.f137565s;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lscqTipTv");
            }
            textView4.setText(fVar.mo189918f());
        }
        m215967a(true);
        TextView textView5 = this.f137566t;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqSaveTv");
        }
        textView5.setOnClickListener(new View$OnClickListenerC55754g(this, fVar));
        TextView textView6 = this.f137567u;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscqShareTv");
        }
        textView6.setOnClickListener(new View$OnClickListenerC55756h(this, fVar));
    }

    /* renamed from: a */
    public final void mo189985a(LarkShareContainerConfig.QrcodeConfig fVar) {
        if (fVar == null) {
            finish();
            Log.m165383e("LarkShareContainer", "qrcodeConfig is null");
            return;
        }
        RelativeLayout relativeLayout = this.f137553g;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscLoadingRl");
        }
        relativeLayout.setVisibility(8);
        String a = fVar.mo189886a();
        int hashCode = a.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 96784904) {
                if (hashCode == 1671308008 && a.equals("disable")) {
                    m215970d(fVar);
                    return;
                }
            } else if (a.equals("error")) {
                m215969c(fVar);
                return;
            }
        } else if (a.equals("success")) {
            m215968b(fVar);
            return;
        }
        Log.m165383e("LarkShareContainer", "status <" + fVar.mo189886a() + "> is wrong");
        finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m215971e();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (DesktopUtil.m144307b()) {
            i = R.layout.lark_share_container_qrcode_fragment_desktop;
        } else {
            i = R.layout.lark_share_container_qrcode_fragment;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(\n      …        container, false)");
        this.f137552f = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}

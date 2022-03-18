package com.ss.android.lark.profile.func.medal.wall;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.C1143ag;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.Success;
import com.larksuite.component.ignition.widget.blur.BlurHelper;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug.ListUserMedalsResponse;
import com.ss.android.lark.pb.ug.MedalItem;
import com.ss.android.lark.profile.func.medal.Medal;
import com.ss.android.lark.profile.func.medal.WearPerformanceFragment;
import com.ss.android.lark.profile.func.medal.service.MedalService;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0002H\u0014J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0006\u0010\u001b\u001a\u00020\u000eJ\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#J(\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+H\u0003J\u000e\u0010,\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#J\u0006\u0010-\u001a\u00020\u000eJ\u0006\u0010.\u001a\u00020\u000eJ \u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0006H\u0002J\u000e\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205J0\u00106\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u00062\u001e\u0010/\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e07H\u0002J\u0010\u00108\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0006H\u0002J\u0006\u00109\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006<"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "userId", "", "isResigned", "", "isSameTenant", "(Ljava/lang/String;ZZ)V", "()Z", "getUserId", "()Ljava/lang/String;", "defaultState", "doTakeOffUpdate", "", "medalItem", "Lcom/ss/android/lark/pb/ug/MedalItem;", "state", "medalBuilder", "Lcom/ss/android/lark/pb/ug/MedalItem$Builder;", "doWearUpdate", "getScreenshot", "activity", "Landroid/app/Activity;", "screenshot", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel$IScreenshot;", "isSelectedMedal", "loadMedalList", "makeScreenShotBlur", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "prepareMedalBackground", "removeWearFragment", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "screenshotAndroidO", "window", "Landroid/view/Window;", "view", "Landroid/view/View;", "dest", "listener", "Landroid/view/PixelCopy$OnPixelCopyFinishedListener;", "showWearPerformanceFragment", "start", "takeOffMedal", "updateMedalStatus", "medalId", "grantId", "isToWear", "updateSelectedMedal", "medal", "Lcom/ss/android/lark/profile/func/medal/Medal;", "updateSelectedMedalOfPbMedalList", "Lkotlin/Function3;", "updateStateOfMedalWorn", "wearMedal", "Companion", "IScreenshot", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.wall.o */
public final class MedalWallViewModel extends JackViewModel<MedalWallState> {
    public static final Companion Companion = new Companion(null);
    private final boolean isResigned;
    private final boolean isSameTenant;
    private final String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel$IScreenshot;", "", "onScreenshot", "", "bitmap", "Landroid/graphics/Bitmap;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$b */
    public interface IScreenshot {
        /* renamed from: a */
        void mo179391a(Bitmap bitmap);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isResigned() {
        return this.isResigned;
    }

    public final boolean isSameTenant() {
        return this.isSameTenant;
    }

    public final void start() {
        loadMedalList();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$h */
    public static final class RunnableC52435h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PixelCopy.OnPixelCopyFinishedListener f129881a;

        RunnableC52435h(PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
            this.f129881a = onPixelCopyFinishedListener;
        }

        public final void run() {
            this.f129881a.onPixelCopyFinished(1);
        }
    }

    public final void takeOffMedal() {
        withState(new C52436i(this));
    }

    public final void wearMedal() {
        withState(new C52444n(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$d */
    public static final class RunnableC52428d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f129875a;

        /* renamed from: b */
        final /* synthetic */ int f129876b;

        /* renamed from: c */
        final /* synthetic */ View f129877c;

        /* renamed from: d */
        final /* synthetic */ IScreenshot f129878d;

        RunnableC52428d(int i, int i2, View view, IScreenshot bVar) {
            this.f129875a = i;
            this.f129876b = i2;
            this.f129877c = view;
            this.f129878d = bVar;
        }

        public final void run() {
            Bitmap createBitmap = Bitmap.createBitmap(this.f129875a, this.f129876b, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            this.f129877c.draw(canvas);
            canvas.setBitmap(null);
            this.f129878d.mo179391a(createBitmap);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public MedalWallState defaultState() {
        return new MedalWallState(null, this.userId, this.isResigned, this.isSameTenant, false, null, null, null, null, 497, null);
    }

    public final void loadMedalList() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52429e(this, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$i */
    static final class C52436i extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52436i(MedalWallViewModel oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
            invoke(nVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalWallState nVar) {
            String str;
            String f;
            Intrinsics.checkParameterIsNotNull(nVar, "it");
            MedalWallViewModel oVar = this.this$0;
            Medal o = nVar.mo179371o();
            String str2 = "";
            if (o == null || (str = o.mo179230a()) == null) {
                str = str2;
            }
            Medal o2 = nVar.mo179371o();
            if (!(o2 == null || (f = o2.mo179236f()) == null)) {
                str2 = f;
            }
            oVar.updateMedalStatus(str, str2, false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$l */
    public static final class C52440l extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ boolean $isToWear;
        final /* synthetic */ Function3 $updateMedalStatus;
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52440l(MedalWallViewModel oVar, Function3 oVar2, boolean z) {
            super(1);
            this.this$0 = oVar;
            this.$updateMedalStatus = oVar2;
            this.$isToWear = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
            invoke(nVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalWallState nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "state");
            Async<ListUserMedalsResponse> j = nVar.mo179366j();
            if (j instanceof Success) {
                Success wVar = (Success) j;
                List<MedalItem> list = ((ListUserMedalsResponse) wVar.mo86206a()).mmedal_list;
                ArrayList arrayList = new ArrayList();
                Intrinsics.checkExpressionValueIsNotNull(list, "pbMedalList");
                for (T t : list) {
                    MedalItem.C50102a newBuilder = t.newBuilder();
                    Function3 oVar = this.$updateMedalStatus;
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    Intrinsics.checkExpressionValueIsNotNull(newBuilder, "this");
                    oVar.invoke(t, nVar, newBuilder);
                    MedalItem a = newBuilder.build();
                    Intrinsics.checkExpressionValueIsNotNull(a, "it.newBuilder().apply { …t, state, this) }.build()");
                    arrayList.add(a);
                }
                final ListUserMedalsResponse a2 = ((ListUserMedalsResponse) wVar.mo86206a()).newBuilder().mo174014a(arrayList).build();
                if (this.$isToWear) {
                    this.this$0.setState(new Function1<MedalWallState, MedalWallState>() {
                        /* class com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel.C52440l.C524411 */

                        public final MedalWallState invoke(MedalWallState nVar) {
                            Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                            return MedalWallState.m203168a(nVar, new Success(a2), null, false, false, false, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR, null);
                        }
                    });
                    return;
                }
                final String string = UIHelper.getString(R.string.Lark_Profile_TakenOffBadge);
                this.this$0.setState(new Function1<MedalWallState, MedalWallState>() {
                    /* class com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel.C52440l.C524422 */

                    public final MedalWallState invoke(MedalWallState nVar) {
                        Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                        return MedalWallState.m203168a(nVar, new Success(a2), null, false, false, false, null, null, new Event(string), null, 382, null);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$n */
    static final class C52444n extends Lambda implements Function1<MedalWallState, Unit> {
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52444n(MedalWallViewModel oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalWallState nVar) {
            invoke(nVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalWallState nVar) {
            String str;
            String f;
            Intrinsics.checkParameterIsNotNull(nVar, "it");
            MedalWallViewModel oVar = this.this$0;
            Medal o = nVar.mo179371o();
            String str2 = "";
            if (o == null || (str = o.mo179230a()) == null) {
                str = str2;
            }
            Medal o2 = nVar.mo179371o();
            if (!(o2 == null || (f = o2.mo179236f()) == null)) {
                str2 = f;
            }
            oVar.updateMedalStatus(str, str2, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/medal/wall/MedalWallViewModel$prepareMedalBackground$1", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallViewModel$IScreenshot;", "onScreenshot", "", "bitmap", "Landroid/graphics/Bitmap;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$g */
    public static final class C52434g implements IScreenshot {

        /* renamed from: a */
        final /* synthetic */ MedalWallViewModel f129879a;

        /* renamed from: b */
        final /* synthetic */ Activity f129880b;

        @Override // com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel.IScreenshot
        /* renamed from: a */
        public void mo179391a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f129879a.makeScreenShotBlur(this.f129880b, bitmap);
            }
        }

        C52434g(MedalWallViewModel oVar, Activity activity) {
            this.f129879a = oVar;
            this.f129880b = activity;
        }
    }

    public final void prepareMedalBackground(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        getScreenshot(activity, new C52434g(this, activity));
    }

    public final void updateSelectedMedal(Medal aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "medal");
        setState(new C52439k(aVar));
    }

    public final void updateStateOfMedalWorn(boolean z) {
        updateSelectedMedalOfPbMedalList(z, new C52443m(this, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "copyResult", "", "onPixelCopyFinished"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$c */
    public static final class PixelCopy$OnPixelCopyFinishedListenerC52427c implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        final /* synthetic */ IScreenshot f129873a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f129874b;

        PixelCopy$OnPixelCopyFinishedListenerC52427c(IScreenshot bVar, Bitmap bitmap) {
            this.f129873a = bVar;
            this.f129874b = bitmap;
        }

        public final void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.f129873a.mo179391a(this.f129874b);
            } else {
                this.f129873a.mo179391a(null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$k */
    static final class C52439k extends Lambda implements Function1<MedalWallState, MedalWallState> {
        final /* synthetic */ Medal $medal;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52439k(Medal aVar) {
            super(1);
            this.$medal = aVar;
        }

        public final MedalWallState invoke(MedalWallState nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
            return MedalWallState.m203168a(nVar, null, null, false, false, false, null, this.$medal, null, null, 447, null);
        }
    }

    public final void removeWearFragment(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("WearPerformanceFragment");
        Fragment findFragmentByTag2 = fragmentManager.findFragmentByTag("MedalWallFragment");
        if (!(findFragmentByTag2 instanceof MedalWallFragment)) {
            findFragmentByTag2 = null;
        }
        MedalWallFragment cVar = (MedalWallFragment) findFragmentByTag2;
        if (cVar == null) {
            Log.m165397w("MedalWallViewModel", "medalWallFragment is null when removeWearFragment");
        } else if (findFragmentByTag == null) {
            cVar.finish();
        } else {
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.show(cVar);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    public final void showWearPerformanceFragment(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("MedalWallFragment");
        if (findFragmentByTag != null) {
            beginTransaction.hide(findFragmentByTag);
            beginTransaction.add(16908290, new WearPerformanceFragment(), "WearPerformanceFragment");
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel$loadMedalList$1", mo239173f = "MedalWallViewModel.kt", mo239174i = {0}, mo239175l = {48}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$e */
    public static final class C52429e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52429e(MedalWallViewModel oVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52429e eVar = new C52429e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52429e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MedalService aVar = MedalService.f129785a;
                String userId = this.this$0.getUserId();
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo179241a(userId, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final RucketResult bVar = (RucketResult) obj;
            if (bVar instanceof RucketResult.Success) {
                this.this$0.setState(new Function1<MedalWallState, MedalWallState>() {
                    /* class com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel.C52429e.C524301 */

                    public final MedalWallState invoke(MedalWallState nVar) {
                        Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                        return MedalWallState.m203168a(nVar, new Success(bVar.mo93490a()), null, false, false, false, null, null, null, new Event(Unit.INSTANCE), 254, null);
                    }
                });
            } else if (bVar instanceof RucketResult.Error) {
                Log.m165397w("MedalWallViewModel", ((RucketResult.Error) bVar).mo93493c().getDisplayMsg());
                this.this$0.setState(C524312.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel$makeScreenShotBlur$1", mo239173f = "MedalWallViewModel.kt", mo239174i = {0, 0}, mo239175l = {193}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "color"}, mo239178s = {"L$0", "I$0"})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$f */
    public static final class C52432f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $activity;
        final /* synthetic */ Bitmap $bitmap;
        int I$0;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52432f(MedalWallViewModel oVar, Context context, Bitmap bitmap, Continuation cVar) {
            super(2, cVar);
            this.this$0 = oVar;
            this.$activity = context;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52432f fVar = new C52432f(this.this$0, this.$activity, this.$bitmap, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52432f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                int alphaColor = UDColorUtils.getAlphaColor(this.$activity, R.color.static_white, 0.4f);
                BlurHelper a2 = BlurHelper.f59989a.mo87028a();
                Context context = this.$activity;
                Bitmap bitmap = this.$bitmap;
                this.L$0 = ahVar;
                this.I$0 = alphaColor;
                this.label = 1;
                obj = a2.mo87025a(context, bitmap, alphaColor, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final Drawable drawable = (Drawable) obj;
            this.this$0.setState(new Function1<MedalWallState, MedalWallState>() {
                /* class com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel.C52432f.C524331 */

                public final MedalWallState invoke(MedalWallState nVar) {
                    Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                    return MedalWallState.m203168a(nVar, null, null, false, false, false, drawable, null, null, null, 479, null);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel$updateMedalStatus$1", mo239173f = "MedalWallViewModel.kt", mo239174i = {0}, mo239175l = {81}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$j */
    public static final class C52437j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $grantId;
        final /* synthetic */ boolean $isToWear;
        final /* synthetic */ String $medalId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52437j(MedalWallViewModel oVar, String str, String str2, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = oVar;
            this.$medalId = str;
            this.$grantId = str2;
            this.$isToWear = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52437j jVar = new C52437j(this.this$0, this.$medalId, this.$grantId, this.$isToWear, cVar);
            jVar.p$ = (CoroutineScope) obj;
            return jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C52437j) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MedalService aVar = MedalService.f129785a;
                String str = this.$medalId;
                String str2 = this.$grantId;
                String userId = this.this$0.getUserId();
                boolean z = this.$isToWear;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo179240a(str, str2, userId, z, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final RucketResult bVar = (RucketResult) obj;
            if (bVar instanceof RucketResult.Success) {
                this.this$0.updateStateOfMedalWorn(this.$isToWear);
            } else if (bVar instanceof RucketResult.Error) {
                Log.m165397w("MedalWallViewModel", "update medal status faild, isTowear:" + this.$isToWear);
                this.this$0.setState(new Function1<MedalWallState, MedalWallState>() {
                    /* class com.ss.android.lark.profile.func.medal.wall.MedalWallViewModel.C52437j.C524381 */

                    public final MedalWallState invoke(MedalWallState nVar) {
                        Intrinsics.checkParameterIsNotNull(nVar, "$receiver");
                        return MedalWallState.m203168a(nVar, null, null, false, false, false, null, null, new Event(((RucketResult.Error) bVar).mo93493c().getDisplayMsg()), null, 383, null);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    private final void updateSelectedMedalOfPbMedalList(boolean z, Function3<? super MedalItem, ? super MedalWallState, ? super MedalItem.C50102a, Unit> oVar) {
        withState(new C52440l(this, oVar, z));
    }

    public final void makeScreenShotBlur(Context context, Bitmap bitmap) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52432f(this, context, bitmap, null), 3, null);
    }

    private final boolean isSelectedMedal(MedalItem medalItem, MedalWallState nVar) {
        String str;
        String str2 = medalItem.mmedal_id;
        Medal o = nVar.mo179371o();
        String str3 = null;
        if (o != null) {
            str = o.mo179230a();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str2, str)) {
            String str4 = medalItem.mgrant_id;
            Medal o2 = nVar.mo179371o();
            if (o2 != null) {
                str3 = o2.mo179236f();
            }
            if (Intrinsics.areEqual(str4, str3)) {
                return true;
            }
        }
        return false;
    }

    private final void getScreenshot(Activity activity, IScreenshot bVar) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        Intrinsics.checkExpressionValueIsNotNull(viewGroup, "mainContainer");
        View rootView = viewGroup.getRootView();
        if (rootView == null) {
            Log.m165383e("MedalWallViewModel", "getScreenshot view is null ");
            bVar.mo179391a(null);
            return;
        }
        int width = rootView.getWidth();
        if (width <= 0) {
            Log.m165383e("MedalWallViewModel", "getScreenshot view.getWidth() <= 0, view.getWidth() = " + width);
            bVar.mo179391a(null);
            return;
        }
        int height = rootView.getHeight();
        if (height <= 0) {
            Log.m165383e("MedalWallViewModel", "getScreenshot view.getHeight() <= 0, view.getWidth() = " + height);
            bVar.mo179391a(null);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Window window = activity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            Intrinsics.checkExpressionValueIsNotNull(createBitmap, "newBitmap");
            screenshotAndroidO(window, rootView, createBitmap, new PixelCopy$OnPixelCopyFinishedListenerC52427c(bVar, createBitmap));
        } else {
            UICallbackExecutor.execute(new RunnableC52428d(width, height, rootView, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "medalItem", "Lcom/ss/android/lark/pb/ug/MedalItem;", "state", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallState;", "medalBuilder", "Lcom/ss/android/lark/pb/ug/MedalItem$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.o$m */
    public static final class C52443m extends Lambda implements Function3<MedalItem, MedalWallState, MedalItem.C50102a, Unit> {
        final /* synthetic */ boolean $isToWear;
        final /* synthetic */ MedalWallViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52443m(MedalWallViewModel oVar, boolean z) {
            super(3);
            this.this$0 = oVar;
            this.$isToWear = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(MedalItem medalItem, MedalWallState nVar, MedalItem.C50102a aVar) {
            invoke(medalItem, nVar, aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MedalItem medalItem, MedalWallState nVar, MedalItem.C50102a aVar) {
            Intrinsics.checkParameterIsNotNull(medalItem, "medalItem");
            Intrinsics.checkParameterIsNotNull(nVar, "state");
            Intrinsics.checkParameterIsNotNull(aVar, "medalBuilder");
            if (this.$isToWear) {
                this.this$0.doWearUpdate(medalItem, nVar, aVar);
            } else {
                this.this$0.doTakeOffUpdate(medalItem, nVar, aVar);
            }
        }
    }

    public MedalWallViewModel(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.userId = str;
        this.isResigned = z;
        this.isSameTenant = z2;
    }

    public final void doTakeOffUpdate(MedalItem medalItem, MedalWallState nVar, MedalItem.C50102a aVar) {
        if (isSelectedMedal(medalItem, nVar)) {
            aVar.mo174019a(MedalItem.MedalStatus.VALID);
        }
    }

    public final void doWearUpdate(MedalItem medalItem, MedalWallState nVar, MedalItem.C50102a aVar) {
        if (isSelectedMedal(medalItem, nVar)) {
            aVar.mo174019a(MedalItem.MedalStatus.TAKING);
        } else if (medalItem.mstatus == MedalItem.MedalStatus.TAKING) {
            aVar.mo174019a(MedalItem.MedalStatus.VALID);
        }
    }

    public final void updateMedalStatus(String str, String str2, boolean z) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C52437j(this, str, str2, z, null), 3, null);
    }

    private final void screenshotAndroidO(Window window, View view, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        try {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            PixelCopy.request(window, new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight()), bitmap, onPixelCopyFinishedListener, handler);
        } catch (Throwable th) {
            Log.m165384e("MedalWallViewModel", "screenshotAndroidO error", th);
            if (onPixelCopyFinishedListener != null) {
                handler.post(new RunnableC52435h(onPixelCopyFinishedListener));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MedalWallViewModel(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }
}

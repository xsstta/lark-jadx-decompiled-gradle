package com.ss.android.lark.profile.func.v3.userprofile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C0768a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleAwareLazy;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.decoration.avatar.DecoratedAvatar;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.layout.LKUIFrameLayout;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.C26280j;
import com.larksuite.framework.utils.NetworkUtils;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.image.impl.PerfLoadPicMonitor;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.add_friend.UserAuthorityUtils;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingActivity;
import com.ss.android.lark.profile.func.profile_setting.ProfileSettingInitData;
import com.ss.android.lark.profile.func.user_profile.UserProfileDrawEventPlus;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import com.ss.android.lark.profile.func.v3.userprofile.action.ActionBtnBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.di.ViewModelFactory;
import com.ss.android.lark.profile.func.v3.userprofile.p2534a.C52662c;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.lark.profile.func.v3.userprofile.tag.ProfileDepartmentTagBuilder;
import com.ss.android.lark.profile.func.v3.userprofile.tag.ProfileNameTagBuilder;
import com.ss.android.lark.profile.func.v3.userprofile.view.CtaView;
import com.ss.android.lark.profile.func.v3.userprofile.view.ProfileUserMedalView;
import com.ss.android.lark.profile.func.v3.userprofile.view.StatusCardBuilder;
import com.ss.android.lark.profile.func.v3.userprofile.view.TextViewTagLayout;
import com.ss.android.lark.profile.service.C52904e;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfileExtraParams;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.profile.statistics.UserProfilePerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58630d;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.span.C59170l;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import dagger.AbstractC68108a;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002\f,\b\u0007\u0018\u0000 Ì\u00012\u00020\u00012\u00020\u0002:\u0002Ì\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020LH\u0002J\u0012\u0010I\u001a\u0004\u0018\u00010M2\u0006\u0010K\u001a\u00020NH\u0002J(\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020P2\u0006\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020W2\u0006\u0010_\u001a\u00020\u000fH\u0002J\b\u0010`\u001a\u00020WH\u0002J\b\u0010a\u001a\u00020WH\u0002J\b\u0010b\u001a\u00020WH\u0002J\b\u0010c\u001a\u00020dH\u0002J\"\u0010e\u001a\u00020W2\u0006\u0010f\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020\u000f2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u0018\u0010j\u001a\u00020W2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u000fH\u0002J\u0010\u0010n\u001a\u00020W2\u0006\u0010o\u001a\u00020YH\u0002J\u0012\u0010p\u001a\u00020W2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J$\u0010s\u001a\u00020Y2\u0006\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0010\u0010x\u001a\u00020W2\u0006\u0010y\u001a\u00020zH\u0002J\b\u0010{\u001a\u00020WH\u0002J\b\u0010|\u001a\u00020WH\u0002J\u0018\u0010}\u001a\u00020W2\u0006\u0010~\u001a\u00020\u00152\u0006\u0010y\u001a\u00020zH\u0002J\b\u0010\u001a\u00020WH\u0002J\t\u0010\u0001\u001a\u00020WH\u0016J\t\u0010\u0001\u001a\u00020WH\u0002J\t\u0010\u0001\u001a\u00020WH\u0014J\t\u0010\u0001\u001a\u00020WH\u0002J\u0013\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020WH\u0002J\t\u0010\u0001\u001a\u00020WH\u0002J\t\u0010\u0001\u001a\u00020WH\u0002J\u0013\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001c\u0010\u0001\u001a\u00020W2\u0007\u0010\u0001\u001a\u00020Y2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0012\u0010\u0001\u001a\u00020W2\u0007\u0010\u0001\u001a\u00020dH\u0002J.\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020d2\u0006\u0010o\u001a\u00020YH\u0002J%\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010o\u001a\u00020YH\u0002J\u0015\u0010\u0001\u001a\u00020W2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J%\u0010\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010o\u001a\u00020YH\u0002J\u0011\u0010\u0001\u001a\u00020W2\u0006\u0010o\u001a\u00020YH\u0002J\u001c\u0010\u0001\u001a\u00020W2\b\u0010 \u0001\u001a\u00030\u00012\u0007\u0010¡\u0001\u001a\u00020YH\u0002J2\u0010¢\u0001\u001a\u00020W2\n\u0010 \u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010£\u0001\u001a\u00020Y2\b\u0010¤\u0001\u001a\u00030\u0001H\u0002J\t\u0010¥\u0001\u001a\u00020WH\u0002J\t\u0010¦\u0001\u001a\u00020WH\u0002J\u0012\u0010§\u0001\u001a\u00020W2\u0007\u0010¨\u0001\u001a\u00020dH\u0002J\u0011\u0010©\u0001\u001a\u00020W2\u0006\u0010o\u001a\u00020YH\u0002J\u0013\u0010ª\u0001\u001a\u00020W2\b\u0010«\u0001\u001a\u00030\u0001H\u0002J%\u0010¬\u0001\u001a\u00020W2\u0006\u0010Z\u001a\u00020[2\b\u0010\u0001\u001a\u00030\u00012\b\u0010­\u0001\u001a\u00030\u0001H\u0002J\t\u0010®\u0001\u001a\u00020WH\u0002J\u001c\u0010¯\u0001\u001a\u00020W2\b\u0010°\u0001\u001a\u00030\u00012\u0007\u0010±\u0001\u001a\u00020\u000fH\u0002J\t\u0010²\u0001\u001a\u00020WH\u0002J\t\u0010³\u0001\u001a\u00020WH\u0002J-\u0010´\u0001\u001a\u00020W2\u0007\u0010µ\u0001\u001a\u00020d2\u0007\u0010¶\u0001\u001a\u00020d2\u0007\u0010·\u0001\u001a\u00020d2\u0007\u0010¸\u0001\u001a\u00020dH\u0002J\t\u0010¹\u0001\u001a\u00020WH\u0002J\u0013\u0010º\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010»\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010¼\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u001d\u0010½\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u00012\b\u0010¾\u0001\u001a\u00030¿\u0001H\u0002J\u001d\u0010À\u0001\u001a\u00020W2\b\u0010\u0001\u001a\u00030\u00012\b\u0010Á\u0001\u001a\u00030¿\u0001H\u0002J\t\u0010Â\u0001\u001a\u00020WH\u0002J\t\u0010Ã\u0001\u001a\u00020WH\u0002J\u000f\u0010Ä\u0001\u001a\u00030\u0001*\u00030Å\u0001H\u0002J\u0019\u0010Æ\u0001\u001a\u00020W*\u00030Ç\u00012\t\u0010È\u0001\u001a\u0004\u0018\u00010\"H\u0002J\u0017\u0010É\u0001\u001a\u00020W*\u0002072\b\u0010Ê\u0001\u001a\u00030\u0001H\u0002J\u0016\u0010\u0001\u001a\u00020W*\u00020Y2\u0007\u0010Ë\u0001\u001a\u00020dH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020,X\u0004¢\u0006\u0004\n\u0002\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X.¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b<\u0010\u0019\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020>8BX\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b?\u0010@R\u001e\u0010C\u001a\u00020D8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006Í\u0001"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "actionBtnBinder", "Ldagger/Lazy;", "Lcom/ss/android/lark/profile/func/v3/userprofile/action/ActionBtnBinderV3;", "getActionBtnBinder", "()Ldagger/Lazy;", "setActionBtnBinder", "(Ldagger/Lazy;)V", "avatarImageListener", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$avatarImageListener$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$avatarImageListener$1;", "avatarSize", "", "avatarTopMargin", "coordinator", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2;", "ctaViews", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView;", "getCtaViews", "()Ljava/util/List;", "ctaViews$delegate", "Lkotlin/Lazy;", "focusClickListener", "Landroid/content/DialogInterface$OnClickListener;", "onOffsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "getOnOffsetChangedListener", "()Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "onOffsetChangedListener$delegate", "openCustomStatusListener", "Landroid/view/View$OnClickListener;", "profileModuleDependency", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "getProfileModuleDependency", "()Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "setProfileModuleDependency", "(Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;)V", "rootFrameLayout", "Lcom/larksuite/component/ui/layout/LKUIFrameLayout;", "singleClickUtil", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$singleClickUtil$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$singleClickUtil$1;", "tabAdapter", "Lcom/ss/android/lark/profile/func/v3/userprofile/ProfileTabAdapter;", "getTabAdapter", "()Lcom/ss/android/lark/profile/func/v3/userprofile/ProfileTabAdapter;", "setTabAdapter", "(Lcom/ss/android/lark/profile/func/v3/userprofile/ProfileTabAdapter;)V", "titleAvatarView", "Landroid/widget/ImageView;", "titleNameView", "Landroid/widget/TextView;", "userAvatarView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "getUserAvatarView", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "userAvatarView$delegate", "viewModel", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "getViewModel", "()Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "viewModel$delegate", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "viewModelFactory", "Lcom/ss/android/lark/profile/func/v3/userprofile/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ss/android/lark/profile/func/v3/userprofile/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ss/android/lark/profile/func/v3/userprofile/di/ViewModelFactory;)V", "buildTag", "Landroid/graphics/drawable/Drawable;", "tagInfo", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$DepartmentTagInfo;", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$NameTagInfo;", "calcOffsetAlpha", "", "start", "end", "offset", "factor", "", "createP2pSecretChat", "", "createTitleCenter", "Landroid/view/View;", "context", "Landroid/content/Context;", "getLoadErrorSpan", "Landroid/text/SpannableString;", "handleVcLauncherError", "error", "initListeners", "initSubscribers", "initViews", "isEnterParamsValidity", "", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onAppBarOffsetChanged", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "onAvatarClicked", "clickView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtaChatClicked", "ctaInfo", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$CtaInfo;", "onCtaCryptoChatClicked", "onCtaVideoClicked", "onCtaViewClicked", "ctaView", "onCtaVoiceClicked", "onDestroyView", "onEditNameCardClick", "onFinish", "onMoreButtonClicked", "onPhoneClicked", "phone", "", "onSelfStatusClicked", "onShareClicked", "onSpecialFocusViewClick", "onUrlClicked", "url", "onViewCreated", "view", "onboardingShowChangeVisibility", "show", "openAvatar", "avatarKey", "userId", "isSelf", "openCommonAvatar", "openEditUserStatus", "description", "Lcom/bytedance/lark/pb/basic/v1/Chatter$Description;", "openProfileSetting", "profileSettingInitData", "Lcom/ss/android/lark/profile/func/profile_setting/ProfileSettingInitData;", "openSecretChat", "chatId", "openSelfAvatar", "preparePreviewCover", "previewOthersCover", "imageKey", "imageView", "previewSelfCover", "coverView", "toolText", "registerTabSelectListenerForCommonInfo", "registerTabSelectListenerForMoments", "sendChatHitPoint", "isResigned", "showAvatar", "showCreateSecretConfirmDialog", "userName", "showCustomStatusTitleDialog", "title", "showDeleteNameCardDialog", "showIconToast", "toastStr", "iconRes", "showMedalDetail", "showNameCardEditorMenu", "showPhoneCallSelectMenu", "showEnterprisePhoneCall", "showPhoneCall", "showEmergencyCall", "showVoiceCall", "showSpecialFocusDialog", "startEmergencyCall", "startEnterpriseCall", "startQueryPhoneNumber", "startVideoChat", "launcherCallback", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency$IVCLaunchCallback;", "startVoiceCall", "launchCallback", "unRegisterTabSelectListenerForCommonInfo", "unRegisterTabSelectListenerForMoments", "displayText", "Lcom/bytedance/lark/pb/basic/v1/WorkStatus;", "setChildrenOnClickListener", "Landroidx/constraintlayout/widget/Group;", "listener", "setTextAndShow", "text", "isShow", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
@AndroidEntryPoint
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g */
public final class UserProfileFragmentV3 extends AbstractC52660a implements JackView {

    /* renamed from: k */
    public static final Companion f130589k = new Companion(null);
    @Inject

    /* renamed from: a */
    public ViewModelFactory f130590a;
    @Inject

    /* renamed from: b */
    public ProfileTabAdapter f130591b;

    /* renamed from: c */
    public final C52814b f130592c = new C52814b();
    @Inject

    /* renamed from: d */
    public IProfileModuleDependency f130593d;
    @Inject

    /* renamed from: e */
    public AbstractC68108a<ActionBtnBinderV3> f130594e;

    /* renamed from: f */
    public ImageView f130595f;

    /* renamed from: g */
    public TextView f130596g;

    /* renamed from: h */
    public final View.OnClickListener f130597h = new ax(this);

    /* renamed from: i */
    public final int f130598i = UIHelper.dp2px(108.0f);

    /* renamed from: j */
    public final bk f130599j = new bk(this);

    /* renamed from: l */
    private final LifecycleAwareLazy f130600l;

    /* renamed from: m */
    private final Lazy f130601m = LazyKt.lazy(new C52823d(this));

    /* renamed from: n */
    private LKUIFrameLayout f130602n;

    /* renamed from: o */
    private UDTabLayoutCoordinator2 f130603o;

    /* renamed from: p */
    private final Lazy f130604p = LazyKt.lazy(new C52812at(this));

    /* renamed from: q */
    private final int f130605q = UIHelper.dp2px(108.0f);

    /* renamed from: r */
    private final Lazy f130606r = LazyKt.lazy(new bl(this));

    /* renamed from: s */
    private final DialogInterface.OnClickListener f130607s = new DialogInterface$OnClickListenerC52824e(this);

    /* renamed from: t */
    private HashMap f130608t;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$al */
    public static final class al implements View.OnLongClickListener {

        /* renamed from: a */
        public static final al f130616a = new al();

        al() {
        }

        public final boolean onLongClick(View view) {
            return false;
        }
    }

    /* renamed from: y */
    private final AppBarLayout.AbstractC22134b m204472y() {
        return (AppBarLayout.AbstractC22134b) this.f130604p.getValue();
    }

    /* renamed from: z */
    private final LKUIRoundedImageView2 m204473z() {
        return (LKUIRoundedImageView2) this.f130606r.getValue();
    }

    /* renamed from: b */
    public View mo180360b(int i) {
        if (this.f130608t == null) {
            this.f130608t = new HashMap();
        }
        View view = (View) this.f130608t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f130608t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public final UserProfileViewModel mo180371g() {
        return (UserProfileViewModel) this.f130600l.getValue();
    }

    /* renamed from: h */
    public final List<CtaView> mo180373h() {
        return (List) this.f130601m.getValue();
    }

    /* renamed from: x */
    public void mo180389x() {
        HashMap hashMap = this.f130608t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$Companion;", "", "()V", "AVATAR_SIZE", "", "COVER_PREVIEW_REQUEST_CODE", "FOCUSED_TAG", "", "INDEX_MEDAL_DETAIL", "INDEX_SHOW_AVATAR", "TAG", "TITLE_AVATAR_SIZE", "TRANSLATION_ON_Y", "UNFOCUSED_TAG", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016J6\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$avatarImageListener$1", "Lcom/ss/android/lark/biz/core/api/ListenerParams$RequestListener;", "onException", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onResourceReady", "resource", "", "model", "target", "dataSource", "Lcom/ss/android/lark/image/api/DataSource;", "isFirstResource", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$b */
    public static final class C52814b implements ListenerParams.RequestListener {
        @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
        /* renamed from: a */
        public void mo105410a(Exception exc) {
        }

        C52814b() {
        }

        @Override // com.ss.android.lark.biz.core.api.ListenerParams.RequestListener
        /* renamed from: a */
        public void mo105411a(Object obj, Object obj2, Object obj3, DataSource dataSource, boolean z) {
            Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180620j();
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180616f();
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }

    /* renamed from: a */
    public final void mo180353a(String str, int i) {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "it");
        new UDToast.Builder(requireContext).mo91643a(str).mo91641a(UDIconUtils.getIconDrawable(requireContext, i, UDColorUtils.getColor(requireContext, R.color.static_white))).mo91655j().show();
    }

    /* renamed from: a */
    public final void mo180358a(boolean z) {
        UIUtils.display((TextViewTagLayout) mo180360b(R.id.user_department_layout), z);
        UIUtils.display((LinkEmojiTextView) mo180360b(R.id.user_status), z);
        UIUtils.display((UDTabLayout) mo180360b(R.id.tab), z);
        UIUtils.display((ViewPager2) mo180360b(R.id.viewPager), z);
    }

    /* renamed from: a */
    public final void mo180349a(AppBarLayout appBarLayout, int i) {
        int i2;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            int i3 = -i;
            ImageView imageView = (ImageView) mo180360b(R.id.header_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "header_image");
            int height = imageView.getHeight();
            CommonTitleBar commonTitleBar = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "title_bar");
            float height2 = ((float) (height - commonTitleBar.getHeight())) / 3.0f;
            TextViewTagLayout textViewTagLayout = (TextViewTagLayout) mo180360b(R.id.user_name_layout);
            Intrinsics.checkExpressionValueIsNotNull(textViewTagLayout, "user_name_layout");
            int bottom = textViewTagLayout.getBottom();
            CommonTitleBar commonTitleBar2 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "title_bar");
            float height3 = (float) (bottom - commonTitleBar2.getHeight());
            float a = m204463a(height2, height3, i3, 10.0d);
            Context context = appBarLayout.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "appBarLayout.context");
            int alphaColor = UDColorUtils.getAlphaColor(context, R.color.bg_body, a);
            ((CommonTitleBar) mo180360b(R.id.title_bar)).setBackgroundColor(alphaColor);
            double b = C0768a.m3714b(-16777216, C0768a.m3716c(alphaColor, 255));
            if (((double) a) < 0.5d || b < ((double) 3.0f)) {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
                RomUtils.m94941b(getActivity(), requireActivity.getWindow());
                Context context2 = appBarLayout.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "appBarLayout.context");
                i2 = UDColorUtils.getColor(context2, R.color.static_white);
            } else {
                FragmentActivity requireActivity2 = requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "requireActivity()");
                RomUtils.m94934a(getActivity(), requireActivity2.getWindow());
                Context context3 = appBarLayout.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "appBarLayout.context");
                i2 = UDColorUtils.getColor(context3, R.color.static_black);
            }
            CommonTitleBar commonTitleBar3 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar3, "title_bar");
            commonTitleBar3.getLeftDrawable().setTint(i2);
            CommonTitleBar commonTitleBar4 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar4, "title_bar");
            List<IActionTitlebar.Action> allActions = commonTitleBar4.getAllActions();
            Intrinsics.checkExpressionValueIsNotNull(allActions, "title_bar.allActions");
            ArrayList<IActionTitlebar.C57573a> arrayList = new ArrayList();
            for (T t : allActions) {
                if (t instanceof IActionTitlebar.C57573a) {
                    arrayList.add(t);
                }
            }
            for (IActionTitlebar.C57573a aVar : arrayList) {
                if (!Intrinsics.areEqual(aVar.getTag(), "focused_tag")) {
                    aVar.mo195540b().setTint(i2);
                }
            }
            TextViewTagLayout textViewTagLayout2 = (TextViewTagLayout) mo180360b(R.id.user_name_layout);
            Intrinsics.checkExpressionValueIsNotNull(textViewTagLayout2, "user_name_layout");
            int top = textViewTagLayout2.getTop();
            CommonTitleBar commonTitleBar5 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar5, "title_bar");
            float a2 = m204463a((float) (top - commonTitleBar5.getHeight()), height3, i3, 6.8d);
            CommonTitleBar commonTitleBar6 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar6, "title_bar");
            LinearLayout centerLayout = commonTitleBar6.getCenterLayout();
            Intrinsics.checkExpressionValueIsNotNull(centerLayout, "title_bar.centerLayout");
            centerLayout.setAlpha(a2);
            CommonTitleBar commonTitleBar7 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar7, "title_bar");
            LinearLayout centerLayout2 = commonTitleBar7.getCenterLayout();
            Intrinsics.checkExpressionValueIsNotNull(centerLayout2, "title_bar.centerLayout");
            float f = ((float) 1) - a2;
            CommonTitleBar commonTitleBar8 = (CommonTitleBar) mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar8, "title_bar");
            LinearLayout centerLayout3 = commonTitleBar8.getCenterLayout();
            Intrinsics.checkExpressionValueIsNotNull(centerLayout3, "title_bar.centerLayout");
            centerLayout2.setTranslationY(f * ((float) centerLayout3.getHeight()));
        }
    }

    /* renamed from: a */
    public final void mo180344a(Context context, String str, String str2) {
        TextView textView = (TextView) mo180360b(R.id.title_status);
        Intrinsics.checkExpressionValueIsNotNull(textView, "title_status");
        Layout layout = textView.getLayout();
        Intrinsics.checkExpressionValueIsNotNull(layout, "title_status.layout");
        if (!Intrinsics.areEqual(layout.getText(), str2)) {
            ((StatusCardBuilder) ((StatusCardBuilder) ((StatusCardBuilder) new StatusCardBuilder(context).mo180474a(str).mo180476b(str2).gravity(48)).translationOnY(140)).marginInDp(36)).show();
        }
    }

    /* renamed from: a */
    public final UDTagsDrawable mo180342a(UserProfileState.NameTagInfo cVar) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return null");
        boolean z = true;
        ProfileNameTagBuilder a = new ProfileNameTagBuilder(context).mo180196a(cVar.mo180079a() == GetUserProfileResponse.UserInfo.Gender.MAN);
        if (cVar.mo180079a() != GetUserProfileResponse.UserInfo.Gender.WOMAN) {
            z = false;
        }
        ProfileNameTagBuilder e = a.mo180197b(z).mo180198c(cVar.mo180080b()).mo180199d(cVar.mo180081c()).mo180201f(cVar.mo180085f()).mo180200e(cVar.mo180083e());
        if (cVar.mo180082d() != null) {
            e.mo180195a(m204466a(cVar.mo180082d()));
        }
        return e.mo180194a();
    }

    /* renamed from: a */
    public final void mo180351a(CtaView ctaView, UserProfileState.CtaInfo aVar) {
        if (UserAuthorityUtils.f129641a.mo179076a(Integer.valueOf(aVar.mo180069f().getValue()))) {
            UserAuthorityUtils.Companion aVar2 = UserAuthorityUtils.f129641a;
            Context context = ctaView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "ctaView.context");
            aVar2.mo179075a(context, aVar.mo180067e());
        } else if (aVar.mo180065c()) {
            int i = C52857h.f130653a[aVar.mo180066d().ordinal()];
            if (i == 1) {
                m204468a(aVar);
            } else if (i == 2) {
                m204459G();
            } else if (i == 3) {
                m204460H();
            } else if (i != 4) {
                Log.m165389i("UserProfileFragmentV3", "unsupported cta type: " + aVar.mo180066d());
            } else {
                m204461I();
            }
        } else {
            Context context2 = ctaView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "ctaView.context");
            UDToast.show(context2, aVar.mo180067e());
        }
    }

    /* renamed from: a */
    public final void mo180345a(View view) {
        mo180371g().withState(new az(this, view));
    }

    /* renamed from: a */
    public final void mo180356a(String str, String str2, View view, String str3) {
        C52239a.m202617d().mo133553a(requireActivity(), str, str2, view, str3, 528);
    }

    /* renamed from: a */
    public final void mo180354a(String str, View view) {
        ArrayList<PhotoItem> arrayList = new ArrayList<>();
        arrayList.add(new PhotoItem().setPaths(CollectionsKt.listOf(str)).setImageKey(str).setType(3));
        C58630d.m227364a().mo198658a(view).mo198667a(arrayList).mo198661a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo198673b(false).mo198674c(false).mo198675d(false).mo198676e(false).mo198678g(false).mo198679h(false).mo198666a("").mo198677f(false).mo198683l(false).mo198659a(Biz.Core).mo198660a(Scene.Profile).mo198672b(9).mo198671a(requireActivity(), Biz.Core, Scene.Profile, 9);
    }

    /* renamed from: a */
    public final void mo180352a(String str) {
        FragmentActivity requireActivity = requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133584n().mo133665a((Context) requireActivity, str);
    }

    /* renamed from: a */
    public final void mo180359a(boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = new ArrayMap();
            if (z) {
                String a = C57582a.m223604a(context, (int) R.string.Lark_View_OfficePhonePaid);
                Intrinsics.checkExpressionValueIsNotNull(a, "text");
                UDBaseListDialogBuilder.ListItem c = new UDBaseListDialogBuilder.ListItemBuilder(a).mo90889c();
                arrayList.add(c);
                arrayMap.put(c, new be(this));
            }
            if (z2) {
                if (z) {
                    str = UIHelper.getString(R.string.Lark_View_SelfPhoneHere);
                } else {
                    str = UIHelper.getString(R.string.Lark_Legacy_StartPhoneCall);
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "text");
                UDBaseListDialogBuilder.ListItem c2 = new UDBaseListDialogBuilder.ListItemBuilder(str).mo90889c();
                arrayList.add(c2);
                arrayMap.put(c2, new bf(this));
            }
            if (z4) {
                String a2 = C57582a.m223604a(context, (int) R.string.Lark_View_VoiceCallName);
                Intrinsics.checkExpressionValueIsNotNull(a2, "text");
                UDBaseListDialogBuilder.ListItem c3 = new UDBaseListDialogBuilder.ListItemBuilder(a2).mo90889c();
                arrayList.add(c3);
                arrayMap.put(c3, new C52817bg(this));
            }
            if (z3) {
                String a3 = C57582a.m223604a(context, (int) R.string.Lark_Legacy_UrgentCallEntrance);
                Intrinsics.checkExpressionValueIsNotNull(a3, "text");
                UDBaseListDialogBuilder.ListItem c4 = new UDBaseListDialogBuilder.ListItemBuilder(a3).mo90888b(R.color.function_danger_500).mo90889c();
                arrayList.add(c4);
                arrayMap.put(c4, new bh(this));
            }
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90873b(arrayList)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).mo90869a(new bi(arrayList, arrayMap))).show();
        }
    }

    /* renamed from: a */
    public final void mo180355a(String str, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback) {
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133559a(str, false, true, iVCLaunchCallback);
    }

    /* renamed from: a */
    public final void mo180357a(String str, String str2, boolean z, View view) {
        if (!NetworkUtils.m94915b(getContext())) {
            Log.m165383e("UserProfileFragmentV3", "Network error ，open avatar failed");
        } else if (z) {
            m204471b(str, str2, view);
        } else {
            m204469a(str, str2, view);
        }
    }

    /* renamed from: a */
    public final void mo180350a(ProfileSettingInitData profileSettingInitData) {
        FragmentActivity requireActivity = requireActivity();
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_key_profile_setting_init_data", profileSettingInitData);
        Intent intent = new Intent(getContext(), ProfileSettingActivity.class);
        intent.putExtras(bundle);
        requireActivity.startActivityForResult(intent, 7914);
    }

    /* renamed from: a */
    public final void mo180348a(Chatter.Description description) {
        String str;
        Chatter.Description.Type type;
        FragmentActivity requireActivity = requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        IProfileModuleDependency.AbstractC52254h v = iProfileModuleDependency.mo133592v();
        FragmentActivity fragmentActivity = requireActivity;
        UserProfileFragmentV3 gVar = this;
        if (description == null || (str = description.text) == null) {
            str = "";
        }
        v.mo133646a(fragmentActivity, gVar, new ChatterDescription(str, ChatterDescription.Type.valueOf((description == null || (type = description.type) == null) ? 0 : type.getValue())), 255);
    }

    /* renamed from: a */
    public final void mo180343a(int i) {
        if (i == 0) {
            Log.m165389i("UserProfileFragmentV3", "unknown vc launch error");
        } else if (i == 1) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "it");
            UDToast.show(requireActivity, (int) R.string.Lark_NewContacts_BlockedOthersUnableToXToastGeneral, (int) R.drawable.ud_icon_more_close_outlined);
        } else if (i == 2) {
            mo180371g().withState(new C52827g(this));
        } else if (i == 3) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "it");
            UDToast.show(requireActivity2, (int) R.string.Lark_NewContacts_BlockedUnableToXToastGeneral, (int) R.drawable.ud_icon_more_close_outlined);
        }
    }

    /* renamed from: a */
    public final void mo180346a(TextView textView, String str) {
        String str2 = str;
        textView.setText(str2);
        m204467a(textView, str2.length() > 0);
    }

    /* renamed from: a */
    public final void mo180347a(Group group, View.OnClickListener onClickListener) {
        int[] referencedIds = group.getReferencedIds();
        Intrinsics.checkExpressionValueIsNotNull(referencedIds, "referencedIds");
        for (int i : referencedIds) {
            group.getRootView().findViewById(i).setOnClickListener(onClickListener);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/profile/func/v3/userprofile/di/ViewModelFactory;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bn */
    static final class bn extends Lambda implements Function0<ViewModelFactory> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bn(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelFactory invoke() {
            return this.this$0.mo180369f();
        }
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    /* renamed from: G */
    private final void m204459G() {
        mo180371g().withState(new aq(this));
    }

    /* renamed from: H */
    private final void m204460H() {
        mo180371g().withState(new ap(this));
    }

    /* renamed from: I */
    private final void m204461I() {
        mo180371g().withState(new ao(this));
    }

    /* renamed from: f */
    public final ViewModelFactory mo180369f() {
        ViewModelFactory eVar = this.f130590a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        }
        return eVar;
    }

    /* renamed from: i */
    public final ProfileTabAdapter mo180374i() {
        ProfileTabAdapter dVar = this.f130591b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
        }
        return dVar;
    }

    /* renamed from: j */
    public final IProfileModuleDependency mo180375j() {
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        return iProfileModuleDependency;
    }

    /* renamed from: k */
    public final AbstractC68108a<ActionBtnBinderV3> mo180376k() {
        AbstractC68108a<ActionBtnBinderV3> aVar = this.f130594e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionBtnBinder");
        }
        return aVar;
    }

    /* renamed from: l */
    public final void mo180377l() {
        mo180371g().withState(new aw(this));
    }

    /* renamed from: q */
    public final void mo180382q() {
        mo180371g().withState(new as(this));
    }

    /* renamed from: r */
    public final void mo180383r() {
        mo180371g().withState(new bc(this));
    }

    /* renamed from: s */
    public final void mo180384s() {
        mo180371g().withState(new au(this));
    }

    /* renamed from: t */
    public final void mo180385t() {
        mo180371g().withState(new C52822c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$at */
    static final class C52812at extends Lambda implements Function0<AppBarLayout.AbstractC22134b> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52812at(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppBarLayout.AbstractC22134b invoke() {
            return new C52681at(new Function2<AppBarLayout, Integer, Unit>(this.this$0) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.C52812at.C528131 */

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
                public final String getName() {
                    return "onAppBarOffsetChanged";
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final KDeclarationContainer getOwner() {
                    return Reflection.getOrCreateKotlinClass(UserProfileFragmentV3.class);
                }

                @Override // kotlin.jvm.internal.CallableReference
                public final String getSignature() {
                    return "onAppBarOffsetChanged(Lcom/google/android/material/appbar/AppBarLayout;I)V";
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Unit invoke(AppBarLayout appBarLayout, Integer num) {
                    invoke(appBarLayout, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AppBarLayout appBarLayout, int i) {
                    Intrinsics.checkParameterIsNotNull(appBarLayout, "p1");
                    ((UserProfileFragmentV3) this.receiver).mo180349a(appBarLayout, i);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$be */
    public static final class be extends Lambda implements Function0<Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        be(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo180371g().withState(new Function1<UserProfileState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.be.C528151 */
                final /* synthetic */ be this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                    invoke(azVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(UserProfileState azVar) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(azVar, "state");
                    String j = azVar.mo180045j();
                    if (j.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        j = null;
                    }
                    if (j != null) {
                        ProfileHitPoint.m204710b();
                        this.this$0.this$0.mo180368e(j);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bf */
    public static final class bf extends Lambda implements Function0<Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bf(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo180371g().withState(new Function1<UserProfileState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.bf.C528161 */
                final /* synthetic */ bf this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                    invoke(azVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(UserProfileState azVar) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(azVar, "state");
                    String j = azVar.mo180045j();
                    if (j.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        j = null;
                    }
                    if (j != null) {
                        this.this$0.this$0.mo180367d(j);
                        UserProfileHitPointV3.f130746c.mo180601t();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bg */
    public static final class C52817bg extends Lambda implements Function0<Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52817bg(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo180371g().withState(new Function1<UserProfileState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.C52817bg.C528181 */
                final /* synthetic */ C52817bg this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                    invoke(azVar);
                    return Unit.INSTANCE;
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "vcLaunchError", "", "onError", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$showPhoneCallSelectMenu$3$1$2$1"}, mo238835k = 3, mv = {1, 1, 16})
                /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bg$1$a */
                public static final class C52819a implements IProfileModuleDependency.IVCLaunchCallback {

                    /* renamed from: a */
                    final /* synthetic */ C528181 f130624a;

                    C52819a(C528181 r1) {
                        this.f130624a = r1;
                    }

                    @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.IVCLaunchCallback
                    /* renamed from: a */
                    public final void mo178828a(int i) {
                        this.f130624a.this$0.this$0.mo180343a(i);
                    }
                }

                public final void invoke(UserProfileState azVar) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(azVar, "state");
                    String j = azVar.mo180045j();
                    if (j.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        j = null;
                    }
                    if (j != null) {
                        this.this$0.this$0.mo180355a(j, new C52819a(this));
                        UserProfileHitPointV3.f130746c.mo180602u();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bh */
    public static final class bh extends Lambda implements Function0<Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bh(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo180371g().withState(new Function1<UserProfileState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.bh.C528201 */
                final /* synthetic */ bh this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                    invoke(azVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(UserProfileState azVar) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(azVar, "state");
                    String j = azVar.mo180045j();
                    if (j.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        j = null;
                    }
                    if (j != null) {
                        this.this$0.this$0.mo180370f(j);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bm */
    static final class C52821bm extends Lambda implements Function0<androidx.lifecycle.ak> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52821bm(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ak invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            androidx.lifecycle.ak viewModelStore = requireActivity.getViewModelStore();
            Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: D */
    private final void m204456D() {
        ((UDTabLayout) mo180360b(R.id.tab)).addOnTabSelectedListener(mo180371g().getMomentsTabSelectListener());
    }

    /* renamed from: E */
    private final void m204457E() {
        ((UDTabLayout) mo180360b(R.id.tab)).removeOnTabSelectedListener(mo180371g().getMomentsTabSelectListener());
    }

    /* renamed from: F */
    private final void m204458F() {
        ((UDTabLayout) mo180360b(R.id.tab)).removeOnTabSelectedListener(mo180371g().getCommonTabSelectListener());
    }

    /* renamed from: o */
    public final void mo180380o() {
        ((UDTabLayout) mo180360b(R.id.tab)).addOnTabSelectedListener(mo180371g().getCommonTabSelectListener());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        m204457E();
        m204458F();
        Intent intent = new Intent();
        mo180371g().onActivityFinish(intent);
        setResult(-1, intent);
        super.onFinish();
    }

    /* renamed from: p */
    public final void mo180381p() {
        mo180371g().withState(new av(requireActivity(), this));
    }

    /* renamed from: w */
    public final void mo180388w() {
        mo180371g().withState(new ar(requireActivity(), this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$d */
    static final class C52823d extends Lambda implements Function0<List<? extends CtaView>> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52823d(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.util.List<com.ss.android.lark.profile.func.v3.userprofile.view.CtaView>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends CtaView> invoke() {
            return CollectionsKt.listOf((Object[]) new CtaView[]{(CtaView) this.this$0.mo180360b(R.id.cta_button1), (CtaView) this.this$0.mo180360b(R.id.cta_button2), (CtaView) this.this$0.mo180360b(R.id.cta_button3), (CtaView) this.this$0.mo180360b(R.id.cta_button4)});
        }
    }

    /* renamed from: C */
    private final void m204455C() {
        ((DecoratedAvatar) mo180360b(R.id.decorated_avatar)).setOnClickListener(new View$OnClickListenerC52828h(this));
        ((ImageView) mo180360b(R.id.header_image)).setOnClickListener(new View$OnClickListenerC52829i(this));
        m204456D();
        ProfileUserMedalView profileUserMedalView = (ProfileUserMedalView) mo180360b(R.id.medal_view);
        if (profileUserMedalView != null) {
            profileUserMedalView.setOnClickListener(new C52830j(this));
        }
    }

    /* renamed from: n */
    public final SpannableString mo180379n() {
        String string = UIHelper.getString(R.string.SuiteDesign_UserCard_FailedToLoad);
        String string2 = UIHelper.getString(R.string.SuiteDesign_UserCard_FailedToLoadRefresh);
        SpannableString spannableString = new SpannableString(string + string2);
        spannableString.setSpan(new C52826f(this), string.length(), string.length() + string2.length(), 33);
        return spannableString;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((AppBarLayout) mo180360b(R.id.appbar_layout)).removeOnOffsetChangedListener(m204472y());
        LKUIFrameLayout lKUIFrameLayout = this.f130602n;
        if (lKUIFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootFrameLayout");
        }
        lKUIFrameLayout.unRegisterPlus(UserProfileDrawEventPlus.class);
        super.onDestroyView();
        mo180389x();
    }

    /* renamed from: v */
    public final void mo180387v() {
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context?: return");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).message(R.string.Lark_Contacts_DeleteContactCardConfirmation)).addActionButton(R.id.lkui_dialog_btn_left, R.string.Lark_Contacts_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.lkui_dialog_btn_right, R.string.Lark_Contacts_Delete, new bb(this))).show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bl */
    static final class bl extends Lambda implements Function0<LKUIRoundedImageView2> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bl(UserProfileFragmentV3 gVar) {
            super(0);
            this.this$0 = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LKUIRoundedImageView2 invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(requireActivity, null, 0, 6, null);
            lKUIRoundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(this.this$0.f130598i, this.this$0.f130598i));
            lKUIRoundedImageView2.setOval(true);
            Context context = lKUIRoundedImageView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            lKUIRoundedImageView2.setBorderColor(UDColorUtils.getColor(context, R.color.static_white));
            lKUIRoundedImageView2.setBorderWidth((float) UIHelper.dp2px(2.0f));
            Context context2 = lKUIRoundedImageView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            lKUIRoundedImageView2.setBackgroundColor(UDColorUtils.getColor(context2, R.color.bg_body));
            return lKUIRoundedImageView2;
        }
    }

    /* renamed from: J */
    private final boolean m204462J() {
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments == null) {
            return false;
        }
        String string = arguments.getString("param_key_user_id");
        String string2 = arguments.getString("param_key_token");
        String string3 = arguments.getString("param_key_name_card_id");
        String string4 = arguments.getString("param_key_email");
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
            z = true;
        }
        return !z;
    }

    /* renamed from: m */
    public final void mo180378m() {
        UserProfileHitPointV3.f130746c.mo180557G();
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        UDDialogBuilder eVar = new UDDialogBuilder(requireContext);
        String string = UIHelper.getString(R.string.Legacy_Legacy_SetAsSpecialRemind_PopupTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…SpecialRemind_PopupTitle)");
        String string2 = UIHelper.getString(R.string.Legacy_Legacy_SetAsSpecialRemind_PopupText);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(strin…sSpecialRemind_PopupText)");
        String string3 = UIHelper.getString(R.string.Lark_Legacy_Confirm);
        Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(string.Lark_Legacy_Confirm)");
        String string4 = UIHelper.getString(R.string.Lark_Legacy_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(string.Lark_Legacy_Cancel)");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, string3, this.f130607s)).addActionButton(R.id.ud_dialog_btn_secondary, string4, bj.f130627a)).show();
    }

    /* renamed from: u */
    public final void mo180386u() {
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context?: return");
            String string = UIUtils.getString(context, R.string.Lark_Contacts_Edit);
            String string2 = UIUtils.getString(context, R.string.Lark_Contacts_Delete);
            ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new String[]{string, string2}))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, new bd(this));
        }
    }

    public UserProfileFragmentV3() {
        C52821bm bmVar = new C52821bm(this);
        bn bnVar = new bn(this);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserProfileViewModel.class);
        this.f130600l = new LifecycleAwareLazy(orCreateKotlinClass, new UserProfileFragmentV3$$special$$inlined$viewModel$1(orCreateKotlinClass), bmVar, bnVar, UserProfileFragmentV3$$special$$inlined$viewModel$2.INSTANCE);
    }

    /* renamed from: A */
    private final void m204453A() {
        ((DecoratedAvatar) mo180360b(R.id.decorated_avatar)).mo86670a(m204473z());
        StatusBarUtil.setTransparent(getActivity());
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_left_outlined, C57582a.m223616d(getContext(), R.color.static_white));
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo180360b(R.id.title_bar);
        commonTitleBar.setLeftImageDrawable(iconDrawable);
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC52807ai(this, iconDrawable));
        commonTitleBar.setImmersive(true);
        LinearLayout centerLayout = commonTitleBar.getCenterLayout();
        CommonTitleBar commonTitleBar2 = (CommonTitleBar) mo180360b(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "title_bar");
        Context context = commonTitleBar2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "title_bar.context");
        centerLayout.addView(m204464a(context));
        LinearLayout centerLayout2 = commonTitleBar.getCenterLayout();
        Intrinsics.checkExpressionValueIsNotNull(centerLayout2, "centerLayout");
        centerLayout2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ((AppBarLayout) mo180360b(R.id.appbar_layout)).addOnOffsetChangedListener(m204472y());
        UIUtils.show((ViewPager2) mo180360b(R.id.viewPager));
        ViewPager2 viewPager2 = (ViewPager2) mo180360b(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "viewPager");
        ProfileTabAdapter dVar = this.f130591b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabAdapter");
        }
        viewPager2.setAdapter(dVar);
        ViewPager2 viewPager22 = (ViewPager2) mo180360b(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager22, "viewPager");
        viewPager22.setOffscreenPageLimit(1);
        UDTabLayout uDTabLayout = (UDTabLayout) mo180360b(R.id.tab);
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tab");
        ViewPager2 viewPager23 = (ViewPager2) mo180360b(R.id.viewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager23, "viewPager");
        UDTabLayoutCoordinator2 dVar2 = new UDTabLayoutCoordinator2(uDTabLayout, viewPager23, new aj(this));
        dVar2.mo91353a();
        this.f130603o = dVar2;
        View childAt = ((ViewPager2) mo180360b(R.id.viewPager)).getChildAt(0);
        if (childAt != null) {
            if (!(childAt instanceof RecyclerView)) {
                childAt = null;
            }
            RecyclerView recyclerView = (RecyclerView) childAt;
            if (recyclerView != null) {
                recyclerView.setOverScrollMode(2);
            }
        }
        ((TextViewTagLayout) mo180360b(R.id.user_name_layout)).setTagPaddingLeft(C52743a.m204272a(8));
        ((CommonTitleBar) mo180360b(R.id.title_bar)).addOnLayoutChangeListener(new ak(this));
        ((LinkEmojiTextView) mo180360b(R.id.user_status)).setOnLongClickListener(al.f130616a);
        LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) mo180360b(R.id.user_status);
        Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "user_status");
        linkEmojiTextView.setLineHeight(C52743a.m204273b(20));
    }

    /* renamed from: B */
    private final void m204454B() {
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52858i.INSTANCE, (SubscriptionConfig) null, C52841o.INSTANCE, 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52870u.INSTANCE, (SubscriptionConfig) null, C52854x.INSTANCE, 2, (Object) null);
        ISubscriber.C24024a.m87814a(this, mo180371g(), C52679ah.INSTANCE, ap.INSTANCE, (SubscriptionConfig) null, new C52806ah(this), 4, (Object) null);
        ISubscriber.C24024a.m87818a(this, mo180371g(), ar.INSTANCE, as.INSTANCE, C52859j.INSTANCE, C52860k.INSTANCE, null, new C52832k(this), 16, null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52861l.INSTANCE, (SubscriptionConfig) null, new C52837l(this), 2, (Object) null);
        ISubscriber.C24024a.m87814a(this, mo180371g(), C52862m.INSTANCE, C52863n.INSTANCE, (SubscriptionConfig) null, new C52838m(this), 4, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52864o.INSTANCE, (SubscriptionConfig) null, new C52840n(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52865p.INSTANCE, (SubscriptionConfig) null, new C52842p(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52866q.INSTANCE, (SubscriptionConfig) null, new C52843q(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52867r.INSTANCE, (SubscriptionConfig) null, new C52845r(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52868s.INSTANCE, (SubscriptionConfig) null, new C52846s(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52869t.INSTANCE, (SubscriptionConfig) null, new C52847t(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52871v.INSTANCE, (SubscriptionConfig) null, new C52848u(this), 2, (Object) null);
        ISubscriber.C24024a.m87818a(this, mo180371g(), C52873w.INSTANCE, C52874x.INSTANCE, C52875y.INSTANCE, C52876z.INSTANCE, null, new C52849v(this), 16, null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52664aa.INSTANCE, (SubscriptionConfig) null, new C52853w(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52665ab.INSTANCE, (SubscriptionConfig) null, new C52855y(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52666ac.INSTANCE, (SubscriptionConfig) null, new C52856z(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52675ad.INSTANCE, (SubscriptionConfig) null, new C52798aa(this), 2, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52676ae.INSTANCE, (SubscriptionConfig) null, new C52799ab(this), 2, (Object) null);
        ISubscriber.C24024a.m87814a(this, mo180371g(), C52677af.INSTANCE, C52678ag.INSTANCE, (SubscriptionConfig) null, new C52800ac(this), 4, (Object) null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), C52680ai.INSTANCE, (SubscriptionConfig) null, new C52802ad(this), 2, (Object) null);
        ISubscriber.C24024a.m87814a(this, mo180371g(), aj.INSTANCE, ak.INSTANCE, (SubscriptionConfig) null, new C52803ae(this), 4, (Object) null);
        ISubscriber.C24024a.m87818a(this, mo180371g(), al.INSTANCE, am.INSTANCE, an.INSTANCE, ao.INSTANCE, null, new C52804af(this), 16, null);
        ISubscriber.C24024a.m87810a(this, mo180371g(), aq.INSTANCE, (SubscriptionConfig) null, new C52805ag(this), 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initViews$2", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$UDTabConfiguration;", "onConfigureTab", "", "position", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$aj */
    public static final class aj implements UDTabLayoutCoordinator2.UDTabConfiguration {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130614a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$aj$a */
        static final class C52808a extends Lambda implements Function1<UserProfileState, Unit> {
            final /* synthetic */ int $position;
            final /* synthetic */ UDTab $tab;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52808a(UDTab bVar, int i) {
                super(1);
                this.$tab = bVar;
                this.$position = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                invoke(azVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UserProfileState azVar) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(azVar, "it");
                List<UserProfileState.TabInfo> i = azVar.mo180044i();
                if (i == null || i.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.$tab.mo91335a((CharSequence) azVar.mo180044i().get(this.$position).mo180093a());
                    this.$tab.mo91336a(azVar.mo180044i().get(this.$position).mo180094b());
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aj(UserProfileFragmentV3 gVar) {
            this.f130614a = gVar;
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator2.UDTabConfiguration
        /* renamed from: a */
        public void mo91356a(int i, UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            this.f130614a.mo180371g().withState(new C52808a(bVar, i));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ap */
    public static final class ap extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ap(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "vcLaunchError", "", "onError", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$onCtaVideoClicked$1$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ap$a */
        public static final class C52811a implements IProfileModuleDependency.IVCLaunchCallback {

            /* renamed from: a */
            final /* synthetic */ ap f130619a;

            C52811a(ap apVar) {
                this.f130619a = apVar;
            }

            @Override // com.ss.android.lark.profile.dependency.IProfileModuleDependency.IVCLaunchCallback
            /* renamed from: a */
            public final void mo178828a(int i) {
                this.f130619a.this$0.mo180343a(i);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            String j = azVar.mo180045j();
            if (j.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = null;
            }
            if (j != null) {
                this.this$0.mo180363b(j, new C52811a(this));
                UserProfileHitPointV3.f130746c.mo180590i();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initListeners$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$j */
    public static final class C52830j extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130633a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$j$a */
        static final class C52831a extends Lambda implements Function1<UserProfileState, Unit> {
            final /* synthetic */ C52830j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52831a(C52830j jVar) {
                super(1);
                this.this$0 = jVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                invoke(azVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UserProfileState azVar) {
                Intrinsics.checkParameterIsNotNull(azVar, "it");
                C52904e.m204638a().mo105581a(this.this$0.f130633a.requireActivity(), azVar.mo180045j(), azVar.mo180054s(), azVar.mo180007M());
                UserProfileHitPointV3.f130746c.mo180571b(azVar.mo180017W());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52830j(UserProfileFragmentV3 gVar) {
            this.f130633a = gVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f130633a.mo180371g().withState(new C52831a(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$aa */
    public static final class C52798aa extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52798aa(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (azVar.af()) {
                this.this$0.mo180358a(false);
                Iterator<T> it = this.this$0.mo180373h().iterator();
                while (it.hasNext()) {
                    UIUtils.hide(it.next());
                }
                UIUtils.hide((UDButton) this.this$0.mo180360b(R.id.mFriendRequestBtn));
                UIUtils.hide((TextView) this.this$0.mo180360b(R.id.mTipsTv));
                UIUtils.show((LinearLayout) this.this$0.mo180360b(R.id.mPlaceholder));
                ((ImageView) this.this$0.mo180360b(R.id.mHolderIv)).setImageResource(R.drawable.illustration_placeholder_common_load_failed);
                SpannableString n = this.this$0.mo180379n();
                TextView textView = (TextView) this.this$0.mo180360b(R.id.mHolderTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "mHolderTv");
                textView.setText(n);
                TextView textView2 = (TextView) this.this$0.mo180360b(R.id.mHolderTv);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "mHolderTv");
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            UIUtils.hide((LinearLayout) this.this$0.mo180360b(R.id.mPlaceholder));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ab */
    public static final class C52799ab extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52799ab(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (azVar.ah()) {
                this.this$0.mo180358a(false);
                Iterator<T> it = this.this$0.mo180373h().iterator();
                while (it.hasNext()) {
                    UIUtils.hide(it.next());
                }
                UIUtils.hide((UDButton) this.this$0.mo180360b(R.id.mFriendRequestBtn));
                UIUtils.hide((TextView) this.this$0.mo180360b(R.id.mTipsTv));
                UIUtils.show((LinearLayout) this.this$0.mo180360b(R.id.mPlaceholder));
                ((ImageView) this.this$0.mo180360b(R.id.mHolderIv)).setImageResource(R.drawable.illustration_placeholder_common_no_access2);
                ((TextView) this.this$0.mo180360b(R.id.mHolderTv)).setText(R.string.Lark_Profile_PrivacySettings);
                return;
            }
            UIUtils.hide((LinearLayout) this.this$0.mo180360b(R.id.mPlaceholder));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ac */
    public static final class C52800ac extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52800ac(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initSubscribers$49$1$4"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ac$a */
        public static final class View$OnClickListenerC52801a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Chatter.ChatterCustomStatus f130609a;

            /* renamed from: b */
            final /* synthetic */ C52800ac f130610b;

            /* renamed from: c */
            final /* synthetic */ UserProfileState f130611c;

            View$OnClickListenerC52801a(Chatter.ChatterCustomStatus chatterCustomStatus, C52800ac acVar, UserProfileState azVar) {
                this.f130609a = chatterCustomStatus;
                this.f130610b = acVar;
                this.f130611c = azVar;
            }

            public final void onClick(View view) {
                UserProfileFragmentV3 gVar = this.f130610b.this$0;
                Context context = this.f130610b.this$0.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                String str = this.f130609a.icon_key;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.icon_key");
                String str2 = this.f130609a.title;
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.title");
                gVar.mo180344a(context, str, str2);
            }
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            IProfileModuleDependency.AbstractC52254h v = d.mo133592v();
            Intrinsics.checkExpressionValueIsNotNull(v, "ProfileModule.getDependency().mineDependency");
            if (!v.mo133647a()) {
                TextView textView = (TextView) this.this$0.mo180360b(R.id.text_empty_status);
                Intrinsics.checkExpressionValueIsNotNull(textView, "text_empty_status");
                textView.setVisibility(8);
                LinearLayout linearLayout = (LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "layout_avatar_text");
                linearLayout.setVisibility(8);
                Group group = (Group) this.this$0.mo180360b(R.id.group_is_self_status);
                Intrinsics.checkExpressionValueIsNotNull(group, "group_is_self_status");
                group.setVisibility(8);
                return;
            }
            Chatter.ChatterCustomStatus A = azVar.mo179995A();
            if (A != null) {
                TextView textView2 = (TextView) this.this$0.mo180360b(R.id.text_empty_status);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "text_empty_status");
                textView2.setVisibility(8);
                LinearLayout linearLayout2 = (LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "layout_avatar_text");
                linearLayout2.setVisibility(0);
                TextView textView3 = (TextView) this.this$0.mo180360b(R.id.title_status);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "title_status");
                textView3.setText(A.title);
                C52977a.m205190a().mo180995a((ImageView) this.this$0.mo180360b(R.id.status_avatar), A.icon_key);
                if (azVar.mo180006L()) {
                    Group group2 = (Group) this.this$0.mo180360b(R.id.group_is_self_status);
                    Intrinsics.checkExpressionValueIsNotNull(group2, "group_is_self_status");
                    group2.setVisibility(0);
                    StatusEffectiveInterval statusEffectiveInterval = A.effective_interval;
                    if (statusEffectiveInterval != null) {
                        Boolean bool = statusEffectiveInterval.is_show_end_time;
                        Intrinsics.checkExpressionValueIsNotNull(bool, "interval.is_show_end_time");
                        if (bool.booleanValue()) {
                            TextView textView4 = (TextView) this.this$0.mo180360b(R.id.text_status_end_time);
                            Intrinsics.checkExpressionValueIsNotNull(textView4, "text_status_end_time");
                            IProfileModuleDependency d2 = C52239a.m202617d();
                            Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
                            textView4.setText(UIHelper.mustacheFormat((int) R.string.Lark_Profile_UntilTime, "time", d2.mo133592v().mo133644a(this.this$0.getContext(), statusEffectiveInterval.end_time)));
                        } else {
                            TextView textView5 = (TextView) this.this$0.mo180360b(R.id.text_status_end_time);
                            Intrinsics.checkExpressionValueIsNotNull(textView5, "text_status_end_time");
                            textView5.setText(UIUtils.getString(this.this$0.getContext(), R.string.Lark_Profile_StatusEndTimeTillMeetingEnds_Option));
                        }
                    } else {
                        TextView textView6 = (TextView) this.this$0.mo180360b(R.id.text_status_end_time);
                        Intrinsics.checkExpressionValueIsNotNull(textView6, "text_status_end_time");
                        textView6.setText("");
                    }
                    ((LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text)).setOnClickListener(this.this$0.f130597h);
                    UserProfileFragmentV3 gVar = this.this$0;
                    Group group3 = (Group) gVar.mo180360b(R.id.group_is_self_status);
                    Intrinsics.checkExpressionValueIsNotNull(group3, "group_is_self_status");
                    gVar.mo180347a(group3, this.this$0.f130597h);
                    return;
                }
                Group group4 = (Group) this.this$0.mo180360b(R.id.group_is_self_status);
                Intrinsics.checkExpressionValueIsNotNull(group4, "group_is_self_status");
                group4.setVisibility(8);
                ((LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text)).setOnClickListener(new View$OnClickListenerC52801a(A, this, azVar));
                return;
            }
            LinearLayout linearLayout3 = (LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "layout_avatar_text");
            linearLayout3.setVisibility(8);
            Group group5 = (Group) this.this$0.mo180360b(R.id.group_is_self_status);
            Intrinsics.checkExpressionValueIsNotNull(group5, "group_is_self_status");
            group5.setVisibility(8);
            if (azVar.mo180006L()) {
                TextView textView7 = (TextView) this.this$0.mo180360b(R.id.text_empty_status);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "text_empty_status");
                textView7.setVisibility(0);
                ((TextView) this.this$0.mo180360b(R.id.text_empty_status)).setOnClickListener(this.this$0.f130597h);
                return;
            }
            TextView textView8 = (TextView) this.this$0.mo180360b(R.id.text_empty_status);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "text_empty_status");
            textView8.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ad */
    public static final class C52802ad extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52802ad(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Chatter.ChatterCustomStatus a = azVar.aj().mo86215a();
            if (a == null) {
                return;
            }
            if (TextUtils.isEmpty(a.title)) {
                LinearLayout linearLayout = (LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "layout_avatar_text");
                linearLayout.setVisibility(8);
                Group group = (Group) this.this$0.mo180360b(R.id.group_is_self_status);
                Intrinsics.checkExpressionValueIsNotNull(group, "group_is_self_status");
                group.setVisibility(8);
                TextView textView = (TextView) this.this$0.mo180360b(R.id.text_empty_status);
                Intrinsics.checkExpressionValueIsNotNull(textView, "text_empty_status");
                textView.setVisibility(0);
                ((TextView) this.this$0.mo180360b(R.id.text_empty_status)).setOnClickListener(this.this$0.f130597h);
                return;
            }
            TextView textView2 = (TextView) this.this$0.mo180360b(R.id.text_empty_status);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "text_empty_status");
            textView2.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "layout_avatar_text");
            linearLayout2.setVisibility(0);
            Group group2 = (Group) this.this$0.mo180360b(R.id.group_is_self_status);
            Intrinsics.checkExpressionValueIsNotNull(group2, "group_is_self_status");
            group2.setVisibility(0);
            TextView textView3 = (TextView) this.this$0.mo180360b(R.id.title_status);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "title_status");
            textView3.setText(a.title);
            C52977a.m205190a().mo180995a((ImageView) this.this$0.mo180360b(R.id.status_avatar), a.icon_key);
            StatusEffectiveInterval statusEffectiveInterval = a.effective_interval;
            if (statusEffectiveInterval != null) {
                TextView textView4 = (TextView) this.this$0.mo180360b(R.id.text_status_end_time);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "text_status_end_time");
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                textView4.setText(UIHelper.mustacheFormat((int) R.string.Lark_Profile_UntilTime, "time", d.mo133592v().mo133644a(this.this$0.getContext(), statusEffectiveInterval.end_time)));
            } else {
                TextView textView5 = (TextView) this.this$0.mo180360b(R.id.text_status_end_time);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "text_status_end_time");
                textView5.setText("");
            }
            ((LinearLayout) this.this$0.mo180360b(R.id.layout_avatar_text)).setOnClickListener(this.this$0.f130597h);
            UserProfileFragmentV3 gVar = this.this$0;
            Group group3 = (Group) gVar.mo180360b(R.id.group_is_self_status);
            Intrinsics.checkExpressionValueIsNotNull(group3, "group_is_self_status");
            gVar.mo180347a(group3, this.this$0.f130597h);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ae */
    public static final class C52803ae extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52803ae(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (!azVar.mo180014T()) {
                ((DecoratedAvatar) this.this$0.mo180360b(R.id.decorated_avatar)).mo86669a();
            } else {
                ((DecoratedAvatar) this.this$0.mo180360b(R.id.decorated_avatar)).mo86671a(azVar.mo180012R());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$af */
    public static final class C52804af extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52804af(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            ((ProfileUserMedalView) this.this$0.mo180360b(R.id.medal_view)).mo180461a(azVar.mo180016V(), C52239a.m202617d().mo133561a("messenger.profile.badge"), azVar.mo180006L(), azVar.mo180054s(), azVar.mo180007M());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ag */
    public static final class C52805ag extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52805ag(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Boolean a = azVar.ak().mo86215a();
            if (a != null) {
                if (!a.booleanValue()) {
                    a = null;
                }
                if (a != null) {
                    a.booleanValue();
                    this.this$0.mo180371g().sendHitPointProfileMainView();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ah */
    public static final class C52806ah extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52806ah(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            UserProfileFragmentV3 gVar = this.this$0;
            TextView textView = (TextView) gVar.mo180360b(R.id.user_name);
            Intrinsics.checkExpressionValueIsNotNull(textView, "user_name");
            gVar.mo180346a(textView, azVar.mo180022a());
            UserProfileFragmentV3 gVar2 = this.this$0;
            gVar2.mo180346a(UserProfileFragmentV3.m204465a(gVar2), azVar.mo180022a());
            UserProfileState.NameTagInfo t = azVar.mo180055t();
            if (t != null) {
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_name_layout)).setTagDrawable(this.this$0.mo180342a(t));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initViews$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ai */
    public static final class View$OnClickListenerC52807ai implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130612a;

        /* renamed from: b */
        final /* synthetic */ Drawable f130613b;

        View$OnClickListenerC52807ai(UserProfileFragmentV3 gVar, Drawable drawable) {
            this.f130612a = gVar;
            this.f130613b = drawable;
        }

        public final void onClick(View view) {
            this.f130612a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$am */
    public static final class am extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ View $clickView;
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(UserProfileFragmentV3 gVar, View view) {
            super(1);
            this.this$0 = gVar;
            this.$clickView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            if (azVar.mo180014T()) {
                FragmentActivity requireActivity = this.this$0.requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
                UDActionPanelBuilder aVar = new UDActionPanelBuilder(requireActivity);
                String[] strArr = {UIHelper.getString(R.string.Lark_Profile_ViewProfilePhoto_Option), UIHelper.getString(R.string.Lark_Profile_ViewBadgeDetails_Option)};
                String string = UIHelper.getString(R.string.Lark_Profile_ProfilePhotoMenuCancel_Button);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…lePhotoMenuCancel_Button)");
                ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(CollectionsKt.listOf((Object[]) strArr))).mo90869a(new UDListDialogController.OnItemClickListener(this) {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.am.C528091 */

                    /* renamed from: a */
                    final /* synthetic */ am f130617a;

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f130617a = r1;
                    }

                    @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                    public void onItemClick(int i) {
                        if (i == 0) {
                            this.f130617a.this$0.mo180345a(this.f130617a.$clickView);
                            UserProfileHitPointV3.f130746c.mo180554D();
                        } else if (i == 1) {
                            this.f130617a.this$0.mo180383r();
                            UserProfileHitPointV3.f130746c.mo180555E();
                        }
                    }
                })).addActionButton(R.id.ud_dialog_btn_cancel, string, DialogInterface$OnClickListenerC528102.f130618a)).show();
                UserProfileHitPointV3.f130746c.mo180553C();
            } else {
                this.this$0.mo180345a(this.$clickView);
            }
            UserProfileHitPointV3.f130746c.mo180567a(azVar.mo180014T());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$an */
    public static final class an extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileState.CtaInfo $ctaInfo;
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(UserProfileFragmentV3 gVar, UserProfileState.CtaInfo aVar) {
            super(1);
            this.this$0 = gVar;
            this.$ctaInfo = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            String j = azVar.mo180045j();
            if (j.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = null;
            }
            if (j != null) {
                this.this$0.requireActivity();
                IProfileModuleDependency d = C52239a.m202617d();
                Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
                d.mo133586p().mo133604a(this.this$0.getActivity(), j, this.this$0.mo180371g().getSource(), "contact_profile");
                this.this$0.mo180364b(this.$ctaInfo.mo180070g());
                this.this$0.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ao */
    public static final class ao extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            UserProfileHitPointV3.f130746c.mo180591j();
            if (this.this$0.mo180371g().isFirstStartSecretChat()) {
                this.this$0.mo180366c(azVar.mo180022a());
            } else {
                this.this$0.mo180385t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$aq */
    public static final class aq extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aq(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            this.this$0.mo180359a(azVar.mo180001G(), azVar.mo180002H(), azVar.mo180004J(), azVar.mo180003I());
            UserProfileHitPointV3.f130746c.mo180589h();
            UserProfileHitPointV3.f130746c.mo180600s();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$onEditNameCardClick$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ar */
    public static final class ar extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ar(FragmentActivity fragmentActivity, UserProfileFragmentV3 gVar) {
            super(1);
            this.$activity = fragmentActivity;
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            String ac = azVar.ac();
            if (ac != null) {
                this.this$0.mo180375j().mo133582l().mo133651a(this.$activity, ac, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$as */
    public static final class as extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        as(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            if (azVar.mo180005K()) {
                this.this$0.mo180386u();
                return;
            }
            this.this$0.mo180350a(new ProfileSettingInitData(azVar.mo180045j(), azVar.mo179999E(), azVar.mo180061y(), azVar.mo180000F(), azVar.mo179997C(), azVar.mo179998D(), azVar.mo180041g()));
            UserProfileHitPointV3.f130746c.mo180580d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$au */
    public static final class au extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            int i;
            String str;
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            this.this$0.mo180348a(azVar.mo180036c());
            UserProfileHitPointV3.Companion aVar = UserProfileHitPointV3.f130746c;
            Chatter.Description c = azVar.mo180036c();
            if (c == null || (str = c.text) == null) {
                i = 0;
            } else {
                i = str.length();
            }
            aVar.mo180559a(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$onShareClicked$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$av */
    public static final class av extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        av(FragmentActivity fragmentActivity, UserProfileFragmentV3 gVar) {
            super(1);
            this.$activity = fragmentActivity;
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            ProfileContent profileContent = new ProfileContent();
            profileContent.setId(azVar.mo180045j());
            profileContent.setDisplayName(azVar.mo180022a());
            profileContent.setAvatarKey(azVar.mo180038e());
            this.this$0.mo180375j().mo133582l().mo133653a(this.$activity, profileContent);
            UserProfileHitPointV3.f130746c.mo180576c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$aw */
    public static final class aw extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aw(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            Long longOrNull = StringsKt.toLongOrNull(azVar.mo180045j());
            if (longOrNull != null) {
                long longValue = longOrNull.longValue();
                if (azVar.mo180059w()) {
                    this.this$0.mo180371g().onSpecialFocusViewClick(true, longValue);
                } else {
                    this.this$0.mo180378m();
                }
                UserProfileHitPointV3.f130746c.mo180582d(azVar.mo180059w());
                return;
            }
            Log.m165389i("UserProfileFragmentV3", "convert String to Long for userId error");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ay */
    public static final class ay extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ View $clickView;
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ay(UserProfileFragmentV3 gVar, View view) {
            super(1);
            this.this$0 = gVar;
            this.$clickView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            String str;
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            if (!NetworkUtils.m94915b(this.this$0.getContext())) {
                Log.m165383e("UserProfileFragmentV3", "Network error ，open cover failed");
                return;
            }
            ImageSetPassThrough f = azVar.mo180040f();
            String str2 = null;
            if (f != null) {
                str = f.key;
            } else {
                str = null;
            }
            String str3 = str;
            boolean z2 = false;
            if (str3 == null || str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.m165397w("UserProfileFragmentV3", "profile cover is " + str);
                return;
            }
            if (azVar.mo180045j().length() == 0) {
                z2 = true;
            }
            if (z2) {
                Log.m165397w("UserProfileFragmentV3", "userId is empty");
            } else if (azVar.mo180006L()) {
                UserProfileFragmentV3 gVar = this.this$0;
                ImageSetPassThrough f2 = azVar.mo180040f();
                if (f2 != null) {
                    str2 = f2.key;
                }
                String j = azVar.mo180045j();
                View view = this.$clickView;
                String string = UIHelper.getString(R.string.Lark_Community_ChangeCover);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…rk_Community_ChangeCover)");
                gVar.mo180356a(str2, j, view, string);
            } else {
                this.this$0.mo180354a(str, this.$clickView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$az */
    public static final class az extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ View $clickView;
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        az(UserProfileFragmentV3 gVar, View view) {
            super(1);
            this.this$0 = gVar;
            this.$clickView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            this.this$0.mo180357a(azVar.mo180038e(), azVar.mo180045j(), azVar.mo180006L(), this.$clickView);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bc */
    public static final class bc extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bc(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            C52904e.m204638a().mo180527d(this.this$0.requireActivity(), azVar.mo180045j());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$singleClickUtil$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bk */
    public static final class bk extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130628a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        bk(UserProfileFragmentV3 gVar) {
            this.f130628a = gVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f130628a.mo180371g().loadProfileFromNet();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$c */
    public static final class C52822c extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52822c(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            String j = azVar.mo180045j();
            if (j.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = null;
            }
            if (j != null) {
                this.this$0.mo180371g().createP2pSecretChat(j, this.this$0.mo180371g().getSource());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$getLoadErrorSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$f */
    public static final class C52826f extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130630a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52826f(UserProfileFragmentV3 gVar) {
            this.f130630a = gVar;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f130630a.f130599j.onClick(view);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            Context context = this.f130630a.getContext();
            if (context != null) {
                textPaint.setColor(UIUtils.getColor(context, R.color.primary_pri_500));
                textPaint.setUnderlineText(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$g */
    public static final class C52827g extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52827g(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "state");
            this.this$0.mo180375j().mo133549a(this.this$0.requireActivity(), new Contact(azVar.mo180045j(), azVar.mo180038e(), azVar.mo180022a()), this.this$0.mo180371g().getSource(), "profile_add");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$k */
    public static final class C52832k extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52832k(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (azVar.mo180006L()) {
                ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.C52832k.View$OnClickListenerC528331 */

                    /* renamed from: a */
                    final /* synthetic */ C52832k f130634a;

                    {
                        this.f130634a = r1;
                    }

                    public final void onClick(View view) {
                        boolean z;
                        boolean z2;
                        LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) this.f130634a.this$0.mo180360b(R.id.user_status);
                        Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "user_status");
                        int selectionStart = linkEmojiTextView.getSelectionStart();
                        LinkEmojiTextView linkEmojiTextView2 = (LinkEmojiTextView) this.f130634a.this$0.mo180360b(R.id.user_status);
                        Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView2, "user_status");
                        int selectionEnd = linkEmojiTextView2.getSelectionEnd();
                        boolean z3 = false;
                        if (selectionStart == -1 && selectionEnd == -1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            LinkEmojiTextView linkEmojiTextView3 = (LinkEmojiTextView) this.f130634a.this$0.mo180360b(R.id.user_status);
                            Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView3, "user_status");
                            if (linkEmojiTextView3.getText() instanceof SpannableString) {
                                LinkEmojiTextView linkEmojiTextView4 = (LinkEmojiTextView) this.f130634a.this$0.mo180360b(R.id.user_status);
                                Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView4, "user_status");
                                CharSequence text = linkEmojiTextView4.getText();
                                if (text != null) {
                                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) text).getSpans(selectionStart, selectionEnd, ClickableSpan.class);
                                    if (clickableSpanArr != null) {
                                        if (clickableSpanArr.length == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            z3 = true;
                                        }
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type android.text.SpannableString");
                                }
                            }
                            z = z3;
                        }
                        if (!z) {
                            this.f130634a.this$0.mo180384s();
                        }
                    }
                });
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                Drawable iconDrawable = UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_right_bold_outlined, C57582a.m223616d(this.this$0.getContext(), R.color.icon_n2));
                iconDrawable.setBounds(0, 0, C52743a.m204272a(14), C52743a.m204272a(14));
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout)).setTagDrawable(iconDrawable);
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.C52832k.View$OnClickListenerC528342 */

                    /* renamed from: a */
                    final /* synthetic */ C52832k f130635a;

                    {
                        this.f130635a = r1;
                    }

                    public final void onClick(View view) {
                        this.f130635a.this$0.mo180384s();
                    }
                });
            } else {
                ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setOnClickListener(null);
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout)).setTagDrawable(null);
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout)).setOnClickListener(null);
            }
            String b = azVar.mo180035b();
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (azVar.mo180006L()) {
                    ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setTextColor(C57582a.m223616d(this.this$0.getContext(), R.color.text_caption));
                } else {
                    ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout)).setTagDrawable(null);
                }
                TextViewTagLayout textViewTagLayout = (TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout);
                Intrinsics.checkExpressionValueIsNotNull(textViewTagLayout, "user_status_layout");
                textViewTagLayout.setVisibility(0);
                ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setUrlTextColor(C57582a.m223616d(this.this$0.getContext(), R.color.text_link_normal));
                ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setPhoneTextColor(C57582a.m223616d(this.this$0.getContext(), R.color.text_link_normal));
                LinkEmojiTextView linkEmojiTextView = (LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status);
                linkEmojiTextView.setVisibility(0);
                if (azVar.ai() == null) {
                    C59170l a = C59170l.m229843a();
                    RecogniseSpansResult a2 = a.mo201118a(azVar.mo180045j() + azVar.mo180035b());
                    if (a2 == null) {
                        linkEmojiTextView.mo198367a(azVar.mo180035b(), null, false, true, azVar.mo180045j());
                    } else {
                        linkEmojiTextView.mo198366a(azVar.mo180035b(), a2, false);
                    }
                    this.this$0.mo180371g().getRecogniseSpansResult(azVar.mo180035b());
                } else {
                    linkEmojiTextView.mo198367a(azVar.mo180035b(), azVar.ai(), false, true, azVar.mo180045j());
                }
                linkEmojiTextView.setNeedToRecognize(true);
                linkEmojiTextView.setUrlStringClickListner(new C52835a(this, azVar));
                linkEmojiTextView.setPhoneStringClickListener(new C52836b(this, azVar));
            } else if (azVar.mo180006L()) {
                LinkEmojiTextView linkEmojiTextView2 = (LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status);
                Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView2, "user_status");
                linkEmojiTextView2.setVisibility(0);
                TextViewTagLayout textViewTagLayout2 = (TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout);
                Intrinsics.checkExpressionValueIsNotNull(textViewTagLayout2, "user_status_layout");
                textViewTagLayout2.setVisibility(0);
                ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setText(R.string.Lark_Profile_EnterYourSignature);
                ((LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status)).setTextColor(C57582a.m223616d(this.this$0.getContext(), R.color.text_placeholder));
            } else {
                LinkEmojiTextView linkEmojiTextView3 = (LinkEmojiTextView) this.this$0.mo180360b(R.id.user_status);
                Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView3, "user_status");
                linkEmojiTextView3.setVisibility(8);
                TextViewTagLayout textViewTagLayout3 = (TextViewTagLayout) this.this$0.mo180360b(R.id.user_status_layout);
                Intrinsics.checkExpressionValueIsNotNull(textViewTagLayout3, "user_status_layout");
                textViewTagLayout3.setVisibility(8);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initSubscribers$12$4$1", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IURLStringClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$k$a */
        public static final class C52835a implements LinkEmojiTextView.AbstractC58525j {

            /* renamed from: a */
            final /* synthetic */ C52832k f130636a;

            /* renamed from: b */
            final /* synthetic */ UserProfileState f130637b;

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str, "text");
                return false;
            }

            C52835a(C52832k kVar, UserProfileState azVar) {
                this.f130636a = kVar;
                this.f130637b = azVar;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str, "text");
                this.f130636a.this$0.mo180362b(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initSubscribers$12$4$2", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView$IPhoneStringClickListener;", "onPhoneClick", "", "view", "Landroid/view/View;", "phoneNumber", "", "onPhoneLongClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$k$b */
        public static final class C52836b implements LinkEmojiTextView.AbstractC58524i {

            /* renamed from: a */
            final /* synthetic */ C52832k f130638a;

            /* renamed from: b */
            final /* synthetic */ UserProfileState f130639b;

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            }

            C52836b(C52832k kVar, UserProfileState azVar) {
                this.f130638a = kVar;
                this.f130639b = azVar;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
                this.f130638a.this$0.mo180352a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$l */
    public static final class C52837l extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52837l(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            ((LinearLayout) this.this$0.mo180360b(R.id.custom_tag_layout)).removeAllViews();
            List<GetUserProfileResponse.CustomImage> N = azVar.mo180008N();
            if (N == null || N.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.this$0.mo180360b(R.id.custom_tag_layout);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "custom_tag_layout");
                linearLayout.setVisibility(8);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.this$0.mo180360b(R.id.custom_tag_layout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "custom_tag_layout");
            linearLayout2.setVisibility(0);
            int i = 0;
            for (T t : azVar.mo180008N()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                LinearLayout linearLayout3 = (LinearLayout) this.this$0.mo180360b(R.id.custom_tag_layout);
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.this$0.requireContext());
                ImageLoader.with(appCompatImageView.getContext()).load(new C38824b(t.resource_key)).into(appCompatImageView);
                if (i > 0) {
                    appCompatImageView.setPaddingRelative(C52743a.m204272a(8), 0, 0, 0);
                }
                linearLayout3.addView(appCompatImageView, new ViewGroup.LayoutParams(-2, -1));
                i = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$m */
    public static final class C52838m extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52838m(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initSubscribers$17$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$m$a */
        public static final class View$OnClickListenerC52839a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ UserProfileState.DepartmentTagInfo f130640a;

            /* renamed from: b */
            final /* synthetic */ C52838m f130641b;

            View$OnClickListenerC52839a(UserProfileState.DepartmentTagInfo bVar, C52838m mVar) {
                this.f130640a = bVar;
                this.f130641b = mVar;
            }

            public final void onClick(View view) {
                this.f130641b.this$0.mo180375j().mo133590t().openUrl(this.f130641b.this$0.getContext(), this.f130640a.mo180075c());
                UserProfileHitPointV3.f130746c.mo180574b(this.f130640a.mo180074b());
            }
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            UserProfileState.DepartmentTagInfo u;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            UserProfileFragmentV3 gVar = this.this$0;
            TextView textView = (TextView) gVar.mo180360b(R.id.user_department);
            Intrinsics.checkExpressionValueIsNotNull(textView, "user_department");
            gVar.mo180346a(textView, azVar.mo180037d());
            String d = azVar.mo180037d();
            if (d == null || d.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (u = azVar.mo180057u()) != null) {
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_department_layout)).setTagDrawable(this.this$0.mo180341a(u));
                ((TextViewTagLayout) this.this$0.mo180360b(R.id.user_department_layout)).setOnTagClickListener(new View$OnClickListenerC52839a(u, this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$n */
    public static final class C52840n extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52840n(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (azVar.mo180038e().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageView avatarView = ((DecoratedAvatar) this.this$0.mo180360b(R.id.decorated_avatar)).getAvatarView();
                if (avatarView != null) {
                    avatarView.setImageDrawable(null);
                }
                UserProfileFragmentV3.m204470b(this.this$0).setImageDrawable(null);
                return;
            }
            int a = C52743a.m204272a(108);
            int a2 = C52743a.m204272a(24);
            UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180615e();
            ImageLoader.with(this.this$0).load(AvatarImage.Builder.obtain(azVar.mo180038e(), azVar.mo180045j(), a, a).build()).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Core).mo105397a(Scene.Profile).mo105398a(ListenerParams.FromType.AVATAR).mo105395a(a).mo105403b(a).mo105399a(this.this$0.f130592c).mo105404b(azVar.mo180038e()).mo105402a())).into(((DecoratedAvatar) this.this$0.mo180360b(R.id.decorated_avatar)).getAvatarView());
            ImageLoader.with(this.this$0).load(AvatarImage.Builder.obtain(azVar.mo180038e(), azVar.mo180045j(), a2, a2).build()).into(UserProfileFragmentV3.m204470b(this.this$0));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$o */
    public static final class C52841o extends Lambda implements Function1<UserProfileState, Unit> {
        public static final C52841o INSTANCE = new C52841o();

        C52841o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            UserProfileHitPointV3.f130746c.mo180562a(new UserProfileExtraParams.ToUserIdParam(azVar.mo180010P()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$p */
    public static final class C52842p extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52842p(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            ImageSetPassThrough f = azVar.mo180040f();
            if (f != null) {
                String str = f.key;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.key");
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    f = null;
                }
                if (f != null) {
                    IRequestCreator load = ImageLoader.with(this.this$0).load(new PassThroughImage(f.key, f.fs_unit));
                    ListenerParams.Builder a = new ListenerParams.Builder().mo105396a(Biz.Core).mo105397a(Scene.Profile).mo105398a(ListenerParams.FromType.COVER);
                    ImageView imageView = (ImageView) this.this$0.mo180360b(R.id.header_image);
                    Intrinsics.checkExpressionValueIsNotNull(imageView, "header_image");
                    ListenerParams.Builder a2 = a.mo105395a(imageView.getMeasuredWidth());
                    ImageView imageView2 = (ImageView) this.this$0.mo180360b(R.id.header_image);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "header_image");
                    load.listener(new PerfLoadPicMonitor.MonitorRequestListener(a2.mo105403b(imageView2.getMeasuredHeight()).mo105404b(f.key).mo105402a())).into((ImageView) this.this$0.mo180360b(R.id.header_image));
                    return;
                }
            }
            ((ImageView) this.this$0.mo180360b(R.id.header_image)).setImageDrawable(null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$q */
    public static final class C52843q extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52843q(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initSubscribers$23$2$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$q$a */
        public static final class View$OnClickListenerC52844a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CtaView f130642a;

            /* renamed from: b */
            final /* synthetic */ C52843q f130643b;

            /* renamed from: c */
            final /* synthetic */ UserProfileState f130644c;

            /* renamed from: d */
            final /* synthetic */ int f130645d;

            View$OnClickListenerC52844a(CtaView ctaView, C52843q qVar, UserProfileState azVar, int i) {
                this.f130642a = ctaView;
                this.f130643b = qVar;
                this.f130644c = azVar;
                this.f130645d = i;
            }

            public final void onClick(View view) {
                this.f130643b.this$0.mo180351a(this.f130642a, this.f130644c.mo180042h().get(this.f130645d));
            }
        }

        public final void invoke(UserProfileState azVar) {
            CtaView.CtaStyle ctaStyle;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Iterator<T> it = this.this$0.mo180373h().iterator();
            while (it.hasNext()) {
                it.next().setVisibility(8);
            }
            View b = this.this$0.mo180360b(R.id.cta_bottom_margin);
            Intrinsics.checkExpressionValueIsNotNull(b, "cta_bottom_margin");
            b.setVisibility(8);
            if (!azVar.mo180042h().isEmpty()) {
                View b2 = this.this$0.mo180360b(R.id.cta_bottom_margin);
                Intrinsics.checkExpressionValueIsNotNull(b2, "cta_bottom_margin");
                b2.setVisibility(0);
                int size = azVar.mo180042h().size();
                for (int i = 0; i < size; i++) {
                    if (i >= 4) {
                        Log.m165397w("UserProfileFragmentV3", "there are more than 4 ctas.");
                        return;
                    }
                    CtaView ctaView = this.this$0.mo180373h().get(i);
                    C52662c.m204100a(ctaView, azVar.mo180042h().get(i));
                    ctaView.setOnClickListener(new View$OnClickListenerC52844a(ctaView, this, azVar, i));
                    ctaView.setVisibility(0);
                    if (azVar.mo180042h().size() == 1) {
                        ctaStyle = CtaView.CtaStyle.VERTICAL;
                    } else {
                        ctaStyle = CtaView.CtaStyle.HORIZONTAL;
                    }
                    ctaView.setCtaStyle(ctaStyle);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$r */
    public static final class C52845r extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52845r(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            ProfileTabAdapter i = this.this$0.mo180374i();
            i.mo180202a(azVar.mo180045j());
            i.mo180203a(azVar.mo180044i());
            if (azVar.mo180044i().size() <= 1) {
                UDTabLayout uDTabLayout = (UDTabLayout) this.this$0.mo180360b(R.id.tab);
                Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "tab");
                uDTabLayout.setVisibility(8);
            } else {
                UDTabLayout uDTabLayout2 = (UDTabLayout) this.this$0.mo180360b(R.id.tab);
                Intrinsics.checkExpressionValueIsNotNull(uDTabLayout2, "tab");
                uDTabLayout2.setVisibility(0);
                this.this$0.mo180380o();
            }
            if (!azVar.mo180044i().isEmpty()) {
                UIUtils.show((ViewPager2) this.this$0.mo180360b(R.id.viewPager));
            }
            if (this.this$0.mo180371g().getSource().getSourceType() == 11) {
                Iterator<UserProfileState.TabInfo> it = azVar.mo180044i().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it.next().mo180094b() == GetUserProfileResponse.TabInfo.TabType.F_COMMUNITY) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    ViewPager2 viewPager2 = (ViewPager2) this.this$0.mo180360b(R.id.viewPager);
                    Intrinsics.checkExpressionValueIsNotNull(viewPager2, "viewPager");
                    viewPager2.setCurrentItem(i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$s */
    public static final class C52846s extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52846s(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            String a;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Event<String> aa = azVar.aa();
            if (aa != null && (a = aa.mo86215a()) != null) {
                this.this$0.mo180372g(a);
                this.this$0.mo180371g().setFirstStartSecretChat();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$t */
    public static final class C52847t extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52847t(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            String str;
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            Event<String> ab = azVar.ab();
            if (ab != null) {
                str = ab.mo86215a();
            } else {
                str = null;
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "it");
                UDToast.show(requireContext, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$u */
    public static final class C52848u extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52848u(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            IconToast a = azVar.al().mo86215a();
            if (a != null) {
                if (a.mo180187a().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    a = null;
                }
                if (a != null) {
                    this.this$0.mo180353a(a.mo180187a(), a.mo180188b());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$v */
    public static final class C52849v extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52849v(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$initSubscribers$36$2$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$v$a */
        public static final class C52852a extends IActionTitlebar.C57573a {

            /* renamed from: a */
            final /* synthetic */ UserProfileState.ShareInfo f130650a;

            /* renamed from: b */
            final /* synthetic */ Drawable f130651b;

            /* renamed from: c */
            final /* synthetic */ C52849v f130652c;

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                if (this.f130650a.mo180088a()) {
                    this.f130652c.this$0.mo180381p();
                    return;
                }
                String b = this.f130650a.mo180089b();
                if (b != null) {
                    Context context = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                    UDToast.show(context, b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52852a(UserProfileState.ShareInfo dVar, Drawable drawable, Drawable drawable2, C52849v vVar) {
                super(drawable2);
                this.f130650a = dVar;
                this.f130651b = drawable;
                this.f130652c = vVar;
            }
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            String str;
            Drawable drawable;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            CommonTitleBar commonTitleBar = (CommonTitleBar) this.this$0.mo180360b(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "title_bar");
            if (commonTitleBar.getActionCount() > 0) {
                ((CommonTitleBar) this.this$0.mo180360b(R.id.title_bar)).removeAllActions();
            }
            if (!C52239a.m202617d().mo133561a("im.contact.favorite") || azVar.mo180006L()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (azVar.mo180059w()) {
                    Context requireContext = this.this$0.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                    Context requireContext2 = this.this$0.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext2, "requireContext()");
                    drawable = UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_special_attention_filled, UDColorUtils.getColor(requireContext2, R.color.ud_Y500));
                    str = "focused_tag";
                } else {
                    Context requireContext3 = this.this$0.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext3, "requireContext()");
                    Context requireContext4 = this.this$0.requireContext();
                    Intrinsics.checkExpressionValueIsNotNull(requireContext4, "requireContext()");
                    drawable = UDIconUtils.getIconDrawable(requireContext3, (int) R.drawable.ud_icon_special_attention_outlined, UDColorUtils.getColor(requireContext4, R.color.static_white));
                    str = "unfocused_tag";
                }
                ((CommonTitleBar) this.this$0.mo180360b(R.id.title_bar)).addAction(new IActionTitlebar.C57573a(this, drawable, drawable) {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.C52849v.C528501 */

                    /* renamed from: a */
                    final /* synthetic */ C52849v f130646a;

                    /* renamed from: b */
                    final /* synthetic */ Drawable f130647b;

                    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                    public void performAction(View view) {
                        this.f130646a.this$0.mo180377l();
                    }

                    {
                        this.f130646a = r1;
                        this.f130647b = r2;
                    }
                }.setTag(str));
            }
            UserProfileState.ShareInfo v = azVar.mo180058v();
            if (v != null) {
                Context requireContext5 = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext5, "requireContext()");
                Drawable iconDrawable = UDIconUtils.getIconDrawable(requireContext5, (int) R.drawable.ud_icon_share_outlined, C57582a.m223616d(this.this$0.getContext(), R.color.static_white));
                ((CommonTitleBar) this.this$0.mo180360b(R.id.title_bar)).addAction(new C52852a(v, iconDrawable, iconDrawable, this));
            }
            if (azVar.mo179996B()) {
                Context requireContext6 = this.this$0.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext6, "requireContext()");
                Drawable iconDrawable2 = UDIconUtils.getIconDrawable(requireContext6, (int) R.drawable.ud_icon_more_bold_outlined, C57582a.m223616d(this.this$0.getContext(), R.color.static_white));
                ((CommonTitleBar) this.this$0.mo180360b(R.id.title_bar)).addAction(new IActionTitlebar.C57573a(this, iconDrawable2, iconDrawable2) {
                    /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.C52849v.C528512 */

                    /* renamed from: a */
                    final /* synthetic */ C52849v f130648a;

                    /* renamed from: b */
                    final /* synthetic */ Drawable f130649b;

                    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                    public void performAction(View view) {
                        Intrinsics.checkParameterIsNotNull(view, "view");
                        this.f130648a.this$0.mo180382q();
                    }

                    {
                        this.f130648a = r1;
                        this.f130649b = r2;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$w */
    public static final class C52853w extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52853w(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (azVar.ae() != null) {
                this.this$0.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$x */
    public static final class C52854x extends Lambda implements Function1<UserProfileState, Unit> {
        public static final C52854x INSTANCE = new C52854x();

        C52854x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            UserProfileHitPointV3.f130746c.mo180561a(azVar.mo180011Q());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$y */
    public static final class C52855y extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52855y(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.this$0.mo180360b(R.id.root_layout);
            Intrinsics.checkExpressionValueIsNotNull(coordinatorLayout, "root_layout");
            this.this$0.mo180376k().mo237032b().mo179592a((View) coordinatorLayout, azVar.mo180051p());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$z */
    public static final class C52856z extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ UserProfileFragmentV3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52856z(UserProfileFragmentV3 gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            if (azVar.ag()) {
                UIUtils.hide((ViewPager2) this.this$0.mo180360b(R.id.viewPager));
                UIUtils.hide((UDButton) this.this$0.mo180360b(R.id.mFriendRequestBtn));
                UIUtils.show((LinearLayout) this.this$0.mo180360b(R.id.mPlaceholder));
                UIUtils.hide((TextView) this.this$0.mo180360b(R.id.mTipsTv));
                ((ImageView) this.this$0.mo180360b(R.id.mHolderIv)).setImageResource(R.drawable.illustration_placeholder_common_no_content);
                ((TextView) this.this$0.mo180360b(R.id.mHolderTv)).setText(R.string.Lark_NewContacts_ProfileNoInfo);
                return;
            }
            UIUtils.hide((LinearLayout) this.this$0.mo180360b(R.id.mPlaceholder));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m204465a(UserProfileFragmentV3 gVar) {
        TextView textView = gVar.f130596g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleNameView");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m204470b(UserProfileFragmentV3 gVar) {
        ImageView imageView = gVar.f130595f;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleAvatarView");
        }
        return imageView;
    }

    /* renamed from: c */
    public final void mo180365c(View view) {
        mo180371g().withState(new ay(this, view));
    }

    /* renamed from: e */
    public final void mo180368e(String str) {
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133574f(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ax */
    static final class ax implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130620a;

        ax(UserProfileFragmentV3 gVar) {
            this.f130620a = gVar;
        }

        public final void onClick(View view) {
            IProfileModuleDependency d = C52239a.m202617d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
            d.mo133592v().mo133645a(this.f130620a.getActivity(), 2);
            UserProfileHitPointV3.f130746c.mo180594m();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/UserProfileFragmentV3$showPhoneCallSelectMenu$5", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bi */
    public static final class bi implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ List f130625a;

        /* renamed from: b */
        final /* synthetic */ Map f130626b;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            Function0 function0 = (Function0) this.f130626b.get((UDBaseListDialogBuilder.ListItem) this.f130625a.get(i));
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
        }

        bi(List list, Map map) {
            this.f130625a = list;
            this.f130626b = map;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$h */
    public static final class View$OnClickListenerC52828h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130631a;

        View$OnClickListenerC52828h(UserProfileFragmentV3 gVar) {
            this.f130631a = gVar;
        }

        public final void onClick(View view) {
            ImageView avatarView = ((DecoratedAvatar) this.f130631a.mo180360b(R.id.decorated_avatar)).getAvatarView();
            if (avatarView != null) {
                this.f130631a.mo180361b(avatarView);
            }
        }
    }

    /* renamed from: d */
    public final void mo180367d(String str) {
        FragmentActivity requireActivity = requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133584n().mo133662a((Activity) requireActivity, str);
    }

    /* renamed from: f */
    public final void mo180370f(String str) {
        FragmentActivity requireActivity = requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133584n().mo133666b(requireActivity, str);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m204462J()) {
            finish();
        } else {
            mo180371g().start();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$i */
    public static final class View$OnClickListenerC52829i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130632a;

        View$OnClickListenerC52829i(UserProfileFragmentV3 gVar) {
            this.f130632a = gVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180583e();
            ImageView imageView = (ImageView) this.f130632a.mo180360b(R.id.header_image);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "header_image");
            if (imageView.getDrawable() != null) {
                UserProfileFragmentV3 gVar = this.f130632a;
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                gVar.mo180365c(view);
                UserProfileHitPointV3.f130746c.mo180603v();
            }
        }
    }

    /* renamed from: g */
    public final void mo180372g(String str) {
        requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133586p().mo133603a(getActivity(), str);
        IProfileModuleDependency iProfileModuleDependency2 = this.f130593d;
        if (iProfileModuleDependency2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency2.mo133565c().mo133649a();
        finish();
    }

    /* renamed from: a */
    private final View m204464a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context, null, 0, 6, null);
        lKUIRoundedImageView2.setBorderColor(C57582a.m223616d(context, R.color.static_white));
        lKUIRoundedImageView2.setBorderWidthInDp(1.5f);
        lKUIRoundedImageView2.setOval(true);
        this.f130595f = lKUIRoundedImageView2;
        linearLayout.addView(lKUIRoundedImageView2, new FrameLayout.LayoutParams(C52743a.m204272a(24), C52743a.m204272a(24)));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextSize(17.0f);
        appCompatTextView.setTextColor(C57582a.m223616d(context, R.color.text_title));
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.f130596g = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = C52743a.m204272a(6);
        layoutParams.gravity = 17;
        linearLayout.addView(appCompatTextView, layoutParams);
        return linearLayout;
    }

    /* renamed from: b */
    public final void mo180361b(View view) {
        mo180371g().withState(new am(this, view));
    }

    /* renamed from: c */
    public final void mo180366c(String str) {
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            UDDialogBuilder eVar = new UDDialogBuilder(context);
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SecretCreateConfirmNotice, "name", str);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…                userName)");
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(mustacheFormat)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new ba(this))).show();
        }
    }

    /* renamed from: a */
    private final String m204466a(WorkStatus workStatus) {
        String str;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long l = workStatus.start_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "start_time");
        long millis = timeUnit.toMillis(l.longValue());
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        Long l2 = workStatus.end_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "end_time");
        long millis2 = timeUnit2.toMillis(l2.longValue());
        if (C26280j.m95165a(millis, 1) == C26280j.m95165a(millis2, 1)) {
            str = UIUtils.getString(getContext(), R.string.Lark_Legacy_CommonEnShortDateFormat);
        } else {
            str = UIUtils.getString(getContext(), R.string.Lark_Legacy_CommonEnLongDateFormat);
        }
        String a = C26280j.m95169a(str, millis);
        String a2 = C26280j.m95169a(str, millis2);
        if (TextUtils.equals(a, a2)) {
            return a + ' ' + workStatus.description;
        }
        return a + '-' + a2 + ' ' + workStatus.description;
    }

    /* renamed from: b */
    public final void mo180362b(String str) {
        FragmentActivity requireActivity = requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133550a(requireActivity, str);
    }

    /* renamed from: a */
    private final void m204468a(UserProfileState.CtaInfo aVar) {
        mo180371g().withState(new an(this, aVar));
    }

    /* renamed from: b */
    public final void mo180364b(boolean z) {
        if (z) {
            UserProfileHitPointV3.f130746c.mo180592k();
        } else {
            UserProfileHitPointV3.f130746c.mo180588g();
        }
    }

    /* renamed from: a */
    public final Drawable mo180341a(UserProfileState.DepartmentTagInfo bVar) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return null");
        return new ProfileDepartmentTagBuilder(context).mo180192a(bVar.mo180073a(), bVar.mo180074b()).mo180193a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ba */
    public static final class ba implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130621a;

        ba(UserProfileFragmentV3 gVar) {
            this.f130621a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f130621a.mo180385t();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bj */
    public static final class bj implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final bj f130627a = new bj();

        bj() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UserProfileHitPointV3.f130746c.mo180585e(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bb */
    public static final class bb implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130622a;

        bb(UserProfileFragmentV3 gVar) {
            this.f130622a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f130622a.mo180371g().deleteNameCard();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$bd */
    public static final class bd implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130623a;

        bd(UserProfileFragmentV3 gVar) {
            this.f130623a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f130623a.mo180388w();
            } else if (i == 1) {
                this.f130623a.mo180387v();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$e */
    public static final class DialogInterface$OnClickListenerC52824e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130629a;

        DialogInterface$OnClickListenerC52824e(UserProfileFragmentV3 gVar) {
            this.f130629a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UserProfileHitPointV3.f130746c.mo180585e(true);
            this.f130629a.mo180371g().withState(new Function1<UserProfileState, Unit>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3.DialogInterface$OnClickListenerC52824e.C528251 */
                final /* synthetic */ DialogInterface$OnClickListenerC52824e this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                    invoke(azVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(UserProfileState azVar) {
                    Intrinsics.checkParameterIsNotNull(azVar, UpdateKey.STATUS);
                    Long longOrNull = StringsKt.toLongOrNull(azVar.mo180045j());
                    if (longOrNull != null) {
                        this.this$0.f130629a.mo180371g().onSpecialFocusViewClick(false, longOrNull.longValue());
                        return;
                    }
                    UserProfileFragmentV3 gVar = this.this$0.f130629a;
                    Log.m165389i("UserProfileFragmentV3", "convert String to Int for userId error");
                }
            });
        }
    }

    /* renamed from: a */
    private final void m204467a(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m204453A();
        m204455C();
        m204454B();
    }

    /* renamed from: b */
    public final void mo180363b(String str, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback) {
        requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133559a(str, false, false, iVCLaunchCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo180371g().onActivityResult(i, i2, intent);
    }

    /* renamed from: b */
    private final void m204471b(String str, String str2, View view) {
        FragmentActivity requireActivity = requireActivity();
        IProfileModuleDependency iProfileModuleDependency = this.f130593d;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        iProfileModuleDependency.mo133551a(requireActivity, str, str2, view);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180617g();
        View inflate = layoutInflater.inflate(R.layout.activity_user_profile_v3, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        LKUIFrameLayout lKUIFrameLayout = (LKUIFrameLayout) inflate.findViewById(R.id.root_frame_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIFrameLayout, "rootView.root_frame_layout");
        this.f130602n = lKUIFrameLayout;
        if (lKUIFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootFrameLayout");
        }
        lKUIFrameLayout.registerPlus(UserProfileDrawEventPlus.class);
        UserProfilePerceptionErrorCostTimeHitPoint.f130747a.mo180618h();
        return inflate;
    }

    /* renamed from: a */
    private final void m204469a(String str, String str2, View view) {
        FragmentActivity requireActivity = requireActivity();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str2);
        C58630d.m227375a((Context) requireActivity, (List<String>) arrayList, (List<String>) arrayList2, 0, view, false, 640, 640, Biz.Core, Scene.Profile, 5);
    }

    /* renamed from: a */
    private final float m204463a(float f, float f2, int i, double d) {
        float f3 = (((float) i) - f) / (f2 - f);
        if (f3 < ((float) 0)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f3 > ((float) 1)) {
            return 1.0f;
        }
        return (float) (1.0d - Math.pow(1.0d - ((double) f3), d));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.g$ak */
    public static final class ak implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ UserProfileFragmentV3 f130615a;

        ak(UserProfileFragmentV3 gVar) {
            this.f130615a = gVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f130615a.mo180360b(R.id.collapsing_layout);
            Intrinsics.checkExpressionValueIsNotNull(collapsingToolbarLayout, "collapsing_layout");
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            collapsingToolbarLayout.setMinimumHeight(view.getHeight());
        }
    }
}

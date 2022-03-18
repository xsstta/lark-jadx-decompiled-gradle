package com.ss.android.lark.moments.impl.publish.input;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0922v;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.C40727b;
import com.ss.android.lark.keyboard.plugin.input.GetUrlInlineFromCallback;
import com.ss.android.lark.keyboard.plugin.input.IInputContext;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.hashtag.HashTagKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.span.FakeBoldSpan;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.widget.OnSelectionChangedListener;
import com.ss.android.lark.moments.impl.common.widget.SelectionListenerRichTextEditText;
import com.ss.android.lark.moments.impl.common.widget.keyboard.photo.MomentsPhotoKBPlugin;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.publish.category.CategoryTag;
import com.ss.android.lark.moments.impl.publish.category.MomentsCategoryListFragment;
import com.ss.android.lark.moments.impl.publish.category.PublishTagListAdapter;
import com.ss.android.lark.moments.impl.publish.draft.ImageData;
import com.ss.android.lark.moments.impl.publish.draft.MomentsDraftData;
import com.ss.android.lark.moments.impl.publish.draft.VideoGridInfo;
import com.ss.android.lark.moments.impl.publish.grid.GridImageData;
import com.ss.android.lark.moments.impl.publish.grid.GridVideoData;
import com.ss.android.lark.moments.impl.publish.grid.ImageItemTouchCallback;
import com.ss.android.lark.moments.impl.publish.grid.MediaState;
import com.ss.android.lark.moments.impl.publish.grid.MomentsPublishGridAdapter;
import com.ss.android.lark.moments.impl.publish.grid.OnMediaStateChangedListener;
import com.ss.android.lark.moments.impl.publish.hashtag.C47987c;
import com.ss.android.lark.moments.impl.publish.hashtag.MomentsTopicSpan;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002W\\\u0018\u0000 ¼\u00012\u00020\u00012\u00020\u0002:\u0002¼\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010d\u001a\u00020e2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020h0g2\b\b\u0002\u0010i\u001a\u00020\nJ\u0014\u0010j\u001a\u00020e2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020'0gJ\b\u0010l\u001a\u00020%H\u0016J\u0006\u0010m\u001a\u00020%J\n\u0010n\u001a\u0004\u0018\u00010oH\u0016J\b\u0010p\u001a\u00020%H\u0016J\f\u0010q\u001a\b\u0012\u0004\u0012\u00020s0rJ\b\u0010t\u001a\u00020uH\u0016J\b\u0010v\u001a\u00020%H\u0016J\u0006\u0010w\u001a\u00020%J\b\u0010x\u001a\u0004\u0018\u00010yJ\u0006\u0010z\u001a\u00020\nJ\u0006\u0010{\u001a\u00020\nJ\u0006\u0010|\u001a\u00020\nJ\u0006\u0010}\u001a\u00020eJ\u0006\u0010~\u001a\u00020eJ\u0006\u0010\u001a\u00020eJ\t\u0010\u0001\u001a\u00020eH\u0002J\t\u0010\u0001\u001a\u00020eH\u0002J\u0014\u0010\u0001\u001a\u00020e2\t\u0010\u0001\u001a\u0004\u0018\u00010'H\u0002J\t\u0010\u0001\u001a\u00020eH\u0002J\t\u0010\u0001\u001a\u00020\nH\u0016J\u0013\u0010\u0001\u001a\u00020e2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\u00112\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001b\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020B2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\t\u0010\u0001\u001a\u00020eH\u0016J\u0012\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020\nH\u0016J\t\u0010\u0001\u001a\u00020eH\u0016J\u001a\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020\u0011H\u0016J\u0015\u0010\u0001\u001a\u00020e2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u001c\u0010\u0001\u001a\u00020e2\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\nH\u0016J\t\u0010\u0001\u001a\u00020eH\u0016J\t\u0010\u0001\u001a\u00020eH\u0002J\u0010\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020'J\u0007\u0010\u0001\u001a\u00020eJ\u0007\u0010\u0001\u001a\u00020eJ\t\u0010\u0001\u001a\u00020eH\u0002J\u0016\u0010 \u0001\u001a\u00020e2\r\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020'0rJ\u0010\u0010¢\u0001\u001a\u00020e2\u0007\u0010£\u0001\u001a\u00020'J\u0011\u0010¤\u0001\u001a\u00020e2\u0006\u0010(\u001a\u00020)H\u0016J\u0015\u0010¥\u0001\u001a\u00020e2\n\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001H\u0002J\u0012\u0010¨\u0001\u001a\u00020e2\u0007\u0010©\u0001\u001a\u00020\nH\u0002J\u0019\u0010ª\u0001\u001a\u00020e2\b\u0010«\u0001\u001a\u00030¬\u00012\u0006\u0010i\u001a\u00020\nJ\u0012\u0010­\u0001\u001a\u00020e2\u0007\u0010®\u0001\u001a\u00020QH\u0016J9\u0010¯\u0001\u001a\u00020e2\u0007\u0010°\u0001\u001a\u00020\n2\u000b\b\u0002\u0010±\u0001\u001a\u0004\u0018\u00010'2\u000b\b\u0002\u0010²\u0001\u001a\u0004\u0018\u00010'2\u000b\b\u0002\u0010³\u0001\u001a\u0004\u0018\u00010'H\u0002J$\u0010´\u0001\u001a\u00020e2\u001b\u0010µ\u0001\u001a\u0016\u0012\u0005\u0012\u00030·\u00010¶\u0001j\n\u0012\u0005\u0012\u00030·\u0001`¸\u0001J\u0007\u0010¹\u0001\u001a\u00020eJ\t\u0010º\u0001\u001a\u00020eH\u0002J\u0014\u0010»\u0001\u001a\u00020e2\t\u0010\u0001\u001a\u0004\u0018\u00010'H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b1\u00102R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020BX.¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX.¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX.¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX.¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX.¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u00020WX\u0004¢\u0006\u0004\n\u0002\u0010XR\u0010\u0010Y\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u00020\\X\u0004¢\u0006\u0004\n\u0002\u0010]R\u0010\u0010^\u001a\u0004\u0018\u00010UX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010_\u001a\u00020`8BX\u0002¢\u0006\f\n\u0004\bc\u0010\u001d\u001a\u0004\ba\u0010b¨\u0006½\u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/BaseInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "keyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "inputDelegate", "Lcom/ss/android/lark/moments/impl/publish/input/IMomentsInputPluginDelegate;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "forceBindCategory", "", "(Lcom/ss/android/lark/keyboard/KeyBoard;Lcom/ss/android/lark/moments/impl/publish/input/IMomentsInputPluginDelegate;Landroidx/appcompat/app/AppCompatActivity;Z)V", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "categoryAdapter", "Lcom/ss/android/lark/moments/impl/publish/category/PublishTagListAdapter;", "categoryCard", "Landroid/view/View;", "categoryCardContent", "categoryList", "categoryListFragment", "Lcom/ss/android/lark/moments/impl/publish/category/MomentsCategoryListFragment;", "categoryRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "categoryRvLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getCategoryRvLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "categoryRvLayoutManager$delegate", "Lkotlin/Lazy;", "categoryScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getCategoryScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "categoryScrollListener$delegate", "categorySelector", "contentHeight", "", "contentHint", "", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "gridAdapter", "Lcom/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter;", "getGridAdapter", "()Lcom/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter;", "gridAdapter$delegate", "helper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "getHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "helper$delegate", "icRight", "Landroid/widget/ImageView;", "inputContent", "interruptSend", "isHideToolMenuWhenHide", "isResume", "isShowAnimation", "isShowGroupContainer", "isSilent", "ivChooseCategory", "ivFrom", "getKeyBoard", "()Lcom/ss/android/lark/keyboard/KeyBoard;", "mActivity", "Landroid/app/Activity;", "mAdditionFuncContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mCurrET", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "mMediaRecyclerView", "mPopDrawerContainer", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout;", "mPostContentET", "Lcom/ss/android/lark/moments/impl/common/widget/SelectionListenerRichTextEditText;", "mPostMsgEtContainer", "Landroidx/core/widget/NestedScrollView;", "mRootView", "mSendBtn", "mTextWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "moreLabel", "Landroid/widget/TextView;", "selectionChangedListener", "com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$selectionChangedListener$1", "Lcom/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$selectionChangedListener$1;", "shadowLeft", "shadowRight", "textChangedListener", "com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$textChangedListener$1", "Lcom/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$textChangedListener$1;", "tvFrom", "viewModel", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "getViewModel", "()Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel;", "viewModel$delegate", "addPhotos", "", "orderPhotos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "checkDeletePhotos", "photoUrls", "getAdditionDividerHeight", "getCurMaxCount", "getCurrET", "Landroid/widget/EditText;", "getHeight", "getImages", "", "Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "getLayoutId", "getSelectedCount", "getVideoGridInfo", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "hasAt", "hasImage", "hasVideo", "hideCategoryList", "hideKeyBoardAndPlugin", "initInputSupportPlugin", "initListener", "initObserver", "initPluginOnResume", "selectedPlugin", "initView", "isFullScreen", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onCreateSendBtn", "parent", "Landroid/view/ViewGroup;", "onCreateView", "onDestroy", "onEnableChanged", "isEnable", "onFinishReplyMode", "onInitView", "rootView", "onResume", "params", "onSaveDraft", "onSetDraft", "draft", "append", "onStop", "refreshSendBtState", "replaceCurrentHashTag", ChatTypeStateKeeper.f135670e, "requestLayout", "scrollToStart", "setEditTextDisplay", "setErrorPhoto", "paths", "setHint", "hint", "setInputSupportContext", "setPostContentRichTextSilent", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "setSendBtEnable", "enable", "setSuccessPhoto", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "setTextWatcher", "textWatcher", "showCategoryCardContent", "selected", "id", "name", "iconKey", "showCategoryList", "categories", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Lkotlin/collections/ArrayList;", "showKeyboardFocusOnEt", "startCategoryListFragment", "startShowAnim", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.input.b */
public final class MomentsPublishInputSupportPlugin extends BaseInputSupportPlugin implements IInputSupportPlugin {

    /* renamed from: q */
    public static final Companion f120804q = new Companion(null);

    /* renamed from: A */
    private boolean f120805A;

    /* renamed from: B */
    private View f120806B;

    /* renamed from: C */
    private View f120807C;

    /* renamed from: D */
    private PublishTagListAdapter f120808D;

    /* renamed from: E */
    private View f120809E;

    /* renamed from: F */
    private RecyclerView f120810F;

    /* renamed from: G */
    private final Lazy f120811G = LazyKt.lazy(new C47988b(this));

    /* renamed from: H */
    private TextView f120812H;

    /* renamed from: I */
    private View f120813I;

    /* renamed from: J */
    private View f120814J;

    /* renamed from: K */
    private ImageView f120815K;

    /* renamed from: L */
    private ImageView f120816L;

    /* renamed from: M */
    private TextView f120817M;

    /* renamed from: N */
    private ImageView f120818N;

    /* renamed from: O */
    private boolean f120819O;

    /* renamed from: P */
    private boolean f120820P;

    /* renamed from: Q */
    private final Lazy f120821Q = LazyKt.lazy(new C47989c(this));

    /* renamed from: R */
    private final C48007r f120822R = new C48007r(this);

    /* renamed from: S */
    private final C48004o f120823S = new C48004o(this);

    /* renamed from: T */
    private final KeyBoard f120824T;

    /* renamed from: U */
    private final IMomentsInputPluginDelegate f120825U;

    /* renamed from: V */
    private final AppCompatActivity f120826V;

    /* renamed from: b */
    public Activity f120827b;

    /* renamed from: c */
    public IInputContext f120828c;

    /* renamed from: d */
    public View f120829d;

    /* renamed from: e */
    public SelectionListenerRichTextEditText f120830e;

    /* renamed from: f */
    public RecyclerView f120831f;

    /* renamed from: g */
    public ConstraintLayout f120832g;

    /* renamed from: h */
    public boolean f120833h;

    /* renamed from: i */
    public boolean f120834i;

    /* renamed from: j */
    public boolean f120835j;

    /* renamed from: k */
    public RichTextEmojiconEditText f120836k;

    /* renamed from: l */
    public IKeyBoardPlugin.IKeyBoardContext.ITextWatcher f120837l;

    /* renamed from: m */
    public View f120838m;

    /* renamed from: n */
    public View f120839n;

    /* renamed from: o */
    public int f120840o;

    /* renamed from: p */
    public final boolean f120841p;

    /* renamed from: r */
    private final Lazy f120842r;

    /* renamed from: s */
    private MomentsCategoryListFragment f120843s;

    /* renamed from: t */
    private String f120844t;

    /* renamed from: u */
    private NestedScrollView f120845u;

    /* renamed from: v */
    private CommonTitleBar f120846v;

    /* renamed from: w */
    private final Lazy f120847w = LazyKt.lazy(new C47993e(this));

    /* renamed from: x */
    private final Lazy f120848x = LazyKt.lazy(new C47991d(this));

    /* renamed from: y */
    private View f120849y;

    /* renamed from: z */
    private SlidingUpPanelLayout f120850z;

    /* renamed from: J */
    private final RecyclerView.OnScrollListener m189452J() {
        return (RecyclerView.OnScrollListener) this.f120821Q.getValue();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    public int mo147010b() {
        return 0;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147088b(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "replyData");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: h */
    public boolean mo146903h() {
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: i */
    public int mo147089i() {
        return R.layout.moments_post_kb_input;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: j */
    public void mo147090j() {
    }

    /* renamed from: o */
    public final MomentsPublishViewModel mo168122o() {
        return (MomentsPublishViewModel) this.f120842r.getValue();
    }

    /* renamed from: p */
    public final ItemTouchHelper mo168123p() {
        return (ItemTouchHelper) this.f120847w.getValue();
    }

    /* renamed from: q */
    public final MomentsPublishGridAdapter mo168124q() {
        return (MomentsPublishGridAdapter) this.f120848x.getValue();
    }

    /* renamed from: r */
    public final LinearLayoutManager mo168125r() {
        return (LinearLayoutManager) this.f120811G.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$Companion;", "", "()V", "INPUT_TEXT_LIMIT_LENGTH", "", "LOG_TAG", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: H */
    public final KeyBoard mo168112H() {
        return this.f120824T;
    }

    /* renamed from: I */
    public final AppCompatActivity mo168113I() {
        return this.f120826V;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: m */
    public IOutInputSupport.InputSupportType mo146905m() {
        return IOutInputSupport.InputSupportType.THREADPOSTINPUT;
    }

    /* renamed from: a */
    public final void mo168115a(String str) {
        if (str != null) {
            IInputContext eVar = this.f120828c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar.mo147119a(str);
            return;
        }
        Activity activity = this.f120827b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        KeyboardUtils.showKeyboard(activity);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147087a(TransationData jVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(jVar, "draft");
        MomentsDraftData.Companion aVar = MomentsDraftData.f120721a;
        Object a = jVar.mo147174a("draft_extra_data");
        if (!(a instanceof TransationData)) {
            a = null;
        }
        MomentsDraftData a2 = aVar.mo168030a((TransationData) a);
        if (a2 == null) {
            Log.m165389i("MomentsPublishInputSupportPlugin", "onSetDraft DRAFT_POST_EXTRA_DATA = null");
            return;
        }
        mo168122o().handleDraftCategory(a2.mo168022b());
        RichText c = a2.mo168023c();
        if (c == null) {
            c = C59029c.m229155a();
        }
        if (z) {
            SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
            if (selectionListenerRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C59033g.m229199b(c, selectionListenerRichTextEditText.getRichTextRender());
        } else {
            m189459a(c);
        }
        SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
        if (selectionListenerRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        Editable text = selectionListenerRichTextEditText2.getText();
        ArrayList<Pair<Integer, Integer>> a3 = C47987c.m189445a(text.toString());
        String hashTagContent = mo168122o().getHashTagContent();
        String str = hashTagContent;
        boolean z2 = false;
        if (!(str == null || str.length() == 0) && text.length() + hashTagContent.length() + 1 <= 2000) {
            Iterator<T> it = a3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    text.insert(0, hashTagContent + ' ');
                    a3 = C47987c.m189445a(text.toString());
                    break;
                }
                T next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(text, "s");
                if (Intrinsics.areEqual(text.subSequence(((Number) next.getFirst()).intValue(), ((Number) next.getSecond()).intValue()).toString(), hashTagContent)) {
                    break;
                }
            }
        }
        for (T t : a3) {
            SelectionListenerRichTextEditText selectionListenerRichTextEditText3 = this.f120830e;
            if (selectionListenerRichTextEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            Context context = selectionListenerRichTextEditText3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mPostContentET.context");
            text.setSpan(new MomentsTopicSpan(context), ((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue(), 33);
        }
        mo168122o().updateTopics(a3);
        SelectionListenerRichTextEditText selectionListenerRichTextEditText4 = this.f120830e;
        if (selectionListenerRichTextEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText4.addTextChangedListener(this.f120822R);
        List<ImageData> d = a2.mo168024d();
        List<ImageData> list = d;
        if (list == null || list.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            mo168124q().mo168073a(d);
        }
        VideoGridInfo e = a2.mo168025e();
        if (e != null) {
            mo168124q().mo168069a(e);
        }
        MomentsPublishViewModel.IdentityType f = a2.mo168027f();
        if (f != null) {
            mo168122o().handleIdentityDraft(f);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147039a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
        this.f120837l = aVar;
    }

    /* renamed from: a */
    public final void mo168118a(List<Photo> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "orderPhotos");
        MomentsPublishGridAdapter.m189389a(mo168124q(), list, MediaState.TYPE_UPLOADING, z, null, 8, null);
    }

    /* renamed from: a */
    public final void mo168114a(IPhotoDependency.Image image, boolean z) {
        Intrinsics.checkParameterIsNotNull(image, "image");
        mo168124q().mo168068a(image, z);
    }

    /* renamed from: a */
    public final void mo168117a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "paths");
        mo168124q().mo168078b(list);
    }

    /* renamed from: a */
    public final void mo168116a(ArrayList<CategoryTag> arrayList) {
        ArrayList<CategoryTag> arrayList2;
        Intrinsics.checkParameterIsNotNull(arrayList, "categories");
        View view = this.f120807C;
        if (view != null) {
            view.setVisibility(0);
        }
        PublishTagListAdapter dVar = this.f120808D;
        if (dVar != null) {
            dVar.mo167927a(arrayList);
        }
        MomentsCategoryListFragment cVar = this.f120843s;
        if (cVar != null) {
            PublishTagListAdapter dVar2 = this.f120808D;
            if (dVar2 == null || (arrayList2 = dVar2.mo167928b()) == null) {
                arrayList2 = new ArrayList<>();
            }
            cVar.mo167918a(arrayList2);
        }
        if (this.f120841p) {
            for (T t : arrayList) {
                if (t.getSelected()) {
                    m189460a(true, t.getId(), t.getName(), t.getIconKey());
                    return;
                }
            }
            m189458a(this, false, null, null, null, 14, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$categoryScrollListener$2$1", "invoke", "()Lcom/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$categoryScrollListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$c */
    static final class C47989c extends Lambda implements Function0<C479901> {
        final /* synthetic */ MomentsPublishInputSupportPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47989c(MomentsPublishInputSupportPlugin bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C479901 invoke() {
            return new RecyclerView.OnScrollListener(this) {
                /* class com.ss.android.lark.moments.impl.publish.input.MomentsPublishInputSupportPlugin.C47989c.C479901 */

                /* renamed from: a */
                final /* synthetic */ C47989c f120851a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120851a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    int i3;
                    Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                    int findFirstCompletelyVisibleItemPosition = this.f120851a.this$0.mo168125r().findFirstCompletelyVisibleItemPosition();
                    int findLastCompletelyVisibleItemPosition = this.f120851a.this$0.mo168125r().findLastCompletelyVisibleItemPosition();
                    int itemCount = this.f120851a.this$0.mo168125r().getItemCount() - 1;
                    View view = this.f120851a.this$0.f120838m;
                    int i4 = 8;
                    if (view != null) {
                        if (findFirstCompletelyVisibleItemPosition == 0) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        view.setVisibility(i3);
                    }
                    View view2 = this.f120851a.this$0.f120839n;
                    if (view2 != null) {
                        if (findLastCompletelyVisibleItemPosition != itemCount) {
                            i4 = 0;
                        }
                        view2.setVisibility(i4);
                    }
                }
            };
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: l */
    public EditText mo146904l() {
        return this.f120836k;
    }

    /* renamed from: A */
    public final void mo168105A() {
        EditText l = mo146904l();
        if (l != null) {
            KeyboardUtils.showKeyboard(l);
        }
    }

    /* renamed from: C */
    public final VideoGridInfo mo168107C() {
        return mo168124q().mo168083f();
    }

    /* renamed from: F */
    public final void mo168110F() {
        View view = this.f120807C;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: G */
    public final void mo168111G() {
        RecyclerView recyclerView = this.f120810F;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: n */
    public int mo146906n() {
        View view = this.f120829d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view.getHeight();
    }

    /* renamed from: w */
    public final int mo168130w() {
        if (mo168131x()) {
            return 0;
        }
        return 9 - mo168133z();
    }

    /* renamed from: x */
    public final boolean mo168131x() {
        return mo168124q().mo168080c();
    }

    /* renamed from: y */
    public final boolean mo168132y() {
        return mo168124q().mo168081d();
    }

    /* renamed from: z */
    public final int mo168133z() {
        return mo168124q().mo168076b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$b */
    static final class C47988b extends Lambda implements Function0<LinearLayoutManager> {
        final /* synthetic */ MomentsPublishInputSupportPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47988b(MomentsPublishInputSupportPlugin bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayoutManager invoke() {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MomentsPublishInputSupportPlugin.m189462c(this.this$0));
            linearLayoutManager.setOrientation(0);
            return linearLayoutManager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/publish/grid/MomentsPublishGridAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$d */
    static final class C47991d extends Lambda implements Function0<MomentsPublishGridAdapter> {
        final /* synthetic */ MomentsPublishInputSupportPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47991d(MomentsPublishInputSupportPlugin bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsPublishGridAdapter invoke() {
            return new MomentsPublishGridAdapter(this.this$0.mo168113I(), this.this$0.mo168123p(), new OnMediaStateChangedListener(this) {
                /* class com.ss.android.lark.moments.impl.publish.input.MomentsPublishInputSupportPlugin.C47991d.C479921 */

                /* renamed from: a */
                final /* synthetic */ C47991d f120852a;

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnMediaStateChangedListener
                /* renamed from: b */
                public void mo168098b() {
                    this.f120852a.this$0.mo168127t();
                }

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnMediaStateChangedListener
                /* renamed from: a */
                public void mo168095a() {
                    String str;
                    KeyBoard H = this.f120852a.this$0.mo168112H();
                    if (H != null) {
                        str = H.mo146826g();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, "photo")) {
                        MomentsPublishInputSupportPlugin.m189461b(this.f120852a.this$0).mo147124c();
                    }
                    MomentsPublishInputSupportPlugin.m189457a(this.f120852a.this$0).requestFocus();
                    this.f120852a.this$0.mo168127t();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f120852a = r1;
                }

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnMediaStateChangedListener
                /* renamed from: a */
                public void mo168096a(GridImageData bVar) {
                    Intrinsics.checkParameterIsNotNull(bVar, "mediaData");
                    this.f120852a.this$0.mo168122o().getRetryUploadImage().mo5926a(bVar);
                }

                @Override // com.ss.android.lark.moments.impl.publish.grid.OnMediaStateChangedListener
                /* renamed from: a */
                public void mo168097a(GridVideoData cVar) {
                    Intrinsics.checkParameterIsNotNull(cVar, "mediaData");
                    this.f120852a.this$0.mo168122o().getRetryUploadVideo().mo5926a(cVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/ItemTouchHelper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$e */
    static final class C47993e extends Lambda implements Function0<ItemTouchHelper> {
        final /* synthetic */ MomentsPublishInputSupportPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47993e(MomentsPublishInputSupportPlugin bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ItemTouchHelper invoke() {
            return new ItemTouchHelper(new ImageItemTouchCallback(this, this.this$0.mo168113I()) {
                /* class com.ss.android.lark.moments.impl.publish.input.MomentsPublishInputSupportPlugin.C47993e.C479941 */

                /* renamed from: a */
                final /* synthetic */ C47993e f120853a;

                @Override // com.ss.android.lark.moments.impl.publish.grid.ImageItemTouchCallback
                /* renamed from: d */
                public MomentsPublishGridAdapter mo168062d() {
                    return this.f120853a.this$0.mo168124q();
                }

                {
                    this.f120853a = r1;
                }
            });
        }
    }

    /* renamed from: K */
    private final void m189453K() {
        mo168122o().getVideoGridInfo().mo5923a(this.f120826V, new C48001l(this));
    }

    /* renamed from: D */
    public final void mo168108D() {
        if (this.f120832g != null) {
            ConstraintLayout constraintLayout = this.f120832g;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdditionFuncContainer");
            }
            constraintLayout.requestLayout();
        }
    }

    /* renamed from: E */
    public final void mo168109E() {
        IInputContext eVar = this.f120828c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        eVar.mo147123b();
        if (this.f120805A) {
            IInputContext eVar2 = this.f120828c;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar2.mo147122a(new KClass[0]);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        this.f120833h = false;
        View view = this.f120829d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setVisibility(8);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText.setText("");
        RecyclerView recyclerView = this.f120810F;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(m189452J());
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: k */
    public TransationData mo147053k() {
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        RichText richText = selectionListenerRichTextEditText.getRichText();
        if (richText == null) {
            richText = C59029c.m229155a();
        }
        TransationData jVar = new TransationData();
        jVar.mo147176a("draft_post_reichtext", richText);
        return jVar;
    }

    /* renamed from: s */
    public final void mo168126s() {
        String string = UIUtils.getString(this.f120826V, R.string.Lark_Community_SaySomething);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(activi…k_Community_SaySomething)");
        this.f120844t = string;
        this.f120819O = false;
        this.f120820P = true;
        this.f120805A = true;
    }

    /* renamed from: M */
    private final void m189455M() {
        Activity activity = this.f120827b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        if (!DesktopUtil.m144301a((Context) activity)) {
            SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
            if (selectionListenerRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C25649b.m91857a(selectionListenerRichTextEditText, LarkFont.HEADLINE);
            SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
            if (selectionListenerRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            Activity activity2 = this.f120827b;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            selectionListenerRichTextEditText2.setEmojiconSize((int) LKUIDisplayManager.m91865a(activity2, LarkFont.HEADLINE));
        }
    }

    /* renamed from: B */
    public final List<ImageData> mo168106B() {
        ArrayList<GridImageData> e = mo168124q().mo168082e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo168054b());
        }
        return arrayList;
    }

    /* renamed from: v */
    public final boolean mo168129v() {
        boolean z;
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        RichText richText = selectionListenerRichTextEditText.getRichText();
        Intrinsics.checkExpressionValueIsNotNull(richText, "mPostContentET.richText");
        List<String> atIds = richText.getAtIds();
        if (atIds == null || atIds.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    /* renamed from: N */
    private final void m189456N() {
        View view = this.f120849y;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        view.setOnClickListener(new View$OnClickListenerC47995f(this));
        CommonTitleBar commonTitleBar = this.f120846v;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setLeftClickListener(new C47996g(this));
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC47997h(this));
        SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
        if (selectionListenerRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText2.setFilters(new C47998i[]{new C47998i(this, 2000)});
        SelectionListenerRichTextEditText selectionListenerRichTextEditText3 = this.f120830e;
        if (selectionListenerRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText3.addTextChangedListener(new C47999j(this));
        SelectionListenerRichTextEditText selectionListenerRichTextEditText4 = this.f120830e;
        if (selectionListenerRichTextEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText4.setOnPasteListener(new C48000k(this));
    }

    /* renamed from: t */
    public final void mo168127t() {
        CharSequence charSequence;
        if (!mo168124q().mo168085h()) {
            m189463c(false);
            return;
        }
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        Editable text = selectionListenerRichTextEditText.getText();
        if (text != null) {
            charSequence = StringsKt.trim(text);
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(String.valueOf(charSequence)) || mo168124q().mo168081d() || mo168124q().mo168080c()) {
            m189463c(true);
        } else {
            m189463c(false);
        }
    }

    /* renamed from: u */
    public final void mo168128u() {
        ArrayList<CategoryTag> arrayList;
        KeyBoard fVar = this.f120824T;
        if (fVar != null) {
            fVar.mo146820c();
        }
        EditText l = mo146904l();
        if (l != null) {
            l.clearFocus();
        }
        MomentsCategoryListFragment cVar = this.f120843s;
        if (cVar == null) {
            cVar = new MomentsCategoryListFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arguments_enable_invert", !this.f120841p);
            cVar.setArguments(bundle);
            this.f120843s = cVar;
        }
        PublishTagListAdapter dVar = this.f120808D;
        if (dVar == null || (arrayList = dVar.mo167928b()) == null) {
            arrayList = new ArrayList<>();
        }
        cVar.mo167918a(arrayList);
        this.f120825U.mo167815a(cVar);
    }

    /* renamed from: L */
    private final void m189454L() {
        View view = this.f120829d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(R.id.toolbox_et_postmessage);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R…d.toolbox_et_postmessage)");
        this.f120830e = (SelectionListenerRichTextEditText) findViewById;
        View view2 = this.f120829d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view2.findViewById(R.id.toolbox_postmsg_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R…oolbox_postmsg_container)");
        this.f120845u = (NestedScrollView) findViewById2;
        View view3 = this.f120829d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById3 = view3.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.title_bar)");
        this.f120846v = (CommonTitleBar) findViewById3;
        View view4 = this.f120829d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById4 = view4.findViewById(R.id.bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R.id.bottom_container)");
        this.f120832g = (ConstraintLayout) findViewById4;
        View view5 = this.f120829d;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById5 = view5.findViewById(R.id.top_drawer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById(R.id.top_drawer)");
        this.f120850z = (SlidingUpPanelLayout) findViewById5;
        View view6 = this.f120829d;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120806B = view6.findViewById(R.id.input_content);
        View view7 = this.f120829d;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120807C = view7.findViewById(R.id.category_selector);
        View view8 = this.f120829d;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120809E = view8.findViewById(R.id.category_list);
        View view9 = this.f120829d;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120810F = (RecyclerView) view9.findViewById(R.id.categoryList);
        View view10 = this.f120829d;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120838m = view10.findViewById(R.id.shadowLeft);
        View view11 = this.f120829d;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120839n = view11.findViewById(R.id.shadowRight);
        View view12 = this.f120829d;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120812H = (TextView) view12.findViewById(R.id.endLabel);
        View view13 = this.f120829d;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120813I = view13.findViewById(R.id.category_card);
        View view14 = this.f120829d;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120814J = view14.findViewById(R.id.from_layout);
        View view15 = this.f120829d;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120815K = (ImageView) view15.findViewById(R.id.iv_from);
        View view16 = this.f120829d;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120816L = (ImageView) view16.findViewById(R.id.iv_choose_category);
        View view17 = this.f120829d;
        if (view17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120817M = (TextView) view17.findViewById(R.id.tv_from);
        View view18 = this.f120829d;
        if (view18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        this.f120818N = (ImageView) view18.findViewById(R.id.ic_right);
        float f = 16.0f;
        if (this.f120841p) {
            View view19 = this.f120809E;
            if (view19 != null) {
                C0922v.m4415a(view19, false);
            }
            View view20 = this.f120813I;
            if (view20 != null) {
                C0922v.m4415a(view20, true);
            }
            View view21 = this.f120814J;
            if (view21 != null) {
                view21.setOnClickListener(new C48002m(this));
            }
            View view22 = this.f120806B;
            if (view22 != null) {
                view22.setPadding(view22.getPaddingLeft(), UIHelper.dp2px(16.0f), view22.getPaddingRight(), view22.getPaddingBottom());
            }
        } else {
            View view23 = this.f120809E;
            if (view23 != null) {
                C0922v.m4415a(view23, true);
            }
            View view24 = this.f120809E;
            if (view24 != null) {
                view24.requestLayout();
            }
            View view25 = this.f120813I;
            if (view25 != null) {
                C0922v.m4415a(view25, false);
            }
            View view26 = this.f120806B;
            if (view26 != null) {
                view26.setPadding(view26.getPaddingLeft(), UIHelper.dp2px(11.0f), view26.getPaddingRight(), view26.getPaddingBottom());
            }
        }
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText.setHint(this.f120844t);
        TextView[] textViewArr = new TextView[1];
        SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
        if (selectionListenerRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        textViewArr[0] = selectionListenerRichTextEditText2;
        DesktopUtil.m144299a(textViewArr);
        View view27 = this.f120829d;
        if (view27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view27.setVisibility(8);
        CommonTitleBar commonTitleBar = this.f120846v;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        Activity activity = this.f120827b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        commonTitleBar.setTitle(UIUtils.getString(activity, R.string.Lark_Community_PostNewNews));
        View view28 = this.f120829d;
        if (view28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById6 = view28.findViewById(R.id.fl_img_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById(R.id.fl_img_container)");
        RecyclerView recyclerView = (RecyclerView) findViewById6;
        this.f120831f = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaRecyclerView");
        }
        recyclerView.setAdapter(mo168124q());
        RecyclerView recyclerView2 = this.f120831f;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaRecyclerView");
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.f120831f;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaRecyclerView");
        }
        recyclerView3.setLayoutManager(new MomentsPublishInputSupportPlugin$initView$2(this, this.f120826V, 3));
        ItemTouchHelper p = mo168123p();
        RecyclerView recyclerView4 = this.f120831f;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaRecyclerView");
        }
        p.attachToRecyclerView(recyclerView4);
        CommonTitleBar commonTitleBar2 = this.f120846v;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setMainTitleTextStyle(1);
        CommonTitleBar commonTitleBar3 = this.f120846v;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        if (!DesktopUtil.m144307b()) {
            f = 17.0f;
        }
        commonTitleBar3.setMainTitleSize(f);
        CommonTitleBar commonTitleBar4 = this.f120846v;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar4.setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
        CommonTitleBar commonTitleBar5 = this.f120846v;
        if (commonTitleBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar5.setLeftImageDrawable(null);
        m189455M();
        Drawable iconDrawable = UDIconUtils.getIconDrawable(this.f120826V, (int) R.drawable.ud_icon_right_outlined, UIHelper.getColor(R.color.icon_n2));
        iconDrawable.setBounds(0, 0, UIUtils.dp2px(this.f120826V, 14.0f), UIUtils.dp2px(this.f120826V, 14.0f));
        TextView textView = this.f120812H;
        if (textView != null) {
            C47282k.m187259a(textView, (Drawable) null, (Drawable) null, iconDrawable, (Drawable) null, 11, (Object) null);
        }
        TextView textView2 = this.f120812H;
        if (textView2 != null) {
            textView2.setOnClickListener(new C48003n(this));
        }
        PublishTagListAdapter dVar = new PublishTagListAdapter(this.f120825U, mo168122o());
        this.f120808D = dVar;
        RecyclerView recyclerView5 = this.f120810F;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(dVar);
        }
        RecyclerView recyclerView6 = this.f120810F;
        if (recyclerView6 != null) {
            recyclerView6.setLayoutManager(mo168125r());
        }
        RecyclerView recyclerView7 = this.f120810F;
        if (recyclerView7 != null) {
            recyclerView7.addOnScrollListener(m189452J());
        }
        PublishTagListAdapter dVar2 = this.f120808D;
        if (dVar2 != null) {
            dVar2.notifyDataSetChanged();
        }
        SelectionListenerRichTextEditText selectionListenerRichTextEditText3 = this.f120830e;
        if (selectionListenerRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText3.setSelectionChangedListener(this.f120823S);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$initListener$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$g */
    public static final class C47996g extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120855a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47996g(MomentsPublishInputSupportPlugin bVar) {
            this.f120855a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120855a.mo168109E();
            MomentsPublishInputSupportPlugin.m189462c(this.f120855a).finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$initListener$5", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$j */
    public static final class C47999j implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120858a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47999j(MomentsPublishInputSupportPlugin bVar) {
            this.f120858a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f120858a.mo168127t();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar;
            if (!this.f120858a.f120834i && (aVar = this.f120858a.f120837l) != null) {
                aVar.mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$initListener$6", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$k */
    public static final class C48000k extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120859a;

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48000k(MomentsPublishInputSupportPlugin bVar) {
            this.f120859a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            String obj;
            int indexOf$default;
            if (!(charSequence == null || (obj = charSequence.toString()) == null)) {
                String str = obj;
                int i3 = 0;
                for (String str2 : StringsKt.split$default((CharSequence) str, new String[]{"\\s+|\n+"}, false, 0, 6, (Object) null)) {
                    if (!URLUtil.isNetworkUrl(str2) || (indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, i3, false, 4, (Object) null)) == -1) {
                        i3 += str2.length();
                    } else {
                        int i4 = i + indexOf$default;
                        C40682g.m160850a().mo133169a(obj, new UIGetDataCallback(new C40727b(MomentsPublishInputSupportPlugin.m189457a(this.f120859a), str2, i4)));
                        C40682g.m160850a().mo133173b(obj, new UIGetDataCallback(new GetUrlInlineFromCallback(i4, str2, MomentsPublishInputSupportPlugin.m189457a(this.f120859a))));
                        return;
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$m */
    public static final class C48002m extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120861a;

        public C48002m(MomentsPublishInputSupportPlugin bVar) {
            this.f120861a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120861a.mo168128u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$initView$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$n */
    public static final class C48003n extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120862a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48003n(MomentsPublishInputSupportPlugin bVar) {
            this.f120862a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120862a.mo168128u();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$selectionChangedListener$1", "Lcom/ss/android/lark/moments/impl/common/widget/OnSelectionChangedListener;", "onSelectionChanged", "", "selStart", "", "selEnd", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$o */
    public static final class C48004o implements OnSelectionChangedListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120863a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48004o(MomentsPublishInputSupportPlugin bVar) {
            this.f120863a = bVar;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.OnSelectionChangedListener
        /* renamed from: a */
        public void mo166266a(int i, int i2) {
            this.f120863a.mo168122o().onSelectionChanged(i, i2, MomentsPublishInputSupportPlugin.m189457a(this.f120863a).getText());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$textChangedListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$r */
    public static final class C48007r implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120867a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48007r(MomentsPublishInputSupportPlugin bVar) {
            this.f120867a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                Editable editable2 = editable;
                boolean z = false;
                Object[] spans = editable2.getSpans(0, editable2.length(), MomentsTopicSpan.class);
                Intrinsics.checkExpressionValueIsNotNull(spans, "getSpans(start, end, T::class.java)");
                for (Object obj : spans) {
                    editable.removeSpan((MomentsTopicSpan) obj);
                }
                ArrayList<Pair<Integer, Integer>> a = C47987c.m189445a(editable.toString());
                int selectionStart = MomentsPublishInputSupportPlugin.m189457a(this.f120867a).getSelectionStart();
                String str2 = "";
                int i = 0;
                for (T t : a) {
                    Context context = MomentsPublishInputSupportPlugin.m189457a(this.f120867a).getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "mPostContentET.context");
                    editable.setSpan(new MomentsTopicSpan(context), ((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue(), 33);
                    int i2 = selectionStart - 1;
                    if (i2 < 0 || i2 >= editable.length() || editable.charAt(i2) != '#') {
                        if (selectionStart <= ((Number) t.getSecond()).intValue() && selectionStart > ((Number) t.getFirst()).intValue()) {
                            str = editable.subSequence(((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue()).toString();
                        }
                        i = Math.max(i, ((Number) t.getFirst()).intValue());
                    } else {
                        if (selectionStart <= ((Number) t.getSecond()).intValue() && selectionStart > ((Number) t.getFirst()).intValue()) {
                            str = editable.subSequence(((Number) t.getFirst()).intValue(), ((Number) t.getSecond()).intValue()).toString();
                        }
                        i = Math.max(i, ((Number) t.getFirst()).intValue());
                    }
                    str2 = str;
                    z = true;
                    i = Math.max(i, ((Number) t.getFirst()).intValue());
                }
                this.f120867a.mo168122o().updateTopics(a);
                boolean a2 = C47987c.m189448a(editable, selectionStart);
                if (!z) {
                    if (!a2) {
                        return;
                    }
                    if (a.size() >= 100 && selectionStart > i) {
                        return;
                    }
                }
                this.f120867a.mo168122o().showAssociateList(str2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int lineCount = (MomentsPublishInputSupportPlugin.m189457a(this.f120867a).getLineCount() * MomentsPublishInputSupportPlugin.m189457a(this.f120867a).getLineHeight()) + MomentsPublishInputSupportPlugin.m189466e(this.f120867a).getHeight();
            if (lineCount != this.f120867a.f120840o) {
                this.f120867a.f120840o = lineCount;
                this.f120867a.mo168122o().onEditTextHeightChanged(lineCount);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147037a(IInputContext eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        this.f120828c = eVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ SelectionListenerRichTextEditText m189457a(MomentsPublishInputSupportPlugin bVar) {
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = bVar.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        return selectionListenerRichTextEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ IInputContext m189461b(MomentsPublishInputSupportPlugin bVar) {
        IInputContext eVar = bVar.f120828c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return eVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ Activity m189462c(MomentsPublishInputSupportPlugin bVar) {
        Activity activity = bVar.f120827b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        return activity;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m189464d(MomentsPublishInputSupportPlugin bVar) {
        View view = bVar.f120829d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ RecyclerView m189466e(MomentsPublishInputSupportPlugin bVar) {
        RecyclerView recyclerView = bVar.f120831f;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaRecyclerView");
        }
        return recyclerView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$startShowAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$q */
    public static final class C48006q implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120865a;

        /* renamed from: b */
        final /* synthetic */ String f120866b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            MomentsPublishInputSupportPlugin.m189461b(this.f120865a).mo147122a(new KClass[0]);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            MomentsPublishInputSupportPlugin.m189461b(this.f120865a).mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(MomentsPhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(HashTagKBPlugin.class));
            MomentsPublishInputSupportPlugin.m189457a(this.f120865a).requestFocus();
            this.f120865a.mo168115a(this.f120866b);
        }

        C48006q(MomentsPublishInputSupportPlugin bVar, String str) {
            this.f120865a = bVar;
            this.f120866b = str;
        }
    }

    /* renamed from: c */
    private final void m189463c(boolean z) {
        View view = this.f120849y;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        view.setEnabled(z);
        View view2 = this.f120849y;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        view2.setClickable(z);
    }

    /* renamed from: b */
    public final void mo168119b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hint");
        EditText l = mo146904l();
        if (l != null) {
            l.setHint(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$l */
    public static final class C48001l<T> implements AbstractC1178x<Pair<? extends VideoGridInfo, ? extends MediaState>> {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120860a;

        C48001l(MomentsPublishInputSupportPlugin bVar) {
            this.f120860a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<VideoGridInfo, ? extends MediaState> pair) {
            VideoGridInfo first;
            if (pair != null && (first = pair.getFirst()) != null) {
                MediaState mediaState = (MediaState) pair.getSecond();
                if (mediaState == MediaState.TYPE_UPLOADING) {
                    this.f120860a.mo168124q().mo168077b(first, mediaState);
                } else {
                    this.f120860a.mo168124q().mo168070a(first, mediaState);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$p */
    public static final class C48005p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120864a;

        C48005p(MomentsPublishInputSupportPlugin bVar) {
            this.f120864a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View d = MomentsPublishInputSupportPlugin.m189464d(this.f120864a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                d.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final void m189459a(RichText richText) {
        this.f120834i = true;
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        selectionListenerRichTextEditText.setText("");
        if (!C59035h.m229210a(richText)) {
            SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
            if (selectionListenerRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C59033g.m229199b(richText, selectionListenerRichTextEditText2.getRichTextRender());
        } else {
            RichText a = C59029c.m229155a();
            SelectionListenerRichTextEditText selectionListenerRichTextEditText3 = this.f120830e;
            if (selectionListenerRichTextEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C59033g.m229199b(a, selectionListenerRichTextEditText3.getRichTextRender());
        }
        this.f120834i = false;
    }

    /* renamed from: b */
    public final void mo168120b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "photoUrls");
        mo168124q().mo168079c(list);
        mo168124q().mo168067a();
    }

    /* renamed from: c */
    public final void mo168121c(String str) {
        Intrinsics.checkParameterIsNotNull(str, ChatTypeStateKeeper.f135670e);
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        int selectionStart = selectionListenerRichTextEditText.getSelectionStart();
        SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
        if (selectionListenerRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        int selectionEnd = selectionListenerRichTextEditText2.getSelectionEnd();
        SelectionListenerRichTextEditText selectionListenerRichTextEditText3 = this.f120830e;
        if (selectionListenerRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        Editable editableText = selectionListenerRichTextEditText3.getEditableText();
        if (editableText != null) {
            C47987c.m189446a(selectionStart, selectionEnd, editableText, str, mo168122o().getTopics());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$f */
    public static final class View$OnClickListenerC47995f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120854a;

        View$OnClickListenerC47995f(MomentsPublishInputSupportPlugin bVar) {
            this.f120854a = bVar;
        }

        public final void onClick(View view) {
            VideoGridInfo videoGridInfo;
            if (this.f120854a.f120841p && !this.f120854a.mo168122o().checkSelectedCategory()) {
                this.f120854a.mo168128u();
            } else if (!this.f120854a.f120835j) {
                MomentsPublishInputSupportPlugin.m189457a(this.f120854a).mo146908a(false);
                RichText richText = MomentsPublishInputSupportPlugin.m189457a(this.f120854a).getRichText();
                MomentsPublishInputSupportPlugin.m189461b(this.f120854a).mo147125d();
                KeyboardUtils.hideKeyboard(MomentsPublishInputSupportPlugin.m189462c(this.f120854a));
                MomentsHitPoint.f119720a.mo166833a();
                MomentsHitPointNew.f119721a.mo166853a("post_send", "moments_feed_page_view");
                if (this.f120854a.mo168131x()) {
                    videoGridInfo = this.f120854a.mo168124q().mo168083f();
                } else {
                    videoGridInfo = null;
                }
                MomentsPublishViewModel o = this.f120854a.mo168122o();
                Intrinsics.checkExpressionValueIsNotNull(richText, "richText");
                o.sendPost(richText, this.f120854a.mo168106B(), videoGridInfo);
            }
        }
    }

    /* renamed from: d */
    private final void m189465d(String str) {
        Activity activity = this.f120827b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(DeviceUtils.getScreenHeight(activity), 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C48005p(this));
        ofInt.addListener(new C48006q(this, str));
        ofInt.setDuration(340L);
        ofInt.start();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    public void mo147011b(boolean z) {
        super.mo147011b(z);
        this.f120835j = !z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147033a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = C40679d.m160785a(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createSendBut…nNoMargin(parent.context)");
        this.f120849y = a;
        if (DesktopUtil.m144307b()) {
            View view = this.f120849y;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
            }
            view.getLayoutParams().width = UIHelper.getDimens(R.dimen.chat_icon_desktop);
            View view2 = this.f120849y;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
            }
            view2.getLayoutParams().height = UIHelper.getDimens(R.dimen.chat_icon_desktop);
        }
        View view3 = this.f120849y;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return view3;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        RichText richText;
        this.f120833h = true;
        View view = this.f120829d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setVisibility(0);
        SelectionListenerRichTextEditText selectionListenerRichTextEditText = this.f120830e;
        if (selectionListenerRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        String str = null;
        if (TextUtils.isEmpty(selectionListenerRichTextEditText.mo146908a(false))) {
            if (jVar != null) {
                richText = (RichText) jVar.mo147174a("param_content");
            } else {
                richText = null;
            }
            if (richText == null) {
                richText = C59029c.m229155a();
                Intrinsics.checkExpressionValueIsNotNull(richText, "RichTextCreator.generateEmptyRichText()");
            }
            m189459a(richText);
        }
        if (jVar != null) {
            str = (String) jVar.mo147174a("param_selected_plugin");
        }
        if (!this.f120820P || DesktopUtil.m144307b()) {
            IInputContext eVar = this.f120828c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar.mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(MomentsPhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(HashTagKBPlugin.class));
            SelectionListenerRichTextEditText selectionListenerRichTextEditText2 = this.f120830e;
            if (selectionListenerRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            selectionListenerRichTextEditText2.requestFocus();
            mo168115a(str);
            return;
        }
        m189465d(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/moments/impl/publish/input/MomentsPublishInputSupportPlugin$initListener$4", "Landroid/text/InputFilter$LengthFilter;", "filter", "", ShareHitPoint.f121868c, "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$i */
    public static final class C47998i extends InputFilter.LengthFilter {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47998i(MomentsPublishInputSupportPlugin bVar, int i) {
            super(i);
            this.f120857a = bVar;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(charSequence, ShareHitPoint.f121868c);
            Intrinsics.checkParameterIsNotNull(spanned, "dest");
            if (getMax() - (spanned.length() - (i4 - i3)) <= 0) {
                LKUIToast.show(MomentsPublishInputSupportPlugin.m189462c(this.f120857a), UIHelper.mustacheFormat((int) R.string.Lark_Community_TheNumberOfWordsExceedsTheLimit, "num", String.valueOf(2000)));
            }
            return super.filter(charSequence, i, i2, spanned, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.input.b$h */
    public static final class View$OnFocusChangeListenerC47997h implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishInputSupportPlugin f120856a;

        View$OnFocusChangeListenerC47997h(MomentsPublishInputSupportPlugin bVar) {
            this.f120856a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && this.f120856a.f120833h) {
                MomentsPublishInputSupportPlugin bVar = this.f120856a;
                bVar.f120836k = MomentsPublishInputSupportPlugin.m189457a(bVar);
                MomentsPublishInputSupportPlugin.m189461b(this.f120856a).mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(MomentsPhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(HashTagKBPlugin.class));
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147031a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f120827b = activity;
        this.f120829d = view;
        m189454L();
        m189456N();
        mo147007a((ViewGroup) view, activity);
        View view2 = this.f120829d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view2;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147032a(Activity activity, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        m189453K();
        View inflate = LayoutInflater.from(activity).inflate(mo147089i(), viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return mo147031a(activity, inflate);
    }

    public MomentsPublishInputSupportPlugin(KeyBoard fVar, IMomentsInputPluginDelegate aVar, AppCompatActivity appCompatActivity, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "inputDelegate");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        this.f120824T = fVar;
        this.f120825U = aVar;
        this.f120826V = appCompatActivity;
        this.f120841p = z;
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        this.f120842r = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MomentsPublishViewModel.class), new MomentsPublishInputSupportPlugin$$special$$inlined$viewModels$2(appCompatActivity2), new MomentsPublishInputSupportPlugin$$special$$inlined$viewModels$1(appCompatActivity2));
        String string = UIHelper.getString(R.string.Lark_Legacy_ComposePostWriteSomething);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…omposePostWriteSomething)");
        this.f120844t = string;
    }

    /* renamed from: a */
    private final void m189460a(boolean z, String str, String str2, String str3) {
        ImageView imageView = this.f120815K;
        if (imageView != null) {
            C0922v.m4415a(imageView, z);
        }
        ImageView imageView2 = this.f120816L;
        if (imageView2 != null) {
            C0922v.m4415a(imageView2, !z);
        }
        ImageView imageView3 = this.f120818N;
        if (imageView3 != null) {
            C0922v.m4415a(imageView3, z);
        }
        if (z) {
            ImageView imageView4 = this.f120818N;
            if (imageView4 != null) {
                Activity activity = this.f120827b;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                }
                imageView4.setImageDrawable(UDIconUtils.getIconDrawable(activity, (int) R.drawable.ud_icon_expand_right_filled, UIHelper.getColor(R.color.icon_n2)));
            }
            TextView textView = this.f120817M;
            if (textView != null) {
                textView.setText(FakeBoldSpan.f119246a.mo166167a(str2));
            }
            TextView textView2 = this.f120817M;
            if (textView2 != null) {
                textView2.setTextColor(UIHelper.getColor(R.color.ud_N700));
            }
            int dp2px = UIHelper.dp2px(36.0f);
            if (str3 == null) {
                str3 = "";
            }
            AvatarImage build = AvatarImage.Builder.obtain(str3, str, dp2px, dp2px).build();
            Activity activity2 = this.f120827b;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            IRequestCreator override = ImageLoader.with(activity2).placeholder(new ColorDrawable(UIHelper.getColor(R.color.ud_N200))).load(build).override(dp2px, dp2px);
            Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(mActivi…ide(imageSize, imageSize)");
            C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null).into(this.f120815K);
            View view = this.f120814J;
            if (view != null) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), UIHelper.dp2px(8.0f), view.getPaddingBottom());
                return;
            }
            return;
        }
        ImageView imageView5 = this.f120816L;
        if (imageView5 != null) {
            Activity activity3 = this.f120827b;
            if (activity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            imageView5.setImageDrawable(UDIconUtils.getIconDrawable(activity3, (int) R.drawable.ud_icon_moments_categories_outlined, UIHelper.getColor(R.color.icon_n1)));
        }
        TextView textView3 = this.f120817M;
        if (textView3 != null) {
            textView3.setText(UIHelper.getString(R.string.Lark_Moments_SelectACategory));
        }
        TextView textView4 = this.f120817M;
        if (textView4 != null) {
            textView4.setTextColor(UIHelper.getColor(R.color.text_title));
        }
        View view2 = this.f120814J;
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), UIHelper.dp2px(16.0f), view2.getPaddingBottom());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m189458a(MomentsPublishInputSupportPlugin bVar, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        bVar.m189460a(z, str, str2, str3);
    }
}

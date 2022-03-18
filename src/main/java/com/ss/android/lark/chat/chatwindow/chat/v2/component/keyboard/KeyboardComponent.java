package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardDependenceViewModel;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardComponentDependency;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardHideJudge;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.KeyboardModelFactory;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33224n;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.WidgetViewModelKeyManager;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardViewModel;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.ChatKBPluginUtil;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.chat.utils.FileSendUtils;
import com.ss.android.lark.chatbase.keyboard.AtKBPluginDependency;
import com.ss.android.lark.chatbase.keyboard.FaceKBPluginDependency;
import com.ss.android.lark.chatbase.p1687a.C34416c;
import com.ss.android.lark.chatbase.p1688b.p1689a.C34431a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36456ae;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36493i;
import com.ss.android.lark.dependency.AbstractC36506t;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputExpandPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnLifeKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.event.EventPlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.file.FilePlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.redpacket.IRedPacketDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.redpacket.RedPacketPlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.todo.IToDoDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.todo.TodoPlusItem;
import com.ss.android.lark.keyboard.plugin.tool.more.vote.IVoteDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.vote.VotePlusItem;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoAaKBPluginCompat;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialog;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback;
import com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.uploadlog.UploadLogKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.keyboard.widget.AutoAdjustSizeLayoutManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.chat.ChatStatisticUtil;
import com.ss.android.lark.statistics.drive.ChatDriveHitPoint;
import com.ss.android.lark.statistics.event.EventHitPoint;
import com.ss.android.lark.statistics.focus.InputAreaHitPoint;
import com.ss.android.lark.statistics.redpacket.RedPacketHitPoint;
import com.ss.android.lark.statistics.todo.TodoHitPoint;
import com.ss.android.lark.tour.spotlight.C57298a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000÷\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u00011\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*H\u0016J\u0018\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u000209H\u0002J&\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010<H\u0016J\b\u0010@\u001a\u000204H\u0016J \u0010A\u001a\u0002042\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020G2\u0006\u00107\u001a\u00020\u001aH\u0002J\u0010\u0010I\u001a\u00020G2\u0006\u00107\u001a\u00020\u001aH\u0002J!\u0010J\u001a\u0004\u0018\u0001HK\"\b\b\u0000\u0010K*\u00020G2\u0006\u0010L\u001a\u00020>H\u0016¢\u0006\u0002\u0010MJ\u001a\u0010N\u001a\u00020O2\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010Q\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u001aH\u0003J\u0010\u0010R\u001a\u00020G2\u0006\u00107\u001a\u00020\u001aH\u0002J\u001a\u0010S\u001a\u00020G2\b\u0010T\u001a\u0004\u0018\u00010 2\u0006\u00107\u001a\u00020\u001aH\u0002J\u001a\u0010U\u001a\u00020V2\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010W\u001a\u0004\u0018\u00010>H\u0016J\n\u0010X\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010Y\u001a\u00020V2\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\u001a\u0010Z\u001a\u00020V2\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010[\u001a\u00020\\H\u0016J\u001a\u0010]\u001a\u00020^2\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010_\u001a\u00020\u0012H\u0016J\b\u0010`\u001a\u000204H\u0016J\u001a\u0010a\u001a\u0002042\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010b\u001a\u0002042\u0006\u0010c\u001a\u00020dH\u0002J\u0010\u0010e\u001a\u0002042\u0006\u0010f\u001a\u00020\u0004H\u0002J\b\u0010g\u001a\u00020\u0012H\u0002J\b\u0010h\u001a\u00020\u0012H\u0016J\b\u0010i\u001a\u00020\u0012H\u0016J\b\u0010j\u001a\u00020\u0012H\u0002J\b\u0010k\u001a\u00020\u0012H\u0002J\"\u0010l\u001a\u0002042\u0006\u0010m\u001a\u00020\u00162\u0006\u0010n\u001a\u00020\u00162\b\u0010o\u001a\u0004\u0018\u00010pH\u0016J\b\u0010q\u001a\u000204H\u0016J\b\u0010r\u001a\u000204H\u0016J\b\u0010s\u001a\u000204H\u0016J\u0016\u0010t\u001a\u0002042\f\u0010u\u001a\b\u0012\u0004\u0012\u00020>0vH\u0002J\b\u0010w\u001a\u000204H\u0016J\u0018\u0010x\u001a\u0002042\u0006\u0010L\u001a\u00020>2\u0006\u0010y\u001a\u00020VH\u0016J\u0010\u0010z\u001a\u0002042\u0006\u00105\u001a\u00020{H\u0016J\u0018\u0010|\u001a\u0002042\u0006\u0010L\u001a\u00020>2\u0006\u0010y\u001a\u00020GH\u0016J\u0010\u0010}\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0016J\u001f\u0010~\u001a\u0002042\u0006\u0010L\u001a\u00020>2\r\u0010y\u001a\t\u0012\u0005\u0012\u00030\u00010H\u0016J\u001b\u0010\u0001\u001a\u0002042\u0006\u00107\u001a\u00020\u001a2\b\u0010P\u001a\u0004\u0018\u00010\u001cH\u0002J\u0017\u0010\u0001\u001a\u0002042\f\u0010u\u001a\b\u0012\u0004\u0012\u00020>0vH\u0002J\t\u0010\u0001\u001a\u000204H\u0016J\u0007\u0010\u0001\u001a\u000204J\u0012\u0010\u0001\u001a\u0002042\u0007\u0010\u0001\u001a\u00020\u0012H\u0016J\u0011\u0010\u0001\u001a\u0002042\u0006\u00105\u001a\u00020{H\u0016J\u0011\u0010\u0001\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0016J5\u0010\u0001\u001a\u0002042\u0014\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u000100v2\u0014\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u000100vH\u0016J\u0016\u0010\u0001\u001a\u000204*\u0002092\u0007\u0010\u0001\u001a\u00020\u0012H\u0002R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0004¢\u0006\u0004\n\u0002\u00102¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mContext", "Landroid/app/Activity;", "hostVM", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;", "mDependency", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardDependenceViewModel;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/KeyboardComponentDependency;)V", "callbacks", "", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "getCallbacks", "()Ljava/util/List;", "callbacks$delegate", "Lkotlin/Lazy;", "isEnableRichTextInput", "", "()Z", "isEnableRichTextInput$delegate", "layoutId", "", "getLayoutId", "()I", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mCurrentChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "mDelayLoadRunnable", "Ljava/lang/Runnable;", "mKeyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "mKeyboardContainer", "Landroid/widget/FrameLayout;", "getMKeyboardContainer", "()Landroid/widget/FrameLayout;", "setMKeyboardContainer", "(Landroid/widget/FrameLayout;)V", "mKeyboardControlStatusListeners", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$OnKeyboardControlStatusChangeListener;", "mKeyboardStatusListeners", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "mOpenApp", "Lcom/ss/android/lark/biz/im/api/OpenApp;", "mShowKeyboardTip", "mViewModel", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel;", "todoDependency", "com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$todoDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$todoDependency$1;", "addKeyboardStatusListener", "", "listener", "addRedPacketPlusItemIfNeed", "chat", "plusKBPlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/more/PlusKBPlugin;", "appendText", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "postText", "closePanelAndSysKeyboard", "enterReplyMode", "replyInfo", "Lcom/ss/android/lark/chatwindow/model/data/ReplyInfo;", "isReEdit", "resetOnStart", "getAaStylePlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getAtPlugin", "getFacePlugin", "getKBPlugin", "T", "name", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getKeyboardHint", "", "chatChatter", "getKeyboardHintColor", "getMorePlugin", "getPhotoPlugin", "keyboard", "getPostInputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getReplyParentMsgId", "getReplyRootMsgId", "getRichTextInputExpandPlugin", "getRichTextInputShrinkPlugin", "getRootView", "Landroid/view/View;", "getTextInputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin;", "handleBack", "hideKeyboard", "initKeyboardPlugin", "initKeyboardStickerSetStatus", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "initKeyboardView", "context", "isEnableLateInit", "isKeyboardShown", "isKeyboardTipShown", "isTodoTabEnable", "needHideKeyBoard", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onDestroy", "onPause", "onSendMultiFile", "filePaths", "", "onStop", "registerIInputPlugin", "plugin", "registerInputChangeListener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerKBPlugin", "registerKeyboardControlStatusChangeListener", "registerPlusItem", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "setupKeyboardEnable", "showFilePreviewDialog", "showKeyboard", "showPostRestrictionTip", "toggleKeyboardTipShown", "shown", "unRegisterInputChangeListener", "unRegisterKeyboardControlStatusChangeListener", "updatePlusItems", "removed", "added", "addEventPlusItemIfNeed", "isNeedless", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class KeyboardComponent extends Widget implements IKeyboardComponent {

    /* renamed from: j */
    public static final Map<Class<? extends IKeyBoardPlugin>, Integer> f86347j;

    /* renamed from: k */
    public static final Companion f86348k = new Companion(null);

    /* renamed from: a */
    public KeyBoard f86349a;

    /* renamed from: b */
    public KeyboardViewModel f86350b;

    /* renamed from: c */
    public List<IKeyBoardStatusListener> f86351c = new ArrayList();

    /* renamed from: d */
    public Chat f86352d;

    /* renamed from: e */
    public ChatChatter f86353e;

    /* renamed from: g */
    public OpenApp f86354g;

    /* renamed from: h */
    public Activity f86355h;

    /* renamed from: i */
    public KeyboardComponentDependency f86356i;

    /* renamed from: l */
    private final Lazy f86357l = LazyKt.lazy(C33509d.INSTANCE);

    /* renamed from: m */
    private List<IKeyboardComponent.OnKeyboardControlStatusChangeListener> f86358m = new ArrayList();
    @BindView(7405)
    public FrameLayout mKeyboardContainer;

    /* renamed from: n */
    private boolean f86359n;

    /* renamed from: o */
    private Runnable f86360o;

    /* renamed from: p */
    private final Lazy f86361p = LazyKt.lazy(C33531v.INSTANCE);

    /* renamed from: q */
    private final C33535z f86362q = new C33535z(this);

    /* renamed from: t */
    private IKeyboardDependenceViewModel f86363t;

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: a */
    public List<IKeyboardComponent.IKeyboardComponentCallbacks> mo121968a() {
        return (List) this.f86357l.getValue();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121977a(String str, IKeyboardCreator.IPlugin<IPlusItem> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121979a(List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list, List<? extends IKeyboardCreator.IPlugin<IPlusItem>> list2) {
        Intrinsics.checkParameterIsNotNull(list, "removed");
        Intrinsics.checkParameterIsNotNull(list2, "added");
    }

    /* renamed from: b */
    public final boolean mo123207b() {
        return ((Boolean) this.f86361p.getValue()).booleanValue();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: d */
    public int mo121986d() {
        return R.layout.chat_window_component_keyboard;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$Companion;", "", "()V", "sPluginOrderMap", "", "Ljava/lang/Class;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "", "getSPluginOrderMap", "()Ljava/util/Map;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Map<Class<? extends IKeyBoardPlugin>, Integer> mo123209a() {
            return KeyboardComponent.f86347j;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getPostInputSupportPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$ILifeCycleCallback;", "onResume", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$j */
    public static final class C33516j implements PostInputSupportPlugin.ILifeCycleCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86378a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.ILifeCycleCallback
        /* renamed from: b */
        public void mo123217b() {
            PostInputSupportPlugin.ILifeCycleCallback.C40747a.m161305a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.ILifeCycleCallback
        /* renamed from: a */
        public void mo123216a() {
            Chat chat = this.f86378a.f86352d;
            if (chat != null) {
                ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, chat, "post", "im_chat_post_view", (Map) null, 8, (Object) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33516j(KeyboardComponent keyboardComponent) {
            this.f86378a = keyboardComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getRichTextInputExpandPlugin$2", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "onResume", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$m */
    public static final class C33520m implements BaseRichTextInputPlugin.LifeCycleCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86382a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: b */
        public void mo123225b() {
            BaseRichTextInputPlugin.LifeCycleCallback.C40698a.m161059a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: a */
        public void mo123224a() {
            Chat chat = this.f86382a.f86352d;
            if (chat != null) {
                ChatHitPointNew.Companion.m213105a(ChatHitPointNew.f135660c, chat, "post", "im_chat_post_view", (Map) null, 8, (Object) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33520m(KeyboardComponent keyboardComponent) {
            this.f86382a = keyboardComponent;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: j */
    public boolean mo121992j() {
        return this.f86359n;
    }

    /* renamed from: a */
    public final void mo123202a(Chat chat, ChatChatter chatChatter) {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            if (!mo123207b() || chat.isSecret()) {
                TextInputSupportPlugin cVar = (TextInputSupportPlugin) fVar.mo146821d("text");
                if (cVar != null) {
                    cVar.mo147252a(m129860g(chat, chatChatter), m129854c(chat));
                }
            } else {
                RichTextInputShrinkPlugin dVar = (RichTextInputShrinkPlugin) fVar.mo146821d("input_richtext_shrink");
                if (dVar != null) {
                    dVar.mo147111a(m129860g(chat, chatChatter), m129854c(chat));
                }
            }
            fVar.mo146810a(chat.isAllowPost());
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121980a(boolean z) {
        this.f86359n = z;
        if (z) {
            mo121995m();
        } else {
            mo121996n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if ((r7.length() > 0) != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (com.ss.android.lark.widget.richtext.C59035h.m229210a(r6) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r9 = false;
     */
    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo122063a(com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent.mo122063a(com.ss.android.lark.chatwindow.a.a.d, boolean, boolean):void");
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo122064a(RichText richText, String str, RichText richText2) {
        Chat chat;
        boolean z = mo123207b() && ((chat = this.f86352d) == null || !chat.isSecret());
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            if (z) {
                if (richText2 != null) {
                    richText = richText2;
                }
                fVar.mo146802a(null, str, richText, true);
            } else {
                fVar.mo146802a(richText, str, richText2, true);
            }
            if (z || (TextUtils.isEmpty(str) && C59035h.m229210a(richText2))) {
                EditText l = fVar.mo146827h().mo146904l();
                if (l != null) {
                    l.requestFocus();
                }
                fVar.mo146829j();
                return;
            }
            fVar.mo146803a("post");
        }
    }

    /* renamed from: a */
    public final void mo123203a(C35219b bVar) {
        KeyBoard fVar;
        if (TextUtils.equals(bVar.f90952b, "sticker_set_activity") && (fVar = this.f86349a) != null) {
            fVar.mo146844y();
            fVar.mo146823e("face");
        }
    }

    /* renamed from: a */
    public final void mo123204a(List<String> list) {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            String q = fVar.mo146836q();
            String r = fVar.mo146837r();
            for (String str : list) {
                String c = C26311p.m95283c(str);
                Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
                String str2 = c;
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null) || StringsKt.endsWith$default(str, ".0", false, 2, (Object) null)) {
                    KeyboardViewModel cVar = this.f86350b;
                    if (cVar != null) {
                        cVar.sendImageMsg(CollectionsKt.listOf(str), true, q, r);
                    }
                } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "video/", false, 2, (Object) null)) {
                    File file = new File(str);
                    Photo photo = new Photo();
                    photo.setPath(file.getPath());
                    photo.setMimeType(c);
                    photo.setSize(C26311p.m95281c(file));
                    photo.setDuration(0);
                    photo.setCompressPath(ao.m224300a(this.f86355h, file.getPath(), false));
                    KeyboardViewModel cVar2 = this.f86350b;
                    if (cVar2 != null) {
                        cVar2.sendMediaMsg(CollectionsKt.listOf(photo), q, r);
                    }
                } else {
                    KeyboardViewModel cVar3 = this.f86350b;
                    if (cVar3 != null) {
                        cVar3.sendFileMsg(CollectionsKt.listOf(new File(str)));
                    }
                }
            }
            fVar.mo146841v();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public synchronized void mo121975a(IKeyBoardStatusListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f86351c.add(eVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121976a(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146798a(aVar);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121970a(IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f86358m.add(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public void mo121978a(String str, IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146806a(str, bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$addEventPlusItemIfNeed$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/event/IEventDependency;", "createEvent", "", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getUserId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$b */
    public static final class C33506b implements IEventDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86364a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency
        /* renamed from: b */
        public Chat mo123211b() {
            return this.f86364a.f86352d;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency
        /* renamed from: c */
        public String mo123212c() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            return N.mo134394a();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.event.IEventDependency
        /* renamed from: a */
        public void mo123210a() {
            String str;
            Chat chat = this.f86364a.f86352d;
            ChatChatter chatChatter = this.f86364a.f86353e;
            List<String> list = null;
            if (chat == null || chat.isSoloChat() || (chatChatter != null && chatChatter.isBot())) {
                str = null;
            } else {
                str = chat.getId();
            }
            if (chat != null) {
                if (chat.isGroup()) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36450aa N = b.mo134515N();
                    Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
                    list = CollectionsKt.listOf(N.mo134394a());
                } else if (!chat.isSoloChat() && chatChatter != null && !chatChatter.isBot()) {
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36450aa N2 = b2.mo134515N();
                    Intrinsics.checkExpressionValueIsNotNull(N2, "ChatModuleInstanceHolder…endency().loginDependency");
                    list = CollectionsKt.listOf((Object[]) new String[]{N2.mo134394a(), chatChatter.getId()});
                }
            }
            AbstractC36474h b3 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
            b3.mo134517P().mo134340a(this.f86364a.f86355h, str, list);
            EventHitPoint.f135703a.mo187477a(chat);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33506b(KeyboardComponent keyboardComponent) {
            this.f86364a = keyboardComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getMorePlugin$3", "Lcom/ss/android/lark/keyboard/plugin/tool/more/vote/IVoteDependency;", "getContext", "Landroid/content/Context;", "startVote", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$h */
    public static final class C33513h implements IVoteDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86374a;

        /* renamed from: b */
        final /* synthetic */ Chat f86375b;

        /* renamed from: a */
        public Context mo123214a() {
            return this.f86374a.f86355h;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.vote.IVoteDependency
        /* renamed from: b */
        public void mo122121b() {
            ChatStatisticUtil.m213143d(this.f86375b);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134588p().mo134748a(mo123214a(), this.f86375b.getId());
        }

        C33513h(KeyboardComponent keyboardComponent, Chat chat) {
            this.f86374a = keyboardComponent;
            this.f86375b = chat;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001e\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0016\u0010\u0019\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0016J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016¨\u0006\""}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getPhotoPlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "extractVideoFrame", "Lio/reactivex/Observable;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "isEnablePostSendVideo", "", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "sendFile", "fileList", "Ljava/util/ArrayList;", "Ljava/io/File;", "sendImage", "photoPaths", "isKeepOriginPic", "sendVideo", "videoPaths", "", "uploadEncryptImage", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$i */
    public static final class C33514i implements IPhotoDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86376a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public boolean mo122042a() {
            return true;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public boolean mo122044b() {
            return IPhotoDependency.C40977a.m162428a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33514i(KeyboardComponent keyboardComponent) {
            this.f86376a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<Map<String, IPhotoDependency.FrameInfo>> mo122036a(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoInfos");
            Observable<Map<String, IPhotoDependency.FrameInfo>> a = C34278w.m132953a().mo126826a(list);
            Intrinsics.checkExpressionValueIsNotNull(a, "PostService.inst().extra…deoFirstFrame(videoInfos)");
            return a;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "image", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$i$a */
        static final class C33515a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C33515a f86377a = new C33515a();

            C33515a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(Image image) {
                Intrinsics.checkParameterIsNotNull(image, "image");
                List<String> urls = image.getUrls();
                Intrinsics.checkExpressionValueIsNotNull(urls, "image.urls");
                int width = image.getWidth();
                int height = image.getHeight();
                String token = image.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "image.token");
                return new IPhotoDependency.Image(urls, width, height, token);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122038a(C58557a.C58559a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            Activity activity = this.f86376a.f86355h;
            Object o = this.f86376a.mo141195o();
            if (o != null) {
                aVar.mo198512a(activity, (Fragment) o, 233);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoPaths");
            KeyBoard fVar = this.f86376a.f86349a;
            if (fVar != null) {
                List<IPhotoDependency.VideoInfo> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (T t : list2) {
                    Photo photo = new Photo();
                    photo.setPath(t.getPath());
                    photo.setMimeType(t.getMimeType());
                    photo.setSize(t.getSize());
                    photo.setDuration(t.getDuration());
                    photo.setCompressPath(t.getCompressPath());
                    arrayList.add(photo);
                }
                ArrayList arrayList2 = arrayList;
                KeyboardViewModel cVar = this.f86376a.f86350b;
                if (cVar != null) {
                    cVar.sendMediaMsg(arrayList2, fVar.mo146836q(), fVar.mo146837r());
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122039a(C58633e.C58634a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            Activity activity = this.f86376a.f86355h;
            Object o = this.f86376a.mo141195o();
            if (o != null) {
                aVar.mo198694a(activity, (Fragment) o, 911);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122040a(ArrayList<File> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "fileList");
            KeyboardViewModel cVar = this.f86376a.f86350b;
            if (cVar != null) {
                cVar.sendFileMsg(arrayList);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122041a(ArrayList<String> arrayList, boolean z) {
            KeyboardViewModel cVar;
            Intrinsics.checkParameterIsNotNull(arrayList, "photoPaths");
            KeyBoard fVar = this.f86376a.f86349a;
            if (fVar != null && (cVar = this.f86376a.f86350b) != null) {
                cVar.sendImageMsg(arrayList, z, fVar.mo146836q(), fVar.mo146837r());
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Observable<R> map = C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Chat).map(C33515a.f86377a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …ge.height, image.token) }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getTextInputSupportPlugin$2", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;", "onSendInterrupted", "", "onSendText", "content", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$q */
    public static final class C33524q implements OnSendTextCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86386a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122054a() {
            this.f86386a.mo123208f();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33524q(KeyboardComponent keyboardComponent) {
            this.f86386a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122055a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            KeyBoard fVar = this.f86386a.f86349a;
            if (fVar != null) {
                String q = fVar.mo146836q();
                String r = fVar.mo146837r();
                KeyboardViewModel cVar = this.f86386a.f86350b;
                if (cVar != null) {
                    cVar.sendTextMsg(q, r, richText);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$todoDependency$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/todo/IToDoDependency;", "getContext", "Landroid/content/Context;", "startTodo", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "fromPlugin", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$z */
    public static final class C33535z implements IToDoDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86400a;

        /* renamed from: a */
        public Context mo123230a() {
            return this.f86400a.f86355h;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33535z(KeyboardComponent keyboardComponent) {
            this.f86400a = keyboardComponent;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$todoDependency$1$startTodo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$z$a */
        public static final class C33536a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C33535z f86401a;

            /* renamed from: b */
            final /* synthetic */ Chat f86402b;

            /* renamed from: c */
            final /* synthetic */ boolean f86403c;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ChatWindowLog", errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                BlockExtra.SceneType sceneType;
                RichText richText;
                String str2;
                Editable text;
                Intrinsics.checkParameterIsNotNull(str, "blockId");
                StringBuilder sb = new StringBuilder();
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                if (b.mo134575c()) {
                    sb.append("https://applink.larksuite.com/client/chat/open");
                } else {
                    sb.append("https://applink.feishu.cn/client/chat/open");
                }
                sb.append("?");
                sb.append("chatId=");
                sb.append(this.f86402b.getId());
                String sb2 = sb.toString();
                Intrinsics.checkExpressionValueIsNotNull(sb2, "appLinkBuilder.toString()");
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((Object) "chat_id", (Object) this.f86402b.getId());
                jSONObject2.put((Object) "is_public", (Object) Boolean.valueOf(this.f86402b.isPublic()));
                String jSONString = jSONObject.toJSONString();
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                BlockEntity a = b2.ak().mo86315a(str, BlockTypeID.CHAT, sb2, "", jSONString, "", "");
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…, \"\", sourceMeta, \"\", \"\")");
                AbstractC36474h b3 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                C24062d ak = b3.ak();
                Context a2 = this.f86401a.mo123230a();
                ActionType actionType = ActionType.Todo;
                BlockExtra blockExtra = new BlockExtra();
                if (this.f86403c) {
                    sceneType = BlockExtra.SceneType.INPUT_BOX;
                } else {
                    sceneType = BlockExtra.SceneType.MESSAGE_TOOLBAR;
                }
                blockExtra.sceneType = sceneType;
                KeyBoard fVar = this.f86401a.f86400a.f86349a;
                if (fVar != null) {
                    EditText l = fVar.mo146827h().mo146904l();
                    if (l instanceof RichTextEmojiconEditText) {
                        richText = ((RichTextEmojiconEditText) l).getRichText();
                    } else {
                        if (l == null || (text = l.getText()) == null || (str2 = text.toString()) == null) {
                            str2 = "";
                        }
                        richText = C59029c.m229161b(str2);
                    }
                    if (!C59035h.m229210a(richText)) {
                        blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(richText, null)));
                    }
                }
                ak.mo86317a(a2, actionType, a, blockExtra);
            }

            C33536a(C33535z zVar, Chat chat, boolean z) {
                this.f86401a = zVar;
                this.f86402b = chat;
                this.f86403c = z;
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.todo.IToDoDependency
        /* renamed from: a */
        public void mo123231a(Chat chat, boolean z) {
            String str;
            String str2;
            String str3;
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (z) {
                str = "input_box";
            } else {
                str = "message_toolbar";
            }
            org.json.JSONObject put = jSONObject.put(ShareHitPoint.f121868c, str);
            Chat chat2 = this.f86400a.f86352d;
            if (chat2 != null) {
                str2 = chat2.getId();
            } else {
                str2 = null;
            }
            org.json.JSONObject put2 = put.put("chat_id", str2);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            com.ss.android.lark.dependency.ao R = b.mo134519R();
            Intrinsics.checkExpressionValueIsNotNull(R, "ChatModuleInstanceHolder…pendency().todoDependency");
            if (R.mo134473a()) {
                str3 = "inline";
            } else {
                str3 = "pop_up";
            }
            Statistics.sendEvent("todo_create", put2.put("ab_version", str3));
            TodoHitPoint.f135910a.mo187756a(chat);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            b2.ak().mo86324b(Domain.chat, chat.getId(), BlockTypeID.CHAT, new C33536a(this, chat, z));
        }
    }

    /* renamed from: s */
    private final IKeyBoardPlugin m129862s() {
        return new AaStyleKBPlugin();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: p */
    public void mo121999p() {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146820c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$d */
    static final class C33509d extends Lambda implements Function0<ArrayList<IKeyboardComponent.IKeyboardComponentCallbacks>> {
        public static final C33509d INSTANCE = new C33509d();

        C33509d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<IKeyboardComponent.IKeyboardComponentCallbacks> invoke() {
            return new ArrayList<>();
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    public boolean an_() {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            return fVar.mo146828i();
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.IComponent
    /* renamed from: h */
    public boolean mo121990h() {
        KeyBoard fVar = this.f86349a;
        if (fVar == null || !fVar.mo146824e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: i */
    public View mo121991i() {
        FrameLayout frameLayout = this.mKeyboardContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
        }
        return frameLayout;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: k */
    public String mo121993k() {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            return fVar.mo146836q();
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: l */
    public String mo121994l() {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            return fVar.mo146837r();
        }
        return null;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    public void onStop() {
        super.onStop();
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146839t();
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: q */
    public void mo122000q() {
        super.mo122000q();
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146843x();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J8\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$initKeyboardView$1", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "attachNestRoot", "", "nestScrollFrameLayout", "Lcom/ss/android/lark/keyboard/base/NestScrollFrameLayout;", "resetDraft", "resetOnStart", "", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "saveDraft", "parentId", "", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "saveDraftOnStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$u */
    public static final class C33528u implements IKeyBoardDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86391a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$initKeyboardView$1$resetDraft$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardViewModel$IResetDraftCallback;", "onFetchDraftSuccess", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chatbase/model/data/ComposeDrafts;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$u$a */
        public static final class C33529a implements KeyboardViewModel.IResetDraftCallback {

            /* renamed from: a */
            final /* synthetic */ C33528u f86392a;

            /* renamed from: b */
            final /* synthetic */ boolean f86393b;

            /* renamed from: c */
            final /* synthetic */ IKeyBoardDependency.IResetDraftCallback f86394c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "queueIdle"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$u$a$a */
            static final class C33530a implements MessageQueue.IdleHandler {

                /* renamed from: a */
                final /* synthetic */ C33529a f86395a;

                /* renamed from: b */
                final /* synthetic */ C34431a f86396b;

                C33530a(C33529a aVar, C34431a aVar2) {
                    this.f86395a = aVar;
                    this.f86396b = aVar2;
                }

                public final boolean queueIdle() {
                    IKeyBoardDependency.IResetDraftCallback.C40677a.m160773a(this.f86395a.f86394c, this.f86396b.f88903a, this.f86396b.f88905c, this.f86396b.f88904b, null, 8, null);
                    return false;
                }
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardViewModel.IResetDraftCallback
            /* renamed from: a */
            public void mo122006a(C34431a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (this.f86393b && !TextUtils.isEmpty(aVar.f88906d)) {
                    C35221d dVar = new C35221d();
                    dVar.f90975g = aVar.f88903a;
                    dVar.f90971c = aVar.f88908f;
                    dVar.f90970b = aVar.f88906d;
                    dVar.f90969a = aVar.f88907e;
                    dVar.f90977i = aVar.f88905c;
                    dVar.f90976h = aVar.f88904b;
                    this.f86392a.f86391a.mo122063a(dVar, false, true);
                }
                if (this.f86393b) {
                    Looper.myQueue().addIdleHandler(new C33530a(this, aVar));
                } else {
                    IKeyBoardDependency.IResetDraftCallback.C40677a.m160773a(this.f86394c, aVar.f88903a, aVar.f88905c, aVar.f88904b, null, 8, null);
                }
            }

            C33529a(C33528u uVar, boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
                this.f86392a = uVar;
                this.f86393b = z;
                this.f86394c = bVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33528u(KeyboardComponent keyboardComponent) {
            this.f86391a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
            this.f86391a.f86356i.mo122091a(nestScrollFrameLayout);
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            KeyboardViewModel cVar = this.f86391a.f86350b;
            if (cVar != null) {
                cVar.resetChatDraft(z, new C33529a(this, z, bVar));
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
            String str3;
            KeyboardViewModel cVar;
            if (this.f86391a.mo123207b() && (cVar = this.f86391a.f86350b) != null) {
                cVar.clearTextDraftIfNeed();
            }
            KeyboardViewModel cVar2 = this.f86391a.f86350b;
            if (cVar2 != null) {
                Chat chat = this.f86391a.f86352d;
                if (chat != null) {
                    str3 = chat.getId();
                } else {
                    str3 = null;
                }
                cVar2.saveAllDraft(str, str3, richText, str2, richText2, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$addRedPacketPlusItemIfNeed$2", "Lcom/ss/android/lark/keyboard/plugin/tool/more/redpacket/IRedPacketDependency;", "isSendRedPacketDeniedByUserRelation", "", "target", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "currentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "sendRedPacket", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$c */
    public static final class C33507c implements IRedPacketDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86365a;

        /* renamed from: b */
        final /* synthetic */ Chat f86366b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$addRedPacketPlusItemIfNeed$2$sendRedPacket$1", "Lcom/ss/android/lark/dependency/IMoneyDependency$IGetPluginCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoading", "onSuccess", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$c$a */
        public static final class C33508a implements AbstractC36456ae.AbstractC36457a {

            /* renamed from: a */
            final /* synthetic */ C33507c f86367a;

            /* renamed from: b */
            final /* synthetic */ CommonLoadingDialog f86368b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f86369c;

            /* renamed from: d */
            final /* synthetic */ Ref.ObjectRef f86370d;

            @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
            /* renamed from: b */
            public void mo122737b() {
                if (UIUtils.isActivityRunning(this.f86367a.f86365a.f86355h)) {
                    this.f86368b.show(this.f86367a.f86365a.f86355h);
                }
            }

            @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
            /* renamed from: a */
            public void mo122735a() {
                if (UIUtils.isActivityRunning(this.f86367a.f86365a.f86355h)) {
                    this.f86368b.dismiss();
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    b.mo134598z().mo134426a(this.f86367a.f86365a.f86355h, this.f86367a.f86366b.getId(), !this.f86367a.f86366b.isP2PChat(), this.f86367a.f86366b.getUserCount(), this.f86369c.element, this.f86370d.element);
                }
            }

            @Override // com.ss.android.lark.dependency.AbstractC36456ae.AbstractC36457a
            /* renamed from: a */
            public void mo122736a(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                if (UIUtils.isActivityRunning(this.f86367a.f86365a.f86355h)) {
                    this.f86368b.dismiss();
                    LKUIToast.show(this.f86367a.f86365a.f86355h, (int) R.string.Lark_Legacy_ErrorMessageTip);
                }
            }

            C33508a(C33507c cVar, CommonLoadingDialog commonLoadingDialog, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
                this.f86367a = cVar;
                this.f86368b = commonLoadingDialog;
                this.f86369c = objectRef;
                this.f86370d = objectRef2;
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.redpacket.IRedPacketDependency
        /* renamed from: a */
        public boolean mo123213a() {
            String str;
            if (m129903a(this.f86365a.f86353e, this.f86366b)) {
                return false;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            boolean au = b.au();
            if (au) {
                RedPacketHitPoint.Companion aVar = RedPacketHitPoint.f135904a;
                if (this.f86366b.isP2PChat()) {
                    str = "single";
                } else {
                    str = "group";
                }
                aVar.mo187704a(str);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = "";
                if (this.f86365a.f86353e != null) {
                    ChatChatter chatChatter = this.f86365a.f86353e;
                    if (chatChatter == null) {
                        Intrinsics.throwNpe();
                    }
                    T t = (T) chatChatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(t, "mCurrentChatter!!.getId()");
                    objectRef.element = t;
                    ChatChatter chatChatter2 = this.f86365a.f86353e;
                    if (chatChatter2 == null) {
                        Intrinsics.throwNpe();
                    }
                    T t2 = (T) chatChatter2.getLocalizedName();
                    Intrinsics.checkExpressionValueIsNotNull(t2, "mCurrentChatter!!.getLocalizedName()");
                    objectRef2.element = t2;
                }
                RedPacketHitPoint.Companion aVar2 = RedPacketHitPoint.f135904a;
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36474h.AbstractC36484j am = b2.am();
                AbstractC36474h b3 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36456ae z = b3.mo134598z();
                Intrinsics.checkExpressionValueIsNotNull(z, "ChatModuleInstanceHolder…endency().moneyDependency");
                boolean a = am.mo134626a(z.mo134423a());
                AbstractC36474h b4 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36474h.AbstractC36484j am2 = b4.am();
                AbstractC36474h b5 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36456ae z2 = b5.mo134598z();
                Intrinsics.checkExpressionValueIsNotNull(z2, "ChatModuleInstanceHolder…endency().moneyDependency");
                aVar2.mo187705a(a, am2.mo134627b(z2.mo134423a()));
                CommonLoadingDialog commonLoadingDialog = new CommonLoadingDialog();
                AbstractC36474h b6 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b6, "ChatModuleInstanceHolder.getDependency()");
                b6.mo134598z().mo134427a(new C33508a(this, commonLoadingDialog, objectRef, objectRef2));
            } else {
                new C25639g(this.f86365a.f86355h).mo89254m(R.string.Lark_Legacy_HongbaoUpgrade).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, (DialogInterface.OnClickListener) null).mo89239c();
            }
            return au;
        }

        C33507c(KeyboardComponent keyboardComponent, Chat chat) {
            this.f86365a = keyboardComponent;
            this.f86366b = chat;
        }

        /* renamed from: a */
        private final boolean m129903a(Chatter chatter, Chat chat) {
            if (!chat.isP2PChat() || !chat.isCrossTenant()) {
                return false;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36493i ah = b.ah();
            if (chatter == null) {
                Intrinsics.throwNpe();
            }
            UserRelationResponse a = ah.mo134645a(chatter.getId());
            if (a == null) {
                return false;
            }
            if (a.isHasBeBlocked()) {
                LKUIToast.show(this.f86365a.f86355h, (int) R.string.Lark_NewContacts_CantSendHongbaoDueToBlock);
                return true;
            } else if (a.isHasBlock()) {
                LKUIToast.show(this.f86365a.f86355h, (int) R.string.Lark_NewContacts_CantSendHongbaoDueToBlockOthers);
                return true;
            } else if (a.isFriend() || this.f86365a.f86353e == null) {
                return false;
            } else {
                ChatChatter chatChatter = this.f86365a.f86353e;
                if (chatChatter == null) {
                    Intrinsics.throwNpe();
                }
                String id = chatChatter.getId();
                ChatChatter chatChatter2 = this.f86365a.f86353e;
                if (chatChatter2 == null) {
                    Intrinsics.throwNpe();
                }
                Contact contact = new Contact(id, null, chatChatter2.getLocalizedName());
                ArrayList<Contact> arrayList = new ArrayList<>();
                arrayList.add(contact);
                arrayList.set(0, contact);
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                b2.ah().mo134647a(this.f86365a.f86355h, UIUtils.getString(this.f86365a.f86355h, R.string.Lark_NewContacts_NeedToAddToContactstHongbaoOneDialogContent), "hongbao_confirm", arrayList, null);
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getFacePlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;", "getBaseFragment", "Landroidx/fragment/app/Fragment;", "onSendStickerMsg", "", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$e */
    public static final class C33510e implements FacePluginDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86371a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public Fragment mo122020a() {
            Object o = this.f86371a.mo141195o();
            if (o != null) {
                return (Fragment) o;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33510e(KeyboardComponent keyboardComponent) {
            this.f86371a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public void mo122021a(C40964l lVar) {
            KeyBoard fVar = this.f86371a.f86349a;
            if (fVar != null) {
                String q = fVar.mo146836q();
                String r = fVar.mo146837r();
                IStickerDependency.StickerFileInfo a = C33224n.m128431a(lVar);
                KeyboardViewModel cVar = this.f86371a.f86350b;
                if (cVar != null) {
                    Intrinsics.checkExpressionValueIsNotNull(a, "send");
                    cVar.sendStickerMsg(a, q, r);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getMorePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "onClicked", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$f */
    public static final class C33511f implements IKeyBoardPlugin.IPluginClickListener {

        /* renamed from: a */
        final /* synthetic */ Chat f86372a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin.IPluginClickListener
        /* renamed from: a */
        public void mo122033a() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ai().mo134637a(this.f86372a);
            ChatStatisticUtil.m213142c(this.f86372a);
        }

        C33511f(Chat chat) {
            this.f86372a = chat;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getPostInputSupportPlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;", "onSendInterrupted", "", "onSendPost", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "keepOrigin", "", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$k */
    public static final class C33517k implements OnSendPostCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86379a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public void mo123219a() {
            Chat chat = this.f86379a.f86352d;
            if (chat == null) {
                Intrinsics.throwNpe();
            }
            LKUIToast.show(this.f86379a.f86355h, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", chat.getName()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33517k(KeyboardComponent keyboardComponent) {
            this.f86379a = keyboardComponent;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "image", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$k$a */
        static final class C33518a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C33518a f86380a = new C33518a();

            C33518a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(Image image) {
                Intrinsics.checkParameterIsNotNull(image, "image");
                List<String> urls = image.getUrls();
                Intrinsics.checkExpressionValueIsNotNull(urls, "image.urls");
                int width = image.getWidth();
                int height = image.getHeight();
                String token = image.getToken();
                Intrinsics.checkExpressionValueIsNotNull(token, "image.token");
                return new IPhotoDependency.Image(urls, width, height, token);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo123218a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Observable<R> map = C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Chat).map(C33518a.f86380a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …en)\n                    }");
            return map;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public void mo123220a(String str, String str2, RichText richText) {
            KeyboardViewModel cVar;
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            KeyBoard fVar = this.f86379a.f86349a;
            if (fVar != null && (cVar = this.f86379a.f86350b) != null) {
                cVar.sendPostMsg(str, str2, richText, fVar.mo146836q(), fVar.mo146837r());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getRichTextInputExpandPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "onSendInterrupted", "", "onSendRichText", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "triggeredBySendButton", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$l */
    public static final class C33519l implements OnSendRichTextCallBack {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86381a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123222a() {
            Chat chat = this.f86381a.f86352d;
            if (chat == null) {
                Intrinsics.throwNpe();
            }
            LKUIToast.show(this.f86381a.f86355h, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", chat.getName()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33519l(KeyboardComponent keyboardComponent) {
            this.f86381a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123223a(String str, String str2, RichText richText, boolean z) {
            KeyboardViewModel cVar;
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            C54948d.m213138a(z, true, false, 4, null);
            KeyBoard fVar = this.f86381a.f86349a;
            if (fVar != null && (cVar = this.f86381a.f86350b) != null) {
                cVar.sendPostMsg(str, str2, richText, fVar.mo146836q(), fVar.mo146837r());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getRichTextInputShrinkPlugin$lifeCycleCallback$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/BaseRichTextInputPlugin$LifeCycleCallback;", "onResume", "", "onStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$n */
    public static final class C33521n implements BaseRichTextInputPlugin.LifeCycleCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86383a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: a */
        public void mo123224a() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f86383a.mo121968a()) {
                bVar.mo122067b();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.BaseRichTextInputPlugin.LifeCycleCallback
        /* renamed from: b */
        public void mo123225b() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f86383a.mo121968a()) {
                bVar.mo122065a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33521n(KeyboardComponent keyboardComponent) {
            this.f86383a = keyboardComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getRichTextInputShrinkPlugin$onSendPostCallback$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "onSendInterrupted", "", "onSendRichText", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "triggeredBySendButton", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$o */
    public static final class C33522o implements OnSendRichTextCallBack {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86384a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123222a() {
            Chat chat = this.f86384a.f86352d;
            if (chat == null) {
                Intrinsics.throwNpe();
            }
            LKUIToast.show(this.f86384a.f86355h, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", chat.getName()));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33522o(KeyboardComponent keyboardComponent) {
            this.f86384a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123223a(String str, String str2, RichText richText, boolean z) {
            KeyboardViewModel cVar;
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            C54948d.m213138a(z, false, false, 4, null);
            KeyBoard fVar = this.f86384a.f86349a;
            if (fVar != null && (cVar = this.f86384a.f86350b) != null) {
                cVar.sendPostMsg(str, str2, richText, fVar.mo146836q(), fVar.mo146837r());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getTextInputSupportPlugin$3", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/IOnLifeCallback;", "onResume", "", "onStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$r */
    public static final class C33525r implements IOnLifeCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86387a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
        /* renamed from: a */
        public void mo122056a() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f86387a.mo121968a()) {
                bVar.mo122067b();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.IOnLifeCallback
        /* renamed from: b */
        public void mo122057b() {
            for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : this.f86387a.mo121968a()) {
                bVar.mo122065a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33525r(KeyboardComponent keyboardComponent) {
            this.f86387a = keyboardComponent;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "queueIdle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$t */
    public static final class C33527t implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86389a;

        /* renamed from: b */
        final /* synthetic */ TransationData f86390b;

        C33527t(KeyboardComponent keyboardComponent, TransationData jVar) {
            this.f86389a = keyboardComponent;
            this.f86390b = jVar;
        }

        public final boolean queueIdle() {
            PerfLog.start("keyboard_init_start", "");
            KeyBoard fVar = this.f86389a.f86349a;
            if (fVar != null) {
                fVar.mo146799a(this.f86390b);
            }
            PerfLog.end("keyboard_init_start", "");
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$v */
    static final class C33531v extends Lambda implements Function0<Boolean> {
        public static final C33531v INSTANCE = new C33531v();

        C33531v() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134586n().mo134685a("messenger.message_inputbox_redesign");
        }
    }

    /* renamed from: g */
    private final boolean m129861g() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        return b.mo134586n().mo134685a("chat.laterinflate.keyboard");
    }

    /* renamed from: t */
    private final boolean m129863t() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        com.ss.android.lark.dependency.ao R = b.mo134519R();
        Intrinsics.checkExpressionValueIsNotNull(R, "ChatModuleInstanceHolder…pendency().todoDependency");
        return R.mo134474b();
    }

    /* renamed from: f */
    public final void mo123208f() {
        String str;
        Chat chat = this.f86352d;
        if (chat != null) {
            str = chat.getName();
        } else {
            str = null;
        }
        LKUIToast.show(this.f86355h, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", str));
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: m */
    public void mo121995m() {
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146833n();
        }
        Iterator<T> it = this.f86358m.iterator();
        while (it.hasNext()) {
            it.next().mo122068a(false);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: n */
    public void mo121996n() {
        if (!mo121985c()) {
            KeyBoard fVar = this.f86349a;
            if (fVar != null) {
                fVar.mo146834o();
            }
            Iterator<T> it = this.f86358m.iterator();
            while (it.hasNext()) {
                it.next().mo122068a(true);
            }
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        Runnable runnable = this.f86360o;
        if (runnable != null) {
            FrameLayout frameLayout = this.mKeyboardContainer;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
            }
            frameLayout.removeCallbacks(runnable);
        }
        KeyboardViewModel cVar = this.f86350b;
        if (cVar != null) {
            cVar.onDestroy();
        }
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146838s();
        }
        this.f86349a = null;
    }

    /* renamed from: c */
    public final boolean mo121985c() {
        if (KeyboardHideJudge.f85065a.mo122099a(this.f86352d, this.f86353e, this.f86354g) || mo121992j()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        PerfLog.start("keyboard_init", "");
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        View K2 = mo141184K();
        if (K2 == null) {
            Intrinsics.throwNpe();
        }
        Context context = K2.getContext();
        if (context != null) {
            m129850a((Activity) context);
            KeyboardComponent keyboardComponent = this;
            C33427a.m129533a(this.f86363t.getInitData(), keyboardComponent, new C33532w(this));
            this.f86363t.getChat().mo5923a(keyboardComponent, new C33533x(this));
            PerfLog.end("keyboard_init", "");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    static {
        HashMap hashMap = new HashMap();
        f86347j = hashMap;
        hashMap.put(DesktopFaceKBPlugin.class, 0);
        hashMap.put(FaceKBPlugin.class, 1);
        hashMap.put(AtKBPlugin.class, 2);
        hashMap.put(VoiceKBPlugin.class, 3);
        hashMap.put(PhotoKBPlugin.class, 4);
        hashMap.put(ScreenShotDesktopPlugin.class, 5);
        hashMap.put(BurnLifeKBPlugin.class, 6);
        hashMap.put(AaStyleKBPlugin.class, 7);
        hashMap.put(PlusKBDesktopPlugin.class, 8);
        hashMap.put(PlusKBPlugin.class, 9);
        hashMap.put(UploadLogKBPlugin.class, 10);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getMorePlugin$2", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency;", "getContext", "Landroid/content/Context;", "launchFileChooser", "", "requestCode", "", "parseFileChooseResult", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$FileChooseResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "sendFile", "files", "", "Ljava/io/File;", "sendFileByUri", "uri", "Landroid/net/Uri;", "sendNutFile", "Lcom/ss/android/lark/keyboard/plugin/tool/more/file/IFileDependency$NutFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$g */
    public static final class C33512g implements IFileDependency {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86373a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33512g(KeyboardComponent keyboardComponent) {
            this.f86373a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122026a(Uri uri) {
            Intrinsics.checkParameterIsNotNull(uri, "uri");
            KeyboardViewModel cVar = this.f86373a.f86350b;
            if (cVar != null) {
                cVar.sendFileMsg(uri);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122027a(List<? extends File> list) {
            Intrinsics.checkParameterIsNotNull(list, "files");
            KeyboardViewModel cVar = this.f86373a.f86350b;
            if (cVar != null) {
                cVar.sendFileMsg(list);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public void mo122025a(int i) {
            String a = FileSendUtils.f88686a.mo126927a(5368709120L);
            String b = FileSendUtils.f88686a.mo126928b(5368709120L);
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            b2.mo134510I().mo134709a(this.f86373a.f86355h, this.f86373a.f86356i.mo122092b(), i, 5368709120L, 5368709120L, a, b, true);
            if (i == 2185) {
                ChatDriveHitPoint.m213217a();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.more.file.IFileDependency
        /* renamed from: a */
        public IFileDependency.FileChooseResult mo122024a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36506t I = b.mo134510I();
            Intrinsics.checkExpressionValueIsNotNull(I, "ChatModuleInstanceHolder…cy().filePickerDependency");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(I.mo134708a());
            ClipData clipData = intent.getClipData();
            if (clipData == null) {
                return new IFileDependency.FileChooseResult(stringArrayListExtra, null);
            }
            Intrinsics.checkExpressionValueIsNotNull(clipData, "data.clipData ?: return …seResult(filePaths, null)");
            return new IFileDependency.FileChooseResult(stringArrayListExtra, IFileDependency.FileChooseResult.f104173a.mo147650a(clipData));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$getTextInputSupportPlugin$1", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onFilePaste", "", "rawFilePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$p */
    public static final class C33523p extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86385a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33523p(KeyboardComponent keyboardComponent) {
            this.f86385a = keyboardComponent;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "rawFilePaths");
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!new File(str).isDirectory()) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f86385a.mo123206b(arrayList);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$initKeyboardPlugin$1", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$s */
    public static final class C33526s implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86388a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33526s(KeyboardComponent keyboardComponent) {
            this.f86388a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
            KeyBoard fVar = this.f86388a.f86349a;
            if (!(fVar == null || fVar.mo146818b("input_richtext_expand") || fVar.mo146818b("post"))) {
                for (IKeyBoardStatusListener eVar : this.f86388a.f86351c) {
                    eVar.mo122008a(i);
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            if (this.f86388a.f86349a != null) {
                KeyBoard fVar = this.f86388a.f86349a;
                if (fVar == null) {
                    Intrinsics.throwNpe();
                }
                if (!fVar.mo146818b("input_richtext_expand")) {
                    KeyBoard fVar2 = this.f86388a.f86349a;
                    if (fVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!fVar2.mo146818b("post")) {
                        for (IKeyBoardStatusListener eVar : this.f86388a.f86351c) {
                            eVar.mo122009a(z, i, str);
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/component/keyboard/KeyboardComponent$showFilePreviewDialog$dialog$1", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;", "onNegativeClick", "", "dialog", "Landroid/app/Dialog;", "onPositiveClick", "filePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$y */
    public static final class C33534y implements FilePreviewDialogCallback {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86399a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33534y(KeyboardComponent keyboardComponent) {
            this.f86399a = keyboardComponent;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
        /* renamed from: a */
        public boolean mo122058a(Dialog dialog) {
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            dialog.dismiss();
            return true;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback
        /* renamed from: a */
        public boolean mo122059a(Dialog dialog, List<String> list) {
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f86399a.mo123204a(list);
            dialog.dismiss();
            return true;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: a */
    public <T extends IKeyBoardPlugin> T mo121967a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            return (T) fVar.mo146819c(str);
        }
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: b */
    public void mo121983b(IKeyboardComponent.OnKeyboardControlStatusChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f86358m.remove(cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$x */
    static final class C33533x<T> implements AbstractC1178x<Chat> {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86398a;

        C33533x(KeyboardComponent keyboardComponent) {
            this.f86398a = keyboardComponent;
        }

        /* renamed from: a */
        public final void onChanged(Chat chat) {
            if (chat != null) {
                KeyboardViewModel cVar = this.f86398a.f86350b;
                if (cVar != null) {
                    cVar.updateChat(chat);
                }
                KeyboardComponent keyboardComponent = this.f86398a;
                keyboardComponent.mo123202a(chat, keyboardComponent.f86353e);
            }
        }
    }

    /* renamed from: c */
    private final int m129854c(Chat chat) {
        if (chat.isAllowPost()) {
            return UIHelper.getColor(R.color.text_placeholder);
        }
        return UIHelper.getColor(R.color.ud_N300);
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent
    /* renamed from: b */
    public void mo121984b(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146815b(aVar);
        }
    }

    /* renamed from: a */
    private final IKeyBoardPlugin m129848a(Chat chat) {
        FragmentManager a = this.f86356i.mo122090a();
        boolean isSecret = chat.isSecret();
        return new FaceKBPlugin(!isSecret, isSecret, a, new FaceKBPluginDependency(new C33510e(this)));
    }

    /* renamed from: b */
    private final IKeyBoardPlugin m129853b(Chat chat) {
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        boolean isSecret = chat.isSecret();
        Activity activity = this.f86355h;
        String id2 = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
        return new AtKBPlugin(id, isSecret, true, new AtKBPluginDependency(activity, id2, chat.isP2PChat()));
    }

    /* renamed from: a */
    private final void m129850a(Activity activity) {
        FrameLayout frameLayout = this.mKeyboardContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
        }
        C57298a.m222016a("keyboard_container", frameLayout);
        InputAreaHitPoint.f135709c.mo187481a("message_input");
        boolean g = m129861g();
        Log.m165389i("ChatWindowLog", "keyboard inflate later enable = " + g);
        FrameLayout frameLayout2 = this.mKeyboardContainer;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyboardContainer");
        }
        KeyBoard fVar = new KeyBoard(activity, frameLayout2, new C33528u(this), null, null, g, 24, null);
        this.f86349a = fVar;
        if (fVar != null) {
            fVar.mo146801a(new AutoAdjustSizeLayoutManager());
        }
        KeyBoard fVar2 = this.f86349a;
        if (fVar2 != null) {
            fVar2.mo146795a(KeyboardScene.ChatMain);
        }
    }

    /* renamed from: b */
    public final void mo123206b(List<String> list) {
        Log.m165389i("ChatWindowLog", "Attempting to create RecyclerView with the files" + list);
        new FilePreviewDialog(this.f86355h, list, new C33534y(this)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.KeyboardComponent$w */
    static final class C33532w<T> implements AbstractC1178x<C35219b> {

        /* renamed from: a */
        final /* synthetic */ KeyboardComponent f86397a;

        C33532w(KeyboardComponent keyboardComponent) {
            this.f86397a = keyboardComponent;
        }

        /* renamed from: a */
        public final void onChanged(C35219b bVar) {
            PerfLog.start("keyboard_init_with_data", "");
            if (bVar != null) {
                this.f86397a.f86352d = bVar.f90956f;
                this.f86397a.f86353e = bVar.f90957g;
                this.f86397a.f86354g = bVar.f90960j;
                Chat chat = bVar.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "it.chat");
                KeyboardModelFactory iVar = new KeyboardModelFactory(chat, this.f86397a.f86356i);
                KeyboardComponent keyboardComponent = this.f86397a;
                Object o = keyboardComponent.mo141195o();
                if (o != null) {
                    keyboardComponent.f86350b = (KeyboardViewModel) new C1144ai((Fragment) o, iVar).mo6006a(WidgetViewModelKeyManager.f86344a.mo123198a(KeyboardViewModel.class), KeyboardViewModel.class);
                    KeyboardComponent keyboardComponent2 = this.f86397a;
                    Chat chat2 = bVar.f90956f;
                    Intrinsics.checkExpressionValueIsNotNull(chat2, "it.chat");
                    keyboardComponent2.mo123205b(chat2, bVar.f90957g);
                    if (this.f86397a.mo121985c()) {
                        this.f86397a.mo121995m();
                    }
                    this.f86397a.mo123203a(bVar);
                    KeyboardComponent keyboardComponent3 = this.f86397a;
                    Chat chat3 = bVar.f90956f;
                    Intrinsics.checkExpressionValueIsNotNull(chat3, "it.chat");
                    keyboardComponent3.mo123202a(chat3, bVar.f90957g);
                    PerfLog.end("keyboard_init_with_data", "");
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
            }
        }
    }

    /* renamed from: d */
    private final IKeyBoardPlugin m129857d(Chat chat) {
        boolean z;
        PlusKBPlugin eVar = new PlusKBPlugin(chat.isSecret());
        eVar.mo147660a(new C33511f(chat));
        m129851a(chat, eVar);
        boolean z2 = false;
        if (chat.isSecret() || chat.isCrossWithKa() || chat.isSuper()) {
            z = true;
        } else {
            z = false;
        }
        m129852a(eVar, z);
        eVar.mo147661b(new FilePlusItem(new C33512g(this)));
        if (!chat.isCrossWithKa() && !chat.isP2PChat() && !chat.isCustomerService() && !chat.isSecret() && !chat.isSuper()) {
            eVar.mo147661b(new VotePlusItem(new C33513h(this, chat)));
        }
        if (m129863t() && !chat.isCrossWithKa() && !chat.isThread() && !chat.isSecret() && !chat.isSuper()) {
            z2 = true;
        }
        if (z2) {
            eVar.mo147661b(new TodoPlusItem(chat, this.f86362q));
        }
        AbstractC36474h b = C29990c.m110930b();
        if (b != null) {
            b.mo134537a(this.f86355h, this.f86352d, this.f86353e, new C34416c(eVar));
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo121971a(IKeyboardComponent.IKeyboardComponentCallbacks bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        IKeyboardComponent.C33035a.m127730a(this, bVar);
    }

    /* renamed from: g */
    private final CharSequence m129860g(Chat chat, ChatChatter chatChatter) {
        return ChatKBPluginUtil.f86409a.mo123236a(this.f86355h, chat, chatChatter);
    }

    /* renamed from: a */
    private final IKeyBoardPlugin m129849a(KeyBoard fVar, Chat chat) {
        PhotoKBPlugin bVar = new PhotoKBPlugin(chat.isSecret(), true, new C33514i(this));
        if (fVar != null) {
            bVar.mo147808a(new PhotoAaKBPluginCompat(fVar));
        }
        return bVar;
    }

    /* renamed from: e */
    private final IInputSupportPlugin m129858e(Chat chat, ChatChatter chatChatter) {
        return new RichTextInputExpandPlugin(m129860g(chat, chatChatter), new C33519l(this), new C33520m(this));
    }

    /* renamed from: f */
    private final IInputSupportPlugin m129859f(Chat chat, ChatChatter chatChatter) {
        PostInputSupportPlugin bVar = new PostInputSupportPlugin(m129860g(chat, chatChatter), new C33517k(this));
        bVar.mo147206a(new C33516j(this));
        return bVar;
    }

    /* renamed from: c */
    private final IInputSupportPlugin m129855c(Chat chat, ChatChatter chatChatter) {
        return new RichTextInputShrinkPlugin(m129860g(chat, chatChatter), m129854c(chat), new C33522o(this), new C33521n(this), chat.isSecret());
    }

    /* renamed from: d */
    private final TextInputSupportPlugin m129856d(Chat chat, ChatChatter chatChatter) {
        return new TextInputSupportPlugin(chat.isSecret(), m129860g(chat, chatChatter), m129854c(chat), new C33523p(this), new C33524q(this), new C33525r(this), chat.isSecret());
    }

    /* renamed from: a */
    private final void m129851a(Chat chat, PlusKBPlugin eVar) {
        if (!chat.isSuper() && !chat.isCrossWithKa() && !DesktopUtil.m144301a((Context) this.f86355h)) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            if (b.ab().mo134600a("chat.hongbao")) {
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                if (b2.at()) {
                    AbstractC36474h b3 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                    if (!b3.mo134574b()) {
                        AbstractC36474h b4 = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b4, "ChatModuleInstanceHolder.getDependency()");
                        if (b4.mo134575c()) {
                            AbstractC36474h b5 = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b5, "ChatModuleInstanceHolder.getDependency()");
                            AbstractC36450aa N = b5.mo134515N();
                            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…         .loginDependency");
                            boolean d = N.mo134401d();
                            AbstractC36474h b6 = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b6, "ChatModuleInstanceHolder.getDependency()");
                            boolean a = b6.mo134586n().mo134685a("hongbao.enable");
                            if (!d && !a) {
                                return;
                            }
                        }
                        if (chat.isCrossTenant()) {
                            AbstractC36474h b7 = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b7, "ChatModuleInstanceHolder.getDependency()");
                            if (!b7.mo134586n().mo134685a("hongbao.cross.tenant")) {
                                return;
                            }
                        }
                        if (!chat.isSecret()) {
                            if (chat.isP2PChat()) {
                                ChatChatter chatChatter = this.f86353e;
                                if (chatChatter != null) {
                                    if (chatChatter != null) {
                                        if (!chatChatter.isBot()) {
                                            String id = chatChatter.getId();
                                            AbstractC36474h b8 = C29990c.m110930b();
                                            Intrinsics.checkExpressionValueIsNotNull(b8, "ChatModuleInstanceHolder.getDependency()");
                                            AbstractC36450aa N2 = b8.mo134515N();
                                            Intrinsics.checkExpressionValueIsNotNull(N2, "ChatModuleInstanceHolder…endency().loginDependency");
                                            if (Intrinsics.areEqual(id, N2.mo134394a())) {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            eVar.mo147661b(new RedPacketPlusItem(new C33507c(this, chat)));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m129852a(PlusKBPlugin eVar, boolean z) {
        if (!z) {
            eVar.mo147661b(new EventPlusItem(new C33506b(this)));
        }
    }

    /* renamed from: b */
    public final void mo123205b(Chat chat, ChatChatter chatChatter) {
        KeyBoard fVar;
        if (!DesktopUtil.m144301a((Context) this.f86355h)) {
            if (mo123207b() && !chat.isSecret() && (fVar = this.f86349a) != null) {
                fVar.mo146806a("aa_editor", m129862s());
            }
            KeyBoard fVar2 = this.f86349a;
            if (fVar2 != null) {
                fVar2.mo146806a("face", m129848a(chat));
            }
            KeyBoard fVar3 = this.f86349a;
            if (fVar3 != null) {
                fVar3.mo146806a("plus", m129857d(chat));
            }
        }
        KeyBoard fVar4 = this.f86349a;
        if (fVar4 != null) {
            fVar4.mo146806a("at", m129853b(chat));
        }
        KeyBoard fVar5 = this.f86349a;
        if (fVar5 != null) {
            fVar5.mo146806a("photo", m129849a(fVar5, chat));
        }
        for (IKeyboardComponent.IKeyboardComponentCallbacks bVar : mo121968a()) {
            KeyBoard fVar6 = this.f86349a;
            if (fVar6 == null) {
                Intrinsics.throwNpe();
            }
            bVar.mo122066a(fVar6);
        }
        KeyBoard fVar7 = this.f86349a;
        if (fVar7 != null) {
            fVar7.mo146808a(f86347j);
        }
        if (!mo123207b() || chat.isSecret()) {
            KeyBoard fVar8 = this.f86349a;
            if (fVar8 != null) {
                fVar8.mo146804a("text", m129856d(chat, chatChatter));
            }
        } else {
            KeyBoard fVar9 = this.f86349a;
            if (fVar9 != null) {
                fVar9.mo146804a("input_richtext_shrink", m129855c(chat, chatChatter));
            }
        }
        if (!chat.isSecret()) {
            if (mo123207b()) {
                KeyBoard fVar10 = this.f86349a;
                if (fVar10 != null) {
                    fVar10.mo146804a("input_richtext_expand", m129858e(chat, chatChatter));
                }
            } else {
                KeyBoard fVar11 = this.f86349a;
                if (fVar11 != null) {
                    fVar11.mo146804a("post", m129859f(chat, chatChatter));
                }
            }
        }
        KeyBoard fVar12 = this.f86349a;
        if (fVar12 != null) {
            fVar12.mo146796a(new C33526s(this));
        }
        TransationData jVar = new TransationData();
        jVar.mo147176a("param_show_edit_cursor", false);
        if (m129861g()) {
            Looper.myQueue().addIdleHandler(new C33527t(this, jVar));
            return;
        }
        KeyBoard fVar13 = this.f86349a;
        if (fVar13 != null) {
            fVar13.mo146799a(jVar);
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        KeyBoard fVar = this.f86349a;
        if (fVar != null) {
            fVar.mo146812a(i, i2, intent);
        }
    }

    public KeyboardComponent(Activity activity, IKeyboardDependenceViewModel eVar, KeyboardComponentDependency fVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(eVar, "hostVM");
        Intrinsics.checkParameterIsNotNull(fVar, "mDependency");
        this.f86355h = activity;
        this.f86363t = eVar;
        this.f86356i = fVar;
    }
}

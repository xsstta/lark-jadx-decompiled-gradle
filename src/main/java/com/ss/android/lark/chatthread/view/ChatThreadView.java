package com.ss.android.lark.chatthread.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28531b;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i;
import com.ss.android.lark.chat.chatwindow.chat.C33086b;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33224n;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.ChatReplyDigestCreator;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyMsgDigestCreator;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.C33292b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33111af;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard.plugin.ChatKBPluginUtil;
import com.ss.android.lark.chat.chatwindow.secretchat.data.reply.SecretChatReplyDigestCreator;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.service.AbstractC34124e;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chat.service.impl.C34278w;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.utils.EditImageUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.keyboard.AtKBPluginDependency;
import com.ss.android.lark.chatbase.keyboard.FaceKBPluginDependency;
import com.ss.android.lark.chatbase.p1687a.C34416c;
import com.ss.android.lark.chatbase.view.LarkPlayModeTip;
import com.ss.android.lark.chatthread.AbstractC35135g;
import com.ss.android.lark.chatthread.C35095c;
import com.ss.android.lark.chatthread.view.callback.ChatThreadMessageCallbackHub;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36470d;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.draft.Draft;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.keyboard.IKeyBoardDependency;
import com.ss.android.lark.keyboard.IKeyBoardStatusListener;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout;
import com.ss.android.lark.keyboard.base.NestScrollFrameLayout;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputExpandPlugin;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnLifeKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.IBurnLifeDependency;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoAaKBPluginCompat;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialog;
import com.ss.android.lark.keyboard.plugin.tool.preview.FilePreviewDialogCallback;
import com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener;
import com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.widget.AutoAdjustSizeLayoutManager;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.buzz.BuzzHitPoint;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 Ü\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ü\u0002B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0002\u0010\u000bJ\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J-\u0010\u0001\u001a\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u00172\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J$\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u00172\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010\u0001H\u0016J\u0014\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\f\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020\u001a2\b\u0010\u0001\u001a\u00030\u0001H\u0003J \u0010\u0001\u001a\u00030 \u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002J\u0014\u0010£\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030¥\u0001H\u0016J#\u0010¦\u0001\u001a\u00030\u00012\u0007\u0010§\u0001\u001a\u00020\u00172\u000e\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u0001H\u0016J \u0010¨\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002J\u0014\u0010ª\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J \u0010«\u0001\u001a\u00030¬\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002J\n\u0010­\u0001\u001a\u00030®\u0001H\u0016J \u0010¯\u0001\u001a\u00030¬\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002J \u0010±\u0001\u001a\u00030¬\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002J \u0010²\u0001\u001a\u00030¬\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002J\u0014\u0010³\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J%\u0010´\u0001\u001a\u00020\u00112\u0007\u0010µ\u0001\u001a\u00020\u001a2\u0007\u0010¶\u0001\u001a\u00020\u001a2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0016J\u001f\u0010¹\u0001\u001a\u00030\u00012\u0007\u0010º\u0001\u001a\u00020\u00172\n\u0010»\u0001\u001a\u0005\u0018\u00010¼\u0001H\u0016J\n\u0010½\u0001\u001a\u00030\u0001H\u0016J \u0010¾\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0003J\u0014\u0010¿\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010À\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Á\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010Â\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010Ã\u0001\u001a\u00030\u00012\b\u0010·\u0001\u001a\u00030Ä\u0001H\u0016J\t\u0010Å\u0001\u001a\u00020\u0011H\u0016J\t\u0010Æ\u0001\u001a\u00020\u0011H\u0002J\t\u0010Ç\u0001\u001a\u00020\u0011H\u0002J\t\u0010È\u0001\u001a\u00020\u0011H\u0002J\u0014\u0010É\u0001\u001a\u00030\u00012\b\u0010·\u0001\u001a\u00030Ä\u0001H\u0002J\u0013\u0010Ê\u0001\u001a\u00020\u00112\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010Ë\u0001\u001a\u00030\u00012\u0007\u0010Ì\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010Í\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010Ï\u0001\u001a\u00020\u00112\b\u0010Ð\u0001\u001a\u00030Ñ\u0001H\u0016J\t\u0010Ò\u0001\u001a\u00020\u0011H\u0016J\u0013\u0010Ó\u0001\u001a\u00030\u00012\u0007\u0010Ô\u0001\u001a\u00020\u0017H\u0016J.\u0010Õ\u0001\u001a\u00030\u00012\u0007\u0010Ö\u0001\u001a\u00020b2\u000f\u0010×\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00012\b\u0010Ú\u0001\u001a\u00030Ù\u0001H\u0016J\u0013\u0010Û\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010Ü\u0001\u001a\u00030\u00012\u0007\u0010Ô\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010Ý\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010Þ\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u001d\u0010ß\u0001\u001a\u00030\u00012\b\u0010à\u0001\u001a\u00030á\u00012\u0007\u0010â\u0001\u001a\u00020\u0011H\u0016J\u0013\u0010ã\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010ä\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010å\u0001\u001a\u00020\u001aH\u0016J\u0013\u0010æ\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0019\u0010ç\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170Ø\u00012\u0007\u0010è\u0001\u001a\u00020\u001aH\u0016JD\u0010é\u0001\u001a\u00030\u00012\u0007\u0010ê\u0001\u001a\u00020b2\n\u0010ë\u0001\u001a\u0005\u0018\u00010ì\u00012\b\u0010í\u0001\u001a\u00030á\u00012\u0007\u0010î\u0001\u001a\u00020\u00112\u0007\u0010ï\u0001\u001a\u00020\u00112\u0007\u0010ð\u0001\u001a\u00020\u001aH\u0016J\u0013\u0010ñ\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010ò\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010ó\u0001\u001a\u00030\u00012\u0007\u0010ô\u0001\u001a\u00020\u001aH\u0016J\u0013\u0010õ\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010ö\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010÷\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010ø\u0001\u001a\u00020\u0011H\u0016J\u0013\u0010ù\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J&\u0010ú\u0001\u001a\u00030\u00012\u0007\u0010ê\u0001\u001a\u00020b2\b\u0010û\u0001\u001a\u00030á\u00012\u0007\u0010î\u0001\u001a\u00020\u0011H\u0016J\u001c\u0010ü\u0001\u001a\u00030\u00012\u0007\u0010ý\u0001\u001a\u00020\u00172\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J&\u0010þ\u0001\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010ÿ\u0001\u001a\u00020\u00172\b\u0010\u0002\u001a\u00030\u0002H\u0016J\u001a\u0010\u0002\u001a\u00030\u00012\u000e\u0010\u0002\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u001c\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010ô\u0001\u001a\u00020\u001aH\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\u0013\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0016J\u0013\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u0013\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010\u0002\u001a\u00020\u001aH\u0016J\u001c\u0010\u0002\u001a\u00030\u00012\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010\u0002\u001a\u00020\u0011H\u0016JO\u0010\u0002\u001a\u00030\u0001\"\u0019\b\u0000\u0010\u0002*\u0012\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u0002\u0018\u00010\u00022\u0007\u0010ê\u0001\u001a\u00020b2\b\u0010\u0002\u001a\u00030\u00022\u0015\u0010\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u00020\u0002H\u0016J\u0015\u0010\u0002\u001a\u00030\u00012\t\u0010Î\u0001\u001a\u0004\u0018\u00010\u0017H\u0016J\n\u0010\u0002\u001a\u00030\u0001H\u0016J(\u0010\u0002\u001a\u00030\u00012\u0007\u0010ê\u0001\u001a\u00020b2\u0013\u0010\u0002\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u00020\u0002H\u0016J/\u0010\u0002\u001a\u00030\u00012\u0007\u0010\u0002\u001a\u00020\u00172\u0007\u0010Î\u0001\u001a\u00020\u00172\u0007\u0010ÿ\u0001\u001a\u00020\u00172\b\u0010\u0002\u001a\u00030\u0002H\u0016J\u001e\u0010 \u0002\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u0002\u001a\u00020\u001aH\u0016J\u0014\u0010¡\u0002\u001a\u00030\u00012\b\u0010¢\u0002\u001a\u00030£\u0002H\u0002J\u0014\u0010¤\u0002\u001a\u00030\u00012\b\u0010¢\u0002\u001a\u00030£\u0002H\u0002J\u0011\u0010¥\u0002\u001a\u00030\u00012\u0007\u0010¦\u0002\u001a\u00020\u001aJ\u0011\u0010§\u0002\u001a\u00030\u00012\u0007\u0010¦\u0002\u001a\u00020\u001aJ\n\u0010¨\u0002\u001a\u00030\u0001H\u0016J\u0014\u0010©\u0002\u001a\u00030\u00012\b\u0010¢\u0002\u001a\u00030£\u0002H\u0002J&\u0010ª\u0002\u001a\u00030\u00012\u0007\u0010«\u0002\u001a\u00020\u00172\u0007\u0010¬\u0002\u001a\u00020\u00172\b\u0010­\u0002\u001a\u00030®\u0002H\u0002J\n\u0010¯\u0002\u001a\u00030\u0001H\u0016J\u0013\u0010°\u0002\u001a\u00030\u00012\u0007\u0010±\u0002\u001a\u00020yH\u0016J)\u0010²\u0002\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\n\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u00012\u0007\u0010³\u0002\u001a\u00020\u0011H\u0002J\n\u0010´\u0002\u001a\u00030\u0001H\u0002J\u001a\u0010µ\u0002\u001a\u00030\u00012\u000e\u0010¶\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170Ø\u0001H\u0002J\n\u0010·\u0002\u001a\u00030\u0001H\u0016J\n\u0010¸\u0002\u001a\u00030\u0001H\u0016J\b\u0010¹\u0002\u001a\u00030\u0001J\u0015\u0010º\u0002\u001a\u00030\u00012\t\u0010»\u0002\u001a\u0004\u0018\u00010\u0017H\u0016J\u0015\u0010¼\u0002\u001a\u00030\u00012\t\u0010½\u0002\u001a\u0004\u0018\u00010\u0017H\u0016J\u0014\u0010¾\u0002\u001a\u00030\u00012\b\u0010¿\u0002\u001a\u00030À\u0002H\u0016J\u0013\u0010Á\u0002\u001a\u00030\u00012\u0007\u0010Â\u0002\u001a\u00020\u0017H\u0002J\u0015\u0010Ã\u0002\u001a\u00030\u00012\t\u0010Ä\u0002\u001a\u0004\u0018\u00010\u0017H\u0016J6\u0010Å\u0002\u001a\u00030\u00012\u0007\u0010Æ\u0002\u001a\u00020\u001a2\u000f\u0010Ç\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ø\u00012\u0007\u0010È\u0002\u001a\u00020b2\u0007\u0010É\u0002\u001a\u00020\u0011H\u0016JA\u0010Ê\u0002\u001a\u00030\u00012\u0007\u0010Ë\u0002\u001a\u00020\u00172\u0007\u0010Ì\u0002\u001a\u00020\u001a2\u0007\u0010Í\u0002\u001a\u00020\u00172\u0007\u0010Î\u0002\u001a\u00020\u00112\b\u0010Ï\u0002\u001a\u00030Ð\u00022\u0007\u0010Ñ\u0002\u001a\u00020\u0011H\u0016J\u0013\u0010Ò\u0002\u001a\u00030\u00012\u0007\u0010Ó\u0002\u001a\u00020\u001aH\u0016J\u0014\u0010Ô\u0002\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001d\u0010Õ\u0002\u001a\u00030\u00012\u0007\u0010Â\u0002\u001a\u00020\u00172\b\u0010Ö\u0002\u001a\u00030×\u0002H\u0016J(\u0010Ø\u0002\u001a\u00030\u00012\u001c\u0010Ù\u0002\u001a\u0017\u0012\u0010\u0012\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u00020\u0002\u0018\u00010Ú\u0002H\u0016J\n\u0010Û\u0002\u001a\u00030\u0001H\u0016R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010&\u001a\n \u001d*\u0004\u0018\u00010'0'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u001d*\u0004\u0018\u00010000X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X.¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0010\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX.¢\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX.¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\n \u001d*\u0004\u0018\u00010O0OX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0010\u0010W\u001a\u0004\u0018\u00010XX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Y\u001a\u00020Z8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0010\u0010_\u001a\u0004\u0018\u00010`X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010a\u001a\u00020b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001e\u0010g\u001a\u00020<8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010>\"\u0004\bi\u0010@R\u0010\u0010j\u001a\u0004\u0018\u00010kX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010l\u001a\u0004\u0018\u00010XX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010m\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010,\"\u0004\bo\u0010.R\u001e\u0010p\u001a\u00020q8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u000e\u0010v\u001a\u00020wX.¢\u0006\u0002\n\u0000R\u001a\u0010x\u001a\u00020yX.¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u000e\u0010~\u001a\u00020X.¢\u0006\u0002\n\u0000¨\u0006Ý\u0002"}, d2 = {"Lcom/ss/android/lark/chatthread/view/ChatThreadView;", "Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView;", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyInterface;", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/IMenuHandlerHub;", "Lcom/ss/android/lark/chatthread/view/callback/ChatThreadMessageCallbackHub;", "mDependency", "Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView$Dependency;", "mContext", "Landroidx/fragment/app/FragmentActivity;", "mHostFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "(Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView$Dependency;Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;)V", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "clickHandlerHubChat", "Lcom/ss/android/lark/chatthread/view/ChatThreadCellClickHandler;", "isAvatarLongClick", "", "isEnableRichTextInput", "()Z", "isEnableRichTextInput$delegate", "Lkotlin/Lazy;", "mAudio2TextContent", "", "mAudio2TextId", "mAudio2TextIndex", "", "mAudioSendExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "mAutoScrollToBottomHandler", "Lcom/ss/android/lark/chatthread/view/AutoScrollHandler;", "mChatAdapter", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatAdapter;", "getMChatAdapter", "()Lcom/ss/android/lark/chat/chatwindow/chat/ChatAdapter;", "setMChatAdapter", "(Lcom/ss/android/lark/chat/chatwindow/chat/ChatAdapter;)V", "mChatDependency", "Lcom/ss/android/lark/dependency/IChatModuleDependency;", "mCompleteStatics", "mContentContainer", "Landroid/view/ViewGroup;", "getMContentContainer", "()Landroid/view/ViewGroup;", "setMContentContainer", "(Landroid/view/ViewGroup;)V", "mFeatureConfigDependency", "Lcom/ss/android/lark/dependency/IFeatureConfigDependency;", "mHasAddHistoryDecoration", "mHasBlocked", "mHasBlockedOrBeBlocked", "mHasFinalAudio2TextResp", "mIsAudio2TextTimeout", "mIsLoading", "mIsMessageEmpty", "mIsOnlyText", "mKeyBoard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "mKeyBoardContainer", "Landroid/widget/FrameLayout;", "getMKeyBoardContainer", "()Landroid/widget/FrameLayout;", "setMKeyBoardContainer", "(Landroid/widget/FrameLayout;)V", "mKeyBoardDetectorView", "Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout;", "getMKeyBoardDetectorView", "()Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout;", "setMKeyBoardDetectorView", "(Lcom/ss/android/lark/keyboard/widget/SysKeyBoardObserveFrameLayout;)V", "mKeyboardLoadingCallback", "Lcom/ss/android/lark/chat/utils/SpannableStringUtils$DrawableCallback;", "mLKUIStatus", "Lcom/larksuite/component/ui/loading/LKUIStatus;", "mLastAudio2TextContent", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "mMessageService", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "mNeedAudio2Text", "mP2pChatterDeactiviedTipTV", "Landroid/widget/TextView;", "getMP2pChatterDeactiviedTipTV", "()Landroid/widget/TextView;", "setMP2pChatterDeactiviedTipTV", "(Landroid/widget/TextView;)V", "mPostComposeController", "Lcom/ss/android/lark/ai/IComposeController;", "mRecyclerView", "Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "getMRecyclerView", "()Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "setMRecyclerView", "(Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;)V", "mRootMsgInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mSmartReplyContainer", "getMSmartReplyContainer", "setMSmartReplyContainer", "mSmartReplyController", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyController;", "mTextComposeController", "mThreadEmptyView", "getMThreadEmptyView", "setMThreadEmptyView", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "mTranslateHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/TranslateViewHandler;", "mViewDelegate", "Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView$Delegate;", "getMViewDelegate", "()Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView$Delegate;", "setMViewDelegate", "(Lcom/ss/android/lark/chatthread/IChatThreadContract$IThreadView$Delegate;)V", "replyCreator", "Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyMsgDigestCreator;", "addMessageEmptyListener", "", "addReadMessageListener", "appendEditText", "text", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "postText", "changeToReplyModeIfNeed", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "create", "destroy", "executeSerialTaskInBackground", "runnable", "Ljava/lang/Runnable;", "exitPage", "getAaStylePlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getActivity", "Landroid/app/Activity;", "getAtPlugin", "getChatChatter", "chatId", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "getFacePlugin", "getFragment", "Landroidx/fragment/app/Fragment;", "getKeyboardHindColor", "getKeyboardHint", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getMessageForSmartReply", "messageInfoIGetDataCallback", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyInterface$GetMessageForReplyCallback;", "getMessageInfoById", "id", "getMorePlugin", "p2pChatter", "getPhotoPlugin", "getPostInputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getReplyAction", "Lcom/ss/android/lark/ai/smartreply/inter/ISmartReplyInterface$ReplyAction;", "getRichTextInputExpandPlugin", "chatChatter", "getRichTextInputShrinkPlugin", "getTextInputSupportPlugin", "getVoicePlugin", "handleActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "handleSpeechRecognitionStatus", "srcId", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/im/v1/PushSpeechRecognitionStatus$Status;", "hideInitLoading", "initKeyBoard", "initSecretChatIfNeed", "initSmartChat", "initSmartCompose", "initView", "initViewData", "Lcom/ss/android/lark/chatthread/ChatThreadInitData;", "isDisabledByOtherComponent", "isNoKeyBoardHintShown", "isOtherDimmision", "isOtherDismissing", "loadInitData", "needHideKeyBoard", "onActionHandleAsyncStart", "msgId", "onAddSticker", "messageId", "onAvatarLongClick", "chatterVO", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "onBackPressed", "onCancelUploadClick", "messageCid", "onCardImageClick", "imageView", "cardImags", "", "Lcom/ss/android/lark/widget/richtext/Image;", "clickedImageItem", "onClosePreview", "onContinueUploadClick", "onDingMessage", "onDownloadFileBtnClick", "onEditClicked", "selectPhotoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "isTranslated", "onFileClick", "onFolderClick", "topicTabType", "onForward", "onGetAudioMessageCids", "startPosition", "onImageClick", "itemView", "locationInfo", "Lcom/ss/android/lark/widget/photo_picker/animation/activity_transition/ActivityTransitionLauncher$LocationInfo;", "selectPhoItem", "isMutePlay", "isClickTranslated", "fromType", "onMessageBurned", "onMessageRead", "onMultiSelect", "adapterPosition", "onOnlineReviewFileClick", "onOpenLKPFileBtnClick", "onPinMessage", "isAdd", "onPlay", "onPreMediaClick", "photoItem", "onPrepareAudio", "audioKey", "onPreviewFileInDrive", "sourceId", "sourceType", "Lcom/ss/android/lark/chat/entity/message/Message$SourceType;", "onReEdit", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "onReplyMessage", "onResume", "onRetrySendMessage", "onSaveFavorite", "onShowMoreClick", "onShowTranslatePreview", "onStop", "onStopDownloadFileBtnClick", "onThreadMergeForwardClick", "onTodoClick", "position", "onToggleAudioTextClick", "shown", "onTranslate", "M", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "translatableMessageVO", "onTranslateFeedbackClick", "onTranslateSettingClick", "onTranslateShowOriginClick", "textMessageVO", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "onUploadToDriveSpaceBtnClick", "fileKey", "onViewMessageInChat", "putCurrentPageMessagesRead", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "putCurrentPageMessagesReadActual", "refreshContentBtmMargin", "height", "refreshContentBtmMarginIfNeed", "refreshMessageList", "renderStatistic", "resetReplyDraft", "textDraftId", "postDraftId", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "scrollToBottom", "setViewDelegate", "viewDelegate", "setupKeyboardEnable", "enable", "setupRecyclerView", "showFilePreviewDialog", "filePaths", "showHistoryMsgTipView", "showInitLoading", "showPostRestrictionTip", "showTipMessageDialog", "tip", "showToast", "errorMessage", "showTranslateError", "translateState", "Lcom/ss/android/lark/dto/translate/TranslateState;", "showUnblockDialog", BottomDialog.f17198f, "showWaterMark", "displayName", "startPhotoPreview", "currentPosition", "photoItems", "view", "isMute", "updateAudioText", "uploadId", "seqId", "audio2Text", "isFinish", "diffIndex", "", "fromResp", "updateBurnLife", "burnLife", "updateChat", "updateKeyBoardHint", "response", "Lcom/ss/android/lark/contact/entity/UserRelationResponse;", "updateMessages", "messageVOList", "", "updateTranslateStatus", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatThreadView implements ISmartReplyInterface, AbstractC33120i, AbstractC35135g.AbstractC35138b, ChatThreadMessageCallbackHub {

    /* renamed from: y */
    public static boolean f90755y = true;

    /* renamed from: z */
    public static final Companion f90756z = new Companion(null);

    /* renamed from: A */
    private CommonLoadingDialog f90757A;

    /* renamed from: B */
    private IComposeController f90758B;

    /* renamed from: C */
    private IComposeController f90759C;

    /* renamed from: D */
    private AutoScrollHandler f90760D;

    /* renamed from: E */
    private ExecutorService f90761E = CoreThreadPool.getDefault().newSerialIODensityThreadPool("audio-send");

    /* renamed from: F */
    private C33111af f90762F;

    /* renamed from: G */
    private LKUIStatus f90763G;

    /* renamed from: H */
    private AbstractC33342d f90764H;

    /* renamed from: I */
    private boolean f90765I;

    /* renamed from: J */
    private boolean f90766J;

    /* renamed from: K */
    private boolean f90767K;

    /* renamed from: L */
    private boolean f90768L;

    /* renamed from: M */
    private final Lazy f90769M = LazyKt.lazy(C35141aa.INSTANCE);

    /* renamed from: N */
    private ChatThreadCellClickHandler f90770N;

    /* renamed from: a */
    public AbstractC35135g.AbstractC35138b.AbstractC35139a f90771a;

    /* renamed from: b */
    public C33086b f90772b;

    /* renamed from: c */
    public AbstractC28621d f90773c;

    /* renamed from: d */
    public final AbstractC36474h f90774d;

    /* renamed from: e */
    public final AbstractC36502p f90775e;

    /* renamed from: f */
    public boolean f90776f;

    /* renamed from: g */
    public MessageInfo f90777g;

    /* renamed from: h */
    public boolean f90778h;

    /* renamed from: i */
    public String f90779i;

    /* renamed from: j */
    public String f90780j;

    /* renamed from: k */
    public int f90781k;

    /* renamed from: l */
    public boolean f90782l;

    /* renamed from: m */
    public String f90783m;
    @BindView(8622)
    public ViewGroup mContentContainer;
    @BindView(7961)
    public FrameLayout mKeyBoardContainer;
    @BindView(7962)
    public SysKeyBoardObserveFrameLayout mKeyBoardDetectorView;
    @BindView(7396)
    public TextView mP2pChatterDeactiviedTipTV;
    @BindView(8620)
    public PointRecoderRecyclerView mRecyclerView;
    @BindView(8600)
    public View mRootView;
    @BindView(7722)
    public FrameLayout mSmartReplyContainer;
    @BindView(8621)
    public ViewGroup mThreadEmptyView;
    @BindView(9025)
    public CommonTitleBar mTitleBar;

    /* renamed from: n */
    public boolean f90784n;

    /* renamed from: o */
    public boolean f90785o;

    /* renamed from: p */
    public boolean f90786p;

    /* renamed from: q */
    public C34357v.C34361a f90787q;

    /* renamed from: r */
    public final IInnerMessageService f90788r = C32848e.m126401b();

    /* renamed from: s */
    public KeyBoard f90789s;

    /* renamed from: t */
    public boolean f90790t;

    /* renamed from: u */
    public IReplyMsgDigestCreator f90791u;

    /* renamed from: v */
    public final AbstractC35135g.AbstractC35138b.AbstractC35140b f90792v;

    /* renamed from: w */
    public final FragmentActivity f90793w;

    /* renamed from: x */
    public final C36516a<?> f90794x;

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j
    /* renamed from: a */
    public void mo121935a(int i) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q
    /* renamed from: a */
    public /* synthetic */ void mo122318a(View view, AbsMessageVO aVar) {
        AbstractC33128q.CC.$default$a(this, view, aVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o
    /* renamed from: a */
    public void mo121938a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33130s
    /* renamed from: b */
    public void mo122319b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33291a
    /* renamed from: i */
    public void mo122756i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33294d
    /* renamed from: j */
    public void mo122760j(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
    }

    /* renamed from: o */
    public final boolean mo129590o() {
        return ((Boolean) this.f90769M.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatthread/view/ChatThreadView$Companion;", "", "()V", "TAG", "", "sIsFirstStartAfterInitApp", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$setupRecyclerView$clickHandlerDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/MessageCellClickHandler$Dependency;", "getFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "getMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "messageId", "", "getOnMediaClickListener", "Lcom/ss/android/lark/chat/chatwindow/chat/message/callbacks/OnMediaClickListener;", "getP2pChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getPageType", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ag */
    public static final class C35149ag implements AbstractC33244i.AbstractC33246a {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90812a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: a */
        public ActionContext.PageType mo122586a() {
            return ActionContext.PageType.CHAT_THREAD;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: b */
        public AbstractC33302l mo122588b() {
            return this.f90812a;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: c */
        public Chatter mo122589c() {
            return this.f90812a.mo129588m().mo129544d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35149ag(ChatThreadView chatThreadView) {
            this.f90812a = chatThreadView;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.AbstractC33246a
        /* renamed from: a */
        public MessageInfo mo122587a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            return this.f90812a.mo129588m().mo129547e(str);
        }
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: d */
    public ISmartReplyInterface.ReplyAction mo101864d() {
        return ISmartReplyInterface.ReplyAction.THREAD_REPLY;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: e */
    public boolean mo101865e() {
        return this.f90765I;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35135g.AbstractC35138b.AbstractC35139a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f90771a = aVar;
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public void mo129561a(C35095c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f90777g = cVar.f90628d;
        m137254b(cVar);
        m137272w();
        Chat chat = cVar.f90625a;
        Intrinsics.checkExpressionValueIsNotNull(chat, "data.chat");
        m137253b(chat, cVar.f90627c);
        m137249A();
        Chat chat2 = cVar.f90625a;
        Intrinsics.checkExpressionValueIsNotNull(chat2, "data.chat");
        m137268j(chat2);
        Chat chat3 = cVar.f90625a;
        Intrinsics.checkExpressionValueIsNotNull(chat3, "data.chat");
        m137257c(chat3);
    }

    /* renamed from: b */
    public final void mo129582b(List<String> list) {
        Log.m165389i("ChatThreadView2", "Attempting to create RecyclerView with the files");
        new FilePreviewDialog(this.f90793w, list, new C35150ah(this)).show();
    }

    /* renamed from: a */
    public final void mo129574a(Chat chat, Chatter chatter, boolean z) {
        if (this.f90789s != null) {
            boolean z2 = z && !this.f90790t;
            if (mo129590o()) {
                KeyBoard fVar = this.f90789s;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
                }
                RichTextInputExpandPlugin cVar = (RichTextInputExpandPlugin) fVar.mo146821d("input_richtext_expand");
                if (cVar != null) {
                    cVar.mo147011b(z2);
                }
                KeyBoard fVar2 = this.f90789s;
                if (fVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
                }
                RichTextInputShrinkPlugin dVar = (RichTextInputShrinkPlugin) fVar2.mo146821d("input_richtext_shrink");
                if (dVar != null) {
                    dVar.mo147111a(mo129572a(chat, chatter), m137267i(chat));
                }
                if (dVar != null) {
                    dVar.mo147011b(z2);
                }
            } else {
                KeyBoard fVar3 = this.f90789s;
                if (fVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
                }
                PostInputSupportPlugin bVar = (PostInputSupportPlugin) fVar3.mo146821d("post");
                if (bVar != null) {
                    bVar.mo147011b(z2);
                }
                KeyBoard fVar4 = this.f90789s;
                if (fVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
                }
                TextInputSupportPlugin cVar2 = (TextInputSupportPlugin) fVar4.mo146821d("text");
                if (cVar2 != null) {
                    cVar2.mo147252a(mo129572a(chat, chatter), m137267i(chat));
                    cVar2.mo147011b(z2);
                }
            }
            KeyBoard fVar5 = this.f90789s;
            if (fVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar5.mo146810a(z2);
        }
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public void mo129560a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        mo129574a(chat, aVar.mo129544d(), chat.isAllowPost());
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: a */
    public void mo129577a(String str, int i, String str2, boolean z, int[] iArr, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "uploadId");
        Intrinsics.checkParameterIsNotNull(str2, "audio2Text");
        Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
        Log.m165379d("ChatThreadView2", "updatekeyboardText:" + i + '/' + str2 + '/' + this.f90778h + '/' + z);
        if (TextUtils.equals(str, this.f90783m)) {
            String str3 = this.f90780j;
            if (str3 == null || !Intrinsics.areEqual(str3, str2) || z) {
                if (!this.f90784n && z) {
                    this.f90784n = true;
                }
                if (this.f90778h) {
                    UICallbackExecutor.execute(new aj(this, str2, str, z2, z, iArr));
                }
            }
        }
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: a */
    public void mo129578a(String str, PushSpeechRecognitionStatus.Status status) {
        Intrinsics.checkParameterIsNotNull(str, "srcId");
        Log.m165389i("ChatThreadView2", "on push speech recognition status:" + str + '/' + status);
        if (TextUtils.equals(str, this.f90783m) && status == PushSpeechRecognitionStatus.Status.Timeout && !this.f90785o) {
            UICallbackExecutor.execute(new RunnableC35181p(this));
        }
    }

    /* renamed from: a */
    public final void mo129576a(Runnable runnable) {
        ExecutorService executorService = this.f90761E;
        if (executorService != null) {
            if (executorService == null) {
                Intrinsics.throwNpe();
            }
            if (!executorService.isShutdown()) {
                ExecutorService executorService2 = this.f90761E;
                if (executorService2 == null) {
                    Intrinsics.throwNpe();
                }
                executorService2.execute(runnable);
            }
        }
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public void mo129565a(List<ChatMessageVO<ContentVO<?>>> list) {
        if (!this.f90767K) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134577e().mo120977h();
        }
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        bVar.mo122244a(list);
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        pointRecoderRecyclerView.post(new al(this));
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public void mo129562a(TranslateState translateState) {
        Intrinsics.checkParameterIsNotNull(translateState, "translateState");
        C33111af afVar = this.f90762F;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateHandler");
        }
        afVar.mo122311a(translateState);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129563a(com.ss.android.lark.widget.richtext.RichText r5, java.lang.String r6, com.ss.android.lark.widget.richtext.RichText r7) {
        /*
            r4 = this;
            boolean r0 = r4.mo129590o()
            r1 = 1
            if (r0 == 0) goto L_0x001e
            com.ss.android.lark.chat.chatwindow.chat.message.d r0 = r4.f90764H
            if (r0 != 0) goto L_0x0010
            java.lang.String r2 = "chatContext"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0010:
            com.ss.android.lark.chat.entity.chat.Chat r0 = r0.mo122550n()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isSecret()
            if (r0 == r1) goto L_0x001e
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.ss.android.lark.keyboard.f r2 = r4.f90789s
            if (r2 != 0) goto L_0x0028
            java.lang.String r3 = "mKeyBoard"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x002d
            r5 = r7
        L_0x002d:
            r3 = 0
            r2.mo146802a(r3, r6, r5, r1)
            goto L_0x0035
        L_0x0032:
            r2.mo146802a(r5, r6, r7, r1)
        L_0x0035:
            if (r0 != 0) goto L_0x004b
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L_0x0045
            boolean r5 = com.ss.android.lark.widget.richtext.C59035h.m229210a(r7)
            if (r5 != 0) goto L_0x004b
        L_0x0045:
            java.lang.String r5 = "post"
            r2.mo146803a(r5)
            goto L_0x005b
        L_0x004b:
            com.ss.android.lark.keyboard.plugin.input.IOutInputSupport r5 = r2.mo146827h()
            android.widget.EditText r5 = r5.mo146904l()
            if (r5 == 0) goto L_0x0058
            r5.requestFocus()
        L_0x0058:
            r2.mo146829j()
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatthread.view.ChatThreadView.mo129563a(com.ss.android.lark.widget.richtext.RichText, java.lang.String, com.ss.android.lark.widget.richtext.RichText):void");
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public void mo129564a(String str, UserRelationResponse userRelationResponse) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(userRelationResponse, "response");
        boolean isHasBlock = userRelationResponse.isHasBlock();
        this.f90765I = isHasBlock;
        this.f90766J = isHasBlock || userRelationResponse.isHasBeBlocked();
        if (this.f90765I) {
            TextView textView = this.mP2pChatterDeactiviedTipTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
            }
            textView.setVisibility(0);
            TextView textView2 = this.mP2pChatterDeactiviedTipTV;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
            }
            textView2.setTextColor(UIUtils.getColor(this.f90793w, R.color.lkui_B500));
            TextView textView3 = this.mP2pChatterDeactiviedTipTV;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
            }
            textView3.setText(R.string.Lark_NewContacts_UnblockGeneral);
            TextView textView4 = this.mP2pChatterDeactiviedTipTV;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
            }
            textView4.setOnClickListener(new ak(this, str));
            KeyBoard fVar = this.f90789s;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar.mo146833n();
            mo129584d(UIHelper.getDimens(R.dimen.p2p_chatter_is_dimission_tip_height));
            return;
        }
        TextView textView5 = this.mP2pChatterDeactiviedTipTV;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
        }
        textView5.setVisibility(8);
        TextView textView6 = this.mP2pChatterDeactiviedTipTV;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
        }
        textView6.setTextColor(UIUtils.getColor(this.f90793w, R.color.lkui_N500));
        TextView textView7 = this.mP2pChatterDeactiviedTipTV;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
        }
        textView7.setOnClickListener(null);
        KeyBoard fVar2 = this.f90789s;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar2.mo146834o();
    }

    /* renamed from: a */
    public final void mo129573a(RecyclerView recyclerView) {
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        Intrinsics.checkExpressionValueIsNotNull(viewTreeObserver, "observer");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC35145ad(this, recyclerView));
        }
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: a */
    public boolean mo129580a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        AbstractC28621d dVar = this.f90773c;
        if (dVar != null) {
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            if (dVar.mo101813a(i, i2, intent)) {
                return true;
            }
        }
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        return fVar.mo146812a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo129579a(String str, String str2, IKeyBoardDependency.IResetDraftCallback bVar) {
        C34218i a = C34218i.m132791a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DraftService.getInstance()");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC35147af(a, str, str2, bVar));
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: a */
    public void mo101862a(ISmartReplyInterface.AbstractC28617a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfoIGetDataCallback");
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        if (bVar.getItemCount() != 0) {
            C33086b bVar2 = this.f90772b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
            }
            C33086b bVar3 = this.f90772b;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
            }
            ChatMessageVO b = bVar2.mo31276a(bVar3.getItemCount() - 1);
            AbstractC35135g.AbstractC35138b.AbstractC35139a aVar2 = this.f90771a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.onSuccess(false, aVar2.mo129547e(b.mo121681a()));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
    /* renamed from: a */
    public void mo121937a(PhotoItem photoItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhotoItem");
        FragmentActivity fragmentActivity = this.f90793w;
        Fragment a = this.f90792v.mo129329a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mDependency.baseFragment");
        AbstractC33342d dVar = this.f90764H;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatContext");
        }
        boolean z2 = !dVar.mo122546j();
        AbstractC33342d dVar2 = this.f90764H;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatContext");
        }
        EditImageUtils.m133181a(fragmentActivity, photoItem, a, z2, !dVar2.mo122546j());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l
    /* renamed from: a */
    public void mo121939a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        if (e != null) {
            AbstractC33342d dVar = this.f90764H;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatContext");
            }
            Chat n = dVar.mo122550n();
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC35143ac(this, e, n));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
    /* renamed from: b */
    public void mo121941b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129534a(str, z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
    /* renamed from: b */
    public void mo122759b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "audioKey");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129531a(str, str2);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
    /* renamed from: a */
    public void mo122761a(AbsMessageVO<?> aVar) {
        if (aVar != null) {
            KeyBoard fVar = this.f90789s;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            String q = fVar.mo146836q();
            KeyBoard fVar2 = this.f90789s;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            String r = fVar2.mo146837r();
            KeyBoard fVar3 = this.f90789s;
            if (fVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            boolean p = fVar3.mo146835p();
            if (aVar instanceof ChatMessageVO) {
                AbstractC35135g.AbstractC35138b.AbstractC35139a aVar2 = this.f90771a;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
                }
                aVar2.mo129521a((ChatMessageVO) aVar, p, q, r);
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g
    /* renamed from: a */
    public boolean mo122762a(C33973b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "chatterVO");
        AbstractC33342d dVar = this.f90764H;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatContext");
        }
        Chat n = dVar.mo122550n();
        if (n != null && n.isSecret()) {
            return false;
        }
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        AtKBPlugin aVar = (AtKBPlugin) fVar.mo146819c("at");
        if (aVar != null) {
            String c = bVar.mo124202c();
            Intrinsics.checkExpressionValueIsNotNull(c, "chatterVO.id");
            String g = bVar.mo124214g();
            Intrinsics.checkExpressionValueIsNotNull(g, "chatterVO.aliasNickName");
            if (aVar.mo147384a(c, g, false, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        Intrinsics.checkParameterIsNotNull(str, "fileKey");
        Intrinsics.checkParameterIsNotNull(str2, "messageId");
        Intrinsics.checkParameterIsNotNull(str3, "sourceId");
        Intrinsics.checkParameterIsNotNull(sourceType, "sourceType");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129533a(str, str2, str3, sourceType);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: a */
    public void mo122765a(String str, String str2, Message.SourceType sourceType) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "sourceId");
        Intrinsics.checkParameterIsNotNull(sourceType, "sourceType");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129519a(this.f90793w, str, str2, sourceType);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
    /* renamed from: a */
    public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "dataCallback");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129540b(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122832a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129550h(str);
    }

    @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
    /* renamed from: a */
    public void mo122830a(View view, List<? extends Image> list, Image image) {
        Intrinsics.checkParameterIsNotNull(view, "imageView");
        Intrinsics.checkParameterIsNotNull(list, "cardImags");
        Intrinsics.checkParameterIsNotNull(image, "clickedImageItem");
        new C33292b(this.f90793w, Scene.Chat).mo122757a(view, list, image);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\r2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016H\u0016J(\u0010\u0017\u001a\u00020\r2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0016J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016¨\u0006\""}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getPhotoPlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "extractVideoFrame", "Lio/reactivex/Observable;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "isEnablePostSendVideo", "", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "sendFile", "fileList", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "sendImage", "photoPaths", "isKeepOriginPic", "sendVideo", "", "uploadEncryptImage", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$h */
    public static final class C35161h implements IPhotoDependency {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90836a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122040a(ArrayList<File> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "fileList");
        }

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
        C35161h(ChatThreadView chatThreadView) {
            this.f90836a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122038a(C58557a.C58559a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            this.f90836a.f90792v.mo129333a(aVar);
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
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$h$a */
        static final class C35162a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C35162a f90837a = new C35162a();

            C35162a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(com.ss.android.lark.image.entity.Image image) {
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
        public void mo122039a(C58633e.C58634a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            this.f90836a.f90792v.mo129334a(aVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: b */
        public void mo122043b(List<IPhotoDependency.VideoInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "videoInfos");
            String q = ChatThreadView.m137251a(this.f90836a).mo146836q();
            String r = ChatThreadView.m137251a(this.f90836a).mo146837r();
            ArrayList arrayList = new ArrayList();
            for (IPhotoDependency.VideoInfo videoInfo : list) {
                Photo photo = new Photo();
                photo.setPath(videoInfo.getPath());
                photo.setMimeType(videoInfo.getMimeType());
                photo.setSize(videoInfo.getSize());
                photo.setDuration(videoInfo.getDuration());
                photo.setCompressPath(videoInfo.getCompressPath());
                arrayList.add(photo);
            }
            this.f90836a.mo101863c();
            this.f90836a.mo129588m().mo129536a(arrayList, q, r);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public void mo122041a(ArrayList<String> arrayList, boolean z) {
            Intrinsics.checkParameterIsNotNull(arrayList, "photoPaths");
            String q = ChatThreadView.m137251a(this.f90836a).mo146836q();
            String r = ChatThreadView.m137251a(this.f90836a).mo146837r();
            this.f90836a.mo101863c();
            this.f90836a.mo129588m().mo129537a(arrayList, z, q, r);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Observable<R> map = C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Chat).map(C35162a.f90837a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …en)\n                    }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getPostInputSupportPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;", "onSendInterrupted", "", "onSendPost", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "uploadEncryptImage", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "", "keepOrigin", "", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$i */
    public static final class C35163i implements OnSendPostCallback {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90838a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public void mo123219a() {
            this.f90838a.mo129591p();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35163i(ChatThreadView chatThreadView) {
            this.f90838a = chatThreadView;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "image", "Lcom/ss/android/lark/image/entity/Image;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$i$a */
        static final class C35164a<T, R> implements Function<T, R> {

            /* renamed from: a */
            public static final C35164a f90839a = new C35164a();

            C35164a() {
            }

            /* renamed from: a */
            public final IPhotoDependency.Image apply(com.ss.android.lark.image.entity.Image image) {
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
        public void mo123220a(String str, String str2, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            this.f90838a.mo129588m().mo129532a(str, str2, richText);
            this.f90838a.mo101863c();
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback
        /* renamed from: a */
        public Observable<IPhotoDependency.Image> mo123218a(List<String> list, boolean z, AbstractC25974h hVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Observable<R> map = C34278w.m132953a().mo126827a(list, z, hVar, Biz.Messenger, Scene.Chat).map(C35164a.f90839a);
            Intrinsics.checkExpressionValueIsNotNull(map, "PostService.inst()\n     …en)\n                    }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getRichTextInputExpandPlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "onSendInterrupted", "", "onSendRichText", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "triggeredBySendButton", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$j */
    public static final class C35165j implements OnSendRichTextCallBack {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90840a;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123222a() {
            this.f90840a.mo129591p();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35165j(ChatThreadView chatThreadView) {
            this.f90840a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123223a(String str, String str2, RichText richText, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            ChatThreadView.m137251a(this.f90840a);
            C54948d.m213138a(z, true, false, 4, null);
            this.f90840a.mo129588m().mo129532a(str, str2, richText);
            this.f90840a.mo101863c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getTextInputSupportPlugin$plugin$2", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;", "onSendInterrupted", "", "onSendText", "content", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$m */
    public static final class C35168m implements OnSendTextCallback {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90844a;

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122054a() {
            this.f90844a.mo129591p();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35168m(ChatThreadView chatThreadView) {
            this.f90844a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.textinput.OnSendTextCallback
        /* renamed from: a */
        public void mo122055a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            this.f90844a.mo129588m().mo129529a(str, richText);
            this.f90844a.mo101863c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getVoicePlugin$2", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IVoiceDependency;", "isAudio2TextEnabled", "", "isAudioWithTextEnabled", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$o */
    public static final class C35180o implements IVoiceDependency {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90873a;

        /* renamed from: b */
        final /* synthetic */ Chat f90874b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: c */
        public boolean mo123923c() {
            return IVoiceDependency.C41034a.m162690a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: a */
        public boolean mo123921a() {
            AbstractC36502p pVar = this.f90873a.f90775e;
            Intrinsics.checkExpressionValueIsNotNull(pVar, "mFeatureConfigDependency");
            if (!pVar.mo134684b() || this.f90874b.isSecret()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: b */
        public boolean mo123922b() {
            AbstractC36502p pVar = this.f90873a.f90775e;
            Intrinsics.checkExpressionValueIsNotNull(pVar, "mFeatureConfigDependency");
            if (!pVar.mo134684b() || this.f90874b.isSecret()) {
                return false;
            }
            return true;
        }

        C35180o(ChatThreadView chatThreadView, Chat chat) {
            this.f90873a = chatThreadView;
            this.f90874b = chat;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initSmartCompose$1", "Lcom/ss/android/lark/ai/IComposeInterface;", "getActivity", "Landroid/app/Activity;", "getEditText", "Landroid/widget/EditText;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$x */
    public static final class C35189x implements AbstractC28531b {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90885a;

        /* renamed from: b */
        final /* synthetic */ RichTextInputShrinkPlugin f90886b;

        /* renamed from: c */
        final /* synthetic */ TextInputSupportPlugin f90887c;

        @Override // com.ss.android.lark.ai.AbstractC28531b
        /* renamed from: b */
        public Activity mo101578b() {
            return this.f90885a.mo101867a();
        }

        @Override // com.ss.android.lark.ai.AbstractC28531b
        /* renamed from: a */
        public EditText mo101577a() {
            RichTextEmojiconEditText richTextEmojiconEditText = null;
            if (this.f90885a.mo129590o()) {
                RichTextInputShrinkPlugin dVar = this.f90886b;
                if (dVar != null) {
                    richTextEmojiconEditText = dVar.mo147028M();
                }
                return richTextEmojiconEditText;
            }
            TextInputSupportPlugin cVar = this.f90887c;
            if (cVar != null) {
                richTextEmojiconEditText = cVar.mo147266r();
            }
            return richTextEmojiconEditText;
        }

        C35189x(ChatThreadView chatThreadView, RichTextInputShrinkPlugin dVar, TextInputSupportPlugin cVar) {
            this.f90885a = chatThreadView;
            this.f90886b = dVar;
            this.f90887c = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initSmartCompose$2", "Lcom/ss/android/lark/ai/IComposeInterface;", "getActivity", "Landroid/app/Activity;", "getEditText", "Landroid/widget/EditText;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$y */
    public static final class C35190y implements AbstractC28531b {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90888a;

        /* renamed from: b */
        final /* synthetic */ RichTextInputExpandPlugin f90889b;

        /* renamed from: c */
        final /* synthetic */ PostInputSupportPlugin f90890c;

        @Override // com.ss.android.lark.ai.AbstractC28531b
        /* renamed from: b */
        public Activity mo101578b() {
            return this.f90888a.mo101867a();
        }

        @Override // com.ss.android.lark.ai.AbstractC28531b
        /* renamed from: a */
        public EditText mo101577a() {
            RichTextEmojiconEditText richTextEmojiconEditText = null;
            if (this.f90888a.mo129590o()) {
                RichTextInputExpandPlugin cVar = this.f90889b;
                if (cVar != null) {
                    richTextEmojiconEditText = cVar.mo147028M();
                }
                return richTextEmojiconEditText;
            }
            PostInputSupportPlugin bVar = this.f90890c;
            if (bVar != null) {
                richTextEmojiconEditText = bVar.mo147214t();
            }
            return richTextEmojiconEditText;
        }

        C35190y(ChatThreadView chatThreadView, RichTextInputExpandPlugin cVar, PostInputSupportPlugin bVar) {
            this.f90888a = chatThreadView;
            this.f90889b = cVar;
            this.f90890c = bVar;
        }
    }

    /* renamed from: x */
    private final IKeyBoardPlugin m137273x() {
        return new AaStyleKBPlugin();
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28618a
    /* renamed from: b */
    public Fragment mo101868b() {
        return this.f90792v.mo129329a();
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: i */
    public void mo129570i() {
        this.f90792v.mo129340e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    static final class al implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90825a;

        al(ChatThreadView chatThreadView) {
            this.f90825a = chatThreadView;
        }

        public final void run() {
            ChatThreadView chatThreadView = this.f90825a;
            chatThreadView.mo129573a(chatThreadView.mo129586k());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getFacePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;", "getBaseFragment", "Landroidx/fragment/app/Fragment;", "onSendStickerMsg", "", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$f */
    public static final class C35159f implements FacePluginDependency {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90834a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public Fragment mo122020a() {
            Fragment a = this.f90834a.f90792v.mo129329a();
            Intrinsics.checkExpressionValueIsNotNull(a, "mDependency.baseFragment");
            return a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35159f(ChatThreadView chatThreadView) {
            this.f90834a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public void mo122021a(C40964l lVar) {
            IStickerDependency.StickerFileInfo a = C33224n.m128431a(lVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "StickerFileInfoConverter…         stickerFileInfo)");
            this.f90834a.mo129588m().mo129525a(a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getFacePlugin$2", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePluginDependency;", "getBaseFragment", "Landroidx/fragment/app/Fragment;", "onSendStickerMsg", "", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$g */
    public static final class C35160g implements FacePluginDependency {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90835a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public Fragment mo122020a() {
            Fragment a = this.f90835a.f90792v.mo129329a();
            Intrinsics.checkExpressionValueIsNotNull(a, "mDependency.baseFragment");
            return a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35160g(ChatThreadView chatThreadView) {
            this.f90835a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.FacePluginDependency
        /* renamed from: a */
        public void mo122021a(C40964l lVar) {
            IStickerDependency.StickerFileInfo a = C33224n.m128431a(lVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "StickerFileInfoConverter…         stickerFileInfo)");
            this.f90835a.mo129588m().mo129525a(a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\bH\u0016J(\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J*\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001a\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020\u0005H\u0002J\u0010\u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0003H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getVoicePlugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IRecordListener;", "audio2TextError", "", "isAudio2Text", "", "localCid", "localDuration", "", "localFileName", "recordingAudioMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "onAudio2Text", "", "onAudioRecorded", "strFileName", "cid", "duration", "needRecognized", "onCancelRecord", "onClearResult", "onPanelHeightChanged", "height", "onPrepareForRecord", "onlyText", "onSendAudio", "onSendAudioText", "content", "onSendText", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "onStartRecord", "onUpdateAudio", "buffer", "Ljava/nio/ByteBuffer;", "volume", "", "updateFinishState", "uploadId", "autoStop", "updateStartState", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n */
    public static final class C35169n implements IRecordListener {

        /* renamed from: a */
        public Message f90845a;

        /* renamed from: b */
        public String f90846b;

        /* renamed from: c */
        public String f90847c;

        /* renamed from: d */
        public int f90848d;

        /* renamed from: e */
        public String f90849e;

        /* renamed from: f */
        public boolean f90850f;

        /* renamed from: g */
        final /* synthetic */ ChatThreadView f90851g;

        /* renamed from: h */
        final /* synthetic */ Chat f90852h;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123901a() {
            MessageHitPoint.f135779d.mo187562k(this.f90851g.f90783m);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123908b() {
            this.f90851g.mo129576a(new RunnableC35174d(this));
            MessageHitPoint.f135779d.mo187530a("audio_and_text", this.f90848d, TextUtils.isEmpty(this.f90851g.f90780j));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: c */
        public void mo123911c() {
            this.f90851g.f90778h = true;
            this.f90850f = true;
            this.f90851g.mo129576a(new RunnableC35170a(this));
            m137396a(this.f90851g.f90783m, this.f90851g.f90785o);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$a */
        static final class RunnableC35170a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90853a;

            RunnableC35170a(C35169n nVar) {
                this.f90853a = nVar;
            }

            public final void run() {
                if (this.f90853a.f90845a == null) {
                    Log.m165397w("ChatThreadView2", "onAudio2Text recordingAudioMessage is null");
                    return;
                }
                Message message = this.f90853a.f90845a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent()");
                this.f90853a.f90851g.mo129588m().mo129516a(this.f90853a.f90845a, ((AudioContent) content).getLocalSequenceId(), ByteBuffer.wrap(new byte[0]), true, true, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$f */
        static final class RunnableC35176f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90865a;

            RunnableC35176f(C35169n nVar) {
                this.f90865a = nVar;
            }

            public final void run() {
                if (this.f90865a.f90845a == null || this.f90865a.f90851g.f90783m == null) {
                    Log.m165397w("ChatThreadView2", "onStartRecord recordingAudioMessage or mAudio2TextId is null");
                    return;
                }
                C35169n nVar = this.f90865a;
                String str = nVar.f90851g.f90783m;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                nVar.mo129613c(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$d */
        static final class RunnableC35174d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90862a;

            RunnableC35174d(C35169n nVar) {
                this.f90862a = nVar;
            }

            public final void run() {
                if (this.f90862a.f90845a == null || this.f90862a.f90846b == null) {
                    Log.m165397w("ChatThreadView2", "onSendAudio recordingAudioMessage or localFileName is null");
                    return;
                }
                Message message = this.f90862a.f90845a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent()");
                ((AudioContent) content).setUploadId(null);
                this.f90862a.f90851g.mo129588m().mo129522a(this.f90862a.f90845a, this.f90862a.f90846b, this.f90862a.f90847c, this.f90862a.f90848d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$e */
        static final class RunnableC35175e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90863a;

            /* renamed from: b */
            final /* synthetic */ String f90864b;

            RunnableC35175e(C35169n nVar, String str) {
                this.f90863a = nVar;
                this.f90864b = str;
            }

            public final void run() {
                if (this.f90863a.f90845a == null || this.f90863a.f90846b == null) {
                    Log.m165397w("ChatThreadView2", "onSendAudioText recordingAudioMessage or localFileName is null");
                    return;
                }
                Message message = this.f90863a.f90845a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                ((AudioContent) content).setUploadId(null);
                AbstractC35135g.AbstractC35138b.AbstractC35139a m = this.f90863a.f90851g.mo129588m();
                Message message2 = this.f90863a.f90845a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                m.mo129523a(message2, this.f90864b, this.f90863a.f90846b, this.f90863a.f90847c, this.f90863a.f90848d);
                if (!TextUtils.equals(this.f90864b, this.f90863a.f90851g.f90780j)) {
                    MessageHitPoint.f135779d.mo187563l(this.f90863a.f90851g.f90783m);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$g */
        public static final class RunnableC35177g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90866a;

            /* renamed from: b */
            final /* synthetic */ ByteBuffer f90867b;

            /* renamed from: c */
            final /* synthetic */ boolean f90868c;

            RunnableC35177g(C35169n nVar, ByteBuffer byteBuffer, boolean z) {
                this.f90866a = nVar;
                this.f90867b = byteBuffer;
                this.f90868c = z;
            }

            public final void run() {
                if (this.f90866a.f90845a == null || this.f90867b == null) {
                    Log.m165383e("ChatThreadView2", "recordingAudioMessage or buffer is null");
                    return;
                }
                Message message = this.f90866a.f90845a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent()");
                AudioContent audioContent = (AudioContent) content;
                if (TextUtils.isEmpty(audioContent.getUploadId())) {
                    Log.m165383e("ChatThreadView2", "UploadId is empty");
                } else {
                    this.f90866a.f90851g.mo129588m().mo129516a(this.f90866a.f90845a, audioContent.getLocalSequenceId(), this.f90867b, this.f90868c, false, new IGetDataCallback<String>(this) {
                        /* class com.ss.android.lark.chatthread.view.ChatThreadView.C35169n.RunnableC35177g.C351781 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC35177g f90869a;

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            Intrinsics.checkParameterIsNotNull(str, "s");
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f90869a = r1;
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            this.f90869a.f90866a.f90849e = errorResult.getDisplayMsg();
                            Log.m165397w("ChatThreadView2", "onSendAudioData onError:" + this.f90869a.f90866a.f90849e);
                        }
                    });
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$b */
        static final class RunnableC35171b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90854a;

            /* renamed from: b */
            final /* synthetic */ boolean f90855b;

            /* renamed from: c */
            final /* synthetic */ int f90856c;

            /* renamed from: d */
            final /* synthetic */ String f90857d;

            /* renamed from: e */
            final /* synthetic */ String f90858e;

            RunnableC35171b(C35169n nVar, boolean z, int i, String str, String str2) {
                this.f90854a = nVar;
                this.f90855b = z;
                this.f90856c = i;
                this.f90857d = str;
                this.f90858e = str2;
            }

            public final void run() {
                if (this.f90854a.f90845a == null) {
                    Log.m165397w("ChatThreadView2", "onSendAudioMessage recordingAudioMessage is null");
                    return;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                Message message = this.f90854a.f90845a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent()");
                this.f90854a.f90851g.mo129588m().mo129516a(this.f90854a.f90845a, ((AudioContent) content).getLocalSequenceId(), ByteBuffer.wrap(new byte[0]), this.f90855b, true, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.chatthread.view.ChatThreadView.C35169n.RunnableC35171b.C351721 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
                        countDownLatch.countDown();
                        Log.m165379d("ChatThreadView2", "onSendAudioData last onError:");
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        Intrinsics.checkParameterIsNotNull(str, "s");
                        countDownLatch.countDown();
                        Log.m165379d("ChatThreadView2", "onSendAudioData last onSuccess:" + str);
                    }
                });
                try {
                    countDownLatch.await(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.m165379d("ChatThreadView2", "countdown:" + countDownLatch);
                if (!this.f90855b) {
                    MessageHitPoint.f135779d.mo187530a("audio_only", this.f90856c, false);
                    this.f90854a.f90851g.mo129588m().mo129522a(this.f90854a.f90845a, this.f90857d, this.f90858e, this.f90856c);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$c */
        static final class RunnableC35173c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90860a;

            /* renamed from: b */
            final /* synthetic */ String f90861b;

            RunnableC35173c(C35169n nVar, String str) {
                this.f90860a = nVar;
                this.f90861b = str;
            }

            public final void run() {
                String str;
                if (this.f90860a.f90845a == null) {
                    Log.m165397w("ChatThreadView2", "onPrepareForRecord recordingAudioMessage is null");
                    return;
                }
                if (!this.f90860a.f90851g.f90778h || this.f90860a.f90851g.f90783m == null) {
                    IInnerMessageService iInnerMessageService = this.f90860a.f90851g.f90788r;
                    Message message = this.f90860a.f90845a;
                    if (message == null) {
                        Intrinsics.throwNpe();
                    }
                    str = iInnerMessageService.mo121249a(message.getChatId(), "", this.f90861b, C41039c.m162705a());
                    Intrinsics.checkExpressionValueIsNotNull(str, "mMessageService.getAudio…etAudioRecognizeLocale())");
                } else {
                    str = this.f90860a.f90851g.f90783m;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    Message message2 = this.f90860a.f90845a;
                    if (message2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Content content = message2.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent()");
                    AudioContent audioContent = (AudioContent) content;
                    audioContent.setUploadId(str);
                    audioContent.setSequenceId(0);
                    if (this.f90860a.f90851g.f90778h) {
                        this.f90860a.f90851g.mo129588m().mo129516a(this.f90860a.f90845a, audioContent.getLocalSequenceId(), ByteBuffer.wrap(new byte[0]), true, false, null);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$n$h */
        public static final class RunnableC35179h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35169n f90870a;

            /* renamed from: b */
            final /* synthetic */ String f90871b;

            /* renamed from: c */
            final /* synthetic */ boolean f90872c;

            RunnableC35179h(C35169n nVar, String str, boolean z) {
                this.f90870a = nVar;
                this.f90871b = str;
                this.f90872c = z;
            }

            public final void run() {
                Log.m165379d("ChatThreadView2", "updateFinishState:" + this.f90870a.f90851g.f90780j + '/' + this.f90870a.f90851g.f90783m + '/' + this.f90871b);
                ChatThreadView chatThreadView = this.f90870a.f90851g;
                String str = this.f90871b;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                String str2 = this.f90870a.f90851g.f90780j;
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                chatThreadView.mo129577a(str, 0, str2, true, new int[0], false);
                if (!TextUtils.isEmpty(this.f90870a.f90849e)) {
                    Log.m165397w("ChatThreadView2", "updateFinishState:" + this.f90871b + '/' + this.f90870a.f90849e);
                    MessageHitPoint.Companion aVar = MessageHitPoint.f135779d;
                    boolean z = this.f90870a.f90850f;
                    String str3 = this.f90870a.f90849e;
                    if (str3 == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.mo187538a(z, str3);
                    if (this.f90870a.f90850f && !this.f90872c) {
                        C35212a.m137531a(this.f90870a.f90851g.f90793w, "", UIUtils.getString(this.f90870a.f90851g.f90793w, R.string.Lark_Chat_AudioConvertedFailedOnlySendText));
                    }
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123902a(int i) {
            if (!ChatThreadView.m137251a(this.f90851g).mo146818b("post")) {
                this.f90851g.mo129584d(i);
                this.f90851g.mo101863c();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123909b(String str) {
            if (this.f90845a != null) {
                AbstractC35135g.AbstractC35138b.AbstractC35139a m = this.f90851g.mo129588m();
                Message message = this.f90845a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                m.mo129526a(message.getId());
            }
        }

        /* renamed from: c */
        public final void mo129613c(String str) {
            this.f90851g.f90784n = false;
            ChatThreadView chatThreadView = this.f90851g;
            String str2 = chatThreadView.f90783m;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            chatThreadView.mo129577a(str2, 0, "", false, new int[0], false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123903a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f90851g.mo129576a(new RunnableC35175e(this, str));
        }

        C35169n(ChatThreadView chatThreadView, Chat chat) {
            this.f90851g = chatThreadView;
            this.f90852h = chat;
        }

        /* renamed from: a */
        private final void m137396a(String str, boolean z) {
            long j;
            RunnableC35179h hVar = new RunnableC35179h(this, str, z);
            if (z) {
                j = 0;
            } else {
                j = VoiceKBPlugin.f104495h.mo147973a(this.f90851g.f90784n);
            }
            UICallbackExecutor.executeDelayed(hVar, j);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123904a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            this.f90851g.mo129588m().mo129529a(str, richText);
            this.f90851g.mo101863c();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123910b(String str, String str2, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            String q = ChatThreadView.m137251a(this.f90851g).mo146836q();
            String r = ChatThreadView.m137251a(this.f90851g).mo146837r();
            this.f90851g.f90778h = z;
            this.f90851g.f90782l = false;
            String str3 = null;
            this.f90851g.f90779i = str3;
            this.f90851g.f90780j = str3;
            this.f90851g.f90786p = z2;
            this.f90849e = str3;
            this.f90850f = false;
            this.f90851g.f90785o = false;
            Log.m165379d("ChatThreadView2", "onPrepareForRecord:" + str + '/' + str2);
            this.f90845a = this.f90851g.mo129588m().mo129517a(q, r, str, str2);
            if (!this.f90852h.isSecret()) {
                if (this.f90851g.f90778h) {
                    this.f90851g.f90783m = UUID.randomUUID().toString();
                    MessageHitPoint.f135779d.mo187552e(this.f90851g.f90783m);
                }
                this.f90851g.mo129576a(new RunnableC35173c(this, str));
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123905a(String str, String str2, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            Log.m165379d("ChatThreadView2", "onAudioRecorded:" + str + '/' + str2 + '/' + i + '/' + z);
            if (this.f90845a == null) {
                Log.m165397w("ChatThreadView2", "onAudioRecorded recordingAudioMessage is null");
            } else if (this.f90852h.isSecret()) {
                this.f90851g.mo129588m().mo129522a(this.f90845a, str, str2, i);
                this.f90851g.mo101863c();
            } else {
                this.f90851g.f90778h = z;
                if (z) {
                    this.f90846b = str;
                    this.f90847c = str2;
                    this.f90848d = i;
                    if (this.f90851g.f90783m != null) {
                        m137396a(this.f90851g.f90783m, false);
                        MessageHitPoint.f135779d.mo187556g(this.f90851g.f90783m);
                    }
                }
                this.f90851g.mo129576a(new RunnableC35171b(this, z, i, str, str2));
                this.f90851g.mo101863c();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123906a(String str, String str2, boolean z, boolean z2) {
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            Log.m165379d("ChatThreadView2", "onStartRecord:" + str + '/' + str2);
            if (this.f90851g.f90778h && (str3 = this.f90851g.f90783m) != null && (!StringsKt.isBlank(str3))) {
                MessageHitPoint.f135779d.mo187552e(this.f90851g.f90783m);
                this.f90851g.mo129576a(new RunnableC35176f(this));
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123907a(ByteBuffer byteBuffer, int i, double d, boolean z) {
            if (!this.f90852h.isSecret()) {
                this.f90851g.f90778h = z;
                this.f90851g.mo129576a(new RunnableC35177g(this, byteBuffer, z));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initSmartChat$1", "Lcom/ss/android/lark/keyboard/base/KeyBoardObserveFrameLayout$IOnKeyBoardListener;", "onKeyBoardHide", "", "onKeyBoardShow", "heightDiff", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$v */
    public static final class C35187v implements KeyBoardObserveFrameLayout.IOnKeyBoardListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90883a;

        @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
        /* renamed from: a */
        public void mo129626a() {
            AbstractC28621d dVar = this.f90883a.f90773c;
            if (dVar != null) {
                dVar.mo101542b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35187v(ChatThreadView chatThreadView) {
            this.f90883a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.base.KeyBoardObserveFrameLayout.IOnKeyBoardListener
        /* renamed from: a */
        public void mo129627a(int i) {
            int f = ChatThreadView.m137251a(this.f90883a).mo146825f();
            AbstractC28621d dVar = this.f90883a.f90773c;
            if (dVar != null) {
                dVar.mo101540a(f);
            }
        }
    }

    /* renamed from: u */
    private final boolean m137270u() {
        if (m137269t() || this.f90765I) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: f */
    public void mo129567f() {
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar.mo146839t();
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: g */
    public void mo129568g() {
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        bVar.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: h */
    public void mo129569h() {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        mo129581b(pointRecoderRecyclerView);
    }

    /* renamed from: k */
    public final PointRecoderRecyclerView mo129586k() {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        return pointRecoderRecyclerView;
    }

    /* renamed from: l */
    public final ViewGroup mo129587l() {
        ViewGroup viewGroup = this.mThreadEmptyView;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThreadEmptyView");
        }
        return viewGroup;
    }

    /* renamed from: m */
    public final AbstractC35135g.AbstractC35138b.AbstractC35139a mo129588m() {
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: n */
    public final C33086b mo129589n() {
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: q */
    public void mo129592q() {
        LKUIStatus lKUIStatus = this.f90763G;
        if (lKUIStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLKUIStatus");
        }
        lKUIStatus.mo89838a(300);
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: r */
    public void mo129594r() {
        LKUIStatus lKUIStatus = this.f90763G;
        if (lKUIStatus == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLKUIStatus");
        }
        lKUIStatus.mo89849f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$addReadMessageListener$2", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onItemRangeInserted", "", "positionStart", "", "itemCount", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$d */
    public static final class C35155d extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90828a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$d$a */
        static final class RunnableC35156a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35155d f90829a;

            RunnableC35156a(C35155d dVar) {
                this.f90829a = dVar;
            }

            public final void run() {
                this.f90829a.f90828a.mo129573a(this.f90829a.f90828a.mo129586k());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35155d(ChatThreadView chatThreadView) {
            this.f90828a = chatThreadView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            this.f90828a.mo129586k().post(new RunnableC35156a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$aa */
    static final class C35141aa extends Lambda implements Function0<Boolean> {
        public static final C35141aa INSTANCE = new C35141aa();

        C35141aa() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ac */
    static final class RunnableC35143ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90796a;

        /* renamed from: b */
        final /* synthetic */ MessageInfo f90797b;

        /* renamed from: c */
        final /* synthetic */ Chat f90798c;

        RunnableC35143ac(ChatThreadView chatThreadView, MessageInfo messageInfo, Chat chat) {
            this.f90796a = chatThreadView;
            this.f90797b = messageInfo;
            this.f90798c = chat;
        }

        public final void run() {
            final Chatter a = this.f90796a.mo129588m().mo129515a();
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.chatthread.view.ChatThreadView.RunnableC35143ac.RunnableC351441 */

                /* renamed from: a */
                final /* synthetic */ RunnableC35143ac f90799a;

                {
                    this.f90799a = r1;
                }

                public final void run() {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    b.mo134509H().mo134431a(this.f90799a.f90796a.f90793w, this.f90799a.f90797b, this.f90799a.f90798c, a, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$putCurrentPageMessagesRead$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ad */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC35145ad implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90801a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f90802b;

        public void onGlobalLayout() {
            this.f90802b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f90801a.mo129581b(this.f90802b);
            this.f90801a.mo129583c(this.f90802b);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC35145ad(ChatThreadView chatThreadView, RecyclerView recyclerView) {
            this.f90801a = chatThreadView;
            this.f90802b = recyclerView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getRichTextInputShrinkPlugin$onSendPostCallback$1", "Lcom/ss/android/lark/keyboard/plugin/input/richtextinput/OnSendRichTextCallBack;", "onSendInterrupted", "", "onSendRichText", "title", "", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "triggeredBySendButton", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$k */
    public static final class C35166k implements OnSendRichTextCallBack {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90841a;

        /* renamed from: b */
        final /* synthetic */ Chat f90842b;

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123222a() {
            LKUIToast.show(this.f90841a.f90793w, UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", this.f90842b.getName()));
        }

        C35166k(ChatThreadView chatThreadView, Chat chat) {
            this.f90841a = chatThreadView;
            this.f90842b = chat;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.richtextinput.OnSendRichTextCallBack
        /* renamed from: a */
        public void mo123223a(String str, String str2, RichText richText, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(str2, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            ChatThreadView.m137251a(this.f90841a);
            C54948d.m213138a(z, false, false, 4, null);
            this.f90841a.mo129588m().mo129532a(str, str2, richText);
            this.f90841a.mo101863c();
        }
    }

    /* renamed from: B */
    private final boolean m137250B() {
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        Chatter d = aVar.mo129544d();
        if (d == null || !d.isDimission()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private final boolean m137269t() {
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        Chatter d = aVar.mo129544d();
        if (d == null || !d.isDimission()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private final void m137275z() {
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        bVar.registerAdapterDataObserver(new C35153b(this));
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.AbstractC28618a, com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public Activity mo101867a() {
        Activity b = this.f90792v.mo129337b();
        Intrinsics.checkExpressionValueIsNotNull(b, "mDependency.activity");
        return b;
    }

    @Override // com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface
    /* renamed from: c */
    public void mo101863c() {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        pointRecoderRecyclerView.scrollToPosition(bVar.getItemCount() - 1);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f90792v.mo129332a(this);
        this.f90757A = new CommonLoadingDialog();
        m137271v();
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: j */
    public void mo129571j() {
        if (!this.f90768L) {
            PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
            if (pointRecoderRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            }
            pointRecoderRecyclerView.addItemDecoration(new C35203f());
            this.f90768L = true;
        }
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: s */
    public boolean mo129595s() {
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        return fVar.mo146824e();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$af */
    public static final class RunnableC35147af implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC34124e f90804a;

        /* renamed from: b */
        final /* synthetic */ String f90805b;

        /* renamed from: c */
        final /* synthetic */ String f90806c;

        /* renamed from: d */
        final /* synthetic */ IKeyBoardDependency.IResetDraftCallback f90807d;

        RunnableC35147af(AbstractC34124e eVar, String str, String str2, IKeyBoardDependency.IResetDraftCallback bVar) {
            this.f90804a = eVar;
            this.f90805b = str;
            this.f90806c = str2;
            this.f90807d = bVar;
        }

        public final void run() {
            final RichText richText;
            final String str;
            final RichText richText2;
            Draft c = this.f90804a.mo126557c(this.f90805b);
            if (c == null) {
                richText = C59029c.m229155a();
            } else {
                richText = c.contentRichText;
            }
            Draft c2 = this.f90804a.mo126557c(this.f90806c);
            if (c2 == null) {
                str = "";
            } else {
                str = c2.title;
            }
            if (c2 == null) {
                richText2 = C59029c.m229155a();
            } else {
                richText2 = c2.postRichText;
            }
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.chatthread.view.ChatThreadView.RunnableC35147af.RunnableC351481 */

                /* renamed from: a */
                final /* synthetic */ RunnableC35147af f90808a;

                {
                    this.f90808a = r1;
                }

                public final void run() {
                    IKeyBoardDependency.IResetDraftCallback.C40677a.m160773a(this.f90808a.f90807d, richText, str, richText2, null, 8, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$showUnblockDialog$1", "Lcom/ss/android/lark/chatwindow/ActionUtils$OnDialogClickListener;", "onCancel", "", "onConfirm", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ai */
    public static final class C35151ai implements C35212a.AbstractC35215a {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90814a;

        /* renamed from: b */
        final /* synthetic */ String f90815b;

        @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
        /* renamed from: b */
        public void mo122373b() {
        }

        @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
        /* renamed from: a */
        public void mo122372a() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.ah().mo134652e(this.f90815b, new UIGetDataCallback(new C35152a(this)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$showUnblockDialog$1$onConfirm$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ai$a */
        public static final class C35152a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C35151ai f90816a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35152a(C35151ai aiVar) {
                this.f90816a = aiVar;
            }

            /* renamed from: a */
            public void mo129605a(boolean z) {
                C35212a.m137534a((Context) this.f90816a.f90814a.f90793w, true);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo129605a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                C35212a.m137534a((Context) this.f90816a.f90814a.f90793w, false);
            }
        }

        C35151ai(ChatThreadView chatThreadView, String str) {
            this.f90814a = chatThreadView;
            this.f90815b = str;
        }
    }

    /* renamed from: y */
    private final void m137274y() {
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        pointRecoderRecyclerView.addOnScrollListener(new C35154c(this));
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        bVar.registerAdapterDataObserver(new C35155d(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        f90755y = false;
        AbstractC28621d dVar = this.f90773c;
        if (dVar != null) {
            dVar.mo101816c();
        }
        IComposeController iComposeController = this.f90758B;
        if (iComposeController != null) {
            iComposeController.mo101539a();
        }
        IComposeController iComposeController2 = this.f90759C;
        if (iComposeController2 != null) {
            iComposeController2.mo101539a();
        }
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar.mo146838s();
        AutoScrollHandler aVar = this.f90760D;
        if (aVar != null) {
            aVar.mo129629a();
        }
        C33111af afVar = this.f90762F;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateHandler");
        }
        afVar.mo122308a();
    }

    /* renamed from: p */
    public final void mo129591p() {
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        LKUIToast.show(mo101867a(), UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", aVar.mo129546e().getName()));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ae */
    public static final class RunnableC35146ae implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90803a;

        RunnableC35146ae(ChatThreadView chatThreadView) {
            this.f90803a = chatThreadView;
        }

        public final void run() {
            boolean z;
            int i;
            Chat e = this.f90803a.mo129588m().mo129546e();
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC32812c e2 = b.mo134577e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "ChatModuleInstanceHolder…cy().perfEnterChatMonitor");
            e2.mo120979j();
            FragmentActivity fragmentActivity = this.f90803a.f90793w;
            String str = ChatBundle.ChatType.CHAT_DETAIL.value;
            if (e != null) {
                z = e.isCrossTenant();
            } else {
                z = false;
            }
            if (e != null) {
                i = e.getUserCount();
            } else {
                i = 0;
            }
            e2.mo120956a(fragmentActivity, str, z, i, ChatThreadView.f90755y);
            ChatThreadView.f90755y = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$addMessageEmptyListener$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeInserted", "positionStart", "", "itemCount", "onItemRangeRemoved", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$b */
    public static final class C35153b extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90826a;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            boolean z;
            super.onChanged();
            int i = 0;
            if (this.f90826a.mo129589n().getItemCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            Log.m165379d("ChatThreadView2", "onChanged:" + z + "/" + this.f90826a.mo129589n().getItemCount());
            ViewGroup l = this.f90826a.mo129587l();
            if (!z) {
                i = 8;
            }
            l.setVisibility(i);
            this.f90826a.f90790t = z;
            ChatThreadView chatThreadView = this.f90826a;
            Chat e = chatThreadView.mo129588m().mo129546e();
            Intrinsics.checkExpressionValueIsNotNull(e, "mViewDelegate.chat");
            chatThreadView.mo129574a(e, this.f90826a.mo129588m().mo129544d(), true ^ this.f90826a.f90790t);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35153b(ChatThreadView chatThreadView) {
            this.f90826a = chatThreadView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            onChanged();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$e */
    public static final class RunnableC35157e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90830a;

        RunnableC35157e(ChatThreadView chatThreadView) {
            this.f90830a = chatThreadView;
        }

        public final void run() {
            MessageInfo messageInfo = this.f90830a.f90777g;
            if (messageInfo == null) {
                Intrinsics.throwNpe();
            }
            final CharSequence a = ChatThreadView.m137252b(this.f90830a).mo122508a(messageInfo.getMessageSender(), this.f90830a.f90777g, true);
            MessageInfo messageInfo2 = this.f90830a.f90777g;
            if (messageInfo2 == null) {
                Intrinsics.throwNpe();
            }
            Message message = messageInfo2.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "mRootMsgInfo!!.getMessage()");
            final String id = message.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "mRootMsgInfo!!.getMessage().id");
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.chatthread.view.ChatThreadView.RunnableC35157e.RunnableC351581 */

                /* renamed from: a */
                final /* synthetic */ RunnableC35157e f90831a;

                {
                    this.f90831a = r1;
                }

                public final void run() {
                    KeyBoard a = ChatThreadView.m137251a(this.f90831a.f90830a);
                    String str = id;
                    a.mo146797a(new KeyBoard.ReplyInfo(str, str, a, null, null, null));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$p */
    static final class RunnableC35181p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90875a;

        RunnableC35181p(ChatThreadView chatThreadView) {
            this.f90875a = chatThreadView;
        }

        public final void run() {
            VoiceKBPlugin dVar = (VoiceKBPlugin) ChatThreadView.m137251a(this.f90875a).mo146819c("voice");
            SpannableStringBuilder a = C34357v.m133266a(this.f90875a.f90793w, UIHelper.getString(R.string.Lark_Chat_SendAudioAndTextPoorNetworkPlaceholder), this.f90875a.f90787q);
            a.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f90875a.f90793w, R.color.lkui_N500)), 0, a.length(), 33);
            if (dVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "spannable");
                dVar.mo147964a(a);
            }
            this.f90875a.f90785o = true;
        }
    }

    /* renamed from: A */
    private final void m137249A() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36470d aj2 = b.aj();
        Intrinsics.checkExpressionValueIsNotNull(aj2, "ChatModuleInstanceHolder…Dependency().aiDependency");
        if (aj2.mo134486a()) {
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36470d aj3 = b2.aj();
            AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            Chat e = aVar.mo129546e();
            FrameLayout frameLayout = this.mSmartReplyContainer;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSmartReplyContainer");
            }
            FrameLayout frameLayout2 = frameLayout;
            KeyBoard fVar = this.f90789s;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            this.f90773c = aj3.mo134485a(e, frameLayout2, fVar, this);
            SysKeyBoardObserveFrameLayout sysKeyBoardObserveFrameLayout = this.mKeyBoardDetectorView;
            if (sysKeyBoardObserveFrameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardDetectorView");
            }
            sysKeyBoardObserveFrameLayout.mo148228a(new C35187v(this));
            C33086b bVar = this.f90772b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
            }
            bVar.registerAdapterDataObserver(new C35188w(this));
        }
    }

    /* renamed from: v */
    private final void m137271v() {
        this.f90757A = new CommonLoadingDialog();
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setTitle(R.string.Lark_Legacy_Thread);
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        TextView centerText = commonTitleBar2.getCenterText();
        Intrinsics.checkExpressionValueIsNotNull(centerText, "mTitleBar.centerText");
        TextPaint paint = centerText.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "mTitleBar.centerText.paint");
        paint.setFakeBoldText(true);
        CommonTitleBar commonTitleBar3 = this.mTitleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC35191z(this));
        this.f90762F = new C33111af(this.f90793w);
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(this.f90793w);
        stableLinearLayoutManager.setOrientation(1);
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        pointRecoderRecyclerView.setLayoutManager(stableLinearLayoutManager);
        RecyclerView.ItemAnimator itemAnimator = pointRecoderRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            pointRecoderRecyclerView.setOverScrollMode(2);
            ViewGroup viewGroup = this.mContentContainer;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentContainer");
            }
            LKUIStatus a = new LKUIStatus.C25680a(viewGroup).mo89858a(UIHelper.getString(R.string.Lark_Legacy_InLoading)).mo89859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "LKUIStatus.Builder((mCon…ng))\n            .build()");
            this.f90763G = a;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }

    /* renamed from: w */
    private final void m137272w() {
        this.f90772b = new C33086b();
        C35149ag agVar = new C35149ag(this);
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        PointRecoderRecyclerView pointRecoderRecyclerView2 = pointRecoderRecyclerView;
        AbstractC33342d dVar = this.f90764H;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatContext");
        }
        ChatThreadView chatThreadView = this;
        this.f90770N = new ChatThreadCellClickHandler(pointRecoderRecyclerView2, dVar, chatThreadView, agVar);
        AbstractC33342d dVar2 = this.f90764H;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatContext");
        }
        ChatThreadCellClickHandler bVar = this.f90770N;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickHandlerHubChat");
        }
        ChatThreadMessageCellFactory dVar3 = new ChatThreadMessageCellFactory(dVar2, bVar, chatThreadView, this);
        C33086b bVar2 = this.f90772b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        dVar3.mo129637a(bVar2);
        AutoScrollHandler aVar = new AutoScrollHandler();
        this.f90760D = aVar;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        PointRecoderRecyclerView pointRecoderRecyclerView3 = this.mRecyclerView;
        if (pointRecoderRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        PointRecoderRecyclerView pointRecoderRecyclerView4 = pointRecoderRecyclerView3;
        C33086b bVar3 = this.f90772b;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        aVar.mo129630a(pointRecoderRecyclerView4, bVar3);
        PointRecoderRecyclerView pointRecoderRecyclerView5 = this.mRecyclerView;
        if (pointRecoderRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        C33086b bVar4 = this.f90772b;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        pointRecoderRecyclerView5.setAdapter(bVar4);
        m137274y();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    public static final class aj implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90817a;

        /* renamed from: b */
        final /* synthetic */ String f90818b;

        /* renamed from: c */
        final /* synthetic */ String f90819c;

        /* renamed from: d */
        final /* synthetic */ boolean f90820d;

        /* renamed from: e */
        final /* synthetic */ boolean f90821e;

        /* renamed from: f */
        final /* synthetic */ int[] f90822f;

        aj(ChatThreadView chatThreadView, String str, String str2, boolean z, boolean z2, int[] iArr) {
            this.f90817a = chatThreadView;
            this.f90818b = str;
            this.f90819c = str2;
            this.f90820d = z;
            this.f90821e = z2;
            this.f90822f = iArr;
        }

        public final void run() {
            boolean z;
            int i;
            String str;
            RichTextEmojiconEditText M;
            RichTextEmojiconEditText r;
            VoiceKBPlugin dVar = (VoiceKBPlugin) ChatThreadView.m137251a(this.f90817a).mo146819c("voice");
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            RichTextEmojiconEditText d = dVar.mo147969d();
            if (d != null) {
                if (this.f90817a.f90787q == null) {
                    this.f90817a.f90787q = new C34357v.C34361a(d);
                }
                if (this.f90817a.f90779i == null) {
                    RichText richText = null;
                    if (!this.f90817a.mo129590o()) {
                        TextInputSupportPlugin cVar = (TextInputSupportPlugin) ChatThreadView.m137251a(this.f90817a).mo146821d("text");
                        if (!(cVar == null || (r = cVar.mo147266r()) == null)) {
                            richText = r.getRichText();
                        }
                    } else {
                        RichTextInputShrinkPlugin dVar2 = (RichTextInputShrinkPlugin) ChatThreadView.m137251a(this.f90817a).mo146821d("input_richtext_shrink");
                        if (!(dVar2 == null || (M = dVar2.mo147028M()) == null)) {
                            richText = M.getRichText();
                        }
                    }
                    if (richText != null) {
                        ChatThreadView chatThreadView = this.f90817a;
                        if (chatThreadView.f90786p) {
                            str = C59035h.m229211b(richText);
                        } else {
                            str = "";
                        }
                        chatThreadView.f90779i = str;
                        ChatThreadView chatThreadView2 = this.f90817a;
                        String str2 = chatThreadView2.f90779i;
                        if (str2 == null) {
                            Intrinsics.throwNpe();
                        }
                        chatThreadView2.f90781k = str2.length();
                    }
                }
                String str3 = this.f90818b;
                String str4 = str3;
                if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(this.f90817a.f90780j)) {
                    MessageHitPoint.f135779d.mo187554f(this.f90819c);
                }
                String stringPlus = Intrinsics.stringPlus(this.f90817a.f90779i, str3);
                dVar.mo147966a(stringPlus, this.f90820d, this.f90821e);
                this.f90817a.f90780j = str3;
                if (this.f90821e) {
                    ChatThreadView chatThreadView3 = this.f90817a;
                    Chat e = chatThreadView3.mo129588m().mo129546e();
                    Intrinsics.checkExpressionValueIsNotNull(e, "mViewDelegate.chat");
                    d.setHint(TextUtils.ellipsize(chatThreadView3.mo129572a(e, this.f90817a.mo129588m().mo129544d()), d.getPaint(), (float) d.getMeasuredWidth(), TextUtils.TruncateAt.END));
                    d.setOriginText(stringPlus);
                    d.setSelection(d.getText().length());
                    this.f90817a.f90782l = false;
                    this.f90817a.f90783m = "";
                    if (TextUtils.isEmpty(str4)) {
                        MessageHitPoint.f135779d.mo187561j(this.f90819c);
                    } else {
                        MessageHitPoint.f135779d.mo187560i(this.f90819c);
                    }
                } else {
                    this.f90817a.f90780j = str3;
                    int[] iArr = this.f90822f;
                    if (iArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        i = iArr[0];
                    } else {
                        i = str3.length();
                    }
                    SpannableStringBuilder a = C34357v.m133265a(this.f90817a.f90793w, stringPlus, this.f90817a.f90781k + RangesKt.coerceAtLeast(i, str3.length() - 3));
                    Intrinsics.checkExpressionValueIsNotNull(a, "SpannableStringUtils.get…io2TextIndex + partIndex)");
                    String str5 = stringPlus;
                    if (!TextUtils.isEmpty(str5)) {
                        C34357v.m133261a(this.f90817a.f90793w, a, this.f90817a.f90787q);
                        d.setOriginText(a);
                        d.setSelection(d.getText().length());
                    } else {
                        d.setOriginText(str5);
                    }
                    if (!this.f90817a.f90782l) {
                        this.f90817a.f90782l = true;
                        String string = UIHelper.getString(R.string.Lark_Chat_AudioToTextSpeakTip);
                        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(\n    …Chat_AudioToTextSpeakTip)");
                        SpannableStringBuilder a2 = C34357v.m133266a(this.f90817a.f90793w, string, this.f90817a.f90787q);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "SpannableStringUtils.get…mKeyboardLoadingCallback)");
                        a2.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f90817a.f90793w, R.color.lkui_N500)), 0, a2.length(), 33);
                        d.setHint(a2);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$onOnlineReviewFileClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "docUrl", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ab */
    public static final class C35142ab implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90795a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35142ab(ChatThreadView chatThreadView) {
            this.f90795a = chatThreadView;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e(errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "docUrl");
            AbstractC36474h hVar = this.f90795a.f90774d;
            Intrinsics.checkExpressionValueIsNotNull(hVar, "mChatDependency");
            hVar.mo134593u().mo134331a(this.f90795a.f90793w, str, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$showFilePreviewDialog$dialog$1", "Lcom/ss/android/lark/keyboard/plugin/tool/preview/FilePreviewDialogCallback;", "onNegativeClick", "", "dialog", "Landroid/app/Dialog;", "onPositiveClick", "filePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$ah */
    public static final class C35150ah implements FilePreviewDialogCallback {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90813a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35150ah(ChatThreadView chatThreadView) {
            this.f90813a = chatThreadView;
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
            String q = ChatThreadView.m137251a(this.f90813a).mo146836q();
            String r = ChatThreadView.m137251a(this.f90813a).mo146837r();
            for (String str : list) {
                String c = C26311p.m95283c(str);
                Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
                String str2 = c;
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "image/", false, 2, (Object) null) || StringsKt.endsWith$default(str, ".0", false, 2, (Object) null)) {
                    this.f90813a.mo129588m().mo129537a(CollectionsKt.listOf(str), true, q, r);
                } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "video/", false, 2, (Object) null)) {
                    File file = new File(str);
                    Photo photo = new Photo();
                    photo.setPath(file.getPath());
                    photo.setMimeType(C26311p.m95279b(file));
                    photo.setSize(C26311p.m95281c(file));
                    photo.setDuration(0);
                    photo.setCompressPath(ao.m224300a(this.f90813a.f90793w, file.getPath(), false));
                    this.f90813a.mo129588m().mo129536a(CollectionsKt.listOf(photo), q, r);
                }
            }
            dialog.dismiss();
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$addReadMessageListener$1", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$c */
    public static final class C35154c extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90827a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35154c(ChatThreadView chatThreadView) {
            this.f90827a = chatThreadView;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
            this.f90827a.mo129588m().mo129541b(this.f90827a.mo129589n().mo122243a(i, i2, true));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$getTextInputSupportPlugin$plugin$1", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onFilePaste", "", "rawFilePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$l */
    public static final class C35167l extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90843a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35167l(ChatThreadView chatThreadView) {
            this.f90843a = chatThreadView;
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
                this.f90843a.mo129582b(arrayList);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J8\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initKeyBoard$1", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "resetDraft", "", "resetOnStart", "", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency$IResetDraftCallback;", "saveDraft", "parentId", "", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "saveDraftOnStop", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$q */
    public static final class C35182q implements IKeyBoardDependency {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90876a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35182q(ChatThreadView chatThreadView) {
            this.f90876a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122095a(NestScrollFrameLayout nestScrollFrameLayout) {
            Intrinsics.checkParameterIsNotNull(nestScrollFrameLayout, "nestScrollFrameLayout");
            IKeyBoardDependency.C40676a.m160771a(this, nestScrollFrameLayout);
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122097a(boolean z, IKeyBoardDependency.IResetDraftCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            ChatThreadView chatThreadView = this.f90876a;
            MessageInfo messageInfo = chatThreadView.f90777g;
            if (messageInfo == null) {
                Intrinsics.throwNpe();
            }
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "mRootMsgInfo!!.getMessage()");
            String textDraftId = message.getTextDraftId();
            Intrinsics.checkExpressionValueIsNotNull(textDraftId, "mRootMsgInfo!!.getMessage().textDraftId");
            MessageInfo messageInfo2 = this.f90876a.f90777g;
            if (messageInfo2 == null) {
                Intrinsics.throwNpe();
            }
            Message message2 = messageInfo2.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message2, "mRootMsgInfo!!.getMessage()");
            String postDraftId = message2.getPostDraftId();
            Intrinsics.checkExpressionValueIsNotNull(postDraftId, "mRootMsgInfo!!.getMessage().postDraftId");
            chatThreadView.mo129579a(textDraftId, postDraftId, bVar);
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardDependency
        /* renamed from: a */
        public void mo122096a(String str, RichText richText, String str2, RichText richText2, boolean z) {
            this.f90876a.mo129588m().mo129530a(str, richText, str2, richText2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initKeyBoard$3", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "onHeightChanged", "", "toolBoxHeight", "", "onStateChanged", "isShow", "", "replyMsgId", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$s */
    public static final class C35184s implements IKeyBoardStatusListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90879a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35184s(ChatThreadView chatThreadView) {
            this.f90879a = chatThreadView;
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122008a(int i) {
            if (!ChatThreadView.m137251a(this.f90879a).mo146818b("post") && !ChatThreadView.m137251a(this.f90879a).mo146818b("input_richtext_expand")) {
                this.f90879a.mo129585e(i);
            }
        }

        @Override // com.ss.android.lark.keyboard.IKeyBoardStatusListener
        /* renamed from: a */
        public void mo122009a(boolean z, int i, String str) {
            if (!ChatThreadView.m137251a(this.f90879a).mo146818b("post") && !ChatThreadView.m137251a(this.f90879a).mo146818b("input_richtext_expand")) {
                this.f90879a.mo129585e(i);
                if (z) {
                    this.f90879a.mo101863c();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initSmartChat$2", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onItemRangeInserted", "", "positionStart", "", "itemCount", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$w */
    public static final class C35188w extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90884a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35188w(ChatThreadView chatThreadView) {
            this.f90884a = chatThreadView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            MessageInfo e = this.f90884a.mo129588m().mo129547e(this.f90884a.mo129589n().mo31276a(i).mo121681a());
            AbstractC28621d dVar = this.f90884a.f90773c;
            if (dVar != null) {
                dVar.mo101809a(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$z */
    public static final class View$OnClickListenerC35191z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90891a;

        View$OnClickListenerC35191z(ChatThreadView chatThreadView) {
            this.f90891a = chatThreadView;
        }

        public final void onClick(View view) {
            this.f90891a.f90792v.mo129340e();
        }
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: q */
    public void mo129593q(String str) {
        LKUIToast.show(this.f90793w, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$updateKeyBoardHint$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ak extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90823a;

        /* renamed from: b */
        final /* synthetic */ String f90824b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f90823a.mo129597v(this.f90824b);
        }

        ak(ChatThreadView chatThreadView, String str) {
            this.f90823a = chatThreadView;
            this.f90824b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\u000b\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initKeyBoard$4", "Landroid/view/View$OnTouchListener;", "handleMove", "", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$t */
    public static final class View$OnTouchListenerC35185t implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90880a;

        /* renamed from: b */
        private boolean f90881b = true;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnTouchListenerC35185t(ChatThreadView chatThreadView) {
            this.f90880a = chatThreadView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 2) {
                this.f90881b = true;
            } else if (this.f90880a.f90776f) {
                this.f90881b = true;
            } else if (this.f90881b) {
                ChatThreadView.m137251a(this.f90880a).mo146820c();
                this.f90881b = false;
            }
            if (motionEvent.getAction() == 1 && this.f90880a.f90776f) {
                this.f90880a.f90776f = false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ KeyBoard m137251a(ChatThreadView chatThreadView) {
        KeyBoard fVar = chatThreadView.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        return fVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IReplyMsgDigestCreator m137252b(ChatThreadView chatThreadView) {
        IReplyMsgDigestCreator cVar = chatThreadView.f90791u;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("replyCreator");
        }
        return cVar;
    }

    /* renamed from: e */
    public final void mo129585e(int i) {
        if (!m137270u()) {
            mo129584d(i);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: s */
    public void mo122780s(String str) {
        C33111af afVar = this.f90762F;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateHandler");
        }
        afVar.mo122312a(str);
    }

    /* renamed from: v */
    public final void mo129597v(String str) {
        C35212a.m137544c(this.f90793w, new C35151ai(this, str));
    }

    /* renamed from: e */
    private final IKeyBoardPlugin m137261e(Chat chat) {
        return new VoiceKBPlugin(chat.isSecret(), new C35169n(this, chat), new C35180o(this, chat));
    }

    /* renamed from: i */
    private final int m137267i(Chat chat) {
        if (chat.isAllowPost()) {
            return UIHelper.getColor(R.color.lkui_N400);
        }
        return UIHelper.getColor(R.color.lkui_N300);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b
    public void e_(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129549g(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
    /* renamed from: h */
    public void mo122798h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar2 = this.f90771a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar2.mo129524a(e);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: k */
    public void mo122767k(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129528a(str, new C35142ab(this));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: l */
    public void mo122768l(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129518a(this.f90793w, str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: m */
    public void mo122769m(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129545d(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
    /* renamed from: n */
    public void mo122770n(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        mo122771o(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
    /* renamed from: p */
    public void mo122774p(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageCid");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129543c(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: r */
    public void mo122779r(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        this.f90792v.mo129335a(str);
    }

    /* renamed from: b */
    private final void m137254b(C35095c cVar) {
        Activity a = mo101867a();
        if (a != null) {
            Chat chat = cVar.f90625a;
            Intrinsics.checkExpressionValueIsNotNull(chat, "data.chat");
            ChatThreadContext cVar2 = new ChatThreadContext((FragmentActivity) a, chat);
            cVar2.mo122537b(cVar.f90627c);
            cVar2.mo122529a(cVar.f90626b);
            cVar2.mo122527a(cVar.f90629e);
            this.f90764H = cVar2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: f */
    private final IKeyBoardPlugin m137263f(Chat chat) {
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        boolean isSecret = chat.isSecret();
        String id2 = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
        return new AtKBPlugin(id, isSecret, true, new AtKBPluginDependency(this.f90793w, id2, chat.isP2PChat()));
    }

    /* renamed from: g */
    private final IKeyBoardPlugin m137265g(Chat chat) {
        ThreadPhotoKBPlugin cVar = new ThreadPhotoKBPlugin(chat.isSecret(), false, true, new C35161h(this));
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        cVar.mo147808a(new PhotoAaKBPluginCompat(fVar));
        return cVar;
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: c */
    public void mo129566c(int i) {
        KeyBoard fVar = this.f90789s;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        BurnLifeKBPlugin aVar = (BurnLifeKBPlugin) fVar.mo146819c("burnLife");
        if (aVar != null) {
            aVar.mo147411a(i);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33300j
    /* renamed from: o */
    public void mo122771o(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        if (e != null) {
            Message message = e.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36505s S = b.mo134520S();
            boolean isSecret = message.isSecret();
            Intrinsics.checkExpressionValueIsNotNull(S, "fileDependency");
            S.mo134701a(this.f90793w, message, isSecret, S.mo134696a());
        }
    }

    @Override // com.ss.android.lark.chatthread.view.AbstractC35205g
    /* renamed from: t */
    public void mo129596t(String str) {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        ViewGroup viewGroup = this.mContentContainer;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentContainer");
        }
        N.mo134396a(viewGroup, this.f90793w);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
    /* renamed from: u */
    public void mo123362u(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        if (e != null) {
            Message a = C34350p.m133211a(e);
            Intrinsics.checkExpressionValueIsNotNull(a, "message");
            ThreadMergeForwardLauncher.f138288a.mo190745a(this.f90793w, str, a);
        }
    }

    /* renamed from: b */
    private final boolean m137255b(Chat chat) {
        boolean z;
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        OpenApp b = aVar.mo129538b();
        if (m137269t() || !chat.isChatable()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (b != null && b.getState() != null && b.getState() != OpenApp.State.USABLE)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m137259d(Chat chat) {
        IReplyMsgDigestCreator cVar;
        if (chat.isSecret()) {
            cVar = new SecretChatReplyDigestCreator();
        } else {
            cVar = new ChatReplyDigestCreator();
        }
        this.f90791u = cVar;
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC35157e(this));
    }

    /* renamed from: h */
    private final IKeyBoardPlugin m137266h(Chat chat) {
        FragmentManager c = this.f90792v.mo129338c();
        boolean isSecret = chat.isSecret();
        if (DesktopUtil.m144301a((Context) this.f90793w)) {
            return new DesktopFaceKBPlugin(!isSecret, isSecret, new FaceKBPluginDependency(new C35159f(this)), true);
        }
        Intrinsics.checkExpressionValueIsNotNull(c, "fragmentManager");
        return new FaceKBPlugin(!isSecret, isSecret, c, new FaceKBPluginDependency(new C35160g(this)));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p
    /* renamed from: e */
    public void mo121944e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129535a(CollectionsKt.listOf(str));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33306p, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r
    /* renamed from: f */
    public void mo121946f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129548f(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
    /* renamed from: g */
    public void mo122797g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129539b(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initSecretChatIfNeed$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$u */
    public static final class C35186u extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90882a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            List<MessageInfo> c = this.f90882a.mo129588m().mo129542c();
            Intrinsics.checkExpressionValueIsNotNull(c, "mViewDelegate.messageInfoList");
            List<MessageInfo> list = c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Message message = it.next().getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "it.getMessage()");
                arrayList.add(message.getId());
            }
            ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
            if (arrayList2.isEmpty()) {
                LKUIToast.show(this.f90882a.f90793w, (int) R.string.Lark_Legacy_ErrorMessage);
                return;
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            IForwardDependency E = b.mo134506E();
            FragmentActivity fragmentActivity = this.f90882a.f90793w;
            Fragment b2 = this.f90882a.mo101868b();
            if (b2 != null) {
                E.mo134373a(fragmentActivity, (C36516a) b2, this.f90882a.mo129588m().mo129546e(), arrayList2, 17, "click", "chat", false, "");
                ChatHitPoint.f135648a.mo187371h();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.desktopmode.app.DesktopCompatFragment<*>");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35186u(ChatThreadView chatThreadView, Drawable drawable) {
            super(drawable);
            this.f90882a = chatThreadView;
        }
    }

    /* renamed from: c */
    private final void m137257c(Chat chat) {
        if (chat.isSecret()) {
            int color = ContextCompat.getColor(this.f90793w, R.color.bg_tips);
            CommonTitleBar commonTitleBar = this.mTitleBar;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            commonTitleBar.setBackgroundColor(color);
            CommonTitleBar commonTitleBar2 = this.mTitleBar;
            if (commonTitleBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            commonTitleBar2.setMainTitleColor(ContextCompat.getColor(this.f90793w, R.color.static_white));
            CommonTitleBar commonTitleBar3 = this.mTitleBar;
            if (commonTitleBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            commonTitleBar3.setLeftImageResource(CommonTitleBarConstants.ICON_BACK, R.color.static_white);
            this.f90792v.mo129339d();
            m137275z();
            return;
        }
        CommonTitleBar commonTitleBar4 = this.mTitleBar;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        FragmentActivity fragmentActivity = this.f90793w;
        commonTitleBar4.addAction(new C35186u(this, UDIconUtils.getIconDrawable(fragmentActivity, (int) R.drawable.ud_icon_forward_outlined, UDColorUtils.getColor(fragmentActivity, R.color.icon_n1))));
    }

    /* renamed from: j */
    private final void m137268j(Chat chat) {
        if (!chat.isSecret()) {
            KeyBoard fVar = this.f90789s;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            TextInputSupportPlugin cVar = (TextInputSupportPlugin) fVar.mo146821d("text");
            KeyBoard fVar2 = this.f90789s;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            PostInputSupportPlugin bVar = (PostInputSupportPlugin) fVar2.mo146821d("post");
            KeyBoard fVar3 = this.f90789s;
            if (fVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            RichTextInputShrinkPlugin dVar = (RichTextInputShrinkPlugin) fVar3.mo146821d("input_richtext_shrink");
            KeyBoard fVar4 = this.f90789s;
            if (fVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            RichTextInputExpandPlugin cVar2 = (RichTextInputExpandPlugin) fVar4.mo146821d("input_richtext_expand");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36470d aj2 = b.aj();
            AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            IComposeController a = aj2.mo134484a(aVar.mo129546e().getId(), IComposeController.ConvoType.THREAD, IComposeController.EditorType.TEXT);
            this.f90758B = a;
            if (a != null) {
                a.mo101541a(new C35189x(this, dVar, cVar));
            }
            AbstractC36474h b2 = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36470d aj3 = b2.aj();
            AbstractC35135g.AbstractC35138b.AbstractC35139a aVar2 = this.f90771a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            IComposeController a2 = aj3.mo134484a(aVar2.mo129546e().getId(), IComposeController.ConvoType.THREAD, IComposeController.EditorType.RTE);
            this.f90759C = a2;
            if (a2 != null) {
                a2.mo101541a(new C35190y(this, cVar2, bVar));
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
    /* renamed from: b */
    public List<String> mo122758b(int i) {
        boolean z;
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        ArrayList arrayList = new ArrayList(bVar.mo122242a());
        List subList = arrayList.subList(i, arrayList.size());
        Intrinsics.checkExpressionValueIsNotNull(subList, "messageVOList.subList(startPosition, size)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : CollectionsKt.filterNotNull(subList)) {
            ChatMessageVO cVar = (ChatMessageVO) obj;
            if (!(cVar.mo121699g() instanceof AudioContentVO) || cVar.mo121702j() >= 2 || cVar.mo121695c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(obj);
            }
        }
        ArrayList<ChatMessageVO> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (ChatMessageVO cVar2 : arrayList3) {
            arrayList4.add(cVar2.mo121696d());
        }
        return arrayList4;
    }

    /* renamed from: d */
    public final void mo129584d(int i) {
        View view = this.mRootView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, 0, 0, i);
            View view2 = this.mRootView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: c */
    public final void mo129583c(RecyclerView recyclerView) {
        if (!this.f90767K && recyclerView.getChildCount() > 0) {
            this.f90767K = true;
            recyclerView.post(new RunnableC35146ae(this));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m
    /* renamed from: d */
    public void mo121943d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        C36894a a = C36894a.m145605a();
        Intrinsics.checkExpressionValueIsNotNull(a, "audioPlayer");
        if (a.mo136217n() == 1) {
            a.mo136209f();
            LarkPlayModeTip a2 = LarkPlayModeTip.f88953b.mo127188a();
            CommonTitleBar commonTitleBar = this.mTitleBar;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            a2.mo127187b(commonTitleBar);
            return;
        }
        a.mo136208e();
        LarkPlayModeTip a3 = LarkPlayModeTip.f88953b.mo127188a();
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        a3.mo127186a(commonTitleBar2);
    }

    /* renamed from: b */
    public final void mo129581b(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager == null) {
            Intrinsics.throwNpe();
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        C33086b bVar = this.f90772b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatAdapter");
        }
        List<ChatMessageVO> a = bVar.mo122243a(findFirstVisibleItemPosition, findLastVisibleItemPosition, true);
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo129541b(a);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f
    /* renamed from: c */
    public void mo121942c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        if (e != null) {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134506E().mo134371a(this.f90793w, e.getMessage(), "click", "chat", "");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e
    /* renamed from: b */
    public void mo121940b(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        if (e != null) {
            AbstractC33342d dVar = this.f90764H;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatContext");
            }
            Chat n = dVar.mo122550n();
            if (n != null) {
                Intrinsics.checkExpressionValueIsNotNull(n, "chatContext.chat ?: return");
                BuzzHitPoint.Companion aVar2 = BuzzHitPoint.f135698a;
                Message message = e.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                Message.Type type = message.getType();
                boolean z2 = false;
                if (n.isP2PChat()) {
                    AbstractC35135g.AbstractC35138b.AbstractC35139a aVar3 = this.f90771a;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
                    }
                    Chatter d = aVar3.mo129544d();
                    if (d != null) {
                        z = d.isBot();
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                aVar2.mo187452a(str, type, n, z2);
                if (n.getType() != Chat.Type.P2P) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    b.mo134521T().mo134713a(this.f90793w, this.f90794x, n.getId(), str, 6);
                } else if (m137250B()) {
                    LKUIToast.show(this.f90793w, UIHelper.getString(R.string.Lark_Legacy_ChatterResignPermissionUrgent));
                } else {
                    AbstractC35135g.AbstractC35138b.AbstractC35139a aVar4 = this.f90771a;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
                    }
                    Chatter d2 = aVar4.mo129544d();
                    if (d2 != null) {
                        AbstractC36474h b2 = C29990c.m110930b();
                        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                        b2.mo134511J().mo134663a(this.f90793w, this.f90794x, e.getMessage(), d2, 6);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatthread/view/ChatThreadView$initKeyBoard$2", "Lcom/ss/android/lark/keyboard/plugin/tool/burnlife/IBurnLifeDependency;", "onUpdateBurnLifeLife", "", "burnTime", "", "originBurnLife", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatthread.view.ChatThreadView$r */
    public static final class C35183r implements IBurnLifeDependency {

        /* renamed from: a */
        final /* synthetic */ ChatThreadView f90877a;

        /* renamed from: b */
        final /* synthetic */ Chat f90878b;

        C35183r(ChatThreadView chatThreadView, Chat chat) {
            this.f90877a = chatThreadView;
            this.f90878b = chat;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.burnlife.IBurnLifeDependency
        /* renamed from: a */
        public void mo123963a(int i, int i2) {
            this.f90877a.mo129588m().mo129527a(this.f90878b.getId(), i, i2);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IViewInChatMenuHandler
    /* renamed from: c */
    public void mo123352c(String str, int i) {
        this.f90792v.mo129330a(this.f90793w, str, i);
    }

    /* renamed from: f */
    private final IInputSupportPlugin m137262f(Chat chat, Chatter chatter) {
        return new PostInputSupportPlugin(mo129572a(chat, chatter), new C35163i(this));
    }

    /* renamed from: g */
    private final IInputSupportPlugin m137264g(Chat chat, Chatter chatter) {
        return new RichTextInputExpandPlugin(mo129572a(chat, chatter), new C35165j(this), null, 4, null);
    }

    /* renamed from: d */
    private final IInputSupportPlugin m137258d(Chat chat, Chatter chatter) {
        RichTextInputShrinkPlugin dVar = new RichTextInputShrinkPlugin(mo129572a(chat, chatter), m137267i(chat), new C35166k(this, chat), null, chat.isSecret(), 8, null);
        dVar.mo147112f(false);
        return dVar;
    }

    /* renamed from: e */
    private final IInputSupportPlugin m137260e(Chat chat, Chatter chatter) {
        TextInputSupportPlugin cVar = new TextInputSupportPlugin(chat.isSecret(), mo129572a(chat, chatter), m137267i(chat), new C35167l(this), new C35168m(this), null, chat.isSecret());
        cVar.mo147260d(false);
        return cVar;
    }

    /* renamed from: a */
    public final CharSequence mo129572a(Chat chat, Chatter chatter) {
        return ChatKBPluginUtil.f86409a.mo123236a(this.f90793w, chat, chatter);
    }

    /* renamed from: c */
    private final IKeyBoardPlugin m137256c(Chat chat, Chatter chatter) {
        if (DesktopUtil.m144301a((Context) this.f90793w)) {
            PlusKBDesktopPlugin cVar = new PlusKBDesktopPlugin(chat.isSecret(), true);
            if (C29990c.m110930b() != null) {
                C29990c.m110930b().mo134543a(chat, chatter, new C34416c(cVar));
            }
            return cVar;
        }
        PlusKBPlugin eVar = new PlusKBPlugin(chat.isSecret());
        if (C29990c.m110930b() != null) {
            C29990c.m110930b().mo134543a(chat, chatter, new C34416c(eVar));
        }
        return eVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
    /* renamed from: a */
    public void mo122778a(View view, ChatMessageVO<TranslatableContentVO<?>> cVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(cVar, "textMessageVO");
        C33111af afVar = this.f90762F;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateHandler");
        }
        afVar.mo122309a(view, (String) null, cVar.mo121681a());
    }

    /* renamed from: b */
    private final void m137253b(Chat chat, Chatter chatter) {
        FragmentActivity fragmentActivity = this.f90793w;
        FrameLayout frameLayout = this.mKeyBoardContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContainer");
        }
        KeyBoard fVar = new KeyBoard(fragmentActivity, frameLayout, new C35182q(this), null, null, false, 56, null);
        this.f90789s = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar.mo146795a(KeyboardScene.ChatMain);
        KeyBoard fVar2 = this.f90789s;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar2.mo146801a(new AutoAdjustSizeLayoutManager());
        KeyBoard fVar3 = this.f90789s;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar3.mo146806a("face", m137266h(chat));
        KeyBoard fVar4 = this.f90789s;
        if (fVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar4.mo146806a("at", m137263f(chat));
        if (!DesktopUtil.m144301a((Context) this.f90793w)) {
            KeyBoard fVar5 = this.f90789s;
            if (fVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar5.mo146806a("voice", m137261e(chat));
        }
        KeyBoard fVar6 = this.f90789s;
        if (fVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar6.mo146806a("photo", m137265g(chat));
        if (chat.isSecret()) {
            KeyBoard fVar7 = this.f90789s;
            if (fVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar7.mo146806a("burnLife", new BurnLifeKBPlugin(chat.getBurnLife(), chat.isGroup(), new C35183r(this, chat)));
        }
        if (mo129590o() && !chat.isSecret()) {
            KeyBoard fVar8 = this.f90789s;
            if (fVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar8.mo146806a("aa_editor", m137273x());
        }
        if (!chat.isCrossTenant()) {
            IKeyBoardPlugin c = m137256c(chat, chatter);
            KeyBoard fVar9 = this.f90789s;
            if (fVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar9.mo146806a("plus", c);
        }
        if (chat.isSecret()) {
            KeyBoard fVar10 = this.f90789s;
            if (fVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar10.mo146804a("text", m137260e(chat, chatter));
        } else if (mo129590o()) {
            KeyBoard fVar11 = this.f90789s;
            if (fVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar11.mo146804a("input_richtext_shrink", m137258d(chat, chatter));
            KeyBoard fVar12 = this.f90789s;
            if (fVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar12.mo146804a("input_richtext_expand", m137264g(chat, chatter));
        } else {
            KeyBoard fVar13 = this.f90789s;
            if (fVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar13.mo146804a("text", m137260e(chat, chatter));
            KeyBoard fVar14 = this.f90789s;
            if (fVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar14.mo146804a("post", m137262f(chat, chatter));
        }
        KeyBoard fVar15 = this.f90789s;
        if (fVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar15.mo146796a(new C35184s(this));
        PointRecoderRecyclerView pointRecoderRecyclerView = this.mRecyclerView;
        if (pointRecoderRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        pointRecoderRecyclerView.setOnTouchListener(new View$OnTouchListenerC35185t(this));
        m137259d(chat);
        if (m137255b(chat)) {
            KeyBoard fVar16 = this.f90789s;
            if (fVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar16.mo146833n();
        } else {
            KeyBoard fVar17 = this.f90789s;
            if (fVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
            }
            fVar17.mo146834o();
        }
        if (m137269t()) {
            TextView textView = this.mP2pChatterDeactiviedTipTV;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
            }
            textView.setVisibility(0);
            mo129584d(UIHelper.getDimens(R.dimen.p2p_chatter_is_dimission_tip_height));
        } else {
            TextView textView2 = this.mP2pChatterDeactiviedTipTV;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mP2pChatterDeactiviedTipTV");
            }
            textView2.setVisibility(8);
        }
        KeyBoard fVar18 = this.f90789s;
        if (fVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar18.mo146817b(false);
        KeyBoard fVar19 = this.f90789s;
        if (fVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoard");
        }
        fVar19.mo146842w();
        mo129574a(chat, chatter, chat.isAllowPost());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
    /* renamed from: d */
    public void mo123355d(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        MessageInfo e = aVar.mo129547e(str);
        if (e != null) {
            Message message = e.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134520S().mo134697a(this.f90793w, message, 1);
        }
    }

    public ChatThreadView(AbstractC35135g.AbstractC35138b.AbstractC35140b bVar, FragmentActivity fragmentActivity, C36516a<?> aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mHostFragment");
        this.f90792v = bVar;
        this.f90793w = fragmentActivity;
        this.f90794x = aVar;
        AbstractC36474h b = C29990c.m110930b();
        this.f90774d = b;
        Intrinsics.checkExpressionValueIsNotNull(b, "mChatDependency");
        this.f90775e = b.af();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122773a(View view, PhotoItem photoItem, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(photoItem, "photoItem");
        List<PhotoItem> mutableListOf = CollectionsKt.mutableListOf(photoItem);
        AbstractC33342d dVar = this.f90764H;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatContext");
        }
        Chat n = dVar.mo122550n();
        if (n != null) {
            Intrinsics.checkExpressionValueIsNotNull(n, "chatContext.chat ?: return");
            C29990c.m110930b().mo134541a(this.f90793w, mutableListOf, 0, view, null, !n.isSecret(), false, false, z, false, false, null, null, Scene.Chat, 4);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v
    /* renamed from: a */
    public <M extends AbsMessageVO<? extends ContentVO<?>>> void mo122321a(View view, AbstractC59010e eVar, AbsMessageVO<? extends ContentVO<?>> aVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
        Intrinsics.checkParameterIsNotNull(aVar, "translatableMessageVO");
        C33111af afVar = this.f90762F;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateHandler");
        }
        afVar.mo122309a(view, (String) null, aVar.mo121681a());
    }

    @Override // com.ss.android.lark.chatthread.AbstractC35135g.AbstractC35138b
    /* renamed from: a */
    public void mo129559a(int i, List<? extends PhotoItem> list, View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "photoItems");
        Intrinsics.checkParameterIsNotNull(view, "view");
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        Chat e = aVar.mo129546e();
        this.f90792v.mo129336a(!e.isSecret(), e.getId(), i, list, view, z);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
    /* renamed from: a */
    public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(photoItem, "selectPhoItem");
        ArrayList arrayList = new ArrayList();
        AbstractC35135g.AbstractC35138b.AbstractC35139a aVar = this.f90771a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        List<MessageInfo> c = aVar.mo129542c();
        if (c != null) {
            C34352r.m133227a(photoItem.getMessageId(), z2, c, arrayList);
            List<PhotoItem> a = C58659h.m227513a(arrayList);
            AbstractC35135g.AbstractC35138b.AbstractC35139a aVar2 = this.f90771a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar2.mo129520a(view, photoItem, a, false);
        }
    }
}

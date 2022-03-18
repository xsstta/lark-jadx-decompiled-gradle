package com.ss.android.lark.chat.base.view.vo;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.AudioMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.FileMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.FolderMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.ImageMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.MediaMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.MergeForwardMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.PostMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.ShareGroupMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.StickerMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.SystemMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.TextMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.ThreadMergeForwardMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.UnKnownMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33345b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenThreadMessageVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.dependency.AbstractC36458af;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadtab.view.p2759a.C55987b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bt\u0018\u0000 ¼\u0001*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00042\u00020\u0005:\bº\u0001»\u0001¼\u0001½\u0001BÓ\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\u0006\u0010&\u001a\u00020\f\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\f\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u0006\u0010+\u001a\u00020\u0015\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"\u0012\u0006\u0010.\u001a\u00020\f\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\"\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\"\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\f\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u00107\u001a\u00020\f\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\u0006\u0010<\u001a\u00020\u0015\u0012\u0006\u0010=\u001a\u00020\f\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010?\u001a\u00020\f\u0012\u0006\u0010@\u001a\u00020\f\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\u0006\u0010C\u001a\u00020\f\u0012\u0006\u0010D\u001a\u00020\f\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010F\u001a\u00020\f\u0012\u0006\u0010G\u001a\u00020\u0015\u0012\u0006\u0010H\u001a\u00020\f\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\"\u0012\b\u0010K\u001a\u0004\u0018\u00010;\u0012\u0006\u0010L\u001a\u00020\f\u0012\u0006\u0010M\u001a\u00020\f\u0012\u0006\u0010N\u001a\u00020\f\u0012\u0006\u0010O\u001a\u00020\u0007\u0012\u0006\u0010P\u001a\u00020\f\u0012\b\u0010Q\u001a\u0004\u0018\u00010;\u0012\u0006\u0010R\u001a\u00020\u0015\u0012\u0006\u0010S\u001a\u00020\f\u0012\u0006\u0010T\u001a\u00020\u0017\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010W\u001a\u00020\f¢\u0006\u0002\u0010XJ\t\u0010£\u0001\u001a\u00020\u0007H\u0016J\u000f\u0010¤\u0001\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010¥\u0001J\t\u0010¦\u0001\u001a\u00020\u0007H\u0016J\t\u0010§\u0001\u001a\u00020\u0015H\u0016J\t\u0010¨\u0001\u001a\u00020\u0007H\u0016J\t\u0010©\u0001\u001a\u00020\u0007H\u0016J\t\u0010ª\u0001\u001a\u00020\u0015H\u0016J\u000b\u0010«\u0001\u001a\u0004\u0018\u00010 H\u0016J\t\u0010¬\u0001\u001a\u00020\u0007H\u0016J\t\u0010­\u0001\u001a\u00020\u0007H\u0016J\u0007\u0010®\u0001\u001a\u00020\fJ\u0018\u0010¯\u0001\u001a\u00020\f2\r\u0010°\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010±\u0001\u001a\u00020\f2\u000b\u0010²\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\t\u0010³\u0001\u001a\u00020\fH\u0016J\t\u0010´\u0001\u001a\u00020\fH\u0016J\t\u0010µ\u0001\u001a\u00020\fH\u0016J\u0007\u0010¶\u0001\u001a\u00020\fJ\u0007\u0010·\u0001\u001a\u00020\fJ\u0012\u0010¸\u0001\u001a\u00020\f2\u0007\u0010¹\u0001\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0007H\u0016R\u001a\u0010W\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010V\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0014\u0010\u0019\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\be\u0010bR\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010A\u001a\u0004\u0018\u00010B¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bh\u0010^R\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010iR\u0014\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010C\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bl\u0010ZR\u001c\u0010U\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010^\"\u0004\bn\u0010`R\u0014\u0010\u0010\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010^R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010^R\u001a\u0010S\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010Z\"\u0004\bt\u0010\\R\u0011\u00106\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bu\u0010ZR\u0011\u0010H\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bv\u0010ZR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010E\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bw\u0010^R\u0014\u0010\u001a\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010ZR\u0011\u00105\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010ZR\u0014\u0010\u0012\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010ZR\u0011\u0010)\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010ZR\u0011\u0010@\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010ZR\u0011\u0010N\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010ZR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010?\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010ZR\u0011\u0010D\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ZR\u0011\u0010F\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ZR\u0011\u00104\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010ZR\u001a\u0010P\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Z\"\u0004\bx\u0010\\R\u0011\u0010>\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010ZR\u0014\u0010&\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010ZR\u001a\u00103\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010Z\"\u0004\by\u0010\\R\u0011\u0010M\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bM\u0010ZR\u0014\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010ZR\u001a\u0010G\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010d\"\u0004\b{\u0010|R\u001a\u0010R\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010d\"\u0004\b~\u0010|R\u001f\u0010Q\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001a\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\"¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010bR\u001a\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\"¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010bR\u0012\u0010=\u001a\u00020\f¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010ZR\u0015\u0010K\u001a\u0004\u0018\u00010;¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010$\u001a\u0004\u0018\u00010%X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0018\u001a\u00020\u0015X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010dR\u001d\u0010T\u001a\u00020\u0017X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0001\u0010k\"\u0006\b\u0001\u0010\u0001R\u0012\u0010+\u001a\u00020\u0015¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010dR\u001d\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010bR\u001c\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010d\"\u0005\b\u0001\u0010|R\u0015\u00108\u001a\u0004\u0018\u000109¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0012\u0010L\u001a\u00020\f¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010ZR\u0016\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010.\u001a\u00020\fX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010Z\"\u0005\b\u0001\u0010\\R\u0012\u00107\u001a\u00020\f¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010ZR\u0016\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\"¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010bR\u0012\u0010(\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010^R\u0012\u0010O\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010^R\u0015\u0010:\u001a\u0004\u0018\u00010;¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0012\u0010*\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010^R\u0012\u0010<\u001a\u00020\u0015¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010dR\u0016\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/larksuite/framework/utils/diff/Diffable;", "Lcom/ss/android/lark/chat/export/vo/OpenThreadMessageVO;", "id", "", "cId", "chatId", "fromId", "isFromMe", "", "contentVO", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "fromAvatarKey", "fromName", "isDeleted", "isVisible", "replyCount", "", "createTime", "", "position", "badgeCount", "isBadged", UpdateKey.STATUS, "Lcom/ss/android/lark/chat/entity/message/Message$Status;", "sendStatus", "Lcom/ss/android/lark/chat/entity/message/SendStatus;", "fromChatter", "Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "reactionInfoList", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "pin", "Lcom/ss/android/lark/chat/entity/message/Pin;", "isRecalledByAdmin", BottomDialog.f17198f, "threadId", "isFollow", "title", "reactionCount", "atReadUserIdList", "botIdList", "showNewMessageTips", "mostUseReactions", "Lcom/ss/android/lark/chat/entity/reaction/Reaction;", "lastReplys", "", "isSelected", "isNoTraceDelete", "isClosed", "hasLikeReaction", "sourceFileIsDelete", "rootMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "threadOwner", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "topicTabType", "needAutoTranslate", "isPreThread", "isFromPublicChat", "isFromCrossTenantChat", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "currentUserIsChatOwner", "isInTab", "impressionId", "isMeRead", "itemType", "hasMoreRecommend", "threadChats", "Lcom/ss/android/lark/threadtab/view/bean/ThreadChatUIItem;", "originalSender", "scrollToStart", "isTopicGroupAdmin", "isFromDefaultGroup", "threadLocation", "isParticipantRole", "lastAtMessageSender", "lastAtMessageAtType", "hasAtMessage", "rankTime", "filterId", "anonymousId", "anonymousEnable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/lark/chat/export/vo/ContentVO;Lcom/ss/android/lark/chat/entity/message/Message$Type;Ljava/lang/String;Ljava/lang/String;ZZIJIIZLcom/ss/android/lark/chat/entity/message/Message$Status;Lcom/ss/android/lark/chat/entity/message/SendStatus;Lcom/ss/android/lark/chat/vo/ChatChatterVO;Ljava/util/List;Lcom/ss/android/lark/chat/entity/message/Pin;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/util/List;ZZZZZLcom/ss/android/lark/chat/entity/message/Message;Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;IZZZZLcom/ss/android/lark/chat/entity/chat/Chat;ZZLjava/lang/String;ZIZLjava/util/List;Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;ZZZLjava/lang/String;ZLcom/ss/android/lark/chat/entity/chatter/ChatChatter;IZJLjava/lang/String;Ljava/lang/String;Z)V", "getAnonymousEnable", "()Z", "setAnonymousEnable", "(Z)V", "getAnonymousId", "()Ljava/lang/String;", "setAnonymousId", "(Ljava/lang/String;)V", "getAtReadUserIdList", "()Ljava/util/List;", "getBadgeCount", "()I", "getBotIdList", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatterId", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getCreateTime", "()J", "getCurrentUserIsChatOwner", "getFilterId", "setFilterId", "getFromAvatarKey", "getFromChatter", "()Lcom/ss/android/lark/chat/vo/ChatChatterVO;", "getFromName", "getHasAtMessage", "setHasAtMessage", "getHasLikeReaction", "getHasMoreRecommend", "getImpressionId", "setParticipantRole", "setSelected", "getItemType", "setItemType", "(I)V", "getLastAtMessageAtType", "setLastAtMessageAtType", "getLastAtMessageSender", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "setLastAtMessageSender", "(Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "getLastReplys", "getMostUseReactions", "getNeedAutoTranslate", "getOriginalSender", "getPin", "()Lcom/ss/android/lark/chat/entity/message/Pin;", "getPosition", "getRankTime", "setRankTime", "(J)V", "getReactionCount", "getReactionInfoList", "getReplyCount", "setReplyCount", "getRootMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "getScrollToStart", "getSendStatus", "()Lcom/ss/android/lark/chat/entity/message/SendStatus;", "getShowNewMessageTips", "setShowNewMessageTips", "getSourceFileIsDelete", "getStatus", "()Lcom/ss/android/lark/chat/entity/message/Message$Status;", "getThreadChats", "getThreadId", "getThreadLocation", "getThreadOwner", "getTitle", "getTopicTabType", "getType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "getChatId", "getContentVO", "()Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getFromId", "getGroupType", "getId", "getParentId", "getReadState", "getRecallChatterVO", "getRootId", "getcId", "isAnonymous", "isContentSame", "itemData", "isItemSame", "diffable", "isReEditable", "isRecalled", "isSecret", "isTopic", "isTopicGroup", "needBurned", "ntpTime", "AtType", "Builder", "Companion", "ItemType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThreadMessageVO<T extends ContentVO<?>> extends AbsMessageVO<T> implements AbstractC26248b<ThreadMessageVO<?>>, OpenThreadMessageVO {

    /* renamed from: a */
    public static final UnKnownMsgConverter f84677a = new UnKnownMsgConverter();
    private static final ShareGroupMsgConverter aA = new ShareGroupMsgConverter();
    private static final SystemMsgConverter aB = new SystemMsgConverter();
    private static final TextMsgConverter aq = new TextMsgConverter(true);
    private static final PostMsgConverter ar = new PostMsgConverter(true);
    private static final ImageMsgConverter as = new ImageMsgConverter();
    private static final StickerMsgConverter at = new StickerMsgConverter();
    private static final MediaMsgConverter au = new MediaMsgConverter();
    private static final FileMsgConverter av = new FileMsgConverter();
    private static final FolderMsgConverter aw = new FolderMsgConverter();
    private static final AudioMsgConverter ax = new AudioMsgConverter();
    private static final MergeForwardMsgConverter ay = new MergeForwardMsgConverter();
    private static final ThreadMergeForwardMsgConverter az = new ThreadMergeForwardMsgConverter();

    /* renamed from: b */
    public static final Map<Message.Type, List<IMsgVOConverter<?>>> f84678b;

    /* renamed from: c */
    public static final Companion f84679c = new Companion(null);

    /* renamed from: A */
    private final String f84680A;

    /* renamed from: B */
    private final boolean f84681B;

    /* renamed from: C */
    private final String f84682C;

    /* renamed from: D */
    private final int f84683D;

    /* renamed from: E */
    private final List<String> f84684E;

    /* renamed from: F */
    private final List<String> f84685F;

    /* renamed from: G */
    private boolean f84686G;

    /* renamed from: H */
    private final List<Reaction> f84687H;

    /* renamed from: I */
    private final List<CharSequence> f84688I;

    /* renamed from: J */
    private boolean f84689J;

    /* renamed from: K */
    private final boolean f84690K;

    /* renamed from: L */
    private final boolean f84691L;

    /* renamed from: M */
    private final boolean f84692M;

    /* renamed from: N */
    private final boolean f84693N;

    /* renamed from: O */
    private final Message f84694O;

    /* renamed from: P */
    private final ChatChatter f84695P;

    /* renamed from: Q */
    private final int f84696Q;

    /* renamed from: R */
    private final boolean f84697R;

    /* renamed from: S */
    private final boolean f84698S;

    /* renamed from: T */
    private final boolean f84699T;

    /* renamed from: U */
    private final boolean f84700U;

    /* renamed from: V */
    private final Chat f84701V;

    /* renamed from: W */
    private final boolean f84702W;

    /* renamed from: X */
    private final boolean f84703X;

    /* renamed from: Y */
    private final String f84704Y;

    /* renamed from: Z */
    private final boolean f84705Z;
    private int aa;
    private final boolean ab;
    private final List<C55987b> ac;
    private final ChatChatter ad;
    private final boolean ae;
    private final boolean af;
    private final boolean ag;
    private final String ah;

    /* renamed from: ai  reason: collision with root package name */
    private boolean f175447ai;
    private ChatChatter aj;
    private int ak;
    private boolean al;
    private long am;
    private String an;
    private String ao;
    private boolean ap;

    /* renamed from: d */
    private final String f84706d;

    /* renamed from: e */
    private final String f84707e;

    /* renamed from: f */
    private final String f84708f;

    /* renamed from: g */
    private final String f84709g;

    /* renamed from: h */
    private final boolean f84710h;

    /* renamed from: i */
    private T f84711i;

    /* renamed from: j */
    private final Message.Type f84712j;

    /* renamed from: k */
    private final String f84713k;

    /* renamed from: l */
    private final String f84714l;

    /* renamed from: m */
    private final boolean f84715m;

    /* renamed from: n */
    private final boolean f84716n;

    /* renamed from: o */
    private int f84717o;

    /* renamed from: p */
    private final long f84718p;

    /* renamed from: q */
    private final int f84719q;

    /* renamed from: r */
    private final int f84720r;

    /* renamed from: s */
    private final boolean f84721s;

    /* renamed from: t */
    private final Message.Status f84722t;

    /* renamed from: u */
    private final SendStatus f84723u;

    /* renamed from: v */
    private final C33973b f84724v;

    /* renamed from: w */
    private final List<ReactionInfo> f84725w;

    /* renamed from: x */
    private final Pin f84726x;

    /* renamed from: y */
    private final boolean f84727y;

    /* renamed from: z */
    private final String f84728z;

    @Target({ElementType.TYPE, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO$AtType;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface AtType {
        public static final Companion Companion = Companion.f84729a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO$AtType$Companion;", "", "()V", "AT_ALL", "", "AT_ME", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.base.view.vo.ThreadMessageVO$AtType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f84729a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO$ItemType;", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ItemType {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ThreadMessageVO<?> m126877a(ThreadInfo threadInfo, String str, int i, boolean z, boolean z2, String str2, boolean z3) {
        return f84679c.mo121759a(threadInfo, str, i, z, z2, str2, z3);
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: a */
    public boolean mo121683a(long j) {
        return false;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: h */
    public String mo121700h() {
        return "";
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: i */
    public String mo121701i() {
        return "";
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: j */
    public int mo121702j() {
        return 1;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: k */
    public boolean mo121703k() {
        return false;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: l */
    public C33973b mo121704l() {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: m */
    public int mo121705m() {
        return 0;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: n */
    public boolean mo121706n() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JL\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u000203H\u0007JD\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u000203H\u0007J\u0014\u00108\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010.\u001a\u00020/H\u0003J\u001a\u0010:\u001a\u0004\u0018\u00010;2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0003J\u0018\u0010?\u001a\u00020\u00042\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0003J \u0010@\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010=2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0003J \u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010=2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010=H\u0003J\u0018\u0010G\u001a\u00020\u00042\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010=H\u0003J \u0010I\u001a\u0002032\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010=2\u0006\u00100\u001a\u00020\u0006H\u0003J\u0018\u0010J\u001a\u0002032\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u0003J2\u0010O\u001a\u00020P2\u001c\u0010Q\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00120\u00102\n\u0010R\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00120\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO$Companion;", "", "()V", "HEADER", "", "KEY_REACTION_LIKE", "", "MOST_USE_REACTION_NUM", "NO_MORE_RECOMMEND", "ONBOARDING", "TAG", "TOPIC", "TOPIC_GROUP", "audioConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/AudioMsgConverter;", "converterMap", "", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "fileConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/FileMsgConverter;", "folderConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/FolderMsgConverter;", "imageConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ImageMsgConverter;", "mediaConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/MediaMsgConverter;", "mergeForwardConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/MergeForwardMsgConverter;", "postConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/PostMsgConverter;", "shareGroupConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ShareGroupMsgConverter;", "stickerConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/StickerMsgConverter;", "systemConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/SystemMsgConverter;", "textConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/TextMsgConverter;", "threadMergeForwardConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/ThreadMergeForwardMsgConverter;", "unKnownMsgConverter", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/UnKnownMsgConverter;", "create", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "threadInfo", "Lcom/ss/android/lark/chat/entity/thread/ThreadInfo;", "userId", "tabType", "isInTab", "", "isTopicGroupAdmin", "isDefaultGroup", "threadLocation", "isParticipantRole", "getContentVO", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getLastAtMessageSender", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "lastAtMessages", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "getLastAtMessageType", "getLastReplys", "", "lastReplyMessages", "getMostUseReactions", "Lcom/ss/android/lark/chat/entity/reaction/Reaction;", "reactionList", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "getReactionCount", "reactionInfoList", "hasLikeReaction", "isAnonymousThreadOwner", "threadTopic", "Lcom/ss/android/lark/biz/im/api/ThreadTopic;", "rootMsg", "Lcom/ss/android/lark/chat/entity/message/Message;", "putMsgConverter", "", "map", "msgVOConverter", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.ThreadMessageVO$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final int mo121766b(List<? extends ReactionInfo> list) {
            int i;
            if (list == null || CollectionUtils.isEmpty(list)) {
                return 0;
            }
            int i2 = 0;
            for (ReactionInfo reactionInfo : list) {
                Map<String, ChatChatter> reactionChatters = reactionInfo.getReactionChatters();
                if (CollectionUtils.isEmpty(reactionChatters)) {
                    i = 0;
                } else {
                    i = reactionChatters.size();
                }
                i2 += i;
            }
            return i2;
        }

        @JvmStatic
        /* renamed from: d */
        public final ChatChatter mo121768d(List<? extends MessageInfo> list) {
            if (CollectionUtils.isEmpty(list)) {
                Log.m165383e("ThreadMessageVO", "at messages is empty");
                return null;
            }
            if (list == null) {
                Intrinsics.throwNpe();
            }
            MessageInfo messageInfo = (MessageInfo) list.get(CollectionsKt.getLastIndex(list));
            if (messageInfo != null) {
                return messageInfo.getMessageSender();
            }
            return null;
        }

        @JvmStatic
        /* renamed from: e */
        public final int mo121769e(List<? extends MessageInfo> list) {
            if (CollectionUtils.isEmpty(list)) {
                Log.m165383e("ThreadMessageVO", "at messages is empty");
                return 0;
            }
            if (list == null) {
                Intrinsics.throwNpe();
            }
            Message message = ((MessageInfo) list.get(CollectionsKt.getLastIndex(list))).getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "lastMessage.getMessage()");
            if (message.isAtAll()) {
                return 1;
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.lark.chat.export.vo.ContentVO<?> mo121761a(com.ss.android.lark.chat.entity.thread.ThreadInfo r5) {
            /*
                r4 = this;
                r0 = 0
                r1 = r0
                com.ss.android.lark.chat.export.vo.a r1 = (com.ss.android.lark.chat.export.vo.ContentVO) r1
                com.ss.android.lark.chat.entity.message.Message r2 = r5.mo126021c()
                if (r2 == 0) goto L_0x000e
                com.ss.android.lark.chat.export.entity.message.Content r0 = r2.getContent()
            L_0x000e:
                if (r0 == 0) goto L_0x0040
                java.util.Map<com.ss.android.lark.chat.entity.message.Message$Type, java.util.List<com.ss.android.lark.chat.e.d<?>>> r0 = com.ss.android.lark.chat.base.view.vo.ThreadMessageVO.f84678b
                com.ss.android.lark.chat.entity.message.Message r2 = r5.mo126021c()
                java.lang.String r3 = "threadInfo.rootMessage"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                com.ss.android.lark.chat.entity.message.Message$Type r2 = r2.getType()
                java.lang.Object r0 = r0.get(r2)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L_0x0040
                java.util.Iterator r0 = r0.iterator()
            L_0x002b:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0040
                java.lang.Object r1 = r0.next()
                com.ss.android.lark.chat.e.d r1 = (com.ss.android.lark.chat.vo.IMsgVOConverter) r1
                r2 = r5
                com.ss.android.lark.chat.entity.message.a r2 = (com.ss.android.lark.chat.entity.message.AbstractC34006a) r2
                com.ss.android.lark.chat.export.vo.a r1 = r1.mo122453b(r2)
                if (r1 == 0) goto L_0x002b
            L_0x0040:
                if (r1 != 0) goto L_0x004d
                com.ss.android.lark.chat.chatwindow.chat.data.a.s r0 = com.ss.android.lark.chat.base.view.vo.ThreadMessageVO.f84677a
                com.ss.android.lark.chat.entity.message.a r5 = (com.ss.android.lark.chat.entity.message.AbstractC34006a) r5
                com.ss.android.lark.chat.base.view.vo.message.p r5 = r0.mo122453b(r5)
                r1 = r5
                com.ss.android.lark.chat.export.vo.a r1 = (com.ss.android.lark.chat.export.vo.ContentVO) r1
            L_0x004d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.base.view.vo.ThreadMessageVO.Companion.mo121761a(com.ss.android.lark.chat.entity.thread.ThreadInfo):com.ss.android.lark.chat.export.vo.a");
        }

        @JvmStatic
        /* renamed from: a */
        public final List<Reaction> mo121762a(List<? extends ReactionInfo> list) {
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList((ArrayList) list);
                ArrayList arrayList2 = new ArrayList();
                CollectionsKt.sortWith(arrayList, C32949a.f84774a);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = arrayList.get(i);
                    Intrinsics.checkExpressionValueIsNotNull(obj, "reactionInfos[i]");
                    arrayList2.add(((ReactionInfo) obj).getReaction());
                    if (i == 2) {
                        break;
                    }
                }
                return arrayList2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.chat.entity.reaction.ReactionInfo> /* = java.util.ArrayList<com.ss.android.lark.chat.entity.reaction.ReactionInfo> */");
        }

        @JvmStatic
        /* renamed from: c */
        public final List<CharSequence> mo121767c(List<? extends MessageInfo> list) {
            if (list == null || CollectionUtils.isEmpty(list)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (MessageInfo messageInfo : list) {
                if (messageInfo == null || messageInfo.getMessage() == null) {
                    Log.m165382e("messageInfo == null || messageInfo.getMessage() == null");
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String a = C34340h.m133174a(messageInfo.getMessageSender(), ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
                    spannableStringBuilder.append((CharSequence) a);
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    CharSequence a2 = C34349o.m133205a(b.mo134528a(), messageInfo, true);
                    if (!TextUtils.isEmpty(a2)) {
                        spannableStringBuilder.append((CharSequence) ": ").append(a2);
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, a.length() + 1, 33);
                    } else {
                        spannableStringBuilder.setSpan(new StyleSpan(1), 0, a.length(), 33);
                    }
                    if (!TextUtils.isEmpty(spannableStringBuilder)) {
                        arrayList.add(spannableStringBuilder);
                    }
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final void mo121763a(Map<Message.Type, List<IMsgVOConverter<?>>> map, IMsgVOConverter<?> dVar) {
            ArrayList arrayList = map.get(dVar.mo122452a());
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(dVar.mo122452a(), arrayList);
            }
            arrayList.add(dVar);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "o1", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.base.view.vo.ThreadMessageVO$b$a */
        public static final class C32949a<T> implements Comparator<ReactionInfo> {

            /* renamed from: a */
            public static final C32949a f84774a = new C32949a();

            C32949a() {
            }

            /* renamed from: a */
            public final int compare(ReactionInfo reactionInfo, ReactionInfo reactionInfo2) {
                Intrinsics.checkExpressionValueIsNotNull(reactionInfo, "o1");
                Map<String, ChatChatter> reactionChatters = reactionInfo.getReactionChatters();
                Intrinsics.checkExpressionValueIsNotNull(reactionInfo2, "o2");
                Map<String, ChatChatter> reactionChatters2 = reactionInfo2.getReactionChatters();
                if (reactionChatters == null && reactionChatters2 == null) {
                    return 0;
                }
                if (reactionChatters == null) {
                    return 1;
                }
                if (reactionChatters2 == null) {
                    return -1;
                }
                return reactionChatters2.size() - reactionChatters.size();
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo121764a(ThreadTopic threadTopic, Message message) {
            if (threadTopic.getAnonymousId() == null || TextUtils.isEmpty(threadTopic.getAnonymousId())) {
                return false;
            }
            return TextUtils.equals(threadTopic.getAnonymousId(), message.getFromId());
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo121765a(List<? extends ReactionInfo> list, String str) {
            if (CollectionUtils.isNotEmpty(list)) {
                return C35249h.m137636a(list, "THUMBSUP", str);
            }
            return false;
        }

        @JvmStatic
        /* renamed from: a */
        public final ThreadMessageVO<?> mo121759a(ThreadInfo threadInfo, String str, int i, boolean z, boolean z2, String str2, boolean z3) {
            Intrinsics.checkParameterIsNotNull(threadInfo, "threadInfo");
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(str2, "threadLocation");
            return mo121760a(threadInfo, str, i, false, z, z2, str2, z3);
        }

        /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: com.ss.android.lark.chat.base.view.vo.ThreadMessageVO<T extends com.ss.android.lark.chat.export.vo.a<?>>, com.ss.android.lark.chat.base.view.vo.ThreadMessageVO<?> */
        @JvmStatic
        /* renamed from: a */
        public final ThreadMessageVO<?> mo121760a(ThreadInfo threadInfo, String str, int i, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            ThreadStateInfo.ThreadState state;
            Intrinsics.checkParameterIsNotNull(threadInfo, "threadInfo");
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(str2, "threadLocation");
            ChatChatter a = threadInfo.mo126011a();
            ThreadTopic b = threadInfo.mo126018b();
            Message c = threadInfo.mo126021c();
            List<ReactionInfo> reactionInfoList = threadInfo.getReactionInfoList();
            Builder aVar = new Builder();
            String id = a.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "owner.getId()");
            Builder<T> c2 = aVar.mo121735c(id);
            String avatarKey = a.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "owner.getAvatarKey()");
            String a2 = C34340h.m133174a(a, ChatterNameDisplayRule.ALIAS_NICKNAME_NAME);
            Intrinsics.checkExpressionValueIsNotNull(a2, "ChatterNameUtil.getDispl…Rule.ALIAS_NICKNAME_NAME)");
            Intrinsics.checkExpressionValueIsNotNull(b, "threadTopic");
            String id2 = b.getId();
            Intrinsics.checkExpressionValueIsNotNull(id2, "threadTopic.id");
            String id3 = b.getId();
            Intrinsics.checkExpressionValueIsNotNull(id3, "threadTopic.id");
            Builder<T> d = ((Builder) ((Builder) ((Builder) c2.mo124173m(avatarKey)).mo124171l(a2)).mo124162h(id2)).mo121739d(id3);
            Intrinsics.checkExpressionValueIsNotNull(c, "rootMsg");
            Builder<T> a3 = ((Builder) d.mo124151b(c.getCreateTime() * ((long) 1000))).mo121726a(b.isFollow());
            SendStatus sendStatus = c.getSendStatus();
            Intrinsics.checkExpressionValueIsNotNull(sendStatus, "rootMsg.sendStatus");
            Companion bVar = this;
            String topic = b.getTopic();
            Intrinsics.checkExpressionValueIsNotNull(topic, "threadTopic.topic");
            Builder<T> b2 = ((Builder) ((Builder) ((Builder) ((Builder) a3.mo124149a(sendStatus)).mo121719a(bVar.mo121766b(reactionInfoList)).mo124160g(b.getReplyCount())).mo124158f(b.getBadgeCount())).mo124155e(b.getPosition())).mo121724a(topic).mo121725a(c.getReadAtChatterIds()).mo121731b(c.getAtBotIds());
            Message.Type type = c.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "rootMsg.type");
            Builder aVar2 = (Builder) ((Builder) b2.mo124147a(type)).mo124150a(bVar.mo121761a(threadInfo));
            boolean z10 = true;
            if (c.getStatus() == Message.Status.DELETED) {
                z5 = true;
            } else {
                z5 = false;
            }
            Builder aVar3 = (Builder) aVar2.mo124181t(z5);
            if (c.isFromMe() || bVar.mo121764a(b, c)) {
                z6 = true;
            } else {
                z6 = false;
            }
            Builder<T> g = ((Builder) aVar3.mo124179s(z6)).mo121747g(c.isPreMessage());
            String chatId = c.getChatId();
            Intrinsics.checkExpressionValueIsNotNull(chatId, "rootMsg.chatId");
            String str3 = c.getcId();
            Intrinsics.checkExpressionValueIsNotNull(str3, "rootMsg.getcId()");
            String fromId = c.getFromId();
            Intrinsics.checkExpressionValueIsNotNull(fromId, "rootMsg.fromId");
            Builder aVar4 = (Builder) ((Builder) ((Builder) ((Builder) g.mo124166j(chatId)).mo121736c(bVar.mo121762a(reactionInfoList)).mo121740d(bVar.mo121767c(threadInfo.mo126023e())).mo121732b(threadInfo.isNoTraceDelete()).mo121743e(c.isSourceFileDelete()).mo124148a(threadInfo.getPin())).mo124164i(str3)).mo124168k(fromId);
            ThreadStateInfo stateInfo = b.getStateInfo();
            if (stateInfo == null || (state = stateInfo.getState()) == null) {
                z7 = false;
            } else {
                z7 = state.equals(ThreadStateInfo.ThreadState.CLOSED);
            }
            Builder<T> b3 = aVar4.mo121737c(z7).mo121741d(bVar.mo121765a(reactionInfoList, str)).mo121745f(threadInfo.mo126022d()).mo121723a(c).mo121722a(a).mo121728b(i);
            Chat j = threadInfo.mo126028j();
            if (j != null) {
                z8 = j.isPublic();
            } else {
                z8 = false;
            }
            Builder<T> h = b3.mo121748h(z8);
            Chat j2 = threadInfo.mo126028j();
            if (j2 != null) {
                z9 = j2.isCrossTenant();
            } else {
                z9 = false;
            }
            Builder<T> p = ((Builder) h.mo121749i(z9).mo121721a(threadInfo.mo126028j()).mo121750j(C34339g.m133167a(threadInfo.mo126028j())).mo121751k(z).mo121730b(threadInfo.mo126026h()).mo121752l(c.isMeRead()).mo121733c(2).mo121729b(threadInfo.getOriginalSender()).mo121753m(z2).mo121754n(z3).mo121742e(str2).mo121755o(z4).mo124156e(reactionInfoList)).mo121734c(bVar.mo121768d(threadInfo.mo126024f())).mo121738d(bVar.mo121769e(threadInfo.mo126024f())).mo121756p(!CollectionUtils.isEmpty(threadInfo.mo126024f()));
            ThreadTopic b4 = threadInfo.mo126018b();
            Intrinsics.checkExpressionValueIsNotNull(b4, "threadInfo.threadTopic");
            Builder<T> f = p.mo121720a(b4.getFilterRankTime()).mo121744f(threadInfo.mo126029k());
            ThreadTopic b5 = threadInfo.mo126018b();
            Intrinsics.checkExpressionValueIsNotNull(b5, "threadInfo.threadTopic");
            Builder<T> g2 = f.mo121746g(b5.getAnonymousId());
            ThreadTopic b6 = threadInfo.mo126018b();
            Intrinsics.checkExpressionValueIsNotNull(b6, "threadInfo.threadTopic");
            Builder<T> q = g2.mo121757q(b6.isAnonymousEnable());
            Message message = threadInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "threadInfo.getMessage()");
            if (message.getRecallerIdentity() != Message.RecallerIdentity.GROUP_ADMIN) {
                z10 = false;
            }
            return (ThreadMessageVO<T>) q.mo121758r(z10).mo121727a();
        }
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: A */
    public Message.Status mo121655A() {
        return this.f84722t;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: B */
    public SendStatus mo121656B() {
        return this.f84723u;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: C */
    public C33973b mo121657C() {
        return this.f84724v;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: D */
    public List<ReactionInfo> mo121658D() {
        return this.f84725w;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: E */
    public Pin mo121659E() {
        return this.f84726x;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: F */
    public boolean mo121660F() {
        return this.f84727y;
    }

    /* renamed from: G */
    public final String mo121661G() {
        return this.f84728z;
    }

    /* renamed from: H */
    public final String mo121662H() {
        return this.f84680A;
    }

    /* renamed from: I */
    public final boolean mo121663I() {
        return this.f84681B;
    }

    /* renamed from: J */
    public final boolean mo121664J() {
        return this.f84686G;
    }

    /* renamed from: K */
    public final List<Reaction> mo121665K() {
        return this.f84687H;
    }

    /* renamed from: L */
    public final List<CharSequence> mo121666L() {
        return this.f84688I;
    }

    /* renamed from: M */
    public final boolean mo121667M() {
        return this.f84689J;
    }

    /* renamed from: N */
    public final boolean mo121668N() {
        return this.f84690K;
    }

    /* renamed from: O */
    public final boolean mo121669O() {
        return this.f84691L;
    }

    /* renamed from: P */
    public final boolean mo121670P() {
        return this.f84692M;
    }

    /* renamed from: Q */
    public final Message mo121671Q() {
        return this.f84694O;
    }

    /* renamed from: R */
    public final ChatChatter mo121672R() {
        return this.f84695P;
    }

    /* renamed from: S */
    public final int mo121673S() {
        return this.f84696Q;
    }

    /* renamed from: T */
    public final boolean mo121674T() {
        return this.f84698S;
    }

    /* renamed from: U */
    public final boolean mo121675U() {
        return this.f84699T;
    }

    /* renamed from: V */
    public final Chat mo121676V() {
        return this.f84701V;
    }

    /* renamed from: W */
    public final boolean mo121677W() {
        return this.f84702W;
    }

    /* renamed from: X */
    public final boolean mo121678X() {
        return this.f84703X;
    }

    /* renamed from: Y */
    public final String mo121679Y() {
        return this.f84704Y;
    }

    /* renamed from: Z */
    public final int mo121680Z() {
        return this.aa;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: a */
    public String mo121681a() {
        return this.f84706d;
    }

    public final boolean aa() {
        return this.ab;
    }

    public final List<C55987b> ab() {
        return this.ac;
    }

    public final ChatChatter ac() {
        return this.ad;
    }

    public final boolean ad() {
        return this.af;
    }

    public final boolean ae() {
        return this.ag;
    }

    public final String af() {
        return this.ah;
    }

    public final boolean ag() {
        return this.f175447ai;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: b */
    public String mo121692b() {
        return this.f84708f;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: c */
    public boolean mo121695c() {
        return this.f84710h;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: d */
    public String mo121696d() {
        return this.f84707e;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: e */
    public String mo121697e() {
        return this.f84709g;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenThreadMessageVO
    /* renamed from: o */
    public String mo121707o() {
        return this.f84680A;
    }

    /* renamed from: q */
    public final boolean mo121709q() {
        return this.ap;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: r */
    public Message.Type mo121710r() {
        return this.f84712j;
    }

    /* renamed from: s */
    public String mo121711s() {
        return this.f84713k;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: t */
    public String mo121712t() {
        return this.f84714l;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: u */
    public boolean mo121713u() {
        return this.f84715m;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: v */
    public boolean mo121714v() {
        return this.f84716n;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: w */
    public int mo121715w() {
        return this.f84717o;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: x */
    public long mo121716x() {
        return this.f84718p;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: y */
    public int mo121717y() {
        return this.f84719q;
    }

    @Override // com.ss.android.lark.chat.vo.AbsMessageVO
    /* renamed from: z */
    public int mo121718z() {
        return this.f84720r;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.reaction.ReactionInfo> */
    /* JADX DEBUG: Multi-variable search result rejected for r47v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.reaction.Reaction> */
    /* JADX DEBUG: Multi-variable search result rejected for r48v0, resolved type: java.util.List<? extends java.lang.CharSequence> */
    /* JADX DEBUG: Multi-variable search result rejected for r68v0, resolved type: java.util.List<? extends com.ss.android.lark.threadtab.view.a.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public ThreadMessageVO(String str, String str2, String str3, String str4, boolean z, T t, Message.Type type, String str5, String str6, boolean z2, boolean z3, int i, long j, int i2, int i3, boolean z4, Message.Status status, SendStatus sendStatus, C33973b bVar, List<? extends ReactionInfo> list, Pin pin, boolean z5, String str7, String str8, boolean z6, String str9, int i4, List<String> list2, List<String> list3, boolean z7, List<? extends Reaction> list4, List<? extends CharSequence> list5, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Message message, ChatChatter chatChatter, int i5, boolean z13, boolean z14, boolean z15, boolean z16, Chat chat, boolean z17, boolean z18, String str10, boolean z19, int i6, boolean z20, List<? extends C55987b> list6, ChatChatter chatChatter2, boolean z21, boolean z22, boolean z23, String str11, boolean z24, ChatChatter chatChatter3, int i7, boolean z25, long j2, String str12, String str13, boolean z26) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "cId");
        Intrinsics.checkParameterIsNotNull(str3, "chatId");
        Intrinsics.checkParameterIsNotNull(str4, "fromId");
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str5, "fromAvatarKey");
        Intrinsics.checkParameterIsNotNull(str6, "fromName");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(sendStatus, "sendStatus");
        Intrinsics.checkParameterIsNotNull(str7, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str8, "threadId");
        Intrinsics.checkParameterIsNotNull(str9, "title");
        Intrinsics.checkParameterIsNotNull(str11, "threadLocation");
        this.f84706d = str;
        this.f84707e = str2;
        this.f84708f = str3;
        this.f84709g = str4;
        this.f84710h = z;
        this.f84711i = t;
        this.f84712j = type;
        this.f84713k = str5;
        this.f84714l = str6;
        this.f84715m = z2;
        this.f84716n = z3;
        this.f84717o = i;
        this.f84718p = j;
        this.f84719q = i2;
        this.f84720r = i3;
        this.f84721s = z4;
        this.f84722t = status;
        this.f84723u = sendStatus;
        this.f84724v = bVar;
        this.f84725w = list;
        this.f84726x = pin;
        this.f84727y = z5;
        this.f84728z = str7;
        this.f84680A = str8;
        this.f84681B = z6;
        this.f84682C = str9;
        this.f84683D = i4;
        this.f84684E = list2;
        this.f84685F = list3;
        this.f84686G = z7;
        this.f84687H = list4;
        this.f84688I = list5;
        this.f84689J = z8;
        this.f84690K = z9;
        this.f84691L = z10;
        this.f84692M = z11;
        this.f84693N = z12;
        this.f84694O = message;
        this.f84695P = chatChatter;
        this.f84696Q = i5;
        this.f84697R = z13;
        this.f84698S = z14;
        this.f84699T = z15;
        this.f84700U = z16;
        this.f84701V = chat;
        this.f84702W = z17;
        this.f84703X = z18;
        this.f84704Y = str10;
        this.f84705Z = z19;
        this.aa = i6;
        this.ab = z20;
        this.ac = list6;
        this.ad = chatChatter2;
        this.ae = z21;
        this.af = z22;
        this.ag = z23;
        this.ah = str11;
        this.f175447ai = z24;
        this.aj = chatChatter3;
        this.ak = i7;
        this.al = z25;
        this.am = j2;
        this.an = str12;
        this.ao = str13;
        this.ap = z26;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: g */
    public T mo121699g() {
        T t = this.f84711i;
        if (t == null) {
            Intrinsics.throwNpe();
        }
        return t;
    }

    @Override // com.ss.android.lark.chat.export.vo.OpenMessageVO
    /* renamed from: f */
    public boolean mo121698f() {
        if (mo121655A() == Message.Status.DELETED) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo121708p() {
        if (this.aa == 2) {
            return true;
        }
        return false;
    }

    static {
        HashMap hashMap = new HashMap();
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36458af F = b.mo134507F();
        Intrinsics.checkExpressionValueIsNotNull(F, "ChatModuleInstanceHolder…pendency().openDependency");
        List<IOpenMessageCellFactory> a = F.mo134428a();
        if (!CollectionUtils.isEmpty(a)) {
            for (IOpenMessageCellFactory dVar : a) {
                f84679c.mo121763a(hashMap, new C33345b(dVar.mo120405b()));
            }
        }
        Companion bVar = f84679c;
        HashMap hashMap2 = hashMap;
        bVar.mo121763a(hashMap2, ar);
        bVar.mo121763a(hashMap2, aq);
        bVar.mo121763a(hashMap2, aB);
        bVar.mo121763a(hashMap2, au);
        bVar.mo121763a(hashMap2, as);
        bVar.mo121763a(hashMap2, at);
        bVar.mo121763a(hashMap2, ax);
        bVar.mo121763a(hashMap2, ay);
        bVar.mo121763a(hashMap2, az);
        bVar.mo121763a(hashMap2, aA);
        bVar.mo121763a(hashMap2, av);
        bVar.mo121763a(hashMap2, aw);
        f84678b = hashMap2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bJ\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001a\u00020$J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0007J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\tJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u0007J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u0007J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0007J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u0007J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0007J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u0007J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u0007J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0007J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u0007J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0007J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u0007J\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u0007J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\"\u001a\u00020\u0007J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010#\u001a\u00020$J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000bJ\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000bJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010,\u001a\u00020\u0007J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010-\u001a\u0004\u0018\u00010'J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010.\u001a\u00020/J\u0014\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00100\u001a\u00020$J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010@\u001a\u0004\u0018\u000102J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00103\u001a\u00020\u0007J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u0007J\u0014\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00105\u001a\u00020\u0007J\u001c\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u000bJ\u0014\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00108\u001a\u00020\tJ\u0014\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00109\u001a\u00020\tJ\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010:\u001a\u0004\u0018\u00010'J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\tJ\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010<\u001a\u00020$R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO$Builder;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/vo/AbsMessageVO$Builder;", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "()V", "anonymousEnable", "", "anonymousId", "", "atReadUserIdList", "", "botIdList", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", BottomDialog.f17198f, "currentUserIsChatOwner", "filterId", "hasAtMessage", "hasLikeReaction", "hasMoreRecommend", "impressionId", "isClosed", "isFollow", "isFromCrossTenantChat", "isFromDefaultGroup", "isFromPublicChat", "isInTab", "isMeRead", "isNoTraceDelete", "isParticipantRole", "isPreThread", "isRecalledByAdmin", "isSelected", "isTopicGroupAdmin", "itemType", "", "lastAtMessageAtType", "lastAtMessageSender", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "lastReplys", "", "mostUseReactions", "Lcom/ss/android/lark/chat/entity/reaction/Reaction;", "needAutoTranslate", "originalSender", "rankTime", "", "reactionCount", "rootMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "scrollToStart", "showNewMessageTips", "sourceFileIsDelete", "threadChats", "Lcom/ss/android/lark/threadtab/view/bean/ThreadChatUIItem;", "threadId", "threadLocation", "threadOwner", "title", "topicTabType", "build", "getLastAtMessageSender", "getLastAtMessageType", "message", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.ThreadMessageVO$a */
    public static final class Builder<T extends ContentVO<?>> extends AbsMessageVO.Builder<T, ThreadMessageVO<T>, Builder<T>> {

        /* renamed from: A */
        private String f84730A = "";

        /* renamed from: B */
        private boolean f84731B;

        /* renamed from: C */
        private List<? extends C55987b> f84732C;

        /* renamed from: D */
        private String f84733D = "";

        /* renamed from: E */
        private ChatChatter f84734E;

        /* renamed from: F */
        private boolean f84735F;

        /* renamed from: G */
        private boolean f84736G;

        /* renamed from: H */
        private boolean f84737H;

        /* renamed from: I */
        private String f84738I = "";

        /* renamed from: J */
        private boolean f84739J;

        /* renamed from: K */
        private ChatChatter f84740K;

        /* renamed from: L */
        private int f84741L;

        /* renamed from: M */
        private boolean f84742M;

        /* renamed from: N */
        private long f84743N = Long.MAX_VALUE;

        /* renamed from: O */
        private String f84744O = "";

        /* renamed from: P */
        private String f84745P = "";

        /* renamed from: Q */
        private boolean f84746Q;

        /* renamed from: R */
        private boolean f84747R;

        /* renamed from: a */
        private boolean f84748a;

        /* renamed from: b */
        private String f84749b = "";

        /* renamed from: c */
        private int f84750c;

        /* renamed from: d */
        private List<String> f84751d;

        /* renamed from: e */
        private List<String> f84752e;

        /* renamed from: f */
        private boolean f84753f;

        /* renamed from: g */
        private List<? extends Reaction> f84754g;

        /* renamed from: h */
        private List<? extends CharSequence> f84755h;

        /* renamed from: i */
        private boolean f84756i;

        /* renamed from: j */
        private boolean f84757j;

        /* renamed from: k */
        private boolean f84758k;

        /* renamed from: l */
        private boolean f84759l;

        /* renamed from: m */
        private boolean f84760m;

        /* renamed from: n */
        private Message f84761n;

        /* renamed from: o */
        private ChatChatter f84762o;

        /* renamed from: p */
        private int f84763p;

        /* renamed from: q */
        private boolean f84764q;

        /* renamed from: r */
        private boolean f84765r;

        /* renamed from: s */
        private boolean f84766s;

        /* renamed from: t */
        private boolean f84767t;

        /* renamed from: u */
        private Chat f84768u;

        /* renamed from: v */
        private boolean f84769v;

        /* renamed from: w */
        private boolean f84770w;

        /* renamed from: x */
        private String f84771x;

        /* renamed from: y */
        private boolean f84772y;

        /* renamed from: z */
        private int f84773z = 2;

        /* renamed from: a */
        public ThreadMessageVO<T> mo121727a() {
            String str;
            String str2;
            String str3;
            String str4;
            String b = mo124152b();
            if (b != null) {
                str = b;
            } else {
                str = "";
            }
            String c = mo124153c();
            if (c != null) {
                str2 = c;
            } else {
                str2 = "";
            }
            Message.Type d = mo124154d();
            if (d == null) {
                d = Message.Type.UNKNOWN;
            }
            String e = mo124157e();
            if (e != null) {
                str3 = e;
            } else {
                str3 = "";
            }
            String f = mo124159f();
            if (f != null) {
                str4 = f;
            } else {
                str4 = "";
            }
            String g = mo124161g();
            String h = mo124163h();
            boolean i = mo124165i();
            boolean j = mo124167j();
            boolean k = mo124169k();
            int l = mo124170l();
            long m = mo124172m();
            int n = mo124174n();
            int o = mo124175o();
            boolean p = mo124176p();
            Message.Status q = mo124177q();
            if (q == null) {
                q = Message.Status.NORMAL;
            }
            SendStatus r = mo124178r();
            C33973b s = mo124180s();
            List<ReactionInfo> t = mo124182t();
            ContentVO u = mo124184u();
            Pin v = mo124186v();
            boolean z = this.f84748a;
            String str5 = this.f84749b;
            int i2 = this.f84750c;
            List<String> list = this.f84751d;
            List<String> list2 = this.f84752e;
            boolean z2 = this.f84753f;
            List<? extends Reaction> list3 = this.f84754g;
            List<? extends CharSequence> list4 = this.f84755h;
            boolean z3 = this.f84756i;
            boolean z4 = this.f84757j;
            boolean z5 = this.f84758k;
            boolean z6 = this.f84759l;
            boolean z7 = this.f84760m;
            Message message = this.f84761n;
            ChatChatter chatChatter = this.f84762o;
            int i3 = this.f84763p;
            boolean z8 = this.f84764q;
            boolean z9 = this.f84765r;
            boolean z10 = this.f84766s;
            boolean z11 = this.f84767t;
            Chat chat = this.f84768u;
            boolean z12 = this.f84769v;
            boolean z13 = this.f84770w;
            String str6 = this.f84771x;
            boolean z14 = this.f84772y;
            int i4 = this.f84773z;
            String str7 = this.f84730A;
            boolean z15 = this.f84731B;
            List<? extends C55987b> list5 = this.f84732C;
            String str8 = this.f84733D;
            ChatChatter chatChatter2 = this.f84734E;
            boolean z16 = this.f84735F;
            boolean z17 = this.f84736G;
            boolean z18 = this.f84737H;
            String str9 = this.f84738I;
            boolean z19 = this.f84739J;
            int i5 = this.f84741L;
            return new ThreadMessageVO<>(str, str2, str3, str4, i, u, d, h, g, j, k, l, m, n, o, p, q, r, s, t, v, this.f84747R, str7, str8, z, str5, i2, list, list2, z2, list3, list4, z3, z4, z5, z6, z7, message, chatChatter, i3, z8, z9, z10, z11, chat, z12, z13, str6, z14, i4, z15, list5, chatChatter2, z16, z17, z18, str9, z19, this.f84740K, i5, this.f84742M, this.f84743N, this.f84744O, this.f84745P, this.f84746Q);
        }

        /* renamed from: a */
        public final Builder<T> mo121719a(int i) {
            Builder<T> aVar = this;
            aVar.f84750c = i;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo121728b(int i) {
            Builder<T> aVar = this;
            aVar.f84763p = i;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo121733c(int i) {
            Builder<T> aVar = this;
            aVar.f84773z = i;
            return aVar;
        }

        /* renamed from: d */
        public final Builder<T> mo121738d(int i) {
            Builder<T> aVar = this;
            aVar.f84741L = i;
            return aVar;
        }

        /* renamed from: e */
        public final Builder<T> mo121743e(boolean z) {
            Builder<T> aVar = this;
            aVar.f84760m = z;
            return aVar;
        }

        /* renamed from: f */
        public final Builder<T> mo121744f(String str) {
            Builder<T> aVar = this;
            aVar.f84744O = str;
            return aVar;
        }

        /* renamed from: g */
        public final Builder<T> mo121746g(String str) {
            Builder<T> aVar = this;
            aVar.f84745P = str;
            return aVar;
        }

        /* renamed from: h */
        public final Builder<T> mo121748h(boolean z) {
            Builder<T> aVar = this;
            aVar.f84766s = z;
            return aVar;
        }

        /* renamed from: i */
        public final Builder<T> mo121749i(boolean z) {
            Builder<T> aVar = this;
            aVar.f84767t = z;
            return aVar;
        }

        /* renamed from: j */
        public final Builder<T> mo121750j(boolean z) {
            Builder<T> aVar = this;
            aVar.f84769v = z;
            return aVar;
        }

        /* renamed from: k */
        public final Builder<T> mo121751k(boolean z) {
            Builder<T> aVar = this;
            aVar.f84770w = z;
            return aVar;
        }

        /* renamed from: l */
        public final Builder<T> mo121752l(boolean z) {
            Builder<T> aVar = this;
            aVar.f84772y = z;
            return aVar;
        }

        /* renamed from: m */
        public final Builder<T> mo121753m(boolean z) {
            Builder<T> aVar = this;
            aVar.f84736G = z;
            return aVar;
        }

        /* renamed from: n */
        public final Builder<T> mo121754n(boolean z) {
            Builder<T> aVar = this;
            aVar.f84737H = z;
            return aVar;
        }

        /* renamed from: o */
        public final Builder<T> mo121755o(boolean z) {
            Builder<T> aVar = this;
            aVar.f84739J = z;
            return aVar;
        }

        /* renamed from: p */
        public final Builder<T> mo121756p(boolean z) {
            Builder<T> aVar = this;
            aVar.f84742M = z;
            return aVar;
        }

        /* renamed from: q */
        public final Builder<T> mo121757q(boolean z) {
            Builder<T> aVar = this;
            aVar.f84746Q = z;
            return aVar;
        }

        /* renamed from: r */
        public final Builder<T> mo121758r(boolean z) {
            Builder<T> aVar = this;
            aVar.f84747R = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121720a(long j) {
            Builder<T> aVar = this;
            aVar.f84743N = j;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo121729b(ChatChatter chatChatter) {
            Builder<T> aVar = this;
            aVar.f84734E = chatChatter;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo121734c(ChatChatter chatChatter) {
            Builder<T> aVar = this;
            aVar.f84740K = chatChatter;
            return aVar;
        }

        /* renamed from: d */
        public final Builder<T> mo121739d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            Builder<T> aVar = this;
            aVar.f84733D = str;
            return aVar;
        }

        /* renamed from: e */
        public final Builder<T> mo121742e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "threadLocation");
            Builder<T> aVar = this;
            aVar.f84738I = str;
            return aVar;
        }

        /* renamed from: f */
        public final Builder<T> mo121745f(boolean z) {
            Builder<T> aVar = this;
            aVar.f84764q = z;
            return aVar;
        }

        /* renamed from: g */
        public final Builder<T> mo121747g(boolean z) {
            Builder<T> aVar = this;
            aVar.f84765r = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121721a(Chat chat) {
            Builder<T> aVar = this;
            aVar.f84768u = chat;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo121730b(String str) {
            Builder<T> aVar = this;
            aVar.f84771x = str;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo121735c(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            Builder<T> aVar = this;
            aVar.f84730A = str;
            return aVar;
        }

        /* renamed from: d */
        public final Builder<T> mo121740d(List<? extends CharSequence> list) {
            Builder<T> aVar = this;
            aVar.f84755h = list;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121722a(ChatChatter chatChatter) {
            Builder<T> aVar = this;
            aVar.f84762o = chatChatter;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo121731b(List<String> list) {
            Builder<T> aVar = this;
            aVar.f84752e = list;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo121736c(List<? extends Reaction> list) {
            Builder<T> aVar = this;
            aVar.f84754g = list;
            return aVar;
        }

        /* renamed from: d */
        public final Builder<T> mo121741d(boolean z) {
            Builder<T> aVar = this;
            aVar.f84759l = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121723a(Message message) {
            Builder<T> aVar = this;
            aVar.f84761n = message;
            return aVar;
        }

        /* renamed from: b */
        public final Builder<T> mo121732b(boolean z) {
            Builder<T> aVar = this;
            aVar.f84757j = z;
            return aVar;
        }

        /* renamed from: c */
        public final Builder<T> mo121737c(boolean z) {
            Builder<T> aVar = this;
            aVar.f84758k = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121724a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Builder<T> aVar = this;
            aVar.f84749b = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121725a(List<String> list) {
            Builder<T> aVar = this;
            aVar.f84751d = list;
            return aVar;
        }

        /* renamed from: a */
        public final Builder<T> mo121726a(boolean z) {
            Builder<T> aVar = this;
            aVar.f84748a = z;
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo121682a(boolean z) {
        this.f84686G = z;
    }

    /* renamed from: b */
    public final void mo121693b(boolean z) {
        this.f84689J = z;
    }

    /* renamed from: a */
    public boolean isItemSame(ThreadMessageVO<?> threadMessageVO) {
        Intrinsics.checkParameterIsNotNull(threadMessageVO, "diffable");
        if (this == threadMessageVO) {
            return true;
        }
        if (mo121708p() && threadMessageVO.mo121708p()) {
            return Intrinsics.areEqual(this.f84706d, threadMessageVO.f84706d);
        }
        if (this.aa == threadMessageVO.aa) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean isContentSame(ThreadMessageVO<?> threadMessageVO) {
        if (threadMessageVO == null) {
            return false;
        }
        int i = this.aa;
        if (i == 1) {
            if (this.ae != threadMessageVO.ae) {
                return false;
            }
            return C26247a.m94982a((List) this.ac, (List) threadMessageVO.ac);
        } else if (i == 3) {
            if (this.ab != threadMessageVO.ab) {
                return false;
            }
            return C26247a.m94982a((List) this.ac, (List) threadMessageVO.ac);
        } else if (!(!Intrinsics.areEqual(mo121711s(), threadMessageVO.mo121711s())) && !(!Intrinsics.areEqual(mo121712t(), threadMessageVO.mo121712t())) && mo121716x() == threadMessageVO.mo121716x() && this.f84681B == threadMessageVO.f84681B && mo121656B() == threadMessageVO.mo121656B() && this.f84683D == threadMessageVO.f84683D && mo121715w() == threadMessageVO.mo121715w() && !(!Intrinsics.areEqual(this.f84682C, threadMessageVO.f84682C)) && !(!Intrinsics.areEqual(this.f84684E, threadMessageVO.f84684E)) && mo121710r() == threadMessageVO.mo121710r() && !(!Intrinsics.areEqual(this.f84711i, threadMessageVO.f84711i)) && this.f84690K == threadMessageVO.f84690K && !(!Intrinsics.areEqual(mo121659E(), threadMessageVO.mo121659E())) && this.f84691L == threadMessageVO.f84691L && this.f84692M == threadMessageVO.f84692M && this.f84697R == threadMessageVO.f84697R && this.f84699T == threadMessageVO.f84699T && this.f84700U == threadMessageVO.f84700U && this.f84702W == threadMessageVO.f84702W && this.f84705Z == threadMessageVO.f84705Z && this.f175447ai == threadMessageVO.f175447ai && this.ak == threadMessageVO.ak && this.al == threadMessageVO.al && !(!Intrinsics.areEqual(this.ao, threadMessageVO.ao)) && this.ap == threadMessageVO.ap && !(!Intrinsics.areEqual(this.f84688I, threadMessageVO.f84688I))) {
            return true;
        } else {
            return false;
        }
    }
}

package com.bytedance.ee.bear.middleground.comment;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.card.AnimatorUtils;
import com.bytedance.ee.bear.middleground.comment.card.CardComment;
import com.bytedance.ee.bear.middleground.comment.card.CardComment2;
import com.bytedance.ee.bear.middleground.comment.card.ICardComment;
import com.bytedance.ee.bear.middleground.comment.control.CommentFuction2;
import com.bytedance.ee.bear.middleground.comment.control.CommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.control.DataControlImpl;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.IComment;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.input.ICommentInput;
import com.bytedance.ee.bear.middleground.comment.input.InputComment;
import com.bytedance.ee.bear.middleground.comment.p449g.AbstractC9234g;
import com.bytedance.ee.bear.middleground.comment.translate.CommentTranslate;
import com.bytedance.ee.bear.middleground.comment.uitls.CommentArea;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.rn.RnCommentProtocol;
import com.bytedance.ee.bear.rn.RnReactionProtocol;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00022\u00020\u00012\u00020\u0002:\u0004\u0002\u0002BÒ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012'\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0\"¢\u0006\u0002\u0010(J\u0013\u0010Þ\u0001\u001a\u00020\u00102\b\u0010ß\u0001\u001a\u00030à\u0001H\u0016J\u0012\u0010á\u0001\u001a\u00020'2\u0007\u0010â\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010ã\u0001\u001a\u00020'2\u0007\u0010ä\u0001\u001a\u00020\u00102\u0007\u0010â\u0001\u001a\u00020\u0010H\u0016J\u0013\u0010å\u0001\u001a\u00020'2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\t\u0010æ\u0001\u001a\u00020'H\u0016J\u0007\u0010ç\u0001\u001a\u00020'J\t\u0010è\u0001\u001a\u00020'H\u0016J\u0010\u0010é\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0ê\u0001H\u0016J\t\u0010ë\u0001\u001a\u00020yH\u0016J\t\u0010ì\u0001\u001a\u00020rH\u0016J\u0012\u0010í\u0001\u001a\u00020w2\u0007\u0010î\u0001\u001a\u00020BH\u0002J\t\u0010ï\u0001\u001a\u00020\u0010H\u0002J\t\u0010ð\u0001\u001a\u00020\u0010H\u0016J\u0012\u0010ñ\u0001\u001a\u00020\u00102\u0007\u0010ä\u0001\u001a\u00020\u0010H\u0016J\t\u0010ò\u0001\u001a\u00020'H\u0016J\u001e\u0010ó\u0001\u001a\u00020'2\u0013\u0010ô\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020'0\"H\u0016J\u0012\u0010õ\u0001\u001a\u00020'2\u0007\u0010ö\u0001\u001a\u00020\u0010H\u0016J\u001b\u0010÷\u0001\u001a\u00020'2\u0007\u0010ø\u0001\u001a\u00020\u00102\u0007\u0010ù\u0001\u001a\u00020\u0010H\u0016J#\u0010ú\u0001\u001a\u00020'2\u0007\u0010û\u0001\u001a\u00020\u000b2\t\u0010\u0001\u001a\u0004\u0018\u00010rH\u0016¢\u0006\u0003\u0010ü\u0001J\u0012\u0010ý\u0001\u001a\u00020'2\t\u0010þ\u0001\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010ÿ\u0001\u001a\u00020'2\u000f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u0001H\u0016J\t\u0010\u0002\u001a\u00020'H\u0016J\u0011\u0010\u0002\u001a\u00020'2\u0006\u0010Z\u001a\u00020\u000bH\u0016J\u0011\u0010\u0002\u001a\u00020'2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\u0002\u001a\u00020'2\u0007\u0010\u0002\u001a\u00020\u000eH\u0016R\u001a\u0010)\u001a\u00020*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020'\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R \u00108\u001a\b\u0012\u0004\u0012\u00020'09X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010>\u001a\b\u0012\u0004\u0012\u00020'09X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R5\u0010A\u001a\u001d\u0012\u0013\u0012\u00110B¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010H\u001a\b\u0012\u0004\u0012\u00020'09X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010=R5\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010E\"\u0004\bN\u0010GR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010E\"\u0004\bQ\u0010GR \u0010R\u001a\b\u0012\u0004\u0012\u00020'09X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010;\"\u0004\bT\u0010=R5\u0010U\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020\u00100\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010E\"\u0004\bX\u0010GR5\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010E\"\u0004\b\\\u0010GR5\u0010]\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR\u000e\u0010a\u001a\u00020bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u00020dX\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u001c\u0010g\u001a\u0004\u0018\u00010hX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR5\u0010m\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(n\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010E\"\u0004\bp\u0010GR5\u0010q\u001a\u001d\u0012\u0013\u0012\u00110r¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(s\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010E\"\u0004\bu\u0010GR\u0010\u0010v\u001a\u0004\u0018\u00010wX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020yX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020{X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000RL\u0010|\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(Z\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(n\u0012\u0004\u0012\u00020'0}X\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R9\u0010\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010E\"\u0005\b\u0001\u0010GR\u000e\u0010\u001e\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R0\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001@VX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R0\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001@VX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R1\u0010\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020'0}X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0001\u0010\"\u0006\b\u0001\u0010\u0001R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R:\u0010\u0001\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010E\"\u0005\b\u0001\u0010GR9\u0010\u0001\u001a\u001e\u0012\u0014\u0012\u00120r¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010E\"\u0005\b\u0001\u0010GR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0001\u0010\u0001\u001ar\u0012m\u0012k\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(n\u0012\u001d\u0012\u001b\u0012\u0005\u0012\u00030\u0001\u0018\u00010#¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b( \u0001\u0012\u0016\u0012\u0014\u0018\u00010\u000b¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020'0\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R#\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020'09X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010;\"\u0005\b¨\u0001\u0010=R#\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u001009X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010;\"\u0005\b«\u0001\u0010=R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000f\u0010¬\u0001\u001a\u00020\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R)\u0010­\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010E\"\u0005\b¯\u0001\u0010GR8\u0010°\u0001\u001a\u001b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020'0±\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R<\u0010¶\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010·\u0001¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(¸\u0001\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010E\"\u0005\bº\u0001\u0010GR\u001f\u0010»\u0001\u001a\u00020rX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R)\u0010À\u0001\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010E\"\u0005\bÂ\u0001\u0010GR\u0010\u0010Ã\u0001\u001a\u00030Ä\u0001X\u0004¢\u0006\u0002\n\u0000R=\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010E\"\u0005\bÆ\u0001\u0010GR\u001f\u0010Ç\u0001\u001a\u0004\u0018\u00010hX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010j\"\u0005\bÉ\u0001\u0010lR8\u0010Ê\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u00100\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010E\"\u0005\bÌ\u0001\u0010GRO\u0010Í\u0001\u001a3\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(n\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(Î\u0001\u0012\u0004\u0012\u00020'0}X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\bÏ\u0001\u0010\"\u0006\bÐ\u0001\u0010\u0001R\u000e\u0010\u0019\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R8\u0010Ñ\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0001\u0010E\"\u0005\bÓ\u0001\u0010GR\u000e\u0010\u0018\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R1\u0010Ô\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020'0\"X\u0004¢\u0006\t\n\u0000\u001a\u0005\bÕ\u0001\u0010ER8\u0010Ö\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020'0\"X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010E\"\u0005\bØ\u0001\u0010GR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000RX\u0010Ù\u0001\u001a;\u00126\u00124\u0012\u0014\u0012\u00120r¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(Ú\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b$\u0012\t\b%\u0012\u0005\b\b(Û\u0001\u0012\u0004\u0012\u00020'0}0\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÜ\u0001\u0010£\u0001\"\u0006\bÝ\u0001\u0010¥\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/Comment;", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "Lcom/bytedance/ee/bear/middleground/comment/export/IComment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "viewParent", "Landroid/widget/FrameLayout;", "imageViewerParent", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "token", "", "docUrl", "pageType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "isWiki", "", "subFileType", "commentType", "", "styleType", "per", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "showReaction", "showInsertImage", "showCommentImage", "keyboardHeightProvider", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "newCardUi", "audioAvailable", "enableFontScale", "isOwner", "Lcom/bytedance/ee/bear/middleground/comment/uitls/IsOwner;", "readMessage", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "messageIds", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocumentType;ZLjava/lang/String;JJLcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;ZZZLcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;ZZZLcom/bytedance/ee/bear/middleground/comment/uitls/IsOwner;Lkotlin/jvm/functions/Function1;)V", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "getActionControl", "()Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "setActionControl", "(Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;)V", "atOpenOrCloseListener", "backPressDispatcher", "Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "getBackPressDispatcher", "()Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "setBackPressDispatcher", "(Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;)V", "cardWindow", "Lcom/bytedance/ee/bear/middleground/comment/card/ICardComment;", "clickArea", "Lkotlin/Function0;", "getClickArea", "()Lkotlin/jvm/functions/Function0;", "setClickArea", "(Lkotlin/jvm/functions/Function0;)V", "clickBack", "getClickBack", "setClickBack", "clickEditInNewCard", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "inputRequest", "getClickEditInNewCard", "()Lkotlin/jvm/functions/Function1;", "setClickEditInNewCard", "(Lkotlin/jvm/functions/Function1;)V", "clickImage", "getClickImage", "setClickImage", "clickLink", "linkStr", "getClickLink", "setClickLink", "clickReplyInReaction", "getClickReplyInReaction", "setClickReplyInReaction", "clickResolve", "getClickResolve", "setClickResolve", "clickUserImg", "userId", "getClickUserImg", "setClickUserImg", "closeFull", "commentId", "getCloseFull", "setCloseFull", "closeListener", "hasAnin", "getCloseListener", "setCloseListener", "commentProtocol", "Lcom/bytedance/ee/bear/rn/RnCommentProtocol;", "configComment", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "getConfigComment", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "copyListener", "content", "getCopyListener", "setCopyListener", "countChange", "", "count", "getCountChange", "setCountChange", "createWindow", "Lcom/bytedance/ee/bear/middleground/comment/input/ICommentInput;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "dispose", "Lio/reactivex/disposables/CompositeDisposable;", "editIng", "Lkotlin/Function2;", "getEditIng", "()Lkotlin/jvm/functions/Function2;", "setEditIng", "(Lkotlin/jvm/functions/Function2;)V", "editListener", "isShow", "getEditListener", "setEditListener", "value", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "enterAnimator", "getEnterAnimator", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "setEnterAnimator", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;)V", "exitAnimator", "getExitAnimator", "setExitAnimator", "filterData", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "getFilterData", "setFilterData", "gotoProfile", "getGotoProfile", "setGotoProfile", "heightChange", "height", "getHeightChange", "setHeightChange", "inputViewClose", "", "Lkotlin/Function4;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "images", "bySend", "tmpId", "getInputViewClose", "()Ljava/util/List;", "setInputViewClose", "(Ljava/util/List;)V", "inputViewShow", "getInputViewShow", "setInputViewShow", "interceptMaskClick", "getInterceptMaskClick", "setInterceptMaskClick", "mIListeners", "newCommentId", "getNewCommentId", "setNewCommentId", "onActivateImageChange", "Lkotlin/Function3;", "getOnActivateImageChange", "()Lkotlin/jvm/functions/Function3;", "setOnActivateImageChange", "(Lkotlin/jvm/functions/Function3;)V", "onMentionSelect", "Lcom/bytedance/ee/bear/bean/At;", "at", "getOnMentionSelect", "setOnMentionSelect", "operationPosition", "getOperationPosition", "()I", "setOperationPosition", "(I)V", "reactionAddListener", "getReactionAddListener", "setReactionAddListener", "reactionProtocol", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol;", "getReadMessage", "setReadMessage", "rootView", "getRootView", "setRootView", "sameLink", "getSameLink", "setSameLink", "sendListener", "isSuccess", "getSendListener", "setSendListener", "showFull", "getShowFull", "setShowFull", "switchCard", "getSwitchCard", "switchListener", "getSwitchListener", "setSwitchListener", "topLocationChange", "y", "isWhole", "getTopLocationChange", "setTopLocationChange", "addToDispose", "disposable", "Lio/reactivex/disposables/Disposable;", "closeCard", "showAnimation", "closeComment", "cardIgnore", "createNewComment", "destroy", "dismissInputComment", "dismissReaction", "fetchCommentFlowable", "Lio/reactivex/Flowable;", "getDataControl", "getOperatePosition", "initInputComment", "arg", "inputCommentShouldFull", "isCardShowing", "isShowing", "registerReactionObserver", "setAtListener", "listener", "setInputCommentFullClick", "fullClick", "showArea", "visibility", "isHighLight", "showComment", "createId", "(Ljava/lang/String;Ljava/lang/Integer;)V", "updateAppid", "appId", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "updatePanelView", "updateTargetId", "updateToken", "updateType", ShareHitPoint.f121869d, "Build", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.a */
public final class Comment implements ICommentListeners, IComment {

    /* renamed from: e */
    public static final String f24093e = f24093e;

    /* renamed from: f */
    public static final Companion f24094f = new Companion(null);

    /* renamed from: A */
    private Function0<Unit> f24095A;

    /* renamed from: B */
    private List<Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit>> f24096B;

    /* renamed from: C */
    private Function1<? super Integer, Unit> f24097C;

    /* renamed from: D */
    private Function0<Unit> f24098D;

    /* renamed from: E */
    private List<Function2<Integer, Boolean, Unit>> f24099E;

    /* renamed from: F */
    private Function1<? super String, Boolean> f24100F;

    /* renamed from: G */
    private Function1<? super String, Boolean> f24101G;

    /* renamed from: H */
    private Function1<? super String, Unit> f24102H;

    /* renamed from: I */
    private Function1<? super String, Unit> f24103I;

    /* renamed from: J */
    private Function2<? super String, ? super Boolean, Unit> f24104J;

    /* renamed from: K */
    private Function1<? super Boolean, Unit> f24105K;

    /* renamed from: L */
    private Function2<? super String, ? super String, Unit> f24106L;

    /* renamed from: M */
    private Function1<? super Integer, Unit> f24107M;

    /* renamed from: N */
    private Function1<? super String, Unit> f24108N;

    /* renamed from: O */
    private Function0<Unit> f24109O;

    /* renamed from: P */
    private Function1<? super String, Unit> f24110P;

    /* renamed from: Q */
    private Function1<? super String, Unit> f24111Q;

    /* renamed from: R */
    private Function1<? super Boolean, Unit> f24112R;

    /* renamed from: S */
    private Function1<? super String, Unit> f24113S;

    /* renamed from: T */
    private Function1<? super CommentInputRequest, Unit> f24114T;

    /* renamed from: U */
    private Function1<? super View, Unit> f24115U;

    /* renamed from: V */
    private Function0<Unit> f24116V;

    /* renamed from: W */
    private Function1<? super CommentInputRequest, Unit> f24117W;

    /* renamed from: X */
    private Function3<? super String, ? super String, ? super Integer, Unit> f24118X;

    /* renamed from: Y */
    private final FragmentActivity f24119Y;

    /* renamed from: Z */
    private final FrameLayout f24120Z;

    /* renamed from: a */
    public ICardComment f24121a;
    private final FrameLayout aa;
    private final FragmentManager ab;
    private String ac;
    private boolean ad;
    private String ae;
    private final long af;
    private final ICommentPermission ag;
    private final boolean ah;

    /* renamed from: ai  reason: collision with root package name */
    private final boolean f175421ai;
    private final boolean aj;
    private final AbstractC10550f ak;
    private final boolean al;
    private final boolean am;
    private final boolean an;
    private final AbstractC9234g ao;
    private Function1<? super List<String>, Unit> ap;

    /* renamed from: b */
    public DataControl f24122b;

    /* renamed from: c */
    public String f24123c;

    /* renamed from: d */
    public C8275a f24124d;

    /* renamed from: g */
    private ICommentInput f24125g;

    /* renamed from: h */
    private final C68289a f24126h = new C68289a();

    /* renamed from: i */
    private final Config f24127i;

    /* renamed from: j */
    private final RnCommentProtocol f24128j;

    /* renamed from: k */
    private final RnReactionProtocol f24129k;

    /* renamed from: l */
    private ICommentListeners f24130l;

    /* renamed from: m */
    private ICommentFunction f24131m;

    /* renamed from: n */
    private Function1<? super Boolean, Unit> f24132n;

    /* renamed from: o */
    private Function1<? super C4517a, Unit> f24133o;

    /* renamed from: p */
    private int f24134p;

    /* renamed from: q */
    private AbstractC7665c f24135q;

    /* renamed from: r */
    private CommentAnimationParam f24136r;

    /* renamed from: s */
    private CommentAnimationParam f24137s;

    /* renamed from: t */
    private final Function1<String, Unit> f24138t;

    /* renamed from: u */
    private View f24139u;

    /* renamed from: v */
    private View f24140v;

    /* renamed from: w */
    private Function0<Boolean> f24141w;

    /* renamed from: x */
    private Function0<Unit> f24142x;

    /* renamed from: y */
    private Function2<? super String, ? super Action, Unit> f24143y;

    /* renamed from: z */
    private Function1<? super String, Unit> f24144z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$c */
    static final class C8945c extends Lambda implements Function0<Unit> {
        public static final C8945c INSTANCE = new C8945c();

        C8945c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$d */
    static final class C8946d extends Lambda implements Function0<Unit> {
        public static final C8946d INSTANCE = new C8946d();

        C8946d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$i */
    static final class C8951i extends Lambda implements Function0<Unit> {
        public static final C8951i INSTANCE = new C8951i();

        C8951i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$y */
    static final class C8967y extends Lambda implements Function0<Unit> {
        public static final C8967y INSTANCE = new C8967y();

        C8967y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$z */
    static final class C8968z extends Lambda implements Function0<Boolean> {
        public static final C8968z INSTANCE = new C8968z();

        C8968z() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/Comment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>, kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: A */
    public Function1<String, Boolean> mo34277A() {
        return this.f24101G;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: B */
    public Function1<String, Unit> mo34278B() {
        return this.f24102H;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: C */
    public Function1<String, Unit> mo34279C() {
        return this.f24103I;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.k<java.lang.String, java.lang.Boolean, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: D */
    public Function2<String, Boolean, Unit> mo34280D() {
        return this.f24104J;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: E */
    public Function1<Boolean, Unit> mo34281E() {
        return this.f24105K;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.k<java.lang.String, java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: F */
    public Function2<String, String, Unit> mo34282F() {
        return this.f24106L;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: G */
    public Function1<Integer, Unit> mo34283G() {
        return this.f24107M;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: H */
    public Function1<String, Unit> mo34284H() {
        return this.f24108N;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: I */
    public Function0<Unit> mo34285I() {
        return this.f24109O;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: J */
    public Function1<String, Unit> mo34286J() {
        return this.f24110P;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: K */
    public Function1<String, Unit> mo34287K() {
        return this.f24111Q;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: L */
    public Function1<Boolean, Unit> mo34288L() {
        return this.f24112R;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: M */
    public Function1<String, Unit> mo34289M() {
        return this.f24113S;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: N */
    public Function1<CommentInputRequest, Unit> mo34290N() {
        return this.f24114T;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: O */
    public Function1<View, Unit> mo34291O() {
        return this.f24115U;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: P */
    public Function0<Unit> mo34292P() {
        return this.f24116V;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: Q */
    public Function1<CommentInputRequest, Unit> mo34293Q() {
        return this.f24117W;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.o<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.o<java.lang.String, java.lang.String, java.lang.Integer, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: R */
    public Function3<String, String, Integer, Unit> mo34294R() {
        return this.f24118X;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: S */
    public int mo34295S() {
        return this.f24134p;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: T */
    public Function1<List<String>, Unit> mo34296T() {
        return this.ap;
    }

    /* renamed from: a */
    public Config mo34314b() {
        return this.f24127i;
    }

    /* renamed from: c */
    public final ICommentFunction mo34323c() {
        return this.f24131m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.bean.a, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.bean.a, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: d */
    public Function1<C4517a, Unit> mo34328d() {
        return this.f24133o;
    }

    /* renamed from: e */
    public DataControl mo34332f() {
        return this.f24122b;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: g */
    public AbstractC7665c mo34334g() {
        return this.f24135q;
    }

    /* renamed from: o */
    public CommentAnimationParam mo34348o() {
        return this.f24136r;
    }

    /* renamed from: p */
    public CommentAnimationParam mo34349p() {
        return this.f24137s;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: q */
    public Function1<String, Unit> mo34350q() {
        return this.f24138t;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: r */
    public Function0<Boolean> mo34351r() {
        return this.f24141w;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: s */
    public Function0<Unit> mo34352s() {
        return this.f24142x;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super java.lang.String, ? super com.bytedance.ee.bear.middleground.comment.export.Action, kotlin.Unit>, kotlin.jvm.functions.k<java.lang.String, com.bytedance.ee.bear.middleground.comment.export.Action, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: t */
    public Function2<String, Action, Unit> mo34353t() {
        return this.f24143y;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    /* renamed from: u */
    public Function1<String, Unit> mo34354u() {
        return this.f24144z;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: v */
    public Function0<Unit> mo34355v() {
        return this.f24095A;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners, com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: w */
    public List<Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit>> mo34356w() {
        return this.f24096B;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: x */
    public Function1<Integer, Unit> mo34357x() {
        return this.f24097C;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: y */
    public Function0<Unit> mo34358y() {
        return this.f24098D;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners, com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: z */
    public List<Function2<Integer, Boolean, Unit>> mo34359z() {
        return this.f24099E;
    }

    /* renamed from: a */
    public void mo34308a(Function1<? super C4517a, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24133o = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public boolean mo34312a(Disposable disposable) {
        Intrinsics.checkParameterIsNotNull(disposable, "disposable");
        return this.f24126h.mo237937a(disposable);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public boolean mo34313a(boolean z) {
        ICardComment gVar;
        if (!z && (gVar = this.f24121a) != null && gVar.mo34748d()) {
            return true;
        }
        ICommentInput aVar = this.f24125g;
        return aVar != null && aVar.mo35374b();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34311a(boolean z, boolean z2) {
        ICardComment gVar;
        if (!z && (gVar = this.f24121a) != null) {
            gVar.mo34739a(z2);
        }
        ICommentInput aVar = this.f24125g;
        if (aVar != null) {
            ICommentInput.C9239a.m38353a(aVar, false, 1, null);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34309a(Function2<? super String, ? super Action, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "<set-?>");
        this.f24143y = kVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34310a(Function3<? super String, ? super String, ? super Integer, Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "<set-?>");
        this.f24118X = oVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: k */
    public void mo34342k() {
        this.f24131m.mo34656g();
    }

    /* renamed from: l */
    public final void mo34344l() {
        ICardComment gVar = this.f24121a;
        if (gVar != null) {
            gVar.mo34749e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$an */
    public static final class an implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Comment f24168a;

        /* renamed from: b */
        final /* synthetic */ List f24169b;

        an(Comment aVar, List list) {
            this.f24168a = aVar;
            this.f24169b = list;
        }

        public final void run() {
            this.f24168a.f24122b.mo34706a(this.f24169b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$f */
    static final class C8948f extends Lambda implements Function0<Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8948f(Comment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo34314b().mo35325e().mo35300a();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: i */
    public boolean mo34339i() {
        ICardComment gVar = this.f24121a;
        if (gVar == null || !gVar.mo34748d()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: j */
    public void mo34340j() {
        ICardComment gVar = this.f24121a;
        if (gVar != null) {
            gVar.mo34744b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ae */
    static final class C8940ae extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8940ae(Comment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a(this.this$0.f24123c, this.this$0.f24124d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$aj */
    public static final class aj extends Lambda implements Function0<Boolean> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(Comment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (!this.this$0.mo34313a(true)) {
                return false;
            }
            this.this$0.mo34311a(true, false);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$m */
    static final class C8955m extends Lambda implements Function0<DefinitionParameters> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8955m(Comment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefinitionParameters invoke() {
            return C70039b.m268661a(this.this$0.f24123c, this.this$0.f24124d);
        }
    }

    /* renamed from: U */
    private final boolean m37387U() {
        ICardComment gVar;
        if (!AnimatorUtils.m37821a() || (gVar = this.f24121a) == null || !gVar.mo34748d()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo34336h() {
        this.f24122b.mo34703a(new C8941af(this));
        AnimatorUtils.m37820a(this.al);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: n */
    public AbstractC68307f<String> mo34347n() {
        AbstractC68307f<String> a = this.f24122b.mo34712c().mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e());
        Intrinsics.checkExpressionValueIsNotNull(a, "dataControl.getComment()…rSchedulers.mainThread())");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: m */
    public void mo34346m() {
        ((AbstractC10160d) KoinJavaComponent.m268613a(AbstractC10160d.class, null, null, 6, null)).mo37762a();
        C13479a.m54764b(f24093e, "comment destroy");
        mo34311a(false, false);
        this.f24126h.dispose();
        this.f24126h.mo237935a();
        DataControl.C9096a.m37731a(this.f24122b, null, 1, null);
        this.f24122b.mo34701a();
        CommentTranslate.f24837a.mo35291a().clear();
        ICommentInput aVar = this.f24125g;
        if (aVar != null) {
            aVar.mo35375c();
        }
        this.f24121a = null;
        this.f24125g = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0012J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ/\u00106\u001a\u00020\u00002'\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001dJ\u000e\u00107\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\nJ\u000e\u00108\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\nJ\u000e\u00109\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\nJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\fJ\u000e\u0010;\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0012J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R/\u0010\u001c\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\fX\u000e¢\u0006\b\n\u0000\u0012\u0004\b'\u0010\u000eR\u000e\u0010(\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/Comment$Build;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "viewParent", "Landroid/widget/FrameLayout;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentManager;)V", "audioAvailable", "", "commentType", "", "commentType$annotations", "()V", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "docUrl", "", "enableFontScale", "isOwner", "Lcom/bytedance/ee/bear/middleground/comment/uitls/IsOwner;", "isWiki", "newCardUi", "pageType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "per", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "readMessage", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "messageIds", "", "showCommentImage", "showInsertImage", "showReaction", "styleType", "styleType$annotations", "subFileType", "token", "build", "Lcom/bytedance/ee/bear/middleground/comment/Comment;", "setAudioAvailable", "setCommentType", "setDocUrl", "url", "setEnableFontScale", "setIsOwner", "setIsWiki", "setNewCardUi", "setPageType", "setPermission", "setReadMessage", "setShowCommentImage", "setShowInsertImage", "setShowReaction", "setStyleType", "setSubFileType", "setToken", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$a */
    public static final class Build {

        /* renamed from: a */
        private String f24147a;

        /* renamed from: b */
        private String f24148b;

        /* renamed from: c */
        private C8275a f24149c;

        /* renamed from: d */
        private boolean f24150d;

        /* renamed from: e */
        private String f24151e = "";

        /* renamed from: f */
        private long f24152f = 1;

        /* renamed from: g */
        private long f24153g;

        /* renamed from: h */
        private ICommentPermission f24154h;

        /* renamed from: i */
        private boolean f24155i;

        /* renamed from: j */
        private boolean f24156j;

        /* renamed from: k */
        private boolean f24157k;

        /* renamed from: l */
        private boolean f24158l;

        /* renamed from: m */
        private boolean f24159m = true;

        /* renamed from: n */
        private boolean f24160n;

        /* renamed from: o */
        private AbstractC9234g f24161o = C8934a.f24166a;

        /* renamed from: p */
        private Function1<? super List<String>, Unit> f24162p = C8935b.INSTANCE;

        /* renamed from: q */
        private final FragmentActivity f24163q;

        /* renamed from: r */
        private final FrameLayout f24164r;

        /* renamed from: s */
        private final FragmentManager f24165s;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "isOwner"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.a$a$a */
        static final class C8934a implements AbstractC9234g {

            /* renamed from: a */
            public static final C8934a f24166a = new C8934a();

            C8934a() {
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p449g.AbstractC9234g
            public final boolean isOwner() {
                return false;
            }
        }

        /* renamed from: a */
        public final Comment mo34369a() {
            AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(this.f24163q);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout = (FrameLayout) this.f24164r.findViewById(R.id.comment_card_container);
            if (frameLayout == null) {
                frameLayout = new FrameLayout(this.f24163q);
                frameLayout.setId(R.id.comment_card_container);
                this.f24164r.addView(frameLayout, layoutParams);
            }
            FrameLayout frameLayout2 = (FrameLayout) this.f24164r.findViewById(R.id.comment_inner_imageviewer_container);
            if (frameLayout2 == null) {
                frameLayout2 = new FrameLayout(this.f24163q);
                frameLayout2.setId(R.id.comment_inner_imageviewer_container);
                this.f24164r.addView(frameLayout2, layoutParams);
            }
            FragmentActivity fragmentActivity = this.f24163q;
            FragmentManager fragmentManager = this.f24165s;
            String str = this.f24147a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("token");
            }
            String str2 = this.f24148b;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("docUrl");
            }
            C8275a aVar = this.f24149c;
            boolean z = this.f24150d;
            String str3 = this.f24151e;
            long j = this.f24152f;
            long j2 = this.f24153g;
            ICommentPermission hVar = this.f24154h;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("per");
            }
            boolean z2 = this.f24155i;
            boolean z3 = this.f24156j;
            boolean z4 = this.f24157k;
            Intrinsics.checkExpressionValueIsNotNull(b, "keyboardHeightProvider");
            return new Comment(fragmentActivity, frameLayout, frameLayout2, fragmentManager, str, str2, aVar, z, str3, j, j2, hVar, z2, z3, z4, b, this.f24158l, this.f24159m, this.f24160n, this.f24161o, this.f24162p);
        }

        /* renamed from: a */
        public final Build mo34362a(long j) {
            this.f24152f = j;
            return this;
        }

        /* renamed from: b */
        public final Build mo34370b(long j) {
            this.f24153g = j;
            return this;
        }

        /* renamed from: c */
        public final Build mo34374c(boolean z) {
            this.f24156j = z;
            return this;
        }

        /* renamed from: d */
        public final Build mo34375d(boolean z) {
            this.f24157k = z;
            return this;
        }

        /* renamed from: e */
        public final Build mo34376e(boolean z) {
            this.f24158l = z;
            return this;
        }

        /* renamed from: f */
        public final Build mo34377f(boolean z) {
            this.f24159m = z;
            return this;
        }

        /* renamed from: g */
        public final Build mo34378g(boolean z) {
            this.f24160n = z;
            return this;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.a$a$b */
        static final class C8935b extends Lambda implements Function1<List<? extends String>, Unit> {
            public static final C8935b INSTANCE = new C8935b();

            C8935b() {
                super(1);
            }

            public final void invoke(List<String> list) {
                Intrinsics.checkParameterIsNotNull(list, "it");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                invoke((List<String>) list);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public final Build mo34363a(C8275a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "pageType");
            this.f24149c = aVar;
            return this;
        }

        /* renamed from: b */
        public final Build mo34371b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f24148b = str;
            return this;
        }

        /* renamed from: c */
        public final Build mo34373c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "subFileType");
            this.f24151e = str;
            return this;
        }

        /* renamed from: a */
        public final Build mo34364a(ICommentPermission hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "per");
            this.f24154h = hVar;
            return this;
        }

        /* renamed from: b */
        public final Build mo34372b(boolean z) {
            this.f24155i = z;
            return this;
        }

        /* renamed from: a */
        public final Build mo34365a(AbstractC9234g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "isOwner");
            this.f24161o = gVar;
            return this;
        }

        /* renamed from: a */
        public final Build mo34366a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            this.f24147a = str;
            return this;
        }

        /* renamed from: a */
        public final Build mo34367a(Function1<? super List<String>, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "readMessage");
            this.f24162p = function1;
            return this;
        }

        /* renamed from: a */
        public final Build mo34368a(boolean z) {
            this.f24150d = z;
            return this;
        }

        public Build(FragmentActivity fragmentActivity, FrameLayout frameLayout, FragmentManager fragmentManager) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(frameLayout, "viewParent");
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
            this.f24163q = fragmentActivity;
            this.f24164r = frameLayout;
            this.f24165s = fragmentManager;
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            this.f24149c = aVar;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: b */
    public void mo34315b(View view) {
        this.f24140v = view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$aa */
    static final class C8936aa extends Lambda implements Function1<String, Unit> {
        public static final C8936aa INSTANCE = new C8936aa();

        C8936aa() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/bean/At;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ac */
    static final class C8938ac extends Lambda implements Function1<C4517a, Unit> {
        public static final C8938ac INSTANCE = new C8938ac();

        C8938ac() {
            super(1);
        }

        public final void invoke(C4517a aVar) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4517a aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ad */
    static final class C8939ad extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8939ad(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            ICardComment gVar = this.this$0.f24121a;
            if (gVar != null) {
                gVar.mo34735a(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/Comment$registerReactionObserver$1", "Lcom/bytedance/ee/bear/rn/RnReactionProtocol$ReactionDataObserver;", "updateReactionDetail", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$af */
    public static final class C8941af implements RnReactionProtocol.ReactionDataObserver {

        /* renamed from: a */
        final /* synthetic */ Comment f24167a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8941af(Comment aVar) {
            this.f24167a = aVar;
        }

        @Override // com.bytedance.ee.bear.rn.RnReactionProtocol.ReactionDataObserver
        /* renamed from: a */
        public void mo34384a(String str) {
            this.f24167a.mo34323c().mo34649b(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ai */
    public static final class C8944ai extends Lambda implements Function1<CommentInputRequest, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8944ai(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommentInputRequest commentInputRequest) {
            invoke(commentInputRequest);
            return Unit.INSTANCE;
        }

        public final void invoke(CommentInputRequest commentInputRequest) {
            Intrinsics.checkParameterIsNotNull(commentInputRequest, "it");
            this.this$0.mo34302a(commentInputRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ak */
    static final class ak extends Lambda implements Function1<String, Unit> {
        public static final ak INSTANCE = new ak();

        ak() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$al */
    static final class al extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            ICardComment gVar = this.this$0.f24121a;
            if (gVar != null) {
                gVar.mo34737a(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$am */
    static final class am extends Lambda implements Function1<String, Unit> {
        public static final am INSTANCE = new am();

        am() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$e */
    static final class C8947e extends Lambda implements Function1<CommentInputRequest, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8947e(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommentInputRequest commentInputRequest) {
            invoke(commentInputRequest);
            return Unit.INSTANCE;
        }

        public final void invoke(CommentInputRequest commentInputRequest) {
            Intrinsics.checkParameterIsNotNull(commentInputRequest, "it");
            this.this$0.mo34302a(commentInputRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$g */
    static final class C8949g extends Lambda implements Function1<String, Unit> {
        public static final C8949g INSTANCE = new C8949g();

        C8949g() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$h */
    static final class C8950h extends Lambda implements Function1<CommentInputRequest, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8950h(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommentInputRequest commentInputRequest) {
            invoke(commentInputRequest);
            return Unit.INSTANCE;
        }

        public final void invoke(CommentInputRequest commentInputRequest) {
            Intrinsics.checkParameterIsNotNull(commentInputRequest, "it");
            this.this$0.mo34314b().mo35325e().mo35303a("directional_reply_comment", null, commentInputRequest.comment_id, commentInputRequest.directional_reply_id, false);
            this.this$0.mo34302a(commentInputRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$k */
    static final class C8953k extends Lambda implements Function1<String, Unit> {
        public static final C8953k INSTANCE = new C8953k();

        C8953k() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$n */
    static final class C8956n extends Lambda implements Function1<String, Unit> {
        public static final C8956n INSTANCE = new C8956n();

        C8956n() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$t */
    static final class C8962t extends Lambda implements Function1<String, Unit> {
        public static final C8962t INSTANCE = new C8962t();

        C8962t() {
            super(1);
        }

        public final void invoke(String str) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$v */
    public static final class C8964v extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8964v(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.this$0.mo34354u().invoke(str);
        }
    }

    /* renamed from: a */
    public final void mo34298a(int i) {
        this.f24134p = i;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: c */
    public void mo34325c(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "<set-?>");
        this.f24116V = function0;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: d */
    public void mo34329d(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24102H = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: e */
    public void mo34331e(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24105K = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: g */
    public void mo34335g(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24108N = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: h */
    public void mo34337h(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24110P = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: i */
    public void mo34338i(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24111Q = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: j */
    public void mo34341j(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24112R = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ag */
    static final class C8942ag extends Lambda implements Function1<String, Boolean> {
        public static final C8942ag INSTANCE = new C8942ag();

        C8942ag() {
            super(1);
        }

        public final boolean invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(invoke(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$j */
    static final class C8952j extends Lambda implements Function1<String, Boolean> {
        public static final C8952j INSTANCE = new C8952j();

        C8952j() {
            super(1);
        }

        public final boolean invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(invoke(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$l */
    static final class C8954l extends Lambda implements Function1<Boolean, Unit> {
        public static final C8954l INSTANCE = new C8954l();

        C8954l() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$o */
    static final class C8957o extends Lambda implements Function1<Integer, Unit> {
        public static final C8957o INSTANCE = new C8957o();

        C8957o() {
            super(1);
        }

        public final void invoke(int i) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$r */
    static final class C8960r extends Lambda implements Function1<Boolean, Unit> {
        public static final C8960r INSTANCE = new C8960r();

        C8960r() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$u */
    static final class C8963u extends Lambda implements Function1<Integer, Unit> {
        public static final C8963u INSTANCE = new C8963u();

        C8963u() {
            super(1);
        }

        public final void invoke(int i) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$x */
    public static final class C8966x extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8966x(Comment aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.mo34283G().invoke(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: a */
    public void mo34299a(View view) {
        this.f24139u = view;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: b */
    public void mo34316b(CommentAnimationParam aVar) {
        ICardComment gVar = this.f24121a;
        if (gVar != null) {
            gVar.mo34742b(aVar);
        }
        this.f24137s = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: c */
    public void mo34324c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        ICardComment gVar = this.f24121a;
        if (gVar != null) {
            gVar.mo34743b(str);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: f */
    public void mo34333f(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24107M = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: k */
    public void mo34343k(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24113S = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentListeners
    /* renamed from: l */
    public void mo34345l(Function1<? super CommentInputRequest, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24114T = function1;
    }

    /* renamed from: a */
    public void mo34300a(AbstractC7665c cVar) {
        this.f24135q = cVar;
    }

    /* renamed from: b */
    public final void mo34317b(String str) {
        mo34314b().mo35321b(str);
        this.f24122b.mo34714c(this.f24123c);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: c */
    public void mo34326c(Function1<? super String, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f24101G = function1;
    }

    /* renamed from: b */
    private final ICommentInput m37388b(CommentInputRequest commentInputRequest) {
        return new InputComment(mo34314b(), this.f24130l, this.f24122b, new C8964v(this), commentInputRequest, new C8965w(this), new C8966x(this), m37387U());
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34301a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ShareHitPoint.f121869d);
        this.f24124d = aVar;
        mo34314b().mo35317a(aVar);
        this.f24122b.mo34702a(aVar);
        mo34336h();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: c */
    public void mo34327c(boolean z) {
        ICommentInput aVar = this.f24125g;
        if (aVar != null) {
            aVar.mo35371a(z);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34302a(CommentInputRequest commentInputRequest) {
        boolean z;
        CommentInputRequest commentInputRequest2;
        if (this.f24125g == null) {
            if (commentInputRequest != null) {
                commentInputRequest2 = commentInputRequest;
            } else {
                commentInputRequest2 = new CommentInputRequest();
            }
            this.f24125g = m37388b(commentInputRequest2);
        }
        if (commentInputRequest != null) {
            commentInputRequest.doc_url = this.ac;
            ICommentInput aVar = this.f24125g;
            if (aVar != null) {
                aVar.mo35369a(commentInputRequest);
            }
        } else {
            ICommentInput aVar2 = this.f24125g;
            if (aVar2 != null) {
                aVar2.mo35369a(new CommentInputRequest());
            }
        }
        if (commentInputRequest != null) {
            z = commentInputRequest.keyboard_pop;
        } else {
            z = true;
        }
        ICommentInput aVar3 = this.f24125g;
        if (aVar3 != null) {
            ICommentInput.C9239a.m38354a(aVar3, false, false, z, 2, null);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: b */
    public void mo34318b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "<set-?>");
        this.f24142x = function0;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34303a(CommentAnimationParam aVar) {
        ICardComment gVar = this.f24121a;
        if (gVar != null) {
            gVar.mo34736a(aVar);
        }
        this.f24136r = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: b */
    public void mo34319b(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        this.f24132n = function1;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34304a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f24123c = str;
        mo34314b().mo35319a(str);
        this.f24122b.mo34710b(str);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: b */
    public void mo34320b(Function2<? super String, ? super Boolean, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "<set-?>");
        this.f24104J = kVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: b */
    public void mo34321b(boolean z) {
        ICardComment gVar = this.f24121a;
        if (gVar != null) {
            gVar.mo34739a(z);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34306a(List<CommentBean> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C13742g.m55711d(new an(this, list));
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34307a(Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "<set-?>");
        this.f24141w = function0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ah */
    static final class C8943ah extends Lambda implements Function2<String, Boolean, Unit> {
        public static final C8943ah INSTANCE = new C8943ah();

        C8943ah() {
            super(2);
        }

        public final void invoke(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(String str, Boolean bool) {
            invoke(str, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "action", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$p */
    static final class C8958p extends Lambda implements Function2<String, Action, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8958p(Comment aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Action action) {
            invoke(str, action);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, Action action) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(action, "action");
            this.this$0.mo34353t().invoke(str, action);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$q */
    static final class C8959q extends Lambda implements Function2<String, String, Unit> {
        public static final C8959q INSTANCE = new C8959q();

        C8959q() {
            super(2);
        }

        public final void invoke(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(str2, "<anonymous parameter 1>");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            invoke(str, str2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$s */
    static final class C8961s extends Lambda implements Function2<String, Action, Unit> {
        public static final C8961s INSTANCE = new C8961s();

        C8961s() {
            super(2);
        }

        public final void invoke(String str, Action action) {
            Intrinsics.checkParameterIsNotNull(str, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(action, "<anonymous parameter 1>");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Action action) {
            invoke(str, action);
            return Unit.INSTANCE;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: a */
    public void mo34305a(String str, Integer num) {
        CardComment bVar;
        Intrinsics.checkParameterIsNotNull(str, "createId");
        String str2 = f24093e;
        C13479a.m54764b(str2, "showComment");
        if (this.f24121a == null) {
            C13479a.m54764b(str2, "cardWindow == null");
            if (this.al) {
                bVar = new CardComment2(mo34314b(), this.f24130l, this.f24122b, this.f24131m, new C8944ai(this), new aj(this));
            } else {
                bVar = new CardComment(mo34314b(), this.f24130l, this.f24122b, this.f24131m);
            }
            this.f24121a = bVar;
            if (bVar != null) {
                bVar.mo34736a(mo34348o());
            }
            ICardComment gVar = this.f24121a;
            if (gVar != null) {
                gVar.mo34742b(mo34349p());
            }
        }
        ICardComment gVar2 = this.f24121a;
        if (gVar2 != null) {
            gVar2.mo34738a(str, num);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.IComment
    /* renamed from: b */
    public void mo34322b(boolean z, boolean z2) {
        CommentArea bVar = new CommentArea();
        bVar.mo35306a(z);
        bVar.mo35308b(z2);
        mo34314b().mo35318a(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "commentId", "", "replyId", "index", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$ab */
    static final class C8937ab extends Lambda implements Function3<String, String, Integer, Unit> {
        public static final C8937ab INSTANCE = new C8937ab();

        C8937ab() {
            super(3);
        }

        public final void invoke(String str, String str2, int i) {
            Intrinsics.checkParameterIsNotNull(str, "commentId");
            Intrinsics.checkParameterIsNotNull(str2, "replyId");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(String str, String str2, Integer num) {
            invoke(str, str2, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "content", "", "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "bySend", "", "tmpId", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a$w */
    public static final class C8965w extends Lambda implements Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> {
        final /* synthetic */ Comment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8965w(Comment aVar) {
            super(4);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, Boolean bool, String str2) {
            invoke(str, list, bool.booleanValue(), str2);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Iterator<T> it = this.this$0.mo34356w().iterator();
            while (it.hasNext()) {
                it.next().invoke(str, list, Boolean.valueOf(z), str2);
            }
        }
    }

    public Comment(FragmentActivity fragmentActivity, FrameLayout frameLayout, FrameLayout frameLayout2, FragmentManager fragmentManager, String str, String str2, C8275a aVar, boolean z, String str3, long j, long j2, ICommentPermission hVar, boolean z2, boolean z3, boolean z4, AbstractC10550f fVar, boolean z5, boolean z6, boolean z7, AbstractC9234g gVar, Function1<? super List<String>, Unit> function1) {
        CommentFuction2 aVar2;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "viewParent");
        Intrinsics.checkParameterIsNotNull(frameLayout2, "imageViewerParent");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "docUrl");
        Intrinsics.checkParameterIsNotNull(aVar, "pageType");
        Intrinsics.checkParameterIsNotNull(str3, "subFileType");
        Intrinsics.checkParameterIsNotNull(hVar, "per");
        Intrinsics.checkParameterIsNotNull(fVar, "keyboardHeightProvider");
        Intrinsics.checkParameterIsNotNull(function1, "readMessage");
        this.f24119Y = fragmentActivity;
        this.f24120Z = frameLayout;
        this.aa = frameLayout2;
        this.ab = fragmentManager;
        this.f24123c = str;
        this.ac = str2;
        this.f24124d = aVar;
        this.ad = z;
        this.ae = str3;
        this.af = j;
        this.ag = hVar;
        this.ah = z2;
        this.f175421ai = z3;
        this.aj = z4;
        this.ak = fVar;
        this.al = z5;
        this.am = z6;
        this.an = z7;
        this.ao = gVar;
        this.ap = function1;
        this.f24127i = new Config(fragmentActivity, frameLayout, frameLayout2, fragmentManager, this.f24123c, this.ac, this.f24124d, this.ad, this.ae, j, j2, hVar, fVar, false, false, z6, null, z2, null, null, false, false, z6, z3, z4, z7, gVar, "", 1925120, null);
        RnCommentProtocol cVar = (RnCommentProtocol) KoinJavaComponent.m268612a(RnCommentProtocol.class, null, new C8955m(this));
        this.f24128j = cVar;
        RnReactionProtocol hVar2 = (RnReactionProtocol) KoinJavaComponent.m268612a(RnReactionProtocol.class, null, new C8940ae(this));
        this.f24129k = hVar2;
        this.f24122b = new DataControlImpl(cVar, hVar2, new C8958p(this));
        this.f24130l = this;
        if (!z5) {
            aVar2 = new CommentFunction(mo34314b(), this.f24130l, this.f24122b);
        } else {
            aVar2 = new CommentFuction2(mo34314b(), this.f24130l, this.f24122b);
        }
        this.f24131m = aVar2;
        this.f24133o = C8938ac.INSTANCE;
        this.f24122b.mo34707a(new Function1<String, Unit>(this) {
            /* class com.bytedance.ee.bear.middleground.comment.Comment.C89321 */
            final /* synthetic */ Comment this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(final String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                C13742g.m55705a(new Runnable(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.Comment.C89321.RunnableC89331 */

                    /* renamed from: a */
                    final /* synthetic */ C89321 f24145a;

                    {
                        this.f24145a = r1;
                    }

                    public final void run() {
                        this.f24145a.this$0.f24122b.mo34705a(str, Action.CHANGE);
                    }
                });
            }
        });
        mo34336h();
        this.f24135q = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(fragmentActivity, AbstractC7665c.class);
        this.f24138t = new al(this);
        this.f24141w = C8968z.INSTANCE;
        this.f24142x = C8945c.INSTANCE;
        this.f24143y = C8961s.INSTANCE;
        this.f24144z = C8936aa.INSTANCE;
        this.f24095A = new C8948f(this);
        this.f24096B = new CopyOnWriteArrayList();
        this.f24097C = C8957o.INSTANCE;
        this.f24098D = C8951i.INSTANCE;
        this.f24099E = new CopyOnWriteArrayList();
        this.f24100F = C8952j.INSTANCE;
        this.f24101G = C8942ag.INSTANCE;
        this.f24102H = C8949g.INSTANCE;
        this.f24103I = C8956n.INSTANCE;
        this.f24104J = C8943ah.INSTANCE;
        this.f24105K = C8954l.INSTANCE;
        this.f24106L = C8959q.INSTANCE;
        this.f24107M = C8963u.INSTANCE;
        this.f24108N = am.INSTANCE;
        this.f24109O = C8946d.INSTANCE;
        this.f24110P = ak.INSTANCE;
        this.f24111Q = C8953k.INSTANCE;
        this.f24112R = C8960r.INSTANCE;
        this.f24113S = C8962t.INSTANCE;
        this.f24114T = new C8950h(this);
        this.f24115U = new C8939ad(this);
        this.f24116V = C8967y.INSTANCE;
        this.f24117W = new C8947e(this);
        this.f24118X = C8937ab.INSTANCE;
    }
}

package com.ss.android.lark.todo.impl.features.mainview2.widget.list.item;

import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarBean;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\bNOPQRSTUBk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0015HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jo\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006V"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData;", "", "todoGuid", "", "isTitle", "", "titleViewData", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleViewData;", "summaryViewData", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$SummaryViewData;", "checkBoxViewData", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$CheckBoxViewData;", "assigneeViewData", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$AssigneeViewData;", "timeViewData", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TimeViewData;", "behindDeleteStatus", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "positionViewData", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$PositionViewData;", "(Ljava/lang/String;ZLcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleViewData;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$SummaryViewData;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$CheckBoxViewData;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$AssigneeViewData;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TimeViewData;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;Lcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$PositionViewData;)V", "getAssigneeViewData", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$AssigneeViewData;", "setAssigneeViewData", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$AssigneeViewData;)V", "getBehindDeleteStatus", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "setBehindDeleteStatus", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;)V", "getCheckBoxViewData", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$CheckBoxViewData;", "setCheckBoxViewData", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$CheckBoxViewData;)V", "()Z", "setTitle", "(Z)V", "getPositionViewData", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$PositionViewData;", "setPositionViewData", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$PositionViewData;)V", "getSummaryViewData", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$SummaryViewData;", "setSummaryViewData", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$SummaryViewData;)V", "getTimeViewData", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TimeViewData;", "setTimeViewData", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TimeViewData;)V", "getTitleViewData", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleViewData;", "setTitleViewData", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleViewData;)V", "getTodoGuid", "()Ljava/lang/String;", "setTodoGuid", "(Ljava/lang/String;)V", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "setTodoSource", "(Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "AssigneeViewData", "BehindDeleteStatus", "CheckBoxViewData", "PositionViewData", "SummaryViewData", "TimeViewData", "TitleType", "TitleViewData", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoItemViewData {

    /* renamed from: a */
    private String f140821a;

    /* renamed from: b */
    private boolean f140822b;

    /* renamed from: c */
    private TitleViewData f140823c;

    /* renamed from: d */
    private SummaryViewData f140824d;

    /* renamed from: e */
    private CheckBoxViewData f140825e;

    /* renamed from: f */
    private AssigneeViewData f140826f;

    /* renamed from: g */
    private TimeViewData f140827g;

    /* renamed from: h */
    private BehindDeleteStatus f140828h;

    /* renamed from: i */
    private TodoSource f140829i;

    /* renamed from: j */
    private PositionViewData f140830j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$BehindDeleteStatus;", "", "(Ljava/lang/String;I)V", "DELETE", "QUIT", "UNFOLLOW", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum BehindDeleteStatus {
        DELETE,
        QUIT,
        UNFOLLOW
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "", "(Ljava/lang/String;I)V", "OVER_DUE", "TODAY", "IN_WEEK", "OTHER", "DOING", "DONE", "COMPLETED", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TitleType {
        OVER_DUE,
        TODAY,
        IN_WEEK,
        OTHER,
        DOING,
        DONE,
        COMPLETED
    }

    public TodoItemViewData() {
        this(null, false, null, null, null, null, null, null, null, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public int hashCode() {
        String str = this.f140821a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f140822b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        TitleViewData fVar = this.f140823c;
        int hashCode2 = (i5 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        SummaryViewData dVar = this.f140824d;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        CheckBoxViewData bVar = this.f140825e;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AssigneeViewData aVar = this.f140826f;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        TimeViewData eVar = this.f140827g;
        int hashCode6 = (hashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        BehindDeleteStatus behindDeleteStatus = this.f140828h;
        int hashCode7 = (hashCode6 + (behindDeleteStatus != null ? behindDeleteStatus.hashCode() : 0)) * 31;
        TodoSource todoSource = this.f140829i;
        int hashCode8 = (hashCode7 + (todoSource != null ? todoSource.hashCode() : 0)) * 31;
        PositionViewData cVar = this.f140830j;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "TodoItemViewData(todoGuid=" + this.f140821a + ", isTitle=" + this.f140822b + ", titleViewData=" + this.f140823c + ", summaryViewData=" + this.f140824d + ", checkBoxViewData=" + this.f140825e + ", assigneeViewData=" + this.f140826f + ", timeViewData=" + this.f140827g + ", behindDeleteStatus=" + this.f140828h + ", todoSource=" + this.f140829i + ", positionViewData=" + this.f140830j + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0017\"\u0004\b\u001a\u0010\u0019¨\u0006&"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$AssigneeViewData;", "", "isAssigneeShow", "", "isAssigneeCountShow", "avatarCountStr", "", "avatars", "", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarBean;", "assigneeCompleteType", "Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "(ZZLjava/lang/String;Ljava/util/List;Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;)V", "getAssigneeCompleteType", "()Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;", "setAssigneeCompleteType", "(Lcom/ss/android/lark/todo/impl/features/common/helper/MultiCompleteHelper$MultiCompleteType;)V", "getAvatarCountStr", "()Ljava/lang/String;", "getAvatars", "()Ljava/util/List;", "setAvatars", "(Ljava/util/List;)V", "()Z", "setAssigneeCountShow", "(Z)V", "setAssigneeShow", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$a */
    public static final class AssigneeViewData {

        /* renamed from: a */
        private boolean f140831a;

        /* renamed from: b */
        private boolean f140832b;

        /* renamed from: c */
        private final String f140833c;

        /* renamed from: d */
        private List<AssigneeAvatarBean> f140834d;

        /* renamed from: e */
        private MultiCompleteHelper.MultiCompleteType f140835e;

        public AssigneeViewData() {
            this(false, false, null, null, null, 31, null);
        }

        public int hashCode() {
            boolean z = this.f140831a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f140832b;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            int i6 = (i5 + i) * 31;
            String str = this.f140833c;
            int i7 = 0;
            int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
            List<AssigneeAvatarBean> list = this.f140834d;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            MultiCompleteHelper.MultiCompleteType multiCompleteType = this.f140835e;
            if (multiCompleteType != null) {
                i7 = multiCompleteType.hashCode();
            }
            return hashCode2 + i7;
        }

        public String toString() {
            return "AssigneeViewData(isAssigneeShow=" + this.f140831a + ", isAssigneeCountShow=" + this.f140832b + ", avatarCountStr=" + this.f140833c + ", avatars=" + this.f140834d + ", assigneeCompleteType=" + this.f140835e + ")";
        }

        /* renamed from: a */
        public final boolean mo193847a() {
            return this.f140831a;
        }

        /* renamed from: b */
        public final boolean mo193848b() {
            return this.f140832b;
        }

        /* renamed from: c */
        public final String mo193849c() {
            return this.f140833c;
        }

        /* renamed from: d */
        public final List<AssigneeAvatarBean> mo193850d() {
            return this.f140834d;
        }

        /* renamed from: e */
        public final MultiCompleteHelper.MultiCompleteType mo193851e() {
            return this.f140835e;
        }

        public boolean equals(Object obj) {
            AssigneeViewData aVar = (AssigneeViewData) obj;
            if (aVar == null || this.f140831a != aVar.f140831a || this.f140832b != aVar.f140832b || !Intrinsics.areEqual(this.f140833c, aVar.f140833c) || aVar.f140834d.size() != this.f140834d.size() || !aVar.f140834d.containsAll(this.f140834d)) {
                return false;
            }
            return true;
        }

        public AssigneeViewData(boolean z, boolean z2, String str, List<AssigneeAvatarBean> list, MultiCompleteHelper.MultiCompleteType multiCompleteType) {
            Intrinsics.checkParameterIsNotNull(str, "avatarCountStr");
            Intrinsics.checkParameterIsNotNull(list, "avatars");
            Intrinsics.checkParameterIsNotNull(multiCompleteType, "assigneeCompleteType");
            this.f140831a = z;
            this.f140832b = z2;
            this.f140833c = str;
            this.f140834d = list;
            this.f140835e = multiCompleteType;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ AssigneeViewData(boolean r4, boolean r5, java.lang.String r6, java.util.List r7, com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.MultiCompleteType r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                r0 = 0
                if (r10 == 0) goto L_0x0007
                r10 = 0
                goto L_0x0008
            L_0x0007:
                r10 = r4
            L_0x0008:
                r4 = r9 & 2
                if (r4 == 0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = r5
            L_0x000e:
                r4 = r9 & 4
                if (r4 == 0) goto L_0x0014
                java.lang.String r6 = ""
            L_0x0014:
                r1 = r6
                r4 = r9 & 8
                if (r4 == 0) goto L_0x0021
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r7 = r4
                java.util.List r7 = (java.util.List) r7
            L_0x0021:
                r2 = r7
                r4 = r9 & 16
                if (r4 == 0) goto L_0x0028
                com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$MultiCompleteType r8 = com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper.MultiCompleteType.NOT_COMPLETE
            L_0x0028:
                r9 = r8
                r4 = r3
                r5 = r10
                r6 = r0
                r7 = r1
                r8 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.AssigneeViewData.<init>(boolean, boolean, java.lang.String, java.util.List, com.ss.android.lark.todo.impl.features.common.helper.MultiCompleteHelper$MultiCompleteType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000e\"\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$CheckBoxViewData;", "", "isCompleted", "", "isCheckable", "todoSource", "Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "(ZZLcom/bytedance/lark/pb/todo/v1/TodoSource;Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;)V", "getCompleteAction", "()Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "setCompleteAction", "(Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;)V", "()Z", "setCheckable", "(Z)V", "setCompleted", "getTodoSource", "()Lcom/bytedance/lark/pb/todo/v1/TodoSource;", "setTodoSource", "(Lcom/bytedance/lark/pb/todo/v1/TodoSource;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$b */
    public static final class CheckBoxViewData {

        /* renamed from: a */
        private boolean f140836a;

        /* renamed from: b */
        private boolean f140837b;

        /* renamed from: c */
        private TodoSource f140838c;

        /* renamed from: d */
        private CustomComplete.Action f140839d;

        public CheckBoxViewData() {
            this(false, false, null, null, 15, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckBoxViewData)) {
                return false;
            }
            CheckBoxViewData bVar = (CheckBoxViewData) obj;
            return this.f140836a == bVar.f140836a && this.f140837b == bVar.f140837b && Intrinsics.areEqual(this.f140838c, bVar.f140838c) && Intrinsics.areEqual(this.f140839d, bVar.f140839d);
        }

        public int hashCode() {
            boolean z = this.f140836a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f140837b;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            int i6 = (i5 + i) * 31;
            TodoSource todoSource = this.f140838c;
            int i7 = 0;
            int hashCode = (i6 + (todoSource != null ? todoSource.hashCode() : 0)) * 31;
            CustomComplete.Action action = this.f140839d;
            if (action != null) {
                i7 = action.hashCode();
            }
            return hashCode + i7;
        }

        public String toString() {
            return "CheckBoxViewData(isCompleted=" + this.f140836a + ", isCheckable=" + this.f140837b + ", todoSource=" + this.f140838c + ", completeAction=" + this.f140839d + ")";
        }

        /* renamed from: a */
        public final boolean mo193855a() {
            return this.f140836a;
        }

        /* renamed from: b */
        public final boolean mo193856b() {
            return this.f140837b;
        }

        /* renamed from: c */
        public final TodoSource mo193857c() {
            return this.f140838c;
        }

        /* renamed from: d */
        public final CustomComplete.Action mo193858d() {
            return this.f140839d;
        }

        public CheckBoxViewData(boolean z, boolean z2, TodoSource todoSource, CustomComplete.Action action) {
            Intrinsics.checkParameterIsNotNull(todoSource, "todoSource");
            this.f140836a = z;
            this.f140837b = z2;
            this.f140838c = todoSource;
            this.f140839d = action;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CheckBoxViewData(boolean z, boolean z2, TodoSource todoSource, CustomComplete.Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? TodoSource.TODO : todoSource, (i & 8) != 0 ? null : action);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$SummaryViewData;", "", "summaryRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "hasStrikeThrough", "", "titleRichContent", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "(Lcom/ss/android/lark/widget/richtext/RichText;ZLcom/bytedance/lark/pb/basic/v1/RichContent;)V", "getHasStrikeThrough", "()Z", "setHasStrikeThrough", "(Z)V", "getSummaryRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setSummaryRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "getTitleRichContent", "()Lcom/bytedance/lark/pb/basic/v1/RichContent;", "setTitleRichContent", "(Lcom/bytedance/lark/pb/basic/v1/RichContent;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$d */
    public static final class SummaryViewData {

        /* renamed from: a */
        private RichText f140844a;

        /* renamed from: b */
        private boolean f140845b;

        /* renamed from: c */
        private RichContent f140846c;

        public SummaryViewData() {
            this(null, false, null, 7, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummaryViewData)) {
                return false;
            }
            SummaryViewData dVar = (SummaryViewData) obj;
            return Intrinsics.areEqual(this.f140844a, dVar.f140844a) && this.f140845b == dVar.f140845b && Intrinsics.areEqual(this.f140846c, dVar.f140846c);
        }

        public int hashCode() {
            RichText richText = this.f140844a;
            int i = 0;
            int hashCode = (richText != null ? richText.hashCode() : 0) * 31;
            boolean z = this.f140845b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            RichContent richContent = this.f140846c;
            if (richContent != null) {
                i = richContent.hashCode();
            }
            return i5 + i;
        }

        public String toString() {
            return "SummaryViewData(summaryRichText=" + this.f140844a + ", hasStrikeThrough=" + this.f140845b + ", titleRichContent=" + this.f140846c + ")";
        }

        /* renamed from: a */
        public final RichText mo193872a() {
            return this.f140844a;
        }

        /* renamed from: b */
        public final boolean mo193873b() {
            return this.f140845b;
        }

        /* renamed from: c */
        public final RichContent mo193874c() {
            return this.f140846c;
        }

        public SummaryViewData(RichText richText, boolean z, RichContent richContent) {
            Intrinsics.checkParameterIsNotNull(richText, "summaryRichText");
            this.f140844a = richText;
            this.f140845b = z;
            this.f140846c = richContent;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SummaryViewData(com.ss.android.lark.widget.richtext.RichText r1, boolean r2, com.bytedance.lark.pb.basic.v1.RichContent r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 1
                if (r5 == 0) goto L_0x000f
                java.lang.String r1 = ""
                com.ss.android.lark.widget.richtext.RichText r1 = com.ss.android.lark.widget.richtext.C59029c.m229161b(r1)
                java.lang.String r5 = "RichTextCreator.generate…mpleRichText(\n        \"\")"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            L_0x000f:
                r5 = r4 & 2
                if (r5 == 0) goto L_0x0014
                r2 = 0
            L_0x0014:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001b
                r3 = 0
                com.bytedance.lark.pb.basic.v1.RichContent r3 = (com.bytedance.lark.pb.basic.v1.RichContent) r3
            L_0x001b:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.SummaryViewData.<init>(com.ss.android.lark.widget.richtext.RichText, boolean, com.bytedance.lark.pb.basic.v1.RichContent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\u000e\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TimeViewData;", "", "isTimeShow", "", "timeStr", "", "timeColor", "", "isTimeCountBadge", "isTimeNewLine", "(ZLjava/lang/String;IZZ)V", "()Z", "setTimeCountBadge", "(Z)V", "setTimeNewLine", "setTimeShow", "getTimeColor", "()I", "setTimeColor", "(I)V", "getTimeStr", "()Ljava/lang/String;", "setTimeStr", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$e */
    public static final class TimeViewData {

        /* renamed from: a */
        private boolean f140847a;

        /* renamed from: b */
        private String f140848b;

        /* renamed from: c */
        private int f140849c;

        /* renamed from: d */
        private boolean f140850d;

        /* renamed from: e */
        private boolean f140851e;

        public TimeViewData() {
            this(false, null, 0, false, false, 31, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeViewData)) {
                return false;
            }
            TimeViewData eVar = (TimeViewData) obj;
            return this.f140847a == eVar.f140847a && Intrinsics.areEqual(this.f140848b, eVar.f140848b) && this.f140849c == eVar.f140849c && this.f140850d == eVar.f140850d && this.f140851e == eVar.f140851e;
        }

        public int hashCode() {
            boolean z = this.f140847a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            String str = this.f140848b;
            int hashCode = (((i5 + (str != null ? str.hashCode() : 0)) * 31) + this.f140849c) * 31;
            boolean z2 = this.f140850d;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (hashCode + i6) * 31;
            boolean z3 = this.f140851e;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            return i9 + i;
        }

        public String toString() {
            return "TimeViewData(isTimeShow=" + this.f140847a + ", timeStr=" + this.f140848b + ", timeColor=" + this.f140849c + ", isTimeCountBadge=" + this.f140850d + ", isTimeNewLine=" + this.f140851e + ")";
        }

        /* renamed from: a */
        public final boolean mo193878a() {
            return this.f140847a;
        }

        /* renamed from: b */
        public final String mo193879b() {
            return this.f140848b;
        }

        /* renamed from: c */
        public final int mo193880c() {
            return this.f140849c;
        }

        /* renamed from: d */
        public final boolean mo193881d() {
            return this.f140850d;
        }

        /* renamed from: e */
        public final boolean mo193882e() {
            return this.f140851e;
        }

        public TimeViewData(boolean z, String str, int i, boolean z2, boolean z3) {
            Intrinsics.checkParameterIsNotNull(str, "timeStr");
            this.f140847a = z;
            this.f140848b = str;
            this.f140849c = i;
            this.f140850d = z2;
            this.f140851e = z3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ TimeViewData(boolean r5, java.lang.String r6, int r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = 0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                if (r5 == 0) goto L_0x000e
                java.lang.String r6 = ""
            L_0x000e:
                r1 = r6
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0015
                r2 = 0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                r3 = 0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = 0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r1
                r8 = r2
                r9 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.TimeViewData.<init>(boolean, java.lang.String, int, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleViewData;", "", "titleType", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "titleStr", "", "titleCount", "", "isTitleExpand", "", "titleRedCount", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;Ljava/lang/String;IZI)V", "()Z", "setTitleExpand", "(Z)V", "getTitleCount", "()I", "setTitleCount", "(I)V", "getTitleRedCount", "setTitleRedCount", "getTitleStr", "()Ljava/lang/String;", "setTitleStr", "(Ljava/lang/String;)V", "getTitleType", "()Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;", "setTitleType", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$TitleType;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$f */
    public static final class TitleViewData {

        /* renamed from: a */
        private TitleType f140852a;

        /* renamed from: b */
        private String f140853b;

        /* renamed from: c */
        private int f140854c;

        /* renamed from: d */
        private boolean f140855d;

        /* renamed from: e */
        private int f140856e;

        public TitleViewData() {
            this(null, null, 0, false, 0, 31, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleViewData)) {
                return false;
            }
            TitleViewData fVar = (TitleViewData) obj;
            return Intrinsics.areEqual(this.f140852a, fVar.f140852a) && Intrinsics.areEqual(this.f140853b, fVar.f140853b) && this.f140854c == fVar.f140854c && this.f140855d == fVar.f140855d && this.f140856e == fVar.f140856e;
        }

        public int hashCode() {
            TitleType titleType = this.f140852a;
            int i = 0;
            int hashCode = (titleType != null ? titleType.hashCode() : 0) * 31;
            String str = this.f140853b;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (((hashCode + i) * 31) + this.f140854c) * 31;
            boolean z = this.f140855d;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return ((i2 + i3) * 31) + this.f140856e;
        }

        public String toString() {
            return "TitleViewData(titleType=" + this.f140852a + ", titleStr=" + this.f140853b + ", titleCount=" + this.f140854c + ", isTitleExpand=" + this.f140855d + ", titleRedCount=" + this.f140856e + ")";
        }

        /* renamed from: a */
        public final TitleType mo193886a() {
            return this.f140852a;
        }

        /* renamed from: b */
        public final String mo193888b() {
            return this.f140853b;
        }

        /* renamed from: c */
        public final int mo193889c() {
            return this.f140854c;
        }

        /* renamed from: d */
        public final boolean mo193890d() {
            return this.f140855d;
        }

        /* renamed from: e */
        public final int mo193891e() {
            return this.f140856e;
        }

        /* renamed from: a */
        public final void mo193887a(int i) {
            this.f140856e = i;
        }

        public TitleViewData(TitleType titleType, String str, int i, boolean z, int i2) {
            Intrinsics.checkParameterIsNotNull(titleType, "titleType");
            Intrinsics.checkParameterIsNotNull(str, "titleStr");
            this.f140852a = titleType;
            this.f140853b = str;
            this.f140854c = i;
            this.f140855d = z;
            this.f140856e = i2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ TitleViewData(com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.TitleType r4, java.lang.String r5, int r6, boolean r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$TitleType r4 = com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.TitleType.OTHER
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000c
                java.lang.String r5 = ""
            L_0x000c:
                r10 = r5
                r5 = r9 & 4
                r0 = 0
                if (r5 == 0) goto L_0x0014
                r1 = 0
                goto L_0x0015
            L_0x0014:
                r1 = r6
            L_0x0015:
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001b
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = r7
            L_0x001c:
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0021
                goto L_0x0022
            L_0x0021:
                r0 = r8
            L_0x0022:
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r1
                r9 = r2
                r10 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.TitleViewData.<init>(com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$TitleType, java.lang.String, int, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: a */
    public final String mo193835a() {
        return this.f140821a;
    }

    /* renamed from: b */
    public final boolean mo193836b() {
        return this.f140822b;
    }

    /* renamed from: c */
    public final TitleViewData mo193837c() {
        return this.f140823c;
    }

    /* renamed from: d */
    public final SummaryViewData mo193838d() {
        return this.f140824d;
    }

    /* renamed from: e */
    public final CheckBoxViewData mo193839e() {
        return this.f140825e;
    }

    /* renamed from: f */
    public final AssigneeViewData mo193841f() {
        return this.f140826f;
    }

    /* renamed from: g */
    public final TimeViewData mo193842g() {
        return this.f140827g;
    }

    /* renamed from: h */
    public final BehindDeleteStatus mo193843h() {
        return this.f140828h;
    }

    /* renamed from: i */
    public final PositionViewData mo193845i() {
        return this.f140830j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\u000b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/item/TodoItemViewData$PositionViewData;", "", "isFirstItem", "", "isLastItem", "isFirstInSection", "isLastInSection", "(ZZZZ)V", "()Z", "setFirstInSection", "(Z)V", "setFirstItem", "setLastInSection", "setLastItem", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$c */
    public static final class PositionViewData {

        /* renamed from: a */
        private boolean f140840a;

        /* renamed from: b */
        private boolean f140841b;

        /* renamed from: c */
        private boolean f140842c;

        /* renamed from: d */
        private boolean f140843d;

        public PositionViewData() {
            this(false, false, false, false, 15, null);
        }

        public int hashCode() {
            boolean z = this.f140840a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f140841b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.f140842c;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (i9 + i10) * 31;
            boolean z4 = this.f140843d;
            if (!z4) {
                i = z4 ? 1 : 0;
            }
            return i13 + i;
        }

        public String toString() {
            return "PositionViewData(isFirstItem=" + this.f140840a + ", isLastItem=" + this.f140841b + ", isFirstInSection=" + this.f140842c + ", isLastInSection=" + this.f140843d + ")";
        }

        /* renamed from: a */
        public final boolean mo193863a() {
            return this.f140840a;
        }

        /* renamed from: b */
        public final boolean mo193865b() {
            return this.f140841b;
        }

        /* renamed from: c */
        public final boolean mo193867c() {
            return this.f140843d;
        }

        /* renamed from: a */
        public final void mo193862a(boolean z) {
            this.f140840a = z;
        }

        /* renamed from: b */
        public final void mo193864b(boolean z) {
            this.f140841b = z;
        }

        /* renamed from: c */
        public final void mo193866c(boolean z) {
            this.f140842c = z;
        }

        /* renamed from: d */
        public final void mo193868d(boolean z) {
            this.f140843d = z;
        }

        public boolean equals(Object obj) {
            PositionViewData cVar = (PositionViewData) obj;
            if (cVar != null && this.f140840a == cVar.f140840a && this.f140841b == cVar.f140841b && this.f140842c == cVar.f140842c && this.f140843d == cVar.f140843d) {
                return true;
            }
            return false;
        }

        public PositionViewData(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f140840a = z;
            this.f140841b = z2;
            this.f140842c = z3;
            this.f140843d = z4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PositionViewData(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TodoItemViewData)) {
            return false;
        }
        boolean z = this.f140822b;
        TodoItemViewData todoItemViewData = (TodoItemViewData) obj;
        if (z != todoItemViewData.f140822b) {
            return false;
        }
        if (!z) {
            if (!Intrinsics.areEqual(this.f140824d.mo193872a(), todoItemViewData.f140824d.mo193872a()) || !Intrinsics.areEqual(this.f140824d.mo193874c(), todoItemViewData.f140824d.mo193874c()) || !Intrinsics.areEqual(this.f140826f, todoItemViewData.f140826f) || this.f140825e.mo193855a() != todoItemViewData.f140825e.mo193855a() || this.f140825e.mo193856b() != todoItemViewData.f140825e.mo193856b() || !Intrinsics.areEqual(this.f140827g.mo193879b(), todoItemViewData.f140827g.mo193879b()) || this.f140827g.mo193880c() != todoItemViewData.f140827g.mo193880c() || this.f140827g.mo193882e() != todoItemViewData.f140827g.mo193882e() || !Intrinsics.areEqual(this.f140830j, todoItemViewData.f140830j)) {
                return false;
            }
        } else if (!(this.f140823c.mo193886a() == todoItemViewData.f140823c.mo193886a() && this.f140823c.mo193890d() == todoItemViewData.f140823c.mo193890d() && Intrinsics.areEqual(this.f140823c.mo193888b(), todoItemViewData.f140823c.mo193888b()) && this.f140823c.mo193889c() == todoItemViewData.f140823c.mo193889c() && this.f140823c.mo193891e() == todoItemViewData.f140823c.mo193891e())) {
            return false;
        }
        return true;
    }

    public TodoItemViewData(String str, boolean z, TitleViewData fVar, SummaryViewData dVar, CheckBoxViewData bVar, AssigneeViewData aVar, TimeViewData eVar, BehindDeleteStatus behindDeleteStatus, TodoSource todoSource, PositionViewData cVar) {
        Intrinsics.checkParameterIsNotNull(str, "todoGuid");
        Intrinsics.checkParameterIsNotNull(fVar, "titleViewData");
        Intrinsics.checkParameterIsNotNull(dVar, "summaryViewData");
        Intrinsics.checkParameterIsNotNull(bVar, "checkBoxViewData");
        Intrinsics.checkParameterIsNotNull(aVar, "assigneeViewData");
        Intrinsics.checkParameterIsNotNull(eVar, "timeViewData");
        Intrinsics.checkParameterIsNotNull(behindDeleteStatus, "behindDeleteStatus");
        Intrinsics.checkParameterIsNotNull(cVar, "positionViewData");
        this.f140821a = str;
        this.f140822b = z;
        this.f140823c = fVar;
        this.f140824d = dVar;
        this.f140825e = bVar;
        this.f140826f = aVar;
        this.f140827g = eVar;
        this.f140828h = behindDeleteStatus;
        this.f140829i = todoSource;
        this.f140830j = cVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TodoItemViewData(java.lang.String r17, boolean r18, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.TitleViewData r19, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.SummaryViewData r20, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.CheckBoxViewData r21, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.AssigneeViewData r22, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.TimeViewData r23, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.BehindDeleteStatus r24, com.bytedance.lark.pb.todo.v1.TodoSource r25, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.PositionViewData r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData.<init>(java.lang.String, boolean, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$f, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$d, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$b, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$a, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$e, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$BehindDeleteStatus, com.bytedance.lark.pb.todo.v1.TodoSource, com.ss.android.lark.todo.impl.features.mainview2.widget.list.item.TodoItemViewData$c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

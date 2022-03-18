package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "Lcom/larksuite/framework/utils/diff/Diffable;", "viewType", "", "getViewType", "()I", "AppendViewType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface BaseModel extends AbstractC26248b<BaseModel> {

    @Target({ElementType.TYPE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel$AppendViewType;", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface AppendViewType {
        public static final Companion Companion = Companion.f81825a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel$AppendViewType$Companion;", "", "()V", "BUILDING", "", "LOADING", "LOAD_ERR", "LOAD_MORE", "MEETING_ROOM", "MULTI_LEVEL_CONTENT", "MULTI_LEVEL_MEETING_ROOM", "NONE_RESOURCE", "SELECTED_MEETING_ROOM", "TYPE_TITLE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel$AppendViewType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f81825a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    int mo116760a();
}

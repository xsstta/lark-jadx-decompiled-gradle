package com.ss.android.lark.todo.impl.framework.config;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@AppConfig(key = "todo_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/config/TodoConfig;", "", "assigneeLimit", "", "followerLimit", "(II)V", "getAssigneeLimit", "()I", "setAssigneeLimit", "(I)V", "getFollowerLimit", "setFollowerLimit", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoConfig {
    @SerializedName("assignee_limit")

    /* renamed from: a */
    private int f141090a;
    @SerializedName("follower_limit")

    /* renamed from: b */
    private int f141091b;

    public TodoConfig() {
        this(0, 0, 3, null);
    }

    /* renamed from: a */
    public final int mo194247a() {
        return this.f141090a;
    }

    /* renamed from: b */
    public final int mo194248b() {
        return this.f141091b;
    }

    public TodoConfig(int i, int i2) {
        this.f141090a = i;
        this.f141091b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TodoConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? ParticipantRepo.f117150c : i, (i3 & 2) != 0 ? ParticipantRepo.f117150c : i2);
    }
}

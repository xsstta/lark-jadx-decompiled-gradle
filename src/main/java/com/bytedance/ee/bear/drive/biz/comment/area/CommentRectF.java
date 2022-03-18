package com.bytedance.ee.bear.drive.biz.comment.area;

import android.graphics.RectF;
import android.text.TextUtils;
import com.bytedance.ee.bear.drive.biz.comment.Quad;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;
import java.util.Objects;

public class CommentRectF extends RectF {

    /* renamed from: a */
    private int f17616a = 1;

    /* renamed from: b */
    private String f17617b = "";

    /* renamed from: c */
    private long f17618c;

    /* renamed from: d */
    private int f17619d;

    /* renamed from: e */
    private Quad[] f17620e;

    /* renamed from: f */
    private String f17621f;

    /* renamed from: a */
    public String mo25555a() {
        return this.f17617b;
    }

    /* renamed from: b */
    public long mo25561b() {
        return this.f17618c;
    }

    /* renamed from: c */
    public int mo25564c() {
        return this.f17616a;
    }

    /* renamed from: d */
    public int mo25565d() {
        return this.f17619d;
    }

    /* renamed from: e */
    public Quad[] mo25566e() {
        return this.f17620e;
    }

    /* renamed from: f */
    public String mo25568f() {
        return this.f17621f;
    }

    public CommentRectF() {
    }

    /* renamed from: g */
    public boolean mo25569g() {
        Quad[] quadArr;
        if (mo25564c() != 4 || ((quadArr = this.f17620e) != null && quadArr.length > 0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f17617b);
    }

    public String toString() {
        return "CommentRectF{mType=" + this.f17616a + ", mCommentId='" + this.f17617b + '\'' + ", mCreateTime=" + this.f17618c + ", mPage=" + this.f17619d + ", mQuads=" + Arrays.toString(this.f17620e) + ", rect=" + super.toShortString() + '}';
    }

    /* renamed from: a */
    public void mo25556a(int i) {
        this.f17616a = i;
    }

    /* renamed from: b */
    public void mo25562b(int i) {
        this.f17619d = i;
    }

    /* renamed from: a */
    public void mo25557a(long j) {
        this.f17618c = j;
    }

    /* renamed from: b */
    public void mo25563b(String str) {
        this.f17621f = str;
    }

    /* renamed from: a */
    public void mo25558a(String str) {
        this.f17617b = str;
    }

    public CommentRectF(String str) {
        this.f17617b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.f17617b.equals(((CommentRectF) obj).f17617b);
    }

    /* renamed from: a */
    public void mo25560a(Quad[] quadArr) {
        this.f17620e = quadArr;
    }

    /* renamed from: a */
    public static CommentRectF m25575a(String str, AreaCoordinate areaCoordinate) {
        if (TextUtils.isEmpty(str) || areaCoordinate == null) {
            C13479a.m54775e("DRIVE_PREVIEW_FLOW", "area comment Coordinate wrong. = " + areaCoordinate);
            return null;
        }
        CommentRectF commentRectF = new CommentRectF(str);
        commentRectF.mo25556a(areaCoordinate.getType());
        if (areaCoordinate.getPosition() != null) {
            commentRectF.mo25562b(areaCoordinate.getPosition().getPage());
            commentRectF.set(areaCoordinate.getPosition().getLeft(), areaCoordinate.getPosition().getTop(), areaCoordinate.getPosition().getRight(), areaCoordinate.getPosition().getBottom());
            commentRectF.mo25563b(areaCoordinate.getPosition().getText());
            commentRectF.mo25560a(areaCoordinate.getPosition().getQuads());
        }
        return commentRectF;
    }

    /* renamed from: a */
    public void mo25559a(String str, float f, float f2, float f3, float f4) {
        this.f17617b = str;
        set(f, f2, f3, f4);
    }

    public CommentRectF(int i, String str, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.f17616a = i;
        this.f17617b = str;
    }
}

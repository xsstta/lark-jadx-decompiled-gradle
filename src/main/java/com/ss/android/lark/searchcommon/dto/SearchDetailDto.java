package com.ss.android.lark.searchcommon.dto;

import com.ss.android.lark.searchcommon.dto.Scene;
import java.io.Serializable;
import java.util.Objects;

public class SearchDetailDto implements Serializable {
    private static final long serialVersionUID = -2300030951015274777L;
    public final String bitmapKey;
    public final int fromType;
    public final int resultType;
    public final Scene.Type sceneType;
    public final int translateY;

    /* renamed from: com.ss.android.lark.searchcommon.dto.SearchDetailDto$a */
    public static final class C53891a {

        /* renamed from: a */
        public int f133166a;

        /* renamed from: b */
        public Scene.Type f133167b;

        /* renamed from: c */
        public String f133168c;

        /* renamed from: d */
        public int f133169d;

        /* renamed from: e */
        public int f133170e;

        private C53891a() {
            this.f133169d = 1;
        }

        /* renamed from: a */
        public SearchDetailDto mo183845a() {
            return new SearchDetailDto(this);
        }

        /* renamed from: a */
        public C53891a mo183842a(int i) {
            this.f133166a = i;
            return this;
        }

        /* renamed from: b */
        public C53891a mo183846b(int i) {
            this.f133169d = i;
            return this;
        }

        /* renamed from: c */
        public C53891a mo183847c(int i) {
            this.f133170e = i;
            return this;
        }

        /* renamed from: a */
        public C53891a mo183843a(Scene.Type type) {
            Objects.requireNonNull(type, "scene type is null");
            this.f133167b = type;
            return this;
        }

        /* renamed from: a */
        public C53891a mo183844a(String str) {
            this.f133168c = str;
            return this;
        }
    }

    public static C53891a newBuilder() {
        return new C53891a();
    }

    private SearchDetailDto(C53891a aVar) {
        this.translateY = aVar.f133166a;
        this.sceneType = aVar.f133167b;
        this.bitmapKey = aVar.f133168c;
        this.fromType = aVar.f133169d;
        this.resultType = aVar.f133170e;
    }
}

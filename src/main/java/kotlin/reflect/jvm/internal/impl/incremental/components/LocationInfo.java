package kotlin.reflect.jvm.internal.impl.incremental.components;

public interface LocationInfo {
    String getFilePath();

    Position getPosition();
}

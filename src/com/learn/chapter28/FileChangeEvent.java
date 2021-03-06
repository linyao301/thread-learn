package com.learn.chapter28;

import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;

public class FileChangeEvent {

  private final Path path;
  private final WatchEvent.Kind<?> kind;

  public FileChangeEvent(Path path, Kind<?> kind) {
    this.path = path;
    this.kind = kind;
  }

  public Path getPath() {
    return path;
  }

  public Kind<?> getKind() {
    return kind;
  }
}
